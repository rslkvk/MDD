package de.thm.mni.hochschule.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.thm.mni.hochschule.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hochschule'", "'{'", "'Name'", "'Student'", "','", "'Fachbereich'", "'}'", "'Alias'", "'Studiengang'", "'Dozent'", "'Vorlesung'", "'NC'", "'ModulNr'", "'Beschreibung'", "'CrP'", "'Tutor'", "'Evaluation'", "'MatrikelNr'", "'Vorname'", "'Nachname'", "'Professor'", "'Lehrbeauftragter'", "'PersonalNr'", "'Gesamtnote'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Hochschule";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHochschule"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleHochschule returns [EObject current=null] : iv_ruleHochschule= ruleHochschule EOF ;
    public final EObject entryRuleHochschule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHochschule = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleHochschule= ruleHochschule EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleHochschule= ruleHochschule EOF
            {
             newCompositeNode(grammarAccess.getHochschuleRule()); 
            pushFollow(FOLLOW_ruleHochschule_in_entryRuleHochschule75);
            iv_ruleHochschule=ruleHochschule();

            state._fsp--;

             current =iv_ruleHochschule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHochschule85); 

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
    // $ANTLR end "entryRuleHochschule"


    // $ANTLR start "ruleHochschule"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleHochschule returns [EObject current=null] : (otherlv_0= 'Hochschule' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Student' ( (lv_student_5_0= ruleStudent ) ) (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )* otherlv_8= 'Fachbereich' ( (lv_fachbereich_9_0= ruleFachbereich ) ) (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleHochschule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_student_5_0 = null;

        EObject lv_student_7_0 = null;

        EObject lv_fachbereich_9_0 = null;

        EObject lv_fachbereich_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'Hochschule' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Student' ( (lv_student_5_0= ruleStudent ) ) (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )* otherlv_8= 'Fachbereich' ( (lv_fachbereich_9_0= ruleFachbereich ) ) (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )* otherlv_12= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Hochschule' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Student' ( (lv_student_5_0= ruleStudent ) ) (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )* otherlv_8= 'Fachbereich' ( (lv_fachbereich_9_0= ruleFachbereich ) ) (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )* otherlv_12= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Hochschule' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Student' ( (lv_student_5_0= ruleStudent ) ) (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )* otherlv_8= 'Fachbereich' ( (lv_fachbereich_9_0= ruleFachbereich ) ) (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )* otherlv_12= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'Hochschule' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Student' ( (lv_student_5_0= ruleStudent ) ) (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )* otherlv_8= 'Fachbereich' ( (lv_fachbereich_9_0= ruleFachbereich ) ) (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleHochschule122); 

                	newLeafNode(otherlv_0, grammarAccess.getHochschuleAccess().getHochschuleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleHochschule134); 

                	newLeafNode(otherlv_1, grammarAccess.getHochschuleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleHochschule146); 

                	newLeafNode(otherlv_2, grammarAccess.getHochschuleAccess().getNameKeyword_2());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_name_3_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:94:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHochschule163); 

            			newLeafNode(lv_name_3_0, grammarAccess.getHochschuleAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHochschuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleHochschule180); 

                	newLeafNode(otherlv_4, grammarAccess.getHochschuleAccess().getStudentKeyword_4());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_student_5_0= ruleStudent ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_student_5_0= ruleStudent )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_student_5_0= ruleStudent )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:116:3: lv_student_5_0= ruleStudent
            {
             
            	        newCompositeNode(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStudent_in_ruleHochschule201);
            lv_student_5_0=ruleStudent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHochschuleRule());
            	        }
                   		add(
                   			current, 
                   			"student",
                    		lv_student_5_0, 
                    		"Student");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:132:2: (otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:132:4: otherlv_6= ',' ( (lv_student_7_0= ruleStudent ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleHochschule214); 

            	        	newLeafNode(otherlv_6, grammarAccess.getHochschuleAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: ( (lv_student_7_0= ruleStudent ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_student_7_0= ruleStudent )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_student_7_0= ruleStudent )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:138:3: lv_student_7_0= ruleStudent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStudent_in_ruleHochschule235);
            	    lv_student_7_0=ruleStudent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHochschuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"student",
            	            		lv_student_7_0, 
            	            		"Student");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleHochschule249); 

                	newLeafNode(otherlv_8, grammarAccess.getHochschuleAccess().getFachbereichKeyword_7());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:158:1: ( (lv_fachbereich_9_0= ruleFachbereich ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:159:1: (lv_fachbereich_9_0= ruleFachbereich )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:159:1: (lv_fachbereich_9_0= ruleFachbereich )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:160:3: lv_fachbereich_9_0= ruleFachbereich
            {
             
            	        newCompositeNode(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleFachbereich_in_ruleHochschule270);
            lv_fachbereich_9_0=ruleFachbereich();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHochschuleRule());
            	        }
                   		add(
                   			current, 
                   			"fachbereich",
                    		lv_fachbereich_9_0, 
                    		"Fachbereich");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:176:2: (otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:176:4: otherlv_10= ',' ( (lv_fachbereich_11_0= ruleFachbereich ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleHochschule283); 

            	        	newLeafNode(otherlv_10, grammarAccess.getHochschuleAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: ( (lv_fachbereich_11_0= ruleFachbereich ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:181:1: (lv_fachbereich_11_0= ruleFachbereich )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:181:1: (lv_fachbereich_11_0= ruleFachbereich )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:182:3: lv_fachbereich_11_0= ruleFachbereich
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFachbereich_in_ruleHochschule304);
            	    lv_fachbereich_11_0=ruleFachbereich();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHochschuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fachbereich",
            	            		lv_fachbereich_11_0, 
            	            		"Fachbereich");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleHochschule318); 

                	newLeafNode(otherlv_12, grammarAccess.getHochschuleAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHochschule"


    // $ANTLR start "entryRuleFachbereich"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: entryRuleFachbereich returns [EObject current=null] : iv_ruleFachbereich= ruleFachbereich EOF ;
    public final EObject entryRuleFachbereich() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFachbereich = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:211:2: (iv_ruleFachbereich= ruleFachbereich EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: iv_ruleFachbereich= ruleFachbereich EOF
            {
             newCompositeNode(grammarAccess.getFachbereichRule()); 
            pushFollow(FOLLOW_ruleFachbereich_in_entryRuleFachbereich354);
            iv_ruleFachbereich=ruleFachbereich();

            state._fsp--;

             current =iv_ruleFachbereich; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFachbereich364); 

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
    // $ANTLR end "entryRuleFachbereich"


    // $ANTLR start "ruleFachbereich"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: ruleFachbereich returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Alias' ( (lv_alias_4_0= RULE_STRING ) ) otherlv_5= 'Studiengang' ( (lv_studiengang_6_0= ruleStudiengang ) ) (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )* otherlv_9= 'Dozent' ( (lv_dozent_10_0= ruleDozent ) ) (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )* (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleFachbereich() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_studiengang_6_0 = null;

        EObject lv_studiengang_8_0 = null;

        EObject lv_dozent_10_0 = null;

        EObject lv_dozent_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:222:28: ( (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Alias' ( (lv_alias_4_0= RULE_STRING ) ) otherlv_5= 'Studiengang' ( (lv_studiengang_6_0= ruleStudiengang ) ) (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )* otherlv_9= 'Dozent' ( (lv_dozent_10_0= ruleDozent ) ) (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )* (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:223:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Alias' ( (lv_alias_4_0= RULE_STRING ) ) otherlv_5= 'Studiengang' ( (lv_studiengang_6_0= ruleStudiengang ) ) (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )* otherlv_9= 'Dozent' ( (lv_dozent_10_0= ruleDozent ) ) (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )* (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:223:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Alias' ( (lv_alias_4_0= RULE_STRING ) ) otherlv_5= 'Studiengang' ( (lv_studiengang_6_0= ruleStudiengang ) ) (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )* otherlv_9= 'Dozent' ( (lv_dozent_10_0= ruleDozent ) ) (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )* (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:223:3: otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'Alias' ( (lv_alias_4_0= RULE_STRING ) ) otherlv_5= 'Studiengang' ( (lv_studiengang_6_0= ruleStudiengang ) ) (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )* otherlv_9= 'Dozent' ( (lv_dozent_10_0= ruleDozent ) ) (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )* (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleFachbereich401); 

                	newLeafNode(otherlv_0, grammarAccess.getFachbereichAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFachbereich413); 

                	newLeafNode(otherlv_1, grammarAccess.getFachbereichAccess().getNameKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:231:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_name_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_name_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:233:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFachbereich430); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFachbereichAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFachbereichRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFachbereich447); 

                	newLeafNode(otherlv_3, grammarAccess.getFachbereichAccess().getAliasKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:253:1: ( (lv_alias_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_alias_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_alias_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:255:3: lv_alias_4_0= RULE_STRING
            {
            lv_alias_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFachbereich464); 

            			newLeafNode(lv_alias_4_0, grammarAccess.getFachbereichAccess().getAliasSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFachbereichRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alias",
                    		lv_alias_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFachbereich481); 

                	newLeafNode(otherlv_5, grammarAccess.getFachbereichAccess().getStudiengangKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ( (lv_studiengang_6_0= ruleStudiengang ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_studiengang_6_0= ruleStudiengang )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_studiengang_6_0= ruleStudiengang )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:277:3: lv_studiengang_6_0= ruleStudiengang
            {
             
            	        newCompositeNode(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStudiengang_in_ruleFachbereich502);
            lv_studiengang_6_0=ruleStudiengang();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFachbereichRule());
            	        }
                   		add(
                   			current, 
                   			"studiengang",
                    		lv_studiengang_6_0, 
                    		"Studiengang");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:293:2: (otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:293:4: otherlv_7= ',' ( (lv_studiengang_8_0= ruleStudiengang ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFachbereich515); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFachbereichAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:297:1: ( (lv_studiengang_8_0= ruleStudiengang ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: (lv_studiengang_8_0= ruleStudiengang )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: (lv_studiengang_8_0= ruleStudiengang )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:299:3: lv_studiengang_8_0= ruleStudiengang
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStudiengang_in_ruleFachbereich536);
            	    lv_studiengang_8_0=ruleStudiengang();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFachbereichRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"studiengang",
            	            		lv_studiengang_8_0, 
            	            		"Studiengang");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleFachbereich550); 

                	newLeafNode(otherlv_9, grammarAccess.getFachbereichAccess().getDozentKeyword_8());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:319:1: ( (lv_dozent_10_0= ruleDozent ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: (lv_dozent_10_0= ruleDozent )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: (lv_dozent_10_0= ruleDozent )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:321:3: lv_dozent_10_0= ruleDozent
            {
             
            	        newCompositeNode(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleDozent_in_ruleFachbereich571);
            lv_dozent_10_0=ruleDozent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFachbereichRule());
            	        }
                   		add(
                   			current, 
                   			"dozent",
                    		lv_dozent_10_0, 
                    		"Dozent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:337:2: (otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:337:4: otherlv_11= ',' ( (lv_dozent_12_0= ruleDozent ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleFachbereich584); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFachbereichAccess().getCommaKeyword_10_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:341:1: ( (lv_dozent_12_0= ruleDozent ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (lv_dozent_12_0= ruleDozent )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (lv_dozent_12_0= ruleDozent )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:343:3: lv_dozent_12_0= ruleDozent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDozent_in_ruleFachbereich605);
            	    lv_dozent_12_0=ruleDozent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFachbereichRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dozent",
            	            		lv_dozent_12_0, 
            	            		"Dozent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:359:4: (otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:359:6: otherlv_13= 'Vorlesung' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleFachbereich620); 

                        	newLeafNode(otherlv_13, grammarAccess.getFachbereichAccess().getVorlesungKeyword_11_0());
                        
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: ( (otherlv_14= RULE_ID ) )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: (otherlv_14= RULE_ID )
                    {
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: (otherlv_14= RULE_ID )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:365:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFachbereichRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFachbereich640); 

                    		newLeafNode(otherlv_14, grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_1_0()); 
                    	

                    }


                    }

                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:376:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleFachbereich653); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getFachbereichAccess().getCommaKeyword_11_2_0());
                    	        
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:380:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:381:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:381:1: (otherlv_16= RULE_ID )
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:382:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFachbereichRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFachbereich673); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleFachbereich689); 

                	newLeafNode(otherlv_17, grammarAccess.getFachbereichAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFachbereich"


    // $ANTLR start "entryRuleStudiengang"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:405:1: entryRuleStudiengang returns [EObject current=null] : iv_ruleStudiengang= ruleStudiengang EOF ;
    public final EObject entryRuleStudiengang() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudiengang = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:406:2: (iv_ruleStudiengang= ruleStudiengang EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: iv_ruleStudiengang= ruleStudiengang EOF
            {
             newCompositeNode(grammarAccess.getStudiengangRule()); 
            pushFollow(FOLLOW_ruleStudiengang_in_entryRuleStudiengang725);
            iv_ruleStudiengang=ruleStudiengang();

            state._fsp--;

             current =iv_ruleStudiengang; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStudiengang735); 

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
    // $ANTLR end "entryRuleStudiengang"


    // $ANTLR start "ruleStudiengang"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:414:1: ruleStudiengang returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'NC' ( (lv_nc_4_0= RULE_STRING ) ) otherlv_5= 'Student' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'Vorlesung' ( (lv_vorlesung_10_0= ruleVorlesung ) ) (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleStudiengang() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_nc_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_vorlesung_10_0 = null;

        EObject lv_vorlesung_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:417:28: ( (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'NC' ( (lv_nc_4_0= RULE_STRING ) ) otherlv_5= 'Student' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'Vorlesung' ( (lv_vorlesung_10_0= ruleVorlesung ) ) (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )* otherlv_13= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:418:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'NC' ( (lv_nc_4_0= RULE_STRING ) ) otherlv_5= 'Student' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'Vorlesung' ( (lv_vorlesung_10_0= ruleVorlesung ) ) (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )* otherlv_13= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:418:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'NC' ( (lv_nc_4_0= RULE_STRING ) ) otherlv_5= 'Student' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'Vorlesung' ( (lv_vorlesung_10_0= ruleVorlesung ) ) (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )* otherlv_13= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:418:3: otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'NC' ( (lv_nc_4_0= RULE_STRING ) ) otherlv_5= 'Student' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= 'Vorlesung' ( (lv_vorlesung_10_0= ruleVorlesung ) ) (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStudiengang772); 

                	newLeafNode(otherlv_0, grammarAccess.getStudiengangAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStudiengang784); 

                	newLeafNode(otherlv_1, grammarAccess.getStudiengangAccess().getNameKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:426:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_name_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:427:1: (lv_name_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStudiengang801); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStudiengangAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStudiengangRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleStudiengang818); 

                	newLeafNode(otherlv_3, grammarAccess.getStudiengangAccess().getNCKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:448:1: ( (lv_nc_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:449:1: (lv_nc_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:449:1: (lv_nc_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:450:3: lv_nc_4_0= RULE_STRING
            {
            lv_nc_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStudiengang835); 

            			newLeafNode(lv_nc_4_0, grammarAccess.getStudiengangAccess().getNcSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStudiengangRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nc",
                    		lv_nc_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStudiengang852); 

                	newLeafNode(otherlv_5, grammarAccess.getStudiengangAccess().getStudentKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: ( (otherlv_6= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:471:1: (otherlv_6= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:471:1: (otherlv_6= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:472:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStudiengangRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStudiengang872); 

            		newLeafNode(otherlv_6, grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_6_0()); 
            	

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:483:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:483:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleStudiengang885); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStudiengangAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: ( (otherlv_8= RULE_ID ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (otherlv_8= RULE_ID )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:489:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStudiengangRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStudiengang905); 

            	    		newLeafNode(otherlv_8, grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_7_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleStudiengang919); 

                	newLeafNode(otherlv_9, grammarAccess.getStudiengangAccess().getVorlesungKeyword_8());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:504:1: ( (lv_vorlesung_10_0= ruleVorlesung ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: (lv_vorlesung_10_0= ruleVorlesung )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: (lv_vorlesung_10_0= ruleVorlesung )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:506:3: lv_vorlesung_10_0= ruleVorlesung
            {
             
            	        newCompositeNode(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleVorlesung_in_ruleStudiengang940);
            lv_vorlesung_10_0=ruleVorlesung();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStudiengangRule());
            	        }
                   		add(
                   			current, 
                   			"vorlesung",
                    		lv_vorlesung_10_0, 
                    		"Vorlesung");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: (otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:522:4: otherlv_11= ',' ( (lv_vorlesung_12_0= ruleVorlesung ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleStudiengang953); 

            	        	newLeafNode(otherlv_11, grammarAccess.getStudiengangAccess().getCommaKeyword_10_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: ( (lv_vorlesung_12_0= ruleVorlesung ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:527:1: (lv_vorlesung_12_0= ruleVorlesung )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:527:1: (lv_vorlesung_12_0= ruleVorlesung )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:528:3: lv_vorlesung_12_0= ruleVorlesung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVorlesung_in_ruleStudiengang974);
            	    lv_vorlesung_12_0=ruleVorlesung();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStudiengangRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vorlesung",
            	            		lv_vorlesung_12_0, 
            	            		"Vorlesung");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleStudiengang988); 

                	newLeafNode(otherlv_13, grammarAccess.getStudiengangAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStudiengang"


    // $ANTLR start "entryRuleVorlesung"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:556:1: entryRuleVorlesung returns [EObject current=null] : iv_ruleVorlesung= ruleVorlesung EOF ;
    public final EObject entryRuleVorlesung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVorlesung = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:557:2: (iv_ruleVorlesung= ruleVorlesung EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: iv_ruleVorlesung= ruleVorlesung EOF
            {
             newCompositeNode(grammarAccess.getVorlesungRule()); 
            pushFollow(FOLLOW_ruleVorlesung_in_entryRuleVorlesung1024);
            iv_ruleVorlesung=ruleVorlesung();

            state._fsp--;

             current =iv_ruleVorlesung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorlesung1034); 

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
    // $ANTLR end "entryRuleVorlesung"


    // $ANTLR start "ruleVorlesung"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:565:1: ruleVorlesung returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'ModulNr' ( (lv_modulnr_4_0= RULE_STRING ) ) otherlv_5= 'Beschreibung' ( (lv_beschreibung_6_0= RULE_STRING ) ) otherlv_7= 'CrP' ( (lv_crp_8_0= RULE_STRING ) ) otherlv_9= 'Dozent' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Student' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'Tutor' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= 'Evaluation' ( (lv_evaluation_20_0= ruleEvaluation ) ) (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )* otherlv_23= '}' ) ;
    public final EObject ruleVorlesung() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_modulnr_4_0=null;
        Token otherlv_5=null;
        Token lv_beschreibung_6_0=null;
        Token otherlv_7=null;
        Token lv_crp_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_evaluation_20_0 = null;

        EObject lv_evaluation_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:568:28: ( (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'ModulNr' ( (lv_modulnr_4_0= RULE_STRING ) ) otherlv_5= 'Beschreibung' ( (lv_beschreibung_6_0= RULE_STRING ) ) otherlv_7= 'CrP' ( (lv_crp_8_0= RULE_STRING ) ) otherlv_9= 'Dozent' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Student' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'Tutor' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= 'Evaluation' ( (lv_evaluation_20_0= ruleEvaluation ) ) (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )* otherlv_23= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:569:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'ModulNr' ( (lv_modulnr_4_0= RULE_STRING ) ) otherlv_5= 'Beschreibung' ( (lv_beschreibung_6_0= RULE_STRING ) ) otherlv_7= 'CrP' ( (lv_crp_8_0= RULE_STRING ) ) otherlv_9= 'Dozent' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Student' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'Tutor' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= 'Evaluation' ( (lv_evaluation_20_0= ruleEvaluation ) ) (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )* otherlv_23= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:569:1: (otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'ModulNr' ( (lv_modulnr_4_0= RULE_STRING ) ) otherlv_5= 'Beschreibung' ( (lv_beschreibung_6_0= RULE_STRING ) ) otherlv_7= 'CrP' ( (lv_crp_8_0= RULE_STRING ) ) otherlv_9= 'Dozent' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Student' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'Tutor' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= 'Evaluation' ( (lv_evaluation_20_0= ruleEvaluation ) ) (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )* otherlv_23= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:569:3: otherlv_0= '{' otherlv_1= 'Name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'ModulNr' ( (lv_modulnr_4_0= RULE_STRING ) ) otherlv_5= 'Beschreibung' ( (lv_beschreibung_6_0= RULE_STRING ) ) otherlv_7= 'CrP' ( (lv_crp_8_0= RULE_STRING ) ) otherlv_9= 'Dozent' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'Student' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= 'Tutor' ( (otherlv_16= RULE_ID ) ) (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )* otherlv_19= 'Evaluation' ( (lv_evaluation_20_0= ruleEvaluation ) ) (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleVorlesung1071); 

                	newLeafNode(otherlv_0, grammarAccess.getVorlesungAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleVorlesung1083); 

                	newLeafNode(otherlv_1, grammarAccess.getVorlesungAccess().getNameKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:577:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_name_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_name_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:579:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVorlesung1100); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVorlesungAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleVorlesung1117); 

                	newLeafNode(otherlv_3, grammarAccess.getVorlesungAccess().getModulNrKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: ( (lv_modulnr_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_modulnr_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_modulnr_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:601:3: lv_modulnr_4_0= RULE_STRING
            {
            lv_modulnr_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVorlesung1134); 

            			newLeafNode(lv_modulnr_4_0, grammarAccess.getVorlesungAccess().getModulnrSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modulnr",
                    		lv_modulnr_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleVorlesung1151); 

                	newLeafNode(otherlv_5, grammarAccess.getVorlesungAccess().getBeschreibungKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:621:1: ( (lv_beschreibung_6_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:622:1: (lv_beschreibung_6_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:622:1: (lv_beschreibung_6_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:623:3: lv_beschreibung_6_0= RULE_STRING
            {
            lv_beschreibung_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVorlesung1168); 

            			newLeafNode(lv_beschreibung_6_0, grammarAccess.getVorlesungAccess().getBeschreibungSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"beschreibung",
                    		lv_beschreibung_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleVorlesung1185); 

                	newLeafNode(otherlv_7, grammarAccess.getVorlesungAccess().getCrPKeyword_7());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:643:1: ( (lv_crp_8_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:644:1: (lv_crp_8_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:644:1: (lv_crp_8_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:645:3: lv_crp_8_0= RULE_STRING
            {
            lv_crp_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVorlesung1202); 

            			newLeafNode(lv_crp_8_0, grammarAccess.getVorlesungAccess().getCrpSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"crp",
                    		lv_crp_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleVorlesung1219); 

                	newLeafNode(otherlv_9, grammarAccess.getVorlesungAccess().getDozentKeyword_9());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:665:1: ( (otherlv_10= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:666:1: (otherlv_10= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:666:1: (otherlv_10= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:667:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorlesung1239); 

            		newLeafNode(otherlv_10, grammarAccess.getVorlesungAccess().getDozentDozentCrossReference_10_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleVorlesung1251); 

                	newLeafNode(otherlv_11, grammarAccess.getVorlesungAccess().getStudentKeyword_11());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:682:1: ( (otherlv_12= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_12= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_12= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:684:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorlesung1271); 

            		newLeafNode(otherlv_12, grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_12_0()); 
            	

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:695:2: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:695:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleVorlesung1284); 

            	        	newLeafNode(otherlv_13, grammarAccess.getVorlesungAccess().getCommaKeyword_13_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ( (otherlv_14= RULE_ID ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (otherlv_14= RULE_ID )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:701:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVorlesungRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorlesung1304); 

            	    		newLeafNode(otherlv_14, grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_13_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleVorlesung1318); 

                	newLeafNode(otherlv_15, grammarAccess.getVorlesungAccess().getTutorKeyword_14());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:716:1: ( (otherlv_16= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:717:1: (otherlv_16= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:717:1: (otherlv_16= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:718:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVorlesungRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorlesung1338); 

            		newLeafNode(otherlv_16, grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_15_0()); 
            	

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:729:2: (otherlv_17= ',' ( (otherlv_18= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:729:4: otherlv_17= ',' ( (otherlv_18= RULE_ID ) )
            	    {
            	    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleVorlesung1351); 

            	        	newLeafNode(otherlv_17, grammarAccess.getVorlesungAccess().getCommaKeyword_16_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: ( (otherlv_18= RULE_ID ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (otherlv_18= RULE_ID )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (otherlv_18= RULE_ID )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: otherlv_18= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVorlesungRule());
            	    	        }
            	            
            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorlesung1371); 

            	    		newLeafNode(otherlv_18, grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_16_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleVorlesung1385); 

                	newLeafNode(otherlv_19, grammarAccess.getVorlesungAccess().getEvaluationKeyword_17());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:750:1: ( (lv_evaluation_20_0= ruleEvaluation ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:751:1: (lv_evaluation_20_0= ruleEvaluation )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:751:1: (lv_evaluation_20_0= ruleEvaluation )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:752:3: lv_evaluation_20_0= ruleEvaluation
            {
             
            	        newCompositeNode(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleEvaluation_in_ruleVorlesung1406);
            lv_evaluation_20_0=ruleEvaluation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVorlesungRule());
            	        }
                   		add(
                   			current, 
                   			"evaluation",
                    		lv_evaluation_20_0, 
                    		"Evaluation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:768:2: (otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:768:4: otherlv_21= ',' ( (lv_evaluation_22_0= ruleEvaluation ) )
            	    {
            	    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleVorlesung1419); 

            	        	newLeafNode(otherlv_21, grammarAccess.getVorlesungAccess().getCommaKeyword_19_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:772:1: ( (lv_evaluation_22_0= ruleEvaluation ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: (lv_evaluation_22_0= ruleEvaluation )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: (lv_evaluation_22_0= ruleEvaluation )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:774:3: lv_evaluation_22_0= ruleEvaluation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_19_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvaluation_in_ruleVorlesung1440);
            	    lv_evaluation_22_0=ruleEvaluation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVorlesungRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evaluation",
            	            		lv_evaluation_22_0, 
            	            		"Evaluation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleVorlesung1454); 

                	newLeafNode(otherlv_23, grammarAccess.getVorlesungAccess().getRightCurlyBracketKeyword_20());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVorlesung"


    // $ANTLR start "entryRuleStudent"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:802:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:803:2: (iv_ruleStudent= ruleStudent EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:804:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_ruleStudent_in_entryRuleStudent1490);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStudent1500); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:811:1: ruleStudent returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'MatrikelNr' ( (lv_matrikelnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_matrikelnr_2_0=null;
        Token otherlv_3=null;
        Token lv_vorname_4_0=null;
        Token otherlv_5=null;
        Token lv_nachname_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:814:28: ( (otherlv_0= '{' otherlv_1= 'MatrikelNr' ( (lv_matrikelnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:815:1: (otherlv_0= '{' otherlv_1= 'MatrikelNr' ( (lv_matrikelnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:815:1: (otherlv_0= '{' otherlv_1= 'MatrikelNr' ( (lv_matrikelnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:815:3: otherlv_0= '{' otherlv_1= 'MatrikelNr' ( (lv_matrikelnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStudent1537); 

                	newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleStudent1549); 

                	newLeafNode(otherlv_1, grammarAccess.getStudentAccess().getMatrikelNrKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:823:1: ( (lv_matrikelnr_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_matrikelnr_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_matrikelnr_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:825:3: lv_matrikelnr_2_0= RULE_STRING
            {
            lv_matrikelnr_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStudent1566); 

            			newLeafNode(lv_matrikelnr_2_0, grammarAccess.getStudentAccess().getMatrikelnrSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStudentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"matrikelnr",
                    		lv_matrikelnr_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleStudent1583); 

                	newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getVornameKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:845:1: ( (lv_vorname_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:846:1: (lv_vorname_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:846:1: (lv_vorname_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:847:3: lv_vorname_4_0= RULE_STRING
            {
            lv_vorname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStudent1600); 

            			newLeafNode(lv_vorname_4_0, grammarAccess.getStudentAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStudentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vorname",
                    		lv_vorname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleStudent1617); 

                	newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getNachnameKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:867:1: ( (lv_nachname_6_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:868:1: (lv_nachname_6_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:868:1: (lv_nachname_6_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:869:3: lv_nachname_6_0= RULE_STRING
            {
            lv_nachname_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStudent1634); 

            			newLeafNode(lv_nachname_6_0, grammarAccess.getStudentAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStudentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nachname",
                    		lv_nachname_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:885:2: (otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:885:4: otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleStudent1652); 

                        	newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getVorlesungKeyword_7_0());
                        
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ( (otherlv_8= RULE_ID ) )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (otherlv_8= RULE_ID )
                    {
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (otherlv_8= RULE_ID )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStudentRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStudent1672); 

                    		newLeafNode(otherlv_8, grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_1_0()); 
                    	

                    }


                    }

                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:902:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:902:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleStudent1685); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:906:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:907:1: (otherlv_10= RULE_ID )
                    	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:908:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStudentRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStudent1705); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleStudent1721); 

                	newLeafNode(otherlv_11, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleDozent"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:931:1: entryRuleDozent returns [EObject current=null] : iv_ruleDozent= ruleDozent EOF ;
    public final EObject entryRuleDozent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDozent = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:932:2: (iv_ruleDozent= ruleDozent EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:933:2: iv_ruleDozent= ruleDozent EOF
            {
             newCompositeNode(grammarAccess.getDozentRule()); 
            pushFollow(FOLLOW_ruleDozent_in_entryRuleDozent1757);
            iv_ruleDozent=ruleDozent();

            state._fsp--;

             current =iv_ruleDozent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDozent1767); 

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
    // $ANTLR end "entryRuleDozent"


    // $ANTLR start "ruleDozent"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:940:1: ruleDozent returns [EObject current=null] : ( (otherlv_0= 'Professor' this_Professor_1= ruleProfessor ) | (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager ) ) ;
    public final EObject ruleDozent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Professor_1 = null;

        EObject this_Lehrbeauftrager_3 = null;


         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:943:28: ( ( (otherlv_0= 'Professor' this_Professor_1= ruleProfessor ) | (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager ) ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ( (otherlv_0= 'Professor' this_Professor_1= ruleProfessor ) | (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager ) )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ( (otherlv_0= 'Professor' this_Professor_1= ruleProfessor ) | (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:944:2: (otherlv_0= 'Professor' this_Professor_1= ruleProfessor )
                    {
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:944:2: (otherlv_0= 'Professor' this_Professor_1= ruleProfessor )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:944:4: otherlv_0= 'Professor' this_Professor_1= ruleProfessor
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDozent1805); 

                        	newLeafNode(otherlv_0, grammarAccess.getDozentAccess().getProfessorKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getDozentAccess().getProfessorParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleProfessor_in_ruleDozent1827);
                    this_Professor_1=ruleProfessor();

                    state._fsp--;

                     
                            current = this_Professor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:958:6: (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager )
                    {
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:958:6: (otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager )
                    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:958:8: otherlv_2= 'Lehrbeauftragter' this_Lehrbeauftrager_3= ruleLehrbeauftrager
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDozent1846); 

                        	newLeafNode(otherlv_2, grammarAccess.getDozentAccess().getLehrbeauftragterKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getDozentAccess().getLehrbeauftragerParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleLehrbeauftrager_in_ruleDozent1868);
                    this_Lehrbeauftrager_3=ruleLehrbeauftrager();

                    state._fsp--;

                     
                            current = this_Lehrbeauftrager_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDozent"


    // $ANTLR start "entryRuleProfessor"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:979:1: entryRuleProfessor returns [EObject current=null] : iv_ruleProfessor= ruleProfessor EOF ;
    public final EObject entryRuleProfessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfessor = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:980:2: (iv_ruleProfessor= ruleProfessor EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:981:2: iv_ruleProfessor= ruleProfessor EOF
            {
             newCompositeNode(grammarAccess.getProfessorRule()); 
            pushFollow(FOLLOW_ruleProfessor_in_entryRuleProfessor1904);
            iv_ruleProfessor=ruleProfessor();

            state._fsp--;

             current =iv_ruleProfessor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProfessor1914); 

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
    // $ANTLR end "entryRuleProfessor"


    // $ANTLR start "ruleProfessor"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: ruleProfessor returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleProfessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_personalnr_2_0=null;
        Token otherlv_3=null;
        Token lv_vorname_4_0=null;
        Token otherlv_5=null;
        Token lv_nachname_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:991:28: ( (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:992:3: otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleProfessor1951); 

                	newLeafNode(otherlv_0, grammarAccess.getProfessorAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleProfessor1963); 

                	newLeafNode(otherlv_1, grammarAccess.getProfessorAccess().getPersonalNrKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:1: ( (lv_personalnr_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: (lv_personalnr_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: (lv_personalnr_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:3: lv_personalnr_2_0= RULE_STRING
            {
            lv_personalnr_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProfessor1980); 

            			newLeafNode(lv_personalnr_2_0, grammarAccess.getProfessorAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProfessorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"personalnr",
                    		lv_personalnr_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleProfessor1997); 

                	newLeafNode(otherlv_3, grammarAccess.getProfessorAccess().getVornameKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1022:1: ( (lv_vorname_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:1: (lv_vorname_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:1: (lv_vorname_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:3: lv_vorname_4_0= RULE_STRING
            {
            lv_vorname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProfessor2014); 

            			newLeafNode(lv_vorname_4_0, grammarAccess.getProfessorAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProfessorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vorname",
                    		lv_vorname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleProfessor2031); 

                	newLeafNode(otherlv_5, grammarAccess.getProfessorAccess().getNachnameKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:1: ( (lv_nachname_6_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:1: (lv_nachname_6_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:1: (lv_nachname_6_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1046:3: lv_nachname_6_0= RULE_STRING
            {
            lv_nachname_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProfessor2048); 

            			newLeafNode(lv_nachname_6_0, grammarAccess.getProfessorAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProfessorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nachname",
                    		lv_nachname_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleProfessor2065); 

                	newLeafNode(otherlv_7, grammarAccess.getProfessorAccess().getVorlesungKeyword_7());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:1: ( (otherlv_8= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: (otherlv_8= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: (otherlv_8= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1068:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProfessorRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProfessor2085); 

            		newLeafNode(otherlv_8, grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_8_0()); 
            	

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleProfessor2098); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProfessorAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( (otherlv_10= RULE_ID ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (otherlv_10= RULE_ID )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProfessorRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProfessor2118); 

            	    		newLeafNode(otherlv_10, grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleProfessor2132); 

                	newLeafNode(otherlv_11, grammarAccess.getProfessorAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfessor"


    // $ANTLR start "entryRuleLehrbeauftrager"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1108:1: entryRuleLehrbeauftrager returns [EObject current=null] : iv_ruleLehrbeauftrager= ruleLehrbeauftrager EOF ;
    public final EObject entryRuleLehrbeauftrager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLehrbeauftrager = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:2: (iv_ruleLehrbeauftrager= ruleLehrbeauftrager EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:2: iv_ruleLehrbeauftrager= ruleLehrbeauftrager EOF
            {
             newCompositeNode(grammarAccess.getLehrbeauftragerRule()); 
            pushFollow(FOLLOW_ruleLehrbeauftrager_in_entryRuleLehrbeauftrager2168);
            iv_ruleLehrbeauftrager=ruleLehrbeauftrager();

            state._fsp--;

             current =iv_ruleLehrbeauftrager; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLehrbeauftrager2178); 

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
    // $ANTLR end "entryRuleLehrbeauftrager"


    // $ANTLR start "ruleLehrbeauftrager"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:1: ruleLehrbeauftrager returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleLehrbeauftrager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_personalnr_2_0=null;
        Token otherlv_3=null;
        Token lv_vorname_4_0=null;
        Token otherlv_5=null;
        Token lv_nachname_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:28: ( (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:3: otherlv_0= '{' otherlv_1= 'PersonalNr' ( (lv_personalnr_2_0= RULE_STRING ) ) otherlv_3= 'Vorname' ( (lv_vorname_4_0= RULE_STRING ) ) otherlv_5= 'Nachname' ( (lv_nachname_6_0= RULE_STRING ) ) otherlv_7= 'Vorlesung' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLehrbeauftrager2215); 

                	newLeafNode(otherlv_0, grammarAccess.getLehrbeauftragerAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleLehrbeauftrager2227); 

                	newLeafNode(otherlv_1, grammarAccess.getLehrbeauftragerAccess().getPersonalNrKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:1: ( (lv_personalnr_2_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:1: (lv_personalnr_2_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:1: (lv_personalnr_2_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:3: lv_personalnr_2_0= RULE_STRING
            {
            lv_personalnr_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2244); 

            			newLeafNode(lv_personalnr_2_0, grammarAccess.getLehrbeauftragerAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLehrbeauftragerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"personalnr",
                    		lv_personalnr_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleLehrbeauftrager2261); 

                	newLeafNode(otherlv_3, grammarAccess.getLehrbeauftragerAccess().getVornameKeyword_3());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:1: ( (lv_vorname_4_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:1: (lv_vorname_4_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:1: (lv_vorname_4_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:3: lv_vorname_4_0= RULE_STRING
            {
            lv_vorname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2278); 

            			newLeafNode(lv_vorname_4_0, grammarAccess.getLehrbeauftragerAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLehrbeauftragerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vorname",
                    		lv_vorname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleLehrbeauftrager2295); 

                	newLeafNode(otherlv_5, grammarAccess.getLehrbeauftragerAccess().getNachnameKeyword_5());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:1: ( (lv_nachname_6_0= RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:1: (lv_nachname_6_0= RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:1: (lv_nachname_6_0= RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1175:3: lv_nachname_6_0= RULE_STRING
            {
            lv_nachname_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2312); 

            			newLeafNode(lv_nachname_6_0, grammarAccess.getLehrbeauftragerAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLehrbeauftragerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nachname",
                    		lv_nachname_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleLehrbeauftrager2329); 

                	newLeafNode(otherlv_7, grammarAccess.getLehrbeauftragerAccess().getVorlesungKeyword_7());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:1: ( (otherlv_8= RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: (otherlv_8= RULE_ID )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: (otherlv_8= RULE_ID )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLehrbeauftragerRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLehrbeauftrager2349); 

            		newLeafNode(otherlv_8, grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_8_0()); 
            	

            }


            }

            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleLehrbeauftrager2362); 

            	        	newLeafNode(otherlv_9, grammarAccess.getLehrbeauftragerAccess().getCommaKeyword_9_0());
            	        
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:1: ( (otherlv_10= RULE_ID ) )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: (otherlv_10= RULE_ID )
            	    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLehrbeauftragerRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLehrbeauftrager2382); 

            	    		newLeafNode(otherlv_10, grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleLehrbeauftrager2396); 

                	newLeafNode(otherlv_11, grammarAccess.getLehrbeauftragerAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLehrbeauftrager"


    // $ANTLR start "entryRuleEvaluation"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation2432);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation2442); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:1: ruleEvaluation returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Gesamtnote' ( (lv_gesamtnote_2_0= RULE_INT ) ) otherlv_3= '}' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_gesamtnote_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1249:28: ( (otherlv_0= '{' otherlv_1= 'Gesamtnote' ( (lv_gesamtnote_2_0= RULE_INT ) ) otherlv_3= '}' ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:1: (otherlv_0= '{' otherlv_1= 'Gesamtnote' ( (lv_gesamtnote_2_0= RULE_INT ) ) otherlv_3= '}' )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:1: (otherlv_0= '{' otherlv_1= 'Gesamtnote' ( (lv_gesamtnote_2_0= RULE_INT ) ) otherlv_3= '}' )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:3: otherlv_0= '{' otherlv_1= 'Gesamtnote' ( (lv_gesamtnote_2_0= RULE_INT ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEvaluation2479); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEvaluation2491); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getGesamtnoteKeyword_1());
                
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:1: ( (lv_gesamtnote_2_0= RULE_INT ) )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:1: (lv_gesamtnote_2_0= RULE_INT )
            {
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:1: (lv_gesamtnote_2_0= RULE_INT )
            // ../de.thm.mni.hochschule.mydsl/src-gen/de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:3: lv_gesamtnote_2_0= RULE_INT
            {
            lv_gesamtnote_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation2508); 

            			newLeafNode(lv_gesamtnote_2_0, grammarAccess.getEvaluationAccess().getGesamtnoteINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"gesamtnote",
                    		lv_gesamtnote_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation2525); 

                	newLeafNode(otherlv_3, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHochschule_in_entryRuleHochschule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHochschule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleHochschule122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHochschule134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHochschule146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHochschule163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHochschule180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStudent_in_ruleHochschule201 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleHochschule214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStudent_in_ruleHochschule235 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleHochschule249 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFachbereich_in_ruleHochschule270 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleHochschule283 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFachbereich_in_ruleHochschule304 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleHochschule318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFachbereich_in_entryRuleFachbereich354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFachbereich364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFachbereich401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFachbereich413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFachbereich430 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFachbereich447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFachbereich464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFachbereich481 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStudiengang_in_ruleFachbereich502 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleFachbereich515 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStudiengang_in_ruleFachbereich536 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleFachbereich550 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleDozent_in_ruleFachbereich571 = new BitSet(new long[]{0x0000000000228000L});
    public static final BitSet FOLLOW_15_in_ruleFachbereich584 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleDozent_in_ruleFachbereich605 = new BitSet(new long[]{0x0000000000228000L});
    public static final BitSet FOLLOW_21_in_ruleFachbereich620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFachbereich640 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleFachbereich653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFachbereich673 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleFachbereich689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudiengang_in_entryRuleStudiengang725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStudiengang735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStudiengang772 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStudiengang784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStudiengang801 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStudiengang818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStudiengang835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStudiengang852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStudiengang872 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleStudiengang885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStudiengang905 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_21_in_ruleStudiengang919 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVorlesung_in_ruleStudiengang940 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleStudiengang953 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVorlesung_in_ruleStudiengang974 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleStudiengang988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorlesung_in_entryRuleVorlesung1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorlesung1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVorlesung1071 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVorlesung1083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVorlesung1100 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVorlesung1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVorlesung1134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVorlesung1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVorlesung1168 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVorlesung1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVorlesung1202 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVorlesung1219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorlesung1239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVorlesung1251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorlesung1271 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleVorlesung1284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorlesung1304 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleVorlesung1318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorlesung1338 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_15_in_ruleVorlesung1351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorlesung1371 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_27_in_ruleVorlesung1385 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleVorlesung1406 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleVorlesung1419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleVorlesung1440 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleVorlesung1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudent_in_entryRuleStudent1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStudent1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStudent1537 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStudent1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStudent1566 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleStudent1583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStudent1600 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleStudent1617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStudent1634 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_21_in_ruleStudent1652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStudent1672 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleStudent1685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStudent1705 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleStudent1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDozent_in_entryRuleDozent1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDozent1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDozent1805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleProfessor_in_ruleDozent1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDozent1846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleLehrbeauftrager_in_ruleDozent1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfessor_in_entryRuleProfessor1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProfessor1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProfessor1951 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleProfessor1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProfessor1980 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleProfessor1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProfessor2014 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProfessor2031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProfessor2048 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProfessor2065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProfessor2085 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleProfessor2098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProfessor2118 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleProfessor2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLehrbeauftrager_in_entryRuleLehrbeauftrager2168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLehrbeauftrager2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLehrbeauftrager2215 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLehrbeauftrager2227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2244 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLehrbeauftrager2261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2278 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLehrbeauftrager2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLehrbeauftrager2312 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLehrbeauftrager2329 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLehrbeauftrager2349 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleLehrbeauftrager2362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLehrbeauftrager2382 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleLehrbeauftrager2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation2432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEvaluation2479 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEvaluation2491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation2508 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation2525 = new BitSet(new long[]{0x0000000000000002L});

}