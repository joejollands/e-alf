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
T24 : '[' ;
T25 : 'specification for' ;
T26 : ']' ;
T27 : 'variable' ;
T28 : 'class' ;
T29 : 'ownedAttribute' ;
T30 : ';' ;
T31 : 'nestedClassifier' ;
T32 : ',' ;
T33 : 'ownedOperation' ;
T34 : 'LiteralInteger' ;
T35 : 'value' ;
T36 : 'name' ;
T37 : 'LiteralString' ;
T38 : 'LiteralBoolean' ;
T39 : 'LiteralUnlimitedNatural' ;
T40 : 'LiteralNull' ;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5038
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5040
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5042
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5044
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5046
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5048
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g" 5050
RULE_ANY_OTHER : .;


