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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WS=30, INTLITERAL=31, 
		FLOATLITERAL=32, STRINGLITERAL=33, COMMENT=34, KEYWORD=35, IDENTIFIER=36, 
		OPERATOR=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "WS", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "KEYWORD", "IDENTIFIER", "OPERATOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "'FLOAT'", 
		"'INT'", "'VOID'", "','", "'READ'", "'WRITE'", "'RETURN'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", "'<'", "'>'", 
		"'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "KEYWORD", "IDENTIFIER", "OPERATOR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \6 \u00ca\n \r \16 \u00cb\3!\7!"+
		"\u00cf\n!\f!\16!\u00d2\13!\3!\3!\6!\u00d6\n!\r!\16!\u00d7\3\"\3\"\7\""+
		"\u00dc\n\"\f\"\16\"\u00df\13\"\3\"\3\"\3#\3#\3#\3#\7#\u00e7\n#\f#\16#"+
		"\u00ea\13#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u014d\n$\3%\6%\u0150\n%\r%\16%\u0151\3%\7"+
		"%\u0155\n%\f%\16%\u0158\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0164\n&"+
		"\4\u00dd\u00e8\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\7\5\2\13\f\17\17\"\"\3\2\62"+
		";\4\2C\\c|\6\2,-//\61\61??\6\2*+..=>@@\u0181\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3"+
		"M\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2\ri\3\2\2\2\17o"+
		"\3\2\2\2\21s\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0085\3"+
		"\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2"+
		"\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u009b\3\2\2\2+\u00a1"+
		"\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2"+
		"\2\65\u00af\3\2\2\2\67\u00b2\3\2\2\29\u00b5\3\2\2\2;\u00bb\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00d0\3\2\2\2C\u00d9\3\2\2\2E\u00e2\3\2\2\2G"+
		"\u014c\3\2\2\2I\u014f\3\2\2\2K\u0163\3\2\2\2MN\7R\2\2NO\7T\2\2OP\7Q\2"+
		"\2PQ\7I\2\2QR\7T\2\2RS\7C\2\2ST\7O\2\2T\4\3\2\2\2UV\7D\2\2VW\7G\2\2WX"+
		"\7I\2\2XY\7K\2\2YZ\7P\2\2Z\6\3\2\2\2[\\\7G\2\2\\]\7P\2\2]^\7F\2\2^\b\3"+
		"\2\2\2_`\7U\2\2`a\7V\2\2ab\7T\2\2bc\7K\2\2cd\7P\2\2de\7I\2\2e\n\3\2\2"+
		"\2fg\7<\2\2gh\7?\2\2h\f\3\2\2\2ij\7H\2\2jk\7N\2\2kl\7Q\2\2lm\7C\2\2mn"+
		"\7V\2\2n\16\3\2\2\2op\7K\2\2pq\7P\2\2qr\7V\2\2r\20\3\2\2\2st\7X\2\2tu"+
		"\7Q\2\2uv\7K\2\2vw\7F\2\2w\22\3\2\2\2xy\7.\2\2y\24\3\2\2\2z{\7T\2\2{|"+
		"\7G\2\2|}\7C\2\2}~\7F\2\2~\26\3\2\2\2\177\u0080\7Y\2\2\u0080\u0081\7T"+
		"\2\2\u0081\u0082\7K\2\2\u0082\u0083\7V\2\2\u0083\u0084\7G\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7T\2\2\u0086\u0087\7G\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7W\2\2\u0089\u008a\7T\2\2\u008a\u008b\7P\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7*\2\2\u008d\34\3\2\2\2\u008e\u008f\7+\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7-\2\2\u0091 \3\2\2\2\u0092\u0093\7/\2\2\u0093\"\3\2\2\2\u0094"+
		"\u0095\7,\2\2\u0095$\3\2\2\2\u0096\u0097\7\61\2\2\u0097&\3\2\2\2\u0098"+
		"\u0099\7K\2\2\u0099\u009a\7H\2\2\u009a(\3\2\2\2\u009b\u009c\7G\2\2\u009c"+
		"\u009d\7P\2\2\u009d\u009e\7F\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7H\2\2"+
		"\u00a0*\3\2\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7U\2"+
		"\2\u00a4\u00a5\7G\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7.\3\2\2\2"+
		"\u00a8\u00a9\7@\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\62\3\2\2"+
		"\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7?\2\2\u00ae\64\3\2\2\2\u00af\u00b0"+
		"\7>\2\2\u00b0\u00b1\7?\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b48\3\2\2\2\u00b5\u00b6\7Y\2\2\u00b6\u00b7\7J\2\2\u00b7\u00b8"+
		"\7K\2\2\u00b8\u00b9\7N\2\2\u00b9\u00ba\7G\2\2\u00ba:\3\2\2\2\u00bb\u00bc"+
		"\7G\2\2\u00bc\u00bd\7P\2\2\u00bd\u00be\7F\2\2\u00be\u00bf\7Y\2\2\u00bf"+
		"\u00c0\7J\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7G\2\2"+
		"\u00c3<\3\2\2\2\u00c4\u00c5\t\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b"+
		"\37\2\2\u00c7>\3\2\2\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc@\3\2\2\2\u00cd"+
		"\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\7\60\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8B\3\2\2\2\u00d9\u00dd"+
		"\7$\2\2\u00da\u00dc\13\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7$\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4"+
		"\7/\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b#\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7R\2\2\u00f0\u00f1\7T\2\2\u00f1"+
		"\u00f2\7Q\2\2\u00f2\u00f3\7I\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7C\2\2"+
		"\u00f5\u014d\7O\2\2\u00f6\u00f7\7D\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9"+
		"\7I\2\2\u00f9\u00fa\7K\2\2\u00fa\u014d\7P\2\2\u00fb\u00fc\7G\2\2\u00fc"+
		"\u00fd\7P\2\2\u00fd\u014d\7F\2\2\u00fe\u00ff\7H\2\2\u00ff\u0100\7W\2\2"+
		"\u0100\u0101\7P\2\2\u0101\u0102\7E\2\2\u0102\u0103\7V\2\2\u0103\u0104"+
		"\7K\2\2\u0104\u0105\7Q\2\2\u0105\u014d\7P\2\2\u0106\u0107\7T\2\2\u0107"+
		"\u0108\7G\2\2\u0108\u0109\7C\2\2\u0109\u014d\7F\2\2\u010a\u010b\7Y\2\2"+
		"\u010b\u010c\7T\2\2\u010c\u010d\7K\2\2\u010d\u010e\7V\2\2\u010e\u014d"+
		"\7G\2\2\u010f\u0110\7K\2\2\u0110\u014d\7H\2\2\u0111\u0112\7G\2\2\u0112"+
		"\u0113\7N\2\2\u0113\u0114\7U\2\2\u0114\u014d\7G\2\2\u0115\u0116\7G\2\2"+
		"\u0116\u0117\7P\2\2\u0117\u0118\7F\2\2\u0118\u0119\7K\2\2\u0119\u014d"+
		"\7H\2\2\u011a\u011b\7Y\2\2\u011b\u011c\7J\2\2\u011c\u011d\7K\2\2\u011d"+
		"\u011e\7N\2\2\u011e\u014d\7G\2\2\u011f\u0120\7G\2\2\u0120\u0121\7P\2\2"+
		"\u0121\u0122\7F\2\2\u0122\u0123\7Y\2\2\u0123\u0124\7J\2\2\u0124\u0125"+
		"\7K\2\2\u0125\u0126\7N\2\2\u0126\u014d\7G\2\2\u0127\u0128\7E\2\2\u0128"+
		"\u0129\7Q\2\2\u0129\u012a\7P\2\2\u012a\u012b\7V\2\2\u012b\u012c\7K\2\2"+
		"\u012c\u012d\7P\2\2\u012d\u012e\7W\2\2\u012e\u014d\7G\2\2\u012f\u0130"+
		"\7D\2\2\u0130\u0131\7T\2\2\u0131\u0132\7G\2\2\u0132\u0133\7C\2\2\u0133"+
		"\u014d\7M\2\2\u0134\u0135\7T\2\2\u0135\u0136\7G\2\2\u0136\u0137\7V\2\2"+
		"\u0137\u0138\7W\2\2\u0138\u0139\7T\2\2\u0139\u014d\7P\2\2\u013a\u013b"+
		"\7K\2\2\u013b\u013c\7P\2\2\u013c\u014d\7V\2\2\u013d\u013e\7X\2\2\u013e"+
		"\u013f\7Q\2\2\u013f\u0140\7K\2\2\u0140\u014d\7F\2\2\u0141\u0142\7U\2\2"+
		"\u0142\u0143\7V\2\2\u0143\u0144\7T\2\2\u0144\u0145\7K\2\2\u0145\u0146"+
		"\7P\2\2\u0146\u014d\7I\2\2\u0147\u0148\7H\2\2\u0148\u0149\7N\2\2\u0149"+
		"\u014a\7Q\2\2\u014a\u014b\7C\2\2\u014b\u014d\7V\2\2\u014c\u00ef\3\2\2"+
		"\2\u014c\u00f6\3\2\2\2\u014c\u00fb\3\2\2\2\u014c\u00fe\3\2\2\2\u014c\u0106"+
		"\3\2\2\2\u014c\u010a\3\2\2\2\u014c\u010f\3\2\2\2\u014c\u0111\3\2\2\2\u014c"+
		"\u0115\3\2\2\2\u014c\u011a\3\2\2\2\u014c\u011f\3\2\2\2\u014c\u0127\3\2"+
		"\2\2\u014c\u012f\3\2\2\2\u014c\u0134\3\2\2\2\u014c\u013a\3\2\2\2\u014c"+
		"\u013d\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0147\3\2\2\2\u014dH\3\2\2\2"+
		"\u014e\u0150\t\4\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0155\t\3\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157J\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7<\2\2\u015a\u0164"+
		"\7?\2\2\u015b\u0164\t\5\2\2\u015c\u015d\7#\2\2\u015d\u0164\7?\2\2\u015e"+
		"\u0164\t\6\2\2\u015f\u0160\7>\2\2\u0160\u0164\7?\2\2\u0161\u0162\7@\2"+
		"\2\u0162\u0164\7?\2\2\u0163\u0159\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015c"+
		"\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"L\3\2\2\2\f\2\u00cb\u00d0\u00d7\u00dd\u00e8\u014c\u0151\u0156\u0163\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}