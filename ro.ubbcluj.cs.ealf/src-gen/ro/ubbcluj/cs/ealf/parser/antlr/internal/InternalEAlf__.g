lexer grammar InternalEAlf;
@header {
package ro.ubbcluj.cs.ealf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '{' ;
T12 : '\tmodel' ;
T13 : '}' ;
T14 : 'package' ;
T15 : 'property' ;
T16 : ':' ;
T17 : 'operation' ;
T18 : '(' ;
T19 : ')' ;
T20 : 'activity' ;
T21 : '[' ;
T22 : 'specification for' ;
T23 : ']' ;
T24 : 'variable' ;
T25 : 'class' ;
T26 : 'ownedAttribute' ;
T27 : ';' ;
T28 : 'nestedClassifier' ;
T29 : ',' ;
T30 : 'ownedOperation' ;
T31 : 'Integer' ;
T32 : 'Boolean' ;
T33 : 'UnlimitedNatural' ;
T34 : 'LiteralInteger' ;
T35 : 'name' ;
T36 : 'value' ;
T37 : 'LiteralString' ;
T38 : 'LiteralBoolean' ;
T39 : 'LiteralUnlimitedNatural' ;
T40 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1753
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1755
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1757
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1759
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1761
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1763
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1765
RULE_ANY_OTHER : .;


