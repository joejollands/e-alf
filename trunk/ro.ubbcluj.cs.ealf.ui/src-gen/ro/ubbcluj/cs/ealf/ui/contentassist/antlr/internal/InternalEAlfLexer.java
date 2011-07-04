package ro.ubbcluj.cs.ealf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEAlfLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=41;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalEAlfLexer() {;} 
    public InternalEAlfLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:10:5: ( 'Integer' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:10:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:11:5: ( 'Boolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:11:7: 'Boolean'
            {
            match("Boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:12:5: ( 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:12:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:13:5: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:13:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:14:5: ( '\\tmodel' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:14:7: '\\tmodel'
            {
            match("\tmodel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:15:5: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:15:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:16:5: ( 'package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:16:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:17:5: ( 'property' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:17:7: 'property'
            {
            match("property"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:18:5: ( ':' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:18:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:19:5: ( 'operation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:19:7: 'operation'
            {
            match("operation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:20:5: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:20:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:21:5: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:21:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:22:5: ( 'activity' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:22:7: 'activity'
            {
            match("activity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:23:5: ( '[' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:23:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:24:5: ( 'specification for' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:24:7: 'specification for'
            {
            match("specification for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:25:5: ( ']' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:25:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:26:5: ( 'variable' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:26:7: 'variable'
            {
            match("variable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:27:5: ( 'class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:27:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:28:5: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:28:7: 'ownedAttribute'
            {
            match("ownedAttribute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:29:5: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:29:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:30:5: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:30:7: 'nestedClassifier'
            {
            match("nestedClassifier"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:31:5: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:31:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:32:5: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:32:7: 'ownedOperation'
            {
            match("ownedOperation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:33:5: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:33:7: 'LiteralInteger'
            {
            match("LiteralInteger"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:34:5: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:34:7: 'value'
            {
            match("value"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:35:5: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:35:7: 'name'
            {
            match("name"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:36:5: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:36:7: 'LiteralString'
            {
            match("LiteralString"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:37:5: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:37:7: 'LiteralBoolean'
            {
            match("LiteralBoolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:38:5: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:38:7: 'LiteralUnlimitedNatural'
            {
            match("LiteralUnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:39:5: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:39:7: 'LiteralNull'
            {
            match("LiteralNull"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5038:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5038:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5038:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5038:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5038:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5040:10: ( ( '0' .. '9' )+ )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5040:12: ( '0' .. '9' )+
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5040:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5040:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5042:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5042:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5044:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5044:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5044:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5044:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:41: ( '\\r' )? '\\n'
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5046:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5048:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5048:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5048:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5050:16: ( . )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5050:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=37;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='I') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='B') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='U') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='\t') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0==':') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='a') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='[') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0==']') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='L') ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12 = mTokensHelper023();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper025();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper026();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper027();
        }
        else if ( (LA12_0=='\n'||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper028();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper029();
        }
        else {
            alt12 = mTokensHelper030();
        }
        switch (alt12) {
            case 1 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:147: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:159: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:175: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:191: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:199: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        int LA12_1 = input.LA(2);

        if ( (LA12_1=='n') ) {
            int LA12_30 = input.LA(3);

            if ( (LA12_30=='t') ) {
                int LA12_60 = input.LA(4);

                if ( (LA12_60=='e') ) {
                    int LA12_75 = input.LA(5);

                    if ( (LA12_75=='g') ) {
                        int LA12_90 = input.LA(6);

                        if ( (LA12_90=='e') ) {
                            int LA12_105 = input.LA(7);

                            if ( (LA12_105=='r') ) {
                                int LA12_120 = input.LA(8);

                                if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                                    return 31;
                                }
                                else {
                                    return 1;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper002() throws RecognitionException {
        int LA12_2 = input.LA(2);

        if ( (LA12_2=='o') ) {
            int LA12_32 = input.LA(3);

            if ( (LA12_32=='o') ) {
                int LA12_61 = input.LA(4);

                if ( (LA12_61=='l') ) {
                    int LA12_76 = input.LA(5);

                    if ( (LA12_76=='e') ) {
                        int LA12_91 = input.LA(6);

                        if ( (LA12_91=='a') ) {
                            int LA12_106 = input.LA(7);

                            if ( (LA12_106=='n') ) {
                                int LA12_121 = input.LA(8);

                                if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                    return 31;
                                }
                                else {
                                    return 2;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA12_3 = input.LA(2);

        if ( (LA12_3=='n') ) {
            int LA12_33 = input.LA(3);

            if ( (LA12_33=='l') ) {
                int LA12_62 = input.LA(4);

                if ( (LA12_62=='i') ) {
                    int LA12_77 = input.LA(5);

                    if ( (LA12_77=='m') ) {
                        int LA12_92 = input.LA(6);

                        if ( (LA12_92=='i') ) {
                            int LA12_107 = input.LA(7);

                            if ( (LA12_107=='t') ) {
                                int LA12_122 = input.LA(8);

                                if ( (LA12_122=='e') ) {
                                    int LA12_135 = input.LA(9);

                                    if ( (LA12_135=='d') ) {
                                        int LA12_150 = input.LA(10);

                                        if ( (LA12_150=='N') ) {
                                            int LA12_164 = input.LA(11);

                                            if ( (LA12_164=='a') ) {
                                                int LA12_175 = input.LA(12);

                                                if ( (LA12_175=='t') ) {
                                                    int LA12_185 = input.LA(13);

                                                    if ( (LA12_185=='u') ) {
                                                        int LA12_195 = input.LA(14);

                                                        if ( (LA12_195=='r') ) {
                                                            int LA12_204 = input.LA(15);

                                                            if ( (LA12_204=='a') ) {
                                                                int LA12_213 = input.LA(16);

                                                                if ( (LA12_213=='l') ) {
                                                                    int LA12_220 = input.LA(17);

                                                                    if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                                        return 31;
                                                                    }
                                                                    else {
                                                                        return 3;}
                                                                }
                                                                else {
                                                                    return 31;}
                                                            }
                                                            else {
                                                                return 31;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        int LA12_5 = input.LA(2);

        if ( (LA12_5=='m') ) {
            return 5;
        }
        else {
            return 36;}
    }

    private int mTokensHelper006() throws RecognitionException {
        return 6;
    }

    private int mTokensHelper007() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_38 = input.LA(3);

            if ( (LA12_38=='c') ) {
                int LA12_63 = input.LA(4);

                if ( (LA12_63=='k') ) {
                    int LA12_78 = input.LA(5);

                    if ( (LA12_78=='a') ) {
                        int LA12_93 = input.LA(6);

                        if ( (LA12_93=='g') ) {
                            int LA12_108 = input.LA(7);

                            if ( (LA12_108=='e') ) {
                                int LA12_123 = input.LA(8);

                                if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                                    return 31;
                                }
                                else {
                                    return 7;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        case 'r':
            {
            int LA12_39 = input.LA(3);

            if ( (LA12_39=='o') ) {
                int LA12_64 = input.LA(4);

                if ( (LA12_64=='p') ) {
                    int LA12_79 = input.LA(5);

                    if ( (LA12_79=='e') ) {
                        int LA12_94 = input.LA(6);

                        if ( (LA12_94=='r') ) {
                            int LA12_109 = input.LA(7);

                            if ( (LA12_109=='t') ) {
                                int LA12_124 = input.LA(8);

                                if ( (LA12_124=='y') ) {
                                    int LA12_137 = input.LA(9);

                                    if ( ((LA12_137>='0' && LA12_137<='9')||(LA12_137>='A' && LA12_137<='Z')||LA12_137=='_'||(LA12_137>='a' && LA12_137<='z')) ) {
                                        return 31;
                                    }
                                    else {
                                        return 8;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        default:
            return 31;}

    }

    private int mTokensHelper008() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper009() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'w':
            {
            int LA12_41 = input.LA(3);

            if ( (LA12_41=='n') ) {
                int LA12_65 = input.LA(4);

                if ( (LA12_65=='e') ) {
                    int LA12_80 = input.LA(5);

                    if ( (LA12_80=='d') ) {
                        switch ( input.LA(6) ) {
                        case 'O':
                            {
                            int LA12_110 = input.LA(7);

                            if ( (LA12_110=='p') ) {
                                int LA12_125 = input.LA(8);

                                if ( (LA12_125=='e') ) {
                                    int LA12_138 = input.LA(9);

                                    if ( (LA12_138=='r') ) {
                                        int LA12_152 = input.LA(10);

                                        if ( (LA12_152=='a') ) {
                                            int LA12_165 = input.LA(11);

                                            if ( (LA12_165=='t') ) {
                                                int LA12_176 = input.LA(12);

                                                if ( (LA12_176=='i') ) {
                                                    int LA12_186 = input.LA(13);

                                                    if ( (LA12_186=='o') ) {
                                                        int LA12_196 = input.LA(14);

                                                        if ( (LA12_196=='n') ) {
                                                            int LA12_205 = input.LA(15);

                                                            if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                                                return 31;
                                                            }
                                                            else {
                                                                return 23;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                            }
                        case 'A':
                            {
                            int LA12_111 = input.LA(7);

                            if ( (LA12_111=='t') ) {
                                int LA12_126 = input.LA(8);

                                if ( (LA12_126=='t') ) {
                                    int LA12_139 = input.LA(9);

                                    if ( (LA12_139=='r') ) {
                                        int LA12_153 = input.LA(10);

                                        if ( (LA12_153=='i') ) {
                                            int LA12_166 = input.LA(11);

                                            if ( (LA12_166=='b') ) {
                                                int LA12_177 = input.LA(12);

                                                if ( (LA12_177=='u') ) {
                                                    int LA12_187 = input.LA(13);

                                                    if ( (LA12_187=='t') ) {
                                                        int LA12_197 = input.LA(14);

                                                        if ( (LA12_197=='e') ) {
                                                            int LA12_206 = input.LA(15);

                                                            if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                                                return 31;
                                                            }
                                                            else {
                                                                return 19;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                            }
                        default:
                            return 31;}

                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        case 'p':
            {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='e') ) {
                int LA12_66 = input.LA(4);

                if ( (LA12_66=='r') ) {
                    int LA12_81 = input.LA(5);

                    if ( (LA12_81=='a') ) {
                        int LA12_96 = input.LA(6);

                        if ( (LA12_96=='t') ) {
                            int LA12_112 = input.LA(7);

                            if ( (LA12_112=='i') ) {
                                int LA12_127 = input.LA(8);

                                if ( (LA12_127=='o') ) {
                                    int LA12_140 = input.LA(9);

                                    if ( (LA12_140=='n') ) {
                                        int LA12_154 = input.LA(10);

                                        if ( ((LA12_154>='0' && LA12_154<='9')||(LA12_154>='A' && LA12_154<='Z')||LA12_154=='_'||(LA12_154>='a' && LA12_154<='z')) ) {
                                            return 31;
                                        }
                                        else {
                                            return 10;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        default:
            return 31;}

    }

    private int mTokensHelper010() throws RecognitionException {
        return 11;
    }

    private int mTokensHelper011() throws RecognitionException {
        return 12;
    }

    private int mTokensHelper012() throws RecognitionException {
        int LA12_12 = input.LA(2);

        if ( (LA12_12=='c') ) {
            int LA12_45 = input.LA(3);

            if ( (LA12_45=='t') ) {
                int LA12_67 = input.LA(4);

                if ( (LA12_67=='i') ) {
                    int LA12_82 = input.LA(5);

                    if ( (LA12_82=='v') ) {
                        int LA12_97 = input.LA(6);

                        if ( (LA12_97=='i') ) {
                            int LA12_113 = input.LA(7);

                            if ( (LA12_113=='t') ) {
                                int LA12_128 = input.LA(8);

                                if ( (LA12_128=='y') ) {
                                    int LA12_141 = input.LA(9);

                                    if ( ((LA12_141>='0' && LA12_141<='9')||(LA12_141>='A' && LA12_141<='Z')||LA12_141=='_'||(LA12_141>='a' && LA12_141<='z')) ) {
                                        return 31;
                                    }
                                    else {
                                        return 13;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper013() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper014() throws RecognitionException {
        int LA12_14 = input.LA(2);

        if ( (LA12_14=='p') ) {
            int LA12_47 = input.LA(3);

            if ( (LA12_47=='e') ) {
                int LA12_68 = input.LA(4);

                if ( (LA12_68=='c') ) {
                    int LA12_83 = input.LA(5);

                    if ( (LA12_83=='i') ) {
                        int LA12_98 = input.LA(6);

                        if ( (LA12_98=='f') ) {
                            int LA12_114 = input.LA(7);

                            if ( (LA12_114=='i') ) {
                                int LA12_129 = input.LA(8);

                                if ( (LA12_129=='c') ) {
                                    int LA12_142 = input.LA(9);

                                    if ( (LA12_142=='a') ) {
                                        int LA12_156 = input.LA(10);

                                        if ( (LA12_156=='t') ) {
                                            int LA12_168 = input.LA(11);

                                            if ( (LA12_168=='i') ) {
                                                int LA12_178 = input.LA(12);

                                                if ( (LA12_178=='o') ) {
                                                    int LA12_188 = input.LA(13);

                                                    if ( (LA12_188=='n') ) {
                                                        int LA12_198 = input.LA(14);

                                                        if ( (LA12_198==' ') ) {
                                                            return 15;
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper015() throws RecognitionException {
        return 16;
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA12_16 = input.LA(2);

        if ( (LA12_16=='a') ) {
            switch ( input.LA(3) ) {
            case 'r':
                {
                int LA12_69 = input.LA(4);

                if ( (LA12_69=='i') ) {
                    int LA12_84 = input.LA(5);

                    if ( (LA12_84=='a') ) {
                        int LA12_99 = input.LA(6);

                        if ( (LA12_99=='b') ) {
                            int LA12_115 = input.LA(7);

                            if ( (LA12_115=='l') ) {
                                int LA12_130 = input.LA(8);

                                if ( (LA12_130=='e') ) {
                                    int LA12_143 = input.LA(9);

                                    if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                        return 31;
                                    }
                                    else {
                                        return 17;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
                }
            case 'l':
                {
                int LA12_70 = input.LA(4);

                if ( (LA12_70=='u') ) {
                    int LA12_85 = input.LA(5);

                    if ( (LA12_85=='e') ) {
                        int LA12_100 = input.LA(6);

                        if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                            return 31;
                        }
                        else {
                            return 25;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
                }
            default:
                return 31;}

        }
        else {
            return 31;}
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='l') ) {
            int LA12_50 = input.LA(3);

            if ( (LA12_50=='a') ) {
                int LA12_71 = input.LA(4);

                if ( (LA12_71=='s') ) {
                    int LA12_86 = input.LA(5);

                    if ( (LA12_86=='s') ) {
                        int LA12_101 = input.LA(6);

                        if ( ((LA12_101>='0' && LA12_101<='9')||(LA12_101>='A' && LA12_101<='Z')||LA12_101=='_'||(LA12_101>='a' && LA12_101<='z')) ) {
                            return 31;
                        }
                        else {
                            return 18;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper018() throws RecognitionException {
        return 20;
    }

    private int mTokensHelper019() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_52 = input.LA(3);

            if ( (LA12_52=='s') ) {
                int LA12_72 = input.LA(4);

                if ( (LA12_72=='t') ) {
                    int LA12_87 = input.LA(5);

                    if ( (LA12_87=='e') ) {
                        int LA12_102 = input.LA(6);

                        if ( (LA12_102=='d') ) {
                            int LA12_118 = input.LA(7);

                            if ( (LA12_118=='C') ) {
                                int LA12_131 = input.LA(8);

                                if ( (LA12_131=='l') ) {
                                    int LA12_144 = input.LA(9);

                                    if ( (LA12_144=='a') ) {
                                        int LA12_158 = input.LA(10);

                                        if ( (LA12_158=='s') ) {
                                            int LA12_169 = input.LA(11);

                                            if ( (LA12_169=='s') ) {
                                                int LA12_179 = input.LA(12);

                                                if ( (LA12_179=='i') ) {
                                                    int LA12_189 = input.LA(13);

                                                    if ( (LA12_189=='f') ) {
                                                        int LA12_199 = input.LA(14);

                                                        if ( (LA12_199=='i') ) {
                                                            int LA12_208 = input.LA(15);

                                                            if ( (LA12_208=='e') ) {
                                                                int LA12_216 = input.LA(16);

                                                                if ( (LA12_216=='r') ) {
                                                                    int LA12_221 = input.LA(17);

                                                                    if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                                                        return 31;
                                                                    }
                                                                    else {
                                                                        return 21;}
                                                                }
                                                                else {
                                                                    return 31;}
                                                            }
                                                            else {
                                                                return 31;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                }
                                else {
                                    return 31;}
                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        case 'a':
            {
            int LA12_53 = input.LA(3);

            if ( (LA12_53=='m') ) {
                int LA12_73 = input.LA(4);

                if ( (LA12_73=='e') ) {
                    int LA12_88 = input.LA(5);

                    if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                        return 31;
                    }
                    else {
                        return 26;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
            }
        default:
            return 31;}

    }

    private int mTokensHelper020() throws RecognitionException {
        return 22;
    }

    private int mTokensHelper021() throws RecognitionException {
        int LA12_21 = input.LA(2);

        if ( (LA12_21=='i') ) {
            int LA12_55 = input.LA(3);

            if ( (LA12_55=='t') ) {
                int LA12_74 = input.LA(4);

                if ( (LA12_74=='e') ) {
                    int LA12_89 = input.LA(5);

                    if ( (LA12_89=='r') ) {
                        int LA12_104 = input.LA(6);

                        if ( (LA12_104=='a') ) {
                            int LA12_119 = input.LA(7);

                            if ( (LA12_119=='l') ) {
                                switch ( input.LA(8) ) {
                                case 'B':
                                    {
                                    int LA12_145 = input.LA(9);

                                    if ( (LA12_145=='o') ) {
                                        int LA12_159 = input.LA(10);

                                        if ( (LA12_159=='o') ) {
                                            int LA12_170 = input.LA(11);

                                            if ( (LA12_170=='l') ) {
                                                int LA12_180 = input.LA(12);

                                                if ( (LA12_180=='e') ) {
                                                    int LA12_190 = input.LA(13);

                                                    if ( (LA12_190=='a') ) {
                                                        int LA12_200 = input.LA(14);

                                                        if ( (LA12_200=='n') ) {
                                                            int LA12_209 = input.LA(15);

                                                            if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                                                return 31;
                                                            }
                                                            else {
                                                                return 28;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                    }
                                case 'I':
                                    {
                                    int LA12_146 = input.LA(9);

                                    if ( (LA12_146=='n') ) {
                                        int LA12_160 = input.LA(10);

                                        if ( (LA12_160=='t') ) {
                                            int LA12_171 = input.LA(11);

                                            if ( (LA12_171=='e') ) {
                                                int LA12_181 = input.LA(12);

                                                if ( (LA12_181=='g') ) {
                                                    int LA12_191 = input.LA(13);

                                                    if ( (LA12_191=='e') ) {
                                                        int LA12_201 = input.LA(14);

                                                        if ( (LA12_201=='r') ) {
                                                            int LA12_210 = input.LA(15);

                                                            if ( ((LA12_210>='0' && LA12_210<='9')||(LA12_210>='A' && LA12_210<='Z')||LA12_210=='_'||(LA12_210>='a' && LA12_210<='z')) ) {
                                                                return 31;
                                                            }
                                                            else {
                                                                return 24;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                    }
                                case 'S':
                                    {
                                    int LA12_147 = input.LA(9);

                                    if ( (LA12_147=='t') ) {
                                        int LA12_161 = input.LA(10);

                                        if ( (LA12_161=='r') ) {
                                            int LA12_172 = input.LA(11);

                                            if ( (LA12_172=='i') ) {
                                                int LA12_182 = input.LA(12);

                                                if ( (LA12_182=='n') ) {
                                                    int LA12_192 = input.LA(13);

                                                    if ( (LA12_192=='g') ) {
                                                        int LA12_202 = input.LA(14);

                                                        if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                                            return 31;
                                                        }
                                                        else {
                                                            return 27;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                    }
                                case 'U':
                                    {
                                    int LA12_148 = input.LA(9);

                                    if ( (LA12_148=='n') ) {
                                        int LA12_162 = input.LA(10);

                                        if ( (LA12_162=='l') ) {
                                            int LA12_173 = input.LA(11);

                                            if ( (LA12_173=='i') ) {
                                                int LA12_183 = input.LA(12);

                                                if ( (LA12_183=='m') ) {
                                                    int LA12_193 = input.LA(13);

                                                    if ( (LA12_193=='i') ) {
                                                        int LA12_203 = input.LA(14);

                                                        if ( (LA12_203=='t') ) {
                                                            int LA12_212 = input.LA(15);

                                                            if ( (LA12_212=='e') ) {
                                                                int LA12_219 = input.LA(16);

                                                                if ( (LA12_219=='d') ) {
                                                                    int LA12_222 = input.LA(17);

                                                                    if ( (LA12_222=='N') ) {
                                                                        int LA12_225 = input.LA(18);

                                                                        if ( (LA12_225=='a') ) {
                                                                            int LA12_226 = input.LA(19);

                                                                            if ( (LA12_226=='t') ) {
                                                                                int LA12_227 = input.LA(20);

                                                                                if ( (LA12_227=='u') ) {
                                                                                    int LA12_228 = input.LA(21);

                                                                                    if ( (LA12_228=='r') ) {
                                                                                        int LA12_229 = input.LA(22);

                                                                                        if ( (LA12_229=='a') ) {
                                                                                            int LA12_230 = input.LA(23);

                                                                                            if ( (LA12_230=='l') ) {
                                                                                                int LA12_231 = input.LA(24);

                                                                                                if ( ((LA12_231>='0' && LA12_231<='9')||(LA12_231>='A' && LA12_231<='Z')||LA12_231=='_'||(LA12_231>='a' && LA12_231<='z')) ) {
                                                                                                    return 31;
                                                                                                }
                                                                                                else {
                                                                                                    return 29;}
                                                                                            }
                                                                                            else {
                                                                                                return 31;}
                                                                                        }
                                                                                        else {
                                                                                            return 31;}
                                                                                    }
                                                                                    else {
                                                                                        return 31;}
                                                                                }
                                                                                else {
                                                                                    return 31;}
                                                                            }
                                                                            else {
                                                                                return 31;}
                                                                        }
                                                                        else {
                                                                            return 31;}
                                                                    }
                                                                    else {
                                                                        return 31;}
                                                                }
                                                                else {
                                                                    return 31;}
                                                            }
                                                            else {
                                                                return 31;}
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 31;}
                                                }
                                                else {
                                                    return 31;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                    }
                                case 'N':
                                    {
                                    int LA12_149 = input.LA(9);

                                    if ( (LA12_149=='u') ) {
                                        int LA12_163 = input.LA(10);

                                        if ( (LA12_163=='l') ) {
                                            int LA12_174 = input.LA(11);

                                            if ( (LA12_174=='l') ) {
                                                int LA12_184 = input.LA(12);

                                                if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                                                    return 31;
                                                }
                                                else {
                                                    return 30;}
                                            }
                                            else {
                                                return 31;}
                                        }
                                        else {
                                            return 31;}
                                    }
                                    else {
                                        return 31;}
                                    }
                                default:
                                    return 31;}

                            }
                            else {
                                return 31;}
                        }
                        else {
                            return 31;}
                    }
                    else {
                        return 31;}
                }
                else {
                    return 31;}
            }
            else {
                return 31;}
        }
        else {
            return 31;}
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA12_22 = input.LA(2);

        if ( ((LA12_22>='A' && LA12_22<='Z')||LA12_22=='_'||(LA12_22>='a' && LA12_22<='z')) ) {
            return 31;
        }
        else {
            return 37;}
    }

    private int mTokensHelper023() throws RecognitionException {
        return 31;
    }

    private int mTokensHelper024() throws RecognitionException {
        return 32;
    }

    private int mTokensHelper025() throws RecognitionException {
        int LA12_25 = input.LA(2);

        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
            return 33;
        }
        else {
            return 37;}
    }

    private int mTokensHelper026() throws RecognitionException {
        int LA12_26 = input.LA(2);

        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
            return 33;
        }
        else {
            return 37;}
    }

    private int mTokensHelper027() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 35;
            }
        case '*':
            {
            return 34;
            }
        default:
            return 37;}

    }

    private int mTokensHelper028() throws RecognitionException {
        return 36;
    }

    private int mTokensHelper029() throws RecognitionException {
        return 37;
    }

    private int mTokensHelper030() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}