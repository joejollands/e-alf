package ro.ubbcluj.cs.ealf.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import ro.ubbcluj.cs.ealf.services.EAlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEAlfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "':'", "';'", "'('", "')'", "'class'", "'ownedAttribute'", "','", "'nestedClassifier'", "'ownedOperation'", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'LiteralInteger'", "'name'", "'value'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'", "'public'", "'private'", "'protected'", "'sequential'", "'guarded'", "'concurrent'"
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
    public String getGrammarFileName() { return "../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g"; }



     	private EAlfGrammarAccess grammarAccess;
     	
        public InternalEAlfParser(TokenStream input, IAstFactory factory, EAlfGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EAlfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_packagedElement_0_0= rulePackageableElement ) ) ( (lv_packagedElement_1_0= rulePackageableElement ) )* )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packagedElement_0_0 = null;

        EObject lv_packagedElement_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:92:6: ( ( ( (lv_packagedElement_0_0= rulePackageableElement ) ) ( (lv_packagedElement_1_0= rulePackageableElement ) )* )? )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: ( ( (lv_packagedElement_0_0= rulePackageableElement ) ) ( (lv_packagedElement_1_0= rulePackageableElement ) )* )?
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: ( ( (lv_packagedElement_0_0= rulePackageableElement ) ) ( (lv_packagedElement_1_0= rulePackageableElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==18||(LA2_0>=33 && LA2_0<=35)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:2: ( (lv_packagedElement_0_0= rulePackageableElement ) ) ( (lv_packagedElement_1_0= rulePackageableElement ) )*
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:2: ( (lv_packagedElement_0_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:94:1: (lv_packagedElement_0_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:94:1: (lv_packagedElement_0_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:95:3: lv_packagedElement_0_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel131);
                    lv_packagedElement_0_0=rulePackageableElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"packagedElement",
                    	        		lv_packagedElement_0_0, 
                    	        		"PackageableElement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:117:2: ( (lv_packagedElement_1_0= rulePackageableElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11||LA1_0==18||(LA1_0>=33 && LA1_0<=35)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:118:1: (lv_packagedElement_1_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:118:1: (lv_packagedElement_1_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:119:3: lv_packagedElement_1_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel152);
                    	    lv_packagedElement_1_0=rulePackageableElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"packagedElement",
                    	    	        		lv_packagedElement_1_0, 
                    	    	        		"PackageableElement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRulePackageableElement
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:149:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:150:2: (iv_rulePackageableElement= rulePackageableElement EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:151:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageableElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement190);
            iv_rulePackageableElement=rulePackageableElement();
            _fsp--;

             current =iv_rulePackageableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageableElement


    // $ANTLR start rulePackageableElement
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:158:1: rulePackageableElement returns [EObject current=null] : (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_Impl_0 = null;

        EObject this_Class_Impl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:163:6: ( (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:164:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:164:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=RULE_STRING && LA3_1<=RULE_ID)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("164:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==18||(LA3_0>=33 && LA3_0<=35)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("164:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:165:5: this_Package_Impl_0= rulePackage_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rulePackageableElement247);
                    this_Package_Impl_0=rulePackage_Impl();
                    _fsp--;

                     
                            current = this_Package_Impl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:175:5: this_Class_Impl_1= ruleClass_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rulePackageableElement274);
                    this_Class_Impl_1=ruleClass_Impl();
                    _fsp--;

                     
                            current = this_Class_Impl_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackageableElement


    // $ANTLR start entryRuleClassifier
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:197:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:198:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:199:2: iv_ruleClassifier= ruleClassifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassifierRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier315);
            iv_ruleClassifier=ruleClassifier();
            _fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClassifier


    // $ANTLR start ruleClassifier
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:206:1: ruleClassifier returns [EObject current=null] : this_Class_Impl_0= ruleClass_Impl ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:211:6: (this_Class_Impl_0= ruleClass_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:213:5: this_Class_Impl_0= ruleClass_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getClassifierAccess().getClass_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_ruleClassifier371);
            this_Class_Impl_0=ruleClass_Impl();
            _fsp--;

             
                    current = this_Class_Impl_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassifier


    // $ANTLR start entryRuleProperty
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:229:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:230:2: (iv_ruleProperty= ruleProperty EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:231:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty405);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:238:1: ruleProperty returns [EObject current=null] : this_Property_Impl_0= ruleProperty_Impl ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Property_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:243:6: (this_Property_Impl_0= ruleProperty_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:245:5: this_Property_Impl_0= ruleProperty_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getProperty_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_ruleProperty461);
            this_Property_Impl_0=ruleProperty_Impl();
            _fsp--;

             
                    current = this_Property_Impl_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRulePackage_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:263:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:264:2: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:265:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackage_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl497);
            iv_rulePackage_Impl=rulePackage_Impl();
            _fsp--;

             current =iv_rulePackage_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackage_Impl


    // $ANTLR start rulePackage_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:272:1: rulePackage_Impl returns [EObject current=null] : ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_packagedElement_4_0 = null;

        EObject lv_packagedElement_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:277:6: ( ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:278:1: ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:278:1: ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:278:2: () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:278:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:279:5: 
            {
             
                    temp=factory.create(grammarAccess.getPackage_ImplAccess().getPackageAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackageAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FollowSets000.FOLLOW_11_in_rulePackage_Impl551); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:293:1: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:295:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rulePackage_Impl572);
            lv_name_2_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"String0", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_rulePackage_Impl582); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:321:1: ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11||LA5_0==18||(LA5_0>=33 && LA5_0<=35)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:321:2: ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:321:2: ( (lv_packagedElement_4_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:322:1: (lv_packagedElement_4_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:322:1: (lv_packagedElement_4_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:323:3: lv_packagedElement_4_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl604);
                    lv_packagedElement_4_0=rulePackageableElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"packagedElement",
                    	        		lv_packagedElement_4_0, 
                    	        		"PackageableElement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:2: ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==11||LA4_0==18||(LA4_0>=33 && LA4_0<=35)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:346:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:346:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:347:3: lv_packagedElement_5_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl625);
                    	    lv_packagedElement_5_0=rulePackageableElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"packagedElement",
                    	    	        		lv_packagedElement_5_0, 
                    	    	        		"PackageableElement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_rulePackage_Impl638); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackage_Impl


    // $ANTLR start entryRuleProperty_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:381:1: entryRuleProperty_Impl returns [EObject current=null] : iv_ruleProperty_Impl= ruleProperty_Impl EOF ;
    public final EObject entryRuleProperty_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:382:2: (iv_ruleProperty_Impl= ruleProperty_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:383:2: iv_ruleProperty_Impl= ruleProperty_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProperty_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl674);
            iv_ruleProperty_Impl=ruleProperty_Impl();
            _fsp--;

             current =iv_ruleProperty_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_Impl684); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty_Impl


    // $ANTLR start ruleProperty_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:390:1: ruleProperty_Impl returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ';' ) ;
    public final EObject ruleProperty_Impl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:395:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ';' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:396:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ';' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:396:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ';' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:396:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ';'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:396:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:397:5: 
            {
             
                    temp=factory.create(grammarAccess.getProperty_ImplAccess().getPropertyAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getProperty_ImplAccess().getPropertyAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:407:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11||(LA6_0>=33 && LA6_0<=35)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:408:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:408:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:409:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleProperty_Impl739);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:431:3: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:432:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:432:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:433:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleProperty_Impl761);
            lv_name_2_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"String0", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty_Impl771); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getColonKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:459:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:1: ( ruleEString )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:461:3: ruleEString
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty_Impl794);
            ruleEString();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty_Impl804); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty_Impl


    // $ANTLR start entryRuleOperation
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:487:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:488:2: (iv_ruleOperation= ruleOperation EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:489:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation840);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:496:1: ruleOperation returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )? ( (lv_name_3_0= ruleString0 ) ) '(' ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_concurrency_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:501:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )? ( (lv_name_3_0= ruleString0 ) ) '(' ')' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:502:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )? ( (lv_name_3_0= ruleString0 ) ) '(' ')' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:502:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )? ( (lv_name_3_0= ruleString0 ) ) '(' ')' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:502:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )? ( (lv_name_3_0= ruleString0 ) ) '(' ')'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:502:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:503:5: 
            {
             
                    temp=factory.create(grammarAccess.getOperationAccess().getOperationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOperationAccess().getOperationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:513:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11||(LA7_0>=33 && LA7_0<=35)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:514:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:514:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:515:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleOperation905);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:537:3: ( (lv_concurrency_2_0= ruleCallConcurrencyKind ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=36 && LA8_0<=38)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:538:1: (lv_concurrency_2_0= ruleCallConcurrencyKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:538:1: (lv_concurrency_2_0= ruleCallConcurrencyKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:539:3: lv_concurrency_2_0= ruleCallConcurrencyKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCallConcurrencyKind_in_ruleOperation927);
                    lv_concurrency_2_0=ruleCallConcurrencyKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"concurrency",
                    	        		lv_concurrency_2_0, 
                    	        		"CallConcurrencyKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:561:3: ( (lv_name_3_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:562:1: (lv_name_3_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:562:1: (lv_name_3_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:563:3: lv_name_3_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOperation949);
            lv_name_3_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"String0", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation959); 

                    createLeafNode(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOperation969); 

                    createLeafNode(grammarAccess.getOperationAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleClass_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:601:1: entryRuleClass_Impl returns [EObject current=null] : iv_ruleClass_Impl= ruleClass_Impl EOF ;
    public final EObject entryRuleClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:602:2: (iv_ruleClass_Impl= ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:603:2: iv_ruleClass_Impl= ruleClass_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClass_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1005);
            iv_ruleClass_Impl=ruleClass_Impl();
            _fsp--;

             current =iv_ruleClass_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl1015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleClass_Impl


    // $ANTLR start ruleClass_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:610:1: ruleClass_Impl returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'class' ( (lv_name_3_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )? '}' ) ;
    public final EObject ruleClass_Impl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_ownedAttribute_7_0 = null;

        EObject lv_ownedAttribute_9_0 = null;

        EObject lv_nestedClassifier_13_0 = null;

        EObject lv_nestedClassifier_15_0 = null;

        EObject lv_ownedOperation_19_0 = null;

        EObject lv_ownedOperation_21_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:615:6: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'class' ( (lv_name_3_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:616:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'class' ( (lv_name_3_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:616:1: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'class' ( (lv_name_3_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:616:2: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? 'class' ( (lv_name_3_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:616:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:617:5: 
            {
             
                    temp=factory.create(grammarAccess.getClass_ImplAccess().getClassAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getClass_ImplAccess().getClassAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:627:2: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11||(LA9_0>=33 && LA9_0<=35)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:628:1: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:628:1: (lv_visibility_1_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:629:3: lv_visibility_1_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleClass_Impl1070);
                    lv_visibility_1_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_1_0, 
                    	        		"VisibilityKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,18,FollowSets000.FOLLOW_18_in_ruleClass_Impl1081); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getClassKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:655:1: ( (lv_name_3_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:656:1: (lv_name_3_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:656:1: (lv_name_3_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:657:3: lv_name_3_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClass_Impl1102);
            lv_name_3_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"String0", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1112); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:683:1: ( 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:683:3: 'ownedAttribute' '{' ( (lv_ownedAttribute_7_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleClass_Impl1123); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_5_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1133); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:691:1: ( (lv_ownedAttribute_7_0= ruleProperty ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:692:1: (lv_ownedAttribute_7_0= ruleProperty )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:692:1: (lv_ownedAttribute_7_0= ruleProperty )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:693:3: lv_ownedAttribute_7_0= ruleProperty
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1154);
                    lv_ownedAttribute_7_0=ruleProperty();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedAttribute",
                    	        		lv_ownedAttribute_7_0, 
                    	        		"Property", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:715:2: ( ',' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:715:4: ',' ( (lv_ownedAttribute_9_0= ruleProperty ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleClass_Impl1165); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:719:1: ( (lv_ownedAttribute_9_0= ruleProperty ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:720:1: (lv_ownedAttribute_9_0= ruleProperty )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:720:1: (lv_ownedAttribute_9_0= ruleProperty )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:721:3: lv_ownedAttribute_9_0= ruleProperty
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_5_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1186);
                    	    lv_ownedAttribute_9_0=ruleProperty();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_9_0, 
                    	    	        		"Property", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1198); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:747:3: ( 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:747:5: 'nestedClassifier' '{' ( (lv_nestedClassifier_13_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )* '}'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleClass_Impl1211); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_6_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1221); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:755:1: ( (lv_nestedClassifier_13_0= ruleClassifier ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:756:1: (lv_nestedClassifier_13_0= ruleClassifier )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:756:1: (lv_nestedClassifier_13_0= ruleClassifier )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:757:3: lv_nestedClassifier_13_0= ruleClassifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1242);
                    lv_nestedClassifier_13_0=ruleClassifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"nestedClassifier",
                    	        		lv_nestedClassifier_13_0, 
                    	        		"Classifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:779:2: ( ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:779:4: ',' ( (lv_nestedClassifier_15_0= ruleClassifier ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleClass_Impl1253); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_6_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:783:1: ( (lv_nestedClassifier_15_0= ruleClassifier ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:784:1: (lv_nestedClassifier_15_0= ruleClassifier )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:784:1: (lv_nestedClassifier_15_0= ruleClassifier )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:785:3: lv_nestedClassifier_15_0= ruleClassifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1274);
                    	    lv_nestedClassifier_15_0=ruleClassifier();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"nestedClassifier",
                    	    	        		lv_nestedClassifier_15_0, 
                    	    	        		"Classifier", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1286); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:811:3: ( 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:811:5: 'ownedOperation' '{' ( (lv_ownedOperation_19_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )* '}'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleClass_Impl1299); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_7_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1309); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:819:1: ( (lv_ownedOperation_19_0= ruleOperation ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:820:1: (lv_ownedOperation_19_0= ruleOperation )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:820:1: (lv_ownedOperation_19_0= ruleOperation )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:821:3: lv_ownedOperation_19_0= ruleOperation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1330);
                    lv_ownedOperation_19_0=ruleOperation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedOperation",
                    	        		lv_ownedOperation_19_0, 
                    	        		"Operation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:843:2: ( ',' ( (lv_ownedOperation_21_0= ruleOperation ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:843:4: ',' ( (lv_ownedOperation_21_0= ruleOperation ) )
                    	    {
                    	    match(input,20,FollowSets000.FOLLOW_20_in_ruleClass_Impl1341); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:847:1: ( (lv_ownedOperation_21_0= ruleOperation ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:1: (lv_ownedOperation_21_0= ruleOperation )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:1: (lv_ownedOperation_21_0= ruleOperation )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:849:3: lv_ownedOperation_21_0= ruleOperation
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1362);
                    	    lv_ownedOperation_21_0=ruleOperation();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedOperation",
                    	    	        		lv_ownedOperation_21_0, 
                    	    	        		"Operation", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1374); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1386); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClass_Impl


    // $ANTLR start entryRuleInteger
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:887:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:888:2: (iv_ruleInteger= ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:889:2: iv_ruleInteger= ruleInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1423);
            iv_ruleInteger=ruleInteger();
            _fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInteger


    // $ANTLR start ruleInteger
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:896:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:901:6: (kw= 'Integer' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:903:2: kw= 'Integer'
            {
            kw=(Token)input.LT(1);
            match(input,23,FollowSets000.FOLLOW_23_in_ruleInteger1471); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getIntegerAccess().getIntegerKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInteger


    // $ANTLR start entryRuleString0
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:916:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:917:2: (iv_ruleString0= ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:918:2: iv_ruleString0= ruleString0 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getString0Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01511);
            iv_ruleString0=ruleString0();
            _fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleString0


    // $ANTLR start ruleString0
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:925:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:930:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:931:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:931:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("931:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:931:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01562); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:939:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleString01588); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getString0Access().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleString0


    // $ANTLR start entryRuleBoolean
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:954:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:955:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:956:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1634);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:963:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:968:6: (kw= 'Boolean' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:970:2: kw= 'Boolean'
            {
            kw=(Token)input.LT(1);
            match(input,24,FollowSets000.FOLLOW_24_in_ruleBoolean1682); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getBooleanAccess().getBooleanKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:983:1: entryRuleUnlimitedNatural returns [String current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final String entryRuleUnlimitedNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:984:2: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:985:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural1722);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();
            _fsp--;

             current =iv_ruleUnlimitedNatural.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural1733); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnlimitedNatural


    // $ANTLR start ruleUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:992:1: ruleUnlimitedNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnlimitedNatural' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:997:6: (kw= 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:999:2: kw= 'UnlimitedNatural'
            {
            kw=(Token)input.LT(1);
            match(input,25,FollowSets000.FOLLOW_25_in_ruleUnlimitedNatural1770); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getUnlimitedNaturalAccess().getUnlimitedNaturalKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnlimitedNatural


    // $ANTLR start entryRuleEString
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1012:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1013:2: (iv_ruleEString= ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1014:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1810);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1821); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1021:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1026:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1027:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1027:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1027:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1027:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1861); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1035:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1887); 

                    		current.merge(this_ID_1);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start entryRuleLiteralInteger
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1052:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1053:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1054:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger1934);
            iv_ruleLiteralInteger=ruleLiteralInteger();
            _fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger1944); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralInteger


    // $ANTLR start ruleLiteralInteger
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1061:1: ruleLiteralInteger returns [EObject current=null] : ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1066:6: ( ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1067:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1067:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1067:2: () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1067:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1068:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,26,FollowSets000.FOLLOW_26_in_ruleLiteralInteger1988); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralInteger1998); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1086:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1086:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteralInteger2009); 

                            createLeafNode(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1090:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1091:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1091:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1092:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralInteger2030);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralIntegerRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleLiteralInteger2042); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1118:1: ( (lv_value_6_0= ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1119:1: (lv_value_6_0= ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1119:1: (lv_value_6_0= ruleInteger )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1120:3: lv_value_6_0= ruleInteger
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleLiteralInteger2063);
            lv_value_6_0=ruleInteger();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralIntegerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_6_0, 
            	        		"Integer", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralInteger2073); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralInteger


    // $ANTLR start entryRuleLiteralString
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1154:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1155:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1156:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString2109);
            iv_ruleLiteralString=ruleLiteralString();
            _fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString2119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralString


    // $ANTLR start ruleLiteralString
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1163:1: ruleLiteralString returns [EObject current=null] : ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1168:6: ( ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:2: () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1170:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralStringAccess().getLiteralStringAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleLiteralString2163); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralString2173); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1188:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1188:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteralString2184); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1192:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1193:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1193:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1194:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2205);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1216:4: ( 'value' ( (lv_value_6_0= ruleString0 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1216:6: 'value' ( (lv_value_6_0= ruleString0 ) )
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleLiteralString2218); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1220:1: ( (lv_value_6_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1221:1: (lv_value_6_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1221:1: (lv_value_6_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1222:3: lv_value_6_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2239);
                    lv_value_6_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralStringRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_6_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralString2251); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralString


    // $ANTLR start entryRuleLiteralBoolean
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1256:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1257:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1258:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2287);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();
            _fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean2297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralBoolean


    // $ANTLR start ruleLiteralBoolean
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1265:1: ruleLiteralBoolean returns [EObject current=null] : ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:6: ( ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:2: () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1272:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,30,FollowSets000.FOLLOW_30_in_ruleLiteralBoolean2341); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralBoolean2351); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1290:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1290:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteralBoolean2362); 

                            createLeafNode(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1294:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1295:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1295:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1296:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralBoolean2383);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralBooleanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleLiteralBoolean2395); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1322:1: ( (lv_value_6_0= ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1323:1: (lv_value_6_0= ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1323:1: (lv_value_6_0= ruleBoolean )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1324:3: lv_value_6_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteralBoolean2416);
            lv_value_6_0=ruleBoolean();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralBooleanRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_6_0, 
            	        		"Boolean", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralBoolean2426); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralBoolean


    // $ANTLR start entryRuleLiteralUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1358:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1359:2: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1360:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2462);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();
            _fsp--;

             current =iv_ruleLiteralUnlimitedNatural; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2472); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralUnlimitedNatural


    // $ANTLR start ruleLiteralUnlimitedNatural
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1367:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1372:6: ( ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1373:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1373:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1373:2: () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1373:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1374:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleLiteralUnlimitedNatural2516); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralUnlimitedNatural2526); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1392:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1392:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteralUnlimitedNatural2537); 

                            createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1396:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1397:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1397:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1398:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2558);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralUnlimitedNaturalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleLiteralUnlimitedNatural2570); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1424:1: ( (lv_value_6_0= ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1425:1: (lv_value_6_0= ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1425:1: (lv_value_6_0= ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1426:3: lv_value_6_0= ruleUnlimitedNatural
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural2591);
            lv_value_6_0=ruleUnlimitedNatural();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralUnlimitedNaturalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_6_0, 
            	        		"UnlimitedNatural", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralUnlimitedNatural2601); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralUnlimitedNatural


    // $ANTLR start entryRuleLiteralNull
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1460:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1461:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1462:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralNullRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull2637);
            iv_ruleLiteralNull=ruleLiteralNull();
            _fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull2647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralNull


    // $ANTLR start ruleLiteralNull
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1469:1: ruleLiteralNull returns [EObject current=null] : ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1474:6: ( ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1475:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1475:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1475:2: () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1475:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1476:5: 
            {
             
                    temp=factory.create(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralNullAccess().getLiteralNullAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralNull2691); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralNull2701); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1494:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1494:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteralNull2712); 

                            createLeafNode(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1498:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1499:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1499:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1500:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralNull2733);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralNullRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"String0", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralNull2745); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralNull


    // $ANTLR start ruleVisibilityKind
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1534:1: ruleVisibilityKind returns [Enumerator current=null] : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1538:6: ( ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            case 11:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1539:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:2: ( 'public' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:2: ( 'public' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:4: 'public'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleVisibilityKind2793); 

                            current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1545:6: ( 'private' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1545:6: ( 'private' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1545:8: 'private'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleVisibilityKind2808); 

                            current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1551:6: ( 'protected' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1551:6: ( 'protected' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1551:8: 'protected'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleVisibilityKind2823); 

                            current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1557:6: ( 'package' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1557:6: ( 'package' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1557:8: 'package'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleVisibilityKind2838); 

                            current = grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVisibilityKind


    // $ANTLR start ruleCallConcurrencyKind
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1571:1: ruleCallConcurrencyKind returns [Enumerator current=null] : ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) ) ;
    public final Enumerator ruleCallConcurrencyKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1575:6: ( ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1576:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:2: ( 'sequential' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:2: ( 'sequential' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:4: 'sequential'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleCallConcurrencyKind2885); 

                            current = grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1582:6: ( 'guarded' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1582:6: ( 'guarded' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1582:8: 'guarded'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleCallConcurrencyKind2900); 

                            current = grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1588:6: ( 'concurrent' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1588:6: ( 'concurrent' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1588:8: 'concurrent'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleCallConcurrencyKind2915); 

                            current = grammarAccess.getCallConcurrencyKindAccess().getConcurrentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCallConcurrencyKindAccess().getConcurrentEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCallConcurrencyKind


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel131 = new BitSet(new long[]{0x0000000E00040802L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel152 = new BitSet(new long[]{0x0000000E00040802L});
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rulePackageableElement247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rulePackageableElement274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_ruleClassifier371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_ruleProperty461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage_Impl551 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_rulePackage_Impl572 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage_Impl582 = new BitSet(new long[]{0x0000000E00042800L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl604 = new BitSet(new long[]{0x0000000E00042800L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl625 = new BitSet(new long[]{0x0000000E00042800L});
        public static final BitSet FOLLOW_13_in_rulePackage_Impl638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_Impl684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleProperty_Impl739 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleProperty_Impl761 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty_Impl771 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty_Impl794 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProperty_Impl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleOperation905 = new BitSet(new long[]{0x0000007000000030L});
        public static final BitSet FOLLOW_ruleCallConcurrencyKind_in_ruleOperation927 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOperation949 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperation959 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOperation969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleClass_Impl1070 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClass_Impl1081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClass_Impl1102 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1112 = new BitSet(new long[]{0x0000000000682000L});
        public static final BitSet FOLLOW_19_in_ruleClass_Impl1123 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1133 = new BitSet(new long[]{0x0000000E00000830L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1154 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_20_in_ruleClass_Impl1165 = new BitSet(new long[]{0x0000000E00000830L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1186 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1198 = new BitSet(new long[]{0x0000000000602000L});
        public static final BitSet FOLLOW_21_in_ruleClass_Impl1211 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1221 = new BitSet(new long[]{0x0000000E00040800L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1242 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_20_in_ruleClass_Impl1253 = new BitSet(new long[]{0x0000000E00040800L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1274 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1286 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_22_in_ruleClass_Impl1299 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1309 = new BitSet(new long[]{0x0000007E00000830L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1330 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_20_in_ruleClass_Impl1341 = new BitSet(new long[]{0x0000007E00000830L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1362 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1374 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInteger1471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleString01588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleBoolean1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural1722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleUnlimitedNatural1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger1934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleLiteralInteger1988 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralInteger1998 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleLiteralInteger2009 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralInteger2030 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLiteralInteger2042 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleLiteralInteger2063 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralInteger2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString2109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLiteralString2163 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralString2173 = new BitSet(new long[]{0x0000000018002000L});
        public static final BitSet FOLLOW_27_in_ruleLiteralString2184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2205 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_28_in_ruleLiteralString2218 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2239 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralString2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLiteralBoolean2341 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralBoolean2351 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleLiteralBoolean2362 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralBoolean2383 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLiteralBoolean2395 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteralBoolean2416 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralBoolean2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleLiteralUnlimitedNatural2516 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralUnlimitedNatural2526 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleLiteralUnlimitedNatural2537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2558 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLiteralUnlimitedNatural2570 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural2591 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralUnlimitedNatural2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull2637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralNull2691 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralNull2701 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleLiteralNull2712 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralNull2733 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralNull2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleVisibilityKind2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleVisibilityKind2808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleVisibilityKind2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleVisibilityKind2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleCallConcurrencyKind2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCallConcurrencyKind2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCallConcurrencyKind2915 = new BitSet(new long[]{0x0000000000000002L});
    }


}