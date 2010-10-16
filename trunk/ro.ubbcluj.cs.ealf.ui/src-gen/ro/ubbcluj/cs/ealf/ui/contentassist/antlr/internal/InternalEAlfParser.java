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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'public'", "'private'", "'protected'", "'package'", "'sequential'", "'guarded'", "'concurrent'", "'packagedElement'", "'{'", "'}'", "','", "'Package'", "'name'", "'visibility'", "'Property'", "'isStatic'", "'type'", "'Operation'", "'isAbstract'", "'concurrency'", "'Class'", "'isActive'", "'ownedAttribute'", "'nestedClassifier'", "'ownedOperation'", "'LiteralInteger'", "'value'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'"
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

            if ( (LA1_0==21) ) {
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

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:775:1: rule__Model__Group__0__Impl : ( 'packagedElement' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:779:1: ( ( 'packagedElement' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:780:1: ( 'packagedElement' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:780:1: ( 'packagedElement' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:781:1: 'packagedElement'
            {
             before(grammarAccess.getModelAccess().getPackagedElementKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Model__Group__0__Impl1597); 
             after(grammarAccess.getModelAccess().getPackagedElementKeyword_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:794:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:798:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:799:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11628);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11631);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:806:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:810:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:811:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:811:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:812:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Model__Group__1__Impl1659); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:825:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:829:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:830:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21690);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21693);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:837:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagedElementAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:841:1: ( ( ( rule__Model__PackagedElementAssignment_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:842:1: ( ( rule__Model__PackagedElementAssignment_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:842:1: ( ( rule__Model__PackagedElementAssignment_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:843:1: ( rule__Model__PackagedElementAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:844:1: ( rule__Model__PackagedElementAssignment_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:844:2: rule__Model__PackagedElementAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_2_in_rule__Model__Group__2__Impl1720);
            rule__Model__PackagedElementAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:854:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:858:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:859:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31750);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31753);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:866:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:870:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:871:1: ( ( rule__Model__Group_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:871:1: ( ( rule__Model__Group_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:872:1: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:873:1: ( rule__Model__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:873:2: rule__Model__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1780);
            	    rule__Model__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:883:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:887:1: ( rule__Model__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:888:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41811);
            rule__Model__Group__4__Impl();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:894:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:898:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:899:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:899:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:900:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Model__Group__4__Impl1839); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Model__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:923:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:927:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:928:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01880);
            rule__Model__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01883);
            rule__Model__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_3__0


    // $ANTLR start rule__Model__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:935:1: rule__Model__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:939:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:940:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:940:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:941:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Model__Group_3__0__Impl1911); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_3__0__Impl


    // $ANTLR start rule__Model__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:954:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:958:1: ( rule__Model__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:959:2: rule__Model__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11942);
            rule__Model__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_3__1


    // $ANTLR start rule__Model__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:965:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__PackagedElementAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:969:1: ( ( ( rule__Model__PackagedElementAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:970:1: ( ( rule__Model__PackagedElementAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:970:1: ( ( rule__Model__PackagedElementAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:971:1: ( rule__Model__PackagedElementAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:972:1: ( rule__Model__PackagedElementAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:972:2: rule__Model__PackagedElementAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__PackagedElementAssignment_3_1_in_rule__Model__Group_3__1__Impl1969);
            rule__Model__PackagedElementAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_3__1__Impl


    // $ANTLR start rule__Package_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:986:1: rule__Package_Impl__Group__0 : rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 ;
    public final void rule__Package_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:990:1: ( rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:991:2: rule__Package_Impl__Group__0__Impl rule__Package_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__02003);
            rule__Package_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__02006);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:998:1: rule__Package_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Package_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1002:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1003:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1003:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1004:1: ()
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1005:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1007:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1017:1: rule__Package_Impl__Group__1 : rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 ;
    public final void rule__Package_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1021:1: ( rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1022:2: rule__Package_Impl__Group__1__Impl rule__Package_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__12064);
            rule__Package_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__12067);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1029:1: rule__Package_Impl__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1033:1: ( ( 'Package' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1034:1: ( 'Package' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1034:1: ( 'Package' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1035:1: 'Package'
            {
             before(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package_Impl__Group__1__Impl2095); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1048:1: rule__Package_Impl__Group__2 : rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 ;
    public final void rule__Package_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1052:1: ( rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1053:2: rule__Package_Impl__Group__2__Impl rule__Package_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22126);
            rule__Package_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22129);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1060:1: rule__Package_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Package_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1064:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1065:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1065:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1066:1: '{'
            {
             before(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package_Impl__Group__2__Impl2157); 
             after(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1079:1: rule__Package_Impl__Group__3 : rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 ;
    public final void rule__Package_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1083:1: ( rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1084:2: rule__Package_Impl__Group__3__Impl rule__Package_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32188);
            rule__Package_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32191);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1091:1: rule__Package_Impl__Group__3__Impl : ( ( rule__Package_Impl__Group_3__0 )? ) ;
    public final void rule__Package_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1095:1: ( ( ( rule__Package_Impl__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1096:1: ( ( rule__Package_Impl__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1096:1: ( ( rule__Package_Impl__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1097:1: ( rule__Package_Impl__Group_3__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1098:1: ( rule__Package_Impl__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1098:2: rule__Package_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_3__0_in_rule__Package_Impl__Group__3__Impl2218);
                    rule__Package_Impl__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackage_ImplAccess().getGroup_3()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1108:1: rule__Package_Impl__Group__4 : rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 ;
    public final void rule__Package_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1112:1: ( rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1113:2: rule__Package_Impl__Group__4__Impl rule__Package_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42249);
            rule__Package_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42252);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1120:1: rule__Package_Impl__Group__4__Impl : ( ( rule__Package_Impl__Group_4__0 )? ) ;
    public final void rule__Package_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1124:1: ( ( ( rule__Package_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1125:1: ( ( rule__Package_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1125:1: ( ( rule__Package_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1126:1: ( rule__Package_Impl__Group_4__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1127:1: ( rule__Package_Impl__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1127:2: rule__Package_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2279);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1137:1: rule__Package_Impl__Group__5 : rule__Package_Impl__Group__5__Impl rule__Package_Impl__Group__6 ;
    public final void rule__Package_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1141:1: ( rule__Package_Impl__Group__5__Impl rule__Package_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1142:2: rule__Package_Impl__Group__5__Impl rule__Package_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52310);
            rule__Package_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__6_in_rule__Package_Impl__Group__52313);
            rule__Package_Impl__Group__6();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1149:1: rule__Package_Impl__Group__5__Impl : ( ( rule__Package_Impl__Group_5__0 )? ) ;
    public final void rule__Package_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1153:1: ( ( ( rule__Package_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1154:1: ( ( rule__Package_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1154:1: ( ( rule__Package_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1155:1: ( rule__Package_Impl__Group_5__0 )?
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1156:1: ( rule__Package_Impl__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1156:2: rule__Package_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__0_in_rule__Package_Impl__Group__5__Impl2340);
                    rule__Package_Impl__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackage_ImplAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Package_Impl__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1166:1: rule__Package_Impl__Group__6 : rule__Package_Impl__Group__6__Impl ;
    public final void rule__Package_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1170:1: ( rule__Package_Impl__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1171:2: rule__Package_Impl__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group__6__Impl_in_rule__Package_Impl__Group__62371);
            rule__Package_Impl__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__6


    // $ANTLR start rule__Package_Impl__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1177:1: rule__Package_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__Package_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1181:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1182:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1182:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1183:1: '}'
            {
             before(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package_Impl__Group__6__Impl2399); 
             after(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group__6__Impl


    // $ANTLR start rule__Package_Impl__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1210:1: rule__Package_Impl__Group_3__0 : rule__Package_Impl__Group_3__0__Impl rule__Package_Impl__Group_3__1 ;
    public final void rule__Package_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1214:1: ( rule__Package_Impl__Group_3__0__Impl rule__Package_Impl__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1215:2: rule__Package_Impl__Group_3__0__Impl rule__Package_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_3__0__Impl_in_rule__Package_Impl__Group_3__02444);
            rule__Package_Impl__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_3__1_in_rule__Package_Impl__Group_3__02447);
            rule__Package_Impl__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_3__0


    // $ANTLR start rule__Package_Impl__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1222:1: rule__Package_Impl__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Package_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1226:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1227:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1227:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1228:1: 'name'
            {
             before(grammarAccess.getPackage_ImplAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Package_Impl__Group_3__0__Impl2475); 
             after(grammarAccess.getPackage_ImplAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_3__0__Impl


    // $ANTLR start rule__Package_Impl__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1241:1: rule__Package_Impl__Group_3__1 : rule__Package_Impl__Group_3__1__Impl ;
    public final void rule__Package_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1245:1: ( rule__Package_Impl__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1246:2: rule__Package_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_3__1__Impl_in_rule__Package_Impl__Group_3__12506);
            rule__Package_Impl__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_3__1


    // $ANTLR start rule__Package_Impl__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1252:1: rule__Package_Impl__Group_3__1__Impl : ( ( rule__Package_Impl__NameAssignment_3_1 ) ) ;
    public final void rule__Package_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1256:1: ( ( ( rule__Package_Impl__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1257:1: ( ( rule__Package_Impl__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1257:1: ( ( rule__Package_Impl__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1258:1: ( rule__Package_Impl__NameAssignment_3_1 )
            {
             before(grammarAccess.getPackage_ImplAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1259:1: ( rule__Package_Impl__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1259:2: rule__Package_Impl__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__NameAssignment_3_1_in_rule__Package_Impl__Group_3__1__Impl2533);
            rule__Package_Impl__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_3__1__Impl


    // $ANTLR start rule__Package_Impl__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1273:1: rule__Package_Impl__Group_4__0 : rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 ;
    public final void rule__Package_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1277:1: ( rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1278:2: rule__Package_Impl__Group_4__0__Impl rule__Package_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02567);
            rule__Package_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02570);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1285:1: rule__Package_Impl__Group_4__0__Impl : ( 'visibility' ) ;
    public final void rule__Package_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1289:1: ( ( 'visibility' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1290:1: ( 'visibility' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1290:1: ( 'visibility' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1291:1: 'visibility'
            {
             before(grammarAccess.getPackage_ImplAccess().getVisibilityKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Package_Impl__Group_4__0__Impl2598); 
             after(grammarAccess.getPackage_ImplAccess().getVisibilityKeyword_4_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1304:1: rule__Package_Impl__Group_4__1 : rule__Package_Impl__Group_4__1__Impl ;
    public final void rule__Package_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1308:1: ( rule__Package_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1309:2: rule__Package_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12629);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1315:1: rule__Package_Impl__Group_4__1__Impl : ( ( rule__Package_Impl__VisibilityAssignment_4_1 ) ) ;
    public final void rule__Package_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1319:1: ( ( ( rule__Package_Impl__VisibilityAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1320:1: ( ( rule__Package_Impl__VisibilityAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1320:1: ( ( rule__Package_Impl__VisibilityAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1321:1: ( rule__Package_Impl__VisibilityAssignment_4_1 )
            {
             before(grammarAccess.getPackage_ImplAccess().getVisibilityAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1322:1: ( rule__Package_Impl__VisibilityAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1322:2: rule__Package_Impl__VisibilityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__VisibilityAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2656);
            rule__Package_Impl__VisibilityAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getVisibilityAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Package_Impl__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1336:1: rule__Package_Impl__Group_5__0 : rule__Package_Impl__Group_5__0__Impl rule__Package_Impl__Group_5__1 ;
    public final void rule__Package_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1340:1: ( rule__Package_Impl__Group_5__0__Impl rule__Package_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1341:2: rule__Package_Impl__Group_5__0__Impl rule__Package_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__0__Impl_in_rule__Package_Impl__Group_5__02690);
            rule__Package_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__1_in_rule__Package_Impl__Group_5__02693);
            rule__Package_Impl__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__0


    // $ANTLR start rule__Package_Impl__Group_5__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1348:1: rule__Package_Impl__Group_5__0__Impl : ( 'packagedElement' ) ;
    public final void rule__Package_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1352:1: ( ( 'packagedElement' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1353:1: ( 'packagedElement' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1353:1: ( 'packagedElement' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1354:1: 'packagedElement'
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package_Impl__Group_5__0__Impl2721); 
             after(grammarAccess.getPackage_ImplAccess().getPackagedElementKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__0__Impl


    // $ANTLR start rule__Package_Impl__Group_5__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1367:1: rule__Package_Impl__Group_5__1 : rule__Package_Impl__Group_5__1__Impl rule__Package_Impl__Group_5__2 ;
    public final void rule__Package_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1371:1: ( rule__Package_Impl__Group_5__1__Impl rule__Package_Impl__Group_5__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1372:2: rule__Package_Impl__Group_5__1__Impl rule__Package_Impl__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__1__Impl_in_rule__Package_Impl__Group_5__12752);
            rule__Package_Impl__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__2_in_rule__Package_Impl__Group_5__12755);
            rule__Package_Impl__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__1


    // $ANTLR start rule__Package_Impl__Group_5__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1379:1: rule__Package_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1383:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1384:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1384:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1385:1: '{'
            {
             before(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package_Impl__Group_5__1__Impl2783); 
             after(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__1__Impl


    // $ANTLR start rule__Package_Impl__Group_5__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1398:1: rule__Package_Impl__Group_5__2 : rule__Package_Impl__Group_5__2__Impl rule__Package_Impl__Group_5__3 ;
    public final void rule__Package_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1402:1: ( rule__Package_Impl__Group_5__2__Impl rule__Package_Impl__Group_5__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1403:2: rule__Package_Impl__Group_5__2__Impl rule__Package_Impl__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__2__Impl_in_rule__Package_Impl__Group_5__22814);
            rule__Package_Impl__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__3_in_rule__Package_Impl__Group_5__22817);
            rule__Package_Impl__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__2


    // $ANTLR start rule__Package_Impl__Group_5__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1410:1: rule__Package_Impl__Group_5__2__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_5_2 ) ) ;
    public final void rule__Package_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1414:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_5_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1415:1: ( ( rule__Package_Impl__PackagedElementAssignment_5_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1415:1: ( ( rule__Package_Impl__PackagedElementAssignment_5_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1416:1: ( rule__Package_Impl__PackagedElementAssignment_5_2 )
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_5_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1417:1: ( rule__Package_Impl__PackagedElementAssignment_5_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1417:2: rule__Package_Impl__PackagedElementAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_5_2_in_rule__Package_Impl__Group_5__2__Impl2844);
            rule__Package_Impl__PackagedElementAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__2__Impl


    // $ANTLR start rule__Package_Impl__Group_5__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1427:1: rule__Package_Impl__Group_5__3 : rule__Package_Impl__Group_5__3__Impl rule__Package_Impl__Group_5__4 ;
    public final void rule__Package_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1431:1: ( rule__Package_Impl__Group_5__3__Impl rule__Package_Impl__Group_5__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1432:2: rule__Package_Impl__Group_5__3__Impl rule__Package_Impl__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__3__Impl_in_rule__Package_Impl__Group_5__32874);
            rule__Package_Impl__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__4_in_rule__Package_Impl__Group_5__32877);
            rule__Package_Impl__Group_5__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__3


    // $ANTLR start rule__Package_Impl__Group_5__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1439:1: rule__Package_Impl__Group_5__3__Impl : ( ( rule__Package_Impl__Group_5_3__0 )* ) ;
    public final void rule__Package_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1443:1: ( ( ( rule__Package_Impl__Group_5_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1444:1: ( ( rule__Package_Impl__Group_5_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1444:1: ( ( rule__Package_Impl__Group_5_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1445:1: ( rule__Package_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getPackage_ImplAccess().getGroup_5_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1446:1: ( rule__Package_Impl__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1446:2: rule__Package_Impl__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5_3__0_in_rule__Package_Impl__Group_5__3__Impl2904);
            	    rule__Package_Impl__Group_5_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackage_ImplAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__3__Impl


    // $ANTLR start rule__Package_Impl__Group_5__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1456:1: rule__Package_Impl__Group_5__4 : rule__Package_Impl__Group_5__4__Impl ;
    public final void rule__Package_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1460:1: ( rule__Package_Impl__Group_5__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1461:2: rule__Package_Impl__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5__4__Impl_in_rule__Package_Impl__Group_5__42935);
            rule__Package_Impl__Group_5__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__4


    // $ANTLR start rule__Package_Impl__Group_5__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1467:1: rule__Package_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1471:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1472:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1472:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1473:1: '}'
            {
             before(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package_Impl__Group_5__4__Impl2963); 
             after(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5__4__Impl


    // $ANTLR start rule__Package_Impl__Group_5_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1496:1: rule__Package_Impl__Group_5_3__0 : rule__Package_Impl__Group_5_3__0__Impl rule__Package_Impl__Group_5_3__1 ;
    public final void rule__Package_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1500:1: ( rule__Package_Impl__Group_5_3__0__Impl rule__Package_Impl__Group_5_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1501:2: rule__Package_Impl__Group_5_3__0__Impl rule__Package_Impl__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5_3__0__Impl_in_rule__Package_Impl__Group_5_3__03004);
            rule__Package_Impl__Group_5_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5_3__1_in_rule__Package_Impl__Group_5_3__03007);
            rule__Package_Impl__Group_5_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5_3__0


    // $ANTLR start rule__Package_Impl__Group_5_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1508:1: rule__Package_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1512:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1513:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1513:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1514:1: ','
            {
             before(grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package_Impl__Group_5_3__0__Impl3035); 
             after(grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5_3__0__Impl


    // $ANTLR start rule__Package_Impl__Group_5_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1527:1: rule__Package_Impl__Group_5_3__1 : rule__Package_Impl__Group_5_3__1__Impl ;
    public final void rule__Package_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1531:1: ( rule__Package_Impl__Group_5_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1532:2: rule__Package_Impl__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__Group_5_3__1__Impl_in_rule__Package_Impl__Group_5_3__13066);
            rule__Package_Impl__Group_5_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5_3__1


    // $ANTLR start rule__Package_Impl__Group_5_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1538:1: rule__Package_Impl__Group_5_3__1__Impl : ( ( rule__Package_Impl__PackagedElementAssignment_5_3_1 ) ) ;
    public final void rule__Package_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1542:1: ( ( ( rule__Package_Impl__PackagedElementAssignment_5_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1543:1: ( ( rule__Package_Impl__PackagedElementAssignment_5_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1543:1: ( ( rule__Package_Impl__PackagedElementAssignment_5_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1544:1: ( rule__Package_Impl__PackagedElementAssignment_5_3_1 )
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_5_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1545:1: ( rule__Package_Impl__PackagedElementAssignment_5_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1545:2: rule__Package_Impl__PackagedElementAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package_Impl__PackagedElementAssignment_5_3_1_in_rule__Package_Impl__Group_5_3__1__Impl3093);
            rule__Package_Impl__PackagedElementAssignment_5_3_1();
            _fsp--;


            }

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__Group_5_3__1__Impl


    // $ANTLR start rule__Property_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1559:1: rule__Property_Impl__Group__0 : rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 ;
    public final void rule__Property_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1563:1: ( rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1564:2: rule__Property_Impl__Group__0__Impl rule__Property_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__03127);
            rule__Property_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__03130);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1571:1: rule__Property_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Property_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1575:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1576:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1576:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1577:1: ()
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1578:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1580:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1590:1: rule__Property_Impl__Group__1 : rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 ;
    public final void rule__Property_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1594:1: ( rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1595:2: rule__Property_Impl__Group__1__Impl rule__Property_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__13188);
            rule__Property_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__13191);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1602:1: rule__Property_Impl__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1606:1: ( ( 'Property' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1607:1: ( 'Property' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1607:1: ( 'Property' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1608:1: 'Property'
            {
             before(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property_Impl__Group__1__Impl3219); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1621:1: rule__Property_Impl__Group__2 : rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 ;
    public final void rule__Property_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1625:1: ( rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1626:2: rule__Property_Impl__Group__2__Impl rule__Property_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__23250);
            rule__Property_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__23253);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1633:1: rule__Property_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Property_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1637:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1638:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1638:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1639:1: '{'
            {
             before(grammarAccess.getProperty_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Property_Impl__Group__2__Impl3281); 
             after(grammarAccess.getProperty_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1652:1: rule__Property_Impl__Group__3 : rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 ;
    public final void rule__Property_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1656:1: ( rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1657:2: rule__Property_Impl__Group__3__Impl rule__Property_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__33312);
            rule__Property_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__33315);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1664:1: rule__Property_Impl__Group__3__Impl : ( ( rule__Property_Impl__Group_3__0 )? ) ;
    public final void rule__Property_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1668:1: ( ( ( rule__Property_Impl__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1669:1: ( ( rule__Property_Impl__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1669:1: ( ( rule__Property_Impl__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1670:1: ( rule__Property_Impl__Group_3__0 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1671:1: ( rule__Property_Impl__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1671:2: rule__Property_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__0_in_rule__Property_Impl__Group__3__Impl3342);
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


    // $ANTLR start rule__Property_Impl__Group__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1681:1: rule__Property_Impl__Group__4 : rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5 ;
    public final void rule__Property_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1685:1: ( rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1686:2: rule__Property_Impl__Group__4__Impl rule__Property_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__43373);
            rule__Property_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__5_in_rule__Property_Impl__Group__43376);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1693:1: rule__Property_Impl__Group__4__Impl : ( ( rule__Property_Impl__Group_4__0 )? ) ;
    public final void rule__Property_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1697:1: ( ( ( rule__Property_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1698:1: ( ( rule__Property_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1698:1: ( ( rule__Property_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1699:1: ( rule__Property_Impl__Group_4__0 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1700:1: ( rule__Property_Impl__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1700:2: rule__Property_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_4__0_in_rule__Property_Impl__Group__4__Impl3403);
                    rule__Property_Impl__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProperty_ImplAccess().getGroup_4()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1710:1: rule__Property_Impl__Group__5 : rule__Property_Impl__Group__5__Impl rule__Property_Impl__Group__6 ;
    public final void rule__Property_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1714:1: ( rule__Property_Impl__Group__5__Impl rule__Property_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1715:2: rule__Property_Impl__Group__5__Impl rule__Property_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__5__Impl_in_rule__Property_Impl__Group__53434);
            rule__Property_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__6_in_rule__Property_Impl__Group__53437);
            rule__Property_Impl__Group__6();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1722:1: rule__Property_Impl__Group__5__Impl : ( ( rule__Property_Impl__Group_5__0 )? ) ;
    public final void rule__Property_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1726:1: ( ( ( rule__Property_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1727:1: ( ( rule__Property_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1727:1: ( ( rule__Property_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1728:1: ( rule__Property_Impl__Group_5__0 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1729:1: ( rule__Property_Impl__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1729:2: rule__Property_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_5__0_in_rule__Property_Impl__Group__5__Impl3464);
                    rule__Property_Impl__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProperty_ImplAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Property_Impl__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1739:1: rule__Property_Impl__Group__6 : rule__Property_Impl__Group__6__Impl rule__Property_Impl__Group__7 ;
    public final void rule__Property_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1743:1: ( rule__Property_Impl__Group__6__Impl rule__Property_Impl__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1744:2: rule__Property_Impl__Group__6__Impl rule__Property_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__6__Impl_in_rule__Property_Impl__Group__63495);
            rule__Property_Impl__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__7_in_rule__Property_Impl__Group__63498);
            rule__Property_Impl__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__6


    // $ANTLR start rule__Property_Impl__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1751:1: rule__Property_Impl__Group__6__Impl : ( ( rule__Property_Impl__Group_6__0 )? ) ;
    public final void rule__Property_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1755:1: ( ( ( rule__Property_Impl__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1756:1: ( ( rule__Property_Impl__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1756:1: ( ( rule__Property_Impl__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1757:1: ( rule__Property_Impl__Group_6__0 )?
            {
             before(grammarAccess.getProperty_ImplAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1758:1: ( rule__Property_Impl__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1758:2: rule__Property_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_6__0_in_rule__Property_Impl__Group__6__Impl3525);
                    rule__Property_Impl__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProperty_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__6__Impl


    // $ANTLR start rule__Property_Impl__Group__7
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1768:1: rule__Property_Impl__Group__7 : rule__Property_Impl__Group__7__Impl ;
    public final void rule__Property_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1772:1: ( rule__Property_Impl__Group__7__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1773:2: rule__Property_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group__7__Impl_in_rule__Property_Impl__Group__73556);
            rule__Property_Impl__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__7


    // $ANTLR start rule__Property_Impl__Group__7__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1779:1: rule__Property_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__Property_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1783:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1784:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1784:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1785:1: '}'
            {
             before(grammarAccess.getProperty_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Property_Impl__Group__7__Impl3584); 
             after(grammarAccess.getProperty_ImplAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group__7__Impl


    // $ANTLR start rule__Property_Impl__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1814:1: rule__Property_Impl__Group_3__0 : rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1 ;
    public final void rule__Property_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1818:1: ( rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1819:2: rule__Property_Impl__Group_3__0__Impl rule__Property_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__0__Impl_in_rule__Property_Impl__Group_3__03631);
            rule__Property_Impl__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__1_in_rule__Property_Impl__Group_3__03634);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1826:1: rule__Property_Impl__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Property_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1830:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1831:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1831:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1832:1: 'name'
            {
             before(grammarAccess.getProperty_ImplAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Property_Impl__Group_3__0__Impl3662); 
             after(grammarAccess.getProperty_ImplAccess().getNameKeyword_3_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1845:1: rule__Property_Impl__Group_3__1 : rule__Property_Impl__Group_3__1__Impl ;
    public final void rule__Property_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1849:1: ( rule__Property_Impl__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1850:2: rule__Property_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_3__1__Impl_in_rule__Property_Impl__Group_3__13693);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1856:1: rule__Property_Impl__Group_3__1__Impl : ( ( rule__Property_Impl__NameAssignment_3_1 ) ) ;
    public final void rule__Property_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1860:1: ( ( ( rule__Property_Impl__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1861:1: ( ( rule__Property_Impl__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1861:1: ( ( rule__Property_Impl__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1862:1: ( rule__Property_Impl__NameAssignment_3_1 )
            {
             before(grammarAccess.getProperty_ImplAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1863:1: ( rule__Property_Impl__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1863:2: rule__Property_Impl__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__NameAssignment_3_1_in_rule__Property_Impl__Group_3__1__Impl3720);
            rule__Property_Impl__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getNameAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Property_Impl__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1877:1: rule__Property_Impl__Group_4__0 : rule__Property_Impl__Group_4__0__Impl rule__Property_Impl__Group_4__1 ;
    public final void rule__Property_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1881:1: ( rule__Property_Impl__Group_4__0__Impl rule__Property_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1882:2: rule__Property_Impl__Group_4__0__Impl rule__Property_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_4__0__Impl_in_rule__Property_Impl__Group_4__03754);
            rule__Property_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_4__1_in_rule__Property_Impl__Group_4__03757);
            rule__Property_Impl__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_4__0


    // $ANTLR start rule__Property_Impl__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1889:1: rule__Property_Impl__Group_4__0__Impl : ( 'visibility' ) ;
    public final void rule__Property_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1893:1: ( ( 'visibility' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1894:1: ( 'visibility' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1894:1: ( 'visibility' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1895:1: 'visibility'
            {
             before(grammarAccess.getProperty_ImplAccess().getVisibilityKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Property_Impl__Group_4__0__Impl3785); 
             after(grammarAccess.getProperty_ImplAccess().getVisibilityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_4__0__Impl


    // $ANTLR start rule__Property_Impl__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1908:1: rule__Property_Impl__Group_4__1 : rule__Property_Impl__Group_4__1__Impl ;
    public final void rule__Property_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1912:1: ( rule__Property_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1913:2: rule__Property_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_4__1__Impl_in_rule__Property_Impl__Group_4__13816);
            rule__Property_Impl__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_4__1


    // $ANTLR start rule__Property_Impl__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1919:1: rule__Property_Impl__Group_4__1__Impl : ( ( rule__Property_Impl__VisibilityAssignment_4_1 ) ) ;
    public final void rule__Property_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1923:1: ( ( ( rule__Property_Impl__VisibilityAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1924:1: ( ( rule__Property_Impl__VisibilityAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1924:1: ( ( rule__Property_Impl__VisibilityAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1925:1: ( rule__Property_Impl__VisibilityAssignment_4_1 )
            {
             before(grammarAccess.getProperty_ImplAccess().getVisibilityAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1926:1: ( rule__Property_Impl__VisibilityAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1926:2: rule__Property_Impl__VisibilityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__VisibilityAssignment_4_1_in_rule__Property_Impl__Group_4__1__Impl3843);
            rule__Property_Impl__VisibilityAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getVisibilityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_4__1__Impl


    // $ANTLR start rule__Property_Impl__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1940:1: rule__Property_Impl__Group_5__0 : rule__Property_Impl__Group_5__0__Impl rule__Property_Impl__Group_5__1 ;
    public final void rule__Property_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1944:1: ( rule__Property_Impl__Group_5__0__Impl rule__Property_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1945:2: rule__Property_Impl__Group_5__0__Impl rule__Property_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_5__0__Impl_in_rule__Property_Impl__Group_5__03877);
            rule__Property_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_5__1_in_rule__Property_Impl__Group_5__03880);
            rule__Property_Impl__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_5__0


    // $ANTLR start rule__Property_Impl__Group_5__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1952:1: rule__Property_Impl__Group_5__0__Impl : ( 'isStatic' ) ;
    public final void rule__Property_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1956:1: ( ( 'isStatic' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1957:1: ( 'isStatic' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1957:1: ( 'isStatic' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1958:1: 'isStatic'
            {
             before(grammarAccess.getProperty_ImplAccess().getIsStaticKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property_Impl__Group_5__0__Impl3908); 
             after(grammarAccess.getProperty_ImplAccess().getIsStaticKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_5__0__Impl


    // $ANTLR start rule__Property_Impl__Group_5__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1971:1: rule__Property_Impl__Group_5__1 : rule__Property_Impl__Group_5__1__Impl ;
    public final void rule__Property_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1975:1: ( rule__Property_Impl__Group_5__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1976:2: rule__Property_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_5__1__Impl_in_rule__Property_Impl__Group_5__13939);
            rule__Property_Impl__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_5__1


    // $ANTLR start rule__Property_Impl__Group_5__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1982:1: rule__Property_Impl__Group_5__1__Impl : ( ( rule__Property_Impl__IsStaticAssignment_5_1 ) ) ;
    public final void rule__Property_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1986:1: ( ( ( rule__Property_Impl__IsStaticAssignment_5_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1987:1: ( ( rule__Property_Impl__IsStaticAssignment_5_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1987:1: ( ( rule__Property_Impl__IsStaticAssignment_5_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1988:1: ( rule__Property_Impl__IsStaticAssignment_5_1 )
            {
             before(grammarAccess.getProperty_ImplAccess().getIsStaticAssignment_5_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1989:1: ( rule__Property_Impl__IsStaticAssignment_5_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:1989:2: rule__Property_Impl__IsStaticAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__IsStaticAssignment_5_1_in_rule__Property_Impl__Group_5__1__Impl3966);
            rule__Property_Impl__IsStaticAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getIsStaticAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_5__1__Impl


    // $ANTLR start rule__Property_Impl__Group_6__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2003:1: rule__Property_Impl__Group_6__0 : rule__Property_Impl__Group_6__0__Impl rule__Property_Impl__Group_6__1 ;
    public final void rule__Property_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2007:1: ( rule__Property_Impl__Group_6__0__Impl rule__Property_Impl__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2008:2: rule__Property_Impl__Group_6__0__Impl rule__Property_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_6__0__Impl_in_rule__Property_Impl__Group_6__04000);
            rule__Property_Impl__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_6__1_in_rule__Property_Impl__Group_6__04003);
            rule__Property_Impl__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_6__0


    // $ANTLR start rule__Property_Impl__Group_6__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2015:1: rule__Property_Impl__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Property_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2019:1: ( ( 'type' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2020:1: ( 'type' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2020:1: ( 'type' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2021:1: 'type'
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Property_Impl__Group_6__0__Impl4031); 
             after(grammarAccess.getProperty_ImplAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_6__0__Impl


    // $ANTLR start rule__Property_Impl__Group_6__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2034:1: rule__Property_Impl__Group_6__1 : rule__Property_Impl__Group_6__1__Impl ;
    public final void rule__Property_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2038:1: ( rule__Property_Impl__Group_6__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2039:2: rule__Property_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__Group_6__1__Impl_in_rule__Property_Impl__Group_6__14062);
            rule__Property_Impl__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_6__1


    // $ANTLR start rule__Property_Impl__Group_6__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2045:1: rule__Property_Impl__Group_6__1__Impl : ( ( rule__Property_Impl__TypeAssignment_6_1 ) ) ;
    public final void rule__Property_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2049:1: ( ( ( rule__Property_Impl__TypeAssignment_6_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:1: ( ( rule__Property_Impl__TypeAssignment_6_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2050:1: ( ( rule__Property_Impl__TypeAssignment_6_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2051:1: ( rule__Property_Impl__TypeAssignment_6_1 )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeAssignment_6_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2052:1: ( rule__Property_Impl__TypeAssignment_6_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2052:2: rule__Property_Impl__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property_Impl__TypeAssignment_6_1_in_rule__Property_Impl__Group_6__1__Impl4089);
            rule__Property_Impl__TypeAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getProperty_ImplAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__Group_6__1__Impl


    // $ANTLR start rule__Operation__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2066:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2070:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2071:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__04123);
            rule__Operation__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__04126);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2078:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2082:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2083:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2083:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2084:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2085:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2087:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2097:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2101:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2102:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__14184);
            rule__Operation__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__14187);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2109:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2113:1: ( ( 'Operation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2114:1: ( 'Operation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2114:1: ( 'Operation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2115:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Operation__Group__1__Impl4215); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2128:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2132:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2133:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__24246);
            rule__Operation__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__24249);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2140:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2144:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2145:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2145:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2146:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__2__Impl4277); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2159:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2163:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2164:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__34308);
            rule__Operation__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__34311);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2171:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2175:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2176:1: ( ( rule__Operation__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2177:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2178:1: ( rule__Operation__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2178:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl4338);
                    rule__Operation__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2188:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2192:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2193:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44369);
            rule__Operation__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44372);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2200:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2204:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2205:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2205:1: ( ( rule__Operation__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2206:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2207:1: ( rule__Operation__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2207:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl4399);
                    rule__Operation__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2217:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2221:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2222:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54430);
            rule__Operation__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54433);
            rule__Operation__Group__6();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2229:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2233:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2234:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2234:1: ( ( rule__Operation__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2235:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2236:1: ( rule__Operation__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2236:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl4460);
                    rule__Operation__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Operation__Group__6
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2246:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2250:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2251:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64491);
            rule__Operation__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__64494);
            rule__Operation__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__6


    // $ANTLR start rule__Operation__Group__6__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2258:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__Group_6__0 )? ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2262:1: ( ( ( rule__Operation__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2263:1: ( ( rule__Operation__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2263:1: ( ( rule__Operation__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2264:1: ( rule__Operation__Group_6__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2265:1: ( rule__Operation__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2265:2: rule__Operation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_6__0_in_rule__Operation__Group__6__Impl4521);
                    rule__Operation__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__6__Impl


    // $ANTLR start rule__Operation__Group__7
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2275:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl rule__Operation__Group__8 ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2279:1: ( rule__Operation__Group__7__Impl rule__Operation__Group__8 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2280:2: rule__Operation__Group__7__Impl rule__Operation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__74552);
            rule__Operation__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__8_in_rule__Operation__Group__74555);
            rule__Operation__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__7


    // $ANTLR start rule__Operation__Group__7__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2287:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__Group_7__0 )? ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2291:1: ( ( ( rule__Operation__Group_7__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2292:1: ( ( rule__Operation__Group_7__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2292:1: ( ( rule__Operation__Group_7__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2293:1: ( rule__Operation__Group_7__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_7()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2294:1: ( rule__Operation__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2294:2: rule__Operation__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_7__0_in_rule__Operation__Group__7__Impl4582);
                    rule__Operation__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__7__Impl


    // $ANTLR start rule__Operation__Group__8
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2304:1: rule__Operation__Group__8 : rule__Operation__Group__8__Impl ;
    public final void rule__Operation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2308:1: ( rule__Operation__Group__8__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2309:2: rule__Operation__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__8__Impl_in_rule__Operation__Group__84613);
            rule__Operation__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__8


    // $ANTLR start rule__Operation__Group__8__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2315:1: rule__Operation__Group__8__Impl : ( '}' ) ;
    public final void rule__Operation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2319:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2320:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2320:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2321:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Operation__Group__8__Impl4641); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group__8__Impl


    // $ANTLR start rule__Operation__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2352:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2356:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2357:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__04690);
            rule__Operation__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__04693);
            rule__Operation__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_3__0


    // $ANTLR start rule__Operation__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2364:1: rule__Operation__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2368:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2369:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2369:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2370:1: 'name'
            {
             before(grammarAccess.getOperationAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Operation__Group_3__0__Impl4721); 
             after(grammarAccess.getOperationAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_3__0__Impl


    // $ANTLR start rule__Operation__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2383:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2387:1: ( rule__Operation__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2388:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__14752);
            rule__Operation__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_3__1


    // $ANTLR start rule__Operation__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2394:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__NameAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2398:1: ( ( ( rule__Operation__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2399:1: ( ( rule__Operation__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2399:1: ( ( rule__Operation__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2400:1: ( rule__Operation__NameAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2401:1: ( rule__Operation__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2401:2: rule__Operation__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_3_1_in_rule__Operation__Group_3__1__Impl4779);
            rule__Operation__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_3__1__Impl


    // $ANTLR start rule__Operation__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2415:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2419:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2420:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__04813);
            rule__Operation__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__04816);
            rule__Operation__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_4__0


    // $ANTLR start rule__Operation__Group_4__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2427:1: rule__Operation__Group_4__0__Impl : ( 'visibility' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2431:1: ( ( 'visibility' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2432:1: ( 'visibility' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2432:1: ( 'visibility' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2433:1: 'visibility'
            {
             before(grammarAccess.getOperationAccess().getVisibilityKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Operation__Group_4__0__Impl4844); 
             after(grammarAccess.getOperationAccess().getVisibilityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_4__0__Impl


    // $ANTLR start rule__Operation__Group_4__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2446:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2450:1: ( rule__Operation__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2451:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__14875);
            rule__Operation__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_4__1


    // $ANTLR start rule__Operation__Group_4__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2457:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__VisibilityAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2461:1: ( ( ( rule__Operation__VisibilityAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2462:1: ( ( rule__Operation__VisibilityAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2462:1: ( ( rule__Operation__VisibilityAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2463:1: ( rule__Operation__VisibilityAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2464:1: ( rule__Operation__VisibilityAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2464:2: rule__Operation__VisibilityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__VisibilityAssignment_4_1_in_rule__Operation__Group_4__1__Impl4902);
            rule__Operation__VisibilityAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_4__1__Impl


    // $ANTLR start rule__Operation__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2478:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2482:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2483:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__04936);
            rule__Operation__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__04939);
            rule__Operation__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_5__0


    // $ANTLR start rule__Operation__Group_5__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2490:1: rule__Operation__Group_5__0__Impl : ( 'isStatic' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2494:1: ( ( 'isStatic' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2495:1: ( 'isStatic' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2495:1: ( 'isStatic' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2496:1: 'isStatic'
            {
             before(grammarAccess.getOperationAccess().getIsStaticKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Operation__Group_5__0__Impl4967); 
             after(grammarAccess.getOperationAccess().getIsStaticKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_5__0__Impl


    // $ANTLR start rule__Operation__Group_5__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2509:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2513:1: ( rule__Operation__Group_5__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2514:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__14998);
            rule__Operation__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_5__1


    // $ANTLR start rule__Operation__Group_5__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2520:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__IsStaticAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2524:1: ( ( ( rule__Operation__IsStaticAssignment_5_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2525:1: ( ( rule__Operation__IsStaticAssignment_5_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2525:1: ( ( rule__Operation__IsStaticAssignment_5_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2526:1: ( rule__Operation__IsStaticAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getIsStaticAssignment_5_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:1: ( rule__Operation__IsStaticAssignment_5_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2527:2: rule__Operation__IsStaticAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__IsStaticAssignment_5_1_in_rule__Operation__Group_5__1__Impl5025);
            rule__Operation__IsStaticAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getIsStaticAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_5__1__Impl


    // $ANTLR start rule__Operation__Group_6__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2541:1: rule__Operation__Group_6__0 : rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 ;
    public final void rule__Operation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2545:1: ( rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2546:2: rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_6__0__Impl_in_rule__Operation__Group_6__05059);
            rule__Operation__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_6__1_in_rule__Operation__Group_6__05062);
            rule__Operation__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_6__0


    // $ANTLR start rule__Operation__Group_6__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2553:1: rule__Operation__Group_6__0__Impl : ( 'isAbstract' ) ;
    public final void rule__Operation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2557:1: ( ( 'isAbstract' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2558:1: ( 'isAbstract' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2558:1: ( 'isAbstract' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2559:1: 'isAbstract'
            {
             before(grammarAccess.getOperationAccess().getIsAbstractKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Operation__Group_6__0__Impl5090); 
             after(grammarAccess.getOperationAccess().getIsAbstractKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_6__0__Impl


    // $ANTLR start rule__Operation__Group_6__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2572:1: rule__Operation__Group_6__1 : rule__Operation__Group_6__1__Impl ;
    public final void rule__Operation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2576:1: ( rule__Operation__Group_6__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2577:2: rule__Operation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_6__1__Impl_in_rule__Operation__Group_6__15121);
            rule__Operation__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_6__1


    // $ANTLR start rule__Operation__Group_6__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2583:1: rule__Operation__Group_6__1__Impl : ( ( rule__Operation__IsAbstractAssignment_6_1 ) ) ;
    public final void rule__Operation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2587:1: ( ( ( rule__Operation__IsAbstractAssignment_6_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2588:1: ( ( rule__Operation__IsAbstractAssignment_6_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2588:1: ( ( rule__Operation__IsAbstractAssignment_6_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2589:1: ( rule__Operation__IsAbstractAssignment_6_1 )
            {
             before(grammarAccess.getOperationAccess().getIsAbstractAssignment_6_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2590:1: ( rule__Operation__IsAbstractAssignment_6_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2590:2: rule__Operation__IsAbstractAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__IsAbstractAssignment_6_1_in_rule__Operation__Group_6__1__Impl5148);
            rule__Operation__IsAbstractAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getIsAbstractAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_6__1__Impl


    // $ANTLR start rule__Operation__Group_7__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2604:1: rule__Operation__Group_7__0 : rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 ;
    public final void rule__Operation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2608:1: ( rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2609:2: rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_7__0__Impl_in_rule__Operation__Group_7__05182);
            rule__Operation__Group_7__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_7__1_in_rule__Operation__Group_7__05185);
            rule__Operation__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_7__0


    // $ANTLR start rule__Operation__Group_7__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2616:1: rule__Operation__Group_7__0__Impl : ( 'concurrency' ) ;
    public final void rule__Operation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2620:1: ( ( 'concurrency' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2621:1: ( 'concurrency' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2621:1: ( 'concurrency' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2622:1: 'concurrency'
            {
             before(grammarAccess.getOperationAccess().getConcurrencyKeyword_7_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Operation__Group_7__0__Impl5213); 
             after(grammarAccess.getOperationAccess().getConcurrencyKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_7__0__Impl


    // $ANTLR start rule__Operation__Group_7__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2635:1: rule__Operation__Group_7__1 : rule__Operation__Group_7__1__Impl ;
    public final void rule__Operation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2639:1: ( rule__Operation__Group_7__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2640:2: rule__Operation__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_7__1__Impl_in_rule__Operation__Group_7__15244);
            rule__Operation__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_7__1


    // $ANTLR start rule__Operation__Group_7__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2646:1: rule__Operation__Group_7__1__Impl : ( ( rule__Operation__ConcurrencyAssignment_7_1 ) ) ;
    public final void rule__Operation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2650:1: ( ( ( rule__Operation__ConcurrencyAssignment_7_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2651:1: ( ( rule__Operation__ConcurrencyAssignment_7_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2651:1: ( ( rule__Operation__ConcurrencyAssignment_7_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2652:1: ( rule__Operation__ConcurrencyAssignment_7_1 )
            {
             before(grammarAccess.getOperationAccess().getConcurrencyAssignment_7_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2653:1: ( rule__Operation__ConcurrencyAssignment_7_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2653:2: rule__Operation__ConcurrencyAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ConcurrencyAssignment_7_1_in_rule__Operation__Group_7__1__Impl5271);
            rule__Operation__ConcurrencyAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getConcurrencyAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Group_7__1__Impl


    // $ANTLR start rule__Class_Impl__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2667:1: rule__Class_Impl__Group__0 : rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 ;
    public final void rule__Class_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2671:1: ( rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2672:2: rule__Class_Impl__Group__0__Impl rule__Class_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__05305);
            rule__Class_Impl__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__05308);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2679:1: rule__Class_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Class_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2683:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2684:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2684:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2685:1: ()
            {
             before(grammarAccess.getClass_ImplAccess().getClassAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2686:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2688:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2698:1: rule__Class_Impl__Group__1 : rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 ;
    public final void rule__Class_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2702:1: ( rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2703:2: rule__Class_Impl__Group__1__Impl rule__Class_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__15366);
            rule__Class_Impl__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__15369);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2710:1: rule__Class_Impl__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2714:1: ( ( 'Class' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2715:1: ( 'Class' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2715:1: ( 'Class' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2716:1: 'Class'
            {
             before(grammarAccess.getClass_ImplAccess().getClassKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Class_Impl__Group__1__Impl5397); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2729:1: rule__Class_Impl__Group__2 : rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 ;
    public final void rule__Class_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2733:1: ( rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2734:2: rule__Class_Impl__Group__2__Impl rule__Class_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__25428);
            rule__Class_Impl__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__25431);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2741:1: rule__Class_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2745:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2746:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2746:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2747:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group__2__Impl5459); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2760:1: rule__Class_Impl__Group__3 : rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 ;
    public final void rule__Class_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2764:1: ( rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2765:2: rule__Class_Impl__Group__3__Impl rule__Class_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__35490);
            rule__Class_Impl__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__35493);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2772:1: rule__Class_Impl__Group__3__Impl : ( ( rule__Class_Impl__Group_3__0 )? ) ;
    public final void rule__Class_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2776:1: ( ( ( rule__Class_Impl__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2777:1: ( ( rule__Class_Impl__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2777:1: ( ( rule__Class_Impl__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2778:1: ( rule__Class_Impl__Group_3__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2779:1: ( rule__Class_Impl__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2779:2: rule__Class_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_3__0_in_rule__Class_Impl__Group__3__Impl5520);
                    rule__Class_Impl__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_3()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2789:1: rule__Class_Impl__Group__4 : rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 ;
    public final void rule__Class_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2793:1: ( rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2794:2: rule__Class_Impl__Group__4__Impl rule__Class_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__45551);
            rule__Class_Impl__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__45554);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2801:1: rule__Class_Impl__Group__4__Impl : ( ( rule__Class_Impl__Group_4__0 )? ) ;
    public final void rule__Class_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2805:1: ( ( ( rule__Class_Impl__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2806:1: ( ( rule__Class_Impl__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2806:1: ( ( rule__Class_Impl__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2807:1: ( rule__Class_Impl__Group_4__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2808:1: ( rule__Class_Impl__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2808:2: rule__Class_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl5581);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2818:1: rule__Class_Impl__Group__5 : rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 ;
    public final void rule__Class_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2822:1: ( rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2823:2: rule__Class_Impl__Group__5__Impl rule__Class_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__55612);
            rule__Class_Impl__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__55615);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2830:1: rule__Class_Impl__Group__5__Impl : ( ( rule__Class_Impl__Group_5__0 )? ) ;
    public final void rule__Class_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2834:1: ( ( ( rule__Class_Impl__Group_5__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2835:1: ( ( rule__Class_Impl__Group_5__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2835:1: ( ( rule__Class_Impl__Group_5__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2836:1: ( rule__Class_Impl__Group_5__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2837:1: ( rule__Class_Impl__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2837:2: rule__Class_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl5642);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2847:1: rule__Class_Impl__Group__6 : rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 ;
    public final void rule__Class_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2851:1: ( rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2852:2: rule__Class_Impl__Group__6__Impl rule__Class_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__65673);
            rule__Class_Impl__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__65676);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2859:1: rule__Class_Impl__Group__6__Impl : ( ( rule__Class_Impl__Group_6__0 )? ) ;
    public final void rule__Class_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2863:1: ( ( ( rule__Class_Impl__Group_6__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2864:1: ( ( rule__Class_Impl__Group_6__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2864:1: ( ( rule__Class_Impl__Group_6__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2865:1: ( rule__Class_Impl__Group_6__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_6()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2866:1: ( rule__Class_Impl__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2866:2: rule__Class_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl5703);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2876:1: rule__Class_Impl__Group__7 : rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8 ;
    public final void rule__Class_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2880:1: ( rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2881:2: rule__Class_Impl__Group__7__Impl rule__Class_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__75734);
            rule__Class_Impl__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__8_in_rule__Class_Impl__Group__75737);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2888:1: rule__Class_Impl__Group__7__Impl : ( ( rule__Class_Impl__Group_7__0 )? ) ;
    public final void rule__Class_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2892:1: ( ( ( rule__Class_Impl__Group_7__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2893:1: ( ( rule__Class_Impl__Group_7__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2893:1: ( ( rule__Class_Impl__Group_7__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2894:1: ( rule__Class_Impl__Group_7__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_7()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2895:1: ( rule__Class_Impl__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2895:2: rule__Class_Impl__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__0_in_rule__Class_Impl__Group__7__Impl5764);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2905:1: rule__Class_Impl__Group__8 : rule__Class_Impl__Group__8__Impl rule__Class_Impl__Group__9 ;
    public final void rule__Class_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2909:1: ( rule__Class_Impl__Group__8__Impl rule__Class_Impl__Group__9 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2910:2: rule__Class_Impl__Group__8__Impl rule__Class_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__8__Impl_in_rule__Class_Impl__Group__85795);
            rule__Class_Impl__Group__8__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__9_in_rule__Class_Impl__Group__85798);
            rule__Class_Impl__Group__9();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2917:1: rule__Class_Impl__Group__8__Impl : ( ( rule__Class_Impl__Group_8__0 )? ) ;
    public final void rule__Class_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2921:1: ( ( ( rule__Class_Impl__Group_8__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2922:1: ( ( rule__Class_Impl__Group_8__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2922:1: ( ( rule__Class_Impl__Group_8__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2923:1: ( rule__Class_Impl__Group_8__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_8()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2924:1: ( rule__Class_Impl__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2924:2: rule__Class_Impl__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__0_in_rule__Class_Impl__Group__8__Impl5825);
                    rule__Class_Impl__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start rule__Class_Impl__Group__9
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2934:1: rule__Class_Impl__Group__9 : rule__Class_Impl__Group__9__Impl rule__Class_Impl__Group__10 ;
    public final void rule__Class_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2938:1: ( rule__Class_Impl__Group__9__Impl rule__Class_Impl__Group__10 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2939:2: rule__Class_Impl__Group__9__Impl rule__Class_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__9__Impl_in_rule__Class_Impl__Group__95856);
            rule__Class_Impl__Group__9__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__10_in_rule__Class_Impl__Group__95859);
            rule__Class_Impl__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__9


    // $ANTLR start rule__Class_Impl__Group__9__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2946:1: rule__Class_Impl__Group__9__Impl : ( ( rule__Class_Impl__Group_9__0 )? ) ;
    public final void rule__Class_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2950:1: ( ( ( rule__Class_Impl__Group_9__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2951:1: ( ( rule__Class_Impl__Group_9__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2951:1: ( ( rule__Class_Impl__Group_9__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2952:1: ( rule__Class_Impl__Group_9__0 )?
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_9()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2953:1: ( rule__Class_Impl__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2953:2: rule__Class_Impl__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__0_in_rule__Class_Impl__Group__9__Impl5886);
                    rule__Class_Impl__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_ImplAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__9__Impl


    // $ANTLR start rule__Class_Impl__Group__10
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2963:1: rule__Class_Impl__Group__10 : rule__Class_Impl__Group__10__Impl ;
    public final void rule__Class_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2967:1: ( rule__Class_Impl__Group__10__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2968:2: rule__Class_Impl__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group__10__Impl_in_rule__Class_Impl__Group__105917);
            rule__Class_Impl__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__10


    // $ANTLR start rule__Class_Impl__Group__10__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2974:1: rule__Class_Impl__Group__10__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2978:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2979:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2979:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:2980:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Class_Impl__Group__10__Impl5945); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group__10__Impl


    // $ANTLR start rule__Class_Impl__Group_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3015:1: rule__Class_Impl__Group_3__0 : rule__Class_Impl__Group_3__0__Impl rule__Class_Impl__Group_3__1 ;
    public final void rule__Class_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3019:1: ( rule__Class_Impl__Group_3__0__Impl rule__Class_Impl__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3020:2: rule__Class_Impl__Group_3__0__Impl rule__Class_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_3__0__Impl_in_rule__Class_Impl__Group_3__05998);
            rule__Class_Impl__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_3__1_in_rule__Class_Impl__Group_3__06001);
            rule__Class_Impl__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_3__0


    // $ANTLR start rule__Class_Impl__Group_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3027:1: rule__Class_Impl__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Class_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3031:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3032:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3032:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3033:1: 'name'
            {
             before(grammarAccess.getClass_ImplAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Class_Impl__Group_3__0__Impl6029); 
             after(grammarAccess.getClass_ImplAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3046:1: rule__Class_Impl__Group_3__1 : rule__Class_Impl__Group_3__1__Impl ;
    public final void rule__Class_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3050:1: ( rule__Class_Impl__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3051:2: rule__Class_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_3__1__Impl_in_rule__Class_Impl__Group_3__16060);
            rule__Class_Impl__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_3__1


    // $ANTLR start rule__Class_Impl__Group_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3057:1: rule__Class_Impl__Group_3__1__Impl : ( ( rule__Class_Impl__NameAssignment_3_1 ) ) ;
    public final void rule__Class_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3061:1: ( ( ( rule__Class_Impl__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3062:1: ( ( rule__Class_Impl__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3062:1: ( ( rule__Class_Impl__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3063:1: ( rule__Class_Impl__NameAssignment_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3064:1: ( rule__Class_Impl__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3064:2: rule__Class_Impl__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NameAssignment_3_1_in_rule__Class_Impl__Group_3__1__Impl6087);
            rule__Class_Impl__NameAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group_4__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3078:1: rule__Class_Impl__Group_4__0 : rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 ;
    public final void rule__Class_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3082:1: ( rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3083:2: rule__Class_Impl__Group_4__0__Impl rule__Class_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__06121);
            rule__Class_Impl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__06124);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3090:1: rule__Class_Impl__Group_4__0__Impl : ( 'visibility' ) ;
    public final void rule__Class_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3094:1: ( ( 'visibility' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3095:1: ( 'visibility' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3095:1: ( 'visibility' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3096:1: 'visibility'
            {
             before(grammarAccess.getClass_ImplAccess().getVisibilityKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Class_Impl__Group_4__0__Impl6152); 
             after(grammarAccess.getClass_ImplAccess().getVisibilityKeyword_4_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3109:1: rule__Class_Impl__Group_4__1 : rule__Class_Impl__Group_4__1__Impl ;
    public final void rule__Class_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3113:1: ( rule__Class_Impl__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3114:2: rule__Class_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__16183);
            rule__Class_Impl__Group_4__1__Impl();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3120:1: rule__Class_Impl__Group_4__1__Impl : ( ( rule__Class_Impl__VisibilityAssignment_4_1 ) ) ;
    public final void rule__Class_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3124:1: ( ( ( rule__Class_Impl__VisibilityAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3125:1: ( ( rule__Class_Impl__VisibilityAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3125:1: ( ( rule__Class_Impl__VisibilityAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3126:1: ( rule__Class_Impl__VisibilityAssignment_4_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getVisibilityAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3127:1: ( rule__Class_Impl__VisibilityAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3127:2: rule__Class_Impl__VisibilityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__VisibilityAssignment_4_1_in_rule__Class_Impl__Group_4__1__Impl6210);
            rule__Class_Impl__VisibilityAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getVisibilityAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Class_Impl__Group_5__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3141:1: rule__Class_Impl__Group_5__0 : rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 ;
    public final void rule__Class_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3145:1: ( rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3146:2: rule__Class_Impl__Group_5__0__Impl rule__Class_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__06244);
            rule__Class_Impl__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__06247);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3153:1: rule__Class_Impl__Group_5__0__Impl : ( 'isAbstract' ) ;
    public final void rule__Class_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3157:1: ( ( 'isAbstract' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3158:1: ( 'isAbstract' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3158:1: ( 'isAbstract' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3159:1: 'isAbstract'
            {
             before(grammarAccess.getClass_ImplAccess().getIsAbstractKeyword_5_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Class_Impl__Group_5__0__Impl6275); 
             after(grammarAccess.getClass_ImplAccess().getIsAbstractKeyword_5_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3172:1: rule__Class_Impl__Group_5__1 : rule__Class_Impl__Group_5__1__Impl ;
    public final void rule__Class_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3176:1: ( rule__Class_Impl__Group_5__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3177:2: rule__Class_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__16306);
            rule__Class_Impl__Group_5__1__Impl();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3183:1: rule__Class_Impl__Group_5__1__Impl : ( ( rule__Class_Impl__IsAbstractAssignment_5_1 ) ) ;
    public final void rule__Class_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3187:1: ( ( ( rule__Class_Impl__IsAbstractAssignment_5_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3188:1: ( ( rule__Class_Impl__IsAbstractAssignment_5_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3188:1: ( ( rule__Class_Impl__IsAbstractAssignment_5_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3189:1: ( rule__Class_Impl__IsAbstractAssignment_5_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getIsAbstractAssignment_5_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3190:1: ( rule__Class_Impl__IsAbstractAssignment_5_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3190:2: rule__Class_Impl__IsAbstractAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__IsAbstractAssignment_5_1_in_rule__Class_Impl__Group_5__1__Impl6333);
            rule__Class_Impl__IsAbstractAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getIsAbstractAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Class_Impl__Group_6__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3204:1: rule__Class_Impl__Group_6__0 : rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 ;
    public final void rule__Class_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3208:1: ( rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3209:2: rule__Class_Impl__Group_6__0__Impl rule__Class_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__06367);
            rule__Class_Impl__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__06370);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3216:1: rule__Class_Impl__Group_6__0__Impl : ( 'isActive' ) ;
    public final void rule__Class_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3220:1: ( ( 'isActive' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3221:1: ( 'isActive' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3221:1: ( 'isActive' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3222:1: 'isActive'
            {
             before(grammarAccess.getClass_ImplAccess().getIsActiveKeyword_6_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Class_Impl__Group_6__0__Impl6398); 
             after(grammarAccess.getClass_ImplAccess().getIsActiveKeyword_6_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3235:1: rule__Class_Impl__Group_6__1 : rule__Class_Impl__Group_6__1__Impl ;
    public final void rule__Class_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3239:1: ( rule__Class_Impl__Group_6__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3240:2: rule__Class_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__16429);
            rule__Class_Impl__Group_6__1__Impl();
            _fsp--;


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3246:1: rule__Class_Impl__Group_6__1__Impl : ( ( rule__Class_Impl__IsActiveAssignment_6_1 ) ) ;
    public final void rule__Class_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3250:1: ( ( ( rule__Class_Impl__IsActiveAssignment_6_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3251:1: ( ( rule__Class_Impl__IsActiveAssignment_6_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3251:1: ( ( rule__Class_Impl__IsActiveAssignment_6_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3252:1: ( rule__Class_Impl__IsActiveAssignment_6_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getIsActiveAssignment_6_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3253:1: ( rule__Class_Impl__IsActiveAssignment_6_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3253:2: rule__Class_Impl__IsActiveAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__IsActiveAssignment_6_1_in_rule__Class_Impl__Group_6__1__Impl6456);
            rule__Class_Impl__IsActiveAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getIsActiveAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Class_Impl__Group_7__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3267:1: rule__Class_Impl__Group_7__0 : rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1 ;
    public final void rule__Class_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3271:1: ( rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3272:2: rule__Class_Impl__Group_7__0__Impl rule__Class_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__0__Impl_in_rule__Class_Impl__Group_7__06490);
            rule__Class_Impl__Group_7__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__1_in_rule__Class_Impl__Group_7__06493);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3279:1: rule__Class_Impl__Group_7__0__Impl : ( 'ownedAttribute' ) ;
    public final void rule__Class_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3283:1: ( ( 'ownedAttribute' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3284:1: ( 'ownedAttribute' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3284:1: ( 'ownedAttribute' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3285:1: 'ownedAttribute'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_7_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Class_Impl__Group_7__0__Impl6521); 
             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_7_0()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3298:1: rule__Class_Impl__Group_7__1 : rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2 ;
    public final void rule__Class_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3302:1: ( rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3303:2: rule__Class_Impl__Group_7__1__Impl rule__Class_Impl__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__1__Impl_in_rule__Class_Impl__Group_7__16552);
            rule__Class_Impl__Group_7__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__2_in_rule__Class_Impl__Group_7__16555);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3310:1: rule__Class_Impl__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3314:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3315:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3315:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3316:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_7__1__Impl6583); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3329:1: rule__Class_Impl__Group_7__2 : rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3 ;
    public final void rule__Class_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3333:1: ( rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3334:2: rule__Class_Impl__Group_7__2__Impl rule__Class_Impl__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__2__Impl_in_rule__Class_Impl__Group_7__26614);
            rule__Class_Impl__Group_7__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__3_in_rule__Class_Impl__Group_7__26617);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3341:1: rule__Class_Impl__Group_7__2__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_7_2 ) ) ;
    public final void rule__Class_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3345:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_7_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3346:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_7_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3346:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_7_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3347:1: ( rule__Class_Impl__OwnedAttributeAssignment_7_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_7_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3348:1: ( rule__Class_Impl__OwnedAttributeAssignment_7_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3348:2: rule__Class_Impl__OwnedAttributeAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_7_2_in_rule__Class_Impl__Group_7__2__Impl6644);
            rule__Class_Impl__OwnedAttributeAssignment_7_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_7_2()); 

            }


            }

        }
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3358:1: rule__Class_Impl__Group_7__3 : rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4 ;
    public final void rule__Class_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3362:1: ( rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3363:2: rule__Class_Impl__Group_7__3__Impl rule__Class_Impl__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__3__Impl_in_rule__Class_Impl__Group_7__36674);
            rule__Class_Impl__Group_7__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__4_in_rule__Class_Impl__Group_7__36677);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3370:1: rule__Class_Impl__Group_7__3__Impl : ( ( rule__Class_Impl__Group_7_3__0 )* ) ;
    public final void rule__Class_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3374:1: ( ( ( rule__Class_Impl__Group_7_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3375:1: ( ( rule__Class_Impl__Group_7_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3375:1: ( ( rule__Class_Impl__Group_7_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3376:1: ( rule__Class_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_7_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3377:1: ( rule__Class_Impl__Group_7_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3377:2: rule__Class_Impl__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__0_in_rule__Class_Impl__Group_7__3__Impl6704);
            	    rule__Class_Impl__Group_7_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3387:1: rule__Class_Impl__Group_7__4 : rule__Class_Impl__Group_7__4__Impl ;
    public final void rule__Class_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3391:1: ( rule__Class_Impl__Group_7__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3392:2: rule__Class_Impl__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7__4__Impl_in_rule__Class_Impl__Group_7__46735);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3398:1: rule__Class_Impl__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3402:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3403:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3403:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3404:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Class_Impl__Group_7__4__Impl6763); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3427:1: rule__Class_Impl__Group_7_3__0 : rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1 ;
    public final void rule__Class_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3431:1: ( rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3432:2: rule__Class_Impl__Group_7_3__0__Impl rule__Class_Impl__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__0__Impl_in_rule__Class_Impl__Group_7_3__06804);
            rule__Class_Impl__Group_7_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__1_in_rule__Class_Impl__Group_7_3__06807);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3439:1: rule__Class_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3443:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3444:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3444:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3445:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Class_Impl__Group_7_3__0__Impl6835); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3458:1: rule__Class_Impl__Group_7_3__1 : rule__Class_Impl__Group_7_3__1__Impl ;
    public final void rule__Class_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3462:1: ( rule__Class_Impl__Group_7_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3463:2: rule__Class_Impl__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_7_3__1__Impl_in_rule__Class_Impl__Group_7_3__16866);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3469:1: rule__Class_Impl__Group_7_3__1__Impl : ( ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 ) ) ;
    public final void rule__Class_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3473:1: ( ( ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3474:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3474:1: ( ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3475:1: ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_7_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3476:1: ( rule__Class_Impl__OwnedAttributeAssignment_7_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3476:2: rule__Class_Impl__OwnedAttributeAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_7_3_1_in_rule__Class_Impl__Group_7_3__1__Impl6893);
            rule__Class_Impl__OwnedAttributeAssignment_7_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributeAssignment_7_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Class_Impl__Group_8__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3490:1: rule__Class_Impl__Group_8__0 : rule__Class_Impl__Group_8__0__Impl rule__Class_Impl__Group_8__1 ;
    public final void rule__Class_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3494:1: ( rule__Class_Impl__Group_8__0__Impl rule__Class_Impl__Group_8__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3495:2: rule__Class_Impl__Group_8__0__Impl rule__Class_Impl__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__0__Impl_in_rule__Class_Impl__Group_8__06927);
            rule__Class_Impl__Group_8__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__1_in_rule__Class_Impl__Group_8__06930);
            rule__Class_Impl__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__0


    // $ANTLR start rule__Class_Impl__Group_8__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3502:1: rule__Class_Impl__Group_8__0__Impl : ( 'nestedClassifier' ) ;
    public final void rule__Class_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3506:1: ( ( 'nestedClassifier' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3507:1: ( 'nestedClassifier' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3507:1: ( 'nestedClassifier' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3508:1: 'nestedClassifier'
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_8_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Class_Impl__Group_8__0__Impl6958); 
             after(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__0__Impl


    // $ANTLR start rule__Class_Impl__Group_8__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3521:1: rule__Class_Impl__Group_8__1 : rule__Class_Impl__Group_8__1__Impl rule__Class_Impl__Group_8__2 ;
    public final void rule__Class_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3525:1: ( rule__Class_Impl__Group_8__1__Impl rule__Class_Impl__Group_8__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3526:2: rule__Class_Impl__Group_8__1__Impl rule__Class_Impl__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__1__Impl_in_rule__Class_Impl__Group_8__16989);
            rule__Class_Impl__Group_8__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__2_in_rule__Class_Impl__Group_8__16992);
            rule__Class_Impl__Group_8__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__1


    // $ANTLR start rule__Class_Impl__Group_8__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3533:1: rule__Class_Impl__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3537:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3538:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3538:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3539:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_8__1__Impl7020); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__1__Impl


    // $ANTLR start rule__Class_Impl__Group_8__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3552:1: rule__Class_Impl__Group_8__2 : rule__Class_Impl__Group_8__2__Impl rule__Class_Impl__Group_8__3 ;
    public final void rule__Class_Impl__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3556:1: ( rule__Class_Impl__Group_8__2__Impl rule__Class_Impl__Group_8__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3557:2: rule__Class_Impl__Group_8__2__Impl rule__Class_Impl__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__2__Impl_in_rule__Class_Impl__Group_8__27051);
            rule__Class_Impl__Group_8__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__3_in_rule__Class_Impl__Group_8__27054);
            rule__Class_Impl__Group_8__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__2


    // $ANTLR start rule__Class_Impl__Group_8__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3564:1: rule__Class_Impl__Group_8__2__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_8_2 ) ) ;
    public final void rule__Class_Impl__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3568:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_8_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3569:1: ( ( rule__Class_Impl__NestedClassifierAssignment_8_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3569:1: ( ( rule__Class_Impl__NestedClassifierAssignment_8_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3570:1: ( rule__Class_Impl__NestedClassifierAssignment_8_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_8_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3571:1: ( rule__Class_Impl__NestedClassifierAssignment_8_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3571:2: rule__Class_Impl__NestedClassifierAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_8_2_in_rule__Class_Impl__Group_8__2__Impl7081);
            rule__Class_Impl__NestedClassifierAssignment_8_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__2__Impl


    // $ANTLR start rule__Class_Impl__Group_8__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3581:1: rule__Class_Impl__Group_8__3 : rule__Class_Impl__Group_8__3__Impl rule__Class_Impl__Group_8__4 ;
    public final void rule__Class_Impl__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3585:1: ( rule__Class_Impl__Group_8__3__Impl rule__Class_Impl__Group_8__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3586:2: rule__Class_Impl__Group_8__3__Impl rule__Class_Impl__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__3__Impl_in_rule__Class_Impl__Group_8__37111);
            rule__Class_Impl__Group_8__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__4_in_rule__Class_Impl__Group_8__37114);
            rule__Class_Impl__Group_8__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__3


    // $ANTLR start rule__Class_Impl__Group_8__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3593:1: rule__Class_Impl__Group_8__3__Impl : ( ( rule__Class_Impl__Group_8_3__0 )* ) ;
    public final void rule__Class_Impl__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3597:1: ( ( ( rule__Class_Impl__Group_8_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3598:1: ( ( rule__Class_Impl__Group_8_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3598:1: ( ( rule__Class_Impl__Group_8_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3599:1: ( rule__Class_Impl__Group_8_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_8_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3600:1: ( rule__Class_Impl__Group_8_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3600:2: rule__Class_Impl__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8_3__0_in_rule__Class_Impl__Group_8__3__Impl7141);
            	    rule__Class_Impl__Group_8_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__3__Impl


    // $ANTLR start rule__Class_Impl__Group_8__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3610:1: rule__Class_Impl__Group_8__4 : rule__Class_Impl__Group_8__4__Impl ;
    public final void rule__Class_Impl__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3614:1: ( rule__Class_Impl__Group_8__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3615:2: rule__Class_Impl__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8__4__Impl_in_rule__Class_Impl__Group_8__47172);
            rule__Class_Impl__Group_8__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__4


    // $ANTLR start rule__Class_Impl__Group_8__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3621:1: rule__Class_Impl__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3625:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3626:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3626:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3627:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Class_Impl__Group_8__4__Impl7200); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8__4__Impl


    // $ANTLR start rule__Class_Impl__Group_8_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3650:1: rule__Class_Impl__Group_8_3__0 : rule__Class_Impl__Group_8_3__0__Impl rule__Class_Impl__Group_8_3__1 ;
    public final void rule__Class_Impl__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3654:1: ( rule__Class_Impl__Group_8_3__0__Impl rule__Class_Impl__Group_8_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3655:2: rule__Class_Impl__Group_8_3__0__Impl rule__Class_Impl__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8_3__0__Impl_in_rule__Class_Impl__Group_8_3__07241);
            rule__Class_Impl__Group_8_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8_3__1_in_rule__Class_Impl__Group_8_3__07244);
            rule__Class_Impl__Group_8_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8_3__0


    // $ANTLR start rule__Class_Impl__Group_8_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3662:1: rule__Class_Impl__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3666:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3667:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3667:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3668:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_8_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Class_Impl__Group_8_3__0__Impl7272); 
             after(grammarAccess.getClass_ImplAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_8_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3681:1: rule__Class_Impl__Group_8_3__1 : rule__Class_Impl__Group_8_3__1__Impl ;
    public final void rule__Class_Impl__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3685:1: ( rule__Class_Impl__Group_8_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3686:2: rule__Class_Impl__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_8_3__1__Impl_in_rule__Class_Impl__Group_8_3__17303);
            rule__Class_Impl__Group_8_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8_3__1


    // $ANTLR start rule__Class_Impl__Group_8_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3692:1: rule__Class_Impl__Group_8_3__1__Impl : ( ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 ) ) ;
    public final void rule__Class_Impl__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3696:1: ( ( ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3697:1: ( ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3697:1: ( ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3698:1: ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_8_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3699:1: ( rule__Class_Impl__NestedClassifierAssignment_8_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3699:2: rule__Class_Impl__NestedClassifierAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__NestedClassifierAssignment_8_3_1_in_rule__Class_Impl__Group_8_3__1__Impl7330);
            rule__Class_Impl__NestedClassifierAssignment_8_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_8_3__1__Impl


    // $ANTLR start rule__Class_Impl__Group_9__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3713:1: rule__Class_Impl__Group_9__0 : rule__Class_Impl__Group_9__0__Impl rule__Class_Impl__Group_9__1 ;
    public final void rule__Class_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3717:1: ( rule__Class_Impl__Group_9__0__Impl rule__Class_Impl__Group_9__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3718:2: rule__Class_Impl__Group_9__0__Impl rule__Class_Impl__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__0__Impl_in_rule__Class_Impl__Group_9__07364);
            rule__Class_Impl__Group_9__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__1_in_rule__Class_Impl__Group_9__07367);
            rule__Class_Impl__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__0


    // $ANTLR start rule__Class_Impl__Group_9__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3725:1: rule__Class_Impl__Group_9__0__Impl : ( 'ownedOperation' ) ;
    public final void rule__Class_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3729:1: ( ( 'ownedOperation' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3730:1: ( 'ownedOperation' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3730:1: ( 'ownedOperation' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3731:1: 'ownedOperation'
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_9_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Class_Impl__Group_9__0__Impl7395); 
             after(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__0__Impl


    // $ANTLR start rule__Class_Impl__Group_9__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3744:1: rule__Class_Impl__Group_9__1 : rule__Class_Impl__Group_9__1__Impl rule__Class_Impl__Group_9__2 ;
    public final void rule__Class_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3748:1: ( rule__Class_Impl__Group_9__1__Impl rule__Class_Impl__Group_9__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3749:2: rule__Class_Impl__Group_9__1__Impl rule__Class_Impl__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__1__Impl_in_rule__Class_Impl__Group_9__17426);
            rule__Class_Impl__Group_9__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__2_in_rule__Class_Impl__Group_9__17429);
            rule__Class_Impl__Group_9__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__1


    // $ANTLR start rule__Class_Impl__Group_9__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3756:1: rule__Class_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Class_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3760:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3761:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3761:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3762:1: '{'
            {
             before(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Class_Impl__Group_9__1__Impl7457); 
             after(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__1__Impl


    // $ANTLR start rule__Class_Impl__Group_9__2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3775:1: rule__Class_Impl__Group_9__2 : rule__Class_Impl__Group_9__2__Impl rule__Class_Impl__Group_9__3 ;
    public final void rule__Class_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3779:1: ( rule__Class_Impl__Group_9__2__Impl rule__Class_Impl__Group_9__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3780:2: rule__Class_Impl__Group_9__2__Impl rule__Class_Impl__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__2__Impl_in_rule__Class_Impl__Group_9__27488);
            rule__Class_Impl__Group_9__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__3_in_rule__Class_Impl__Group_9__27491);
            rule__Class_Impl__Group_9__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__2


    // $ANTLR start rule__Class_Impl__Group_9__2__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3787:1: rule__Class_Impl__Group_9__2__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_9_2 ) ) ;
    public final void rule__Class_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3791:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_9_2 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3792:1: ( ( rule__Class_Impl__OwnedOperationAssignment_9_2 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3792:1: ( ( rule__Class_Impl__OwnedOperationAssignment_9_2 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3793:1: ( rule__Class_Impl__OwnedOperationAssignment_9_2 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_9_2()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3794:1: ( rule__Class_Impl__OwnedOperationAssignment_9_2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3794:2: rule__Class_Impl__OwnedOperationAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_9_2_in_rule__Class_Impl__Group_9__2__Impl7518);
            rule__Class_Impl__OwnedOperationAssignment_9_2();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__2__Impl


    // $ANTLR start rule__Class_Impl__Group_9__3
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3804:1: rule__Class_Impl__Group_9__3 : rule__Class_Impl__Group_9__3__Impl rule__Class_Impl__Group_9__4 ;
    public final void rule__Class_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3808:1: ( rule__Class_Impl__Group_9__3__Impl rule__Class_Impl__Group_9__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3809:2: rule__Class_Impl__Group_9__3__Impl rule__Class_Impl__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__3__Impl_in_rule__Class_Impl__Group_9__37548);
            rule__Class_Impl__Group_9__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__4_in_rule__Class_Impl__Group_9__37551);
            rule__Class_Impl__Group_9__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__3


    // $ANTLR start rule__Class_Impl__Group_9__3__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3816:1: rule__Class_Impl__Group_9__3__Impl : ( ( rule__Class_Impl__Group_9_3__0 )* ) ;
    public final void rule__Class_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3820:1: ( ( ( rule__Class_Impl__Group_9_3__0 )* ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3821:1: ( ( rule__Class_Impl__Group_9_3__0 )* )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3821:1: ( ( rule__Class_Impl__Group_9_3__0 )* )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3822:1: ( rule__Class_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getClass_ImplAccess().getGroup_9_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3823:1: ( rule__Class_Impl__Group_9_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3823:2: rule__Class_Impl__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9_3__0_in_rule__Class_Impl__Group_9__3__Impl7578);
            	    rule__Class_Impl__Group_9_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getClass_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__3__Impl


    // $ANTLR start rule__Class_Impl__Group_9__4
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3833:1: rule__Class_Impl__Group_9__4 : rule__Class_Impl__Group_9__4__Impl ;
    public final void rule__Class_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3837:1: ( rule__Class_Impl__Group_9__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3838:2: rule__Class_Impl__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9__4__Impl_in_rule__Class_Impl__Group_9__47609);
            rule__Class_Impl__Group_9__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__4


    // $ANTLR start rule__Class_Impl__Group_9__4__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3844:1: rule__Class_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Class_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3848:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3849:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3849:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3850:1: '}'
            {
             before(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Class_Impl__Group_9__4__Impl7637); 
             after(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9__4__Impl


    // $ANTLR start rule__Class_Impl__Group_9_3__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3873:1: rule__Class_Impl__Group_9_3__0 : rule__Class_Impl__Group_9_3__0__Impl rule__Class_Impl__Group_9_3__1 ;
    public final void rule__Class_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3877:1: ( rule__Class_Impl__Group_9_3__0__Impl rule__Class_Impl__Group_9_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3878:2: rule__Class_Impl__Group_9_3__0__Impl rule__Class_Impl__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9_3__0__Impl_in_rule__Class_Impl__Group_9_3__07678);
            rule__Class_Impl__Group_9_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9_3__1_in_rule__Class_Impl__Group_9_3__07681);
            rule__Class_Impl__Group_9_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9_3__0


    // $ANTLR start rule__Class_Impl__Group_9_3__0__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3885:1: rule__Class_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Class_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3889:1: ( ( ',' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3890:1: ( ',' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3890:1: ( ',' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3891:1: ','
            {
             before(grammarAccess.getClass_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Class_Impl__Group_9_3__0__Impl7709); 
             after(grammarAccess.getClass_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9_3__0__Impl


    // $ANTLR start rule__Class_Impl__Group_9_3__1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3904:1: rule__Class_Impl__Group_9_3__1 : rule__Class_Impl__Group_9_3__1__Impl ;
    public final void rule__Class_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3908:1: ( rule__Class_Impl__Group_9_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3909:2: rule__Class_Impl__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__Group_9_3__1__Impl_in_rule__Class_Impl__Group_9_3__17740);
            rule__Class_Impl__Group_9_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9_3__1


    // $ANTLR start rule__Class_Impl__Group_9_3__1__Impl
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3915:1: rule__Class_Impl__Group_9_3__1__Impl : ( ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 ) ) ;
    public final void rule__Class_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3919:1: ( ( ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3920:1: ( ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3920:1: ( ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3921:1: ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 )
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_9_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3922:1: ( rule__Class_Impl__OwnedOperationAssignment_9_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3922:2: rule__Class_Impl__OwnedOperationAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Class_Impl__OwnedOperationAssignment_9_3_1_in_rule__Class_Impl__Group_9_3__1__Impl7767);
            rule__Class_Impl__OwnedOperationAssignment_9_3_1();
            _fsp--;


            }

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__Group_9_3__1__Impl


    // $ANTLR start rule__LiteralInteger__Group__0
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3936:1: rule__LiteralInteger__Group__0 : rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 ;
    public final void rule__LiteralInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3940:1: ( rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3941:2: rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__07801);
            rule__LiteralInteger__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__07804);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3948:1: rule__LiteralInteger__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3952:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3953:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3953:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3954:1: ()
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3955:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3957:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3967:1: rule__LiteralInteger__Group__1 : rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 ;
    public final void rule__LiteralInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3971:1: ( rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3972:2: rule__LiteralInteger__Group__1__Impl rule__LiteralInteger__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__17862);
            rule__LiteralInteger__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__17865);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3979:1: rule__LiteralInteger__Group__1__Impl : ( 'LiteralInteger' ) ;
    public final void rule__LiteralInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3983:1: ( ( 'LiteralInteger' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3984:1: ( 'LiteralInteger' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3984:1: ( 'LiteralInteger' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3985:1: 'LiteralInteger'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__LiteralInteger__Group__1__Impl7893); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:3998:1: rule__LiteralInteger__Group__2 : rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 ;
    public final void rule__LiteralInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4002:1: ( rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4003:2: rule__LiteralInteger__Group__2__Impl rule__LiteralInteger__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__27924);
            rule__LiteralInteger__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__27927);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4010:1: rule__LiteralInteger__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4014:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4015:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4015:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4016:1: '{'
            {
             before(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralInteger__Group__2__Impl7955); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4029:1: rule__LiteralInteger__Group__3 : rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 ;
    public final void rule__LiteralInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4033:1: ( rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4034:2: rule__LiteralInteger__Group__3__Impl rule__LiteralInteger__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__37986);
            rule__LiteralInteger__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__37989);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4041:1: rule__LiteralInteger__Group__3__Impl : ( ( rule__LiteralInteger__Group_3__0 )? ) ;
    public final void rule__LiteralInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4045:1: ( ( ( rule__LiteralInteger__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4046:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4046:1: ( ( rule__LiteralInteger__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4047:1: ( rule__LiteralInteger__Group_3__0 )?
            {
             before(grammarAccess.getLiteralIntegerAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4048:1: ( rule__LiteralInteger__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4048:2: rule__LiteralInteger__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl8016);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4058:1: rule__LiteralInteger__Group__4 : rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 ;
    public final void rule__LiteralInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4062:1: ( rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4063:2: rule__LiteralInteger__Group__4__Impl rule__LiteralInteger__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__48047);
            rule__LiteralInteger__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__48050);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4070:1: rule__LiteralInteger__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4074:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4075:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4075:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4076:1: 'value'
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LiteralInteger__Group__4__Impl8078); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4089:1: rule__LiteralInteger__Group__5 : rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 ;
    public final void rule__LiteralInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4093:1: ( rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4094:2: rule__LiteralInteger__Group__5__Impl rule__LiteralInteger__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__58109);
            rule__LiteralInteger__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__58112);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4101:1: rule__LiteralInteger__Group__5__Impl : ( ( rule__LiteralInteger__ValueAssignment_5 ) ) ;
    public final void rule__LiteralInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4105:1: ( ( ( rule__LiteralInteger__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4106:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4106:1: ( ( rule__LiteralInteger__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4107:1: ( rule__LiteralInteger__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4108:1: ( rule__LiteralInteger__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4108:2: rule__LiteralInteger__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl8139);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4118:1: rule__LiteralInteger__Group__6 : rule__LiteralInteger__Group__6__Impl ;
    public final void rule__LiteralInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4122:1: ( rule__LiteralInteger__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4123:2: rule__LiteralInteger__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__68169);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4129:1: rule__LiteralInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4133:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4134:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4134:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4135:1: '}'
            {
             before(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LiteralInteger__Group__6__Impl8197); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4162:1: rule__LiteralInteger__Group_3__0 : rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 ;
    public final void rule__LiteralInteger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4166:1: ( rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4167:2: rule__LiteralInteger__Group_3__0__Impl rule__LiteralInteger__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__08242);
            rule__LiteralInteger__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__08245);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4174:1: rule__LiteralInteger__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralInteger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4178:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4179:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4179:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4180:1: 'name'
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LiteralInteger__Group_3__0__Impl8273); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4193:1: rule__LiteralInteger__Group_3__1 : rule__LiteralInteger__Group_3__1__Impl ;
    public final void rule__LiteralInteger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4197:1: ( rule__LiteralInteger__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4198:2: rule__LiteralInteger__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__18304);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4204:1: rule__LiteralInteger__Group_3__1__Impl : ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralInteger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4208:1: ( ( ( rule__LiteralInteger__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4209:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4209:1: ( ( rule__LiteralInteger__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4210:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4211:1: ( rule__LiteralInteger__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4211:2: rule__LiteralInteger__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl8331);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4225:1: rule__LiteralString__Group__0 : rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 ;
    public final void rule__LiteralString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4229:1: ( rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4230:2: rule__LiteralString__Group__0__Impl rule__LiteralString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__08365);
            rule__LiteralString__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__08368);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4237:1: rule__LiteralString__Group__0__Impl : ( () ) ;
    public final void rule__LiteralString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4241:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4242:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4242:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4243:1: ()
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4244:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4246:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4256:1: rule__LiteralString__Group__1 : rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 ;
    public final void rule__LiteralString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4260:1: ( rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4261:2: rule__LiteralString__Group__1__Impl rule__LiteralString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__18426);
            rule__LiteralString__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__18429);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4268:1: rule__LiteralString__Group__1__Impl : ( 'LiteralString' ) ;
    public final void rule__LiteralString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4272:1: ( ( 'LiteralString' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4273:1: ( 'LiteralString' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4273:1: ( 'LiteralString' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4274:1: 'LiteralString'
            {
             before(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__LiteralString__Group__1__Impl8457); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4287:1: rule__LiteralString__Group__2 : rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 ;
    public final void rule__LiteralString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4291:1: ( rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4292:2: rule__LiteralString__Group__2__Impl rule__LiteralString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__28488);
            rule__LiteralString__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__28491);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4299:1: rule__LiteralString__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4303:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4304:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4304:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4305:1: '{'
            {
             before(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralString__Group__2__Impl8519); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4318:1: rule__LiteralString__Group__3 : rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 ;
    public final void rule__LiteralString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4322:1: ( rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4323:2: rule__LiteralString__Group__3__Impl rule__LiteralString__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__38550);
            rule__LiteralString__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__38553);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4330:1: rule__LiteralString__Group__3__Impl : ( ( rule__LiteralString__Group_3__0 )? ) ;
    public final void rule__LiteralString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4334:1: ( ( ( rule__LiteralString__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4335:1: ( ( rule__LiteralString__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4335:1: ( ( rule__LiteralString__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4336:1: ( rule__LiteralString__Group_3__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4337:1: ( rule__LiteralString__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4337:2: rule__LiteralString__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl8580);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4347:1: rule__LiteralString__Group__4 : rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 ;
    public final void rule__LiteralString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4351:1: ( rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4352:2: rule__LiteralString__Group__4__Impl rule__LiteralString__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__48611);
            rule__LiteralString__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__48614);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4359:1: rule__LiteralString__Group__4__Impl : ( ( rule__LiteralString__Group_4__0 )? ) ;
    public final void rule__LiteralString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4363:1: ( ( ( rule__LiteralString__Group_4__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4364:1: ( ( rule__LiteralString__Group_4__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4364:1: ( ( rule__LiteralString__Group_4__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4365:1: ( rule__LiteralString__Group_4__0 )?
            {
             before(grammarAccess.getLiteralStringAccess().getGroup_4()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4366:1: ( rule__LiteralString__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4366:2: rule__LiteralString__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl8641);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4376:1: rule__LiteralString__Group__5 : rule__LiteralString__Group__5__Impl ;
    public final void rule__LiteralString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4380:1: ( rule__LiteralString__Group__5__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4381:2: rule__LiteralString__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__58672);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4387:1: rule__LiteralString__Group__5__Impl : ( '}' ) ;
    public final void rule__LiteralString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4391:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4392:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4392:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4393:1: '}'
            {
             before(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LiteralString__Group__5__Impl8700); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4418:1: rule__LiteralString__Group_3__0 : rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 ;
    public final void rule__LiteralString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4422:1: ( rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4423:2: rule__LiteralString__Group_3__0__Impl rule__LiteralString__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__08743);
            rule__LiteralString__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__08746);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4430:1: rule__LiteralString__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4434:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4435:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4435:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4436:1: 'name'
            {
             before(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LiteralString__Group_3__0__Impl8774); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4449:1: rule__LiteralString__Group_3__1 : rule__LiteralString__Group_3__1__Impl ;
    public final void rule__LiteralString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4453:1: ( rule__LiteralString__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4454:2: rule__LiteralString__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__18805);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4460:1: rule__LiteralString__Group_3__1__Impl : ( ( rule__LiteralString__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4464:1: ( ( ( rule__LiteralString__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4465:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4465:1: ( ( rule__LiteralString__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4466:1: ( rule__LiteralString__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4467:1: ( rule__LiteralString__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4467:2: rule__LiteralString__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl8832);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4481:1: rule__LiteralString__Group_4__0 : rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 ;
    public final void rule__LiteralString__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4485:1: ( rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4486:2: rule__LiteralString__Group_4__0__Impl rule__LiteralString__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__08866);
            rule__LiteralString__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__08869);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4493:1: rule__LiteralString__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__LiteralString__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4497:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4498:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4498:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4499:1: 'value'
            {
             before(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LiteralString__Group_4__0__Impl8897); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4512:1: rule__LiteralString__Group_4__1 : rule__LiteralString__Group_4__1__Impl ;
    public final void rule__LiteralString__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4516:1: ( rule__LiteralString__Group_4__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4517:2: rule__LiteralString__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__18928);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4523:1: rule__LiteralString__Group_4__1__Impl : ( ( rule__LiteralString__ValueAssignment_4_1 ) ) ;
    public final void rule__LiteralString__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4527:1: ( ( ( rule__LiteralString__ValueAssignment_4_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4528:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4528:1: ( ( rule__LiteralString__ValueAssignment_4_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4529:1: ( rule__LiteralString__ValueAssignment_4_1 )
            {
             before(grammarAccess.getLiteralStringAccess().getValueAssignment_4_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4530:1: ( rule__LiteralString__ValueAssignment_4_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4530:2: rule__LiteralString__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl8955);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4544:1: rule__LiteralBoolean__Group__0 : rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 ;
    public final void rule__LiteralBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4548:1: ( rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4549:2: rule__LiteralBoolean__Group__0__Impl rule__LiteralBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__08989);
            rule__LiteralBoolean__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__08992);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4556:1: rule__LiteralBoolean__Group__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4560:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4561:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4561:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4562:1: ()
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4563:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4565:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4575:1: rule__LiteralBoolean__Group__1 : rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 ;
    public final void rule__LiteralBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4579:1: ( rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4580:2: rule__LiteralBoolean__Group__1__Impl rule__LiteralBoolean__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__19050);
            rule__LiteralBoolean__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__19053);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4587:1: rule__LiteralBoolean__Group__1__Impl : ( 'LiteralBoolean' ) ;
    public final void rule__LiteralBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4591:1: ( ( 'LiteralBoolean' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4592:1: ( 'LiteralBoolean' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4592:1: ( 'LiteralBoolean' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4593:1: 'LiteralBoolean'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__LiteralBoolean__Group__1__Impl9081); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4606:1: rule__LiteralBoolean__Group__2 : rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 ;
    public final void rule__LiteralBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4610:1: ( rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4611:2: rule__LiteralBoolean__Group__2__Impl rule__LiteralBoolean__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__29112);
            rule__LiteralBoolean__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__29115);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4618:1: rule__LiteralBoolean__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4622:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4623:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4623:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4624:1: '{'
            {
             before(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralBoolean__Group__2__Impl9143); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4637:1: rule__LiteralBoolean__Group__3 : rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 ;
    public final void rule__LiteralBoolean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4641:1: ( rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4642:2: rule__LiteralBoolean__Group__3__Impl rule__LiteralBoolean__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__39174);
            rule__LiteralBoolean__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__39177);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4649:1: rule__LiteralBoolean__Group__3__Impl : ( ( rule__LiteralBoolean__Group_3__0 )? ) ;
    public final void rule__LiteralBoolean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4653:1: ( ( ( rule__LiteralBoolean__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4654:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4654:1: ( ( rule__LiteralBoolean__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4655:1: ( rule__LiteralBoolean__Group_3__0 )?
            {
             before(grammarAccess.getLiteralBooleanAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4656:1: ( rule__LiteralBoolean__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4656:2: rule__LiteralBoolean__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl9204);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4666:1: rule__LiteralBoolean__Group__4 : rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 ;
    public final void rule__LiteralBoolean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4670:1: ( rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4671:2: rule__LiteralBoolean__Group__4__Impl rule__LiteralBoolean__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__49235);
            rule__LiteralBoolean__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__49238);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4678:1: rule__LiteralBoolean__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralBoolean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4682:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4683:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4683:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4684:1: 'value'
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LiteralBoolean__Group__4__Impl9266); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4697:1: rule__LiteralBoolean__Group__5 : rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 ;
    public final void rule__LiteralBoolean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4701:1: ( rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4702:2: rule__LiteralBoolean__Group__5__Impl rule__LiteralBoolean__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__59297);
            rule__LiteralBoolean__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__59300);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4709:1: rule__LiteralBoolean__Group__5__Impl : ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) ;
    public final void rule__LiteralBoolean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4713:1: ( ( ( rule__LiteralBoolean__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4714:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4714:1: ( ( rule__LiteralBoolean__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4715:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4716:1: ( rule__LiteralBoolean__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4716:2: rule__LiteralBoolean__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl9327);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4726:1: rule__LiteralBoolean__Group__6 : rule__LiteralBoolean__Group__6__Impl ;
    public final void rule__LiteralBoolean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4730:1: ( rule__LiteralBoolean__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4731:2: rule__LiteralBoolean__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__69357);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4737:1: rule__LiteralBoolean__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralBoolean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4741:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4742:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4742:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4743:1: '}'
            {
             before(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LiteralBoolean__Group__6__Impl9385); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4770:1: rule__LiteralBoolean__Group_3__0 : rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 ;
    public final void rule__LiteralBoolean__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4774:1: ( rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4775:2: rule__LiteralBoolean__Group_3__0__Impl rule__LiteralBoolean__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__09430);
            rule__LiteralBoolean__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__09433);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4782:1: rule__LiteralBoolean__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralBoolean__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4786:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4787:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4787:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4788:1: 'name'
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LiteralBoolean__Group_3__0__Impl9461); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4801:1: rule__LiteralBoolean__Group_3__1 : rule__LiteralBoolean__Group_3__1__Impl ;
    public final void rule__LiteralBoolean__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4805:1: ( rule__LiteralBoolean__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4806:2: rule__LiteralBoolean__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__19492);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4812:1: rule__LiteralBoolean__Group_3__1__Impl : ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralBoolean__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4816:1: ( ( ( rule__LiteralBoolean__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4817:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4817:1: ( ( rule__LiteralBoolean__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4818:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4819:1: ( rule__LiteralBoolean__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4819:2: rule__LiteralBoolean__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl9519);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4833:1: rule__LiteralUnlimitedNatural__Group__0 : rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 ;
    public final void rule__LiteralUnlimitedNatural__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4837:1: ( rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4838:2: rule__LiteralUnlimitedNatural__Group__0__Impl rule__LiteralUnlimitedNatural__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__09553);
            rule__LiteralUnlimitedNatural__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__09556);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4845:1: rule__LiteralUnlimitedNatural__Group__0__Impl : ( () ) ;
    public final void rule__LiteralUnlimitedNatural__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4849:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4850:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4850:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4851:1: ()
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4852:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4854:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4864:1: rule__LiteralUnlimitedNatural__Group__1 : rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 ;
    public final void rule__LiteralUnlimitedNatural__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4868:1: ( rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4869:2: rule__LiteralUnlimitedNatural__Group__1__Impl rule__LiteralUnlimitedNatural__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__19614);
            rule__LiteralUnlimitedNatural__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__19617);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4876:1: rule__LiteralUnlimitedNatural__Group__1__Impl : ( 'LiteralUnlimitedNatural' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4880:1: ( ( 'LiteralUnlimitedNatural' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4881:1: ( 'LiteralUnlimitedNatural' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4881:1: ( 'LiteralUnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4882:1: 'LiteralUnlimitedNatural'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__LiteralUnlimitedNatural__Group__1__Impl9645); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4895:1: rule__LiteralUnlimitedNatural__Group__2 : rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 ;
    public final void rule__LiteralUnlimitedNatural__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4899:1: ( rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4900:2: rule__LiteralUnlimitedNatural__Group__2__Impl rule__LiteralUnlimitedNatural__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__29676);
            rule__LiteralUnlimitedNatural__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__29679);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4907:1: rule__LiteralUnlimitedNatural__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4911:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4912:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4912:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4913:1: '{'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralUnlimitedNatural__Group__2__Impl9707); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4926:1: rule__LiteralUnlimitedNatural__Group__3 : rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 ;
    public final void rule__LiteralUnlimitedNatural__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4930:1: ( rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4931:2: rule__LiteralUnlimitedNatural__Group__3__Impl rule__LiteralUnlimitedNatural__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__39738);
            rule__LiteralUnlimitedNatural__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__39741);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4938:1: rule__LiteralUnlimitedNatural__Group__3__Impl : ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) ;
    public final void rule__LiteralUnlimitedNatural__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4942:1: ( ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4943:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4943:1: ( ( rule__LiteralUnlimitedNatural__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4944:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4945:1: ( rule__LiteralUnlimitedNatural__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4945:2: rule__LiteralUnlimitedNatural__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl9768);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4955:1: rule__LiteralUnlimitedNatural__Group__4 : rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 ;
    public final void rule__LiteralUnlimitedNatural__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4959:1: ( rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4960:2: rule__LiteralUnlimitedNatural__Group__4__Impl rule__LiteralUnlimitedNatural__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__49799);
            rule__LiteralUnlimitedNatural__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__49802);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4967:1: rule__LiteralUnlimitedNatural__Group__4__Impl : ( 'value' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4971:1: ( ( 'value' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4972:1: ( 'value' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4972:1: ( 'value' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4973:1: 'value'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__LiteralUnlimitedNatural__Group__4__Impl9830); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4986:1: rule__LiteralUnlimitedNatural__Group__5 : rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 ;
    public final void rule__LiteralUnlimitedNatural__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4990:1: ( rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4991:2: rule__LiteralUnlimitedNatural__Group__5__Impl rule__LiteralUnlimitedNatural__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__59861);
            rule__LiteralUnlimitedNatural__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__59864);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:4998:1: rule__LiteralUnlimitedNatural__Group__5__Impl : ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5002:1: ( ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5003:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5003:1: ( ( rule__LiteralUnlimitedNatural__ValueAssignment_5 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5004:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueAssignment_5()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5005:1: ( rule__LiteralUnlimitedNatural__ValueAssignment_5 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5005:2: rule__LiteralUnlimitedNatural__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl9891);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5015:1: rule__LiteralUnlimitedNatural__Group__6 : rule__LiteralUnlimitedNatural__Group__6__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5019:1: ( rule__LiteralUnlimitedNatural__Group__6__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5020:2: rule__LiteralUnlimitedNatural__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__69921);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5026:1: rule__LiteralUnlimitedNatural__Group__6__Impl : ( '}' ) ;
    public final void rule__LiteralUnlimitedNatural__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5030:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5031:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5031:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5032:1: '}'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LiteralUnlimitedNatural__Group__6__Impl9949); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5059:1: rule__LiteralUnlimitedNatural__Group_3__0 : rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5063:1: ( rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5064:2: rule__LiteralUnlimitedNatural__Group_3__0__Impl rule__LiteralUnlimitedNatural__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__09994);
            rule__LiteralUnlimitedNatural__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__09997);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5071:1: rule__LiteralUnlimitedNatural__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5075:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5076:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5076:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5077:1: 'name'
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl10025); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5090:1: rule__LiteralUnlimitedNatural__Group_3__1 : rule__LiteralUnlimitedNatural__Group_3__1__Impl ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5094:1: ( rule__LiteralUnlimitedNatural__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5095:2: rule__LiteralUnlimitedNatural__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__110056);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5101:1: rule__LiteralUnlimitedNatural__Group_3__1__Impl : ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralUnlimitedNatural__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5105:1: ( ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5106:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5106:1: ( ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5107:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5108:1: ( rule__LiteralUnlimitedNatural__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5108:2: rule__LiteralUnlimitedNatural__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl10083);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5122:1: rule__LiteralNull__Group__0 : rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 ;
    public final void rule__LiteralNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5126:1: ( rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5127:2: rule__LiteralNull__Group__0__Impl rule__LiteralNull__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__010117);
            rule__LiteralNull__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__010120);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5134:1: rule__LiteralNull__Group__0__Impl : ( () ) ;
    public final void rule__LiteralNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5138:1: ( ( () ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5139:1: ( () )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5139:1: ( () )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5140:1: ()
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5141:1: ()
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5143:1: 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5153:1: rule__LiteralNull__Group__1 : rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 ;
    public final void rule__LiteralNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5157:1: ( rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5158:2: rule__LiteralNull__Group__1__Impl rule__LiteralNull__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__110178);
            rule__LiteralNull__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__110181);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5165:1: rule__LiteralNull__Group__1__Impl : ( 'LiteralNull' ) ;
    public final void rule__LiteralNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5169:1: ( ( 'LiteralNull' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5170:1: ( 'LiteralNull' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5170:1: ( 'LiteralNull' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5171:1: 'LiteralNull'
            {
             before(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__LiteralNull__Group__1__Impl10209); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5184:1: rule__LiteralNull__Group__2 : rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 ;
    public final void rule__LiteralNull__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5188:1: ( rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5189:2: rule__LiteralNull__Group__2__Impl rule__LiteralNull__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__210240);
            rule__LiteralNull__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__210243);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5196:1: rule__LiteralNull__Group__2__Impl : ( '{' ) ;
    public final void rule__LiteralNull__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5200:1: ( ( '{' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5201:1: ( '{' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5201:1: ( '{' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5202:1: '{'
            {
             before(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LiteralNull__Group__2__Impl10271); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5215:1: rule__LiteralNull__Group__3 : rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 ;
    public final void rule__LiteralNull__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5219:1: ( rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5220:2: rule__LiteralNull__Group__3__Impl rule__LiteralNull__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__310302);
            rule__LiteralNull__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__310305);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5227:1: rule__LiteralNull__Group__3__Impl : ( ( rule__LiteralNull__Group_3__0 )? ) ;
    public final void rule__LiteralNull__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5231:1: ( ( ( rule__LiteralNull__Group_3__0 )? ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5232:1: ( ( rule__LiteralNull__Group_3__0 )? )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5232:1: ( ( rule__LiteralNull__Group_3__0 )? )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5233:1: ( rule__LiteralNull__Group_3__0 )?
            {
             before(grammarAccess.getLiteralNullAccess().getGroup_3()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5234:1: ( rule__LiteralNull__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5234:2: rule__LiteralNull__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl10332);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5244:1: rule__LiteralNull__Group__4 : rule__LiteralNull__Group__4__Impl ;
    public final void rule__LiteralNull__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5248:1: ( rule__LiteralNull__Group__4__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5249:2: rule__LiteralNull__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__410363);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5255:1: rule__LiteralNull__Group__4__Impl : ( '}' ) ;
    public final void rule__LiteralNull__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5259:1: ( ( '}' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5260:1: ( '}' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5260:1: ( '}' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5261:1: '}'
            {
             before(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__LiteralNull__Group__4__Impl10391); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5284:1: rule__LiteralNull__Group_3__0 : rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 ;
    public final void rule__LiteralNull__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5288:1: ( rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5289:2: rule__LiteralNull__Group_3__0__Impl rule__LiteralNull__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__010432);
            rule__LiteralNull__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__010435);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5296:1: rule__LiteralNull__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__LiteralNull__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5300:1: ( ( 'name' ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5301:1: ( 'name' )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5301:1: ( 'name' )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5302:1: 'name'
            {
             before(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LiteralNull__Group_3__0__Impl10463); 
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5315:1: rule__LiteralNull__Group_3__1 : rule__LiteralNull__Group_3__1__Impl ;
    public final void rule__LiteralNull__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5319:1: ( rule__LiteralNull__Group_3__1__Impl )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5320:2: rule__LiteralNull__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__110494);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5326:1: rule__LiteralNull__Group_3__1__Impl : ( ( rule__LiteralNull__NameAssignment_3_1 ) ) ;
    public final void rule__LiteralNull__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5330:1: ( ( ( rule__LiteralNull__NameAssignment_3_1 ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5331:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5331:1: ( ( rule__LiteralNull__NameAssignment_3_1 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5332:1: ( rule__LiteralNull__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralNullAccess().getNameAssignment_3_1()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5333:1: ( rule__LiteralNull__NameAssignment_3_1 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5333:2: rule__LiteralNull__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl10521);
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


    // $ANTLR start rule__Model__PackagedElementAssignment_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5348:1: rule__Model__PackagedElementAssignment_2 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5352:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5353:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5353:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5354:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_210560);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PackagedElementAssignment_2


    // $ANTLR start rule__Model__PackagedElementAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5363:1: rule__Model__PackagedElementAssignment_3_1 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5367:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5368:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5368:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5369:1: rulePackageableElement
            {
             before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_3_110591);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PackagedElementAssignment_3_1


    // $ANTLR start rule__Package_Impl__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5378:1: rule__Package_Impl__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Package_Impl__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5382:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5383:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5383:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5384:1: ruleString0
            {
             before(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_3_110622);
            ruleString0();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__NameAssignment_3_1


    // $ANTLR start rule__Package_Impl__VisibilityAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5393:1: rule__Package_Impl__VisibilityAssignment_4_1 : ( ruleVisibilityKind ) ;
    public final void rule__Package_Impl__VisibilityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5397:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5398:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5398:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5399:1: ruleVisibilityKind
            {
             before(grammarAccess.getPackage_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Package_Impl__VisibilityAssignment_4_110653);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__VisibilityAssignment_4_1


    // $ANTLR start rule__Package_Impl__PackagedElementAssignment_5_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5408:1: rule__Package_Impl__PackagedElementAssignment_5_2 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5412:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5413:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5413:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5414:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_5_210684);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__PackagedElementAssignment_5_2


    // $ANTLR start rule__Package_Impl__PackagedElementAssignment_5_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5423:1: rule__Package_Impl__PackagedElementAssignment_5_3_1 : ( rulePackageableElement ) ;
    public final void rule__Package_Impl__PackagedElementAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5427:1: ( ( rulePackageableElement ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5428:1: ( rulePackageableElement )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5428:1: ( rulePackageableElement )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5429:1: rulePackageableElement
            {
             before(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_5_3_110715);
            rulePackageableElement();
            _fsp--;

             after(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Package_Impl__PackagedElementAssignment_5_3_1


    // $ANTLR start rule__Property_Impl__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5438:1: rule__Property_Impl__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Property_Impl__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5442:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5443:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5443:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5444:1: ruleString0
            {
             before(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_3_110746);
            ruleString0();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__NameAssignment_3_1


    // $ANTLR start rule__Property_Impl__VisibilityAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5453:1: rule__Property_Impl__VisibilityAssignment_4_1 : ( ruleVisibilityKind ) ;
    public final void rule__Property_Impl__VisibilityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5457:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5458:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5458:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5459:1: ruleVisibilityKind
            {
             before(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Property_Impl__VisibilityAssignment_4_110777);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__VisibilityAssignment_4_1


    // $ANTLR start rule__Property_Impl__IsStaticAssignment_5_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5468:1: rule__Property_Impl__IsStaticAssignment_5_1 : ( ruleBoolean ) ;
    public final void rule__Property_Impl__IsStaticAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5472:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5473:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5473:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5474:1: ruleBoolean
            {
             before(grammarAccess.getProperty_ImplAccess().getIsStaticBooleanParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Property_Impl__IsStaticAssignment_5_110808);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getIsStaticBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__IsStaticAssignment_5_1


    // $ANTLR start rule__Property_Impl__TypeAssignment_6_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5483:1: rule__Property_Impl__TypeAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Property_Impl__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5487:1: ( ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5488:1: ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5488:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5489:1: ( ruleEString )
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_6_1_0()); 
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5490:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5491:1: ruleEString
            {
             before(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_6_110843);
            ruleEString();
            _fsp--;

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property_Impl__TypeAssignment_6_1


    // $ANTLR start rule__Operation__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5502:1: rule__Operation__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Operation__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5506:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5507:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5507:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5508:1: ruleString0
            {
             before(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Operation__NameAssignment_3_110878);
            ruleString0();
            _fsp--;

             after(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__NameAssignment_3_1


    // $ANTLR start rule__Operation__VisibilityAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5517:1: rule__Operation__VisibilityAssignment_4_1 : ( ruleVisibilityKind ) ;
    public final void rule__Operation__VisibilityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5521:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5522:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5522:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5523:1: ruleVisibilityKind
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Operation__VisibilityAssignment_4_110909);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__VisibilityAssignment_4_1


    // $ANTLR start rule__Operation__IsStaticAssignment_5_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5532:1: rule__Operation__IsStaticAssignment_5_1 : ( ruleBoolean ) ;
    public final void rule__Operation__IsStaticAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5536:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5537:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5537:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5538:1: ruleBoolean
            {
             before(grammarAccess.getOperationAccess().getIsStaticBooleanParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Operation__IsStaticAssignment_5_110940);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getOperationAccess().getIsStaticBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__IsStaticAssignment_5_1


    // $ANTLR start rule__Operation__IsAbstractAssignment_6_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5547:1: rule__Operation__IsAbstractAssignment_6_1 : ( ruleBoolean ) ;
    public final void rule__Operation__IsAbstractAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5551:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5552:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5552:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5553:1: ruleBoolean
            {
             before(grammarAccess.getOperationAccess().getIsAbstractBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Operation__IsAbstractAssignment_6_110971);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getOperationAccess().getIsAbstractBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__IsAbstractAssignment_6_1


    // $ANTLR start rule__Operation__ConcurrencyAssignment_7_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5562:1: rule__Operation__ConcurrencyAssignment_7_1 : ( ruleCallConcurrencyKind ) ;
    public final void rule__Operation__ConcurrencyAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5566:1: ( ( ruleCallConcurrencyKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5567:1: ( ruleCallConcurrencyKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5567:1: ( ruleCallConcurrencyKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5568:1: ruleCallConcurrencyKind
            {
             before(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCallConcurrencyKind_in_rule__Operation__ConcurrencyAssignment_7_111002);
            ruleCallConcurrencyKind();
            _fsp--;

             after(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__ConcurrencyAssignment_7_1


    // $ANTLR start rule__Class_Impl__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5577:1: rule__Class_Impl__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Class_Impl__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5581:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5582:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5582:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5583:1: ruleString0
            {
             before(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_3_111033);
            ruleString0();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NameAssignment_3_1


    // $ANTLR start rule__Class_Impl__VisibilityAssignment_4_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5592:1: rule__Class_Impl__VisibilityAssignment_4_1 : ( ruleVisibilityKind ) ;
    public final void rule__Class_Impl__VisibilityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5596:1: ( ( ruleVisibilityKind ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5597:1: ( ruleVisibilityKind )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5597:1: ( ruleVisibilityKind )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5598:1: ruleVisibilityKind
            {
             before(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rule__Class_Impl__VisibilityAssignment_4_111064);
            ruleVisibilityKind();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__VisibilityAssignment_4_1


    // $ANTLR start rule__Class_Impl__IsAbstractAssignment_5_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5607:1: rule__Class_Impl__IsAbstractAssignment_5_1 : ( ruleBoolean ) ;
    public final void rule__Class_Impl__IsAbstractAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5611:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5612:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5612:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5613:1: ruleBoolean
            {
             before(grammarAccess.getClass_ImplAccess().getIsAbstractBooleanParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Class_Impl__IsAbstractAssignment_5_111095);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getIsAbstractBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__IsAbstractAssignment_5_1


    // $ANTLR start rule__Class_Impl__IsActiveAssignment_6_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5622:1: rule__Class_Impl__IsActiveAssignment_6_1 : ( ruleBoolean ) ;
    public final void rule__Class_Impl__IsActiveAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5626:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5627:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5627:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5628:1: ruleBoolean
            {
             before(grammarAccess.getClass_ImplAccess().getIsActiveBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__Class_Impl__IsActiveAssignment_6_111126);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getIsActiveBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__IsActiveAssignment_6_1


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_7_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5637:1: rule__Class_Impl__OwnedAttributeAssignment_7_2 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5641:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5642:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5642:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5643:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_7_211157);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_7_2


    // $ANTLR start rule__Class_Impl__OwnedAttributeAssignment_7_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5652:1: rule__Class_Impl__OwnedAttributeAssignment_7_3_1 : ( ruleProperty ) ;
    public final void rule__Class_Impl__OwnedAttributeAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5656:1: ( ( ruleProperty ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5657:1: ( ruleProperty )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5657:1: ( ruleProperty )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5658:1: ruleProperty
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_7_3_111188);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedAttributeAssignment_7_3_1


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_8_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5667:1: rule__Class_Impl__NestedClassifierAssignment_8_2 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5671:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5672:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5672:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5673:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_8_211219);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_8_2


    // $ANTLR start rule__Class_Impl__NestedClassifierAssignment_8_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5682:1: rule__Class_Impl__NestedClassifierAssignment_8_3_1 : ( ruleClassifier ) ;
    public final void rule__Class_Impl__NestedClassifierAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5686:1: ( ( ruleClassifier ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5687:1: ( ruleClassifier )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5687:1: ( ruleClassifier )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5688:1: ruleClassifier
            {
             before(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_8_3_111250);
            ruleClassifier();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__NestedClassifierAssignment_8_3_1


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_9_2
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5697:1: rule__Class_Impl__OwnedOperationAssignment_9_2 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5701:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5702:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5702:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5703:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_9_211281);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_9_2


    // $ANTLR start rule__Class_Impl__OwnedOperationAssignment_9_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5712:1: rule__Class_Impl__OwnedOperationAssignment_9_3_1 : ( ruleOperation ) ;
    public final void rule__Class_Impl__OwnedOperationAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5716:1: ( ( ruleOperation ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5717:1: ( ruleOperation )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5717:1: ( ruleOperation )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5718:1: ruleOperation
            {
             before(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_9_3_111312);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Class_Impl__OwnedOperationAssignment_9_3_1


    // $ANTLR start rule__LiteralInteger__NameAssignment_3_1
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5727:1: rule__LiteralInteger__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralInteger__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5731:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5732:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5732:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5733:1: ruleString0
            {
             before(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_111343);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5742:1: rule__LiteralInteger__ValueAssignment_5 : ( ruleInteger ) ;
    public final void rule__LiteralInteger__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5746:1: ( ( ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5747:1: ( ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5747:1: ( ruleInteger )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5748:1: ruleInteger
            {
             before(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_511374);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5757:1: rule__LiteralString__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5761:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5762:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5762:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5763:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_111405);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5772:1: rule__LiteralString__ValueAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__LiteralString__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5776:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5777:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5777:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5778:1: ruleString0
            {
             before(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_111436);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5787:1: rule__LiteralBoolean__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralBoolean__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5791:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5792:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5792:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5793:1: ruleString0
            {
             before(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_111467);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5802:1: rule__LiteralBoolean__ValueAssignment_5 : ( ruleBoolean ) ;
    public final void rule__LiteralBoolean__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5806:1: ( ( ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5807:1: ( ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5807:1: ( ruleBoolean )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5808:1: ruleBoolean
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_511498);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5817:1: rule__LiteralUnlimitedNatural__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralUnlimitedNatural__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5821:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5822:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5822:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5823:1: ruleString0
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_111529);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5832:1: rule__LiteralUnlimitedNatural__ValueAssignment_5 : ( ruleUnlimitedNatural ) ;
    public final void rule__LiteralUnlimitedNatural__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5836:1: ( ( ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5837:1: ( ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5837:1: ( ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5838:1: ruleUnlimitedNatural
            {
             before(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_511560);
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
    // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5847:1: rule__LiteralNull__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__LiteralNull__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5851:1: ( ( ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5852:1: ( ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5852:1: ( ruleString0 )
            // ../ro.ubbcluj.cs.ealf.ui/src-gen/ro/ubbcluj/cs/ealf/ui/contentassist/antlr/internal/InternalEAlf.g:5853:1: ruleString0
            {
             before(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_111591);
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
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01566 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Model__Group__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11628 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Model__Group__1__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21690 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_2_in_rule__Model__Group__2__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31750 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1780 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Model__Group__4__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01880 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Model__Group_3__0__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__PackagedElementAssignment_3_1_in_rule__Model__Group_3__1__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__0__Impl_in_rule__Package_Impl__Group__02003 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1_in_rule__Package_Impl__Group__02006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__1__Impl_in_rule__Package_Impl__Group__12064 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2_in_rule__Package_Impl__Group__12067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package_Impl__Group__1__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__2__Impl_in_rule__Package_Impl__Group__22126 = new BitSet(new long[]{0x000000000CA00000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3_in_rule__Package_Impl__Group__22129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package_Impl__Group__2__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__3__Impl_in_rule__Package_Impl__Group__32188 = new BitSet(new long[]{0x0000000008A00000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4_in_rule__Package_Impl__Group__32191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_3__0_in_rule__Package_Impl__Group__3__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__4__Impl_in_rule__Package_Impl__Group__42249 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5_in_rule__Package_Impl__Group__42252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0_in_rule__Package_Impl__Group__4__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__5__Impl_in_rule__Package_Impl__Group__52310 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__6_in_rule__Package_Impl__Group__52313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__0_in_rule__Package_Impl__Group__5__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group__6__Impl_in_rule__Package_Impl__Group__62371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package_Impl__Group__6__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_3__0__Impl_in_rule__Package_Impl__Group_3__02444 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_3__1_in_rule__Package_Impl__Group_3__02447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package_Impl__Group_3__0__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_3__1__Impl_in_rule__Package_Impl__Group_3__12506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__NameAssignment_3_1_in_rule__Package_Impl__Group_3__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__0__Impl_in_rule__Package_Impl__Group_4__02567 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1_in_rule__Package_Impl__Group_4__02570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Package_Impl__Group_4__0__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_4__1__Impl_in_rule__Package_Impl__Group_4__12629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__VisibilityAssignment_4_1_in_rule__Package_Impl__Group_4__1__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__0__Impl_in_rule__Package_Impl__Group_5__02690 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__1_in_rule__Package_Impl__Group_5__02693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package_Impl__Group_5__0__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__1__Impl_in_rule__Package_Impl__Group_5__12752 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__2_in_rule__Package_Impl__Group_5__12755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package_Impl__Group_5__1__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__2__Impl_in_rule__Package_Impl__Group_5__22814 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__3_in_rule__Package_Impl__Group_5__22817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_5_2_in_rule__Package_Impl__Group_5__2__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__3__Impl_in_rule__Package_Impl__Group_5__32874 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__4_in_rule__Package_Impl__Group_5__32877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5_3__0_in_rule__Package_Impl__Group_5__3__Impl2904 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5__4__Impl_in_rule__Package_Impl__Group_5__42935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package_Impl__Group_5__4__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5_3__0__Impl_in_rule__Package_Impl__Group_5_3__03004 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5_3__1_in_rule__Package_Impl__Group_5_3__03007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package_Impl__Group_5_3__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__Group_5_3__1__Impl_in_rule__Package_Impl__Group_5_3__13066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package_Impl__PackagedElementAssignment_5_3_1_in_rule__Package_Impl__Group_5_3__1__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__0__Impl_in_rule__Property_Impl__Group__03127 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1_in_rule__Property_Impl__Group__03130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__1__Impl_in_rule__Property_Impl__Group__13188 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2_in_rule__Property_Impl__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property_Impl__Group__1__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__2__Impl_in_rule__Property_Impl__Group__23250 = new BitSet(new long[]{0x000000006C800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3_in_rule__Property_Impl__Group__23253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Property_Impl__Group__2__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__3__Impl_in_rule__Property_Impl__Group__33312 = new BitSet(new long[]{0x0000000068800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4_in_rule__Property_Impl__Group__33315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__0_in_rule__Property_Impl__Group__3__Impl3342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__4__Impl_in_rule__Property_Impl__Group__43373 = new BitSet(new long[]{0x0000000060800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__5_in_rule__Property_Impl__Group__43376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_4__0_in_rule__Property_Impl__Group__4__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__5__Impl_in_rule__Property_Impl__Group__53434 = new BitSet(new long[]{0x0000000040800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__6_in_rule__Property_Impl__Group__53437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_5__0_in_rule__Property_Impl__Group__5__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__6__Impl_in_rule__Property_Impl__Group__63495 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__7_in_rule__Property_Impl__Group__63498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_6__0_in_rule__Property_Impl__Group__6__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group__7__Impl_in_rule__Property_Impl__Group__73556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Property_Impl__Group__7__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__0__Impl_in_rule__Property_Impl__Group_3__03631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__1_in_rule__Property_Impl__Group_3__03634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Property_Impl__Group_3__0__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_3__1__Impl_in_rule__Property_Impl__Group_3__13693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__NameAssignment_3_1_in_rule__Property_Impl__Group_3__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_4__0__Impl_in_rule__Property_Impl__Group_4__03754 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_4__1_in_rule__Property_Impl__Group_4__03757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Property_Impl__Group_4__0__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_4__1__Impl_in_rule__Property_Impl__Group_4__13816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__VisibilityAssignment_4_1_in_rule__Property_Impl__Group_4__1__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_5__0__Impl_in_rule__Property_Impl__Group_5__03877 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_5__1_in_rule__Property_Impl__Group_5__03880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property_Impl__Group_5__0__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_5__1__Impl_in_rule__Property_Impl__Group_5__13939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__IsStaticAssignment_5_1_in_rule__Property_Impl__Group_5__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_6__0__Impl_in_rule__Property_Impl__Group_6__04000 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_6__1_in_rule__Property_Impl__Group_6__04003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Property_Impl__Group_6__0__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__Group_6__1__Impl_in_rule__Property_Impl__Group_6__14062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property_Impl__TypeAssignment_6_1_in_rule__Property_Impl__Group_6__1__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__04123 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__04126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__14184 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__14187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Operation__Group__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__24246 = new BitSet(new long[]{0x000000032C800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__24249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__2__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__34308 = new BitSet(new long[]{0x0000000328800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__34311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44369 = new BitSet(new long[]{0x0000000320800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54430 = new BitSet(new long[]{0x0000000300800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64491 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__64494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_6__0_in_rule__Operation__Group__6__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__74552 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Operation__Group__8_in_rule__Operation__Group__74555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_7__0_in_rule__Operation__Group__7__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__8__Impl_in_rule__Operation__Group__84613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Operation__Group__8__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__04690 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__04693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Operation__Group_3__0__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__14752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_3_1_in_rule__Operation__Group_3__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__04813 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__04816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Operation__Group_4__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__14875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_4_1_in_rule__Operation__Group_4__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__04936 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__04939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Operation__Group_5__0__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__14998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__IsStaticAssignment_5_1_in_rule__Operation__Group_5__1__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_6__0__Impl_in_rule__Operation__Group_6__05059 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Operation__Group_6__1_in_rule__Operation__Group_6__05062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Operation__Group_6__0__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_6__1__Impl_in_rule__Operation__Group_6__15121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__IsAbstractAssignment_6_1_in_rule__Operation__Group_6__1__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_7__0__Impl_in_rule__Operation__Group_7__05182 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Operation__Group_7__1_in_rule__Operation__Group_7__05185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Operation__Group_7__0__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_7__1__Impl_in_rule__Operation__Group_7__15244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ConcurrencyAssignment_7_1_in_rule__Operation__Group_7__1__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__0__Impl_in_rule__Class_Impl__Group__05305 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1_in_rule__Class_Impl__Group__05308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__1__Impl_in_rule__Class_Impl__Group__15366 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2_in_rule__Class_Impl__Group__15369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Class_Impl__Group__1__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__2__Impl_in_rule__Class_Impl__Group__25428 = new BitSet(new long[]{0x000000790C800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3_in_rule__Class_Impl__Group__25431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group__2__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__3__Impl_in_rule__Class_Impl__Group__35490 = new BitSet(new long[]{0x0000007908800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4_in_rule__Class_Impl__Group__35493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_3__0_in_rule__Class_Impl__Group__3__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__4__Impl_in_rule__Class_Impl__Group__45551 = new BitSet(new long[]{0x0000007900800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5_in_rule__Class_Impl__Group__45554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0_in_rule__Class_Impl__Group__4__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__5__Impl_in_rule__Class_Impl__Group__55612 = new BitSet(new long[]{0x0000007800800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6_in_rule__Class_Impl__Group__55615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0_in_rule__Class_Impl__Group__5__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__6__Impl_in_rule__Class_Impl__Group__65673 = new BitSet(new long[]{0x0000007000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7_in_rule__Class_Impl__Group__65676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0_in_rule__Class_Impl__Group__6__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__7__Impl_in_rule__Class_Impl__Group__75734 = new BitSet(new long[]{0x0000006000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__8_in_rule__Class_Impl__Group__75737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__0_in_rule__Class_Impl__Group__7__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__8__Impl_in_rule__Class_Impl__Group__85795 = new BitSet(new long[]{0x0000004000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__9_in_rule__Class_Impl__Group__85798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__0_in_rule__Class_Impl__Group__8__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__9__Impl_in_rule__Class_Impl__Group__95856 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__10_in_rule__Class_Impl__Group__95859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__0_in_rule__Class_Impl__Group__9__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group__10__Impl_in_rule__Class_Impl__Group__105917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Class_Impl__Group__10__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_3__0__Impl_in_rule__Class_Impl__Group_3__05998 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_3__1_in_rule__Class_Impl__Group_3__06001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Class_Impl__Group_3__0__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_3__1__Impl_in_rule__Class_Impl__Group_3__16060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NameAssignment_3_1_in_rule__Class_Impl__Group_3__1__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__0__Impl_in_rule__Class_Impl__Group_4__06121 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1_in_rule__Class_Impl__Group_4__06124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Class_Impl__Group_4__0__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_4__1__Impl_in_rule__Class_Impl__Group_4__16183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__VisibilityAssignment_4_1_in_rule__Class_Impl__Group_4__1__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__0__Impl_in_rule__Class_Impl__Group_5__06244 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1_in_rule__Class_Impl__Group_5__06247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Class_Impl__Group_5__0__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_5__1__Impl_in_rule__Class_Impl__Group_5__16306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__IsAbstractAssignment_5_1_in_rule__Class_Impl__Group_5__1__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__0__Impl_in_rule__Class_Impl__Group_6__06367 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1_in_rule__Class_Impl__Group_6__06370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Class_Impl__Group_6__0__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_6__1__Impl_in_rule__Class_Impl__Group_6__16429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__IsActiveAssignment_6_1_in_rule__Class_Impl__Group_6__1__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__0__Impl_in_rule__Class_Impl__Group_7__06490 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__1_in_rule__Class_Impl__Group_7__06493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Class_Impl__Group_7__0__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__1__Impl_in_rule__Class_Impl__Group_7__16552 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__2_in_rule__Class_Impl__Group_7__16555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_7__1__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__2__Impl_in_rule__Class_Impl__Group_7__26614 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__3_in_rule__Class_Impl__Group_7__26617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_7_2_in_rule__Class_Impl__Group_7__2__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__3__Impl_in_rule__Class_Impl__Group_7__36674 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__4_in_rule__Class_Impl__Group_7__36677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__0_in_rule__Class_Impl__Group_7__3__Impl6704 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7__4__Impl_in_rule__Class_Impl__Group_7__46735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Class_Impl__Group_7__4__Impl6763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__0__Impl_in_rule__Class_Impl__Group_7_3__06804 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__1_in_rule__Class_Impl__Group_7_3__06807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Class_Impl__Group_7_3__0__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_7_3__1__Impl_in_rule__Class_Impl__Group_7_3__16866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedAttributeAssignment_7_3_1_in_rule__Class_Impl__Group_7_3__1__Impl6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__0__Impl_in_rule__Class_Impl__Group_8__06927 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__1_in_rule__Class_Impl__Group_8__06930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Class_Impl__Group_8__0__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__1__Impl_in_rule__Class_Impl__Group_8__16989 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__2_in_rule__Class_Impl__Group_8__16992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_8__1__Impl7020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__2__Impl_in_rule__Class_Impl__Group_8__27051 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__3_in_rule__Class_Impl__Group_8__27054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_8_2_in_rule__Class_Impl__Group_8__2__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__3__Impl_in_rule__Class_Impl__Group_8__37111 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__4_in_rule__Class_Impl__Group_8__37114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8_3__0_in_rule__Class_Impl__Group_8__3__Impl7141 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8__4__Impl_in_rule__Class_Impl__Group_8__47172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Class_Impl__Group_8__4__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8_3__0__Impl_in_rule__Class_Impl__Group_8_3__07241 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8_3__1_in_rule__Class_Impl__Group_8_3__07244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Class_Impl__Group_8_3__0__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_8_3__1__Impl_in_rule__Class_Impl__Group_8_3__17303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__NestedClassifierAssignment_8_3_1_in_rule__Class_Impl__Group_8_3__1__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__0__Impl_in_rule__Class_Impl__Group_9__07364 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__1_in_rule__Class_Impl__Group_9__07367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Class_Impl__Group_9__0__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__1__Impl_in_rule__Class_Impl__Group_9__17426 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__2_in_rule__Class_Impl__Group_9__17429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Class_Impl__Group_9__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__2__Impl_in_rule__Class_Impl__Group_9__27488 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__3_in_rule__Class_Impl__Group_9__27491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_9_2_in_rule__Class_Impl__Group_9__2__Impl7518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__3__Impl_in_rule__Class_Impl__Group_9__37548 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__4_in_rule__Class_Impl__Group_9__37551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9_3__0_in_rule__Class_Impl__Group_9__3__Impl7578 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9__4__Impl_in_rule__Class_Impl__Group_9__47609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Class_Impl__Group_9__4__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9_3__0__Impl_in_rule__Class_Impl__Group_9_3__07678 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9_3__1_in_rule__Class_Impl__Group_9_3__07681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Class_Impl__Group_9_3__0__Impl7709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__Group_9_3__1__Impl_in_rule__Class_Impl__Group_9_3__17740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Class_Impl__OwnedOperationAssignment_9_3_1_in_rule__Class_Impl__Group_9_3__1__Impl7767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__0__Impl_in_rule__LiteralInteger__Group__07801 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1_in_rule__LiteralInteger__Group__07804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__1__Impl_in_rule__LiteralInteger__Group__17862 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2_in_rule__LiteralInteger__Group__17865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__LiteralInteger__Group__1__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__2__Impl_in_rule__LiteralInteger__Group__27924 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3_in_rule__LiteralInteger__Group__27927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralInteger__Group__2__Impl7955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__3__Impl_in_rule__LiteralInteger__Group__37986 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4_in_rule__LiteralInteger__Group__37989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0_in_rule__LiteralInteger__Group__3__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__4__Impl_in_rule__LiteralInteger__Group__48047 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5_in_rule__LiteralInteger__Group__48050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LiteralInteger__Group__4__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__5__Impl_in_rule__LiteralInteger__Group__58109 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6_in_rule__LiteralInteger__Group__58112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__ValueAssignment_5_in_rule__LiteralInteger__Group__5__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group__6__Impl_in_rule__LiteralInteger__Group__68169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LiteralInteger__Group__6__Impl8197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__0__Impl_in_rule__LiteralInteger__Group_3__08242 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1_in_rule__LiteralInteger__Group_3__08245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LiteralInteger__Group_3__0__Impl8273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__Group_3__1__Impl_in_rule__LiteralInteger__Group_3__18304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralInteger__NameAssignment_3_1_in_rule__LiteralInteger__Group_3__1__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__0__Impl_in_rule__LiteralString__Group__08365 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1_in_rule__LiteralString__Group__08368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__1__Impl_in_rule__LiteralString__Group__18426 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2_in_rule__LiteralString__Group__18429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__LiteralString__Group__1__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__2__Impl_in_rule__LiteralString__Group__28488 = new BitSet(new long[]{0x0000010004800000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3_in_rule__LiteralString__Group__28491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralString__Group__2__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__3__Impl_in_rule__LiteralString__Group__38550 = new BitSet(new long[]{0x0000010000800000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4_in_rule__LiteralString__Group__38553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0_in_rule__LiteralString__Group__3__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__4__Impl_in_rule__LiteralString__Group__48611 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5_in_rule__LiteralString__Group__48614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0_in_rule__LiteralString__Group__4__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group__5__Impl_in_rule__LiteralString__Group__58672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LiteralString__Group__5__Impl8700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__0__Impl_in_rule__LiteralString__Group_3__08743 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1_in_rule__LiteralString__Group_3__08746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LiteralString__Group_3__0__Impl8774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_3__1__Impl_in_rule__LiteralString__Group_3__18805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__NameAssignment_3_1_in_rule__LiteralString__Group_3__1__Impl8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__0__Impl_in_rule__LiteralString__Group_4__08866 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1_in_rule__LiteralString__Group_4__08869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LiteralString__Group_4__0__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__Group_4__1__Impl_in_rule__LiteralString__Group_4__18928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralString__ValueAssignment_4_1_in_rule__LiteralString__Group_4__1__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__0__Impl_in_rule__LiteralBoolean__Group__08989 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1_in_rule__LiteralBoolean__Group__08992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__1__Impl_in_rule__LiteralBoolean__Group__19050 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2_in_rule__LiteralBoolean__Group__19053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__LiteralBoolean__Group__1__Impl9081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__2__Impl_in_rule__LiteralBoolean__Group__29112 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3_in_rule__LiteralBoolean__Group__29115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralBoolean__Group__2__Impl9143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__3__Impl_in_rule__LiteralBoolean__Group__39174 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4_in_rule__LiteralBoolean__Group__39177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0_in_rule__LiteralBoolean__Group__3__Impl9204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__4__Impl_in_rule__LiteralBoolean__Group__49235 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5_in_rule__LiteralBoolean__Group__49238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LiteralBoolean__Group__4__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__5__Impl_in_rule__LiteralBoolean__Group__59297 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6_in_rule__LiteralBoolean__Group__59300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__ValueAssignment_5_in_rule__LiteralBoolean__Group__5__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group__6__Impl_in_rule__LiteralBoolean__Group__69357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LiteralBoolean__Group__6__Impl9385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__0__Impl_in_rule__LiteralBoolean__Group_3__09430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1_in_rule__LiteralBoolean__Group_3__09433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LiteralBoolean__Group_3__0__Impl9461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__Group_3__1__Impl_in_rule__LiteralBoolean__Group_3__19492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralBoolean__NameAssignment_3_1_in_rule__LiteralBoolean__Group_3__1__Impl9519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__0__Impl_in_rule__LiteralUnlimitedNatural__Group__09553 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1_in_rule__LiteralUnlimitedNatural__Group__09556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__1__Impl_in_rule__LiteralUnlimitedNatural__Group__19614 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2_in_rule__LiteralUnlimitedNatural__Group__19617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__LiteralUnlimitedNatural__Group__1__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__2__Impl_in_rule__LiteralUnlimitedNatural__Group__29676 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3_in_rule__LiteralUnlimitedNatural__Group__29679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralUnlimitedNatural__Group__2__Impl9707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__3__Impl_in_rule__LiteralUnlimitedNatural__Group__39738 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4_in_rule__LiteralUnlimitedNatural__Group__39741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0_in_rule__LiteralUnlimitedNatural__Group__3__Impl9768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__4__Impl_in_rule__LiteralUnlimitedNatural__Group__49799 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5_in_rule__LiteralUnlimitedNatural__Group__49802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__LiteralUnlimitedNatural__Group__4__Impl9830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__5__Impl_in_rule__LiteralUnlimitedNatural__Group__59861 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6_in_rule__LiteralUnlimitedNatural__Group__59864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__ValueAssignment_5_in_rule__LiteralUnlimitedNatural__Group__5__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group__6__Impl_in_rule__LiteralUnlimitedNatural__Group__69921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LiteralUnlimitedNatural__Group__6__Impl9949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__0__Impl_in_rule__LiteralUnlimitedNatural__Group_3__09994 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1_in_rule__LiteralUnlimitedNatural__Group_3__09997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LiteralUnlimitedNatural__Group_3__0__Impl10025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__Group_3__1__Impl_in_rule__LiteralUnlimitedNatural__Group_3__110056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralUnlimitedNatural__NameAssignment_3_1_in_rule__LiteralUnlimitedNatural__Group_3__1__Impl10083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__0__Impl_in_rule__LiteralNull__Group__010117 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1_in_rule__LiteralNull__Group__010120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__1__Impl_in_rule__LiteralNull__Group__110178 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2_in_rule__LiteralNull__Group__110181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__LiteralNull__Group__1__Impl10209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__2__Impl_in_rule__LiteralNull__Group__210240 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3_in_rule__LiteralNull__Group__210243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LiteralNull__Group__2__Impl10271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__3__Impl_in_rule__LiteralNull__Group__310302 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4_in_rule__LiteralNull__Group__310305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0_in_rule__LiteralNull__Group__3__Impl10332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group__4__Impl_in_rule__LiteralNull__Group__410363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LiteralNull__Group__4__Impl10391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__0__Impl_in_rule__LiteralNull__Group_3__010432 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1_in_rule__LiteralNull__Group_3__010435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LiteralNull__Group_3__0__Impl10463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__Group_3__1__Impl_in_rule__LiteralNull__Group_3__110494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralNull__NameAssignment_3_1_in_rule__LiteralNull__Group_3__1__Impl10521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_210560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Model__PackagedElementAssignment_3_110591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Package_Impl__NameAssignment_3_110622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Package_Impl__VisibilityAssignment_4_110653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_5_210684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rule__Package_Impl__PackagedElementAssignment_5_3_110715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Property_Impl__NameAssignment_3_110746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Property_Impl__VisibilityAssignment_4_110777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Property_Impl__IsStaticAssignment_5_110808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property_Impl__TypeAssignment_6_110843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Operation__NameAssignment_3_110878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Operation__VisibilityAssignment_4_110909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Operation__IsStaticAssignment_5_110940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Operation__IsAbstractAssignment_6_110971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCallConcurrencyKind_in_rule__Operation__ConcurrencyAssignment_7_111002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Class_Impl__NameAssignment_3_111033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rule__Class_Impl__VisibilityAssignment_4_111064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Class_Impl__IsAbstractAssignment_5_111095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__Class_Impl__IsActiveAssignment_6_111126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_7_211157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__Class_Impl__OwnedAttributeAssignment_7_3_111188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_8_211219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_rule__Class_Impl__NestedClassifierAssignment_8_3_111250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_9_211281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Class_Impl__OwnedOperationAssignment_9_3_111312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralInteger__NameAssignment_3_111343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__LiteralInteger__ValueAssignment_511374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__NameAssignment_3_111405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralString__ValueAssignment_4_111436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralBoolean__NameAssignment_3_111467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__LiteralBoolean__ValueAssignment_511498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralUnlimitedNatural__NameAssignment_3_111529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_rule__LiteralUnlimitedNatural__ValueAssignment_511560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__LiteralNull__NameAssignment_3_111591 = new BitSet(new long[]{0x0000000000000002L});
    }


}