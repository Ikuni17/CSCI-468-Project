/*
 * This file specifies the grammar of the language. To generate your parser, execute
 * ANTLR on this file. It will result in a number of files being produced, including
 * your Lexer. To run ANTLR on this file, run:
 *
 *   java -cp .:<location-of-antlr-jar> org.antlr.v4.Tool <this-g4-file>
 *
 */


/*
 * This is the name of your grammar. Be sure that this is the same name of this file.
 */
grammar Demo;


/* Non-Terminal rules are given with lowercase names. The rule name is to the left of
 * the ":" character, and the definition is to the right. Rules are terminated with
 * a ";" character. This is our entry point for our Lexer example. The "." operater
 * matches anything, and the "*" operator repeats a match 0 or more times (greedy).
 * The "EOF" token is an ANTLR builtin that matches the end of a file (or stream).
 */
tokens: .* EOF;


/*
 * We can define Terminal rules, called Tokens, with rule names that are declared in
 * all caps. The definitions are given in a syntax similar to that of regular
 * expressions. To match a string 'ab' (quotes not included) we could write:
 */
T1 : 'ab';


/*
 * Chains of rules are conjunctive (meaning they join or combine). This also defines
 * something similar to T1 (one char followed by another).
 */
T2 : 'c' 'd';


/*
 * Rules can also be disjunctive (meaning you can choose one or the other) using the
 * "|" operator. This example could match 2 different characters, 'x' or 'y'.
 */
T3 : 'x'
   | 'y'
   ;


/*
 * Characters can also be chosen from sets. A set of characters can be defined using
 * square brackets. This rule matches 'i' and 'j' chars.
 */
T4 : [ij];


/*
 * Ranges can also be used in sets by using the '-' operator. Note that the ranges
 * must be ordinal. The following matches upper case letters:
 */
T5 : [A-Z];


/*
 * The '+' operator is similar to '*', but gurantees at least one match. This will
 * match a string of '7's, with at least one '7' present.
 */
T6 : '7'+;


/*
 * If we do not want to keep a match, use the 'skip' function. This example ommits
 * all types of whitespaces.
 */
WS : [ \t\r\n]+ -> skip;



