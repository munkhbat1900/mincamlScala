grammar Mincaml;

simple_exp:
      '(' exp ')'  #parenExp
    | '(' ')'      #emptyParenExp
    | BOOL         #boolExp
    | FLOAT        #floatExp
    | INT          #intExp
    | IDENT        #identExp
    | simple_exp '.' '(' exp ')'   #getExp
;
exp:
      simple_exp                                                              #simpleExp
    | 'not' exp                                                               #notExp
    | '-' exp                                                                 #negExp
    | exp actual_args                                                         #applyExp
    | left = exp op = ('*.' | '/.') right = exp                               #multiplyDivideExp
    | left = exp op = ('+' | '-' | '+.' | '-.') right = exp                   #plusMinusExp
    | left = exp op = ('=' | '<>' | '<' | '>' | '<=' | '>=') right = exp      #logicalExp
    | IF condition = exp THEN thenExp = exp ELSE elseExp = exp                #ifExp
    | '-.' exp                                                                #fNegExp
    | LET IDENT '=' exp IN exp                                                #letExp
    | LET REC fundef IN exp                                                   #letRecExp
    | exp elems                                                               #tupleExp
    | LET '(' IDENT pat ')' '=' exp IN exp                                    #letTupleExp
    | simple_exp '.' '(' exp ')' '<-' exp                                     #putExp
    | exp ';' exp                                                             #seqExp
    | ARRAY_CREATE simple_exp simple_exp                                      #arrayCreateExp
;

fundef:
    | IDENT formal_args '=' exp
;

formal_args: IDENT+
;

actual_args: simple_exp+
    ;

elems: (',' exp)+
;

pat: (',' IDENT)+
;

ARRAY_CREATE: 'Array.make';
IF: 'if';
THEN: 'then';
ELSE: 'else';
LET: 'let';
REC: 'rec';
IN: 'in';
BOOL: 'true' 'false';
FLOAT: [0-9]+'.'[0-9]*;
INT: [0-9]+;
COMMENT: '(*' .*? '*)' -> skip;
IDENT: [a-zA-Z0-9_]+;
WS: [ \t\r\n\u000C]+ -> skip;
