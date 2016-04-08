grammar Logo; 

@header {
  package logoparsing;
}

INT : '0' | [1-9][0-9]* ;
SIGN : ('-'|'+') ;
WS : [ \t\r\n]+ -> skip ;
exp : exp ('*'|'/') exp #mult
    | exp ('+'|'-') exp #sum
    | atom              #arule
    ;

atom : INT          #int
     | '(' exp ')'  #parent
     | 'hasard' exp # hasard
     ;
     /*
     Avec hasard placé en dessous de mult et sum, il a une priorité inférieure à ces derniers, donc :
     av hasard 200 + 100 = av hasard 300 car l'expression de la somme est évaluée en premier
     av 200 + hasard 100 -> dans tous les cas, l'expression 200 + hasard 100 est évaluée avant av
     */

programme : liste_instructions 
;
liste_instructions :
  (instruction)+   
;
instruction :
    'av' exp # av
  | 'td' exp # td
  | 'tg' exp # tg
  | 're' exp # re
  | 'fpos' '[' SIGN INT  SIGN INT ']' # fpos
  | 'lc' # lc
  | 'bc' # bc
  | 've' # ve
  | 'fcc' INT # fcc
  | 'repete' exp '[' liste_instructions ']' #repete
;  
   