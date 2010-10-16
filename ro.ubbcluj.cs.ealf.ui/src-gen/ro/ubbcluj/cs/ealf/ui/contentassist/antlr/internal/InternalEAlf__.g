lexer grammar InternalEAlf;
@header {
package ro.ubbcluj.cs.ealf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Integer' ;
T12 : 'Boolean' ;
T13 : 'UnlimitedNatural' ;
T14 : 'public' ;
T15 : 'private' ;
T16 : 'protected' ;
T17 : 'package' ;
T18 : 'sequential' ;
T19 : 'guarded' ;
T20 : 'concurrent' ;
T21 : 'packagedElement' ;
T22 : '{' ;
T23 : '}' ;
T24 : ',' ;
T25 : 'Package' ;
T26 : 'name' ;
T27 : 'visibility' ;
T28 : 'Property' ;
T29 : 'isStatic' ;
T30 : 'type' ;
T31 : 'Operation' ;
T32 : 'isAbstract' ;
T33 : 'concurrency' ;
T34 : 'Class' ;
T35 : 'isActive' ;
T36 : 'ownedAttribute' ;
T37 : 'nestedClassifier' ;
T38 : 'ownedOperation' ;
T39 : 'LiteralInteger' ;
T40 : 'value' ;
T41 : 'LiteralString' ;
T42 : 'LiteralBoolean' ;
T43 : 'LiteralUnlimitedNatural' ;
T44 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5863
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5865
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5867
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5869
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5871
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5873
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5875
RULE_ANY_OTHER : .;


