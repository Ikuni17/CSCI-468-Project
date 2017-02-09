// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/Lexer/src\lexerGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lexerGrammarParser}.
 */
public interface lexerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(lexerGrammarParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(lexerGrammarParser.TokensContext ctx);
}