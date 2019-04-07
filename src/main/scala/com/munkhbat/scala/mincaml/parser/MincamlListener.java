// Generated from /Users/munkhbat/Desktop/clones/github/mincamlScala/src/main/scala/com/munkhbat/scala/mincaml/parser/Mincaml.g4 by ANTLR 4.7.2
package com.munkhbat.scala.mincaml.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MincamlParser}.
 */
public interface MincamlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code emptyParenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterEmptyParenExp(MincamlParser.EmptyParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyParenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitEmptyParenExp(MincamlParser.EmptyParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(MincamlParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(MincamlParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(MincamlParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(MincamlParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterIdentExp(MincamlParser.IdentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitIdentExp(MincamlParser.IdentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterIntExp(MincamlParser.IntExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitIntExp(MincamlParser.IntExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterFloatExp(MincamlParser.FloatExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitFloatExp(MincamlParser.FloatExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterGetExp(MincamlParser.GetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getExp}
	 * labeled alternative in {@link MincamlParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitGetExp(MincamlParser.GetExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExp(MincamlParser.PlusMinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExp(MincamlParser.PlusMinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letTupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetTupleExp(MincamlParser.LetTupleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letTupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetTupleExp(MincamlParser.LetTupleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fNegExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFNegExp(MincamlParser.FNegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fNegExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFNegExp(MincamlParser.FNegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExp(MincamlParser.SimpleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExp(MincamlParser.SimpleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code putExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPutExp(MincamlParser.PutExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code putExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPutExp(MincamlParser.PutExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(MincamlParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(MincamlParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCreateExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreateExp(MincamlParser.ArrayCreateExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCreateExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreateExp(MincamlParser.ArrayCreateExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(MincamlParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(MincamlParser.LetExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTupleExp(MincamlParser.TupleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTupleExp(MincamlParser.TupleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(MincamlParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(MincamlParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(MincamlParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(MincamlParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letRecExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetRecExp(MincamlParser.LetRecExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letRecExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetRecExp(MincamlParser.LetRecExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyDivideExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExp(MincamlParser.MultiplyDivideExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyDivideExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExp(MincamlParser.MultiplyDivideExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyExp(MincamlParser.ApplyExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyExp(MincamlParser.ApplyExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExp(MincamlParser.LogicalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExp(MincamlParser.LogicalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSeqExp(MincamlParser.SeqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MincamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSeqExp(MincamlParser.SeqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MincamlParser#fundef}.
	 * @param ctx the parse tree
	 */
	void enterFundef(MincamlParser.FundefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MincamlParser#fundef}.
	 * @param ctx the parse tree
	 */
	void exitFundef(MincamlParser.FundefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MincamlParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(MincamlParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MincamlParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(MincamlParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MincamlParser#actual_args}.
	 * @param ctx the parse tree
	 */
	void enterActual_args(MincamlParser.Actual_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MincamlParser#actual_args}.
	 * @param ctx the parse tree
	 */
	void exitActual_args(MincamlParser.Actual_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MincamlParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(MincamlParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MincamlParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(MincamlParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MincamlParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(MincamlParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MincamlParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(MincamlParser.PatContext ctx);
}