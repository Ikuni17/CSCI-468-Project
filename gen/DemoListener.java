// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/src\Demo.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(DemoParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(DemoParser.TokensContext ctx);
}