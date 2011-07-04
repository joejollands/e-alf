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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'{'", "'\\tmodel'", "'}'", "'package'", "'property'", "':'", "'operation'", "'('", "')'", "'activity'", "'['", "'specification for'", "']'", "'variable'", "'class'", "'ownedAttribute'", "';'", "'nestedClassifier'", "','", "'ownedOperation'", "'LiteralInteger'", "'value'", "'name'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'"
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




    // $ANTLR start entryRulePackageableElement
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:61:1: entryRulePackageableElement : rulePackageableElement EOF ;
    public final void entryRulePackageableElement() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:62:1: ( rulePackageableElement EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:63:1: rulePackageableElement EOF
            {
             before(grammarAccess.getPackageableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement61);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackageableElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement68); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:70:1: rulePackageableElement : ( ( rule__PackageableElement__Alternatives ) ) ;
    public final void rulePackageableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:74:2: ( ( ( rule__PackageableElement__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:75:1: ( ( rule__PackageableElement__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:75:1: ( ( rule__PackageableElement__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:76:1: ( rule__PackageableElement__Alternatives )
            {
             before(grammarAccess.getPackageableElementAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:77:1: ( rule__PackageableElement__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:77:2: rule__PackageableElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PackageableElement__Alternatives_in_rulePackageableElement94);
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


    // $ANTLR start entryRuleModel
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:89:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:90:1: ( ruleModel EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:91:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel121);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel128); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:98:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:102:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:103:1: ( ( rule__Model__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:103:1: ( ( rule__Model__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:104:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:105:1: ( rule__Model__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:105:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel154);
            rule__Model__Group__0();
            _fsp--;


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


    // $ANTLR start entryRuleClassifier
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:123:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:124:1: ( ruleClassifier EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:125:1: ruleClassifier EOF
            {
             before(grammarAccess.getClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier187);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClassifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier194); 

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
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_ruleClassifier220);
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
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty246);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty253); 

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
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_ruleProperty279);
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
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl307);
            rulePackage_Impl();
            _fsp--;

             after(grammarAccess.getPackage_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl314); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0_in_rulePackage_Impl340);
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
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl367);
            ruleProperty_Impl();
            _fsp--;

             after(grammarAccess.getProperty_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_Impl374); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0_in_ruleProperty_Impl400);
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
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation427);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation434); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation460);
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


    // $ANTLR start entryRuleActivity
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:265:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:266:1: ( ruleActivity EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:267:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity487);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity494); 

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
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:274:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:278:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:279:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:279:1: ( ( rule__Activity__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:280:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:281:1: ( rule__Activity__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:281:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity520);
            rule__Activity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleVariable
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:293:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:294:1: ( ruleVariable EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:295:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable547);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable554); 

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:302:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:306:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:307:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:307:1: ( ( rule__Variable__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:308:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:309:1: ( rule__Variable__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:309:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable580);
            rule__Variable__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleClass_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:323:1: entryRuleClass_Impl : ruleClass_Impl EOF ;
    public final void entryRuleClass_Impl() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:324:1: ( ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:325:1: ruleClass_Impl EOF
            {
             before(grammarAccess.getClass_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl609);
            ruleClass_Impl();
            _fsp--;

             after(grammarAccess.getClass_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl616); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:332:1: ruleClass_Impl : ( ( rule__Class_Impl__Group__0 ) ) ;
    public final void ruleClass_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:336:2: ( ( ( rule__Class_Impl__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( ( rule__Class_Impl__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( ( rule__Class_Impl__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:338:1: ( rule__Class_Impl__Group__0 )
            {
             before(grammarAccess.getClass_ImplAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:339:1: ( rule__Class_Impl__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:339:2: rule__Class_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl642);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:351:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:352:1: ( ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:353:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger669);
            ruleInteger();
            _fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger676); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:360:1: ruleInteger : ( 'Integer' ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:364:2: ( ( 'Integer' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:365:1: ( 'Integer' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:365:1: ( 'Integer' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:366:1: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleInteger703); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:381:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:382:1: ( ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:383:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0731);
            ruleString0();
            _fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0738); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:390:1: ruleString0 : ( ( rule__String0__Alternatives ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:394:2: ( ( ( rule__String0__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( ( rule__String0__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( ( rule__String0__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:396:1: ( rule__String0__Alternatives )
            {
             before(grammarAccess.getString0Access().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:397:1: ( rule__String0__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:397:2: rule__String0__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Alternatives_in_ruleString0764);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:409:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:410:1: ( ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:411:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean791);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean798); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:418:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:422:2: ( ( 'Boolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:423:1: ( 'Boolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:423:1: ( 'Boolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:424:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolean825); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:439:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:440:1: ( ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:441:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural853);
            ruleUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural860); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:448:1: ruleUnlimitedNatural : ( 'UnlimitedNatural' ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:452:2: ( ( 'UnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:453:1: ( 'UnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:453:1: ( 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:454:1: 'UnlimitedNatural'
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleUnlimitedNatural887); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:469:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:470:1: ( ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:471:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString915);
            ruleEString();
            _fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString922); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:478:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:482:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:483:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:483:1: ( ( rule__EString__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:484:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:1: ( rule__EString__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString948);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:499:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:500:1: ( ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:501:1: ruleLiteralInteger EOF
            {
             before(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger977);
            ruleLiteralInteger();
            _fsp--;

             after(grammarAccess.getLiteralIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger984); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:508:1: ruleLiteralInteger : ( ( rule__LiteralInteger__Group__0 ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:512:2: ( ( ( rule__LiteralInteger__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:1: ( ( rule__LiteralInteger__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:1: ( ( rule__LiteralInteger__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:514:1: ( rule__LiteralInteger__Group__0 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:515:1: ( rule__LiteralInteger__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:515:2: rule__LiteralInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger1010);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:527:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:528:1: ( ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:529:1: ruleLiteralString EOF
            {
             before(grammarAccess.getLiteralStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString1037);
            ruleLiteralString();
            _fsp--;

             after(grammarAccess.getLiteralStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString1044); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:536:1: ruleLiteralString : ( ( rule__LiteralString__Group__0 ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:540:2: ( ( ( rule__LiteralString__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:1: ( ( rule__LiteralString__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:1: ( ( rule__LiteralString__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:542:1: ( rule__LiteralString__Group__0 )
            {
             before(grammarAccess.getLiteralStringAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:543:1: ( rule__LiteralString__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:543:2: rule__LiteralString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString1070);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:555:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:556:1: ( ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:557:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1097);
            ruleLiteralBoolean();
            _fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean1104); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:564:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__Group__0 ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:568:2: ( ( ( rule__LiteralBoolean__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:1: ( ( rule__LiteralBoolean__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:1: ( ( rule__LiteralBoolean__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:570:1: ( rule__LiteralBoolean__Group__0 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:571:1: ( rule__LiteralBoolean__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:571:2: rule__LiteralBoolean__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1130);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:583:1: entryRuleLiteralUnlimitedNatural : ruleLiteralUnlimitedNatural EOF ;
    public final void entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:584:1: ( ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:585:1: ruleLiteralUnlimitedNatural EOF
            {
             before(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1157);
            ruleLiteralUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1164); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:592:1: ruleLiteralUnlimitedNatural : ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) ;
    public final void ruleLiteralUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:596:2: ( ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:597:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:597:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:598:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:599:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:599:2: rule__LiteralUnlimitedNatural__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1190);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:611:1: entryRuleLiteralNull : ruleLiteralNull EOF ;
    public final void entryRuleLiteralNull() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:612:1: ( ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:613:1: ruleLiteralNull EOF
            {
             before(grammarAccess.getLiteralNullRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1217);
            ruleLiteralNull();
            _fsp--;

             after(grammarAccess.getLiteralNullRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull1224); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:620:1: ruleLiteralNull : ( ( rule__LiteralNull__Group__0 ) ) ;
    public final void ruleLiteralNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:624:2: ( ( ( rule__LiteralNull__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:625:1: ( ( rule__LiteralNull__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:625:1: ( ( rule__LiteralNull__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:626:1: ( rule__LiteralNull__Group__0 )
            {
             before(grammarAccess.getLiteralNullAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:627:1: ( rule__LiteralNull__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:627:2: rule__LiteralNull__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1250);
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


    // $ANTLR start rule__PackageableElement__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:647:1: rule__PackageableElement__Alternatives : ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) );
    public final void rule__PackageableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:651:1: ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("647:1: rule__PackageableElement__Alternatives : ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:652:1: ( ruleModel )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:652:1: ( ruleModel )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:653:1: ruleModel
                    {
                     before(grammarAccess.getPackageableElementAccess().getModelParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__PackageableElement__Alternatives1294);
                    ruleModel();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:658:6: ( rulePackage_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:658:6: ( rulePackage_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:659:1: rulePackage_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1311);
                    rulePackage_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:664:6: ( ruleClass_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:664:6: ( ruleClass_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:665:1: ruleClass_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1328);
                    ruleClass_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:670:6: ( ruleActivity )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:670:6: ( ruleActivity )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:671:1: ruleActivity
                    {
                     before(grammarAccess.getPackageableElementAccess().getActivityParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__PackageableElement__Alternatives1345);
                    ruleActivity();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getActivityParserRuleCall_3()); 

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


    // $ANTLR start rule__Activity__Alternatives_7
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:681:1: rule__Activity__Alternatives_7 : ( ( ( rule__Activity__OwnedAttributeAssignment_7_0 ) ) | ( ( rule__Activity__VariableAssignment_7_1 ) ) );
    public final void rule__Activity__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:685:1: ( ( ( rule__Activity__OwnedAttributeAssignment_7_0 ) ) | ( ( rule__Activity__VariableAssignment_7_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("681:1: rule__Activity__Alternatives_7 : ( ( ( rule__Activity__OwnedAttributeAssignment_7_0 ) ) | ( ( rule__Activity__VariableAssignment_7_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:686:1: ( ( rule__Activity__OwnedAttributeAssignment_7_0 ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:686:1: ( ( rule__Activity__OwnedAttributeAssignment_7_0 ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:687:1: ( rule__Activity__OwnedAttributeAssignment_7_0 )
                    {
                     before(grammarAccess.getActivityAccess().getOwnedAttributeAssignment_7_0()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:688:1: ( rule__Activity__OwnedAttributeAssignment_7_0 )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:688:2: rule__Activity__OwnedAttributeAssignment_7_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__OwnedAttributeAssignment_7_0_in_rule__Activity__Alternatives_71377);
                    rule__Activity__OwnedAttributeAssignment_7_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getOwnedAttributeAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:692:6: ( ( rule__Activity__VariableAssignment_7_1 ) )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:692:6: ( ( rule__Activity__VariableAssignment_7_1 ) )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:693:1: ( rule__Activity__VariableAssignment_7_1 )
                    {
                     before(grammarAccess.getActivityAccess().getVariableAssignment_7_1()); 
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:694:1: ( rule__Activity__VariableAssignment_7_1 )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:694:2: rule__Activity__VariableAssignment_7_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__VariableAssignment_7_1_in_rule__Activity__Alternatives_71395);
                    rule__Activity__VariableAssignment_7_1();
                    _fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getVariableAssignment_7_1()); 

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
    // $ANTLR end rule__Activity__Alternatives_7


    // $ANTLR start rule__String0__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:703:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__String0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:707:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("703:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:708:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:708:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:709:1: RULE_STRING
                    {
                     before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__Alternatives1428); 
                     after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:714:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:714:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:715:1: RULE_ID
                    {
                     before(grammarAccess.getString0Access().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__String0__Alternatives1445); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:725:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:729:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("725:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:730:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:730:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:731:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1477); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:736:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:736:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:737:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1494); 
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


    // $ANTLR start rule__Model__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:754:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:758:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:759:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01529);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01532);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:766:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:770:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:771:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:771:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:772:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:773:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:775:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:785:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:789:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:790:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11590);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11593);
            rule__Model__Group__2();
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:797:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:801:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:802:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:802:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:803:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:804:1: ( rule__Model__NameAssignment_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:804:2: rule__Model__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1620);
            rule__Model__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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


    // $ANTLR start rule__Model__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:814:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:818:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:819:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21650);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21653);
            rule__Model__Group__3();
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
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:826:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:830:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:831:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:831:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:832:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__2__Impl1681); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Model__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:845:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:849:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:850:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31712);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31715);
            rule__Model__Group__4();
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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:857:1: rule__Model__Group__3__Impl : ( '\\tmodel' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:861:1: ( ( '\\tmodel' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:862:1: ( '\\tmodel' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:862:1: ( '\\tmodel' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:863:1: '\\tmodel'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__3__Impl1743); 
             after(grammarAccess.getModelAccess().getModelKeyword_3()); 

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
    // $ANTLR end rule__Model__Group__3__Impl


    // $ANTLR start rule__Model__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:876:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:880:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:881:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41774);
            rule__Model__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41777);
            rule__Model__Group__5();
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
    // $ANTLR end rule__Model__Group__4


    // $ANTLR start rule__Model__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:888:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:892:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:893:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:893:1: ( ( rule__Model__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:894:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:895:1: ( rule__Model__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==17||LA5_0==23||LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:895:2: rule__Model__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1804);
                    rule__Model__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end rule__Model__Group__4__Impl


    // $ANTLR start rule__Model__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:905:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:909:1: ( rule__Model__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:910:2: rule__Model__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51835);
            rule__Model__Group__5__Impl();
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
    // $ANTLR end rule__Model__Group__5


    // $ANTLR start rule__Model__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:916:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:920:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:921:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:921:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:922:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group__5__Impl1863); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__Model__Group__5__Impl


    // $ANTLR start rule__Model__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:947:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:951:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:952:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01906);
            rule__Model__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01909);
            rule__Model__Group_4__1();
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
    // $ANTLR end rule__Model__Group_4__0


    // $ANTLR start rule__Model__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:959:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__PackagedElementAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:963:1: ( ( ( rule__Model__PackagedElementAssignment_4_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:964:1: ( ( rule__Model__PackagedElementAssignment_4_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:964:1: ( ( rule__Model__PackagedElementAssignment_4_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:965:1: ( rule__Model__PackagedElementAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:966:1: ( rule__Model__PackagedElementAssignment_4_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:966:2: rule__Model__PackagedElementAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_4_0_in_rule__Model__Group_4__0__Impl1936);
            rule__Model__PackagedElementAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_4_0()); 

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
    // $ANTLR end rule__Model__Group_4__0__Impl


    // $ANTLR start rule__Model__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:976:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:980:1: ( rule__Model__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:981:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11966);
            rule__Model__Group_4__1__Impl();
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
    // $ANTLR end rule__Model__Group_4__1


    // $ANTLR start rule__Model__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:987:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__PackagedElementAssignment_4_1 )* ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:991:1: ( ( ( rule__Model__PackagedElementAssignment_4_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:992:1: ( ( rule__Model__PackagedElementAssignment_4_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:992:1: ( ( rule__Model__PackagedElementAssignment_4_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:993:1: ( rule__Model__PackagedElementAssignment_4_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:994:1: ( rule__Model__PackagedElementAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==17||LA6_0==23||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:994:2: rule__Model__PackagedElementAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_4_1_in_rule__Model__Group_4__1__Impl1993);
            	    rule__Model__PackagedElementAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_4_1()); 

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
    // $ANTLR end rule__Model__Group_4__1__Impl


    // $ANTLR start rule__Package_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1008:1: rule__Package_Impl__Group__0 : rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 ;
    public final void rule__Package_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1012:1: ( rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1013:2: rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__02028);
            rule__Package_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__02031);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1020:1: rule__Package_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Package_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1024:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1025:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1025:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1026:1: ()
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1027:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1029:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1039:1: rule__Package_Impl__Group__1 : rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 ;
    public final void rule__Package_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1043:1: ( rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1044:2: rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__12089);
            rule__Package_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__12092);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1051:1: rule__Package_Impl__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1055:1: ( ( 'package' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1056:1: ( 'package' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1056:1: ( 'package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1057:1: 'package'
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package_Impl__Group__1__Impl2120); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1070:1: rule__Package_Impl__Group__2 : rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 ;
    public final void rule__Package_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1074:1: ( rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1075:2: rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22151);
            rule__Package_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22154);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1082:1: rule__Package_Impl__Group__2__Impl : ( ( rule__Package_Impl__NameAssignment_2 ) ) ;
    public final void rule__Package_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1086:1: ( ( ( rule__Package_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1087:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1087:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1088:1: ( rule__Package_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getPackage_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1089:1: ( rule__Package_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1089:2: rule__Package_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl2181);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1099:1: rule__Package_Impl__Group__3 : rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 ;
    public final void rule__Package_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1103:1: ( rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1104:2: rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32211);
            rule__Package_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32214);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1111:1: rule__Package_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Package_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1115:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1116:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1116:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1117:1: '{'
            {
             before(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Package_Impl__Group__3__Impl2242); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1130:1: rule__Package_Impl__Group__4 : rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 ;
    public final void rule__Package_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1134:1: ( rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1135:2: rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42273);
            rule__Package_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42276);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1142:1: rule__Package_Impl__Group__4__Impl : ( ( rule__Package_Impl__Group_4__0 )? ) ;
    public final void rule__Package_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1146:1: ( ( ( rule__Package_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1147:1: ( ( rule__Package_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1147:1: ( ( rule__Package_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1148:1: ( rule__Package_Impl__Group_4__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1149:1: ( rule__Package_Impl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==17||LA7_0==23||LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1149:2: rule__Package_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2303);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1159:1: rule__Package_Impl__Group__5 : rule__Package_Impl__Group__5__Impl ;
    public final void rule__Package_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1163:1: ( rule__Package_Impl__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1164:2: rule__Package_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52334);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1170:1: rule__Package_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Package_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1174:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1175:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1175:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1176:1: '}'
            {
             before(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package_Impl__Group__5__Impl2362); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1201:1: rule__Package_Impl__Group_4__0 : rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 ;
    public final void rule__Package_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1205:1: ( rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1206:2: rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02405);
            rule__Package_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02408);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1213:1: rule__Package_Impl__Group_4__0__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) ;
    public final void rule__Package_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1217:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1218:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1218:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1219:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1220:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1220:2: rule__Package_Impl__PackagedElementAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2435);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1230:1: rule__Package_Impl__Group_4__1 : rule__Package_Impl__Group_4__1__Impl ;
    public final void rule__Package_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1234:1: ( rule__Package_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1235:2: rule__Package_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12465);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1241:1: rule__Package_Impl__Group_4__1__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) ;
    public final void rule__Package_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1245:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1246:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1246:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1247:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1248:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==17||LA8_0==23||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1248:2: rule__Package_Impl__PackagedElementAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2492);
            	    rule__Package_Impl__PackagedElementAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1262:1: rule__Property_Impl__Group__0 : rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 ;
    public final void rule__Property_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1266:1: ( rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1267:2: rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02527);
            rule__Property_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02530);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1274:1: rule__Property_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Property_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1278:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1279:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1279:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1280:1: ()
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1281:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1283:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1293:1: rule__Property_Impl__Group__1 : rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 ;
    public final void rule__Property_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1297:1: ( rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1298:2: rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12588);
            rule__Property_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12591);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1305:1: rule__Property_Impl__Group__1__Impl : ( 'property' ) ;
    public final void rule__Property_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1309:1: ( ( 'property' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1310:1: ( 'property' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1310:1: ( 'property' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1311:1: 'property'
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Property_Impl__Group__1__Impl2619); 
             after(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1324:1: rule__Property_Impl__Group__2 : rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 ;
    public final void rule__Property_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1328:1: ( rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1329:2: rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22650);
            rule__Property_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22653);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1336:1: rule__Property_Impl__Group__2__Impl : ( ( rule__Property_Impl__NameAssignment_2 ) ) ;
    public final void rule__Property_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1340:1: ( ( ( rule__Property_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1341:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1341:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1342:1: ( rule__Property_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getProperty_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1343:1: ( rule__Property_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1343:2: rule__Property_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2680);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1353:1: rule__Property_Impl__Group__3 : rule__Property_Impl__Group__3__Impl ;
    public final void rule__Property_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1357:1: ( rule__Property_Impl__Group__3__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1358:2: rule__Property_Impl__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32710);
            rule__Property_Impl__Group__3__Impl();
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1364:1: rule__Property_Impl__Group__3__Impl : ( ( rule__Property_Impl__Group_3__0 )? ) ;
    public final void rule__Property_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1368:1: ( ( ( rule__Property_Impl__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1369:1: ( ( rule__Property_Impl__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1369:1: ( ( rule__Property_Impl__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1370:1: ( rule__Property_Impl__Group_3__0 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1371:1: ( rule__Property_Impl__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1371:2: rule__Property_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__0_in_rule__Property_Impl__Group__3__Impl2737);
                    rule__Property_Impl__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProperty_ImplAccess().getGroup_3()); 

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


    // $ANTLR start rule__Property_Impl__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1389:1: rule__Property_Impl__Group_3__0 : rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1 ;
    public final void rule__Property_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1393:1: ( rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1394:2: rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__0__Impl_in_rule__Property_Impl__Group_3__02776);
            rule__Property_Impl__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__1_in_rule__Property_Impl__Group_3__02779);
            rule__Property_Impl__Group_3__1();
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
    // $ANTLR end rule__Property_Impl__Group_3__0


    // $ANTLR start rule__Property_Impl__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1401:1: rule__Property_Impl__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Property_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1405:1: ( ( ':' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1406:1: ( ':' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1406:1: ( ':' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1407:1: ':'
            {
             before(grammarAccess.getProperty_ImplAccess().getColonKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Property_Impl__Group_3__0__Impl2807); 
             after(grammarAccess.getProperty_ImplAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end rule__Property_Impl__Group_3__0__Impl


    // $ANTLR start rule__Property_Impl__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1420:1: rule__Property_Impl__Group_3__1 : rule__Property_Impl__Group_3__1__Impl ;
    public final void rule__Property_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1424:1: ( rule__Property_Impl__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1425:2: rule__Property_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__1__Impl_in_rule__Property_Impl__Group_3__12838);
            rule__Property_Impl__Group_3__1__Impl();
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
    // $ANTLR end rule__Property_Impl__Group_3__1


    // $ANTLR start rule__Property_Impl__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1431:1: rule__Property_Impl__Group_3__1__Impl : ( ( rule__Property_Impl__TypeAssignment_3_1 ) ) ;
    public final void rule__Property_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1435:1: ( ( ( rule__Property_Impl__TypeAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1436:1: ( ( rule__Property_Impl__TypeAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1436:1: ( ( rule__Property_Impl__TypeAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1437:1: ( rule__Property_Impl__TypeAssignment_3_1 )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1438:1: ( rule__Property_Impl__TypeAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1438:2: rule__Property_Impl__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__TypeAssignment_3_1_in_rule__Property_Impl__Group_3__1__Impl2865);
            rule__Property_Impl__TypeAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end rule__Property_Impl__Group_3__1__Impl


    // $ANTLR start rule__Operation__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1452:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1456:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1457:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02899);
            rule__Operation__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02902);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1464:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1468:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1469:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1469:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1470:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1471:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1473:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1483:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1487:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1488:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12960);
            rule__Operation__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12963);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1495:1: rule__Operation__Group__1__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1499:1: ( ( 'operation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1500:1: ( 'operation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1500:1: ( 'operation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1501:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Operation__Group__1__Impl2991); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_1()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1514:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1518:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1519:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23022);
            rule__Operation__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23025);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1526:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1530:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1531:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1531:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1532:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1533:1: ( rule__Operation__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1533:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl3052);
            rule__Operation__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1543:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1547:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1548:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33082);
            rule__Operation__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33085);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1555:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1559:1: ( ( '(' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1560:1: ( '(' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1560:1: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1561:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Operation__Group__3__Impl3113); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1574:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1578:1: ( rule__Operation__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1579:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43144);
            rule__Operation__Group__4__Impl();
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1585:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1589:1: ( ( ')' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1590:1: ( ')' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1590:1: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1591:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__4__Impl3172); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 

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


    // $ANTLR start rule__Activity__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1614:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1618:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1619:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03213);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03216);
            rule__Activity__Group__1();
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
    // $ANTLR end rule__Activity__Group__0


    // $ANTLR start rule__Activity__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1626:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1630:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1631:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1631:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1632:1: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1633:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1635:1: 
            {
            }

             after(grammarAccess.getActivityAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__0__Impl


    // $ANTLR start rule__Activity__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1645:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1649:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1650:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13274);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13277);
            rule__Activity__Group__2();
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
    // $ANTLR end rule__Activity__Group__1


    // $ANTLR start rule__Activity__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1657:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1661:1: ( ( 'activity' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1662:1: ( 'activity' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1662:1: ( 'activity' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1663:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Activity__Group__1__Impl3305); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

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
    // $ANTLR end rule__Activity__Group__1__Impl


    // $ANTLR start rule__Activity__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1676:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1680:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1681:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23336);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23339);
            rule__Activity__Group__3();
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
    // $ANTLR end rule__Activity__Group__2


    // $ANTLR start rule__Activity__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1688:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1692:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1693:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1693:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1694:1: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1695:1: ( rule__Activity__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1695:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl3366);
            rule__Activity__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__Activity__Group__2__Impl


    // $ANTLR start rule__Activity__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1705:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1709:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1710:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33396);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33399);
            rule__Activity__Group__4();
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
    // $ANTLR end rule__Activity__Group__3


    // $ANTLR start rule__Activity__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1717:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1721:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1722:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1722:1: ( ( rule__Activity__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1723:1: ( rule__Activity__Group_3__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1724:1: ( rule__Activity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1724:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl3426);
                    rule__Activity__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_3()); 

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
    // $ANTLR end rule__Activity__Group__3__Impl


    // $ANTLR start rule__Activity__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1734:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1738:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1739:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43457);
            rule__Activity__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43460);
            rule__Activity__Group__5();
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
    // $ANTLR end rule__Activity__Group__4


    // $ANTLR start rule__Activity__Group__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1746:1: rule__Activity__Group__4__Impl : ( '(' ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1750:1: ( ( '(' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1751:1: ( '(' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1751:1: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1752:1: '('
            {
             before(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group__4__Impl3488); 
             after(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Activity__Group__4__Impl


    // $ANTLR start rule__Activity__Group__5
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1765:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1769:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1770:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53519);
            rule__Activity__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53522);
            rule__Activity__Group__6();
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
    // $ANTLR end rule__Activity__Group__5


    // $ANTLR start rule__Activity__Group__5__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1777:1: rule__Activity__Group__5__Impl : ( ')' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1781:1: ( ( ')' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1782:1: ( ')' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1782:1: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1783:1: ')'
            {
             before(grammarAccess.getActivityAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group__5__Impl3550); 
             after(grammarAccess.getActivityAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end rule__Activity__Group__5__Impl


    // $ANTLR start rule__Activity__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1796:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1800:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1801:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63581);
            rule__Activity__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63584);
            rule__Activity__Group__7();
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
    // $ANTLR end rule__Activity__Group__6


    // $ANTLR start rule__Activity__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1808:1: rule__Activity__Group__6__Impl : ( '{' ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1812:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1813:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1813:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1814:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Activity__Group__6__Impl3612); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end rule__Activity__Group__6__Impl


    // $ANTLR start rule__Activity__Group__7
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1827:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1831:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1832:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73643);
            rule__Activity__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73646);
            rule__Activity__Group__8();
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
    // $ANTLR end rule__Activity__Group__7


    // $ANTLR start rule__Activity__Group__7__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1839:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Alternatives_7 )* ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1843:1: ( ( ( rule__Activity__Alternatives_7 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1844:1: ( ( rule__Activity__Alternatives_7 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1844:1: ( ( rule__Activity__Alternatives_7 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1845:1: ( rule__Activity__Alternatives_7 )*
            {
             before(grammarAccess.getActivityAccess().getAlternatives_7()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1846:1: ( rule__Activity__Alternatives_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1846:2: rule__Activity__Alternatives_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Alternatives_7_in_rule__Activity__Group__7__Impl3673);
            	    rule__Activity__Alternatives_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getAlternatives_7()); 

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
    // $ANTLR end rule__Activity__Group__7__Impl


    // $ANTLR start rule__Activity__Group__8
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1856:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1860:1: ( rule__Activity__Group__8__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1861:2: rule__Activity__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83704);
            rule__Activity__Group__8__Impl();
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
    // $ANTLR end rule__Activity__Group__8


    // $ANTLR start rule__Activity__Group__8__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1867:1: rule__Activity__Group__8__Impl : ( '}' ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1871:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1872:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1872:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1873:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Activity__Group__8__Impl3732); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end rule__Activity__Group__8__Impl


    // $ANTLR start rule__Activity__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1904:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1908:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1909:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03781);
            rule__Activity__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03784);
            rule__Activity__Group_3__1();
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
    // $ANTLR end rule__Activity__Group_3__0


    // $ANTLR start rule__Activity__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1916:1: rule__Activity__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1920:1: ( ( '[' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1921:1: ( '[' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1921:1: ( '[' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1922:1: '['
            {
             before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Activity__Group_3__0__Impl3812); 
             after(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end rule__Activity__Group_3__0__Impl


    // $ANTLR start rule__Activity__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1935:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1939:1: ( rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1940:2: rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13843);
            rule__Activity__Group_3__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13846);
            rule__Activity__Group_3__2();
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
    // $ANTLR end rule__Activity__Group_3__1


    // $ANTLR start rule__Activity__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1947:1: rule__Activity__Group_3__1__Impl : ( 'specification for' ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1951:1: ( ( 'specification for' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1952:1: ( 'specification for' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1952:1: ( 'specification for' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1953:1: 'specification for'
            {
             before(grammarAccess.getActivityAccess().getSpecificationForKeyword_3_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Activity__Group_3__1__Impl3874); 
             after(grammarAccess.getActivityAccess().getSpecificationForKeyword_3_1()); 

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
    // $ANTLR end rule__Activity__Group_3__1__Impl


    // $ANTLR start rule__Activity__Group_3__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1966:1: rule__Activity__Group_3__2 : rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 ;
    public final void rule__Activity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1970:1: ( rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1971:2: rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23905);
            rule__Activity__Group_3__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23908);
            rule__Activity__Group_3__3();
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
    // $ANTLR end rule__Activity__Group_3__2


    // $ANTLR start rule__Activity__Group_3__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1978:1: rule__Activity__Group_3__2__Impl : ( ( rule__Activity__SpecificationAssignment_3_2 ) ) ;
    public final void rule__Activity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1982:1: ( ( ( rule__Activity__SpecificationAssignment_3_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1983:1: ( ( rule__Activity__SpecificationAssignment_3_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1983:1: ( ( rule__Activity__SpecificationAssignment_3_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1984:1: ( rule__Activity__SpecificationAssignment_3_2 )
            {
             before(grammarAccess.getActivityAccess().getSpecificationAssignment_3_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1985:1: ( rule__Activity__SpecificationAssignment_3_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1985:2: rule__Activity__SpecificationAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SpecificationAssignment_3_2_in_rule__Activity__Group_3__2__Impl3935);
            rule__Activity__SpecificationAssignment_3_2();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getSpecificationAssignment_3_2()); 

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
    // $ANTLR end rule__Activity__Group_3__2__Impl


    // $ANTLR start rule__Activity__Group_3__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1995:1: rule__Activity__Group_3__3 : rule__Activity__Group_3__3__Impl ;
    public final void rule__Activity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1999:1: ( rule__Activity__Group_3__3__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2000:2: rule__Activity__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33965);
            rule__Activity__Group_3__3__Impl();
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
    // $ANTLR end rule__Activity__Group_3__3


    // $ANTLR start rule__Activity__Group_3__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2006:1: rule__Activity__Group_3__3__Impl : ( ']' ) ;
    public final void rule__Activity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2010:1: ( ( ']' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2011:1: ( ']' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2011:1: ( ']' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2012:1: ']'
            {
             before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Activity__Group_3__3__Impl3993); 
             after(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_3()); 

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
    // $ANTLR end rule__Activity__Group_3__3__Impl


    // $ANTLR start rule__Variable__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2033:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2037:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2038:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__04032);
            rule__Variable__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04035);
            rule__Variable__Group__1();
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
    // $ANTLR end rule__Variable__Group__0


    // $ANTLR start rule__Variable__Group__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2045:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2049:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2051:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2052:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2054:1: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__0__Impl


    // $ANTLR start rule__Variable__Group__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2064:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2068:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2069:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__14093);
            rule__Variable__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14096);
            rule__Variable__Group__2();
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
    // $ANTLR end rule__Variable__Group__1


    // $ANTLR start rule__Variable__Group__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2076:1: rule__Variable__Group__1__Impl : ( 'variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2080:1: ( ( 'variable' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2081:1: ( 'variable' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2081:1: ( 'variable' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2082:1: 'variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Variable__Group__1__Impl4124); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_1()); 

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
    // $ANTLR end rule__Variable__Group__1__Impl


    // $ANTLR start rule__Variable__Group__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2095:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2099:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2100:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__24155);
            rule__Variable__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__24158);
            rule__Variable__Group__3();
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
    // $ANTLR end rule__Variable__Group__2


    // $ANTLR start rule__Variable__Group__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2107:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2111:1: ( ( ( rule__Variable__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2112:1: ( ( rule__Variable__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2112:1: ( ( rule__Variable__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2113:1: ( rule__Variable__NameAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2114:1: ( rule__Variable__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2114:2: rule__Variable__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_2_in_rule__Variable__Group__2__Impl4185);
            rule__Variable__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__Variable__Group__2__Impl


    // $ANTLR start rule__Variable__Group__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2124:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2128:1: ( rule__Variable__Group__3__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2129:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__34215);
            rule__Variable__Group__3__Impl();
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
    // $ANTLR end rule__Variable__Group__3


    // $ANTLR start rule__Variable__Group__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2135:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2139:1: ( ( ( rule__Variable__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2140:1: ( ( rule__Variable__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2140:1: ( ( rule__Variable__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2141:1: ( rule__Variable__Group_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2142:1: ( rule__Variable__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2142:2: rule__Variable__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Group__3__Impl4242);
                    rule__Variable__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_3()); 

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
    // $ANTLR end rule__Variable__Group__3__Impl


    // $ANTLR start rule__Variable__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2160:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2164:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2165:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_3__0__Impl_in_rule__Variable__Group_3__04281);
            rule__Variable__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__04284);
            rule__Variable__Group_3__1();
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
    // $ANTLR end rule__Variable__Group_3__0


    // $ANTLR start rule__Variable__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2172:1: rule__Variable__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( ( ':' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2177:1: ( ':' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2177:1: ( ':' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2178:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Variable__Group_3__0__Impl4312); 
             after(grammarAccess.getVariableAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end rule__Variable__Group_3__0__Impl


    // $ANTLR start rule__Variable__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2191:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2195:1: ( rule__Variable__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2196:2: rule__Variable__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_3__1__Impl_in_rule__Variable__Group_3__14343);
            rule__Variable__Group_3__1__Impl();
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
    // $ANTLR end rule__Variable__Group_3__1


    // $ANTLR start rule__Variable__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2202:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__TypeAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2206:1: ( ( ( rule__Variable__TypeAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2207:1: ( ( rule__Variable__TypeAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2207:1: ( ( rule__Variable__TypeAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2208:1: ( rule__Variable__TypeAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2209:1: ( rule__Variable__TypeAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2209:2: rule__Variable__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__TypeAssignment_3_1_in_rule__Variable__Group_3__1__Impl4370);
            rule__Variable__TypeAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end rule__Variable__Group_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2224:1: rule__Class_Impl__Group__0 : rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 ;
    public final void rule__Class_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2228:1: ( rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2229:2: rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__04405);
            rule__Class_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__04408);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2236:1: rule__Class_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Class_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2240:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2241:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2241:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2242:1: ()
            {
             before(grammarAccess.getClass_ImplAccess().getClassAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2243:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2245:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2255:1: rule__Class_Impl__Group__1 : rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 ;
    public final void rule__Class_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2259:1: ( rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2260:2: rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__14466);
            rule__Class_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__14469);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2267:1: rule__Class_Impl__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2271:1: ( ( 'class' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2272:1: ( 'class' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2272:1: ( 'class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2273:1: 'class'
            {
             before(grammarAccess.getClass_ImplAccess().getClassKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Class_Impl__Group__1__Impl4497); 
             after(grammarAccess.getClass_ImplAccess().getClassKeyword_1()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2286:1: rule__Class_Impl__Group__2 : rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 ;
    public final void rule__Class_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2290:1: ( rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2291:2: rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__24528);
            rule__Class_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__24531);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2298:1: rule__Class_Impl__Group__2__Impl : ( ( rule__Class_Impl__NameAssignment_2 ) ) ;
    public final void rule__Class_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2302:1: ( ( ( rule__Class_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2303:1: ( ( rule__Class_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2303:1: ( ( rule__Class_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2304:1: ( rule__Class_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2305:1: ( rule__Class_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2305:2: rule__Class_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NameAssignment_2_in_rule__Class_Impl__Group__2__Impl4558);
            rule__Class_Impl__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNameAssignment_2()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2315:1: rule__Class_Impl__Group__3 : rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 ;
    public final void rule__Class_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2319:1: ( rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2320:2: rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__34588);
            rule__Class_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__34591);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2327:1: rule__Class_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2331:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2332:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2332:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2333:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group__3__Impl4619); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2346:1: rule__Class_Impl__Group__4 : rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 ;
    public final void rule__Class_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2350:1: ( rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2351:2: rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__44650);
            rule__Class_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__44653);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2358:1: rule__Class_Impl__Group__4__Impl : ( ( rule__Class_Impl__Group_4__0 )? ) ;
    public final void rule__Class_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2362:1: ( ( ( rule__Class_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2363:1: ( ( rule__Class_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2363:1: ( ( rule__Class_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2364:1: ( rule__Class_Impl__Group_4__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2365:1: ( rule__Class_Impl__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2365:2: rule__Class_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl4680);
                    rule__Class_Impl__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_4()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2375:1: rule__Class_Impl__Group__5 : rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 ;
    public final void rule__Class_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2379:1: ( rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2380:2: rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__54711);
            rule__Class_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__54714);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2387:1: rule__Class_Impl__Group__5__Impl : ( ( rule__Class_Impl__Group_5__0 )? ) ;
    public final void rule__Class_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2391:1: ( ( ( rule__Class_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2392:1: ( ( rule__Class_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2392:1: ( ( rule__Class_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2393:1: ( rule__Class_Impl__Group_5__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2394:1: ( rule__Class_Impl__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2394:2: rule__Class_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl4741);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2404:1: rule__Class_Impl__Group__6 : rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 ;
    public final void rule__Class_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2408:1: ( rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2409:2: rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__64772);
            rule__Class_Impl__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__64775);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2416:1: rule__Class_Impl__Group__6__Impl : ( ( rule__Class_Impl__Group_6__0 )? ) ;
    public final void rule__Class_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2420:1: ( ( ( rule__Class_Impl__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2421:1: ( ( rule__Class_Impl__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2421:1: ( ( rule__Class_Impl__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2422:1: ( rule__Class_Impl__Group_6__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2423:1: ( rule__Class_Impl__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2423:2: rule__Class_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl4802);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2433:1: rule__Class_Impl__Group__7 : rule__Class_Impl__Group__7__Impl ;
    public final void rule__Class_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2437:1: ( rule__Class_Impl__Group__7__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2438:2: rule__Class_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__74833);
            rule__Class_Impl__Group__7__Impl();
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2444:1: rule__Class_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2448:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2449:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2449:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2450:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group__7__Impl4861); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start rule__Class_Impl__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2479:1: rule__Class_Impl__Group_4__0 : rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 ;
    public final void rule__Class_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2483:1: ( rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2484:2: rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__04908);
            rule__Class_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__04911);
            rule__Class_Impl__Group_4__1();
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
    // $ANTLR end rule__Class_Impl__Group_4__0


    // $ANTLR start rule__Class_Impl__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2491:1: rule__Class_Impl__Group_4__0__Impl : ( 'ownedAttribute' ) ;
    public final void rule__Class_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2495:1: ( ( 'ownedAttribute' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2496:1: ( 'ownedAttribute' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2496:1: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2497:1: 'ownedAttribute'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Class_Impl__Group_4__0__Impl4939); 
             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_4_0()); 

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
    // $ANTLR end rule__Class_Impl__Group_4__0__Impl


    // $ANTLR start rule__Class_Impl__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2510:1: rule__Class_Impl__Group_4__1 : rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2 ;
    public final void rule__Class_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2514:1: ( rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2515:2: rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__14970);
            rule__Class_Impl__Group_4__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__2_in_rule__Class_Impl__Group_4__14973);
            rule__Class_Impl__Group_4__2();
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
    // $ANTLR end rule__Class_Impl__Group_4__1


    // $ANTLR start rule__Class_Impl__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2522:1: rule__Class_Impl__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2526:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2528:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_4__1__Impl5001); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end rule__Class_Impl__Group_4__1__Impl


    // $ANTLR start rule__Class_Impl__Group_4__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2541:1: rule__Class_Impl__Group_4__2 : rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3 ;
    public final void rule__Class_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2545:1: ( rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2546:2: rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__2__Impl_in_rule__Class_Impl__Group_4__25032);
            rule__Class_Impl__Group_4__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__3_in_rule__Class_Impl__Group_4__25035);
            rule__Class_Impl__Group_4__3();
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
    // $ANTLR end rule__Class_Impl__Group_4__2


    // $ANTLR start rule__Class_Impl__Group_4__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2553:1: rule__Class_Impl__Group_4__2__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) ) ;
    public final void rule__Class_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2557:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2558:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2558:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2559:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2560:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2560:2: rule__Class_Impl__OwnedAttributeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_2_in_rule__Class_Impl__Group_4__2__Impl5062);
            rule__Class_Impl__OwnedAttributeAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_2()); 

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
    // $ANTLR end rule__Class_Impl__Group_4__2__Impl


    // $ANTLR start rule__Class_Impl__Group_4__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2570:1: rule__Class_Impl__Group_4__3 : rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4 ;
    public final void rule__Class_Impl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2574:1: ( rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2575:2: rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__3__Impl_in_rule__Class_Impl__Group_4__35092);
            rule__Class_Impl__Group_4__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__4_in_rule__Class_Impl__Group_4__35095);
            rule__Class_Impl__Group_4__4();
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
    // $ANTLR end rule__Class_Impl__Group_4__3


    // $ANTLR start rule__Class_Impl__Group_4__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2582:1: rule__Class_Impl__Group_4__3__Impl : ( ( rule__Class_Impl__Group_4_3__0 )* ) ;
    public final void rule__Class_Impl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2586:1: ( ( ( rule__Class_Impl__Group_4_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2587:1: ( ( rule__Class_Impl__Group_4_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2587:1: ( ( rule__Class_Impl__Group_4_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2588:1: ( rule__Class_Impl__Group_4_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_4_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2589:1: ( rule__Class_Impl__Group_4_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2589:2: rule__Class_Impl__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__0_in_rule__Class_Impl__Group_4__3__Impl5122);
            	    rule__Class_Impl__Group_4_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_4_3()); 

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
    // $ANTLR end rule__Class_Impl__Group_4__3__Impl


    // $ANTLR start rule__Class_Impl__Group_4__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2599:1: rule__Class_Impl__Group_4__4 : rule__Class_Impl__Group_4__4__Impl ;
    public final void rule__Class_Impl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2603:1: ( rule__Class_Impl__Group_4__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2604:2: rule__Class_Impl__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__4__Impl_in_rule__Class_Impl__Group_4__45153);
            rule__Class_Impl__Group_4__4__Impl();
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
    // $ANTLR end rule__Class_Impl__Group_4__4


    // $ANTLR start rule__Class_Impl__Group_4__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2610:1: rule__Class_Impl__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2614:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2615:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2615:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2616:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_4__4__Impl5181); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end rule__Class_Impl__Group_4__4__Impl


    // $ANTLR start rule__Class_Impl__Group_4_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2639:1: rule__Class_Impl__Group_4_3__0 : rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1 ;
    public final void rule__Class_Impl__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2643:1: ( rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2644:2: rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__0__Impl_in_rule__Class_Impl__Group_4_3__05222);
            rule__Class_Impl__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__1_in_rule__Class_Impl__Group_4_3__05225);
            rule__Class_Impl__Group_4_3__1();
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
    // $ANTLR end rule__Class_Impl__Group_4_3__0


    // $ANTLR start rule__Class_Impl__Group_4_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2651:1: rule__Class_Impl__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Class_Impl__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2655:1: ( ( ';' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2656:1: ( ';' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2656:1: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2657:1: ';'
            {
             before(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_4_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Class_Impl__Group_4_3__0__Impl5253); 
             after(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_4_3_0()); 

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
    // $ANTLR end rule__Class_Impl__Group_4_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_4_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2670:1: rule__Class_Impl__Group_4_3__1 : rule__Class_Impl__Group_4_3__1__Impl ;
    public final void rule__Class_Impl__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2674:1: ( rule__Class_Impl__Group_4_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2675:2: rule__Class_Impl__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__1__Impl_in_rule__Class_Impl__Group_4_3__15284);
            rule__Class_Impl__Group_4_3__1__Impl();
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
    // $ANTLR end rule__Class_Impl__Group_4_3__1


    // $ANTLR start rule__Class_Impl__Group_4_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2681:1: rule__Class_Impl__Group_4_3__1__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) ) ;
    public final void rule__Class_Impl__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2685:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2686:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2686:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2687:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:2: rule__Class_Impl__OwnedAttributeAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_3_1_in_rule__Class_Impl__Group_4_3__1__Impl5311);
            rule__Class_Impl__OwnedAttributeAssignment_4_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_3_1()); 

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
    // $ANTLR end rule__Class_Impl__Group_4_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2702:1: rule__Class_Impl__Group_5__0 : rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 ;
    public final void rule__Class_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2706:1: ( rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2707:2: rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__05345);
            rule__Class_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__05348);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2714:1: rule__Class_Impl__Group_5__0__Impl : ( 'nestedClassifier' ) ;
    public final void rule__Class_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2718:1: ( ( 'nestedClassifier' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2719:1: ( 'nestedClassifier' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2719:1: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2720:1: 'nestedClassifier'
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Class_Impl__Group_5__0__Impl5376); 
             after(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_5_0()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2733:1: rule__Class_Impl__Group_5__1 : rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 ;
    public final void rule__Class_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2737:1: ( rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2738:2: rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__15407);
            rule__Class_Impl__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__15410);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2745:1: rule__Class_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2749:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2750:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2750:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2751:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_5__1__Impl5438); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2764:1: rule__Class_Impl__Group_5__2 : rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 ;
    public final void rule__Class_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2768:1: ( rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2769:2: rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__25469);
            rule__Class_Impl__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__25472);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2776:1: rule__Class_Impl__Group_5__2__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) ) ;
    public final void rule__Class_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2780:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2781:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2781:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2782:1: ( rule__Class_Impl__NestedClassifierAssignment_5_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2783:1: ( rule__Class_Impl__NestedClassifierAssignment_5_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2783:2: rule__Class_Impl__NestedClassifierAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl5499);
            rule__Class_Impl__NestedClassifierAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_2()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2793:1: rule__Class_Impl__Group_5__3 : rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 ;
    public final void rule__Class_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2797:1: ( rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2798:2: rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__35529);
            rule__Class_Impl__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__35532);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2805:1: rule__Class_Impl__Group_5__3__Impl : ( ( rule__Class_Impl__Group_5_3__0 )* ) ;
    public final void rule__Class_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2809:1: ( ( ( rule__Class_Impl__Group_5_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2810:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2810:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2811:1: ( rule__Class_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2812:1: ( rule__Class_Impl__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2812:2: rule__Class_Impl__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl5559);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2822:1: rule__Class_Impl__Group_5__4 : rule__Class_Impl__Group_5__4__Impl ;
    public final void rule__Class_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2826:1: ( rule__Class_Impl__Group_5__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2827:2: rule__Class_Impl__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__45590);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2833:1: rule__Class_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2837:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2838:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2838:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2839:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_5__4__Impl5618); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2862:1: rule__Class_Impl__Group_5_3__0 : rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 ;
    public final void rule__Class_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2866:1: ( rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2867:2: rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__05659);
            rule__Class_Impl__Group_5_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__05662);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2874:1: rule__Class_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2878:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2879:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2879:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2880:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Class_Impl__Group_5_3__0__Impl5690); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2893:1: rule__Class_Impl__Group_5_3__1 : rule__Class_Impl__Group_5_3__1__Impl ;
    public final void rule__Class_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2897:1: ( rule__Class_Impl__Group_5_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2898:2: rule__Class_Impl__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__15721);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2904:1: rule__Class_Impl__Group_5_3__1__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) ) ;
    public final void rule__Class_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2908:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2909:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2909:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2910:1: ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2911:1: ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2911:2: rule__Class_Impl__NestedClassifierAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl5748);
            rule__Class_Impl__NestedClassifierAssignment_5_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_3_1()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2925:1: rule__Class_Impl__Group_6__0 : rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 ;
    public final void rule__Class_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2929:1: ( rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2930:2: rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__05782);
            rule__Class_Impl__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__05785);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2937:1: rule__Class_Impl__Group_6__0__Impl : ( 'ownedOperation' ) ;
    public final void rule__Class_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2941:1: ( ( 'ownedOperation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2942:1: ( 'ownedOperation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2942:1: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2943:1: 'ownedOperation'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_6_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Class_Impl__Group_6__0__Impl5813); 
             after(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_6_0()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2956:1: rule__Class_Impl__Group_6__1 : rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 ;
    public final void rule__Class_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2960:1: ( rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2961:2: rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__15844);
            rule__Class_Impl__Group_6__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__15847);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2968:1: rule__Class_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2972:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2973:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2973:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2974:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_6__1__Impl5875); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2987:1: rule__Class_Impl__Group_6__2 : rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 ;
    public final void rule__Class_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2991:1: ( rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2992:2: rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__25906);
            rule__Class_Impl__Group_6__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__25909);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2999:1: rule__Class_Impl__Group_6__2__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) ) ;
    public final void rule__Class_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3003:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3004:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3004:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3005:1: ( rule__Class_Impl__OwnedOperationAssignment_6_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3006:1: ( rule__Class_Impl__OwnedOperationAssignment_6_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3006:2: rule__Class_Impl__OwnedOperationAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl5936);
            rule__Class_Impl__OwnedOperationAssignment_6_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_2()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3016:1: rule__Class_Impl__Group_6__3 : rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 ;
    public final void rule__Class_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3020:1: ( rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3021:2: rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__35966);
            rule__Class_Impl__Group_6__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__35969);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3028:1: rule__Class_Impl__Group_6__3__Impl : ( ( rule__Class_Impl__Group_6_3__0 )* ) ;
    public final void rule__Class_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3032:1: ( ( ( rule__Class_Impl__Group_6_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3033:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3033:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3034:1: ( rule__Class_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3035:1: ( rule__Class_Impl__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3035:2: rule__Class_Impl__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl5996);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3045:1: rule__Class_Impl__Group_6__4 : rule__Class_Impl__Group_6__4__Impl ;
    public final void rule__Class_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3049:1: ( rule__Class_Impl__Group_6__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3050:2: rule__Class_Impl__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__46027);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3056:1: rule__Class_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3060:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3061:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3061:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3062:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_6__4__Impl6055); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3085:1: rule__Class_Impl__Group_6_3__0 : rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 ;
    public final void rule__Class_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3089:1: ( rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3090:2: rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__06096);
            rule__Class_Impl__Group_6_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__06099);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3097:1: rule__Class_Impl__Group_6_3__0__Impl : ( ';' ) ;
    public final void rule__Class_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3101:1: ( ( ';' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3102:1: ( ';' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3102:1: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3103:1: ';'
            {
             before(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_6_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Class_Impl__Group_6_3__0__Impl6127); 
             after(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_6_3_0()); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3116:1: rule__Class_Impl__Group_6_3__1 : rule__Class_Impl__Group_6_3__1__Impl ;
    public final void rule__Class_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3120:1: ( rule__Class_Impl__Group_6_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3121:2: rule__Class_Impl__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__16158);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3127:1: rule__Class_Impl__Group_6_3__1__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) ) ;
    public final void rule__Class_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3131:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3132:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3132:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3133:1: ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3134:1: ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3134:2: rule__Class_Impl__OwnedOperationAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl6185);
            rule__Class_Impl__OwnedOperationAssignment_6_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_3_1()); 

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


    // $ANTLR start rule__LiteralInteger__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3148:1: rule__LiteralInteger__Group__0 : rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 ;
    public final void rule__LiteralInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3152:1: ( rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3153:2: rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__06219);
            rule__LiteralInteger__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__06222);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3160:1: rule__LiteralInteger__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3164:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3165:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3165:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3166:1: ()
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3167:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3169:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3179:1: rule__LiteralInteger__Group__1 : rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 ;
    public final void rule__LiteralInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3183:1: ( rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3184:2: rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__16280);
            rule__LiteralInteger__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__16283);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3191:1: rule__LiteralInteger__Group__1__Impl : ( 'LiteralInteger' ) ;
    public final void rule__LiteralInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3195:1: ( ( 'LiteralInteger' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3196:1: ( 'LiteralInteger' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3196:1: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3197:1: 'LiteralInteger'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralInteger__Group__1__Impl6311); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3210:1: rule__LiteralInteger__Group__2 : rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 ;
    public final void rule__LiteralInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3214:1: ( rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3215:2: rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__26342);
            rule__LiteralInteger__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__26345);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3222:1: rule__LiteralInteger__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3226:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3227:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3227:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3228:1: '{'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralInteger__Group__2__Impl6373); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3241:1: rule__LiteralInteger__Group__3 : rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 ;
    public final void rule__LiteralInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3245:1: ( rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3246:2: rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__36404);
            rule__LiteralInteger__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__36407);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3253:1: rule__LiteralInteger__Group__3__Impl : ( ( rule__LiteralInteger__Group_3__0 )? ) ;
    public final void rule__LiteralInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3257:1: ( ( ( rule__LiteralInteger__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3258:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3258:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3259:1: ( rule__LiteralInteger__Group_3__0 )?
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3260:1: ( rule__LiteralInteger__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3260:2: rule__LiteralInteger__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl6434);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3270:1: rule__LiteralInteger__Group__4 : rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 ;
    public final void rule__LiteralInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3274:1: ( rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3275:2: rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__46465);
            rule__LiteralInteger__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__46468);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3282:1: rule__LiteralInteger__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3286:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3287:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3287:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3288:1: 'value'
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralInteger__Group__4__Impl6496); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3301:1: rule__LiteralInteger__Group__5 : rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 ;
    public final void rule__LiteralInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3305:1: ( rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3306:2: rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__56527);
            rule__LiteralInteger__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__56530);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3313:1: rule__LiteralInteger__Group__5__Impl : ( ( rule__LiteralInteger__ValueAssignment_5 ) ) ;
    public final void rule__LiteralInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3317:1: ( ( ( rule__LiteralInteger__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3318:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3318:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3319:1: ( rule__LiteralInteger__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3320:1: ( rule__LiteralInteger__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3320:2: rule__LiteralInteger__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl6557);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3330:1: rule__LiteralInteger__Group__6 : rule__LiteralInteger__Group__6__Impl ;
    public final void rule__LiteralInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3334:1: ( rule__LiteralInteger__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3335:2: rule__LiteralInteger__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__66587);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3341:1: rule__LiteralInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3345:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3346:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3346:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3347:1: '}'
            {
             before(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralInteger__Group__6__Impl6615); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3374:1: rule__LiteralInteger__Group_3__0 : rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 ;
    public final void rule__LiteralInteger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3378:1: ( rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3379:2: rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__06660);
            rule__LiteralInteger__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__06663);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3386:1: rule__LiteralInteger__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralInteger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3390:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3391:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3391:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3392:1: 'name'
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralInteger__Group_3__0__Impl6691); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3405:1: rule__LiteralInteger__Group_3__1 : rule__LiteralInteger__Group_3__1__Impl ;
    public final void rule__LiteralInteger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3409:1: ( rule__LiteralInteger__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3410:2: rule__LiteralInteger__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__16722);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3416:1: rule__LiteralInteger__Group_3__1__Impl : ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralInteger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3420:1: ( ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3421:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3421:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3422:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3423:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3423:2: rule__LiteralInteger__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl6749);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3437:1: rule__LiteralString__Group__0 : rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 ;
    public final void rule__LiteralString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3441:1: ( rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3442:2: rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__06783);
            rule__LiteralString__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__06786);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3449:1: rule__LiteralString__Group__0__Impl : ( () ) ;
    public final void rule__LiteralString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3453:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3454:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3454:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3455:1: ()
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3456:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3458:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3468:1: rule__LiteralString__Group__1 : rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 ;
    public final void rule__LiteralString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3472:1: ( rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3473:2: rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__16844);
            rule__LiteralString__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__16847);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3480:1: rule__LiteralString__Group__1__Impl : ( 'LiteralString' ) ;
    public final void rule__LiteralString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3484:1: ( ( 'LiteralString' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3485:1: ( 'LiteralString' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3485:1: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3486:1: 'LiteralString'
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__LiteralString__Group__1__Impl6875); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3499:1: rule__LiteralString__Group__2 : rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 ;
    public final void rule__LiteralString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3503:1: ( rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3504:2: rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__26906);
            rule__LiteralString__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__26909);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3511:1: rule__LiteralString__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3515:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3516:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3516:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3517:1: '{'
            {
             before(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralString__Group__2__Impl6937); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3530:1: rule__LiteralString__Group__3 : rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 ;
    public final void rule__LiteralString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3534:1: ( rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3535:2: rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__36968);
            rule__LiteralString__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__36971);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3542:1: rule__LiteralString__Group__3__Impl : ( ( rule__LiteralString__Group_3__0 )? ) ;
    public final void rule__LiteralString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3546:1: ( ( ( rule__LiteralString__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3547:1: ( ( rule__LiteralString__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3547:1: ( ( rule__LiteralString__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3548:1: ( rule__LiteralString__Group_3__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3549:1: ( rule__LiteralString__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3549:2: rule__LiteralString__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl6998);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3559:1: rule__LiteralString__Group__4 : rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 ;
    public final void rule__LiteralString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3563:1: ( rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3564:2: rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__47029);
            rule__LiteralString__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__47032);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3571:1: rule__LiteralString__Group__4__Impl : ( ( rule__LiteralString__Group_4__0 )? ) ;
    public final void rule__LiteralString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3575:1: ( ( ( rule__LiteralString__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3576:1: ( ( rule__LiteralString__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3576:1: ( ( rule__LiteralString__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3577:1: ( rule__LiteralString__Group_4__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3578:1: ( rule__LiteralString__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3578:2: rule__LiteralString__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl7059);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3588:1: rule__LiteralString__Group__5 : rule__LiteralString__Group__5__Impl ;
    public final void rule__LiteralString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3592:1: ( rule__LiteralString__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3593:2: rule__LiteralString__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__57090);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3599:1: rule__LiteralString__Group__5__Impl : ( '}' ) ;
    public final void rule__LiteralString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3603:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3604:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3604:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3605:1: '}'
            {
             before(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralString__Group__5__Impl7118); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3630:1: rule__LiteralString__Group_3__0 : rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 ;
    public final void rule__LiteralString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3634:1: ( rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3635:2: rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__07161);
            rule__LiteralString__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__07164);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3642:1: rule__LiteralString__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3646:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3647:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3647:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3648:1: 'name'
            {
             before(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralString__Group_3__0__Impl7192); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3661:1: rule__LiteralString__Group_3__1 : rule__LiteralString__Group_3__1__Impl ;
    public final void rule__LiteralString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3665:1: ( rule__LiteralString__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3666:2: rule__LiteralString__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__17223);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3672:1: rule__LiteralString__Group_3__1__Impl : ( ( rule__LiteralString__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3676:1: ( ( ( rule__LiteralString__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3677:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3677:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3678:1: ( rule__LiteralString__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3679:1: ( rule__LiteralString__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3679:2: rule__LiteralString__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl7250);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3693:1: rule__LiteralString__Group_4__0 : rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 ;
    public final void rule__LiteralString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3697:1: ( rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3698:2: rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__07284);
            rule__LiteralString__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__07287);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3705:1: rule__LiteralString__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__LiteralString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3709:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3710:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3710:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3711:1: 'value'
            {
             before(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralString__Group_4__0__Impl7315); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3724:1: rule__LiteralString__Group_4__1 : rule__LiteralString__Group_4__1__Impl ;
    public final void rule__LiteralString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3728:1: ( rule__LiteralString__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3729:2: rule__LiteralString__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__17346);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3735:1: rule__LiteralString__Group_4__1__Impl : ( ( rule__LiteralString__ValueAssignment_4_1 ) ) ;
    public final void rule__LiteralString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3739:1: ( ( ( rule__LiteralString__ValueAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3740:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3740:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3741:1: ( rule__LiteralString__ValueAssignment_4_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3742:1: ( rule__LiteralString__ValueAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3742:2: rule__LiteralString__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl7373);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3756:1: rule__LiteralBoolean__Group__0 : rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 ;
    public final void rule__LiteralBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3760:1: ( rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3761:2: rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__07407);
            rule__LiteralBoolean__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__07410);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3768:1: rule__LiteralBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3772:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3773:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3773:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3774:1: ()
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3775:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3777:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3787:1: rule__LiteralBoolean__Group__1 : rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 ;
    public final void rule__LiteralBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3791:1: ( rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3792:2: rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__17468);
            rule__LiteralBoolean__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__17471);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3799:1: rule__LiteralBoolean__Group__1__Impl : ( 'LiteralBoolean' ) ;
    public final void rule__LiteralBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3803:1: ( ( 'LiteralBoolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3804:1: ( 'LiteralBoolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3804:1: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3805:1: 'LiteralBoolean'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__LiteralBoolean__Group__1__Impl7499); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3818:1: rule__LiteralBoolean__Group__2 : rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 ;
    public final void rule__LiteralBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3822:1: ( rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3823:2: rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__27530);
            rule__LiteralBoolean__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__27533);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3830:1: rule__LiteralBoolean__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3834:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3835:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3835:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3836:1: '{'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralBoolean__Group__2__Impl7561); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3849:1: rule__LiteralBoolean__Group__3 : rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 ;
    public final void rule__LiteralBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3853:1: ( rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3854:2: rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__37592);
            rule__LiteralBoolean__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__37595);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3861:1: rule__LiteralBoolean__Group__3__Impl : ( ( rule__LiteralBoolean__Group_3__0 )? ) ;
    public final void rule__LiteralBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3865:1: ( ( ( rule__LiteralBoolean__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3866:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3866:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3867:1: ( rule__LiteralBoolean__Group_3__0 )?
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3868:1: ( rule__LiteralBoolean__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3868:2: rule__LiteralBoolean__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl7622);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3878:1: rule__LiteralBoolean__Group__4 : rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 ;
    public final void rule__LiteralBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3882:1: ( rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3883:2: rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__47653);
            rule__LiteralBoolean__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__47656);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3890:1: rule__LiteralBoolean__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3894:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3895:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3895:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3896:1: 'value'
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralBoolean__Group__4__Impl7684); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3909:1: rule__LiteralBoolean__Group__5 : rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 ;
    public final void rule__LiteralBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3913:1: ( rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3914:2: rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__57715);
            rule__LiteralBoolean__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__57718);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3921:1: rule__LiteralBoolean__Group__5__Impl : ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) ;
    public final void rule__LiteralBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3925:1: ( ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3926:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3926:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3927:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3928:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3928:2: rule__LiteralBoolean__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl7745);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3938:1: rule__LiteralBoolean__Group__6 : rule__LiteralBoolean__Group__6__Impl ;
    public final void rule__LiteralBoolean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3942:1: ( rule__LiteralBoolean__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3943:2: rule__LiteralBoolean__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__67775);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3949:1: rule__LiteralBoolean__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralBoolean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3953:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3954:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3954:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3955:1: '}'
            {
             before(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralBoolean__Group__6__Impl7803); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3982:1: rule__LiteralBoolean__Group_3__0 : rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 ;
    public final void rule__LiteralBoolean__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3986:1: ( rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3987:2: rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__07848);
            rule__LiteralBoolean__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__07851);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3994:1: rule__LiteralBoolean__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralBoolean__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3998:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3999:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3999:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4000:1: 'name'
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralBoolean__Group_3__0__Impl7879); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4013:1: rule__LiteralBoolean__Group_3__1 : rule__LiteralBoolean__Group_3__1__Impl ;
    public final void rule__LiteralBoolean__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4017:1: ( rule__LiteralBoolean__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4018:2: rule__LiteralBoolean__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__17910);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4024:1: rule__LiteralBoolean__Group_3__1__Impl : ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralBoolean__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4028:1: ( ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4029:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4029:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4030:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4031:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4031:2: rule__LiteralBoolean__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl7937);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4045:1: rule__LiteralUnlimitedNatural__Group__0 : rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 ;
    public final void rule__LiteralUnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4049:1: ( rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4050:2: rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__07971);
            rule__LiteralUnlimitedNatural__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__07974);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4057:1: rule__LiteralUnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4061:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4062:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4062:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4063:1: ()
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4064:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4066:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4076:1: rule__LiteralUnlimitedNatural__Group__1 : rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 ;
    public final void rule__LiteralUnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4080:1: ( rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4081:2: rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__18032);
            rule__LiteralUnlimitedNatural__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__18035);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4088:1: rule__LiteralUnlimitedNatural__Group__1__Impl : ( 'LiteralUnlimitedNatural' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4092:1: ( ( 'LiteralUnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4093:1: ( 'LiteralUnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4093:1: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4094:1: 'LiteralUnlimitedNatural'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__LiteralUnlimitedNatural__Group__1__Impl8063); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4107:1: rule__LiteralUnlimitedNatural__Group__2 : rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 ;
    public final void rule__LiteralUnlimitedNatural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4111:1: ( rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4112:2: rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__28094);
            rule__LiteralUnlimitedNatural__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__28097);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4119:1: rule__LiteralUnlimitedNatural__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4123:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4124:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4124:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4125:1: '{'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralUnlimitedNatural__Group__2__Impl8125); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4138:1: rule__LiteralUnlimitedNatural__Group__3 : rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 ;
    public final void rule__LiteralUnlimitedNatural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4142:1: ( rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4143:2: rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__38156);
            rule__LiteralUnlimitedNatural__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__38159);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4150:1: rule__LiteralUnlimitedNatural__Group__3__Impl : ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) ;
    public final void rule__LiteralUnlimitedNatural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4154:1: ( ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4155:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4155:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4156:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4157:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4157:2: rule__LiteralUnlimitedNatural__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl8186);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4167:1: rule__LiteralUnlimitedNatural__Group__4 : rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 ;
    public final void rule__LiteralUnlimitedNatural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4171:1: ( rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4172:2: rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__48217);
            rule__LiteralUnlimitedNatural__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__48220);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4179:1: rule__LiteralUnlimitedNatural__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4183:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4184:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4184:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4185:1: 'value'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralUnlimitedNatural__Group__4__Impl8248); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4198:1: rule__LiteralUnlimitedNatural__Group__5 : rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 ;
    public final void rule__LiteralUnlimitedNatural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4202:1: ( rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4203:2: rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__58279);
            rule__LiteralUnlimitedNatural__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__58282);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4210:1: rule__LiteralUnlimitedNatural__Group__5__Impl : ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4214:1: ( ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4215:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4215:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4216:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4217:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4217:2: rule__LiteralUnlimitedNatural__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl8309);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4227:1: rule__LiteralUnlimitedNatural__Group__6 : rule__LiteralUnlimitedNatural__Group__6__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4231:1: ( rule__LiteralUnlimitedNatural__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4232:2: rule__LiteralUnlimitedNatural__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__68339);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4238:1: rule__LiteralUnlimitedNatural__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4242:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4243:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4243:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4244:1: '}'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralUnlimitedNatural__Group__6__Impl8367); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4271:1: rule__LiteralUnlimitedNatural__Group_3__0 : rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4275:1: ( rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4276:2: rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__08412);
            rule__LiteralUnlimitedNatural__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__08415);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4283:1: rule__LiteralUnlimitedNatural__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4287:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4288:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4288:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4289:1: 'name'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl8443); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4302:1: rule__LiteralUnlimitedNatural__Group_3__1 : rule__LiteralUnlimitedNatural__Group_3__1__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4306:1: ( rule__LiteralUnlimitedNatural__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4307:2: rule__LiteralUnlimitedNatural__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__18474);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4313:1: rule__LiteralUnlimitedNatural__Group_3__1__Impl : ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4317:1: ( ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4318:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4318:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4319:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4320:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4320:2: rule__LiteralUnlimitedNatural__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl8501);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4334:1: rule__LiteralNull__Group__0 : rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 ;
    public final void rule__LiteralNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4338:1: ( rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4339:2: rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__08535);
            rule__LiteralNull__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__08538);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4346:1: rule__LiteralNull__Group__0__Impl : ( () ) ;
    public final void rule__LiteralNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4350:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4351:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4351:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4352:1: ()
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4353:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4355:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4365:1: rule__LiteralNull__Group__1 : rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 ;
    public final void rule__LiteralNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4369:1: ( rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4370:2: rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__18596);
            rule__LiteralNull__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__18599);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4377:1: rule__LiteralNull__Group__1__Impl : ( 'LiteralNull' ) ;
    public final void rule__LiteralNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4381:1: ( ( 'LiteralNull' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4382:1: ( 'LiteralNull' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4382:1: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4383:1: 'LiteralNull'
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LiteralNull__Group__1__Impl8627); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4396:1: rule__LiteralNull__Group__2 : rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 ;
    public final void rule__LiteralNull__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4400:1: ( rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4401:2: rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__28658);
            rule__LiteralNull__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__28661);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4408:1: rule__LiteralNull__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralNull__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4412:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4413:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4413:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4414:1: '{'
            {
             before(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralNull__Group__2__Impl8689); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4427:1: rule__LiteralNull__Group__3 : rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 ;
    public final void rule__LiteralNull__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4431:1: ( rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4432:2: rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__38720);
            rule__LiteralNull__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__38723);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4439:1: rule__LiteralNull__Group__3__Impl : ( ( rule__LiteralNull__Group_3__0 )? ) ;
    public final void rule__LiteralNull__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4443:1: ( ( ( rule__LiteralNull__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4444:1: ( ( rule__LiteralNull__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4444:1: ( ( rule__LiteralNull__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4445:1: ( rule__LiteralNull__Group_3__0 )?
            {
             before(grammarAccess.getLiteralNullAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4446:1: ( rule__LiteralNull__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4446:2: rule__LiteralNull__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl8750);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4456:1: rule__LiteralNull__Group__4 : rule__LiteralNull__Group__4__Impl ;
    public final void rule__LiteralNull__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4460:1: ( rule__LiteralNull__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4461:2: rule__LiteralNull__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__48781);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4467:1: rule__LiteralNull__Group__4__Impl : ( '}' ) ;
    public final void rule__LiteralNull__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4471:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4472:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4472:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4473:1: '}'
            {
             before(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralNull__Group__4__Impl8809); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4496:1: rule__LiteralNull__Group_3__0 : rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 ;
    public final void rule__LiteralNull__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4500:1: ( rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4501:2: rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__08850);
            rule__LiteralNull__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__08853);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4508:1: rule__LiteralNull__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralNull__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4512:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4513:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4513:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4514:1: 'name'
            {
             before(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralNull__Group_3__0__Impl8881); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4527:1: rule__LiteralNull__Group_3__1 : rule__LiteralNull__Group_3__1__Impl ;
    public final void rule__LiteralNull__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4531:1: ( rule__LiteralNull__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4532:2: rule__LiteralNull__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__18912);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4538:1: rule__LiteralNull__Group_3__1__Impl : ( ( rule__LiteralNull__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralNull__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4542:1: ( ( ( rule__LiteralNull__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4543:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4543:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4544:1: ( rule__LiteralNull__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralNullAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4545:1: ( rule__LiteralNull__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4545:2: rule__LiteralNull__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl8939);
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


    // $ANTLR start rule__Model__NameAssignment_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4560:1: rule__Model__NameAssignment_1 : ( ruleString0 ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4564:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4565:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4565:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4566:1: ruleString0
            {
             before(grammarAccess.getModelAccess().getNameString0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Model__NameAssignment_18978);
            ruleString0();
            _fsp--;

             after(grammarAccess.getModelAccess().getNameString0ParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Model__NameAssignment_1


    // $ANTLR start rule__Model__PackagedElementAssignment_4_0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4575:1: rule__Model__PackagedElementAssignment_4_0 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4579:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4580:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4580:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4581:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_09009);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__Model__PackagedElementAssignment_4_0


    // $ANTLR start rule__Model__PackagedElementAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4590:1: rule__Model__PackagedElementAssignment_4_1 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4594:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4595:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4595:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4596:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_19040);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Model__PackagedElementAssignment_4_1


    // $ANTLR start rule__Package_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4605:1: rule__Package_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Package_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4609:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4610:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4610:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4611:1: ruleString0
            {
             before(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_29071);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4620:1: rule__Package_Impl__PackagedElementAssignment_4_0 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4624:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4625:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4625:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4626:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_09102);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4635:1: rule__Package_Impl__PackagedElementAssignment_4_1 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4639:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4640:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4640:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4641:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_19133);
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


    // $ANTLR start rule__Property_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4650:1: rule__Property_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Property_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4654:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4655:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4655:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4656:1: ruleString0
            {
             before(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_29164);
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


    // $ANTLR start rule__Property_Impl__TypeAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4665:1: rule__Property_Impl__TypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Property_Impl__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4669:1: ( ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4670:1: ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4670:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4671:1: ( ruleEString )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_3_1_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4672:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4673:1: ruleEString
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_3_19199);
            ruleEString();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Property_Impl__TypeAssignment_3_1


    // $ANTLR start rule__Operation__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4684:1: rule__Operation__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4688:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4689:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4689:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4690:1: ruleString0
            {
             before(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Operation__NameAssignment_29234);
            ruleString0();
            _fsp--;

             after(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Operation__NameAssignment_2


    // $ANTLR start rule__Activity__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4699:1: rule__Activity__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4703:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4704:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4704:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4705:1: ruleString0
            {
             before(grammarAccess.getActivityAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Activity__NameAssignment_29265);
            ruleString0();
            _fsp--;

             after(grammarAccess.getActivityAccess().getNameString0ParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Activity__NameAssignment_2


    // $ANTLR start rule__Activity__SpecificationAssignment_3_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4714:1: rule__Activity__SpecificationAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SpecificationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4718:1: ( ( ( RULE_ID ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4719:1: ( ( RULE_ID ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4719:1: ( ( RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4720:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSpecificationOperationCrossReference_3_2_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4721:1: ( RULE_ID )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4722:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSpecificationOperationIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Activity__SpecificationAssignment_3_29300); 
             after(grammarAccess.getActivityAccess().getSpecificationOperationIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSpecificationOperationCrossReference_3_2_0()); 

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
    // $ANTLR end rule__Activity__SpecificationAssignment_3_2


    // $ANTLR start rule__Activity__OwnedAttributeAssignment_7_0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4733:1: rule__Activity__OwnedAttributeAssignment_7_0 : ( ruleProperty ) ;
    public final void rule__Activity__OwnedAttributeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4737:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4738:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4738:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4739:1: ruleProperty
            {
             before(grammarAccess.getActivityAccess().getOwnedAttributePropertyParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Activity__OwnedAttributeAssignment_7_09335);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getActivityAccess().getOwnedAttributePropertyParserRuleCall_7_0_0()); 

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
    // $ANTLR end rule__Activity__OwnedAttributeAssignment_7_0


    // $ANTLR start rule__Activity__VariableAssignment_7_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4748:1: rule__Activity__VariableAssignment_7_1 : ( ruleVariable ) ;
    public final void rule__Activity__VariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4752:1: ( ( ruleVariable ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4753:1: ( ruleVariable )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4753:1: ( ruleVariable )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4754:1: ruleVariable
            {
             before(grammarAccess.getActivityAccess().getVariableVariableParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Activity__VariableAssignment_7_19366);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getActivityAccess().getVariableVariableParserRuleCall_7_1_0()); 

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
    // $ANTLR end rule__Activity__VariableAssignment_7_1


    // $ANTLR start rule__Variable__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4763:1: rule__Variable__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4767:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4768:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4768:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4769:1: ruleString0
            {
             before(grammarAccess.getVariableAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Variable__NameAssignment_29397);
            ruleString0();
            _fsp--;

             after(grammarAccess.getVariableAccess().getNameString0ParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Variable__NameAssignment_2


    // $ANTLR start rule__Variable__TypeAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4778:1: rule__Variable__TypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4782:1: ( ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4783:1: ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4783:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4784:1: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_3_1_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4785:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4786:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__TypeAssignment_3_19432);
            ruleEString();
            _fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Variable__TypeAssignment_3_1


    // $ANTLR start rule__Class_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4797:1: rule__Class_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Class_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4801:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4802:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4802:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4803:1: ruleString0
            {
             before(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_29467);
            ruleString0();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Class_Impl__NameAssignment_2


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_4_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4812:1: rule__Class_Impl__OwnedAttributeAssignment_4_2 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4816:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4817:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4817:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4818:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_29498);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_2_0()); 

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
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_4_2


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_4_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4827:1: rule__Class_Impl__OwnedAttributeAssignment_4_3_1 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4831:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4832:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4832:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4833:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_3_19529);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_4_3_1


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_5_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4842:1: rule__Class_Impl__NestedClassifierAssignment_5_2 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4846:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4847:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4847:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4848:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_29560);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_2_0()); 

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
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_5_2


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_5_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4857:1: rule__Class_Impl__NestedClassifierAssignment_5_3_1 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4861:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4862:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4862:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4863:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_3_19591);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_5_3_1


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_6_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4872:1: rule__Class_Impl__OwnedOperationAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4876:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4877:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4877:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4878:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_29622);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_2_0()); 

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
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_6_2


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_6_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4887:1: rule__Class_Impl__OwnedOperationAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4891:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4892:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4892:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4893:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_3_19653);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_6_3_1


    // $ANTLR start rule__LiteralInteger__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4902:1: rule__LiteralInteger__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralInteger__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4906:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4907:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4907:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4908:1: ruleString0
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_19684);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4917:1: rule__LiteralInteger__ValueAssignment_5 : ( ruleInteger ) ;
    public final void rule__LiteralInteger__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4921:1: ( ( ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4922:1: ( ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4922:1: ( ruleInteger )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4923:1: ruleInteger
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_59715);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4932:1: rule__LiteralString__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4936:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4937:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4937:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4938:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_19746);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4947:1: rule__LiteralString__ValueAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4951:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4952:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4952:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4953:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_19777);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4962:1: rule__LiteralBoolean__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralBoolean__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4966:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4967:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4967:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4968:1: ruleString0
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_19808);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4977:1: rule__LiteralBoolean__ValueAssignment_5 : ( ruleBoolean ) ;
    public final void rule__LiteralBoolean__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4981:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4982:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4982:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4983:1: ruleBoolean
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_59839);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4992:1: rule__LiteralUnlimitedNatural__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralUnlimitedNatural__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4996:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4997:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4997:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4998:1: ruleString0
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_19870);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5007:1: rule__LiteralUnlimitedNatural__ValueAssignment_5 : ( ruleUnlimitedNatural ) ;
    public final void rule__LiteralUnlimitedNatural__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5011:1: ( ( ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5012:1: ( ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5012:1: ( ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5013:1: ruleUnlimitedNatural
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_59901);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5022:1: rule__LiteralNull__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralNull__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5026:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5027:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5027:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5028:1: ruleString0
            {
             before(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_19932);
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
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PackageableElement__Alternatives_in_rulePackageableElement94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_ruleClassifier220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_ruleProperty279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0_in_rulePackage_Impl340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_Impl374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0_in_ruleProperty_Impl400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInteger703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Alternatives_in_ruleString0764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBoolean825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural853 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleUnlimitedNatural887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString1037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__PackageableElement__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__PackageableElement__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__OwnedAttributeAssignment_7_0_in_rule__Activity__Alternatives_71377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__VariableAssignment_7_1_in_rule__Activity__Alternatives_71395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__Alternatives1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__String0__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11590 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21650 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__2__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31712 = new BitSet(new long[]{0x0000000010830030L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__3__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41774 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group__5__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01906 = new BitSet(new long[]{0x0000000010820032L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_4_0_in_rule__Model__Group_4__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_4_1_in_rule__Model__Group_4__1__Impl1993 = new BitSet(new long[]{0x0000000010820032L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__02028 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__12089 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__12092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package_Impl__Group__1__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22151 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32211 = new BitSet(new long[]{0x0000000010830030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Package_Impl__Group__3__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42273 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package_Impl__Group__5__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02405 = new BitSet(new long[]{0x0000000010820032L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2492 = new BitSet(new long[]{0x0000000010820032L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02527 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Property_Impl__Group__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22650 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__0_in_rule__Property_Impl__Group__3__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__0__Impl_in_rule__Property_Impl__Group_3__02776 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__1_in_rule__Property_Impl__Group_3__02779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Property_Impl__Group_3__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__1__Impl_in_rule__Property_Impl__Group_3__12838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__TypeAssignment_3_1_in_rule__Property_Impl__Group_3__1__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02899 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operation__Group__1__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23022 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33082 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operation__Group__3__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__43144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__4__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03213 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13274 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Activity__Group__1__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23336 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33396 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43457 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group__4__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53519 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group__5__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63581 = new BitSet(new long[]{0x0000000008050000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Activity__Group__6__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73643 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Alternatives_7_in_rule__Activity__Group__7__Impl3673 = new BitSet(new long[]{0x0000000008040002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Activity__Group__8__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03781 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Activity__Group_3__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13843 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Activity__Group_3__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23905 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SpecificationAssignment_3_2_in_rule__Activity__Group_3__2__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Activity__Group_3__3__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__04032 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__14093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Variable__Group__1__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__24155 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__24158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_2_in_rule__Variable__Group__2__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__34215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Group__3__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_3__0__Impl_in_rule__Variable__Group_3__04281 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__04284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Variable__Group_3__0__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_3__1__Impl_in_rule__Variable__Group_3__14343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__TypeAssignment_3_1_in_rule__Variable__Group_3__1__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__04405 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__04408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__14466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__14469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Class_Impl__Group__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__24528 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__24531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NameAssignment_2_in_rule__Class_Impl__Group__2__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__34588 = new BitSet(new long[]{0x00000002A0010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__34591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group__3__Impl4619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__44650 = new BitSet(new long[]{0x0000000280010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__44653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__54711 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__54714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__64772 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__64775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__74833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group__7__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__04908 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__04911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Class_Impl__Group_4__0__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__14970 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__2_in_rule__Class_Impl__Group_4__14973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_4__1__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__2__Impl_in_rule__Class_Impl__Group_4__25032 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__3_in_rule__Class_Impl__Group_4__25035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_2_in_rule__Class_Impl__Group_4__2__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__3__Impl_in_rule__Class_Impl__Group_4__35092 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__4_in_rule__Class_Impl__Group_4__35095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__0_in_rule__Class_Impl__Group_4__3__Impl5122 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__4__Impl_in_rule__Class_Impl__Group_4__45153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_4__4__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__0__Impl_in_rule__Class_Impl__Group_4_3__05222 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__1_in_rule__Class_Impl__Group_4_3__05225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Class_Impl__Group_4_3__0__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__1__Impl_in_rule__Class_Impl__Group_4_3__15284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_3_1_in_rule__Class_Impl__Group_4_3__1__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__05345 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__05348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Class_Impl__Group_5__0__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__15407 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__15410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_5__1__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__25469 = new BitSet(new long[]{0x0000000100010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__25472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl5499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__35529 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__35532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl5559 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__45590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_5__4__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__05659 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__05662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Class_Impl__Group_5_3__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__15721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__05782 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__05785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Class_Impl__Group_6__0__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__15844 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__15847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_6__1__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__25906 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__25909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__35966 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__35969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl5996 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__46027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_6__4__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__06096 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__06099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Class_Impl__Group_6_3__0__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__16158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__06219 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__06222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__16280 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__16283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralInteger__Group__1__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__26342 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__26345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralInteger__Group__2__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__36404 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__36407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__46465 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__46468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralInteger__Group__4__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__56527 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__56530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__66587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralInteger__Group__6__Impl6615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__06660 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__06663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralInteger__Group_3__0__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__16722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__06783 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__06786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__16844 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__16847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__LiteralString__Group__1__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__26906 = new BitSet(new long[]{0x0000001800010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__26909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralString__Group__2__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__36968 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__36971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__47029 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__47032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__57090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralString__Group__5__Impl7118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__07161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__07164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralString__Group_3__0__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__17223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl7250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__07284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__07287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralString__Group_4__0__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__17346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__07407 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__07410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__17468 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__17471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__LiteralBoolean__Group__1__Impl7499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__27530 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__27533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralBoolean__Group__2__Impl7561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__37592 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__37595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl7622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__47653 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__47656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralBoolean__Group__4__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__57715 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__57718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__67775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralBoolean__Group__6__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__07848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__07851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralBoolean__Group_3__0__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__17910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl7937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__07971 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__07974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__18032 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__18035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__LiteralUnlimitedNatural__Group__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__28094 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__28097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralUnlimitedNatural__Group__2__Impl8125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__38156 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__38159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__48217 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__48220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralUnlimitedNatural__Group__4__Impl8248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__58279 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__58282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl8309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__68339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralUnlimitedNatural__Group__6__Impl8367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__08412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__08415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl8443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__18474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl8501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__08535 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__08538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__18596 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__18599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LiteralNull__Group__1__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__28658 = new BitSet(new long[]{0x0000001000010000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__28661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralNull__Group__2__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__38720 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__38723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl8750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__48781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralNull__Group__4__Impl8809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__08850 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__08853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralNull__Group_3__0__Impl8881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__18912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Model__NameAssignment_18978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_09009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_19040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_29071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_09102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_19133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_29164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_3_19199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Operation__NameAssignment_29234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Activity__NameAssignment_29265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SpecificationAssignment_3_29300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Activity__OwnedAttributeAssignment_7_09335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Activity__VariableAssignment_7_19366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Variable__NameAssignment_29397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__TypeAssignment_3_19432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_29467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_29498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_3_19529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_29560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_3_19591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_29622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_3_19653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_19684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_59715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_19746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_19777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_19808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_59839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_19870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_59901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_19932 = new BitSet(new long[]{0x0000000000000002L});
    }


}