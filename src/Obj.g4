grammar Obj;

//Sintaxe

start: (dec com*)* (com dec*)*  EOF;

dec : 'obj' VAR '=' '{' (atrib (',' atrib)*)? '}' #DecObj
    | 'var' VAR '=' expr #DecVar
    ;

com : VAR '.' VAR '=' valor #ModificarInserirAtributo
    | VAR '=' expr #Atribuicao
    | 'print' '(' expr ')' #Print
    ;

atrib : VAR ':' valor  #CriarAtributo
      | VAR '(' (VAR (',' VAR )*)? ')' '{' bloco '}' #CriarFuncao
      ;

bloco : seq 'return' expr ;

seq : (dec com*)* (com dec*)* ;

expr : valor #Constante
     | VAR #Variavel
     | expr OP expr #Op
     | '(' expr ')' #Grupo
     | VAR '.' VAR  #Atributo
     | VAR '.' VAR '(' (expr (',' expr )*)? ')' #Funcao
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