/*
Group 1: Will Cassella, Woody Melling, Bradley White
CSCI 468: Step 1, Lexer
February 8, 2017
*/

import org.antlr.v4.runtime.*;

public class Lexer
{
    public static void main(String[] args) throws Exception
    {
        try {
            // Read in the micro file from the command line arguments
            org.antlr.v4.runtime.ANTLRFileStream fileStream = new org.antlr.v4.runtime.ANTLRFileStream(args[0]);

            // Create a new lexer on the specified 'CharStream'
            lexerGrammarLexer lexer = new lexerGrammarLexer(fileStream);

            // Lexer types are enumerated, so we need to create a
            // 'Vocabulary' to lookup the symbol names from the
            // enumerated value. Note: The 'EOF' token has a value
            // of -1, and all other reules are enumerated from 0.
            Vocabulary vocab = lexer.getVocabulary();

            // Print each token and its value
            org.antlr.v4.runtime.Token token = lexer.nextToken();
            while (token.getType() != org.antlr.v4.runtime.Token.EOF){
                System.out.printf("Token Type: %s%n", vocab.getSymbolicName(token.getType()));
                System.out.printf("Value: %s%n", token.getText());
                token = lexer.nextToken();
            }


        } catch (Exception e) {
            // General catch to handle any faulty lexing
            System.out.println("Lexing failed: " + e);
        }
    }
}