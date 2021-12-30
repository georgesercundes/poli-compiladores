grammar Obj;

//Sintaxe

start: dec* com* EOF;

dec : 'obj' VAR '=' '{' (atrib (',' atrib)*)* '}' ;

com : VAR '.' VAR '=' valor #ModificarInserirAtributo
    | 'print' '(' VAR ')' #PrintObj
    | 'print' '(' VAR '.' VAR ')'#PrintAtrib
    ;

atrib : VAR ':' valor  #CriarAtributo
//      | VAR '('  VAR (',' VAR )* ')' '{' 'return' valor '}' #FuncaoComArgumentos
//      | VAR '('  ')' '{' 'return' valor '}'#FuncaoSemArgumentos
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

SPACES : (' '  | '\n' | '\t' | '\r') -> skip;