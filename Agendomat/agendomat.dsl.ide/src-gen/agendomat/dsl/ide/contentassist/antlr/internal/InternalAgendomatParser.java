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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Presenter'", "'TechSupport'", "'Animator'", "'Room'", "'BreakArea'", "'Event'", "'{'", "'}'", "'from'", "'to'", "'on'", "'Description'", "'Person'", "'roles'", "'['", "']'", "','", "'Location'", "'type'", "'Session'", "'Time'", "'-'", "'('", "')'", "'Needs'", "'Break'", "'Talk'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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



    // $ANTLR start "entryRuleEvent"
    // InternalAgendomat.g:53:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalAgendomat.g:54:1: ( ruleEvent EOF )
            // InternalAgendomat.g:55:1: ruleEvent EOF
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
    // InternalAgendomat.g:62:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:66:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalAgendomat.g:67:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalAgendomat.g:67:2: ( ( rule__Event__Group__0 ) )
            // InternalAgendomat.g:68:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalAgendomat.g:69:3: ( rule__Event__Group__0 )
            // InternalAgendomat.g:69:4: rule__Event__Group__0
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


    // $ANTLR start "entryRulePerson"
    // InternalAgendomat.g:103:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalAgendomat.g:104:1: ( rulePerson EOF )
            // InternalAgendomat.g:105:1: rulePerson EOF
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
    // InternalAgendomat.g:112:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:116:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalAgendomat.g:117:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalAgendomat.g:117:2: ( ( rule__Person__Group__0 ) )
            // InternalAgendomat.g:118:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalAgendomat.g:119:3: ( rule__Person__Group__0 )
            // InternalAgendomat.g:119:4: rule__Person__Group__0
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
    // InternalAgendomat.g:128:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalAgendomat.g:129:1: ( ruleLocation EOF )
            // InternalAgendomat.g:130:1: ruleLocation EOF
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
    // InternalAgendomat.g:137:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:141:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalAgendomat.g:142:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalAgendomat.g:142:2: ( ( rule__Location__Group__0 ) )
            // InternalAgendomat.g:143:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalAgendomat.g:144:3: ( rule__Location__Group__0 )
            // InternalAgendomat.g:144:4: rule__Location__Group__0
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
    // InternalAgendomat.g:153:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalAgendomat.g:154:1: ( ruleSession EOF )
            // InternalAgendomat.g:155:1: ruleSession EOF
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
    // InternalAgendomat.g:162:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:166:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalAgendomat.g:167:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalAgendomat.g:167:2: ( ( rule__Session__Group__0 ) )
            // InternalAgendomat.g:168:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalAgendomat.g:169:3: ( rule__Session__Group__0 )
            // InternalAgendomat.g:169:4: rule__Session__Group__0
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
    // InternalAgendomat.g:178:1: entryRuleBreak : ruleBreak EOF ;
    public final void entryRuleBreak() throws RecognitionException {
        try {
            // InternalAgendomat.g:179:1: ( ruleBreak EOF )
            // InternalAgendomat.g:180:1: ruleBreak EOF
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
    // InternalAgendomat.g:187:1: ruleBreak : ( ( rule__Break__Group__0 ) ) ;
    public final void ruleBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:191:2: ( ( ( rule__Break__Group__0 ) ) )
            // InternalAgendomat.g:192:2: ( ( rule__Break__Group__0 ) )
            {
            // InternalAgendomat.g:192:2: ( ( rule__Break__Group__0 ) )
            // InternalAgendomat.g:193:3: ( rule__Break__Group__0 )
            {
             before(grammarAccess.getBreakAccess().getGroup()); 
            // InternalAgendomat.g:194:3: ( rule__Break__Group__0 )
            // InternalAgendomat.g:194:4: rule__Break__Group__0
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
    // InternalAgendomat.g:203:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // InternalAgendomat.g:204:1: ( ruleTalk EOF )
            // InternalAgendomat.g:205:1: ruleTalk EOF
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
    // InternalAgendomat.g:212:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:216:2: ( ( ( rule__Talk__Group__0 ) ) )
            // InternalAgendomat.g:217:2: ( ( rule__Talk__Group__0 ) )
            {
            // InternalAgendomat.g:217:2: ( ( rule__Talk__Group__0 ) )
            // InternalAgendomat.g:218:3: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // InternalAgendomat.g:219:3: ( rule__Talk__Group__0 )
            // InternalAgendomat.g:219:4: rule__Talk__Group__0
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
    // InternalAgendomat.g:228:1: entryRuleEquipment : ruleEquipment EOF ;
    public final void entryRuleEquipment() throws RecognitionException {
        try {
            // InternalAgendomat.g:229:1: ( ruleEquipment EOF )
            // InternalAgendomat.g:230:1: ruleEquipment EOF
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
    // InternalAgendomat.g:237:1: ruleEquipment : ( ( rule__Equipment__EquipmentNameAssignment ) ) ;
    public final void ruleEquipment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:241:2: ( ( ( rule__Equipment__EquipmentNameAssignment ) ) )
            // InternalAgendomat.g:242:2: ( ( rule__Equipment__EquipmentNameAssignment ) )
            {
            // InternalAgendomat.g:242:2: ( ( rule__Equipment__EquipmentNameAssignment ) )
            // InternalAgendomat.g:243:3: ( rule__Equipment__EquipmentNameAssignment )
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentNameAssignment()); 
            // InternalAgendomat.g:244:3: ( rule__Equipment__EquipmentNameAssignment )
            // InternalAgendomat.g:244:4: rule__Equipment__EquipmentNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Equipment__EquipmentNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEquipmentAccess().getEquipmentNameAssignment()); 

            }


            }

        }
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
    // InternalAgendomat.g:253:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:257:1: ( ( ( rule__Role__Alternatives ) ) )
            // InternalAgendomat.g:258:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalAgendomat.g:258:2: ( ( rule__Role__Alternatives ) )
            // InternalAgendomat.g:259:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalAgendomat.g:260:3: ( rule__Role__Alternatives )
            // InternalAgendomat.g:260:4: rule__Role__Alternatives
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
    // InternalAgendomat.g:269:1: ruleLocationType : ( ( rule__LocationType__Alternatives ) ) ;
    public final void ruleLocationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:273:1: ( ( ( rule__LocationType__Alternatives ) ) )
            // InternalAgendomat.g:274:2: ( ( rule__LocationType__Alternatives ) )
            {
            // InternalAgendomat.g:274:2: ( ( rule__LocationType__Alternatives ) )
            // InternalAgendomat.g:275:3: ( rule__LocationType__Alternatives )
            {
             before(grammarAccess.getLocationTypeAccess().getAlternatives()); 
            // InternalAgendomat.g:276:3: ( rule__LocationType__Alternatives )
            // InternalAgendomat.g:276:4: rule__LocationType__Alternatives
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


    // $ANTLR start "rule__Event__Alternatives_2"
    // InternalAgendomat.g:284:1: rule__Event__Alternatives_2 : ( ( ( rule__Event__Group_2_0__0 ) ) | ( ( rule__Event__Group_2_1__0 ) ) );
    public final void rule__Event__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:288:1: ( ( ( rule__Event__Group_2_0__0 ) ) | ( ( rule__Event__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAgendomat.g:289:2: ( ( rule__Event__Group_2_0__0 ) )
                    {
                    // InternalAgendomat.g:289:2: ( ( rule__Event__Group_2_0__0 ) )
                    // InternalAgendomat.g:290:3: ( rule__Event__Group_2_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_2_0()); 
                    // InternalAgendomat.g:291:3: ( rule__Event__Group_2_0__0 )
                    // InternalAgendomat.g:291:4: rule__Event__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:295:2: ( ( rule__Event__Group_2_1__0 ) )
                    {
                    // InternalAgendomat.g:295:2: ( ( rule__Event__Group_2_1__0 ) )
                    // InternalAgendomat.g:296:3: ( rule__Event__Group_2_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_2_1()); 
                    // InternalAgendomat.g:297:3: ( rule__Event__Group_2_1__0 )
                    // InternalAgendomat.g:297:4: rule__Event__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Event__Alternatives_2"


    // $ANTLR start "rule__ProgramItem__Alternatives"
    // InternalAgendomat.g:305:1: rule__ProgramItem__Alternatives : ( ( ruleSession ) | ( ruleBreak ) );
    public final void rule__ProgramItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:309:1: ( ( ruleSession ) | ( ruleBreak ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAgendomat.g:310:2: ( ruleSession )
                    {
                    // InternalAgendomat.g:310:2: ( ruleSession )
                    // InternalAgendomat.g:311:3: ruleSession
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
                    // InternalAgendomat.g:316:2: ( ruleBreak )
                    {
                    // InternalAgendomat.g:316:2: ( ruleBreak )
                    // InternalAgendomat.g:317:3: ruleBreak
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


    // $ANTLR start "rule__Role__Alternatives"
    // InternalAgendomat.g:326:1: rule__Role__Alternatives : ( ( ( 'Presenter' ) ) | ( ( 'TechSupport' ) ) | ( ( 'Animator' ) ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:330:1: ( ( ( 'Presenter' ) ) | ( ( 'TechSupport' ) ) | ( ( 'Animator' ) ) )
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
                    // InternalAgendomat.g:331:2: ( ( 'Presenter' ) )
                    {
                    // InternalAgendomat.g:331:2: ( ( 'Presenter' ) )
                    // InternalAgendomat.g:332:3: ( 'Presenter' )
                    {
                     before(grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0()); 
                    // InternalAgendomat.g:333:3: ( 'Presenter' )
                    // InternalAgendomat.g:333:4: 'Presenter'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:337:2: ( ( 'TechSupport' ) )
                    {
                    // InternalAgendomat.g:337:2: ( ( 'TechSupport' ) )
                    // InternalAgendomat.g:338:3: ( 'TechSupport' )
                    {
                     before(grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1()); 
                    // InternalAgendomat.g:339:3: ( 'TechSupport' )
                    // InternalAgendomat.g:339:4: 'TechSupport'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAgendomat.g:343:2: ( ( 'Animator' ) )
                    {
                    // InternalAgendomat.g:343:2: ( ( 'Animator' ) )
                    // InternalAgendomat.g:344:3: ( 'Animator' )
                    {
                     before(grammarAccess.getRoleAccess().getAnimatorEnumLiteralDeclaration_2()); 
                    // InternalAgendomat.g:345:3: ( 'Animator' )
                    // InternalAgendomat.g:345:4: 'Animator'
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
    // InternalAgendomat.g:353:1: rule__LocationType__Alternatives : ( ( ( 'Room' ) ) | ( ( 'BreakArea' ) ) );
    public final void rule__LocationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:357:1: ( ( ( 'Room' ) ) | ( ( 'BreakArea' ) ) )
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
                    // InternalAgendomat.g:358:2: ( ( 'Room' ) )
                    {
                    // InternalAgendomat.g:358:2: ( ( 'Room' ) )
                    // InternalAgendomat.g:359:3: ( 'Room' )
                    {
                     before(grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0()); 
                    // InternalAgendomat.g:360:3: ( 'Room' )
                    // InternalAgendomat.g:360:4: 'Room'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:364:2: ( ( 'BreakArea' ) )
                    {
                    // InternalAgendomat.g:364:2: ( ( 'BreakArea' ) )
                    // InternalAgendomat.g:365:3: ( 'BreakArea' )
                    {
                     before(grammarAccess.getLocationTypeAccess().getBreakAreaEnumLiteralDeclaration_1()); 
                    // InternalAgendomat.g:366:3: ( 'BreakArea' )
                    // InternalAgendomat.g:366:4: 'BreakArea'
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


    // $ANTLR start "rule__Event__Group__0"
    // InternalAgendomat.g:374:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:378:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAgendomat.g:379:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:386:1: rule__Event__Group__0__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:390:1: ( ( 'Event' ) )
            // InternalAgendomat.g:391:1: ( 'Event' )
            {
            // InternalAgendomat.g:391:1: ( 'Event' )
            // InternalAgendomat.g:392:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAgendomat.g:401:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:405:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAgendomat.g:406:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAgendomat.g:413:1: rule__Event__Group__1__Impl : ( ( rule__Event__EventNameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:417:1: ( ( ( rule__Event__EventNameAssignment_1 ) ) )
            // InternalAgendomat.g:418:1: ( ( rule__Event__EventNameAssignment_1 ) )
            {
            // InternalAgendomat.g:418:1: ( ( rule__Event__EventNameAssignment_1 ) )
            // InternalAgendomat.g:419:2: ( rule__Event__EventNameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_1()); 
            // InternalAgendomat.g:420:2: ( rule__Event__EventNameAssignment_1 )
            // InternalAgendomat.g:420:3: rule__Event__EventNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:428:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:432:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAgendomat.g:433:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalAgendomat.g:440:1: rule__Event__Group__2__Impl : ( ( rule__Event__Alternatives_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:444:1: ( ( ( rule__Event__Alternatives_2 ) ) )
            // InternalAgendomat.g:445:1: ( ( rule__Event__Alternatives_2 ) )
            {
            // InternalAgendomat.g:445:1: ( ( rule__Event__Alternatives_2 ) )
            // InternalAgendomat.g:446:2: ( rule__Event__Alternatives_2 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_2()); 
            // InternalAgendomat.g:447:2: ( rule__Event__Alternatives_2 )
            // InternalAgendomat.g:447:3: rule__Event__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:455:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:459:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalAgendomat.g:460:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalAgendomat.g:467:1: rule__Event__Group__3__Impl : ( '{' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:471:1: ( ( '{' ) )
            // InternalAgendomat.g:472:1: ( '{' )
            {
            // InternalAgendomat.g:472:1: ( '{' )
            // InternalAgendomat.g:473:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalAgendomat.g:482:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:486:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalAgendomat.g:487:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalAgendomat.g:494:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:498:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalAgendomat.g:499:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalAgendomat.g:499:1: ( ( rule__Event__Group_4__0 )? )
            // InternalAgendomat.g:500:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalAgendomat.g:501:2: ( rule__Event__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAgendomat.g:501:3: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalAgendomat.g:509:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:513:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalAgendomat.g:514:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalAgendomat.g:521:1: rule__Event__Group__5__Impl : ( ( rule__Event__PersonsAssignment_5 )* ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:525:1: ( ( ( rule__Event__PersonsAssignment_5 )* ) )
            // InternalAgendomat.g:526:1: ( ( rule__Event__PersonsAssignment_5 )* )
            {
            // InternalAgendomat.g:526:1: ( ( rule__Event__PersonsAssignment_5 )* )
            // InternalAgendomat.g:527:2: ( rule__Event__PersonsAssignment_5 )*
            {
             before(grammarAccess.getEventAccess().getPersonsAssignment_5()); 
            // InternalAgendomat.g:528:2: ( rule__Event__PersonsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAgendomat.g:528:3: rule__Event__PersonsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Event__PersonsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getPersonsAssignment_5()); 

            }


            }

        }
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
    // InternalAgendomat.g:536:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:540:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // InternalAgendomat.g:541:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalAgendomat.g:548:1: rule__Event__Group__6__Impl : ( ( rule__Event__LocationsAssignment_6 )* ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:552:1: ( ( ( rule__Event__LocationsAssignment_6 )* ) )
            // InternalAgendomat.g:553:1: ( ( rule__Event__LocationsAssignment_6 )* )
            {
            // InternalAgendomat.g:553:1: ( ( rule__Event__LocationsAssignment_6 )* )
            // InternalAgendomat.g:554:2: ( rule__Event__LocationsAssignment_6 )*
            {
             before(grammarAccess.getEventAccess().getLocationsAssignment_6()); 
            // InternalAgendomat.g:555:2: ( rule__Event__LocationsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAgendomat.g:555:3: rule__Event__LocationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Event__LocationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getLocationsAssignment_6()); 

            }


            }

        }
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
    // InternalAgendomat.g:563:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:567:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // InternalAgendomat.g:568:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalAgendomat.g:575:1: rule__Event__Group__7__Impl : ( ( rule__Event__ProgramItemsAssignment_7 )* ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:579:1: ( ( ( rule__Event__ProgramItemsAssignment_7 )* ) )
            // InternalAgendomat.g:580:1: ( ( rule__Event__ProgramItemsAssignment_7 )* )
            {
            // InternalAgendomat.g:580:1: ( ( rule__Event__ProgramItemsAssignment_7 )* )
            // InternalAgendomat.g:581:2: ( rule__Event__ProgramItemsAssignment_7 )*
            {
             before(grammarAccess.getEventAccess().getProgramItemsAssignment_7()); 
            // InternalAgendomat.g:582:2: ( rule__Event__ProgramItemsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAgendomat.g:582:3: rule__Event__ProgramItemsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Event__ProgramItemsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getProgramItemsAssignment_7()); 

            }


            }

        }
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
    // InternalAgendomat.g:590:1: rule__Event__Group__8 : rule__Event__Group__8__Impl ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:594:1: ( rule__Event__Group__8__Impl )
            // InternalAgendomat.g:595:2: rule__Event__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:601:1: rule__Event__Group__8__Impl : ( '}' ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:605:1: ( ( '}' ) )
            // InternalAgendomat.g:606:1: ( '}' )
            {
            // InternalAgendomat.g:606:1: ( '}' )
            // InternalAgendomat.g:607:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Event__Group_2_0__0"
    // InternalAgendomat.g:617:1: rule__Event__Group_2_0__0 : rule__Event__Group_2_0__0__Impl rule__Event__Group_2_0__1 ;
    public final void rule__Event__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:621:1: ( rule__Event__Group_2_0__0__Impl rule__Event__Group_2_0__1 )
            // InternalAgendomat.g:622:2: rule__Event__Group_2_0__0__Impl rule__Event__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__0"


    // $ANTLR start "rule__Event__Group_2_0__0__Impl"
    // InternalAgendomat.g:629:1: rule__Event__Group_2_0__0__Impl : ( 'from' ) ;
    public final void rule__Event__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:633:1: ( ( 'from' ) )
            // InternalAgendomat.g:634:1: ( 'from' )
            {
            // InternalAgendomat.g:634:1: ( 'from' )
            // InternalAgendomat.g:635:2: 'from'
            {
             before(grammarAccess.getEventAccess().getFromKeyword_2_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getFromKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__0__Impl"


    // $ANTLR start "rule__Event__Group_2_0__1"
    // InternalAgendomat.g:644:1: rule__Event__Group_2_0__1 : rule__Event__Group_2_0__1__Impl rule__Event__Group_2_0__2 ;
    public final void rule__Event__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:648:1: ( rule__Event__Group_2_0__1__Impl rule__Event__Group_2_0__2 )
            // InternalAgendomat.g:649:2: rule__Event__Group_2_0__1__Impl rule__Event__Group_2_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__1"


    // $ANTLR start "rule__Event__Group_2_0__1__Impl"
    // InternalAgendomat.g:656:1: rule__Event__Group_2_0__1__Impl : ( ( rule__Event__EventStartDateAssignment_2_0_1 ) ) ;
    public final void rule__Event__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:660:1: ( ( ( rule__Event__EventStartDateAssignment_2_0_1 ) ) )
            // InternalAgendomat.g:661:1: ( ( rule__Event__EventStartDateAssignment_2_0_1 ) )
            {
            // InternalAgendomat.g:661:1: ( ( rule__Event__EventStartDateAssignment_2_0_1 ) )
            // InternalAgendomat.g:662:2: ( rule__Event__EventStartDateAssignment_2_0_1 )
            {
             before(grammarAccess.getEventAccess().getEventStartDateAssignment_2_0_1()); 
            // InternalAgendomat.g:663:2: ( rule__Event__EventStartDateAssignment_2_0_1 )
            // InternalAgendomat.g:663:3: rule__Event__EventStartDateAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventStartDateAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventStartDateAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__1__Impl"


    // $ANTLR start "rule__Event__Group_2_0__2"
    // InternalAgendomat.g:671:1: rule__Event__Group_2_0__2 : rule__Event__Group_2_0__2__Impl rule__Event__Group_2_0__3 ;
    public final void rule__Event__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:675:1: ( rule__Event__Group_2_0__2__Impl rule__Event__Group_2_0__3 )
            // InternalAgendomat.g:676:2: rule__Event__Group_2_0__2__Impl rule__Event__Group_2_0__3
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__2"


    // $ANTLR start "rule__Event__Group_2_0__2__Impl"
    // InternalAgendomat.g:683:1: rule__Event__Group_2_0__2__Impl : ( 'to' ) ;
    public final void rule__Event__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:687:1: ( ( 'to' ) )
            // InternalAgendomat.g:688:1: ( 'to' )
            {
            // InternalAgendomat.g:688:1: ( 'to' )
            // InternalAgendomat.g:689:2: 'to'
            {
             before(grammarAccess.getEventAccess().getToKeyword_2_0_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getToKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__2__Impl"


    // $ANTLR start "rule__Event__Group_2_0__3"
    // InternalAgendomat.g:698:1: rule__Event__Group_2_0__3 : rule__Event__Group_2_0__3__Impl ;
    public final void rule__Event__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:702:1: ( rule__Event__Group_2_0__3__Impl )
            // InternalAgendomat.g:703:2: rule__Event__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__3"


    // $ANTLR start "rule__Event__Group_2_0__3__Impl"
    // InternalAgendomat.g:709:1: rule__Event__Group_2_0__3__Impl : ( ( rule__Event__EventEndDateAssignment_2_0_3 ) ) ;
    public final void rule__Event__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:713:1: ( ( ( rule__Event__EventEndDateAssignment_2_0_3 ) ) )
            // InternalAgendomat.g:714:1: ( ( rule__Event__EventEndDateAssignment_2_0_3 ) )
            {
            // InternalAgendomat.g:714:1: ( ( rule__Event__EventEndDateAssignment_2_0_3 ) )
            // InternalAgendomat.g:715:2: ( rule__Event__EventEndDateAssignment_2_0_3 )
            {
             before(grammarAccess.getEventAccess().getEventEndDateAssignment_2_0_3()); 
            // InternalAgendomat.g:716:2: ( rule__Event__EventEndDateAssignment_2_0_3 )
            // InternalAgendomat.g:716:3: rule__Event__EventEndDateAssignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventEndDateAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventEndDateAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_0__3__Impl"


    // $ANTLR start "rule__Event__Group_2_1__0"
    // InternalAgendomat.g:725:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:729:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalAgendomat.g:730:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__0"


    // $ANTLR start "rule__Event__Group_2_1__0__Impl"
    // InternalAgendomat.g:737:1: rule__Event__Group_2_1__0__Impl : ( 'on' ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:741:1: ( ( 'on' ) )
            // InternalAgendomat.g:742:1: ( 'on' )
            {
            // InternalAgendomat.g:742:1: ( 'on' )
            // InternalAgendomat.g:743:2: 'on'
            {
             before(grammarAccess.getEventAccess().getOnKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getOnKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__0__Impl"


    // $ANTLR start "rule__Event__Group_2_1__1"
    // InternalAgendomat.g:752:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:756:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalAgendomat.g:757:2: rule__Event__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__1"


    // $ANTLR start "rule__Event__Group_2_1__1__Impl"
    // InternalAgendomat.g:763:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__EventStartDateAssignment_2_1_1 ) ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:767:1: ( ( ( rule__Event__EventStartDateAssignment_2_1_1 ) ) )
            // InternalAgendomat.g:768:1: ( ( rule__Event__EventStartDateAssignment_2_1_1 ) )
            {
            // InternalAgendomat.g:768:1: ( ( rule__Event__EventStartDateAssignment_2_1_1 ) )
            // InternalAgendomat.g:769:2: ( rule__Event__EventStartDateAssignment_2_1_1 )
            {
             before(grammarAccess.getEventAccess().getEventStartDateAssignment_2_1_1()); 
            // InternalAgendomat.g:770:2: ( rule__Event__EventStartDateAssignment_2_1_1 )
            // InternalAgendomat.g:770:3: rule__Event__EventStartDateAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventStartDateAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventStartDateAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__1__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalAgendomat.g:779:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:783:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalAgendomat.g:784:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalAgendomat.g:791:1: rule__Event__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:795:1: ( ( 'Description' ) )
            // InternalAgendomat.g:796:1: ( 'Description' )
            {
            // InternalAgendomat.g:796:1: ( 'Description' )
            // InternalAgendomat.g:797:2: 'Description'
            {
             before(grammarAccess.getEventAccess().getDescriptionKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalAgendomat.g:806:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:810:1: ( rule__Event__Group_4__1__Impl )
            // InternalAgendomat.g:811:2: rule__Event__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalAgendomat.g:817:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__DescAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:821:1: ( ( ( rule__Event__DescAssignment_4_1 ) ) )
            // InternalAgendomat.g:822:1: ( ( rule__Event__DescAssignment_4_1 ) )
            {
            // InternalAgendomat.g:822:1: ( ( rule__Event__DescAssignment_4_1 ) )
            // InternalAgendomat.g:823:2: ( rule__Event__DescAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getDescAssignment_4_1()); 
            // InternalAgendomat.g:824:2: ( rule__Event__DescAssignment_4_1 )
            // InternalAgendomat.g:824:3: rule__Event__DescAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__DescAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getDescAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalAgendomat.g:833:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:837:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalAgendomat.g:838:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:845:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:849:1: ( ( 'Person' ) )
            // InternalAgendomat.g:850:1: ( 'Person' )
            {
            // InternalAgendomat.g:850:1: ( 'Person' )
            // InternalAgendomat.g:851:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAgendomat.g:860:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:864:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalAgendomat.g:865:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalAgendomat.g:872:1: rule__Person__Group__1__Impl : ( ( rule__Person__PersonNameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:876:1: ( ( ( rule__Person__PersonNameAssignment_1 ) ) )
            // InternalAgendomat.g:877:1: ( ( rule__Person__PersonNameAssignment_1 ) )
            {
            // InternalAgendomat.g:877:1: ( ( rule__Person__PersonNameAssignment_1 ) )
            // InternalAgendomat.g:878:2: ( rule__Person__PersonNameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getPersonNameAssignment_1()); 
            // InternalAgendomat.g:879:2: ( rule__Person__PersonNameAssignment_1 )
            // InternalAgendomat.g:879:3: rule__Person__PersonNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__PersonNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPersonNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:887:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:891:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalAgendomat.g:892:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalAgendomat.g:899:1: rule__Person__Group__2__Impl : ( 'roles' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:903:1: ( ( 'roles' ) )
            // InternalAgendomat.g:904:1: ( 'roles' )
            {
            // InternalAgendomat.g:904:1: ( 'roles' )
            // InternalAgendomat.g:905:2: 'roles'
            {
             before(grammarAccess.getPersonAccess().getRolesKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRolesKeyword_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:914:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:918:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalAgendomat.g:919:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAgendomat.g:926:1: rule__Person__Group__3__Impl : ( '[' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:930:1: ( ( '[' ) )
            // InternalAgendomat.g:931:1: ( '[' )
            {
            // InternalAgendomat.g:931:1: ( '[' )
            // InternalAgendomat.g:932:2: '['
            {
             before(grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalAgendomat.g:941:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:945:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalAgendomat.g:946:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAgendomat.g:953:1: rule__Person__Group__4__Impl : ( ( rule__Person__RolesAssignment_4 ) ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:957:1: ( ( ( rule__Person__RolesAssignment_4 ) ) )
            // InternalAgendomat.g:958:1: ( ( rule__Person__RolesAssignment_4 ) )
            {
            // InternalAgendomat.g:958:1: ( ( rule__Person__RolesAssignment_4 ) )
            // InternalAgendomat.g:959:2: ( rule__Person__RolesAssignment_4 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_4()); 
            // InternalAgendomat.g:960:2: ( rule__Person__RolesAssignment_4 )
            // InternalAgendomat.g:960:3: rule__Person__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_4()); 

            }


            }

        }
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
    // InternalAgendomat.g:968:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:972:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalAgendomat.g:973:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAgendomat.g:980:1: rule__Person__Group__5__Impl : ( ( rule__Person__Group_5__0 )* ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:984:1: ( ( ( rule__Person__Group_5__0 )* ) )
            // InternalAgendomat.g:985:1: ( ( rule__Person__Group_5__0 )* )
            {
            // InternalAgendomat.g:985:1: ( ( rule__Person__Group_5__0 )* )
            // InternalAgendomat.g:986:2: ( rule__Person__Group_5__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_5()); 
            // InternalAgendomat.g:987:2: ( rule__Person__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAgendomat.g:987:3: rule__Person__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Person__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalAgendomat.g:995:1: rule__Person__Group__6 : rule__Person__Group__6__Impl ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:999:1: ( rule__Person__Group__6__Impl )
            // InternalAgendomat.g:1000:2: rule__Person__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:1006:1: rule__Person__Group__6__Impl : ( ']' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1010:1: ( ( ']' ) )
            // InternalAgendomat.g:1011:1: ( ']' )
            {
            // InternalAgendomat.g:1011:1: ( ']' )
            // InternalAgendomat.g:1012:2: ']'
            {
             before(grammarAccess.getPersonAccess().getRightSquareBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Person__Group_5__0"
    // InternalAgendomat.g:1022:1: rule__Person__Group_5__0 : rule__Person__Group_5__0__Impl rule__Person__Group_5__1 ;
    public final void rule__Person__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1026:1: ( rule__Person__Group_5__0__Impl rule__Person__Group_5__1 )
            // InternalAgendomat.g:1027:2: rule__Person__Group_5__0__Impl rule__Person__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__0"


    // $ANTLR start "rule__Person__Group_5__0__Impl"
    // InternalAgendomat.g:1034:1: rule__Person__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1038:1: ( ( ',' ) )
            // InternalAgendomat.g:1039:1: ( ',' )
            {
            // InternalAgendomat.g:1039:1: ( ',' )
            // InternalAgendomat.g:1040:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__0__Impl"


    // $ANTLR start "rule__Person__Group_5__1"
    // InternalAgendomat.g:1049:1: rule__Person__Group_5__1 : rule__Person__Group_5__1__Impl ;
    public final void rule__Person__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1053:1: ( rule__Person__Group_5__1__Impl )
            // InternalAgendomat.g:1054:2: rule__Person__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__1"


    // $ANTLR start "rule__Person__Group_5__1__Impl"
    // InternalAgendomat.g:1060:1: rule__Person__Group_5__1__Impl : ( ( rule__Person__RolesAssignment_5_1 ) ) ;
    public final void rule__Person__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1064:1: ( ( ( rule__Person__RolesAssignment_5_1 ) ) )
            // InternalAgendomat.g:1065:1: ( ( rule__Person__RolesAssignment_5_1 ) )
            {
            // InternalAgendomat.g:1065:1: ( ( rule__Person__RolesAssignment_5_1 ) )
            // InternalAgendomat.g:1066:2: ( rule__Person__RolesAssignment_5_1 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_5_1()); 
            // InternalAgendomat.g:1067:2: ( rule__Person__RolesAssignment_5_1 )
            // InternalAgendomat.g:1067:3: rule__Person__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalAgendomat.g:1076:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1080:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalAgendomat.g:1081:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1088:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1092:1: ( ( 'Location' ) )
            // InternalAgendomat.g:1093:1: ( 'Location' )
            {
            // InternalAgendomat.g:1093:1: ( 'Location' )
            // InternalAgendomat.g:1094:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAgendomat.g:1103:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1107:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalAgendomat.g:1108:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAgendomat.g:1115:1: rule__Location__Group__1__Impl : ( ( rule__Location__LocationNameAssignment_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1119:1: ( ( ( rule__Location__LocationNameAssignment_1 ) ) )
            // InternalAgendomat.g:1120:1: ( ( rule__Location__LocationNameAssignment_1 ) )
            {
            // InternalAgendomat.g:1120:1: ( ( rule__Location__LocationNameAssignment_1 ) )
            // InternalAgendomat.g:1121:2: ( rule__Location__LocationNameAssignment_1 )
            {
             before(grammarAccess.getLocationAccess().getLocationNameAssignment_1()); 
            // InternalAgendomat.g:1122:2: ( rule__Location__LocationNameAssignment_1 )
            // InternalAgendomat.g:1122:3: rule__Location__LocationNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Location__LocationNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLocationNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:1130:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1134:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalAgendomat.g:1135:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAgendomat.g:1142:1: rule__Location__Group__2__Impl : ( 'type' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1146:1: ( ( 'type' ) )
            // InternalAgendomat.g:1147:1: ( 'type' )
            {
            // InternalAgendomat.g:1147:1: ( 'type' )
            // InternalAgendomat.g:1148:2: 'type'
            {
             before(grammarAccess.getLocationAccess().getTypeKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:1157:1: rule__Location__Group__3 : rule__Location__Group__3__Impl ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1161:1: ( rule__Location__Group__3__Impl )
            // InternalAgendomat.g:1162:2: rule__Location__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:1168:1: rule__Location__Group__3__Impl : ( ( rule__Location__LocationTypeAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1172:1: ( ( ( rule__Location__LocationTypeAssignment_3 ) ) )
            // InternalAgendomat.g:1173:1: ( ( rule__Location__LocationTypeAssignment_3 ) )
            {
            // InternalAgendomat.g:1173:1: ( ( rule__Location__LocationTypeAssignment_3 ) )
            // InternalAgendomat.g:1174:2: ( rule__Location__LocationTypeAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getLocationTypeAssignment_3()); 
            // InternalAgendomat.g:1175:2: ( rule__Location__LocationTypeAssignment_3 )
            // InternalAgendomat.g:1175:3: rule__Location__LocationTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__LocationTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLocationTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group__0"
    // InternalAgendomat.g:1184:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1188:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalAgendomat.g:1189:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1196:1: rule__Session__Group__0__Impl : ( 'Session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1200:1: ( ( 'Session' ) )
            // InternalAgendomat.g:1201:1: ( 'Session' )
            {
            // InternalAgendomat.g:1201:1: ( 'Session' )
            // InternalAgendomat.g:1202:2: 'Session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAgendomat.g:1211:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1215:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalAgendomat.g:1216:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAgendomat.g:1223:1: rule__Session__Group__1__Impl : ( ( rule__Session__SessionNameAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1227:1: ( ( ( rule__Session__SessionNameAssignment_1 ) ) )
            // InternalAgendomat.g:1228:1: ( ( rule__Session__SessionNameAssignment_1 ) )
            {
            // InternalAgendomat.g:1228:1: ( ( rule__Session__SessionNameAssignment_1 ) )
            // InternalAgendomat.g:1229:2: ( rule__Session__SessionNameAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getSessionNameAssignment_1()); 
            // InternalAgendomat.g:1230:2: ( rule__Session__SessionNameAssignment_1 )
            // InternalAgendomat.g:1230:3: rule__Session__SessionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__SessionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getSessionNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:1238:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1242:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalAgendomat.g:1243:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAgendomat.g:1250:1: rule__Session__Group__2__Impl : ( '{' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1254:1: ( ( '{' ) )
            // InternalAgendomat.g:1255:1: ( '{' )
            {
            // InternalAgendomat.g:1255:1: ( '{' )
            // InternalAgendomat.g:1256:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:1265:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1269:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalAgendomat.g:1270:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1277:1: rule__Session__Group__3__Impl : ( 'Time' ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1281:1: ( ( 'Time' ) )
            // InternalAgendomat.g:1282:1: ( 'Time' )
            {
            // InternalAgendomat.g:1282:1: ( 'Time' )
            // InternalAgendomat.g:1283:2: 'Time'
            {
             before(grammarAccess.getSessionAccess().getTimeKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTimeKeyword_3()); 

            }


            }

        }
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
    // InternalAgendomat.g:1292:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1296:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalAgendomat.g:1297:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalAgendomat.g:1304:1: rule__Session__Group__4__Impl : ( ( rule__Session__StartTimeAssignment_4 ) ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1308:1: ( ( ( rule__Session__StartTimeAssignment_4 ) ) )
            // InternalAgendomat.g:1309:1: ( ( rule__Session__StartTimeAssignment_4 ) )
            {
            // InternalAgendomat.g:1309:1: ( ( rule__Session__StartTimeAssignment_4 ) )
            // InternalAgendomat.g:1310:2: ( rule__Session__StartTimeAssignment_4 )
            {
             before(grammarAccess.getSessionAccess().getStartTimeAssignment_4()); 
            // InternalAgendomat.g:1311:2: ( rule__Session__StartTimeAssignment_4 )
            // InternalAgendomat.g:1311:3: rule__Session__StartTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartTimeAssignment_4()); 

            }


            }

        }
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
    // InternalAgendomat.g:1319:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1323:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalAgendomat.g:1324:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1331:1: rule__Session__Group__5__Impl : ( '-' ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1335:1: ( ( '-' ) )
            // InternalAgendomat.g:1336:1: ( '-' )
            {
            // InternalAgendomat.g:1336:1: ( '-' )
            // InternalAgendomat.g:1337:2: '-'
            {
             before(grammarAccess.getSessionAccess().getHyphenMinusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
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
    // InternalAgendomat.g:1346:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1350:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalAgendomat.g:1351:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalAgendomat.g:1358:1: rule__Session__Group__6__Impl : ( ( rule__Session__EndTimeAssignment_6 ) ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1362:1: ( ( ( rule__Session__EndTimeAssignment_6 ) ) )
            // InternalAgendomat.g:1363:1: ( ( rule__Session__EndTimeAssignment_6 ) )
            {
            // InternalAgendomat.g:1363:1: ( ( rule__Session__EndTimeAssignment_6 ) )
            // InternalAgendomat.g:1364:2: ( rule__Session__EndTimeAssignment_6 )
            {
             before(grammarAccess.getSessionAccess().getEndTimeAssignment_6()); 
            // InternalAgendomat.g:1365:2: ( rule__Session__EndTimeAssignment_6 )
            // InternalAgendomat.g:1365:3: rule__Session__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndTimeAssignment_6()); 

            }


            }

        }
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
    // InternalAgendomat.g:1373:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1377:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalAgendomat.g:1378:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1385:1: rule__Session__Group__7__Impl : ( 'Location' ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1389:1: ( ( 'Location' ) )
            // InternalAgendomat.g:1390:1: ( 'Location' )
            {
            // InternalAgendomat.g:1390:1: ( 'Location' )
            // InternalAgendomat.g:1391:2: 'Location'
            {
             before(grammarAccess.getSessionAccess().getLocationKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLocationKeyword_7()); 

            }


            }

        }
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
    // InternalAgendomat.g:1400:1: rule__Session__Group__8 : rule__Session__Group__8__Impl rule__Session__Group__9 ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1404:1: ( rule__Session__Group__8__Impl rule__Session__Group__9 )
            // InternalAgendomat.g:1405:2: rule__Session__Group__8__Impl rule__Session__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalAgendomat.g:1412:1: rule__Session__Group__8__Impl : ( ( rule__Session__LocationAssignment_8 ) ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1416:1: ( ( ( rule__Session__LocationAssignment_8 ) ) )
            // InternalAgendomat.g:1417:1: ( ( rule__Session__LocationAssignment_8 ) )
            {
            // InternalAgendomat.g:1417:1: ( ( rule__Session__LocationAssignment_8 ) )
            // InternalAgendomat.g:1418:2: ( rule__Session__LocationAssignment_8 )
            {
             before(grammarAccess.getSessionAccess().getLocationAssignment_8()); 
            // InternalAgendomat.g:1419:2: ( rule__Session__LocationAssignment_8 )
            // InternalAgendomat.g:1419:3: rule__Session__LocationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Session__LocationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getLocationAssignment_8()); 

            }


            }

        }
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
    // InternalAgendomat.g:1427:1: rule__Session__Group__9 : rule__Session__Group__9__Impl rule__Session__Group__10 ;
    public final void rule__Session__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1431:1: ( rule__Session__Group__9__Impl rule__Session__Group__10 )
            // InternalAgendomat.g:1432:2: rule__Session__Group__9__Impl rule__Session__Group__10
            {
            pushFollow(FOLLOW_21);
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
    // InternalAgendomat.g:1439:1: rule__Session__Group__9__Impl : ( ( rule__Session__Group_9__0 )? ) ;
    public final void rule__Session__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1443:1: ( ( ( rule__Session__Group_9__0 )? ) )
            // InternalAgendomat.g:1444:1: ( ( rule__Session__Group_9__0 )? )
            {
            // InternalAgendomat.g:1444:1: ( ( rule__Session__Group_9__0 )? )
            // InternalAgendomat.g:1445:2: ( rule__Session__Group_9__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_9()); 
            // InternalAgendomat.g:1446:2: ( rule__Session__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAgendomat.g:1446:3: rule__Session__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalAgendomat.g:1454:1: rule__Session__Group__10 : rule__Session__Group__10__Impl rule__Session__Group__11 ;
    public final void rule__Session__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1458:1: ( rule__Session__Group__10__Impl rule__Session__Group__11 )
            // InternalAgendomat.g:1459:2: rule__Session__Group__10__Impl rule__Session__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalAgendomat.g:1466:1: rule__Session__Group__10__Impl : ( ( rule__Session__Group_10__0 )? ) ;
    public final void rule__Session__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1470:1: ( ( ( rule__Session__Group_10__0 )? ) )
            // InternalAgendomat.g:1471:1: ( ( rule__Session__Group_10__0 )? )
            {
            // InternalAgendomat.g:1471:1: ( ( rule__Session__Group_10__0 )? )
            // InternalAgendomat.g:1472:2: ( rule__Session__Group_10__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_10()); 
            // InternalAgendomat.g:1473:2: ( rule__Session__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAgendomat.g:1473:3: rule__Session__Group_10__0
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
    // InternalAgendomat.g:1481:1: rule__Session__Group__11 : rule__Session__Group__11__Impl rule__Session__Group__12 ;
    public final void rule__Session__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1485:1: ( rule__Session__Group__11__Impl rule__Session__Group__12 )
            // InternalAgendomat.g:1486:2: rule__Session__Group__11__Impl rule__Session__Group__12
            {
            pushFollow(FOLLOW_21);
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
    // InternalAgendomat.g:1493:1: rule__Session__Group__11__Impl : ( ( rule__Session__TalksAssignment_11 )* ) ;
    public final void rule__Session__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1497:1: ( ( ( rule__Session__TalksAssignment_11 )* ) )
            // InternalAgendomat.g:1498:1: ( ( rule__Session__TalksAssignment_11 )* )
            {
            // InternalAgendomat.g:1498:1: ( ( rule__Session__TalksAssignment_11 )* )
            // InternalAgendomat.g:1499:2: ( rule__Session__TalksAssignment_11 )*
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_11()); 
            // InternalAgendomat.g:1500:2: ( rule__Session__TalksAssignment_11 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAgendomat.g:1500:3: rule__Session__TalksAssignment_11
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Session__TalksAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getTalksAssignment_11()); 

            }


            }

        }
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
    // InternalAgendomat.g:1508:1: rule__Session__Group__12 : rule__Session__Group__12__Impl ;
    public final void rule__Session__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1512:1: ( rule__Session__Group__12__Impl )
            // InternalAgendomat.g:1513:2: rule__Session__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:1519:1: rule__Session__Group__12__Impl : ( '}' ) ;
    public final void rule__Session__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1523:1: ( ( '}' ) )
            // InternalAgendomat.g:1524:1: ( '}' )
            {
            // InternalAgendomat.g:1524:1: ( '}' )
            // InternalAgendomat.g:1525:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group_9__0"
    // InternalAgendomat.g:1535:1: rule__Session__Group_9__0 : rule__Session__Group_9__0__Impl rule__Session__Group_9__1 ;
    public final void rule__Session__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1539:1: ( rule__Session__Group_9__0__Impl rule__Session__Group_9__1 )
            // InternalAgendomat.g:1540:2: rule__Session__Group_9__0__Impl rule__Session__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__Session__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__0"


    // $ANTLR start "rule__Session__Group_9__0__Impl"
    // InternalAgendomat.g:1547:1: rule__Session__Group_9__0__Impl : ( 'TechSupport' ) ;
    public final void rule__Session__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1551:1: ( ( 'TechSupport' ) )
            // InternalAgendomat.g:1552:1: ( 'TechSupport' )
            {
            // InternalAgendomat.g:1552:1: ( 'TechSupport' )
            // InternalAgendomat.g:1553:2: 'TechSupport'
            {
             before(grammarAccess.getSessionAccess().getTechSupportKeyword_9_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTechSupportKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__0__Impl"


    // $ANTLR start "rule__Session__Group_9__1"
    // InternalAgendomat.g:1562:1: rule__Session__Group_9__1 : rule__Session__Group_9__1__Impl rule__Session__Group_9__2 ;
    public final void rule__Session__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1566:1: ( rule__Session__Group_9__1__Impl rule__Session__Group_9__2 )
            // InternalAgendomat.g:1567:2: rule__Session__Group_9__1__Impl rule__Session__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__Session__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__1"


    // $ANTLR start "rule__Session__Group_9__1__Impl"
    // InternalAgendomat.g:1574:1: rule__Session__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Session__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1578:1: ( ( '(' ) )
            // InternalAgendomat.g:1579:1: ( '(' )
            {
            // InternalAgendomat.g:1579:1: ( '(' )
            // InternalAgendomat.g:1580:2: '('
            {
             before(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__1__Impl"


    // $ANTLR start "rule__Session__Group_9__2"
    // InternalAgendomat.g:1589:1: rule__Session__Group_9__2 : rule__Session__Group_9__2__Impl rule__Session__Group_9__3 ;
    public final void rule__Session__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1593:1: ( rule__Session__Group_9__2__Impl rule__Session__Group_9__3 )
            // InternalAgendomat.g:1594:2: rule__Session__Group_9__2__Impl rule__Session__Group_9__3
            {
            pushFollow(FOLLOW_24);
            rule__Session__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__2"


    // $ANTLR start "rule__Session__Group_9__2__Impl"
    // InternalAgendomat.g:1601:1: rule__Session__Group_9__2__Impl : ( ( rule__Session__TechSupportAssignment_9_2 ) ) ;
    public final void rule__Session__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1605:1: ( ( ( rule__Session__TechSupportAssignment_9_2 ) ) )
            // InternalAgendomat.g:1606:1: ( ( rule__Session__TechSupportAssignment_9_2 ) )
            {
            // InternalAgendomat.g:1606:1: ( ( rule__Session__TechSupportAssignment_9_2 ) )
            // InternalAgendomat.g:1607:2: ( rule__Session__TechSupportAssignment_9_2 )
            {
             before(grammarAccess.getSessionAccess().getTechSupportAssignment_9_2()); 
            // InternalAgendomat.g:1608:2: ( rule__Session__TechSupportAssignment_9_2 )
            // InternalAgendomat.g:1608:3: rule__Session__TechSupportAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__TechSupportAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTechSupportAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__2__Impl"


    // $ANTLR start "rule__Session__Group_9__3"
    // InternalAgendomat.g:1616:1: rule__Session__Group_9__3 : rule__Session__Group_9__3__Impl rule__Session__Group_9__4 ;
    public final void rule__Session__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1620:1: ( rule__Session__Group_9__3__Impl rule__Session__Group_9__4 )
            // InternalAgendomat.g:1621:2: rule__Session__Group_9__3__Impl rule__Session__Group_9__4
            {
            pushFollow(FOLLOW_24);
            rule__Session__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__3"


    // $ANTLR start "rule__Session__Group_9__3__Impl"
    // InternalAgendomat.g:1628:1: rule__Session__Group_9__3__Impl : ( ( rule__Session__Group_9_3__0 )* ) ;
    public final void rule__Session__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1632:1: ( ( ( rule__Session__Group_9_3__0 )* ) )
            // InternalAgendomat.g:1633:1: ( ( rule__Session__Group_9_3__0 )* )
            {
            // InternalAgendomat.g:1633:1: ( ( rule__Session__Group_9_3__0 )* )
            // InternalAgendomat.g:1634:2: ( rule__Session__Group_9_3__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_9_3()); 
            // InternalAgendomat.g:1635:2: ( rule__Session__Group_9_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAgendomat.g:1635:3: rule__Session__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Session__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__3__Impl"


    // $ANTLR start "rule__Session__Group_9__4"
    // InternalAgendomat.g:1643:1: rule__Session__Group_9__4 : rule__Session__Group_9__4__Impl ;
    public final void rule__Session__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1647:1: ( rule__Session__Group_9__4__Impl )
            // InternalAgendomat.g:1648:2: rule__Session__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__4"


    // $ANTLR start "rule__Session__Group_9__4__Impl"
    // InternalAgendomat.g:1654:1: rule__Session__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Session__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1658:1: ( ( ')' ) )
            // InternalAgendomat.g:1659:1: ( ')' )
            {
            // InternalAgendomat.g:1659:1: ( ')' )
            // InternalAgendomat.g:1660:2: ')'
            {
             before(grammarAccess.getSessionAccess().getRightParenthesisKeyword_9_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9__4__Impl"


    // $ANTLR start "rule__Session__Group_9_3__0"
    // InternalAgendomat.g:1670:1: rule__Session__Group_9_3__0 : rule__Session__Group_9_3__0__Impl rule__Session__Group_9_3__1 ;
    public final void rule__Session__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1674:1: ( rule__Session__Group_9_3__0__Impl rule__Session__Group_9_3__1 )
            // InternalAgendomat.g:1675:2: rule__Session__Group_9_3__0__Impl rule__Session__Group_9_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Session__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9_3__0"


    // $ANTLR start "rule__Session__Group_9_3__0__Impl"
    // InternalAgendomat.g:1682:1: rule__Session__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1686:1: ( ( ',' ) )
            // InternalAgendomat.g:1687:1: ( ',' )
            {
            // InternalAgendomat.g:1687:1: ( ',' )
            // InternalAgendomat.g:1688:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_9_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9_3__0__Impl"


    // $ANTLR start "rule__Session__Group_9_3__1"
    // InternalAgendomat.g:1697:1: rule__Session__Group_9_3__1 : rule__Session__Group_9_3__1__Impl ;
    public final void rule__Session__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1701:1: ( rule__Session__Group_9_3__1__Impl )
            // InternalAgendomat.g:1702:2: rule__Session__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9_3__1"


    // $ANTLR start "rule__Session__Group_9_3__1__Impl"
    // InternalAgendomat.g:1708:1: rule__Session__Group_9_3__1__Impl : ( ( rule__Session__TechSupportAssignment_9_3_1 ) ) ;
    public final void rule__Session__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1712:1: ( ( ( rule__Session__TechSupportAssignment_9_3_1 ) ) )
            // InternalAgendomat.g:1713:1: ( ( rule__Session__TechSupportAssignment_9_3_1 ) )
            {
            // InternalAgendomat.g:1713:1: ( ( rule__Session__TechSupportAssignment_9_3_1 ) )
            // InternalAgendomat.g:1714:2: ( rule__Session__TechSupportAssignment_9_3_1 )
            {
             before(grammarAccess.getSessionAccess().getTechSupportAssignment_9_3_1()); 
            // InternalAgendomat.g:1715:2: ( rule__Session__TechSupportAssignment_9_3_1 )
            // InternalAgendomat.g:1715:3: rule__Session__TechSupportAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__TechSupportAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTechSupportAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_9_3__1__Impl"


    // $ANTLR start "rule__Session__Group_10__0"
    // InternalAgendomat.g:1724:1: rule__Session__Group_10__0 : rule__Session__Group_10__0__Impl rule__Session__Group_10__1 ;
    public final void rule__Session__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1728:1: ( rule__Session__Group_10__0__Impl rule__Session__Group_10__1 )
            // InternalAgendomat.g:1729:2: rule__Session__Group_10__0__Impl rule__Session__Group_10__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1736:1: rule__Session__Group_10__0__Impl : ( 'Needs' ) ;
    public final void rule__Session__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1740:1: ( ( 'Needs' ) )
            // InternalAgendomat.g:1741:1: ( 'Needs' )
            {
            // InternalAgendomat.g:1741:1: ( 'Needs' )
            // InternalAgendomat.g:1742:2: 'Needs'
            {
             before(grammarAccess.getSessionAccess().getNeedsKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getNeedsKeyword_10_0()); 

            }


            }

        }
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
    // InternalAgendomat.g:1751:1: rule__Session__Group_10__1 : rule__Session__Group_10__1__Impl rule__Session__Group_10__2 ;
    public final void rule__Session__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1755:1: ( rule__Session__Group_10__1__Impl rule__Session__Group_10__2 )
            // InternalAgendomat.g:1756:2: rule__Session__Group_10__1__Impl rule__Session__Group_10__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAgendomat.g:1763:1: rule__Session__Group_10__1__Impl : ( ( rule__Session__EquipmentAssignment_10_1 ) ) ;
    public final void rule__Session__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1767:1: ( ( ( rule__Session__EquipmentAssignment_10_1 ) ) )
            // InternalAgendomat.g:1768:1: ( ( rule__Session__EquipmentAssignment_10_1 ) )
            {
            // InternalAgendomat.g:1768:1: ( ( rule__Session__EquipmentAssignment_10_1 ) )
            // InternalAgendomat.g:1769:2: ( rule__Session__EquipmentAssignment_10_1 )
            {
             before(grammarAccess.getSessionAccess().getEquipmentAssignment_10_1()); 
            // InternalAgendomat.g:1770:2: ( rule__Session__EquipmentAssignment_10_1 )
            // InternalAgendomat.g:1770:3: rule__Session__EquipmentAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EquipmentAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEquipmentAssignment_10_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:1778:1: rule__Session__Group_10__2 : rule__Session__Group_10__2__Impl ;
    public final void rule__Session__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1782:1: ( rule__Session__Group_10__2__Impl )
            // InternalAgendomat.g:1783:2: rule__Session__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_10__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:1789:1: rule__Session__Group_10__2__Impl : ( ( rule__Session__Group_10_2__0 )* ) ;
    public final void rule__Session__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1793:1: ( ( ( rule__Session__Group_10_2__0 )* ) )
            // InternalAgendomat.g:1794:1: ( ( rule__Session__Group_10_2__0 )* )
            {
            // InternalAgendomat.g:1794:1: ( ( rule__Session__Group_10_2__0 )* )
            // InternalAgendomat.g:1795:2: ( rule__Session__Group_10_2__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_10_2()); 
            // InternalAgendomat.g:1796:2: ( rule__Session__Group_10_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAgendomat.g:1796:3: rule__Session__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Session__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_10_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group_10_2__0"
    // InternalAgendomat.g:1805:1: rule__Session__Group_10_2__0 : rule__Session__Group_10_2__0__Impl rule__Session__Group_10_2__1 ;
    public final void rule__Session__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1809:1: ( rule__Session__Group_10_2__0__Impl rule__Session__Group_10_2__1 )
            // InternalAgendomat.g:1810:2: rule__Session__Group_10_2__0__Impl rule__Session__Group_10_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Session__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_2__0"


    // $ANTLR start "rule__Session__Group_10_2__0__Impl"
    // InternalAgendomat.g:1817:1: rule__Session__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1821:1: ( ( ',' ) )
            // InternalAgendomat.g:1822:1: ( ',' )
            {
            // InternalAgendomat.g:1822:1: ( ',' )
            // InternalAgendomat.g:1823:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_10_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_2__0__Impl"


    // $ANTLR start "rule__Session__Group_10_2__1"
    // InternalAgendomat.g:1832:1: rule__Session__Group_10_2__1 : rule__Session__Group_10_2__1__Impl ;
    public final void rule__Session__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1836:1: ( rule__Session__Group_10_2__1__Impl )
            // InternalAgendomat.g:1837:2: rule__Session__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_2__1"


    // $ANTLR start "rule__Session__Group_10_2__1__Impl"
    // InternalAgendomat.g:1843:1: rule__Session__Group_10_2__1__Impl : ( ( rule__Session__EquipmentAssignment_10_2_1 ) ) ;
    public final void rule__Session__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1847:1: ( ( ( rule__Session__EquipmentAssignment_10_2_1 ) ) )
            // InternalAgendomat.g:1848:1: ( ( rule__Session__EquipmentAssignment_10_2_1 ) )
            {
            // InternalAgendomat.g:1848:1: ( ( rule__Session__EquipmentAssignment_10_2_1 ) )
            // InternalAgendomat.g:1849:2: ( rule__Session__EquipmentAssignment_10_2_1 )
            {
             before(grammarAccess.getSessionAccess().getEquipmentAssignment_10_2_1()); 
            // InternalAgendomat.g:1850:2: ( rule__Session__EquipmentAssignment_10_2_1 )
            // InternalAgendomat.g:1850:3: rule__Session__EquipmentAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EquipmentAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEquipmentAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_10_2__1__Impl"


    // $ANTLR start "rule__Break__Group__0"
    // InternalAgendomat.g:1859:1: rule__Break__Group__0 : rule__Break__Group__0__Impl rule__Break__Group__1 ;
    public final void rule__Break__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1863:1: ( rule__Break__Group__0__Impl rule__Break__Group__1 )
            // InternalAgendomat.g:1864:2: rule__Break__Group__0__Impl rule__Break__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1871:1: rule__Break__Group__0__Impl : ( 'Break' ) ;
    public final void rule__Break__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1875:1: ( ( 'Break' ) )
            // InternalAgendomat.g:1876:1: ( 'Break' )
            {
            // InternalAgendomat.g:1876:1: ( 'Break' )
            // InternalAgendomat.g:1877:2: 'Break'
            {
             before(grammarAccess.getBreakAccess().getBreakKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAgendomat.g:1886:1: rule__Break__Group__1 : rule__Break__Group__1__Impl rule__Break__Group__2 ;
    public final void rule__Break__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1890:1: ( rule__Break__Group__1__Impl rule__Break__Group__2 )
            // InternalAgendomat.g:1891:2: rule__Break__Group__1__Impl rule__Break__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAgendomat.g:1898:1: rule__Break__Group__1__Impl : ( ( rule__Break__BreakNameAssignment_1 ) ) ;
    public final void rule__Break__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1902:1: ( ( ( rule__Break__BreakNameAssignment_1 ) ) )
            // InternalAgendomat.g:1903:1: ( ( rule__Break__BreakNameAssignment_1 ) )
            {
            // InternalAgendomat.g:1903:1: ( ( rule__Break__BreakNameAssignment_1 ) )
            // InternalAgendomat.g:1904:2: ( rule__Break__BreakNameAssignment_1 )
            {
             before(grammarAccess.getBreakAccess().getBreakNameAssignment_1()); 
            // InternalAgendomat.g:1905:2: ( rule__Break__BreakNameAssignment_1 )
            // InternalAgendomat.g:1905:3: rule__Break__BreakNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Break__BreakNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getBreakNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:1913:1: rule__Break__Group__2 : rule__Break__Group__2__Impl rule__Break__Group__3 ;
    public final void rule__Break__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1917:1: ( rule__Break__Group__2__Impl rule__Break__Group__3 )
            // InternalAgendomat.g:1918:2: rule__Break__Group__2__Impl rule__Break__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAgendomat.g:1925:1: rule__Break__Group__2__Impl : ( '{' ) ;
    public final void rule__Break__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1929:1: ( ( '{' ) )
            // InternalAgendomat.g:1930:1: ( '{' )
            {
            // InternalAgendomat.g:1930:1: ( '{' )
            // InternalAgendomat.g:1931:2: '{'
            {
             before(grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:1940:1: rule__Break__Group__3 : rule__Break__Group__3__Impl rule__Break__Group__4 ;
    public final void rule__Break__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1944:1: ( rule__Break__Group__3__Impl rule__Break__Group__4 )
            // InternalAgendomat.g:1945:2: rule__Break__Group__3__Impl rule__Break__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:1952:1: rule__Break__Group__3__Impl : ( 'Time' ) ;
    public final void rule__Break__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1956:1: ( ( 'Time' ) )
            // InternalAgendomat.g:1957:1: ( 'Time' )
            {
            // InternalAgendomat.g:1957:1: ( 'Time' )
            // InternalAgendomat.g:1958:2: 'Time'
            {
             before(grammarAccess.getBreakAccess().getTimeKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getTimeKeyword_3()); 

            }


            }

        }
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
    // InternalAgendomat.g:1967:1: rule__Break__Group__4 : rule__Break__Group__4__Impl rule__Break__Group__5 ;
    public final void rule__Break__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1971:1: ( rule__Break__Group__4__Impl rule__Break__Group__5 )
            // InternalAgendomat.g:1972:2: rule__Break__Group__4__Impl rule__Break__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalAgendomat.g:1979:1: rule__Break__Group__4__Impl : ( ( rule__Break__StartTimeAssignment_4 ) ) ;
    public final void rule__Break__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1983:1: ( ( ( rule__Break__StartTimeAssignment_4 ) ) )
            // InternalAgendomat.g:1984:1: ( ( rule__Break__StartTimeAssignment_4 ) )
            {
            // InternalAgendomat.g:1984:1: ( ( rule__Break__StartTimeAssignment_4 ) )
            // InternalAgendomat.g:1985:2: ( rule__Break__StartTimeAssignment_4 )
            {
             before(grammarAccess.getBreakAccess().getStartTimeAssignment_4()); 
            // InternalAgendomat.g:1986:2: ( rule__Break__StartTimeAssignment_4 )
            // InternalAgendomat.g:1986:3: rule__Break__StartTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Break__StartTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getStartTimeAssignment_4()); 

            }


            }

        }
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
    // InternalAgendomat.g:1994:1: rule__Break__Group__5 : rule__Break__Group__5__Impl rule__Break__Group__6 ;
    public final void rule__Break__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:1998:1: ( rule__Break__Group__5__Impl rule__Break__Group__6 )
            // InternalAgendomat.g:1999:2: rule__Break__Group__5__Impl rule__Break__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2006:1: rule__Break__Group__5__Impl : ( '-' ) ;
    public final void rule__Break__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2010:1: ( ( '-' ) )
            // InternalAgendomat.g:2011:1: ( '-' )
            {
            // InternalAgendomat.g:2011:1: ( '-' )
            // InternalAgendomat.g:2012:2: '-'
            {
             before(grammarAccess.getBreakAccess().getHyphenMinusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
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
    // InternalAgendomat.g:2021:1: rule__Break__Group__6 : rule__Break__Group__6__Impl rule__Break__Group__7 ;
    public final void rule__Break__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2025:1: ( rule__Break__Group__6__Impl rule__Break__Group__7 )
            // InternalAgendomat.g:2026:2: rule__Break__Group__6__Impl rule__Break__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalAgendomat.g:2033:1: rule__Break__Group__6__Impl : ( ( rule__Break__EndTimeAssignment_6 ) ) ;
    public final void rule__Break__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2037:1: ( ( ( rule__Break__EndTimeAssignment_6 ) ) )
            // InternalAgendomat.g:2038:1: ( ( rule__Break__EndTimeAssignment_6 ) )
            {
            // InternalAgendomat.g:2038:1: ( ( rule__Break__EndTimeAssignment_6 ) )
            // InternalAgendomat.g:2039:2: ( rule__Break__EndTimeAssignment_6 )
            {
             before(grammarAccess.getBreakAccess().getEndTimeAssignment_6()); 
            // InternalAgendomat.g:2040:2: ( rule__Break__EndTimeAssignment_6 )
            // InternalAgendomat.g:2040:3: rule__Break__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Break__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getEndTimeAssignment_6()); 

            }


            }

        }
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
    // InternalAgendomat.g:2048:1: rule__Break__Group__7 : rule__Break__Group__7__Impl rule__Break__Group__8 ;
    public final void rule__Break__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2052:1: ( rule__Break__Group__7__Impl rule__Break__Group__8 )
            // InternalAgendomat.g:2053:2: rule__Break__Group__7__Impl rule__Break__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2060:1: rule__Break__Group__7__Impl : ( 'Location' ) ;
    public final void rule__Break__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2064:1: ( ( 'Location' ) )
            // InternalAgendomat.g:2065:1: ( 'Location' )
            {
            // InternalAgendomat.g:2065:1: ( 'Location' )
            // InternalAgendomat.g:2066:2: 'Location'
            {
             before(grammarAccess.getBreakAccess().getLocationKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLocationKeyword_7()); 

            }


            }

        }
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
    // InternalAgendomat.g:2075:1: rule__Break__Group__8 : rule__Break__Group__8__Impl rule__Break__Group__9 ;
    public final void rule__Break__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2079:1: ( rule__Break__Group__8__Impl rule__Break__Group__9 )
            // InternalAgendomat.g:2080:2: rule__Break__Group__8__Impl rule__Break__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalAgendomat.g:2087:1: rule__Break__Group__8__Impl : ( ( rule__Break__LocationAssignment_8 ) ) ;
    public final void rule__Break__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2091:1: ( ( ( rule__Break__LocationAssignment_8 ) ) )
            // InternalAgendomat.g:2092:1: ( ( rule__Break__LocationAssignment_8 ) )
            {
            // InternalAgendomat.g:2092:1: ( ( rule__Break__LocationAssignment_8 ) )
            // InternalAgendomat.g:2093:2: ( rule__Break__LocationAssignment_8 )
            {
             before(grammarAccess.getBreakAccess().getLocationAssignment_8()); 
            // InternalAgendomat.g:2094:2: ( rule__Break__LocationAssignment_8 )
            // InternalAgendomat.g:2094:3: rule__Break__LocationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Break__LocationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getLocationAssignment_8()); 

            }


            }

        }
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
    // InternalAgendomat.g:2102:1: rule__Break__Group__9 : rule__Break__Group__9__Impl rule__Break__Group__10 ;
    public final void rule__Break__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2106:1: ( rule__Break__Group__9__Impl rule__Break__Group__10 )
            // InternalAgendomat.g:2107:2: rule__Break__Group__9__Impl rule__Break__Group__10
            {
            pushFollow(FOLLOW_26);
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
    // InternalAgendomat.g:2114:1: rule__Break__Group__9__Impl : ( ( rule__Break__Group_9__0 )? ) ;
    public final void rule__Break__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2118:1: ( ( ( rule__Break__Group_9__0 )? ) )
            // InternalAgendomat.g:2119:1: ( ( rule__Break__Group_9__0 )? )
            {
            // InternalAgendomat.g:2119:1: ( ( rule__Break__Group_9__0 )? )
            // InternalAgendomat.g:2120:2: ( rule__Break__Group_9__0 )?
            {
             before(grammarAccess.getBreakAccess().getGroup_9()); 
            // InternalAgendomat.g:2121:2: ( rule__Break__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAgendomat.g:2121:3: rule__Break__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Break__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBreakAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalAgendomat.g:2129:1: rule__Break__Group__10 : rule__Break__Group__10__Impl ;
    public final void rule__Break__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2133:1: ( rule__Break__Group__10__Impl )
            // InternalAgendomat.g:2134:2: rule__Break__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:2140:1: rule__Break__Group__10__Impl : ( '}' ) ;
    public final void rule__Break__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2144:1: ( ( '}' ) )
            // InternalAgendomat.g:2145:1: ( '}' )
            {
            // InternalAgendomat.g:2145:1: ( '}' )
            // InternalAgendomat.g:2146:2: '}'
            {
             before(grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Break__Group_9__0"
    // InternalAgendomat.g:2156:1: rule__Break__Group_9__0 : rule__Break__Group_9__0__Impl rule__Break__Group_9__1 ;
    public final void rule__Break__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2160:1: ( rule__Break__Group_9__0__Impl rule__Break__Group_9__1 )
            // InternalAgendomat.g:2161:2: rule__Break__Group_9__0__Impl rule__Break__Group_9__1
            {
            pushFollow(FOLLOW_23);
            rule__Break__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__0"


    // $ANTLR start "rule__Break__Group_9__0__Impl"
    // InternalAgendomat.g:2168:1: rule__Break__Group_9__0__Impl : ( 'Animator' ) ;
    public final void rule__Break__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2172:1: ( ( 'Animator' ) )
            // InternalAgendomat.g:2173:1: ( 'Animator' )
            {
            // InternalAgendomat.g:2173:1: ( 'Animator' )
            // InternalAgendomat.g:2174:2: 'Animator'
            {
             before(grammarAccess.getBreakAccess().getAnimatorKeyword_9_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getAnimatorKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__0__Impl"


    // $ANTLR start "rule__Break__Group_9__1"
    // InternalAgendomat.g:2183:1: rule__Break__Group_9__1 : rule__Break__Group_9__1__Impl rule__Break__Group_9__2 ;
    public final void rule__Break__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2187:1: ( rule__Break__Group_9__1__Impl rule__Break__Group_9__2 )
            // InternalAgendomat.g:2188:2: rule__Break__Group_9__1__Impl rule__Break__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__Break__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__1"


    // $ANTLR start "rule__Break__Group_9__1__Impl"
    // InternalAgendomat.g:2195:1: rule__Break__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Break__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2199:1: ( ( '(' ) )
            // InternalAgendomat.g:2200:1: ( '(' )
            {
            // InternalAgendomat.g:2200:1: ( '(' )
            // InternalAgendomat.g:2201:2: '('
            {
             before(grammarAccess.getBreakAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__1__Impl"


    // $ANTLR start "rule__Break__Group_9__2"
    // InternalAgendomat.g:2210:1: rule__Break__Group_9__2 : rule__Break__Group_9__2__Impl rule__Break__Group_9__3 ;
    public final void rule__Break__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2214:1: ( rule__Break__Group_9__2__Impl rule__Break__Group_9__3 )
            // InternalAgendomat.g:2215:2: rule__Break__Group_9__2__Impl rule__Break__Group_9__3
            {
            pushFollow(FOLLOW_24);
            rule__Break__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__2"


    // $ANTLR start "rule__Break__Group_9__2__Impl"
    // InternalAgendomat.g:2222:1: rule__Break__Group_9__2__Impl : ( ( rule__Break__AnimatorsAssignment_9_2 ) ) ;
    public final void rule__Break__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2226:1: ( ( ( rule__Break__AnimatorsAssignment_9_2 ) ) )
            // InternalAgendomat.g:2227:1: ( ( rule__Break__AnimatorsAssignment_9_2 ) )
            {
            // InternalAgendomat.g:2227:1: ( ( rule__Break__AnimatorsAssignment_9_2 ) )
            // InternalAgendomat.g:2228:2: ( rule__Break__AnimatorsAssignment_9_2 )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsAssignment_9_2()); 
            // InternalAgendomat.g:2229:2: ( rule__Break__AnimatorsAssignment_9_2 )
            // InternalAgendomat.g:2229:3: rule__Break__AnimatorsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Break__AnimatorsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getAnimatorsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__2__Impl"


    // $ANTLR start "rule__Break__Group_9__3"
    // InternalAgendomat.g:2237:1: rule__Break__Group_9__3 : rule__Break__Group_9__3__Impl rule__Break__Group_9__4 ;
    public final void rule__Break__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2241:1: ( rule__Break__Group_9__3__Impl rule__Break__Group_9__4 )
            // InternalAgendomat.g:2242:2: rule__Break__Group_9__3__Impl rule__Break__Group_9__4
            {
            pushFollow(FOLLOW_24);
            rule__Break__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__3"


    // $ANTLR start "rule__Break__Group_9__3__Impl"
    // InternalAgendomat.g:2249:1: rule__Break__Group_9__3__Impl : ( ( rule__Break__Group_9_3__0 )* ) ;
    public final void rule__Break__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2253:1: ( ( ( rule__Break__Group_9_3__0 )* ) )
            // InternalAgendomat.g:2254:1: ( ( rule__Break__Group_9_3__0 )* )
            {
            // InternalAgendomat.g:2254:1: ( ( rule__Break__Group_9_3__0 )* )
            // InternalAgendomat.g:2255:2: ( rule__Break__Group_9_3__0 )*
            {
             before(grammarAccess.getBreakAccess().getGroup_9_3()); 
            // InternalAgendomat.g:2256:2: ( rule__Break__Group_9_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAgendomat.g:2256:3: rule__Break__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Break__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBreakAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__3__Impl"


    // $ANTLR start "rule__Break__Group_9__4"
    // InternalAgendomat.g:2264:1: rule__Break__Group_9__4 : rule__Break__Group_9__4__Impl ;
    public final void rule__Break__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2268:1: ( rule__Break__Group_9__4__Impl )
            // InternalAgendomat.g:2269:2: rule__Break__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__4"


    // $ANTLR start "rule__Break__Group_9__4__Impl"
    // InternalAgendomat.g:2275:1: rule__Break__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Break__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2279:1: ( ( ')' ) )
            // InternalAgendomat.g:2280:1: ( ')' )
            {
            // InternalAgendomat.g:2280:1: ( ')' )
            // InternalAgendomat.g:2281:2: ')'
            {
             before(grammarAccess.getBreakAccess().getRightParenthesisKeyword_9_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9__4__Impl"


    // $ANTLR start "rule__Break__Group_9_3__0"
    // InternalAgendomat.g:2291:1: rule__Break__Group_9_3__0 : rule__Break__Group_9_3__0__Impl rule__Break__Group_9_3__1 ;
    public final void rule__Break__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2295:1: ( rule__Break__Group_9_3__0__Impl rule__Break__Group_9_3__1 )
            // InternalAgendomat.g:2296:2: rule__Break__Group_9_3__0__Impl rule__Break__Group_9_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Break__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9_3__0"


    // $ANTLR start "rule__Break__Group_9_3__0__Impl"
    // InternalAgendomat.g:2303:1: rule__Break__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Break__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2307:1: ( ( ',' ) )
            // InternalAgendomat.g:2308:1: ( ',' )
            {
            // InternalAgendomat.g:2308:1: ( ',' )
            // InternalAgendomat.g:2309:2: ','
            {
             before(grammarAccess.getBreakAccess().getCommaKeyword_9_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9_3__0__Impl"


    // $ANTLR start "rule__Break__Group_9_3__1"
    // InternalAgendomat.g:2318:1: rule__Break__Group_9_3__1 : rule__Break__Group_9_3__1__Impl ;
    public final void rule__Break__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2322:1: ( rule__Break__Group_9_3__1__Impl )
            // InternalAgendomat.g:2323:2: rule__Break__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9_3__1"


    // $ANTLR start "rule__Break__Group_9_3__1__Impl"
    // InternalAgendomat.g:2329:1: rule__Break__Group_9_3__1__Impl : ( ( rule__Break__AnimatorsAssignment_9_3_1 ) ) ;
    public final void rule__Break__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2333:1: ( ( ( rule__Break__AnimatorsAssignment_9_3_1 ) ) )
            // InternalAgendomat.g:2334:1: ( ( rule__Break__AnimatorsAssignment_9_3_1 ) )
            {
            // InternalAgendomat.g:2334:1: ( ( rule__Break__AnimatorsAssignment_9_3_1 ) )
            // InternalAgendomat.g:2335:2: ( rule__Break__AnimatorsAssignment_9_3_1 )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsAssignment_9_3_1()); 
            // InternalAgendomat.g:2336:2: ( rule__Break__AnimatorsAssignment_9_3_1 )
            // InternalAgendomat.g:2336:3: rule__Break__AnimatorsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Break__AnimatorsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getAnimatorsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group_9_3__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // InternalAgendomat.g:2345:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2349:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // InternalAgendomat.g:2350:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2357:1: rule__Talk__Group__0__Impl : ( 'Talk' ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2361:1: ( ( 'Talk' ) )
            // InternalAgendomat.g:2362:1: ( 'Talk' )
            {
            // InternalAgendomat.g:2362:1: ( 'Talk' )
            // InternalAgendomat.g:2363:2: 'Talk'
            {
             before(grammarAccess.getTalkAccess().getTalkKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAgendomat.g:2372:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2376:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // InternalAgendomat.g:2377:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAgendomat.g:2384:1: rule__Talk__Group__1__Impl : ( ( rule__Talk__TalkNameAssignment_1 ) ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2388:1: ( ( ( rule__Talk__TalkNameAssignment_1 ) ) )
            // InternalAgendomat.g:2389:1: ( ( rule__Talk__TalkNameAssignment_1 ) )
            {
            // InternalAgendomat.g:2389:1: ( ( rule__Talk__TalkNameAssignment_1 ) )
            // InternalAgendomat.g:2390:2: ( rule__Talk__TalkNameAssignment_1 )
            {
             before(grammarAccess.getTalkAccess().getTalkNameAssignment_1()); 
            // InternalAgendomat.g:2391:2: ( rule__Talk__TalkNameAssignment_1 )
            // InternalAgendomat.g:2391:3: rule__Talk__TalkNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkNameAssignment_1()); 

            }


            }

        }
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
    // InternalAgendomat.g:2399:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2403:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // InternalAgendomat.g:2404:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAgendomat.g:2411:1: rule__Talk__Group__2__Impl : ( '{' ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2415:1: ( ( '{' ) )
            // InternalAgendomat.g:2416:1: ( '{' )
            {
            // InternalAgendomat.g:2416:1: ( '{' )
            // InternalAgendomat.g:2417:2: '{'
            {
             before(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAgendomat.g:2426:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2430:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // InternalAgendomat.g:2431:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2438:1: rule__Talk__Group__3__Impl : ( 'Time' ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2442:1: ( ( 'Time' ) )
            // InternalAgendomat.g:2443:1: ( 'Time' )
            {
            // InternalAgendomat.g:2443:1: ( 'Time' )
            // InternalAgendomat.g:2444:2: 'Time'
            {
             before(grammarAccess.getTalkAccess().getTimeKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTimeKeyword_3()); 

            }


            }

        }
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
    // InternalAgendomat.g:2453:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2457:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // InternalAgendomat.g:2458:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalAgendomat.g:2465:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__TalkStartTimeAssignment_4 ) ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2469:1: ( ( ( rule__Talk__TalkStartTimeAssignment_4 ) ) )
            // InternalAgendomat.g:2470:1: ( ( rule__Talk__TalkStartTimeAssignment_4 ) )
            {
            // InternalAgendomat.g:2470:1: ( ( rule__Talk__TalkStartTimeAssignment_4 ) )
            // InternalAgendomat.g:2471:2: ( rule__Talk__TalkStartTimeAssignment_4 )
            {
             before(grammarAccess.getTalkAccess().getTalkStartTimeAssignment_4()); 
            // InternalAgendomat.g:2472:2: ( rule__Talk__TalkStartTimeAssignment_4 )
            // InternalAgendomat.g:2472:3: rule__Talk__TalkStartTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkStartTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkStartTimeAssignment_4()); 

            }


            }

        }
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
    // InternalAgendomat.g:2480:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2484:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // InternalAgendomat.g:2485:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2492:1: rule__Talk__Group__5__Impl : ( '-' ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2496:1: ( ( '-' ) )
            // InternalAgendomat.g:2497:1: ( '-' )
            {
            // InternalAgendomat.g:2497:1: ( '-' )
            // InternalAgendomat.g:2498:2: '-'
            {
             before(grammarAccess.getTalkAccess().getHyphenMinusKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
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
    // InternalAgendomat.g:2507:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl rule__Talk__Group__7 ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2511:1: ( rule__Talk__Group__6__Impl rule__Talk__Group__7 )
            // InternalAgendomat.g:2512:2: rule__Talk__Group__6__Impl rule__Talk__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalAgendomat.g:2519:1: rule__Talk__Group__6__Impl : ( ( rule__Talk__TalkEndTimeAssignment_6 ) ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2523:1: ( ( ( rule__Talk__TalkEndTimeAssignment_6 ) ) )
            // InternalAgendomat.g:2524:1: ( ( rule__Talk__TalkEndTimeAssignment_6 ) )
            {
            // InternalAgendomat.g:2524:1: ( ( rule__Talk__TalkEndTimeAssignment_6 ) )
            // InternalAgendomat.g:2525:2: ( rule__Talk__TalkEndTimeAssignment_6 )
            {
             before(grammarAccess.getTalkAccess().getTalkEndTimeAssignment_6()); 
            // InternalAgendomat.g:2526:2: ( rule__Talk__TalkEndTimeAssignment_6 )
            // InternalAgendomat.g:2526:3: rule__Talk__TalkEndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TalkEndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTalkEndTimeAssignment_6()); 

            }


            }

        }
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
    // InternalAgendomat.g:2534:1: rule__Talk__Group__7 : rule__Talk__Group__7__Impl rule__Talk__Group__8 ;
    public final void rule__Talk__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2538:1: ( rule__Talk__Group__7__Impl rule__Talk__Group__8 )
            // InternalAgendomat.g:2539:2: rule__Talk__Group__7__Impl rule__Talk__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalAgendomat.g:2546:1: rule__Talk__Group__7__Impl : ( 'Presenter' ) ;
    public final void rule__Talk__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2550:1: ( ( 'Presenter' ) )
            // InternalAgendomat.g:2551:1: ( 'Presenter' )
            {
            // InternalAgendomat.g:2551:1: ( 'Presenter' )
            // InternalAgendomat.g:2552:2: 'Presenter'
            {
             before(grammarAccess.getTalkAccess().getPresenterKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getPresenterKeyword_7()); 

            }


            }

        }
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
    // InternalAgendomat.g:2561:1: rule__Talk__Group__8 : rule__Talk__Group__8__Impl rule__Talk__Group__9 ;
    public final void rule__Talk__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2565:1: ( rule__Talk__Group__8__Impl rule__Talk__Group__9 )
            // InternalAgendomat.g:2566:2: rule__Talk__Group__8__Impl rule__Talk__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalAgendomat.g:2573:1: rule__Talk__Group__8__Impl : ( '(' ) ;
    public final void rule__Talk__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2577:1: ( ( '(' ) )
            // InternalAgendomat.g:2578:1: ( '(' )
            {
            // InternalAgendomat.g:2578:1: ( '(' )
            // InternalAgendomat.g:2579:2: '('
            {
             before(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalAgendomat.g:2588:1: rule__Talk__Group__9 : rule__Talk__Group__9__Impl rule__Talk__Group__10 ;
    public final void rule__Talk__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2592:1: ( rule__Talk__Group__9__Impl rule__Talk__Group__10 )
            // InternalAgendomat.g:2593:2: rule__Talk__Group__9__Impl rule__Talk__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalAgendomat.g:2600:1: rule__Talk__Group__9__Impl : ( ( rule__Talk__PresentersAssignment_9 ) ) ;
    public final void rule__Talk__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2604:1: ( ( ( rule__Talk__PresentersAssignment_9 ) ) )
            // InternalAgendomat.g:2605:1: ( ( rule__Talk__PresentersAssignment_9 ) )
            {
            // InternalAgendomat.g:2605:1: ( ( rule__Talk__PresentersAssignment_9 ) )
            // InternalAgendomat.g:2606:2: ( rule__Talk__PresentersAssignment_9 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_9()); 
            // InternalAgendomat.g:2607:2: ( rule__Talk__PresentersAssignment_9 )
            // InternalAgendomat.g:2607:3: rule__Talk__PresentersAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Talk__PresentersAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_9()); 

            }


            }

        }
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
    // InternalAgendomat.g:2615:1: rule__Talk__Group__10 : rule__Talk__Group__10__Impl rule__Talk__Group__11 ;
    public final void rule__Talk__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2619:1: ( rule__Talk__Group__10__Impl rule__Talk__Group__11 )
            // InternalAgendomat.g:2620:2: rule__Talk__Group__10__Impl rule__Talk__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalAgendomat.g:2627:1: rule__Talk__Group__10__Impl : ( ( rule__Talk__Group_10__0 )* ) ;
    public final void rule__Talk__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2631:1: ( ( ( rule__Talk__Group_10__0 )* ) )
            // InternalAgendomat.g:2632:1: ( ( rule__Talk__Group_10__0 )* )
            {
            // InternalAgendomat.g:2632:1: ( ( rule__Talk__Group_10__0 )* )
            // InternalAgendomat.g:2633:2: ( rule__Talk__Group_10__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_10()); 
            // InternalAgendomat.g:2634:2: ( rule__Talk__Group_10__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAgendomat.g:2634:3: rule__Talk__Group_10__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Talk__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalAgendomat.g:2642:1: rule__Talk__Group__11 : rule__Talk__Group__11__Impl rule__Talk__Group__12 ;
    public final void rule__Talk__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2646:1: ( rule__Talk__Group__11__Impl rule__Talk__Group__12 )
            // InternalAgendomat.g:2647:2: rule__Talk__Group__11__Impl rule__Talk__Group__12
            {
            pushFollow(FOLLOW_28);
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
    // InternalAgendomat.g:2654:1: rule__Talk__Group__11__Impl : ( ')' ) ;
    public final void rule__Talk__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2658:1: ( ( ')' ) )
            // InternalAgendomat.g:2659:1: ( ')' )
            {
            // InternalAgendomat.g:2659:1: ( ')' )
            // InternalAgendomat.g:2660:2: ')'
            {
             before(grammarAccess.getTalkAccess().getRightParenthesisKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
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
    // InternalAgendomat.g:2669:1: rule__Talk__Group__12 : rule__Talk__Group__12__Impl ;
    public final void rule__Talk__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2673:1: ( rule__Talk__Group__12__Impl )
            // InternalAgendomat.g:2674:2: rule__Talk__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalAgendomat.g:2680:1: rule__Talk__Group__12__Impl : ( '}' ) ;
    public final void rule__Talk__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2684:1: ( ( '}' ) )
            // InternalAgendomat.g:2685:1: ( '}' )
            {
            // InternalAgendomat.g:2685:1: ( '}' )
            // InternalAgendomat.g:2686:2: '}'
            {
             before(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Talk__Group_10__0"
    // InternalAgendomat.g:2696:1: rule__Talk__Group_10__0 : rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1 ;
    public final void rule__Talk__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2700:1: ( rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1 )
            // InternalAgendomat.g:2701:2: rule__Talk__Group_10__0__Impl rule__Talk__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Talk__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_10__0"


    // $ANTLR start "rule__Talk__Group_10__0__Impl"
    // InternalAgendomat.g:2708:1: rule__Talk__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2712:1: ( ( ',' ) )
            // InternalAgendomat.g:2713:1: ( ',' )
            {
            // InternalAgendomat.g:2713:1: ( ',' )
            // InternalAgendomat.g:2714:2: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_10_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_10__0__Impl"


    // $ANTLR start "rule__Talk__Group_10__1"
    // InternalAgendomat.g:2723:1: rule__Talk__Group_10__1 : rule__Talk__Group_10__1__Impl ;
    public final void rule__Talk__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2727:1: ( rule__Talk__Group_10__1__Impl )
            // InternalAgendomat.g:2728:2: rule__Talk__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_10__1"


    // $ANTLR start "rule__Talk__Group_10__1__Impl"
    // InternalAgendomat.g:2734:1: rule__Talk__Group_10__1__Impl : ( ( rule__Talk__PresentersAssignment_10_1 ) ) ;
    public final void rule__Talk__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2738:1: ( ( ( rule__Talk__PresentersAssignment_10_1 ) ) )
            // InternalAgendomat.g:2739:1: ( ( rule__Talk__PresentersAssignment_10_1 ) )
            {
            // InternalAgendomat.g:2739:1: ( ( rule__Talk__PresentersAssignment_10_1 ) )
            // InternalAgendomat.g:2740:2: ( rule__Talk__PresentersAssignment_10_1 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_10_1()); 
            // InternalAgendomat.g:2741:2: ( rule__Talk__PresentersAssignment_10_1 )
            // InternalAgendomat.g:2741:3: rule__Talk__PresentersAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__PresentersAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_10__1__Impl"


    // $ANTLR start "rule__Event__EventNameAssignment_1"
    // InternalAgendomat.g:2750:1: rule__Event__EventNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__EventNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2754:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2755:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2755:2: ( RULE_STRING )
            // InternalAgendomat.g:2756:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment_1"


    // $ANTLR start "rule__Event__EventStartDateAssignment_2_0_1"
    // InternalAgendomat.g:2765:1: rule__Event__EventStartDateAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__Event__EventStartDateAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2769:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2770:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2770:2: ( RULE_STRING )
            // InternalAgendomat.g:2771:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventStartDateAssignment_2_0_1"


    // $ANTLR start "rule__Event__EventEndDateAssignment_2_0_3"
    // InternalAgendomat.g:2780:1: rule__Event__EventEndDateAssignment_2_0_3 : ( RULE_STRING ) ;
    public final void rule__Event__EventEndDateAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2784:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2785:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2785:2: ( RULE_STRING )
            // InternalAgendomat.g:2786:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventEndDateSTRINGTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventEndDateSTRINGTerminalRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventEndDateAssignment_2_0_3"


    // $ANTLR start "rule__Event__EventStartDateAssignment_2_1_1"
    // InternalAgendomat.g:2795:1: rule__Event__EventStartDateAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Event__EventStartDateAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2799:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2800:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2800:2: ( RULE_STRING )
            // InternalAgendomat.g:2801:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventStartDateAssignment_2_1_1"


    // $ANTLR start "rule__Event__DescAssignment_4_1"
    // InternalAgendomat.g:2810:1: rule__Event__DescAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Event__DescAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2814:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2815:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2815:2: ( RULE_STRING )
            // InternalAgendomat.g:2816:3: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DescAssignment_4_1"


    // $ANTLR start "rule__Event__PersonsAssignment_5"
    // InternalAgendomat.g:2825:1: rule__Event__PersonsAssignment_5 : ( rulePerson ) ;
    public final void rule__Event__PersonsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2829:1: ( ( rulePerson ) )
            // InternalAgendomat.g:2830:2: ( rulePerson )
            {
            // InternalAgendomat.g:2830:2: ( rulePerson )
            // InternalAgendomat.g:2831:3: rulePerson
            {
             before(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__PersonsAssignment_5"


    // $ANTLR start "rule__Event__LocationsAssignment_6"
    // InternalAgendomat.g:2840:1: rule__Event__LocationsAssignment_6 : ( ruleLocation ) ;
    public final void rule__Event__LocationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2844:1: ( ( ruleLocation ) )
            // InternalAgendomat.g:2845:2: ( ruleLocation )
            {
            // InternalAgendomat.g:2845:2: ( ruleLocation )
            // InternalAgendomat.g:2846:3: ruleLocation
            {
             before(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__LocationsAssignment_6"


    // $ANTLR start "rule__Event__ProgramItemsAssignment_7"
    // InternalAgendomat.g:2855:1: rule__Event__ProgramItemsAssignment_7 : ( ruleProgramItem ) ;
    public final void rule__Event__ProgramItemsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2859:1: ( ( ruleProgramItem ) )
            // InternalAgendomat.g:2860:2: ( ruleProgramItem )
            {
            // InternalAgendomat.g:2860:2: ( ruleProgramItem )
            // InternalAgendomat.g:2861:3: ruleProgramItem
            {
             before(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProgramItem();

            state._fsp--;

             after(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ProgramItemsAssignment_7"


    // $ANTLR start "rule__Person__PersonNameAssignment_1"
    // InternalAgendomat.g:2870:1: rule__Person__PersonNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Person__PersonNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2874:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2875:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2875:2: ( RULE_STRING )
            // InternalAgendomat.g:2876:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getPersonNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PersonNameAssignment_1"


    // $ANTLR start "rule__Person__RolesAssignment_4"
    // InternalAgendomat.g:2885:1: rule__Person__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2889:1: ( ( ruleRole ) )
            // InternalAgendomat.g:2890:2: ( ruleRole )
            {
            // InternalAgendomat.g:2890:2: ( ruleRole )
            // InternalAgendomat.g:2891:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_4"


    // $ANTLR start "rule__Person__RolesAssignment_5_1"
    // InternalAgendomat.g:2900:1: rule__Person__RolesAssignment_5_1 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2904:1: ( ( ruleRole ) )
            // InternalAgendomat.g:2905:2: ( ruleRole )
            {
            // InternalAgendomat.g:2905:2: ( ruleRole )
            // InternalAgendomat.g:2906:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_5_1"


    // $ANTLR start "rule__Location__LocationNameAssignment_1"
    // InternalAgendomat.g:2915:1: rule__Location__LocationNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Location__LocationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2919:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2920:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2920:2: ( RULE_STRING )
            // InternalAgendomat.g:2921:3: RULE_STRING
            {
             before(grammarAccess.getLocationAccess().getLocationNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LocationNameAssignment_1"


    // $ANTLR start "rule__Location__LocationTypeAssignment_3"
    // InternalAgendomat.g:2930:1: rule__Location__LocationTypeAssignment_3 : ( ruleLocationType ) ;
    public final void rule__Location__LocationTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2934:1: ( ( ruleLocationType ) )
            // InternalAgendomat.g:2935:2: ( ruleLocationType )
            {
            // InternalAgendomat.g:2935:2: ( ruleLocationType )
            // InternalAgendomat.g:2936:3: ruleLocationType
            {
             before(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocationType();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LocationTypeAssignment_3"


    // $ANTLR start "rule__Session__SessionNameAssignment_1"
    // InternalAgendomat.g:2945:1: rule__Session__SessionNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Session__SessionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2949:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2950:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2950:2: ( RULE_STRING )
            // InternalAgendomat.g:2951:3: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getSessionNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__SessionNameAssignment_1"


    // $ANTLR start "rule__Session__StartTimeAssignment_4"
    // InternalAgendomat.g:2960:1: rule__Session__StartTimeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Session__StartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2964:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2965:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2965:2: ( RULE_STRING )
            // InternalAgendomat.g:2966:3: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartTimeAssignment_4"


    // $ANTLR start "rule__Session__EndTimeAssignment_6"
    // InternalAgendomat.g:2975:1: rule__Session__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Session__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2979:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2980:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:2980:2: ( RULE_STRING )
            // InternalAgendomat.g:2981:3: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndTimeAssignment_6"


    // $ANTLR start "rule__Session__LocationAssignment_8"
    // InternalAgendomat.g:2990:1: rule__Session__LocationAssignment_8 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__LocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:2994:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:2995:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:2995:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:2996:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getLocationLocationCrossReference_8_0()); 
            // InternalAgendomat.g:2997:3: ( RULE_STRING )
            // InternalAgendomat.g:2998:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getLocationLocationSTRINGTerminalRuleCall_8_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLocationLocationSTRINGTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getLocationLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__LocationAssignment_8"


    // $ANTLR start "rule__Session__TechSupportAssignment_9_2"
    // InternalAgendomat.g:3009:1: rule__Session__TechSupportAssignment_9_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__TechSupportAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3013:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3014:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3014:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3015:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_2_0()); 
            // InternalAgendomat.g:3016:3: ( RULE_STRING )
            // InternalAgendomat.g:3017:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonSTRINGTerminalRuleCall_9_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTechSupportPersonSTRINGTerminalRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TechSupportAssignment_9_2"


    // $ANTLR start "rule__Session__TechSupportAssignment_9_3_1"
    // InternalAgendomat.g:3028:1: rule__Session__TechSupportAssignment_9_3_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__TechSupportAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3032:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3033:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3033:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3034:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_3_1_0()); 
            // InternalAgendomat.g:3035:3: ( RULE_STRING )
            // InternalAgendomat.g:3036:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getTechSupportPersonSTRINGTerminalRuleCall_9_3_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getTechSupportPersonSTRINGTerminalRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TechSupportAssignment_9_3_1"


    // $ANTLR start "rule__Session__EquipmentAssignment_10_1"
    // InternalAgendomat.g:3047:1: rule__Session__EquipmentAssignment_10_1 : ( ruleEquipment ) ;
    public final void rule__Session__EquipmentAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3051:1: ( ( ruleEquipment ) )
            // InternalAgendomat.g:3052:2: ( ruleEquipment )
            {
            // InternalAgendomat.g:3052:2: ( ruleEquipment )
            // InternalAgendomat.g:3053:3: ruleEquipment
            {
             before(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquipment();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EquipmentAssignment_10_1"


    // $ANTLR start "rule__Session__EquipmentAssignment_10_2_1"
    // InternalAgendomat.g:3062:1: rule__Session__EquipmentAssignment_10_2_1 : ( ruleEquipment ) ;
    public final void rule__Session__EquipmentAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3066:1: ( ( ruleEquipment ) )
            // InternalAgendomat.g:3067:2: ( ruleEquipment )
            {
            // InternalAgendomat.g:3067:2: ( ruleEquipment )
            // InternalAgendomat.g:3068:3: ruleEquipment
            {
             before(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquipment();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EquipmentAssignment_10_2_1"


    // $ANTLR start "rule__Session__TalksAssignment_11"
    // InternalAgendomat.g:3077:1: rule__Session__TalksAssignment_11 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3081:1: ( ( ruleTalk ) )
            // InternalAgendomat.g:3082:2: ( ruleTalk )
            {
            // InternalAgendomat.g:3082:2: ( ruleTalk )
            // InternalAgendomat.g:3083:3: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_11"


    // $ANTLR start "rule__Break__BreakNameAssignment_1"
    // InternalAgendomat.g:3092:1: rule__Break__BreakNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Break__BreakNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3096:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3097:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3097:2: ( RULE_STRING )
            // InternalAgendomat.g:3098:3: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getBreakNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getBreakNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__BreakNameAssignment_1"


    // $ANTLR start "rule__Break__StartTimeAssignment_4"
    // InternalAgendomat.g:3107:1: rule__Break__StartTimeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Break__StartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3111:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3112:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3112:2: ( RULE_STRING )
            // InternalAgendomat.g:3113:3: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getStartTimeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__StartTimeAssignment_4"


    // $ANTLR start "rule__Break__EndTimeAssignment_6"
    // InternalAgendomat.g:3122:1: rule__Break__EndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Break__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3126:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3127:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3127:2: ( RULE_STRING )
            // InternalAgendomat.g:3128:3: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getEndTimeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__EndTimeAssignment_6"


    // $ANTLR start "rule__Break__LocationAssignment_8"
    // InternalAgendomat.g:3137:1: rule__Break__LocationAssignment_8 : ( ( RULE_STRING ) ) ;
    public final void rule__Break__LocationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3141:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3142:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3142:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3143:3: ( RULE_STRING )
            {
             before(grammarAccess.getBreakAccess().getLocationLocationCrossReference_8_0()); 
            // InternalAgendomat.g:3144:3: ( RULE_STRING )
            // InternalAgendomat.g:3145:4: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getLocationLocationSTRINGTerminalRuleCall_8_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getLocationLocationSTRINGTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getLocationLocationCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__LocationAssignment_8"


    // $ANTLR start "rule__Break__AnimatorsAssignment_9_2"
    // InternalAgendomat.g:3156:1: rule__Break__AnimatorsAssignment_9_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Break__AnimatorsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3160:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3161:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3161:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3162:3: ( RULE_STRING )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_2_0()); 
            // InternalAgendomat.g:3163:3: ( RULE_STRING )
            // InternalAgendomat.g:3164:4: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonSTRINGTerminalRuleCall_9_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getAnimatorsPersonSTRINGTerminalRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__AnimatorsAssignment_9_2"


    // $ANTLR start "rule__Break__AnimatorsAssignment_9_3_1"
    // InternalAgendomat.g:3175:1: rule__Break__AnimatorsAssignment_9_3_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Break__AnimatorsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3179:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3180:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3180:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3181:3: ( RULE_STRING )
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_3_1_0()); 
            // InternalAgendomat.g:3182:3: ( RULE_STRING )
            // InternalAgendomat.g:3183:4: RULE_STRING
            {
             before(grammarAccess.getBreakAccess().getAnimatorsPersonSTRINGTerminalRuleCall_9_3_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getAnimatorsPersonSTRINGTerminalRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__AnimatorsAssignment_9_3_1"


    // $ANTLR start "rule__Talk__TalkNameAssignment_1"
    // InternalAgendomat.g:3194:1: rule__Talk__TalkNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Talk__TalkNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3198:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3199:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3199:2: ( RULE_STRING )
            // InternalAgendomat.g:3200:3: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getTalkNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkNameAssignment_1"


    // $ANTLR start "rule__Talk__TalkStartTimeAssignment_4"
    // InternalAgendomat.g:3209:1: rule__Talk__TalkStartTimeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Talk__TalkStartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3213:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3214:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3214:2: ( RULE_STRING )
            // InternalAgendomat.g:3215:3: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getTalkStartTimeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkStartTimeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkStartTimeAssignment_4"


    // $ANTLR start "rule__Talk__TalkEndTimeAssignment_6"
    // InternalAgendomat.g:3224:1: rule__Talk__TalkEndTimeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Talk__TalkEndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3228:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3229:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3229:2: ( RULE_STRING )
            // InternalAgendomat.g:3230:3: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getTalkEndTimeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkEndTimeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TalkEndTimeAssignment_6"


    // $ANTLR start "rule__Talk__PresentersAssignment_9"
    // InternalAgendomat.g:3239:1: rule__Talk__PresentersAssignment_9 : ( ( RULE_STRING ) ) ;
    public final void rule__Talk__PresentersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3243:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3244:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3244:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3245:3: ( RULE_STRING )
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_9_0()); 
            // InternalAgendomat.g:3246:3: ( RULE_STRING )
            // InternalAgendomat.g:3247:4: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonSTRINGTerminalRuleCall_9_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getPresentersPersonSTRINGTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__PresentersAssignment_9"


    // $ANTLR start "rule__Talk__PresentersAssignment_10_1"
    // InternalAgendomat.g:3258:1: rule__Talk__PresentersAssignment_10_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Talk__PresentersAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3262:1: ( ( ( RULE_STRING ) ) )
            // InternalAgendomat.g:3263:2: ( ( RULE_STRING ) )
            {
            // InternalAgendomat.g:3263:2: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3264:3: ( RULE_STRING )
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_1_0()); 
            // InternalAgendomat.g:3265:3: ( RULE_STRING )
            // InternalAgendomat.g:3266:4: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getPresentersPersonSTRINGTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getPresentersPersonSTRINGTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__PresentersAssignment_10_1"


    // $ANTLR start "rule__Equipment__EquipmentNameAssignment"
    // InternalAgendomat.g:3277:1: rule__Equipment__EquipmentNameAssignment : ( RULE_STRING ) ;
    public final void rule__Equipment__EquipmentNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAgendomat.g:3281:1: ( ( RULE_STRING ) )
            // InternalAgendomat.g:3282:2: ( RULE_STRING )
            {
            // InternalAgendomat.g:3282:2: ( RULE_STRING )
            // InternalAgendomat.g:3283:3: RULE_STRING
            {
             before(grammarAccess.getEquipmentAccess().getEquipmentNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEquipmentAccess().getEquipmentNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equipment__EquipmentNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001050C40000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001040000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002800041000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});

}