grammar grammer;

tokens: .*? EOF;

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

INTLITERAL: [0-9]+;

FLOATLITERAL: '/d'*.'/d'+ ;

STRINGLITERAL: '"'.*?'"';

COMMENT: '--'.*?'\n';

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

IDENTIFIER: [A-Za-z]+ ;

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
