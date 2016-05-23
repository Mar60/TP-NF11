grammar Logo; 

@header {
  package logoparsing;
}

INT : '0' | [1-9][0-9]* ;
ID : [A-Za-z][A-Za-z0-9]* ;
SIGN : ('-'|'+') ;
WS : [ \t\r\n]+ -> skip ;
exp : exp ('*'|'/') exp #mult
    | exp ('+'|'-') exp #sum
    | ID (exp)*         #appelFonction
    | atom              #arule
    ;

atom : INT              #int
     | '(' exp ')'      #parent
     | 'hasard' exp     #hasard
     | 'loop'           #loop
     | ('-'|'+') INT    #sigInt
     | ':'ID            #variable
     ;

expbool : '!'expbool									 #logiqueNegation
        | expbool '&' expbool                            #logiqueEt
        | expbool '|' expbool                            #logiqueOu
        | '(' expbool ')'                                #logiqueParent
        | exp ('<' | '>' | '<='| '>=' | '!=' | '==') exp #boolOperation
        ;

/*
 Avec hasard placé en dessous de mult et sum, il a une priorité inférieure à ces derniers, donc :
    av hasard 200 + 100 = av hasard 300 car l'expression de la somme est évaluée en premier
    av 200 + hasard 100 -> dans tous les cas, l'expression 200 + hasard 100 est évaluée avant av (on récupère le resultat de hasard 100 que l'on somme avec 200)
 */


programme : methodes? liste_instructions
;

methodes :
  (pour)+
;

pour :
  'pour' ID (':'ID)* (liste_instructions)? (rends)? 'fin'
;
rends :
 'rends' exp
;

liste_instructions :
  (instruction)+   
;

instruction :
    'av' exp # av
  | 'td' exp # td
  | 'tg' exp # tg
  | 're' exp # re
  | 'fpos' '[' atom  atom ']' # fpos
  | 'lc' # lc
  | 'bc' # bc
  | 've' # ve
  | 'fcc' exp # fcc
  | 'repete' exp '[' liste_instructions ']' #repete
  | 'donne' '"'ID exp #donne
  | 'si' expbool '[' liste_instructions ']' ('[' liste_instructions ']')? #si
  | 'tantque' expbool '[' liste_instructions ']' #tantque
  | ID (exp)* #appelPour

;
   