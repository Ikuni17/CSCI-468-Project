// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/src\grammer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, INTLITERAL=2, FLOATLITERAL=3, STRINGLITERAL=4, COMMENT=5, 
		KEYWORD=6, OPERATOR=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"KEYWORD", "OPERATOR"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
		"KEYWORD", "OPERATOR"
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


	public grammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2"+
		"\16\2\24\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\7\4\37\n\4\f\4\16\4\""+
		"\13\4\3\4\3\4\3\4\6\4\'\n\4\r\4\16\4(\3\5\3\5\7\5-\n\5\f\5\16\5\60\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a8"+
		"\n\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\4\2C\\c|\6\2,-//\61\61"+
		"??\6\2*+..=>@@\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5\30\3\2\2\2\7 \3\2"+
		"\2\2\t*\3\2\2\2\13\63\3\2\2\2\r\u009b\3\2\2\2\17\u00a7\3\2\2\2\21\23\t"+
		"\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\4\3"+
		"\2\2\2\26\27\7\61\2\2\27\31\7f\2\2\30\26\3\2\2\2\31\32\3\2\2\2\32\30\3"+
		"\2\2\2\32\33\3\2\2\2\33\6\3\2\2\2\34\35\7\61\2\2\35\37\7f\2\2\36\34\3"+
		"\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#&\13\2"+
		"\2\2$%\7\61\2\2%\'\7f\2\2&$\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\b"+
		"\3\2\2\2*.\7$\2\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\61\3\2\2\2\60.\3\2\2\2\61\62\7$\2\2\62\n\3\2\2\2\63\64\7/\2\2\64\65"+
		"\7/\2\2\659\3\2\2\2\668\13\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\f\2\2=\f\3\2\2\2>?\7R\2\2?@\7T\2\2@"+
		"A\7Q\2\2AB\7I\2\2BC\7T\2\2CD\7C\2\2D\u009c\7O\2\2EF\7D\2\2FG\7G\2\2GH"+
		"\7I\2\2HI\7K\2\2I\u009c\7P\2\2JK\7G\2\2KL\7P\2\2L\u009c\7F\2\2MN\7H\2"+
		"\2NO\7W\2\2OP\7P\2\2PQ\7E\2\2QR\7V\2\2RS\7K\2\2ST\7Q\2\2T\u009c\7P\2\2"+
		"UV\7T\2\2VW\7G\2\2WX\7C\2\2X\u009c\7F\2\2YZ\7Y\2\2Z[\7T\2\2[\\\7K\2\2"+
		"\\]\7V\2\2]\u009c\7G\2\2^_\7K\2\2_\u009c\7H\2\2`a\7G\2\2ab\7N\2\2bc\7"+
		"U\2\2c\u009c\7G\2\2de\7G\2\2ef\7P\2\2fg\7F\2\2gh\7K\2\2h\u009c\7H\2\2"+
		"ij\7Y\2\2jk\7J\2\2kl\7K\2\2lm\7N\2\2m\u009c\7G\2\2no\7G\2\2op\7P\2\2p"+
		"q\7F\2\2qr\7Y\2\2rs\7J\2\2st\7K\2\2tu\7N\2\2u\u009c\7G\2\2vw\7E\2\2wx"+
		"\7Q\2\2xy\7P\2\2yz\7V\2\2z{\7K\2\2{|\7P\2\2|}\7W\2\2}\u009c\7G\2\2~\177"+
		"\7D\2\2\177\u0080\7T\2\2\u0080\u0081\7G\2\2\u0081\u0082\7C\2\2\u0082\u009c"+
		"\7M\2\2\u0083\u0084\7T\2\2\u0084\u0085\7G\2\2\u0085\u0086\7V\2\2\u0086"+
		"\u0087\7W\2\2\u0087\u0088\7T\2\2\u0088\u009c\7P\2\2\u0089\u008a\7K\2\2"+
		"\u008a\u008b\7P\2\2\u008b\u009c\7V\2\2\u008c\u008d\7X\2\2\u008d\u008e"+
		"\7Q\2\2\u008e\u008f\7K\2\2\u008f\u009c\7F\2\2\u0090\u0091\7U\2\2\u0091"+
		"\u0092\7V\2\2\u0092\u0093\7T\2\2\u0093\u0094\7K\2\2\u0094\u0095\7P\2\2"+
		"\u0095\u009c\7I\2\2\u0096\u0097\7H\2\2\u0097\u0098\7N\2\2\u0098\u0099"+
		"\7Q\2\2\u0099\u009a\7C\2\2\u009a\u009c\7V\2\2\u009b>\3\2\2\2\u009bE\3"+
		"\2\2\2\u009bJ\3\2\2\2\u009bM\3\2\2\2\u009bU\3\2\2\2\u009bY\3\2\2\2\u009b"+
		"^\3\2\2\2\u009b`\3\2\2\2\u009bd\3\2\2\2\u009bi\3\2\2\2\u009bn\3\2\2\2"+
		"\u009bv\3\2\2\2\u009b~\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0089\3\2\2\2"+
		"\u009b\u008c\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u0096\3\2\2\2\u009c\16"+
		"\3\2\2\2\u009d\u009e\7<\2\2\u009e\u00a8\7?\2\2\u009f\u00a8\t\3\2\2\u00a0"+
		"\u00a1\7#\2\2\u00a1\u00a8\7?\2\2\u00a2\u00a8\t\4\2\2\u00a3\u00a4\7>\2"+
		"\2\u00a4\u00a8\7?\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a8\7?\2\2\u00a7\u009d"+
		"\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\20\3\2\2\2\13\2\24\32 (.9\u009b"+
		"\u00a7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}