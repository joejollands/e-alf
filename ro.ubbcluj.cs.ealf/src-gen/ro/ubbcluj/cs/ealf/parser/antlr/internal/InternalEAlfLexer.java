package ro.ubbcluj.cs.ealf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int Tokens=39;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
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
    public String getGrammarFileName() { return "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:10:5: ( 'package' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:10:7: 'package'
            {
            match("package"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:11:5: ( '{' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:11:7: '{'
            {
            match('{'); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:12:5: ( '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:12:7: '}'
            {
            match('}'); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:13:5: ( ':' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:13:7: ':'
            {
            match(':'); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:14:5: ( ';' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:14:7: ';'
            {
            match(';'); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:15:5: ( '(' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:15:7: '('
            {
            match('('); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:16:5: ( ')' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:16:7: ')'
            {
            match(')'); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:17:5: ( 'class' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:17:7: 'class'
            {
            match("class"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:18:5: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:18:7: 'ownedAttribute'
            {
            match("ownedAttribute"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:19:5: ( ',' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:19:7: ','
            {
            match(','); 

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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:20:5: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:20:7: 'nestedClassifier'
            {
            match("nestedClassifier"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:21:5: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:21:7: 'ownedOperation'
            {
            match("ownedOperation"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:22:5: ( 'Integer' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:22:7: 'Integer'
            {
            match("Integer"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:23:5: ( 'Boolean' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:23:7: 'Boolean'
            {
            match("Boolean"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:24:5: ( 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:24:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:25:5: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:25:7: 'LiteralInteger'
            {
            match("LiteralInteger"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:26:5: ( 'name' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:26:7: 'name'
            {
            match("name"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:27:5: ( 'value' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:27:7: 'value'
            {
            match("value"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:28:5: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:28:7: 'LiteralString'
            {
            match("LiteralString"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:29:5: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:29:7: 'LiteralBoolean'
            {
            match("LiteralBoolean"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:30:5: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:30:7: 'LiteralUnlimitedNatural'
            {
            match("LiteralUnlimitedNatural"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:31:5: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:31:7: 'LiteralNull'
            {
            match("LiteralNull"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:32:5: ( 'public' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:32:7: 'public'
            {
            match("public"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:33:5: ( 'private' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:33:7: 'private'
            {
            match("private"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:34:5: ( 'protected' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:34:7: 'protected'
            {
            match("protected"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:35:5: ( 'sequential' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:35:7: 'sequential'
            {
            match("sequential"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:36:5: ( 'guarded' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:36:7: 'guarded'
            {
            match("guarded"); 


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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:37:5: ( 'concurrent' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:37:7: 'concurrent'
            {
            match("concurrent"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1597:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1597:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1597:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1597:11: '^'
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1597:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1599:10: ( ( '0' .. '9' )+ )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1599:12: ( '0' .. '9' )+
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1599:12: ( '0' .. '9' )+
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
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1599:13: '0' .. '9'
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1601:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1603:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1603:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1603:24: ( options {greedy=false; } : . )*
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
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1603:52: .
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:41: ( '\\r' )? '\\n'
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1605:41: '\\r'
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1607:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1607:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1607:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:
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
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1609:16: ( . )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1609:18: .
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
        // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0==':') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0==';') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='(') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0==')') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='I') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='B') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='U') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='L') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='g') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='d' && LA12_0<='f')||(LA12_0>='h' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12 = mTokensHelper020();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper021();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper024();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper025();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper026();
        }
        else {
            alt12 = mTokensHelper027();
        }
        switch (alt12) {
            case 1 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:122: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:130: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:139: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:151: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:167: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:183: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1:191: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'u':
            {
            int LA12_27 = input.LA(3);

            if ( (LA12_27=='b') ) {
                int LA12_55 = input.LA(4);

                if ( (LA12_55=='l') ) {
                    int LA12_71 = input.LA(5);

                    if ( (LA12_71=='i') ) {
                        int LA12_87 = input.LA(6);

                        if ( (LA12_87=='c') ) {
                            int LA12_103 = input.LA(7);

                            if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                                return 29;
                            }
                            else {
                                return 23;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        case 'a':
            {
            int LA12_28 = input.LA(3);

            if ( (LA12_28=='c') ) {
                int LA12_56 = input.LA(4);

                if ( (LA12_56=='k') ) {
                    int LA12_72 = input.LA(5);

                    if ( (LA12_72=='a') ) {
                        int LA12_88 = input.LA(6);

                        if ( (LA12_88=='g') ) {
                            int LA12_104 = input.LA(7);

                            if ( (LA12_104=='e') ) {
                                int LA12_120 = input.LA(8);

                                if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                                    return 29;
                                }
                                else {
                                    return 1;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        case 'r':
            {
            switch ( input.LA(3) ) {
            case 'o':
                {
                int LA12_57 = input.LA(4);

                if ( (LA12_57=='t') ) {
                    int LA12_73 = input.LA(5);

                    if ( (LA12_73=='e') ) {
                        int LA12_89 = input.LA(6);

                        if ( (LA12_89=='c') ) {
                            int LA12_105 = input.LA(7);

                            if ( (LA12_105=='t') ) {
                                int LA12_121 = input.LA(8);

                                if ( (LA12_121=='e') ) {
                                    int LA12_134 = input.LA(9);

                                    if ( (LA12_134=='d') ) {
                                        int LA12_150 = input.LA(10);

                                        if ( ((LA12_150>='0' && LA12_150<='9')||(LA12_150>='A' && LA12_150<='Z')||LA12_150=='_'||(LA12_150>='a' && LA12_150<='z')) ) {
                                            return 29;
                                        }
                                        else {
                                            return 25;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
                }
            case 'i':
                {
                int LA12_58 = input.LA(4);

                if ( (LA12_58=='v') ) {
                    int LA12_74 = input.LA(5);

                    if ( (LA12_74=='a') ) {
                        int LA12_90 = input.LA(6);

                        if ( (LA12_90=='t') ) {
                            int LA12_106 = input.LA(7);

                            if ( (LA12_106=='e') ) {
                                int LA12_122 = input.LA(8);

                                if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                                    return 29;
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
                }
            default:
                return 29;}

            }
        default:
            return 29;}

    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        return 3;
    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        return 6;
    }

    private int mTokensHelper007() throws RecognitionException {
        return 7;
    }

    private int mTokensHelper008() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA12_37 = input.LA(3);

            if ( (LA12_37=='n') ) {
                int LA12_59 = input.LA(4);

                if ( (LA12_59=='c') ) {
                    int LA12_75 = input.LA(5);

                    if ( (LA12_75=='u') ) {
                        int LA12_91 = input.LA(6);

                        if ( (LA12_91=='r') ) {
                            int LA12_107 = input.LA(7);

                            if ( (LA12_107=='r') ) {
                                int LA12_123 = input.LA(8);

                                if ( (LA12_123=='e') ) {
                                    int LA12_136 = input.LA(9);

                                    if ( (LA12_136=='n') ) {
                                        int LA12_151 = input.LA(10);

                                        if ( (LA12_151=='t') ) {
                                            int LA12_163 = input.LA(11);

                                            if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                                                return 29;
                                            }
                                            else {
                                                return 28;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        case 'l':
            {
            int LA12_38 = input.LA(3);

            if ( (LA12_38=='a') ) {
                int LA12_60 = input.LA(4);

                if ( (LA12_60=='s') ) {
                    int LA12_76 = input.LA(5);

                    if ( (LA12_76=='s') ) {
                        int LA12_92 = input.LA(6);

                        if ( ((LA12_92>='0' && LA12_92<='9')||(LA12_92>='A' && LA12_92<='Z')||LA12_92=='_'||(LA12_92>='a' && LA12_92<='z')) ) {
                            return 29;
                        }
                        else {
                            return 8;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        default:
            return 29;}

    }

    private int mTokensHelper009() throws RecognitionException {
        int LA12_9 = input.LA(2);

        if ( (LA12_9=='w') ) {
            int LA12_39 = input.LA(3);

            if ( (LA12_39=='n') ) {
                int LA12_61 = input.LA(4);

                if ( (LA12_61=='e') ) {
                    int LA12_77 = input.LA(5);

                    if ( (LA12_77=='d') ) {
                        switch ( input.LA(6) ) {
                        case 'A':
                            {
                            int LA12_109 = input.LA(7);

                            if ( (LA12_109=='t') ) {
                                int LA12_124 = input.LA(8);

                                if ( (LA12_124=='t') ) {
                                    int LA12_137 = input.LA(9);

                                    if ( (LA12_137=='r') ) {
                                        int LA12_152 = input.LA(10);

                                        if ( (LA12_152=='i') ) {
                                            int LA12_164 = input.LA(11);

                                            if ( (LA12_164=='b') ) {
                                                int LA12_175 = input.LA(12);

                                                if ( (LA12_175=='u') ) {
                                                    int LA12_185 = input.LA(13);

                                                    if ( (LA12_185=='t') ) {
                                                        int LA12_194 = input.LA(14);

                                                        if ( (LA12_194=='e') ) {
                                                            int LA12_202 = input.LA(15);

                                                            if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                                                return 29;
                                                            }
                                                            else {
                                                                return 9;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                            }
                        case 'O':
                            {
                            int LA12_110 = input.LA(7);

                            if ( (LA12_110=='p') ) {
                                int LA12_125 = input.LA(8);

                                if ( (LA12_125=='e') ) {
                                    int LA12_138 = input.LA(9);

                                    if ( (LA12_138=='r') ) {
                                        int LA12_153 = input.LA(10);

                                        if ( (LA12_153=='a') ) {
                                            int LA12_165 = input.LA(11);

                                            if ( (LA12_165=='t') ) {
                                                int LA12_176 = input.LA(12);

                                                if ( (LA12_176=='i') ) {
                                                    int LA12_186 = input.LA(13);

                                                    if ( (LA12_186=='o') ) {
                                                        int LA12_195 = input.LA(14);

                                                        if ( (LA12_195=='n') ) {
                                                            int LA12_203 = input.LA(15);

                                                            if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                                                return 29;
                                                            }
                                                            else {
                                                                return 12;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                            }
                        default:
                            return 29;}

                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper010() throws RecognitionException {
        return 10;
    }

    private int mTokensHelper011() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'e':
            {
            int LA12_41 = input.LA(3);

            if ( (LA12_41=='s') ) {
                int LA12_62 = input.LA(4);

                if ( (LA12_62=='t') ) {
                    int LA12_78 = input.LA(5);

                    if ( (LA12_78=='e') ) {
                        int LA12_94 = input.LA(6);

                        if ( (LA12_94=='d') ) {
                            int LA12_111 = input.LA(7);

                            if ( (LA12_111=='C') ) {
                                int LA12_126 = input.LA(8);

                                if ( (LA12_126=='l') ) {
                                    int LA12_139 = input.LA(9);

                                    if ( (LA12_139=='a') ) {
                                        int LA12_154 = input.LA(10);

                                        if ( (LA12_154=='s') ) {
                                            int LA12_166 = input.LA(11);

                                            if ( (LA12_166=='s') ) {
                                                int LA12_177 = input.LA(12);

                                                if ( (LA12_177=='i') ) {
                                                    int LA12_187 = input.LA(13);

                                                    if ( (LA12_187=='f') ) {
                                                        int LA12_196 = input.LA(14);

                                                        if ( (LA12_196=='i') ) {
                                                            int LA12_204 = input.LA(15);

                                                            if ( (LA12_204=='e') ) {
                                                                int LA12_212 = input.LA(16);

                                                                if ( (LA12_212=='r') ) {
                                                                    int LA12_217 = input.LA(17);

                                                                    if ( ((LA12_217>='0' && LA12_217<='9')||(LA12_217>='A' && LA12_217<='Z')||LA12_217=='_'||(LA12_217>='a' && LA12_217<='z')) ) {
                                                                        return 29;
                                                                    }
                                                                    else {
                                                                        return 11;}
                                                                }
                                                                else {
                                                                    return 29;}
                                                            }
                                                            else {
                                                                return 29;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        case 'a':
            {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='m') ) {
                int LA12_63 = input.LA(4);

                if ( (LA12_63=='e') ) {
                    int LA12_79 = input.LA(5);

                    if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                        return 29;
                    }
                    else {
                        return 17;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
            }
        default:
            return 29;}

    }

    private int mTokensHelper012() throws RecognitionException {
        int LA12_12 = input.LA(2);

        if ( (LA12_12=='n') ) {
            int LA12_43 = input.LA(3);

            if ( (LA12_43=='t') ) {
                int LA12_64 = input.LA(4);

                if ( (LA12_64=='e') ) {
                    int LA12_80 = input.LA(5);

                    if ( (LA12_80=='g') ) {
                        int LA12_96 = input.LA(6);

                        if ( (LA12_96=='e') ) {
                            int LA12_112 = input.LA(7);

                            if ( (LA12_112=='r') ) {
                                int LA12_127 = input.LA(8);

                                if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
                                    return 29;
                                }
                                else {
                                    return 13;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper013() throws RecognitionException {
        int LA12_13 = input.LA(2);

        if ( (LA12_13=='o') ) {
            int LA12_44 = input.LA(3);

            if ( (LA12_44=='o') ) {
                int LA12_65 = input.LA(4);

                if ( (LA12_65=='l') ) {
                    int LA12_81 = input.LA(5);

                    if ( (LA12_81=='e') ) {
                        int LA12_97 = input.LA(6);

                        if ( (LA12_97=='a') ) {
                            int LA12_113 = input.LA(7);

                            if ( (LA12_113=='n') ) {
                                int LA12_128 = input.LA(8);

                                if ( ((LA12_128>='0' && LA12_128<='9')||(LA12_128>='A' && LA12_128<='Z')||LA12_128=='_'||(LA12_128>='a' && LA12_128<='z')) ) {
                                    return 29;
                                }
                                else {
                                    return 14;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper014() throws RecognitionException {
        int LA12_14 = input.LA(2);

        if ( (LA12_14=='n') ) {
            int LA12_45 = input.LA(3);

            if ( (LA12_45=='l') ) {
                int LA12_66 = input.LA(4);

                if ( (LA12_66=='i') ) {
                    int LA12_82 = input.LA(5);

                    if ( (LA12_82=='m') ) {
                        int LA12_98 = input.LA(6);

                        if ( (LA12_98=='i') ) {
                            int LA12_114 = input.LA(7);

                            if ( (LA12_114=='t') ) {
                                int LA12_129 = input.LA(8);

                                if ( (LA12_129=='e') ) {
                                    int LA12_142 = input.LA(9);

                                    if ( (LA12_142=='d') ) {
                                        int LA12_155 = input.LA(10);

                                        if ( (LA12_155=='N') ) {
                                            int LA12_167 = input.LA(11);

                                            if ( (LA12_167=='a') ) {
                                                int LA12_178 = input.LA(12);

                                                if ( (LA12_178=='t') ) {
                                                    int LA12_188 = input.LA(13);

                                                    if ( (LA12_188=='u') ) {
                                                        int LA12_197 = input.LA(14);

                                                        if ( (LA12_197=='r') ) {
                                                            int LA12_205 = input.LA(15);

                                                            if ( (LA12_205=='a') ) {
                                                                int LA12_213 = input.LA(16);

                                                                if ( (LA12_213=='l') ) {
                                                                    int LA12_218 = input.LA(17);

                                                                    if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                                                        return 29;
                                                                    }
                                                                    else {
                                                                        return 15;}
                                                                }
                                                                else {
                                                                    return 29;}
                                                            }
                                                            else {
                                                                return 29;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper015() throws RecognitionException {
        int LA12_15 = input.LA(2);

        if ( (LA12_15=='i') ) {
            int LA12_46 = input.LA(3);

            if ( (LA12_46=='t') ) {
                int LA12_67 = input.LA(4);

                if ( (LA12_67=='e') ) {
                    int LA12_83 = input.LA(5);

                    if ( (LA12_83=='r') ) {
                        int LA12_99 = input.LA(6);

                        if ( (LA12_99=='a') ) {
                            int LA12_115 = input.LA(7);

                            if ( (LA12_115=='l') ) {
                                switch ( input.LA(8) ) {
                                case 'U':
                                    {
                                    int LA12_143 = input.LA(9);

                                    if ( (LA12_143=='n') ) {
                                        int LA12_156 = input.LA(10);

                                        if ( (LA12_156=='l') ) {
                                            int LA12_168 = input.LA(11);

                                            if ( (LA12_168=='i') ) {
                                                int LA12_179 = input.LA(12);

                                                if ( (LA12_179=='m') ) {
                                                    int LA12_189 = input.LA(13);

                                                    if ( (LA12_189=='i') ) {
                                                        int LA12_198 = input.LA(14);

                                                        if ( (LA12_198=='t') ) {
                                                            int LA12_206 = input.LA(15);

                                                            if ( (LA12_206=='e') ) {
                                                                int LA12_214 = input.LA(16);

                                                                if ( (LA12_214=='d') ) {
                                                                    int LA12_219 = input.LA(17);

                                                                    if ( (LA12_219=='N') ) {
                                                                        int LA12_222 = input.LA(18);

                                                                        if ( (LA12_222=='a') ) {
                                                                            int LA12_223 = input.LA(19);

                                                                            if ( (LA12_223=='t') ) {
                                                                                int LA12_224 = input.LA(20);

                                                                                if ( (LA12_224=='u') ) {
                                                                                    int LA12_225 = input.LA(21);

                                                                                    if ( (LA12_225=='r') ) {
                                                                                        int LA12_226 = input.LA(22);

                                                                                        if ( (LA12_226=='a') ) {
                                                                                            int LA12_227 = input.LA(23);

                                                                                            if ( (LA12_227=='l') ) {
                                                                                                int LA12_228 = input.LA(24);

                                                                                                if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                                                                    return 29;
                                                                                                }
                                                                                                else {
                                                                                                    return 21;}
                                                                                            }
                                                                                            else {
                                                                                                return 29;}
                                                                                        }
                                                                                        else {
                                                                                            return 29;}
                                                                                    }
                                                                                    else {
                                                                                        return 29;}
                                                                                }
                                                                                else {
                                                                                    return 29;}
                                                                            }
                                                                            else {
                                                                                return 29;}
                                                                        }
                                                                        else {
                                                                            return 29;}
                                                                    }
                                                                    else {
                                                                        return 29;}
                                                                }
                                                                else {
                                                                    return 29;}
                                                            }
                                                            else {
                                                                return 29;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                    }
                                case 'S':
                                    {
                                    int LA12_144 = input.LA(9);

                                    if ( (LA12_144=='t') ) {
                                        int LA12_157 = input.LA(10);

                                        if ( (LA12_157=='r') ) {
                                            int LA12_169 = input.LA(11);

                                            if ( (LA12_169=='i') ) {
                                                int LA12_180 = input.LA(12);

                                                if ( (LA12_180=='n') ) {
                                                    int LA12_190 = input.LA(13);

                                                    if ( (LA12_190=='g') ) {
                                                        int LA12_199 = input.LA(14);

                                                        if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                                            return 29;
                                                        }
                                                        else {
                                                            return 19;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                    }
                                case 'I':
                                    {
                                    int LA12_145 = input.LA(9);

                                    if ( (LA12_145=='n') ) {
                                        int LA12_158 = input.LA(10);

                                        if ( (LA12_158=='t') ) {
                                            int LA12_170 = input.LA(11);

                                            if ( (LA12_170=='e') ) {
                                                int LA12_181 = input.LA(12);

                                                if ( (LA12_181=='g') ) {
                                                    int LA12_191 = input.LA(13);

                                                    if ( (LA12_191=='e') ) {
                                                        int LA12_200 = input.LA(14);

                                                        if ( (LA12_200=='r') ) {
                                                            int LA12_208 = input.LA(15);

                                                            if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
                                                                return 29;
                                                            }
                                                            else {
                                                                return 16;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                    }
                                case 'B':
                                    {
                                    int LA12_146 = input.LA(9);

                                    if ( (LA12_146=='o') ) {
                                        int LA12_159 = input.LA(10);

                                        if ( (LA12_159=='o') ) {
                                            int LA12_171 = input.LA(11);

                                            if ( (LA12_171=='l') ) {
                                                int LA12_182 = input.LA(12);

                                                if ( (LA12_182=='e') ) {
                                                    int LA12_192 = input.LA(13);

                                                    if ( (LA12_192=='a') ) {
                                                        int LA12_201 = input.LA(14);

                                                        if ( (LA12_201=='n') ) {
                                                            int LA12_209 = input.LA(15);

                                                            if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                                                return 29;
                                                            }
                                                            else {
                                                                return 20;}
                                                        }
                                                        else {
                                                            return 29;}
                                                    }
                                                    else {
                                                        return 29;}
                                                }
                                                else {
                                                    return 29;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                    }
                                case 'N':
                                    {
                                    int LA12_147 = input.LA(9);

                                    if ( (LA12_147=='u') ) {
                                        int LA12_160 = input.LA(10);

                                        if ( (LA12_160=='l') ) {
                                            int LA12_172 = input.LA(11);

                                            if ( (LA12_172=='l') ) {
                                                int LA12_183 = input.LA(12);

                                                if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                                                    return 29;
                                                }
                                                else {
                                                    return 22;}
                                            }
                                            else {
                                                return 29;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                    }
                                default:
                                    return 29;}

                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA12_16 = input.LA(2);

        if ( (LA12_16=='a') ) {
            int LA12_47 = input.LA(3);

            if ( (LA12_47=='l') ) {
                int LA12_68 = input.LA(4);

                if ( (LA12_68=='u') ) {
                    int LA12_84 = input.LA(5);

                    if ( (LA12_84=='e') ) {
                        int LA12_100 = input.LA(6);

                        if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                            return 29;
                        }
                        else {
                            return 18;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='e') ) {
            int LA12_48 = input.LA(3);

            if ( (LA12_48=='q') ) {
                int LA12_69 = input.LA(4);

                if ( (LA12_69=='u') ) {
                    int LA12_85 = input.LA(5);

                    if ( (LA12_85=='e') ) {
                        int LA12_101 = input.LA(6);

                        if ( (LA12_101=='n') ) {
                            int LA12_117 = input.LA(7);

                            if ( (LA12_117=='t') ) {
                                int LA12_131 = input.LA(8);

                                if ( (LA12_131=='i') ) {
                                    int LA12_148 = input.LA(9);

                                    if ( (LA12_148=='a') ) {
                                        int LA12_161 = input.LA(10);

                                        if ( (LA12_161=='l') ) {
                                            int LA12_173 = input.LA(11);

                                            if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                                return 29;
                                            }
                                            else {
                                                return 26;}
                                        }
                                        else {
                                            return 29;}
                                    }
                                    else {
                                        return 29;}
                                }
                                else {
                                    return 29;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='u') ) {
            int LA12_49 = input.LA(3);

            if ( (LA12_49=='a') ) {
                int LA12_70 = input.LA(4);

                if ( (LA12_70=='r') ) {
                    int LA12_86 = input.LA(5);

                    if ( (LA12_86=='d') ) {
                        int LA12_102 = input.LA(6);

                        if ( (LA12_102=='e') ) {
                            int LA12_118 = input.LA(7);

                            if ( (LA12_118=='d') ) {
                                int LA12_132 = input.LA(8);

                                if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                    return 29;
                                }
                                else {
                                    return 27;}
                            }
                            else {
                                return 29;}
                        }
                        else {
                            return 29;}
                    }
                    else {
                        return 29;}
                }
                else {
                    return 29;}
            }
            else {
                return 29;}
        }
        else {
            return 29;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( ((LA12_19>='A' && LA12_19<='Z')||LA12_19=='_'||(LA12_19>='a' && LA12_19<='z')) ) {
            return 29;
        }
        else {
            return 35;}
    }

    private int mTokensHelper020() throws RecognitionException {
        return 29;
    }

    private int mTokensHelper021() throws RecognitionException {
        return 30;
    }

    private int mTokensHelper022() throws RecognitionException {
        int LA12_22 = input.LA(2);

        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFE')) ) {
            return 31;
        }
        else {
            return 35;}
    }

    private int mTokensHelper023() throws RecognitionException {
        int LA12_23 = input.LA(2);

        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
            return 31;
        }
        else {
            return 35;}
    }

    private int mTokensHelper024() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 33;
            }
        case '*':
            {
            return 32;
            }
        default:
            return 35;}

    }

    private int mTokensHelper025() throws RecognitionException {
        return 34;
    }

    private int mTokensHelper026() throws RecognitionException {
        return 35;
    }

    private int mTokensHelper027() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}