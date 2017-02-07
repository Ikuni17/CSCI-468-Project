// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/src\grammer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammerParser}.
 */
public interface grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammerParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(grammerParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(grammerParser.TokensContext ctx);
}