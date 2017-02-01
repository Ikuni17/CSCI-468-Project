import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.antlr.v4.runtime.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        try {
            // The lexer takes in a 'CharStream' object, so we must
            // make one for our input stream. Note: You may want to
            // replace the 'System.in' with a file pointer to work
            // with the grading script.

            org.antlr.v4.runtime.CharStream stream = new org.antlr.v4.runtime.ANTLRInputStream("Asdf asdf");

            // Create a new lexer on the specified 'CharStream'
            DemoLexer lexer = new DemoLexer(stream);

            // Lexer types are enumerated, so we need to create a
            // 'Vocabulary' to lookup the symbol names from the
            // enumerated value. Note: The 'EOF' token has a value
            // of -1, and all other reules are enumerated from 0.
            Vocabulary vocab = lexer.getVocabulary();

            // A simple loop that prints out all token symbols and
            // their literal values. This is not quite set up as you
            // want for the grading script - you will need to change
            // the format a bit.
            org.antlr.v4.runtime.Token token = null;
            do {
                token = lexer.nextToken();
                System.out.println("\t" + vocab.getSymbolicName(token.getType()) +
                        "\t\t" + token.getText());
            } while (token.getType() != org.antlr.v4.runtime.Token.EOF);


        } catch (Exception e) {
            // General catch to handle any faulty lexing
            System.out.println("Lexing failed: " + e);
        }
    }
}