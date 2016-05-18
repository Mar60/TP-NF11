// Generated from grammar/Logo.g4 by ANTLR 4.5

  package logoparsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, INT=35, ID=36, SIGN=37, WS=38;
	public static final int
		RULE_exp = 0, RULE_atom = 1, RULE_expbool = 2, RULE_programme = 3, RULE_liste_instructions = 4, 
		RULE_instruction = 5;
	public static final String[] ruleNames = {
		"exp", "atom", "expbool", "programme", "liste_instructions", "instruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'hasard'", "'loop'", 
		"':'", "'&'", "'|'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'!'", 
		"'av'", "'td'", "'tg'", "'re'", "'fpos'", "'['", "']'", "'lc'", "'bc'", 
		"'ve'", "'fcc'", "'repete'", "'donne'", "'\"'", "'si'", "'tantque'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"ID", "SIGN", "WS"
	};
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
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
	public static class AruleContext extends ExpContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AruleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterArule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitArule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitArule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSum(this);
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AruleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(13);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(21);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(15);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(16);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(17);
						exp(4);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(18);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(19);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(20);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(25);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentContext extends AtomContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParentContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends AtomContext {
		public LoopContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigIntContext extends AtomContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public SigIntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSigInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSigInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSigInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HasardContext extends AtomContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public HasardContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHasard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHasard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHasard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		int _la;
		try {
			setState(38);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(INT);
				}
				break;
			case T__4:
				_localctx = new ParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__4);
				setState(28);
				exp(0);
				setState(29);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new HasardContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(T__6);
				setState(32);
				exp(0);
				}
				break;
			case T__7:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T__7);
				}
				break;
			case T__2:
			case T__3:
				_localctx = new SigIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(35);
				match(INT);
				}
				break;
			case T__8:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				match(T__8);
				setState(37);
				match(ID);
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

	public static class ExpboolContext extends ParserRuleContext {
		public ExpboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool; }
	 
		public ExpboolContext() { }
		public void copyFrom(ExpboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogiqueParentContext extends ExpboolContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public LogiqueParentContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLogiqueParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLogiqueParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLogiqueParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogiqueEtContext extends ExpboolContext {
		public List<ExpboolContext> expbool() {
			return getRuleContexts(ExpboolContext.class);
		}
		public ExpboolContext expbool(int i) {
			return getRuleContext(ExpboolContext.class,i);
		}
		public LogiqueEtContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLogiqueEt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLogiqueEt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLogiqueEt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogiqueNegationContext extends ExpboolContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public LogiqueNegationContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLogiqueNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLogiqueNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLogiqueNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOperationContext extends ExpboolContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BoolOperationContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBoolOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBoolOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBoolOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogiqueOuContext extends ExpboolContext {
		public List<ExpboolContext> expbool() {
			return getRuleContexts(ExpboolContext.class);
		}
		public ExpboolContext expbool(int i) {
			return getRuleContext(ExpboolContext.class,i);
		}
		public LogiqueOuContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLogiqueOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLogiqueOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLogiqueOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpboolContext expbool() throws RecognitionException {
		return expbool(0);
	}

	private ExpboolContext expbool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpboolContext _localctx = new ExpboolContext(_ctx, _parentState);
		ExpboolContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expbool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new LogiqueNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				match(T__17);
				setState(42);
				expbool(1);
				}
				break;
			case 2:
				{
				_localctx = new LogiqueParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__4);
				setState(44);
				expbool(0);
				setState(45);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new BoolOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				exp(0);
				setState(48);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(49);
				exp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new LogiqueEtContext(new ExpboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expbool);
						setState(53);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(54);
						match(T__9);
						setState(55);
						expbool(6);
						}
						break;
					case 2:
						{
						_localctx = new LogiqueOuContext(new ExpboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expbool);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						match(T__10);
						setState(58);
						expbool(5);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ProgrammeContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			liste_instructions();
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

	public static class Liste_instructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitListe_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_liste_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				instruction();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BcContext extends InstructionContext {
		public BcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FccContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FccContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFcc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VeContext extends InstructionContext {
		public VeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DonneContext extends InstructionContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DonneContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDonne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDonne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDonne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TdContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TdContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TgContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TgContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TantqueContext extends InstructionContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public TantqueContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTantque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTantque(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AvContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeteContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public RepeteContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRepete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRepete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRepete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SiContext extends InstructionContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public List<Liste_instructionsContext> liste_instructions() {
			return getRuleContexts(Liste_instructionsContext.class);
		}
		public Liste_instructionsContext liste_instructions(int i) {
			return getRuleContext(Liste_instructionsContext.class,i);
		}
		public SiContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LcContext extends InstructionContext {
		public LcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FposContext extends InstructionContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public FposContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		int _la;
		try {
			setState(117);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__18);
				setState(72);
				exp(0);
				}
				break;
			case T__19:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__19);
				setState(74);
				exp(0);
				}
				break;
			case T__20:
				_localctx = new TgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__20);
				setState(76);
				exp(0);
				}
				break;
			case T__21:
				_localctx = new ReContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__21);
				setState(78);
				exp(0);
				}
				break;
			case T__22:
				_localctx = new FposContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(T__22);
				setState(80);
				match(T__23);
				setState(81);
				atom();
				setState(82);
				atom();
				setState(83);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new LcContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new BcContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new VeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new FccContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				match(T__28);
				setState(89);
				exp(0);
				}
				break;
			case T__29:
				_localctx = new RepeteContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				match(T__29);
				setState(91);
				exp(0);
				setState(92);
				match(T__23);
				setState(93);
				liste_instructions();
				setState(94);
				match(T__24);
				}
				break;
			case T__30:
				_localctx = new DonneContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				match(T__30);
				setState(97);
				match(T__31);
				setState(98);
				match(ID);
				setState(99);
				exp(0);
				}
				break;
			case T__32:
				_localctx = new SiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				match(T__32);
				setState(101);
				expbool(0);
				setState(102);
				match(T__23);
				setState(103);
				liste_instructions();
				setState(104);
				match(T__24);
				setState(109);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(105);
					match(T__23);
					setState(106);
					liste_instructions();
					setState(107);
					match(T__24);
					}
				}

				}
				break;
			case T__33:
				_localctx = new TantqueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(111);
				match(T__33);
				setState(112);
				expbool(0);
				setState(113);
				match(T__23);
				setState(114);
				liste_instructions();
				setState(115);
				match(T__24);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 2:
			return expbool_sempred((ExpboolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expbool_sempred(ExpboolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(z\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\6\6\6F\n\6\r"+
		"\6\16\6G\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7x\n\7\3\7\2\4"+
		"\2\6\b\2\4\6\b\n\f\2\5\3\2\3\4\3\2\5\6\3\2\16\23\u008c\2\16\3\2\2\2\4"+
		"(\3\2\2\2\6\65\3\2\2\2\bB\3\2\2\2\nE\3\2\2\2\fw\3\2\2\2\16\17\b\2\1\2"+
		"\17\20\5\4\3\2\20\31\3\2\2\2\21\22\f\5\2\2\22\23\t\2\2\2\23\30\5\2\2\6"+
		"\24\25\f\4\2\2\25\26\t\3\2\2\26\30\5\2\2\5\27\21\3\2\2\2\27\24\3\2\2\2"+
		"\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2"+
		"\34)\7%\2\2\35\36\7\7\2\2\36\37\5\2\2\2\37 \7\b\2\2 )\3\2\2\2!\"\7\t\2"+
		"\2\")\5\2\2\2#)\7\n\2\2$%\t\3\2\2%)\7%\2\2&\'\7\13\2\2\')\7&\2\2(\34\3"+
		"\2\2\2(\35\3\2\2\2(!\3\2\2\2(#\3\2\2\2($\3\2\2\2(&\3\2\2\2)\5\3\2\2\2"+
		"*+\b\4\1\2+,\7\24\2\2,\66\5\6\4\3-.\7\7\2\2./\5\6\4\2/\60\7\b\2\2\60\66"+
		"\3\2\2\2\61\62\5\2\2\2\62\63\t\4\2\2\63\64\5\2\2\2\64\66\3\2\2\2\65*\3"+
		"\2\2\2\65-\3\2\2\2\65\61\3\2\2\2\66?\3\2\2\2\678\f\7\2\289\7\f\2\29>\5"+
		"\6\4\b:;\f\6\2\2;<\7\r\2\2<>\5\6\4\7=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\5\n\6\2C\t\3\2\2\2DF\5\f\7"+
		"\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IJ\7\25\2\2Jx\5"+
		"\2\2\2KL\7\26\2\2Lx\5\2\2\2MN\7\27\2\2Nx\5\2\2\2OP\7\30\2\2Px\5\2\2\2"+
		"QR\7\31\2\2RS\7\32\2\2ST\5\4\3\2TU\5\4\3\2UV\7\33\2\2Vx\3\2\2\2Wx\7\34"+
		"\2\2Xx\7\35\2\2Yx\7\36\2\2Z[\7\37\2\2[x\5\2\2\2\\]\7 \2\2]^\5\2\2\2^_"+
		"\7\32\2\2_`\5\n\6\2`a\7\33\2\2ax\3\2\2\2bc\7!\2\2cd\7\"\2\2de\7&\2\2e"+
		"x\5\2\2\2fg\7#\2\2gh\5\6\4\2hi\7\32\2\2ij\5\n\6\2jo\7\33\2\2kl\7\32\2"+
		"\2lm\5\n\6\2mn\7\33\2\2np\3\2\2\2ok\3\2\2\2op\3\2\2\2px\3\2\2\2qr\7$\2"+
		"\2rs\5\6\4\2st\7\32\2\2tu\5\n\6\2uv\7\33\2\2vx\3\2\2\2wI\3\2\2\2wK\3\2"+
		"\2\2wM\3\2\2\2wO\3\2\2\2wQ\3\2\2\2wW\3\2\2\2wX\3\2\2\2wY\3\2\2\2wZ\3\2"+
		"\2\2w\\\3\2\2\2wb\3\2\2\2wf\3\2\2\2wq\3\2\2\2x\r\3\2\2\2\13\27\31(\65"+
		"=?Gow";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}