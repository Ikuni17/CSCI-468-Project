/**
 * Created by Will on 3/26/2017.
 */
public class Listener extends lexerGrammarBaseListener
{
    public SymbolTable current_scope;

    public Listener()
    {
        current_scope = new SymbolTable(null, "GLOBAL");
    }

    @Override
    public void enterPgm_body(lexerGrammarParser.Pgm_bodyContext ctx)
    {

    }

    @Override
    public void exitPgm_body(lexerGrammarParser.Pgm_bodyContext ctx)
    {
        System.out.println(current_scope.toString());
    }
}
