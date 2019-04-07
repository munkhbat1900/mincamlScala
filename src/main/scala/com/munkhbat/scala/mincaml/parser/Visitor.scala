package com.munkhbat.scala.mincaml.parser

import com.munkhbat.scala.mincaml.ast.Ast
import com.munkhbat.scala.mincaml.ast.Ast.{MBool, MInt}

class Visitor extends MincamlBaseVisitor[Ast.Exp] {
  override def visitEmptyParenExp(ctx: MincamlParser.EmptyParenExpContext): Ast.Exp = visitChildren(ctx)

  /**
    * {@inheritDoc }
    *
    * <p>Ast.Exphe default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.</p>
    */
  override def visitParenExp(ctx: MincamlParser.ParenExpContext): Ast.Exp = {
    visitChildren(ctx)
  }

  override def visitBoolExp(ctx: MincamlParser.BoolExpContext): Ast.Exp = {
    println(ctx)
    MBool(true)
  }

  override def visitIdentExp(ctx: MincamlParser.IdentExpContext): Ast.Exp = {
    visitChildren(ctx)
  }

  override def visitIntExp(ctx: MincamlParser.IntExpContext): Ast.Exp = {
    println("haha")
    println(ctx.INT().getSymbol)
    MInt(50)
  }

  override def visitFloatExp(ctx: MincamlParser.FloatExpContext): Ast.Exp = visitChildren(ctx)

  override def visitGetExp(ctx: MincamlParser.GetExpContext): Ast.Exp = visitChildren(ctx)

  override def visitPlusMinusExp(ctx: MincamlParser.PlusMinusExpContext): Ast.Exp = visitChildren(ctx)

  override def visitLetTupleExp(ctx: MincamlParser.LetTupleExpContext): Ast.Exp = visitChildren(ctx)

  override def visitFNegExp(ctx: MincamlParser.FNegExpContext): Ast.Exp = visitChildren(ctx)

  override def visitSimpleExp(ctx: MincamlParser.SimpleExpContext): Ast.Exp = visitChildren(ctx)

  override def visitPutExp(ctx: MincamlParser.PutExpContext): Ast.Exp = visitChildren(ctx)

  override def visitNotExp(ctx: MincamlParser.NotExpContext): Ast.Exp = visitChildren(ctx)

  override def visitArrayCreateExp(ctx: MincamlParser.ArrayCreateExpContext): Ast.Exp = visitChildren(ctx)

  override def visitLetExp(ctx: MincamlParser.LetExpContext): Ast.Exp = visitChildren(ctx)

  override def visitTupleExp(ctx: MincamlParser.TupleExpContext): Ast.Exp = visitChildren(ctx)

  override def visitIfExp(ctx: MincamlParser.IfExpContext): Ast.Exp = visitChildren(ctx)

  override def visitNegExp(ctx: MincamlParser.NegExpContext): Ast.Exp = visitChildren(ctx)

  override def visitLetRecExp(ctx: MincamlParser.LetRecExpContext): Ast.Exp = visitChildren(ctx)

  override def visitMultiplyDivideExp(ctx: MincamlParser.MultiplyDivideExpContext): Ast.Exp = visitChildren(ctx)

  override def visitApplyExp(ctx: MincamlParser.ApplyExpContext): Ast.Exp = visitChildren(ctx)

  override def visitLogicalExp(ctx: MincamlParser.LogicalExpContext): Ast.Exp = visitChildren(ctx)

  override def visitSeqExp(ctx: MincamlParser.SeqExpContext): Ast.Exp = visitChildren(ctx)

  override def visitFundef(ctx: MincamlParser.FundefContext): Ast.Exp = visitChildren(ctx)

  override def visitFormal_args(ctx: MincamlParser.Formal_argsContext): Ast.Exp = visitChildren(ctx)

  override def visitActual_args(ctx: MincamlParser.Actual_argsContext): Ast.Exp = visitChildren(ctx)

  override def visitElems(ctx: MincamlParser.ElemsContext): Ast.Exp = visitChildren(ctx)

  override def visitPat(ctx: MincamlParser.PatContext): Ast.Exp = visitChildren(ctx)
}
