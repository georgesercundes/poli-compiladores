grammar Obj;

//Sintaxe

start: (obj | print)* EOF;

obj : 'obj' VAR '=' '{' (atrib (',' atrib)*)? '}' #DecObj
    | VAR '.' VAR '=' valor #ModificaCriaAtributo
    | VAR '.' VAR '=' 'function' '(' (VAR (',' VAR )*)? ')' '{' bloco '}' #ModificaCriaFuncao
    | funcao #ChamarFuncao
    ;

decVar : 'var' VAR '=' expr ;

print : 'print' '(' expr ')' ;

com : VAR '=' expr #AtribVariavel
    | 'while' '(' expr ')' '{' seq '}' #While
    | 'if' '(' expr ')' '{' seq '}' ('else' '{' seq '}')? #If
    ;

atrib : VAR ':' valor  #CriarAtributo
      | VAR '(' (VAR (',' VAR )*)? ')' '{' bloco '}' #CriarFuncao
      ;

bloco : seq ('return' expr)? ;

seq : (decVar | com | print)*;

expr : valor #Constante
     | VAR #Variavel
     | expr OP expr #Op
     | '(' expr ')' #Grupo
     | VAR '.' VAR  #Atributo
     | funcao #ValorFuncao
     ;

funcao: VAR '.' VAR '(' (expr (',' expr )*)? ')';

valor : FALSE
      | TRUE
      | NUM
      | STRING
      | DOUBLE
      ;

// Léxica

TRUE : 'true';
FALSE : 'false';
NUM : '-'?[0-9]+ ;
DOUBLE : '-'?[0-9]+ '.' [0-9]+ ;
STRING : '"' (~["] | '\\"')* '"' ;
VAR : [a-zA-Z0-9]+ ;
OP : '+' | '-' | '*' | '/' | '==' | '!=' | '>' | '>=' | '<' | '<=' | '||' | '&&' ;

SPACES : (' '  | '\n' | '\t' | '\r') -> skip;