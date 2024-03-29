package com.munkhbat.scala.mincaml.parser

import com.munkhbat.scala.mincaml.ast.Ast
import com.munkhbat.scala.mincaml.ast.Ast._
import com.munkhbat.scala.mincaml.`type`.Type
import com.munkhbat.scala.mincaml.tools.Id
import scala.collection.JavaConversions._

class Visitor extends MincamlBaseVisitor[Ast.Exp] {
  override def visitEmptyParenExp(ctx: MincamlParser.EmptyParenExpContext): Ast.Exp = {
    MUnit()
  }

  /**
    * {@inheritDoc }
    *
    * <p>Ast.Exphe default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.</p>
    */
  override def visitParenExp(ctx: MincamlParser.ParenExpContext): Ast.Exp = {
    visit(ctx.exp())
  }

  override def visitBoolExp(ctx: MincamlParser.BoolExpContext): Ast.Exp = {
    MBool(ctx.getText.toBoolean)
  }

  override def visitIdentExp(ctx: MincamlParser.IdentExpContext): Ast.Exp = {
    MVar(ctx.getText)
  }

  override def visitIntExp(ctx: MincamlParser.IntExpContext): Ast.Exp = {
    MInt(ctx.getText.toInt)
  }

  override def visitFloatExp(ctx: MincamlParser.FloatExpContext): Ast.Exp = {
    MFloat(ctx.getText.toFloat)
  }

  override def visitGetExp(ctx: MincamlParser.GetExpContext): Ast.Exp = {
    val arr = visit(ctx.simple_exp())
    val index = visit(ctx.exp())
    MGet(arr, index)
  }

  override def visitPlusMinusExp(ctx: MincamlParser.PlusMinusExpContext): Ast.Exp = {
    val left = visit(ctx.left)
    val right = visit(ctx.right)
    val operand = ctx.op.getText
    operand match {
      case "+" => MAdd(left, right)
      case "-" => MSub(left, right)
    }
  }

  override def visitLetTupleExp(ctx: MincamlParser.LetTupleExpContext): Ast.Exp = {
    val e = visit(ctx.exp(0))
    val inExp = visit(ctx.exp(1))
    val firstIdent = ctx.IDENT().getText
    val identList = ctx.pat().IDENT()
    val identsWithType = (firstIdent, Type.gentyp()) :: identList.map(ident => (ident.getText, Type.gentyp())).toList
    MLetTuple(identsWithType, e, inExp)
  }

  override def visitFNegExp(ctx: MincamlParser.FNegExpContext): Ast.Exp = {
    MFNeg(visit(ctx.exp()))
  }

  override def visitSimpleExp(ctx: MincamlParser.SimpleExpContext): Ast.Exp = {
    visitChildren(ctx)
  }

  override def visitPutExp(ctx: MincamlParser.PutExpContext): Ast.Exp = {
    val arrExp = visit(ctx.simple_exp())
    val indexExp = visit(ctx.exp(0))
    val valToPut = visit(ctx.exp(1))
    MPut(arrExp, indexExp, valToPut)
  }

  override def visitNotExp(ctx: MincamlParser.NotExpContext): Ast.Exp = {
    MNot(visit(ctx.exp()))
  }

  override def visitArrayCreateExp(ctx: MincamlParser.ArrayCreateExpContext): Ast.Exp = {
    val e1 = visit(ctx.simple_exp(0))
    val e2 = visit(ctx.simple_exp(1))
    MArray(e1, e2)
  }

  override def visitLetExp(ctx: MincamlParser.LetExpContext): Ast.Exp = {
    val ident = ctx.IDENT().getText
    MLet((ident, Type.gentyp()), visit(ctx.exp(0)), visit(ctx.exp(1)))
  }

  override def visitTupleExp(ctx: MincamlParser.TupleExpContext): Ast.Exp = {
    val exps = ctx.elems().exp()
    val expList = visit(ctx.exp()) :: exps.map(e => visit(e)).toList
    MTuple(expList)
  }

  override def visitIfExp(ctx: MincamlParser.IfExpContext): Ast.Exp = {
    val condition = visit(ctx.condition)
    val thenExp = visit(ctx.thenExp)
    val elseExp = visit(ctx.elseExp)
    MIf(condition, thenExp, elseExp)
  }

  override def visitNegExp(ctx: MincamlParser.NegExpContext): Ast.Exp = {
    MNeg(visit(ctx.exp()))
  }

  override def visitLetRecExp(ctx: MincamlParser.LetRecExpContext): Ast.Exp = {
    MLetRec(visitFundef(ctx.fundef()), visit(ctx.exp()))
  }

  override def visitMultiplyDivideExp(ctx: MincamlParser.MultiplyDivideExpContext): Ast.Exp = {
    val left = visit(ctx.left)
    val right = visit(ctx.right)
    val operand = ctx.op.getText
    operand match {
      case "*." => MFMul(left, right)
      case "/." => MFSub(left, right)
    }
  }

  override def visitApplyExp(ctx: MincamlParser.ApplyExpContext): Ast.Exp = {
    val funName = visit(ctx.exp())
    // conversion from java.util.List to scala collection
    val argList = ctx.actual_args().simple_exp()
    val args = argList.map(arg => visit(arg)).toList
    MApp(funName, args)
  }

  override def visitLogicalExp(ctx: MincamlParser.LogicalExpContext): Ast.Exp = {
    val left = visit(ctx.left)
    val right = visit(ctx.right)
    val operator = ctx.op.getText
    operator match {
      case "=" => MEq(left, right)
      case "<>" => MNot(MEq(left, right))
      case "<" => MNot(MLE(right, left))
      case ">" => MNot(MLE(left, right))
      case "<=" => MLE(left, right)
      case ">=" => MLE(right, left)
    }
  }

  override def visitSeqExp(ctx: MincamlParser.SeqExpContext): Ast.Exp = {
    val e1 = visit(ctx.exp(0))
    val e2 = visit(ctx.exp(1))
    Id.gentmp(Type.Unit())

    MLet(("seq", Type.Unit()), e1, e2)
  }

  override def visitFundef(ctx: MincamlParser.FundefContext): Ast.Exp = {
    val funName = ctx.IDENT().getText
    val args = ctx.formal_args().IDENT().map(i => (i.getText, Type.gentyp())).toList
    val body = visit(ctx.exp())
    MFunDef((funName, Type.gentyp()), args, body)
  }
}
