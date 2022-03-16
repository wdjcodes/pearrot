lexer grammar PearrotLexer;

//@header{
//    package dev.wdjcodes.pearrot;
//}

//Whitespace
//NEWLINE                 : '\r\n' | '\r' | '\n';
WS                      : [\t \r\n]+ -> skip;

//Keywords
INT                     : 'int';
CLASS                   : 'class';
RETURN                  : 'return';

//Literals
INTLIT                  : [0-9]+;
DECLIT                  : [0-9]+ '.' [0-9]*;


//Operators
PLUS                    : '+';
MINUS                   : '-';
ASTERISK                : '*';
DIVISION                : '/';
ASSIGN                  : '=';
LPAREN                  : '(';
RPAREN                  : ')';
LBRACE                  : '{';
RBRACE                  : '}';
SEMICOLON               : ';';

//Identifiers
ID                      : [_]*[a-zA-Z][a-zA-Z0-9_]*;