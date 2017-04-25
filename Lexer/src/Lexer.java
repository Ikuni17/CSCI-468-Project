/*
Group 1: Will Cassella, Woody Melling, Bradley White
CSCI 468: Step 2, Parser
February 27, 2017
*/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class Lexer
{
    private static void output_ir(List<IRInstruction> instructions)
    {
        // Output ir preamble
        System.out.println(";IR code");
        System.out.println(";LABEL main");
        System.out.println(";LINK");

        // Output instructions
        for (IRInstruction instruction : instructions)
        {
            System.out.println(";" + instruction);
        }

        // Output post
        System.out.println(";RET");
        System.out.println(";tiny code");
    }

    public static void main(String[] args) throws Exception
    {
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

            output_ir(listener.ir_generator.instructions);
            TinyEmitter emitter = new TinyEmitter();
            String result = emitter.emit_code(listener.current_scope, listener.ir_generator.instructions);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}