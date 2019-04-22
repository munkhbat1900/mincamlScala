package com.munkhbat.scala.mincaml.`type`

import com.munkhbat.scala.mincaml.ast.Ast
import com.munkhbat.scala.mincaml.ast.Ast._
import com.munkhbat.scala.mincaml.tools.Id

/**
  * type inference implementation.
  * there are good explanation of type inference algorithm in following URL.
  * https://tech.nikkeibp.co.jp/it/article/COLUMN/20070717/277580/?P=2
  * it's in Japanese. To view content fully you need to become member.
  */
object Typing {

  // type environment for external variables.
  var extenv = Map[Id.T, Type.T]()

  // for pretty printing (and type normalization)
  //for example : print_int -> Var(Some(Fun(List(Var(Some(Int()))),Var(Some(Unit()))))) will be converted to
  //print_int -> Var(Some(Fun(List(Int()),Unit())))
  def derefTyp(t: Type.T): Type.T = {
    t match {
      case Type.Fun(args, ret) => Type.Fun(args.map(derefTyp), derefTyp(ret))
      case Type.Tuple(elems) => Type.Tuple(elems.map(derefTyp))
      case Type.Array(r) => Type.Array(derefTyp(r))
      case r@Type.Var(None) => {
        println("uninstantiated type variable detected; assuming int@.")
        r.a = Some(Type.Int())
        Type.Int()
      }
      case r@Type.Var(Some(r1)) => {
        val r2 = derefTyp(r1)
        r.a = Some(r2)
        r2
      }
      case r => r
    }
  }

  def derefIdTyp(t: (Id.T, Type.T)): (Id.T, Type.T) = {
    (t._1, derefTyp(t._2))
  }

  def derefTerm(e: Ast.Exp): Ast.Exp = {
    e match {
      case Ast.MNot(e)=> Ast.MNot(derefTerm(e))
      case Ast.MNeg(e) => Ast.MNeg(derefTerm(e))
      case Ast.MAdd(e1, e2) => Ast.MAdd(derefTerm(e1), derefTerm(e2))
      case Ast.MSub(e1, e2) => Ast.MSub(derefTerm(e1), derefTerm(e2))
      case Ast.MEq(e1, e2) => Ast.MEq(derefTerm(e1), derefTerm(e2))
      case Ast.MLE(e1, e2) => Ast.MLE(derefTerm(e1), derefTerm(e2))
      case Ast.MFNeg(e) => Ast.MFNeg(derefTerm(e))
      case Ast.MFAdd(e1, e2) => Ast.MFAdd(derefTerm(e1), derefTerm(e2))
      case Ast.MFSub(e1, e2) => Ast.MFSub(derefTerm(e1), derefTerm(e2))
      case Ast.MFMul(e1, e2) => Ast.MFMul(derefTerm(e1), derefTerm(e2))
      case Ast.MFDiv(e1, e2) => Ast.MFDiv(derefTerm(e1), derefTerm(e2))
      case Ast.MIf(e1, e2, e3) => Ast.MIf(derefTerm(e1), derefTerm(e2), derefTerm(e3))
      case Ast.MLet(xt, e1, e2) => Ast.MLet(derefIdTyp(xt), derefTerm(e1), derefTerm(e2))
      case Ast.MLetRec(Ast.MFunDef(name, args, body), e2) => {
        val name1 = derefIdTyp(name)
        val args1 = args.map(derefIdTyp)
        val body1 = derefTerm(body)
        val e22 = derefTerm(e2)
        Ast.MLetRec(Ast.MFunDef(name1, args1, body1), e22)
      }
      case Ast.MApp(e, es) => Ast.MApp(derefTerm(e), es.map(derefTerm))
      case Ast.MTuple(es) => Ast.MTuple(es.map(derefTerm))
      case Ast.MLetTuple(xts, e1, e2) => Ast.MLetTuple(xts.map(derefIdTyp), derefTerm(e1), derefTerm(e2))
      case Ast.MArray(e1, e2) => Ast.MArray(derefTerm(e1), derefTerm(e2))
      case Ast.MGet(e1, e2) => Ast.MGet(derefTerm(e1), derefTerm(e2))
      case Ast.MPut(e1, e2, e3) => Ast.MPut(derefTerm(e1), derefTerm(e2), derefTerm(e3))
      case e => e

    }
  }

  def occur(r1: Option[Type.T], t2: Type.T): Boolean = {
    t2 match {
      case Type.Fun(args, ret) => args.exists(occur(r1, _)) || occur(r1, ret)
      case Type.Tuple(elems) => elems.exists(occur(r1, _))
      case Type.Array(t) => occur(r1, t)
      case Type.Var(None) => false
      case Type.Var(r2) if (r1 == r2)=> true
      case Type.Var(Some(r2)) => occur(r1, r2)
      case _ => false
    }
  }



