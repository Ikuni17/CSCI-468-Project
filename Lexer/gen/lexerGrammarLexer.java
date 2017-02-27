// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/Lexer/src\lexerGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexerGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, INTLITERAL=14, FLOATLITERAL=15, STRINGLITERAL=16, 
		COMMENT=17, KEYWORD=18, IDENTIFIER=19, OPERATOR=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"COMMENT", "KEYWORD", "IDENTIFIER", "OPERATOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "','", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'='", 
		"'!='", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"KEYWORD", "IDENTIFIER", "OPERATOR"
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


	public lexerGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexerGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00e8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17M\n\17\r\17\16\17N\3\20\7\20"+
		"R\n\20\f\20\16\20U\13\20\3\20\3\20\6\20Y\n\20\r\20\16\20Z\3\21\3\21\7"+
		"\21_\n\21\f\21\16\21b\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22j\n\22\f"+
		"\22\16\22m\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00d0\n\23\3\24\6\24\u00d3\n\24\r\24\16\24\u00d4\3\24"+
		"\7\24\u00d8\n\24\f\24\16\24\u00db\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\4`k\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\6\2,-//\61\61??\6\2*+..=>@"+
		"@\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7"+
		"\60\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3"+
		"\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27A\3\2\2\2\31D\3\2\2\2\33G\3\2\2\2\35"+
		"L\3\2\2\2\37S\3\2\2\2!\\\3\2\2\2#e\3\2\2\2%\u00cf\3\2\2\2\'\u00d2\3\2"+
		"\2\2)\u00e6\3\2\2\2+,\7<\2\2,-\7?\2\2-\4\3\2\2\2./\7.\2\2/\6\3\2\2\2\60"+
		"\61\7-\2\2\61\b\3\2\2\2\62\63\7/\2\2\63\n\3\2\2\2\64\65\7,\2\2\65\f\3"+
		"\2\2\2\66\67\7\61\2\2\67\16\3\2\2\289\7>\2\29\20\3\2\2\2:;\7@\2\2;\22"+
		"\3\2\2\2<=\7?\2\2=\24\3\2\2\2>?\7#\2\2?@\7?\2\2@\26\3\2\2\2AB\7>\2\2B"+
		"C\7?\2\2C\30\3\2\2\2DE\7@\2\2EF\7?\2\2F\32\3\2\2\2GH\t\2\2\2HI\3\2\2\2"+
		"IJ\b\16\2\2J\34\3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2O\36\3\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2US\3\2\2\2VX\7\60\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[ \3\2\2\2\\`\7$\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2"+
		"`^\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7$\2\2d\"\3\2\2\2ef\7/\2\2fg\7/\2\2g"+
		"k\3\2\2\2hj\13\2\2\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2"+
		"mk\3\2\2\2no\7\f\2\2op\3\2\2\2pq\b\22\2\2q$\3\2\2\2rs\7R\2\2st\7T\2\2"+
		"tu\7Q\2\2uv\7I\2\2vw\7T\2\2wx\7C\2\2x\u00d0\7O\2\2yz\7D\2\2z{\7G\2\2{"+
		"|\7I\2\2|}\7K\2\2}\u00d0\7P\2\2~\177\7G\2\2\177\u0080\7P\2\2\u0080\u00d0"+
		"\7F\2\2\u0081\u0082\7H\2\2\u0082\u0083\7W\2\2\u0083\u0084\7P\2\2\u0084"+
		"\u0085\7E\2\2\u0085\u0086\7V\2\2\u0086\u0087\7K\2\2\u0087\u0088\7Q\2\2"+
		"\u0088\u00d0\7P\2\2\u0089\u008a\7T\2\2\u008a\u008b\7G\2\2\u008b\u008c"+
		"\7C\2\2\u008c\u00d0\7F\2\2\u008d\u008e\7Y\2\2\u008e\u008f\7T\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7V\2\2\u0091\u00d0\7G\2\2\u0092\u0093\7K\2\2"+
		"\u0093\u00d0\7H\2\2\u0094\u0095\7G\2\2\u0095\u0096\7N\2\2\u0096\u0097"+
		"\7U\2\2\u0097\u00d0\7G\2\2\u0098\u0099\7G\2\2\u0099\u009a\7P\2\2\u009a"+
		"\u009b\7F\2\2\u009b\u009c\7K\2\2\u009c\u00d0\7H\2\2\u009d\u009e\7Y\2\2"+
		"\u009e\u009f\7J\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7N\2\2\u00a1\u00d0"+
		"\7G\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5\7F\2\2\u00a5"+
		"\u00a6\7Y\2\2\u00a6\u00a7\7J\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7N\2\2"+
		"\u00a9\u00d0\7G\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad"+
		"\7P\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7P\2\2\u00b0"+
		"\u00b1\7W\2\2\u00b1\u00d0\7G\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\7T\2\2"+
		"\u00b4\u00b5\7G\2\2\u00b5\u00b6\7C\2\2\u00b6\u00d0\7M\2\2\u00b7\u00b8"+
		"\7T\2\2\u00b8\u00b9\7G\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7W\2\2\u00bb"+
		"\u00bc\7T\2\2\u00bc\u00d0\7P\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7P\2\2"+
		"\u00bf\u00d0\7V\2\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3"+
		"\7K\2\2\u00c3\u00d0\7F\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7V\2\2\u00c6"+
		"\u00c7\7T\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7P\2\2\u00c9\u00d0\7I\2\2"+
		"\u00ca\u00cb\7H\2\2\u00cb\u00cc\7N\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce"+
		"\7C\2\2\u00ce\u00d0\7V\2\2\u00cfr\3\2\2\2\u00cfy\3\2\2\2\u00cf~\3\2\2"+
		"\2\u00cf\u0081\3\2\2\2\u00cf\u0089\3\2\2\2\u00cf\u008d\3\2\2\2\u00cf\u0092"+
		"\3\2\2\2\u00cf\u0094\3\2\2\2\u00cf\u0098\3\2\2\2\u00cf\u009d\3\2\2\2\u00cf"+
		"\u00a2\3\2\2\2\u00cf\u00aa\3\2\2\2\u00cf\u00b2\3\2\2\2\u00cf\u00b7\3\2"+
		"\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00d0&\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9"+
		"\3\2\2\2\u00d6\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da(\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00dc\u00dd\7<\2\2\u00dd\u00e7\7?\2\2\u00de\u00e7\t\5\2\2\u00df\u00e0"+
		"\7#\2\2\u00e0\u00e7\7?\2\2\u00e1\u00e7\t\6\2\2\u00e2\u00e3\7>\2\2\u00e3"+
		"\u00e7\7?\2\2\u00e4\u00e5\7@\2\2\u00e5\u00e7\7?\2\2\u00e6\u00dc\3\2\2"+
		"\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7*\3\2\2\2\f\2NSZ`k\u00cf\u00d4\u00d9"+
		"\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}