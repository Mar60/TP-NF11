// Generated from grammar/Logo.g4 by ANTLR 4.5

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, INT=21, SIGN=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "INT", "SIGN", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'hasard'", "'loop'", 
		"'av'", "'td'", "'tg'", "'re'", "'fpos'", "'['", "']'", "'lc'", "'bc'", 
		"'ve'", "'fcc'", "'repete'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "INT", "SIGN", "WS"
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\7\26v\n\26\f\26\16\26y\13\26\5\26{\n\26\3\27"+
		"\3\27\3\30\6\30\u0080\n\30\r\30\16\30\u0081\3\30\3\30\2\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\6\3\2\63;\3\2\62;\4\2--//\5\2\13\f\17"+
		"\17\"\"\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139"+
		"\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21D\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27"+
		"O\3\2\2\2\31R\3\2\2\2\33U\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#"+
		"a\3\2\2\2%d\3\2\2\2\'g\3\2\2\2)k\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\177\3\2"+
		"\2\2\61\62\7,\2\2\62\4\3\2\2\2\63\64\7\61\2\2\64\6\3\2\2\2\65\66\7-\2"+
		"\2\66\b\3\2\2\2\678\7/\2\28\n\3\2\2\29:\7*\2\2:\f\3\2\2\2;<\7+\2\2<\16"+
		"\3\2\2\2=>\7j\2\2>?\7c\2\2?@\7u\2\2@A\7c\2\2AB\7t\2\2BC\7f\2\2C\20\3\2"+
		"\2\2DE\7n\2\2EF\7q\2\2FG\7q\2\2GH\7r\2\2H\22\3\2\2\2IJ\7c\2\2JK\7x\2\2"+
		"K\24\3\2\2\2LM\7v\2\2MN\7f\2\2N\26\3\2\2\2OP\7v\2\2PQ\7i\2\2Q\30\3\2\2"+
		"\2RS\7t\2\2ST\7g\2\2T\32\3\2\2\2UV\7h\2\2VW\7r\2\2WX\7q\2\2XY\7u\2\2Y"+
		"\34\3\2\2\2Z[\7]\2\2[\36\3\2\2\2\\]\7_\2\2] \3\2\2\2^_\7n\2\2_`\7e\2\2"+
		"`\"\3\2\2\2ab\7d\2\2bc\7e\2\2c$\3\2\2\2de\7x\2\2ef\7g\2\2f&\3\2\2\2gh"+
		"\7h\2\2hi\7e\2\2ij\7e\2\2j(\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7r\2\2no\7g\2"+
		"\2op\7v\2\2pq\7g\2\2q*\3\2\2\2r{\7\62\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2zs\3\2\2"+
		"\2{,\3\2\2\2|}\t\4\2\2}.\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\b\30\2\2\u0084\60\3\2\2\2\6\2wz\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}