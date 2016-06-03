grammar PreLogo; 

@header {
  package prelogoparsing;
}

INT : '0' | [1-9][0-9]* ;
ID : [a-z] + ;
WS : [ \t\r\n]+ -> skip ;

prestat : 
   impt +
   commande +
;  
impt :
    'import' ID
;
facteur :
    'nb = ' INT
;
commande :
    ID '(' INT INT ('#'INT)? ')' facteur?
;