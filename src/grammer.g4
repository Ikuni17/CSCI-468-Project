grammar grammer;

IDENTIFIER: [A-Za-z]+ ;

INTLITERAL: '/d'+;

FLOATLITERAL: '/d'*.'/d'+ ;

STRINGLITERAL: '"'.*'"';

COMMENT: '--'.*'\n';

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
