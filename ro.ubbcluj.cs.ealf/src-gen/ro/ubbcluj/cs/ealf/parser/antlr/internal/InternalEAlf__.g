lexer grammar InternalEAlf;
@header {
package ro.ubbcluj.cs.ealf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'package' ;
T12 : '{' ;
T13 : '}' ;
T14 : ':' ;
T15 : ';' ;
T16 : '(' ;
T17 : ')' ;
T18 : 'class' ;
T19 : 'ownedAttribute' ;
T20 : ',' ;
T21 : 'nestedClassifier' ;
T22 : 'ownedOperation' ;
T23 : 'Integer' ;
T24 : 'Boolean' ;
T25 : 'UnlimitedNatural' ;
T26 : 'LiteralInteger' ;
T27 : 'name' ;
T28 : 'value' ;
T29 : 'LiteralString' ;
T30 : 'LiteralBoolean' ;
T31 : 'LiteralUnlimitedNatural' ;
T32 : 'LiteralNull' ;
T33 : 'public' ;
T34 : 'private' ;
T35 : 'protected' ;
T36 : 'sequential' ;
T37 : 'guarded' ;
T38 : 'concurrent' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1597
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1599
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1601
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1603
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1605
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1607
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1609
RULE_ANY_OTHER : .;


