// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/src\grammer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link grammerVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class grammerBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements grammerVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTokens(grammerParser.TokensContext ctx) { return visitChildren(ctx); }
}