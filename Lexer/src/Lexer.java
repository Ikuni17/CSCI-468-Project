/*
Group 1: Will Cassella, Woody Melling, Bradley White
CSCI 468: Step 2, Parser
February 27, 2017
*/


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Lexer {
    public static void main(String[] args) throws Exception {
        try
        {
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

            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener, parser.program());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            // General catch to handle any faulty lexing
            System.out.println("Lexing failed: " + e);
        }
    }
}