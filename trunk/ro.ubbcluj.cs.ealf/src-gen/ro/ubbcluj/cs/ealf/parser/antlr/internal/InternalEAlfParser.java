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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'packagedElement'", "'{'", "','", "'}'", "'Package'", "'name'", "'visibility'", "'Property'", "'isStatic'", "'type'", "'Operation'", "'isAbstract'", "'concurrency'", "'Class'", "'isActive'", "'ownedAttribute'", "'nestedClassifier'", "'ownedOperation'", "'Integer'", "'Boolean'", "'UnlimitedNatural'", "'LiteralInteger'", "'value'", "'LiteralString'", "'LiteralBoolean'", "'LiteralUnlimitedNatural'", "'LiteralNull'", "'public'", "'private'", "'protected'", "'package'", "'sequential'", "'guarded'", "'concurrent'"
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:87:1: ruleModel returns [EObject current=null] : ( 'packagedElement' '{' ( (lv_packagedElement_2_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )* '}' )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packagedElement_2_0 = null;

        EObject lv_packagedElement_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:92:6: ( ( 'packagedElement' '{' ( (lv_packagedElement_2_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )* '}' )? )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: ( 'packagedElement' '{' ( (lv_packagedElement_2_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )* '}' )?
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:1: ( 'packagedElement' '{' ( (lv_packagedElement_2_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )* '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:93:3: 'packagedElement' '{' ( (lv_packagedElement_2_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )* '}'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_ruleModel120); 

                            createLeafNode(grammarAccess.getModelAccess().getPackagedElementKeyword_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleModel130); 

                            createLeafNode(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:101:1: ( (lv_packagedElement_2_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:102:1: (lv_packagedElement_2_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:102:1: (lv_packagedElement_2_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:103:3: lv_packagedElement_2_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel151);
                    lv_packagedElement_2_0=rulePackageableElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"packagedElement",
                    	        		lv_packagedElement_2_0, 
                    	        		"PackageableElement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:125:2: ( ',' ( (lv_packagedElement_4_0= rulePackageableElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:125:4: ',' ( (lv_packagedElement_4_0= rulePackageableElement ) )
                    	    {
                    	    match(input,13,FollowSets000.FOLLOW_13_in_ruleModel162); 

                    	            createLeafNode(grammarAccess.getModelAccess().getCommaKeyword_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:129:1: ( (lv_packagedElement_4_0= rulePackageableElement ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:130:1: (lv_packagedElement_4_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:130:1: (lv_packagedElement_4_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:131:3: lv_packagedElement_4_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_ruleModel183);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,14,FollowSets000.FOLLOW_14_in_ruleModel195); 

                            createLeafNode(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4(), null); 
                        

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:165:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:166:2: (iv_rulePackageableElement= rulePackageableElement EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:167:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageableElementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_entryRulePackageableElement232);
            iv_rulePackageableElement=rulePackageableElement();
            _fsp--;

             current =iv_rulePackageableElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackageableElement242); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:174:1: rulePackageableElement returns [EObject current=null] : (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_Impl_0 = null;

        EObject this_Class_Impl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:179:6: ( (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:180:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:180:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("180:1: (this_Package_Impl_0= rulePackage_Impl | this_Class_Impl_1= ruleClass_Impl )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:181:5: this_Package_Impl_0= rulePackage_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getPackage_ImplParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_rulePackageableElement289);
                    this_Package_Impl_0=rulePackage_Impl();
                    _fsp--;

                     
                            current = this_Package_Impl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:191:5: this_Class_Impl_1= ruleClass_Impl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPackageableElementAccess().getClass_ImplParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_rulePackageableElement316);
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:213:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:214:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:215:2: iv_ruleClassifier= ruleClassifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClassifierRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier357);
            iv_ruleClassifier=ruleClassifier();
            _fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier367); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:222:1: ruleClassifier returns [EObject current=null] : this_Class_Impl_0= ruleClass_Impl ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:227:6: (this_Class_Impl_0= ruleClass_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:229:5: this_Class_Impl_0= ruleClass_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getClassifierAccess().getClass_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_ruleClassifier413);
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:245:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:246:2: (iv_ruleProperty= ruleProperty EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:247:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty447);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty457); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:254:1: ruleProperty returns [EObject current=null] : this_Property_Impl_0= ruleProperty_Impl ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Property_Impl_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:259:6: (this_Property_Impl_0= ruleProperty_Impl )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:261:5: this_Property_Impl_0= ruleProperty_Impl
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getProperty_ImplParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_ruleProperty503);
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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:279:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:280:2: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:281:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackage_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl539);
            iv_rulePackage_Impl=rulePackage_Impl();
            _fsp--;

             current =iv_rulePackage_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage_Impl549); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:288:1: rulePackage_Impl returns [EObject current=null] : ( () 'Package' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )? '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_visibility_6_0 = null;

        EObject lv_packagedElement_9_0 = null;

        EObject lv_packagedElement_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:293:6: ( ( () 'Package' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:1: ( () 'Package' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:1: ( () 'Package' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:2: () 'Package' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:294:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:295:5: 
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

            match(input,15,FollowSets000.FOLLOW_15_in_rulePackage_Impl593); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getPackageKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_rulePackage_Impl603); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:313:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:313:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rulePackage_Impl614); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:317:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:318:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:318:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:319:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_rulePackage_Impl635);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:341:4: ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:341:6: 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rulePackage_Impl648); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getVisibilityKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:345:1: ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:346:1: (lv_visibility_6_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:346:1: (lv_visibility_6_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:347:3: lv_visibility_6_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_rulePackage_Impl669);
                    lv_visibility_6_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_6_0, 
                    	        		"VisibilityKind", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:369:4: ( 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:369:6: 'packagedElement' '{' ( (lv_packagedElement_9_0= rulePackageableElement ) ) ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )* '}'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rulePackage_Impl682); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getPackagedElementKeyword_5_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_rulePackage_Impl692); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:377:1: ( (lv_packagedElement_9_0= rulePackageableElement ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:378:1: (lv_packagedElement_9_0= rulePackageableElement )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:378:1: (lv_packagedElement_9_0= rulePackageableElement )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:379:3: lv_packagedElement_9_0= rulePackageableElement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl713);
                    lv_packagedElement_9_0=rulePackageableElement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"packagedElement",
                    	        		lv_packagedElement_9_0, 
                    	        		"PackageableElement", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:401:2: ( ',' ( (lv_packagedElement_11_0= rulePackageableElement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:401:4: ',' ( (lv_packagedElement_11_0= rulePackageableElement ) )
                    	    {
                    	    match(input,13,FollowSets000.FOLLOW_13_in_rulePackage_Impl724); 

                    	            createLeafNode(grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:405:1: ( (lv_packagedElement_11_0= rulePackageableElement ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:406:1: (lv_packagedElement_11_0= rulePackageableElement )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:406:1: (lv_packagedElement_11_0= rulePackageableElement )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:407:3: lv_packagedElement_11_0= rulePackageableElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPackage_ImplAccess().getPackagedElementPackageableElementParserRuleCall_5_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackageableElement_in_rulePackage_Impl745);
                    	    lv_packagedElement_11_0=rulePackageableElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPackage_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"packagedElement",
                    	    	        		lv_packagedElement_11_0, 
                    	    	        		"PackageableElement", 
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
                    	    break loop6;
                        }
                    } while (true);

                    match(input,14,FollowSets000.FOLLOW_14_in_rulePackage_Impl757); 

                            createLeafNode(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            match(input,14,FollowSets000.FOLLOW_14_in_rulePackage_Impl769); 

                    createLeafNode(grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:445:1: entryRuleProperty_Impl returns [EObject current=null] : iv_ruleProperty_Impl= ruleProperty_Impl EOF ;
    public final EObject entryRuleProperty_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:446:2: (iv_ruleProperty_Impl= ruleProperty_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:447:2: iv_ruleProperty_Impl= ruleProperty_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProperty_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl805);
            iv_ruleProperty_Impl=ruleProperty_Impl();
            _fsp--;

             current =iv_ruleProperty_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_Impl815); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:454:1: ruleProperty_Impl returns [EObject current=null] : ( () 'Property' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'type' ( ( ruleEString ) ) )? '}' ) ;
    public final EObject ruleProperty_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_visibility_6_0 = null;

        AntlrDatatypeRuleToken lv_isStatic_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:459:6: ( ( () 'Property' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'type' ( ( ruleEString ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:1: ( () 'Property' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'type' ( ( ruleEString ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:1: ( () 'Property' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'type' ( ( ruleEString ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:2: () 'Property' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'type' ( ( ruleEString ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:460:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:461:5: 
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleProperty_Impl859); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getPropertyKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty_Impl869); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:479:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:479:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleProperty_Impl880); 

                            createLeafNode(grammarAccess.getProperty_ImplAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:483:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:484:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:484:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:485:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleProperty_Impl901);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:507:4: ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:507:6: 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleProperty_Impl914); 

                            createLeafNode(grammarAccess.getProperty_ImplAccess().getVisibilityKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:511:1: ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:512:1: (lv_visibility_6_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:512:1: (lv_visibility_6_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:513:3: lv_visibility_6_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleProperty_Impl935);
                    lv_visibility_6_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_6_0, 
                    	        		"VisibilityKind", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:535:4: ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:535:6: 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) )
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleProperty_Impl948); 

                            createLeafNode(grammarAccess.getProperty_ImplAccess().getIsStaticKeyword_5_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:539:1: ( (lv_isStatic_8_0= ruleBoolean ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:540:1: (lv_isStatic_8_0= ruleBoolean )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:540:1: (lv_isStatic_8_0= ruleBoolean )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:541:3: lv_isStatic_8_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getIsStaticBooleanParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleProperty_Impl969);
                    lv_isStatic_8_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isStatic",
                    	        		lv_isStatic_8_0, 
                    	        		"Boolean", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:563:4: ( 'type' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:563:6: 'type' ( ( ruleEString ) )
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleProperty_Impl982); 

                            createLeafNode(grammarAccess.getProperty_ImplAccess().getTypeKeyword_6_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:567:1: ( ( ruleEString ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:568:1: ( ruleEString )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:568:1: ( ruleEString )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:569:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProperty_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProperty_ImplAccess().getTypeTypeCrossReference_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty_Impl1005);
                    ruleEString();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty_Impl1017); 

                    createLeafNode(grammarAccess.getProperty_ImplAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:595:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:596:2: (iv_ruleOperation= ruleOperation EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:597:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1053);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1063); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:604:1: ruleOperation returns [EObject current=null] : ( () 'Operation' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )? ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )? '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_visibility_6_0 = null;

        AntlrDatatypeRuleToken lv_isStatic_8_0 = null;

        AntlrDatatypeRuleToken lv_isAbstract_10_0 = null;

        Enumerator lv_concurrency_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:609:6: ( ( () 'Operation' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )? ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:610:1: ( () 'Operation' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )? ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:610:1: ( () 'Operation' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )? ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:610:2: () 'Operation' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )? ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )? ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:610:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:611:5: 
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

            match(input,21,FollowSets000.FOLLOW_21_in_ruleOperation1107); 

                    createLeafNode(grammarAccess.getOperationAccess().getOperationKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation1117); 

                    createLeafNode(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:629:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:629:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation1128); 

                            createLeafNode(grammarAccess.getOperationAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:633:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:634:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:634:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:635:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleOperation1149);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:657:4: ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:657:6: 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleOperation1162); 

                            createLeafNode(grammarAccess.getOperationAccess().getVisibilityKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:661:1: ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:662:1: (lv_visibility_6_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:662:1: (lv_visibility_6_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:663:3: lv_visibility_6_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleOperation1183);
                    lv_visibility_6_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_6_0, 
                    	        		"VisibilityKind", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:685:4: ( 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:685:6: 'isStatic' ( (lv_isStatic_8_0= ruleBoolean ) )
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleOperation1196); 

                            createLeafNode(grammarAccess.getOperationAccess().getIsStaticKeyword_5_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:689:1: ( (lv_isStatic_8_0= ruleBoolean ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:690:1: (lv_isStatic_8_0= ruleBoolean )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:690:1: (lv_isStatic_8_0= ruleBoolean )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:691:3: lv_isStatic_8_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getIsStaticBooleanParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleOperation1217);
                    lv_isStatic_8_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isStatic",
                    	        		lv_isStatic_8_0, 
                    	        		"Boolean", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:713:4: ( 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:713:6: 'isAbstract' ( (lv_isAbstract_10_0= ruleBoolean ) )
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleOperation1230); 

                            createLeafNode(grammarAccess.getOperationAccess().getIsAbstractKeyword_6_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:717:1: ( (lv_isAbstract_10_0= ruleBoolean ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:718:1: (lv_isAbstract_10_0= ruleBoolean )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:718:1: (lv_isAbstract_10_0= ruleBoolean )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:719:3: lv_isAbstract_10_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getIsAbstractBooleanParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleOperation1251);
                    lv_isAbstract_10_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isAbstract",
                    	        		lv_isAbstract_10_0, 
                    	        		"Boolean", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:4: ( 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:741:6: 'concurrency' ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) )
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleOperation1264); 

                            createLeafNode(grammarAccess.getOperationAccess().getConcurrencyKeyword_7_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:745:1: ( (lv_concurrency_12_0= ruleCallConcurrencyKind ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:746:1: (lv_concurrency_12_0= ruleCallConcurrencyKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:746:1: (lv_concurrency_12_0= ruleCallConcurrencyKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:747:3: lv_concurrency_12_0= ruleCallConcurrencyKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getConcurrencyCallConcurrencyKindEnumRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCallConcurrencyKind_in_ruleOperation1285);
                    lv_concurrency_12_0=ruleCallConcurrencyKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"concurrency",
                    	        		lv_concurrency_12_0, 
                    	        		"CallConcurrencyKind", 
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleOperation1297); 

                    createLeafNode(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:781:1: entryRuleClass_Impl returns [EObject current=null] : iv_ruleClass_Impl= ruleClass_Impl EOF ;
    public final EObject entryRuleClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_Impl = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:782:2: (iv_ruleClass_Impl= ruleClass_Impl EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:783:2: iv_ruleClass_Impl= ruleClass_Impl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClass_ImplRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1333);
            iv_ruleClass_Impl=ruleClass_Impl();
            _fsp--;

             current =iv_ruleClass_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass_Impl1343); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:790:1: ruleClass_Impl returns [EObject current=null] : ( () 'Class' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )? ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )? ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )? '}' ) ;
    public final EObject ruleClass_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_visibility_6_0 = null;

        AntlrDatatypeRuleToken lv_isAbstract_8_0 = null;

        AntlrDatatypeRuleToken lv_isActive_10_0 = null;

        EObject lv_ownedAttribute_13_0 = null;

        EObject lv_ownedAttribute_15_0 = null;

        EObject lv_nestedClassifier_19_0 = null;

        EObject lv_nestedClassifier_21_0 = null;

        EObject lv_ownedOperation_25_0 = null;

        EObject lv_ownedOperation_27_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:795:6: ( ( () 'Class' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )? ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )? ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:796:1: ( () 'Class' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )? ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )? ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:796:1: ( () 'Class' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )? ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )? ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:796:2: () 'Class' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )? ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )? ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )? ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )? ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )? ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:796:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:797:5: 
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

            match(input,24,FollowSets000.FOLLOW_24_in_ruleClass_Impl1387); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getClassKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1397); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:815:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:815:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleClass_Impl1408); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:819:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:820:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:820:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:821:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleClass_Impl1429);
                    lv_name_4_0=ruleString0();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:843:4: ( 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:843:6: 'visibility' ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleClass_Impl1442); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getVisibilityKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:847:1: ( (lv_visibility_6_0= ruleVisibilityKind ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:1: (lv_visibility_6_0= ruleVisibilityKind )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:848:1: (lv_visibility_6_0= ruleVisibilityKind )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:849:3: lv_visibility_6_0= ruleVisibilityKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibilityKind_in_ruleClass_Impl1463);
                    lv_visibility_6_0=ruleVisibilityKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"visibility",
                    	        		lv_visibility_6_0, 
                    	        		"VisibilityKind", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:871:4: ( 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:871:6: 'isAbstract' ( (lv_isAbstract_8_0= ruleBoolean ) )
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleClass_Impl1476); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getIsAbstractKeyword_5_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:875:1: ( (lv_isAbstract_8_0= ruleBoolean ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:876:1: (lv_isAbstract_8_0= ruleBoolean )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:876:1: (lv_isAbstract_8_0= ruleBoolean )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:877:3: lv_isAbstract_8_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getIsAbstractBooleanParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleClass_Impl1497);
                    lv_isAbstract_8_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isAbstract",
                    	        		lv_isAbstract_8_0, 
                    	        		"Boolean", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:899:4: ( 'isActive' ( (lv_isActive_10_0= ruleBoolean ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:899:6: 'isActive' ( (lv_isActive_10_0= ruleBoolean ) )
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleClass_Impl1510); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getIsActiveKeyword_6_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:903:1: ( (lv_isActive_10_0= ruleBoolean ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:904:1: (lv_isActive_10_0= ruleBoolean )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:904:1: (lv_isActive_10_0= ruleBoolean )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:905:3: lv_isActive_10_0= ruleBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getIsActiveBooleanParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleClass_Impl1531);
                    lv_isActive_10_0=ruleBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isActive",
                    	        		lv_isActive_10_0, 
                    	        		"Boolean", 
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:927:4: ( 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:927:6: 'ownedAttribute' '{' ( (lv_ownedAttribute_13_0= ruleProperty ) ) ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )* '}'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleClass_Impl1544); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedAttributeKeyword_7_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1554); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:935:1: ( (lv_ownedAttribute_13_0= ruleProperty ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:936:1: (lv_ownedAttribute_13_0= ruleProperty )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:936:1: (lv_ownedAttribute_13_0= ruleProperty )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:937:3: lv_ownedAttribute_13_0= ruleProperty
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1575);
                    lv_ownedAttribute_13_0=ruleProperty();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedAttribute",
                    	        		lv_ownedAttribute_13_0, 
                    	        		"Property", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:959:2: ( ',' ( (lv_ownedAttribute_15_0= ruleProperty ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:959:4: ',' ( (lv_ownedAttribute_15_0= ruleProperty ) )
                    	    {
                    	    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1586); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_7_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:963:1: ( (lv_ownedAttribute_15_0= ruleProperty ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:964:1: (lv_ownedAttribute_15_0= ruleProperty )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:964:1: (lv_ownedAttribute_15_0= ruleProperty )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:965:3: lv_ownedAttribute_15_0= ruleProperty
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedAttributePropertyParserRuleCall_7_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleClass_Impl1607);
                    	    lv_ownedAttribute_15_0=ruleProperty();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedAttribute",
                    	    	        		lv_ownedAttribute_15_0, 
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
                    	    break loop21;
                        }
                    } while (true);

                    match(input,14,FollowSets000.FOLLOW_14_in_ruleClass_Impl1619); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_7_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:991:3: ( 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:991:5: 'nestedClassifier' '{' ( (lv_nestedClassifier_19_0= ruleClassifier ) ) ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )* '}'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleClass_Impl1632); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getNestedClassifierKeyword_8_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1642); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_8_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:999:1: ( (lv_nestedClassifier_19_0= ruleClassifier ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1000:1: (lv_nestedClassifier_19_0= ruleClassifier )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1000:1: (lv_nestedClassifier_19_0= ruleClassifier )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1001:3: lv_nestedClassifier_19_0= ruleClassifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1663);
                    lv_nestedClassifier_19_0=ruleClassifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"nestedClassifier",
                    	        		lv_nestedClassifier_19_0, 
                    	        		"Classifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1023:2: ( ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1023:4: ',' ( (lv_nestedClassifier_21_0= ruleClassifier ) )
                    	    {
                    	    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1674); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_8_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1027:1: ( (lv_nestedClassifier_21_0= ruleClassifier ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1028:1: (lv_nestedClassifier_21_0= ruleClassifier )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1028:1: (lv_nestedClassifier_21_0= ruleClassifier )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1029:3: lv_nestedClassifier_21_0= ruleClassifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getNestedClassifierClassifierParserRuleCall_8_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleClass_Impl1695);
                    	    lv_nestedClassifier_21_0=ruleClassifier();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"nestedClassifier",
                    	    	        		lv_nestedClassifier_21_0, 
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
                    	    break loop23;
                        }
                    } while (true);

                    match(input,14,FollowSets000.FOLLOW_14_in_ruleClass_Impl1707); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_8_4(), null); 
                        

                    }
                    break;

            }

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1055:3: ( 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1055:5: 'ownedOperation' '{' ( (lv_ownedOperation_25_0= ruleOperation ) ) ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )* '}'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleClass_Impl1720); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getOwnedOperationKeyword_9_0(), null); 
                        
                    match(input,12,FollowSets000.FOLLOW_12_in_ruleClass_Impl1730); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_9_1(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1063:1: ( (lv_ownedOperation_25_0= ruleOperation ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1064:1: (lv_ownedOperation_25_0= ruleOperation )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1064:1: (lv_ownedOperation_25_0= ruleOperation )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1065:3: lv_ownedOperation_25_0= ruleOperation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1751);
                    lv_ownedOperation_25_0=ruleOperation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ownedOperation",
                    	        		lv_ownedOperation_25_0, 
                    	        		"Operation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1087:2: ( ',' ( (lv_ownedOperation_27_0= ruleOperation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==13) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1087:4: ',' ( (lv_ownedOperation_27_0= ruleOperation ) )
                    	    {
                    	    match(input,13,FollowSets000.FOLLOW_13_in_ruleClass_Impl1762); 

                    	            createLeafNode(grammarAccess.getClass_ImplAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1091:1: ( (lv_ownedOperation_27_0= ruleOperation ) )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1092:1: (lv_ownedOperation_27_0= ruleOperation )
                    	    {
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1092:1: (lv_ownedOperation_27_0= ruleOperation )
                    	    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1093:3: lv_ownedOperation_27_0= ruleOperation
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getClass_ImplAccess().getOwnedOperationOperationParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass_Impl1783);
                    	    lv_ownedOperation_27_0=ruleOperation();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getClass_ImplRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"ownedOperation",
                    	    	        		lv_ownedOperation_27_0, 
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
                    	    break loop25;
                        }
                    } while (true);

                    match(input,14,FollowSets000.FOLLOW_14_in_ruleClass_Impl1795); 

                            createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_9_4(), null); 
                        

                    }
                    break;

            }

            match(input,14,FollowSets000.FOLLOW_14_in_ruleClass_Impl1807); 

                    createLeafNode(grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_10(), null); 
                

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1131:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1132:2: (iv_ruleInteger= ruleInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1133:2: iv_ruleInteger= ruleInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1844);
            iv_ruleInteger=ruleInteger();
            _fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1855); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1140:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1145:6: (kw= 'Integer' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1147:2: kw= 'Integer'
            {
            kw=(Token)input.LT(1);
            match(input,29,FollowSets000.FOLLOW_29_in_ruleInteger1892); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1160:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1161:2: (iv_ruleString0= ruleString0 EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1162:2: iv_ruleString0= ruleString0 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getString0Rule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01932);
            iv_ruleString0=ruleString0();
            _fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01943); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1169:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1174:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1175:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1175:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1175:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1175:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01983); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getString0Access().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1183:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleString02009); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1198:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1199:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1200:2: iv_ruleBoolean= ruleBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean2055);
            iv_ruleBoolean=ruleBoolean();
            _fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean2066); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1207:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1212:6: (kw= 'Boolean' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1214:2: kw= 'Boolean'
            {
            kw=(Token)input.LT(1);
            match(input,30,FollowSets000.FOLLOW_30_in_ruleBoolean2103); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1227:1: entryRuleUnlimitedNatural returns [String current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final String entryRuleUnlimitedNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1228:2: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1229:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural2143);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();
            _fsp--;

             current =iv_ruleUnlimitedNatural.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNatural2154); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1236:1: ruleUnlimitedNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnlimitedNatural' ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1241:6: (kw= 'UnlimitedNatural' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1243:2: kw= 'UnlimitedNatural'
            {
            kw=(Token)input.LT(1);
            match(input,31,FollowSets000.FOLLOW_31_in_ruleUnlimitedNatural2191); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1256:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1257:2: (iv_ruleEString= ruleEString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1258:2: iv_ruleEString= ruleEString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2231);
            iv_ruleEString=ruleEString();
            _fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2242); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1265:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1270:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1271:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1271:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2282); 

                    		current.merge(this_STRING_0);
                        
                     
                        createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1279:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2308); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1296:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1297:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1298:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralIntegerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger2355);
            iv_ruleLiteralInteger=ruleLiteralInteger();
            _fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger2365); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1305:1: ruleLiteralInteger returns [EObject current=null] : ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1310:6: ( ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1311:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1311:1: ( () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1311:2: () 'LiteralInteger' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleInteger ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1311:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1312:5: 
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

            match(input,32,FollowSets000.FOLLOW_32_in_ruleLiteralInteger2409); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralInteger2419); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1330:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1330:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralInteger2430); 

                            createLeafNode(grammarAccess.getLiteralIntegerAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1334:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1335:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1335:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1336:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralInteger2451);
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

            match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralInteger2463); 

                    createLeafNode(grammarAccess.getLiteralIntegerAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1362:1: ( (lv_value_6_0= ruleInteger ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1363:1: (lv_value_6_0= ruleInteger )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1363:1: (lv_value_6_0= ruleInteger )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1364:3: lv_value_6_0= ruleInteger
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralIntegerAccess().getValueIntegerParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleLiteralInteger2484);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleLiteralInteger2494); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1398:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1399:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1400:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString2530);
            iv_ruleLiteralString=ruleLiteralString();
            _fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString2540); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1407:1: ruleLiteralString returns [EObject current=null] : ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1412:6: ( ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1413:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1413:1: ( () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1413:2: () 'LiteralString' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? ( 'value' ( (lv_value_6_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1413:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1414:5: 
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

            match(input,34,FollowSets000.FOLLOW_34_in_ruleLiteralString2584); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralString2594); 

                    createLeafNode(grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1432:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1432:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralString2605); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1436:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1437:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1437:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1438:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2626);
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

            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1460:4: ( 'value' ( (lv_value_6_0= ruleString0 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1460:6: 'value' ( (lv_value_6_0= ruleString0 ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralString2639); 

                            createLeafNode(grammarAccess.getLiteralStringAccess().getValueKeyword_4_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1464:1: ( (lv_value_6_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1465:1: (lv_value_6_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1465:1: (lv_value_6_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1466:3: lv_value_6_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralStringAccess().getValueString0ParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralString2660);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleLiteralString2672); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1500:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1501:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1502:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2708);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();
            _fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean2718); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1509:1: ruleLiteralBoolean returns [EObject current=null] : ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1514:6: ( ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1515:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1515:1: ( () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1515:2: () 'LiteralBoolean' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleBoolean ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1515:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1516:5: 
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

            match(input,35,FollowSets000.FOLLOW_35_in_ruleLiteralBoolean2762); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralBoolean2772); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1534:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1534:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralBoolean2783); 

                            createLeafNode(grammarAccess.getLiteralBooleanAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1538:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1539:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1540:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralBoolean2804);
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

            match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralBoolean2816); 

                    createLeafNode(grammarAccess.getLiteralBooleanAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1566:1: ( (lv_value_6_0= ruleBoolean ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1567:1: (lv_value_6_0= ruleBoolean )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1567:1: (lv_value_6_0= ruleBoolean )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1568:3: lv_value_6_0= ruleBoolean
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleLiteralBoolean2837);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleLiteralBoolean2847); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1602:1: entryRuleLiteralUnlimitedNatural returns [EObject current=null] : iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF ;
    public final EObject entryRuleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUnlimitedNatural = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1603:2: (iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1604:2: iv_ruleLiteralUnlimitedNatural= ruleLiteralUnlimitedNatural EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2883);
            iv_ruleLiteralUnlimitedNatural=ruleLiteralUnlimitedNatural();
            _fsp--;

             current =iv_ruleLiteralUnlimitedNatural; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2893); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1611:1: ruleLiteralUnlimitedNatural returns [EObject current=null] : ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) ;
    public final EObject ruleLiteralUnlimitedNatural() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1616:6: ( ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1617:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1617:1: ( () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1617:2: () 'LiteralUnlimitedNatural' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? 'value' ( (lv_value_6_0= ruleUnlimitedNatural ) ) '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1617:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1618:5: 
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleLiteralUnlimitedNatural2937); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLiteralUnlimitedNaturalKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralUnlimitedNatural2947); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1636:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1636:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralUnlimitedNatural2958); 

                            createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1640:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1641:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1641:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1642:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2979);
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

            match(input,33,FollowSets000.FOLLOW_33_in_ruleLiteralUnlimitedNatural2991); 

                    createLeafNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueKeyword_4(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1668:1: ( (lv_value_6_0= ruleUnlimitedNatural ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1669:1: (lv_value_6_0= ruleUnlimitedNatural )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1669:1: (lv_value_6_0= ruleUnlimitedNatural )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1670:3: lv_value_6_0= ruleUnlimitedNatural
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLiteralUnlimitedNaturalAccess().getValueUnlimitedNaturalParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural3012);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleLiteralUnlimitedNatural3022); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1704:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1705:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1706:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralNullRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull3058);
            iv_ruleLiteralNull=ruleLiteralNull();
            _fsp--;

             current =iv_ruleLiteralNull; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralNull3068); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1713:1: ruleLiteralNull returns [EObject current=null] : ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1718:6: ( ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1719:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1719:1: ( () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}' )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1719:2: () 'LiteralNull' '{' ( 'name' ( (lv_name_4_0= ruleString0 ) ) )? '}'
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1719:2: ()
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1720:5: 
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

            match(input,37,FollowSets000.FOLLOW_37_in_ruleLiteralNull3112); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLiteralNullKeyword_1(), null); 
                
            match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralNull3122); 

                    createLeafNode(grammarAccess.getLiteralNullAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1738:1: ( 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1738:3: 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralNull3133); 

                            createLeafNode(grammarAccess.getLiteralNullAccess().getNameKeyword_3_0(), null); 
                        
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1742:1: ( (lv_name_4_0= ruleString0 ) )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1743:1: (lv_name_4_0= ruleString0 )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1743:1: (lv_name_4_0= ruleString0 )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1744:3: lv_name_4_0= ruleString0
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralNullAccess().getNameString0ParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLiteralNull3154);
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleLiteralNull3166); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1778:1: ruleVisibilityKind returns [Enumerator current=null] : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1782:6: ( ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1783:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1783:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt35=1;
                }
                break;
            case 39:
                {
                alt35=2;
                }
                break;
            case 40:
                {
                alt35=3;
                }
                break;
            case 41:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1783:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1783:2: ( 'public' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1783:2: ( 'public' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1783:4: 'public'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleVisibilityKind3214); 

                            current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1789:6: ( 'private' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1789:6: ( 'private' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1789:8: 'private'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleVisibilityKind3229); 

                            current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1795:6: ( 'protected' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1795:6: ( 'protected' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1795:8: 'protected'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleVisibilityKind3244); 

                            current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1801:6: ( 'package' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1801:6: ( 'package' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1801:8: 'package'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleVisibilityKind3259); 

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
    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1815:1: ruleCallConcurrencyKind returns [Enumerator current=null] : ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) ) ;
    public final Enumerator ruleCallConcurrencyKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1819:6: ( ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) ) )
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1820:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )
            {
            // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1820:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt36=1;
                }
                break;
            case 43:
                {
                alt36=2;
                }
                break;
            case 44:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1820:1: ( ( 'sequential' ) | ( 'guarded' ) | ( 'concurrent' ) )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1820:2: ( 'sequential' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1820:2: ( 'sequential' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1820:4: 'sequential'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleCallConcurrencyKind3306); 

                            current = grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCallConcurrencyKindAccess().getSequentialEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1826:6: ( 'guarded' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1826:6: ( 'guarded' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1826:8: 'guarded'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleCallConcurrencyKind3321); 

                            current = grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCallConcurrencyKindAccess().getGuardedEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1832:6: ( 'concurrent' )
                    {
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1832:6: ( 'concurrent' )
                    // ../ro.ubbcluj.cs.ealf/src-gen/ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.g:1832:8: 'concurrent'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleCallConcurrencyKind3336); 

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
        public static final BitSet FOLLOW_11_in_ruleModel120 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel130 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel151 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel162 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rulePackageableElement_in_ruleModel183 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackageableElement_in_entryRulePackageableElement232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackageableElement242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_rulePackageableElement289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_rulePackageableElement316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_ruleClassifier413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_ruleProperty503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_Impl_in_entryRulePackage_Impl539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage_Impl549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePackage_Impl593 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage_Impl603 = new BitSet(new long[]{0x0000000000034800L});
        public static final BitSet FOLLOW_16_in_rulePackage_Impl614 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_rulePackage_Impl635 = new BitSet(new long[]{0x0000000000024800L});
        public static final BitSet FOLLOW_17_in_rulePackage_Impl648 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_rulePackage_Impl669 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_11_in_rulePackage_Impl682 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage_Impl692 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl713 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_rulePackage_Impl724 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rulePackageableElement_in_rulePackage_Impl745 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_rulePackage_Impl757 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePackage_Impl769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_Impl_in_entryRuleProperty_Impl805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_Impl815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleProperty_Impl859 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty_Impl869 = new BitSet(new long[]{0x00000000001B4000L});
        public static final BitSet FOLLOW_16_in_ruleProperty_Impl880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleProperty_Impl901 = new BitSet(new long[]{0x00000000001A4000L});
        public static final BitSet FOLLOW_17_in_ruleProperty_Impl914 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleProperty_Impl935 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_19_in_ruleProperty_Impl948 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleProperty_Impl969 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_ruleProperty_Impl982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty_Impl1005 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty_Impl1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleOperation1107 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation1117 = new BitSet(new long[]{0x0000000000CB4000L});
        public static final BitSet FOLLOW_16_in_ruleOperation1128 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleOperation1149 = new BitSet(new long[]{0x0000000000CA4000L});
        public static final BitSet FOLLOW_17_in_ruleOperation1162 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleOperation1183 = new BitSet(new long[]{0x0000000000C84000L});
        public static final BitSet FOLLOW_19_in_ruleOperation1196 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleOperation1217 = new BitSet(new long[]{0x0000000000C04000L});
        public static final BitSet FOLLOW_22_in_ruleOperation1230 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleOperation1251 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleOperation1264 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_ruleCallConcurrencyKind_in_ruleOperation1285 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOperation1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_Impl_in_entryRuleClass_Impl1333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass_Impl1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleClass_Impl1387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1397 = new BitSet(new long[]{0x000000001E434000L});
        public static final BitSet FOLLOW_16_in_ruleClass_Impl1408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleClass_Impl1429 = new BitSet(new long[]{0x000000001E424000L});
        public static final BitSet FOLLOW_17_in_ruleClass_Impl1442 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_ruleVisibilityKind_in_ruleClass_Impl1463 = new BitSet(new long[]{0x000000001E404000L});
        public static final BitSet FOLLOW_22_in_ruleClass_Impl1476 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleClass_Impl1497 = new BitSet(new long[]{0x000000001E004000L});
        public static final BitSet FOLLOW_25_in_ruleClass_Impl1510 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleClass_Impl1531 = new BitSet(new long[]{0x000000001C004000L});
        public static final BitSet FOLLOW_26_in_ruleClass_Impl1544 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1554 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1575 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1586 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleClass_Impl1607 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleClass_Impl1619 = new BitSet(new long[]{0x0000000018004000L});
        public static final BitSet FOLLOW_27_in_ruleClass_Impl1632 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1642 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1663 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1674 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleClass_Impl1695 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleClass_Impl1707 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleClass_Impl1720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass_Impl1730 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1751 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleClass_Impl1762 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass_Impl1783 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleClass_Impl1795 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleClass_Impl1807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInteger1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleString02009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBoolean2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_entryRuleUnlimitedNatural2143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNatural2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleUnlimitedNatural2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger2355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLiteralInteger2409 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralInteger2419 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralInteger2430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralInteger2451 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralInteger2463 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleLiteralInteger2484 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLiteralInteger2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString2530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLiteralString2584 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralString2594 = new BitSet(new long[]{0x0000000200014000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralString2605 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2626 = new BitSet(new long[]{0x0000000200004000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralString2639 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralString2660 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLiteralString2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLiteralBoolean2762 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralBoolean2772 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralBoolean2783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralBoolean2804 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralBoolean2816 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleLiteralBoolean2837 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLiteralBoolean2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralUnlimitedNatural_in_entryRuleLiteralUnlimitedNatural2883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUnlimitedNatural2893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLiteralUnlimitedNatural2937 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralUnlimitedNatural2947 = new BitSet(new long[]{0x0000000200010000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralUnlimitedNatural2958 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralUnlimitedNatural2979 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleLiteralUnlimitedNatural2991 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleUnlimitedNatural_in_ruleLiteralUnlimitedNatural3012 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLiteralUnlimitedNatural3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull3058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull3068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLiteralNull3112 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralNull3122 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralNull3133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLiteralNull3154 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLiteralNull3166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleVisibilityKind3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleVisibilityKind3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleVisibilityKind3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleVisibilityKind3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleCallConcurrencyKind3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleCallConcurrencyKind3321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleCallConcurrencyKind3336 = new BitSet(new long[]{0x0000000000000002L});
    }


}