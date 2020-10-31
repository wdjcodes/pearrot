parser grammar PearrotParser;

//@header{
//    package dev.wdjcodes.pearrot;
//}

options { tokenVocab=PearrotLexer; }

//pearrotFile                 : lines=line+;
pearrotFile                 : pearrotClass;

//line                        : statement (NEWLINE | EOF);

pearrotClass                : CLASS name=ID LBRACE pearrotFunction RBRACE;

pearrotFunction             : type name=ID LPAREN RPAREN LBRACE statements+=statement+ RBRACE;

statement                   : (varDeclaration
                            | assignment) SEMICOLON;

varDeclaration              : type ID
                            | type assignment;

type                        : INT;

assignment                  : ID ASSIGN expression;

expression                  : left=expression operator=(DIVISION|ASTERISK) right=expression
                            | left=expression operator=(PLUS|MINUS) right=expression
                            | LPAREN expression RPAREN
                            | ID
                            | MINUS expression
                            | INTLIT
                            | DECLIT;
