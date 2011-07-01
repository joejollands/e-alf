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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'{'", "'\\tmodel'", "'}'", "'package'", "'property'", "':'", "'operation'", "'('", "')'", "'activity'", "'for'", "'action'", "'class'", "'ownedAttribute'", "';'", "'nestedClassifier'", "','", "'ownedOperation'", "'LiteralInteger'", "'value'", "'name'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'"
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


    // $ANTLR start entryRuleClass_Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:295:1: entryRuleClass_Impl : ruleClass_Impl EOF ;
    public final void entryRuleClass_Impl() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:296:1: ( ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:297:1: ruleClass_Impl EOF
            {
             before(grammarAccess.getClass_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl549);
            ruleClass_Impl();
            _fsp--;

             after(grammarAccess.getClass_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl556); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:304:1: ruleClass_Impl : ( ( rule__Class_Impl__Group__0 ) ) ;
    public final void ruleClass_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:308:2: ( ( ( rule__Class_Impl__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:309:1: ( ( rule__Class_Impl__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:309:1: ( ( rule__Class_Impl__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:310:1: ( rule__Class_Impl__Group__0 )
            {
             before(grammarAccess.getClass_ImplAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:311:1: ( rule__Class_Impl__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:311:2: rule__Class_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl582);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:323:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:324:1: ( ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:325:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger609);
            ruleInteger();
            _fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger616); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:332:1: ruleInteger : ( 'Integer' ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:336:2: ( ( 'Integer' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( 'Integer' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:337:1: ( 'Integer' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:338:1: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleInteger643); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:353:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:354:1: ( ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:355:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0671);
            ruleString0();
            _fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0678); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:362:1: ruleString0 : ( ( rule__String0__Alternatives ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:366:2: ( ( ( rule__String0__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:367:1: ( ( rule__String0__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:367:1: ( ( rule__String0__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:368:1: ( rule__String0__Alternatives )
            {
             before(grammarAccess.getString0Access().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:369:1: ( rule__String0__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:369:2: rule__String0__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__String0__Alternatives_in_ruleString0704);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:381:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:382:1: ( ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:383:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean731);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean738); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:390:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:394:2: ( ( 'Boolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( 'Boolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:395:1: ( 'Boolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:396:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBoolean765); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:411:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:412:1: ( ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:413:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural793);
            ruleUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural800); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:420:1: ruleUnlimitedNatural : ( 'UnlimitedNatural' ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:424:2: ( ( 'UnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:425:1: ( 'UnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:425:1: ( 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:426:1: 'UnlimitedNatural'
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleUnlimitedNatural827); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:441:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:442:1: ( ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:443:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString855);
            ruleEString();
            _fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString862); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:450:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:454:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:455:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:455:1: ( ( rule__EString__Alternatives ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:456:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:457:1: ( rule__EString__Alternatives )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:457:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString888);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:471:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:472:1: ( ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:473:1: ruleLiteralInteger EOF
            {
             before(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger917);
            ruleLiteralInteger();
            _fsp--;

             after(grammarAccess.getLiteralIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger924); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:480:1: ruleLiteralInteger : ( ( rule__LiteralInteger__Group__0 ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:484:2: ( ( ( rule__LiteralInteger__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:1: ( ( rule__LiteralInteger__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:485:1: ( ( rule__LiteralInteger__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:486:1: ( rule__LiteralInteger__Group__0 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:487:1: ( rule__LiteralInteger__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:487:2: rule__LiteralInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger950);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:499:1: entryRuleLiteralString : ruleLiteralString EOF ;
    public final void entryRuleLiteralString() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:500:1: ( ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:501:1: ruleLiteralString EOF
            {
             before(grammarAccess.getLiteralStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString977);
            ruleLiteralString();
            _fsp--;

             after(grammarAccess.getLiteralStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString984); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:508:1: ruleLiteralString : ( ( rule__LiteralString__Group__0 ) ) ;
    public final void ruleLiteralString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:512:2: ( ( ( rule__LiteralString__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:1: ( ( rule__LiteralString__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:513:1: ( ( rule__LiteralString__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:514:1: ( rule__LiteralString__Group__0 )
            {
             before(grammarAccess.getLiteralStringAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:515:1: ( rule__LiteralString__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:515:2: rule__LiteralString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString1010);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:527:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:528:1: ( ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:529:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1037);
            ruleLiteralBoolean();
            _fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean1044); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:536:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__Group__0 ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:540:2: ( ( ( rule__LiteralBoolean__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:1: ( ( rule__LiteralBoolean__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:541:1: ( ( rule__LiteralBoolean__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:542:1: ( rule__LiteralBoolean__Group__0 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:543:1: ( rule__LiteralBoolean__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:543:2: rule__LiteralBoolean__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1070);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:555:1: entryRuleLiteralUnlimitedNatural : ruleLiteralUnlimitedNatural EOF ;
    public final void entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:556:1: ( ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:557:1: ruleLiteralUnlimitedNatural EOF
            {
             before(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1097);
            ruleLiteralUnlimitedNatural();
            _fsp--;

             after(grammarAccess.getLiteralUnlimitedNaturalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1104); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:564:1: ruleLiteralUnlimitedNatural : ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) ;
    public final void ruleLiteralUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:568:2: ( ( ( rule__LiteralUnlimitedNatural__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:569:1: ( ( rule__LiteralUnlimitedNatural__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:570:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:571:1: ( rule__LiteralUnlimitedNatural__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:571:2: rule__LiteralUnlimitedNatural__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1130);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:583:1: entryRuleLiteralNull : ruleLiteralNull EOF ;
    public final void entryRuleLiteralNull() throws RecognitionException {
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:584:1: ( ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:585:1: ruleLiteralNull EOF
            {
             before(grammarAccess.getLiteralNullRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1157);
            ruleLiteralNull();
            _fsp--;

             after(grammarAccess.getLiteralNullRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull1164); 

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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:592:1: ruleLiteralNull : ( ( rule__LiteralNull__Group__0 ) ) ;
    public final void ruleLiteralNull() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:596:2: ( ( ( rule__LiteralNull__Group__0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:597:1: ( ( rule__LiteralNull__Group__0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:597:1: ( ( rule__LiteralNull__Group__0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:598:1: ( rule__LiteralNull__Group__0 )
            {
             before(grammarAccess.getLiteralNullAccess().getGroup()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:599:1: ( rule__LiteralNull__Group__0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:599:2: rule__LiteralNull__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1190);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:619:1: rule__PackageableElement__Alternatives : ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) );
    public final void rule__PackageableElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:623:1: ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) )
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
            case 26:
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
                    new NoViableAltException("619:1: rule__PackageableElement__Alternatives : ( ( ruleModel ) | ( rulePackage_Impl ) | ( ruleClass_Impl ) | ( ruleActivity ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:624:1: ( ruleModel )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:624:1: ( ruleModel )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:625:1: ruleModel
                    {
                     before(grammarAccess.getPackageableElementAccess().getModelParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_rule__PackageableElement__Alternatives1234);
                    ruleModel();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:630:6: ( rulePackage_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:630:6: ( rulePackage_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:631:1: rulePackage_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1251);
                    rulePackage_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:636:6: ( ruleClass_Impl )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:636:6: ( ruleClass_Impl )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:637:1: ruleClass_Impl
                    {
                     before(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1268);
                    ruleClass_Impl();
                    _fsp--;

                     after(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:642:6: ( ruleActivity )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:642:6: ( ruleActivity )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:643:1: ruleActivity
                    {
                     before(grammarAccess.getPackageableElementAccess().getActivityParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__PackageableElement__Alternatives1285);
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


    // $ANTLR start rule__String0__Alternatives
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:653:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__String0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:657:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("653:1: rule__String0__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:658:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:658:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:659:1: RULE_STRING
                    {
                     before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__String0__Alternatives1317); 
                     after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:664:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:664:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:665:1: RULE_ID
                    {
                     before(grammarAccess.getString0Access().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__String0__Alternatives1334); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:675:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:679:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("675:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:680:1: ( RULE_STRING )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:680:1: ( RULE_STRING )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:681:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1366); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:686:6: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:686:6: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:687:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1383); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:704:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:708:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:709:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01418);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01421);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:716:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:720:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:721:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:721:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:722:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:723:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:725:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:735:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:739:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:740:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11479);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11482);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:747:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:751:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:752:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:752:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:753:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:754:1: ( rule__Model__NameAssignment_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:754:2: rule__Model__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1509);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:764:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:768:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:769:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21539);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21542);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:776:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:780:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:781:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:781:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:782:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__2__Impl1570); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:795:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:799:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:800:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31601);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31604);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:807:1: rule__Model__Group__3__Impl : ( '\\tmodel' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:811:1: ( ( '\\tmodel' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:812:1: ( '\\tmodel' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:812:1: ( '\\tmodel' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:813:1: '\\tmodel'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__3__Impl1632); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:826:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:830:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:831:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41663);
            rule__Model__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41666);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:838:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:842:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:843:1: ( ( rule__Model__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:843:1: ( ( rule__Model__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:844:1: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:845:1: ( rule__Model__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==17||LA4_0==23||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:845:2: rule__Model__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1693);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:855:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:859:1: ( rule__Model__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:860:2: rule__Model__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51724);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:866:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:870:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:871:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:871:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:872:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group__5__Impl1752); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:897:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:901:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:902:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01795);
            rule__Model__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01798);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:909:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__PackagedElementAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:913:1: ( ( ( rule__Model__PackagedElementAssignment_4_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:914:1: ( ( rule__Model__PackagedElementAssignment_4_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:914:1: ( ( rule__Model__PackagedElementAssignment_4_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:915:1: ( rule__Model__PackagedElementAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:916:1: ( rule__Model__PackagedElementAssignment_4_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:916:2: rule__Model__PackagedElementAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_4_0_in_rule__Model__Group_4__0__Impl1825);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:926:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:930:1: ( rule__Model__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:931:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11855);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:937:1: rule__Model__Group_4__1__Impl : ( ( rule__Model__PackagedElementAssignment_4_1 )* ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:941:1: ( ( ( rule__Model__PackagedElementAssignment_4_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:942:1: ( ( rule__Model__PackagedElementAssignment_4_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:942:1: ( ( rule__Model__PackagedElementAssignment_4_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:943:1: ( rule__Model__PackagedElementAssignment_4_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:944:1: ( rule__Model__PackagedElementAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==17||LA5_0==23||LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:944:2: rule__Model__PackagedElementAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_4_1_in_rule__Model__Group_4__1__Impl1882);
            	    rule__Model__PackagedElementAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:958:1: rule__Package_Impl__Group__0 : rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 ;
    public final void rule__Package_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:962:1: ( rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:963:2: rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__01917);
            rule__Package_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__01920);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:970:1: rule__Package_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Package_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:974:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:975:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:975:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:976:1: ()
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:977:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:979:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:989:1: rule__Package_Impl__Group__1 : rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 ;
    public final void rule__Package_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:993:1: ( rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:994:2: rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__11978);
            rule__Package_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__11981);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1001:1: rule__Package_Impl__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1005:1: ( ( 'package' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1006:1: ( 'package' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1006:1: ( 'package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1007:1: 'package'
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package_Impl__Group__1__Impl2009); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1020:1: rule__Package_Impl__Group__2 : rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 ;
    public final void rule__Package_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1024:1: ( rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1025:2: rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22040);
            rule__Package_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22043);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1032:1: rule__Package_Impl__Group__2__Impl : ( ( rule__Package_Impl__NameAssignment_2 ) ) ;
    public final void rule__Package_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1036:1: ( ( ( rule__Package_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1037:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1037:1: ( ( rule__Package_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1038:1: ( rule__Package_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getPackage_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1039:1: ( rule__Package_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1039:2: rule__Package_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl2070);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1049:1: rule__Package_Impl__Group__3 : rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 ;
    public final void rule__Package_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1053:1: ( rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1054:2: rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32100);
            rule__Package_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32103);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1061:1: rule__Package_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Package_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1065:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1066:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1066:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1067:1: '{'
            {
             before(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Package_Impl__Group__3__Impl2131); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1080:1: rule__Package_Impl__Group__4 : rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 ;
    public final void rule__Package_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1084:1: ( rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1085:2: rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42162);
            rule__Package_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42165);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1092:1: rule__Package_Impl__Group__4__Impl : ( ( rule__Package_Impl__Group_4__0 )? ) ;
    public final void rule__Package_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1096:1: ( ( ( rule__Package_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1097:1: ( ( rule__Package_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1097:1: ( ( rule__Package_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1098:1: ( rule__Package_Impl__Group_4__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1099:1: ( rule__Package_Impl__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==17||LA6_0==23||LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1099:2: rule__Package_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2192);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1109:1: rule__Package_Impl__Group__5 : rule__Package_Impl__Group__5__Impl ;
    public final void rule__Package_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1113:1: ( rule__Package_Impl__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1114:2: rule__Package_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52223);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1120:1: rule__Package_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Package_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1124:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1125:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1125:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1126:1: '}'
            {
             before(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package_Impl__Group__5__Impl2251); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1151:1: rule__Package_Impl__Group_4__0 : rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 ;
    public final void rule__Package_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1155:1: ( rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1156:2: rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02294);
            rule__Package_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02297);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1163:1: rule__Package_Impl__Group_4__0__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) ;
    public final void rule__Package_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1167:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1168:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1168:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1169:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1170:1: ( rule__Package_Impl__PackagedElementAssignment_4_0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1170:2: rule__Package_Impl__PackagedElementAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2324);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1180:1: rule__Package_Impl__Group_4__1 : rule__Package_Impl__Group_4__1__Impl ;
    public final void rule__Package_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1184:1: ( rule__Package_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1185:2: rule__Package_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12354);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1191:1: rule__Package_Impl__Group_4__1__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) ;
    public final void rule__Package_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1195:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1196:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1196:1: ( ( rule__Package_Impl__PackagedElementAssignment_4_1 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1197:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1198:1: ( rule__Package_Impl__PackagedElementAssignment_4_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==17||LA7_0==23||LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1198:2: rule__Package_Impl__PackagedElementAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2381);
            	    rule__Package_Impl__PackagedElementAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1212:1: rule__Property_Impl__Group__0 : rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 ;
    public final void rule__Property_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1216:1: ( rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1217:2: rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02416);
            rule__Property_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02419);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1224:1: rule__Property_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Property_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1228:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1229:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1229:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1230:1: ()
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1231:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1233:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1243:1: rule__Property_Impl__Group__1 : rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 ;
    public final void rule__Property_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1247:1: ( rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1248:2: rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12477);
            rule__Property_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12480);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1255:1: rule__Property_Impl__Group__1__Impl : ( 'property' ) ;
    public final void rule__Property_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1259:1: ( ( 'property' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1260:1: ( 'property' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1260:1: ( 'property' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1261:1: 'property'
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Property_Impl__Group__1__Impl2508); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1274:1: rule__Property_Impl__Group__2 : rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 ;
    public final void rule__Property_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1278:1: ( rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1279:2: rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22539);
            rule__Property_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22542);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1286:1: rule__Property_Impl__Group__2__Impl : ( ( rule__Property_Impl__NameAssignment_2 ) ) ;
    public final void rule__Property_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1290:1: ( ( ( rule__Property_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1291:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1291:1: ( ( rule__Property_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1292:1: ( rule__Property_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getProperty_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1293:1: ( rule__Property_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1293:2: rule__Property_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2569);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1303:1: rule__Property_Impl__Group__3 : rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 ;
    public final void rule__Property_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1307:1: ( rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1308:2: rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32599);
            rule__Property_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__32602);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1315:1: rule__Property_Impl__Group__3__Impl : ( ':' ) ;
    public final void rule__Property_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1319:1: ( ( ':' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1320:1: ( ':' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1320:1: ( ':' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1321:1: ':'
            {
             before(grammarAccess.getProperty_ImplAccess().getColonKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Property_Impl__Group__3__Impl2630); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1334:1: rule__Property_Impl__Group__4 : rule__Property_Impl__Group__4__Impl ;
    public final void rule__Property_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1338:1: ( rule__Property_Impl__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1339:2: rule__Property_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__42661);
            rule__Property_Impl__Group__4__Impl();
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1345:1: rule__Property_Impl__Group__4__Impl : ( ( rule__Property_Impl__TypeAssignment_4 ) ) ;
    public final void rule__Property_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1349:1: ( ( ( rule__Property_Impl__TypeAssignment_4 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1350:1: ( ( rule__Property_Impl__TypeAssignment_4 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1350:1: ( ( rule__Property_Impl__TypeAssignment_4 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1351:1: ( rule__Property_Impl__TypeAssignment_4 )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeAssignment_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1352:1: ( rule__Property_Impl__TypeAssignment_4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1352:2: rule__Property_Impl__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__TypeAssignment_4_in_rule__Property_Impl__Group__4__Impl2688);
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


    // $ANTLR start rule__Operation__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1372:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1376:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1377:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02728);
            rule__Operation__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02731);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1384:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1388:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1389:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1389:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1390:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1391:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1393:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1403:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1407:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1408:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12789);
            rule__Operation__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12792);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1415:1: rule__Operation__Group__1__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1419:1: ( ( 'operation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1420:1: ( 'operation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1420:1: ( 'operation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1421:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Operation__Group__1__Impl2820); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1434:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1438:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1439:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22851);
            rule__Operation__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22854);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1446:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1450:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1451:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1451:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1452:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1453:1: ( rule__Operation__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1453:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl2881);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1463:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1467:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1468:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32911);
            rule__Operation__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32914);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1475:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1479:1: ( ( '(' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1480:1: ( '(' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1480:1: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1481:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Operation__Group__3__Impl2942); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1494:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1498:1: ( rule__Operation__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1499:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42973);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1505:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1509:1: ( ( ')' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1510:1: ( ')' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1510:1: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1511:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__4__Impl3001); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1534:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1538:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1539:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03042);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03045);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1546:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1550:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1551:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1551:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1552:1: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1553:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1555:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1565:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1569:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1570:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13103);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13106);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1577:1: rule__Activity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1581:1: ( ( 'activity' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1582:1: ( 'activity' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1582:1: ( 'activity' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1583:1: 'activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Activity__Group__1__Impl3134); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1596:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1600:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1601:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23165);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23168);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1608:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__Group_2__0 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1612:1: ( ( ( rule__Activity__Group_2__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1613:1: ( ( rule__Activity__Group_2__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1613:1: ( ( rule__Activity__Group_2__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1614:1: ( rule__Activity__Group_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1615:1: ( rule__Activity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1615:2: rule__Activity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl3195);
                    rule__Activity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1625:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1629:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1630:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33226);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33229);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1637:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__NameAssignment_3 ) ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1641:1: ( ( ( rule__Activity__NameAssignment_3 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1642:1: ( ( rule__Activity__NameAssignment_3 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1642:1: ( ( rule__Activity__NameAssignment_3 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1643:1: ( rule__Activity__NameAssignment_3 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1644:1: ( rule__Activity__NameAssignment_3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1644:2: rule__Activity__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_3_in_rule__Activity__Group__3__Impl3256);
            rule__Activity__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1654:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1658:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1659:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43286);
            rule__Activity__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43289);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1666:1: rule__Activity__Group__4__Impl : ( '(' ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1670:1: ( ( '(' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1671:1: ( '(' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1671:1: ( '(' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1672:1: '('
            {
             before(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group__4__Impl3317); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1685:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1689:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1690:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53348);
            rule__Activity__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53351);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1697:1: rule__Activity__Group__5__Impl : ( ')' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1701:1: ( ( ')' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1702:1: ( ')' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1702:1: ( ')' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1703:1: ')'
            {
             before(grammarAccess.getActivityAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group__5__Impl3379); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1716:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1720:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1721:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63410);
            rule__Activity__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63413);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1728:1: rule__Activity__Group__6__Impl : ( '{' ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1732:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1733:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1733:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1734:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Activity__Group__6__Impl3441); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1747:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1751:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1752:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73472);
            rule__Activity__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73475);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1759:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__Group_7__0 )* ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1763:1: ( ( ( rule__Activity__Group_7__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1764:1: ( ( rule__Activity__Group_7__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1764:1: ( ( rule__Activity__Group_7__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1765:1: ( rule__Activity__Group_7__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_7()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1766:1: ( rule__Activity__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1766:2: rule__Activity__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3502);
            	    rule__Activity__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_7()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1776:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1780:1: ( rule__Activity__Group__8__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1781:2: rule__Activity__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83533);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1787:1: rule__Activity__Group__8__Impl : ( '}' ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1791:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1792:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1792:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1793:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Activity__Group__8__Impl3561); 
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


    // $ANTLR start rule__Activity__Group_2__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1824:1: rule__Activity__Group_2__0 : rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 ;
    public final void rule__Activity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1828:1: ( rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1829:2: rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__03610);
            rule__Activity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__03613);
            rule__Activity__Group_2__1();
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
    // $ANTLR end rule__Activity__Group_2__0


    // $ANTLR start rule__Activity__Group_2__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1836:1: rule__Activity__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Activity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1840:1: ( ( 'for' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1841:1: ( 'for' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1841:1: ( 'for' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1842:1: 'for'
            {
             before(grammarAccess.getActivityAccess().getForKeyword_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Activity__Group_2__0__Impl3641); 
             after(grammarAccess.getActivityAccess().getForKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group_2__0__Impl


    // $ANTLR start rule__Activity__Group_2__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1855:1: rule__Activity__Group_2__1 : rule__Activity__Group_2__1__Impl ;
    public final void rule__Activity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1859:1: ( rule__Activity__Group_2__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1860:2: rule__Activity__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__13672);
            rule__Activity__Group_2__1__Impl();
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
    // $ANTLR end rule__Activity__Group_2__1


    // $ANTLR start rule__Activity__Group_2__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1866:1: rule__Activity__Group_2__1__Impl : ( ( rule__Activity__SpecificationAssignment_2_1 ) ) ;
    public final void rule__Activity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1870:1: ( ( ( rule__Activity__SpecificationAssignment_2_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1871:1: ( ( rule__Activity__SpecificationAssignment_2_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1871:1: ( ( rule__Activity__SpecificationAssignment_2_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1872:1: ( rule__Activity__SpecificationAssignment_2_1 )
            {
             before(grammarAccess.getActivityAccess().getSpecificationAssignment_2_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1873:1: ( rule__Activity__SpecificationAssignment_2_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1873:2: rule__Activity__SpecificationAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SpecificationAssignment_2_1_in_rule__Activity__Group_2__1__Impl3699);
            rule__Activity__SpecificationAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getSpecificationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group_2__1__Impl


    // $ANTLR start rule__Activity__Group_7__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1887:1: rule__Activity__Group_7__0 : rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 ;
    public final void rule__Activity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1891:1: ( rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1892:2: rule__Activity__Group_7__0__Impl rule__Activity__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__03733);
            rule__Activity__Group_7__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__03736);
            rule__Activity__Group_7__1();
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
    // $ANTLR end rule__Activity__Group_7__0


    // $ANTLR start rule__Activity__Group_7__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1899:1: rule__Activity__Group_7__0__Impl : ( 'action' ) ;
    public final void rule__Activity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1903:1: ( ( 'action' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1904:1: ( 'action' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1904:1: ( 'action' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1905:1: 'action'
            {
             before(grammarAccess.getActivityAccess().getActionKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Activity__Group_7__0__Impl3764); 
             after(grammarAccess.getActivityAccess().getActionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group_7__0__Impl


    // $ANTLR start rule__Activity__Group_7__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1918:1: rule__Activity__Group_7__1 : rule__Activity__Group_7__1__Impl ;
    public final void rule__Activity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1922:1: ( rule__Activity__Group_7__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1923:2: rule__Activity__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__13795);
            rule__Activity__Group_7__1__Impl();
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
    // $ANTLR end rule__Activity__Group_7__1


    // $ANTLR start rule__Activity__Group_7__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1929:1: rule__Activity__Group_7__1__Impl : ( ( rule__Activity__OwnedAttributeAssignment_7_1 ) ) ;
    public final void rule__Activity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1933:1: ( ( ( rule__Activity__OwnedAttributeAssignment_7_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1934:1: ( ( rule__Activity__OwnedAttributeAssignment_7_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1934:1: ( ( rule__Activity__OwnedAttributeAssignment_7_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1935:1: ( rule__Activity__OwnedAttributeAssignment_7_1 )
            {
             before(grammarAccess.getActivityAccess().getOwnedAttributeAssignment_7_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1936:1: ( rule__Activity__OwnedAttributeAssignment_7_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1936:2: rule__Activity__OwnedAttributeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__OwnedAttributeAssignment_7_1_in_rule__Activity__Group_7__1__Impl3822);
            rule__Activity__OwnedAttributeAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getOwnedAttributeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group_7__1__Impl


    // $ANTLR start rule__Class_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1951:1: rule__Class_Impl__Group__0 : rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 ;
    public final void rule__Class_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1955:1: ( rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1956:2: rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__03857);
            rule__Class_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__03860);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1963:1: rule__Class_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Class_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1967:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1968:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1968:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1969:1: ()
            {
             before(grammarAccess.getClass_ImplAccess().getClassAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1970:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1972:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1982:1: rule__Class_Impl__Group__1 : rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 ;
    public final void rule__Class_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1986:1: ( rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1987:2: rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__13918);
            rule__Class_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__13921);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1994:1: rule__Class_Impl__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1998:1: ( ( 'class' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1999:1: ( 'class' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1999:1: ( 'class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2000:1: 'class'
            {
             before(grammarAccess.getClass_ImplAccess().getClassKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Class_Impl__Group__1__Impl3949); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2013:1: rule__Class_Impl__Group__2 : rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 ;
    public final void rule__Class_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2017:1: ( rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2018:2: rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__23980);
            rule__Class_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__23983);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2025:1: rule__Class_Impl__Group__2__Impl : ( ( rule__Class_Impl__NameAssignment_2 ) ) ;
    public final void rule__Class_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2029:1: ( ( ( rule__Class_Impl__NameAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2030:1: ( ( rule__Class_Impl__NameAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2030:1: ( ( rule__Class_Impl__NameAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2031:1: ( rule__Class_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNameAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2032:1: ( rule__Class_Impl__NameAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2032:2: rule__Class_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NameAssignment_2_in_rule__Class_Impl__Group__2__Impl4010);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2042:1: rule__Class_Impl__Group__3 : rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 ;
    public final void rule__Class_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2046:1: ( rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2047:2: rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__34040);
            rule__Class_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__34043);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2054:1: rule__Class_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2058:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2059:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2059:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2060:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group__3__Impl4071); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2073:1: rule__Class_Impl__Group__4 : rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 ;
    public final void rule__Class_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2077:1: ( rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2078:2: rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__44102);
            rule__Class_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__44105);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2085:1: rule__Class_Impl__Group__4__Impl : ( ( rule__Class_Impl__Group_4__0 )? ) ;
    public final void rule__Class_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2089:1: ( ( ( rule__Class_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2090:1: ( ( rule__Class_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2090:1: ( ( rule__Class_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2091:1: ( rule__Class_Impl__Group_4__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2092:1: ( rule__Class_Impl__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2092:2: rule__Class_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl4132);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2102:1: rule__Class_Impl__Group__5 : rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 ;
    public final void rule__Class_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2106:1: ( rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2107:2: rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__54163);
            rule__Class_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__54166);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2114:1: rule__Class_Impl__Group__5__Impl : ( ( rule__Class_Impl__Group_5__0 )? ) ;
    public final void rule__Class_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2118:1: ( ( ( rule__Class_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2119:1: ( ( rule__Class_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2119:1: ( ( rule__Class_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2120:1: ( rule__Class_Impl__Group_5__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2121:1: ( rule__Class_Impl__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2121:2: rule__Class_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl4193);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2131:1: rule__Class_Impl__Group__6 : rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 ;
    public final void rule__Class_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2135:1: ( rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2136:2: rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__64224);
            rule__Class_Impl__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__64227);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2143:1: rule__Class_Impl__Group__6__Impl : ( ( rule__Class_Impl__Group_6__0 )? ) ;
    public final void rule__Class_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2147:1: ( ( ( rule__Class_Impl__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2148:1: ( ( rule__Class_Impl__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2148:1: ( ( rule__Class_Impl__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2149:1: ( rule__Class_Impl__Group_6__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2150:1: ( rule__Class_Impl__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2150:2: rule__Class_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl4254);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2160:1: rule__Class_Impl__Group__7 : rule__Class_Impl__Group__7__Impl ;
    public final void rule__Class_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2164:1: ( rule__Class_Impl__Group__7__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2165:2: rule__Class_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__74285);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2171:1: rule__Class_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2175:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2177:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group__7__Impl4313); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2206:1: rule__Class_Impl__Group_4__0 : rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 ;
    public final void rule__Class_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2210:1: ( rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2211:2: rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__04360);
            rule__Class_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__04363);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2218:1: rule__Class_Impl__Group_4__0__Impl : ( 'ownedAttribute' ) ;
    public final void rule__Class_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2222:1: ( ( 'ownedAttribute' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2223:1: ( 'ownedAttribute' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2223:1: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2224:1: 'ownedAttribute'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Class_Impl__Group_4__0__Impl4391); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2237:1: rule__Class_Impl__Group_4__1 : rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2 ;
    public final void rule__Class_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2241:1: ( rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2242:2: rule__Class_Impl__Group_4__1__Impl rule__Class_Impl__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__14422);
            rule__Class_Impl__Group_4__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__2_in_rule__Class_Impl__Group_4__14425);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2249:1: rule__Class_Impl__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2253:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2254:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2254:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2255:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_4__1__Impl4453); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2268:1: rule__Class_Impl__Group_4__2 : rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3 ;
    public final void rule__Class_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2272:1: ( rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2273:2: rule__Class_Impl__Group_4__2__Impl rule__Class_Impl__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__2__Impl_in_rule__Class_Impl__Group_4__24484);
            rule__Class_Impl__Group_4__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__3_in_rule__Class_Impl__Group_4__24487);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2280:1: rule__Class_Impl__Group_4__2__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) ) ;
    public final void rule__Class_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2284:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2285:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2285:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2286:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2287:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2287:2: rule__Class_Impl__OwnedAttributeAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_2_in_rule__Class_Impl__Group_4__2__Impl4514);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2297:1: rule__Class_Impl__Group_4__3 : rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4 ;
    public final void rule__Class_Impl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2301:1: ( rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2302:2: rule__Class_Impl__Group_4__3__Impl rule__Class_Impl__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__3__Impl_in_rule__Class_Impl__Group_4__34544);
            rule__Class_Impl__Group_4__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__4_in_rule__Class_Impl__Group_4__34547);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2309:1: rule__Class_Impl__Group_4__3__Impl : ( ( rule__Class_Impl__Group_4_3__0 )* ) ;
    public final void rule__Class_Impl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2313:1: ( ( ( rule__Class_Impl__Group_4_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2314:1: ( ( rule__Class_Impl__Group_4_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2314:1: ( ( rule__Class_Impl__Group_4_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2315:1: ( rule__Class_Impl__Group_4_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_4_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2316:1: ( rule__Class_Impl__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2316:2: rule__Class_Impl__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__0_in_rule__Class_Impl__Group_4__3__Impl4574);
            	    rule__Class_Impl__Group_4_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2326:1: rule__Class_Impl__Group_4__4 : rule__Class_Impl__Group_4__4__Impl ;
    public final void rule__Class_Impl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2330:1: ( rule__Class_Impl__Group_4__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2331:2: rule__Class_Impl__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__4__Impl_in_rule__Class_Impl__Group_4__44605);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2337:1: rule__Class_Impl__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2341:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2342:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2342:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2343:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_4__4__Impl4633); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2366:1: rule__Class_Impl__Group_4_3__0 : rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1 ;
    public final void rule__Class_Impl__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2370:1: ( rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2371:2: rule__Class_Impl__Group_4_3__0__Impl rule__Class_Impl__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__0__Impl_in_rule__Class_Impl__Group_4_3__04674);
            rule__Class_Impl__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__1_in_rule__Class_Impl__Group_4_3__04677);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2378:1: rule__Class_Impl__Group_4_3__0__Impl : ( ';' ) ;
    public final void rule__Class_Impl__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2382:1: ( ( ';' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2383:1: ( ';' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2383:1: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2384:1: ';'
            {
             before(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_4_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Class_Impl__Group_4_3__0__Impl4705); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2397:1: rule__Class_Impl__Group_4_3__1 : rule__Class_Impl__Group_4_3__1__Impl ;
    public final void rule__Class_Impl__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2401:1: ( rule__Class_Impl__Group_4_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2402:2: rule__Class_Impl__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4_3__1__Impl_in_rule__Class_Impl__Group_4_3__14736);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2408:1: rule__Class_Impl__Group_4_3__1__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) ) ;
    public final void rule__Class_Impl__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2412:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2413:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2413:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2414:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_4_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2415:1: ( rule__Class_Impl__OwnedAttributeAssignment_4_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2415:2: rule__Class_Impl__OwnedAttributeAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_3_1_in_rule__Class_Impl__Group_4_3__1__Impl4763);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2429:1: rule__Class_Impl__Group_5__0 : rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 ;
    public final void rule__Class_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2433:1: ( rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2434:2: rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__04797);
            rule__Class_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__04800);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2441:1: rule__Class_Impl__Group_5__0__Impl : ( 'nestedClassifier' ) ;
    public final void rule__Class_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2445:1: ( ( 'nestedClassifier' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2446:1: ( 'nestedClassifier' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2446:1: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2447:1: 'nestedClassifier'
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Class_Impl__Group_5__0__Impl4828); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2460:1: rule__Class_Impl__Group_5__1 : rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 ;
    public final void rule__Class_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2464:1: ( rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2465:2: rule__Class_Impl__Group_5__1__Impl rule__Class_Impl__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__14859);
            rule__Class_Impl__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__14862);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2472:1: rule__Class_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2476:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2477:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2477:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2478:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_5__1__Impl4890); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2491:1: rule__Class_Impl__Group_5__2 : rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 ;
    public final void rule__Class_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2495:1: ( rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2496:2: rule__Class_Impl__Group_5__2__Impl rule__Class_Impl__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__24921);
            rule__Class_Impl__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__24924);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2503:1: rule__Class_Impl__Group_5__2__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) ) ;
    public final void rule__Class_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2507:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2508:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2508:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2509:1: ( rule__Class_Impl__NestedClassifierAssignment_5_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2510:1: ( rule__Class_Impl__NestedClassifierAssignment_5_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2510:2: rule__Class_Impl__NestedClassifierAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl4951);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2520:1: rule__Class_Impl__Group_5__3 : rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 ;
    public final void rule__Class_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2524:1: ( rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2525:2: rule__Class_Impl__Group_5__3__Impl rule__Class_Impl__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__34981);
            rule__Class_Impl__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__34984);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2532:1: rule__Class_Impl__Group_5__3__Impl : ( ( rule__Class_Impl__Group_5_3__0 )* ) ;
    public final void rule__Class_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2536:1: ( ( ( rule__Class_Impl__Group_5_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2537:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2537:1: ( ( rule__Class_Impl__Group_5_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2538:1: ( rule__Class_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2539:1: ( rule__Class_Impl__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2539:2: rule__Class_Impl__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl5011);
            	    rule__Class_Impl__Group_5_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2549:1: rule__Class_Impl__Group_5__4 : rule__Class_Impl__Group_5__4__Impl ;
    public final void rule__Class_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2553:1: ( rule__Class_Impl__Group_5__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2554:2: rule__Class_Impl__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__45042);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2560:1: rule__Class_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2564:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2565:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2565:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2566:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_5__4__Impl5070); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2589:1: rule__Class_Impl__Group_5_3__0 : rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 ;
    public final void rule__Class_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2593:1: ( rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2594:2: rule__Class_Impl__Group_5_3__0__Impl rule__Class_Impl__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__05111);
            rule__Class_Impl__Group_5_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__05114);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2601:1: rule__Class_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2605:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2606:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2606:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2607:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Class_Impl__Group_5_3__0__Impl5142); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2620:1: rule__Class_Impl__Group_5_3__1 : rule__Class_Impl__Group_5_3__1__Impl ;
    public final void rule__Class_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2624:1: ( rule__Class_Impl__Group_5_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2625:2: rule__Class_Impl__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__15173);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2631:1: rule__Class_Impl__Group_5_3__1__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) ) ;
    public final void rule__Class_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2635:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2636:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2636:1: ( ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2637:1: ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_5_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2638:1: ( rule__Class_Impl__NestedClassifierAssignment_5_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2638:2: rule__Class_Impl__NestedClassifierAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl5200);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2652:1: rule__Class_Impl__Group_6__0 : rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 ;
    public final void rule__Class_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2656:1: ( rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2657:2: rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__05234);
            rule__Class_Impl__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__05237);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2664:1: rule__Class_Impl__Group_6__0__Impl : ( 'ownedOperation' ) ;
    public final void rule__Class_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2668:1: ( ( 'ownedOperation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2669:1: ( 'ownedOperation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2669:1: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2670:1: 'ownedOperation'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_6_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Class_Impl__Group_6__0__Impl5265); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2683:1: rule__Class_Impl__Group_6__1 : rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 ;
    public final void rule__Class_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2687:1: ( rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:2: rule__Class_Impl__Group_6__1__Impl rule__Class_Impl__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__15296);
            rule__Class_Impl__Group_6__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__15299);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2695:1: rule__Class_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2699:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2700:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2700:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2701:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Class_Impl__Group_6__1__Impl5327); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2714:1: rule__Class_Impl__Group_6__2 : rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 ;
    public final void rule__Class_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2718:1: ( rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2719:2: rule__Class_Impl__Group_6__2__Impl rule__Class_Impl__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__25358);
            rule__Class_Impl__Group_6__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__25361);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2726:1: rule__Class_Impl__Group_6__2__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) ) ;
    public final void rule__Class_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2730:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2731:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2731:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2732:1: ( rule__Class_Impl__OwnedOperationAssignment_6_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2733:1: ( rule__Class_Impl__OwnedOperationAssignment_6_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2733:2: rule__Class_Impl__OwnedOperationAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl5388);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2743:1: rule__Class_Impl__Group_6__3 : rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 ;
    public final void rule__Class_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2747:1: ( rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2748:2: rule__Class_Impl__Group_6__3__Impl rule__Class_Impl__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__35418);
            rule__Class_Impl__Group_6__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__35421);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2755:1: rule__Class_Impl__Group_6__3__Impl : ( ( rule__Class_Impl__Group_6_3__0 )* ) ;
    public final void rule__Class_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2759:1: ( ( ( rule__Class_Impl__Group_6_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2760:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2760:1: ( ( rule__Class_Impl__Group_6_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2761:1: ( rule__Class_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2762:1: ( rule__Class_Impl__Group_6_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2762:2: rule__Class_Impl__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl5448);
            	    rule__Class_Impl__Group_6_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2772:1: rule__Class_Impl__Group_6__4 : rule__Class_Impl__Group_6__4__Impl ;
    public final void rule__Class_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2776:1: ( rule__Class_Impl__Group_6__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2777:2: rule__Class_Impl__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__45479);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2783:1: rule__Class_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2787:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2788:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2788:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2789:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Class_Impl__Group_6__4__Impl5507); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2812:1: rule__Class_Impl__Group_6_3__0 : rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 ;
    public final void rule__Class_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2816:1: ( rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2817:2: rule__Class_Impl__Group_6_3__0__Impl rule__Class_Impl__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__05548);
            rule__Class_Impl__Group_6_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__05551);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2824:1: rule__Class_Impl__Group_6_3__0__Impl : ( ';' ) ;
    public final void rule__Class_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2828:1: ( ( ';' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2829:1: ( ';' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2829:1: ( ';' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2830:1: ';'
            {
             before(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_6_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Class_Impl__Group_6_3__0__Impl5579); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2843:1: rule__Class_Impl__Group_6_3__1 : rule__Class_Impl__Group_6_3__1__Impl ;
    public final void rule__Class_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2847:1: ( rule__Class_Impl__Group_6_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2848:2: rule__Class_Impl__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__15610);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2854:1: rule__Class_Impl__Group_6_3__1__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) ) ;
    public final void rule__Class_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2858:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2859:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2859:1: ( ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2860:1: ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_6_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2861:1: ( rule__Class_Impl__OwnedOperationAssignment_6_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2861:2: rule__Class_Impl__OwnedOperationAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl5637);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2875:1: rule__LiteralInteger__Group__0 : rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 ;
    public final void rule__LiteralInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2879:1: ( rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2880:2: rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__05671);
            rule__LiteralInteger__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__05674);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2887:1: rule__LiteralInteger__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2891:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2892:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2892:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2893:1: ()
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2894:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2896:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2906:1: rule__LiteralInteger__Group__1 : rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 ;
    public final void rule__LiteralInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2910:1: ( rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2911:2: rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__15732);
            rule__LiteralInteger__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__15735);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2918:1: rule__LiteralInteger__Group__1__Impl : ( 'LiteralInteger' ) ;
    public final void rule__LiteralInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2922:1: ( ( 'LiteralInteger' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2923:1: ( 'LiteralInteger' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2923:1: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2924:1: 'LiteralInteger'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__LiteralInteger__Group__1__Impl5763); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2937:1: rule__LiteralInteger__Group__2 : rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 ;
    public final void rule__LiteralInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2941:1: ( rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2942:2: rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__25794);
            rule__LiteralInteger__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__25797);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2949:1: rule__LiteralInteger__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2953:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2954:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2954:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2955:1: '{'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralInteger__Group__2__Impl5825); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2968:1: rule__LiteralInteger__Group__3 : rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 ;
    public final void rule__LiteralInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2972:1: ( rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2973:2: rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__35856);
            rule__LiteralInteger__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__35859);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2980:1: rule__LiteralInteger__Group__3__Impl : ( ( rule__LiteralInteger__Group_3__0 )? ) ;
    public final void rule__LiteralInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2984:1: ( ( ( rule__LiteralInteger__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2985:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2985:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2986:1: ( rule__LiteralInteger__Group_3__0 )?
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2987:1: ( rule__LiteralInteger__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2987:2: rule__LiteralInteger__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl5886);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2997:1: rule__LiteralInteger__Group__4 : rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 ;
    public final void rule__LiteralInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3001:1: ( rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3002:2: rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__45917);
            rule__LiteralInteger__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__45920);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3009:1: rule__LiteralInteger__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3013:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3014:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3014:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3015:1: 'value'
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralInteger__Group__4__Impl5948); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3028:1: rule__LiteralInteger__Group__5 : rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 ;
    public final void rule__LiteralInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3032:1: ( rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3033:2: rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__55979);
            rule__LiteralInteger__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__55982);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3040:1: rule__LiteralInteger__Group__5__Impl : ( ( rule__LiteralInteger__ValueAssignment_5 ) ) ;
    public final void rule__LiteralInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3044:1: ( ( ( rule__LiteralInteger__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3045:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3045:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3046:1: ( rule__LiteralInteger__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3047:1: ( rule__LiteralInteger__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3047:2: rule__LiteralInteger__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl6009);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3057:1: rule__LiteralInteger__Group__6 : rule__LiteralInteger__Group__6__Impl ;
    public final void rule__LiteralInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3061:1: ( rule__LiteralInteger__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3062:2: rule__LiteralInteger__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__66039);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3068:1: rule__LiteralInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3072:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3073:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3073:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3074:1: '}'
            {
             before(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralInteger__Group__6__Impl6067); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3101:1: rule__LiteralInteger__Group_3__0 : rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 ;
    public final void rule__LiteralInteger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3105:1: ( rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3106:2: rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__06112);
            rule__LiteralInteger__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__06115);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3113:1: rule__LiteralInteger__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralInteger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3117:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3118:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3118:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3119:1: 'name'
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralInteger__Group_3__0__Impl6143); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3132:1: rule__LiteralInteger__Group_3__1 : rule__LiteralInteger__Group_3__1__Impl ;
    public final void rule__LiteralInteger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3136:1: ( rule__LiteralInteger__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3137:2: rule__LiteralInteger__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__16174);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3143:1: rule__LiteralInteger__Group_3__1__Impl : ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralInteger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3147:1: ( ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3148:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3148:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3149:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3150:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3150:2: rule__LiteralInteger__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl6201);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3164:1: rule__LiteralString__Group__0 : rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 ;
    public final void rule__LiteralString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3168:1: ( rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3169:2: rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__06235);
            rule__LiteralString__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__06238);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3176:1: rule__LiteralString__Group__0__Impl : ( () ) ;
    public final void rule__LiteralString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3180:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3181:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3181:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3182:1: ()
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3183:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3185:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3195:1: rule__LiteralString__Group__1 : rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 ;
    public final void rule__LiteralString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3199:1: ( rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3200:2: rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__16296);
            rule__LiteralString__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__16299);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3207:1: rule__LiteralString__Group__1__Impl : ( 'LiteralString' ) ;
    public final void rule__LiteralString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3211:1: ( ( 'LiteralString' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3212:1: ( 'LiteralString' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3212:1: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3213:1: 'LiteralString'
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__LiteralString__Group__1__Impl6327); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3226:1: rule__LiteralString__Group__2 : rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 ;
    public final void rule__LiteralString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3230:1: ( rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3231:2: rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__26358);
            rule__LiteralString__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__26361);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3238:1: rule__LiteralString__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3242:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3243:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3243:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3244:1: '{'
            {
             before(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralString__Group__2__Impl6389); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3257:1: rule__LiteralString__Group__3 : rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 ;
    public final void rule__LiteralString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3261:1: ( rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3262:2: rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__36420);
            rule__LiteralString__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__36423);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3269:1: rule__LiteralString__Group__3__Impl : ( ( rule__LiteralString__Group_3__0 )? ) ;
    public final void rule__LiteralString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3273:1: ( ( ( rule__LiteralString__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3274:1: ( ( rule__LiteralString__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3274:1: ( ( rule__LiteralString__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3275:1: ( rule__LiteralString__Group_3__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3276:1: ( rule__LiteralString__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3276:2: rule__LiteralString__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl6450);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3286:1: rule__LiteralString__Group__4 : rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 ;
    public final void rule__LiteralString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3290:1: ( rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3291:2: rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__46481);
            rule__LiteralString__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__46484);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3298:1: rule__LiteralString__Group__4__Impl : ( ( rule__LiteralString__Group_4__0 )? ) ;
    public final void rule__LiteralString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3302:1: ( ( ( rule__LiteralString__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3303:1: ( ( rule__LiteralString__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3303:1: ( ( rule__LiteralString__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3304:1: ( rule__LiteralString__Group_4__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3305:1: ( rule__LiteralString__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3305:2: rule__LiteralString__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl6511);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3315:1: rule__LiteralString__Group__5 : rule__LiteralString__Group__5__Impl ;
    public final void rule__LiteralString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3319:1: ( rule__LiteralString__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3320:2: rule__LiteralString__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__56542);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3326:1: rule__LiteralString__Group__5__Impl : ( '}' ) ;
    public final void rule__LiteralString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3330:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3331:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3331:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3332:1: '}'
            {
             before(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralString__Group__5__Impl6570); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3357:1: rule__LiteralString__Group_3__0 : rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 ;
    public final void rule__LiteralString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3361:1: ( rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3362:2: rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__06613);
            rule__LiteralString__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__06616);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3369:1: rule__LiteralString__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3373:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3374:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3374:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3375:1: 'name'
            {
             before(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralString__Group_3__0__Impl6644); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3388:1: rule__LiteralString__Group_3__1 : rule__LiteralString__Group_3__1__Impl ;
    public final void rule__LiteralString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3392:1: ( rule__LiteralString__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3393:2: rule__LiteralString__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__16675);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3399:1: rule__LiteralString__Group_3__1__Impl : ( ( rule__LiteralString__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3403:1: ( ( ( rule__LiteralString__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3404:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3404:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3405:1: ( rule__LiteralString__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3406:1: ( rule__LiteralString__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3406:2: rule__LiteralString__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl6702);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3420:1: rule__LiteralString__Group_4__0 : rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 ;
    public final void rule__LiteralString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3424:1: ( rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3425:2: rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__06736);
            rule__LiteralString__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__06739);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3432:1: rule__LiteralString__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__LiteralString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3436:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3437:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3437:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3438:1: 'value'
            {
             before(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralString__Group_4__0__Impl6767); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3451:1: rule__LiteralString__Group_4__1 : rule__LiteralString__Group_4__1__Impl ;
    public final void rule__LiteralString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3455:1: ( rule__LiteralString__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3456:2: rule__LiteralString__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__16798);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3462:1: rule__LiteralString__Group_4__1__Impl : ( ( rule__LiteralString__ValueAssignment_4_1 ) ) ;
    public final void rule__LiteralString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3466:1: ( ( ( rule__LiteralString__ValueAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3467:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3467:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3468:1: ( rule__LiteralString__ValueAssignment_4_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3469:1: ( rule__LiteralString__ValueAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3469:2: rule__LiteralString__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl6825);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3483:1: rule__LiteralBoolean__Group__0 : rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 ;
    public final void rule__LiteralBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3487:1: ( rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3488:2: rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__06859);
            rule__LiteralBoolean__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__06862);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3495:1: rule__LiteralBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3499:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3500:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3500:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3501:1: ()
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3502:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3504:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3514:1: rule__LiteralBoolean__Group__1 : rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 ;
    public final void rule__LiteralBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3518:1: ( rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3519:2: rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__16920);
            rule__LiteralBoolean__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__16923);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3526:1: rule__LiteralBoolean__Group__1__Impl : ( 'LiteralBoolean' ) ;
    public final void rule__LiteralBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3530:1: ( ( 'LiteralBoolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3531:1: ( 'LiteralBoolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3531:1: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3532:1: 'LiteralBoolean'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__LiteralBoolean__Group__1__Impl6951); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3545:1: rule__LiteralBoolean__Group__2 : rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 ;
    public final void rule__LiteralBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3549:1: ( rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3550:2: rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__26982);
            rule__LiteralBoolean__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__26985);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3557:1: rule__LiteralBoolean__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3561:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3562:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3562:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3563:1: '{'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralBoolean__Group__2__Impl7013); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3576:1: rule__LiteralBoolean__Group__3 : rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 ;
    public final void rule__LiteralBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3580:1: ( rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3581:2: rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__37044);
            rule__LiteralBoolean__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__37047);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3588:1: rule__LiteralBoolean__Group__3__Impl : ( ( rule__LiteralBoolean__Group_3__0 )? ) ;
    public final void rule__LiteralBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3592:1: ( ( ( rule__LiteralBoolean__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3593:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3593:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3594:1: ( rule__LiteralBoolean__Group_3__0 )?
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3595:1: ( rule__LiteralBoolean__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3595:2: rule__LiteralBoolean__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl7074);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3605:1: rule__LiteralBoolean__Group__4 : rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 ;
    public final void rule__LiteralBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3609:1: ( rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3610:2: rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__47105);
            rule__LiteralBoolean__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__47108);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3617:1: rule__LiteralBoolean__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3621:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3622:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3622:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3623:1: 'value'
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralBoolean__Group__4__Impl7136); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3636:1: rule__LiteralBoolean__Group__5 : rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 ;
    public final void rule__LiteralBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3640:1: ( rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3641:2: rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__57167);
            rule__LiteralBoolean__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__57170);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3648:1: rule__LiteralBoolean__Group__5__Impl : ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) ;
    public final void rule__LiteralBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3652:1: ( ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3653:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3653:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3654:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3655:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3655:2: rule__LiteralBoolean__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl7197);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3665:1: rule__LiteralBoolean__Group__6 : rule__LiteralBoolean__Group__6__Impl ;
    public final void rule__LiteralBoolean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3669:1: ( rule__LiteralBoolean__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3670:2: rule__LiteralBoolean__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__67227);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3676:1: rule__LiteralBoolean__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralBoolean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3680:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3681:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3681:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3682:1: '}'
            {
             before(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralBoolean__Group__6__Impl7255); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3709:1: rule__LiteralBoolean__Group_3__0 : rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 ;
    public final void rule__LiteralBoolean__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3713:1: ( rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3714:2: rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__07300);
            rule__LiteralBoolean__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__07303);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3721:1: rule__LiteralBoolean__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralBoolean__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3725:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3726:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3726:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3727:1: 'name'
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralBoolean__Group_3__0__Impl7331); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3740:1: rule__LiteralBoolean__Group_3__1 : rule__LiteralBoolean__Group_3__1__Impl ;
    public final void rule__LiteralBoolean__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3744:1: ( rule__LiteralBoolean__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3745:2: rule__LiteralBoolean__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__17362);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3751:1: rule__LiteralBoolean__Group_3__1__Impl : ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralBoolean__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3755:1: ( ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3756:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3756:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3757:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3758:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3758:2: rule__LiteralBoolean__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl7389);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3772:1: rule__LiteralUnlimitedNatural__Group__0 : rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 ;
    public final void rule__LiteralUnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3776:1: ( rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3777:2: rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__07423);
            rule__LiteralUnlimitedNatural__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__07426);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3784:1: rule__LiteralUnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3788:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3789:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3789:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3790:1: ()
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3791:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3793:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3803:1: rule__LiteralUnlimitedNatural__Group__1 : rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 ;
    public final void rule__LiteralUnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3807:1: ( rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3808:2: rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__17484);
            rule__LiteralUnlimitedNatural__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__17487);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3815:1: rule__LiteralUnlimitedNatural__Group__1__Impl : ( 'LiteralUnlimitedNatural' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3819:1: ( ( 'LiteralUnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3820:1: ( 'LiteralUnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3820:1: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3821:1: 'LiteralUnlimitedNatural'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__LiteralUnlimitedNatural__Group__1__Impl7515); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3834:1: rule__LiteralUnlimitedNatural__Group__2 : rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 ;
    public final void rule__LiteralUnlimitedNatural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3838:1: ( rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3839:2: rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__27546);
            rule__LiteralUnlimitedNatural__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__27549);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3846:1: rule__LiteralUnlimitedNatural__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3850:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3851:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3851:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3852:1: '{'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralUnlimitedNatural__Group__2__Impl7577); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3865:1: rule__LiteralUnlimitedNatural__Group__3 : rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 ;
    public final void rule__LiteralUnlimitedNatural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3869:1: ( rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3870:2: rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__37608);
            rule__LiteralUnlimitedNatural__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__37611);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3877:1: rule__LiteralUnlimitedNatural__Group__3__Impl : ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) ;
    public final void rule__LiteralUnlimitedNatural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3881:1: ( ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3882:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3882:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3883:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3884:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3884:2: rule__LiteralUnlimitedNatural__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl7638);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3894:1: rule__LiteralUnlimitedNatural__Group__4 : rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 ;
    public final void rule__LiteralUnlimitedNatural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3898:1: ( rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3899:2: rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__47669);
            rule__LiteralUnlimitedNatural__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__47672);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3906:1: rule__LiteralUnlimitedNatural__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3910:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3911:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3911:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3912:1: 'value'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LiteralUnlimitedNatural__Group__4__Impl7700); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3925:1: rule__LiteralUnlimitedNatural__Group__5 : rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 ;
    public final void rule__LiteralUnlimitedNatural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3929:1: ( rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3930:2: rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__57731);
            rule__LiteralUnlimitedNatural__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__57734);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3937:1: rule__LiteralUnlimitedNatural__Group__5__Impl : ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3941:1: ( ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3942:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3942:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3943:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3944:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3944:2: rule__LiteralUnlimitedNatural__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl7761);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3954:1: rule__LiteralUnlimitedNatural__Group__6 : rule__LiteralUnlimitedNatural__Group__6__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3958:1: ( rule__LiteralUnlimitedNatural__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3959:2: rule__LiteralUnlimitedNatural__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__67791);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3965:1: rule__LiteralUnlimitedNatural__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3969:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3970:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3970:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3971:1: '}'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralUnlimitedNatural__Group__6__Impl7819); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3998:1: rule__LiteralUnlimitedNatural__Group_3__0 : rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4002:1: ( rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4003:2: rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__07864);
            rule__LiteralUnlimitedNatural__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__07867);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4010:1: rule__LiteralUnlimitedNatural__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4014:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4015:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4015:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4016:1: 'name'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl7895); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4029:1: rule__LiteralUnlimitedNatural__Group_3__1 : rule__LiteralUnlimitedNatural__Group_3__1__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4033:1: ( rule__LiteralUnlimitedNatural__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4034:2: rule__LiteralUnlimitedNatural__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__17926);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4040:1: rule__LiteralUnlimitedNatural__Group_3__1__Impl : ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4044:1: ( ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4045:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4045:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4046:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4047:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4047:2: rule__LiteralUnlimitedNatural__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl7953);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4061:1: rule__LiteralNull__Group__0 : rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 ;
    public final void rule__LiteralNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4065:1: ( rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4066:2: rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__07987);
            rule__LiteralNull__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__07990);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4073:1: rule__LiteralNull__Group__0__Impl : ( () ) ;
    public final void rule__LiteralNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4077:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4078:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4078:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4079:1: ()
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4080:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4082:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4092:1: rule__LiteralNull__Group__1 : rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 ;
    public final void rule__LiteralNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4096:1: ( rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4097:2: rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__18048);
            rule__LiteralNull__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__18051);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4104:1: rule__LiteralNull__Group__1__Impl : ( 'LiteralNull' ) ;
    public final void rule__LiteralNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4108:1: ( ( 'LiteralNull' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4109:1: ( 'LiteralNull' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4109:1: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4110:1: 'LiteralNull'
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__LiteralNull__Group__1__Impl8079); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4123:1: rule__LiteralNull__Group__2 : rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 ;
    public final void rule__LiteralNull__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4127:1: ( rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4128:2: rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__28110);
            rule__LiteralNull__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__28113);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4135:1: rule__LiteralNull__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralNull__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4139:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4140:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4140:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4141:1: '{'
            {
             before(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LiteralNull__Group__2__Impl8141); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4154:1: rule__LiteralNull__Group__3 : rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 ;
    public final void rule__LiteralNull__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4158:1: ( rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4159:2: rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__38172);
            rule__LiteralNull__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__38175);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4166:1: rule__LiteralNull__Group__3__Impl : ( ( rule__LiteralNull__Group_3__0 )? ) ;
    public final void rule__LiteralNull__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4170:1: ( ( ( rule__LiteralNull__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4171:1: ( ( rule__LiteralNull__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4171:1: ( ( rule__LiteralNull__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4172:1: ( rule__LiteralNull__Group_3__0 )?
            {
             before(grammarAccess.getLiteralNullAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4173:1: ( rule__LiteralNull__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4173:2: rule__LiteralNull__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl8202);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4183:1: rule__LiteralNull__Group__4 : rule__LiteralNull__Group__4__Impl ;
    public final void rule__LiteralNull__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4187:1: ( rule__LiteralNull__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4188:2: rule__LiteralNull__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__48233);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4194:1: rule__LiteralNull__Group__4__Impl : ( '}' ) ;
    public final void rule__LiteralNull__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4198:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4199:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4199:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4200:1: '}'
            {
             before(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__LiteralNull__Group__4__Impl8261); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4223:1: rule__LiteralNull__Group_3__0 : rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 ;
    public final void rule__LiteralNull__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4227:1: ( rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4228:2: rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__08302);
            rule__LiteralNull__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__08305);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4235:1: rule__LiteralNull__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralNull__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4239:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4240:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4240:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4241:1: 'name'
            {
             before(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LiteralNull__Group_3__0__Impl8333); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4254:1: rule__LiteralNull__Group_3__1 : rule__LiteralNull__Group_3__1__Impl ;
    public final void rule__LiteralNull__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4258:1: ( rule__LiteralNull__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4259:2: rule__LiteralNull__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__18364);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4265:1: rule__LiteralNull__Group_3__1__Impl : ( ( rule__LiteralNull__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralNull__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4269:1: ( ( ( rule__LiteralNull__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4270:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4270:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4271:1: ( rule__LiteralNull__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralNullAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4272:1: ( rule__LiteralNull__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4272:2: rule__LiteralNull__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl8391);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4287:1: rule__Model__NameAssignment_1 : ( ruleString0 ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4291:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4292:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4292:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4293:1: ruleString0
            {
             before(grammarAccess.getModelAccess().getNameString0ParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Model__NameAssignment_18430);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4302:1: rule__Model__PackagedElementAssignment_4_0 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4306:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4307:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4307:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4308:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_08461);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4317:1: rule__Model__PackagedElementAssignment_4_1 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4321:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4322:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4322:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4323:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_18492);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4332:1: rule__Package_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Package_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4336:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4337:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4337:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4338:1: ruleString0
            {
             before(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_28523);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4347:1: rule__Package_Impl__PackagedElementAssignment_4_0 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4351:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4352:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4352:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4353:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_08554);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4362:1: rule__Package_Impl__PackagedElementAssignment_4_1 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4366:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4367:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4367:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4368:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_18585);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4377:1: rule__Property_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Property_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4381:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4382:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4382:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4383:1: ruleString0
            {
             before(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_28616);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4392:1: rule__Property_Impl__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Property_Impl__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4396:1: ( ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4397:1: ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4397:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4398:1: ( ruleEString )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_4_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4399:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4400:1: ruleEString
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_48651);
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


    // $ANTLR start rule__Operation__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4411:1: rule__Operation__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4415:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4416:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4416:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4417:1: ruleString0
            {
             before(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Operation__NameAssignment_28686);
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


    // $ANTLR start rule__Activity__SpecificationAssignment_2_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4426:1: rule__Activity__SpecificationAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SpecificationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4430:1: ( ( ( RULE_ID ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4431:1: ( ( RULE_ID ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4431:1: ( ( RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4432:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSpecificationOperationCrossReference_2_1_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4433:1: ( RULE_ID )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4434:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSpecificationOperationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Activity__SpecificationAssignment_2_18721); 
             after(grammarAccess.getActivityAccess().getSpecificationOperationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSpecificationOperationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__SpecificationAssignment_2_1


    // $ANTLR start rule__Activity__NameAssignment_3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4445:1: rule__Activity__NameAssignment_3 : ( ruleString0 ) ;
    public final void rule__Activity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4449:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4450:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4450:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4451:1: ruleString0
            {
             before(grammarAccess.getActivityAccess().getNameString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Activity__NameAssignment_38756);
            ruleString0();
            _fsp--;

             after(grammarAccess.getActivityAccess().getNameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__NameAssignment_3


    // $ANTLR start rule__Activity__OwnedAttributeAssignment_7_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4460:1: rule__Activity__OwnedAttributeAssignment_7_1 : ( ruleProperty ) ;
    public final void rule__Activity__OwnedAttributeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4464:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4465:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4465:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4466:1: ruleProperty
            {
             before(grammarAccess.getActivityAccess().getOwnedAttributePropertyParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Activity__OwnedAttributeAssignment_7_18787);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getActivityAccess().getOwnedAttributePropertyParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__OwnedAttributeAssignment_7_1


    // $ANTLR start rule__Class_Impl__NameAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4475:1: rule__Class_Impl__NameAssignment_2 : ( ruleString0 ) ;
    public final void rule__Class_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4479:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4480:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4480:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4481:1: ruleString0
            {
             before(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_28818);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4490:1: rule__Class_Impl__OwnedAttributeAssignment_4_2 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4494:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4495:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4495:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4496:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_28849);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4505:1: rule__Class_Impl__OwnedAttributeAssignment_4_3_1 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4509:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4510:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4510:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4511:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_3_18880);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4520:1: rule__Class_Impl__NestedClassifierAssignment_5_2 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4524:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4525:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4525:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4526:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_28911);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4535:1: rule__Class_Impl__NestedClassifierAssignment_5_3_1 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4539:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4540:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4540:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4541:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_3_18942);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4550:1: rule__Class_Impl__OwnedOperationAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4554:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4555:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4555:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4556:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_28973);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4565:1: rule__Class_Impl__OwnedOperationAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4569:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4570:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4570:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4571:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_3_19004);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4580:1: rule__LiteralInteger__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralInteger__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4584:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4585:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4585:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4586:1: ruleString0
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_19035);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4595:1: rule__LiteralInteger__ValueAssignment_5 : ( ruleInteger ) ;
    public final void rule__LiteralInteger__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4599:1: ( ( ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4600:1: ( ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4600:1: ( ruleInteger )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4601:1: ruleInteger
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_59066);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4610:1: rule__LiteralString__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4614:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4615:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4615:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4616:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_19097);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4625:1: rule__LiteralString__ValueAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4629:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4630:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4630:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4631:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_19128);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4640:1: rule__LiteralBoolean__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralBoolean__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4644:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4645:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4645:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4646:1: ruleString0
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_19159);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4655:1: rule__LiteralBoolean__ValueAssignment_5 : ( ruleBoolean ) ;
    public final void rule__LiteralBoolean__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4659:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4660:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4660:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4661:1: ruleBoolean
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_59190);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4670:1: rule__LiteralUnlimitedNatural__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralUnlimitedNatural__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4674:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4675:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4675:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4676:1: ruleString0
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_19221);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4685:1: rule__LiteralUnlimitedNatural__ValueAssignment_5 : ( ruleUnlimitedNatural ) ;
    public final void rule__LiteralUnlimitedNatural__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4689:1: ( ( ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4690:1: ( ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4690:1: ( ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4691:1: ruleUnlimitedNatural
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_59252);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4700:1: rule__LiteralNull__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralNull__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4704:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4705:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4705:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4706:1: ruleString0
            {
             before(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_19283);
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
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0_in_ruleClass_Impl582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInteger643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__String0__Alternatives_in_ruleString0704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBoolean765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleUnlimitedNatural827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0_in_ruleLiteralInteger950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0_in_ruleLiteralString1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0_in_ruleLiteralBoolean1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural1097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0_in_ruleLiteralUnlimitedNatural1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull1157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull1164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0_in_ruleLiteralNull1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rule__PackageableElement__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rule__PackageableElement__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rule__PackageableElement__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__PackageableElement__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__String0__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__String0__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11479 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21539 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__2__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31601 = new BitSet(new long[]{0x0000000004830030L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__3__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41663 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0_in_rule__Model__Group__4__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group__5__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__0__Impl_in_rule__Model__Group_4__01795 = new BitSet(new long[]{0x0000000004820032L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1_in_rule__Model__Group_4__01798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_4_0_in_rule__Model__Group_4__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_4__1__Impl_in_rule__Model__Group_4__11855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_4_1_in_rule__Model__Group_4__1__Impl1882 = new BitSet(new long[]{0x0000000004820032L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__01917 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__11978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package_Impl__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22040 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__NameAssignment_2_in_rule__Package_Impl__Group__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32100 = new BitSet(new long[]{0x0000000004830030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Package_Impl__Group__3__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42162 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package_Impl__Group__5__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02294 = new BitSet(new long[]{0x0000000004820032L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_0_in_rule__Package_Impl__Group_4__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2381 = new BitSet(new long[]{0x0000000004820032L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__02416 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__02419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__12477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Property_Impl__Group__1__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__22539 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__22542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__NameAssignment_2_in_rule__Property_Impl__Group__2__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__32599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__32602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Property_Impl__Group__3__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__42661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__TypeAssignment_4_in_rule__Property_Impl__Group__4__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02728 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operation__Group__1__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22851 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32911 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operation__Group__3__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__4__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03042 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13103 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Activity__Group__1__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0_in_rule__Activity__Group__2__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33226 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_3_in_rule__Activity__Group__3__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43286 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__43289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group__4__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__53348 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__53351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group__5__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__63410 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__63413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Activity__Group__6__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73472 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_7__0_in_rule__Activity__Group__7__Impl3502 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Activity__Group__8__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__0__Impl_in_rule__Activity__Group_2__03610 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1_in_rule__Activity__Group_2__03613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Activity__Group_2__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_2__1__Impl_in_rule__Activity__Group_2__13672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SpecificationAssignment_2_1_in_rule__Activity__Group_2__1__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_7__0__Impl_in_rule__Activity__Group_7__03733 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Activity__Group_7__1_in_rule__Activity__Group_7__03736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Activity__Group_7__0__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_7__1__Impl_in_rule__Activity__Group_7__13795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__OwnedAttributeAssignment_7_1_in_rule__Activity__Group_7__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__03857 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__03860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__13918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__13921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Class_Impl__Group__1__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__23980 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__23983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NameAssignment_2_in_rule__Class_Impl__Group__2__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__34040 = new BitSet(new long[]{0x00000000A8010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__34043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group__3__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__44102 = new BitSet(new long[]{0x00000000A0010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__44105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__54163 = new BitSet(new long[]{0x0000000080010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__54166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__64224 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__64227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__74285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group__7__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__04360 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__04363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Class_Impl__Group_4__0__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__14422 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__2_in_rule__Class_Impl__Group_4__14425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_4__1__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__2__Impl_in_rule__Class_Impl__Group_4__24484 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__3_in_rule__Class_Impl__Group_4__24487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_2_in_rule__Class_Impl__Group_4__2__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__3__Impl_in_rule__Class_Impl__Group_4__34544 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__4_in_rule__Class_Impl__Group_4__34547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__0_in_rule__Class_Impl__Group_4__3__Impl4574 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__4__Impl_in_rule__Class_Impl__Group_4__44605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_4__4__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__0__Impl_in_rule__Class_Impl__Group_4_3__04674 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__1_in_rule__Class_Impl__Group_4_3__04677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Class_Impl__Group_4_3__0__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4_3__1__Impl_in_rule__Class_Impl__Group_4_3__14736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_4_3_1_in_rule__Class_Impl__Group_4_3__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__04797 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__04800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Class_Impl__Group_5__0__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__14859 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2_in_rule__Class_Impl__Group_5__14862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_5__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__2__Impl_in_rule__Class_Impl__Group_5__24921 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3_in_rule__Class_Impl__Group_5__24924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_2_in_rule__Class_Impl__Group_5__2__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__3__Impl_in_rule__Class_Impl__Group_5__34981 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4_in_rule__Class_Impl__Group_5__34984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0_in_rule__Class_Impl__Group_5__3__Impl5011 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__4__Impl_in_rule__Class_Impl__Group_5__45042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_5__4__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__0__Impl_in_rule__Class_Impl__Group_5_3__05111 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1_in_rule__Class_Impl__Group_5_3__05114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Class_Impl__Group_5_3__0__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5_3__1__Impl_in_rule__Class_Impl__Group_5_3__15173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_5_3_1_in_rule__Class_Impl__Group_5_3__1__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__05234 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__05237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Class_Impl__Group_6__0__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__15296 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2_in_rule__Class_Impl__Group_6__15299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Class_Impl__Group_6__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__2__Impl_in_rule__Class_Impl__Group_6__25358 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3_in_rule__Class_Impl__Group_6__25361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_2_in_rule__Class_Impl__Group_6__2__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__3__Impl_in_rule__Class_Impl__Group_6__35418 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4_in_rule__Class_Impl__Group_6__35421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0_in_rule__Class_Impl__Group_6__3__Impl5448 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__4__Impl_in_rule__Class_Impl__Group_6__45479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Class_Impl__Group_6__4__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__0__Impl_in_rule__Class_Impl__Group_6_3__05548 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1_in_rule__Class_Impl__Group_6_3__05551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Class_Impl__Group_6_3__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6_3__1__Impl_in_rule__Class_Impl__Group_6_3__15610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_6_3_1_in_rule__Class_Impl__Group_6_3__1__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__05671 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__05674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__15732 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__15735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__LiteralInteger__Group__1__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__25794 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__25797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralInteger__Group__2__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__35856 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__35859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__45917 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__45920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralInteger__Group__4__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__55979 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__55982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl6009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__66039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralInteger__Group__6__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__06112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__06115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralInteger__Group_3__0__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__16174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__06235 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__06238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__16296 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__16299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__LiteralString__Group__1__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__26358 = new BitSet(new long[]{0x0000000600010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__26361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralString__Group__2__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__36420 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__36423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__46481 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__46484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__56542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralString__Group__5__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__06613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__06616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralString__Group_3__0__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__16675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__06736 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__06739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralString__Group_4__0__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__16798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__06859 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__06862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__16920 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__16923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__LiteralBoolean__Group__1__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__26982 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__26985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralBoolean__Group__2__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__37044 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__37047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__47105 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__47108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralBoolean__Group__4__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__57167 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__57170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl7197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__67227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralBoolean__Group__6__Impl7255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__07300 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__07303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralBoolean__Group_3__0__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__17362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__07423 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__07426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__17484 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__17487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__LiteralUnlimitedNatural__Group__1__Impl7515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__27546 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__27549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralUnlimitedNatural__Group__2__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__37608 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__37611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__47669 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__47672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LiteralUnlimitedNatural__Group__4__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__57731 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__57734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__67791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralUnlimitedNatural__Group__6__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__07864 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__07867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__17926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl7953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__07987 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__07990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__18048 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__18051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__LiteralNull__Group__1__Impl8079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__28110 = new BitSet(new long[]{0x0000000400010000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__28113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LiteralNull__Group__2__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__38172 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__38175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl8202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__48233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__LiteralNull__Group__4__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__08302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__08305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LiteralNull__Group_3__0__Impl8333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__18364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Model__NameAssignment_18430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_08461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_4_18492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_28523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_08554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_4_18585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_28616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_48651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Operation__NameAssignment_28686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SpecificationAssignment_2_18721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Activity__NameAssignment_38756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Activity__OwnedAttributeAssignment_7_18787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_28818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_28849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_4_3_18880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_28911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_5_3_18942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_28973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_6_3_19004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_19035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_59066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_19097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_19128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_19159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_59190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_19221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_59252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_19283 = new BitSet(new long[]{0x0000000000000002L});
    }


}