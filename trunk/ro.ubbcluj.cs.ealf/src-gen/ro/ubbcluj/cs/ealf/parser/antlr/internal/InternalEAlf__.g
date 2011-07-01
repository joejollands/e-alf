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
T21 : 'for' ;
T22 : 'action' ;
T23 : 'class' ;
T24 : 'ownedAttribute' ;
T25 : ';' ;
T26 : 'nestedClassifier' ;
T27 : ',' ;
T28 : 'ownedOperation' ;
T29 : 'Integer' ;
T30 : 'Boolean' ;
T31 : 'UnlimitedNatural' ;
T32 : 'LiteralInteger' ;
T33 : 'name' ;
T34 : 'value' ;
T35 : 'LiteralString' ;
T36 : 'LiteralBoolean' ;
T37 : 'LiteralUnlimitedNatural' ;
T38 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1642
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1644
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1646
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1648
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1650
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1652
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1654
RULE_ANY_OTHER : .;


