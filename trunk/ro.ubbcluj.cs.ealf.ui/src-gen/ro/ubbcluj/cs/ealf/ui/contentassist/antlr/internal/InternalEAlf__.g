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
T14 : '{' ;
T15 : '\tmodel' ;
T16 : '}' ;
T17 : 'package' ;
T18 : 'property' ;
T19 : ':' ;
T20 : 'operation' ;
T21 : '(' ;
T22 : ')' ;
T23 : 'activity' ;
T24 : 'for' ;
T25 : 'action' ;
T26 : 'class' ;
T27 : 'ownedAttribute' ;
T28 : ';' ;
T29 : 'nestedClassifier' ;
T30 : ',' ;
T31 : 'ownedOperation' ;
T32 : 'LiteralInteger' ;
T33 : 'value' ;
T34 : 'name' ;
T35 : 'LiteralString' ;
T36 : 'LiteralBoolean' ;
T37 : 'LiteralUnlimitedNatural' ;
T38 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4716
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4718
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4720
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4722
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4724
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4726
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 4728
RULE_ANY_OTHER : .;


