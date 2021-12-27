grammar Obj;

//Sintaxe

start: dec* EOF;

dec : 'obj' VAR '=' '{' atrib* '}' #CriaObj ;

atrib : (',')? VAR ':' valor  #Atributo
      | (',')? VAR '(' ((',')? VAR )* ')' '{' 'return' valor '}' #Funcao
      ;

valor : FALSE #False
      | TRUE #True
      | NUM #Num
      | STRING #String
      ;


// Léxica

TRUE : 'true';
FALSE : 'false';
VAR : [a-zA-Z]+ ;
NUM : '-'?[0-9]+ ;
STRING : '"' (~["] | '\\"')* '"' ;

SPACES : (' '  | '\n' | '\t' | '\r') -> skip;