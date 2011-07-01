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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\\tmodel'", "'}'", "'package'", "'property'", "':'", "'operation'", "'('", "')'", "'activity'", "'for'", "'action'", "'class'", "'ownedAttribute'", "';'", "'nestedClassifier'", "','", "'ownedOperation'", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'LiteralInteger'", "'name'", "'value'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
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
        	return "PackageableElement";	
       	}
       	
       	@Override
       	protected EAlfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulePackageableElement
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:78:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:79:2: (iv_rulePackageableElement= rulePackageableElement EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:80:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageableElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement75);
            iv_rulePackageableElement=rulePackageableElement();
            _fsp--;

             current =iv_rulePackageableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement85); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:87:1: rulePackageableElement returns [EObject current=null] : (this_Model_0= ruleModel | this_Package_Impl_1= rulePackage_Impl | this_Class_Impl_2= ruleClass_Impl | this_Activity_3= ruleActivity ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Model_0 = null;

        EObject this_Package_Impl_1 = null;

        EObject this_Class_Impl_2 = null;

        EObject this_Activity_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:92:6: ( (this_Model_0= ruleModel | this_Package_Impl_1= rulePackage_Impl | this_Class_Impl_2= ruleClass_Impl | this_Activity_3= ruleActivity ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: (this_Model_0= ruleModel | this_Package_Impl_1= rulePackage_Impl | this_Class_Impl_2= ruleClass_Impl | this_Activity_3= ruleActivity )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: (this_Model_0= ruleModel | this_Package_Impl_1= rulePackage_Impl | this_Class_Impl_2= ruleClass_Impl | this_Activity_3= ruleActivity )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("93:1: (this_Model_0= ruleModel | this_Package_Impl_1= rulePackage_Impl | this_Class_Impl_2= ruleClass_Impl | this_Activity_3= ruleActivity )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:94:5: this_Model_0= ruleModel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getModelParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleModel_in_rulePackageableElement132);
                    this_Model_0=ruleModel();
                    _fsp--;

                     
                            current = this_Model_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:104:5: this_Package_Impl_1= rulePackage_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rulePackageableElement159);
                    this_Package_Impl_1=rulePackage_Impl();
                    _fsp--;

                     
                            current = this_Package_Impl_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:114:5: this_Class_Impl_2= ruleClass_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rulePackageableElement186);
                    this_Class_Impl_2=ruleClass_Impl();
                    _fsp--;

                     
                            current = this_Class_Impl_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:124:5: this_Activity_3= ruleActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getActivityParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rulePackageableElement213);
                    this_Activity_3=ruleActivity();
                    _fsp--;

                     
                            current = this_Activity_3; 
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


    // $ANTLR start entryRuleModel
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:140:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:141:2: (iv_ruleModel= ruleModel EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:142:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel248);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel258); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:149:1: ruleModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleString0 ) ) '{' '\\tmodel' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_packagedElement_4_0 = null;

        EObject lv_packagedElement_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:154:6: ( ( () ( (lv_name_1_0= ruleString0 ) ) '{' '\\tmodel' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:155:1: ( () ( (lv_name_1_0= ruleString0 ) ) '{' '\\tmodel' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:155:1: ( () ( (lv_name_1_0= ruleString0 ) ) '{' '\\tmodel' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:155:2: () ( (lv_name_1_0= ruleString0 ) ) '{' '\\tmodel' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:155:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:156:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelAccess().getModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelAccess().getModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:166:2: ( (lv_name_1_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:167:1: (lv_name_1_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:167:1: (lv_name_1_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:168:3: lv_name_1_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getNameString0ParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleModel313);
            lv_name_1_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"String0", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,11,FollowSets000.FOLLOW_11_in_ruleModel323); 

                    createLeafNode(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleModel333); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:198:1: ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==14||LA3_0==20||LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:198:2: ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:198:2: ( (lv_packagedElement_4_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:199:1: (lv_packagedElement_4_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:199:1: (lv_packagedElement_4_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:200:3: lv_packagedElement_4_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel355);
                    lv_packagedElement_4_0=rulePackageableElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:222:2: ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==14||LA2_0==20||LA2_0==23) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:223:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:223:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:224:3: lv_packagedElement_5_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel376);
                    	    lv_packagedElement_5_0=rulePackageableElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleModel389); 

                    createLeafNode(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleClassifier
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:264:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:265:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:266:2: iv_ruleClassifier= ruleClassifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassifierRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier431);
            iv_ruleClassifier=ruleClassifier();
            _fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier441); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:273:1: ruleClassifier returns [EObject current=null] : this_Class_Impl_0= ruleClass_Impl ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:278:6: (this_Class_Impl_0= ruleClass_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:280:5: this_Class_Impl_0= ruleClass_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getClassifierAccess().getClass_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_ruleClassifier487);
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:296:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:297:2: (iv_ruleProperty= ruleProperty EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:298:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty521);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty531); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:305:1: ruleProperty returns [EObject current=null] : this_Property_Impl_0= ruleProperty_Impl ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Property_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:310:6: (this_Property_Impl_0= ruleProperty_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:312:5: this_Property_Impl_0= ruleProperty_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getProperty_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_ruleProperty577);
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:330:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:331:2: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:332:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackage_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl613);
            iv_rulePackage_Impl=rulePackage_Impl();
            _fsp--;

             current =iv_rulePackage_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl623); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:339:1: rulePackage_Impl returns [EObject current=null] : ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_packagedElement_4_0 = null;

        EObject lv_packagedElement_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:344:6: ( ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:1: ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:1: ( () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:2: () 'package' ( (lv_name_2_0= ruleString0 ) ) '{' ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:346:5: 
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

            match(input,14,FollowSets000.FOLLOW_14_in_rulePackage_Impl667); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:360:1: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:361:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:361:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:362:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rulePackage_Impl688);
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

            match(input,11,FollowSets000.FOLLOW_11_in_rulePackage_Impl698); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:388:1: ( ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||LA5_0==14||LA5_0==20||LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:388:2: ( (lv_packagedElement_4_0= rulePackageableElement ) ) ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:388:2: ( (lv_packagedElement_4_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:389:1: (lv_packagedElement_4_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:389:1: (lv_packagedElement_4_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:390:3: lv_packagedElement_4_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl720);
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

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:412:2: ( (lv_packagedElement_5_0= rulePackageableElement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||LA4_0==14||LA4_0==20||LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:413:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:413:1: (lv_packagedElement_5_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:414:3: lv_packagedElement_5_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl741);
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

            match(input,13,FollowSets000.FOLLOW_13_in_rulePackage_Impl754); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:448:1: entryRuleProperty_Impl returns [EObject current=null] : iv_ruleProperty_Impl= ruleProperty_Impl EOF ;
    public final EObject entryRuleProperty_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:449:2: (iv_ruleProperty_Impl= ruleProperty_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:450:2: iv_ruleProperty_Impl= ruleProperty_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProperty_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl790);
            iv_ruleProperty_Impl=ruleProperty_Impl();
            _fsp--;

             current =iv_ruleProperty_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_Impl800); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:457:1: ruleProperty_Impl returns [EObject current=null] : ( () 'property' ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleProperty_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:462:6: ( ( () 'property' ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:463:1: ( () 'property' ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:463:1: ( () 'property' ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:463:2: () 'property' ( (lv_name_2_0= ruleString0 ) ) ':' ( ( ruleEString ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:463:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:464:5: 
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

            match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty_Impl844); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:478:1: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:479:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:479:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:480:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleProperty_Impl865);
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

            match(input,16,FollowSets000.FOLLOW_16_in_ruleProperty_Impl875); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getColonKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:506:1: ( ( ruleEString ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:507:1: ( ruleEString )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:507:1: ( ruleEString )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:508:3: ruleEString
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty_Impl898);
            ruleEString();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }


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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:530:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:531:2: (iv_ruleOperation= ruleOperation EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:532:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation934);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation944); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:539:1: ruleOperation returns [EObject current=null] : ( () 'operation' ( (lv_name_2_0= ruleString0 ) ) '(' ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:544:6: ( ( () 'operation' ( (lv_name_2_0= ruleString0 ) ) '(' ')' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:545:1: ( () 'operation' ( (lv_name_2_0= ruleString0 ) ) '(' ')' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:545:1: ( () 'operation' ( (lv_name_2_0= ruleString0 ) ) '(' ')' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:545:2: () 'operation' ( (lv_name_2_0= ruleString0 ) ) '(' ')'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:545:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:546:5: 
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleOperation988); 

                    createLeafNode(grammarAccess.getOperationAccess().getOperationKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:560:1: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:561:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:561:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:562:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOperation1009);
            lv_name_2_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleOperation1019); 

                    createLeafNode(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3(), null); 
                
            match(input,19,FollowSets000.FOLLOW_19_in_ruleOperation1029); 

                    createLeafNode(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4(), null); 
                

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


    // $ANTLR start entryRuleActivity
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:600:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:601:2: (iv_ruleActivity= ruleActivity EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:602:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity1065);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity1075); 

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
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:609:1: ruleActivity returns [EObject current=null] : ( () 'activity' ( 'for' ( ( RULE_ID ) ) )? ( (lv_name_4_0= ruleString0 ) ) '(' ')' '{' ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_ownedAttribute_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:614:6: ( ( () 'activity' ( 'for' ( ( RULE_ID ) ) )? ( (lv_name_4_0= ruleString0 ) ) '(' ')' '{' ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:615:1: ( () 'activity' ( 'for' ( ( RULE_ID ) ) )? ( (lv_name_4_0= ruleString0 ) ) '(' ')' '{' ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:615:1: ( () 'activity' ( 'for' ( ( RULE_ID ) ) )? ( (lv_name_4_0= ruleString0 ) ) '(' ')' '{' ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:615:2: () 'activity' ( 'for' ( ( RULE_ID ) ) )? ( (lv_name_4_0= ruleString0 ) ) '(' ')' '{' ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )* '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:615:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:616:5: 
            {
             
                    temp=factory.create(grammarAccess.getActivityAccess().getActivityAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getActivityAccess().getActivityAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FollowSets000.FOLLOW_20_in_ruleActivity1119); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:630:1: ( 'for' ( ( RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:630:3: 'for' ( ( RULE_ID ) )
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleActivity1130); 

                            createLeafNode(grammarAccess.getActivityAccess().getForKeyword_2_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:634:1: ( ( RULE_ID ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:635:1: ( RULE_ID )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:635:1: ( RULE_ID )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:636:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActivity1148); 

                    		createLeafNode(grammarAccess.getActivityAccess().getSpecificationOperationCrossReference_2_1_0(), "specification"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:648:4: ( (lv_name_4_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:649:1: (lv_name_4_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:649:1: (lv_name_4_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:650:3: lv_name_4_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getNameString0ParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleActivity1171);
            lv_name_4_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleActivity1181); 

                    createLeafNode(grammarAccess.getActivityAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,19,FollowSets000.FOLLOW_19_in_ruleActivity1191); 

                    createLeafNode(grammarAccess.getActivityAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleActivity1201); 

                    createLeafNode(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:684:1: ( 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:684:3: 'action' ( (lv_ownedAttribute_9_0= ruleProperty ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleActivity1212); 

            	            createLeafNode(grammarAccess.getActivityAccess().getActionKeyword_7_0(), null); 
            	        
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:688:1: ( (lv_ownedAttribute_9_0= ruleProperty ) )
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:689:1: (lv_ownedAttribute_9_0= ruleProperty )
            	    {
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:689:1: (lv_ownedAttribute_9_0= ruleProperty )
            	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:690:3: lv_ownedAttribute_9_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getOwnedAttributePropertyParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleActivity1233);
            	    lv_ownedAttribute_9_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
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
            	    break loop7;
                }
            } while (true);

            match(input,13,FollowSets000.FOLLOW_13_in_ruleActivity1245); 

                    createLeafNode(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleClass_Impl
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:726:1: entryRuleClass_Impl returns [EObject current=null] : iv_ruleClass_Impl= ruleClass_Impl EOF ;
    public final EObject entryRuleClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:727:2: (iv_ruleClass_Impl= ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:728:2: iv_ruleClass_Impl= ruleClass_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClass_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1283);
            iv_ruleClass_Impl=ruleClass_Impl();
            _fsp--;

             current =iv_ruleClass_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl1293); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:735:1: ruleClass_Impl returns [EObject current=null] : ( () 'class' ( (lv_name_2_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )? '}' ) ;
    public final EObject ruleClass_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedAttribute_6_0 = null;

        EObject lv_ownedAttribute_8_0 = null;

        EObject lv_nestedClassifier_12_0 = null;

        EObject lv_nestedClassifier_14_0 = null;

        EObject lv_ownedOperation_18_0 = null;

        EObject lv_ownedOperation_20_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:740:6: ( ( () 'class' ( (lv_name_2_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:1: ( () 'class' ( (lv_name_2_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:1: ( () 'class' ( (lv_name_2_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:2: () 'class' ( (lv_name_2_0= ruleString0 ) ) '{' ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:742:5: 
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

            match(input,23,FollowSets000.FOLLOW_23_in_ruleClass_Impl1337); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getClassKeyword_1(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:756:1: ( (lv_name_2_0= ruleString0 ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:757:1: (lv_name_2_0= ruleString0 )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:757:1: (lv_name_2_0= ruleString0 )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:758:3: lv_name_2_0= ruleString0
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClass_Impl1358);
            lv_name_2_0=ruleString0();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
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

            match(input,11,FollowSets000.FOLLOW_11_in_ruleClass_Impl1368); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:784:1: ( 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:784:3: 'ownedAttribute' '{' ( (lv_ownedAttribute_6_0= ruleProperty ) ) ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )* '}'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleClass_Impl1379); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_4_0(), null); 
                        
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleClass_Impl1389); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_4_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:792:1: ( (lv_ownedAttribute_6_0= ruleProperty ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:793:1: (lv_ownedAttribute_6_0= ruleProperty )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:793:1: (lv_ownedAttribute_6_0= ruleProperty )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:794:3: lv_ownedAttribute_6_0= ruleProperty
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1410);
                    lv_ownedAttribute_6_0=ruleProperty();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedAttribute",
                    	        		lv_ownedAttribute_6_0, 
                    	        		"Property", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:816:2: ( ';' ( (lv_ownedAttribute_8_0= ruleProperty ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:816:4: ';' ( (lv_ownedAttribute_8_0= ruleProperty ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleClass_Impl1421); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_4_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:820:1: ( (lv_ownedAttribute_8_0= ruleProperty ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:821:1: (lv_ownedAttribute_8_0= ruleProperty )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:821:1: (lv_ownedAttribute_8_0= ruleProperty )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:822:3: lv_ownedAttribute_8_0= ruleProperty
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_4_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1442);
                    	    lv_ownedAttribute_8_0=ruleProperty();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_8_0, 
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
                    	    break loop8;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1454); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_4_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:3: ( 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:5: 'nestedClassifier' '{' ( (lv_nestedClassifier_12_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )* '}'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleClass_Impl1467); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_5_0(), null); 
                        
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleClass_Impl1477); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:856:1: ( (lv_nestedClassifier_12_0= ruleClassifier ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:857:1: (lv_nestedClassifier_12_0= ruleClassifier )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:857:1: (lv_nestedClassifier_12_0= ruleClassifier )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:858:3: lv_nestedClassifier_12_0= ruleClassifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1498);
                    lv_nestedClassifier_12_0=ruleClassifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"nestedClassifier",
                    	        		lv_nestedClassifier_12_0, 
                    	        		"Classifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:880:2: ( ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:880:4: ',' ( (lv_nestedClassifier_14_0= ruleClassifier ) )
                    	    {
                    	    match(input,27,FollowSets000.FOLLOW_27_in_ruleClass_Impl1509); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:884:1: ( (lv_nestedClassifier_14_0= ruleClassifier ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:885:1: (lv_nestedClassifier_14_0= ruleClassifier )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:885:1: (lv_nestedClassifier_14_0= ruleClassifier )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:886:3: lv_nestedClassifier_14_0= ruleClassifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_5_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1530);
                    	    lv_nestedClassifier_14_0=ruleClassifier();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"nestedClassifier",
                    	    	        		lv_nestedClassifier_14_0, 
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
                    	    break loop10;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1542); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:912:3: ( 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:912:5: 'ownedOperation' '{' ( (lv_ownedOperation_18_0= ruleOperation ) ) ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )* '}'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleClass_Impl1555); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_6_0(), null); 
                        
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleClass_Impl1565); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:920:1: ( (lv_ownedOperation_18_0= ruleOperation ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:921:1: (lv_ownedOperation_18_0= ruleOperation )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:921:1: (lv_ownedOperation_18_0= ruleOperation )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:922:3: lv_ownedOperation_18_0= ruleOperation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1586);
                    lv_ownedOperation_18_0=ruleOperation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedOperation",
                    	        		lv_ownedOperation_18_0, 
                    	        		"Operation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:944:2: ( ';' ( (lv_ownedOperation_20_0= ruleOperation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==25) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:944:4: ';' ( (lv_ownedOperation_20_0= ruleOperation ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleClass_Impl1597); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getSemicolonKeyword_6_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:948:1: ( (lv_ownedOperation_20_0= ruleOperation ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:949:1: (lv_ownedOperation_20_0= ruleOperation )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:949:1: (lv_ownedOperation_20_0= ruleOperation )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:950:3: lv_ownedOperation_20_0= ruleOperation
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_6_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1618);
                    	    lv_ownedOperation_20_0=ruleOperation();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedOperation",
                    	    	        		lv_ownedOperation_20_0, 
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
                    	    break loop12;
                        }
                    } while (true);

                    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1630); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6_4(), null); 
                        

                    }
                    break;

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1642); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:988:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:989:2: (iv_ruleInteger= ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:990:2: iv_ruleInteger= ruleInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1679);
            iv_ruleInteger=ruleInteger();
            _fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1690); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:997:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1002:6: (kw= 'Integer' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1004:2: kw= 'Integer'
            {
            kw=(Token)input.LT(1);
            match(input,29,FollowSets000.FOLLOW_29_in_ruleInteger1727); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1017:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1018:2: (iv_ruleString0= ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1019:2: iv_ruleString0= ruleString0 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getString0Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01767);
            iv_ruleString0=ruleString0();
            _fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01778); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1026:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1031:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1032:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1032:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1032:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1032:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01818); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1040:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleString01844); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1055:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1056:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1057:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1890);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1901); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1064:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1069:6: (kw= 'Boolean' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1071:2: kw= 'Boolean'
            {
            kw=(Token)input.LT(1);
            match(input,30,FollowSets000.FOLLOW_30_in_ruleBoolean1938); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1084:1: entryRuleUnlimitedNatural returns [String current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final String entryRuleUnlimitedNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1085:2: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1086:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural1978);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();
            _fsp--;

             current =iv_ruleUnlimitedNatural.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural1989); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1093:1: ruleUnlimitedNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnlimitedNatural' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1098:6: (kw= 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1100:2: kw= 'UnlimitedNatural'
            {
            kw=(Token)input.LT(1);
            match(input,31,FollowSets000.FOLLOW_31_in_ruleUnlimitedNatural2026); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1113:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1114:2: (iv_ruleEString= ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1115:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2066);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2077); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1122:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1127:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1128:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1128:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1128:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1128:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2117); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1136:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2143); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1153:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1154:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1155:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger2190);
            iv_ruleLiteralInteger=ruleLiteralInteger();
            _fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger2200); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1162:1: ruleLiteralInteger returns [EObject current=null] : ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1167:6: ( ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1168:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1168:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1168:2: () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1168:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:5: 
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

            match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralInteger2244); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLiteralInteger2254); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1187:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1187:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralInteger2265); 

                            createLeafNode(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1191:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1192:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1192:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1193:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralInteger2286);
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

            match(input,34,FollowSets000.FOLLOW_34_in_ruleLiteralInteger2298); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1219:1: ( (lv_value_6_0= ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1220:1: (lv_value_6_0= ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1220:1: (lv_value_6_0= ruleInteger )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1221:3: lv_value_6_0= ruleInteger
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleLiteralInteger2319);
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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralInteger2329); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1255:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1256:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1257:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString2365);
            iv_ruleLiteralString=ruleLiteralString();
            _fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString2375); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1264:1: ruleLiteralString returns [EObject current=null] : ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1269:6: ( ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:2: () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:5: 
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

            match(input,35,FollowSets000.FOLLOW_35_in_ruleLiteralString2419); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLiteralString2429); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1289:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1289:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralString2440); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1293:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1294:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1294:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1295:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2461);
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1317:4: ( 'value' ( (lv_value_6_0= ruleString0 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1317:6: 'value' ( (lv_value_6_0= ruleString0 ) )
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleLiteralString2474); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1321:1: ( (lv_value_6_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1322:1: (lv_value_6_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1322:1: (lv_value_6_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1323:3: lv_value_6_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2495);
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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralString2507); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1357:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1358:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1359:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2543);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();
            _fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean2553); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1366:1: ruleLiteralBoolean returns [EObject current=null] : ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1371:6: ( ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1372:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1372:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1372:2: () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1372:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1373:5: 
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleLiteralBoolean2597); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLiteralBoolean2607); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1391:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1391:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralBoolean2618); 

                            createLeafNode(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1395:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1396:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1396:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1397:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralBoolean2639);
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

            match(input,34,FollowSets000.FOLLOW_34_in_ruleLiteralBoolean2651); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1423:1: ( (lv_value_6_0= ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1424:1: (lv_value_6_0= ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1424:1: (lv_value_6_0= ruleBoolean )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1425:3: lv_value_6_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteralBoolean2672);
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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralBoolean2682); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1459:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1460:2: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1461:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2718);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();
            _fsp--;

             current =iv_ruleLiteralUnlimitedNatural; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2728); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1468:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1473:6: ( ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1474:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1474:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1474:2: () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1474:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1475:5: 
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

            match(input,37,FollowSets000.FOLLOW_37_in_ruleLiteralUnlimitedNatural2772); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLiteralUnlimitedNatural2782); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1493:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1493:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralUnlimitedNatural2793); 

                            createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1497:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1498:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1498:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1499:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2814);
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

            match(input,34,FollowSets000.FOLLOW_34_in_ruleLiteralUnlimitedNatural2826); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1525:1: ( (lv_value_6_0= ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1526:1: (lv_value_6_0= ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1526:1: (lv_value_6_0= ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1527:3: lv_value_6_0= ruleUnlimitedNatural
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural2847);
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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralUnlimitedNatural2857); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1561:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1562:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1563:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralNullRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull2893);
            iv_ruleLiteralNull=ruleLiteralNull();
            _fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull2903); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1570:1: ruleLiteralNull returns [EObject current=null] : ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1575:6: ( ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:2: () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1576:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1577:5: 
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

            match(input,38,FollowSets000.FOLLOW_38_in_ruleLiteralNull2947); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1(), null); 
                
            match(input,11,FollowSets000.FOLLOW_11_in_ruleLiteralNull2957); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1595:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1595:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralNull2968); 

                            createLeafNode(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1599:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1600:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1600:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1601:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralNull2989);
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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleLiteralNull3001); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_rulePackageableElement132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rulePackageableElement159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rulePackageableElement186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rulePackageableElement213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_ruleModel313 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleModel323 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel333 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel355 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel376 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_13_in_ruleModel389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_ruleClassifier487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_ruleProperty577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl613 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePackage_Impl667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_rulePackage_Impl688 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_rulePackage_Impl698 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl720 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl741 = new BitSet(new long[]{0x0000000000906030L});
        public static final BitSet FOLLOW_13_in_rulePackage_Impl754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_Impl800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleProperty_Impl844 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleProperty_Impl865 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProperty_Impl875 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty_Impl898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOperation988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOperation1009 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOperation1019 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleOperation1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity1065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleActivity1119 = new BitSet(new long[]{0x0000000000200030L});
        public static final BitSet FOLLOW_21_in_ruleActivity1130 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActivity1148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleActivity1171 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleActivity1181 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleActivity1191 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleActivity1201 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_22_in_ruleActivity1212 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleActivity1233 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_13_in_ruleActivity1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleClass_Impl1337 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClass_Impl1358 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleClass_Impl1368 = new BitSet(new long[]{0x0000000015002000L});
        public static final BitSet FOLLOW_24_in_ruleClass_Impl1379 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleClass_Impl1389 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1410 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_25_in_ruleClass_Impl1421 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1442 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1454 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_26_in_ruleClass_Impl1467 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleClass_Impl1477 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1498 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_27_in_ruleClass_Impl1509 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1530 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1542 = new BitSet(new long[]{0x0000000010002000L});
        public static final BitSet FOLLOW_28_in_ruleClass_Impl1555 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleClass_Impl1565 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1586 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_25_in_ruleClass_Impl1597 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1618 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1630 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInteger1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleString01844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1890 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBoolean1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural1978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleUnlimitedNatural2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger2190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger2200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralInteger2244 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleLiteralInteger2254 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralInteger2265 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralInteger2286 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLiteralInteger2298 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleLiteralInteger2319 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralInteger2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString2365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLiteralString2419 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleLiteralString2429 = new BitSet(new long[]{0x0000000600002000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralString2440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2461 = new BitSet(new long[]{0x0000000400002000L});
        public static final BitSet FOLLOW_34_in_ruleLiteralString2474 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2495 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralString2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLiteralBoolean2597 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleLiteralBoolean2607 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralBoolean2618 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralBoolean2639 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLiteralBoolean2651 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteralBoolean2672 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralBoolean2682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLiteralUnlimitedNatural2772 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleLiteralUnlimitedNatural2782 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralUnlimitedNatural2793 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2814 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleLiteralUnlimitedNatural2826 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural2847 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralUnlimitedNatural2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull2893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull2903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLiteralNull2947 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleLiteralNull2957 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralNull2968 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralNull2989 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLiteralNull3001 = new BitSet(new long[]{0x0000000000000002L});
    }


}