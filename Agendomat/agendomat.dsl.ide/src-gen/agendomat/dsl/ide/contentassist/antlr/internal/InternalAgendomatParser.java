package agendomat.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import agendomat.dsl.services.AgendomatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgendomatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Presenter'", "'TechSupport'", "'Animator'", "'Room'", "'BreakArea'", "'Model'", "'{'", "'}'", "'events'", "','", "'Event'", "'eventName'", "'eventStartDate'", "'eventEndDate'", "'desc'", "'persons'", "'programItems'", "'locations'", "'Person'", "'personName'", "'roles'", "'Location'", "'locationName'", "'locationType'", "'Session'", "'sessionName'", "'startTime'", "'endTime'", "'location'", "'techSupport'", "'('", "')'", "'talks'", "'equipment'", "'Break'", "'breakName'", "'animators'", "'Talk'", "'talkName'", "'talkStartTime'", "'talkEndTime'", "'presenters'", "'Equipment'", "'equipmentName'", "'equipmentType'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAgendomatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAgendomatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAgendomatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAgendomat.g"; }


    	private AgendomatGrammarAccess grammarAccess;

    	public void setGrammarAccess(AgendomatGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalAgendomat.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAgendomat.g:54:1: ( ruleModel EOF )
            // InternalAgendomat.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAgendomat.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAgendomat.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAgendomat.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAgendomat.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAgendomat.g:69:3: ( rule__Model__Group__0 )
            // InternalAgendomat.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgramItem"
    // InternalAgendomat.g:78:1: entryRuleProgramItem : ruleProgramItem EOF ;
    public final void entryRuleProgramItem() throws RecognitionException {
        try {
            // InternalAgendomat.g:79:1: ( ruleProgramItem EOF )
            // InternalAgendomat.g:80:1: ruleProgramItem EOF
            {
             before(grammarAccess.getProgramItemRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramItem();

            state._fsp--;

             after(grammarAccess.getProgramItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgramItem"


    // $ANTLR start "ruleProgramItem"
    // InternalAgendomat.g:87:1: ruleProgramItem : ( ( rule__ProgramItem__Alternatives ) ) ;
    public final void ruleProgramItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:91:2: ( ( ( rule__ProgramItem__Alternatives ) ) )
            // InternalAgendomat.g:92:2: ( ( rule__ProgramItem__Alternatives ) )
            {
            // InternalAgendomat.g:92:2: ( ( rule__ProgramItem__Alternatives ) )
            // InternalAgendomat.g:93:3: ( rule__ProgramItem__Alternatives )
            {
             before(grammarAccess.getProgramItemAccess().getAlternatives()); 
            // InternalAgendomat.g:94:3: ( rule__ProgramItem__Alternatives )
            // InternalAgendomat.g:94:4: rule__ProgramItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProgramItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramItem"


    // $ANTLR start "entryRuleEvent"
    // InternalAgendomat.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalAgendomat.g:104:1: ( ruleEvent EOF )
            // InternalAgendomat.g:105:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAgendomat.g:112:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:116:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalAgendomat.g:117:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalAgendomat.g:117:2: ( ( rule__Event__Group__0 ) )
            // InternalAgendomat.g:118:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalAgendomat.g:119:3: ( rule__Event__Group__0 )
            // InternalAgendomat.g:119:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalAgendomat.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAgendomat.g:129:1: ( ruleEString EOF )
            // InternalAgendomat.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAgendomat.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAgendomat.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAgendomat.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalAgendomat.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAgendomat.g:144:3: ( rule__EString__Alternatives )
            // InternalAgendomat.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePerson"
    // InternalAgendomat.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalAgendomat.g:154:1: ( rulePerson EOF )
            // InternalAgendomat.g:155:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalAgendomat.g:162:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:166:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalAgendomat.g:167:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalAgendomat.g:167:2: ( ( rule__Person__Group__0 ) )
            // InternalAgendomat.g:168:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalAgendomat.g:169:3: ( rule__Person__Group__0 )
            // InternalAgendomat.g:169:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleLocation"
    // InternalAgendomat.g:178:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalAgendomat.g:179:1: ( ruleLocation EOF )
            // InternalAgendomat.g:180:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalAgendomat.g:187:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:191:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalAgendomat.g:192:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalAgendomat.g:192:2: ( ( rule__Location__Group__0 ) )
            // InternalAgendomat.g:193:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalAgendomat.g:194:3: ( rule__Location__Group__0 )
            // InternalAgendomat.g:194:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleSession"
    // InternalAgendomat.g:203:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalAgendomat.g:204:1: ( ruleSession EOF )
            // InternalAgendomat.g:205:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalAgendomat.g:212:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:216:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalAgendomat.g:217:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalAgendomat.g:217:2: ( ( rule__Session__Group__0 ) )
            // InternalAgendomat.g:218:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalAgendomat.g:219:3: ( rule__Session__Group__0 )
            // InternalAgendomat.g:219:4: rule__Session__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleBreak"
    // InternalAgendomat.g:228:1: entryRuleBreak : ruleBreak EOF ;
    public final void entryRuleBreak() throws RecognitionException {
        try {
            // InternalAgendomat.g:229:1: ( ruleBreak EOF )
            // InternalAgendomat.g:230:1: ruleBreak EOF
            {
             before(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_1);
            ruleBreak();

            state._fsp--;

             after(grammarAccess.getBreakRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalAgendomat.g:237:1: ruleBreak : ( ( rule__Break__Group__0 ) ) ;
    public final void ruleBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:241:2: ( ( ( rule__Break__Group__0 ) ) )
            // InternalAgendomat.g:242:2: ( ( rule__Break__Group__0 ) )
            {
            // InternalAgendomat.g:242:2: ( ( rule__Break__Group__0 ) )
            // InternalAgendomat.g:243:3: ( rule__Break__Group__0 )
            {
             before(grammarAccess.getBreakAccess().getGroup()); 
            // InternalAgendomat.g:244:3: ( rule__Break__Group__0 )
            // InternalAgendomat.g:244:4: rule__Break__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleTalk"
    // InternalAgendomat.g:253:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // InternalAgendomat.g:254:1: ( ruleTalk EOF )
            // InternalAgendomat.g:255:1: ruleTalk EOF
            {
             before(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_1);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // InternalAgendomat.g:262:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:266:2: ( ( ( rule__Talk__Group__0 ) ) )
            // InternalAgendomat.g:267:2: ( ( rule__Talk__Group__0 ) )
            {
            // InternalAgendomat.g:267:2: ( ( rule__Talk__Group__0 ) )
            // InternalAgendomat.g:268:3: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // InternalAgendomat.g:269:3: ( rule__Talk__Group__0 )
            // InternalAgendomat.g:269:4: rule__Talk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRuleEquipment"
    // InternalAgendomat.g:278:1: entryRuleEquipment : ruleEquipment EOF ;
    public final void entryRuleEquipment() throws RecognitionException {
        try {
            // InternalAgendomat.g:279:1: ( ruleEquipment EOF )
            // InternalAgendomat.g:280:1: ruleEquipment EOF
            {
             before(grammarAccess.getEquipmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEquipment();

            state._fsp--;

             after(grammarAccess.getEquipmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquipment"


    // $ANTLR start "ruleEquipment"
    // InternalAgendomat.g:287:1: ruleEquipment : ( ( rule__Equipment__Group__0 ) ) ;
    public final void ruleEquipment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:291:2: ( ( ( rule__Equipment__Group__0 ) ) )
            // InternalAgendomat.g:292:2: ( ( rule__Equipment__Group__0 ) )
            {
            // InternalAgendomat.g:292:2: ( ( rule__Equipment__Group__0 ) )
            // InternalAgendomat.g:293:3: ( rule__Equipment__Group__0 )
            {
             before(grammarAccess.getEquipmentAccess().getGroup()); 
            // InternalAgendomat.g:294:3: ( rule__Equipment__Group__0 )
            // InternalAgendomat.g:294:4: rule__Equipment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquipmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquipment"


    // $ANTLR start "ruleRole"
    // InternalAgendomat.g:303:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:307:1: ( ( ( rule__Role__Alternatives ) ) )
            // InternalAgendomat.g:308:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalAgendomat.g:308:2: ( ( rule__Role__Alternatives ) )
            // InternalAgendomat.g:309:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalAgendomat.g:310:3: ( rule__Role__Alternatives )
            // InternalAgendomat.g:310:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "ruleLocationType"
    // InternalAgendomat.g:319:1: ruleLocationType : ( ( rule__LocationType__Alternatives ) ) ;
    public final void ruleLocationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:323:1: ( ( ( rule__LocationType__Alternatives ) ) )
            // InternalAgendomat.g:324:2: ( ( rule__LocationType__Alternatives ) )
            {
            // InternalAgendomat.g:324:2: ( ( rule__LocationType__Alternatives ) )
            // InternalAgendomat.g:325:3: ( rule__LocationType__Alternatives )
            {
             before(grammarAccess.getLocationTypeAccess().getAlternatives()); 
            // InternalAgendomat.g:326:3: ( rule__LocationType__Alternatives )
            // InternalAgendomat.g:326:4: rule__LocationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LocationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocationType"


    // $ANTLR start "rule__ProgramItem__Alternatives"
    // InternalAgendomat.g:334:1: rule__ProgramItem__Alternatives : ( ( ruleSession ) | ( ruleBreak ) );
    public final void rule__ProgramItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:338:1: ( ( ruleSession ) | ( ruleBreak ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAgendomat.g:339:2: ( ruleSession )
                    {
                    // InternalAgendomat.g:339:2: ( ruleSession )
                    // InternalAgendomat.g:340:3: ruleSession
                    {
                     before(grammarAccess.getProgramItemAccess().getSessionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSession();

                    state._fsp--;

                     after(grammarAccess.getProgramItemAccess().getSessionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:345:2: ( ruleBreak )
                    {
                    // InternalAgendomat.g:345:2: ( ruleBreak )
                    // InternalAgendomat.g:346:3: ruleBreak
                    {
                     before(grammarAccess.getProgramItemAccess().getBreakParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBreak();

                    state._fsp--;

                     after(grammarAccess.getProgramItemAccess().getBreakParserRuleCall_1()); 

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
    // $ANTLR end "rule__ProgramItem__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAgendomat.g:355:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:359:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAgendomat.g:360:2: ( RULE_STRING )
                    {
                    // InternalAgendomat.g:360:2: ( RULE_STRING )
                    // InternalAgendomat.g:361:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:366:2: ( RULE_ID )
                    {
                    // InternalAgendomat.g:366:2: ( RULE_ID )
                    // InternalAgendomat.g:367:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalAgendomat.g:376:1: rule__Role__Alternatives : ( ( ( 'Presenter' ) ) | ( ( 'TechSupport' ) ) | ( ( 'Animator' ) ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:380:1: ( ( ( 'Presenter' ) ) | ( ( 'TechSupport' ) ) | ( ( 'Animator' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAgendomat.g:381:2: ( ( 'Presenter' ) )
                    {
                    // InternalAgendomat.g:381:2: ( ( 'Presenter' ) )
                    // InternalAgendomat.g:382:3: ( 'Presenter' )
                    {
                     before(grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0()); 
                    // InternalAgendomat.g:383:3: ( 'Presenter' )
                    // InternalAgendomat.g:383:4: 'Presenter'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:387:2: ( ( 'TechSupport' ) )
                    {
                    // InternalAgendomat.g:387:2: ( ( 'TechSupport' ) )
                    // InternalAgendomat.g:388:3: ( 'TechSupport' )
                    {
                     before(grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1()); 
                    // InternalAgendomat.g:389:3: ( 'TechSupport' )
                    // InternalAgendomat.g:389:4: 'TechSupport'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAgendomat.g:393:2: ( ( 'Animator' ) )
                    {
                    // InternalAgendomat.g:393:2: ( ( 'Animator' ) )
                    // InternalAgendomat.g:394:3: ( 'Animator' )
                    {
                     before(grammarAccess.getRoleAccess().getAnimatorEnumLiteralDeclaration_2()); 
                    // InternalAgendomat.g:395:3: ( 'Animator' )
                    // InternalAgendomat.g:395:4: 'Animator'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleAccess().getAnimatorEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__LocationType__Alternatives"
    // InternalAgendomat.g:403:1: rule__LocationType__Alternatives : ( ( ( 'Room' ) ) | ( ( 'BreakArea' ) ) );
    public final void rule__LocationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:407:1: ( ( ( 'Room' ) ) | ( ( 'BreakArea' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgendomat.g:408:2: ( ( 'Room' ) )
                    {
                    // InternalAgendomat.g:408:2: ( ( 'Room' ) )
                    // InternalAgendomat.g:409:3: ( 'Room' )
                    {
                     before(grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0()); 
                    // InternalAgendomat.g:410:3: ( 'Room' )
                    // InternalAgendomat.g:410:4: 'Room'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:414:2: ( ( 'BreakArea' ) )
                    {
                    // InternalAgendomat.g:414:2: ( ( 'BreakArea' ) )
                    // InternalAgendomat.g:415:3: ( 'BreakArea' )
                    {
                     before(grammarAccess.getLocationTypeAccess().getBreakAreaEnumLiteralDeclaration_1()); 
                    // InternalAgendomat.g:416:3: ( 'BreakArea' )
                    // InternalAgendomat.g:416:4: 'BreakArea'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocationTypeAccess().getBreakAreaEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LocationType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAgendomat.g:424:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:428:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAgendomat.g:429:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAgendomat.g:436:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:440:1: ( ( () ) )
            // InternalAgendomat.g:441:1: ( () )
            {
            // InternalAgendomat.g:441:1: ( () )
            // InternalAgendomat.g:442:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalAgendomat.g:443:2: ()
            // InternalAgendomat.g:443:3: 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAgendomat.g:451:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:455:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAgendomat.g:456:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAgendomat.g:463:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:467:1: ( ( 'Model' ) )
            // InternalAgendomat.g:468:1: ( 'Model' )
            {
            // InternalAgendomat.g:468:1: ( 'Model' )
            // InternalAgendomat.g:469:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAgendomat.g:478:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:482:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAgendomat.g:483:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAgendomat.g:490:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:494:1: ( ( '{' ) )
            // InternalAgendomat.g:495:1: ( '{' )
            {
            // InternalAgendomat.g:495:1: ( '{' )
            // InternalAgendomat.g:496:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAgendomat.g:505:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:509:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAgendomat.g:510:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAgendomat.g:517:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:521:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // InternalAgendomat.g:522:1: ( ( rule__Model__Group_3__0 )? )
            {
            // InternalAgendomat.g:522:1: ( ( rule__Model__Group_3__0 )? )
            // InternalAgendomat.g:523:2: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalAgendomat.g:524:2: ( rule__Model__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAgendomat.g:524:3: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalAgendomat.g:532:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:536:1: ( rule__Model__Group__4__Impl )
            // InternalAgendomat.g:537:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalAgendomat.g:543:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:547:1: ( ( '}' ) )
            // InternalAgendomat.g:548:1: ( '}' )
            {
            // InternalAgendomat.g:548:1: ( '}' )
            // InternalAgendomat.g:549:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // InternalAgendomat.g:559:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:563:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalAgendomat.g:564:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1();

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
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // InternalAgendomat.g:571:1: rule__Model__Group_3__0__Impl : ( 'events' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:575:1: ( ( 'events' ) )
            // InternalAgendomat.g:576:1: ( 'events' )
            {
            // InternalAgendomat.g:576:1: ( 'events' )
            // InternalAgendomat.g:577:2: 'events'
            {
             before(grammarAccess.getModelAccess().getEventsKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEventsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // InternalAgendomat.g:586:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:590:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalAgendomat.g:591:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__2();

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
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // InternalAgendomat.g:598:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:602:1: ( ( '{' ) )
            // InternalAgendomat.g:603:1: ( '{' )
            {
            // InternalAgendomat.g:603:1: ( '{' )
            // InternalAgendomat.g:604:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // InternalAgendomat.g:613:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:617:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalAgendomat.g:618:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__3();

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
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // InternalAgendomat.g:625:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__EventsAssignment_3_2 ) ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:629:1: ( ( ( rule__Model__EventsAssignment_3_2 ) ) )
            // InternalAgendomat.g:630:1: ( ( rule__Model__EventsAssignment_3_2 ) )
            {
            // InternalAgendomat.g:630:1: ( ( rule__Model__EventsAssignment_3_2 ) )
            // InternalAgendomat.g:631:2: ( rule__Model__EventsAssignment_3_2 )
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 
            // InternalAgendomat.g:632:2: ( rule__Model__EventsAssignment_3_2 )
            // InternalAgendomat.g:632:3: rule__Model__EventsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__EventsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEventsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3__3"
    // InternalAgendomat.g:640:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl rule__Model__Group_3__4 ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:644:1: ( rule__Model__Group_3__3__Impl rule__Model__Group_3__4 )
            // InternalAgendomat.g:645:2: rule__Model__Group_3__3__Impl rule__Model__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__4();

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
    // $ANTLR end "rule__Model__Group_3__3"


    // $ANTLR start "rule__Model__Group_3__3__Impl"
    // InternalAgendomat.g:652:1: rule__Model__Group_3__3__Impl : ( ( rule__Model__Group_3_3__0 )* ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:656:1: ( ( ( rule__Model__Group_3_3__0 )* ) )
            // InternalAgendomat.g:657:1: ( ( rule__Model__Group_3_3__0 )* )
            {
            // InternalAgendomat.g:657:1: ( ( rule__Model__Group_3_3__0 )* )
            // InternalAgendomat.g:658:2: ( rule__Model__Group_3_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_3()); 
            // InternalAgendomat.g:659:2: ( rule__Model__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAgendomat.g:659:3: rule__Model__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3__Impl"


    // $ANTLR start "rule__Model__Group_3__4"
    // InternalAgendomat.g:667:1: rule__Model__Group_3__4 : rule__Model__Group_3__4__Impl ;
    public final void rule__Model__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:671:1: ( rule__Model__Group_3__4__Impl )
            // InternalAgendomat.g:672:2: rule__Model__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3__4__Impl();

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
    // $ANTLR end "rule__Model__Group_3__4"


    // $ANTLR start "rule__Model__Group_3__4__Impl"
    // InternalAgendomat.g:678:1: rule__Model__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:682:1: ( ( '}' ) )
            // InternalAgendomat.g:683:1: ( '}' )
            {
            // InternalAgendomat.g:683:1: ( '}' )
            // InternalAgendomat.g:684:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__4__Impl"


    // $ANTLR start "rule__Model__Group_3_3__0"
    // InternalAgendomat.g:694:1: rule__Model__Group_3_3__0 : rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 ;
    public final void rule__Model__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:698:1: ( rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 )
            // InternalAgendomat.g:699:2: rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_3__1();

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
    // $ANTLR end "rule__Model__Group_3_3__0"


    // $ANTLR start "rule__Model__Group_3_3__0__Impl"
    // InternalAgendomat.g:706:1: rule__Model__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:710:1: ( ( ',' ) )
            // InternalAgendomat.g:711:1: ( ',' )
            {
            // InternalAgendomat.g:711:1: ( ',' )
            // InternalAgendomat.g:712:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3_3__1"
    // InternalAgendomat.g:721:1: rule__Model__Group_3_3__1 : rule__Model__Group_3_3__1__Impl ;
    public final void rule__Model__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:725:1: ( rule__Model__Group_3_3__1__Impl )
            // InternalAgendomat.g:726:2: rule__Model__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Model__Group_3_3__1"


    // $ANTLR start "rule__Model__Group_3_3__1__Impl"
    // InternalAgendomat.g:732:1: rule__Model__Group_3_3__1__Impl : ( ( rule__Model__EventsAssignment_3_3_1 ) ) ;
    public final void rule__Model__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:736:1: ( ( ( rule__Model__EventsAssignment_3_3_1 ) ) )
            // InternalAgendomat.g:737:1: ( ( rule__Model__EventsAssignment_3_3_1 ) )
            {
            // InternalAgendomat.g:737:1: ( ( rule__Model__EventsAssignment_3_3_1 ) )
            // InternalAgendomat.g:738:2: ( rule__Model__EventsAssignment_3_3_1 )
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3_3_1()); 
            // InternalAgendomat.g:739:2: ( rule__Model__EventsAssignment_3_3_1 )
            // InternalAgendomat.g:739:3: rule__Model__EventsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__EventsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEventsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalAgendomat.g:748:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:752:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAgendomat.g:753:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalAgendomat.g:760:1: rule__Event__Group__0__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:764:1: ( ( 'Event' ) )
            // InternalAgendomat.g:765:1: ( 'Event' )
            {
            // InternalAgendomat.g:765:1: ( 'Event' )
            // InternalAgendomat.g:766:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalAgendomat.g:775:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:779:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAgendomat.g:780:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalAgendomat.g:787:1: rule__Event__Group__1__Impl : ( '{' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:791:1: ( ( '{' ) )
            // InternalAgendomat.g:792:1: ( '{' )
            {
            // InternalAgendomat.g:792:1: ( '{' )
            // InternalAgendomat.g:793:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalAgendomat.g:802:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:806:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAgendomat.g:807:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalAgendomat.g:814:1: rule__Event__Group__2__Impl : ( 'eventName' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:818:1: ( ( 'eventName' ) )
            // InternalAgendomat.g:819:1: ( 'eventName' )
            {
            // InternalAgendomat.g:819:1: ( 'eventName' )
            // InternalAgendomat.g:820:2: 'eventName'
            {
             before(grammarAccess.getEventAccess().getEventNameKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalAgendomat.g:829:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:833:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalAgendomat.g:834:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

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
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalAgendomat.g:841:1: rule__Event__Group__3__Impl : ( ( rule__Event__EventNameAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:845:1: ( ( ( rule__Event__EventNameAssignment_3 ) ) )
            // InternalAgendomat.g:846:1: ( ( rule__Event__EventNameAssignment_3 ) )
            {
            // InternalAgendomat.g:846:1: ( ( rule__Event__EventNameAssignment_3 ) )
            // InternalAgendomat.g:847:2: ( rule__Event__EventNameAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_3()); 
            // InternalAgendomat.g:848:2: ( rule__Event__EventNameAssignment_3 )
            // InternalAgendomat.g:848:3: rule__Event__EventNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalAgendomat.g:856:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:860:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalAgendomat.g:861:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

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
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalAgendomat.g:868:1: rule__Event__Group__4__Impl : ( 'eventStartDate' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:872:1: ( ( 'eventStartDate' ) )
            // InternalAgendomat.g:873:1: ( 'eventStartDate' )
            {
            // InternalAgendomat.g:873:1: ( 'eventStartDate' )
            // InternalAgendomat.g:874:2: 'eventStartDate'
            {
             before(grammarAccess.getEventAccess().getEventStartDateKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventStartDateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalAgendomat.g:883:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:887:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalAgendomat.g:888:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__6();

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
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalAgendomat.g:895:1: rule__Event__Group__5__Impl : ( ( rule__Event__EventStartDateAssignment_5 ) ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:899:1: ( ( ( rule__Event__EventStartDateAssignment_5 ) ) )
            // InternalAgendomat.g:900:1: ( ( rule__Event__EventStartDateAssignment_5 ) )
            {
            // InternalAgendomat.g:900:1: ( ( rule__Event__EventStartDateAssignment_5 ) )
            // InternalAgendomat.g:901:2: ( rule__Event__EventStartDateAssignment_5 )
            {
             before(grammarAccess.getEventAccess().getEventStartDateAssignment_5()); 
            // InternalAgendomat.g:902:2: ( rule__Event__EventStartDateAssignment_5 )
            // InternalAgendomat.g:902:3: rule__Event__EventStartDateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventStartDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventStartDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // InternalAgendomat.g:910:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:914:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // InternalAgendomat.g:915:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__7();

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
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // InternalAgendomat.g:922:1: rule__Event__Group__6__Impl : ( 'eventEndDate' ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:926:1: ( ( 'eventEndDate' ) )
            // InternalAgendomat.g:927:1: ( 'eventEndDate' )
            {
            // InternalAgendomat.g:927:1: ( 'eventEndDate' )
            // InternalAgendomat.g:928:2: 'eventEndDate'
            {
             before(grammarAccess.getEventAccess().getEventEndDateKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventEndDateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // InternalAgendomat.g:937:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:941:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // InternalAgendomat.g:942:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__8();

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
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // InternalAgendomat.g:949:1: rule__Event__Group__7__Impl : ( ( rule__Event__EventEndDateAssignment_7 ) ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:953:1: ( ( ( rule__Event__EventEndDateAssignment_7 ) ) )
            // InternalAgendomat.g:954:1: ( ( rule__Event__EventEndDateAssignment_7 ) )
            {
            // InternalAgendomat.g:954:1: ( ( rule__Event__EventEndDateAssignment_7 ) )
            // InternalAgendomat.g:955:2: ( rule__Event__EventEndDateAssignment_7 )
            {
             before(grammarAccess.getEventAccess().getEventEndDateAssignment_7()); 
            // InternalAgendomat.g:956:2: ( rule__Event__EventEndDateAssignment_7 )
            // InternalAgendomat.g:956:3: rule__Event__EventEndDateAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventEndDateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventEndDateAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group__8"
    // InternalAgendomat.g:964:1: rule__Event__Group__8 : rule__Event__Group__8__Impl rule__Event__Group__9 ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:968:1: ( rule__Event__Group__8__Impl rule__Event__Group__9 )
            // InternalAgendomat.g:969:2: rule__Event__Group__8__Impl rule__Event__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__9();

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
    // $ANTLR end "rule__Event__Group__8"


    // $ANTLR start "rule__Event__Group__8__Impl"
    // InternalAgendomat.g:976:1: rule__Event__Group__8__Impl : ( ( rule__Event__Group_8__0 )? ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:980:1: ( ( ( rule__Event__Group_8__0 )? ) )
            // InternalAgendomat.g:981:1: ( ( rule__Event__Group_8__0 )? )
            {
            // InternalAgendomat.g:981:1: ( ( rule__Event__Group_8__0 )? )
            // InternalAgendomat.g:982:2: ( rule__Event__Group_8__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_8()); 
            // InternalAgendomat.g:983:2: ( rule__Event__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAgendomat.g:983:3: rule__Event__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__8__Impl"


    // $ANTLR start "rule__Event__Group__9"
    // InternalAgendomat.g:991:1: rule__Event__Group__9 : rule__Event__Group__9__Impl rule__Event__Group__10 ;
    public final void rule__Event__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:995:1: ( rule__Event__Group__9__Impl rule__Event__Group__10 )
            // InternalAgendomat.g:996:2: rule__Event__Group__9__Impl rule__Event__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__10();

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
    // $ANTLR end "rule__Event__Group__9"


    // $ANTLR start "rule__Event__Group__9__Impl"
    // InternalAgendomat.g:1003:1: rule__Event__Group__9__Impl : ( ( rule__Event__Group_9__0 )? ) ;
    public final void rule__Event__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1007:1: ( ( ( rule__Event__Group_9__0 )? ) )
            // InternalAgendomat.g:1008:1: ( ( rule__Event__Group_9__0 )? )
            {
            // InternalAgendomat.g:1008:1: ( ( rule__Event__Group_9__0 )? )
            // InternalAgendomat.g:1009:2: ( rule__Event__Group_9__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_9()); 
            // InternalAgendomat.g:1010:2: ( rule__Event__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAgendomat.g:1010:3: rule__Event__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__9__Impl"


    // $ANTLR start "rule__Event__Group__10"
    // InternalAgendomat.g:1018:1: rule__Event__Group__10 : rule__Event__Group__10__Impl rule__Event__Group__11 ;
    public final void rule__Event__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1022:1: ( rule__Event__Group__10__Impl rule__Event__Group__11 )
            // InternalAgendomat.g:1023:2: rule__Event__Group__10__Impl rule__Event__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__11();

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
    // $ANTLR end "rule__Event__Group__10"


    // $ANTLR start "rule__Event__Group__10__Impl"
    // InternalAgendomat.g:1030:1: rule__Event__Group__10__Impl : ( ( rule__Event__Group_10__0 )? ) ;
    public final void rule__Event__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1034:1: ( ( ( rule__Event__Group_10__0 )? ) )
            // InternalAgendomat.g:1035:1: ( ( rule__Event__Group_10__0 )? )
            {
            // InternalAgendomat.g:1035:1: ( ( rule__Event__Group_10__0 )? )
            // InternalAgendomat.g:1036:2: ( rule__Event__Group_10__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_10()); 
            // InternalAgendomat.g:1037:2: ( rule__Event__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAgendomat.g:1037:3: rule__Event__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__10__Impl"


    // $ANTLR start "rule__Event__Group__11"
    // InternalAgendomat.g:1045:1: rule__Event__Group__11 : rule__Event__Group__11__Impl rule__Event__Group__12 ;
    public final void rule__Event__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1049:1: ( rule__Event__Group__11__Impl rule__Event__Group__12 )
            // InternalAgendomat.g:1050:2: rule__Event__Group__11__Impl rule__Event__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__12();

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
    // $ANTLR end "rule__Event__Group__11"


    // $ANTLR start "rule__Event__Group__11__Impl"
    // InternalAgendomat.g:1057:1: rule__Event__Group__11__Impl : ( ( rule__Event__Group_11__0 )? ) ;
    public final void rule__Event__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1061:1: ( ( ( rule__Event__Group_11__0 )? ) )
            // InternalAgendomat.g:1062:1: ( ( rule__Event__Group_11__0 )? )
            {
            // InternalAgendomat.g:1062:1: ( ( rule__Event__Group_11__0 )? )
            // InternalAgendomat.g:1063:2: ( rule__Event__Group_11__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_11()); 
            // InternalAgendomat.g:1064:2: ( rule__Event__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAgendomat.g:1064:3: rule__Event__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__11__Impl"


    // $ANTLR start "rule__Event__Group__12"
    // InternalAgendomat.g:1072:1: rule__Event__Group__12 : rule__Event__Group__12__Impl ;
    public final void rule__Event__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1076:1: ( rule__Event__Group__12__Impl )
            // InternalAgendomat.g:1077:2: rule__Event__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__12__Impl();

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
    // $ANTLR end "rule__Event__Group__12"


    // $ANTLR start "rule__Event__Group__12__Impl"
    // InternalAgendomat.g:1083:1: rule__Event__Group__12__Impl : ( '}' ) ;
    public final void rule__Event__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1087:1: ( ( '}' ) )
            // InternalAgendomat.g:1088:1: ( '}' )
            {
            // InternalAgendomat.g:1088:1: ( '}' )
            // InternalAgendomat.g:1089:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__12__Impl"


    // $ANTLR start "rule__Event__Group_8__0"
    // InternalAgendomat.g:1099:1: rule__Event__Group_8__0 : rule__Event__Group_8__0__Impl rule__Event__Group_8__1 ;
    public final void rule__Event__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1103:1: ( rule__Event__Group_8__0__Impl rule__Event__Group_8__1 )
            // InternalAgendomat.g:1104:2: rule__Event__Group_8__0__Impl rule__Event__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_8__1();

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
    // $ANTLR end "rule__Event__Group_8__0"


    // $ANTLR start "rule__Event__Group_8__0__Impl"
    // InternalAgendomat.g:1111:1: rule__Event__Group_8__0__Impl : ( 'desc' ) ;
    public final void rule__Event__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1115:1: ( ( 'desc' ) )
            // InternalAgendomat.g:1116:1: ( 'desc' )
            {
            // InternalAgendomat.g:1116:1: ( 'desc' )
            // InternalAgendomat.g:1117:2: 'desc'
            {
             before(grammarAccess.getEventAccess().getDescKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getDescKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__0__Impl"


    // $ANTLR start "rule__Event__Group_8__1"
    // InternalAgendomat.g:1126:1: rule__Event__Group_8__1 : rule__Event__Group_8__1__Impl ;
    public final void rule__Event__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1130:1: ( rule__Event__Group_8__1__Impl )
            // InternalAgendomat.g:1131:2: rule__Event__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_8__1__Impl();

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
    // $ANTLR end "rule__Event__Group_8__1"


    // $ANTLR start "rule__Event__Group_8__1__Impl"
    // InternalAgendomat.g:1137:1: rule__Event__Group_8__1__Impl : ( ( rule__Event__DescAssignment_8_1 ) ) ;
    public final void rule__Event__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1141:1: ( ( ( rule__Event__DescAssignment_8_1 ) ) )
            // InternalAgendomat.g:1142:1: ( ( rule__Event__DescAssignment_8_1 ) )
            {
            // InternalAgendomat.g:1142:1: ( ( rule__Event__DescAssignment_8_1 ) )
            // InternalAgendomat.g:1143:2: ( rule__Event__DescAssignment_8_1 )
            {
             before(grammarAccess.getEventAccess().getDescAssignment_8_1()); 
            // InternalAgendomat.g:1144:2: ( rule__Event__DescAssignment_8_1 )
            // InternalAgendomat.g:1144:3: rule__Event__DescAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__DescAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getDescAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__1__Impl"


    // $ANTLR start "rule__Event__Group_9__0"
    // InternalAgendomat.g:1153:1: rule__Event__Group_9__0 : rule__Event__Group_9__0__Impl rule__Event__Group_9__1 ;
    public final void rule__Event__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1157:1: ( rule__Event__Group_9__0__Impl rule__Event__Group_9__1 )
            // InternalAgendomat.g:1158:2: rule__Event__Group_9__0__Impl rule__Event__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__1();

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
    // $ANTLR end "rule__Event__Group_9__0"


    // $ANTLR start "rule__Event__Group_9__0__Impl"
    // InternalAgendomat.g:1165:1: rule__Event__Group_9__0__Impl : ( 'persons' ) ;
    public final void rule__Event__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1169:1: ( ( 'persons' ) )
            // InternalAgendomat.g:1170:1: ( 'persons' )
            {
            // InternalAgendomat.g:1170:1: ( 'persons' )
            // InternalAgendomat.g:1171:2: 'persons'
            {
             before(grammarAccess.getEventAccess().getPersonsKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getPersonsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__0__Impl"


    // $ANTLR start "rule__Event__Group_9__1"
    // InternalAgendomat.g:1180:1: rule__Event__Group_9__1 : rule__Event__Group_9__1__Impl rule__Event__Group_9__2 ;
    public final void rule__Event__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1184:1: ( rule__Event__Group_9__1__Impl rule__Event__Group_9__2 )
            // InternalAgendomat.g:1185:2: rule__Event__Group_9__1__Impl rule__Event__Group_9__2
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__2();

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
    // $ANTLR end "rule__Event__Group_9__1"


    // $ANTLR start "rule__Event__Group_9__1__Impl"
    // InternalAgendomat.g:1192:1: rule__Event__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Event__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1196:1: ( ( '{' ) )
            // InternalAgendomat.g:1197:1: ( '{' )
            {
            // InternalAgendomat.g:1197:1: ( '{' )
            // InternalAgendomat.g:1198:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__1__Impl"


    // $ANTLR start "rule__Event__Group_9__2"
    // InternalAgendomat.g:1207:1: rule__Event__Group_9__2 : rule__Event__Group_9__2__Impl rule__Event__Group_9__3 ;
    public final void rule__Event__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1211:1: ( rule__Event__Group_9__2__Impl rule__Event__Group_9__3 )
            // InternalAgendomat.g:1212:2: rule__Event__Group_9__2__Impl rule__Event__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__3();

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
    // $ANTLR end "rule__Event__Group_9__2"


    // $ANTLR start "rule__Event__Group_9__2__Impl"
    // InternalAgendomat.g:1219:1: rule__Event__Group_9__2__Impl : ( ( rule__Event__PersonsAssignment_9_2 ) ) ;
    public final void rule__Event__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1223:1: ( ( ( rule__Event__PersonsAssignment_9_2 ) ) )
            // InternalAgendomat.g:1224:1: ( ( rule__Event__PersonsAssignment_9_2 ) )
            {
            // InternalAgendomat.g:1224:1: ( ( rule__Event__PersonsAssignment_9_2 ) )
            // InternalAgendomat.g:1225:2: ( rule__Event__PersonsAssignment_9_2 )
            {
             before(grammarAccess.getEventAccess().getPersonsAssignment_9_2()); 
            // InternalAgendomat.g:1226:2: ( rule__Event__PersonsAssignment_9_2 )
            // InternalAgendomat.g:1226:3: rule__Event__PersonsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__PersonsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getPersonsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__2__Impl"


    // $ANTLR start "rule__Event__Group_9__3"
    // InternalAgendomat.g:1234:1: rule__Event__Group_9__3 : rule__Event__Group_9__3__Impl rule__Event__Group_9__4 ;
    public final void rule__Event__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1238:1: ( rule__Event__Group_9__3__Impl rule__Event__Group_9__4 )
            // InternalAgendomat.g:1239:2: rule__Event__Group_9__3__Impl rule__Event__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__4();

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
    // $ANTLR end "rule__Event__Group_9__3"


    // $ANTLR start "rule__Event__Group_9__3__Impl"
    // InternalAgendomat.g:1246:1: rule__Event__Group_9__3__Impl : ( ( rule__Event__Group_9_3__0 )* ) ;
    public final void rule__Event__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1250:1: ( ( ( rule__Event__Group_9_3__0 )* ) )
            // InternalAgendomat.g:1251:1: ( ( rule__Event__Group_9_3__0 )* )
            {
            // InternalAgendomat.g:1251:1: ( ( rule__Event__Group_9_3__0 )* )
            // InternalAgendomat.g:1252:2: ( rule__Event__Group_9_3__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_9_3()); 
            // InternalAgendomat.g:1253:2: ( rule__Event__Group_9_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAgendomat.g:1253:3: rule__Event__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Event__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__3__Impl"


    // $ANTLR start "rule__Event__Group_9__4"
    // InternalAgendomat.g:1261:1: rule__Event__Group_9__4 : rule__Event__Group_9__4__Impl ;
    public final void rule__Event__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1265:1: ( rule__Event__Group_9__4__Impl )
            // InternalAgendomat.g:1266:2: rule__Event__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_9__4__Impl();

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
    // $ANTLR end "rule__Event__Group_9__4"


    // $ANTLR start "rule__Event__Group_9__4__Impl"
    // InternalAgendomat.g:1272:1: rule__Event__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Event__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1276:1: ( ( '}' ) )
            // InternalAgendomat.g:1277:1: ( '}' )
            {
            // InternalAgendomat.g:1277:1: ( '}' )
            // InternalAgendomat.g:1278:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__4__Impl"


    // $ANTLR start "rule__Event__Group_9_3__0"
    // InternalAgendomat.g:1288:1: rule__Event__Group_9_3__0 : rule__Event__Group_9_3__0__Impl rule__Event__Group_9_3__1 ;
    public final void rule__Event__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1292:1: ( rule__Event__Group_9_3__0__Impl rule__Event__Group_9_3__1 )
            // InternalAgendomat.g:1293:2: rule__Event__Group_9_3__0__Impl rule__Event__Group_9_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9_3__1();

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
    // $ANTLR end "rule__Event__Group_9_3__0"


    // $ANTLR start "rule__Event__Group_9_3__0__Impl"
    // InternalAgendomat.g:1300:1: rule__Event__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1304:1: ( ( ',' ) )
            // InternalAgendomat.g:1305:1: ( ',' )
            {
            // InternalAgendomat.g:1305:1: ( ',' )
            // InternalAgendomat.g:1306:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_9_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9_3__0__Impl"


    // $ANTLR start "rule__Event__Group_9_3__1"
    // InternalAgendomat.g:1315:1: rule__Event__Group_9_3__1 : rule__Event__Group_9_3__1__Impl ;
    public final void rule__Event__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1319:1: ( rule__Event__Group_9_3__1__Impl )
            // InternalAgendomat.g:1320:2: rule__Event__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Event__Group_9_3__1"


    // $ANTLR start "rule__Event__Group_9_3__1__Impl"
    // InternalAgendomat.g:1326:1: rule__Event__Group_9_3__1__Impl : ( ( rule__Event__PersonsAssignment_9_3_1 ) ) ;
    public final void rule__Event__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1330:1: ( ( ( rule__Event__PersonsAssignment_9_3_1 ) ) )
            // InternalAgendomat.g:1331:1: ( ( rule__Event__PersonsAssignment_9_3_1 ) )
            {
            // InternalAgendomat.g:1331:1: ( ( rule__Event__PersonsAssignment_9_3_1 ) )
            // InternalAgendomat.g:1332:2: ( rule__Event__PersonsAssignment_9_3_1 )
            {
             before(grammarAccess.getEventAccess().getPersonsAssignment_9_3_1()); 
            // InternalAgendomat.g:1333:2: ( rule__Event__PersonsAssignment_9_3_1 )
            // InternalAgendomat.g:1333:3: rule__Event__PersonsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__PersonsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getPersonsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9_3__1__Impl"


    // $ANTLR start "rule__Event__Group_10__0"
    // InternalAgendomat.g:1342:1: rule__Event__Group_10__0 : rule__Event__Group_10__0__Impl rule__Event__Group_10__1 ;
    public final void rule__Event__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1346:1: ( rule__Event__Group_10__0__Impl rule__Event__Group_10__1 )
            // InternalAgendomat.g:1347:2: rule__Event__Group_10__0__Impl rule__Event__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_10__1();

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
    // $ANTLR end "rule__Event__Group_10__0"


    // $ANTLR start "rule__Event__Group_10__0__Impl"
    // InternalAgendomat.g:1354:1: rule__Event__Group_10__0__Impl : ( 'programItems' ) ;
    public final void rule__Event__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1358:1: ( ( 'programItems' ) )
            // InternalAgendomat.g:1359:1: ( 'programItems' )
            {
            // InternalAgendomat.g:1359:1: ( 'programItems' )
            // InternalAgendomat.g:1360:2: 'programItems'
            {
             before(grammarAccess.getEventAccess().getProgramItemsKeyword_10_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getProgramItemsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__0__Impl"


    // $ANTLR start "rule__Event__Group_10__1"
    // InternalAgendomat.g:1369:1: rule__Event__Group_10__1 : rule__Event__Group_10__1__Impl rule__Event__Group_10__2 ;
    public final void rule__Event__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1373:1: ( rule__Event__Group_10__1__Impl rule__Event__Group_10__2 )
            // InternalAgendomat.g:1374:2: rule__Event__Group_10__1__Impl rule__Event__Group_10__2
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_10__2();

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
    // $ANTLR end "rule__Event__Group_10__1"


    // $ANTLR start "rule__Event__Group_10__1__Impl"
    // InternalAgendomat.g:1381:1: rule__Event__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Event__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1385:1: ( ( '{' ) )
            // InternalAgendomat.g:1386:1: ( '{' )
            {
            // InternalAgendomat.g:1386:1: ( '{' )
            // InternalAgendomat.g:1387:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__1__Impl"


    // $ANTLR start "rule__Event__Group_10__2"
    // InternalAgendomat.g:1396:1: rule__Event__Group_10__2 : rule__Event__Group_10__2__Impl rule__Event__Group_10__3 ;
    public final void rule__Event__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1400:1: ( rule__Event__Group_10__2__Impl rule__Event__Group_10__3 )
            // InternalAgendomat.g:1401:2: rule__Event__Group_10__2__Impl rule__Event__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_10__3();

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
    // $ANTLR end "rule__Event__Group_10__2"


    // $ANTLR start "rule__Event__Group_10__2__Impl"
    // InternalAgendomat.g:1408:1: rule__Event__Group_10__2__Impl : ( ( rule__Event__ProgramItemsAssignment_10_2 ) ) ;
    public final void rule__Event__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1412:1: ( ( ( rule__Event__ProgramItemsAssignment_10_2 ) ) )
            // InternalAgendomat.g:1413:1: ( ( rule__Event__ProgramItemsAssignment_10_2 ) )
            {
            // InternalAgendomat.g:1413:1: ( ( rule__Event__ProgramItemsAssignment_10_2 ) )
            // InternalAgendomat.g:1414:2: ( rule__Event__ProgramItemsAssignment_10_2 )
            {
             before(grammarAccess.getEventAccess().getProgramItemsAssignment_10_2()); 
            // InternalAgendomat.g:1415:2: ( rule__Event__ProgramItemsAssignment_10_2 )
            // InternalAgendomat.g:1415:3: rule__Event__ProgramItemsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__ProgramItemsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getProgramItemsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__2__Impl"


    // $ANTLR start "rule__Event__Group_10__3"
    // InternalAgendomat.g:1423:1: rule__Event__Group_10__3 : rule__Event__Group_10__3__Impl rule__Event__Group_10__4 ;
    public final void rule__Event__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1427:1: ( rule__Event__Group_10__3__Impl rule__Event__Group_10__4 )
            // InternalAgendomat.g:1428:2: rule__Event__Group_10__3__Impl rule__Event__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_10__4();

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
    // $ANTLR end "rule__Event__Group_10__3"


    // $ANTLR start "rule__Event__Group_10__3__Impl"
    // InternalAgendomat.g:1435:1: rule__Event__Group_10__3__Impl : ( ( rule__Event__Group_10_3__0 )* ) ;
    public final void rule__Event__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1439:1: ( ( ( rule__Event__Group_10_3__0 )* ) )
            // InternalAgendomat.g:1440:1: ( ( rule__Event__Group_10_3__0 )* )
            {
            // InternalAgendomat.g:1440:1: ( ( rule__Event__Group_10_3__0 )* )
            // InternalAgendomat.g:1441:2: ( rule__Event__Group_10_3__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_10_3()); 
            // InternalAgendomat.g:1442:2: ( rule__Event__Group_10_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAgendomat.g:1442:3: rule__Event__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Event__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__3__Impl"


    // $ANTLR start "rule__Event__Group_10__4"
    // InternalAgendomat.g:1450:1: rule__Event__Group_10__4 : rule__Event__Group_10__4__Impl ;
    public final void rule__Event__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1454:1: ( rule__Event__Group_10__4__Impl )
            // InternalAgendomat.g:1455:2: rule__Event__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_10__4__Impl();

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
    // $ANTLR end "rule__Event__Group_10__4"


    // $ANTLR start "rule__Event__Group_10__4__Impl"
    // InternalAgendomat.g:1461:1: rule__Event__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Event__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1465:1: ( ( '}' ) )
            // InternalAgendomat.g:1466:1: ( '}' )
            {
            // InternalAgendomat.g:1466:1: ( '}' )
            // InternalAgendomat.g:1467:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__4__Impl"


    // $ANTLR start "rule__Event__Group_10_3__0"
    // InternalAgendomat.g:1477:1: rule__Event__Group_10_3__0 : rule__Event__Group_10_3__0__Impl rule__Event__Group_10_3__1 ;
    public final void rule__Event__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1481:1: ( rule__Event__Group_10_3__0__Impl rule__Event__Group_10_3__1 )
            // InternalAgendomat.g:1482:2: rule__Event__Group_10_3__0__Impl rule__Event__Group_10_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_10_3__1();

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
    // $ANTLR end "rule__Event__Group_10_3__0"


    // $ANTLR start "rule__Event__Group_10_3__0__Impl"
    // InternalAgendomat.g:1489:1: rule__Event__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1493:1: ( ( ',' ) )
            // InternalAgendomat.g:1494:1: ( ',' )
            {
            // InternalAgendomat.g:1494:1: ( ',' )
            // InternalAgendomat.g:1495:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10_3__0__Impl"


    // $ANTLR start "rule__Event__Group_10_3__1"
    // InternalAgendomat.g:1504:1: rule__Event__Group_10_3__1 : rule__Event__Group_10_3__1__Impl ;
    public final void rule__Event__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1508:1: ( rule__Event__Group_10_3__1__Impl )
            // InternalAgendomat.g:1509:2: rule__Event__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Event__Group_10_3__1"


    // $ANTLR start "rule__Event__Group_10_3__1__Impl"
    // InternalAgendomat.g:1515:1: rule__Event__Group_10_3__1__Impl : ( ( rule__Event__ProgramItemsAssignment_10_3_1 ) ) ;
    public final void rule__Event__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1519:1: ( ( ( rule__Event__ProgramItemsAssignment_10_3_1 ) ) )
            // InternalAgendomat.g:1520:1: ( ( rule__Event__ProgramItemsAssignment_10_3_1 ) )
            {
            // InternalAgendomat.g:1520:1: ( ( rule__Event__ProgramItemsAssignment_10_3_1 ) )
            // InternalAgendomat.g:1521:2: ( rule__Event__ProgramItemsAssignment_10_3_1 )
            {
             before(grammarAccess.getEventAccess().getProgramItemsAssignment_10_3_1()); 
            // InternalAgendomat.g:1522:2: ( rule__Event__ProgramItemsAssignment_10_3_1 )
            // InternalAgendomat.g:1522:3: rule__Event__ProgramItemsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ProgramItemsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getProgramItemsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10_3__1__Impl"


    // $ANTLR start "rule__Event__Group_11__0"
    // InternalAgendomat.g:1531:1: rule__Event__Group_11__0 : rule__Event__Group_11__0__Impl rule__Event__Group_11__1 ;
    public final void rule__Event__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1535:1: ( rule__Event__Group_11__0__Impl rule__Event__Group_11__1 )
            // InternalAgendomat.g:1536:2: rule__Event__Group_11__0__Impl rule__Event__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_11__1();

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
    // $ANTLR end "rule__Event__Group_11__0"


    // $ANTLR start "rule__Event__Group_11__0__Impl"
    // InternalAgendomat.g:1543:1: rule__Event__Group_11__0__Impl : ( 'locations' ) ;
    public final void rule__Event__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1547:1: ( ( 'locations' ) )
            // InternalAgendomat.g:1548:1: ( 'locations' )
            {
            // InternalAgendomat.g:1548:1: ( 'locations' )
            // InternalAgendomat.g:1549:2: 'locations'
            {
             before(grammarAccess.getEventAccess().getLocationsKeyword_11_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLocationsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11__0__Impl"


    // $ANTLR start "rule__Event__Group_11__1"
    // InternalAgendomat.g:1558:1: rule__Event__Group_11__1 : rule__Event__Group_11__1__Impl rule__Event__Group_11__2 ;
    public final void rule__Event__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1562:1: ( rule__Event__Group_11__1__Impl rule__Event__Group_11__2 )
            // InternalAgendomat.g:1563:2: rule__Event__Group_11__1__Impl rule__Event__Group_11__2
            {
            pushFollow(FOLLOW_16);
            rule__Event__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_11__2();

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
    // $ANTLR end "rule__Event__Group_11__1"


    // $ANTLR start "rule__Event__Group_11__1__Impl"
    // InternalAgendomat.g:1570:1: rule__Event__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Event__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1574:1: ( ( '{' ) )
            // InternalAgendomat.g:1575:1: ( '{' )
            {
            // InternalAgendomat.g:1575:1: ( '{' )
            // InternalAgendomat.g:1576:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11__1__Impl"


    // $ANTLR start "rule__Event__Group_11__2"
    // InternalAgendomat.g:1585:1: rule__Event__Group_11__2 : rule__Event__Group_11__2__Impl rule__Event__Group_11__3 ;
    public final void rule__Event__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1589:1: ( rule__Event__Group_11__2__Impl rule__Event__Group_11__3 )
            // InternalAgendomat.g:1590:2: rule__Event__Group_11__2__Impl rule__Event__Group_11__3
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_11__3();

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
    // $ANTLR end "rule__Event__Group_11__2"


    // $ANTLR start "rule__Event__Group_11__2__Impl"
    // InternalAgendomat.g:1597:1: rule__Event__Group_11__2__Impl : ( ( rule__Event__LocationsAssignment_11_2 ) ) ;
    public final void rule__Event__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1601:1: ( ( ( rule__Event__LocationsAssignment_11_2 ) ) )
            // InternalAgendomat.g:1602:1: ( ( rule__Event__LocationsAssignment_11_2 ) )
            {
            // InternalAgendomat.g:1602:1: ( ( rule__Event__LocationsAssignment_11_2 ) )
            // InternalAgendomat.g:1603:2: ( rule__Event__LocationsAssignment_11_2 )
            {
             before(grammarAccess.getEventAccess().getLocationsAssignment_11_2()); 
            // InternalAgendomat.g:1604:2: ( rule__Event__LocationsAssignment_11_2 )
            // InternalAgendomat.g:1604:3: rule__Event__LocationsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__LocationsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getLocationsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11__2__Impl"


    // $ANTLR start "rule__Event__Group_11__3"
    // InternalAgendomat.g:1612:1: rule__Event__Group_11__3 : rule__Event__Group_11__3__Impl rule__Event__Group_11__4 ;
    public final void rule__Event__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1616:1: ( rule__Event__Group_11__3__Impl rule__Event__Group_11__4 )
            // InternalAgendomat.g:1617:2: rule__Event__Group_11__3__Impl rule__Event__Group_11__4
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_11__4();

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
    // $ANTLR end "rule__Event__Group_11__3"


    // $ANTLR start "rule__Event__Group_11__3__Impl"
    // InternalAgendomat.g:1624:1: rule__Event__Group_11__3__Impl : ( ( rule__Event__Group_11_3__0 )* ) ;
    public final void rule__Event__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1628:1: ( ( ( rule__Event__Group_11_3__0 )* ) )
            // InternalAgendomat.g:1629:1: ( ( rule__Event__Group_11_3__0 )* )
            {
            // InternalAgendomat.g:1629:1: ( ( rule__Event__Group_11_3__0 )* )
            // InternalAgendomat.g:1630:2: ( rule__Event__Group_11_3__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_11_3()); 
            // InternalAgendomat.g:1631:2: ( rule__Event__Group_11_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAgendomat.g:1631:3: rule__Event__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Event__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11__3__Impl"


    // $ANTLR start "rule__Event__Group_11__4"
    // InternalAgendomat.g:1639:1: rule__Event__Group_11__4 : rule__Event__Group_11__4__Impl ;
    public final void rule__Event__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1643:1: ( rule__Event__Group_11__4__Impl )
            // InternalAgendomat.g:1644:2: rule__Event__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_11__4__Impl();

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
    // $ANTLR end "rule__Event__Group_11__4"


    // $ANTLR start "rule__Event__Group_11__4__Impl"
    // InternalAgendomat.g:1650:1: rule__Event__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Event__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1654:1: ( ( '}' ) )
            // InternalAgendomat.g:1655:1: ( '}' )
            {
            // InternalAgendomat.g:1655:1: ( '}' )
            // InternalAgendomat.g:1656:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11__4__Impl"


    // $ANTLR start "rule__Event__Group_11_3__0"
    // InternalAgendomat.g:1666:1: rule__Event__Group_11_3__0 : rule__Event__Group_11_3__0__Impl rule__Event__Group_11_3__1 ;
    public final void rule__Event__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1670:1: ( rule__Event__Group_11_3__0__Impl rule__Event__Group_11_3__1 )
            // InternalAgendomat.g:1671:2: rule__Event__Group_11_3__0__Impl rule__Event__Group_11_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Event__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_11_3__1();

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
    // $ANTLR end "rule__Event__Group_11_3__0"


    // $ANTLR start "rule__Event__Group_11_3__0__Impl"
    // InternalAgendomat.g:1678:1: rule__Event__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1682:1: ( ( ',' ) )
            // InternalAgendomat.g:1683:1: ( ',' )
            {
            // InternalAgendomat.g:1683:1: ( ',' )
            // InternalAgendomat.g:1684:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_11_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11_3__0__Impl"


    // $ANTLR start "rule__Event__Group_11_3__1"
    // InternalAgendomat.g:1693:1: rule__Event__Group_11_3__1 : rule__Event__Group_11_3__1__Impl ;
    public final void rule__Event__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1697:1: ( rule__Event__Group_11_3__1__Impl )
            // InternalAgendomat.g:1698:2: rule__Event__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Event__Group_11_3__1"


    // $ANTLR start "rule__Event__Group_11_3__1__Impl"
    // InternalAgendomat.g:1704:1: rule__Event__Group_11_3__1__Impl : ( ( rule__Event__LocationsAssignment_11_3_1 ) ) ;
    public final void rule__Event__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1708:1: ( ( ( rule__Event__LocationsAssignment_11_3_1 ) ) )
            // InternalAgendomat.g:1709:1: ( ( rule__Event__LocationsAssignment_11_3_1 ) )
            {
            // InternalAgendomat.g:1709:1: ( ( rule__Event__LocationsAssignment_11_3_1 ) )
            // InternalAgendomat.g:1710:2: ( rule__Event__LocationsAssignment_11_3_1 )
            {
             before(grammarAccess.getEventAccess().getLocationsAssignment_11_3_1()); 
            // InternalAgendomat.g:1711:2: ( rule__Event__LocationsAssignment_11_3_1 )
            // InternalAgendomat.g:1711:3: rule__Event__LocationsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__LocationsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getLocationsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_11_3__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalAgendomat.g:1720:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1724:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalAgendomat.g:1725:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalAgendomat.g:1732:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1736:1: ( ( 'Person' ) )
            // InternalAgendomat.g:1737:1: ( 'Person' )
            {
            // InternalAgendomat.g:1737:1: ( 'Person' )
            // InternalAgendomat.g:1738:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalAgendomat.g:1747:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1751:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalAgendomat.g:1752:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalAgendomat.g:1759:1: rule__Person__Group__1__Impl : ( '{' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1763:1: ( ( '{' ) )
            // InternalAgendomat.g:1764:1: ( '{' )
            {
            // InternalAgendomat.g:1764:1: ( '{' )
            // InternalAgendomat.g:1765:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalAgendomat.g:1774:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1778:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalAgendomat.g:1779:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalAgendomat.g:1786:1: rule__Person__Group__2__Impl : ( 'personName' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1790:1: ( ( 'personName' ) )
            // InternalAgendomat.g:1791:1: ( 'personName' )
            {
            // InternalAgendomat.g:1791:1: ( 'personName' )
            // InternalAgendomat.g:1792:2: 'personName'
            {
             before(grammarAccess.getPersonAccess().getPersonNameKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalAgendomat.g:1801:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1805:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalAgendomat.g:1806:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalAgendomat.g:1813:1: rule__Person__Group__3__Impl : ( ( rule__Person__PersonNameAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1817:1: ( ( ( rule__Person__PersonNameAssignment_3 ) ) )
            // InternalAgendomat.g:1818:1: ( ( rule__Person__PersonNameAssignment_3 ) )
            {
            // InternalAgendomat.g:1818:1: ( ( rule__Person__PersonNameAssignment_3 ) )
            // InternalAgendomat.g:1819:2: ( rule__Person__PersonNameAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getPersonNameAssignment_3()); 
            // InternalAgendomat.g:1820:2: ( rule__Person__PersonNameAssignment_3 )
            // InternalAgendomat.g:1820:3: rule__Person__PersonNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Person__PersonNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPersonNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalAgendomat.g:1828:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1832:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalAgendomat.g:1833:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalAgendomat.g:1840:1: rule__Person__Group__4__Impl : ( 'roles' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1844:1: ( ( 'roles' ) )
            // InternalAgendomat.g:1845:1: ( 'roles' )
            {
            // InternalAgendomat.g:1845:1: ( 'roles' )
            // InternalAgendomat.g:1846:2: 'roles'
            {
             before(grammarAccess.getPersonAccess().getRolesKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRolesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalAgendomat.g:1855:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1859:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalAgendomat.g:1860:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

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
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalAgendomat.g:1867:1: rule__Person__Group__5__Impl : ( '{' ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1871:1: ( ( '{' ) )
            // InternalAgendomat.g:1872:1: ( '{' )
            {
            // InternalAgendomat.g:1872:1: ( '{' )
            // InternalAgendomat.g:1873:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalAgendomat.g:1882:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1886:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalAgendomat.g:1887:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

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
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalAgendomat.g:1894:1: rule__Person__Group__6__Impl : ( ( rule__Person__RolesAssignment_6 ) ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1898:1: ( ( ( rule__Person__RolesAssignment_6 ) ) )
            // InternalAgendomat.g:1899:1: ( ( rule__Person__RolesAssignment_6 ) )
            {
            // InternalAgendomat.g:1899:1: ( ( rule__Person__RolesAssignment_6 ) )
            // InternalAgendomat.g:1900:2: ( rule__Person__RolesAssignment_6 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_6()); 
            // InternalAgendomat.g:1901:2: ( rule__Person__RolesAssignment_6 )
            // InternalAgendomat.g:1901:3: rule__Person__RolesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // InternalAgendomat.g:1909:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1913:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalAgendomat.g:1914:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__8();

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
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalAgendomat.g:1921:1: rule__Person__Group__7__Impl : ( ( rule__Person__Group_7__0 )* ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1925:1: ( ( ( rule__Person__Group_7__0 )* ) )
            // InternalAgendomat.g:1926:1: ( ( rule__Person__Group_7__0 )* )
            {
            // InternalAgendomat.g:1926:1: ( ( rule__Person__Group_7__0 )* )
            // InternalAgendomat.g:1927:2: ( rule__Person__Group_7__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_7()); 
            // InternalAgendomat.g:1928:2: ( rule__Person__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAgendomat.g:1928:3: rule__Person__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Person__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group__8"
    // InternalAgendomat.g:1936:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1940:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalAgendomat.g:1941:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Person__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__9();

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
    // $ANTLR end "rule__Person__Group__8"


    // $ANTLR start "rule__Person__Group__8__Impl"
    // InternalAgendomat.g:1948:1: rule__Person__Group__8__Impl : ( '}' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1952:1: ( ( '}' ) )
            // InternalAgendomat.g:1953:1: ( '}' )
            {
            // InternalAgendomat.g:1953:1: ( '}' )
            // InternalAgendomat.g:1954:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8__Impl"


    // $ANTLR start "rule__Person__Group__9"
    // InternalAgendomat.g:1963:1: rule__Person__Group__9 : rule__Person__Group__9__Impl ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1967:1: ( rule__Person__Group__9__Impl )
            // InternalAgendomat.g:1968:2: rule__Person__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__9__Impl();

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
    // $ANTLR end "rule__Person__Group__9"


    // $ANTLR start "rule__Person__Group__9__Impl"
    // InternalAgendomat.g:1974:1: rule__Person__Group__9__Impl : ( '}' ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1978:1: ( ( '}' ) )
            // InternalAgendomat.g:1979:1: ( '}' )
            {
            // InternalAgendomat.g:1979:1: ( '}' )
            // InternalAgendomat.g:1980:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9__Impl"


    // $ANTLR start "rule__Person__Group_7__0"
    // InternalAgendomat.g:1990:1: rule__Person__Group_7__0 : rule__Person__Group_7__0__Impl rule__Person__Group_7__1 ;
    public final void rule__Person__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1994:1: ( rule__Person__Group_7__0__Impl rule__Person__Group_7__1 )
            // InternalAgendomat.g:1995:2: rule__Person__Group_7__0__Impl rule__Person__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_7__1();

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
    // $ANTLR end "rule__Person__Group_7__0"


    // $ANTLR start "rule__Person__Group_7__0__Impl"
    // InternalAgendomat.g:2002:1: rule__Person__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2006:1: ( ( ',' ) )
            // InternalAgendomat.g:2007:1: ( ',' )
            {
            // InternalAgendomat.g:2007:1: ( ',' )
            // InternalAgendomat.g:2008:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7__0__Impl"


    // $ANTLR start "rule__Person__Group_7__1"
    // InternalAgendomat.g:2017:1: rule__Person__Group_7__1 : rule__Person__Group_7__1__Impl ;
    public final void rule__Person__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2021:1: ( rule__Person__Group_7__1__Impl )
            // InternalAgendomat.g:2022:2: rule__Person__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_7__1__Impl();

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
    // $ANTLR end "rule__Person__Group_7__1"


    // $ANTLR start "rule__Person__Group_7__1__Impl"
    // InternalAgendomat.g:2028:1: rule__Person__Group_7__1__Impl : ( ( rule__Person__RolesAssignment_7_1 ) ) ;
    public final void rule__Person__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2032:1: ( ( ( rule__Person__RolesAssignment_7_1 ) ) )
            // InternalAgendomat.g:2033:1: ( ( rule__Person__RolesAssignment_7_1 ) )
            {
            // InternalAgendomat.g:2033:1: ( ( rule__Person__RolesAssignment_7_1 ) )
            // InternalAgendomat.g:2034:2: ( rule__Person__RolesAssignment_7_1 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_7_1()); 
            // InternalAgendomat.g:2035:2: ( rule__Person__RolesAssignment_7_1 )
            // InternalAgendomat.g:2035:3: rule__Person__RolesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalAgendomat.g:2044:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2048:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalAgendomat.g:2049:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

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
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalAgendomat.g:2056:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2060:1: ( ( 'Location' ) )
            // InternalAgendomat.g:2061:1: ( 'Location' )
            {
            // InternalAgendomat.g:2061:1: ( 'Location' )
            // InternalAgendomat.g:2062:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalAgendomat.g:2071:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2075:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalAgendomat.g:2076:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

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
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalAgendomat.g:2083:1: rule__Location__Group__1__Impl : ( '{' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2087:1: ( ( '{' ) )
            // InternalAgendomat.g:2088:1: ( '{' )
            {
            // InternalAgendomat.g:2088:1: ( '{' )
            // InternalAgendomat.g:2089:2: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalAgendomat.g:2098:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2102:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalAgendomat.g:2103:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

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
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalAgendomat.g:2110:1: rule__Location__Group__2__Impl : ( 'locationName' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2114:1: ( ( 'locationName' ) )
            // InternalAgendomat.g:2115:1: ( 'locationName' )
            {
            // InternalAgendomat.g:2115:1: ( 'locationName' )
            // InternalAgendomat.g:2116:2: 'locationName'
            {
             before(grammarAccess.getLocationAccess().getLocationNameKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalAgendomat.g:2125:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2129:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalAgendomat.g:2130:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

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
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalAgendomat.g:2137:1: rule__Location__Group__3__Impl : ( ( rule__Location__LocationNameAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2141:1: ( ( ( rule__Location__LocationNameAssignment_3 ) ) )
            // InternalAgendomat.g:2142:1: ( ( rule__Location__LocationNameAssignment_3 ) )
            {
            // InternalAgendomat.g:2142:1: ( ( rule__Location__LocationNameAssignment_3 ) )
            // InternalAgendomat.g:2143:2: ( rule__Location__LocationNameAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getLocationNameAssignment_3()); 
            // InternalAgendomat.g:2144:2: ( rule__Location__LocationNameAssignment_3 )
            // InternalAgendomat.g:2144:3: rule__Location__LocationNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__LocationNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLocationNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalAgendomat.g:2152:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2156:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalAgendomat.g:2157:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

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
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalAgendomat.g:2164:1: rule__Location__Group__4__Impl : ( 'locationType' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2168:1: ( ( 'locationType' ) )
            // InternalAgendomat.g:2169:1: ( 'locationType' )
            {
            // InternalAgendomat.g:2169:1: ( 'locationType' )
            // InternalAgendomat.g:2170:2: 'locationType'
            {
             before(grammarAccess.getLocationAccess().getLocationTypeKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalAgendomat.g:2179:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2183:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalAgendomat.g:2184:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

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
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalAgendomat.g:2191:1: rule__Location__Group__5__Impl : ( ( rule__Location__LocationTypeAssignment_5 ) ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2195:1: ( ( ( rule__Location__LocationTypeAssignment_5 ) ) )
            // InternalAgendomat.g:2196:1: ( ( rule__Location__LocationTypeAssignment_5 ) )
            {
            // InternalAgendomat.g:2196:1: ( ( rule__Location__LocationTypeAssignment_5 ) )
            // InternalAgendomat.g:2197:2: ( rule__Location__LocationTypeAssignment_5 )
            {
             before(grammarAccess.getLocationAccess().getLocationTypeAssignment_5()); 
            // InternalAgendomat.g:2198:2: ( rule__Location__LocationTypeAssignment_5 )
            // InternalAgendomat.g:2198:3: rule__Location__LocationTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Location__LocationTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLocationTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalAgendomat.g:2206:1: rule__Location__Group__6 : rule__Location__Group__6__Impl ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2210:1: ( rule__Location__Group__6__Impl )
            // InternalAgendomat.g:2211:2: rule__Location__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__6__Impl();

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
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalAgendomat.g:2217:1: rule__Location__Group__6__Impl : ( '}' ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2221:1: ( ( '}' ) )
            // InternalAgendomat.g:2222:1: ( '}' )
            {
            // InternalAgendomat.g:2222:1: ( '}' )
            // InternalAgendomat.g:2223:2: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // InternalAgendomat.g:2233:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2237:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalAgendomat.g:2238:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__1();

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
    // $ANTLR end "rule__Session__Group__0"


    // $ANTLR start "rule__Session__Group__0__Impl"
    // InternalAgendomat.g:2245:1: rule__Session__Group__0__Impl : ( 'Session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2249:1: ( ( 'Session' ) )
            // InternalAgendomat.g:2250:1: ( 'Session' )
            {
            // InternalAgendomat.g:2250:1: ( 'Session' )
            // InternalAgendomat.g:2251:2: 'Session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0__Impl"


    // $ANTLR start "rule__Session__Group__1"
    // InternalAgendomat.g:2260:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2264:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalAgendomat.g:2265:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Session__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__2();

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
    // $ANTLR end "rule__Session__Group__1"


    // $ANTLR start "rule__Session__Group__1__Impl"
    // InternalAgendomat.g:2272:1: rule__Session__Group__1__Impl : ( '{' ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2276:1: ( ( '{' ) )
            // InternalAgendomat.g:2277:1: ( '{' )
            {
            // InternalAgendomat.g:2277:1: ( '{' )
            // InternalAgendomat.g:2278:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__1__Impl"


    // $ANTLR start "rule__Session__Group__2"
    // InternalAgendomat.g:2287:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2291:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalAgendomat.g:2292:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__3();

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
    // $ANTLR end "rule__Session__Group__2"


    // $ANTLR start "rule__Session__Group__2__Impl"
    // InternalAgendomat.g:2299:1: rule__Session__Group__2__Impl : ( 'sessionName' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2303:1: ( ( 'sessionName' ) )
            // InternalAgendomat.g:2304:1: ( 'sessionName' )
            {
            // InternalAgendomat.g:2304:1: ( 'sessionName' )
            // InternalAgendomat.g:2305:2: 'sessionName'
            {
             before(grammarAccess.getSessionAccess().getSessionNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__2__Impl"


    // $ANTLR start "rule__Session__Group__3"
    // InternalAgendomat.g:2314:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2318:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalAgendomat.g:2319:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Session__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__4();

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
    // $ANTLR end "rule__Session__Group__3"


    // $ANTLR start "rule__Session__Group__3__Impl"
    // InternalAgendomat.g:2326:1: rule__Session__Group__3__Impl : ( ( rule__Session__SessionNameAssignment_3 ) ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2330:1: ( ( ( rule__Session__SessionNameAssignment_3 ) ) )
            // InternalAgendomat.g:2331:1: ( ( rule__Session__SessionNameAssignment_3 ) )
            {
            // InternalAgendomat.g:2331:1: ( ( rule__Session__SessionNameAssignment_3 ) )
            // InternalAgendomat.g:2332:2: ( rule__Session__SessionNameAssignment_3 )
            {
             before(grammarAccess.getSessionAccess().getSessionNameAssignment_3()); 
            // InternalAgendomat.g:2333:2: ( rule__Session__SessionNameAssignment_3 )
            // InternalAgendomat.g:2333:3: rule__Session__SessionNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Session__SessionNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getSessionNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__3__Impl"


    // $ANTLR start "rule__Session__Group__4"
    // InternalAgendomat.g:2341:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2345:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalAgendomat.g:2346:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__5();

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
    // $ANTLR end "rule__Session__Group__4"


    // $ANTLR start "rule__Session__Group__4__Impl"
    // InternalAgendomat.g:2353:1: rule__Session__Group__4__Impl : ( 'startTime' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2357:1: ( ( 'startTime' ) )
            // InternalAgendomat.g:2358:1: ( 'startTime' )
            {
            // InternalAgendomat.g:2358:1: ( 'startTime' )
            // InternalAgendomat.g:2359:2: 'startTime'
            {
             before(grammarAccess.getSessionAccess().getStartTimeKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__4__Impl"


    // $ANTLR start "rule__Session__Group__5"
    // InternalAgendomat.g:2368:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2372:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalAgendomat.g:2373:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Session__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__6();

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
    // $ANTLR end "rule__Session__Group__5"


    // $ANTLR start "rule__Session__Group__5__Impl"
    // InternalAgendomat.g:2380:1: rule__Session__Group__5__Impl : ( ( rule__Session__StartTimeAssignment_5 ) ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2384:1: ( ( ( rule__Session__StartTimeAssignment_5 ) ) )
            // InternalAgendomat.g:2385:1: ( ( rule__Session__StartTimeAssignment_5 ) )
            {
            // InternalAgendomat.g:2385:1: ( ( rule__Session__StartTimeAssignment_5 ) )
            // InternalAgendomat.g:2386:2: ( rule__Session__StartTimeAssignment_5 )
            {
             before(grammarAccess.getSessionAccess().getStartTimeAssignment_5()); 
            // InternalAgendomat.g:2387:2: ( rule__Session__StartTimeAssignment_5 )
            // InternalAgendomat.g:2387:3: rule__Session__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__5__Impl"


    // $ANTLR start "rule__Session__Group__6"
    // InternalAgendomat.g:2395:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2399:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalAgendomat.g:2400:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__7();

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
    // $ANTLR end "rule__Session__Group__6"


    // $ANTLR start "rule__Session__Group__6__Impl"
    // InternalAgendomat.g:2407:1: rule__Session__Group__6__Impl : ( 'endTime' ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2411:1: ( ( 'endTime' ) )
            // InternalAgendomat.g:2412:1: ( 'endTime' )
            {
            // InternalAgendomat.g:2412:1: ( 'endTime' )
            // InternalAgendomat.g:2413:2: 'endTime'
            {
             before(grammarAccess.getSessionAccess().getEndTimeKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndTimeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__6__Impl"


    // $ANTLR start "rule__Session__Group__7"
    // InternalAgendomat.g:2422:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2426:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalAgendomat.g:2427:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Session__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__8();

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
    // $ANTLR end "rule__Session__Group__7"


    // $ANTLR start "rule__Session__Group__7__Impl"
    // InternalAgendomat.g:2434:1: rule__Session__Group__7__Impl : ( ( rule__Session__EndTimeAssignment_7 ) ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2438:1: ( ( ( rule__Session__EndTimeAssignment_7 ) ) )
            // InternalAgendomat.g:2439:1: ( ( rule__Session__EndTimeAssignment_7 ) )
            {
            // InternalAgendomat.g:2439:1: ( ( rule__Session__EndTimeAssignment_7 ) )
            // InternalAgendomat.g:2440:2: ( rule__Session__EndTimeAssignment_7 )
            {
             before(grammarAccess.getSessionAccess().getEndTimeAssignment_7()); 
            // InternalAgendomat.g:2441:2: ( rule__Session__EndTimeAssignment_7 )
            // InternalAgendomat.g:2441:3: rule__Session__EndTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__7__Impl"


    // $ANTLR start "rule__Session__Group__8"
    // InternalAgendomat.g:2449:1: rule__Session__Group__8 : rule__Session__Group__8__Impl rule__Session__Group__9 ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2453:1: ( rule__Session__Group__8__Impl rule__Session__Group__9 )
            // InternalAgendomat.g:2454:2: rule__Session__Group__8__Impl rule__Session__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__9();

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
    // $ANTLR end "rule__Session__Group__8"


    // $ANTLR start "rule__Session__Group__8__Impl"
    // InternalAgendomat.g:2461:1: rule__Session__Group__8__Impl : ( 'location' ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2465:1: ( ( 'location' ) )
            // InternalAgendomat.g:2466:1: ( 'location' )
            {
            // InternalAgendomat.g:2466:1: ( 'location' )
            // InternalAgendomat.g:2467:2: 'location'
            {
             before(grammarAccess.getSessionAccess().getLocationKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLocationKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__8__Impl"


    // $ANTLR start "rule__Session__Group__9"
    // InternalAgendomat.g:2476:1: rule__Session__Group__9 : rule__Session__Group__9__Impl rule__Session__Group__10 ;
    public final void rule__Session__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2480:1: ( rule__Session__Group__9__Impl rule__Session__Group__10 )
            // InternalAgendomat.g:2481:2: rule__Session__Group__9__Impl rule__Session__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Session__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__10();

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
    // $ANTLR end "rule__Session__Group__9"


    // $ANTLR start "rule__Session__Group__9__Impl"
    // InternalAgendomat.g:2488:1: rule__Session__Group__9__Impl : ( ( rule__Session__LocationAssignment_9 ) ) ;
    public final void rule__Session__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2492:1: ( ( ( rule__Session__LocationAssignment_9 ) ) )
            // InternalAgendomat.g:2493:1: ( ( rule__Session__LocationAssignment_9 ) )
            {
            // InternalAgendomat.g:2493:1: ( ( rule__Session__LocationAssignment_9 ) )
            // InternalAgendomat.g:2494:2: ( rule__Session__LocationAssignment_9 )
            {
             before(grammarAccess.getSessionAccess().getLocationAssignment_9()); 
            // InternalAgendomat.g:2495:2: ( rule__Session__LocationAssignment_9 )
            // InternalAgendomat.g:2495:3: rule__Session__LocationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Session__LocationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getLocationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__9__Impl"


    // $ANTLR start "rule__Session__Group__10"
    // InternalAgendomat.g:2503:1: rule__Session__Group__10 : rule__Session__Group__10__Impl rule__Session__Group__11 ;
    public final void rule__Session__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2507:1: ( rule__Session__Group__10__Impl rule__Session__Group__11 )
            // InternalAgendomat.g:2508:2: rule__Session__Group__10__Impl rule__Session__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Session__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__11();

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
    // $ANTLR end "rule__Session__Group__10"


    // $ANTLR start "rule__Session__Group__10__Impl"
    // InternalAgendomat.g:2515:1: rule__Session__Group__10__Impl : ( ( rule__Session__Group_10__0 )? ) ;
    public final void rule__Session__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2519:1: ( ( ( rule__Session__Group_10__0 )? ) )
            // InternalAgendomat.g:2520:1: ( ( rule__Session__Group_10__0 )? )
            {
            // InternalAgendomat.g:2520:1: ( ( rule__Session__Group_10__0 )? )
            // InternalAgendomat.g:2521:2: ( rule__Session__Group_10__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_10()); 
            // InternalAgendomat.g:2522:2: ( rule__Session__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAgendomat.g:2522:3: rule__Session__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__10__Impl"


    // $ANTLR start "rule__Session__Group__11"
    // InternalAgendomat.g:2530:1: rule__Session__Group__11 : rule__Session__Group__11__Impl rule__Session__Group__12 ;
    public final void rule__Session__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2534:1: ( rule__Session__Group__11__Impl rule__Session__Group__12 )
            // InternalAgendomat.g:2535:2: rule__Session__Group__11__Impl rule__Session__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__Session__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__12();

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
    // $ANTLR end "rule__Session__Group__11"


    // $ANTLR start "rule__Session__Group__11__Impl"
    // InternalAgendomat.g:2542:1: rule__Session__Group__11__Impl : ( ( rule__Session__Group_11__0 )? ) ;
    public final void rule__Session__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2546:1: ( ( ( rule__Session__Group_11__0 )? ) )
            // InternalAgendomat.g:2547:1: ( ( rule__Session__Group_11__0 )? )
            {
            // InternalAgendomat.g:2547:1: ( ( rule__Session__Group_11__0 )? )
            // InternalAgendomat.g:2548:2: ( rule__Session__Group_11__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_11()); 
            // InternalAgendomat.g:2549:2: ( rule__Session__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAgendomat.g:2549:3: rule__Session__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__11__Impl"


    // $ANTLR start "rule__Session__Group__12"
    // InternalAgendomat.g:2557:1: rule__Session__Group__12 : rule__Session__Group__12__Impl rule__Session__Group__13 ;
    public final void rule__Session__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2561:1: ( rule__Session__Group__12__Impl rule__Session__Group__13 )
            // InternalAgendomat.g:2562:2: rule__Session__Group__12__Impl rule__Session__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__Session__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__13();

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
    // $ANTLR end "rule__Session__Group__12"


    // $ANTLR start "rule__Session__Group__12__Impl"
    // InternalAgendomat.g:2569:1: rule__Session__Group__12__Impl : ( ( rule__Session__Group_12__0 )? ) ;
    public final void rule__Session__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2573:1: ( ( ( rule__Session__Group_12__0 )? ) )
            // InternalAgendomat.g:2574:1: ( ( rule__Session__Group_12__0 )? )
            {
            // InternalAgendomat.g:2574:1: ( ( rule__Session__Group_12__0 )? )
            // InternalAgendomat.g:2575:2: ( rule__Session__Group_12__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_12()); 
            // InternalAgendomat.g:2576:2: ( rule__Session__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAgendomat.g:2576:3: rule__Session__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__12__Impl"


    // $ANTLR start "rule__Session__Group__13"
    // InternalAgendomat.g:2584:1: rule__Session__Group__13 : rule__Session__Group__13__Impl ;
    public final void rule__Session__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2588:1: ( rule__Session__Group__13__Impl )
            // InternalAgendomat.g:2589:2: rule__Session__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__13__Impl();

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
    // $ANTLR end "rule__Session__Group__13"


    // $ANTLR start "rule__Session__Group__13__Impl"
    // InternalAgendomat.g:2595:1: rule__Session__Group__13__Impl : ( '}' ) ;
    public final void rule__Session__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2599:1: ( ( '}' ) )
            // InternalAgendomat.g:2600:1: ( '}' )
            {
            // InternalAgendomat.g:2600:1: ( '}' )
            // InternalAgendomat.g:2601:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__13__Impl"


    // $ANTLR start "rule__Session__Group_10__0"
    // InternalAgendomat.g:2611:1: rule__Session__Group_10__0 : rule__Session__Group_10__0__Impl rule__Session__Group_10__1 ;
    public final void rule__Session__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2615:1: ( rule__Session__Group_10__0__Impl rule__Session__Group_10__1 )
            // InternalAgendomat.g:2616:2: rule__Session__Group_10__0__Impl rule__Session__Group_10__1
            {
            pushFollow(FOLLOW_29);
            rule__Session__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10__1();

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
    // $ANTLR end "rule__Session__Group_10__0"


    // $ANTLR start "rule__Session__Group_10__0__Impl"
    // InternalAgendomat.g:2623:1: rule__Session__Group_10__0__Impl : ( 'techSupport' ) ;
    public final void rule__Session__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2627:1: ( ( 'techSupport' ) )
            // InternalAgendomat.g:2628:1: ( 'techSupport' )
            {
            // InternalAgendomat.g:2628:1: ( 'techSupport' )
            // InternalAgendomat.g:2629:2: 'techSupport'
            {
             before(grammarAccess.getSessionAccess().getTechSupportKeyword_10_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTechSupportKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10__0__Impl"


    // $ANTLR start "rule__Session__Group_10__1"
    // InternalAgendomat.g:2638:1: rule__Session__Group_10__1 : rule__Session__Group_10__1__Impl rule__Session__Group_10__2 ;
    public final void rule__Session__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2642:1: ( rule__Session__Group_10__1__Impl rule__Session__Group_10__2 )
            // InternalAgendomat.g:2643:2: rule__Session__Group_10__1__Impl rule__Session__Group_10__2
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10__2();

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
    // $ANTLR end "rule__Session__Group_10__1"


    // $ANTLR start "rule__Session__Group_10__1__Impl"
    // InternalAgendomat.g:2650:1: rule__Session__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Session__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2654:1: ( ( '(' ) )
            // InternalAgendomat.g:2655:1: ( '(' )
            {
            // InternalAgendomat.g:2655:1: ( '(' )
            // InternalAgendomat.g:2656:2: '('
            {
             before(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10__1__Impl"


    // $ANTLR start "rule__Session__Group_10__2"
    // InternalAgendomat.g:2665:1: rule__Session__Group_10__2 : rule__Session__Group_10__2__Impl rule__Session__Group_10__3 ;
    public final void rule__Session__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2669:1: ( rule__Session__Group_10__2__Impl rule__Session__Group_10__3 )
            // InternalAgendomat.g:2670:2: rule__Session__Group_10__2__Impl rule__Session__Group_10__3
            {
            pushFollow(FOLLOW_30);
            rule__Session__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10__3();

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
    // $ANTLR end "rule__Session__Group_10__2"


    // $ANTLR start "rule__Session__Group_10__2__Impl"
    // InternalAgendomat.g:2677:1: rule__Session__Group_10__2__Impl : ( ( rule__Session__TechSupportAssignment_10_2 ) ) ;
    public final void rule__Session__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2681:1: ( ( ( rule__Session__TechSupportAssignment_10_2 ) ) )
            // InternalAgendomat.g:2682:1: ( ( rule__Session__TechSupportAssignment_10_2 ) )
            {
            // InternalAgendomat.g:2682:1: ( ( rule__Session__TechSupportAssignment_10_2 ) )
            // InternalAgendomat.g:2683:2: ( rule__Session__TechSupportAssignment_10_2 )
            {
             before(grammarAccess.getSessionAccess().getTechSupportAssignment_10_2()); 
            // InternalAgendomat.g:2684:2: ( rule__Session__TechSupportAssignment_10_2 )
            // InternalAgendomat.g:2684:3: rule__Session__TechSupportAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__TechSupportAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTechSupportAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10__2__Impl"


    // $ANTLR start "rule__Session__Group_10__3"
    // InternalAgendomat.g:2692:1: rule__Session__Group_10__3 : rule__Session__Group_10__3__Impl rule__Session__Group_10__4 ;
    public final void rule__Session__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2696:1: ( rule__Session__Group_10__3__Impl rule__Session__Group_10__4 )
            // InternalAgendomat.g:2697:2: rule__Session__Group_10__3__Impl rule__Session__Group_10__4
            {
            pushFollow(FOLLOW_30);
            rule__Session__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10__4();

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
    // $ANTLR end "rule__Session__Group_10__3"


    // $ANTLR start "rule__Session__Group_10__3__Impl"
    // InternalAgendomat.g:2704:1: rule__Session__Group_10__3__Impl : ( ( rule__Session__Group_10_3__0 )* ) ;
    public final void rule__Session__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2708:1: ( ( ( rule__Session__Group_10_3__0 )* ) )
            // InternalAgendomat.g:2709:1: ( ( rule__Session__Group_10_3__0 )* )
            {
            // InternalAgendomat.g:2709:1: ( ( rule__Session__Group_10_3__0 )* )
            // InternalAgendomat.g:2710:2: ( rule__Session__Group_10_3__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_10_3()); 
            // InternalAgendomat.g:2711:2: ( rule__Session__Group_10_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAgendomat.g:2711:3: rule__Session__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Session__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10__3__Impl"


    // $ANTLR start "rule__Session__Group_10__4"
    // InternalAgendomat.g:2719:1: rule__Session__Group_10__4 : rule__Session__Group_10__4__Impl ;
    public final void rule__Session__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2723:1: ( rule__Session__Group_10__4__Impl )
            // InternalAgendomat.g:2724:2: rule__Session__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_10__4__Impl();

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
    // $ANTLR end "rule__Session__Group_10__4"


    // $ANTLR start "rule__Session__Group_10__4__Impl"
    // InternalAgendomat.g:2730:1: rule__Session__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Session__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2734:1: ( ( ')' ) )
            // InternalAgendomat.g:2735:1: ( ')' )
            {
            // InternalAgendomat.g:2735:1: ( ')' )
            // InternalAgendomat.g:2736:2: ')'
            {
             before(grammarAccess.getSessionAccess().getRightParenthesisKeyword_10_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10__4__Impl"


    // $ANTLR start "rule__Session__Group_10_3__0"
    // InternalAgendomat.g:2746:1: rule__Session__Group_10_3__0 : rule__Session__Group_10_3__0__Impl rule__Session__Group_10_3__1 ;
    public final void rule__Session__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2750:1: ( rule__Session__Group_10_3__0__Impl rule__Session__Group_10_3__1 )
            // InternalAgendomat.g:2751:2: rule__Session__Group_10_3__0__Impl rule__Session__Group_10_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Session__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10_3__1();

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
    // $ANTLR end "rule__Session__Group_10_3__0"


    // $ANTLR start "rule__Session__Group_10_3__0__Impl"
    // InternalAgendomat.g:2758:1: rule__Session__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2762:1: ( ( ',' ) )
            // InternalAgendomat.g:2763:1: ( ',' )
            {
            // InternalAgendomat.g:2763:1: ( ',' )
            // InternalAgendomat.g:2764:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_3__0__Impl"


    // $ANTLR start "rule__Session__Group_10_3__1"
    // InternalAgendomat.g:2773:1: rule__Session__Group_10_3__1 : rule__Session__Group_10_3__1__Impl ;
    public final void rule__Session__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2777:1: ( rule__Session__Group_10_3__1__Impl )
            // InternalAgendomat.g:2778:2: rule__Session__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Session__Group_10_3__1"


    // $ANTLR start "rule__Session__Group_10_3__1__Impl"
    // InternalAgendomat.g:2784:1: rule__Session__Group_10_3__1__Impl : ( ( rule__Session__TechSupportAssignment_10_3_1 ) ) ;
    public final void rule__Session__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2788:1: ( ( ( rule__Session__TechSupportAssignment_10_3_1 ) ) )
            // InternalAgendomat.g:2789:1: ( ( rule__Session__TechSupportAssignment_10_3_1 ) )
            {
            // InternalAgendomat.g:2789:1: ( ( rule__Session__TechSupportAssignment_10_3_1 ) )
            // InternalAgendomat.g:2790:2: ( rule__Session__TechSupportAssignment_10_3_1 )
            {
             before(grammarAccess.getSessionAccess().getTechSupportAssignment_10_3_1()); 
            // InternalAgendomat.g:2791:2: ( rule__Session__TechSupportAssignment_10_3_1 )
            // InternalAgendomat.g:2791:3: rule__Session__TechSupportAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__TechSupportAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTechSupportAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_3__1__Impl"


    // $ANTLR start "rule__Session__Group_11__0"
    // InternalAgendomat.g:2800:1: rule__Session__Group_11__0 : rule__Session__Group_11__0__Impl rule__Session__Group_11__1 ;
    public final void rule__Session__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2804:1: ( rule__Session__Group_11__0__Impl rule__Session__Group_11__1 )
            // InternalAgendomat.g:2805:2: rule__Session__Group_11__0__Impl rule__Session__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_11__1();

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
    // $ANTLR end "rule__Session__Group_11__0"


    // $ANTLR start "rule__Session__Group_11__0__Impl"
    // InternalAgendomat.g:2812:1: rule__Session__Group_11__0__Impl : ( 'talks' ) ;
    public final void rule__Session__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2816:1: ( ( 'talks' ) )
            // InternalAgendomat.g:2817:1: ( 'talks' )
            {
            // InternalAgendomat.g:2817:1: ( 'talks' )
            // InternalAgendomat.g:2818:2: 'talks'
            {
             before(grammarAccess.getSessionAccess().getTalksKeyword_11_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTalksKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11__0__Impl"


    // $ANTLR start "rule__Session__Group_11__1"
    // InternalAgendomat.g:2827:1: rule__Session__Group_11__1 : rule__Session__Group_11__1__Impl rule__Session__Group_11__2 ;
    public final void rule__Session__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2831:1: ( rule__Session__Group_11__1__Impl rule__Session__Group_11__2 )
            // InternalAgendomat.g:2832:2: rule__Session__Group_11__1__Impl rule__Session__Group_11__2
            {
            pushFollow(FOLLOW_31);
            rule__Session__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_11__2();

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
    // $ANTLR end "rule__Session__Group_11__1"


    // $ANTLR start "rule__Session__Group_11__1__Impl"
    // InternalAgendomat.g:2839:1: rule__Session__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Session__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2843:1: ( ( '{' ) )
            // InternalAgendomat.g:2844:1: ( '{' )
            {
            // InternalAgendomat.g:2844:1: ( '{' )
            // InternalAgendomat.g:2845:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11__1__Impl"


    // $ANTLR start "rule__Session__Group_11__2"
    // InternalAgendomat.g:2854:1: rule__Session__Group_11__2 : rule__Session__Group_11__2__Impl rule__Session__Group_11__3 ;
    public final void rule__Session__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2858:1: ( rule__Session__Group_11__2__Impl rule__Session__Group_11__3 )
            // InternalAgendomat.g:2859:2: rule__Session__Group_11__2__Impl rule__Session__Group_11__3
            {
            pushFollow(FOLLOW_7);
            rule__Session__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_11__3();

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
    // $ANTLR end "rule__Session__Group_11__2"


    // $ANTLR start "rule__Session__Group_11__2__Impl"
    // InternalAgendomat.g:2866:1: rule__Session__Group_11__2__Impl : ( ( rule__Session__TalksAssignment_11_2 ) ) ;
    public final void rule__Session__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2870:1: ( ( ( rule__Session__TalksAssignment_11_2 ) ) )
            // InternalAgendomat.g:2871:1: ( ( rule__Session__TalksAssignment_11_2 ) )
            {
            // InternalAgendomat.g:2871:1: ( ( rule__Session__TalksAssignment_11_2 ) )
            // InternalAgendomat.g:2872:2: ( rule__Session__TalksAssignment_11_2 )
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_11_2()); 
            // InternalAgendomat.g:2873:2: ( rule__Session__TalksAssignment_11_2 )
            // InternalAgendomat.g:2873:3: rule__Session__TalksAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__TalksAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTalksAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11__2__Impl"


    // $ANTLR start "rule__Session__Group_11__3"
    // InternalAgendomat.g:2881:1: rule__Session__Group_11__3 : rule__Session__Group_11__3__Impl rule__Session__Group_11__4 ;
    public final void rule__Session__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2885:1: ( rule__Session__Group_11__3__Impl rule__Session__Group_11__4 )
            // InternalAgendomat.g:2886:2: rule__Session__Group_11__3__Impl rule__Session__Group_11__4
            {
            pushFollow(FOLLOW_7);
            rule__Session__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_11__4();

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
    // $ANTLR end "rule__Session__Group_11__3"


    // $ANTLR start "rule__Session__Group_11__3__Impl"
    // InternalAgendomat.g:2893:1: rule__Session__Group_11__3__Impl : ( ( rule__Session__Group_11_3__0 )* ) ;
    public final void rule__Session__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2897:1: ( ( ( rule__Session__Group_11_3__0 )* ) )
            // InternalAgendomat.g:2898:1: ( ( rule__Session__Group_11_3__0 )* )
            {
            // InternalAgendomat.g:2898:1: ( ( rule__Session__Group_11_3__0 )* )
            // InternalAgendomat.g:2899:2: ( rule__Session__Group_11_3__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_11_3()); 
            // InternalAgendomat.g:2900:2: ( rule__Session__Group_11_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAgendomat.g:2900:3: rule__Session__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Session__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11__3__Impl"


    // $ANTLR start "rule__Session__Group_11__4"
    // InternalAgendomat.g:2908:1: rule__Session__Group_11__4 : rule__Session__Group_11__4__Impl ;
    public final void rule__Session__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2912:1: ( rule__Session__Group_11__4__Impl )
            // InternalAgendomat.g:2913:2: rule__Session__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_11__4__Impl();

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
    // $ANTLR end "rule__Session__Group_11__4"


    // $ANTLR start "rule__Session__Group_11__4__Impl"
    // InternalAgendomat.g:2919:1: rule__Session__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Session__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2923:1: ( ( '}' ) )
            // InternalAgendomat.g:2924:1: ( '}' )
            {
            // InternalAgendomat.g:2924:1: ( '}' )
            // InternalAgendomat.g:2925:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11__4__Impl"


    // $ANTLR start "rule__Session__Group_11_3__0"
    // InternalAgendomat.g:2935:1: rule__Session__Group_11_3__0 : rule__Session__Group_11_3__0__Impl rule__Session__Group_11_3__1 ;
    public final void rule__Session__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2939:1: ( rule__Session__Group_11_3__0__Impl rule__Session__Group_11_3__1 )
            // InternalAgendomat.g:2940:2: rule__Session__Group_11_3__0__Impl rule__Session__Group_11_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Session__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_11_3__1();

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
    // $ANTLR end "rule__Session__Group_11_3__0"


    // $ANTLR start "rule__Session__Group_11_3__0__Impl"
    // InternalAgendomat.g:2947:1: rule__Session__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2951:1: ( ( ',' ) )
            // InternalAgendomat.g:2952:1: ( ',' )
            {
            // InternalAgendomat.g:2952:1: ( ',' )
            // InternalAgendomat.g:2953:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_11_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11_3__0__Impl"


    // $ANTLR start "rule__Session__Group_11_3__1"
    // InternalAgendomat.g:2962:1: rule__Session__Group_11_3__1 : rule__Session__Group_11_3__1__Impl ;
    public final void rule__Session__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2966:1: ( rule__Session__Group_11_3__1__Impl )
            // InternalAgendomat.g:2967:2: rule__Session__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Session__Group_11_3__1"


    // $ANTLR start "rule__Session__Group_11_3__1__Impl"
    // InternalAgendomat.g:2973:1: rule__Session__Group_11_3__1__Impl : ( ( rule__Session__TalksAssignment_11_3_1 ) ) ;
    public final void rule__Session__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2977:1: ( ( ( rule__Session__TalksAssignment_11_3_1 ) ) )
            // InternalAgendomat.g:2978:1: ( ( rule__Session__TalksAssignment_11_3_1 ) )
            {
            // InternalAgendomat.g:2978:1: ( ( rule__Session__TalksAssignment_11_3_1 ) )
            // InternalAgendomat.g:2979:2: ( rule__Session__TalksAssignment_11_3_1 )
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_11_3_1()); 
            // InternalAgendomat.g:2980:2: ( rule__Session__TalksAssignment_11_3_1 )
            // InternalAgendomat.g:2980:3: rule__Session__TalksAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__TalksAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTalksAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_11_3__1__Impl"


    // $ANTLR start "rule__Session__Group_12__0"
    // InternalAgendomat.g:2989:1: rule__Session__Group_12__0 : rule__Session__Group_12__0__Impl rule__Session__Group_12__1 ;
    public final void rule__Session__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2993:1: ( rule__Session__Group_12__0__Impl rule__Session__Group_12__1 )
            // InternalAgendomat.g:2994:2: rule__Session__Group_12__0__Impl rule__Session__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_12__1();

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
    // $ANTLR end "rule__Session__Group_12__0"


    // $ANTLR start "rule__Session__Group_12__0__Impl"
    // InternalAgendomat.g:3001:1: rule__Session__Group_12__0__Impl : ( 'equipment' ) ;
    public final void rule__Session__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3005:1: ( ( 'equipment' ) )
            // InternalAgendomat.g:3006:1: ( 'equipment' )
            {
            // InternalAgendomat.g:3006:1: ( 'equipment' )
            // InternalAgendomat.g:3007:2: 'equipment'
            {
             before(grammarAccess.getSessionAccess().getEquipmentKeyword_12_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEquipmentKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12__0__Impl"


    // $ANTLR start "rule__Session__Group_12__1"
    // InternalAgendomat.g:3016:1: rule__Session__Group_12__1 : rule__Session__Group_12__1__Impl rule__Session__Group_12__2 ;
    public final void rule__Session__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3020:1: ( rule__Session__Group_12__1__Impl rule__Session__Group_12__2 )
            // InternalAgendomat.g:3021:2: rule__Session__Group_12__1__Impl rule__Session__Group_12__2
            {
            pushFollow(FOLLOW_32);
            rule__Session__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_12__2();

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
    // $ANTLR end "rule__Session__Group_12__1"


    // $ANTLR start "rule__Session__Group_12__1__Impl"
    // InternalAgendomat.g:3028:1: rule__Session__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Session__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3032:1: ( ( '{' ) )
            // InternalAgendomat.g:3033:1: ( '{' )
            {
            // InternalAgendomat.g:3033:1: ( '{' )
            // InternalAgendomat.g:3034:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12__1__Impl"


    // $ANTLR start "rule__Session__Group_12__2"
    // InternalAgendomat.g:3043:1: rule__Session__Group_12__2 : rule__Session__Group_12__2__Impl rule__Session__Group_12__3 ;
    public final void rule__Session__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3047:1: ( rule__Session__Group_12__2__Impl rule__Session__Group_12__3 )
            // InternalAgendomat.g:3048:2: rule__Session__Group_12__2__Impl rule__Session__Group_12__3
            {
            pushFollow(FOLLOW_7);
            rule__Session__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_12__3();

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
    // $ANTLR end "rule__Session__Group_12__2"


    // $ANTLR start "rule__Session__Group_12__2__Impl"
    // InternalAgendomat.g:3055:1: rule__Session__Group_12__2__Impl : ( ( rule__Session__EquipmentAssignment_12_2 ) ) ;
    public final void rule__Session__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3059:1: ( ( ( rule__Session__EquipmentAssignment_12_2 ) ) )
            // InternalAgendomat.g:3060:1: ( ( rule__Session__EquipmentAssignment_12_2 ) )
            {
            // InternalAgendomat.g:3060:1: ( ( rule__Session__EquipmentAssignment_12_2 ) )
            // InternalAgendomat.g:3061:2: ( rule__Session__EquipmentAssignment_12_2 )
            {
             before(grammarAccess.getSessionAccess().getEquipmentAssignment_12_2()); 
            // InternalAgendomat.g:3062:2: ( rule__Session__EquipmentAssignment_12_2 )
            // InternalAgendomat.g:3062:3: rule__Session__EquipmentAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__EquipmentAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEquipmentAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12__2__Impl"


    // $ANTLR start "rule__Session__Group_12__3"
    // InternalAgendomat.g:3070:1: rule__Session__Group_12__3 : rule__Session__Group_12__3__Impl rule__Session__Group_12__4 ;
    public final void rule__Session__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3074:1: ( rule__Session__Group_12__3__Impl rule__Session__Group_12__4 )
            // InternalAgendomat.g:3075:2: rule__Session__Group_12__3__Impl rule__Session__Group_12__4
            {
            pushFollow(FOLLOW_7);
            rule__Session__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_12__4();

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
    // $ANTLR end "rule__Session__Group_12__3"


    // $ANTLR start "rule__Session__Group_12__3__Impl"
    // InternalAgendomat.g:3082:1: rule__Session__Group_12__3__Impl : ( ( rule__Session__Group_12_3__0 )* ) ;
    public final void rule__Session__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3086:1: ( ( ( rule__Session__Group_12_3__0 )* ) )
            // InternalAgendomat.g:3087:1: ( ( rule__Session__Group_12_3__0 )* )
            {
            // InternalAgendomat.g:3087:1: ( ( rule__Session__Group_12_3__0 )* )
            // InternalAgendomat.g:3088:2: ( rule__Session__Group_12_3__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_12_3()); 
            // InternalAgendomat.g:3089:2: ( rule__Session__Group_12_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAgendomat.g:3089:3: rule__Session__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Session__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12__3__Impl"


    // $ANTLR start "rule__Session__Group_12__4"
    // InternalAgendomat.g:3097:1: rule__Session__Group_12__4 : rule__Session__Group_12__4__Impl ;
    public final void rule__Session__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3101:1: ( rule__Session__Group_12__4__Impl )
            // InternalAgendomat.g:3102:2: rule__Session__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_12__4__Impl();

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
    // $ANTLR end "rule__Session__Group_12__4"


    // $ANTLR start "rule__Session__Group_12__4__Impl"
    // InternalAgendomat.g:3108:1: rule__Session__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Session__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3112:1: ( ( '}' ) )
            // InternalAgendomat.g:3113:1: ( '}' )
            {
            // InternalAgendomat.g:3113:1: ( '}' )
            // InternalAgendomat.g:3114:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12__4__Impl"


    // $ANTLR start "rule__Session__Group_12_3__0"
    // InternalAgendomat.g:3124:1: rule__Session__Group_12_3__0 : rule__Session__Group_12_3__0__Impl rule__Session__Group_12_3__1 ;
    public final void rule__Session__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3128:1: ( rule__Session__Group_12_3__0__Impl rule__Session__Group_12_3__1 )
            // InternalAgendomat.g:3129:2: rule__Session__Group_12_3__0__Impl rule__Session__Group_12_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Session__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_12_3__1();

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
    // $ANTLR end "rule__Session__Group_12_3__0"


    // $ANTLR start "rule__Session__Group_12_3__0__Impl"
    // InternalAgendomat.g:3136:1: rule__Session__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3140:1: ( ( ',' ) )
            // InternalAgendomat.g:3141:1: ( ',' )
            {
            // InternalAgendomat.g:3141:1: ( ',' )
            // InternalAgendomat.g:3142:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_12_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12_3__0__Impl"


    // $ANTLR start "rule__Session__Group_12_3__1"
    // InternalAgendomat.g:3151:1: rule__Session__Group_12_3__1 : rule__Session__Group_12_3__1__Impl ;
    public final void rule__Session__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3155:1: ( rule__Session__Group_12_3__1__Impl )
            // InternalAgendomat.g:3156:2: rule__Session__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__Session__Group_12_3__1"


    // $ANTLR start "rule__Session__Group_12_3__1__Impl"
    // InternalAgendomat.g:3162:1: rule__Session__Group_12_3__1__Impl : ( ( rule__Session__EquipmentAssignment_12_3_1 ) ) ;
    public final void rule__Session__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3166:1: ( ( ( rule__Session__EquipmentAssignment_12_3_1 ) ) )
            // InternalAgendomat.g:3167:1: ( ( rule__Session__EquipmentAssignment_12_3_1 ) )
            {
            // InternalAgendomat.g:3167:1: ( ( rule__Session__EquipmentAssignment_12_3_1 ) )
            // InternalAgendomat.g:3168:2: ( rule__Session__EquipmentAssignment_12_3_1 )
            {
             before(grammarAccess.getSessionAccess().getEquipmentAssignment_12_3_1()); 
            // InternalAgendomat.g:3169:2: ( rule__Session__EquipmentAssignment_12_3_1 )
            // InternalAgendomat.g:3169:3: rule__Session__EquipmentAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EquipmentAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEquipmentAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_12_3__1__Impl"


    // $ANTLR start "rule__Break__Group__0"
    // InternalAgendomat.g:3178:1: rule__Break__Group__0 : rule__Break__Group__0__Impl rule__Break__Group__1 ;
    public final void rule__Break__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3182:1: ( rule__Break__Group__0__Impl rule__Break__Group__1 )
            // InternalAgendomat.g:3183:2: rule__Break__Group__0__Impl rule__Break__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Break__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__1();

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
    // $ANTLR end "rule__Break__Group__0"


    // $ANTLR start "rule__Break__Group__0__Impl"
    // InternalAgendomat.g:3190:1: rule__Break__Group__0__Impl : ( 'Break' ) ;
    public final void rule__Break__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3194:1: ( ( 'Break' ) )
            // InternalAgendomat.g:3195:1: ( 'Break' )
            {
            // InternalAgendomat.g:3195:1: ( 'Break' )
            // InternalAgendomat.g:3196:2: 'Break'
            {
             before(grammarAccess.getBreakAccess().getBreakKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getBreakKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__0__Impl"


    // $ANTLR start "rule__Break__Group__1"
    // InternalAgendomat.g:3205:1: rule__Break__Group__1 : rule__Break__Group__1__Impl rule__Break__Group__2 ;
    public final void rule__Break__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3209:1: ( rule__Break__Group__1__Impl rule__Break__Group__2 )
            // InternalAgendomat.g:3210:2: rule__Break__Group__1__Impl rule__Break__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Break__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__2();

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
    // $ANTLR end "rule__Break__Group__1"


    // $ANTLR start "rule__Break__Group__1__Impl"
    // InternalAgendomat.g:3217:1: rule__Break__Group__1__Impl : ( '{' ) ;
    public final void rule__Break__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3221:1: ( ( '{' ) )
            // InternalAgendomat.g:3222:1: ( '{' )
            {
            // InternalAgendomat.g:3222:1: ( '{' )
            // InternalAgendomat.g:3223:2: '{'
            {
             before(grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__1__Impl"


    // $ANTLR start "rule__Break__Group__2"
    // InternalAgendomat.g:3232:1: rule__Break__Group__2 : rule__Break__Group__2__Impl rule__Break__Group__3 ;
    public final void rule__Break__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3236:1: ( rule__Break__Group__2__Impl rule__Break__Group__3 )
            // InternalAgendomat.g:3237:2: rule__Break__Group__2__Impl rule__Break__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__3();

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
    // $ANTLR end "rule__Break__Group__2"


    // $ANTLR start "rule__Break__Group__2__Impl"
    // InternalAgendomat.g:3244:1: rule__Break__Group__2__Impl : ( 'breakName' ) ;
    public final void rule__Break__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3248:1: ( ( 'breakName' ) )
            // InternalAgendomat.g:3249:1: ( 'breakName' )
            {
            // InternalAgendomat.g:3249:1: ( 'breakName' )
            // InternalAgendomat.g:3250:2: 'breakName'
            {
             before(grammarAccess.getBreakAccess().getBreakNameKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getBreakNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__2__Impl"


    // $ANTLR start "rule__Break__Group__3"
    // InternalAgendomat.g:3259:1: rule__Break__Group__3 : rule__Break__Group__3__Impl rule__Break__Group__4 ;
    public final void rule__Break__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3263:1: ( rule__Break__Group__3__Impl rule__Break__Group__4 )
            // InternalAgendomat.g:3264:2: rule__Break__Group__3__Impl rule__Break__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Break__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__4();

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
    // $ANTLR end "rule__Break__Group__3"


    // $ANTLR start "rule__Break__Group__3__Impl"
    // InternalAgendomat.g:3271:1: rule__Break__Group__3__Impl : ( ( rule__Break__BreakNameAssignment_3 ) ) ;
    public final void rule__Break__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3275:1: ( ( ( rule__Break__BreakNameAssignment_3 ) ) )
            // InternalAgendomat.g:3276:1: ( ( rule__Break__BreakNameAssignment_3 ) )
            {
            // InternalAgendomat.g:3276:1: ( ( rule__Break__BreakNameAssignment_3 ) )
            // InternalAgendomat.g:3277:2: ( rule__Break__BreakNameAssignment_3 )
            {
             before(grammarAccess.getBreakAccess().getBreakNameAssignment_3()); 
            // InternalAgendomat.g:3278:2: ( rule__Break__BreakNameAssignment_3 )
            // InternalAgendomat.g:3278:3: rule__Break__BreakNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Break__BreakNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getBreakNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__3__Impl"


    // $ANTLR start "rule__Break__Group__4"
    // InternalAgendomat.g:3286:1: rule__Break__Group__4 : rule__Break__Group__4__Impl rule__Break__Group__5 ;
    public final void rule__Break__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3290:1: ( rule__Break__Group__4__Impl rule__Break__Group__5 )
            // InternalAgendomat.g:3291:2: rule__Break__Group__4__Impl rule__Break__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__5();

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
    // $ANTLR end "rule__Break__Group__4"


    // $ANTLR start "rule__Break__Group__4__Impl"
    // InternalAgendomat.g:3298:1: rule__Break__Group__4__Impl : ( 'startTime' ) ;
    public final void rule__Break__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3302:1: ( ( 'startTime' ) )
            // InternalAgendomat.g:3303:1: ( 'startTime' )
            {
            // InternalAgendomat.g:3303:1: ( 'startTime' )
            // InternalAgendomat.g:3304:2: 'startTime'
            {
             before(grammarAccess.getBreakAccess().getStartTimeKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getStartTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__4__Impl"


    // $ANTLR start "rule__Break__Group__5"
    // InternalAgendomat.g:3313:1: rule__Break__Group__5 : rule__Break__Group__5__Impl rule__Break__Group__6 ;
    public final void rule__Break__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3317:1: ( rule__Break__Group__5__Impl rule__Break__Group__6 )
            // InternalAgendomat.g:3318:2: rule__Break__Group__5__Impl rule__Break__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Break__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__6();

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
    // $ANTLR end "rule__Break__Group__5"


    // $ANTLR start "rule__Break__Group__5__Impl"
    // InternalAgendomat.g:3325:1: rule__Break__Group__5__Impl : ( ( rule__Break__StartTimeAssignment_5 ) ) ;
    public final void rule__Break__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3329:1: ( ( ( rule__Break__StartTimeAssignment_5 ) ) )
            // InternalAgendomat.g:3330:1: ( ( rule__Break__StartTimeAssignment_5 ) )
            {
            // InternalAgendomat.g:3330:1: ( ( rule__Break__StartTimeAssignment_5 ) )
            // InternalAgendomat.g:3331:2: ( rule__Break__StartTimeAssignment_5 )
            {
             before(grammarAccess.getBreakAccess().getStartTimeAssignment_5()); 
            // InternalAgendomat.g:3332:2: ( rule__Break__StartTimeAssignment_5 )
            // InternalAgendomat.g:3332:3: rule__Break__StartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Break__StartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getStartTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__5__Impl"


    // $ANTLR start "rule__Break__Group__6"
    // InternalAgendomat.g:3340:1: rule__Break__Group__6 : rule__Break__Group__6__Impl rule__Break__Group__7 ;
    public final void rule__Break__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3344:1: ( rule__Break__Group__6__Impl rule__Break__Group__7 )
            // InternalAgendomat.g:3345:2: rule__Break__Group__6__Impl rule__Break__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__7();

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
    // $ANTLR end "rule__Break__Group__6"


    // $ANTLR start "rule__Break__Group__6__Impl"
    // InternalAgendomat.g:3352:1: rule__Break__Group__6__Impl : ( 'endTime' ) ;
    public final void rule__Break__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3356:1: ( ( 'endTime' ) )
            // InternalAgendomat.g:3357:1: ( 'endTime' )
            {
            // InternalAgendomat.g:3357:1: ( 'endTime' )
            // InternalAgendomat.g:3358:2: 'endTime'
            {
             before(grammarAccess.getBreakAccess().getEndTimeKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getEndTimeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__6__Impl"


    // $ANTLR start "rule__Break__Group__7"
    // InternalAgendomat.g:3367:1: rule__Break__Group__7 : rule__Break__Group__7__Impl rule__Break__Group__8 ;
    public final void rule__Break__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3371:1: ( rule__Break__Group__7__Impl rule__Break__Group__8 )
            // InternalAgendomat.g:3372:2: rule__Break__Group__7__Impl rule__Break__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Break__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__8();

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
    // $ANTLR end "rule__Break__Group__7"


    // $ANTLR start "rule__Break__Group__7__Impl"
    // InternalAgendomat.g:3379:1: rule__Break__Group__7__Impl : ( ( rule__Break__EndTimeAssignment_7 ) ) ;
    public final void rule__Break__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3383:1: ( ( ( rule__Break__EndTimeAssignment_7 ) ) )
            // InternalAgendomat.g:3384:1: ( ( rule__Break__EndTimeAssignment_7 ) )
            {
            // InternalAgendomat.g:3384:1: ( ( rule__Break__EndTimeAssignment_7 ) )
            // InternalAgendomat.g:3385:2: ( rule__Break__EndTimeAssignment_7 )
            {
             before(grammarAccess.getBreakAccess().getEndTimeAssignment_7()); 
            // InternalAgendomat.g:3386:2: ( rule__Break__EndTimeAssignment_7 )
            // InternalAgendomat.g:3386:3: rule__Break__EndTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Break__EndTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getEndTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__7__Impl"


    // $ANTLR start "rule__Break__Group__8"
    // InternalAgendomat.g:3394:1: rule__Break__Group__8 : rule__Break__Group__8__Impl rule__Break__Group__9 ;
    public final void rule__Break__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3398:1: ( rule__Break__Group__8__Impl rule__Break__Group__9 )
            // InternalAgendomat.g:3399:2: rule__Break__Group__8__Impl rule__Break__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__9();

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
    // $ANTLR end "rule__Break__Group__8"


    // $ANTLR start "rule__Break__Group__8__Impl"
    // InternalAgendomat.g:3406:1: rule__Break__Group__8__Impl : ( 'location' ) ;
    public final void rule__Break__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3410:1: ( ( 'location' ) )
            // InternalAgendomat.g:3411:1: ( 'location' )
            {
            // InternalAgendomat.g:3411:1: ( 'location' )
            // InternalAgendomat.g:3412:2: 'location'
            {
             before(grammarAccess.getBreakAccess().getLocationKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLocationKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__8__Impl"


    // $ANTLR start "rule__Break__Group__9"
    // InternalAgendomat.g:3421:1: rule__Break__Group__9 : rule__Break__Group__9__Impl rule__Break__Group__10 ;
    public final void rule__Break__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3425:1: ( rule__Break__Group__9__Impl rule__Break__Group__10 )
            // InternalAgendomat.g:3426:2: rule__Break__Group__9__Impl rule__Break__Group__10
            {
            pushFollow(FOLLOW_34);
            rule__Break__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__10();

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
    // $ANTLR end "rule__Break__Group__9"


    // $ANTLR start "rule__Break__Group__9__Impl"
    // InternalAgendomat.g:3433:1: rule__Break__Group__9__Impl : ( ( rule__Break__LocationAssignment_9 ) ) ;
    public final void rule__Break__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3437:1: ( ( ( rule__Break__LocationAssignment_9 ) ) )
            // InternalAgendomat.g:3438:1: ( ( rule__Break__LocationAssignment_9 ) )
            {
            // InternalAgendomat.g:3438:1: ( ( rule__Break__LocationAssignment_9 ) )
            // InternalAgendomat.g:3439:2: ( rule__Break__LocationAssignment_9 )
            {
             before(grammarAccess.getBreakAccess().getLocationAssignment_9()); 
            // InternalAgendomat.g:3440:2: ( rule__Break__LocationAssignment_9 )
            // InternalAgendomat.g:3440:3: rule__Break__LocationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Break__LocationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getLocationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__9__Impl"


    // $ANTLR start "rule__Break__Group__10"
    // InternalAgendomat.g:3448:1: rule__Break__Group__10 : rule__Break__Group__10__Impl rule__Break__Group__11 ;
    public final void rule__Break__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3452:1: ( rule__Break__Group__10__Impl rule__Break__Group__11 )
            // InternalAgendomat.g:3453:2: rule__Break__Group__10__Impl rule__Break__Group__11
            {
            pushFollow(FOLLOW_34);
            rule__Break__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__11();

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
    // $ANTLR end "rule__Break__Group__10"


    // $ANTLR start "rule__Break__Group__10__Impl"
    // InternalAgendomat.g:3460:1: rule__Break__Group__10__Impl : ( ( rule__Break__Group_10__0 )? ) ;
    public final void rule__Break__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3464:1: ( ( ( rule__Break__Group_10__0 )? ) )
            // InternalAgendomat.g:3465:1: ( ( rule__Break__Group_10__0 )? )
            {
            // InternalAgendomat.g:3465:1: ( ( rule__Break__Group_10__0 )? )
            // InternalAgendomat.g:3466:2: ( rule__Break__Group_10__0 )?
            {
             before(grammarAccess.getBreakAccess().getGroup_10()); 
            // InternalAgendomat.g:3467:2: ( rule__Break__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAgendomat.g:3467:3: rule__Break__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Break__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBreakAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__10__Impl"


    // $ANTLR start "rule__Break__Group__11"
    // InternalAgendomat.g:3475:1: rule__Break__Group__11 : rule__Break__Group__11__Impl ;
    public final void rule__Break__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3479:1: ( rule__Break__Group__11__Impl )
            // InternalAgendomat.g:3480:2: rule__Break__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group__11__Impl();

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
    // $ANTLR end "rule__Break__Group__11"


    // $ANTLR start "rule__Break__Group__11__Impl"
    // InternalAgendomat.g:3486:1: rule__Break__Group__11__Impl : ( '}' ) ;
    public final void rule__Break__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3490:1: ( ( '}' ) )
            // InternalAgendomat.g:3491:1: ( '}' )
            {
            // InternalAgendomat.g:3491:1: ( '}' )
            // InternalAgendomat.g:3492:2: '}'
            {
             before(grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__11__Impl"


    // $ANTLR start "rule__Break__Group_10__0"
    // InternalAgendomat.g:3502:1: rule__Break__Group_10__0 : rule__Break__Group_10__0__Impl rule__Break__Group_10__1 ;
    public final void rule__Break__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3506:1: ( rule__Break__Group_10__0__Impl rule__Break__Group_10__1 )
            // InternalAgendomat.g:3507:2: rule__Break__Group_10__0__Impl rule__Break__Group_10__1
            {
            pushFollow(FOLLOW_29);
            rule__Break__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_10__1();

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
    // $ANTLR end "rule__Break__Group_10__0"


    // $ANTLR start "rule__Break__Group_10__0__Impl"
    // InternalAgendomat.g:3514:1: rule__Break__Group_10__0__Impl : ( 'animators' ) ;
    public final void rule__Break__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3518:1: ( ( 'animators' ) )
            // InternalAgendomat.g:3519:1: ( 'animators' )
            {
            // InternalAgendomat.g:3519:1: ( 'animators' )
            // InternalAgendomat.g:3520:2: 'animators'
            {
             before(grammarAccess.getBreakAccess().getAnimatorsKeyword_10_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getAnimatorsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10__0__Impl"


    // $ANTLR start "rule__Break__Group_10__1"
    // InternalAgendomat.g:3529:1: rule__Break__Group_10__1 : rule__Break__Group_10__1__Impl rule__Break__Group_10__2 ;
    public final void rule__Break__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3533:1: ( rule__Break__Group_10__1__Impl rule__Break__Group_10__2 )
            // InternalAgendomat.g:3534:2: rule__Break__Group_10__1__Impl rule__Break__Group_10__2
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_10__2();

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
    // $ANTLR end "rule__Break__Group_10__1"


    // $ANTLR start "rule__Break__Group_10__1__Impl"
    // InternalAgendomat.g:3541:1: rule__Break__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Break__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3545:1: ( ( '(' ) )
            // InternalAgendomat.g:3546:1: ( '(' )
            {
            // InternalAgendomat.g:3546:1: ( '(' )
            // InternalAgendomat.g:3547:2: '('
            {
             before(grammarAccess.getBreakAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10__1__Impl"


    // $ANTLR start "rule__Break__Group_10__2"
    // InternalAgendomat.g:3556:1: rule__Break__Group_10__2 : rule__Break__Group_10__2__Impl rule__Break__Group_10__3 ;
    public final void rule__Break__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3560:1: ( rule__Break__Group_10__2__Impl rule__Break__Group_10__3 )
            // InternalAgendomat.g:3561:2: rule__Break__Group_10__2__Impl rule__Break__Group_10__3
            {
            pushFollow(FOLLOW_30);
            rule__Break__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_10__3();

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
    // $ANTLR end "rule__Break__Group_10__2"


    // $ANTLR start "rule__Break__Group_10__2__Impl"
    // InternalAgendomat.g:3568:1: rule__Break__Group_10__2__Impl : ( ( rule__Break__AnimatorsAssignment_10_2 ) ) ;
    public final void rule__Break__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3572:1: ( ( ( rule__Break__AnimatorsAssignment_10_2 ) ) )
            // InternalAgendomat.g:3573:1: ( ( rule__Break__AnimatorsAssignment_10_2 ) )
            {
            // InternalAgendomat.g:3573:1: ( ( rule__Break__AnimatorsAssignment_10_2 ) )
            // InternalAgendomat.g:3574:2: ( rule__Break__AnimatorsAssignment_10_2 )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsAssignment_10_2()); 
            // InternalAgendomat.g:3575:2: ( rule__Break__AnimatorsAssignment_10_2 )
            // InternalAgendomat.g:3575:3: rule__Break__AnimatorsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Break__AnimatorsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getAnimatorsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10__2__Impl"


    // $ANTLR start "rule__Break__Group_10__3"
    // InternalAgendomat.g:3583:1: rule__Break__Group_10__3 : rule__Break__Group_10__3__Impl rule__Break__Group_10__4 ;
    public final void rule__Break__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3587:1: ( rule__Break__Group_10__3__Impl rule__Break__Group_10__4 )
            // InternalAgendomat.g:3588:2: rule__Break__Group_10__3__Impl rule__Break__Group_10__4
            {
            pushFollow(FOLLOW_30);
            rule__Break__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_10__4();

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
    // $ANTLR end "rule__Break__Group_10__3"


    // $ANTLR start "rule__Break__Group_10__3__Impl"
    // InternalAgendomat.g:3595:1: rule__Break__Group_10__3__Impl : ( ( rule__Break__Group_10_3__0 )* ) ;
    public final void rule__Break__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3599:1: ( ( ( rule__Break__Group_10_3__0 )* ) )
            // InternalAgendomat.g:3600:1: ( ( rule__Break__Group_10_3__0 )* )
            {
            // InternalAgendomat.g:3600:1: ( ( rule__Break__Group_10_3__0 )* )
            // InternalAgendomat.g:3601:2: ( rule__Break__Group_10_3__0 )*
            {
             before(grammarAccess.getBreakAccess().getGroup_10_3()); 
            // InternalAgendomat.g:3602:2: ( rule__Break__Group_10_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAgendomat.g:3602:3: rule__Break__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Break__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBreakAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10__3__Impl"


    // $ANTLR start "rule__Break__Group_10__4"
    // InternalAgendomat.g:3610:1: rule__Break__Group_10__4 : rule__Break__Group_10__4__Impl ;
    public final void rule__Break__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3614:1: ( rule__Break__Group_10__4__Impl )
            // InternalAgendomat.g:3615:2: rule__Break__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group_10__4__Impl();

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
    // $ANTLR end "rule__Break__Group_10__4"


    // $ANTLR start "rule__Break__Group_10__4__Impl"
    // InternalAgendomat.g:3621:1: rule__Break__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Break__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3625:1: ( ( ')' ) )
            // InternalAgendomat.g:3626:1: ( ')' )
            {
            // InternalAgendomat.g:3626:1: ( ')' )
            // InternalAgendomat.g:3627:2: ')'
            {
             before(grammarAccess.getBreakAccess().getRightParenthesisKeyword_10_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10__4__Impl"


    // $ANTLR start "rule__Break__Group_10_3__0"
    // InternalAgendomat.g:3637:1: rule__Break__Group_10_3__0 : rule__Break__Group_10_3__0__Impl rule__Break__Group_10_3__1 ;
    public final void rule__Break__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3641:1: ( rule__Break__Group_10_3__0__Impl rule__Break__Group_10_3__1 )
            // InternalAgendomat.g:3642:2: rule__Break__Group_10_3__0__Impl rule__Break__Group_10_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Break__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_10_3__1();

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
    // $ANTLR end "rule__Break__Group_10_3__0"


    // $ANTLR start "rule__Break__Group_10_3__0__Impl"
    // InternalAgendomat.g:3649:1: rule__Break__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Break__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3653:1: ( ( ',' ) )
            // InternalAgendomat.g:3654:1: ( ',' )
            {
            // InternalAgendomat.g:3654:1: ( ',' )
            // InternalAgendomat.g:3655:2: ','
            {
             before(grammarAccess.getBreakAccess().getCommaKeyword_10_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10_3__0__Impl"


    // $ANTLR start "rule__Break__Group_10_3__1"
    // InternalAgendomat.g:3664:1: rule__Break__Group_10_3__1 : rule__Break__Group_10_3__1__Impl ;
    public final void rule__Break__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3668:1: ( rule__Break__Group_10_3__1__Impl )
            // InternalAgendomat.g:3669:2: rule__Break__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Break__Group_10_3__1"


    // $ANTLR start "rule__Break__Group_10_3__1__Impl"
    // InternalAgendomat.g:3675:1: rule__Break__Group_10_3__1__Impl : ( ( rule__Break__AnimatorsAssignment_10_3_1 ) ) ;
    public final void rule__Break__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3679:1: ( ( ( rule__Break__AnimatorsAssignment_10_3_1 ) ) )
            // InternalAgendomat.g:3680:1: ( ( rule__Break__AnimatorsAssignment_10_3_1 ) )
            {
            // InternalAgendomat.g:3680:1: ( ( rule__Break__AnimatorsAssignment_10_3_1 ) )
            // InternalAgendomat.g:3681:2: ( rule__Break__AnimatorsAssignment_10_3_1 )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsAssignment_10_3_1()); 
            // InternalAgendomat.g:3682:2: ( rule__Break__AnimatorsAssignment_10_3_1 )
            // InternalAgendomat.g:3682:3: rule__Break__AnimatorsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Break__AnimatorsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getAnimatorsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_10_3__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // InternalAgendomat.g:3691:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3695:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // InternalAgendomat.g:3696:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Talk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__1();

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
    // $ANTLR end "rule__Talk__Group__0"


    // $ANTLR start "rule__Talk__Group__0__Impl"
    // InternalAgendomat.g:3703:1: rule__Talk__Group__0__Impl : ( 'Talk' ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3707:1: ( ( 'Talk' ) )
            // InternalAgendomat.g:3708:1: ( 'Talk' )
            {
            // InternalAgendomat.g:3708:1: ( 'Talk' )
            // InternalAgendomat.g:3709:2: 'Talk'
            {
             before(grammarAccess.getTalkAccess().getTalkKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__0__Impl"


    // $ANTLR start "rule__Talk__Group__1"
    // InternalAgendomat.g:3718:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3722:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // InternalAgendomat.g:3723:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Talk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__2();

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
    // $ANTLR end "rule__Talk__Group__1"


    // $ANTLR start "rule__Talk__Group__1__Impl"
    // InternalAgendomat.g:3730:1: rule__Talk__Group__1__Impl : ( '{' ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3734:1: ( ( '{' ) )
            // InternalAgendomat.g:3735:1: ( '{' )
            {
            // InternalAgendomat.g:3735:1: ( '{' )
            // InternalAgendomat.g:3736:2: '{'
            {
             before(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__1__Impl"


    // $ANTLR start "rule__Talk__Group__2"
    // InternalAgendomat.g:3745:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3749:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // InternalAgendomat.g:3750:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Talk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__3();

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
    // $ANTLR end "rule__Talk__Group__2"


    // $ANTLR start "rule__Talk__Group__2__Impl"
    // InternalAgendomat.g:3757:1: rule__Talk__Group__2__Impl : ( 'talkName' ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3761:1: ( ( 'talkName' ) )
            // InternalAgendomat.g:3762:1: ( 'talkName' )
            {
            // InternalAgendomat.g:3762:1: ( 'talkName' )
            // InternalAgendomat.g:3763:2: 'talkName'
            {
             before(grammarAccess.getTalkAccess().getTalkNameKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__2__Impl"


    // $ANTLR start "rule__Talk__Group__3"
    // InternalAgendomat.g:3772:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3776:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // InternalAgendomat.g:3777:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Talk__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__4();

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
    // $ANTLR end "rule__Talk__Group__3"


    // $ANTLR start "rule__Talk__Group__3__Impl"
    // InternalAgendomat.g:3784:1: rule__Talk__Group__3__Impl : ( ( rule__Talk__TalkNameAssignment_3 ) ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3788:1: ( ( ( rule__Talk__TalkNameAssignment_3 ) ) )
            // InternalAgendomat.g:3789:1: ( ( rule__Talk__TalkNameAssignment_3 ) )
            {
            // InternalAgendomat.g:3789:1: ( ( rule__Talk__TalkNameAssignment_3 ) )
            // InternalAgendomat.g:3790:2: ( rule__Talk__TalkNameAssignment_3 )
            {
             before(grammarAccess.getTalkAccess().getTalkNameAssignment_3()); 
            // InternalAgendomat.g:3791:2: ( rule__Talk__TalkNameAssignment_3 )
            // InternalAgendomat.g:3791:3: rule__Talk__TalkNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__3__Impl"


    // $ANTLR start "rule__Talk__Group__4"
    // InternalAgendomat.g:3799:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3803:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // InternalAgendomat.g:3804:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Talk__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__5();

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
    // $ANTLR end "rule__Talk__Group__4"


    // $ANTLR start "rule__Talk__Group__4__Impl"
    // InternalAgendomat.g:3811:1: rule__Talk__Group__4__Impl : ( 'talkStartTime' ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3815:1: ( ( 'talkStartTime' ) )
            // InternalAgendomat.g:3816:1: ( 'talkStartTime' )
            {
            // InternalAgendomat.g:3816:1: ( 'talkStartTime' )
            // InternalAgendomat.g:3817:2: 'talkStartTime'
            {
             before(grammarAccess.getTalkAccess().getTalkStartTimeKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkStartTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__4__Impl"


    // $ANTLR start "rule__Talk__Group__5"
    // InternalAgendomat.g:3826:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3830:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // InternalAgendomat.g:3831:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Talk__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__6();

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
    // $ANTLR end "rule__Talk__Group__5"


    // $ANTLR start "rule__Talk__Group__5__Impl"
    // InternalAgendomat.g:3838:1: rule__Talk__Group__5__Impl : ( ( rule__Talk__TalkStartTimeAssignment_5 ) ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3842:1: ( ( ( rule__Talk__TalkStartTimeAssignment_5 ) ) )
            // InternalAgendomat.g:3843:1: ( ( rule__Talk__TalkStartTimeAssignment_5 ) )
            {
            // InternalAgendomat.g:3843:1: ( ( rule__Talk__TalkStartTimeAssignment_5 ) )
            // InternalAgendomat.g:3844:2: ( rule__Talk__TalkStartTimeAssignment_5 )
            {
             before(grammarAccess.getTalkAccess().getTalkStartTimeAssignment_5()); 
            // InternalAgendomat.g:3845:2: ( rule__Talk__TalkStartTimeAssignment_5 )
            // InternalAgendomat.g:3845:3: rule__Talk__TalkStartTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkStartTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkStartTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__5__Impl"


    // $ANTLR start "rule__Talk__Group__6"
    // InternalAgendomat.g:3853:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl rule__Talk__Group__7 ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3857:1: ( rule__Talk__Group__6__Impl rule__Talk__Group__7 )
            // InternalAgendomat.g:3858:2: rule__Talk__Group__6__Impl rule__Talk__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Talk__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__7();

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
    // $ANTLR end "rule__Talk__Group__6"


    // $ANTLR start "rule__Talk__Group__6__Impl"
    // InternalAgendomat.g:3865:1: rule__Talk__Group__6__Impl : ( 'talkEndTime' ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3869:1: ( ( 'talkEndTime' ) )
            // InternalAgendomat.g:3870:1: ( 'talkEndTime' )
            {
            // InternalAgendomat.g:3870:1: ( 'talkEndTime' )
            // InternalAgendomat.g:3871:2: 'talkEndTime'
            {
             before(grammarAccess.getTalkAccess().getTalkEndTimeKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkEndTimeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__6__Impl"


    // $ANTLR start "rule__Talk__Group__7"
    // InternalAgendomat.g:3880:1: rule__Talk__Group__7 : rule__Talk__Group__7__Impl rule__Talk__Group__8 ;
    public final void rule__Talk__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3884:1: ( rule__Talk__Group__7__Impl rule__Talk__Group__8 )
            // InternalAgendomat.g:3885:2: rule__Talk__Group__7__Impl rule__Talk__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__Talk__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__8();

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
    // $ANTLR end "rule__Talk__Group__7"


    // $ANTLR start "rule__Talk__Group__7__Impl"
    // InternalAgendomat.g:3892:1: rule__Talk__Group__7__Impl : ( ( rule__Talk__TalkEndTimeAssignment_7 ) ) ;
    public final void rule__Talk__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3896:1: ( ( ( rule__Talk__TalkEndTimeAssignment_7 ) ) )
            // InternalAgendomat.g:3897:1: ( ( rule__Talk__TalkEndTimeAssignment_7 ) )
            {
            // InternalAgendomat.g:3897:1: ( ( rule__Talk__TalkEndTimeAssignment_7 ) )
            // InternalAgendomat.g:3898:2: ( rule__Talk__TalkEndTimeAssignment_7 )
            {
             before(grammarAccess.getTalkAccess().getTalkEndTimeAssignment_7()); 
            // InternalAgendomat.g:3899:2: ( rule__Talk__TalkEndTimeAssignment_7 )
            // InternalAgendomat.g:3899:3: rule__Talk__TalkEndTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkEndTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkEndTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__7__Impl"


    // $ANTLR start "rule__Talk__Group__8"
    // InternalAgendomat.g:3907:1: rule__Talk__Group__8 : rule__Talk__Group__8__Impl rule__Talk__Group__9 ;
    public final void rule__Talk__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3911:1: ( rule__Talk__Group__8__Impl rule__Talk__Group__9 )
            // InternalAgendomat.g:3912:2: rule__Talk__Group__8__Impl rule__Talk__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Talk__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__9();

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
    // $ANTLR end "rule__Talk__Group__8"


    // $ANTLR start "rule__Talk__Group__8__Impl"
    // InternalAgendomat.g:3919:1: rule__Talk__Group__8__Impl : ( 'presenters' ) ;
    public final void rule__Talk__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3923:1: ( ( 'presenters' ) )
            // InternalAgendomat.g:3924:1: ( 'presenters' )
            {
            // InternalAgendomat.g:3924:1: ( 'presenters' )
            // InternalAgendomat.g:3925:2: 'presenters'
            {
             before(grammarAccess.getTalkAccess().getPresentersKeyword_8()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getPresentersKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__8__Impl"


    // $ANTLR start "rule__Talk__Group__9"
    // InternalAgendomat.g:3934:1: rule__Talk__Group__9 : rule__Talk__Group__9__Impl rule__Talk__Group__10 ;
    public final void rule__Talk__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3938:1: ( rule__Talk__Group__9__Impl rule__Talk__Group__10 )
            // InternalAgendomat.g:3939:2: rule__Talk__Group__9__Impl rule__Talk__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Talk__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__10();

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
    // $ANTLR end "rule__Talk__Group__9"


    // $ANTLR start "rule__Talk__Group__9__Impl"
    // InternalAgendomat.g:3946:1: rule__Talk__Group__9__Impl : ( '(' ) ;
    public final void rule__Talk__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3950:1: ( ( '(' ) )
            // InternalAgendomat.g:3951:1: ( '(' )
            {
            // InternalAgendomat.g:3951:1: ( '(' )
            // InternalAgendomat.g:3952:2: '('
            {
             before(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_9()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__9__Impl"


    // $ANTLR start "rule__Talk__Group__10"
    // InternalAgendomat.g:3961:1: rule__Talk__Group__10 : rule__Talk__Group__10__Impl rule__Talk__Group__11 ;
    public final void rule__Talk__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3965:1: ( rule__Talk__Group__10__Impl rule__Talk__Group__11 )
            // InternalAgendomat.g:3966:2: rule__Talk__Group__10__Impl rule__Talk__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__Talk__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__11();

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
    // $ANTLR end "rule__Talk__Group__10"


    // $ANTLR start "rule__Talk__Group__10__Impl"
    // InternalAgendomat.g:3973:1: rule__Talk__Group__10__Impl : ( ( rule__Talk__PresentersAssignment_10 ) ) ;
    public final void rule__Talk__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3977:1: ( ( ( rule__Talk__PresentersAssignment_10 ) ) )
            // InternalAgendomat.g:3978:1: ( ( rule__Talk__PresentersAssignment_10 ) )
            {
            // InternalAgendomat.g:3978:1: ( ( rule__Talk__PresentersAssignment_10 ) )
            // InternalAgendomat.g:3979:2: ( rule__Talk__PresentersAssignment_10 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_10()); 
            // InternalAgendomat.g:3980:2: ( rule__Talk__PresentersAssignment_10 )
            // InternalAgendomat.g:3980:3: rule__Talk__PresentersAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Talk__PresentersAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__10__Impl"


    // $ANTLR start "rule__Talk__Group__11"
    // InternalAgendomat.g:3988:1: rule__Talk__Group__11 : rule__Talk__Group__11__Impl rule__Talk__Group__12 ;
    public final void rule__Talk__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3992:1: ( rule__Talk__Group__11__Impl rule__Talk__Group__12 )
            // InternalAgendomat.g:3993:2: rule__Talk__Group__11__Impl rule__Talk__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__Talk__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__12();

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
    // $ANTLR end "rule__Talk__Group__11"


    // $ANTLR start "rule__Talk__Group__11__Impl"
    // InternalAgendomat.g:4000:1: rule__Talk__Group__11__Impl : ( ( rule__Talk__Group_11__0 )* ) ;
    public final void rule__Talk__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4004:1: ( ( ( rule__Talk__Group_11__0 )* ) )
            // InternalAgendomat.g:4005:1: ( ( rule__Talk__Group_11__0 )* )
            {
            // InternalAgendomat.g:4005:1: ( ( rule__Talk__Group_11__0 )* )
            // InternalAgendomat.g:4006:2: ( rule__Talk__Group_11__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_11()); 
            // InternalAgendomat.g:4007:2: ( rule__Talk__Group_11__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAgendomat.g:4007:3: rule__Talk__Group_11__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Talk__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__11__Impl"


    // $ANTLR start "rule__Talk__Group__12"
    // InternalAgendomat.g:4015:1: rule__Talk__Group__12 : rule__Talk__Group__12__Impl rule__Talk__Group__13 ;
    public final void rule__Talk__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4019:1: ( rule__Talk__Group__12__Impl rule__Talk__Group__13 )
            // InternalAgendomat.g:4020:2: rule__Talk__Group__12__Impl rule__Talk__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Talk__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__13();

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
    // $ANTLR end "rule__Talk__Group__12"


    // $ANTLR start "rule__Talk__Group__12__Impl"
    // InternalAgendomat.g:4027:1: rule__Talk__Group__12__Impl : ( ')' ) ;
    public final void rule__Talk__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4031:1: ( ( ')' ) )
            // InternalAgendomat.g:4032:1: ( ')' )
            {
            // InternalAgendomat.g:4032:1: ( ')' )
            // InternalAgendomat.g:4033:2: ')'
            {
             before(grammarAccess.getTalkAccess().getRightParenthesisKeyword_12()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__12__Impl"


    // $ANTLR start "rule__Talk__Group__13"
    // InternalAgendomat.g:4042:1: rule__Talk__Group__13 : rule__Talk__Group__13__Impl ;
    public final void rule__Talk__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4046:1: ( rule__Talk__Group__13__Impl )
            // InternalAgendomat.g:4047:2: rule__Talk__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__13__Impl();

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
    // $ANTLR end "rule__Talk__Group__13"


    // $ANTLR start "rule__Talk__Group__13__Impl"
    // InternalAgendomat.g:4053:1: rule__Talk__Group__13__Impl : ( '}' ) ;
    public final void rule__Talk__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4057:1: ( ( '}' ) )
            // InternalAgendomat.g:4058:1: ( '}' )
            {
            // InternalAgendomat.g:4058:1: ( '}' )
            // InternalAgendomat.g:4059:2: '}'
            {
             before(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__13__Impl"


    // $ANTLR start "rule__Talk__Group_11__0"
    // InternalAgendomat.g:4069:1: rule__Talk__Group_11__0 : rule__Talk__Group_11__0__Impl rule__Talk__Group_11__1 ;
    public final void rule__Talk__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4073:1: ( rule__Talk__Group_11__0__Impl rule__Talk__Group_11__1 )
            // InternalAgendomat.g:4074:2: rule__Talk__Group_11__0__Impl rule__Talk__Group_11__1
            {
            pushFollow(FOLLOW_10);
            rule__Talk__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_11__1();

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
    // $ANTLR end "rule__Talk__Group_11__0"


    // $ANTLR start "rule__Talk__Group_11__0__Impl"
    // InternalAgendomat.g:4081:1: rule__Talk__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4085:1: ( ( ',' ) )
            // InternalAgendomat.g:4086:1: ( ',' )
            {
            // InternalAgendomat.g:4086:1: ( ',' )
            // InternalAgendomat.g:4087:2: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_11_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_11__0__Impl"


    // $ANTLR start "rule__Talk__Group_11__1"
    // InternalAgendomat.g:4096:1: rule__Talk__Group_11__1 : rule__Talk__Group_11__1__Impl ;
    public final void rule__Talk__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4100:1: ( rule__Talk__Group_11__1__Impl )
            // InternalAgendomat.g:4101:2: rule__Talk__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_11__1__Impl();

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
    // $ANTLR end "rule__Talk__Group_11__1"


    // $ANTLR start "rule__Talk__Group_11__1__Impl"
    // InternalAgendomat.g:4107:1: rule__Talk__Group_11__1__Impl : ( ( rule__Talk__PresentersAssignment_11_1 ) ) ;
    public final void rule__Talk__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4111:1: ( ( ( rule__Talk__PresentersAssignment_11_1 ) ) )
            // InternalAgendomat.g:4112:1: ( ( rule__Talk__PresentersAssignment_11_1 ) )
            {
            // InternalAgendomat.g:4112:1: ( ( rule__Talk__PresentersAssignment_11_1 ) )
            // InternalAgendomat.g:4113:2: ( rule__Talk__PresentersAssignment_11_1 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_11_1()); 
            // InternalAgendomat.g:4114:2: ( rule__Talk__PresentersAssignment_11_1 )
            // InternalAgendomat.g:4114:3: rule__Talk__PresentersAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__PresentersAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_11__1__Impl"


    // $ANTLR start "rule__Equipment__Group__0"
    // InternalAgendomat.g:4123:1: rule__Equipment__Group__0 : rule__Equipment__Group__0__Impl rule__Equipment__Group__1 ;
    public final void rule__Equipment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4127:1: ( rule__Equipment__Group__0__Impl rule__Equipment__Group__1 )
            // InternalAgendomat.g:4128:2: rule__Equipment__Group__0__Impl rule__Equipment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Equipment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group__1();

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
    // $ANTLR end "rule__Equipment__Group__0"


    // $ANTLR start "rule__Equipment__Group__0__Impl"
    // InternalAgendomat.g:4135:1: rule__Equipment__Group__0__Impl : ( 'Equipment' ) ;
    public final void rule__Equipment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4139:1: ( ( 'Equipment' ) )
            // InternalAgendomat.g:4140:1: ( 'Equipment' )
            {
            // InternalAgendomat.g:4140:1: ( 'Equipment' )
            // InternalAgendomat.g:4141:2: 'Equipment'
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getEquipmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__0__Impl"


    // $ANTLR start "rule__Equipment__Group__1"
    // InternalAgendomat.g:4150:1: rule__Equipment__Group__1 : rule__Equipment__Group__1__Impl rule__Equipment__Group__2 ;
    public final void rule__Equipment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4154:1: ( rule__Equipment__Group__1__Impl rule__Equipment__Group__2 )
            // InternalAgendomat.g:4155:2: rule__Equipment__Group__1__Impl rule__Equipment__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Equipment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group__2();

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
    // $ANTLR end "rule__Equipment__Group__1"


    // $ANTLR start "rule__Equipment__Group__1__Impl"
    // InternalAgendomat.g:4162:1: rule__Equipment__Group__1__Impl : ( '{' ) ;
    public final void rule__Equipment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4166:1: ( ( '{' ) )
            // InternalAgendomat.g:4167:1: ( '{' )
            {
            // InternalAgendomat.g:4167:1: ( '{' )
            // InternalAgendomat.g:4168:2: '{'
            {
             before(grammarAccess.getEquipmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__1__Impl"


    // $ANTLR start "rule__Equipment__Group__2"
    // InternalAgendomat.g:4177:1: rule__Equipment__Group__2 : rule__Equipment__Group__2__Impl rule__Equipment__Group__3 ;
    public final void rule__Equipment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4181:1: ( rule__Equipment__Group__2__Impl rule__Equipment__Group__3 )
            // InternalAgendomat.g:4182:2: rule__Equipment__Group__2__Impl rule__Equipment__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Equipment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group__3();

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
    // $ANTLR end "rule__Equipment__Group__2"


    // $ANTLR start "rule__Equipment__Group__2__Impl"
    // InternalAgendomat.g:4189:1: rule__Equipment__Group__2__Impl : ( 'equipmentName' ) ;
    public final void rule__Equipment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4193:1: ( ( 'equipmentName' ) )
            // InternalAgendomat.g:4194:1: ( 'equipmentName' )
            {
            // InternalAgendomat.g:4194:1: ( 'equipmentName' )
            // InternalAgendomat.g:4195:2: 'equipmentName'
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentNameKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getEquipmentNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__2__Impl"


    // $ANTLR start "rule__Equipment__Group__3"
    // InternalAgendomat.g:4204:1: rule__Equipment__Group__3 : rule__Equipment__Group__3__Impl rule__Equipment__Group__4 ;
    public final void rule__Equipment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4208:1: ( rule__Equipment__Group__3__Impl rule__Equipment__Group__4 )
            // InternalAgendomat.g:4209:2: rule__Equipment__Group__3__Impl rule__Equipment__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Equipment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group__4();

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
    // $ANTLR end "rule__Equipment__Group__3"


    // $ANTLR start "rule__Equipment__Group__3__Impl"
    // InternalAgendomat.g:4216:1: rule__Equipment__Group__3__Impl : ( ( rule__Equipment__EquipmentNameAssignment_3 ) ) ;
    public final void rule__Equipment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4220:1: ( ( ( rule__Equipment__EquipmentNameAssignment_3 ) ) )
            // InternalAgendomat.g:4221:1: ( ( rule__Equipment__EquipmentNameAssignment_3 ) )
            {
            // InternalAgendomat.g:4221:1: ( ( rule__Equipment__EquipmentNameAssignment_3 ) )
            // InternalAgendomat.g:4222:2: ( rule__Equipment__EquipmentNameAssignment_3 )
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentNameAssignment_3()); 
            // InternalAgendomat.g:4223:2: ( rule__Equipment__EquipmentNameAssignment_3 )
            // InternalAgendomat.g:4223:3: rule__Equipment__EquipmentNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__EquipmentNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEquipmentAccess().getEquipmentNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__3__Impl"


    // $ANTLR start "rule__Equipment__Group__4"
    // InternalAgendomat.g:4231:1: rule__Equipment__Group__4 : rule__Equipment__Group__4__Impl rule__Equipment__Group__5 ;
    public final void rule__Equipment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4235:1: ( rule__Equipment__Group__4__Impl rule__Equipment__Group__5 )
            // InternalAgendomat.g:4236:2: rule__Equipment__Group__4__Impl rule__Equipment__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Equipment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group__5();

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
    // $ANTLR end "rule__Equipment__Group__4"


    // $ANTLR start "rule__Equipment__Group__4__Impl"
    // InternalAgendomat.g:4243:1: rule__Equipment__Group__4__Impl : ( ( rule__Equipment__Group_4__0 )? ) ;
    public final void rule__Equipment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4247:1: ( ( ( rule__Equipment__Group_4__0 )? ) )
            // InternalAgendomat.g:4248:1: ( ( rule__Equipment__Group_4__0 )? )
            {
            // InternalAgendomat.g:4248:1: ( ( rule__Equipment__Group_4__0 )? )
            // InternalAgendomat.g:4249:2: ( rule__Equipment__Group_4__0 )?
            {
             before(grammarAccess.getEquipmentAccess().getGroup_4()); 
            // InternalAgendomat.g:4250:2: ( rule__Equipment__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAgendomat.g:4250:3: rule__Equipment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equipment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquipmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__4__Impl"


    // $ANTLR start "rule__Equipment__Group__5"
    // InternalAgendomat.g:4258:1: rule__Equipment__Group__5 : rule__Equipment__Group__5__Impl ;
    public final void rule__Equipment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4262:1: ( rule__Equipment__Group__5__Impl )
            // InternalAgendomat.g:4263:2: rule__Equipment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__Group__5__Impl();

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
    // $ANTLR end "rule__Equipment__Group__5"


    // $ANTLR start "rule__Equipment__Group__5__Impl"
    // InternalAgendomat.g:4269:1: rule__Equipment__Group__5__Impl : ( '}' ) ;
    public final void rule__Equipment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4273:1: ( ( '}' ) )
            // InternalAgendomat.g:4274:1: ( '}' )
            {
            // InternalAgendomat.g:4274:1: ( '}' )
            // InternalAgendomat.g:4275:2: '}'
            {
             before(grammarAccess.getEquipmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group__5__Impl"


    // $ANTLR start "rule__Equipment__Group_4__0"
    // InternalAgendomat.g:4285:1: rule__Equipment__Group_4__0 : rule__Equipment__Group_4__0__Impl rule__Equipment__Group_4__1 ;
    public final void rule__Equipment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4289:1: ( rule__Equipment__Group_4__0__Impl rule__Equipment__Group_4__1 )
            // InternalAgendomat.g:4290:2: rule__Equipment__Group_4__0__Impl rule__Equipment__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Equipment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equipment__Group_4__1();

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
    // $ANTLR end "rule__Equipment__Group_4__0"


    // $ANTLR start "rule__Equipment__Group_4__0__Impl"
    // InternalAgendomat.g:4297:1: rule__Equipment__Group_4__0__Impl : ( 'equipmentType' ) ;
    public final void rule__Equipment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4301:1: ( ( 'equipmentType' ) )
            // InternalAgendomat.g:4302:1: ( 'equipmentType' )
            {
            // InternalAgendomat.g:4302:1: ( 'equipmentType' )
            // InternalAgendomat.g:4303:2: 'equipmentType'
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentTypeKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getEquipmentTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group_4__0__Impl"


    // $ANTLR start "rule__Equipment__Group_4__1"
    // InternalAgendomat.g:4312:1: rule__Equipment__Group_4__1 : rule__Equipment__Group_4__1__Impl ;
    public final void rule__Equipment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4316:1: ( rule__Equipment__Group_4__1__Impl )
            // InternalAgendomat.g:4317:2: rule__Equipment__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__Group_4__1__Impl();

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
    // $ANTLR end "rule__Equipment__Group_4__1"


    // $ANTLR start "rule__Equipment__Group_4__1__Impl"
    // InternalAgendomat.g:4323:1: rule__Equipment__Group_4__1__Impl : ( ( rule__Equipment__EquipmentTypeAssignment_4_1 ) ) ;
    public final void rule__Equipment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4327:1: ( ( ( rule__Equipment__EquipmentTypeAssignment_4_1 ) ) )
            // InternalAgendomat.g:4328:1: ( ( rule__Equipment__EquipmentTypeAssignment_4_1 ) )
            {
            // InternalAgendomat.g:4328:1: ( ( rule__Equipment__EquipmentTypeAssignment_4_1 ) )
            // InternalAgendomat.g:4329:2: ( rule__Equipment__EquipmentTypeAssignment_4_1 )
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentTypeAssignment_4_1()); 
            // InternalAgendomat.g:4330:2: ( rule__Equipment__EquipmentTypeAssignment_4_1 )
            // InternalAgendomat.g:4330:3: rule__Equipment__EquipmentTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__EquipmentTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEquipmentAccess().getEquipmentTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__Group_4__1__Impl"


    // $ANTLR start "rule__Model__EventsAssignment_3_2"
    // InternalAgendomat.g:4339:1: rule__Model__EventsAssignment_3_2 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4343:1: ( ( ruleEvent ) )
            // InternalAgendomat.g:4344:2: ( ruleEvent )
            {
            // InternalAgendomat.g:4344:2: ( ruleEvent )
            // InternalAgendomat.g:4345:3: ruleEvent
            {
             before(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventsAssignment_3_2"


    // $ANTLR start "rule__Model__EventsAssignment_3_3_1"
    // InternalAgendomat.g:4354:1: rule__Model__EventsAssignment_3_3_1 : ( ruleEvent ) ;
    public final void rule__Model__EventsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4358:1: ( ( ruleEvent ) )
            // InternalAgendomat.g:4359:2: ( ruleEvent )
            {
            // InternalAgendomat.g:4359:2: ( ruleEvent )
            // InternalAgendomat.g:4360:3: ruleEvent
            {
             before(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventsAssignment_3_3_1"


    // $ANTLR start "rule__Event__EventNameAssignment_3"
    // InternalAgendomat.g:4369:1: rule__Event__EventNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Event__EventNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4373:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4374:2: ( ruleEString )
            {
            // InternalAgendomat.g:4374:2: ( ruleEString )
            // InternalAgendomat.g:4375:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getEventNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment_3"


    // $ANTLR start "rule__Event__EventStartDateAssignment_5"
    // InternalAgendomat.g:4384:1: rule__Event__EventStartDateAssignment_5 : ( ruleEString ) ;
    public final void rule__Event__EventStartDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4388:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4389:2: ( ruleEString )
            {
            // InternalAgendomat.g:4389:2: ( ruleEString )
            // InternalAgendomat.g:4390:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getEventStartDateEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventStartDateEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventStartDateAssignment_5"


    // $ANTLR start "rule__Event__EventEndDateAssignment_7"
    // InternalAgendomat.g:4399:1: rule__Event__EventEndDateAssignment_7 : ( ruleEString ) ;
    public final void rule__Event__EventEndDateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4403:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4404:2: ( ruleEString )
            {
            // InternalAgendomat.g:4404:2: ( ruleEString )
            // InternalAgendomat.g:4405:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getEventEndDateEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventEndDateEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventEndDateAssignment_7"


    // $ANTLR start "rule__Event__DescAssignment_8_1"
    // InternalAgendomat.g:4414:1: rule__Event__DescAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Event__DescAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4418:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4419:2: ( ruleEString )
            {
            // InternalAgendomat.g:4419:2: ( ruleEString )
            // InternalAgendomat.g:4420:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getDescEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getDescEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DescAssignment_8_1"


    // $ANTLR start "rule__Event__PersonsAssignment_9_2"
    // InternalAgendomat.g:4429:1: rule__Event__PersonsAssignment_9_2 : ( rulePerson ) ;
    public final void rule__Event__PersonsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4433:1: ( ( rulePerson ) )
            // InternalAgendomat.g:4434:2: ( rulePerson )
            {
            // InternalAgendomat.g:4434:2: ( rulePerson )
            // InternalAgendomat.g:4435:3: rulePerson
            {
             before(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__PersonsAssignment_9_2"


    // $ANTLR start "rule__Event__PersonsAssignment_9_3_1"
    // InternalAgendomat.g:4444:1: rule__Event__PersonsAssignment_9_3_1 : ( rulePerson ) ;
    public final void rule__Event__PersonsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4448:1: ( ( rulePerson ) )
            // InternalAgendomat.g:4449:2: ( rulePerson )
            {
            // InternalAgendomat.g:4449:2: ( rulePerson )
            // InternalAgendomat.g:4450:3: rulePerson
            {
             before(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__PersonsAssignment_9_3_1"


    // $ANTLR start "rule__Event__ProgramItemsAssignment_10_2"
    // InternalAgendomat.g:4459:1: rule__Event__ProgramItemsAssignment_10_2 : ( ruleProgramItem ) ;
    public final void rule__Event__ProgramItemsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4463:1: ( ( ruleProgramItem ) )
            // InternalAgendomat.g:4464:2: ( ruleProgramItem )
            {
            // InternalAgendomat.g:4464:2: ( ruleProgramItem )
            // InternalAgendomat.g:4465:3: ruleProgramItem
            {
             before(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProgramItem();

            state._fsp--;

             after(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ProgramItemsAssignment_10_2"


    // $ANTLR start "rule__Event__ProgramItemsAssignment_10_3_1"
    // InternalAgendomat.g:4474:1: rule__Event__ProgramItemsAssignment_10_3_1 : ( ruleProgramItem ) ;
    public final void rule__Event__ProgramItemsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4478:1: ( ( ruleProgramItem ) )
            // InternalAgendomat.g:4479:2: ( ruleProgramItem )
            {
            // InternalAgendomat.g:4479:2: ( ruleProgramItem )
            // InternalAgendomat.g:4480:3: ruleProgramItem
            {
             before(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgramItem();

            state._fsp--;

             after(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ProgramItemsAssignment_10_3_1"


    // $ANTLR start "rule__Event__LocationsAssignment_11_2"
    // InternalAgendomat.g:4489:1: rule__Event__LocationsAssignment_11_2 : ( ruleLocation ) ;
    public final void rule__Event__LocationsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4493:1: ( ( ruleLocation ) )
            // InternalAgendomat.g:4494:2: ( ruleLocation )
            {
            // InternalAgendomat.g:4494:2: ( ruleLocation )
            // InternalAgendomat.g:4495:3: ruleLocation
            {
             before(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LocationsAssignment_11_2"


    // $ANTLR start "rule__Event__LocationsAssignment_11_3_1"
    // InternalAgendomat.g:4504:1: rule__Event__LocationsAssignment_11_3_1 : ( ruleLocation ) ;
    public final void rule__Event__LocationsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4508:1: ( ( ruleLocation ) )
            // InternalAgendomat.g:4509:2: ( ruleLocation )
            {
            // InternalAgendomat.g:4509:2: ( ruleLocation )
            // InternalAgendomat.g:4510:3: ruleLocation
            {
             before(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LocationsAssignment_11_3_1"


    // $ANTLR start "rule__Person__PersonNameAssignment_3"
    // InternalAgendomat.g:4519:1: rule__Person__PersonNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Person__PersonNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4523:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4524:2: ( ruleEString )
            {
            // InternalAgendomat.g:4524:2: ( ruleEString )
            // InternalAgendomat.g:4525:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getPersonNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPersonNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PersonNameAssignment_3"


    // $ANTLR start "rule__Person__RolesAssignment_6"
    // InternalAgendomat.g:4534:1: rule__Person__RolesAssignment_6 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4538:1: ( ( ruleRole ) )
            // InternalAgendomat.g:4539:2: ( ruleRole )
            {
            // InternalAgendomat.g:4539:2: ( ruleRole )
            // InternalAgendomat.g:4540:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_6"


    // $ANTLR start "rule__Person__RolesAssignment_7_1"
    // InternalAgendomat.g:4549:1: rule__Person__RolesAssignment_7_1 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4553:1: ( ( ruleRole ) )
            // InternalAgendomat.g:4554:2: ( ruleRole )
            {
            // InternalAgendomat.g:4554:2: ( ruleRole )
            // InternalAgendomat.g:4555:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_7_1"


    // $ANTLR start "rule__Location__LocationNameAssignment_3"
    // InternalAgendomat.g:4564:1: rule__Location__LocationNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Location__LocationNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4568:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4569:2: ( ruleEString )
            {
            // InternalAgendomat.g:4569:2: ( ruleEString )
            // InternalAgendomat.g:4570:3: ruleEString
            {
             before(grammarAccess.getLocationAccess().getLocationNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLocationNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LocationNameAssignment_3"


    // $ANTLR start "rule__Location__LocationTypeAssignment_5"
    // InternalAgendomat.g:4579:1: rule__Location__LocationTypeAssignment_5 : ( ruleLocationType ) ;
    public final void rule__Location__LocationTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4583:1: ( ( ruleLocationType ) )
            // InternalAgendomat.g:4584:2: ( ruleLocationType )
            {
            // InternalAgendomat.g:4584:2: ( ruleLocationType )
            // InternalAgendomat.g:4585:3: ruleLocationType
            {
             before(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLocationType();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LocationTypeAssignment_5"


    // $ANTLR start "rule__Session__SessionNameAssignment_3"
    // InternalAgendomat.g:4594:1: rule__Session__SessionNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Session__SessionNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4598:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4599:2: ( ruleEString )
            {
            // InternalAgendomat.g:4599:2: ( ruleEString )
            // InternalAgendomat.g:4600:3: ruleEString
            {
             before(grammarAccess.getSessionAccess().getSessionNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getSessionNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__SessionNameAssignment_3"


    // $ANTLR start "rule__Session__StartTimeAssignment_5"
    // InternalAgendomat.g:4609:1: rule__Session__StartTimeAssignment_5 : ( ruleEString ) ;
    public final void rule__Session__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4613:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4614:2: ( ruleEString )
            {
            // InternalAgendomat.g:4614:2: ( ruleEString )
            // InternalAgendomat.g:4615:3: ruleEString
            {
             before(grammarAccess.getSessionAccess().getStartTimeEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getStartTimeEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartTimeAssignment_5"


    // $ANTLR start "rule__Session__EndTimeAssignment_7"
    // InternalAgendomat.g:4624:1: rule__Session__EndTimeAssignment_7 : ( ruleEString ) ;
    public final void rule__Session__EndTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4628:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4629:2: ( ruleEString )
            {
            // InternalAgendomat.g:4629:2: ( ruleEString )
            // InternalAgendomat.g:4630:3: ruleEString
            {
             before(grammarAccess.getSessionAccess().getEndTimeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEndTimeEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndTimeAssignment_7"


    // $ANTLR start "rule__Session__LocationAssignment_9"
    // InternalAgendomat.g:4639:1: rule__Session__LocationAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Session__LocationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4643:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4644:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4644:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4645:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getLocationLocationCrossReference_9_0()); 
            // InternalAgendomat.g:4646:3: ( ruleEString )
            // InternalAgendomat.g:4647:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getLocationLocationEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getLocationLocationEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getLocationLocationCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__LocationAssignment_9"


    // $ANTLR start "rule__Session__TechSupportAssignment_10_2"
    // InternalAgendomat.g:4658:1: rule__Session__TechSupportAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Session__TechSupportAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4662:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4663:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4663:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4664:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_2_0()); 
            // InternalAgendomat.g:4665:3: ( ruleEString )
            // InternalAgendomat.g:4666:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTechSupportPersonEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TechSupportAssignment_10_2"


    // $ANTLR start "rule__Session__TechSupportAssignment_10_3_1"
    // InternalAgendomat.g:4677:1: rule__Session__TechSupportAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Session__TechSupportAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4681:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4682:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4682:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4683:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_3_1_0()); 
            // InternalAgendomat.g:4684:3: ( ruleEString )
            // InternalAgendomat.g:4685:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTechSupportPersonEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TechSupportAssignment_10_3_1"


    // $ANTLR start "rule__Session__TalksAssignment_11_2"
    // InternalAgendomat.g:4696:1: rule__Session__TalksAssignment_11_2 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4700:1: ( ( ruleTalk ) )
            // InternalAgendomat.g:4701:2: ( ruleTalk )
            {
            // InternalAgendomat.g:4701:2: ( ruleTalk )
            // InternalAgendomat.g:4702:3: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_11_2"


    // $ANTLR start "rule__Session__TalksAssignment_11_3_1"
    // InternalAgendomat.g:4711:1: rule__Session__TalksAssignment_11_3_1 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4715:1: ( ( ruleTalk ) )
            // InternalAgendomat.g:4716:2: ( ruleTalk )
            {
            // InternalAgendomat.g:4716:2: ( ruleTalk )
            // InternalAgendomat.g:4717:3: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_11_3_1"


    // $ANTLR start "rule__Session__EquipmentAssignment_12_2"
    // InternalAgendomat.g:4726:1: rule__Session__EquipmentAssignment_12_2 : ( ruleEquipment ) ;
    public final void rule__Session__EquipmentAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4730:1: ( ( ruleEquipment ) )
            // InternalAgendomat.g:4731:2: ( ruleEquipment )
            {
            // InternalAgendomat.g:4731:2: ( ruleEquipment )
            // InternalAgendomat.g:4732:3: ruleEquipment
            {
             before(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquipment();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EquipmentAssignment_12_2"


    // $ANTLR start "rule__Session__EquipmentAssignment_12_3_1"
    // InternalAgendomat.g:4741:1: rule__Session__EquipmentAssignment_12_3_1 : ( ruleEquipment ) ;
    public final void rule__Session__EquipmentAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4745:1: ( ( ruleEquipment ) )
            // InternalAgendomat.g:4746:2: ( ruleEquipment )
            {
            // InternalAgendomat.g:4746:2: ( ruleEquipment )
            // InternalAgendomat.g:4747:3: ruleEquipment
            {
             before(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquipment();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EquipmentAssignment_12_3_1"


    // $ANTLR start "rule__Break__BreakNameAssignment_3"
    // InternalAgendomat.g:4756:1: rule__Break__BreakNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Break__BreakNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4760:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4761:2: ( ruleEString )
            {
            // InternalAgendomat.g:4761:2: ( ruleEString )
            // InternalAgendomat.g:4762:3: ruleEString
            {
             before(grammarAccess.getBreakAccess().getBreakNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getBreakNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__BreakNameAssignment_3"


    // $ANTLR start "rule__Break__StartTimeAssignment_5"
    // InternalAgendomat.g:4771:1: rule__Break__StartTimeAssignment_5 : ( ruleEString ) ;
    public final void rule__Break__StartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4775:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4776:2: ( ruleEString )
            {
            // InternalAgendomat.g:4776:2: ( ruleEString )
            // InternalAgendomat.g:4777:3: ruleEString
            {
             before(grammarAccess.getBreakAccess().getStartTimeEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getStartTimeEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__StartTimeAssignment_5"


    // $ANTLR start "rule__Break__EndTimeAssignment_7"
    // InternalAgendomat.g:4786:1: rule__Break__EndTimeAssignment_7 : ( ruleEString ) ;
    public final void rule__Break__EndTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4790:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4791:2: ( ruleEString )
            {
            // InternalAgendomat.g:4791:2: ( ruleEString )
            // InternalAgendomat.g:4792:3: ruleEString
            {
             before(grammarAccess.getBreakAccess().getEndTimeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getEndTimeEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__EndTimeAssignment_7"


    // $ANTLR start "rule__Break__LocationAssignment_9"
    // InternalAgendomat.g:4801:1: rule__Break__LocationAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Break__LocationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4805:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4806:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4806:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4807:3: ( ruleEString )
            {
             before(grammarAccess.getBreakAccess().getLocationLocationCrossReference_9_0()); 
            // InternalAgendomat.g:4808:3: ( ruleEString )
            // InternalAgendomat.g:4809:4: ruleEString
            {
             before(grammarAccess.getBreakAccess().getLocationLocationEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getLocationLocationEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getLocationLocationCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__LocationAssignment_9"


    // $ANTLR start "rule__Break__AnimatorsAssignment_10_2"
    // InternalAgendomat.g:4820:1: rule__Break__AnimatorsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Break__AnimatorsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4824:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4825:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4825:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4826:3: ( ruleEString )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_2_0()); 
            // InternalAgendomat.g:4827:3: ( ruleEString )
            // InternalAgendomat.g:4828:4: ruleEString
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getAnimatorsPersonEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__AnimatorsAssignment_10_2"


    // $ANTLR start "rule__Break__AnimatorsAssignment_10_3_1"
    // InternalAgendomat.g:4839:1: rule__Break__AnimatorsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Break__AnimatorsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4843:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4844:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4844:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4845:3: ( ruleEString )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_3_1_0()); 
            // InternalAgendomat.g:4846:3: ( ruleEString )
            // InternalAgendomat.g:4847:4: ruleEString
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreakAccess().getAnimatorsPersonEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__AnimatorsAssignment_10_3_1"


    // $ANTLR start "rule__Talk__TalkNameAssignment_3"
    // InternalAgendomat.g:4858:1: rule__Talk__TalkNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Talk__TalkNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4862:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4863:2: ( ruleEString )
            {
            // InternalAgendomat.g:4863:2: ( ruleEString )
            // InternalAgendomat.g:4864:3: ruleEString
            {
             before(grammarAccess.getTalkAccess().getTalkNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getTalkNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkNameAssignment_3"


    // $ANTLR start "rule__Talk__TalkStartTimeAssignment_5"
    // InternalAgendomat.g:4873:1: rule__Talk__TalkStartTimeAssignment_5 : ( ruleEString ) ;
    public final void rule__Talk__TalkStartTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4877:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4878:2: ( ruleEString )
            {
            // InternalAgendomat.g:4878:2: ( ruleEString )
            // InternalAgendomat.g:4879:3: ruleEString
            {
             before(grammarAccess.getTalkAccess().getTalkStartTimeEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getTalkStartTimeEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkStartTimeAssignment_5"


    // $ANTLR start "rule__Talk__TalkEndTimeAssignment_7"
    // InternalAgendomat.g:4888:1: rule__Talk__TalkEndTimeAssignment_7 : ( ruleEString ) ;
    public final void rule__Talk__TalkEndTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4892:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4893:2: ( ruleEString )
            {
            // InternalAgendomat.g:4893:2: ( ruleEString )
            // InternalAgendomat.g:4894:3: ruleEString
            {
             before(grammarAccess.getTalkAccess().getTalkEndTimeEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getTalkEndTimeEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkEndTimeAssignment_7"


    // $ANTLR start "rule__Talk__PresentersAssignment_10"
    // InternalAgendomat.g:4903:1: rule__Talk__PresentersAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__Talk__PresentersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4907:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4908:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4908:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4909:3: ( ruleEString )
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_0()); 
            // InternalAgendomat.g:4910:3: ( ruleEString )
            // InternalAgendomat.g:4911:4: ruleEString
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getPresentersPersonEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__PresentersAssignment_10"


    // $ANTLR start "rule__Talk__PresentersAssignment_11_1"
    // InternalAgendomat.g:4922:1: rule__Talk__PresentersAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Talk__PresentersAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4926:1: ( ( ( ruleEString ) ) )
            // InternalAgendomat.g:4927:2: ( ( ruleEString ) )
            {
            // InternalAgendomat.g:4927:2: ( ( ruleEString ) )
            // InternalAgendomat.g:4928:3: ( ruleEString )
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_11_1_0()); 
            // InternalAgendomat.g:4929:3: ( ruleEString )
            // InternalAgendomat.g:4930:4: ruleEString
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getPresentersPersonEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__PresentersAssignment_11_1"


    // $ANTLR start "rule__Equipment__EquipmentNameAssignment_3"
    // InternalAgendomat.g:4941:1: rule__Equipment__EquipmentNameAssignment_3 : ( ruleEString ) ;
    public final void rule__Equipment__EquipmentNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4945:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4946:2: ( ruleEString )
            {
            // InternalAgendomat.g:4946:2: ( ruleEString )
            // InternalAgendomat.g:4947:3: ruleEString
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEquipmentAccess().getEquipmentNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__EquipmentNameAssignment_3"


    // $ANTLR start "rule__Equipment__EquipmentTypeAssignment_4_1"
    // InternalAgendomat.g:4956:1: rule__Equipment__EquipmentTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Equipment__EquipmentTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:4960:1: ( ( ruleEString ) )
            // InternalAgendomat.g:4961:2: ( ruleEString )
            {
            // InternalAgendomat.g:4961:2: ( ruleEString )
            // InternalAgendomat.g:4962:3: ruleEString
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEquipmentAccess().getEquipmentTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__EquipmentTypeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000190000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000040000L});

}