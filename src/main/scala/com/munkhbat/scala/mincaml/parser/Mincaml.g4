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
    | left = exp op = ('*.' | '/.') right = exp                               #multiplyDivideExp
    | left = exp op = ('+' | '-' | '+.' | '-.') right = exp                   #plusMinusExp
    | left = exp op = ('=' | '<>' | '<' | '>' | '<=' | '>=') right = exp      #logicalExp
    | IF condition = exp THEN thenExp = exp ELSE elseExp = exp                #ifExp
    | '-.' exp                                                                #fNegExp
    | exp actual_args                                                         #applyExp
    | LET IDENT '=' exp IN exp                                                #letExp
    | LET REC fundef IN exp                                                   #letRecExp
    | exp ',' exp elems                                                       #tupleExp
    | LET '(' pat ')' '=' exp IN exp                                          #letTupleExp
    | simple_exp '.' '(' exp ')' '<-' exp                                     #putExp
    | exp ';' exp                                                             #seqExp
    | ARRAY_CREATE simple_exp simple_exp                                      #arrayCreateExp
;

fundef:
    | IDENT formal_args '=' exp
;

formal_args:
    | IDENT formal_args
    | IDENT
;

actual_args:
      actual_args simple_exp
    | simple_exp
    ;

elems:
    | ',' exp elems
    |
;

pat:
    | pat ',' IDENT
    | IDENT ',' IDENT
;

ARRAY_CREATE: 'Array.create';
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
