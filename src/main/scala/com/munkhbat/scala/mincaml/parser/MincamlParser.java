// Generated from /Users/munkhbat/Desktop/clones/github/mincamlScala/src/main/scala/com/munkhbat/scala/mincaml/parser/Mincaml.g4 by ANTLR 4.7.2
package com.munkhbat.scala.mincaml.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MincamlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ARRAY_CREATE=20, IF=21, THEN=22, ELSE=23, LET=24, 
		REC=25, IN=26, BOOL=27, INT=28, FLOAT=29, COMMENT=30, IDENT=31, WS=32;
	public static final int
		RULE_simple_exp = 0, RULE_exp = 1, RULE_fundef = 2, RULE_formal_args = 3, 
		RULE_actual_args = 4, RULE_elems = 5, RULE_pat = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"simple_exp", "exp", "fundef", "formal_args", "actual_args", "elems", 
			"pat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'not'", "'-'", "'*.'", "'/.'", "'+'", "'+.'", 
			"'-.'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "','", "'<-'", "';'", 
			"'Array.create'", "'if'", "'then'", "'else'", "'let'", "'rec'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ARRAY_CREATE", "IF", 
			"THEN", "ELSE", "LET", "REC", "IN", "BOOL", "INT", "FLOAT", "COMMENT", 
			"IDENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mincaml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MincamlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Simple_expContext extends ParserRuleContext {
		public Simple_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_exp; }
	 
		public Simple_expContext() { }
		public void copyFrom(Simple_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyParenExpContext extends Simple_expContext {
		public EmptyParenExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterEmptyParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitEmptyParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitEmptyParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends Simple_expContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpContext extends Simple_expContext {
		public TerminalNode BOOL() { return getToken(MincamlParser.BOOL, 0); }
		public BoolExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentExpContext extends Simple_expContext {
		public TerminalNode IDENT() { return getToken(MincamlParser.IDENT, 0); }
		public IdentExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterIdentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitIdentExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitIdentExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExpContext extends Simple_expContext {
		public TerminalNode INT() { return getToken(MincamlParser.INT, 0); }
		public IntExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterIntExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitIntExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitIntExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatExpContext extends Simple_expContext {
		public TerminalNode FLOAT() { return getToken(MincamlParser.FLOAT, 0); }
		public FloatExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterFloatExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitFloatExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitFloatExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetExpContext extends Simple_expContext {
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GetExpContext(Simple_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterGetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitGetExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitGetExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expContext simple_exp() throws RecognitionException {
		return simple_exp(0);
	}

	private Simple_expContext simple_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_expContext _localctx = new Simple_expContext(_ctx, _parentState);
		Simple_expContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_simple_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				match(T__0);
				setState(16);
				exp(0);
				setState(17);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new EmptyParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__0);
				setState(20);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new BoolExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new IntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GetExpContext(new Simple_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_simple_exp);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28);
					match(T__2);
					setState(29);
					match(T__0);
					setState(30);
					exp(0);
					setState(31);
					match(T__1);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusMinusExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PlusMinusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterPlusMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitPlusMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitPlusMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetTupleExpContext extends ExpContext {
		public TerminalNode LET() { return getToken(MincamlParser.LET, 0); }
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(MincamlParser.IN, 0); }
		public LetTupleExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterLetTupleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitLetTupleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitLetTupleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FNegExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FNegExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterFNegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitFNegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitFNegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleExpContext extends ExpContext {
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public SimpleExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterSimpleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitSimpleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitSimpleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutExpContext extends ExpContext {
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PutExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterPutExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitPutExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitPutExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreateExpContext extends ExpContext {
		public TerminalNode ARRAY_CREATE() { return getToken(MincamlParser.ARRAY_CREATE, 0); }
		public List<Simple_expContext> simple_exp() {
			return getRuleContexts(Simple_expContext.class);
		}
		public Simple_expContext simple_exp(int i) {
			return getRuleContext(Simple_expContext.class,i);
		}
		public ArrayCreateExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterArrayCreateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitArrayCreateExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitArrayCreateExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetExpContext extends ExpContext {
		public TerminalNode LET() { return getToken(MincamlParser.LET, 0); }
		public TerminalNode IDENT() { return getToken(MincamlParser.IDENT, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(MincamlParser.IN, 0); }
		public LetExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterLetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitLetExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitLetExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ElemsContext elems() {
			return getRuleContext(ElemsContext.class,0);
		}
		public TupleExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterTupleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitTupleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitTupleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpContext {
		public ExpContext condition;
		public ExpContext thenExp;
		public ExpContext elseExp;
		public TerminalNode IF() { return getToken(MincamlParser.IF, 0); }
		public TerminalNode THEN() { return getToken(MincamlParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MincamlParser.ELSE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NegExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterNegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitNegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitNegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetRecExpContext extends ExpContext {
		public TerminalNode LET() { return getToken(MincamlParser.LET, 0); }
		public TerminalNode REC() { return getToken(MincamlParser.REC, 0); }
		public FundefContext fundef() {
			return getRuleContext(FundefContext.class,0);
		}
		public TerminalNode IN() { return getToken(MincamlParser.IN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LetRecExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterLetRecExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitLetRecExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitLetRecExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyDivideExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultiplyDivideExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterMultiplyDivideExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitMultiplyDivideExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitMultiplyDivideExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Actual_argsContext actual_args() {
			return getRuleContext(Actual_argsContext.class,0);
		}
		public ApplyExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterApplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitApplyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitApplyExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpContext extends ExpContext {
		public ExpContext left;
		public Token op;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LogicalExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterLogicalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitLogicalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitLogicalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SeqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterSeqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitSeqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitSeqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				simple_exp(0);
				}
				break;
			case 2:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__3);
				setState(41);
				exp(15);
				}
				break;
			case 3:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__4);
				setState(43);
				exp(14);
				}
				break;
			case 4:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(IF);
				setState(45);
				((IfExpContext)_localctx).condition = exp(0);
				setState(46);
				match(THEN);
				setState(47);
				((IfExpContext)_localctx).thenExp = exp(0);
				setState(48);
				match(ELSE);
				setState(49);
				((IfExpContext)_localctx).elseExp = exp(10);
				}
				break;
			case 5:
				{
				_localctx = new FNegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__9);
				setState(52);
				exp(9);
				}
				break;
			case 6:
				{
				_localctx = new LetExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(LET);
				setState(54);
				match(IDENT);
				setState(55);
				match(T__10);
				setState(56);
				exp(0);
				setState(57);
				match(IN);
				setState(58);
				exp(7);
				}
				break;
			case 7:
				{
				_localctx = new LetRecExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(LET);
				setState(61);
				match(REC);
				setState(62);
				fundef();
				setState(63);
				match(IN);
				setState(64);
				exp(6);
				}
				break;
			case 8:
				{
				_localctx = new LetTupleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(LET);
				setState(67);
				match(T__0);
				setState(68);
				pat(0);
				setState(69);
				match(T__1);
				setState(70);
				match(T__10);
				setState(71);
				exp(0);
				setState(72);
				match(IN);
				setState(73);
				exp(4);
				}
				break;
			case 9:
				{
				_localctx = new PutExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				simple_exp(0);
				setState(76);
				match(T__2);
				setState(77);
				match(T__0);
				setState(78);
				exp(0);
				setState(79);
				match(T__1);
				setState(80);
				match(T__17);
				setState(81);
				exp(3);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(ARRAY_CREATE);
				setState(84);
				simple_exp(0);
				setState(85);
				simple_exp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpContext(new ExpContext(_parentctx, _parentState));
						((MultiplyDivideExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(89);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(90);
						((MultiplyDivideExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((MultiplyDivideExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((MultiplyDivideExpContext)_localctx).right = exp(14);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExpContext(new ExpContext(_parentctx, _parentState));
						((PlusMinusExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(93);
						((PlusMinusExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
							((PlusMinusExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						((PlusMinusExpContext)_localctx).right = exp(13);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpContext(new ExpContext(_parentctx, _parentState));
						((LogicalExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(96);
						((LogicalExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
							((LogicalExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						((LogicalExpContext)_localctx).right = exp(12);
						}
						break;
					case 4:
						{
						_localctx = new SeqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(T__18);
						setState(100);
						exp(3);
						}
						break;
					case 5:
						{
						_localctx = new ApplyExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(101);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(102);
						actual_args(0);
						}
						break;
					case 6:
						{
						_localctx = new TupleExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104);
						match(T__16);
						setState(105);
						exp(0);
						setState(106);
						elems();
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FundefContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MincamlParser.IDENT, 0); }
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FundefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterFundef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitFundef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitFundef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundefContext fundef() throws RecognitionException {
		FundefContext _localctx = new FundefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fundef);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(IDENT);
				setState(115);
				formal_args();
				setState(116);
				match(T__10);
				setState(117);
				exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MincamlParser.IDENT, 0); }
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterFormal_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitFormal_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitFormal_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_argsContext formal_args() throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal_args);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IDENT);
				setState(123);
				formal_args();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(IDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_argsContext extends ParserRuleContext {
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public Actual_argsContext actual_args() {
			return getRuleContext(Actual_argsContext.class,0);
		}
		public Actual_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterActual_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitActual_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitActual_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_argsContext actual_args() throws RecognitionException {
		return actual_args(0);
	}

	private Actual_argsContext actual_args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Actual_argsContext _localctx = new Actual_argsContext(_ctx, _parentState);
		Actual_argsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_actual_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			simple_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Actual_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_actual_args);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					simple_exp(0);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElemsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ElemsContext elems() {
			return getRuleContext(ElemsContext.class,0);
		}
		public ElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemsContext elems() throws RecognitionException {
		ElemsContext _localctx = new ElemsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elems);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__16);
				setState(139);
				exp(0);
				setState(140);
				elems();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(MincamlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MincamlParser.IDENT, i);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).enterPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MincamlListener ) ((MincamlListener)listener).exitPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MincamlVisitor ) return ((MincamlVisitor<? extends T>)visitor).visitPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		return pat(0);
	}

	private PatContext pat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatContext _localctx = new PatContext(_ctx, _parentState);
		PatContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_pat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(146);
				match(IDENT);
				setState(147);
				match(T__16);
				setState(148);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pat);
					setState(151);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(152);
					match(T__16);
					setState(153);
					match(IDENT);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return simple_exp_sempred((Simple_expContext)_localctx, predIndex);
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 4:
			return actual_args_sempred((Actual_argsContext)_localctx, predIndex);
		case 6:
			return pat_sempred((PatContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simple_exp_sempred(Simple_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean actual_args_sempred(Actual_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean pat_sempred(PatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2\16"+
		"\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Z\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4z\n\4"+
		"\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0087\n\6\f\6\16"+
		"\6\u008a\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\b\3\b\5"+
		"\b\u0098\n\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3\b\2\6\2\4"+
		"\n\16\t\2\4\6\b\n\f\16\2\5\3\2\b\t\4\2\7\7\n\f\3\2\r\22\2\u00b7\2\33\3"+
		"\2\2\2\4Y\3\2\2\2\6y\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0091\3\2"+
		"\2\2\16\u0097\3\2\2\2\20\21\b\2\1\2\21\22\7\3\2\2\22\23\5\4\3\2\23\24"+
		"\7\4\2\2\24\34\3\2\2\2\25\26\7\3\2\2\26\34\7\4\2\2\27\34\7\35\2\2\30\34"+
		"\7\36\2\2\31\34\7\37\2\2\32\34\7!\2\2\33\20\3\2\2\2\33\25\3\2\2\2\33\27"+
		"\3\2\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34%\3\2\2\2\35\36\f"+
		"\3\2\2\36\37\7\5\2\2\37 \7\3\2\2 !\5\4\3\2!\"\7\4\2\2\"$\3\2\2\2#\35\3"+
		"\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\b\3\1\2"+
		")Z\5\2\2\2*+\7\6\2\2+Z\5\4\3\21,-\7\7\2\2-Z\5\4\3\20./\7\27\2\2/\60\5"+
		"\4\3\2\60\61\7\30\2\2\61\62\5\4\3\2\62\63\7\31\2\2\63\64\5\4\3\f\64Z\3"+
		"\2\2\2\65\66\7\f\2\2\66Z\5\4\3\13\678\7\32\2\289\7!\2\29:\7\r\2\2:;\5"+
		"\4\3\2;<\7\34\2\2<=\5\4\3\t=Z\3\2\2\2>?\7\32\2\2?@\7\33\2\2@A\5\6\4\2"+
		"AB\7\34\2\2BC\5\4\3\bCZ\3\2\2\2DE\7\32\2\2EF\7\3\2\2FG\5\16\b\2GH\7\4"+
		"\2\2HI\7\r\2\2IJ\5\4\3\2JK\7\34\2\2KL\5\4\3\6LZ\3\2\2\2MN\5\2\2\2NO\7"+
		"\5\2\2OP\7\3\2\2PQ\5\4\3\2QR\7\4\2\2RS\7\24\2\2ST\5\4\3\5TZ\3\2\2\2UV"+
		"\7\26\2\2VW\5\2\2\2WX\5\2\2\2XZ\3\2\2\2Y(\3\2\2\2Y*\3\2\2\2Y,\3\2\2\2"+
		"Y.\3\2\2\2Y\65\3\2\2\2Y\67\3\2\2\2Y>\3\2\2\2YD\3\2\2\2YM\3\2\2\2YU\3\2"+
		"\2\2Zp\3\2\2\2[\\\f\17\2\2\\]\t\2\2\2]o\5\4\3\20^_\f\16\2\2_`\t\3\2\2"+
		"`o\5\4\3\17ab\f\r\2\2bc\t\4\2\2co\5\4\3\16de\f\4\2\2ef\7\25\2\2fo\5\4"+
		"\3\5gh\f\n\2\2ho\5\n\6\2ij\f\7\2\2jk\7\23\2\2kl\5\4\3\2lm\5\f\7\2mo\3"+
		"\2\2\2n[\3\2\2\2n^\3\2\2\2na\3\2\2\2nd\3\2\2\2ng\3\2\2\2ni\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\5\3\2\2\2rp\3\2\2\2sz\3\2\2\2tu\7!\2\2uv\5"+
		"\b\5\2vw\7\r\2\2wx\5\4\3\2xz\3\2\2\2ys\3\2\2\2yt\3\2\2\2z\7\3\2\2\2{\u0080"+
		"\3\2\2\2|}\7!\2\2}\u0080\5\b\5\2~\u0080\7!\2\2\177{\3\2\2\2\177|\3\2\2"+
		"\2\177~\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082\b\6\1\2\u0082\u0083\5\2\2"+
		"\2\u0083\u0088\3\2\2\2\u0084\u0085\f\4\2\2\u0085\u0087\5\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\13\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0092\3\2\2\2\u008c\u008d\7\23\2"+
		"\2\u008d\u008e\5\4\3\2\u008e\u008f\5\f\7\2\u008f\u0092\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0098\b\b\1\2\u0094\u0095\7!\2\2\u0095\u0096\7\23\2\2"+
		"\u0096\u0098\7!\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009e"+
		"\3\2\2\2\u0099\u009a\f\4\2\2\u009a\u009b\7\23\2\2\u009b\u009d\7!\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\17\3\2\2\2\u00a0\u009e\3\2\2\2\r\33%Ynpy\177\u0088\u0091\u0097"+
		"\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}