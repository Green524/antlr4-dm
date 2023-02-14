grammar Calc;

prog : (func NEWLINE) (expr NEWLINE)+ (print NEWLINE)? (KeywordReturn stat)? ;

func : 'def' ID Colon ;

expr
    : KeywordAT ID Equals INT
    | KeywordAT ID Equals stat
    ;
stat
    : ID BinOpPlus ID
    | ID
    ;
print
    : KeywordPrint '(' ID ')'
    ;

KeywordDefFunc : 'def';
KeywordAT : '@' ;
KeywordReturn : 'return' ;
KeywordPrint : 'print' ;

BinOpPlus : '+';
Equals : '=' ;

Colon : ':' ;

INT : [0-9]+ ;
ID : [a-zA-Z]+ ;

NEWLINE : [\r\n]+ | [\n]+ ;

Whitespace : [ \t\r\n]+ -> channel(HIDDEN);
