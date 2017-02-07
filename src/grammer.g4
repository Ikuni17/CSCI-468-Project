grammar grammer;

tokens: .*? EOF;

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

INTLITERAL: [0-9]+;

FLOATLITERAL: [0-9]*'.'[0-9]+ ;

STRINGLITERAL: '"'.*?'"';

COMMENT: '--'.*?'\n' -> skip;

KEYWORD: 'PROGRAM'
    |'BEGIN'
    |'END'
    |'FUNCTION'
    |'READ'
    |'WRITE'
    |'IF'
    |'ELSE'
    |'ENDIF'
    |'WHILE'
    |'ENDWHILE'
    |'CONTINUE'
    |'BREAK'
    |'RETURN'
    |'INT'
    |'VOID'
    |'STRING'
    |'FLOAT';

IDENTIFIER: [A-Za-z]+[0-9]* ;

OPERATOR:':='
    |'+'
    |'-'
    |'*'
    |'/'
    |'='
    |'!='
    |'<'
    |'>'
    |'('
    |')'
    |';'
    |','
    |'<='
    |'>='
    ;
