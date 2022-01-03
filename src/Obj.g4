grammar Obj;

//Sintaxe

start: (dec com*)* EOF;

dec : 'obj' VAR '=' '{' (atrib (',' atrib)*)? '}' #DecObj
    | 'var' VAR '=' expr #DecVar
    ;

com : VAR '.' VAR '=' valor #ModificarInserirAtributo
    | VAR '=' expr #Atribuicao
    | 'print' '(' expr ')' #Print
    | 'print' '(' VAR '.' VAR ')' #PrintAtrib
    ;

atrib : VAR ':' valor  #CriarAtributo
//      | VAR '(' (VAR (',' VAR )*)? ')' '{' dec* com* 'return' expr '}' #CriarFuncao
      ;

expr: valor #Constante
    | VAR #Variavel
    | expr OP expr #Op
    | '(' expr ')' #Grupo
    ;

valor : FALSE
      | TRUE
      | NUM
      | STRING
      ;

// Léxica

TRUE : 'true';
FALSE : 'false';
NUM : '-'?[0-9]+ ;
STRING : '"' (~["] | '\\"')* '"' ;
VAR : [a-zA-Z0-9]+ ;
OP : '+' | '-' | '*' | '/' | '==' | '!=' | '>' | '>=' | '<' | '<=' | '||' | '&&' ;

SPACES : (' '  | '\n' | '\t' | '\r') -> skip;