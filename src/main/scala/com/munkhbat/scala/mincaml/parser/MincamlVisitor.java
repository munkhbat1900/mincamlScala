// Generated from /Users/munkhbat/Desktop/clones/github/mincamlScala/src/main/scala/com/munkhbat/scala/mincaml/parser/Mincaml.g4 by ANTLR 4.7.2
package com.munkhbat.scala.mincaml.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MincamlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MincamlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code emptyParenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyParenExp(MincamlParser.EmptyParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(MincamlParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(MincamlParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(MincamlParser.IdentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExp(MincamlParser.IntExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExp(MincamlParser.FloatExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExp(MincamlParser.GetExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExp(MincamlParser.PlusMinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letTupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetTupleExp(MincamlParser.LetTupleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fNegExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFNegExp(MincamlParser.FNegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExp(MincamlParser.SimpleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutExp(MincamlParser.PutExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(MincamlParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreateExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreateExp(MincamlParser.ArrayCreateExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(MincamlParser.LetExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExp(MincamlParser.TupleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(MincamlParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(MincamlParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letRecExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetRecExp(MincamlParser.LetRecExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyDivideExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExp(MincamlParser.MultiplyDivideExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyExp(MincamlParser.ApplyExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExp(MincamlParser.LogicalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqExp(MincamlParser.SeqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MincamlParser#fundef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundef(MincamlParser.FundefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MincamlParser#formal_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_args(MincamlParser.Formal_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MincamlParser#actual_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_args(MincamlParser.Actual_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MincamlParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(MincamlParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MincamlParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(MincamlParser.PatContext ctx);
}