  def g(env: Map[Id.T, Type.T], e: Ast.Exp): Type.T = {
    def intArith(e1: Ast.Exp, e2: Ast.Exp) = {
      unify(Type.Int(), g(env, e1))
      unify(Type.Int(), g(env, e2))
      Type.Int()
    }

    def floatArith(e1: Ast.Exp, e2: Ast.Exp) = {
      unify(Type.Float(), g(env, e1))
      unify(Type.Float(), g(env, e2))
      Type.Float()
    }

    def logicExp(e1: Ast.Exp, e2: Ast.Exp) = {
      unify(g(env, e1), g(env, e2))
      Type.Bool()
    }

    e match {
      case MUnit() => Type.Unit()
      case MBool(_) => Type.Bool()
      case MInt(_) => Type.Int()
      case MFloat(_) => Type.Float()
      case MNot(e) => {
        unify(Type.Bool(), g(env, e))
        Type.Bool()
      }
      case Ast.MNeg(e) => {
        unify(Type.Int(), g(env, e))
        Type.Int()
      }
      case Ast.MAdd(e1, e2) => intArith(e1, e2)
      case Ast.MSub(e1, e2) => intArith(e1, e2)
      case Ast.MFAdd(e1, e2) => floatArith(e1, e2)
      case Ast.MFSub(e1, e2) => floatArith(e1, e2)
      case Ast.MFMul(e1, e2) => floatArith(e1, e2)
      case Ast.MFDiv(e1, e2) => floatArith(e1, e2)
      case Ast.MEq(e1, e2) => logicExp(e1, e2)
      case Ast.MLE(e1, e2) => logicExp(e1, e2)

      case Ast.MIf(e1, e2, e3) => {
        unify(Type.Bool(), g(env, e1))
        val t2 = g(env, e2)
        val t3 = g(env, e3)
        unify(t2, t3)
        t2
      }
      case Ast.MLet((id, t), e2, e3) => {
        unify(t, g(env, e2))
        g(env + (id -> t), e3)
      }
      case Ast.MVar(x) if (env.contains(x)) => env(x)
      case Ast.MVar(x) if (extenv.contains(x)) => extenv(x)
      case Ast.MVar(x) => {
        println("free variable" + x.toString() + " assumed as external@.")
        val t = Type.gentyp()
        extenv = extenv + (x -> t)
        t
      }
      case Ast.MLetRec(Ast.MFunDef(name, args, body), e2) => {
        val funName = name._1
        val funTyp = name._2
        val newEnv = env + (funName -> funTyp)
        unify(funTyp, Type.Fun(args.map{_._2}, g(newEnv ++ args, body)))
        g(newEnv, e2)
      }
      case Ast.MApp(e1, e2) => {
        val t = Type.gentyp()
        val funTyp = g(env, e1)
        val args = e2.map(g(env, _))
        unify(funTyp, Type.Fun(args, t))
        t
      }
      case Ast.MTuple(e) => Type.Tuple(e.map(g(env, _)))
      case Ast.MLetTuple(e1, e2, e3) => {
        unify(Type.Tuple(e1.map(_._2)), g(env, e2))
        g(env ++ e1, e3)
      }
      case Ast.MArray(e1, e2) => {
        unify(g(env, e1), Type.Int())
        Type.Array(g(env, e2))
      }
      case Ast.MGet(e1, e2) => {
        val t = Type.gentyp()
        unify(Type.Array(t), g(env, e1))
        unify(Type.Int(), g(env, e2))
        t
      }
      case Ast.MPut(e1, e2, e3) => {
        val t = g(env, e3)
        unify(Type.Array(t), g(env, e1))
        unify(Type.Int(), g(env, e2))
        Type.Unit()
      }
    }
  }

  /**
    * make t1 and t2 equal.
    * @param t1
    * @param t2
    */
  def unify(t1: Type.T, t2: Type.T): Unit = {
    (t1, t2) match {
      case (Type.Unit(), Type.Unit()) => ()
      case (Type.Bool(), Type.Bool()) => ()
      case (Type.Int(), Type.Int()) => ()
      case (Type.Float(), Type.Float()) => ()
      case (Type.Fun(argList1, ret1), Type.Fun(argList2, ret2)) => {
        if (argList1.length != argList2.length) {
          throw new Exception("function argument count is not match t1 = " + t1 + " t2 = " + t2)
        }

        val newList = argList1.zip(argList2)
        newList.foreach(t => unify(t._1, t._2))
        unify(ret1, ret2)
      }
      case (Type.Tuple(elems1), Type.Tuple(elems2)) => {
        if (elems1.length != elems2.length) {
          throw new Exception("tuple element count is not match t1 = " + t1 + " t2 = " + t2)
        }
        val newList = elems1.zip(elems2)
        newList.foreach(t => unify(t._1, t._2))
      }
      case (Type.Array(t1), Type.Array(t2)) => {
        unify(t1, t2)
      }
      case (Type.Var(r1), Type.Var(r2)) if (r1 == r2) => ()
      case (Type.Var(Some(t11)), _) => unify(t11, t2)
      case (_, Type.Var(Some(t22))) => unify(t1, t22)
      case (r@Type.Var(r1), _) => {
        if (occur(r1, t2)) {
          throw new Exception("type occur t1 = " + t1 + " t2 = " + t2)
        }
        r1 match {
          case None => r.a = Some(t2)
          case Some(t11) => unify(t11, t2)
        }
      }
      case (_, Type.Var(r2)) => {
        unify(t2, t1)
      }
      case (_, _) => {
        throw new Exception("unification error t1 = " + t1.toString + "t2 = " +  t2.toString)
      }
    }
  }

  def infer(e: Ast.Exp) = {
    unify(Type.Unit(), g(Map.empty, e))
    extenv.map(derefIdTyp)
    println("external type envirnment = " + extenv)
    derefTerm(e)
  }
}
