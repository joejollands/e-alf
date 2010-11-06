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
T21 : '{' ;
T22 : '}' ;
T23 : ':' ;
T24 : ';' ;
T25 : '(' ;
T26 : ')' ;
T27 : 'class' ;
T28 : 'ownedAttribute' ;
T29 : ',' ;
T30 : 'nestedClassifier' ;
T31 : 'ownedOperation' ;
T32 : 'LiteralInteger' ;
T33 : 'value' ;
T34 : 'name' ;
T35 : 'LiteralString' ;
T36 : 'LiteralBoolean' ;
T37 : 'LiteralUnlimitedNatural' ;
T38 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4252
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4254
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4256
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4258
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4260
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4262
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4264
RULE_ANY_OTHER : .;


