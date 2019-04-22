package com.munkhbat.scala.mincaml

import com.munkhbat.scala.mincaml.`type`.Type
import com.munkhbat.scala.mincaml.ast.Ast
import com.munkhbat.scala.mincaml.tools.Id

/**
  * give names to intermediate variables
  */
object kNormal {
  trait T
  case class KUnit() extends T
  case class KInt(i: Int) extends T
  case class KFloat(f: Float) extends T
  case class KNeg(id: Id.T) extends T
  case class KAdd(id1: Id.T, id2: Id.T) extends T
  case class KSub(id1: Id.T, id2: Id.T) extends T
  case class KFNeg(id: Id.T) extends T
  case class KFAdd(id1: Id.T, id2: Id.T) extends T
  case class KFSub(id1: Id.T, id2: Id.T) extends T
  case class KFMul(id1: Id.T, id2: Id.T) extends T
  case class KFDiv(id1: Id.T, id2: Id.T) extends T
  case class KIfEq(id1: Id.T, id2: Id.T, k3: T, k4: T) extends T
  case class KIfLE(id1: Id.T, id2: Id.T, k3: T, k4: T) extends T
  case class KLet(id1: (Id.T, Type.T), k2: T, k3: T) extends T
  case class KVar(id: Id.T) extends T
  case class KLetRec(fundef: T, k2: T) extends T
  case class KApp(id1: Id.T, idList: List[Id.T]) extends T
  case class KTuple(idList: List[Id.T]) extends T
  case class KLetTuple(ids1: List[(Id.T, Type.T)], ids2: List[Id.T], id3: Id.T) extends T
  case class KGet(id1: T, id2: T) extends T
  case class KPut(id1: T, id2: T, id3: T) extends T
  case class KExtArray(id: Id.T) extends T
  case class KExtFunApp(id1: Id.T, idList: List[Id.T]) extends T
  case class kFundef(name: (Id.T, Type.T), args: List[(Id.T, Type.T)], body: T) extends T

  def insertLet(e: (T, Type.T), k: Id.T => (T, Type.T)): (T, Type.T) = {
    e match {
      case (KVar(x), _) => k(x)
      case (ke, t) => {
        val x = Id.gentmp(t)
        val (kee, tt) = k(x)
        (KLet((x, t), ke, kee), tt)
      }
    }
  }

  def g(env: Map[Id.T, Type.T], e: Ast.Exp): (T, Type.T) = {
    e match {
      case Ast.MUnit() => (KUnit(), Type.Unit())
      case Ast.MBool(b) => (KInt(if (b) 1 else 0), Type.Int())
      case Ast.MInt(n) => (KInt(n), Type.Int())
      case Ast.MFloat(e) => (KFloat(e), Type.Float())
      case Ast.MNot(e) => g(env, Ast.MIf(e, Ast.MBool(false), Ast.MBool(true)))
      case Ast.MNeg(e) => insertLet(g(env, e), x => (KNeg(x), Type.Int()))
      case Ast.MAdd(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KAdd(x, y), Type.Int())))
      case Ast.MSub(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KSub(x, y), Type.Int())))
      case Ast.MFNeg(e) => insertLet(g(env, e), x => (KFNeg(x), Type.Float()))
      case Ast.MFAdd(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KFAdd(x, y), Type.Float())))
      case Ast.MFSub(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KFSub(x, y), Type.Float())))
      case Ast.MFMul(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KFMul(x, y), Type.Float())))
      case Ast.MFDiv(e1, e2) => insertLet(g(env, e1),
        x => insertLet(g(env, e2), y => (KFDiv(x, y), Type.Float())))
      case Ast.MEq(e1, e2) => g(env, Ast.MIf(Ast.MEq(e1, e2), Ast.MBool(true), Ast.MBool(false)))
      case Ast.MLE(e1, e2) => g(env, Ast.MIf(Ast.MLE(e1, e2), Ast.MBool(true), Ast.MBool(false)))
      case Ast.MIf(Ast.MNot(e1), e2, e3) => g(env, Ast.MIf(e1, e3, e2))
      case Ast.MIf(Ast.MEq(e1, e2), e3, e4) =>
    }
  }
}
