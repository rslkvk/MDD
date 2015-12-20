package de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.thm.mni.hochschule.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hochschule'", "'{'", "'Name'", "'Student'", "'Fachbereich'", "'}'", "','", "'Alias'", "'Studiengang'", "'Dozent'", "'Vorlesung'", "'NC'", "'ModulNr'", "'Beschreibung'", "'CrP'", "'Tutor'", "'Evaluation'", "'MatrikelNr'", "'Vorname'", "'Nachname'", "'Professor'", "'Lehrbeauftragter'", "'PersonalNr'", "'Gesamtnote'"
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
    public String getGrammarFileName() { return "../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleHochschule"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleHochschule : ruleHochschule EOF ;
    public final void entryRuleHochschule() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleHochschule EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleHochschule EOF
            {
             before(grammarAccess.getHochschuleRule()); 
            pushFollow(FOLLOW_ruleHochschule_in_entryRuleHochschule61);
            ruleHochschule();

            state._fsp--;

             after(grammarAccess.getHochschuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHochschule68); 

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
    // $ANTLR end "entryRuleHochschule"


    // $ANTLR start "ruleHochschule"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleHochschule : ( ( rule__Hochschule__Group__0 ) ) ;
    public final void ruleHochschule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Hochschule__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Hochschule__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Hochschule__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Hochschule__Group__0 )
            {
             before(grammarAccess.getHochschuleAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Hochschule__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Hochschule__Group__0
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__0_in_ruleHochschule94);
            rule__Hochschule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHochschule"


    // $ANTLR start "entryRuleFachbereich"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleFachbereich : ruleFachbereich EOF ;
    public final void entryRuleFachbereich() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleFachbereich EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleFachbereich EOF
            {
             before(grammarAccess.getFachbereichRule()); 
            pushFollow(FOLLOW_ruleFachbereich_in_entryRuleFachbereich121);
            ruleFachbereich();

            state._fsp--;

             after(grammarAccess.getFachbereichRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFachbereich128); 

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
    // $ANTLR end "entryRuleFachbereich"


    // $ANTLR start "ruleFachbereich"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleFachbereich : ( ( rule__Fachbereich__Group__0 ) ) ;
    public final void ruleFachbereich() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Fachbereich__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Fachbereich__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Fachbereich__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Fachbereich__Group__0 )
            {
             before(grammarAccess.getFachbereichAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Fachbereich__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Fachbereich__Group__0
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__0_in_ruleFachbereich154);
            rule__Fachbereich__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFachbereich"


    // $ANTLR start "entryRuleStudiengang"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleStudiengang : ruleStudiengang EOF ;
    public final void entryRuleStudiengang() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleStudiengang EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleStudiengang EOF
            {
             before(grammarAccess.getStudiengangRule()); 
            pushFollow(FOLLOW_ruleStudiengang_in_entryRuleStudiengang181);
            ruleStudiengang();

            state._fsp--;

             after(grammarAccess.getStudiengangRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStudiengang188); 

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
    // $ANTLR end "entryRuleStudiengang"


    // $ANTLR start "ruleStudiengang"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleStudiengang : ( ( rule__Studiengang__Group__0 ) ) ;
    public final void ruleStudiengang() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Studiengang__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Studiengang__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Studiengang__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Studiengang__Group__0 )
            {
             before(grammarAccess.getStudiengangAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Studiengang__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Studiengang__Group__0
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__0_in_ruleStudiengang214);
            rule__Studiengang__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudiengang"


    // $ANTLR start "entryRuleVorlesung"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleVorlesung : ruleVorlesung EOF ;
    public final void entryRuleVorlesung() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleVorlesung EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleVorlesung EOF
            {
             before(grammarAccess.getVorlesungRule()); 
            pushFollow(FOLLOW_ruleVorlesung_in_entryRuleVorlesung241);
            ruleVorlesung();

            state._fsp--;

             after(grammarAccess.getVorlesungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorlesung248); 

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
    // $ANTLR end "entryRuleVorlesung"


    // $ANTLR start "ruleVorlesung"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleVorlesung : ( ( rule__Vorlesung__Group__0 ) ) ;
    public final void ruleVorlesung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Vorlesung__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Vorlesung__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Vorlesung__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Vorlesung__Group__0 )
            {
             before(grammarAccess.getVorlesungAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Vorlesung__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Vorlesung__Group__0
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__0_in_ruleVorlesung274);
            rule__Vorlesung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVorlesung"


    // $ANTLR start "entryRuleStudent"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleStudent EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_ruleStudent_in_entryRuleStudent301);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStudent308); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Student__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Student__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Student__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Student__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Student__Group__0
            {
            pushFollow(FOLLOW_rule__Student__Group__0_in_ruleStudent334);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleDozent"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleDozent : ruleDozent EOF ;
    public final void entryRuleDozent() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleDozent EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleDozent EOF
            {
             before(grammarAccess.getDozentRule()); 
            pushFollow(FOLLOW_ruleDozent_in_entryRuleDozent361);
            ruleDozent();

            state._fsp--;

             after(grammarAccess.getDozentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDozent368); 

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
    // $ANTLR end "entryRuleDozent"


    // $ANTLR start "ruleDozent"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleDozent : ( ( rule__Dozent__Alternatives ) ) ;
    public final void ruleDozent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Dozent__Alternatives ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Dozent__Alternatives ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Dozent__Alternatives ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Dozent__Alternatives )
            {
             before(grammarAccess.getDozentAccess().getAlternatives()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Dozent__Alternatives )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Dozent__Alternatives
            {
            pushFollow(FOLLOW_rule__Dozent__Alternatives_in_ruleDozent394);
            rule__Dozent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDozentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDozent"


    // $ANTLR start "entryRuleProfessor"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleProfessor : ruleProfessor EOF ;
    public final void entryRuleProfessor() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleProfessor EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleProfessor EOF
            {
             before(grammarAccess.getProfessorRule()); 
            pushFollow(FOLLOW_ruleProfessor_in_entryRuleProfessor421);
            ruleProfessor();

            state._fsp--;

             after(grammarAccess.getProfessorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProfessor428); 

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
    // $ANTLR end "entryRuleProfessor"


    // $ANTLR start "ruleProfessor"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleProfessor : ( ( rule__Professor__Group__0 ) ) ;
    public final void ruleProfessor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Professor__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Professor__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Professor__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Professor__Group__0 )
            {
             before(grammarAccess.getProfessorAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Professor__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Professor__Group__0
            {
            pushFollow(FOLLOW_rule__Professor__Group__0_in_ruleProfessor454);
            rule__Professor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfessor"


    // $ANTLR start "entryRuleLehrbeauftrager"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleLehrbeauftrager : ruleLehrbeauftrager EOF ;
    public final void entryRuleLehrbeauftrager() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleLehrbeauftrager EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleLehrbeauftrager EOF
            {
             before(grammarAccess.getLehrbeauftragerRule()); 
            pushFollow(FOLLOW_ruleLehrbeauftrager_in_entryRuleLehrbeauftrager481);
            ruleLehrbeauftrager();

            state._fsp--;

             after(grammarAccess.getLehrbeauftragerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLehrbeauftrager488); 

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
    // $ANTLR end "entryRuleLehrbeauftrager"


    // $ANTLR start "ruleLehrbeauftrager"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleLehrbeauftrager : ( ( rule__Lehrbeauftrager__Group__0 ) ) ;
    public final void ruleLehrbeauftrager() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Lehrbeauftrager__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Lehrbeauftrager__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Lehrbeauftrager__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Lehrbeauftrager__Group__0 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Lehrbeauftrager__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Lehrbeauftrager__Group__0
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__0_in_ruleLehrbeauftrager514);
            rule__Lehrbeauftrager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLehrbeauftrager"


    // $ANTLR start "entryRuleEvaluation"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleEvaluation EOF )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation541);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation548); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Evaluation__Group__0 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Evaluation__Group__0 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Evaluation__Group__0 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation574);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "rule__Dozent__Alternatives"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: rule__Dozent__Alternatives : ( ( ( rule__Dozent__Group_0__0 ) ) | ( ( rule__Dozent__Group_1__0 ) ) );
    public final void rule__Dozent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( ( ( rule__Dozent__Group_0__0 ) ) | ( ( rule__Dozent__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ( ( rule__Dozent__Group_0__0 ) )
                    {
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ( ( rule__Dozent__Group_0__0 ) )
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: ( rule__Dozent__Group_0__0 )
                    {
                     before(grammarAccess.getDozentAccess().getGroup_0()); 
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:319:1: ( rule__Dozent__Group_0__0 )
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:319:2: rule__Dozent__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Dozent__Group_0__0_in_rule__Dozent__Alternatives610);
                    rule__Dozent__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDozentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:6: ( ( rule__Dozent__Group_1__0 ) )
                    {
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:323:6: ( ( rule__Dozent__Group_1__0 ) )
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ( rule__Dozent__Group_1__0 )
                    {
                     before(grammarAccess.getDozentAccess().getGroup_1()); 
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( rule__Dozent__Group_1__0 )
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: rule__Dozent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Dozent__Group_1__0_in_rule__Dozent__Alternatives628);
                    rule__Dozent__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDozentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Dozent__Alternatives"


    // $ANTLR start "rule__Hochschule__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: rule__Hochschule__Group__0 : rule__Hochschule__Group__0__Impl rule__Hochschule__Group__1 ;
    public final void rule__Hochschule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( rule__Hochschule__Group__0__Impl rule__Hochschule__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:2: rule__Hochschule__Group__0__Impl rule__Hochschule__Group__1
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__0__Impl_in_rule__Hochschule__Group__0659);
            rule__Hochschule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__1_in_rule__Hochschule__Group__0662);
            rule__Hochschule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__0"


    // $ANTLR start "rule__Hochschule__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:348:1: rule__Hochschule__Group__0__Impl : ( 'Hochschule' ) ;
    public final void rule__Hochschule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( ( 'Hochschule' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( 'Hochschule' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: ( 'Hochschule' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: 'Hochschule'
            {
             before(grammarAccess.getHochschuleAccess().getHochschuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Hochschule__Group__0__Impl690); 
             after(grammarAccess.getHochschuleAccess().getHochschuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__0__Impl"


    // $ANTLR start "rule__Hochschule__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: rule__Hochschule__Group__1 : rule__Hochschule__Group__1__Impl rule__Hochschule__Group__2 ;
    public final void rule__Hochschule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( rule__Hochschule__Group__1__Impl rule__Hochschule__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:2: rule__Hochschule__Group__1__Impl rule__Hochschule__Group__2
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__1__Impl_in_rule__Hochschule__Group__1721);
            rule__Hochschule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__2_in_rule__Hochschule__Group__1724);
            rule__Hochschule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__1"


    // $ANTLR start "rule__Hochschule__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: rule__Hochschule__Group__1__Impl : ( '{' ) ;
    public final void rule__Hochschule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: '{'
            {
             before(grammarAccess.getHochschuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Hochschule__Group__1__Impl752); 
             after(grammarAccess.getHochschuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__1__Impl"


    // $ANTLR start "rule__Hochschule__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: rule__Hochschule__Group__2 : rule__Hochschule__Group__2__Impl rule__Hochschule__Group__3 ;
    public final void rule__Hochschule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( rule__Hochschule__Group__2__Impl rule__Hochschule__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:2: rule__Hochschule__Group__2__Impl rule__Hochschule__Group__3
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__2__Impl_in_rule__Hochschule__Group__2783);
            rule__Hochschule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__3_in_rule__Hochschule__Group__2786);
            rule__Hochschule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__2"


    // $ANTLR start "rule__Hochschule__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: rule__Hochschule__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Hochschule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( ( 'Name' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( 'Name' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( 'Name' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: 'Name'
            {
             before(grammarAccess.getHochschuleAccess().getNameKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Hochschule__Group__2__Impl814); 
             after(grammarAccess.getHochschuleAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__2__Impl"


    // $ANTLR start "rule__Hochschule__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: rule__Hochschule__Group__3 : rule__Hochschule__Group__3__Impl rule__Hochschule__Group__4 ;
    public final void rule__Hochschule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( rule__Hochschule__Group__3__Impl rule__Hochschule__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:2: rule__Hochschule__Group__3__Impl rule__Hochschule__Group__4
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__3__Impl_in_rule__Hochschule__Group__3845);
            rule__Hochschule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__4_in_rule__Hochschule__Group__3848);
            rule__Hochschule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__3"


    // $ANTLR start "rule__Hochschule__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: rule__Hochschule__Group__3__Impl : ( ( rule__Hochschule__NameAssignment_3 ) ) ;
    public final void rule__Hochschule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: ( ( ( rule__Hochschule__NameAssignment_3 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( ( rule__Hochschule__NameAssignment_3 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( ( rule__Hochschule__NameAssignment_3 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( rule__Hochschule__NameAssignment_3 )
            {
             before(grammarAccess.getHochschuleAccess().getNameAssignment_3()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: ( rule__Hochschule__NameAssignment_3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:2: rule__Hochschule__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Hochschule__NameAssignment_3_in_rule__Hochschule__Group__3__Impl875);
            rule__Hochschule__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__3__Impl"


    // $ANTLR start "rule__Hochschule__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: rule__Hochschule__Group__4 : rule__Hochschule__Group__4__Impl rule__Hochschule__Group__5 ;
    public final void rule__Hochschule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( rule__Hochschule__Group__4__Impl rule__Hochschule__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:463:2: rule__Hochschule__Group__4__Impl rule__Hochschule__Group__5
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__4__Impl_in_rule__Hochschule__Group__4905);
            rule__Hochschule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__5_in_rule__Hochschule__Group__4908);
            rule__Hochschule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__4"


    // $ANTLR start "rule__Hochschule__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: rule__Hochschule__Group__4__Impl : ( 'Student' ) ;
    public final void rule__Hochschule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: ( ( 'Student' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( 'Student' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( 'Student' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: 'Student'
            {
             before(grammarAccess.getHochschuleAccess().getStudentKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Hochschule__Group__4__Impl936); 
             after(grammarAccess.getHochschuleAccess().getStudentKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__4__Impl"


    // $ANTLR start "rule__Hochschule__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: rule__Hochschule__Group__5 : rule__Hochschule__Group__5__Impl rule__Hochschule__Group__6 ;
    public final void rule__Hochschule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: ( rule__Hochschule__Group__5__Impl rule__Hochschule__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:2: rule__Hochschule__Group__5__Impl rule__Hochschule__Group__6
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__5__Impl_in_rule__Hochschule__Group__5967);
            rule__Hochschule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__6_in_rule__Hochschule__Group__5970);
            rule__Hochschule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__5"


    // $ANTLR start "rule__Hochschule__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: rule__Hochschule__Group__5__Impl : ( ( rule__Hochschule__StudentAssignment_5 ) ) ;
    public final void rule__Hochschule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( ( ( rule__Hochschule__StudentAssignment_5 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( ( rule__Hochschule__StudentAssignment_5 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( ( rule__Hochschule__StudentAssignment_5 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( rule__Hochschule__StudentAssignment_5 )
            {
             before(grammarAccess.getHochschuleAccess().getStudentAssignment_5()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ( rule__Hochschule__StudentAssignment_5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:2: rule__Hochschule__StudentAssignment_5
            {
            pushFollow(FOLLOW_rule__Hochschule__StudentAssignment_5_in_rule__Hochschule__Group__5__Impl997);
            rule__Hochschule__StudentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getStudentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__5__Impl"


    // $ANTLR start "rule__Hochschule__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: rule__Hochschule__Group__6 : rule__Hochschule__Group__6__Impl rule__Hochschule__Group__7 ;
    public final void rule__Hochschule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( rule__Hochschule__Group__6__Impl rule__Hochschule__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:2: rule__Hochschule__Group__6__Impl rule__Hochschule__Group__7
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__6__Impl_in_rule__Hochschule__Group__61027);
            rule__Hochschule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__7_in_rule__Hochschule__Group__61030);
            rule__Hochschule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__6"


    // $ANTLR start "rule__Hochschule__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: rule__Hochschule__Group__6__Impl : ( ( rule__Hochschule__Group_6__0 )* ) ;
    public final void rule__Hochschule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( ( ( rule__Hochschule__Group_6__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( ( rule__Hochschule__Group_6__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( ( rule__Hochschule__Group_6__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( rule__Hochschule__Group_6__0 )*
            {
             before(grammarAccess.getHochschuleAccess().getGroup_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( rule__Hochschule__Group_6__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:2: rule__Hochschule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Hochschule__Group_6__0_in_rule__Hochschule__Group__6__Impl1057);
            	    rule__Hochschule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHochschuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__6__Impl"


    // $ANTLR start "rule__Hochschule__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: rule__Hochschule__Group__7 : rule__Hochschule__Group__7__Impl rule__Hochschule__Group__8 ;
    public final void rule__Hochschule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__Hochschule__Group__7__Impl rule__Hochschule__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__Hochschule__Group__7__Impl rule__Hochschule__Group__8
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__7__Impl_in_rule__Hochschule__Group__71088);
            rule__Hochschule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__8_in_rule__Hochschule__Group__71091);
            rule__Hochschule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__7"


    // $ANTLR start "rule__Hochschule__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: rule__Hochschule__Group__7__Impl : ( 'Fachbereich' ) ;
    public final void rule__Hochschule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( ( 'Fachbereich' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( 'Fachbereich' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( 'Fachbereich' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: 'Fachbereich'
            {
             before(grammarAccess.getHochschuleAccess().getFachbereichKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Hochschule__Group__7__Impl1119); 
             after(grammarAccess.getHochschuleAccess().getFachbereichKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__7__Impl"


    // $ANTLR start "rule__Hochschule__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: rule__Hochschule__Group__8 : rule__Hochschule__Group__8__Impl rule__Hochschule__Group__9 ;
    public final void rule__Hochschule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__Hochschule__Group__8__Impl rule__Hochschule__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:2: rule__Hochschule__Group__8__Impl rule__Hochschule__Group__9
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__8__Impl_in_rule__Hochschule__Group__81150);
            rule__Hochschule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__9_in_rule__Hochschule__Group__81153);
            rule__Hochschule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__8"


    // $ANTLR start "rule__Hochschule__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: rule__Hochschule__Group__8__Impl : ( ( rule__Hochschule__FachbereichAssignment_8 ) ) ;
    public final void rule__Hochschule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ( ( rule__Hochschule__FachbereichAssignment_8 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( ( rule__Hochschule__FachbereichAssignment_8 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( ( rule__Hochschule__FachbereichAssignment_8 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( rule__Hochschule__FachbereichAssignment_8 )
            {
             before(grammarAccess.getHochschuleAccess().getFachbereichAssignment_8()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( rule__Hochschule__FachbereichAssignment_8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:2: rule__Hochschule__FachbereichAssignment_8
            {
            pushFollow(FOLLOW_rule__Hochschule__FachbereichAssignment_8_in_rule__Hochschule__Group__8__Impl1180);
            rule__Hochschule__FachbereichAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getFachbereichAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__8__Impl"


    // $ANTLR start "rule__Hochschule__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: rule__Hochschule__Group__9 : rule__Hochschule__Group__9__Impl rule__Hochschule__Group__10 ;
    public final void rule__Hochschule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__Hochschule__Group__9__Impl rule__Hochschule__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:2: rule__Hochschule__Group__9__Impl rule__Hochschule__Group__10
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__9__Impl_in_rule__Hochschule__Group__91210);
            rule__Hochschule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group__10_in_rule__Hochschule__Group__91213);
            rule__Hochschule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__9"


    // $ANTLR start "rule__Hochschule__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: rule__Hochschule__Group__9__Impl : ( ( rule__Hochschule__Group_9__0 )* ) ;
    public final void rule__Hochschule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ( ( rule__Hochschule__Group_9__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( rule__Hochschule__Group_9__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( rule__Hochschule__Group_9__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( rule__Hochschule__Group_9__0 )*
            {
             before(grammarAccess.getHochschuleAccess().getGroup_9()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( rule__Hochschule__Group_9__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:2: rule__Hochschule__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Hochschule__Group_9__0_in_rule__Hochschule__Group__9__Impl1240);
            	    rule__Hochschule__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getHochschuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__9__Impl"


    // $ANTLR start "rule__Hochschule__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: rule__Hochschule__Group__10 : rule__Hochschule__Group__10__Impl ;
    public final void rule__Hochschule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( rule__Hochschule__Group__10__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:641:2: rule__Hochschule__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Hochschule__Group__10__Impl_in_rule__Hochschule__Group__101271);
            rule__Hochschule__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__10"


    // $ANTLR start "rule__Hochschule__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: rule__Hochschule__Group__10__Impl : ( '}' ) ;
    public final void rule__Hochschule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: '}'
            {
             before(grammarAccess.getHochschuleAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Hochschule__Group__10__Impl1299); 
             after(grammarAccess.getHochschuleAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group__10__Impl"


    // $ANTLR start "rule__Hochschule__Group_6__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: rule__Hochschule__Group_6__0 : rule__Hochschule__Group_6__0__Impl rule__Hochschule__Group_6__1 ;
    public final void rule__Hochschule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__Hochschule__Group_6__0__Impl rule__Hochschule__Group_6__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:2: rule__Hochschule__Group_6__0__Impl rule__Hochschule__Group_6__1
            {
            pushFollow(FOLLOW_rule__Hochschule__Group_6__0__Impl_in_rule__Hochschule__Group_6__01352);
            rule__Hochschule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group_6__1_in_rule__Hochschule__Group_6__01355);
            rule__Hochschule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_6__0"


    // $ANTLR start "rule__Hochschule__Group_6__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: rule__Hochschule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Hochschule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ','
            {
             before(grammarAccess.getHochschuleAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_17_in_rule__Hochschule__Group_6__0__Impl1383); 
             after(grammarAccess.getHochschuleAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_6__0__Impl"


    // $ANTLR start "rule__Hochschule__Group_6__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Hochschule__Group_6__1 : rule__Hochschule__Group_6__1__Impl ;
    public final void rule__Hochschule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( rule__Hochschule__Group_6__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:2: rule__Hochschule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Hochschule__Group_6__1__Impl_in_rule__Hochschule__Group_6__11414);
            rule__Hochschule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_6__1"


    // $ANTLR start "rule__Hochschule__Group_6__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: rule__Hochschule__Group_6__1__Impl : ( ( rule__Hochschule__StudentAssignment_6_1 ) ) ;
    public final void rule__Hochschule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ( ( rule__Hochschule__StudentAssignment_6_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ( rule__Hochschule__StudentAssignment_6_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( ( rule__Hochschule__StudentAssignment_6_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( rule__Hochschule__StudentAssignment_6_1 )
            {
             before(grammarAccess.getHochschuleAccess().getStudentAssignment_6_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( rule__Hochschule__StudentAssignment_6_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:2: rule__Hochschule__StudentAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Hochschule__StudentAssignment_6_1_in_rule__Hochschule__Group_6__1__Impl1441);
            rule__Hochschule__StudentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getStudentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_6__1__Impl"


    // $ANTLR start "rule__Hochschule__Group_9__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: rule__Hochschule__Group_9__0 : rule__Hochschule__Group_9__0__Impl rule__Hochschule__Group_9__1 ;
    public final void rule__Hochschule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__Hochschule__Group_9__0__Impl rule__Hochschule__Group_9__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__Hochschule__Group_9__0__Impl rule__Hochschule__Group_9__1
            {
            pushFollow(FOLLOW_rule__Hochschule__Group_9__0__Impl_in_rule__Hochschule__Group_9__01475);
            rule__Hochschule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hochschule__Group_9__1_in_rule__Hochschule__Group_9__01478);
            rule__Hochschule__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_9__0"


    // $ANTLR start "rule__Hochschule__Group_9__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__Hochschule__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Hochschule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ','
            {
             before(grammarAccess.getHochschuleAccess().getCommaKeyword_9_0()); 
            match(input,17,FOLLOW_17_in_rule__Hochschule__Group_9__0__Impl1506); 
             after(grammarAccess.getHochschuleAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_9__0__Impl"


    // $ANTLR start "rule__Hochschule__Group_9__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: rule__Hochschule__Group_9__1 : rule__Hochschule__Group_9__1__Impl ;
    public final void rule__Hochschule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( rule__Hochschule__Group_9__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:787:2: rule__Hochschule__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Hochschule__Group_9__1__Impl_in_rule__Hochschule__Group_9__11537);
            rule__Hochschule__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_9__1"


    // $ANTLR start "rule__Hochschule__Group_9__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__Hochschule__Group_9__1__Impl : ( ( rule__Hochschule__FachbereichAssignment_9_1 ) ) ;
    public final void rule__Hochschule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ( rule__Hochschule__FachbereichAssignment_9_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Hochschule__FachbereichAssignment_9_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Hochschule__FachbereichAssignment_9_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( rule__Hochschule__FachbereichAssignment_9_1 )
            {
             before(grammarAccess.getHochschuleAccess().getFachbereichAssignment_9_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( rule__Hochschule__FachbereichAssignment_9_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:2: rule__Hochschule__FachbereichAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Hochschule__FachbereichAssignment_9_1_in_rule__Hochschule__Group_9__1__Impl1564);
            rule__Hochschule__FachbereichAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getHochschuleAccess().getFachbereichAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__Group_9__1__Impl"


    // $ANTLR start "rule__Fachbereich__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: rule__Fachbereich__Group__0 : rule__Fachbereich__Group__0__Impl rule__Fachbereich__Group__1 ;
    public final void rule__Fachbereich__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__Fachbereich__Group__0__Impl rule__Fachbereich__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:2: rule__Fachbereich__Group__0__Impl rule__Fachbereich__Group__1
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__0__Impl_in_rule__Fachbereich__Group__01598);
            rule__Fachbereich__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__1_in_rule__Fachbereich__Group__01601);
            rule__Fachbereich__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__0"


    // $ANTLR start "rule__Fachbereich__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__Fachbereich__Group__0__Impl : ( '{' ) ;
    public final void rule__Fachbereich__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: '{'
            {
             before(grammarAccess.getFachbereichAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Fachbereich__Group__0__Impl1629); 
             after(grammarAccess.getFachbereichAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__0__Impl"


    // $ANTLR start "rule__Fachbereich__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: rule__Fachbereich__Group__1 : rule__Fachbereich__Group__1__Impl rule__Fachbereich__Group__2 ;
    public final void rule__Fachbereich__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( rule__Fachbereich__Group__1__Impl rule__Fachbereich__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:850:2: rule__Fachbereich__Group__1__Impl rule__Fachbereich__Group__2
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__1__Impl_in_rule__Fachbereich__Group__11660);
            rule__Fachbereich__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__2_in_rule__Fachbereich__Group__11663);
            rule__Fachbereich__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__1"


    // $ANTLR start "rule__Fachbereich__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: rule__Fachbereich__Group__1__Impl : ( 'Name' ) ;
    public final void rule__Fachbereich__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( ( 'Name' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( 'Name' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( 'Name' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: 'Name'
            {
             before(grammarAccess.getFachbereichAccess().getNameKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Fachbereich__Group__1__Impl1691); 
             after(grammarAccess.getFachbereichAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__1__Impl"


    // $ANTLR start "rule__Fachbereich__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: rule__Fachbereich__Group__2 : rule__Fachbereich__Group__2__Impl rule__Fachbereich__Group__3 ;
    public final void rule__Fachbereich__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( rule__Fachbereich__Group__2__Impl rule__Fachbereich__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:2: rule__Fachbereich__Group__2__Impl rule__Fachbereich__Group__3
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__2__Impl_in_rule__Fachbereich__Group__21722);
            rule__Fachbereich__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__3_in_rule__Fachbereich__Group__21725);
            rule__Fachbereich__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__2"


    // $ANTLR start "rule__Fachbereich__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: rule__Fachbereich__Group__2__Impl : ( ( rule__Fachbereich__NameAssignment_2 ) ) ;
    public final void rule__Fachbereich__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( ( ( rule__Fachbereich__NameAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( rule__Fachbereich__NameAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( rule__Fachbereich__NameAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( rule__Fachbereich__NameAssignment_2 )
            {
             before(grammarAccess.getFachbereichAccess().getNameAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( rule__Fachbereich__NameAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:2: rule__Fachbereich__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Fachbereich__NameAssignment_2_in_rule__Fachbereich__Group__2__Impl1752);
            rule__Fachbereich__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__2__Impl"


    // $ANTLR start "rule__Fachbereich__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__Fachbereich__Group__3 : rule__Fachbereich__Group__3__Impl rule__Fachbereich__Group__4 ;
    public final void rule__Fachbereich__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( rule__Fachbereich__Group__3__Impl rule__Fachbereich__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:2: rule__Fachbereich__Group__3__Impl rule__Fachbereich__Group__4
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__3__Impl_in_rule__Fachbereich__Group__31782);
            rule__Fachbereich__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__4_in_rule__Fachbereich__Group__31785);
            rule__Fachbereich__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__3"


    // $ANTLR start "rule__Fachbereich__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: rule__Fachbereich__Group__3__Impl : ( 'Alias' ) ;
    public final void rule__Fachbereich__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( ( 'Alias' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( 'Alias' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( 'Alias' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: 'Alias'
            {
             before(grammarAccess.getFachbereichAccess().getAliasKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Fachbereich__Group__3__Impl1813); 
             after(grammarAccess.getFachbereichAccess().getAliasKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__3__Impl"


    // $ANTLR start "rule__Fachbereich__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: rule__Fachbereich__Group__4 : rule__Fachbereich__Group__4__Impl rule__Fachbereich__Group__5 ;
    public final void rule__Fachbereich__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__Fachbereich__Group__4__Impl rule__Fachbereich__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__Fachbereich__Group__4__Impl rule__Fachbereich__Group__5
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__4__Impl_in_rule__Fachbereich__Group__41844);
            rule__Fachbereich__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__5_in_rule__Fachbereich__Group__41847);
            rule__Fachbereich__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__4"


    // $ANTLR start "rule__Fachbereich__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: rule__Fachbereich__Group__4__Impl : ( ( rule__Fachbereich__AliasAssignment_4 ) ) ;
    public final void rule__Fachbereich__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( ( rule__Fachbereich__AliasAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__Fachbereich__AliasAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__Fachbereich__AliasAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Fachbereich__AliasAssignment_4 )
            {
             before(grammarAccess.getFachbereichAccess().getAliasAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__Fachbereich__AliasAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__Fachbereich__AliasAssignment_4
            {
            pushFollow(FOLLOW_rule__Fachbereich__AliasAssignment_4_in_rule__Fachbereich__Group__4__Impl1874);
            rule__Fachbereich__AliasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getAliasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__4__Impl"


    // $ANTLR start "rule__Fachbereich__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: rule__Fachbereich__Group__5 : rule__Fachbereich__Group__5__Impl rule__Fachbereich__Group__6 ;
    public final void rule__Fachbereich__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( rule__Fachbereich__Group__5__Impl rule__Fachbereich__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:2: rule__Fachbereich__Group__5__Impl rule__Fachbereich__Group__6
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__5__Impl_in_rule__Fachbereich__Group__51904);
            rule__Fachbereich__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__6_in_rule__Fachbereich__Group__51907);
            rule__Fachbereich__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__5"


    // $ANTLR start "rule__Fachbereich__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Fachbereich__Group__5__Impl : ( 'Studiengang' ) ;
    public final void rule__Fachbereich__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ( 'Studiengang' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( 'Studiengang' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( 'Studiengang' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: 'Studiengang'
            {
             before(grammarAccess.getFachbereichAccess().getStudiengangKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Fachbereich__Group__5__Impl1935); 
             after(grammarAccess.getFachbereichAccess().getStudiengangKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__5__Impl"


    // $ANTLR start "rule__Fachbereich__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: rule__Fachbereich__Group__6 : rule__Fachbereich__Group__6__Impl rule__Fachbereich__Group__7 ;
    public final void rule__Fachbereich__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Fachbereich__Group__6__Impl rule__Fachbereich__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:2: rule__Fachbereich__Group__6__Impl rule__Fachbereich__Group__7
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__6__Impl_in_rule__Fachbereich__Group__61966);
            rule__Fachbereich__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__7_in_rule__Fachbereich__Group__61969);
            rule__Fachbereich__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__6"


    // $ANTLR start "rule__Fachbereich__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: rule__Fachbereich__Group__6__Impl : ( ( rule__Fachbereich__StudiengangAssignment_6 ) ) ;
    public final void rule__Fachbereich__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ( ( rule__Fachbereich__StudiengangAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ( rule__Fachbereich__StudiengangAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ( rule__Fachbereich__StudiengangAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__Fachbereich__StudiengangAssignment_6 )
            {
             before(grammarAccess.getFachbereichAccess().getStudiengangAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( rule__Fachbereich__StudiengangAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:2: rule__Fachbereich__StudiengangAssignment_6
            {
            pushFollow(FOLLOW_rule__Fachbereich__StudiengangAssignment_6_in_rule__Fachbereich__Group__6__Impl1996);
            rule__Fachbereich__StudiengangAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getStudiengangAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__6__Impl"


    // $ANTLR start "rule__Fachbereich__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__Fachbereich__Group__7 : rule__Fachbereich__Group__7__Impl rule__Fachbereich__Group__8 ;
    public final void rule__Fachbereich__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( rule__Fachbereich__Group__7__Impl rule__Fachbereich__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:2: rule__Fachbereich__Group__7__Impl rule__Fachbereich__Group__8
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__7__Impl_in_rule__Fachbereich__Group__72026);
            rule__Fachbereich__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__8_in_rule__Fachbereich__Group__72029);
            rule__Fachbereich__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__7"


    // $ANTLR start "rule__Fachbereich__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__Fachbereich__Group__7__Impl : ( ( rule__Fachbereich__Group_7__0 )* ) ;
    public final void rule__Fachbereich__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ( ( rule__Fachbereich__Group_7__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__Fachbereich__Group_7__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__Fachbereich__Group_7__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__Fachbereich__Group_7__0 )*
            {
             before(grammarAccess.getFachbereichAccess().getGroup_7()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( rule__Fachbereich__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__Fachbereich__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Fachbereich__Group_7__0_in_rule__Fachbereich__Group__7__Impl2056);
            	    rule__Fachbereich__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFachbereichAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__7__Impl"


    // $ANTLR start "rule__Fachbereich__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: rule__Fachbereich__Group__8 : rule__Fachbereich__Group__8__Impl rule__Fachbereich__Group__9 ;
    public final void rule__Fachbereich__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: ( rule__Fachbereich__Group__8__Impl rule__Fachbereich__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:2: rule__Fachbereich__Group__8__Impl rule__Fachbereich__Group__9
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__8__Impl_in_rule__Fachbereich__Group__82087);
            rule__Fachbereich__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__9_in_rule__Fachbereich__Group__82090);
            rule__Fachbereich__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__8"


    // $ANTLR start "rule__Fachbereich__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: rule__Fachbereich__Group__8__Impl : ( 'Dozent' ) ;
    public final void rule__Fachbereich__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( ( 'Dozent' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( 'Dozent' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( 'Dozent' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: 'Dozent'
            {
             before(grammarAccess.getFachbereichAccess().getDozentKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Fachbereich__Group__8__Impl2118); 
             after(grammarAccess.getFachbereichAccess().getDozentKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__8__Impl"


    // $ANTLR start "rule__Fachbereich__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: rule__Fachbereich__Group__9 : rule__Fachbereich__Group__9__Impl rule__Fachbereich__Group__10 ;
    public final void rule__Fachbereich__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( rule__Fachbereich__Group__9__Impl rule__Fachbereich__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:2: rule__Fachbereich__Group__9__Impl rule__Fachbereich__Group__10
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__9__Impl_in_rule__Fachbereich__Group__92149);
            rule__Fachbereich__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__10_in_rule__Fachbereich__Group__92152);
            rule__Fachbereich__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__9"


    // $ANTLR start "rule__Fachbereich__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: rule__Fachbereich__Group__9__Impl : ( ( rule__Fachbereich__DozentAssignment_9 ) ) ;
    public final void rule__Fachbereich__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( ( ( rule__Fachbereich__DozentAssignment_9 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( ( rule__Fachbereich__DozentAssignment_9 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( ( rule__Fachbereich__DozentAssignment_9 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( rule__Fachbereich__DozentAssignment_9 )
            {
             before(grammarAccess.getFachbereichAccess().getDozentAssignment_9()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__Fachbereich__DozentAssignment_9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:2: rule__Fachbereich__DozentAssignment_9
            {
            pushFollow(FOLLOW_rule__Fachbereich__DozentAssignment_9_in_rule__Fachbereich__Group__9__Impl2179);
            rule__Fachbereich__DozentAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getDozentAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__9__Impl"


    // $ANTLR start "rule__Fachbereich__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: rule__Fachbereich__Group__10 : rule__Fachbereich__Group__10__Impl rule__Fachbereich__Group__11 ;
    public final void rule__Fachbereich__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( rule__Fachbereich__Group__10__Impl rule__Fachbereich__Group__11 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:2: rule__Fachbereich__Group__10__Impl rule__Fachbereich__Group__11
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__10__Impl_in_rule__Fachbereich__Group__102209);
            rule__Fachbereich__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__11_in_rule__Fachbereich__Group__102212);
            rule__Fachbereich__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__10"


    // $ANTLR start "rule__Fachbereich__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: rule__Fachbereich__Group__10__Impl : ( ( rule__Fachbereich__Group_10__0 )* ) ;
    public final void rule__Fachbereich__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( ( ( rule__Fachbereich__Group_10__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( rule__Fachbereich__Group_10__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( rule__Fachbereich__Group_10__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rule__Fachbereich__Group_10__0 )*
            {
             before(grammarAccess.getFachbereichAccess().getGroup_10()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( rule__Fachbereich__Group_10__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:2: rule__Fachbereich__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Fachbereich__Group_10__0_in_rule__Fachbereich__Group__10__Impl2239);
            	    rule__Fachbereich__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFachbereichAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__10__Impl"


    // $ANTLR start "rule__Fachbereich__Group__11"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: rule__Fachbereich__Group__11 : rule__Fachbereich__Group__11__Impl rule__Fachbereich__Group__12 ;
    public final void rule__Fachbereich__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( rule__Fachbereich__Group__11__Impl rule__Fachbereich__Group__12 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:2: rule__Fachbereich__Group__11__Impl rule__Fachbereich__Group__12
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__11__Impl_in_rule__Fachbereich__Group__112270);
            rule__Fachbereich__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group__12_in_rule__Fachbereich__Group__112273);
            rule__Fachbereich__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__11"


    // $ANTLR start "rule__Fachbereich__Group__11__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__Fachbereich__Group__11__Impl : ( ( rule__Fachbereich__Group_11__0 )? ) ;
    public final void rule__Fachbereich__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( ( rule__Fachbereich__Group_11__0 )? ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rule__Fachbereich__Group_11__0 )? )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rule__Fachbereich__Group_11__0 )? )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rule__Fachbereich__Group_11__0 )?
            {
             before(grammarAccess.getFachbereichAccess().getGroup_11()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Fachbereich__Group_11__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:2: rule__Fachbereich__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Fachbereich__Group_11__0_in_rule__Fachbereich__Group__11__Impl2300);
                    rule__Fachbereich__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFachbereichAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__11__Impl"


    // $ANTLR start "rule__Fachbereich__Group__12"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: rule__Fachbereich__Group__12 : rule__Fachbereich__Group__12__Impl ;
    public final void rule__Fachbereich__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( rule__Fachbereich__Group__12__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:2: rule__Fachbereich__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group__12__Impl_in_rule__Fachbereich__Group__122331);
            rule__Fachbereich__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__12"


    // $ANTLR start "rule__Fachbereich__Group__12__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: rule__Fachbereich__Group__12__Impl : ( '}' ) ;
    public final void rule__Fachbereich__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: '}'
            {
             before(grammarAccess.getFachbereichAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_16_in_rule__Fachbereich__Group__12__Impl2359); 
             after(grammarAccess.getFachbereichAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group__12__Impl"


    // $ANTLR start "rule__Fachbereich__Group_7__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: rule__Fachbereich__Group_7__0 : rule__Fachbereich__Group_7__0__Impl rule__Fachbereich__Group_7__1 ;
    public final void rule__Fachbereich__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( rule__Fachbereich__Group_7__0__Impl rule__Fachbereich__Group_7__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:2: rule__Fachbereich__Group_7__0__Impl rule__Fachbereich__Group_7__1
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_7__0__Impl_in_rule__Fachbereich__Group_7__02416);
            rule__Fachbereich__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group_7__1_in_rule__Fachbereich__Group_7__02419);
            rule__Fachbereich__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_7__0"


    // $ANTLR start "rule__Fachbereich__Group_7__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__Fachbereich__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Fachbereich__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ','
            {
             before(grammarAccess.getFachbereichAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_17_in_rule__Fachbereich__Group_7__0__Impl2447); 
             after(grammarAccess.getFachbereichAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_7__0__Impl"


    // $ANTLR start "rule__Fachbereich__Group_7__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: rule__Fachbereich__Group_7__1 : rule__Fachbereich__Group_7__1__Impl ;
    public final void rule__Fachbereich__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( rule__Fachbereich__Group_7__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:2: rule__Fachbereich__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_7__1__Impl_in_rule__Fachbereich__Group_7__12478);
            rule__Fachbereich__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_7__1"


    // $ANTLR start "rule__Fachbereich__Group_7__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: rule__Fachbereich__Group_7__1__Impl : ( ( rule__Fachbereich__StudiengangAssignment_7_1 ) ) ;
    public final void rule__Fachbereich__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( ( ( rule__Fachbereich__StudiengangAssignment_7_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( ( rule__Fachbereich__StudiengangAssignment_7_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( ( rule__Fachbereich__StudiengangAssignment_7_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( rule__Fachbereich__StudiengangAssignment_7_1 )
            {
             before(grammarAccess.getFachbereichAccess().getStudiengangAssignment_7_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( rule__Fachbereich__StudiengangAssignment_7_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:2: rule__Fachbereich__StudiengangAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Fachbereich__StudiengangAssignment_7_1_in_rule__Fachbereich__Group_7__1__Impl2505);
            rule__Fachbereich__StudiengangAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getStudiengangAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_7__1__Impl"


    // $ANTLR start "rule__Fachbereich__Group_10__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: rule__Fachbereich__Group_10__0 : rule__Fachbereich__Group_10__0__Impl rule__Fachbereich__Group_10__1 ;
    public final void rule__Fachbereich__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: ( rule__Fachbereich__Group_10__0__Impl rule__Fachbereich__Group_10__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:2: rule__Fachbereich__Group_10__0__Impl rule__Fachbereich__Group_10__1
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_10__0__Impl_in_rule__Fachbereich__Group_10__02539);
            rule__Fachbereich__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group_10__1_in_rule__Fachbereich__Group_10__02542);
            rule__Fachbereich__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_10__0"


    // $ANTLR start "rule__Fachbereich__Group_10__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: rule__Fachbereich__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Fachbereich__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ','
            {
             before(grammarAccess.getFachbereichAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_17_in_rule__Fachbereich__Group_10__0__Impl2570); 
             after(grammarAccess.getFachbereichAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_10__0__Impl"


    // $ANTLR start "rule__Fachbereich__Group_10__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__Fachbereich__Group_10__1 : rule__Fachbereich__Group_10__1__Impl ;
    public final void rule__Fachbereich__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rule__Fachbereich__Group_10__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:2: rule__Fachbereich__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_10__1__Impl_in_rule__Fachbereich__Group_10__12601);
            rule__Fachbereich__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_10__1"


    // $ANTLR start "rule__Fachbereich__Group_10__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: rule__Fachbereich__Group_10__1__Impl : ( ( rule__Fachbereich__DozentAssignment_10_1 ) ) ;
    public final void rule__Fachbereich__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( ( ( rule__Fachbereich__DozentAssignment_10_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( ( rule__Fachbereich__DozentAssignment_10_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( ( rule__Fachbereich__DozentAssignment_10_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( rule__Fachbereich__DozentAssignment_10_1 )
            {
             before(grammarAccess.getFachbereichAccess().getDozentAssignment_10_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( rule__Fachbereich__DozentAssignment_10_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:2: rule__Fachbereich__DozentAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Fachbereich__DozentAssignment_10_1_in_rule__Fachbereich__Group_10__1__Impl2628);
            rule__Fachbereich__DozentAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getDozentAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_10__1__Impl"


    // $ANTLR start "rule__Fachbereich__Group_11__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__Fachbereich__Group_11__0 : rule__Fachbereich__Group_11__0__Impl rule__Fachbereich__Group_11__1 ;
    public final void rule__Fachbereich__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( rule__Fachbereich__Group_11__0__Impl rule__Fachbereich__Group_11__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:2: rule__Fachbereich__Group_11__0__Impl rule__Fachbereich__Group_11__1
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_11__0__Impl_in_rule__Fachbereich__Group_11__02662);
            rule__Fachbereich__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group_11__1_in_rule__Fachbereich__Group_11__02665);
            rule__Fachbereich__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__0"


    // $ANTLR start "rule__Fachbereich__Group_11__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: rule__Fachbereich__Group_11__0__Impl : ( 'Vorlesung' ) ;
    public final void rule__Fachbereich__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ( 'Vorlesung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( 'Vorlesung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( 'Vorlesung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: 'Vorlesung'
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungKeyword_11_0()); 
            match(input,21,FOLLOW_21_in_rule__Fachbereich__Group_11__0__Impl2693); 
             after(grammarAccess.getFachbereichAccess().getVorlesungKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__0__Impl"


    // $ANTLR start "rule__Fachbereich__Group_11__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: rule__Fachbereich__Group_11__1 : rule__Fachbereich__Group_11__1__Impl rule__Fachbereich__Group_11__2 ;
    public final void rule__Fachbereich__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( rule__Fachbereich__Group_11__1__Impl rule__Fachbereich__Group_11__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:2: rule__Fachbereich__Group_11__1__Impl rule__Fachbereich__Group_11__2
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_11__1__Impl_in_rule__Fachbereich__Group_11__12724);
            rule__Fachbereich__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group_11__2_in_rule__Fachbereich__Group_11__12727);
            rule__Fachbereich__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__1"


    // $ANTLR start "rule__Fachbereich__Group_11__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: rule__Fachbereich__Group_11__1__Impl : ( ( rule__Fachbereich__VorlesungAssignment_11_1 ) ) ;
    public final void rule__Fachbereich__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( ( rule__Fachbereich__VorlesungAssignment_11_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( ( rule__Fachbereich__VorlesungAssignment_11_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( ( rule__Fachbereich__VorlesungAssignment_11_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( rule__Fachbereich__VorlesungAssignment_11_1 )
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: ( rule__Fachbereich__VorlesungAssignment_11_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:2: rule__Fachbereich__VorlesungAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Fachbereich__VorlesungAssignment_11_1_in_rule__Fachbereich__Group_11__1__Impl2754);
            rule__Fachbereich__VorlesungAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__1__Impl"


    // $ANTLR start "rule__Fachbereich__Group_11__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: rule__Fachbereich__Group_11__2 : rule__Fachbereich__Group_11__2__Impl ;
    public final void rule__Fachbereich__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( rule__Fachbereich__Group_11__2__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:2: rule__Fachbereich__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_11__2__Impl_in_rule__Fachbereich__Group_11__22784);
            rule__Fachbereich__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__2"


    // $ANTLR start "rule__Fachbereich__Group_11__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__Fachbereich__Group_11__2__Impl : ( ( rule__Fachbereich__Group_11_2__0 )* ) ;
    public final void rule__Fachbereich__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( ( rule__Fachbereich__Group_11_2__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( ( rule__Fachbereich__Group_11_2__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( ( rule__Fachbereich__Group_11_2__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( rule__Fachbereich__Group_11_2__0 )*
            {
             before(grammarAccess.getFachbereichAccess().getGroup_11_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( rule__Fachbereich__Group_11_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:2: rule__Fachbereich__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Fachbereich__Group_11_2__0_in_rule__Fachbereich__Group_11__2__Impl2811);
            	    rule__Fachbereich__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFachbereichAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11__2__Impl"


    // $ANTLR start "rule__Fachbereich__Group_11_2__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__Fachbereich__Group_11_2__0 : rule__Fachbereich__Group_11_2__0__Impl rule__Fachbereich__Group_11_2__1 ;
    public final void rule__Fachbereich__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( rule__Fachbereich__Group_11_2__0__Impl rule__Fachbereich__Group_11_2__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:2: rule__Fachbereich__Group_11_2__0__Impl rule__Fachbereich__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_11_2__0__Impl_in_rule__Fachbereich__Group_11_2__02848);
            rule__Fachbereich__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fachbereich__Group_11_2__1_in_rule__Fachbereich__Group_11_2__02851);
            rule__Fachbereich__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11_2__0"


    // $ANTLR start "rule__Fachbereich__Group_11_2__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: rule__Fachbereich__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__Fachbereich__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: ','
            {
             before(grammarAccess.getFachbereichAccess().getCommaKeyword_11_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Fachbereich__Group_11_2__0__Impl2879); 
             after(grammarAccess.getFachbereichAccess().getCommaKeyword_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11_2__0__Impl"


    // $ANTLR start "rule__Fachbereich__Group_11_2__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rule__Fachbereich__Group_11_2__1 : rule__Fachbereich__Group_11_2__1__Impl ;
    public final void rule__Fachbereich__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( rule__Fachbereich__Group_11_2__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:2: rule__Fachbereich__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fachbereich__Group_11_2__1__Impl_in_rule__Fachbereich__Group_11_2__12910);
            rule__Fachbereich__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11_2__1"


    // $ANTLR start "rule__Fachbereich__Group_11_2__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: rule__Fachbereich__Group_11_2__1__Impl : ( ( rule__Fachbereich__VorlesungAssignment_11_2_1 ) ) ;
    public final void rule__Fachbereich__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( ( ( rule__Fachbereich__VorlesungAssignment_11_2_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( ( rule__Fachbereich__VorlesungAssignment_11_2_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( ( rule__Fachbereich__VorlesungAssignment_11_2_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( rule__Fachbereich__VorlesungAssignment_11_2_1 )
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_2_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( rule__Fachbereich__VorlesungAssignment_11_2_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:2: rule__Fachbereich__VorlesungAssignment_11_2_1
            {
            pushFollow(FOLLOW_rule__Fachbereich__VorlesungAssignment_11_2_1_in_rule__Fachbereich__Group_11_2__1__Impl2937);
            rule__Fachbereich__VorlesungAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__Group_11_2__1__Impl"


    // $ANTLR start "rule__Studiengang__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: rule__Studiengang__Group__0 : rule__Studiengang__Group__0__Impl rule__Studiengang__Group__1 ;
    public final void rule__Studiengang__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( rule__Studiengang__Group__0__Impl rule__Studiengang__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:2: rule__Studiengang__Group__0__Impl rule__Studiengang__Group__1
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__0__Impl_in_rule__Studiengang__Group__02971);
            rule__Studiengang__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__1_in_rule__Studiengang__Group__02974);
            rule__Studiengang__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__0"


    // $ANTLR start "rule__Studiengang__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: rule__Studiengang__Group__0__Impl : ( '{' ) ;
    public final void rule__Studiengang__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: '{'
            {
             before(grammarAccess.getStudiengangAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Studiengang__Group__0__Impl3002); 
             after(grammarAccess.getStudiengangAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__0__Impl"


    // $ANTLR start "rule__Studiengang__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: rule__Studiengang__Group__1 : rule__Studiengang__Group__1__Impl rule__Studiengang__Group__2 ;
    public final void rule__Studiengang__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( rule__Studiengang__Group__1__Impl rule__Studiengang__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:2: rule__Studiengang__Group__1__Impl rule__Studiengang__Group__2
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__1__Impl_in_rule__Studiengang__Group__13033);
            rule__Studiengang__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__2_in_rule__Studiengang__Group__13036);
            rule__Studiengang__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__1"


    // $ANTLR start "rule__Studiengang__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: rule__Studiengang__Group__1__Impl : ( 'Name' ) ;
    public final void rule__Studiengang__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( ( 'Name' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( 'Name' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( 'Name' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: 'Name'
            {
             before(grammarAccess.getStudiengangAccess().getNameKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Studiengang__Group__1__Impl3064); 
             after(grammarAccess.getStudiengangAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__1__Impl"


    // $ANTLR start "rule__Studiengang__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: rule__Studiengang__Group__2 : rule__Studiengang__Group__2__Impl rule__Studiengang__Group__3 ;
    public final void rule__Studiengang__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( rule__Studiengang__Group__2__Impl rule__Studiengang__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:2: rule__Studiengang__Group__2__Impl rule__Studiengang__Group__3
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__2__Impl_in_rule__Studiengang__Group__23095);
            rule__Studiengang__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__3_in_rule__Studiengang__Group__23098);
            rule__Studiengang__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__2"


    // $ANTLR start "rule__Studiengang__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: rule__Studiengang__Group__2__Impl : ( ( rule__Studiengang__NameAssignment_2 ) ) ;
    public final void rule__Studiengang__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: ( ( ( rule__Studiengang__NameAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ( rule__Studiengang__NameAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ( rule__Studiengang__NameAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( rule__Studiengang__NameAssignment_2 )
            {
             before(grammarAccess.getStudiengangAccess().getNameAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( rule__Studiengang__NameAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:2: rule__Studiengang__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Studiengang__NameAssignment_2_in_rule__Studiengang__Group__2__Impl3125);
            rule__Studiengang__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__2__Impl"


    // $ANTLR start "rule__Studiengang__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: rule__Studiengang__Group__3 : rule__Studiengang__Group__3__Impl rule__Studiengang__Group__4 ;
    public final void rule__Studiengang__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__Studiengang__Group__3__Impl rule__Studiengang__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:2: rule__Studiengang__Group__3__Impl rule__Studiengang__Group__4
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__3__Impl_in_rule__Studiengang__Group__33155);
            rule__Studiengang__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__4_in_rule__Studiengang__Group__33158);
            rule__Studiengang__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__3"


    // $ANTLR start "rule__Studiengang__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: rule__Studiengang__Group__3__Impl : ( 'NC' ) ;
    public final void rule__Studiengang__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ( 'NC' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'NC' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'NC' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: 'NC'
            {
             before(grammarAccess.getStudiengangAccess().getNCKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Studiengang__Group__3__Impl3186); 
             after(grammarAccess.getStudiengangAccess().getNCKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__3__Impl"


    // $ANTLR start "rule__Studiengang__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: rule__Studiengang__Group__4 : rule__Studiengang__Group__4__Impl rule__Studiengang__Group__5 ;
    public final void rule__Studiengang__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__Studiengang__Group__4__Impl rule__Studiengang__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__Studiengang__Group__4__Impl rule__Studiengang__Group__5
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__4__Impl_in_rule__Studiengang__Group__43217);
            rule__Studiengang__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__5_in_rule__Studiengang__Group__43220);
            rule__Studiengang__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__4"


    // $ANTLR start "rule__Studiengang__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Studiengang__Group__4__Impl : ( ( rule__Studiengang__NcAssignment_4 ) ) ;
    public final void rule__Studiengang__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( ( rule__Studiengang__NcAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Studiengang__NcAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Studiengang__NcAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Studiengang__NcAssignment_4 )
            {
             before(grammarAccess.getStudiengangAccess().getNcAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Studiengang__NcAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Studiengang__NcAssignment_4
            {
            pushFollow(FOLLOW_rule__Studiengang__NcAssignment_4_in_rule__Studiengang__Group__4__Impl3247);
            rule__Studiengang__NcAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getNcAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__4__Impl"


    // $ANTLR start "rule__Studiengang__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: rule__Studiengang__Group__5 : rule__Studiengang__Group__5__Impl rule__Studiengang__Group__6 ;
    public final void rule__Studiengang__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: ( rule__Studiengang__Group__5__Impl rule__Studiengang__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:2: rule__Studiengang__Group__5__Impl rule__Studiengang__Group__6
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__5__Impl_in_rule__Studiengang__Group__53277);
            rule__Studiengang__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__6_in_rule__Studiengang__Group__53280);
            rule__Studiengang__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__5"


    // $ANTLR start "rule__Studiengang__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: rule__Studiengang__Group__5__Impl : ( 'Student' ) ;
    public final void rule__Studiengang__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( 'Student' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( 'Student' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( 'Student' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: 'Student'
            {
             before(grammarAccess.getStudiengangAccess().getStudentKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Studiengang__Group__5__Impl3308); 
             after(grammarAccess.getStudiengangAccess().getStudentKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__5__Impl"


    // $ANTLR start "rule__Studiengang__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: rule__Studiengang__Group__6 : rule__Studiengang__Group__6__Impl rule__Studiengang__Group__7 ;
    public final void rule__Studiengang__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( rule__Studiengang__Group__6__Impl rule__Studiengang__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:2: rule__Studiengang__Group__6__Impl rule__Studiengang__Group__7
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__6__Impl_in_rule__Studiengang__Group__63339);
            rule__Studiengang__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__7_in_rule__Studiengang__Group__63342);
            rule__Studiengang__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__6"


    // $ANTLR start "rule__Studiengang__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__Studiengang__Group__6__Impl : ( ( rule__Studiengang__StudentAssignment_6 ) ) ;
    public final void rule__Studiengang__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( ( ( rule__Studiengang__StudentAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__Studiengang__StudentAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( ( rule__Studiengang__StudentAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( rule__Studiengang__StudentAssignment_6 )
            {
             before(grammarAccess.getStudiengangAccess().getStudentAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( rule__Studiengang__StudentAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:2: rule__Studiengang__StudentAssignment_6
            {
            pushFollow(FOLLOW_rule__Studiengang__StudentAssignment_6_in_rule__Studiengang__Group__6__Impl3369);
            rule__Studiengang__StudentAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getStudentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__6__Impl"


    // $ANTLR start "rule__Studiengang__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: rule__Studiengang__Group__7 : rule__Studiengang__Group__7__Impl rule__Studiengang__Group__8 ;
    public final void rule__Studiengang__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( rule__Studiengang__Group__7__Impl rule__Studiengang__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:2: rule__Studiengang__Group__7__Impl rule__Studiengang__Group__8
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__7__Impl_in_rule__Studiengang__Group__73399);
            rule__Studiengang__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__8_in_rule__Studiengang__Group__73402);
            rule__Studiengang__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__7"


    // $ANTLR start "rule__Studiengang__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__Studiengang__Group__7__Impl : ( ( rule__Studiengang__Group_7__0 )* ) ;
    public final void rule__Studiengang__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ( ( rule__Studiengang__Group_7__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Studiengang__Group_7__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Studiengang__Group_7__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( rule__Studiengang__Group_7__0 )*
            {
             before(grammarAccess.getStudiengangAccess().getGroup_7()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Studiengang__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:2: rule__Studiengang__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Studiengang__Group_7__0_in_rule__Studiengang__Group__7__Impl3429);
            	    rule__Studiengang__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStudiengangAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__7__Impl"


    // $ANTLR start "rule__Studiengang__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Studiengang__Group__8 : rule__Studiengang__Group__8__Impl rule__Studiengang__Group__9 ;
    public final void rule__Studiengang__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Studiengang__Group__8__Impl rule__Studiengang__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Studiengang__Group__8__Impl rule__Studiengang__Group__9
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__8__Impl_in_rule__Studiengang__Group__83460);
            rule__Studiengang__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__9_in_rule__Studiengang__Group__83463);
            rule__Studiengang__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__8"


    // $ANTLR start "rule__Studiengang__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Studiengang__Group__8__Impl : ( 'Vorlesung' ) ;
    public final void rule__Studiengang__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( 'Vorlesung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( 'Vorlesung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( 'Vorlesung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: 'Vorlesung'
            {
             before(grammarAccess.getStudiengangAccess().getVorlesungKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Studiengang__Group__8__Impl3491); 
             after(grammarAccess.getStudiengangAccess().getVorlesungKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__8__Impl"


    // $ANTLR start "rule__Studiengang__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Studiengang__Group__9 : rule__Studiengang__Group__9__Impl rule__Studiengang__Group__10 ;
    public final void rule__Studiengang__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rule__Studiengang__Group__9__Impl rule__Studiengang__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:2: rule__Studiengang__Group__9__Impl rule__Studiengang__Group__10
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__9__Impl_in_rule__Studiengang__Group__93522);
            rule__Studiengang__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__10_in_rule__Studiengang__Group__93525);
            rule__Studiengang__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__9"


    // $ANTLR start "rule__Studiengang__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: rule__Studiengang__Group__9__Impl : ( ( rule__Studiengang__VorlesungAssignment_9 ) ) ;
    public final void rule__Studiengang__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ( ( rule__Studiengang__VorlesungAssignment_9 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( rule__Studiengang__VorlesungAssignment_9 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( rule__Studiengang__VorlesungAssignment_9 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( rule__Studiengang__VorlesungAssignment_9 )
            {
             before(grammarAccess.getStudiengangAccess().getVorlesungAssignment_9()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( rule__Studiengang__VorlesungAssignment_9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:2: rule__Studiengang__VorlesungAssignment_9
            {
            pushFollow(FOLLOW_rule__Studiengang__VorlesungAssignment_9_in_rule__Studiengang__Group__9__Impl3552);
            rule__Studiengang__VorlesungAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getVorlesungAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__9__Impl"


    // $ANTLR start "rule__Studiengang__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: rule__Studiengang__Group__10 : rule__Studiengang__Group__10__Impl rule__Studiengang__Group__11 ;
    public final void rule__Studiengang__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( rule__Studiengang__Group__10__Impl rule__Studiengang__Group__11 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:2: rule__Studiengang__Group__10__Impl rule__Studiengang__Group__11
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__10__Impl_in_rule__Studiengang__Group__103582);
            rule__Studiengang__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group__11_in_rule__Studiengang__Group__103585);
            rule__Studiengang__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__10"


    // $ANTLR start "rule__Studiengang__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: rule__Studiengang__Group__10__Impl : ( ( rule__Studiengang__Group_10__0 )* ) ;
    public final void rule__Studiengang__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( ( ( rule__Studiengang__Group_10__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( rule__Studiengang__Group_10__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( rule__Studiengang__Group_10__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( rule__Studiengang__Group_10__0 )*
            {
             before(grammarAccess.getStudiengangAccess().getGroup_10()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( rule__Studiengang__Group_10__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:2: rule__Studiengang__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Studiengang__Group_10__0_in_rule__Studiengang__Group__10__Impl3612);
            	    rule__Studiengang__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStudiengangAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__10__Impl"


    // $ANTLR start "rule__Studiengang__Group__11"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: rule__Studiengang__Group__11 : rule__Studiengang__Group__11__Impl ;
    public final void rule__Studiengang__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: ( rule__Studiengang__Group__11__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:2: rule__Studiengang__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Studiengang__Group__11__Impl_in_rule__Studiengang__Group__113643);
            rule__Studiengang__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__11"


    // $ANTLR start "rule__Studiengang__Group__11__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__Studiengang__Group__11__Impl : ( '}' ) ;
    public final void rule__Studiengang__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: '}'
            {
             before(grammarAccess.getStudiengangAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_16_in_rule__Studiengang__Group__11__Impl3671); 
             after(grammarAccess.getStudiengangAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group__11__Impl"


    // $ANTLR start "rule__Studiengang__Group_7__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: rule__Studiengang__Group_7__0 : rule__Studiengang__Group_7__0__Impl rule__Studiengang__Group_7__1 ;
    public final void rule__Studiengang__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( rule__Studiengang__Group_7__0__Impl rule__Studiengang__Group_7__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:2: rule__Studiengang__Group_7__0__Impl rule__Studiengang__Group_7__1
            {
            pushFollow(FOLLOW_rule__Studiengang__Group_7__0__Impl_in_rule__Studiengang__Group_7__03726);
            rule__Studiengang__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group_7__1_in_rule__Studiengang__Group_7__03729);
            rule__Studiengang__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_7__0"


    // $ANTLR start "rule__Studiengang__Group_7__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Studiengang__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Studiengang__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ','
            {
             before(grammarAccess.getStudiengangAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_17_in_rule__Studiengang__Group_7__0__Impl3757); 
             after(grammarAccess.getStudiengangAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_7__0__Impl"


    // $ANTLR start "rule__Studiengang__Group_7__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: rule__Studiengang__Group_7__1 : rule__Studiengang__Group_7__1__Impl ;
    public final void rule__Studiengang__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( rule__Studiengang__Group_7__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:2: rule__Studiengang__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Studiengang__Group_7__1__Impl_in_rule__Studiengang__Group_7__13788);
            rule__Studiengang__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_7__1"


    // $ANTLR start "rule__Studiengang__Group_7__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Studiengang__Group_7__1__Impl : ( ( rule__Studiengang__StudentAssignment_7_1 ) ) ;
    public final void rule__Studiengang__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( ( rule__Studiengang__StudentAssignment_7_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ( rule__Studiengang__StudentAssignment_7_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ( rule__Studiengang__StudentAssignment_7_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Studiengang__StudentAssignment_7_1 )
            {
             before(grammarAccess.getStudiengangAccess().getStudentAssignment_7_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( rule__Studiengang__StudentAssignment_7_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__Studiengang__StudentAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Studiengang__StudentAssignment_7_1_in_rule__Studiengang__Group_7__1__Impl3815);
            rule__Studiengang__StudentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getStudentAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_7__1__Impl"


    // $ANTLR start "rule__Studiengang__Group_10__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__Studiengang__Group_10__0 : rule__Studiengang__Group_10__0__Impl rule__Studiengang__Group_10__1 ;
    public final void rule__Studiengang__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( rule__Studiengang__Group_10__0__Impl rule__Studiengang__Group_10__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:2: rule__Studiengang__Group_10__0__Impl rule__Studiengang__Group_10__1
            {
            pushFollow(FOLLOW_rule__Studiengang__Group_10__0__Impl_in_rule__Studiengang__Group_10__03849);
            rule__Studiengang__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Studiengang__Group_10__1_in_rule__Studiengang__Group_10__03852);
            rule__Studiengang__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_10__0"


    // $ANTLR start "rule__Studiengang__Group_10__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Studiengang__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Studiengang__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ','
            {
             before(grammarAccess.getStudiengangAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_17_in_rule__Studiengang__Group_10__0__Impl3880); 
             after(grammarAccess.getStudiengangAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_10__0__Impl"


    // $ANTLR start "rule__Studiengang__Group_10__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: rule__Studiengang__Group_10__1 : rule__Studiengang__Group_10__1__Impl ;
    public final void rule__Studiengang__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__Studiengang__Group_10__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:2: rule__Studiengang__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Studiengang__Group_10__1__Impl_in_rule__Studiengang__Group_10__13911);
            rule__Studiengang__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_10__1"


    // $ANTLR start "rule__Studiengang__Group_10__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: rule__Studiengang__Group_10__1__Impl : ( ( rule__Studiengang__VorlesungAssignment_10_1 ) ) ;
    public final void rule__Studiengang__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( ( ( rule__Studiengang__VorlesungAssignment_10_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ( rule__Studiengang__VorlesungAssignment_10_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ( rule__Studiengang__VorlesungAssignment_10_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( rule__Studiengang__VorlesungAssignment_10_1 )
            {
             before(grammarAccess.getStudiengangAccess().getVorlesungAssignment_10_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: ( rule__Studiengang__VorlesungAssignment_10_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:2: rule__Studiengang__VorlesungAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Studiengang__VorlesungAssignment_10_1_in_rule__Studiengang__Group_10__1__Impl3938);
            rule__Studiengang__VorlesungAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getStudiengangAccess().getVorlesungAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__Group_10__1__Impl"


    // $ANTLR start "rule__Vorlesung__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: rule__Vorlesung__Group__0 : rule__Vorlesung__Group__0__Impl rule__Vorlesung__Group__1 ;
    public final void rule__Vorlesung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( rule__Vorlesung__Group__0__Impl rule__Vorlesung__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:2: rule__Vorlesung__Group__0__Impl rule__Vorlesung__Group__1
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__0__Impl_in_rule__Vorlesung__Group__03972);
            rule__Vorlesung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__1_in_rule__Vorlesung__Group__03975);
            rule__Vorlesung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__0"


    // $ANTLR start "rule__Vorlesung__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: rule__Vorlesung__Group__0__Impl : ( '{' ) ;
    public final void rule__Vorlesung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: '{'
            {
             before(grammarAccess.getVorlesungAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Vorlesung__Group__0__Impl4003); 
             after(grammarAccess.getVorlesungAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__0__Impl"


    // $ANTLR start "rule__Vorlesung__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: rule__Vorlesung__Group__1 : rule__Vorlesung__Group__1__Impl rule__Vorlesung__Group__2 ;
    public final void rule__Vorlesung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( rule__Vorlesung__Group__1__Impl rule__Vorlesung__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:2: rule__Vorlesung__Group__1__Impl rule__Vorlesung__Group__2
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__1__Impl_in_rule__Vorlesung__Group__14034);
            rule__Vorlesung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__2_in_rule__Vorlesung__Group__14037);
            rule__Vorlesung__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__1"


    // $ANTLR start "rule__Vorlesung__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: rule__Vorlesung__Group__1__Impl : ( 'Name' ) ;
    public final void rule__Vorlesung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( 'Name' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( 'Name' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( 'Name' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: 'Name'
            {
             before(grammarAccess.getVorlesungAccess().getNameKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Vorlesung__Group__1__Impl4065); 
             after(grammarAccess.getVorlesungAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__1__Impl"


    // $ANTLR start "rule__Vorlesung__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Vorlesung__Group__2 : rule__Vorlesung__Group__2__Impl rule__Vorlesung__Group__3 ;
    public final void rule__Vorlesung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( rule__Vorlesung__Group__2__Impl rule__Vorlesung__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:2: rule__Vorlesung__Group__2__Impl rule__Vorlesung__Group__3
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__2__Impl_in_rule__Vorlesung__Group__24096);
            rule__Vorlesung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__3_in_rule__Vorlesung__Group__24099);
            rule__Vorlesung__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__2"


    // $ANTLR start "rule__Vorlesung__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: rule__Vorlesung__Group__2__Impl : ( ( rule__Vorlesung__NameAssignment_2 ) ) ;
    public final void rule__Vorlesung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( ( rule__Vorlesung__NameAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ( rule__Vorlesung__NameAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ( rule__Vorlesung__NameAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( rule__Vorlesung__NameAssignment_2 )
            {
             before(grammarAccess.getVorlesungAccess().getNameAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( rule__Vorlesung__NameAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:2: rule__Vorlesung__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Vorlesung__NameAssignment_2_in_rule__Vorlesung__Group__2__Impl4126);
            rule__Vorlesung__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__2__Impl"


    // $ANTLR start "rule__Vorlesung__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__Vorlesung__Group__3 : rule__Vorlesung__Group__3__Impl rule__Vorlesung__Group__4 ;
    public final void rule__Vorlesung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( rule__Vorlesung__Group__3__Impl rule__Vorlesung__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:2: rule__Vorlesung__Group__3__Impl rule__Vorlesung__Group__4
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__3__Impl_in_rule__Vorlesung__Group__34156);
            rule__Vorlesung__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__4_in_rule__Vorlesung__Group__34159);
            rule__Vorlesung__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__3"


    // $ANTLR start "rule__Vorlesung__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: rule__Vorlesung__Group__3__Impl : ( 'ModulNr' ) ;
    public final void rule__Vorlesung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( ( 'ModulNr' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( 'ModulNr' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( 'ModulNr' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: 'ModulNr'
            {
             before(grammarAccess.getVorlesungAccess().getModulNrKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Vorlesung__Group__3__Impl4187); 
             after(grammarAccess.getVorlesungAccess().getModulNrKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__3__Impl"


    // $ANTLR start "rule__Vorlesung__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__Vorlesung__Group__4 : rule__Vorlesung__Group__4__Impl rule__Vorlesung__Group__5 ;
    public final void rule__Vorlesung__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( rule__Vorlesung__Group__4__Impl rule__Vorlesung__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:2: rule__Vorlesung__Group__4__Impl rule__Vorlesung__Group__5
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__4__Impl_in_rule__Vorlesung__Group__44218);
            rule__Vorlesung__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__5_in_rule__Vorlesung__Group__44221);
            rule__Vorlesung__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__4"


    // $ANTLR start "rule__Vorlesung__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__Vorlesung__Group__4__Impl : ( ( rule__Vorlesung__ModulnrAssignment_4 ) ) ;
    public final void rule__Vorlesung__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( ( ( rule__Vorlesung__ModulnrAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( ( rule__Vorlesung__ModulnrAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( ( rule__Vorlesung__ModulnrAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( rule__Vorlesung__ModulnrAssignment_4 )
            {
             before(grammarAccess.getVorlesungAccess().getModulnrAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( rule__Vorlesung__ModulnrAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:2: rule__Vorlesung__ModulnrAssignment_4
            {
            pushFollow(FOLLOW_rule__Vorlesung__ModulnrAssignment_4_in_rule__Vorlesung__Group__4__Impl4248);
            rule__Vorlesung__ModulnrAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getModulnrAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__4__Impl"


    // $ANTLR start "rule__Vorlesung__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: rule__Vorlesung__Group__5 : rule__Vorlesung__Group__5__Impl rule__Vorlesung__Group__6 ;
    public final void rule__Vorlesung__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( rule__Vorlesung__Group__5__Impl rule__Vorlesung__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:2: rule__Vorlesung__Group__5__Impl rule__Vorlesung__Group__6
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__5__Impl_in_rule__Vorlesung__Group__54278);
            rule__Vorlesung__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__6_in_rule__Vorlesung__Group__54281);
            rule__Vorlesung__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__5"


    // $ANTLR start "rule__Vorlesung__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: rule__Vorlesung__Group__5__Impl : ( 'Beschreibung' ) ;
    public final void rule__Vorlesung__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: ( ( 'Beschreibung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( 'Beschreibung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( 'Beschreibung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: 'Beschreibung'
            {
             before(grammarAccess.getVorlesungAccess().getBeschreibungKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Vorlesung__Group__5__Impl4309); 
             after(grammarAccess.getVorlesungAccess().getBeschreibungKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__5__Impl"


    // $ANTLR start "rule__Vorlesung__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: rule__Vorlesung__Group__6 : rule__Vorlesung__Group__6__Impl rule__Vorlesung__Group__7 ;
    public final void rule__Vorlesung__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( rule__Vorlesung__Group__6__Impl rule__Vorlesung__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:2: rule__Vorlesung__Group__6__Impl rule__Vorlesung__Group__7
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__6__Impl_in_rule__Vorlesung__Group__64340);
            rule__Vorlesung__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__7_in_rule__Vorlesung__Group__64343);
            rule__Vorlesung__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__6"


    // $ANTLR start "rule__Vorlesung__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__Vorlesung__Group__6__Impl : ( ( rule__Vorlesung__BeschreibungAssignment_6 ) ) ;
    public final void rule__Vorlesung__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( ( ( rule__Vorlesung__BeschreibungAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( ( rule__Vorlesung__BeschreibungAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( ( rule__Vorlesung__BeschreibungAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: ( rule__Vorlesung__BeschreibungAssignment_6 )
            {
             before(grammarAccess.getVorlesungAccess().getBeschreibungAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( rule__Vorlesung__BeschreibungAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:2: rule__Vorlesung__BeschreibungAssignment_6
            {
            pushFollow(FOLLOW_rule__Vorlesung__BeschreibungAssignment_6_in_rule__Vorlesung__Group__6__Impl4370);
            rule__Vorlesung__BeschreibungAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getBeschreibungAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__6__Impl"


    // $ANTLR start "rule__Vorlesung__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__Vorlesung__Group__7 : rule__Vorlesung__Group__7__Impl rule__Vorlesung__Group__8 ;
    public final void rule__Vorlesung__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( rule__Vorlesung__Group__7__Impl rule__Vorlesung__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:2: rule__Vorlesung__Group__7__Impl rule__Vorlesung__Group__8
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__7__Impl_in_rule__Vorlesung__Group__74400);
            rule__Vorlesung__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__8_in_rule__Vorlesung__Group__74403);
            rule__Vorlesung__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__7"


    // $ANTLR start "rule__Vorlesung__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__Vorlesung__Group__7__Impl : ( 'CrP' ) ;
    public final void rule__Vorlesung__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( ( 'CrP' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( 'CrP' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( 'CrP' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: 'CrP'
            {
             before(grammarAccess.getVorlesungAccess().getCrPKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__Vorlesung__Group__7__Impl4431); 
             after(grammarAccess.getVorlesungAccess().getCrPKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__7__Impl"


    // $ANTLR start "rule__Vorlesung__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__Vorlesung__Group__8 : rule__Vorlesung__Group__8__Impl rule__Vorlesung__Group__9 ;
    public final void rule__Vorlesung__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( rule__Vorlesung__Group__8__Impl rule__Vorlesung__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:2: rule__Vorlesung__Group__8__Impl rule__Vorlesung__Group__9
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__8__Impl_in_rule__Vorlesung__Group__84462);
            rule__Vorlesung__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__9_in_rule__Vorlesung__Group__84465);
            rule__Vorlesung__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__8"


    // $ANTLR start "rule__Vorlesung__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__Vorlesung__Group__8__Impl : ( ( rule__Vorlesung__CrpAssignment_8 ) ) ;
    public final void rule__Vorlesung__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ( ( rule__Vorlesung__CrpAssignment_8 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__Vorlesung__CrpAssignment_8 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__Vorlesung__CrpAssignment_8 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__Vorlesung__CrpAssignment_8 )
            {
             before(grammarAccess.getVorlesungAccess().getCrpAssignment_8()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( rule__Vorlesung__CrpAssignment_8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__Vorlesung__CrpAssignment_8
            {
            pushFollow(FOLLOW_rule__Vorlesung__CrpAssignment_8_in_rule__Vorlesung__Group__8__Impl4492);
            rule__Vorlesung__CrpAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getCrpAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__8__Impl"


    // $ANTLR start "rule__Vorlesung__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__Vorlesung__Group__9 : rule__Vorlesung__Group__9__Impl rule__Vorlesung__Group__10 ;
    public final void rule__Vorlesung__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( rule__Vorlesung__Group__9__Impl rule__Vorlesung__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:2: rule__Vorlesung__Group__9__Impl rule__Vorlesung__Group__10
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__9__Impl_in_rule__Vorlesung__Group__94522);
            rule__Vorlesung__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__10_in_rule__Vorlesung__Group__94525);
            rule__Vorlesung__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__9"


    // $ANTLR start "rule__Vorlesung__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: rule__Vorlesung__Group__9__Impl : ( 'Dozent' ) ;
    public final void rule__Vorlesung__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( ( 'Dozent' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( 'Dozent' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( 'Dozent' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: 'Dozent'
            {
             before(grammarAccess.getVorlesungAccess().getDozentKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__Vorlesung__Group__9__Impl4553); 
             after(grammarAccess.getVorlesungAccess().getDozentKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__9__Impl"


    // $ANTLR start "rule__Vorlesung__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: rule__Vorlesung__Group__10 : rule__Vorlesung__Group__10__Impl rule__Vorlesung__Group__11 ;
    public final void rule__Vorlesung__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Vorlesung__Group__10__Impl rule__Vorlesung__Group__11 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:2: rule__Vorlesung__Group__10__Impl rule__Vorlesung__Group__11
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__10__Impl_in_rule__Vorlesung__Group__104584);
            rule__Vorlesung__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__11_in_rule__Vorlesung__Group__104587);
            rule__Vorlesung__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__10"


    // $ANTLR start "rule__Vorlesung__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: rule__Vorlesung__Group__10__Impl : ( ( rule__Vorlesung__DozentAssignment_10 ) ) ;
    public final void rule__Vorlesung__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( ( ( rule__Vorlesung__DozentAssignment_10 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( rule__Vorlesung__DozentAssignment_10 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( rule__Vorlesung__DozentAssignment_10 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( rule__Vorlesung__DozentAssignment_10 )
            {
             before(grammarAccess.getVorlesungAccess().getDozentAssignment_10()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( rule__Vorlesung__DozentAssignment_10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:2: rule__Vorlesung__DozentAssignment_10
            {
            pushFollow(FOLLOW_rule__Vorlesung__DozentAssignment_10_in_rule__Vorlesung__Group__10__Impl4614);
            rule__Vorlesung__DozentAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getDozentAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__10__Impl"


    // $ANTLR start "rule__Vorlesung__Group__11"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: rule__Vorlesung__Group__11 : rule__Vorlesung__Group__11__Impl rule__Vorlesung__Group__12 ;
    public final void rule__Vorlesung__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: ( rule__Vorlesung__Group__11__Impl rule__Vorlesung__Group__12 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:2: rule__Vorlesung__Group__11__Impl rule__Vorlesung__Group__12
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__11__Impl_in_rule__Vorlesung__Group__114644);
            rule__Vorlesung__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__12_in_rule__Vorlesung__Group__114647);
            rule__Vorlesung__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__11"


    // $ANTLR start "rule__Vorlesung__Group__11__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__Vorlesung__Group__11__Impl : ( 'Student' ) ;
    public final void rule__Vorlesung__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( ( 'Student' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( 'Student' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( 'Student' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: 'Student'
            {
             before(grammarAccess.getVorlesungAccess().getStudentKeyword_11()); 
            match(input,14,FOLLOW_14_in_rule__Vorlesung__Group__11__Impl4675); 
             after(grammarAccess.getVorlesungAccess().getStudentKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__11__Impl"


    // $ANTLR start "rule__Vorlesung__Group__12"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:1: rule__Vorlesung__Group__12 : rule__Vorlesung__Group__12__Impl rule__Vorlesung__Group__13 ;
    public final void rule__Vorlesung__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( rule__Vorlesung__Group__12__Impl rule__Vorlesung__Group__13 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:2: rule__Vorlesung__Group__12__Impl rule__Vorlesung__Group__13
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__12__Impl_in_rule__Vorlesung__Group__124706);
            rule__Vorlesung__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__13_in_rule__Vorlesung__Group__124709);
            rule__Vorlesung__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__12"


    // $ANTLR start "rule__Vorlesung__Group__12__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rule__Vorlesung__Group__12__Impl : ( ( rule__Vorlesung__StudentAssignment_12 ) ) ;
    public final void rule__Vorlesung__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( ( ( rule__Vorlesung__StudentAssignment_12 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: ( ( rule__Vorlesung__StudentAssignment_12 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: ( ( rule__Vorlesung__StudentAssignment_12 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( rule__Vorlesung__StudentAssignment_12 )
            {
             before(grammarAccess.getVorlesungAccess().getStudentAssignment_12()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( rule__Vorlesung__StudentAssignment_12 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:2: rule__Vorlesung__StudentAssignment_12
            {
            pushFollow(FOLLOW_rule__Vorlesung__StudentAssignment_12_in_rule__Vorlesung__Group__12__Impl4736);
            rule__Vorlesung__StudentAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getStudentAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__12__Impl"


    // $ANTLR start "rule__Vorlesung__Group__13"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: rule__Vorlesung__Group__13 : rule__Vorlesung__Group__13__Impl rule__Vorlesung__Group__14 ;
    public final void rule__Vorlesung__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__Vorlesung__Group__13__Impl rule__Vorlesung__Group__14 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__Vorlesung__Group__13__Impl rule__Vorlesung__Group__14
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__13__Impl_in_rule__Vorlesung__Group__134766);
            rule__Vorlesung__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__14_in_rule__Vorlesung__Group__134769);
            rule__Vorlesung__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__13"


    // $ANTLR start "rule__Vorlesung__Group__13__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: rule__Vorlesung__Group__13__Impl : ( ( rule__Vorlesung__Group_13__0 )* ) ;
    public final void rule__Vorlesung__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( ( ( rule__Vorlesung__Group_13__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( ( rule__Vorlesung__Group_13__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( ( rule__Vorlesung__Group_13__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( rule__Vorlesung__Group_13__0 )*
            {
             before(grammarAccess.getVorlesungAccess().getGroup_13()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( rule__Vorlesung__Group_13__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:2: rule__Vorlesung__Group_13__0
            	    {
            	    pushFollow(FOLLOW_rule__Vorlesung__Group_13__0_in_rule__Vorlesung__Group__13__Impl4796);
            	    rule__Vorlesung__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVorlesungAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__13__Impl"


    // $ANTLR start "rule__Vorlesung__Group__14"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: rule__Vorlesung__Group__14 : rule__Vorlesung__Group__14__Impl rule__Vorlesung__Group__15 ;
    public final void rule__Vorlesung__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ( rule__Vorlesung__Group__14__Impl rule__Vorlesung__Group__15 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:2: rule__Vorlesung__Group__14__Impl rule__Vorlesung__Group__15
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__14__Impl_in_rule__Vorlesung__Group__144827);
            rule__Vorlesung__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__15_in_rule__Vorlesung__Group__144830);
            rule__Vorlesung__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__14"


    // $ANTLR start "rule__Vorlesung__Group__14__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: rule__Vorlesung__Group__14__Impl : ( 'Tutor' ) ;
    public final void rule__Vorlesung__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ( 'Tutor' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( 'Tutor' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( 'Tutor' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: 'Tutor'
            {
             before(grammarAccess.getVorlesungAccess().getTutorKeyword_14()); 
            match(input,26,FOLLOW_26_in_rule__Vorlesung__Group__14__Impl4858); 
             after(grammarAccess.getVorlesungAccess().getTutorKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__14__Impl"


    // $ANTLR start "rule__Vorlesung__Group__15"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: rule__Vorlesung__Group__15 : rule__Vorlesung__Group__15__Impl rule__Vorlesung__Group__16 ;
    public final void rule__Vorlesung__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( rule__Vorlesung__Group__15__Impl rule__Vorlesung__Group__16 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:2: rule__Vorlesung__Group__15__Impl rule__Vorlesung__Group__16
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__15__Impl_in_rule__Vorlesung__Group__154889);
            rule__Vorlesung__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__16_in_rule__Vorlesung__Group__154892);
            rule__Vorlesung__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__15"


    // $ANTLR start "rule__Vorlesung__Group__15__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__Vorlesung__Group__15__Impl : ( ( rule__Vorlesung__TutorAssignment_15 ) ) ;
    public final void rule__Vorlesung__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( ( rule__Vorlesung__TutorAssignment_15 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ( rule__Vorlesung__TutorAssignment_15 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ( rule__Vorlesung__TutorAssignment_15 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( rule__Vorlesung__TutorAssignment_15 )
            {
             before(grammarAccess.getVorlesungAccess().getTutorAssignment_15()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: ( rule__Vorlesung__TutorAssignment_15 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:2: rule__Vorlesung__TutorAssignment_15
            {
            pushFollow(FOLLOW_rule__Vorlesung__TutorAssignment_15_in_rule__Vorlesung__Group__15__Impl4919);
            rule__Vorlesung__TutorAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getTutorAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__15__Impl"


    // $ANTLR start "rule__Vorlesung__Group__16"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: rule__Vorlesung__Group__16 : rule__Vorlesung__Group__16__Impl rule__Vorlesung__Group__17 ;
    public final void rule__Vorlesung__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( rule__Vorlesung__Group__16__Impl rule__Vorlesung__Group__17 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:2: rule__Vorlesung__Group__16__Impl rule__Vorlesung__Group__17
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__16__Impl_in_rule__Vorlesung__Group__164949);
            rule__Vorlesung__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__17_in_rule__Vorlesung__Group__164952);
            rule__Vorlesung__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__16"


    // $ANTLR start "rule__Vorlesung__Group__16__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: rule__Vorlesung__Group__16__Impl : ( ( rule__Vorlesung__Group_16__0 )* ) ;
    public final void rule__Vorlesung__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ( ( rule__Vorlesung__Group_16__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( ( rule__Vorlesung__Group_16__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( ( rule__Vorlesung__Group_16__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( rule__Vorlesung__Group_16__0 )*
            {
             before(grammarAccess.getVorlesungAccess().getGroup_16()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( rule__Vorlesung__Group_16__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:2: rule__Vorlesung__Group_16__0
            	    {
            	    pushFollow(FOLLOW_rule__Vorlesung__Group_16__0_in_rule__Vorlesung__Group__16__Impl4979);
            	    rule__Vorlesung__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVorlesungAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__16__Impl"


    // $ANTLR start "rule__Vorlesung__Group__17"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: rule__Vorlesung__Group__17 : rule__Vorlesung__Group__17__Impl rule__Vorlesung__Group__18 ;
    public final void rule__Vorlesung__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( rule__Vorlesung__Group__17__Impl rule__Vorlesung__Group__18 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:2: rule__Vorlesung__Group__17__Impl rule__Vorlesung__Group__18
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__17__Impl_in_rule__Vorlesung__Group__175010);
            rule__Vorlesung__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__18_in_rule__Vorlesung__Group__175013);
            rule__Vorlesung__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__17"


    // $ANTLR start "rule__Vorlesung__Group__17__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: rule__Vorlesung__Group__17__Impl : ( 'Evaluation' ) ;
    public final void rule__Vorlesung__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( 'Evaluation' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( 'Evaluation' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( 'Evaluation' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: 'Evaluation'
            {
             before(grammarAccess.getVorlesungAccess().getEvaluationKeyword_17()); 
            match(input,27,FOLLOW_27_in_rule__Vorlesung__Group__17__Impl5041); 
             after(grammarAccess.getVorlesungAccess().getEvaluationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__17__Impl"


    // $ANTLR start "rule__Vorlesung__Group__18"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: rule__Vorlesung__Group__18 : rule__Vorlesung__Group__18__Impl rule__Vorlesung__Group__19 ;
    public final void rule__Vorlesung__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__Vorlesung__Group__18__Impl rule__Vorlesung__Group__19 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:2: rule__Vorlesung__Group__18__Impl rule__Vorlesung__Group__19
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__18__Impl_in_rule__Vorlesung__Group__185072);
            rule__Vorlesung__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__19_in_rule__Vorlesung__Group__185075);
            rule__Vorlesung__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__18"


    // $ANTLR start "rule__Vorlesung__Group__18__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: rule__Vorlesung__Group__18__Impl : ( ( rule__Vorlesung__EvaluationAssignment_18 ) ) ;
    public final void rule__Vorlesung__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( ( ( rule__Vorlesung__EvaluationAssignment_18 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( ( rule__Vorlesung__EvaluationAssignment_18 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( ( rule__Vorlesung__EvaluationAssignment_18 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__Vorlesung__EvaluationAssignment_18 )
            {
             before(grammarAccess.getVorlesungAccess().getEvaluationAssignment_18()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( rule__Vorlesung__EvaluationAssignment_18 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__Vorlesung__EvaluationAssignment_18
            {
            pushFollow(FOLLOW_rule__Vorlesung__EvaluationAssignment_18_in_rule__Vorlesung__Group__18__Impl5102);
            rule__Vorlesung__EvaluationAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getEvaluationAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__18__Impl"


    // $ANTLR start "rule__Vorlesung__Group__19"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: rule__Vorlesung__Group__19 : rule__Vorlesung__Group__19__Impl rule__Vorlesung__Group__20 ;
    public final void rule__Vorlesung__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( rule__Vorlesung__Group__19__Impl rule__Vorlesung__Group__20 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:2: rule__Vorlesung__Group__19__Impl rule__Vorlesung__Group__20
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__19__Impl_in_rule__Vorlesung__Group__195132);
            rule__Vorlesung__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group__20_in_rule__Vorlesung__Group__195135);
            rule__Vorlesung__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__19"


    // $ANTLR start "rule__Vorlesung__Group__19__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: rule__Vorlesung__Group__19__Impl : ( ( rule__Vorlesung__Group_19__0 )* ) ;
    public final void rule__Vorlesung__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: ( ( ( rule__Vorlesung__Group_19__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ( rule__Vorlesung__Group_19__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ( rule__Vorlesung__Group_19__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( rule__Vorlesung__Group_19__0 )*
            {
             before(grammarAccess.getVorlesungAccess().getGroup_19()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( rule__Vorlesung__Group_19__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:2: rule__Vorlesung__Group_19__0
            	    {
            	    pushFollow(FOLLOW_rule__Vorlesung__Group_19__0_in_rule__Vorlesung__Group__19__Impl5162);
            	    rule__Vorlesung__Group_19__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVorlesungAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__19__Impl"


    // $ANTLR start "rule__Vorlesung__Group__20"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: rule__Vorlesung__Group__20 : rule__Vorlesung__Group__20__Impl ;
    public final void rule__Vorlesung__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( rule__Vorlesung__Group__20__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:2: rule__Vorlesung__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group__20__Impl_in_rule__Vorlesung__Group__205193);
            rule__Vorlesung__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__20"


    // $ANTLR start "rule__Vorlesung__Group__20__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: rule__Vorlesung__Group__20__Impl : ( '}' ) ;
    public final void rule__Vorlesung__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: '}'
            {
             before(grammarAccess.getVorlesungAccess().getRightCurlyBracketKeyword_20()); 
            match(input,16,FOLLOW_16_in_rule__Vorlesung__Group__20__Impl5221); 
             after(grammarAccess.getVorlesungAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group__20__Impl"


    // $ANTLR start "rule__Vorlesung__Group_13__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: rule__Vorlesung__Group_13__0 : rule__Vorlesung__Group_13__0__Impl rule__Vorlesung__Group_13__1 ;
    public final void rule__Vorlesung__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( rule__Vorlesung__Group_13__0__Impl rule__Vorlesung__Group_13__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:2: rule__Vorlesung__Group_13__0__Impl rule__Vorlesung__Group_13__1
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_13__0__Impl_in_rule__Vorlesung__Group_13__05294);
            rule__Vorlesung__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group_13__1_in_rule__Vorlesung__Group_13__05297);
            rule__Vorlesung__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_13__0"


    // $ANTLR start "rule__Vorlesung__Group_13__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: rule__Vorlesung__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Vorlesung__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ','
            {
             before(grammarAccess.getVorlesungAccess().getCommaKeyword_13_0()); 
            match(input,17,FOLLOW_17_in_rule__Vorlesung__Group_13__0__Impl5325); 
             after(grammarAccess.getVorlesungAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_13__0__Impl"


    // $ANTLR start "rule__Vorlesung__Group_13__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: rule__Vorlesung__Group_13__1 : rule__Vorlesung__Group_13__1__Impl ;
    public final void rule__Vorlesung__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( rule__Vorlesung__Group_13__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:2: rule__Vorlesung__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_13__1__Impl_in_rule__Vorlesung__Group_13__15356);
            rule__Vorlesung__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_13__1"


    // $ANTLR start "rule__Vorlesung__Group_13__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: rule__Vorlesung__Group_13__1__Impl : ( ( rule__Vorlesung__StudentAssignment_13_1 ) ) ;
    public final void rule__Vorlesung__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( ( ( rule__Vorlesung__StudentAssignment_13_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( ( rule__Vorlesung__StudentAssignment_13_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( ( rule__Vorlesung__StudentAssignment_13_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( rule__Vorlesung__StudentAssignment_13_1 )
            {
             before(grammarAccess.getVorlesungAccess().getStudentAssignment_13_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( rule__Vorlesung__StudentAssignment_13_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:2: rule__Vorlesung__StudentAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Vorlesung__StudentAssignment_13_1_in_rule__Vorlesung__Group_13__1__Impl5383);
            rule__Vorlesung__StudentAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getStudentAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_13__1__Impl"


    // $ANTLR start "rule__Vorlesung__Group_16__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: rule__Vorlesung__Group_16__0 : rule__Vorlesung__Group_16__0__Impl rule__Vorlesung__Group_16__1 ;
    public final void rule__Vorlesung__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( rule__Vorlesung__Group_16__0__Impl rule__Vorlesung__Group_16__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:2: rule__Vorlesung__Group_16__0__Impl rule__Vorlesung__Group_16__1
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_16__0__Impl_in_rule__Vorlesung__Group_16__05417);
            rule__Vorlesung__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group_16__1_in_rule__Vorlesung__Group_16__05420);
            rule__Vorlesung__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_16__0"


    // $ANTLR start "rule__Vorlesung__Group_16__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: rule__Vorlesung__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Vorlesung__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ','
            {
             before(grammarAccess.getVorlesungAccess().getCommaKeyword_16_0()); 
            match(input,17,FOLLOW_17_in_rule__Vorlesung__Group_16__0__Impl5448); 
             after(grammarAccess.getVorlesungAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_16__0__Impl"


    // $ANTLR start "rule__Vorlesung__Group_16__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: rule__Vorlesung__Group_16__1 : rule__Vorlesung__Group_16__1__Impl ;
    public final void rule__Vorlesung__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( rule__Vorlesung__Group_16__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:2: rule__Vorlesung__Group_16__1__Impl
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_16__1__Impl_in_rule__Vorlesung__Group_16__15479);
            rule__Vorlesung__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_16__1"


    // $ANTLR start "rule__Vorlesung__Group_16__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: rule__Vorlesung__Group_16__1__Impl : ( ( rule__Vorlesung__TutorAssignment_16_1 ) ) ;
    public final void rule__Vorlesung__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( ( rule__Vorlesung__TutorAssignment_16_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( ( rule__Vorlesung__TutorAssignment_16_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( ( rule__Vorlesung__TutorAssignment_16_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ( rule__Vorlesung__TutorAssignment_16_1 )
            {
             before(grammarAccess.getVorlesungAccess().getTutorAssignment_16_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( rule__Vorlesung__TutorAssignment_16_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:2: rule__Vorlesung__TutorAssignment_16_1
            {
            pushFollow(FOLLOW_rule__Vorlesung__TutorAssignment_16_1_in_rule__Vorlesung__Group_16__1__Impl5506);
            rule__Vorlesung__TutorAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getTutorAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_16__1__Impl"


    // $ANTLR start "rule__Vorlesung__Group_19__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: rule__Vorlesung__Group_19__0 : rule__Vorlesung__Group_19__0__Impl rule__Vorlesung__Group_19__1 ;
    public final void rule__Vorlesung__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( rule__Vorlesung__Group_19__0__Impl rule__Vorlesung__Group_19__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:2: rule__Vorlesung__Group_19__0__Impl rule__Vorlesung__Group_19__1
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_19__0__Impl_in_rule__Vorlesung__Group_19__05540);
            rule__Vorlesung__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorlesung__Group_19__1_in_rule__Vorlesung__Group_19__05543);
            rule__Vorlesung__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_19__0"


    // $ANTLR start "rule__Vorlesung__Group_19__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: rule__Vorlesung__Group_19__0__Impl : ( ',' ) ;
    public final void rule__Vorlesung__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ','
            {
             before(grammarAccess.getVorlesungAccess().getCommaKeyword_19_0()); 
            match(input,17,FOLLOW_17_in_rule__Vorlesung__Group_19__0__Impl5571); 
             after(grammarAccess.getVorlesungAccess().getCommaKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_19__0__Impl"


    // $ANTLR start "rule__Vorlesung__Group_19__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: rule__Vorlesung__Group_19__1 : rule__Vorlesung__Group_19__1__Impl ;
    public final void rule__Vorlesung__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( rule__Vorlesung__Group_19__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:2: rule__Vorlesung__Group_19__1__Impl
            {
            pushFollow(FOLLOW_rule__Vorlesung__Group_19__1__Impl_in_rule__Vorlesung__Group_19__15602);
            rule__Vorlesung__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_19__1"


    // $ANTLR start "rule__Vorlesung__Group_19__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: rule__Vorlesung__Group_19__1__Impl : ( ( rule__Vorlesung__EvaluationAssignment_19_1 ) ) ;
    public final void rule__Vorlesung__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( ( ( rule__Vorlesung__EvaluationAssignment_19_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( ( rule__Vorlesung__EvaluationAssignment_19_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( ( rule__Vorlesung__EvaluationAssignment_19_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( rule__Vorlesung__EvaluationAssignment_19_1 )
            {
             before(grammarAccess.getVorlesungAccess().getEvaluationAssignment_19_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( rule__Vorlesung__EvaluationAssignment_19_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:2: rule__Vorlesung__EvaluationAssignment_19_1
            {
            pushFollow(FOLLOW_rule__Vorlesung__EvaluationAssignment_19_1_in_rule__Vorlesung__Group_19__1__Impl5629);
            rule__Vorlesung__EvaluationAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getVorlesungAccess().getEvaluationAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__Group_19__1__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_rule__Student__Group__0__Impl_in_rule__Student__Group__05663);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__1_in_rule__Student__Group__05666);
            rule__Student__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: rule__Student__Group__0__Impl : ( '{' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Student__Group__0__Impl5694); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_rule__Student__Group__1__Impl_in_rule__Student__Group__15725);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__2_in_rule__Student__Group__15728);
            rule__Student__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__Student__Group__1__Impl : ( 'MatrikelNr' ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( 'MatrikelNr' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( 'MatrikelNr' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( 'MatrikelNr' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: 'MatrikelNr'
            {
             before(grammarAccess.getStudentAccess().getMatrikelNrKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Student__Group__1__Impl5756); 
             after(grammarAccess.getStudentAccess().getMatrikelNrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_rule__Student__Group__2__Impl_in_rule__Student__Group__25787);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__3_in_rule__Student__Group__25790);
            rule__Student__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: rule__Student__Group__2__Impl : ( ( rule__Student__MatrikelnrAssignment_2 ) ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( ( ( rule__Student__MatrikelnrAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( ( rule__Student__MatrikelnrAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( ( rule__Student__MatrikelnrAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( rule__Student__MatrikelnrAssignment_2 )
            {
             before(grammarAccess.getStudentAccess().getMatrikelnrAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ( rule__Student__MatrikelnrAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:2: rule__Student__MatrikelnrAssignment_2
            {
            pushFollow(FOLLOW_rule__Student__MatrikelnrAssignment_2_in_rule__Student__Group__2__Impl5817);
            rule__Student__MatrikelnrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getMatrikelnrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_rule__Student__Group__3__Impl_in_rule__Student__Group__35847);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__4_in_rule__Student__Group__35850);
            rule__Student__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: rule__Student__Group__3__Impl : ( 'Vorname' ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( ( 'Vorname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( 'Vorname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( 'Vorname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: 'Vorname'
            {
             before(grammarAccess.getStudentAccess().getVornameKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Student__Group__3__Impl5878); 
             after(grammarAccess.getStudentAccess().getVornameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_rule__Student__Group__4__Impl_in_rule__Student__Group__45909);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__5_in_rule__Student__Group__45912);
            rule__Student__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: rule__Student__Group__4__Impl : ( ( rule__Student__VornameAssignment_4 ) ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( ( ( rule__Student__VornameAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( ( rule__Student__VornameAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( ( rule__Student__VornameAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: ( rule__Student__VornameAssignment_4 )
            {
             before(grammarAccess.getStudentAccess().getVornameAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: ( rule__Student__VornameAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:2: rule__Student__VornameAssignment_4
            {
            pushFollow(FOLLOW_rule__Student__VornameAssignment_4_in_rule__Student__Group__4__Impl5939);
            rule__Student__VornameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getVornameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: rule__Student__Group__5 : rule__Student__Group__5__Impl rule__Student__Group__6 ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( rule__Student__Group__5__Impl rule__Student__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:2: rule__Student__Group__5__Impl rule__Student__Group__6
            {
            pushFollow(FOLLOW_rule__Student__Group__5__Impl_in_rule__Student__Group__55969);
            rule__Student__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__6_in_rule__Student__Group__55972);
            rule__Student__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: rule__Student__Group__5__Impl : ( 'Nachname' ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ( 'Nachname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( 'Nachname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( 'Nachname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: 'Nachname'
            {
             before(grammarAccess.getStudentAccess().getNachnameKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Student__Group__5__Impl6000); 
             after(grammarAccess.getStudentAccess().getNachnameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Student__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: rule__Student__Group__6 : rule__Student__Group__6__Impl rule__Student__Group__7 ;
    public final void rule__Student__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ( rule__Student__Group__6__Impl rule__Student__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:2: rule__Student__Group__6__Impl rule__Student__Group__7
            {
            pushFollow(FOLLOW_rule__Student__Group__6__Impl_in_rule__Student__Group__66031);
            rule__Student__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__7_in_rule__Student__Group__66034);
            rule__Student__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6"


    // $ANTLR start "rule__Student__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: rule__Student__Group__6__Impl : ( ( rule__Student__NachnameAssignment_6 ) ) ;
    public final void rule__Student__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: ( ( ( rule__Student__NachnameAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( ( rule__Student__NachnameAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( ( rule__Student__NachnameAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( rule__Student__NachnameAssignment_6 )
            {
             before(grammarAccess.getStudentAccess().getNachnameAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( rule__Student__NachnameAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:2: rule__Student__NachnameAssignment_6
            {
            pushFollow(FOLLOW_rule__Student__NachnameAssignment_6_in_rule__Student__Group__6__Impl6061);
            rule__Student__NachnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNachnameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__6__Impl"


    // $ANTLR start "rule__Student__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: rule__Student__Group__7 : rule__Student__Group__7__Impl rule__Student__Group__8 ;
    public final void rule__Student__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( rule__Student__Group__7__Impl rule__Student__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:2: rule__Student__Group__7__Impl rule__Student__Group__8
            {
            pushFollow(FOLLOW_rule__Student__Group__7__Impl_in_rule__Student__Group__76091);
            rule__Student__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group__8_in_rule__Student__Group__76094);
            rule__Student__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7"


    // $ANTLR start "rule__Student__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: rule__Student__Group__7__Impl : ( ( rule__Student__Group_7__0 )? ) ;
    public final void rule__Student__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ( ( ( rule__Student__Group_7__0 )? ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( ( rule__Student__Group_7__0 )? )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( ( rule__Student__Group_7__0 )? )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( rule__Student__Group_7__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_7()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( rule__Student__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:2: rule__Student__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Student__Group_7__0_in_rule__Student__Group__7__Impl6121);
                    rule__Student__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__7__Impl"


    // $ANTLR start "rule__Student__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: rule__Student__Group__8 : rule__Student__Group__8__Impl ;
    public final void rule__Student__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: ( rule__Student__Group__8__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:2: rule__Student__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Student__Group__8__Impl_in_rule__Student__Group__86152);
            rule__Student__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__8"


    // $ANTLR start "rule__Student__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__Student__Group__8__Impl : ( '}' ) ;
    public final void rule__Student__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__Student__Group__8__Impl6180); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__8__Impl"


    // $ANTLR start "rule__Student__Group_7__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: rule__Student__Group_7__0 : rule__Student__Group_7__0__Impl rule__Student__Group_7__1 ;
    public final void rule__Student__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( rule__Student__Group_7__0__Impl rule__Student__Group_7__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:2: rule__Student__Group_7__0__Impl rule__Student__Group_7__1
            {
            pushFollow(FOLLOW_rule__Student__Group_7__0__Impl_in_rule__Student__Group_7__06229);
            rule__Student__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group_7__1_in_rule__Student__Group_7__06232);
            rule__Student__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__0"


    // $ANTLR start "rule__Student__Group_7__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: rule__Student__Group_7__0__Impl : ( 'Vorlesung' ) ;
    public final void rule__Student__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: ( ( 'Vorlesung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( 'Vorlesung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( 'Vorlesung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: 'Vorlesung'
            {
             before(grammarAccess.getStudentAccess().getVorlesungKeyword_7_0()); 
            match(input,21,FOLLOW_21_in_rule__Student__Group_7__0__Impl6260); 
             after(grammarAccess.getStudentAccess().getVorlesungKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__0__Impl"


    // $ANTLR start "rule__Student__Group_7__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: rule__Student__Group_7__1 : rule__Student__Group_7__1__Impl rule__Student__Group_7__2 ;
    public final void rule__Student__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: ( rule__Student__Group_7__1__Impl rule__Student__Group_7__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:2: rule__Student__Group_7__1__Impl rule__Student__Group_7__2
            {
            pushFollow(FOLLOW_rule__Student__Group_7__1__Impl_in_rule__Student__Group_7__16291);
            rule__Student__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group_7__2_in_rule__Student__Group_7__16294);
            rule__Student__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__1"


    // $ANTLR start "rule__Student__Group_7__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: rule__Student__Group_7__1__Impl : ( ( rule__Student__VorlesungAssignment_7_1 ) ) ;
    public final void rule__Student__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: ( ( ( rule__Student__VorlesungAssignment_7_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ( ( rule__Student__VorlesungAssignment_7_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ( ( rule__Student__VorlesungAssignment_7_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: ( rule__Student__VorlesungAssignment_7_1 )
            {
             before(grammarAccess.getStudentAccess().getVorlesungAssignment_7_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( rule__Student__VorlesungAssignment_7_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:2: rule__Student__VorlesungAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Student__VorlesungAssignment_7_1_in_rule__Student__Group_7__1__Impl6321);
            rule__Student__VorlesungAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getVorlesungAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__1__Impl"


    // $ANTLR start "rule__Student__Group_7__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: rule__Student__Group_7__2 : rule__Student__Group_7__2__Impl ;
    public final void rule__Student__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( rule__Student__Group_7__2__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:2: rule__Student__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Student__Group_7__2__Impl_in_rule__Student__Group_7__26351);
            rule__Student__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__2"


    // $ANTLR start "rule__Student__Group_7__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: rule__Student__Group_7__2__Impl : ( ( rule__Student__Group_7_2__0 )* ) ;
    public final void rule__Student__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: ( ( ( rule__Student__Group_7_2__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( rule__Student__Group_7_2__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( rule__Student__Group_7_2__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( rule__Student__Group_7_2__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_7_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: ( rule__Student__Group_7_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:2: rule__Student__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Student__Group_7_2__0_in_rule__Student__Group_7__2__Impl6378);
            	    rule__Student__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7__2__Impl"


    // $ANTLR start "rule__Student__Group_7_2__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: rule__Student__Group_7_2__0 : rule__Student__Group_7_2__0__Impl rule__Student__Group_7_2__1 ;
    public final void rule__Student__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( rule__Student__Group_7_2__0__Impl rule__Student__Group_7_2__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: rule__Student__Group_7_2__0__Impl rule__Student__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Student__Group_7_2__0__Impl_in_rule__Student__Group_7_2__06415);
            rule__Student__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Student__Group_7_2__1_in_rule__Student__Group_7_2__06418);
            rule__Student__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_2__0"


    // $ANTLR start "rule__Student__Group_7_2__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Student__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_7_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Student__Group_7_2__0__Impl6446); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_2__0__Impl"


    // $ANTLR start "rule__Student__Group_7_2__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: rule__Student__Group_7_2__1 : rule__Student__Group_7_2__1__Impl ;
    public final void rule__Student__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( rule__Student__Group_7_2__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:2: rule__Student__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Student__Group_7_2__1__Impl_in_rule__Student__Group_7_2__16477);
            rule__Student__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_2__1"


    // $ANTLR start "rule__Student__Group_7_2__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: rule__Student__Group_7_2__1__Impl : ( ( rule__Student__VorlesungAssignment_7_2_1 ) ) ;
    public final void rule__Student__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: ( ( ( rule__Student__VorlesungAssignment_7_2_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: ( ( rule__Student__VorlesungAssignment_7_2_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: ( ( rule__Student__VorlesungAssignment_7_2_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( rule__Student__VorlesungAssignment_7_2_1 )
            {
             before(grammarAccess.getStudentAccess().getVorlesungAssignment_7_2_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: ( rule__Student__VorlesungAssignment_7_2_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:2: rule__Student__VorlesungAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Student__VorlesungAssignment_7_2_1_in_rule__Student__Group_7_2__1__Impl6504);
            rule__Student__VorlesungAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getVorlesungAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group_7_2__1__Impl"


    // $ANTLR start "rule__Dozent__Group_0__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: rule__Dozent__Group_0__0 : rule__Dozent__Group_0__0__Impl rule__Dozent__Group_0__1 ;
    public final void rule__Dozent__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rule__Dozent__Group_0__0__Impl rule__Dozent__Group_0__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:2: rule__Dozent__Group_0__0__Impl rule__Dozent__Group_0__1
            {
            pushFollow(FOLLOW_rule__Dozent__Group_0__0__Impl_in_rule__Dozent__Group_0__06538);
            rule__Dozent__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dozent__Group_0__1_in_rule__Dozent__Group_0__06541);
            rule__Dozent__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_0__0"


    // $ANTLR start "rule__Dozent__Group_0__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: rule__Dozent__Group_0__0__Impl : ( 'Professor' ) ;
    public final void rule__Dozent__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ( 'Professor' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( 'Professor' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( 'Professor' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: 'Professor'
            {
             before(grammarAccess.getDozentAccess().getProfessorKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Dozent__Group_0__0__Impl6569); 
             after(grammarAccess.getDozentAccess().getProfessorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_0__0__Impl"


    // $ANTLR start "rule__Dozent__Group_0__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: rule__Dozent__Group_0__1 : rule__Dozent__Group_0__1__Impl ;
    public final void rule__Dozent__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__Dozent__Group_0__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__Dozent__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Dozent__Group_0__1__Impl_in_rule__Dozent__Group_0__16600);
            rule__Dozent__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_0__1"


    // $ANTLR start "rule__Dozent__Group_0__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: rule__Dozent__Group_0__1__Impl : ( ruleProfessor ) ;
    public final void rule__Dozent__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: ( ( ruleProfessor ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ruleProfessor )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ruleProfessor )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ruleProfessor
            {
             before(grammarAccess.getDozentAccess().getProfessorParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleProfessor_in_rule__Dozent__Group_0__1__Impl6627);
            ruleProfessor();

            state._fsp--;

             after(grammarAccess.getDozentAccess().getProfessorParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_0__1__Impl"


    // $ANTLR start "rule__Dozent__Group_1__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: rule__Dozent__Group_1__0 : rule__Dozent__Group_1__0__Impl rule__Dozent__Group_1__1 ;
    public final void rule__Dozent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__Dozent__Group_1__0__Impl rule__Dozent__Group_1__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:2: rule__Dozent__Group_1__0__Impl rule__Dozent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Dozent__Group_1__0__Impl_in_rule__Dozent__Group_1__06660);
            rule__Dozent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dozent__Group_1__1_in_rule__Dozent__Group_1__06663);
            rule__Dozent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_1__0"


    // $ANTLR start "rule__Dozent__Group_1__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__Dozent__Group_1__0__Impl : ( 'Lehrbeauftragter' ) ;
    public final void rule__Dozent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( ( 'Lehrbeauftragter' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( 'Lehrbeauftragter' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( 'Lehrbeauftragter' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: 'Lehrbeauftragter'
            {
             before(grammarAccess.getDozentAccess().getLehrbeauftragterKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Dozent__Group_1__0__Impl6691); 
             after(grammarAccess.getDozentAccess().getLehrbeauftragterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_1__0__Impl"


    // $ANTLR start "rule__Dozent__Group_1__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: rule__Dozent__Group_1__1 : rule__Dozent__Group_1__1__Impl ;
    public final void rule__Dozent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( rule__Dozent__Group_1__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:2: rule__Dozent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Dozent__Group_1__1__Impl_in_rule__Dozent__Group_1__16722);
            rule__Dozent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_1__1"


    // $ANTLR start "rule__Dozent__Group_1__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: rule__Dozent__Group_1__1__Impl : ( ruleLehrbeauftrager ) ;
    public final void rule__Dozent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: ( ( ruleLehrbeauftrager ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ruleLehrbeauftrager )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ruleLehrbeauftrager )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: ruleLehrbeauftrager
            {
             before(grammarAccess.getDozentAccess().getLehrbeauftragerParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleLehrbeauftrager_in_rule__Dozent__Group_1__1__Impl6749);
            ruleLehrbeauftrager();

            state._fsp--;

             after(grammarAccess.getDozentAccess().getLehrbeauftragerParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dozent__Group_1__1__Impl"


    // $ANTLR start "rule__Professor__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: rule__Professor__Group__0 : rule__Professor__Group__0__Impl rule__Professor__Group__1 ;
    public final void rule__Professor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__Professor__Group__0__Impl rule__Professor__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__Professor__Group__0__Impl rule__Professor__Group__1
            {
            pushFollow(FOLLOW_rule__Professor__Group__0__Impl_in_rule__Professor__Group__06782);
            rule__Professor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__1_in_rule__Professor__Group__06785);
            rule__Professor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__0"


    // $ANTLR start "rule__Professor__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: rule__Professor__Group__0__Impl : ( '{' ) ;
    public final void rule__Professor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: '{'
            {
             before(grammarAccess.getProfessorAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Professor__Group__0__Impl6813); 
             after(grammarAccess.getProfessorAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__0__Impl"


    // $ANTLR start "rule__Professor__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: rule__Professor__Group__1 : rule__Professor__Group__1__Impl rule__Professor__Group__2 ;
    public final void rule__Professor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( rule__Professor__Group__1__Impl rule__Professor__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:2: rule__Professor__Group__1__Impl rule__Professor__Group__2
            {
            pushFollow(FOLLOW_rule__Professor__Group__1__Impl_in_rule__Professor__Group__16844);
            rule__Professor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__2_in_rule__Professor__Group__16847);
            rule__Professor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__1"


    // $ANTLR start "rule__Professor__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: rule__Professor__Group__1__Impl : ( 'PersonalNr' ) ;
    public final void rule__Professor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ( ( 'PersonalNr' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( 'PersonalNr' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( 'PersonalNr' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: 'PersonalNr'
            {
             before(grammarAccess.getProfessorAccess().getPersonalNrKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Professor__Group__1__Impl6875); 
             after(grammarAccess.getProfessorAccess().getPersonalNrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__1__Impl"


    // $ANTLR start "rule__Professor__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: rule__Professor__Group__2 : rule__Professor__Group__2__Impl rule__Professor__Group__3 ;
    public final void rule__Professor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( rule__Professor__Group__2__Impl rule__Professor__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:2: rule__Professor__Group__2__Impl rule__Professor__Group__3
            {
            pushFollow(FOLLOW_rule__Professor__Group__2__Impl_in_rule__Professor__Group__26906);
            rule__Professor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__3_in_rule__Professor__Group__26909);
            rule__Professor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__2"


    // $ANTLR start "rule__Professor__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: rule__Professor__Group__2__Impl : ( ( rule__Professor__PersonalnrAssignment_2 ) ) ;
    public final void rule__Professor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: ( ( ( rule__Professor__PersonalnrAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: ( ( rule__Professor__PersonalnrAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: ( ( rule__Professor__PersonalnrAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( rule__Professor__PersonalnrAssignment_2 )
            {
             before(grammarAccess.getProfessorAccess().getPersonalnrAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: ( rule__Professor__PersonalnrAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:2: rule__Professor__PersonalnrAssignment_2
            {
            pushFollow(FOLLOW_rule__Professor__PersonalnrAssignment_2_in_rule__Professor__Group__2__Impl6936);
            rule__Professor__PersonalnrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getPersonalnrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__2__Impl"


    // $ANTLR start "rule__Professor__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: rule__Professor__Group__3 : rule__Professor__Group__3__Impl rule__Professor__Group__4 ;
    public final void rule__Professor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: ( rule__Professor__Group__3__Impl rule__Professor__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3546:2: rule__Professor__Group__3__Impl rule__Professor__Group__4
            {
            pushFollow(FOLLOW_rule__Professor__Group__3__Impl_in_rule__Professor__Group__36966);
            rule__Professor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__4_in_rule__Professor__Group__36969);
            rule__Professor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__3"


    // $ANTLR start "rule__Professor__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: rule__Professor__Group__3__Impl : ( 'Vorname' ) ;
    public final void rule__Professor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ( ( 'Vorname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( 'Vorname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( 'Vorname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: 'Vorname'
            {
             before(grammarAccess.getProfessorAccess().getVornameKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Professor__Group__3__Impl6997); 
             after(grammarAccess.getProfessorAccess().getVornameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__3__Impl"


    // $ANTLR start "rule__Professor__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: rule__Professor__Group__4 : rule__Professor__Group__4__Impl rule__Professor__Group__5 ;
    public final void rule__Professor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: ( rule__Professor__Group__4__Impl rule__Professor__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:2: rule__Professor__Group__4__Impl rule__Professor__Group__5
            {
            pushFollow(FOLLOW_rule__Professor__Group__4__Impl_in_rule__Professor__Group__47028);
            rule__Professor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__5_in_rule__Professor__Group__47031);
            rule__Professor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__4"


    // $ANTLR start "rule__Professor__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: rule__Professor__Group__4__Impl : ( ( rule__Professor__VornameAssignment_4 ) ) ;
    public final void rule__Professor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( ( ( rule__Professor__VornameAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( ( rule__Professor__VornameAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( ( rule__Professor__VornameAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:1: ( rule__Professor__VornameAssignment_4 )
            {
             before(grammarAccess.getProfessorAccess().getVornameAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:1: ( rule__Professor__VornameAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3591:2: rule__Professor__VornameAssignment_4
            {
            pushFollow(FOLLOW_rule__Professor__VornameAssignment_4_in_rule__Professor__Group__4__Impl7058);
            rule__Professor__VornameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getVornameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__4__Impl"


    // $ANTLR start "rule__Professor__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: rule__Professor__Group__5 : rule__Professor__Group__5__Impl rule__Professor__Group__6 ;
    public final void rule__Professor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:1: ( rule__Professor__Group__5__Impl rule__Professor__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:2: rule__Professor__Group__5__Impl rule__Professor__Group__6
            {
            pushFollow(FOLLOW_rule__Professor__Group__5__Impl_in_rule__Professor__Group__57088);
            rule__Professor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__6_in_rule__Professor__Group__57091);
            rule__Professor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__5"


    // $ANTLR start "rule__Professor__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__Professor__Group__5__Impl : ( 'Nachname' ) ;
    public final void rule__Professor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( ( 'Nachname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( 'Nachname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( 'Nachname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: 'Nachname'
            {
             before(grammarAccess.getProfessorAccess().getNachnameKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Professor__Group__5__Impl7119); 
             after(grammarAccess.getProfessorAccess().getNachnameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__5__Impl"


    // $ANTLR start "rule__Professor__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: rule__Professor__Group__6 : rule__Professor__Group__6__Impl rule__Professor__Group__7 ;
    public final void rule__Professor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:1: ( rule__Professor__Group__6__Impl rule__Professor__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:2: rule__Professor__Group__6__Impl rule__Professor__Group__7
            {
            pushFollow(FOLLOW_rule__Professor__Group__6__Impl_in_rule__Professor__Group__67150);
            rule__Professor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__7_in_rule__Professor__Group__67153);
            rule__Professor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__6"


    // $ANTLR start "rule__Professor__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: rule__Professor__Group__6__Impl : ( ( rule__Professor__NachnameAssignment_6 ) ) ;
    public final void rule__Professor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ( ( rule__Professor__NachnameAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( ( rule__Professor__NachnameAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( ( rule__Professor__NachnameAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:1: ( rule__Professor__NachnameAssignment_6 )
            {
             before(grammarAccess.getProfessorAccess().getNachnameAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( rule__Professor__NachnameAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:2: rule__Professor__NachnameAssignment_6
            {
            pushFollow(FOLLOW_rule__Professor__NachnameAssignment_6_in_rule__Professor__Group__6__Impl7180);
            rule__Professor__NachnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getNachnameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__6__Impl"


    // $ANTLR start "rule__Professor__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: rule__Professor__Group__7 : rule__Professor__Group__7__Impl rule__Professor__Group__8 ;
    public final void rule__Professor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( rule__Professor__Group__7__Impl rule__Professor__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:2: rule__Professor__Group__7__Impl rule__Professor__Group__8
            {
            pushFollow(FOLLOW_rule__Professor__Group__7__Impl_in_rule__Professor__Group__77210);
            rule__Professor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__8_in_rule__Professor__Group__77213);
            rule__Professor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__7"


    // $ANTLR start "rule__Professor__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: rule__Professor__Group__7__Impl : ( 'Vorlesung' ) ;
    public final void rule__Professor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( 'Vorlesung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( 'Vorlesung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( 'Vorlesung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: 'Vorlesung'
            {
             before(grammarAccess.getProfessorAccess().getVorlesungKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Professor__Group__7__Impl7241); 
             after(grammarAccess.getProfessorAccess().getVorlesungKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__7__Impl"


    // $ANTLR start "rule__Professor__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: rule__Professor__Group__8 : rule__Professor__Group__8__Impl rule__Professor__Group__9 ;
    public final void rule__Professor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: ( rule__Professor__Group__8__Impl rule__Professor__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:2: rule__Professor__Group__8__Impl rule__Professor__Group__9
            {
            pushFollow(FOLLOW_rule__Professor__Group__8__Impl_in_rule__Professor__Group__87272);
            rule__Professor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__9_in_rule__Professor__Group__87275);
            rule__Professor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__8"


    // $ANTLR start "rule__Professor__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: rule__Professor__Group__8__Impl : ( ( rule__Professor__VorlesungAssignment_8 ) ) ;
    public final void rule__Professor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( ( rule__Professor__VorlesungAssignment_8 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( ( rule__Professor__VorlesungAssignment_8 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( ( rule__Professor__VorlesungAssignment_8 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( rule__Professor__VorlesungAssignment_8 )
            {
             before(grammarAccess.getProfessorAccess().getVorlesungAssignment_8()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( rule__Professor__VorlesungAssignment_8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:2: rule__Professor__VorlesungAssignment_8
            {
            pushFollow(FOLLOW_rule__Professor__VorlesungAssignment_8_in_rule__Professor__Group__8__Impl7302);
            rule__Professor__VorlesungAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getVorlesungAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__8__Impl"


    // $ANTLR start "rule__Professor__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: rule__Professor__Group__9 : rule__Professor__Group__9__Impl rule__Professor__Group__10 ;
    public final void rule__Professor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__Professor__Group__9__Impl rule__Professor__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:2: rule__Professor__Group__9__Impl rule__Professor__Group__10
            {
            pushFollow(FOLLOW_rule__Professor__Group__9__Impl_in_rule__Professor__Group__97332);
            rule__Professor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group__10_in_rule__Professor__Group__97335);
            rule__Professor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__9"


    // $ANTLR start "rule__Professor__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__Professor__Group__9__Impl : ( ( rule__Professor__Group_9__0 )* ) ;
    public final void rule__Professor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( ( ( rule__Professor__Group_9__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( rule__Professor__Group_9__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( rule__Professor__Group_9__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( rule__Professor__Group_9__0 )*
            {
             before(grammarAccess.getProfessorAccess().getGroup_9()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( rule__Professor__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:2: rule__Professor__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Professor__Group_9__0_in_rule__Professor__Group__9__Impl7362);
            	    rule__Professor__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProfessorAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__9__Impl"


    // $ANTLR start "rule__Professor__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__Professor__Group__10 : rule__Professor__Group__10__Impl ;
    public final void rule__Professor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( rule__Professor__Group__10__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:2: rule__Professor__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Professor__Group__10__Impl_in_rule__Professor__Group__107393);
            rule__Professor__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__10"


    // $ANTLR start "rule__Professor__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: rule__Professor__Group__10__Impl : ( '}' ) ;
    public final void rule__Professor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3765:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: '}'
            {
             before(grammarAccess.getProfessorAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Professor__Group__10__Impl7421); 
             after(grammarAccess.getProfessorAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group__10__Impl"


    // $ANTLR start "rule__Professor__Group_9__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: rule__Professor__Group_9__0 : rule__Professor__Group_9__0__Impl rule__Professor__Group_9__1 ;
    public final void rule__Professor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ( rule__Professor__Group_9__0__Impl rule__Professor__Group_9__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:2: rule__Professor__Group_9__0__Impl rule__Professor__Group_9__1
            {
            pushFollow(FOLLOW_rule__Professor__Group_9__0__Impl_in_rule__Professor__Group_9__07474);
            rule__Professor__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Professor__Group_9__1_in_rule__Professor__Group_9__07477);
            rule__Professor__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group_9__0"


    // $ANTLR start "rule__Professor__Group_9__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: rule__Professor__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Professor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ','
            {
             before(grammarAccess.getProfessorAccess().getCommaKeyword_9_0()); 
            match(input,17,FOLLOW_17_in_rule__Professor__Group_9__0__Impl7505); 
             after(grammarAccess.getProfessorAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group_9__0__Impl"


    // $ANTLR start "rule__Professor__Group_9__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: rule__Professor__Group_9__1 : rule__Professor__Group_9__1__Impl ;
    public final void rule__Professor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( rule__Professor__Group_9__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:2: rule__Professor__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Professor__Group_9__1__Impl_in_rule__Professor__Group_9__17536);
            rule__Professor__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group_9__1"


    // $ANTLR start "rule__Professor__Group_9__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:1: rule__Professor__Group_9__1__Impl : ( ( rule__Professor__VorlesungAssignment_9_1 ) ) ;
    public final void rule__Professor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( ( ( rule__Professor__VorlesungAssignment_9_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( ( rule__Professor__VorlesungAssignment_9_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( ( rule__Professor__VorlesungAssignment_9_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__Professor__VorlesungAssignment_9_1 )
            {
             before(grammarAccess.getProfessorAccess().getVorlesungAssignment_9_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ( rule__Professor__VorlesungAssignment_9_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:2: rule__Professor__VorlesungAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Professor__VorlesungAssignment_9_1_in_rule__Professor__Group_9__1__Impl7563);
            rule__Professor__VorlesungAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getProfessorAccess().getVorlesungAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__Group_9__1__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: rule__Lehrbeauftrager__Group__0 : rule__Lehrbeauftrager__Group__0__Impl rule__Lehrbeauftrager__Group__1 ;
    public final void rule__Lehrbeauftrager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ( rule__Lehrbeauftrager__Group__0__Impl rule__Lehrbeauftrager__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:2: rule__Lehrbeauftrager__Group__0__Impl rule__Lehrbeauftrager__Group__1
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__0__Impl_in_rule__Lehrbeauftrager__Group__07597);
            rule__Lehrbeauftrager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__1_in_rule__Lehrbeauftrager__Group__07600);
            rule__Lehrbeauftrager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__0"


    // $ANTLR start "rule__Lehrbeauftrager__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__Lehrbeauftrager__Group__0__Impl : ( '{' ) ;
    public final void rule__Lehrbeauftrager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: '{'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Lehrbeauftrager__Group__0__Impl7628); 
             after(grammarAccess.getLehrbeauftragerAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__0__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: rule__Lehrbeauftrager__Group__1 : rule__Lehrbeauftrager__Group__1__Impl rule__Lehrbeauftrager__Group__2 ;
    public final void rule__Lehrbeauftrager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: ( rule__Lehrbeauftrager__Group__1__Impl rule__Lehrbeauftrager__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:2: rule__Lehrbeauftrager__Group__1__Impl rule__Lehrbeauftrager__Group__2
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__1__Impl_in_rule__Lehrbeauftrager__Group__17659);
            rule__Lehrbeauftrager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__2_in_rule__Lehrbeauftrager__Group__17662);
            rule__Lehrbeauftrager__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__1"


    // $ANTLR start "rule__Lehrbeauftrager__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: rule__Lehrbeauftrager__Group__1__Impl : ( 'PersonalNr' ) ;
    public final void rule__Lehrbeauftrager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( 'PersonalNr' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( 'PersonalNr' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( 'PersonalNr' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: 'PersonalNr'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getPersonalNrKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Lehrbeauftrager__Group__1__Impl7690); 
             after(grammarAccess.getLehrbeauftragerAccess().getPersonalNrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__1__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: rule__Lehrbeauftrager__Group__2 : rule__Lehrbeauftrager__Group__2__Impl rule__Lehrbeauftrager__Group__3 ;
    public final void rule__Lehrbeauftrager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( rule__Lehrbeauftrager__Group__2__Impl rule__Lehrbeauftrager__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:2: rule__Lehrbeauftrager__Group__2__Impl rule__Lehrbeauftrager__Group__3
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__2__Impl_in_rule__Lehrbeauftrager__Group__27721);
            rule__Lehrbeauftrager__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__3_in_rule__Lehrbeauftrager__Group__27724);
            rule__Lehrbeauftrager__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__2"


    // $ANTLR start "rule__Lehrbeauftrager__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: rule__Lehrbeauftrager__Group__2__Impl : ( ( rule__Lehrbeauftrager__PersonalnrAssignment_2 ) ) ;
    public final void rule__Lehrbeauftrager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( ( ( rule__Lehrbeauftrager__PersonalnrAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( ( rule__Lehrbeauftrager__PersonalnrAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( ( rule__Lehrbeauftrager__PersonalnrAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ( rule__Lehrbeauftrager__PersonalnrAssignment_2 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getPersonalnrAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( rule__Lehrbeauftrager__PersonalnrAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:2: rule__Lehrbeauftrager__PersonalnrAssignment_2
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__PersonalnrAssignment_2_in_rule__Lehrbeauftrager__Group__2__Impl7751);
            rule__Lehrbeauftrager__PersonalnrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getPersonalnrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__2__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: rule__Lehrbeauftrager__Group__3 : rule__Lehrbeauftrager__Group__3__Impl rule__Lehrbeauftrager__Group__4 ;
    public final void rule__Lehrbeauftrager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ( rule__Lehrbeauftrager__Group__3__Impl rule__Lehrbeauftrager__Group__4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:2: rule__Lehrbeauftrager__Group__3__Impl rule__Lehrbeauftrager__Group__4
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__3__Impl_in_rule__Lehrbeauftrager__Group__37781);
            rule__Lehrbeauftrager__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__4_in_rule__Lehrbeauftrager__Group__37784);
            rule__Lehrbeauftrager__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__3"


    // $ANTLR start "rule__Lehrbeauftrager__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: rule__Lehrbeauftrager__Group__3__Impl : ( 'Vorname' ) ;
    public final void rule__Lehrbeauftrager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ( ( 'Vorname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( 'Vorname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( 'Vorname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: 'Vorname'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVornameKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Lehrbeauftrager__Group__3__Impl7812); 
             after(grammarAccess.getLehrbeauftragerAccess().getVornameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__3__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: rule__Lehrbeauftrager__Group__4 : rule__Lehrbeauftrager__Group__4__Impl rule__Lehrbeauftrager__Group__5 ;
    public final void rule__Lehrbeauftrager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( rule__Lehrbeauftrager__Group__4__Impl rule__Lehrbeauftrager__Group__5 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:2: rule__Lehrbeauftrager__Group__4__Impl rule__Lehrbeauftrager__Group__5
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__4__Impl_in_rule__Lehrbeauftrager__Group__47843);
            rule__Lehrbeauftrager__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__5_in_rule__Lehrbeauftrager__Group__47846);
            rule__Lehrbeauftrager__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__4"


    // $ANTLR start "rule__Lehrbeauftrager__Group__4__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: rule__Lehrbeauftrager__Group__4__Impl : ( ( rule__Lehrbeauftrager__VornameAssignment_4 ) ) ;
    public final void rule__Lehrbeauftrager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( ( rule__Lehrbeauftrager__VornameAssignment_4 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ( rule__Lehrbeauftrager__VornameAssignment_4 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ( rule__Lehrbeauftrager__VornameAssignment_4 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( rule__Lehrbeauftrager__VornameAssignment_4 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVornameAssignment_4()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( rule__Lehrbeauftrager__VornameAssignment_4 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:2: rule__Lehrbeauftrager__VornameAssignment_4
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__VornameAssignment_4_in_rule__Lehrbeauftrager__Group__4__Impl7873);
            rule__Lehrbeauftrager__VornameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getVornameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__4__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: rule__Lehrbeauftrager__Group__5 : rule__Lehrbeauftrager__Group__5__Impl rule__Lehrbeauftrager__Group__6 ;
    public final void rule__Lehrbeauftrager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( rule__Lehrbeauftrager__Group__5__Impl rule__Lehrbeauftrager__Group__6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:2: rule__Lehrbeauftrager__Group__5__Impl rule__Lehrbeauftrager__Group__6
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__5__Impl_in_rule__Lehrbeauftrager__Group__57903);
            rule__Lehrbeauftrager__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__6_in_rule__Lehrbeauftrager__Group__57906);
            rule__Lehrbeauftrager__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__5"


    // $ANTLR start "rule__Lehrbeauftrager__Group__5__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:1: rule__Lehrbeauftrager__Group__5__Impl : ( 'Nachname' ) ;
    public final void rule__Lehrbeauftrager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: ( ( 'Nachname' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: ( 'Nachname' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: ( 'Nachname' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: 'Nachname'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getNachnameKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Lehrbeauftrager__Group__5__Impl7934); 
             after(grammarAccess.getLehrbeauftragerAccess().getNachnameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__5__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: rule__Lehrbeauftrager__Group__6 : rule__Lehrbeauftrager__Group__6__Impl rule__Lehrbeauftrager__Group__7 ;
    public final void rule__Lehrbeauftrager__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( rule__Lehrbeauftrager__Group__6__Impl rule__Lehrbeauftrager__Group__7 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:2: rule__Lehrbeauftrager__Group__6__Impl rule__Lehrbeauftrager__Group__7
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__6__Impl_in_rule__Lehrbeauftrager__Group__67965);
            rule__Lehrbeauftrager__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__7_in_rule__Lehrbeauftrager__Group__67968);
            rule__Lehrbeauftrager__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__6"


    // $ANTLR start "rule__Lehrbeauftrager__Group__6__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: rule__Lehrbeauftrager__Group__6__Impl : ( ( rule__Lehrbeauftrager__NachnameAssignment_6 ) ) ;
    public final void rule__Lehrbeauftrager__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: ( ( ( rule__Lehrbeauftrager__NachnameAssignment_6 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( rule__Lehrbeauftrager__NachnameAssignment_6 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( rule__Lehrbeauftrager__NachnameAssignment_6 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( rule__Lehrbeauftrager__NachnameAssignment_6 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getNachnameAssignment_6()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: ( rule__Lehrbeauftrager__NachnameAssignment_6 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:2: rule__Lehrbeauftrager__NachnameAssignment_6
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__NachnameAssignment_6_in_rule__Lehrbeauftrager__Group__6__Impl7995);
            rule__Lehrbeauftrager__NachnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getNachnameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__6__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__7"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: rule__Lehrbeauftrager__Group__7 : rule__Lehrbeauftrager__Group__7__Impl rule__Lehrbeauftrager__Group__8 ;
    public final void rule__Lehrbeauftrager__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( rule__Lehrbeauftrager__Group__7__Impl rule__Lehrbeauftrager__Group__8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:2: rule__Lehrbeauftrager__Group__7__Impl rule__Lehrbeauftrager__Group__8
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__7__Impl_in_rule__Lehrbeauftrager__Group__78025);
            rule__Lehrbeauftrager__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__8_in_rule__Lehrbeauftrager__Group__78028);
            rule__Lehrbeauftrager__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__7"


    // $ANTLR start "rule__Lehrbeauftrager__Group__7__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4088:1: rule__Lehrbeauftrager__Group__7__Impl : ( 'Vorlesung' ) ;
    public final void rule__Lehrbeauftrager__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ( 'Vorlesung' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( 'Vorlesung' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( 'Vorlesung' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: 'Vorlesung'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Lehrbeauftrager__Group__7__Impl8056); 
             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__7__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: rule__Lehrbeauftrager__Group__8 : rule__Lehrbeauftrager__Group__8__Impl rule__Lehrbeauftrager__Group__9 ;
    public final void rule__Lehrbeauftrager__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: ( rule__Lehrbeauftrager__Group__8__Impl rule__Lehrbeauftrager__Group__9 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4112:2: rule__Lehrbeauftrager__Group__8__Impl rule__Lehrbeauftrager__Group__9
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__8__Impl_in_rule__Lehrbeauftrager__Group__88087);
            rule__Lehrbeauftrager__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__9_in_rule__Lehrbeauftrager__Group__88090);
            rule__Lehrbeauftrager__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__8"


    // $ANTLR start "rule__Lehrbeauftrager__Group__8__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: rule__Lehrbeauftrager__Group__8__Impl : ( ( rule__Lehrbeauftrager__VorlesungAssignment_8 ) ) ;
    public final void rule__Lehrbeauftrager__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( ( ( rule__Lehrbeauftrager__VorlesungAssignment_8 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ( rule__Lehrbeauftrager__VorlesungAssignment_8 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ( rule__Lehrbeauftrager__VorlesungAssignment_8 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: ( rule__Lehrbeauftrager__VorlesungAssignment_8 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_8()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: ( rule__Lehrbeauftrager__VorlesungAssignment_8 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:2: rule__Lehrbeauftrager__VorlesungAssignment_8
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__VorlesungAssignment_8_in_rule__Lehrbeauftrager__Group__8__Impl8117);
            rule__Lehrbeauftrager__VorlesungAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__8__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: rule__Lehrbeauftrager__Group__9 : rule__Lehrbeauftrager__Group__9__Impl rule__Lehrbeauftrager__Group__10 ;
    public final void rule__Lehrbeauftrager__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( rule__Lehrbeauftrager__Group__9__Impl rule__Lehrbeauftrager__Group__10 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:2: rule__Lehrbeauftrager__Group__9__Impl rule__Lehrbeauftrager__Group__10
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__9__Impl_in_rule__Lehrbeauftrager__Group__98147);
            rule__Lehrbeauftrager__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__10_in_rule__Lehrbeauftrager__Group__98150);
            rule__Lehrbeauftrager__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__9"


    // $ANTLR start "rule__Lehrbeauftrager__Group__9__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:1: rule__Lehrbeauftrager__Group__9__Impl : ( ( rule__Lehrbeauftrager__Group_9__0 )* ) ;
    public final void rule__Lehrbeauftrager__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( ( ( rule__Lehrbeauftrager__Group_9__0 )* ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ( rule__Lehrbeauftrager__Group_9__0 )* )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ( rule__Lehrbeauftrager__Group_9__0 )* )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( rule__Lehrbeauftrager__Group_9__0 )*
            {
             before(grammarAccess.getLehrbeauftragerAccess().getGroup_9()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ( rule__Lehrbeauftrager__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:2: rule__Lehrbeauftrager__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Lehrbeauftrager__Group_9__0_in_rule__Lehrbeauftrager__Group__9__Impl8177);
            	    rule__Lehrbeauftrager__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLehrbeauftragerAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__9__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group__10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: rule__Lehrbeauftrager__Group__10 : rule__Lehrbeauftrager__Group__10__Impl ;
    public final void rule__Lehrbeauftrager__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( rule__Lehrbeauftrager__Group__10__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:2: rule__Lehrbeauftrager__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group__10__Impl_in_rule__Lehrbeauftrager__Group__108208);
            rule__Lehrbeauftrager__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__10"


    // $ANTLR start "rule__Lehrbeauftrager__Group__10__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: rule__Lehrbeauftrager__Group__10__Impl : ( '}' ) ;
    public final void rule__Lehrbeauftrager__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: '}'
            {
             before(grammarAccess.getLehrbeauftragerAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Lehrbeauftrager__Group__10__Impl8236); 
             after(grammarAccess.getLehrbeauftragerAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group__10__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group_9__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: rule__Lehrbeauftrager__Group_9__0 : rule__Lehrbeauftrager__Group_9__0__Impl rule__Lehrbeauftrager__Group_9__1 ;
    public final void rule__Lehrbeauftrager__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( rule__Lehrbeauftrager__Group_9__0__Impl rule__Lehrbeauftrager__Group_9__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:2: rule__Lehrbeauftrager__Group_9__0__Impl rule__Lehrbeauftrager__Group_9__1
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group_9__0__Impl_in_rule__Lehrbeauftrager__Group_9__08289);
            rule__Lehrbeauftrager__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group_9__1_in_rule__Lehrbeauftrager__Group_9__08292);
            rule__Lehrbeauftrager__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group_9__0"


    // $ANTLR start "rule__Lehrbeauftrager__Group_9__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: rule__Lehrbeauftrager__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Lehrbeauftrager__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: ( ( ',' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( ',' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( ',' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: ','
            {
             before(grammarAccess.getLehrbeauftragerAccess().getCommaKeyword_9_0()); 
            match(input,17,FOLLOW_17_in_rule__Lehrbeauftrager__Group_9__0__Impl8320); 
             after(grammarAccess.getLehrbeauftragerAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group_9__0__Impl"


    // $ANTLR start "rule__Lehrbeauftrager__Group_9__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: rule__Lehrbeauftrager__Group_9__1 : rule__Lehrbeauftrager__Group_9__1__Impl ;
    public final void rule__Lehrbeauftrager__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( rule__Lehrbeauftrager__Group_9__1__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:2: rule__Lehrbeauftrager__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__Group_9__1__Impl_in_rule__Lehrbeauftrager__Group_9__18351);
            rule__Lehrbeauftrager__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group_9__1"


    // $ANTLR start "rule__Lehrbeauftrager__Group_9__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:1: rule__Lehrbeauftrager__Group_9__1__Impl : ( ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 ) ) ;
    public final void rule__Lehrbeauftrager__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4263:1: ( ( ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: ( ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: ( ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_9_1()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( rule__Lehrbeauftrager__VorlesungAssignment_9_1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:2: rule__Lehrbeauftrager__VorlesungAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Lehrbeauftrager__VorlesungAssignment_9_1_in_rule__Lehrbeauftrager__Group_9__1__Impl8378);
            rule__Lehrbeauftrager__VorlesungAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__Group_9__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__0"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__08412);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__08415);
            rule__Evaluation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: rule__Evaluation__Group__0__Impl : ( '{' ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ( '{' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( '{' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( '{' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: '{'
            {
             before(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Evaluation__Group__0__Impl8443); 
             after(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:2: rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__18474);
            rule__Evaluation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__2_in_rule__Evaluation__Group__18477);
            rule__Evaluation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: rule__Evaluation__Group__1__Impl : ( 'Gesamtnote' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( ( 'Gesamtnote' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ( 'Gesamtnote' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ( 'Gesamtnote' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: 'Gesamtnote'
            {
             before(grammarAccess.getEvaluationAccess().getGesamtnoteKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Evaluation__Group__1__Impl8505); 
             after(grammarAccess.getEvaluationAccess().getGesamtnoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: rule__Evaluation__Group__2 : rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 ;
    public final void rule__Evaluation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:1: ( rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:2: rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__2__Impl_in_rule__Evaluation__Group__28536);
            rule__Evaluation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__3_in_rule__Evaluation__Group__28539);
            rule__Evaluation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__2"


    // $ANTLR start "rule__Evaluation__Group__2__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Evaluation__Group__2__Impl : ( ( rule__Evaluation__GesamtnoteAssignment_2 ) ) ;
    public final void rule__Evaluation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( ( ( rule__Evaluation__GesamtnoteAssignment_2 ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( ( rule__Evaluation__GesamtnoteAssignment_2 ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( ( rule__Evaluation__GesamtnoteAssignment_2 ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: ( rule__Evaluation__GesamtnoteAssignment_2 )
            {
             before(grammarAccess.getEvaluationAccess().getGesamtnoteAssignment_2()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4361:1: ( rule__Evaluation__GesamtnoteAssignment_2 )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4361:2: rule__Evaluation__GesamtnoteAssignment_2
            {
            pushFollow(FOLLOW_rule__Evaluation__GesamtnoteAssignment_2_in_rule__Evaluation__Group__2__Impl8566);
            rule__Evaluation__GesamtnoteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGesamtnoteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__2__Impl"


    // $ANTLR start "rule__Evaluation__Group__3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: rule__Evaluation__Group__3 : rule__Evaluation__Group__3__Impl ;
    public final void rule__Evaluation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( rule__Evaluation__Group__3__Impl )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:2: rule__Evaluation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__3__Impl_in_rule__Evaluation__Group__38596);
            rule__Evaluation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__3"


    // $ANTLR start "rule__Evaluation__Group__3__Impl"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4382:1: rule__Evaluation__Group__3__Impl : ( '}' ) ;
    public final void rule__Evaluation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( ( '}' ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( '}' )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( '}' )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: '}'
            {
             before(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Evaluation__Group__3__Impl8624); 
             after(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__3__Impl"


    // $ANTLR start "rule__Hochschule__NameAssignment_3"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: rule__Hochschule__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Hochschule__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4416:1: RULE_STRING
            {
             before(grammarAccess.getHochschuleAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Hochschule__NameAssignment_38668); 
             after(grammarAccess.getHochschuleAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__NameAssignment_3"


    // $ANTLR start "rule__Hochschule__StudentAssignment_5"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: rule__Hochschule__StudentAssignment_5 : ( ruleStudent ) ;
    public final void rule__Hochschule__StudentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: ( ( ruleStudent ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ruleStudent )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ruleStudent )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ruleStudent
            {
             before(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStudent_in_rule__Hochschule__StudentAssignment_58699);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__StudentAssignment_5"


    // $ANTLR start "rule__Hochschule__StudentAssignment_6_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: rule__Hochschule__StudentAssignment_6_1 : ( ruleStudent ) ;
    public final void rule__Hochschule__StudentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: ( ( ruleStudent ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( ruleStudent )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( ruleStudent )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ruleStudent
            {
             before(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleStudent_in_rule__Hochschule__StudentAssignment_6_18730);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getHochschuleAccess().getStudentStudentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__StudentAssignment_6_1"


    // $ANTLR start "rule__Hochschule__FachbereichAssignment_8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: rule__Hochschule__FachbereichAssignment_8 : ( ruleFachbereich ) ;
    public final void rule__Hochschule__FachbereichAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:1: ( ( ruleFachbereich ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( ruleFachbereich )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( ruleFachbereich )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ruleFachbereich
            {
             before(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFachbereich_in_rule__Hochschule__FachbereichAssignment_88761);
            ruleFachbereich();

            state._fsp--;

             after(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__FachbereichAssignment_8"


    // $ANTLR start "rule__Hochschule__FachbereichAssignment_9_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: rule__Hochschule__FachbereichAssignment_9_1 : ( ruleFachbereich ) ;
    public final void rule__Hochschule__FachbereichAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: ( ( ruleFachbereich ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: ( ruleFachbereich )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: ( ruleFachbereich )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ruleFachbereich
            {
             before(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleFachbereich_in_rule__Hochschule__FachbereichAssignment_9_18792);
            ruleFachbereich();

            state._fsp--;

             after(grammarAccess.getHochschuleAccess().getFachbereichFachbereichParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hochschule__FachbereichAssignment_9_1"


    // $ANTLR start "rule__Fachbereich__NameAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: rule__Fachbereich__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Fachbereich__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: RULE_STRING
            {
             before(grammarAccess.getFachbereichAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fachbereich__NameAssignment_28823); 
             after(grammarAccess.getFachbereichAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__NameAssignment_2"


    // $ANTLR start "rule__Fachbereich__AliasAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: rule__Fachbereich__AliasAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Fachbereich__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4506:1: RULE_STRING
            {
             before(grammarAccess.getFachbereichAccess().getAliasSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fachbereich__AliasAssignment_48854); 
             after(grammarAccess.getFachbereichAccess().getAliasSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__AliasAssignment_4"


    // $ANTLR start "rule__Fachbereich__StudiengangAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: rule__Fachbereich__StudiengangAssignment_6 : ( ruleStudiengang ) ;
    public final void rule__Fachbereich__StudiengangAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( ( ruleStudiengang ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ruleStudiengang )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ruleStudiengang )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ruleStudiengang
            {
             before(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStudiengang_in_rule__Fachbereich__StudiengangAssignment_68885);
            ruleStudiengang();

            state._fsp--;

             after(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__StudiengangAssignment_6"


    // $ANTLR start "rule__Fachbereich__StudiengangAssignment_7_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: rule__Fachbereich__StudiengangAssignment_7_1 : ( ruleStudiengang ) ;
    public final void rule__Fachbereich__StudiengangAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( ( ruleStudiengang ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( ruleStudiengang )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( ruleStudiengang )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ruleStudiengang
            {
             before(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleStudiengang_in_rule__Fachbereich__StudiengangAssignment_7_18916);
            ruleStudiengang();

            state._fsp--;

             after(grammarAccess.getFachbereichAccess().getStudiengangStudiengangParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__StudiengangAssignment_7_1"


    // $ANTLR start "rule__Fachbereich__DozentAssignment_9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: rule__Fachbereich__DozentAssignment_9 : ( ruleDozent ) ;
    public final void rule__Fachbereich__DozentAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( ( ruleDozent ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ruleDozent )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ruleDozent )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ruleDozent
            {
             before(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleDozent_in_rule__Fachbereich__DozentAssignment_98947);
            ruleDozent();

            state._fsp--;

             after(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__DozentAssignment_9"


    // $ANTLR start "rule__Fachbereich__DozentAssignment_10_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: rule__Fachbereich__DozentAssignment_10_1 : ( ruleDozent ) ;
    public final void rule__Fachbereich__DozentAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( ( ruleDozent ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( ruleDozent )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( ruleDozent )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ruleDozent
            {
             before(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleDozent_in_rule__Fachbereich__DozentAssignment_10_18978);
            ruleDozent();

            state._fsp--;

             after(grammarAccess.getFachbereichAccess().getDozentDozentParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__DozentAssignment_10_1"


    // $ANTLR start "rule__Fachbereich__VorlesungAssignment_11_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: rule__Fachbereich__VorlesungAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fachbereich__VorlesungAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ( RULE_ID )
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: RULE_ID
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungVorlesungIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fachbereich__VorlesungAssignment_11_19013); 
             after(grammarAccess.getFachbereichAccess().getVorlesungVorlesungIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__VorlesungAssignment_11_1"


    // $ANTLR start "rule__Fachbereich__VorlesungAssignment_11_2_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: rule__Fachbereich__VorlesungAssignment_11_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fachbereich__VorlesungAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( RULE_ID )
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_2_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: RULE_ID
            {
             before(grammarAccess.getFachbereichAccess().getVorlesungVorlesungIDTerminalRuleCall_11_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fachbereich__VorlesungAssignment_11_2_19052); 
             after(grammarAccess.getFachbereichAccess().getVorlesungVorlesungIDTerminalRuleCall_11_2_1_0_1()); 

            }

             after(grammarAccess.getFachbereichAccess().getVorlesungVorlesungCrossReference_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fachbereich__VorlesungAssignment_11_2_1"


    // $ANTLR start "rule__Studiengang__NameAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: rule__Studiengang__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Studiengang__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: RULE_STRING
            {
             before(grammarAccess.getStudiengangAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Studiengang__NameAssignment_29087); 
             after(grammarAccess.getStudiengangAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__NameAssignment_2"


    // $ANTLR start "rule__Studiengang__NcAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: rule__Studiengang__NcAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Studiengang__NcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: RULE_STRING
            {
             before(grammarAccess.getStudiengangAccess().getNcSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Studiengang__NcAssignment_49118); 
             after(grammarAccess.getStudiengangAccess().getNcSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__NcAssignment_4"


    // $ANTLR start "rule__Studiengang__StudentAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: rule__Studiengang__StudentAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Studiengang__StudentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:1: ( RULE_ID )
            {
             before(grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_6_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4651:1: RULE_ID
            {
             before(grammarAccess.getStudiengangAccess().getStudentStudentIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Studiengang__StudentAssignment_69153); 
             after(grammarAccess.getStudiengangAccess().getStudentStudentIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__StudentAssignment_6"


    // $ANTLR start "rule__Studiengang__StudentAssignment_7_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: rule__Studiengang__StudentAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Studiengang__StudentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ( RULE_ID )
            {
             before(grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_7_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: RULE_ID
            {
             before(grammarAccess.getStudiengangAccess().getStudentStudentIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Studiengang__StudentAssignment_7_19192); 
             after(grammarAccess.getStudiengangAccess().getStudentStudentIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getStudiengangAccess().getStudentStudentCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__StudentAssignment_7_1"


    // $ANTLR start "rule__Studiengang__VorlesungAssignment_9"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: rule__Studiengang__VorlesungAssignment_9 : ( ruleVorlesung ) ;
    public final void rule__Studiengang__VorlesungAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: ( ( ruleVorlesung ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:1: ( ruleVorlesung )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:1: ( ruleVorlesung )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: ruleVorlesung
            {
             before(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleVorlesung_in_rule__Studiengang__VorlesungAssignment_99227);
            ruleVorlesung();

            state._fsp--;

             after(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__VorlesungAssignment_9"


    // $ANTLR start "rule__Studiengang__VorlesungAssignment_10_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: rule__Studiengang__VorlesungAssignment_10_1 : ( ruleVorlesung ) ;
    public final void rule__Studiengang__VorlesungAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( ( ruleVorlesung ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: ( ruleVorlesung )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: ( ruleVorlesung )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ruleVorlesung
            {
             before(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleVorlesung_in_rule__Studiengang__VorlesungAssignment_10_19258);
            ruleVorlesung();

            state._fsp--;

             after(grammarAccess.getStudiengangAccess().getVorlesungVorlesungParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Studiengang__VorlesungAssignment_10_1"


    // $ANTLR start "rule__Vorlesung__NameAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4711:1: rule__Vorlesung__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Vorlesung__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: RULE_STRING
            {
             before(grammarAccess.getVorlesungAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Vorlesung__NameAssignment_29289); 
             after(grammarAccess.getVorlesungAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__NameAssignment_2"


    // $ANTLR start "rule__Vorlesung__ModulnrAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: rule__Vorlesung__ModulnrAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Vorlesung__ModulnrAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: RULE_STRING
            {
             before(grammarAccess.getVorlesungAccess().getModulnrSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Vorlesung__ModulnrAssignment_49320); 
             after(grammarAccess.getVorlesungAccess().getModulnrSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__ModulnrAssignment_4"


    // $ANTLR start "rule__Vorlesung__BeschreibungAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:1: rule__Vorlesung__BeschreibungAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Vorlesung__BeschreibungAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4745:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: RULE_STRING
            {
             before(grammarAccess.getVorlesungAccess().getBeschreibungSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Vorlesung__BeschreibungAssignment_69351); 
             after(grammarAccess.getVorlesungAccess().getBeschreibungSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__BeschreibungAssignment_6"


    // $ANTLR start "rule__Vorlesung__CrpAssignment_8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: rule__Vorlesung__CrpAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Vorlesung__CrpAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4762:1: RULE_STRING
            {
             before(grammarAccess.getVorlesungAccess().getCrpSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Vorlesung__CrpAssignment_89382); 
             after(grammarAccess.getVorlesungAccess().getCrpSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__CrpAssignment_8"


    // $ANTLR start "rule__Vorlesung__DozentAssignment_10"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: rule__Vorlesung__DozentAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Vorlesung__DozentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4775:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4776:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4776:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: ( RULE_ID )
            {
             before(grammarAccess.getVorlesungAccess().getDozentDozentCrossReference_10_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4779:1: RULE_ID
            {
             before(grammarAccess.getVorlesungAccess().getDozentDozentIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorlesung__DozentAssignment_109417); 
             after(grammarAccess.getVorlesungAccess().getDozentDozentIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getVorlesungAccess().getDozentDozentCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__DozentAssignment_10"


    // $ANTLR start "rule__Vorlesung__StudentAssignment_12"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: rule__Vorlesung__StudentAssignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Vorlesung__StudentAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( RULE_ID )
            {
             before(grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_12_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: RULE_ID
            {
             before(grammarAccess.getVorlesungAccess().getStudentStudentIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorlesung__StudentAssignment_129456); 
             after(grammarAccess.getVorlesungAccess().getStudentStudentIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__StudentAssignment_12"


    // $ANTLR start "rule__Vorlesung__StudentAssignment_13_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4809:1: rule__Vorlesung__StudentAssignment_13_1 : ( ( RULE_ID ) ) ;
    public final void rule__Vorlesung__StudentAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( RULE_ID )
            {
             before(grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_13_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: RULE_ID
            {
             before(grammarAccess.getVorlesungAccess().getStudentStudentIDTerminalRuleCall_13_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorlesung__StudentAssignment_13_19495); 
             after(grammarAccess.getVorlesungAccess().getStudentStudentIDTerminalRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getVorlesungAccess().getStudentStudentCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__StudentAssignment_13_1"


    // $ANTLR start "rule__Vorlesung__TutorAssignment_15"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: rule__Vorlesung__TutorAssignment_15 : ( ( RULE_ID ) ) ;
    public final void rule__Vorlesung__TutorAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: ( RULE_ID )
            {
             before(grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_15_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4836:1: RULE_ID
            {
             before(grammarAccess.getVorlesungAccess().getTutorStudentIDTerminalRuleCall_15_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorlesung__TutorAssignment_159534); 
             after(grammarAccess.getVorlesungAccess().getTutorStudentIDTerminalRuleCall_15_0_1()); 

            }

             after(grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__TutorAssignment_15"


    // $ANTLR start "rule__Vorlesung__TutorAssignment_16_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: rule__Vorlesung__TutorAssignment_16_1 : ( ( RULE_ID ) ) ;
    public final void rule__Vorlesung__TutorAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4851:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4852:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4852:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:1: ( RULE_ID )
            {
             before(grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_16_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: RULE_ID
            {
             before(grammarAccess.getVorlesungAccess().getTutorStudentIDTerminalRuleCall_16_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorlesung__TutorAssignment_16_19573); 
             after(grammarAccess.getVorlesungAccess().getTutorStudentIDTerminalRuleCall_16_1_0_1()); 

            }

             after(grammarAccess.getVorlesungAccess().getTutorStudentCrossReference_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__TutorAssignment_16_1"


    // $ANTLR start "rule__Vorlesung__EvaluationAssignment_18"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: rule__Vorlesung__EvaluationAssignment_18 : ( ruleEvaluation ) ;
    public final void rule__Vorlesung__EvaluationAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ( ruleEvaluation ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( ruleEvaluation )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( ruleEvaluation )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:1: ruleEvaluation
            {
             before(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleEvaluation_in_rule__Vorlesung__EvaluationAssignment_189608);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__EvaluationAssignment_18"


    // $ANTLR start "rule__Vorlesung__EvaluationAssignment_19_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: rule__Vorlesung__EvaluationAssignment_19_1 : ( ruleEvaluation ) ;
    public final void rule__Vorlesung__EvaluationAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ( ruleEvaluation ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( ruleEvaluation )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( ruleEvaluation )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: ruleEvaluation
            {
             before(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_ruleEvaluation_in_rule__Vorlesung__EvaluationAssignment_19_19639);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getVorlesungAccess().getEvaluationEvaluationParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vorlesung__EvaluationAssignment_19_1"


    // $ANTLR start "rule__Student__MatrikelnrAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: rule__Student__MatrikelnrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Student__MatrikelnrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getMatrikelnrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Student__MatrikelnrAssignment_29670); 
             after(grammarAccess.getStudentAccess().getMatrikelnrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__MatrikelnrAssignment_2"


    // $ANTLR start "rule__Student__VornameAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: rule__Student__VornameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Student__VornameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Student__VornameAssignment_49701); 
             after(grammarAccess.getStudentAccess().getVornameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__VornameAssignment_4"


    // $ANTLR start "rule__Student__NachnameAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: rule__Student__NachnameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Student__NachnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4932:1: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Student__NachnameAssignment_69732); 
             after(grammarAccess.getStudentAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NachnameAssignment_6"


    // $ANTLR start "rule__Student__VorlesungAssignment_7_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: rule__Student__VorlesungAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Student__VorlesungAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( RULE_ID )
            {
             before(grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getVorlesungVorlesungIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Student__VorlesungAssignment_7_19767); 
             after(grammarAccess.getStudentAccess().getVorlesungVorlesungIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__VorlesungAssignment_7_1"


    // $ANTLR start "rule__Student__VorlesungAssignment_7_2_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: rule__Student__VorlesungAssignment_7_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Student__VorlesungAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: ( RULE_ID )
            {
             before(grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_2_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getVorlesungVorlesungIDTerminalRuleCall_7_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Student__VorlesungAssignment_7_2_19806); 
             after(grammarAccess.getStudentAccess().getVorlesungVorlesungIDTerminalRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getVorlesungVorlesungCrossReference_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__VorlesungAssignment_7_2_1"


    // $ANTLR start "rule__Professor__PersonalnrAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:1: rule__Professor__PersonalnrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Professor__PersonalnrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: RULE_STRING
            {
             before(grammarAccess.getProfessorAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Professor__PersonalnrAssignment_29841); 
             after(grammarAccess.getProfessorAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__PersonalnrAssignment_2"


    // $ANTLR start "rule__Professor__VornameAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: rule__Professor__VornameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Professor__VornameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: RULE_STRING
            {
             before(grammarAccess.getProfessorAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Professor__VornameAssignment_49872); 
             after(grammarAccess.getProfessorAccess().getVornameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__VornameAssignment_4"


    // $ANTLR start "rule__Professor__NachnameAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: rule__Professor__NachnameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Professor__NachnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5015:1: RULE_STRING
            {
             before(grammarAccess.getProfessorAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Professor__NachnameAssignment_69903); 
             after(grammarAccess.getProfessorAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__NachnameAssignment_6"


    // $ANTLR start "rule__Professor__VorlesungAssignment_8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: rule__Professor__VorlesungAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Professor__VorlesungAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: ( RULE_ID )
            {
             before(grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_8_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: RULE_ID
            {
             before(grammarAccess.getProfessorAccess().getVorlesungVorlesungIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Professor__VorlesungAssignment_89938); 
             after(grammarAccess.getProfessorAccess().getVorlesungVorlesungIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__VorlesungAssignment_8"


    // $ANTLR start "rule__Professor__VorlesungAssignment_9_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__Professor__VorlesungAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Professor__VorlesungAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: ( RULE_ID )
            {
             before(grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_9_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: RULE_ID
            {
             before(grammarAccess.getProfessorAccess().getVorlesungVorlesungIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Professor__VorlesungAssignment_9_19977); 
             after(grammarAccess.getProfessorAccess().getVorlesungVorlesungIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getProfessorAccess().getVorlesungVorlesungCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Professor__VorlesungAssignment_9_1"


    // $ANTLR start "rule__Lehrbeauftrager__PersonalnrAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: rule__Lehrbeauftrager__PersonalnrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Lehrbeauftrager__PersonalnrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: RULE_STRING
            {
             before(grammarAccess.getLehrbeauftragerAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__PersonalnrAssignment_210012); 
             after(grammarAccess.getLehrbeauftragerAccess().getPersonalnrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__PersonalnrAssignment_2"


    // $ANTLR start "rule__Lehrbeauftrager__VornameAssignment_4"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: rule__Lehrbeauftrager__VornameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Lehrbeauftrager__VornameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: RULE_STRING
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVornameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__VornameAssignment_410043); 
             after(grammarAccess.getLehrbeauftragerAccess().getVornameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__VornameAssignment_4"


    // $ANTLR start "rule__Lehrbeauftrager__NachnameAssignment_6"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: rule__Lehrbeauftrager__NachnameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Lehrbeauftrager__NachnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( ( RULE_STRING ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( RULE_STRING )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( RULE_STRING )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: RULE_STRING
            {
             before(grammarAccess.getLehrbeauftragerAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__NachnameAssignment_610074); 
             after(grammarAccess.getLehrbeauftragerAccess().getNachnameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__NachnameAssignment_6"


    // $ANTLR start "rule__Lehrbeauftrager__VorlesungAssignment_8"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: rule__Lehrbeauftrager__VorlesungAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Lehrbeauftrager__VorlesungAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( RULE_ID )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_8_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: RULE_ID
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Lehrbeauftrager__VorlesungAssignment_810109); 
             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__VorlesungAssignment_8"


    // $ANTLR start "rule__Lehrbeauftrager__VorlesungAssignment_9_1"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: rule__Lehrbeauftrager__VorlesungAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Lehrbeauftrager__VorlesungAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( ( ( RULE_ID ) ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( ( RULE_ID ) )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( ( RULE_ID ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:1: ( RULE_ID )
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_9_1_0()); 
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: ( RULE_ID )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: RULE_ID
            {
             before(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Lehrbeauftrager__VorlesungAssignment_9_110148); 
             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getLehrbeauftragerAccess().getVorlesungVorlesungCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lehrbeauftrager__VorlesungAssignment_9_1"


    // $ANTLR start "rule__Evaluation__GesamtnoteAssignment_2"
    // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: rule__Evaluation__GesamtnoteAssignment_2 : ( RULE_INT ) ;
    public final void rule__Evaluation__GesamtnoteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( ( RULE_INT ) )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( RULE_INT )
            {
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( RULE_INT )
            // ../de.thm.mni.hochschule.mydsl.ui/src-gen/de/thm/mni/hochschule/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: RULE_INT
            {
             before(grammarAccess.getEvaluationAccess().getGesamtnoteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Evaluation__GesamtnoteAssignment_210183); 
             after(grammarAccess.getEvaluationAccess().getGesamtnoteINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__GesamtnoteAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHochschule_in_entryRuleHochschule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHochschule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__0_in_ruleHochschule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFachbereich_in_entryRuleFachbereich121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFachbereich128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__0_in_ruleFachbereich154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudiengang_in_entryRuleStudiengang181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStudiengang188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__0_in_ruleStudiengang214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorlesung_in_entryRuleVorlesung241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorlesung248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__0_in_ruleVorlesung274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudent_in_entryRuleStudent301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStudent308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__0_in_ruleStudent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDozent_in_entryRuleDozent361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDozent368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Alternatives_in_ruleDozent394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfessor_in_entryRuleProfessor421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProfessor428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__0_in_ruleProfessor454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLehrbeauftrager_in_entryRuleLehrbeauftrager481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLehrbeauftrager488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__0_in_ruleLehrbeauftrager514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_0__0_in_rule__Dozent__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_1__0_in_rule__Dozent__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__0__Impl_in_rule__Hochschule__Group__0659 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__1_in_rule__Hochschule__Group__0662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Hochschule__Group__0__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__1__Impl_in_rule__Hochschule__Group__1721 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__2_in_rule__Hochschule__Group__1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Hochschule__Group__1__Impl752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__2__Impl_in_rule__Hochschule__Group__2783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__3_in_rule__Hochschule__Group__2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Hochschule__Group__2__Impl814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__3__Impl_in_rule__Hochschule__Group__3845 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__4_in_rule__Hochschule__Group__3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__NameAssignment_3_in_rule__Hochschule__Group__3__Impl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__4__Impl_in_rule__Hochschule__Group__4905 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__5_in_rule__Hochschule__Group__4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Hochschule__Group__4__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__5__Impl_in_rule__Hochschule__Group__5967 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__6_in_rule__Hochschule__Group__5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__StudentAssignment_5_in_rule__Hochschule__Group__5__Impl997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__6__Impl_in_rule__Hochschule__Group__61027 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__7_in_rule__Hochschule__Group__61030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_6__0_in_rule__Hochschule__Group__6__Impl1057 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__7__Impl_in_rule__Hochschule__Group__71088 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__8_in_rule__Hochschule__Group__71091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Hochschule__Group__7__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__8__Impl_in_rule__Hochschule__Group__81150 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__9_in_rule__Hochschule__Group__81153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__FachbereichAssignment_8_in_rule__Hochschule__Group__8__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__9__Impl_in_rule__Hochschule__Group__91210 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__10_in_rule__Hochschule__Group__91213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_9__0_in_rule__Hochschule__Group__9__Impl1240 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group__10__Impl_in_rule__Hochschule__Group__101271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Hochschule__Group__10__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_6__0__Impl_in_rule__Hochschule__Group_6__01352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_6__1_in_rule__Hochschule__Group_6__01355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Hochschule__Group_6__0__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_6__1__Impl_in_rule__Hochschule__Group_6__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__StudentAssignment_6_1_in_rule__Hochschule__Group_6__1__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_9__0__Impl_in_rule__Hochschule__Group_9__01475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_9__1_in_rule__Hochschule__Group_9__01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Hochschule__Group_9__0__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__Group_9__1__Impl_in_rule__Hochschule__Group_9__11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hochschule__FachbereichAssignment_9_1_in_rule__Hochschule__Group_9__1__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__0__Impl_in_rule__Fachbereich__Group__01598 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__1_in_rule__Fachbereich__Group__01601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Fachbereich__Group__0__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__1__Impl_in_rule__Fachbereich__Group__11660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__2_in_rule__Fachbereich__Group__11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Fachbereich__Group__1__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__2__Impl_in_rule__Fachbereich__Group__21722 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__3_in_rule__Fachbereich__Group__21725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__NameAssignment_2_in_rule__Fachbereich__Group__2__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__3__Impl_in_rule__Fachbereich__Group__31782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__4_in_rule__Fachbereich__Group__31785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Fachbereich__Group__3__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__4__Impl_in_rule__Fachbereich__Group__41844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__5_in_rule__Fachbereich__Group__41847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__AliasAssignment_4_in_rule__Fachbereich__Group__4__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__5__Impl_in_rule__Fachbereich__Group__51904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__6_in_rule__Fachbereich__Group__51907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Fachbereich__Group__5__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__6__Impl_in_rule__Fachbereich__Group__61966 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__7_in_rule__Fachbereich__Group__61969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__StudiengangAssignment_6_in_rule__Fachbereich__Group__6__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__7__Impl_in_rule__Fachbereich__Group__72026 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__8_in_rule__Fachbereich__Group__72029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_7__0_in_rule__Fachbereich__Group__7__Impl2056 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__8__Impl_in_rule__Fachbereich__Group__82087 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__9_in_rule__Fachbereich__Group__82090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Fachbereich__Group__8__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__9__Impl_in_rule__Fachbereich__Group__92149 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__10_in_rule__Fachbereich__Group__92152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__DozentAssignment_9_in_rule__Fachbereich__Group__9__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__10__Impl_in_rule__Fachbereich__Group__102209 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__11_in_rule__Fachbereich__Group__102212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_10__0_in_rule__Fachbereich__Group__10__Impl2239 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__11__Impl_in_rule__Fachbereich__Group__112270 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__12_in_rule__Fachbereich__Group__112273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__0_in_rule__Fachbereich__Group__11__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group__12__Impl_in_rule__Fachbereich__Group__122331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Fachbereich__Group__12__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_7__0__Impl_in_rule__Fachbereich__Group_7__02416 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_7__1_in_rule__Fachbereich__Group_7__02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Fachbereich__Group_7__0__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_7__1__Impl_in_rule__Fachbereich__Group_7__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__StudiengangAssignment_7_1_in_rule__Fachbereich__Group_7__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_10__0__Impl_in_rule__Fachbereich__Group_10__02539 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_10__1_in_rule__Fachbereich__Group_10__02542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Fachbereich__Group_10__0__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_10__1__Impl_in_rule__Fachbereich__Group_10__12601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__DozentAssignment_10_1_in_rule__Fachbereich__Group_10__1__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__0__Impl_in_rule__Fachbereich__Group_11__02662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__1_in_rule__Fachbereich__Group_11__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Fachbereich__Group_11__0__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__1__Impl_in_rule__Fachbereich__Group_11__12724 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__2_in_rule__Fachbereich__Group_11__12727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__VorlesungAssignment_11_1_in_rule__Fachbereich__Group_11__1__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11__2__Impl_in_rule__Fachbereich__Group_11__22784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11_2__0_in_rule__Fachbereich__Group_11__2__Impl2811 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11_2__0__Impl_in_rule__Fachbereich__Group_11_2__02848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11_2__1_in_rule__Fachbereich__Group_11_2__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Fachbereich__Group_11_2__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__Group_11_2__1__Impl_in_rule__Fachbereich__Group_11_2__12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fachbereich__VorlesungAssignment_11_2_1_in_rule__Fachbereich__Group_11_2__1__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__0__Impl_in_rule__Studiengang__Group__02971 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__1_in_rule__Studiengang__Group__02974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Studiengang__Group__0__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__1__Impl_in_rule__Studiengang__Group__13033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__2_in_rule__Studiengang__Group__13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Studiengang__Group__1__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__2__Impl_in_rule__Studiengang__Group__23095 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__3_in_rule__Studiengang__Group__23098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__NameAssignment_2_in_rule__Studiengang__Group__2__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__3__Impl_in_rule__Studiengang__Group__33155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__4_in_rule__Studiengang__Group__33158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Studiengang__Group__3__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__4__Impl_in_rule__Studiengang__Group__43217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__5_in_rule__Studiengang__Group__43220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__NcAssignment_4_in_rule__Studiengang__Group__4__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__5__Impl_in_rule__Studiengang__Group__53277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__6_in_rule__Studiengang__Group__53280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Studiengang__Group__5__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__6__Impl_in_rule__Studiengang__Group__63339 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__7_in_rule__Studiengang__Group__63342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__StudentAssignment_6_in_rule__Studiengang__Group__6__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__7__Impl_in_rule__Studiengang__Group__73399 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__8_in_rule__Studiengang__Group__73402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_7__0_in_rule__Studiengang__Group__7__Impl3429 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__8__Impl_in_rule__Studiengang__Group__83460 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__9_in_rule__Studiengang__Group__83463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Studiengang__Group__8__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__9__Impl_in_rule__Studiengang__Group__93522 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__10_in_rule__Studiengang__Group__93525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__VorlesungAssignment_9_in_rule__Studiengang__Group__9__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__10__Impl_in_rule__Studiengang__Group__103582 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__11_in_rule__Studiengang__Group__103585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_10__0_in_rule__Studiengang__Group__10__Impl3612 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group__11__Impl_in_rule__Studiengang__Group__113643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Studiengang__Group__11__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_7__0__Impl_in_rule__Studiengang__Group_7__03726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_7__1_in_rule__Studiengang__Group_7__03729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Studiengang__Group_7__0__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_7__1__Impl_in_rule__Studiengang__Group_7__13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__StudentAssignment_7_1_in_rule__Studiengang__Group_7__1__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_10__0__Impl_in_rule__Studiengang__Group_10__03849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_10__1_in_rule__Studiengang__Group_10__03852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Studiengang__Group_10__0__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__Group_10__1__Impl_in_rule__Studiengang__Group_10__13911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Studiengang__VorlesungAssignment_10_1_in_rule__Studiengang__Group_10__1__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__0__Impl_in_rule__Vorlesung__Group__03972 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__1_in_rule__Vorlesung__Group__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Vorlesung__Group__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__1__Impl_in_rule__Vorlesung__Group__14034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__2_in_rule__Vorlesung__Group__14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Vorlesung__Group__1__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__2__Impl_in_rule__Vorlesung__Group__24096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__3_in_rule__Vorlesung__Group__24099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__NameAssignment_2_in_rule__Vorlesung__Group__2__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__3__Impl_in_rule__Vorlesung__Group__34156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__4_in_rule__Vorlesung__Group__34159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Vorlesung__Group__3__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__4__Impl_in_rule__Vorlesung__Group__44218 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__5_in_rule__Vorlesung__Group__44221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__ModulnrAssignment_4_in_rule__Vorlesung__Group__4__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__5__Impl_in_rule__Vorlesung__Group__54278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__6_in_rule__Vorlesung__Group__54281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Vorlesung__Group__5__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__6__Impl_in_rule__Vorlesung__Group__64340 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__7_in_rule__Vorlesung__Group__64343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__BeschreibungAssignment_6_in_rule__Vorlesung__Group__6__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__7__Impl_in_rule__Vorlesung__Group__74400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__8_in_rule__Vorlesung__Group__74403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vorlesung__Group__7__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__8__Impl_in_rule__Vorlesung__Group__84462 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__9_in_rule__Vorlesung__Group__84465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__CrpAssignment_8_in_rule__Vorlesung__Group__8__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__9__Impl_in_rule__Vorlesung__Group__94522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__10_in_rule__Vorlesung__Group__94525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Vorlesung__Group__9__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__10__Impl_in_rule__Vorlesung__Group__104584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__11_in_rule__Vorlesung__Group__104587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__DozentAssignment_10_in_rule__Vorlesung__Group__10__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__11__Impl_in_rule__Vorlesung__Group__114644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__12_in_rule__Vorlesung__Group__114647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Vorlesung__Group__11__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__12__Impl_in_rule__Vorlesung__Group__124706 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__13_in_rule__Vorlesung__Group__124709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__StudentAssignment_12_in_rule__Vorlesung__Group__12__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__13__Impl_in_rule__Vorlesung__Group__134766 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__14_in_rule__Vorlesung__Group__134769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_13__0_in_rule__Vorlesung__Group__13__Impl4796 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__14__Impl_in_rule__Vorlesung__Group__144827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__15_in_rule__Vorlesung__Group__144830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Vorlesung__Group__14__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__15__Impl_in_rule__Vorlesung__Group__154889 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__16_in_rule__Vorlesung__Group__154892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__TutorAssignment_15_in_rule__Vorlesung__Group__15__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__16__Impl_in_rule__Vorlesung__Group__164949 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__17_in_rule__Vorlesung__Group__164952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_16__0_in_rule__Vorlesung__Group__16__Impl4979 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__17__Impl_in_rule__Vorlesung__Group__175010 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__18_in_rule__Vorlesung__Group__175013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Vorlesung__Group__17__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__18__Impl_in_rule__Vorlesung__Group__185072 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__19_in_rule__Vorlesung__Group__185075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__EvaluationAssignment_18_in_rule__Vorlesung__Group__18__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__19__Impl_in_rule__Vorlesung__Group__195132 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__20_in_rule__Vorlesung__Group__195135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_19__0_in_rule__Vorlesung__Group__19__Impl5162 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group__20__Impl_in_rule__Vorlesung__Group__205193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Vorlesung__Group__20__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_13__0__Impl_in_rule__Vorlesung__Group_13__05294 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_13__1_in_rule__Vorlesung__Group_13__05297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Vorlesung__Group_13__0__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_13__1__Impl_in_rule__Vorlesung__Group_13__15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__StudentAssignment_13_1_in_rule__Vorlesung__Group_13__1__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_16__0__Impl_in_rule__Vorlesung__Group_16__05417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_16__1_in_rule__Vorlesung__Group_16__05420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Vorlesung__Group_16__0__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_16__1__Impl_in_rule__Vorlesung__Group_16__15479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__TutorAssignment_16_1_in_rule__Vorlesung__Group_16__1__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_19__0__Impl_in_rule__Vorlesung__Group_19__05540 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_19__1_in_rule__Vorlesung__Group_19__05543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Vorlesung__Group_19__0__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__Group_19__1__Impl_in_rule__Vorlesung__Group_19__15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorlesung__EvaluationAssignment_19_1_in_rule__Vorlesung__Group_19__1__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__0__Impl_in_rule__Student__Group__05663 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Student__Group__1_in_rule__Student__Group__05666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Student__Group__0__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__1__Impl_in_rule__Student__Group__15725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Student__Group__2_in_rule__Student__Group__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Student__Group__1__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__2__Impl_in_rule__Student__Group__25787 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Student__Group__3_in_rule__Student__Group__25790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__MatrikelnrAssignment_2_in_rule__Student__Group__2__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__3__Impl_in_rule__Student__Group__35847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Student__Group__4_in_rule__Student__Group__35850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Student__Group__3__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__4__Impl_in_rule__Student__Group__45909 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Student__Group__5_in_rule__Student__Group__45912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__VornameAssignment_4_in_rule__Student__Group__4__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__5__Impl_in_rule__Student__Group__55969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Student__Group__6_in_rule__Student__Group__55972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Student__Group__5__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__6__Impl_in_rule__Student__Group__66031 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Student__Group__7_in_rule__Student__Group__66034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__NachnameAssignment_6_in_rule__Student__Group__6__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__7__Impl_in_rule__Student__Group__76091 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Student__Group__8_in_rule__Student__Group__76094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7__0_in_rule__Student__Group__7__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group__8__Impl_in_rule__Student__Group__86152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Student__Group__8__Impl6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7__0__Impl_in_rule__Student__Group_7__06229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Student__Group_7__1_in_rule__Student__Group_7__06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Student__Group_7__0__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7__1__Impl_in_rule__Student__Group_7__16291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Student__Group_7__2_in_rule__Student__Group_7__16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__VorlesungAssignment_7_1_in_rule__Student__Group_7__1__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7__2__Impl_in_rule__Student__Group_7__26351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7_2__0_in_rule__Student__Group_7__2__Impl6378 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Student__Group_7_2__0__Impl_in_rule__Student__Group_7_2__06415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Student__Group_7_2__1_in_rule__Student__Group_7_2__06418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Student__Group_7_2__0__Impl6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__Group_7_2__1__Impl_in_rule__Student__Group_7_2__16477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Student__VorlesungAssignment_7_2_1_in_rule__Student__Group_7_2__1__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_0__0__Impl_in_rule__Dozent__Group_0__06538 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Dozent__Group_0__1_in_rule__Dozent__Group_0__06541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Dozent__Group_0__0__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_0__1__Impl_in_rule__Dozent__Group_0__16600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProfessor_in_rule__Dozent__Group_0__1__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_1__0__Impl_in_rule__Dozent__Group_1__06660 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Dozent__Group_1__1_in_rule__Dozent__Group_1__06663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Dozent__Group_1__0__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dozent__Group_1__1__Impl_in_rule__Dozent__Group_1__16722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLehrbeauftrager_in_rule__Dozent__Group_1__1__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__0__Impl_in_rule__Professor__Group__06782 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Professor__Group__1_in_rule__Professor__Group__06785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Professor__Group__0__Impl6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__1__Impl_in_rule__Professor__Group__16844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Professor__Group__2_in_rule__Professor__Group__16847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Professor__Group__1__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__2__Impl_in_rule__Professor__Group__26906 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Professor__Group__3_in_rule__Professor__Group__26909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__PersonalnrAssignment_2_in_rule__Professor__Group__2__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__3__Impl_in_rule__Professor__Group__36966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Professor__Group__4_in_rule__Professor__Group__36969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Professor__Group__3__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__4__Impl_in_rule__Professor__Group__47028 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Professor__Group__5_in_rule__Professor__Group__47031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__VornameAssignment_4_in_rule__Professor__Group__4__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__5__Impl_in_rule__Professor__Group__57088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Professor__Group__6_in_rule__Professor__Group__57091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Professor__Group__5__Impl7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__6__Impl_in_rule__Professor__Group__67150 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Professor__Group__7_in_rule__Professor__Group__67153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__NachnameAssignment_6_in_rule__Professor__Group__6__Impl7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__7__Impl_in_rule__Professor__Group__77210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Professor__Group__8_in_rule__Professor__Group__77213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Professor__Group__7__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__8__Impl_in_rule__Professor__Group__87272 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Professor__Group__9_in_rule__Professor__Group__87275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__VorlesungAssignment_8_in_rule__Professor__Group__8__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group__9__Impl_in_rule__Professor__Group__97332 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Professor__Group__10_in_rule__Professor__Group__97335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group_9__0_in_rule__Professor__Group__9__Impl7362 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Professor__Group__10__Impl_in_rule__Professor__Group__107393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Professor__Group__10__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group_9__0__Impl_in_rule__Professor__Group_9__07474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Professor__Group_9__1_in_rule__Professor__Group_9__07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Professor__Group_9__0__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__Group_9__1__Impl_in_rule__Professor__Group_9__17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Professor__VorlesungAssignment_9_1_in_rule__Professor__Group_9__1__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__0__Impl_in_rule__Lehrbeauftrager__Group__07597 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__1_in_rule__Lehrbeauftrager__Group__07600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Lehrbeauftrager__Group__0__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__1__Impl_in_rule__Lehrbeauftrager__Group__17659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__2_in_rule__Lehrbeauftrager__Group__17662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Lehrbeauftrager__Group__1__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__2__Impl_in_rule__Lehrbeauftrager__Group__27721 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__3_in_rule__Lehrbeauftrager__Group__27724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__PersonalnrAssignment_2_in_rule__Lehrbeauftrager__Group__2__Impl7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__3__Impl_in_rule__Lehrbeauftrager__Group__37781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__4_in_rule__Lehrbeauftrager__Group__37784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Lehrbeauftrager__Group__3__Impl7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__4__Impl_in_rule__Lehrbeauftrager__Group__47843 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__5_in_rule__Lehrbeauftrager__Group__47846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__VornameAssignment_4_in_rule__Lehrbeauftrager__Group__4__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__5__Impl_in_rule__Lehrbeauftrager__Group__57903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__6_in_rule__Lehrbeauftrager__Group__57906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Lehrbeauftrager__Group__5__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__6__Impl_in_rule__Lehrbeauftrager__Group__67965 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__7_in_rule__Lehrbeauftrager__Group__67968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__NachnameAssignment_6_in_rule__Lehrbeauftrager__Group__6__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__7__Impl_in_rule__Lehrbeauftrager__Group__78025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__8_in_rule__Lehrbeauftrager__Group__78028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Lehrbeauftrager__Group__7__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__8__Impl_in_rule__Lehrbeauftrager__Group__88087 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__9_in_rule__Lehrbeauftrager__Group__88090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__VorlesungAssignment_8_in_rule__Lehrbeauftrager__Group__8__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__9__Impl_in_rule__Lehrbeauftrager__Group__98147 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__10_in_rule__Lehrbeauftrager__Group__98150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group_9__0_in_rule__Lehrbeauftrager__Group__9__Impl8177 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group__10__Impl_in_rule__Lehrbeauftrager__Group__108208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Lehrbeauftrager__Group__10__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group_9__0__Impl_in_rule__Lehrbeauftrager__Group_9__08289 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group_9__1_in_rule__Lehrbeauftrager__Group_9__08292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Lehrbeauftrager__Group_9__0__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__Group_9__1__Impl_in_rule__Lehrbeauftrager__Group_9__18351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lehrbeauftrager__VorlesungAssignment_9_1_in_rule__Lehrbeauftrager__Group_9__1__Impl8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__08412 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__08415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Evaluation__Group__0__Impl8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__18474 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__2_in_rule__Evaluation__Group__18477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Evaluation__Group__1__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__2__Impl_in_rule__Evaluation__Group__28536 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__3_in_rule__Evaluation__Group__28539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__GesamtnoteAssignment_2_in_rule__Evaluation__Group__2__Impl8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__3__Impl_in_rule__Evaluation__Group__38596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Evaluation__Group__3__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Hochschule__NameAssignment_38668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudent_in_rule__Hochschule__StudentAssignment_58699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudent_in_rule__Hochschule__StudentAssignment_6_18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFachbereich_in_rule__Hochschule__FachbereichAssignment_88761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFachbereich_in_rule__Hochschule__FachbereichAssignment_9_18792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fachbereich__NameAssignment_28823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fachbereich__AliasAssignment_48854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudiengang_in_rule__Fachbereich__StudiengangAssignment_68885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStudiengang_in_rule__Fachbereich__StudiengangAssignment_7_18916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDozent_in_rule__Fachbereich__DozentAssignment_98947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDozent_in_rule__Fachbereich__DozentAssignment_10_18978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fachbereich__VorlesungAssignment_11_19013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fachbereich__VorlesungAssignment_11_2_19052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Studiengang__NameAssignment_29087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Studiengang__NcAssignment_49118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Studiengang__StudentAssignment_69153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Studiengang__StudentAssignment_7_19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorlesung_in_rule__Studiengang__VorlesungAssignment_99227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorlesung_in_rule__Studiengang__VorlesungAssignment_10_19258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Vorlesung__NameAssignment_29289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Vorlesung__ModulnrAssignment_49320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Vorlesung__BeschreibungAssignment_69351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Vorlesung__CrpAssignment_89382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorlesung__DozentAssignment_109417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorlesung__StudentAssignment_129456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorlesung__StudentAssignment_13_19495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorlesung__TutorAssignment_159534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorlesung__TutorAssignment_16_19573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Vorlesung__EvaluationAssignment_189608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Vorlesung__EvaluationAssignment_19_19639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Student__MatrikelnrAssignment_29670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Student__VornameAssignment_49701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Student__NachnameAssignment_69732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Student__VorlesungAssignment_7_19767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Student__VorlesungAssignment_7_2_19806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Professor__PersonalnrAssignment_29841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Professor__VornameAssignment_49872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Professor__NachnameAssignment_69903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Professor__VorlesungAssignment_89938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Professor__VorlesungAssignment_9_19977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__PersonalnrAssignment_210012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__VornameAssignment_410043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Lehrbeauftrager__NachnameAssignment_610074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Lehrbeauftrager__VorlesungAssignment_810109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Lehrbeauftrager__VorlesungAssignment_9_110148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Evaluation__GesamtnoteAssignment_210183 = new BitSet(new long[]{0x0000000000000002L});

}