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
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:13:5: ( 'public' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:13:7: 'public'
            {
            match("public"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:14:5: ( 'private' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:14:7: 'private'
            {
            match("private"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:15:5: ( 'protected' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:15:7: 'protected'
            {
            match("protected"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:17:5: ( 'sequential' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:17:7: 'sequential'
            {
            match("sequential"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:18:5: ( 'guarded' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:18:7: 'guarded'
            {
            match("guarded"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:19:5: ( 'concurrent' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:19:7: 'concurrent'
            {
            match("concurrent"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:20:5: ( 'packagedElement' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:20:7: 'packagedElement'
            {
            match("packagedElement"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:21:5: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:21:7: '{'
            {
            match('{'); 

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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:22:5: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:22:7: '}'
            {
            match('}'); 

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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:23:5: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:23:7: ','
            {
            match(','); 

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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:24:5: ( 'Package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:24:7: 'Package'
            {
            match("Package"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:25:5: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:25:7: 'name'
            {
            match("name"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:26:5: ( 'visibility' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:26:7: 'visibility'
            {
            match("visibility"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:27:5: ( 'Property' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:27:7: 'Property'
            {
            match("Property"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:28:5: ( 'isStatic' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:28:7: 'isStatic'
            {
            match("isStatic"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:29:5: ( 'type' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:29:7: 'type'
            {
            match("type"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:30:5: ( 'Operation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:30:7: 'Operation'
            {
            match("Operation"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:31:5: ( 'isAbstract' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:31:7: 'isAbstract'
            {
            match("isAbstract"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:32:5: ( 'concurrency' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:32:7: 'concurrency'
            {
            match("concurrency"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:33:5: ( 'Class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:33:7: 'Class'
            {
            match("Class"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:34:5: ( 'isActive' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:34:7: 'isActive'
            {
            match("isActive"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:35:5: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:35:7: 'ownedAttribute'
            {
            match("ownedAttribute"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:36:5: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:36:7: 'nestedClassifier'
            {
            match("nestedClassifier"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:37:5: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:37:7: 'ownedOperation'
            {
            match("ownedOperation"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:38:5: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:38:7: 'LiteralInteger'
            {
            match("LiteralInteger"); 


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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:39:5: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:39:7: 'value'
            {
            match("value"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:40:5: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:40:7: 'LiteralString'
            {
            match("LiteralString"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:41:5: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:41:7: 'LiteralBoolean'
            {
            match("LiteralBoolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:42:5: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:42:7: 'LiteralUnlimitedNatural'
            {
            match("LiteralUnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:43:5: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:43:7: 'LiteralNull'
            {
            match("LiteralNull"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5863:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5863:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5863:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5863:11: '^'
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

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5863:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5865:10: ( ( '0' .. '9' )+ )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5865:12: ( '0' .. '9' )+
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5865:12: ( '0' .. '9' )+
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
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5865:13: '0' .. '9'
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("5867:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5867:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5869:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5869:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5869:24: ( options {greedy=false; } : . )*
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
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5869:52: .
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:41: ( '\\r' )? '\\n'
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5871:41: '\\r'
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5873:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5873:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5873:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5875:16: ( . )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5875:18: .
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
        // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=41;
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
        else if ( (LA12_0=='p') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='s') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='g') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='c') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper008();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper009();
        }
        else if ( (LA12_0==',') ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='P') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='n') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='v') ) {
            alt12 = mTokensHelper013();
        }
        else if ( (LA12_0=='i') ) {
            alt12 = mTokensHelper014();
        }
        else if ( (LA12_0=='t') ) {
            alt12 = mTokensHelper015();
        }
        else if ( (LA12_0=='O') ) {
            alt12 = mTokensHelper016();
        }
        else if ( (LA12_0=='C') ) {
            alt12 = mTokensHelper017();
        }
        else if ( (LA12_0=='o') ) {
            alt12 = mTokensHelper018();
        }
        else if ( (LA12_0=='L') ) {
            alt12 = mTokensHelper019();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper020();
        }
        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||(LA12_0>='Q' && LA12_0<='T')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='d' && LA12_0<='f')||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12 = mTokensHelper021();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper022();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper023();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper024();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper025();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper026();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper027();
        }
        else {
            alt12 = mTokensHelper028();
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
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        int LA12_1 = input.LA(2);

        if ( (LA12_1=='n') ) {
            int LA12_28 = input.LA(3);

            if ( (LA12_28=='t') ) {
                int LA12_58 = input.LA(4);

                if ( (LA12_58=='e') ) {
                    int LA12_81 = input.LA(5);

                    if ( (LA12_81=='g') ) {
                        int LA12_105 = input.LA(6);

                        if ( (LA12_105=='e') ) {
                            int LA12_129 = input.LA(7);

                            if ( (LA12_129=='r') ) {
                                int LA12_152 = input.LA(8);

                                if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                    return 35;
                                }
                                else {
                                    return 1;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper002() throws RecognitionException {
        int LA12_2 = input.LA(2);

        if ( (LA12_2=='o') ) {
            int LA12_30 = input.LA(3);

            if ( (LA12_30=='o') ) {
                int LA12_59 = input.LA(4);

                if ( (LA12_59=='l') ) {
                    int LA12_82 = input.LA(5);

                    if ( (LA12_82=='e') ) {
                        int LA12_106 = input.LA(6);

                        if ( (LA12_106=='a') ) {
                            int LA12_130 = input.LA(7);

                            if ( (LA12_130=='n') ) {
                                int LA12_153 = input.LA(8);

                                if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                    return 35;
                                }
                                else {
                                    return 2;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper003() throws RecognitionException {
        int LA12_3 = input.LA(2);

        if ( (LA12_3=='n') ) {
            int LA12_31 = input.LA(3);

            if ( (LA12_31=='l') ) {
                int LA12_60 = input.LA(4);

                if ( (LA12_60=='i') ) {
                    int LA12_83 = input.LA(5);

                    if ( (LA12_83=='m') ) {
                        int LA12_107 = input.LA(6);

                        if ( (LA12_107=='i') ) {
                            int LA12_131 = input.LA(7);

                            if ( (LA12_131=='t') ) {
                                int LA12_154 = input.LA(8);

                                if ( (LA12_154=='e') ) {
                                    int LA12_175 = input.LA(9);

                                    if ( (LA12_175=='d') ) {
                                        int LA12_198 = input.LA(10);

                                        if ( (LA12_198=='N') ) {
                                            int LA12_217 = input.LA(11);

                                            if ( (LA12_217=='a') ) {
                                                int LA12_234 = input.LA(12);

                                                if ( (LA12_234=='t') ) {
                                                    int LA12_249 = input.LA(13);

                                                    if ( (LA12_249=='u') ) {
                                                        int LA12_260 = input.LA(14);

                                                        if ( (LA12_260=='r') ) {
                                                            int LA12_269 = input.LA(15);

                                                            if ( (LA12_269=='a') ) {
                                                                int LA12_278 = input.LA(16);

                                                                if ( (LA12_278=='l') ) {
                                                                    int LA12_286 = input.LA(17);

                                                                    if ( ((LA12_286>='0' && LA12_286<='9')||(LA12_286>='A' && LA12_286<='Z')||LA12_286=='_'||(LA12_286>='a' && LA12_286<='z')) ) {
                                                                        return 35;
                                                                    }
                                                                    else {
                                                                        return 3;}
                                                                }
                                                                else {
                                                                    return 35;}
                                                            }
                                                            else {
                                                                return 35;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper004() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_32 = input.LA(3);

            if ( (LA12_32=='c') ) {
                int LA12_61 = input.LA(4);

                if ( (LA12_61=='k') ) {
                    int LA12_84 = input.LA(5);

                    if ( (LA12_84=='a') ) {
                        int LA12_108 = input.LA(6);

                        if ( (LA12_108=='g') ) {
                            int LA12_132 = input.LA(7);

                            if ( (LA12_132=='e') ) {
                                switch ( input.LA(8) ) {
                                case 'd':
                                    {
                                    int LA12_176 = input.LA(9);

                                    if ( (LA12_176=='E') ) {
                                        int LA12_199 = input.LA(10);

                                        if ( (LA12_199=='l') ) {
                                            int LA12_218 = input.LA(11);

                                            if ( (LA12_218=='e') ) {
                                                int LA12_235 = input.LA(12);

                                                if ( (LA12_235=='m') ) {
                                                    int LA12_250 = input.LA(13);

                                                    if ( (LA12_250=='e') ) {
                                                        int LA12_261 = input.LA(14);

                                                        if ( (LA12_261=='n') ) {
                                                            int LA12_270 = input.LA(15);

                                                            if ( (LA12_270=='t') ) {
                                                                int LA12_279 = input.LA(16);

                                                                if ( ((LA12_279>='0' && LA12_279<='9')||(LA12_279>='A' && LA12_279<='Z')||LA12_279=='_'||(LA12_279>='a' && LA12_279<='z')) ) {
                                                                    return 35;
                                                                }
                                                                else {
                                                                    return 11;}
                                                            }
                                                            else {
                                                                return 35;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    return 35;
                                    }
                                default:
                                    return 7;}

                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        case 'r':
            {
            switch ( input.LA(3) ) {
            case 'i':
                {
                int LA12_62 = input.LA(4);

                if ( (LA12_62=='v') ) {
                    int LA12_85 = input.LA(5);

                    if ( (LA12_85=='a') ) {
                        int LA12_109 = input.LA(6);

                        if ( (LA12_109=='t') ) {
                            int LA12_133 = input.LA(7);

                            if ( (LA12_133=='e') ) {
                                int LA12_156 = input.LA(8);

                                if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                                    return 35;
                                }
                                else {
                                    return 5;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
                }
            case 'o':
                {
                int LA12_63 = input.LA(4);

                if ( (LA12_63=='t') ) {
                    int LA12_86 = input.LA(5);

                    if ( (LA12_86=='e') ) {
                        int LA12_110 = input.LA(6);

                        if ( (LA12_110=='c') ) {
                            int LA12_134 = input.LA(7);

                            if ( (LA12_134=='t') ) {
                                int LA12_157 = input.LA(8);

                                if ( (LA12_157=='e') ) {
                                    int LA12_179 = input.LA(9);

                                    if ( (LA12_179=='d') ) {
                                        int LA12_200 = input.LA(10);

                                        if ( ((LA12_200>='0' && LA12_200<='9')||(LA12_200>='A' && LA12_200<='Z')||LA12_200=='_'||(LA12_200>='a' && LA12_200<='z')) ) {
                                            return 35;
                                        }
                                        else {
                                            return 6;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
                }
            default:
                return 35;}

            }
        case 'u':
            {
            int LA12_34 = input.LA(3);

            if ( (LA12_34=='b') ) {
                int LA12_64 = input.LA(4);

                if ( (LA12_64=='l') ) {
                    int LA12_87 = input.LA(5);

                    if ( (LA12_87=='i') ) {
                        int LA12_111 = input.LA(6);

                        if ( (LA12_111=='c') ) {
                            int LA12_135 = input.LA(7);

                            if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                                return 35;
                            }
                            else {
                                return 4;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        default:
            return 35;}

    }

    private int mTokensHelper005() throws RecognitionException {
        int LA12_5 = input.LA(2);

        if ( (LA12_5=='e') ) {
            int LA12_35 = input.LA(3);

            if ( (LA12_35=='q') ) {
                int LA12_65 = input.LA(4);

                if ( (LA12_65=='u') ) {
                    int LA12_88 = input.LA(5);

                    if ( (LA12_88=='e') ) {
                        int LA12_112 = input.LA(6);

                        if ( (LA12_112=='n') ) {
                            int LA12_136 = input.LA(7);

                            if ( (LA12_136=='t') ) {
                                int LA12_159 = input.LA(8);

                                if ( (LA12_159=='i') ) {
                                    int LA12_180 = input.LA(9);

                                    if ( (LA12_180=='a') ) {
                                        int LA12_201 = input.LA(10);

                                        if ( (LA12_201=='l') ) {
                                            int LA12_220 = input.LA(11);

                                            if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                return 35;
                                            }
                                            else {
                                                return 8;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper006() throws RecognitionException {
        int LA12_6 = input.LA(2);

        if ( (LA12_6=='u') ) {
            int LA12_36 = input.LA(3);

            if ( (LA12_36=='a') ) {
                int LA12_66 = input.LA(4);

                if ( (LA12_66=='r') ) {
                    int LA12_89 = input.LA(5);

                    if ( (LA12_89=='d') ) {
                        int LA12_113 = input.LA(6);

                        if ( (LA12_113=='e') ) {
                            int LA12_137 = input.LA(7);

                            if ( (LA12_137=='d') ) {
                                int LA12_160 = input.LA(8);

                                if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                    return 35;
                                }
                                else {
                                    return 9;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper007() throws RecognitionException {
        int LA12_7 = input.LA(2);

        if ( (LA12_7=='o') ) {
            int LA12_37 = input.LA(3);

            if ( (LA12_37=='n') ) {
                int LA12_67 = input.LA(4);

                if ( (LA12_67=='c') ) {
                    int LA12_90 = input.LA(5);

                    if ( (LA12_90=='u') ) {
                        int LA12_114 = input.LA(6);

                        if ( (LA12_114=='r') ) {
                            int LA12_138 = input.LA(7);

                            if ( (LA12_138=='r') ) {
                                int LA12_161 = input.LA(8);

                                if ( (LA12_161=='e') ) {
                                    int LA12_182 = input.LA(9);

                                    if ( (LA12_182=='n') ) {
                                        switch ( input.LA(10) ) {
                                        case 'c':
                                            {
                                            int LA12_221 = input.LA(11);

                                            if ( (LA12_221=='y') ) {
                                                int LA12_237 = input.LA(12);

                                                if ( ((LA12_237>='0' && LA12_237<='9')||(LA12_237>='A' && LA12_237<='Z')||LA12_237=='_'||(LA12_237>='a' && LA12_237<='z')) ) {
                                                    return 35;
                                                }
                                                else {
                                                    return 23;}
                                            }
                                            else {
                                                return 35;}
                                            }
                                        case 't':
                                            {
                                            int LA12_222 = input.LA(11);

                                            if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                                return 35;
                                            }
                                            else {
                                                return 10;}
                                            }
                                        default:
                                            return 35;}

                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper008() throws RecognitionException {
        return 12;
    }

    private int mTokensHelper009() throws RecognitionException {
        return 13;
    }

    private int mTokensHelper010() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper011() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'r':
            {
            int LA12_41 = input.LA(3);

            if ( (LA12_41=='o') ) {
                int LA12_68 = input.LA(4);

                if ( (LA12_68=='p') ) {
                    int LA12_91 = input.LA(5);

                    if ( (LA12_91=='e') ) {
                        int LA12_115 = input.LA(6);

                        if ( (LA12_115=='r') ) {
                            int LA12_139 = input.LA(7);

                            if ( (LA12_139=='t') ) {
                                int LA12_162 = input.LA(8);

                                if ( (LA12_162=='y') ) {
                                    int LA12_183 = input.LA(9);

                                    if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                                        return 35;
                                    }
                                    else {
                                        return 18;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        case 'a':
            {
            int LA12_42 = input.LA(3);

            if ( (LA12_42=='c') ) {
                int LA12_69 = input.LA(4);

                if ( (LA12_69=='k') ) {
                    int LA12_92 = input.LA(5);

                    if ( (LA12_92=='a') ) {
                        int LA12_116 = input.LA(6);

                        if ( (LA12_116=='g') ) {
                            int LA12_140 = input.LA(7);

                            if ( (LA12_140=='e') ) {
                                int LA12_163 = input.LA(8);

                                if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                                    return 35;
                                }
                                else {
                                    return 15;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        default:
            return 35;}

    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_43 = input.LA(3);

            if ( (LA12_43=='m') ) {
                int LA12_70 = input.LA(4);

                if ( (LA12_70=='e') ) {
                    int LA12_93 = input.LA(5);

                    if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                        return 35;
                    }
                    else {
                        return 16;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        case 'e':
            {
            int LA12_44 = input.LA(3);

            if ( (LA12_44=='s') ) {
                int LA12_71 = input.LA(4);

                if ( (LA12_71=='t') ) {
                    int LA12_94 = input.LA(5);

                    if ( (LA12_94=='e') ) {
                        int LA12_118 = input.LA(6);

                        if ( (LA12_118=='d') ) {
                            int LA12_141 = input.LA(7);

                            if ( (LA12_141=='C') ) {
                                int LA12_164 = input.LA(8);

                                if ( (LA12_164=='l') ) {
                                    int LA12_185 = input.LA(9);

                                    if ( (LA12_185=='a') ) {
                                        int LA12_204 = input.LA(10);

                                        if ( (LA12_204=='s') ) {
                                            int LA12_223 = input.LA(11);

                                            if ( (LA12_223=='s') ) {
                                                int LA12_239 = input.LA(12);

                                                if ( (LA12_239=='i') ) {
                                                    int LA12_252 = input.LA(13);

                                                    if ( (LA12_252=='f') ) {
                                                        int LA12_262 = input.LA(14);

                                                        if ( (LA12_262=='i') ) {
                                                            int LA12_271 = input.LA(15);

                                                            if ( (LA12_271=='e') ) {
                                                                int LA12_280 = input.LA(16);

                                                                if ( (LA12_280=='r') ) {
                                                                    int LA12_288 = input.LA(17);

                                                                    if ( ((LA12_288>='0' && LA12_288<='9')||(LA12_288>='A' && LA12_288<='Z')||LA12_288=='_'||(LA12_288>='a' && LA12_288<='z')) ) {
                                                                        return 35;
                                                                    }
                                                                    else {
                                                                        return 27;}
                                                                }
                                                                else {
                                                                    return 35;}
                                                            }
                                                            else {
                                                                return 35;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        default:
            return 35;}

    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'a':
            {
            int LA12_45 = input.LA(3);

            if ( (LA12_45=='l') ) {
                int LA12_72 = input.LA(4);

                if ( (LA12_72=='u') ) {
                    int LA12_95 = input.LA(5);

                    if ( (LA12_95=='e') ) {
                        int LA12_119 = input.LA(6);

                        if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                            return 35;
                        }
                        else {
                            return 30;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        case 'i':
            {
            int LA12_46 = input.LA(3);

            if ( (LA12_46=='s') ) {
                int LA12_73 = input.LA(4);

                if ( (LA12_73=='i') ) {
                    int LA12_96 = input.LA(5);

                    if ( (LA12_96=='b') ) {
                        int LA12_120 = input.LA(6);

                        if ( (LA12_120=='i') ) {
                            int LA12_143 = input.LA(7);

                            if ( (LA12_143=='l') ) {
                                int LA12_165 = input.LA(8);

                                if ( (LA12_165=='i') ) {
                                    int LA12_186 = input.LA(9);

                                    if ( (LA12_186=='t') ) {
                                        int LA12_205 = input.LA(10);

                                        if ( (LA12_205=='y') ) {
                                            int LA12_224 = input.LA(11);

                                            if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                                return 35;
                                            }
                                            else {
                                                return 17;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
            }
        default:
            return 35;}

    }

    private int mTokensHelper014() throws RecognitionException {
        int LA12_14 = input.LA(2);

        if ( (LA12_14=='s') ) {
            switch ( input.LA(3) ) {
            case 'S':
                {
                int LA12_74 = input.LA(4);

                if ( (LA12_74=='t') ) {
                    int LA12_97 = input.LA(5);

                    if ( (LA12_97=='a') ) {
                        int LA12_121 = input.LA(6);

                        if ( (LA12_121=='t') ) {
                            int LA12_144 = input.LA(7);

                            if ( (LA12_144=='i') ) {
                                int LA12_166 = input.LA(8);

                                if ( (LA12_166=='c') ) {
                                    int LA12_187 = input.LA(9);

                                    if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                        return 35;
                                    }
                                    else {
                                        return 19;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
                }
            case 'A':
                {
                switch ( input.LA(4) ) {
                case 'b':
                    {
                    int LA12_98 = input.LA(5);

                    if ( (LA12_98=='s') ) {
                        int LA12_122 = input.LA(6);

                        if ( (LA12_122=='t') ) {
                            int LA12_145 = input.LA(7);

                            if ( (LA12_145=='r') ) {
                                int LA12_167 = input.LA(8);

                                if ( (LA12_167=='a') ) {
                                    int LA12_188 = input.LA(9);

                                    if ( (LA12_188=='c') ) {
                                        int LA12_207 = input.LA(10);

                                        if ( (LA12_207=='t') ) {
                                            int LA12_225 = input.LA(11);

                                            if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
                                                return 35;
                                            }
                                            else {
                                                return 22;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                    }
                case 'c':
                    {
                    int LA12_99 = input.LA(5);

                    if ( (LA12_99=='t') ) {
                        int LA12_123 = input.LA(6);

                        if ( (LA12_123=='i') ) {
                            int LA12_146 = input.LA(7);

                            if ( (LA12_146=='v') ) {
                                int LA12_168 = input.LA(8);

                                if ( (LA12_168=='e') ) {
                                    int LA12_189 = input.LA(9);

                                    if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                        return 35;
                                    }
                                    else {
                                        return 25;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                    }
                default:
                    return 35;}

                }
            default:
                return 35;}

        }
        else {
            return 35;}
    }

    private int mTokensHelper015() throws RecognitionException {
        int LA12_15 = input.LA(2);

        if ( (LA12_15=='y') ) {
            int LA12_48 = input.LA(3);

            if ( (LA12_48=='p') ) {
                int LA12_76 = input.LA(4);

                if ( (LA12_76=='e') ) {
                    int LA12_100 = input.LA(5);

                    if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                        return 35;
                    }
                    else {
                        return 20;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA12_16 = input.LA(2);

        if ( (LA12_16=='p') ) {
            int LA12_49 = input.LA(3);

            if ( (LA12_49=='e') ) {
                int LA12_77 = input.LA(4);

                if ( (LA12_77=='r') ) {
                    int LA12_101 = input.LA(5);

                    if ( (LA12_101=='a') ) {
                        int LA12_125 = input.LA(6);

                        if ( (LA12_125=='t') ) {
                            int LA12_147 = input.LA(7);

                            if ( (LA12_147=='i') ) {
                                int LA12_169 = input.LA(8);

                                if ( (LA12_169=='o') ) {
                                    int LA12_190 = input.LA(9);

                                    if ( (LA12_190=='n') ) {
                                        int LA12_209 = input.LA(10);

                                        if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                            return 35;
                                        }
                                        else {
                                            return 21;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper017() throws RecognitionException {
        int LA12_17 = input.LA(2);

        if ( (LA12_17=='l') ) {
            int LA12_50 = input.LA(3);

            if ( (LA12_50=='a') ) {
                int LA12_78 = input.LA(4);

                if ( (LA12_78=='s') ) {
                    int LA12_102 = input.LA(5);

                    if ( (LA12_102=='s') ) {
                        int LA12_126 = input.LA(6);

                        if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                            return 35;
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper018() throws RecognitionException {
        int LA12_18 = input.LA(2);

        if ( (LA12_18=='w') ) {
            int LA12_51 = input.LA(3);

            if ( (LA12_51=='n') ) {
                int LA12_79 = input.LA(4);

                if ( (LA12_79=='e') ) {
                    int LA12_103 = input.LA(5);

                    if ( (LA12_103=='d') ) {
                        switch ( input.LA(6) ) {
                        case 'O':
                            {
                            int LA12_149 = input.LA(7);

                            if ( (LA12_149=='p') ) {
                                int LA12_170 = input.LA(8);

                                if ( (LA12_170=='e') ) {
                                    int LA12_191 = input.LA(9);

                                    if ( (LA12_191=='r') ) {
                                        int LA12_210 = input.LA(10);

                                        if ( (LA12_210=='a') ) {
                                            int LA12_227 = input.LA(11);

                                            if ( (LA12_227=='t') ) {
                                                int LA12_242 = input.LA(12);

                                                if ( (LA12_242=='i') ) {
                                                    int LA12_253 = input.LA(13);

                                                    if ( (LA12_253=='o') ) {
                                                        int LA12_263 = input.LA(14);

                                                        if ( (LA12_263=='n') ) {
                                                            int LA12_272 = input.LA(15);

                                                            if ( ((LA12_272>='0' && LA12_272<='9')||(LA12_272>='A' && LA12_272<='Z')||LA12_272=='_'||(LA12_272>='a' && LA12_272<='z')) ) {
                                                                return 35;
                                                            }
                                                            else {
                                                                return 28;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                            }
                        case 'A':
                            {
                            int LA12_150 = input.LA(7);

                            if ( (LA12_150=='t') ) {
                                int LA12_171 = input.LA(8);

                                if ( (LA12_171=='t') ) {
                                    int LA12_192 = input.LA(9);

                                    if ( (LA12_192=='r') ) {
                                        int LA12_211 = input.LA(10);

                                        if ( (LA12_211=='i') ) {
                                            int LA12_228 = input.LA(11);

                                            if ( (LA12_228=='b') ) {
                                                int LA12_243 = input.LA(12);

                                                if ( (LA12_243=='u') ) {
                                                    int LA12_254 = input.LA(13);

                                                    if ( (LA12_254=='t') ) {
                                                        int LA12_264 = input.LA(14);

                                                        if ( (LA12_264=='e') ) {
                                                            int LA12_273 = input.LA(15);

                                                            if ( ((LA12_273>='0' && LA12_273<='9')||(LA12_273>='A' && LA12_273<='Z')||LA12_273=='_'||(LA12_273>='a' && LA12_273<='z')) ) {
                                                                return 35;
                                                            }
                                                            else {
                                                                return 26;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                }
                                else {
                                    return 35;}
                            }
                            else {
                                return 35;}
                            }
                        default:
                            return 35;}

                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA12_19 = input.LA(2);

        if ( (LA12_19=='i') ) {
            int LA12_52 = input.LA(3);

            if ( (LA12_52=='t') ) {
                int LA12_80 = input.LA(4);

                if ( (LA12_80=='e') ) {
                    int LA12_104 = input.LA(5);

                    if ( (LA12_104=='r') ) {
                        int LA12_128 = input.LA(6);

                        if ( (LA12_128=='a') ) {
                            int LA12_151 = input.LA(7);

                            if ( (LA12_151=='l') ) {
                                switch ( input.LA(8) ) {
                                case 'S':
                                    {
                                    int LA12_193 = input.LA(9);

                                    if ( (LA12_193=='t') ) {
                                        int LA12_212 = input.LA(10);

                                        if ( (LA12_212=='r') ) {
                                            int LA12_229 = input.LA(11);

                                            if ( (LA12_229=='i') ) {
                                                int LA12_244 = input.LA(12);

                                                if ( (LA12_244=='n') ) {
                                                    int LA12_255 = input.LA(13);

                                                    if ( (LA12_255=='g') ) {
                                                        int LA12_265 = input.LA(14);

                                                        if ( ((LA12_265>='0' && LA12_265<='9')||(LA12_265>='A' && LA12_265<='Z')||LA12_265=='_'||(LA12_265>='a' && LA12_265<='z')) ) {
                                                            return 35;
                                                        }
                                                        else {
                                                            return 31;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                case 'U':
                                    {
                                    int LA12_194 = input.LA(9);

                                    if ( (LA12_194=='n') ) {
                                        int LA12_213 = input.LA(10);

                                        if ( (LA12_213=='l') ) {
                                            int LA12_230 = input.LA(11);

                                            if ( (LA12_230=='i') ) {
                                                int LA12_245 = input.LA(12);

                                                if ( (LA12_245=='m') ) {
                                                    int LA12_256 = input.LA(13);

                                                    if ( (LA12_256=='i') ) {
                                                        int LA12_266 = input.LA(14);

                                                        if ( (LA12_266=='t') ) {
                                                            int LA12_275 = input.LA(15);

                                                            if ( (LA12_275=='e') ) {
                                                                int LA12_283 = input.LA(16);

                                                                if ( (LA12_283=='d') ) {
                                                                    int LA12_289 = input.LA(17);

                                                                    if ( (LA12_289=='N') ) {
                                                                        int LA12_292 = input.LA(18);

                                                                        if ( (LA12_292=='a') ) {
                                                                            int LA12_293 = input.LA(19);

                                                                            if ( (LA12_293=='t') ) {
                                                                                int LA12_294 = input.LA(20);

                                                                                if ( (LA12_294=='u') ) {
                                                                                    int LA12_295 = input.LA(21);

                                                                                    if ( (LA12_295=='r') ) {
                                                                                        int LA12_296 = input.LA(22);

                                                                                        if ( (LA12_296=='a') ) {
                                                                                            int LA12_297 = input.LA(23);

                                                                                            if ( (LA12_297=='l') ) {
                                                                                                int LA12_298 = input.LA(24);

                                                                                                if ( ((LA12_298>='0' && LA12_298<='9')||(LA12_298>='A' && LA12_298<='Z')||LA12_298=='_'||(LA12_298>='a' && LA12_298<='z')) ) {
                                                                                                    return 35;
                                                                                                }
                                                                                                else {
                                                                                                    return 33;}
                                                                                            }
                                                                                            else {
                                                                                                return 35;}
                                                                                        }
                                                                                        else {
                                                                                            return 35;}
                                                                                    }
                                                                                    else {
                                                                                        return 35;}
                                                                                }
                                                                                else {
                                                                                    return 35;}
                                                                            }
                                                                            else {
                                                                                return 35;}
                                                                        }
                                                                        else {
                                                                            return 35;}
                                                                    }
                                                                    else {
                                                                        return 35;}
                                                                }
                                                                else {
                                                                    return 35;}
                                                            }
                                                            else {
                                                                return 35;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                case 'I':
                                    {
                                    int LA12_195 = input.LA(9);

                                    if ( (LA12_195=='n') ) {
                                        int LA12_214 = input.LA(10);

                                        if ( (LA12_214=='t') ) {
                                            int LA12_231 = input.LA(11);

                                            if ( (LA12_231=='e') ) {
                                                int LA12_246 = input.LA(12);

                                                if ( (LA12_246=='g') ) {
                                                    int LA12_257 = input.LA(13);

                                                    if ( (LA12_257=='e') ) {
                                                        int LA12_267 = input.LA(14);

                                                        if ( (LA12_267=='r') ) {
                                                            int LA12_276 = input.LA(15);

                                                            if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                                                return 35;
                                                            }
                                                            else {
                                                                return 29;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                case 'N':
                                    {
                                    int LA12_196 = input.LA(9);

                                    if ( (LA12_196=='u') ) {
                                        int LA12_215 = input.LA(10);

                                        if ( (LA12_215=='l') ) {
                                            int LA12_232 = input.LA(11);

                                            if ( (LA12_232=='l') ) {
                                                int LA12_247 = input.LA(12);

                                                if ( ((LA12_247>='0' && LA12_247<='9')||(LA12_247>='A' && LA12_247<='Z')||LA12_247=='_'||(LA12_247>='a' && LA12_247<='z')) ) {
                                                    return 35;
                                                }
                                                else {
                                                    return 34;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                case 'B':
                                    {
                                    int LA12_197 = input.LA(9);

                                    if ( (LA12_197=='o') ) {
                                        int LA12_216 = input.LA(10);

                                        if ( (LA12_216=='o') ) {
                                            int LA12_233 = input.LA(11);

                                            if ( (LA12_233=='l') ) {
                                                int LA12_248 = input.LA(12);

                                                if ( (LA12_248=='e') ) {
                                                    int LA12_259 = input.LA(13);

                                                    if ( (LA12_259=='a') ) {
                                                        int LA12_268 = input.LA(14);

                                                        if ( (LA12_268=='n') ) {
                                                            int LA12_277 = input.LA(15);

                                                            if ( ((LA12_277>='0' && LA12_277<='9')||(LA12_277>='A' && LA12_277<='Z')||LA12_277=='_'||(LA12_277>='a' && LA12_277<='z')) ) {
                                                                return 35;
                                                            }
                                                            else {
                                                                return 32;}
                                                        }
                                                        else {
                                                            return 35;}
                                                    }
                                                    else {
                                                        return 35;}
                                                }
                                                else {
                                                    return 35;}
                                            }
                                            else {
                                                return 35;}
                                        }
                                        else {
                                            return 35;}
                                    }
                                    else {
                                        return 35;}
                                    }
                                default:
                                    return 35;}

                            }
                            else {
                                return 35;}
                        }
                        else {
                            return 35;}
                    }
                    else {
                        return 35;}
                }
                else {
                    return 35;}
            }
            else {
                return 35;}
        }
        else {
            return 35;}
    }

    private int mTokensHelper020() throws RecognitionException {
        int LA12_20 = input.LA(2);

        if ( ((LA12_20>='A' && LA12_20<='Z')||LA12_20=='_'||(LA12_20>='a' && LA12_20<='z')) ) {
            return 35;
        }
        else {
            return 41;}
    }

    private int mTokensHelper021() throws RecognitionException {
        return 35;
    }

    private int mTokensHelper022() throws RecognitionException {
        return 36;
    }

    private int mTokensHelper023() throws RecognitionException {
        int LA12_23 = input.LA(2);

        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
            return 37;
        }
        else {
            return 41;}
    }

    private int mTokensHelper024() throws RecognitionException {
        int LA12_24 = input.LA(2);

        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
            return 37;
        }
        else {
            return 41;}
    }

    private int mTokensHelper025() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 39;
            }
        case '*':
            {
            return 38;
            }
        default:
            return 41;}

    }

    private int mTokensHelper026() throws RecognitionException {
        return 40;
    }

    private int mTokensHelper027() throws RecognitionException {
        return 41;
    }

    private int mTokensHelper028() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}