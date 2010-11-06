package ro.ubbcluj.cs.ealf.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ro.ubbcluj.cs.ealf.services.EAlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEAlfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'public'", "'private'", "'protected'", "'package'", "'sequential'", "'guarded'", "'concurrent'", "'{'", "'}'", "':'", "';'", "'('", "')'", "'class'", "'ownedAttribute'", "','", "'nestedClassifier'", "'ownedOperation'", "'LiteralInteger'", "'value'", "'name'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalEAlfParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g"; }


     
     	private EAlfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EAlfGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:62:1: ( ruleModel EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:70:1: ruleModel : ( ( rule__Model__Group__0 )? ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:74:2: ( ( ( rule__Model__Group__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:75:1: ( ( rule__Model__Group__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:75:1: ( ( rule__Model__Group__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:76:1: ( rule__Model__Group__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:77:1: ( rule__Model__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=17)||LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:77:2: rule__Model__Group__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
                    rule__Model__Group__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRulePackageableElement
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:89:1: entryRulePackageableElement : rulePackageableElement EOF ;
    public final void entryRulePackageableElement() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:90:1: ( rulePackageableElement EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:91:1: rulePackageableElement EOF
            {
             before(grammarAccess.getPackageableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement122);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackageableElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePackageableElement


    // $ANTLR start rulePackageableElement
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:98:1: rulePackageableElement : ( ( rule__PackageableElement__Alternatives ) ) ;
    public final void rulePackageableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:102:2: ( ( ( rule__PackageableElement__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:103:1: ( ( rule__PackageableElement__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:103:1: ( ( rule__PackageableElement__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:104:1: ( rule__PackageableElement__Alternatives )
            {
             before(grammarAccess.getPackageableElementAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:105:1: ( rule__PackageableElement__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:105:2: rule__PackageableElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PackageableElement__Alternatives_in_rulePackageableElement155);
            rule__PackageableElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPackageableElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePackageableElement


    // $ANTLR start entryRuleClassifier
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:123:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:124:1: ( ruleClassifier EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:125:1: ruleClassifier EOF
            {
             before(grammarAccess.getClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier188);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClassifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier195); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleClassifier


    // $ANTLR start ruleClassifier
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:132:1: ruleClassifier : ( ruleClass_Impl ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:136:2: ( ( ruleClass_Impl ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:137:1: ( ruleClass_Impl )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:137:1: ( ruleClass_Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:138:1: ruleClass_Impl
            {
             before(grammarAccess.getClassifierAccess().getClass_ImplParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_ruleClassifier221);
            ruleClass_Impl();
            _fsp--;

             after(grammarAccess.getClassifierAccess().getClass_ImplParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClassifier


    // $ANTLR start entryRuleProperty
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:151:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:152:1: ( ruleProperty EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:153:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty247);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:160:1: ruleProperty : ( ruleProperty_Impl ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:164:2: ( ( ruleProperty_Impl ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:165:1: ( ruleProperty_Impl )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:165:1: ( ruleProperty_Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:166:1: ruleProperty_Impl
            {
             before(grammarAccess.getPropertyAccess().getProperty_ImplParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_ruleProperty280);
            ruleProperty_Impl();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getProperty_ImplParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRulePackage_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:181:1: entryRulePackage_Impl : rulePackage_Impl EOF ;
    public final void entryRulePackage_Impl() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:182:1: ( rulePackage_Impl EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:183:1: rulePackage_Impl EOF
            {
             before(grammarAccess.getPackage_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl308);
            rulePackage_Impl();
            _fsp--;

             after(grammarAccess.getPackage_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl315); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePackage_Impl


    // $ANTLR start rulePackage_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:190:1: rulePackage_Impl : ( ( rule__Package_Impl__Group__0 ) ) ;
    public final void rulePackage_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:194:2: ( ( ( rule__Package_Impl__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:195:1: ( ( rule__Package_Impl__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:195:1: ( ( rule__Package_Impl__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:196:1: ( rule__Package_Impl__Group__0 )
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:197:1: ( rule__Package_Impl__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:197:2: rule__Package_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0_in_rulePackage_Impl341);
            rule__Package_Impl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePackage_Impl


    // $ANTLR start entryRuleProperty_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:209:1: entryRuleProperty_Impl : ruleProperty_Impl EOF ;
    public final void entryRuleProperty_Impl() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:210:1: ( ruleProperty_Impl EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:211:1: ruleProperty_Impl EOF
            {
             before(grammarAccess.getProperty_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl368);
            ruleProperty_Impl();
            _fsp--;

             after(grammarAccess.getProperty_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_Impl375); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty_Impl


    // $ANTLR start ruleProperty_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:218:1: ruleProperty_Impl : ( ( rule__Property_Impl__Group__0 ) ) ;
    public final void ruleProperty_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:222:2: ( ( ( rule__Property_Impl__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:223:1: ( ( rule__Property_Impl__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:223:1: ( ( rule__Property_Impl__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:224:1: ( rule__Property_Impl__Group__0 )
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:225:1: ( rule__Property_Impl__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:225:2: rule__Property_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0_in_ruleProperty_Impl401);
            rule__Property_Impl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty_Impl


    // $ANTLR start entryRuleOperation
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:237:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:238:1: ( ruleOperation EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:239:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation428);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation435); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:246:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:250:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:251:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:251:1: ( ( rule__Operation__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:252:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:253:1: ( rule__Operation__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:253:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation461);
            rule__Operation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleClass_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:265:1: entryRuleClass_Impl : ruleClass_Impl EOF ;
    public final void entryRuleClass_Impl() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:266:1: ( ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:267:1: ruleClass_Impl EOF
            {
             before(grammarAccess.getClass_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl488);
            ruleClass_Impl();
            _fsp--;

             after(grammarAccess.getClass_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl495); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleClass_Impl


    // $ANTLR start ruleClass_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:274:1: ruleClass_Impl : ( ( rule__Class_Impl__Group__0 ) ) ;
    public final void ruleClass_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:278:2: ( ( ( rule__Class_Impl__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:279:1: ( ( rule__Class_Impl__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:279:1: ( ( rule__Class_Impl__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:280:1: ( rule__Class_Impl__Group__0 )
            {
             before(grammarAccess.getClass_ImplAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:281:1: ( rule__Class_Impl__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:281:2: rule__Class_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl521);
            rule__Class_Impl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClass_Impl


    // $ANTLR start entryRuleInteger
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:293:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:294:1: ( ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:295:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger548);
            ruleInteger();
            _fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger555); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInteger


    // $ANTLR start ruleInteger
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:302:1: ruleInteger : ( 'Integer' ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:306:2: ( ( 'Integer' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:307:1: ( 'Integer' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:307:1: ( 'Integer' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:308:1: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleInteger582); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInteger


    // $ANTLR start entryRuleString0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:323:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:324:1: ( ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:325:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0610);
            ruleString0();
            _fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0617); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleString0


    // $ANTLR start ruleString0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:332:1: ruleString0 : ( ( rule__String0__Alternatives ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:336:2: ( ( ( rule__String0__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( ( rule__String0__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( ( rule__String0__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:338:1: ( rule__String0__Alternatives )
            {
             before(grammarAccess.getString0Access().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:339:1: ( rule__String0__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:339:2: rule__String0__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Alternatives_in_ruleString0643);
            rule__String0__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getString0Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleString0


    // $ANTLR start entryRuleBoolean
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:351:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:352:1: ( ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:353:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean670);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean677); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:360:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:364:2: ( ( 'Boolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:365:1: ( 'Boolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:365:1: ( 'Boolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:366:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolean704); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:381:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:382:1: ( ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:383:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural732);
            ruleUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural739); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUnlimitedNatural


    // $ANTLR start ruleUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:390:1: ruleUnlimitedNatural : ( 'UnlimitedNatural' ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:394:2: ( ( 'UnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( 'UnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:396:1: 'UnlimitedNatural'
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleUnlimitedNatural766); 
             after(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnlimitedNatural


    // $ANTLR start entryRuleEString
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:411:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:412:1: ( ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:413:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString794);
            ruleEString();
            _fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString801); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:420:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:424:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:425:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:425:1: ( ( rule__EString__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:426:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:427:1: ( rule__EString__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:427:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString827);
            rule__EString__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEString


    // $ANTLR start entryRuleLiteralInteger
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:441:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:442:1: ( ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:443:1: ruleLiteralInteger EOF
            {
             before(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger856);
            ruleLiteralInteger();
            _fsp--;

             after(grammarAccess.getLiteralIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger863); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteralInteger


    // $ANTLR start ruleLiteralInteger
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:450:1: ruleLiteralInteger : ( ( rule__LiteralInteger__Group__0 ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:454:2: ( ( ( rule__LiteralInteger__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:455:1: ( ( rule__LiteralInteger__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:455:1: ( ( rule__LiteralInteger__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:456:1: ( rule__LiteralInteger__Group__0 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:457:1: ( rule__LiteralInteger__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:457:2: rule__LiteralInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger889);
            rule__LiteralInteger__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLiteralIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralInteger


    // $ANTLR start entryRuleLiteralString
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:469:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:470:1: ( ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:471:1: ruleLiteralString EOF
            {
             before(grammarAccess.getLiteralStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString916);
            ruleLiteralString();
            _fsp--;

             after(grammarAccess.getLiteralStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString923); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteralString


    // $ANTLR start ruleLiteralString
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:478:1: ruleLiteralString : ( ( rule__LiteralString__Group__0 ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:482:2: ( ( ( rule__LiteralString__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:483:1: ( ( rule__LiteralString__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:483:1: ( ( rule__LiteralString__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:484:1: ( rule__LiteralString__Group__0 )
            {
             before(grammarAccess.getLiteralStringAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:1: ( rule__LiteralString__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:2: rule__LiteralString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString949);
            rule__LiteralString__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLiteralStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralString


    // $ANTLR start entryRuleLiteralBoolean
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:497:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:498:1: ( ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:499:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean976);
            ruleLiteralBoolean();
            _fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean983); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteralBoolean


    // $ANTLR start ruleLiteralBoolean
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:506:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__Group__0 ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:510:2: ( ( ( rule__LiteralBoolean__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:511:1: ( ( rule__LiteralBoolean__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:511:1: ( ( rule__LiteralBoolean__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:512:1: ( rule__LiteralBoolean__Group__0 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:1: ( rule__LiteralBoolean__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:2: rule__LiteralBoolean__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1009);
            rule__LiteralBoolean__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralBoolean


    // $ANTLR start entryRuleLiteralUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:525:1: entryRuleLiteralUnlimitedNatural : ruleLiteralUnlimitedNatural EOF ;
    public final void entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:526:1: ( ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:527:1: ruleLiteralUnlimitedNatural EOF
            {
             before(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1036);
            ruleLiteralUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1043); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteralUnlimitedNatural


    // $ANTLR start ruleLiteralUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:534:1: ruleLiteralUnlimitedNatural : ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) ;
    public final void ruleLiteralUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:538:2: ( ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:539:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:539:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:540:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:2: rule__LiteralUnlimitedNatural__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1069);
            rule__LiteralUnlimitedNatural__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralUnlimitedNatural


    // $ANTLR start entryRuleLiteralNull
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:553:1: entryRuleLiteralNull : ruleLiteralNull EOF ;
    public final void entryRuleLiteralNull() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:554:1: ( ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:555:1: ruleLiteralNull EOF
            {
             before(grammarAccess.getLiteralNullRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1096);
            ruleLiteralNull();
            _fsp--;

             after(grammarAccess.getLiteralNullRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull1103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteralNull


    // $ANTLR start ruleLiteralNull
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:562:1: ruleLiteralNull : ( ( rule__LiteralNull__Group__0 ) ) ;
    public final void ruleLiteralNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:566:2: ( ( ( rule__LiteralNull__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:567:1: ( ( rule__LiteralNull__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:567:1: ( ( rule__LiteralNull__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:568:1: ( rule__LiteralNull__Group__0 )
            {
             before(grammarAccess.getLiteralNullAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:1: ( rule__LiteralNull__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:2: rule__LiteralNull__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1129);
            rule__LiteralNull__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLiteralNullAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralNull


    // $ANTLR start ruleVisibilityKind
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:582:1: ruleVisibilityKind : ( ( rule__VisibilityKind__Alternatives ) ) ;
    public final void ruleVisibilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:586:1: ( ( ( rule__VisibilityKind__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:587:1: ( ( rule__VisibilityKind__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:587:1: ( ( rule__VisibilityKind__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:588:1: ( rule__VisibilityKind__Alternatives )
            {
             before(grammarAccess.getVisibilityKindAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:589:1: ( rule__VisibilityKind__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:589:2: rule__VisibilityKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1166);
            rule__VisibilityKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVisibilityKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVisibilityKind


    // $ANTLR start ruleCallConcurrencyKind
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:605:1: ruleCallConcurrencyKind : ( ( rule__CallConcurrencyKind__Alternatives ) ) ;
    public final void ruleCallConcurrencyKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:609:1: ( ( ( rule__CallConcurrencyKind__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:610:1: ( ( rule__CallConcurrencyKind__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:610:1: ( ( rule__CallConcurrencyKind__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:611:1: ( rule__CallConcurrencyKind__Alternatives )
            {
             before(grammarAccess.getCallConcurrencyKindAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:612:1: ( rule__CallConcurrencyKind__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:612:2: rule__CallConcurrencyKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CallConcurrencyKind__Alternatives_in_ruleCallConcurrencyKind1206);
            rule__CallConcurrencyKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCallConcurrencyKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCallConcurrencyKind


    // $ANTLR start rule__PackageableElement__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:623:1: rule__PackageableElement__Alternatives : ( ( rulePackage_Impl ) | ( ruleClass_Impl ) );
    public final void rule__PackageableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:627:1: ( ( rulePackage_Impl ) | ( ruleClass_Impl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_STRING && LA2_1<=RULE_ID)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==27) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("623:1: rule__PackageableElement__Alternatives : ( ( rulePackage_Impl ) | ( ruleClass_Impl ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=14 && LA2_0<=16)||LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("623:1: rule__PackageableElement__Alternatives : ( ( rulePackage_Impl ) | ( ruleClass_Impl ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:628:1: ( rulePackage_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:628:1: ( rulePackage_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:629:1: rulePackage_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1241);
                    rulePackage_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:634:6: ( ruleClass_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:634:6: ( ruleClass_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:635:1: ruleClass_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1258);
                    ruleClass_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageableElement__Alternatives


    // $ANTLR start rule__String0__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:645:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__String0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:649:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("645:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:650:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:650:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:651:1: RULE_STRING
                    {
                     before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__Alternatives1290); 
                     after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:656:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:656:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:657:1: RULE_ID
                    {
                     before(grammarAccess.getString0Access().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__String0__Alternatives1307); 
                     after(grammarAccess.getString0Access().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__String0__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:667:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:671:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("667:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:672:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:672:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:673:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1339); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:678:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:678:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:679:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1356); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EString__Alternatives


    // $ANTLR start rule__VisibilityKind__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:690:1: rule__VisibilityKind__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'package' ) ) );
    public final void rule__VisibilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:694:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'package' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("690:1: rule__VisibilityKind__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'package' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:695:1: ( ( 'public' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:695:1: ( ( 'public' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:696:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:697:1: ( 'public' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:697:3: 'public'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__VisibilityKind__Alternatives1390); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:702:6: ( ( 'private' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:702:6: ( ( 'private' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:703:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:704:1: ( 'private' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:704:3: 'private'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__VisibilityKind__Alternatives1411); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:709:6: ( ( 'protected' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:709:6: ( ( 'protected' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:710:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:711:1: ( 'protected' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:711:3: 'protected'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__VisibilityKind__Alternatives1432); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:716:6: ( ( 'package' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:716:6: ( ( 'package' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:717:1: ( 'package' )
                    {
                     before(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:718:1: ( 'package' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:718:3: 'package'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__VisibilityKind__Alternatives1453); 

                    }

                     after(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VisibilityKind__Alternatives


    // $ANTLR start rule__CallConcurrencyKind__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:730:1: rule__CallConcurrencyKind__Alternatives : ( ( ( 'sequential' ) ) | ( ( 'guarded' ) ) | ( ( 'concurrent' ) ) );
    public final void rule__CallConcurrencyKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:734:1: ( ( ( 'sequential' ) ) | ( ( 'guarded' ) ) | ( ( 'concurrent' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("730:1: rule__CallConcurrencyKind__Alternatives : ( ( ( 'sequential' ) ) | ( ( 'guarded' ) ) | ( ( 'concurrent' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:735:1: ( ( 'sequential' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:735:1: ( ( 'sequential' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:736:1: ( 'sequential' )
                    {
                     before(grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:737:1: ( 'sequential' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:737:3: 'sequential'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__CallConcurrencyKind__Alternatives1491); 

                    }

                     after(grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:742:6: ( ( 'guarded' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:742:6: ( ( 'guarded' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:743:1: ( 'guarded' )
                    {
                     before(grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:744:1: ( 'guarded' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:744:3: 'guarded'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__CallConcurrencyKind__Alternatives1512); 

                    }

                     after(grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:749:6: ( ( 'concurrent' ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:749:6: ( ( 'concurrent' ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:750:1: ( 'concurrent' )
                    {
                     before(grammarAccess.getCallConcurrencyKindAccess().getConcurrentEnumLiteralDeclaration_2()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:751:1: ( 'concurrent' )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:751:3: 'concurrent'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__CallConcurrencyKind__Alternatives1533); 

                    }

                     after(grammarAccess.getCallConcurrencyKindAccess().getConcurrentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CallConcurrencyKind__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:763:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:767:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:768:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01566);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01569);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:775:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackagedElementAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:779:1: ( ( ( rule__Model__PackagedElementAssignment_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:780:1: ( ( rule__Model__PackagedElementAssignment_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:780:1: ( ( rule__Model__PackagedElementAssignment_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:781:1: ( rule__Model__PackagedElementAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:782:1: ( rule__Model__PackagedElementAssignment_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:782:2: rule__Model__PackagedElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_0_in_rule__Model__Group__0__Impl1596);
            rule__Model__PackagedElementAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:792:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:796:1: ( rule__Model__Group__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:797:2: rule__Model__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11626);
            rule__Model__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:803:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackagedElementAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:807:1: ( ( ( rule__Model__PackagedElementAssignment_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:808:1: ( ( rule__Model__PackagedElementAssignment_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:808:1: ( ( rule__Model__PackagedElementAssignment_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:809:1: ( rule__Model__PackagedElementAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:810:1: ( rule__Model__PackagedElementAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=17)||LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:810:2: rule__Model__PackagedElementAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_1_in_rule__Model__Group__1__Impl1653);
            	    rule__Model__PackagedElementAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Package_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:824:1: rule__Package_Impl__Group__0 : rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 ;
    public final void rule__Package_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:828:1: ( rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:829:2: rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__01688);
            rule__Package_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__01691);
            rule__Package_Impl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__0


    // $ANTLR start rule__Package_Impl__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:836:1: rule__Package_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Package_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:840:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:841:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:841:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:842:1: ()
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:843:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:845:1: 
            {
            }

             after(grammarAccess.getPackage_ImplAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__0__Impl


    // $ANTLR start rule__Package_Impl__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:855:1: rule__Package_Impl__Group__1 : rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 ;
    public final void rule__Package_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:859:1: ( rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:860:2: rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__11749);
            rule__Package_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__11752);
            rule__Package_Impl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__1


    // $ANTLR start rule__Package_Impl__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:867:1: rule__Package_Impl__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:871:1: ( ( 'package' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:872:1: ( 'package' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:872:1: ( 'package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:873:1: 'package'
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package_Impl__Group__1__Impl1780); 
             after(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__1__Impl


    // $ANTLR start rule__Package_Impl__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:886:1: rule__Package_Impl__Group__2 : rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 ;
    public final void rule__Package_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:890:1: ( rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:891:2: rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__21811);
            rule__Package_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__21814);
            rule__Package_Impl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__2


    // $ANTLR start rule__Package_Impl__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:898:1: rule__Package_Impl__Group__2__Impl : ( ( rule__Package_Impl__NameAssignment_2 ) ) ;
    public final void rule__Package_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:902:1: ( ( ( rule__Package_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:903:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:903:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:904:1: ( rule__Package_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getPackage_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:905:1: ( rule__Package_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:905:2: rule__Package_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl1841);
            rule__Package_Impl__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__2__Impl


    // $ANTLR start rule__Package_Impl__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:915:1: rule__Package_Impl__Group__3 : rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 ;
    public final void rule__Package_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:919:1: ( rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:920:2: rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__31871);
            rule__Package_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__31874);
            rule__Package_Impl__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__3


    // $ANTLR start rule__Package_Impl__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:927:1: rule__Package_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Package_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:931:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:932:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:932:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:933:1: '{'
            {
             before(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package_Impl__Group__3__Impl1902); 
             after(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__3__Impl


    // $ANTLR start rule__Package_Impl__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:946:1: rule__Package_Impl__Group__4 : rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 ;
    public final void rule__Package_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:950:1: ( rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:951:2: rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__41933);
            rule__Package_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__41936);
            rule__Package_Impl__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__4


    // $ANTLR start rule__Package_Impl__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:958:1: rule__Package_Impl__Group__4__Impl : ( ( rule__Package_Impl__Group_4__0 )? ) ;
    public final void rule__Package_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:962:1: ( ( ( rule__Package_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:963:1: ( ( rule__Package_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:963:1: ( ( rule__Package_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:964:1: ( rule__Package_Impl__Group_4__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:965:1: ( rule__Package_Impl__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)||LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:965:2: rule__Package_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl1963);
                    rule__Package_Impl__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackage_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__4__Impl


    // $ANTLR start rule__Package_Impl__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:975:1: rule__Package_Impl__Group__5 : rule__Package_Impl__Group__5__Impl ;
    public final void rule__Package_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:979:1: ( rule__Package_Impl__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:980:2: rule__Package_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__51994);
            rule__Package_Impl__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__5


    // $ANTLR start rule__Package_Impl__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:986:1: rule__Package_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Package_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:990:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:991:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:991:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:992:1: '}'
            {
             before(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package_Impl__Group__5__Impl2022); 
             after(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__5__Impl


    // $ANTLR start rule__Package_Impl__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1017:1: rule__Package_Impl__Group_4__0 : rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 ;
    public final void rule__Package_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1021:1: ( rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1022:2: rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02065);
            rule__Package_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02068);
            rule__Package_Impl__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_4__0


    // $ANTLR start rule__Package_Impl__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1029:1: rule__Package_Impl__Group_4__0__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) ;
    public final void rule__Package_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1033:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1034:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1034:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1035:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1036:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1036:2: rule__Package_Impl__PackagedElementAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2095);
            rule__Package_Impl__PackagedElementAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_4__0__Impl


    // $ANTLR start rule__Package_Impl__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1046:1: rule__Package_Impl__Group_4__1 : rule__Package_Impl__Group_4__1__Impl ;
    public final void rule__Package_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1050:1: ( rule__Package_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1051:2: rule__Package_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12125);
            rule__Package_Impl__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_4__1


    // $ANTLR start rule__Package_Impl__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1057:1: rule__Package_Impl__Group_4__1__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) ;
    public final void rule__Package_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1061:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1062:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1062:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1063:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1064:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=17)||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1064:2: rule__Package_Impl__PackagedElementAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2152);
            	    rule__Package_Impl__PackagedElementAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_4__1__Impl


    // $ANTLR start rule__Property_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1078:1: rule__Property_Impl__Group__0 : rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 ;
    public final void rule__Property_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1082:1: ( rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1083:2: rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02187);
            rule__Property_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02190);
            rule__Property_Impl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__0


    // $ANTLR start rule__Property_Impl__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1090:1: rule__Property_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Property_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1094:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1095:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1095:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1096:1: ()
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1097:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1099:1: 
            {
            }

             after(grammarAccess.getProperty_ImplAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__0__Impl


    // $ANTLR start rule__Property_Impl__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1109:1: rule__Property_Impl__Group__1 : rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 ;
    public final void rule__Property_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1113:1: ( rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1114:2: rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12248);
            rule__Property_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12251);
            rule__Property_Impl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__1


    // $ANTLR start rule__Property_Impl__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1121:1: rule__Property_Impl__Group__1__Impl : ( ( rule__Property_Impl__VisibilityAssignment_1 )? ) ;
    public final void rule__Property_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1125:1: ( ( ( rule__Property_Impl__VisibilityAssignment_1 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1126:1: ( ( rule__Property_Impl__VisibilityAssignment_1 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1126:1: ( ( rule__Property_Impl__VisibilityAssignment_1 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1127:1: ( rule__Property_Impl__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getVisibilityAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1128:1: ( rule__Property_Impl__VisibilityAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=14 && LA10_0<=17)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1128:2: rule__Property_Impl__VisibilityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__VisibilityAssignment_1_in_rule__Property_Impl__Group__1__Impl2278);
                    rule__Property_Impl__VisibilityAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProperty_ImplAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__1__Impl


    // $ANTLR start rule__Property_Impl__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1138:1: rule__Property_Impl__Group__2 : rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 ;
    public final void rule__Property_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1142:1: ( rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1143:2: rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22309);
            rule__Property_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22312);
            rule__Property_Impl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__2


    // $ANTLR start rule__Property_Impl__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1150:1: rule__Property_Impl__Group__2__Impl : ( ( rule__Property_Impl__NameAssignment_2 ) ) ;
    public final void rule__Property_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1154:1: ( ( ( rule__Property_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1155:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1155:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1156:1: ( rule__Property_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getProperty_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1157:1: ( rule__Property_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1157:2: rule__Property_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2339);
            rule__Property_Impl__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__2__Impl


    // $ANTLR start rule__Property_Impl__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1167:1: rule__Property_Impl__Group__3 : rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 ;
    public final void rule__Property_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1171:1: ( rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1172:2: rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32369);
            rule__Property_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__32372);
            rule__Property_Impl__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__3


    // $ANTLR start rule__Property_Impl__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1179:1: rule__Property_Impl__Group__3__Impl : ( ':' ) ;
    public final void rule__Property_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1183:1: ( ( ':' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1184:1: ( ':' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1184:1: ( ':' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1185:1: ':'
            {
             before(grammarAccess.getProperty_ImplAccess().getColonKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Property_Impl__Group__3__Impl2400); 
             after(grammarAccess.getProperty_ImplAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__3__Impl


    // $ANTLR start rule__Property_Impl__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1198:1: rule__Property_Impl__Group__4 : rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5 ;
    public final void rule__Property_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1202:1: ( rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1203:2: rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__42431);
            rule__Property_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__5_in_rule__Property_Impl__Group__42434);
            rule__Property_Impl__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__4


    // $ANTLR start rule__Property_Impl__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1210:1: rule__Property_Impl__Group__4__Impl : ( ( rule__Property_Impl__TypeAssignment_4 ) ) ;
    public final void rule__Property_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1214:1: ( ( ( rule__Property_Impl__TypeAssignment_4 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1215:1: ( ( rule__Property_Impl__TypeAssignment_4 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1215:1: ( ( rule__Property_Impl__TypeAssignment_4 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1216:1: ( rule__Property_Impl__TypeAssignment_4 )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeAssignment_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1217:1: ( rule__Property_Impl__TypeAssignment_4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1217:2: rule__Property_Impl__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__TypeAssignment_4_in_rule__Property_Impl__Group__4__Impl2461);
            rule__Property_Impl__TypeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__4__Impl


    // $ANTLR start rule__Property_Impl__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1227:1: rule__Property_Impl__Group__5 : rule__Property_Impl__Group__5__Impl ;
    public final void rule__Property_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1231:1: ( rule__Property_Impl__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1232:2: rule__Property_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__5__Impl_in_rule__Property_Impl__Group__52491);
            rule__Property_Impl__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__5


    // $ANTLR start rule__Property_Impl__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1238:1: rule__Property_Impl__Group__5__Impl : ( ';' ) ;
    public final void rule__Property_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1242:1: ( ( ';' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1243:1: ( ';' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1243:1: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1244:1: ';'
            {
             before(grammarAccess.getProperty_ImplAccess().getSemicolonKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Property_Impl__Group__5__Impl2519); 
             after(grammarAccess.getProperty_ImplAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__5__Impl


    // $ANTLR start rule__Operation__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1269:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1273:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1274:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02562);
            rule__Operation__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02565);
            rule__Operation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__0


    // $ANTLR start rule__Operation__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1281:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1285:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1286:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1286:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1287:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1288:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1290:1: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__0__Impl


    // $ANTLR start rule__Operation__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1300:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1304:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1305:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12623);
            rule__Operation__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12626);
            rule__Operation__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__1


    // $ANTLR start rule__Operation__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1312:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__VisibilityAssignment_1 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1316:1: ( ( ( rule__Operation__VisibilityAssignment_1 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1317:1: ( ( rule__Operation__VisibilityAssignment_1 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1317:1: ( ( rule__Operation__VisibilityAssignment_1 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1318:1: ( rule__Operation__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1319:1: ( rule__Operation__VisibilityAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=14 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1319:2: rule__Operation__VisibilityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__VisibilityAssignment_1_in_rule__Operation__Group__1__Impl2653);
                    rule__Operation__VisibilityAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__1__Impl


    // $ANTLR start rule__Operation__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1329:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1333:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1334:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22684);
            rule__Operation__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22687);
            rule__Operation__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__2


    // $ANTLR start rule__Operation__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1341:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__ConcurrencyAssignment_2 )? ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1345:1: ( ( ( rule__Operation__ConcurrencyAssignment_2 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1346:1: ( ( rule__Operation__ConcurrencyAssignment_2 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1346:1: ( ( rule__Operation__ConcurrencyAssignment_2 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1347:1: ( rule__Operation__ConcurrencyAssignment_2 )?
            {
             before(grammarAccess.getOperationAccess().getConcurrencyAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1348:1: ( rule__Operation__ConcurrencyAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=20)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1348:2: rule__Operation__ConcurrencyAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__ConcurrencyAssignment_2_in_rule__Operation__Group__2__Impl2714);
                    rule__Operation__ConcurrencyAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getConcurrencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__2__Impl


    // $ANTLR start rule__Operation__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1358:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1362:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1363:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32745);
            rule__Operation__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32748);
            rule__Operation__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__3


    // $ANTLR start rule__Operation__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1370:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__NameAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1374:1: ( ( ( rule__Operation__NameAssignment_3 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1375:1: ( ( rule__Operation__NameAssignment_3 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1375:1: ( ( rule__Operation__NameAssignment_3 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1376:1: ( rule__Operation__NameAssignment_3 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1377:1: ( rule__Operation__NameAssignment_3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1377:2: rule__Operation__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_3_in_rule__Operation__Group__3__Impl2775);
            rule__Operation__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__3__Impl


    // $ANTLR start rule__Operation__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1387:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1391:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1392:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42805);
            rule__Operation__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42808);
            rule__Operation__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__4


    // $ANTLR start rule__Operation__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1399:1: rule__Operation__Group__4__Impl : ( '(' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1403:1: ( ( '(' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1404:1: ( '(' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1404:1: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1405:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Operation__Group__4__Impl2836); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__4__Impl


    // $ANTLR start rule__Operation__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1418:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1422:1: ( rule__Operation__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1423:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52867);
            rule__Operation__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__5


    // $ANTLR start rule__Operation__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1429:1: rule__Operation__Group__5__Impl : ( ')' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1433:1: ( ( ')' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1434:1: ( ')' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1434:1: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1435:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Operation__Group__5__Impl2895); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__5__Impl


    // $ANTLR start rule__Class_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1460:1: rule__Class_Impl__Group__0 : rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 ;
    public final void rule__Class_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1464:1: ( rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1465:2: rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__02938);
            rule__Class_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__02941);
            rule__Class_Impl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__0


    // $ANTLR start rule__Class_Impl__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1472:1: rule__Class_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Class_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1476:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1477:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1477:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1478:1: ()
            {
             before(grammarAccess.getClass_ImplAccess().getClassAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1479:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1481:1: 
            {
            }

             after(grammarAccess.getClass_ImplAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__0__Impl


    // $ANTLR start rule__Class_Impl__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1491:1: rule__Class_Impl__Group__1 : rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 ;
    public final void rule__Class_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1495:1: ( rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1496:2: rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__12999);
            rule__Class_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__13002);
            rule__Class_Impl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__1


    // $ANTLR start rule__Class_Impl__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1503:1: rule__Class_Impl__Group__1__Impl : ( ( rule__Class_Impl__VisibilityAssignment_1 )? ) ;
    public final void rule__Class_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1507:1: ( ( ( rule__Class_Impl__VisibilityAssignment_1 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1508:1: ( ( rule__Class_Impl__VisibilityAssignment_1 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1508:1: ( ( rule__Class_Impl__VisibilityAssignment_1 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1509:1: ( rule__Class_Impl__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getClass_ImplAccess().getVisibilityAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1510:1: ( rule__Class_Impl__VisibilityAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=17)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1510:2: rule__Class_Impl__VisibilityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__VisibilityAssignment_1_in_rule__Class_Impl__Group__1__Impl3029);
                    rule__Class_Impl__VisibilityAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__1__Impl


    // $ANTLR start rule__Class_Impl__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1520:1: rule__Class_Impl__Group__2 : rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 ;
    public final void rule__Class_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1524:1: ( rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1525:2: rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__23060);
            rule__Class_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__23063);
            rule__Class_Impl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__2


    // $ANTLR start rule__Class_Impl__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1532:1: rule__Class_Impl__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1536:1: ( ( 'class' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1537:1: ( 'class' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1537:1: ( 'class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1538:1: 'class'
            {
             before(grammarAccess.getClass_ImplAccess().getClassKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Class_Impl__Group__2__Impl3091); 
             after(grammarAccess.getClass_ImplAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__2__Impl


    // $ANTLR start rule__Class_Impl__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1551:1: rule__Class_Impl__Group__3 : rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 ;
    public final void rule__Class_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1555:1: ( rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1556:2: rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__33122);
            rule__Class_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__33125);
            rule__Class_Impl__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__3


    // $ANTLR start rule__Class_Impl__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1563:1: rule__Class_Impl__Group__3__Impl : ( ( rule__Class_Impl__NameAssignment_3 ) ) ;
    public final void rule__Class_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1567:1: ( ( ( rule__Class_Impl__NameAssignment_3 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1568:1: ( ( rule__Class_Impl__NameAssignment_3 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1568:1: ( ( rule__Class_Impl__NameAssignment_3 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1569:1: ( rule__Class_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getClass_ImplAccess().getNameAssignment_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1570:1: ( rule__Class_Impl__NameAssignment_3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1570:2: rule__Class_Impl__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NameAssignment_3_in_rule__Class_Impl__Group__3__Impl3152);
            rule__Class_Impl__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__3__Impl


    // $ANTLR start rule__Class_Impl__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1580:1: rule__Class_Impl__Group__4 : rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 ;
    public final void rule__Class_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1584:1: ( rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1585:2: rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__43182);
            rule__Class_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__43185);
            rule__Class_Impl__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__4


    // $ANTLR start rule__Class_Impl__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1592:1: rule__Class_Impl__Group__4__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1596:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1597:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1597:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1598:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Class_Impl__Group__4__Impl3213); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__4__Impl


    // $ANTLR start rule__Class_Impl__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1611:1: rule__Class_Impl__Group__5 : rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 ;
    public final void rule__Class_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1615:1: ( rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1616:2: rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__53244);
            rule__Class_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__53247);
            rule__Class_Impl__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__5


    // $ANTLR start rule__Class_Impl__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1623:1: rule__Class_Impl__Group__5__Impl : ( ( rule__Class_Impl__Group_5__0 )? ) ;
    public final void rule__Class_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1627:1: ( ( ( rule__Class_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1628:1: ( ( rule__Class_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1628:1: ( ( rule__Class_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1629:1: ( rule__Class_Impl__Group_5__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1630:1: ( rule__Class_Impl__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1630:2: rule__Class_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl3274);
                    rule__Class_Impl__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__5__Impl


    // $ANTLR start rule__Class_Impl__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1640:1: rule__Class_Impl__Group__6 : rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 ;
    public final void rule__Class_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1644:1: ( rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1645:2: rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__63305);
            rule__Class_Impl__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__63308);
            rule__Class_Impl__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__6


    // $ANTLR start rule__Class_Impl__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1652:1: rule__Class_Impl__Group__6__Impl : ( ( rule__Class_Impl__Group_6__0 )? ) ;
    public final void rule__Class_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1656:1: ( ( ( rule__Class_Impl__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1657:1: ( ( rule__Class_Impl__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1657:1: ( ( rule__Class_Impl__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1658:1: ( rule__Class_Impl__Group_6__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1659:1: ( rule__Class_Impl__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1659:2: rule__Class_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl3335);
                    rule__Class_Impl__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__6__Impl


    // $ANTLR start rule__Class_Impl__Group__7
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1669:1: rule__Class_Impl__Group__7 : rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8 ;
    public final void rule__Class_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1673:1: ( rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1674:2: rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__73366);
            rule__Class_Impl__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__8_in_rule__Class_Impl__Group__73369);
            rule__Class_Impl__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__7


    // $ANTLR start rule__Class_Impl__Group__7__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1681:1: rule__Class_Impl__Group__7__Impl : ( ( rule__Class_Impl__Group_7__0 )? ) ;
    public final void rule__Class_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1685:1: ( ( ( rule__Class_Impl__Group_7__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1686:1: ( ( rule__Class_Impl__Group_7__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1686:1: ( ( rule__Class_Impl__Group_7__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1687:1: ( rule__Class_Impl__Group_7__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_7()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1688:1: ( rule__Class_Impl__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1688:2: rule__Class_Impl__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__0_in_rule__Class_Impl__Group__7__Impl3396);
                    rule__Class_Impl__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__7__Impl


    // $ANTLR start rule__Class_Impl__Group__8
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1698:1: rule__Class_Impl__Group__8 : rule__Class_Impl__Group__8__Impl ;
    public final void rule__Class_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1702:1: ( rule__Class_Impl__Group__8__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1703:2: rule__Class_Impl__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__8__Impl_in_rule__Class_Impl__Group__83427);
            rule__Class_Impl__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__8


    // $ANTLR start rule__Class_Impl__Group__8__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1709:1: rule__Class_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1713:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1714:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1714:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1715:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group__8__Impl3455); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__8__Impl


    // $ANTLR start rule__Class_Impl__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1746:1: rule__Class_Impl__Group_5__0 : rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 ;
    public final void rule__Class_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1750:1: ( rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1751:2: rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__03504);
            rule__Class_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__03507);
            rule__Class_Impl__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__0


    // $ANTLR start rule__Class_Impl__Group_5__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1758:1: rule__Class_Impl__Group_5__0__Impl : ( 'ownedAttribute' ) ;
    public final void rule__Class_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1762:1: ( ( 'ownedAttribute' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1763:1: ( 'ownedAttribute' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1763:1: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1764:1: 'ownedAttribute'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Class_Impl__Group_5__0__Impl3535); 
             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__0__Impl


    // $ANTLR start rule__Class_Impl__Group_5__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1777:1: rule__Class_Impl__Group_5__1 : rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 ;
    public final void rule__Class_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1781:1: ( rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1782:2: rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__13566);
            rule__Class_Impl__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__13569);
            rule__Class_Impl__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__1


    // $ANTLR start rule__Class_Impl__Group_5__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1789:1: rule__Class_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1793:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1794:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1794:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1795:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Class_Impl__Group_5__1__Impl3597); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__1__Impl


    // $ANTLR start rule__Class_Impl__Group_5__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1808:1: rule__Class_Impl__Group_5__2 : rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 ;
    public final void rule__Class_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1812:1: ( rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1813:2: rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__23628);
            rule__Class_Impl__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__23631);
            rule__Class_Impl__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__2


    // $ANTLR start rule__Class_Impl__Group_5__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1820:1: rule__Class_Impl__Group_5__2__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_5_2 ) ) ;
    public final void rule__Class_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1824:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_5_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1825:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_5_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1825:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_5_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1826:1: ( rule__Class_Impl__OwnedAttributeAssignment_5_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_5_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1827:1: ( rule__Class_Impl__OwnedAttributeAssignment_5_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1827:2: rule__Class_Impl__OwnedAttributeAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl3658);
            rule__Class_Impl__OwnedAttributeAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__2__Impl


    // $ANTLR start rule__Class_Impl__Group_5__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1837:1: rule__Class_Impl__Group_5__3 : rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 ;
    public final void rule__Class_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1841:1: ( rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1842:2: rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__33688);
            rule__Class_Impl__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__33691);
            rule__Class_Impl__Group_5__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__3


    // $ANTLR start rule__Class_Impl__Group_5__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1849:1: rule__Class_Impl__Group_5__3__Impl : ( ( rule__Class_Impl__Group_5_3__0 )* ) ;
    public final void rule__Class_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1853:1: ( ( ( rule__Class_Impl__Group_5_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1854:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1854:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1855:1: ( rule__Class_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1856:1: ( rule__Class_Impl__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1856:2: rule__Class_Impl__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl3718);
            	    rule__Class_Impl__Group_5_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__3__Impl


    // $ANTLR start rule__Class_Impl__Group_5__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1866:1: rule__Class_Impl__Group_5__4 : rule__Class_Impl__Group_5__4__Impl ;
    public final void rule__Class_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1870:1: ( rule__Class_Impl__Group_5__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1871:2: rule__Class_Impl__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__43749);
            rule__Class_Impl__Group_5__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__4


    // $ANTLR start rule__Class_Impl__Group_5__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1877:1: rule__Class_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1881:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1882:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1882:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1883:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_5__4__Impl3777); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5__4__Impl


    // $ANTLR start rule__Class_Impl__Group_5_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1906:1: rule__Class_Impl__Group_5_3__0 : rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 ;
    public final void rule__Class_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1910:1: ( rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1911:2: rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__03818);
            rule__Class_Impl__Group_5_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__03821);
            rule__Class_Impl__Group_5_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5_3__0


    // $ANTLR start rule__Class_Impl__Group_5_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1918:1: rule__Class_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1922:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1923:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1923:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1924:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Class_Impl__Group_5_3__0__Impl3849); 
             after(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_5_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1937:1: rule__Class_Impl__Group_5_3__1 : rule__Class_Impl__Group_5_3__1__Impl ;
    public final void rule__Class_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1941:1: ( rule__Class_Impl__Group_5_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1942:2: rule__Class_Impl__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__13880);
            rule__Class_Impl__Group_5_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5_3__1


    // $ANTLR start rule__Class_Impl__Group_5_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1948:1: rule__Class_Impl__Group_5_3__1__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 ) ) ;
    public final void rule__Class_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1952:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1953:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1953:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1954:1: ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_5_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1955:1: ( rule__Class_Impl__OwnedAttributeAssignment_5_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1955:2: rule__Class_Impl__OwnedAttributeAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl3907);
            rule__Class_Impl__OwnedAttributeAssignment_5_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_5_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group_6__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1969:1: rule__Class_Impl__Group_6__0 : rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 ;
    public final void rule__Class_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1973:1: ( rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1974:2: rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__03941);
            rule__Class_Impl__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__03944);
            rule__Class_Impl__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__0


    // $ANTLR start rule__Class_Impl__Group_6__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1981:1: rule__Class_Impl__Group_6__0__Impl : ( 'nestedClassifier' ) ;
    public final void rule__Class_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1985:1: ( ( 'nestedClassifier' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1986:1: ( 'nestedClassifier' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1986:1: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1987:1: 'nestedClassifier'
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Class_Impl__Group_6__0__Impl3972); 
             after(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__0__Impl


    // $ANTLR start rule__Class_Impl__Group_6__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2000:1: rule__Class_Impl__Group_6__1 : rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 ;
    public final void rule__Class_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2004:1: ( rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2005:2: rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__14003);
            rule__Class_Impl__Group_6__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__14006);
            rule__Class_Impl__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__1


    // $ANTLR start rule__Class_Impl__Group_6__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2012:1: rule__Class_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2016:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2017:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2017:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2018:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Class_Impl__Group_6__1__Impl4034); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__1__Impl


    // $ANTLR start rule__Class_Impl__Group_6__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2031:1: rule__Class_Impl__Group_6__2 : rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 ;
    public final void rule__Class_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2035:1: ( rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2036:2: rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__24065);
            rule__Class_Impl__Group_6__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__24068);
            rule__Class_Impl__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__2


    // $ANTLR start rule__Class_Impl__Group_6__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2043:1: rule__Class_Impl__Group_6__2__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_6_2 ) ) ;
    public final void rule__Class_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2047:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_6_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2048:1: ( ( rule__Class_Impl__NestedClassifierAssignment_6_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2048:1: ( ( rule__Class_Impl__NestedClassifierAssignment_6_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2049:1: ( rule__Class_Impl__NestedClassifierAssignment_6_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_6_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:1: ( rule__Class_Impl__NestedClassifierAssignment_6_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:2: rule__Class_Impl__NestedClassifierAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl4095);
            rule__Class_Impl__NestedClassifierAssignment_6_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__2__Impl


    // $ANTLR start rule__Class_Impl__Group_6__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2060:1: rule__Class_Impl__Group_6__3 : rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 ;
    public final void rule__Class_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2064:1: ( rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2065:2: rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__34125);
            rule__Class_Impl__Group_6__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__34128);
            rule__Class_Impl__Group_6__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__3


    // $ANTLR start rule__Class_Impl__Group_6__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2072:1: rule__Class_Impl__Group_6__3__Impl : ( ( rule__Class_Impl__Group_6_3__0 )* ) ;
    public final void rule__Class_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2076:1: ( ( ( rule__Class_Impl__Group_6_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2077:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2077:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2078:1: ( rule__Class_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2079:1: ( rule__Class_Impl__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2079:2: rule__Class_Impl__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl4155);
            	    rule__Class_Impl__Group_6_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__3__Impl


    // $ANTLR start rule__Class_Impl__Group_6__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2089:1: rule__Class_Impl__Group_6__4 : rule__Class_Impl__Group_6__4__Impl ;
    public final void rule__Class_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2093:1: ( rule__Class_Impl__Group_6__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2094:2: rule__Class_Impl__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__44186);
            rule__Class_Impl__Group_6__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__4


    // $ANTLR start rule__Class_Impl__Group_6__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2100:1: rule__Class_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2104:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2105:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2105:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2106:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_6__4__Impl4214); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6__4__Impl


    // $ANTLR start rule__Class_Impl__Group_6_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2129:1: rule__Class_Impl__Group_6_3__0 : rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 ;
    public final void rule__Class_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2133:1: ( rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2134:2: rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__04255);
            rule__Class_Impl__Group_6_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__04258);
            rule__Class_Impl__Group_6_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6_3__0


    // $ANTLR start rule__Class_Impl__Group_6_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2141:1: rule__Class_Impl__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2145:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2146:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2146:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2147:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_6_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Class_Impl__Group_6_3__0__Impl4286); 
             after(grammarAccess.getClass_ImplAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_6_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2160:1: rule__Class_Impl__Group_6_3__1 : rule__Class_Impl__Group_6_3__1__Impl ;
    public final void rule__Class_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2164:1: ( rule__Class_Impl__Group_6_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2165:2: rule__Class_Impl__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__14317);
            rule__Class_Impl__Group_6_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6_3__1


    // $ANTLR start rule__Class_Impl__Group_6_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2171:1: rule__Class_Impl__Group_6_3__1__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 ) ) ;
    public final void rule__Class_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2175:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2177:1: ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_6_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2178:1: ( rule__Class_Impl__NestedClassifierAssignment_6_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2178:2: rule__Class_Impl__NestedClassifierAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl4344);
            rule__Class_Impl__NestedClassifierAssignment_6_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_6_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group_7__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2192:1: rule__Class_Impl__Group_7__0 : rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1 ;
    public final void rule__Class_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2196:1: ( rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2197:2: rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__0__Impl_in_rule__Class_Impl__Group_7__04378);
            rule__Class_Impl__Group_7__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__1_in_rule__Class_Impl__Group_7__04381);
            rule__Class_Impl__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__0


    // $ANTLR start rule__Class_Impl__Group_7__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2204:1: rule__Class_Impl__Group_7__0__Impl : ( 'ownedOperation' ) ;
    public final void rule__Class_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2208:1: ( ( 'ownedOperation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2209:1: ( 'ownedOperation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2209:1: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2210:1: 'ownedOperation'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_7_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Class_Impl__Group_7__0__Impl4409); 
             after(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__0__Impl


    // $ANTLR start rule__Class_Impl__Group_7__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2223:1: rule__Class_Impl__Group_7__1 : rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2 ;
    public final void rule__Class_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2227:1: ( rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2228:2: rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__1__Impl_in_rule__Class_Impl__Group_7__14440);
            rule__Class_Impl__Group_7__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__2_in_rule__Class_Impl__Group_7__14443);
            rule__Class_Impl__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__1


    // $ANTLR start rule__Class_Impl__Group_7__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2235:1: rule__Class_Impl__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2239:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2240:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2240:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2241:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Class_Impl__Group_7__1__Impl4471); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__1__Impl


    // $ANTLR start rule__Class_Impl__Group_7__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2254:1: rule__Class_Impl__Group_7__2 : rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3 ;
    public final void rule__Class_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2258:1: ( rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2259:2: rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__2__Impl_in_rule__Class_Impl__Group_7__24502);
            rule__Class_Impl__Group_7__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__3_in_rule__Class_Impl__Group_7__24505);
            rule__Class_Impl__Group_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__2


    // $ANTLR start rule__Class_Impl__Group_7__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2266:1: rule__Class_Impl__Group_7__2__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_7_2 ) ) ;
    public final void rule__Class_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2270:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_7_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2271:1: ( ( rule__Class_Impl__OwnedOperationAssignment_7_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2271:1: ( ( rule__Class_Impl__OwnedOperationAssignment_7_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2272:1: ( rule__Class_Impl__OwnedOperationAssignment_7_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_7_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2273:1: ( rule__Class_Impl__OwnedOperationAssignment_7_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2273:2: rule__Class_Impl__OwnedOperationAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_7_2_in_rule__Class_Impl__Group_7__2__Impl4532);
            rule__Class_Impl__OwnedOperationAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__2__Impl


    // $ANTLR start rule__Class_Impl__Group_7__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2283:1: rule__Class_Impl__Group_7__3 : rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4 ;
    public final void rule__Class_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2287:1: ( rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2288:2: rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__3__Impl_in_rule__Class_Impl__Group_7__34562);
            rule__Class_Impl__Group_7__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__4_in_rule__Class_Impl__Group_7__34565);
            rule__Class_Impl__Group_7__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__3


    // $ANTLR start rule__Class_Impl__Group_7__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2295:1: rule__Class_Impl__Group_7__3__Impl : ( ( rule__Class_Impl__Group_7_3__0 )* ) ;
    public final void rule__Class_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2299:1: ( ( ( rule__Class_Impl__Group_7_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2300:1: ( ( rule__Class_Impl__Group_7_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2300:1: ( ( rule__Class_Impl__Group_7_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2301:1: ( rule__Class_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_7_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2302:1: ( rule__Class_Impl__Group_7_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2302:2: rule__Class_Impl__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__0_in_rule__Class_Impl__Group_7__3__Impl4592);
            	    rule__Class_Impl__Group_7_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__3__Impl


    // $ANTLR start rule__Class_Impl__Group_7__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2312:1: rule__Class_Impl__Group_7__4 : rule__Class_Impl__Group_7__4__Impl ;
    public final void rule__Class_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2316:1: ( rule__Class_Impl__Group_7__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2317:2: rule__Class_Impl__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__4__Impl_in_rule__Class_Impl__Group_7__44623);
            rule__Class_Impl__Group_7__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__4


    // $ANTLR start rule__Class_Impl__Group_7__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2323:1: rule__Class_Impl__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2327:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2328:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2328:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2329:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_7__4__Impl4651); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7__4__Impl


    // $ANTLR start rule__Class_Impl__Group_7_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2352:1: rule__Class_Impl__Group_7_3__0 : rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1 ;
    public final void rule__Class_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2356:1: ( rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2357:2: rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__0__Impl_in_rule__Class_Impl__Group_7_3__04692);
            rule__Class_Impl__Group_7_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__1_in_rule__Class_Impl__Group_7_3__04695);
            rule__Class_Impl__Group_7_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7_3__0


    // $ANTLR start rule__Class_Impl__Group_7_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2364:1: rule__Class_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2368:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2369:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2369:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2370:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Class_Impl__Group_7_3__0__Impl4723); 
             after(grammarAccess.getClass_ImplAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_7_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2383:1: rule__Class_Impl__Group_7_3__1 : rule__Class_Impl__Group_7_3__1__Impl ;
    public final void rule__Class_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2387:1: ( rule__Class_Impl__Group_7_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2388:2: rule__Class_Impl__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__1__Impl_in_rule__Class_Impl__Group_7_3__14754);
            rule__Class_Impl__Group_7_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7_3__1


    // $ANTLR start rule__Class_Impl__Group_7_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2394:1: rule__Class_Impl__Group_7_3__1__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 ) ) ;
    public final void rule__Class_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2398:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2399:1: ( ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2399:1: ( ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2400:1: ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_7_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2401:1: ( rule__Class_Impl__OwnedOperationAssignment_7_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2401:2: rule__Class_Impl__OwnedOperationAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_7_3_1_in_rule__Class_Impl__Group_7_3__1__Impl4781);
            rule__Class_Impl__OwnedOperationAssignment_7_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_7_3__1__Impl


    // $ANTLR start rule__LiteralInteger__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2415:1: rule__LiteralInteger__Group__0 : rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 ;
    public final void rule__LiteralInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2419:1: ( rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2420:2: rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__04815);
            rule__LiteralInteger__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__04818);
            rule__LiteralInteger__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__0


    // $ANTLR start rule__LiteralInteger__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2427:1: rule__LiteralInteger__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2431:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2432:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2432:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2433:1: ()
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2434:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2436:1: 
            {
            }

             after(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__0__Impl


    // $ANTLR start rule__LiteralInteger__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2446:1: rule__LiteralInteger__Group__1 : rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 ;
    public final void rule__LiteralInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2450:1: ( rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2451:2: rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__14876);
            rule__LiteralInteger__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__14879);
            rule__LiteralInteger__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__1


    // $ANTLR start rule__LiteralInteger__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2458:1: rule__LiteralInteger__Group__1__Impl : ( 'LiteralInteger' ) ;
    public final void rule__LiteralInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2462:1: ( ( 'LiteralInteger' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2463:1: ( 'LiteralInteger' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2463:1: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2464:1: 'LiteralInteger'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__LiteralInteger__Group__1__Impl4907); 
             after(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__1__Impl


    // $ANTLR start rule__LiteralInteger__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2477:1: rule__LiteralInteger__Group__2 : rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 ;
    public final void rule__LiteralInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2481:1: ( rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2482:2: rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__24938);
            rule__LiteralInteger__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__24941);
            rule__LiteralInteger__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__2


    // $ANTLR start rule__LiteralInteger__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2489:1: rule__LiteralInteger__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2493:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2494:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2494:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2495:1: '{'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralInteger__Group__2__Impl4969); 
             after(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__2__Impl


    // $ANTLR start rule__LiteralInteger__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2508:1: rule__LiteralInteger__Group__3 : rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 ;
    public final void rule__LiteralInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2512:1: ( rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2513:2: rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__35000);
            rule__LiteralInteger__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__35003);
            rule__LiteralInteger__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__3


    // $ANTLR start rule__LiteralInteger__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2520:1: rule__LiteralInteger__Group__3__Impl : ( ( rule__LiteralInteger__Group_3__0 )? ) ;
    public final void rule__LiteralInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2524:1: ( ( ( rule__LiteralInteger__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2525:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2525:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2526:1: ( rule__LiteralInteger__Group_3__0 )?
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:1: ( rule__LiteralInteger__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:2: rule__LiteralInteger__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl5030);
                    rule__LiteralInteger__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralIntegerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__3__Impl


    // $ANTLR start rule__LiteralInteger__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2537:1: rule__LiteralInteger__Group__4 : rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 ;
    public final void rule__LiteralInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2541:1: ( rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2542:2: rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__45061);
            rule__LiteralInteger__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__45064);
            rule__LiteralInteger__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__4


    // $ANTLR start rule__LiteralInteger__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2549:1: rule__LiteralInteger__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2553:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2554:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2554:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2555:1: 'value'
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralInteger__Group__4__Impl5092); 
             after(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__4__Impl


    // $ANTLR start rule__LiteralInteger__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2568:1: rule__LiteralInteger__Group__5 : rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 ;
    public final void rule__LiteralInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2572:1: ( rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2573:2: rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__55123);
            rule__LiteralInteger__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__55126);
            rule__LiteralInteger__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__5


    // $ANTLR start rule__LiteralInteger__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2580:1: rule__LiteralInteger__Group__5__Impl : ( ( rule__LiteralInteger__ValueAssignment_5 ) ) ;
    public final void rule__LiteralInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2584:1: ( ( ( rule__LiteralInteger__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2585:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2585:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2586:1: ( rule__LiteralInteger__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2587:1: ( rule__LiteralInteger__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2587:2: rule__LiteralInteger__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl5153);
            rule__LiteralInteger__ValueAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getLiteralIntegerAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__5__Impl


    // $ANTLR start rule__LiteralInteger__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2597:1: rule__LiteralInteger__Group__6 : rule__LiteralInteger__Group__6__Impl ;
    public final void rule__LiteralInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2601:1: ( rule__LiteralInteger__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2602:2: rule__LiteralInteger__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__65183);
            rule__LiteralInteger__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__6


    // $ANTLR start rule__LiteralInteger__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2608:1: rule__LiteralInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2612:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2613:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2613:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2614:1: '}'
            {
             before(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralInteger__Group__6__Impl5211); 
             after(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group__6__Impl


    // $ANTLR start rule__LiteralInteger__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2641:1: rule__LiteralInteger__Group_3__0 : rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 ;
    public final void rule__LiteralInteger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2645:1: ( rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2646:2: rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__05256);
            rule__LiteralInteger__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__05259);
            rule__LiteralInteger__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group_3__0


    // $ANTLR start rule__LiteralInteger__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2653:1: rule__LiteralInteger__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralInteger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2657:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2658:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2658:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2659:1: 'name'
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralInteger__Group_3__0__Impl5287); 
             after(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group_3__0__Impl


    // $ANTLR start rule__LiteralInteger__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2672:1: rule__LiteralInteger__Group_3__1 : rule__LiteralInteger__Group_3__1__Impl ;
    public final void rule__LiteralInteger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2676:1: ( rule__LiteralInteger__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2677:2: rule__LiteralInteger__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__15318);
            rule__LiteralInteger__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group_3__1


    // $ANTLR start rule__LiteralInteger__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2683:1: rule__LiteralInteger__Group_3__1__Impl : ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralInteger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2687:1: ( ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2689:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2690:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2690:2: rule__LiteralInteger__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl5345);
            rule__LiteralInteger__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralIntegerAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__Group_3__1__Impl


    // $ANTLR start rule__LiteralString__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2704:1: rule__LiteralString__Group__0 : rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 ;
    public final void rule__LiteralString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2708:1: ( rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2709:2: rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__05379);
            rule__LiteralString__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__05382);
            rule__LiteralString__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__0


    // $ANTLR start rule__LiteralString__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2716:1: rule__LiteralString__Group__0__Impl : ( () ) ;
    public final void rule__LiteralString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2720:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2721:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2721:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2722:1: ()
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2723:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2725:1: 
            {
            }

             after(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__0__Impl


    // $ANTLR start rule__LiteralString__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2735:1: rule__LiteralString__Group__1 : rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 ;
    public final void rule__LiteralString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2739:1: ( rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2740:2: rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__15440);
            rule__LiteralString__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__15443);
            rule__LiteralString__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__1


    // $ANTLR start rule__LiteralString__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2747:1: rule__LiteralString__Group__1__Impl : ( 'LiteralString' ) ;
    public final void rule__LiteralString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2751:1: ( ( 'LiteralString' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2752:1: ( 'LiteralString' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2752:1: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2753:1: 'LiteralString'
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralString__Group__1__Impl5471); 
             after(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__1__Impl


    // $ANTLR start rule__LiteralString__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2766:1: rule__LiteralString__Group__2 : rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 ;
    public final void rule__LiteralString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2770:1: ( rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2771:2: rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__25502);
            rule__LiteralString__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__25505);
            rule__LiteralString__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__2


    // $ANTLR start rule__LiteralString__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2778:1: rule__LiteralString__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2782:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2783:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2783:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2784:1: '{'
            {
             before(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralString__Group__2__Impl5533); 
             after(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__2__Impl


    // $ANTLR start rule__LiteralString__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2797:1: rule__LiteralString__Group__3 : rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 ;
    public final void rule__LiteralString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2801:1: ( rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2802:2: rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__35564);
            rule__LiteralString__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__35567);
            rule__LiteralString__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__3


    // $ANTLR start rule__LiteralString__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2809:1: rule__LiteralString__Group__3__Impl : ( ( rule__LiteralString__Group_3__0 )? ) ;
    public final void rule__LiteralString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2813:1: ( ( ( rule__LiteralString__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2814:1: ( ( rule__LiteralString__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2814:1: ( ( rule__LiteralString__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2815:1: ( rule__LiteralString__Group_3__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2816:1: ( rule__LiteralString__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2816:2: rule__LiteralString__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl5594);
                    rule__LiteralString__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralStringAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__3__Impl


    // $ANTLR start rule__LiteralString__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2826:1: rule__LiteralString__Group__4 : rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 ;
    public final void rule__LiteralString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2830:1: ( rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2831:2: rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__45625);
            rule__LiteralString__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__45628);
            rule__LiteralString__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__4


    // $ANTLR start rule__LiteralString__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2838:1: rule__LiteralString__Group__4__Impl : ( ( rule__LiteralString__Group_4__0 )? ) ;
    public final void rule__LiteralString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2842:1: ( ( ( rule__LiteralString__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2843:1: ( ( rule__LiteralString__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2843:1: ( ( rule__LiteralString__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2844:1: ( rule__LiteralString__Group_4__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2845:1: ( rule__LiteralString__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2845:2: rule__LiteralString__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl5655);
                    rule__LiteralString__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralStringAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__4__Impl


    // $ANTLR start rule__LiteralString__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2855:1: rule__LiteralString__Group__5 : rule__LiteralString__Group__5__Impl ;
    public final void rule__LiteralString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2859:1: ( rule__LiteralString__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2860:2: rule__LiteralString__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__55686);
            rule__LiteralString__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__5


    // $ANTLR start rule__LiteralString__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2866:1: rule__LiteralString__Group__5__Impl : ( '}' ) ;
    public final void rule__LiteralString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2870:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2871:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2871:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2872:1: '}'
            {
             before(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralString__Group__5__Impl5714); 
             after(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group__5__Impl


    // $ANTLR start rule__LiteralString__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2897:1: rule__LiteralString__Group_3__0 : rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 ;
    public final void rule__LiteralString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2901:1: ( rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2902:2: rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__05757);
            rule__LiteralString__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__05760);
            rule__LiteralString__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_3__0


    // $ANTLR start rule__LiteralString__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2909:1: rule__LiteralString__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2913:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2914:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2914:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2915:1: 'name'
            {
             before(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralString__Group_3__0__Impl5788); 
             after(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_3__0__Impl


    // $ANTLR start rule__LiteralString__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2928:1: rule__LiteralString__Group_3__1 : rule__LiteralString__Group_3__1__Impl ;
    public final void rule__LiteralString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2932:1: ( rule__LiteralString__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2933:2: rule__LiteralString__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__15819);
            rule__LiteralString__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_3__1


    // $ANTLR start rule__LiteralString__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2939:1: rule__LiteralString__Group_3__1__Impl : ( ( rule__LiteralString__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2943:1: ( ( ( rule__LiteralString__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2944:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2944:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2945:1: ( rule__LiteralString__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2946:1: ( rule__LiteralString__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2946:2: rule__LiteralString__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl5846);
            rule__LiteralString__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralStringAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_3__1__Impl


    // $ANTLR start rule__LiteralString__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2960:1: rule__LiteralString__Group_4__0 : rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 ;
    public final void rule__LiteralString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2964:1: ( rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2965:2: rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__05880);
            rule__LiteralString__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__05883);
            rule__LiteralString__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_4__0


    // $ANTLR start rule__LiteralString__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2972:1: rule__LiteralString__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__LiteralString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2976:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2977:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2977:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2978:1: 'value'
            {
             before(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralString__Group_4__0__Impl5911); 
             after(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_4__0__Impl


    // $ANTLR start rule__LiteralString__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2991:1: rule__LiteralString__Group_4__1 : rule__LiteralString__Group_4__1__Impl ;
    public final void rule__LiteralString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2995:1: ( rule__LiteralString__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2996:2: rule__LiteralString__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__15942);
            rule__LiteralString__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_4__1


    // $ANTLR start rule__LiteralString__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3002:1: rule__LiteralString__Group_4__1__Impl : ( ( rule__LiteralString__ValueAssignment_4_1 ) ) ;
    public final void rule__LiteralString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3006:1: ( ( ( rule__LiteralString__ValueAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3007:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3007:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3008:1: ( rule__LiteralString__ValueAssignment_4_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3009:1: ( rule__LiteralString__ValueAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3009:2: rule__LiteralString__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl5969);
            rule__LiteralString__ValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralStringAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__Group_4__1__Impl


    // $ANTLR start rule__LiteralBoolean__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3023:1: rule__LiteralBoolean__Group__0 : rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 ;
    public final void rule__LiteralBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3027:1: ( rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3028:2: rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__06003);
            rule__LiteralBoolean__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__06006);
            rule__LiteralBoolean__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__0


    // $ANTLR start rule__LiteralBoolean__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3035:1: rule__LiteralBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3039:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3040:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3040:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3041:1: ()
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3042:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3044:1: 
            {
            }

             after(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__0__Impl


    // $ANTLR start rule__LiteralBoolean__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3054:1: rule__LiteralBoolean__Group__1 : rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 ;
    public final void rule__LiteralBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3058:1: ( rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3059:2: rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__16064);
            rule__LiteralBoolean__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__16067);
            rule__LiteralBoolean__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__1


    // $ANTLR start rule__LiteralBoolean__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3066:1: rule__LiteralBoolean__Group__1__Impl : ( 'LiteralBoolean' ) ;
    public final void rule__LiteralBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3070:1: ( ( 'LiteralBoolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3071:1: ( 'LiteralBoolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3071:1: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3072:1: 'LiteralBoolean'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralBoolean__Group__1__Impl6095); 
             after(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__1__Impl


    // $ANTLR start rule__LiteralBoolean__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3085:1: rule__LiteralBoolean__Group__2 : rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 ;
    public final void rule__LiteralBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3089:1: ( rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3090:2: rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__26126);
            rule__LiteralBoolean__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__26129);
            rule__LiteralBoolean__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__2


    // $ANTLR start rule__LiteralBoolean__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3097:1: rule__LiteralBoolean__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3101:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3102:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3102:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3103:1: '{'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralBoolean__Group__2__Impl6157); 
             after(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__2__Impl


    // $ANTLR start rule__LiteralBoolean__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3116:1: rule__LiteralBoolean__Group__3 : rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 ;
    public final void rule__LiteralBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3120:1: ( rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3121:2: rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__36188);
            rule__LiteralBoolean__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__36191);
            rule__LiteralBoolean__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__3


    // $ANTLR start rule__LiteralBoolean__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3128:1: rule__LiteralBoolean__Group__3__Impl : ( ( rule__LiteralBoolean__Group_3__0 )? ) ;
    public final void rule__LiteralBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3132:1: ( ( ( rule__LiteralBoolean__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3133:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3133:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3134:1: ( rule__LiteralBoolean__Group_3__0 )?
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3135:1: ( rule__LiteralBoolean__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3135:2: rule__LiteralBoolean__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl6218);
                    rule__LiteralBoolean__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralBooleanAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__3__Impl


    // $ANTLR start rule__LiteralBoolean__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3145:1: rule__LiteralBoolean__Group__4 : rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 ;
    public final void rule__LiteralBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3149:1: ( rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3150:2: rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__46249);
            rule__LiteralBoolean__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__46252);
            rule__LiteralBoolean__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__4


    // $ANTLR start rule__LiteralBoolean__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3157:1: rule__LiteralBoolean__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3161:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3162:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3162:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3163:1: 'value'
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralBoolean__Group__4__Impl6280); 
             after(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__4__Impl


    // $ANTLR start rule__LiteralBoolean__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3176:1: rule__LiteralBoolean__Group__5 : rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 ;
    public final void rule__LiteralBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3180:1: ( rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3181:2: rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__56311);
            rule__LiteralBoolean__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__56314);
            rule__LiteralBoolean__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__5


    // $ANTLR start rule__LiteralBoolean__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3188:1: rule__LiteralBoolean__Group__5__Impl : ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) ;
    public final void rule__LiteralBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3192:1: ( ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3193:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3193:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3194:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3195:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3195:2: rule__LiteralBoolean__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl6341);
            rule__LiteralBoolean__ValueAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__5__Impl


    // $ANTLR start rule__LiteralBoolean__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3205:1: rule__LiteralBoolean__Group__6 : rule__LiteralBoolean__Group__6__Impl ;
    public final void rule__LiteralBoolean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3209:1: ( rule__LiteralBoolean__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3210:2: rule__LiteralBoolean__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__66371);
            rule__LiteralBoolean__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__6


    // $ANTLR start rule__LiteralBoolean__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3216:1: rule__LiteralBoolean__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralBoolean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3220:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3221:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3221:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3222:1: '}'
            {
             before(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralBoolean__Group__6__Impl6399); 
             after(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group__6__Impl


    // $ANTLR start rule__LiteralBoolean__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3249:1: rule__LiteralBoolean__Group_3__0 : rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 ;
    public final void rule__LiteralBoolean__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3253:1: ( rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3254:2: rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__06444);
            rule__LiteralBoolean__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__06447);
            rule__LiteralBoolean__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group_3__0


    // $ANTLR start rule__LiteralBoolean__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3261:1: rule__LiteralBoolean__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralBoolean__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3265:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3266:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3266:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3267:1: 'name'
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralBoolean__Group_3__0__Impl6475); 
             after(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group_3__0__Impl


    // $ANTLR start rule__LiteralBoolean__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3280:1: rule__LiteralBoolean__Group_3__1 : rule__LiteralBoolean__Group_3__1__Impl ;
    public final void rule__LiteralBoolean__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3284:1: ( rule__LiteralBoolean__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3285:2: rule__LiteralBoolean__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__16506);
            rule__LiteralBoolean__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group_3__1


    // $ANTLR start rule__LiteralBoolean__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3291:1: rule__LiteralBoolean__Group_3__1__Impl : ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralBoolean__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3295:1: ( ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3296:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3296:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3297:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3298:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3298:2: rule__LiteralBoolean__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl6533);
            rule__LiteralBoolean__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__Group_3__1__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3312:1: rule__LiteralUnlimitedNatural__Group__0 : rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 ;
    public final void rule__LiteralUnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3316:1: ( rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3317:2: rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__06567);
            rule__LiteralUnlimitedNatural__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__06570);
            rule__LiteralUnlimitedNatural__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__0


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3324:1: rule__LiteralUnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3328:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3329:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3329:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3330:1: ()
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3331:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3333:1: 
            {
            }

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__0__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3343:1: rule__LiteralUnlimitedNatural__Group__1 : rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 ;
    public final void rule__LiteralUnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3347:1: ( rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3348:2: rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__16628);
            rule__LiteralUnlimitedNatural__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__16631);
            rule__LiteralUnlimitedNatural__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__1


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3355:1: rule__LiteralUnlimitedNatural__Group__1__Impl : ( 'LiteralUnlimitedNatural' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3359:1: ( ( 'LiteralUnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3360:1: ( 'LiteralUnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3360:1: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3361:1: 'LiteralUnlimitedNatural'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__LiteralUnlimitedNatural__Group__1__Impl6659); 
             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__1__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3374:1: rule__LiteralUnlimitedNatural__Group__2 : rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 ;
    public final void rule__LiteralUnlimitedNatural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3378:1: ( rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3379:2: rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__26690);
            rule__LiteralUnlimitedNatural__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__26693);
            rule__LiteralUnlimitedNatural__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__2


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3386:1: rule__LiteralUnlimitedNatural__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3390:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3391:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3391:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3392:1: '{'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralUnlimitedNatural__Group__2__Impl6721); 
             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__2__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3405:1: rule__LiteralUnlimitedNatural__Group__3 : rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 ;
    public final void rule__LiteralUnlimitedNatural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3409:1: ( rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3410:2: rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__36752);
            rule__LiteralUnlimitedNatural__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__36755);
            rule__LiteralUnlimitedNatural__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__3


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3417:1: rule__LiteralUnlimitedNatural__Group__3__Impl : ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) ;
    public final void rule__LiteralUnlimitedNatural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3421:1: ( ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3422:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3422:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3423:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3424:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3424:2: rule__LiteralUnlimitedNatural__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl6782);
                    rule__LiteralUnlimitedNatural__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__3__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3434:1: rule__LiteralUnlimitedNatural__Group__4 : rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 ;
    public final void rule__LiteralUnlimitedNatural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3438:1: ( rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3439:2: rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__46813);
            rule__LiteralUnlimitedNatural__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__46816);
            rule__LiteralUnlimitedNatural__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__4


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3446:1: rule__LiteralUnlimitedNatural__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3450:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3451:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3451:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3452:1: 'value'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralUnlimitedNatural__Group__4__Impl6844); 
             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__4__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3465:1: rule__LiteralUnlimitedNatural__Group__5 : rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 ;
    public final void rule__LiteralUnlimitedNatural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3469:1: ( rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3470:2: rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__56875);
            rule__LiteralUnlimitedNatural__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__56878);
            rule__LiteralUnlimitedNatural__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__5


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3477:1: rule__LiteralUnlimitedNatural__Group__5__Impl : ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3481:1: ( ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3482:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3482:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3483:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3484:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3484:2: rule__LiteralUnlimitedNatural__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl6905);
            rule__LiteralUnlimitedNatural__ValueAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__5__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3494:1: rule__LiteralUnlimitedNatural__Group__6 : rule__LiteralUnlimitedNatural__Group__6__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3498:1: ( rule__LiteralUnlimitedNatural__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3499:2: rule__LiteralUnlimitedNatural__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__66935);
            rule__LiteralUnlimitedNatural__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__6


    // $ANTLR start rule__LiteralUnlimitedNatural__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3505:1: rule__LiteralUnlimitedNatural__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3509:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3510:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3510:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3511:1: '}'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralUnlimitedNatural__Group__6__Impl6963); 
             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group__6__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3538:1: rule__LiteralUnlimitedNatural__Group_3__0 : rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3542:1: ( rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3543:2: rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__07008);
            rule__LiteralUnlimitedNatural__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__07011);
            rule__LiteralUnlimitedNatural__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group_3__0


    // $ANTLR start rule__LiteralUnlimitedNatural__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3550:1: rule__LiteralUnlimitedNatural__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3554:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3555:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3555:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3556:1: 'name'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl7039); 
             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group_3__0__Impl


    // $ANTLR start rule__LiteralUnlimitedNatural__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3569:1: rule__LiteralUnlimitedNatural__Group_3__1 : rule__LiteralUnlimitedNatural__Group_3__1__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3573:1: ( rule__LiteralUnlimitedNatural__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3574:2: rule__LiteralUnlimitedNatural__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__17070);
            rule__LiteralUnlimitedNatural__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group_3__1


    // $ANTLR start rule__LiteralUnlimitedNatural__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3580:1: rule__LiteralUnlimitedNatural__Group_3__1__Impl : ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3584:1: ( ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3585:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3585:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3586:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3587:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3587:2: rule__LiteralUnlimitedNatural__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl7097);
            rule__LiteralUnlimitedNatural__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__Group_3__1__Impl


    // $ANTLR start rule__LiteralNull__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3601:1: rule__LiteralNull__Group__0 : rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 ;
    public final void rule__LiteralNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3605:1: ( rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3606:2: rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__07131);
            rule__LiteralNull__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__07134);
            rule__LiteralNull__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__0


    // $ANTLR start rule__LiteralNull__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3613:1: rule__LiteralNull__Group__0__Impl : ( () ) ;
    public final void rule__LiteralNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3617:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3618:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3618:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3619:1: ()
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3620:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3622:1: 
            {
            }

             after(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__0__Impl


    // $ANTLR start rule__LiteralNull__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3632:1: rule__LiteralNull__Group__1 : rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 ;
    public final void rule__LiteralNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3636:1: ( rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3637:2: rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__17192);
            rule__LiteralNull__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__17195);
            rule__LiteralNull__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__1


    // $ANTLR start rule__LiteralNull__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3644:1: rule__LiteralNull__Group__1__Impl : ( 'LiteralNull' ) ;
    public final void rule__LiteralNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3648:1: ( ( 'LiteralNull' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3649:1: ( 'LiteralNull' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3649:1: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3650:1: 'LiteralNull'
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__LiteralNull__Group__1__Impl7223); 
             after(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__1__Impl


    // $ANTLR start rule__LiteralNull__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3663:1: rule__LiteralNull__Group__2 : rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 ;
    public final void rule__LiteralNull__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3667:1: ( rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3668:2: rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__27254);
            rule__LiteralNull__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__27257);
            rule__LiteralNull__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__2


    // $ANTLR start rule__LiteralNull__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3675:1: rule__LiteralNull__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralNull__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3679:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3680:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3680:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3681:1: '{'
            {
             before(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LiteralNull__Group__2__Impl7285); 
             after(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__2__Impl


    // $ANTLR start rule__LiteralNull__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3694:1: rule__LiteralNull__Group__3 : rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 ;
    public final void rule__LiteralNull__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3698:1: ( rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3699:2: rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__37316);
            rule__LiteralNull__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__37319);
            rule__LiteralNull__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__3


    // $ANTLR start rule__LiteralNull__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3706:1: rule__LiteralNull__Group__3__Impl : ( ( rule__LiteralNull__Group_3__0 )? ) ;
    public final void rule__LiteralNull__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3710:1: ( ( ( rule__LiteralNull__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3711:1: ( ( rule__LiteralNull__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3711:1: ( ( rule__LiteralNull__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3712:1: ( rule__LiteralNull__Group_3__0 )?
            {
             before(grammarAccess.getLiteralNullAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3713:1: ( rule__LiteralNull__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3713:2: rule__LiteralNull__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl7346);
                    rule__LiteralNull__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralNullAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__3__Impl


    // $ANTLR start rule__LiteralNull__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3723:1: rule__LiteralNull__Group__4 : rule__LiteralNull__Group__4__Impl ;
    public final void rule__LiteralNull__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3727:1: ( rule__LiteralNull__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3728:2: rule__LiteralNull__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__47377);
            rule__LiteralNull__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__4


    // $ANTLR start rule__LiteralNull__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3734:1: rule__LiteralNull__Group__4__Impl : ( '}' ) ;
    public final void rule__LiteralNull__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3738:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3739:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3739:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3740:1: '}'
            {
             before(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralNull__Group__4__Impl7405); 
             after(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group__4__Impl


    // $ANTLR start rule__LiteralNull__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3763:1: rule__LiteralNull__Group_3__0 : rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 ;
    public final void rule__LiteralNull__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3767:1: ( rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3768:2: rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__07446);
            rule__LiteralNull__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__07449);
            rule__LiteralNull__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group_3__0


    // $ANTLR start rule__LiteralNull__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3775:1: rule__LiteralNull__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralNull__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3779:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3780:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3780:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3781:1: 'name'
            {
             before(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralNull__Group_3__0__Impl7477); 
             after(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group_3__0__Impl


    // $ANTLR start rule__LiteralNull__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3794:1: rule__LiteralNull__Group_3__1 : rule__LiteralNull__Group_3__1__Impl ;
    public final void rule__LiteralNull__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3798:1: ( rule__LiteralNull__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3799:2: rule__LiteralNull__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__17508);
            rule__LiteralNull__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group_3__1


    // $ANTLR start rule__LiteralNull__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3805:1: rule__LiteralNull__Group_3__1__Impl : ( ( rule__LiteralNull__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralNull__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3809:1: ( ( ( rule__LiteralNull__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3810:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3810:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3811:1: ( rule__LiteralNull__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralNullAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3812:1: ( rule__LiteralNull__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3812:2: rule__LiteralNull__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl7535);
            rule__LiteralNull__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralNullAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__Group_3__1__Impl


    // $ANTLR start rule__Model__PackagedElementAssignment_0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3827:1: rule__Model__PackagedElementAssignment_0 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3831:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3832:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3832:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3833:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_07574);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PackagedElementAssignment_0


    // $ANTLR start rule__Model__PackagedElementAssignment_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3842:1: rule__Model__PackagedElementAssignment_1 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3846:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3847:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3847:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3848:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_17605);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PackagedElementAssignment_1


    // $ANTLR start rule__Package_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3857:1: rule__Package_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Package_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3861:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3862:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3862:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3863:1: ruleString0
            {
             before(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_27636);
            ruleString0();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__NameAssignment_2


    // $ANTLR start rule__Package_Impl__PackagedElementAssignment_4_0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3872:1: rule__Package_Impl__PackagedElementAssignment_4_0 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3876:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3877:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3877:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3878:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_07667);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__PackagedElementAssignment_4_0


    // $ANTLR start rule__Package_Impl__PackagedElementAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3887:1: rule__Package_Impl__PackagedElementAssignment_4_1 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3891:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3892:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3892:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3893:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_17698);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__PackagedElementAssignment_4_1


    // $ANTLR start rule__Property_Impl__VisibilityAssignment_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3902:1: rule__Property_Impl__VisibilityAssignment_1 : ( ruleVisibilityKind ) ;
    public final void rule__Property_Impl__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3906:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3907:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3907:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3908:1: ruleVisibilityKind
            {
             before(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Property_Impl__VisibilityAssignment_17729);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__VisibilityAssignment_1


    // $ANTLR start rule__Property_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3917:1: rule__Property_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Property_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3921:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3922:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3922:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3923:1: ruleString0
            {
             before(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_27760);
            ruleString0();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__NameAssignment_2


    // $ANTLR start rule__Property_Impl__TypeAssignment_4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3932:1: rule__Property_Impl__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Property_Impl__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3936:1: ( ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3937:1: ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3937:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3938:1: ( ruleEString )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3939:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3940:1: ruleEString
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_47795);
            ruleEString();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__TypeAssignment_4


    // $ANTLR start rule__Operation__VisibilityAssignment_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3951:1: rule__Operation__VisibilityAssignment_1 : ( ruleVisibilityKind ) ;
    public final void rule__Operation__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3955:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3956:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3956:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3957:1: ruleVisibilityKind
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Operation__VisibilityAssignment_17830);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__VisibilityAssignment_1


    // $ANTLR start rule__Operation__ConcurrencyAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3966:1: rule__Operation__ConcurrencyAssignment_2 : ( ruleCallConcurrencyKind ) ;
    public final void rule__Operation__ConcurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3970:1: ( ( ruleCallConcurrencyKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3971:1: ( ruleCallConcurrencyKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3971:1: ( ruleCallConcurrencyKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3972:1: ruleCallConcurrencyKind
            {
             before(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCallConcurrencyKind_in_rule__Operation__ConcurrencyAssignment_27861);
            ruleCallConcurrencyKind();
            _fsp--;

             after(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__ConcurrencyAssignment_2


    // $ANTLR start rule__Operation__NameAssignment_3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3981:1: rule__Operation__NameAssignment_3 : ( ruleString0 ) ;
    public final void rule__Operation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3985:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3986:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3986:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3987:1: ruleString0
            {
             before(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Operation__NameAssignment_37892);
            ruleString0();
            _fsp--;

             after(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__NameAssignment_3


    // $ANTLR start rule__Class_Impl__VisibilityAssignment_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3996:1: rule__Class_Impl__VisibilityAssignment_1 : ( ruleVisibilityKind ) ;
    public final void rule__Class_Impl__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4000:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4001:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4001:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4002:1: ruleVisibilityKind
            {
             before(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Class_Impl__VisibilityAssignment_17923);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__VisibilityAssignment_1


    // $ANTLR start rule__Class_Impl__NameAssignment_3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4011:1: rule__Class_Impl__NameAssignment_3 : ( ruleString0 ) ;
    public final void rule__Class_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4015:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4016:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4016:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4017:1: ruleString0
            {
             before(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_37954);
            ruleString0();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NameAssignment_3


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_5_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4026:1: rule__Class_Impl__OwnedAttributeAssignment_5_2 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4030:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4031:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4031:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4032:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_5_27985);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_5_2


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_5_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4041:1: rule__Class_Impl__OwnedAttributeAssignment_5_3_1 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4045:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4046:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4046:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4047:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_5_3_18016);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_5_3_1


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_6_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4056:1: rule__Class_Impl__NestedClassifierAssignment_6_2 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4060:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4061:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4061:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4062:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_6_28047);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_6_2


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_6_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4071:1: rule__Class_Impl__NestedClassifierAssignment_6_3_1 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4075:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4076:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4076:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4077:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_6_3_18078);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_6_3_1


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_7_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4086:1: rule__Class_Impl__OwnedOperationAssignment_7_2 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4090:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4091:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4091:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4092:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_7_28109);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_7_2


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_7_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4101:1: rule__Class_Impl__OwnedOperationAssignment_7_3_1 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4105:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4106:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4106:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4107:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_7_3_18140);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_7_3_1


    // $ANTLR start rule__LiteralInteger__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4116:1: rule__LiteralInteger__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralInteger__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4120:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4121:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4121:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4122:1: ruleString0
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_18171);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__NameAssignment_3_1


    // $ANTLR start rule__LiteralInteger__ValueAssignment_5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4131:1: rule__LiteralInteger__ValueAssignment_5 : ( ruleInteger ) ;
    public final void rule__LiteralInteger__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4135:1: ( ( ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4136:1: ( ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4136:1: ( ruleInteger )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4137:1: ruleInteger
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_58202);
            ruleInteger();
            _fsp--;

             after(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralInteger__ValueAssignment_5


    // $ANTLR start rule__LiteralString__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4146:1: rule__LiteralString__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4150:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4151:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4151:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4152:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_18233);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__NameAssignment_3_1


    // $ANTLR start rule__LiteralString__ValueAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4161:1: rule__LiteralString__ValueAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4165:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4166:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4166:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4167:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_18264);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralString__ValueAssignment_4_1


    // $ANTLR start rule__LiteralBoolean__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4176:1: rule__LiteralBoolean__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralBoolean__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4180:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4181:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4181:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4182:1: ruleString0
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_18295);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__NameAssignment_3_1


    // $ANTLR start rule__LiteralBoolean__ValueAssignment_5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4191:1: rule__LiteralBoolean__ValueAssignment_5 : ( ruleBoolean ) ;
    public final void rule__LiteralBoolean__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4195:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4196:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4196:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4197:1: ruleBoolean
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_58326);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralBoolean__ValueAssignment_5


    // $ANTLR start rule__LiteralUnlimitedNatural__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4206:1: rule__LiteralUnlimitedNatural__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralUnlimitedNatural__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4210:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4211:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4211:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4212:1: ruleString0
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_18357);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__NameAssignment_3_1


    // $ANTLR start rule__LiteralUnlimitedNatural__ValueAssignment_5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4221:1: rule__LiteralUnlimitedNatural__ValueAssignment_5 : ( ruleUnlimitedNatural ) ;
    public final void rule__LiteralUnlimitedNatural__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4225:1: ( ( ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4226:1: ( ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4226:1: ( ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4227:1: ruleUnlimitedNatural
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_58388);
            ruleUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralUnlimitedNatural__ValueAssignment_5


    // $ANTLR start rule__LiteralNull__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4236:1: rule__LiteralNull__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralNull__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4240:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4241:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4241:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4242:1: ruleString0
            {
             before(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_18419);
            ruleString0();
            _fsp--;

             after(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralNull__NameAssignment_3_1


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PackageableElement__Alternatives_in_rulePackageableElement155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_ruleClassifier221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_ruleProperty280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0_in_rulePackage_Impl341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_Impl375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0_in_ruleProperty_Impl401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInteger582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Alternatives_in_ruleString0643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBoolean704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleUnlimitedNatural766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1096 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VisibilityKind__Alternatives_in_ruleVisibilityKind1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CallConcurrencyKind__Alternatives_in_ruleCallConcurrencyKind1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__String0__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__VisibilityKind__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VisibilityKind__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VisibilityKind__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VisibilityKind__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CallConcurrencyKind__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CallConcurrencyKind__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CallConcurrencyKind__Alternatives1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01566 = new BitSet(new long[]{0x000000000803C002L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_0_in_rule__Model__Group__0__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_1_in_rule__Model__Group__1__Impl1653 = new BitSet(new long[]{0x000000000803C002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__01688 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__01691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__11749 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__11752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package_Impl__Group__1__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__21811 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__21814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__31871 = new BitSet(new long[]{0x000000000843C000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__31874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package_Impl__Group__3__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__41933 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__41936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__51994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package_Impl__Group__5__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02065 = new BitSet(new long[]{0x000000000803C002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2152 = new BitSet(new long[]{0x000000000803C002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02187 = new BitSet(new long[]{0x000000000003C030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12248 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__VisibilityAssignment_1_in_rule__Property_Impl__Group__1__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22309 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32369 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__32372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Property_Impl__Group__3__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__42431 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__5_in_rule__Property_Impl__Group__42434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__TypeAssignment_4_in_rule__Property_Impl__Group__4__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__5__Impl_in_rule__Property_Impl__Group__52491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Property_Impl__Group__5__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02562 = new BitSet(new long[]{0x00000000001FC030L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12623 = new BitSet(new long[]{0x00000000001C0030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_1_in_rule__Operation__Group__1__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ConcurrencyAssignment_2_in_rule__Operation__Group__2__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32745 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_3_in_rule__Operation__Group__3__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42805 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Operation__Group__4__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Operation__Group__5__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__02938 = new BitSet(new long[]{0x000000000803C000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__02941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__12999 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__13002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__VisibilityAssignment_1_in_rule__Class_Impl__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__23060 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__23063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Class_Impl__Group__2__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__33122 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__33125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NameAssignment_3_in_rule__Class_Impl__Group__3__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__43182 = new BitSet(new long[]{0x00000000D0400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__43185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Class_Impl__Group__4__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__53244 = new BitSet(new long[]{0x00000000C0400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__53247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__63305 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__63308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__73366 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__8_in_rule__Class_Impl__Group__73369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__0_in_rule__Class_Impl__Group__7__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__8__Impl_in_rule__Class_Impl__Group__83427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group__8__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__03504 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__03507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Class_Impl__Group_5__0__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__13566 = new BitSet(new long[]{0x000000000003C030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__13569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Class_Impl__Group_5__1__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__23628 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__23631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__33688 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__33691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl3718 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__43749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_5__4__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__03818 = new BitSet(new long[]{0x000000000003C030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__03821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Class_Impl__Group_5_3__0__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__13880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__03941 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__03944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Class_Impl__Group_6__0__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__14003 = new BitSet(new long[]{0x000000000803C000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__14006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Class_Impl__Group_6__1__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__24065 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__24068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__34125 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__34128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl4155 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__44186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_6__4__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__04255 = new BitSet(new long[]{0x000000000803C000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__04258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Class_Impl__Group_6_3__0__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__14317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__0__Impl_in_rule__Class_Impl__Group_7__04378 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__1_in_rule__Class_Impl__Group_7__04381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Class_Impl__Group_7__0__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__1__Impl_in_rule__Class_Impl__Group_7__14440 = new BitSet(new long[]{0x00000000001FC030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__2_in_rule__Class_Impl__Group_7__14443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Class_Impl__Group_7__1__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__2__Impl_in_rule__Class_Impl__Group_7__24502 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__3_in_rule__Class_Impl__Group_7__24505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_7_2_in_rule__Class_Impl__Group_7__2__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__3__Impl_in_rule__Class_Impl__Group_7__34562 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__4_in_rule__Class_Impl__Group_7__34565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__0_in_rule__Class_Impl__Group_7__3__Impl4592 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__4__Impl_in_rule__Class_Impl__Group_7__44623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_7__4__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__0__Impl_in_rule__Class_Impl__Group_7_3__04692 = new BitSet(new long[]{0x00000000001FC030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__1_in_rule__Class_Impl__Group_7_3__04695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Class_Impl__Group_7_3__0__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__1__Impl_in_rule__Class_Impl__Group_7_3__14754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_7_3_1_in_rule__Class_Impl__Group_7_3__1__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__04815 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__04818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__14876 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__LiteralInteger__Group__1__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__24938 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__24941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralInteger__Group__2__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__35000 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__35003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__45061 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__45064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralInteger__Group__4__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__55123 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__55126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__65183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralInteger__Group__6__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__05256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__05259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralInteger__Group_3__0__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__15318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__05379 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__05382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__15440 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__15443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralString__Group__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__25502 = new BitSet(new long[]{0x0000000600400000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__25505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralString__Group__2__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__35564 = new BitSet(new long[]{0x0000000200400000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__35567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__45625 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__45628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__55686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralString__Group__5__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__05757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__05760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralString__Group_3__0__Impl5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__15819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__05880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__05883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralString__Group_4__0__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__15942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__06003 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__06006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__16064 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__16067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralBoolean__Group__1__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__26126 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__26129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralBoolean__Group__2__Impl6157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__36188 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__36191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__46249 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__46252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralBoolean__Group__4__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__56311 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__56314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__66371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralBoolean__Group__6__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__06444 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__06447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralBoolean__Group_3__0__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__16506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__06567 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__06570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__16628 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__16631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__LiteralUnlimitedNatural__Group__1__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__26690 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__26693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralUnlimitedNatural__Group__2__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__36752 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__36755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__46813 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__46816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralUnlimitedNatural__Group__4__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__56875 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__56878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl6905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__66935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralUnlimitedNatural__Group__6__Impl6963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__07008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__07011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__17070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__07131 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__07134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__17192 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__17195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__LiteralNull__Group__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__27254 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__27257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LiteralNull__Group__2__Impl7285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__37316 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__37319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__47377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralNull__Group__4__Impl7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__07446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__07449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralNull__Group_3__0__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__17508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_07574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_17605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_27636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_07667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_17698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Property_Impl__VisibilityAssignment_17729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_27760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_47795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Operation__VisibilityAssignment_17830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCallConcurrencyKind_in_rule__Operation__ConcurrencyAssignment_27861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Operation__NameAssignment_37892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Class_Impl__VisibilityAssignment_17923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_37954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_5_27985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_5_3_18016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_6_28047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_6_3_18078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_7_28109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_7_3_18140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_18171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_58202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_18233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_18264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_18295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_58326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_18357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_58388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_18419 = new BitSet(new long[]{0x0000000000000002L});
    }


}