lexer grammar InternalEAlf;
@header {
package ro.ubbcluj.cs.ealf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'packagedElement' ;
T12 : '{' ;
T13 : ',' ;
T14 : '}' ;
T15 : 'Package' ;
T16 : 'name' ;
T17 : 'visibility' ;
T18 : 'Property' ;
T19 : 'isStatic' ;
T20 : 'type' ;
T21 : 'Operation' ;
T22 : 'isAbstract' ;
T23 : 'concurrency' ;
T24 : 'Class' ;
T25 : 'isActive' ;
T26 : 'ownedAttribute' ;
T27 : 'nestedClassifier' ;
T28 : 'ownedOperation' ;
T29 : 'Integer' ;
T30 : 'Boolean' ;
T31 : 'UnlimitedNatural' ;
T32 : 'LiteralInteger' ;
T33 : 'value' ;
T34 : 'LiteralString' ;
T35 : 'LiteralBoolean' ;
T36 : 'LiteralUnlimitedNatural' ;
T37 : 'LiteralNull' ;
T38 : 'public' ;
T39 : 'private' ;
T40 : 'protected' ;
T41 : 'package' ;
T42 : 'sequential' ;
T43 : 'guarded' ;
T44 : 'concurrent' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1841
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1843
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1845
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1847
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1849
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1851
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g" 1853
RULE_ANY_OTHER : .;


