/*
Group 1: Will Cassella, Woody Melling, Bradley White
CSCI 468: Step 2, Parser
February 27, 2017
*/


import org.antlr.v4.runtime.*;


public class Lexer {
    public static void main(String[] args) throws Exception {
        try {
            // Read in the micro file from the command line arguments
            org.antlr.v4.runtime.ANTLRFileStream fileStream = new org.antlr.v4.runtime.ANTLRFileStream(args[0]);

            // Create a new lexer on the specified 'CharStream'
            lexerGrammarLexer lexer = new lexerGrammarLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Vocabulary vocab = lexer.getVocabulary();
            // Create a parser from the stream of tokens
            lexerGrammarParser parser = new lexerGrammarParser(tokens);
            // Remove the error listener to not interfere with the output stream
            parser.removeErrorListeners();
            // Parse from the beginning of the rules
            lexerGrammarParser.ProgramContext startContext = parser.program();

            // Get the amount of syntax errors from the input file and print the correct output
            int errors = parser.getNumberOfSyntaxErrors();
            if (errors > 0) {
                System.out.println("Not accepted");
            } else {
                System.out.println("Accepted");
            }

            // Print each token and its value, used for Step1
            /*org.antlr.v4.runtime.Token token = lexer.nextToken();
            while (token.getType() != org.antlr.v4.runtime.Token.EOF){

                System.out.printf("Token Type: %s%n", vocab.getSymbolicName(token.getType()));
                System.out.printf("Value: %s%n", token.getText());
                token = lexer.nextToken();
            }*/


        } catch (Exception e) {
            // General catch to handle any faulty lexing
            System.out.println("Lexing failed: " + e);
        }
    }
}