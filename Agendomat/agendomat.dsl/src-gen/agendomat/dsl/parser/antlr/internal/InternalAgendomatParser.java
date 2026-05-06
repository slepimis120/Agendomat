package agendomat.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import agendomat.dsl.services.AgendomatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgendomatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'events'", "','", "'}'", "'Event'", "'eventName'", "'eventStartDate'", "'eventEndDate'", "'desc'", "'persons'", "'programItems'", "'locations'", "'Person'", "'personName'", "'roles'", "'Location'", "'locationName'", "'locationType'", "'Session'", "'sessionName'", "'startTime'", "'endTime'", "'location'", "'techSupport'", "'('", "')'", "'talks'", "'equipment'", "'Break'", "'breakName'", "'animators'", "'Talk'", "'talkName'", "'talkStartTime'", "'talkEndTime'", "'presenters'", "'Equipment'", "'equipmentName'", "'equipmentType'", "'Presenter'", "'TechSupport'", "'Animator'", "'Room'", "'BreakArea'"
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

        public InternalAgendomatParser(TokenStream input, AgendomatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AgendomatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAgendomat.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAgendomat.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAgendomat.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAgendomat.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_events_5_0 = null;

        EObject lv_events_7_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:78:2: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAgendomat.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAgendomat.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAgendomat.g:80:3: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAgendomat.g:80:3: ()
            // InternalAgendomat.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAgendomat.g:95:3: (otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAgendomat.g:96:4: otherlv_3= 'events' otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getEventsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAgendomat.g:104:4: ( (lv_events_5_0= ruleEvent ) )
                    // InternalAgendomat.g:105:5: (lv_events_5_0= ruleEvent )
                    {
                    // InternalAgendomat.g:105:5: (lv_events_5_0= ruleEvent )
                    // InternalAgendomat.g:106:6: lv_events_5_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_events_5_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_5_0,
                    							"agendomat.dsl.Agendomat.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:123:4: (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAgendomat.g:124:5: otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAgendomat.g:128:5: ( (lv_events_7_0= ruleEvent ) )
                    	    // InternalAgendomat.g:129:6: (lv_events_7_0= ruleEvent )
                    	    {
                    	    // InternalAgendomat.g:129:6: (lv_events_7_0= ruleEvent )
                    	    // InternalAgendomat.g:130:7: lv_events_7_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getEventsEventParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_events_7_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_7_0,
                    	    								"agendomat.dsl.Agendomat.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgramItem"
    // InternalAgendomat.g:161:1: entryRuleProgramItem returns [EObject current=null] : iv_ruleProgramItem= ruleProgramItem EOF ;
    public final EObject entryRuleProgramItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramItem = null;


        try {
            // InternalAgendomat.g:161:52: (iv_ruleProgramItem= ruleProgramItem EOF )
            // InternalAgendomat.g:162:2: iv_ruleProgramItem= ruleProgramItem EOF
            {
             newCompositeNode(grammarAccess.getProgramItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramItem=ruleProgramItem();

            state._fsp--;

             current =iv_ruleProgramItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgramItem"


    // $ANTLR start "ruleProgramItem"
    // InternalAgendomat.g:168:1: ruleProgramItem returns [EObject current=null] : (this_Session_0= ruleSession | this_Break_1= ruleBreak ) ;
    public final EObject ruleProgramItem() throws RecognitionException {
        EObject current = null;

        EObject this_Session_0 = null;

        EObject this_Break_1 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:174:2: ( (this_Session_0= ruleSession | this_Break_1= ruleBreak ) )
            // InternalAgendomat.g:175:2: (this_Session_0= ruleSession | this_Break_1= ruleBreak )
            {
            // InternalAgendomat.g:175:2: (this_Session_0= ruleSession | this_Break_1= ruleBreak )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAgendomat.g:176:3: this_Session_0= ruleSession
                    {

                    			newCompositeNode(grammarAccess.getProgramItemAccess().getSessionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Session_0=ruleSession();

                    state._fsp--;


                    			current = this_Session_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:185:3: this_Break_1= ruleBreak
                    {

                    			newCompositeNode(grammarAccess.getProgramItemAccess().getBreakParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Break_1=ruleBreak();

                    state._fsp--;


                    			current = this_Break_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleProgramItem"


    // $ANTLR start "entryRuleEvent"
    // InternalAgendomat.g:197:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAgendomat.g:197:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAgendomat.g:198:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAgendomat.g:204:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'eventName' ( (lv_eventName_3_0= ruleEString ) ) otherlv_4= 'eventStartDate' ( (lv_eventStartDate_5_0= ruleEString ) ) otherlv_6= 'eventEndDate' ( (lv_eventEndDate_7_0= ruleEString ) ) (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )? (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )? (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )? (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_eventName_3_0 = null;

        AntlrDatatypeRuleToken lv_eventStartDate_5_0 = null;

        AntlrDatatypeRuleToken lv_eventEndDate_7_0 = null;

        AntlrDatatypeRuleToken lv_desc_9_0 = null;

        EObject lv_persons_12_0 = null;

        EObject lv_persons_14_0 = null;

        EObject lv_programItems_18_0 = null;

        EObject lv_programItems_20_0 = null;

        EObject lv_locations_24_0 = null;

        EObject lv_locations_26_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:210:2: ( (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'eventName' ( (lv_eventName_3_0= ruleEString ) ) otherlv_4= 'eventStartDate' ( (lv_eventStartDate_5_0= ruleEString ) ) otherlv_6= 'eventEndDate' ( (lv_eventEndDate_7_0= ruleEString ) ) (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )? (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )? (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )? (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalAgendomat.g:211:2: (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'eventName' ( (lv_eventName_3_0= ruleEString ) ) otherlv_4= 'eventStartDate' ( (lv_eventStartDate_5_0= ruleEString ) ) otherlv_6= 'eventEndDate' ( (lv_eventEndDate_7_0= ruleEString ) ) (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )? (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )? (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )? (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalAgendomat.g:211:2: (otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'eventName' ( (lv_eventName_3_0= ruleEString ) ) otherlv_4= 'eventStartDate' ( (lv_eventStartDate_5_0= ruleEString ) ) otherlv_6= 'eventEndDate' ( (lv_eventEndDate_7_0= ruleEString ) ) (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )? (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )? (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )? (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalAgendomat.g:212:3: otherlv_0= 'Event' otherlv_1= '{' otherlv_2= 'eventName' ( (lv_eventName_3_0= ruleEString ) ) otherlv_4= 'eventStartDate' ( (lv_eventStartDate_5_0= ruleEString ) ) otherlv_6= 'eventEndDate' ( (lv_eventEndDate_7_0= ruleEString ) ) (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )? (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )? (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )? (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getEventNameKeyword_2());
            		
            // InternalAgendomat.g:224:3: ( (lv_eventName_3_0= ruleEString ) )
            // InternalAgendomat.g:225:4: (lv_eventName_3_0= ruleEString )
            {
            // InternalAgendomat.g:225:4: (lv_eventName_3_0= ruleEString )
            // InternalAgendomat.g:226:5: lv_eventName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getEventNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_eventName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"eventName",
            						lv_eventName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getEventStartDateKeyword_4());
            		
            // InternalAgendomat.g:247:3: ( (lv_eventStartDate_5_0= ruleEString ) )
            // InternalAgendomat.g:248:4: (lv_eventStartDate_5_0= ruleEString )
            {
            // InternalAgendomat.g:248:4: (lv_eventStartDate_5_0= ruleEString )
            // InternalAgendomat.g:249:5: lv_eventStartDate_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getEventStartDateEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_eventStartDate_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"eventStartDate",
            						lv_eventStartDate_5_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getEventAccess().getEventEndDateKeyword_6());
            		
            // InternalAgendomat.g:270:3: ( (lv_eventEndDate_7_0= ruleEString ) )
            // InternalAgendomat.g:271:4: (lv_eventEndDate_7_0= ruleEString )
            {
            // InternalAgendomat.g:271:4: (lv_eventEndDate_7_0= ruleEString )
            // InternalAgendomat.g:272:5: lv_eventEndDate_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getEventEndDateEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_eventEndDate_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"eventEndDate",
            						lv_eventEndDate_7_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:289:3: (otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgendomat.g:290:4: otherlv_8= 'desc' ( (lv_desc_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDescKeyword_8_0());
                    			
                    // InternalAgendomat.g:294:4: ( (lv_desc_9_0= ruleEString ) )
                    // InternalAgendomat.g:295:5: (lv_desc_9_0= ruleEString )
                    {
                    // InternalAgendomat.g:295:5: (lv_desc_9_0= ruleEString )
                    // InternalAgendomat.g:296:6: lv_desc_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDescEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_desc_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"desc",
                    							lv_desc_9_0,
                    							"agendomat.dsl.Agendomat.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAgendomat.g:314:3: (otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAgendomat.g:315:4: otherlv_10= 'persons' otherlv_11= '{' ( (lv_persons_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getPersonsKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAgendomat.g:323:4: ( (lv_persons_12_0= rulePerson ) )
                    // InternalAgendomat.g:324:5: (lv_persons_12_0= rulePerson )
                    {
                    // InternalAgendomat.g:324:5: (lv_persons_12_0= rulePerson )
                    // InternalAgendomat.g:325:6: lv_persons_12_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_persons_12_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"persons",
                    							lv_persons_12_0,
                    							"agendomat.dsl.Agendomat.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:342:4: (otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAgendomat.g:343:5: otherlv_13= ',' ( (lv_persons_14_0= rulePerson ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEventAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAgendomat.g:347:5: ( (lv_persons_14_0= rulePerson ) )
                    	    // InternalAgendomat.g:348:6: (lv_persons_14_0= rulePerson )
                    	    {
                    	    // InternalAgendomat.g:348:6: (lv_persons_14_0= rulePerson )
                    	    // InternalAgendomat.g:349:7: lv_persons_14_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_persons_14_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"persons",
                    	    								lv_persons_14_0,
                    	    								"agendomat.dsl.Agendomat.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAgendomat.g:372:3: (otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAgendomat.g:373:4: otherlv_16= 'programItems' otherlv_17= '{' ( (lv_programItems_18_0= ruleProgramItem ) ) (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventAccess().getProgramItemsKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAgendomat.g:381:4: ( (lv_programItems_18_0= ruleProgramItem ) )
                    // InternalAgendomat.g:382:5: (lv_programItems_18_0= ruleProgramItem )
                    {
                    // InternalAgendomat.g:382:5: (lv_programItems_18_0= ruleProgramItem )
                    // InternalAgendomat.g:383:6: lv_programItems_18_0= ruleProgramItem
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_programItems_18_0=ruleProgramItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"programItems",
                    							lv_programItems_18_0,
                    							"agendomat.dsl.Agendomat.ProgramItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:400:4: (otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAgendomat.g:401:5: otherlv_19= ',' ( (lv_programItems_20_0= ruleProgramItem ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEventAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAgendomat.g:405:5: ( (lv_programItems_20_0= ruleProgramItem ) )
                    	    // InternalAgendomat.g:406:6: (lv_programItems_20_0= ruleProgramItem )
                    	    {
                    	    // InternalAgendomat.g:406:6: (lv_programItems_20_0= ruleProgramItem )
                    	    // InternalAgendomat.g:407:7: lv_programItems_20_0= ruleProgramItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_programItems_20_0=ruleProgramItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"programItems",
                    	    								lv_programItems_20_0,
                    	    								"agendomat.dsl.Agendomat.ProgramItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAgendomat.g:430:3: (otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAgendomat.g:431:4: otherlv_22= 'locations' otherlv_23= '{' ( (lv_locations_24_0= ruleLocation ) ) (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getEventAccess().getLocationsKeyword_11_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalAgendomat.g:439:4: ( (lv_locations_24_0= ruleLocation ) )
                    // InternalAgendomat.g:440:5: (lv_locations_24_0= ruleLocation )
                    {
                    // InternalAgendomat.g:440:5: (lv_locations_24_0= ruleLocation )
                    // InternalAgendomat.g:441:6: lv_locations_24_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_locations_24_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"locations",
                    							lv_locations_24_0,
                    							"agendomat.dsl.Agendomat.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:458:4: (otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAgendomat.g:459:5: otherlv_25= ',' ( (lv_locations_26_0= ruleLocation ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEventAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalAgendomat.g:463:5: ( (lv_locations_26_0= ruleLocation ) )
                    	    // InternalAgendomat.g:464:6: (lv_locations_26_0= ruleLocation )
                    	    {
                    	    // InternalAgendomat.g:464:6: (lv_locations_26_0= ruleLocation )
                    	    // InternalAgendomat.g:465:7: lv_locations_26_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_locations_26_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locations",
                    	    								lv_locations_26_0,
                    	    								"agendomat.dsl.Agendomat.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_27, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalAgendomat.g:496:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAgendomat.g:496:47: (iv_ruleEString= ruleEString EOF )
            // InternalAgendomat.g:497:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAgendomat.g:503:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAgendomat.g:509:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAgendomat.g:510:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAgendomat.g:510:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAgendomat.g:511:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:519:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePerson"
    // InternalAgendomat.g:530:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalAgendomat.g:530:47: (iv_rulePerson= rulePerson EOF )
            // InternalAgendomat.g:531:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalAgendomat.g:537:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' otherlv_1= '{' otherlv_2= 'personName' ( (lv_personName_3_0= ruleEString ) ) otherlv_4= 'roles' otherlv_5= '{' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_personName_3_0 = null;

        Enumerator lv_roles_6_0 = null;

        Enumerator lv_roles_8_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:543:2: ( (otherlv_0= 'Person' otherlv_1= '{' otherlv_2= 'personName' ( (lv_personName_3_0= ruleEString ) ) otherlv_4= 'roles' otherlv_5= '{' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalAgendomat.g:544:2: (otherlv_0= 'Person' otherlv_1= '{' otherlv_2= 'personName' ( (lv_personName_3_0= ruleEString ) ) otherlv_4= 'roles' otherlv_5= '{' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalAgendomat.g:544:2: (otherlv_0= 'Person' otherlv_1= '{' otherlv_2= 'personName' ( (lv_personName_3_0= ruleEString ) ) otherlv_4= 'roles' otherlv_5= '{' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalAgendomat.g:545:3: otherlv_0= 'Person' otherlv_1= '{' otherlv_2= 'personName' ( (lv_personName_3_0= ruleEString ) ) otherlv_4= 'roles' otherlv_5= '{' ( (lv_roles_6_0= ruleRole ) ) (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getPersonNameKeyword_2());
            		
            // InternalAgendomat.g:557:3: ( (lv_personName_3_0= ruleEString ) )
            // InternalAgendomat.g:558:4: (lv_personName_3_0= ruleEString )
            {
            // InternalAgendomat.g:558:4: (lv_personName_3_0= ruleEString )
            // InternalAgendomat.g:559:5: lv_personName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getPersonNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_personName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"personName",
            						lv_personName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getRolesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAgendomat.g:584:3: ( (lv_roles_6_0= ruleRole ) )
            // InternalAgendomat.g:585:4: (lv_roles_6_0= ruleRole )
            {
            // InternalAgendomat.g:585:4: (lv_roles_6_0= ruleRole )
            // InternalAgendomat.g:586:5: lv_roles_6_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_roles_6_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_6_0,
            						"agendomat.dsl.Agendomat.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:603:3: (otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAgendomat.g:604:4: otherlv_7= ',' ( (lv_roles_8_0= ruleRole ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_21); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAgendomat.g:608:4: ( (lv_roles_8_0= ruleRole ) )
            	    // InternalAgendomat.g:609:5: (lv_roles_8_0= ruleRole )
            	    {
            	    // InternalAgendomat.g:609:5: (lv_roles_8_0= ruleRole )
            	    // InternalAgendomat.g:610:6: lv_roles_8_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_roles_8_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPersonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_8_0,
            	    							"agendomat.dsl.Agendomat.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleLocation"
    // InternalAgendomat.g:640:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalAgendomat.g:640:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalAgendomat.g:641:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalAgendomat.g:647:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'locationName' ( (lv_locationName_3_0= ruleEString ) ) otherlv_4= 'locationType' ( (lv_locationType_5_0= ruleLocationType ) ) otherlv_6= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_locationName_3_0 = null;

        Enumerator lv_locationType_5_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:653:2: ( (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'locationName' ( (lv_locationName_3_0= ruleEString ) ) otherlv_4= 'locationType' ( (lv_locationType_5_0= ruleLocationType ) ) otherlv_6= '}' ) )
            // InternalAgendomat.g:654:2: (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'locationName' ( (lv_locationName_3_0= ruleEString ) ) otherlv_4= 'locationType' ( (lv_locationType_5_0= ruleLocationType ) ) otherlv_6= '}' )
            {
            // InternalAgendomat.g:654:2: (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'locationName' ( (lv_locationName_3_0= ruleEString ) ) otherlv_4= 'locationType' ( (lv_locationType_5_0= ruleLocationType ) ) otherlv_6= '}' )
            // InternalAgendomat.g:655:3: otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'locationName' ( (lv_locationName_3_0= ruleEString ) ) otherlv_4= 'locationType' ( (lv_locationType_5_0= ruleLocationType ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLocationNameKeyword_2());
            		
            // InternalAgendomat.g:667:3: ( (lv_locationName_3_0= ruleEString ) )
            // InternalAgendomat.g:668:4: (lv_locationName_3_0= ruleEString )
            {
            // InternalAgendomat.g:668:4: (lv_locationName_3_0= ruleEString )
            // InternalAgendomat.g:669:5: lv_locationName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLocationNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_locationName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"locationName",
            						lv_locationName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getLocationTypeKeyword_4());
            		
            // InternalAgendomat.g:690:3: ( (lv_locationType_5_0= ruleLocationType ) )
            // InternalAgendomat.g:691:4: (lv_locationType_5_0= ruleLocationType )
            {
            // InternalAgendomat.g:691:4: (lv_locationType_5_0= ruleLocationType )
            // InternalAgendomat.g:692:5: lv_locationType_5_0= ruleLocationType
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_locationType_5_0=ruleLocationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"locationType",
            						lv_locationType_5_0,
            						"agendomat.dsl.Agendomat.LocationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleSession"
    // InternalAgendomat.g:717:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalAgendomat.g:717:48: (iv_ruleSession= ruleSession EOF )
            // InternalAgendomat.g:718:2: iv_ruleSession= ruleSession EOF
            {
             newCompositeNode(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSession=ruleSession();

            state._fsp--;

             current =iv_ruleSession; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalAgendomat.g:724:1: ruleSession returns [EObject current=null] : (otherlv_0= 'Session' otherlv_1= '{' otherlv_2= 'sessionName' ( (lv_sessionName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )? (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_sessionName_3_0 = null;

        AntlrDatatypeRuleToken lv_startTime_5_0 = null;

        AntlrDatatypeRuleToken lv_endTime_7_0 = null;

        EObject lv_talks_18_0 = null;

        EObject lv_talks_20_0 = null;

        EObject lv_equipment_24_0 = null;

        EObject lv_equipment_26_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:730:2: ( (otherlv_0= 'Session' otherlv_1= '{' otherlv_2= 'sessionName' ( (lv_sessionName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )? (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalAgendomat.g:731:2: (otherlv_0= 'Session' otherlv_1= '{' otherlv_2= 'sessionName' ( (lv_sessionName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )? (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalAgendomat.g:731:2: (otherlv_0= 'Session' otherlv_1= '{' otherlv_2= 'sessionName' ( (lv_sessionName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )? (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalAgendomat.g:732:3: otherlv_0= 'Session' otherlv_1= '{' otherlv_2= 'sessionName' ( (lv_sessionName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )? (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getSessionNameKeyword_2());
            		
            // InternalAgendomat.g:744:3: ( (lv_sessionName_3_0= ruleEString ) )
            // InternalAgendomat.g:745:4: (lv_sessionName_3_0= ruleEString )
            {
            // InternalAgendomat.g:745:4: (lv_sessionName_3_0= ruleEString )
            // InternalAgendomat.g:746:5: lv_sessionName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getSessionNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_sessionName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"sessionName",
            						lv_sessionName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getStartTimeKeyword_4());
            		
            // InternalAgendomat.g:767:3: ( (lv_startTime_5_0= ruleEString ) )
            // InternalAgendomat.g:768:4: (lv_startTime_5_0= ruleEString )
            {
            // InternalAgendomat.g:768:4: (lv_startTime_5_0= ruleEString )
            // InternalAgendomat.g:769:5: lv_startTime_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getStartTimeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_startTime_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getEndTimeKeyword_6());
            		
            // InternalAgendomat.g:790:3: ( (lv_endTime_7_0= ruleEString ) )
            // InternalAgendomat.g:791:4: (lv_endTime_7_0= ruleEString )
            {
            // InternalAgendomat.g:791:4: (lv_endTime_7_0= ruleEString )
            // InternalAgendomat.g:792:5: lv_endTime_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getEndTimeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_endTime_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"endTime",
            						lv_endTime_7_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLocationKeyword_8());
            		
            // InternalAgendomat.g:813:3: ( ( ruleEString ) )
            // InternalAgendomat.g:814:4: ( ruleEString )
            {
            // InternalAgendomat.g:814:4: ( ruleEString )
            // InternalAgendomat.g:815:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getLocationLocationCrossReference_9_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:829:3: (otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAgendomat.g:830:4: otherlv_10= 'techSupport' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getTechSupportKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getSessionAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalAgendomat.g:838:4: ( ( ruleEString ) )
                    // InternalAgendomat.g:839:5: ( ruleEString )
                    {
                    // InternalAgendomat.g:839:5: ( ruleEString )
                    // InternalAgendomat.g:840:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:854:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAgendomat.g:855:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSessionAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAgendomat.g:859:5: ( ( ruleEString ) )
                    	    // InternalAgendomat.g:860:6: ( ruleEString )
                    	    {
                    	    // InternalAgendomat.g:860:6: ( ruleEString )
                    	    // InternalAgendomat.g:861:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSessionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,37,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getSessionAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAgendomat.g:881:3: (otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAgendomat.g:882:4: otherlv_16= 'talks' otherlv_17= '{' ( (lv_talks_18_0= ruleTalk ) ) (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getSessionAccess().getTalksKeyword_11_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalAgendomat.g:890:4: ( (lv_talks_18_0= ruleTalk ) )
                    // InternalAgendomat.g:891:5: (lv_talks_18_0= ruleTalk )
                    {
                    // InternalAgendomat.g:891:5: (lv_talks_18_0= ruleTalk )
                    // InternalAgendomat.g:892:6: lv_talks_18_0= ruleTalk
                    {

                    						newCompositeNode(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_talks_18_0=ruleTalk();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionRule());
                    						}
                    						add(
                    							current,
                    							"talks",
                    							lv_talks_18_0,
                    							"agendomat.dsl.Agendomat.Talk");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:909:4: (otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAgendomat.g:910:5: otherlv_19= ',' ( (lv_talks_20_0= ruleTalk ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSessionAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalAgendomat.g:914:5: ( (lv_talks_20_0= ruleTalk ) )
                    	    // InternalAgendomat.g:915:6: (lv_talks_20_0= ruleTalk )
                    	    {
                    	    // InternalAgendomat.g:915:6: (lv_talks_20_0= ruleTalk )
                    	    // InternalAgendomat.g:916:7: lv_talks_20_0= ruleTalk
                    	    {

                    	    							newCompositeNode(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_talks_20_0=ruleTalk();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSessionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"talks",
                    	    								lv_talks_20_0,
                    	    								"agendomat.dsl.Agendomat.Talk");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalAgendomat.g:939:3: (otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAgendomat.g:940:4: otherlv_22= 'equipment' otherlv_23= '{' ( (lv_equipment_24_0= ruleEquipment ) ) (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getSessionAccess().getEquipmentKeyword_12_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_23, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalAgendomat.g:948:4: ( (lv_equipment_24_0= ruleEquipment ) )
                    // InternalAgendomat.g:949:5: (lv_equipment_24_0= ruleEquipment )
                    {
                    // InternalAgendomat.g:949:5: (lv_equipment_24_0= ruleEquipment )
                    // InternalAgendomat.g:950:6: lv_equipment_24_0= ruleEquipment
                    {

                    						newCompositeNode(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_equipment_24_0=ruleEquipment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionRule());
                    						}
                    						add(
                    							current,
                    							"equipment",
                    							lv_equipment_24_0,
                    							"agendomat.dsl.Agendomat.Equipment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:967:4: (otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAgendomat.g:968:5: otherlv_25= ',' ( (lv_equipment_26_0= ruleEquipment ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSessionAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAgendomat.g:972:5: ( (lv_equipment_26_0= ruleEquipment ) )
                    	    // InternalAgendomat.g:973:6: (lv_equipment_26_0= ruleEquipment )
                    	    {
                    	    // InternalAgendomat.g:973:6: (lv_equipment_26_0= ruleEquipment )
                    	    // InternalAgendomat.g:974:7: lv_equipment_26_0= ruleEquipment
                    	    {

                    	    							newCompositeNode(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_equipment_26_0=ruleEquipment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSessionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"equipment",
                    	    								lv_equipment_26_0,
                    	    								"agendomat.dsl.Agendomat.Equipment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_27, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleBreak"
    // InternalAgendomat.g:1005:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // InternalAgendomat.g:1005:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalAgendomat.g:1006:2: iv_ruleBreak= ruleBreak EOF
            {
             newCompositeNode(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBreak=ruleBreak();

            state._fsp--;

             current =iv_ruleBreak; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalAgendomat.g:1012:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'Break' otherlv_1= '{' otherlv_2= 'breakName' ( (lv_breakName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_breakName_3_0 = null;

        AntlrDatatypeRuleToken lv_startTime_5_0 = null;

        AntlrDatatypeRuleToken lv_endTime_7_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:1018:2: ( (otherlv_0= 'Break' otherlv_1= '{' otherlv_2= 'breakName' ( (lv_breakName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalAgendomat.g:1019:2: (otherlv_0= 'Break' otherlv_1= '{' otherlv_2= 'breakName' ( (lv_breakName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalAgendomat.g:1019:2: (otherlv_0= 'Break' otherlv_1= '{' otherlv_2= 'breakName' ( (lv_breakName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalAgendomat.g:1020:3: otherlv_0= 'Break' otherlv_1= '{' otherlv_2= 'breakName' ( (lv_breakName_3_0= ruleEString ) ) otherlv_4= 'startTime' ( (lv_startTime_5_0= ruleEString ) ) otherlv_6= 'endTime' ( (lv_endTime_7_0= ruleEString ) ) otherlv_8= 'location' ( ( ruleEString ) ) (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBreakAccess().getBreakNameKeyword_2());
            		
            // InternalAgendomat.g:1032:3: ( (lv_breakName_3_0= ruleEString ) )
            // InternalAgendomat.g:1033:4: (lv_breakName_3_0= ruleEString )
            {
            // InternalAgendomat.g:1033:4: (lv_breakName_3_0= ruleEString )
            // InternalAgendomat.g:1034:5: lv_breakName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBreakAccess().getBreakNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_breakName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBreakRule());
            					}
            					set(
            						current,
            						"breakName",
            						lv_breakName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBreakAccess().getStartTimeKeyword_4());
            		
            // InternalAgendomat.g:1055:3: ( (lv_startTime_5_0= ruleEString ) )
            // InternalAgendomat.g:1056:4: (lv_startTime_5_0= ruleEString )
            {
            // InternalAgendomat.g:1056:4: (lv_startTime_5_0= ruleEString )
            // InternalAgendomat.g:1057:5: lv_startTime_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBreakAccess().getStartTimeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_startTime_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBreakRule());
            					}
            					set(
            						current,
            						"startTime",
            						lv_startTime_5_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBreakAccess().getEndTimeKeyword_6());
            		
            // InternalAgendomat.g:1078:3: ( (lv_endTime_7_0= ruleEString ) )
            // InternalAgendomat.g:1079:4: (lv_endTime_7_0= ruleEString )
            {
            // InternalAgendomat.g:1079:4: (lv_endTime_7_0= ruleEString )
            // InternalAgendomat.g:1080:5: lv_endTime_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBreakAccess().getEndTimeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_endTime_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBreakRule());
            					}
            					set(
            						current,
            						"endTime",
            						lv_endTime_7_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getBreakAccess().getLocationKeyword_8());
            		
            // InternalAgendomat.g:1101:3: ( ( ruleEString ) )
            // InternalAgendomat.g:1102:4: ( ruleEString )
            {
            // InternalAgendomat.g:1102:4: ( ruleEString )
            // InternalAgendomat.g:1103:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBreakRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBreakAccess().getLocationLocationCrossReference_9_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:1117:3: (otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAgendomat.g:1118:4: otherlv_10= 'animators' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getBreakAccess().getAnimatorsKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getBreakAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalAgendomat.g:1126:4: ( ( ruleEString ) )
                    // InternalAgendomat.g:1127:5: ( ruleEString )
                    {
                    // InternalAgendomat.g:1127:5: ( ruleEString )
                    // InternalAgendomat.g:1128:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBreakRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:1142:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalAgendomat.g:1143:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBreakAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAgendomat.g:1147:5: ( ( ruleEString ) )
                    	    // InternalAgendomat.g:1148:6: ( ruleEString )
                    	    {
                    	    // InternalAgendomat.g:1148:6: ( ruleEString )
                    	    // InternalAgendomat.g:1149:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBreakRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getBreakAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleTalk"
    // InternalAgendomat.g:1177:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // InternalAgendomat.g:1177:45: (iv_ruleTalk= ruleTalk EOF )
            // InternalAgendomat.g:1178:2: iv_ruleTalk= ruleTalk EOF
            {
             newCompositeNode(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTalk=ruleTalk();

            state._fsp--;

             current =iv_ruleTalk; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // InternalAgendomat.g:1184:1: ruleTalk returns [EObject current=null] : (otherlv_0= 'Talk' otherlv_1= '{' otherlv_2= 'talkName' ( (lv_talkName_3_0= ruleEString ) ) otherlv_4= 'talkStartTime' ( (lv_talkStartTime_5_0= ruleEString ) ) otherlv_6= 'talkEndTime' ( (lv_talkEndTime_7_0= ruleEString ) ) otherlv_8= 'presenters' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_talkName_3_0 = null;

        AntlrDatatypeRuleToken lv_talkStartTime_5_0 = null;

        AntlrDatatypeRuleToken lv_talkEndTime_7_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:1190:2: ( (otherlv_0= 'Talk' otherlv_1= '{' otherlv_2= 'talkName' ( (lv_talkName_3_0= ruleEString ) ) otherlv_4= 'talkStartTime' ( (lv_talkStartTime_5_0= ruleEString ) ) otherlv_6= 'talkEndTime' ( (lv_talkEndTime_7_0= ruleEString ) ) otherlv_8= 'presenters' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' ) )
            // InternalAgendomat.g:1191:2: (otherlv_0= 'Talk' otherlv_1= '{' otherlv_2= 'talkName' ( (lv_talkName_3_0= ruleEString ) ) otherlv_4= 'talkStartTime' ( (lv_talkStartTime_5_0= ruleEString ) ) otherlv_6= 'talkEndTime' ( (lv_talkEndTime_7_0= ruleEString ) ) otherlv_8= 'presenters' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' )
            {
            // InternalAgendomat.g:1191:2: (otherlv_0= 'Talk' otherlv_1= '{' otherlv_2= 'talkName' ( (lv_talkName_3_0= ruleEString ) ) otherlv_4= 'talkStartTime' ( (lv_talkStartTime_5_0= ruleEString ) ) otherlv_6= 'talkEndTime' ( (lv_talkEndTime_7_0= ruleEString ) ) otherlv_8= 'presenters' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}' )
            // InternalAgendomat.g:1192:3: otherlv_0= 'Talk' otherlv_1= '{' otherlv_2= 'talkName' ( (lv_talkName_3_0= ruleEString ) ) otherlv_4= 'talkStartTime' ( (lv_talkStartTime_5_0= ruleEString ) ) otherlv_6= 'talkEndTime' ( (lv_talkEndTime_7_0= ruleEString ) ) otherlv_8= 'presenters' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkAccess().getTalkKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTalkAccess().getTalkNameKeyword_2());
            		
            // InternalAgendomat.g:1204:3: ( (lv_talkName_3_0= ruleEString ) )
            // InternalAgendomat.g:1205:4: (lv_talkName_3_0= ruleEString )
            {
            // InternalAgendomat.g:1205:4: (lv_talkName_3_0= ruleEString )
            // InternalAgendomat.g:1206:5: lv_talkName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkAccess().getTalkNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_talkName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalkRule());
            					}
            					set(
            						current,
            						"talkName",
            						lv_talkName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTalkAccess().getTalkStartTimeKeyword_4());
            		
            // InternalAgendomat.g:1227:3: ( (lv_talkStartTime_5_0= ruleEString ) )
            // InternalAgendomat.g:1228:4: (lv_talkStartTime_5_0= ruleEString )
            {
            // InternalAgendomat.g:1228:4: (lv_talkStartTime_5_0= ruleEString )
            // InternalAgendomat.g:1229:5: lv_talkStartTime_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkAccess().getTalkStartTimeEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
            lv_talkStartTime_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalkRule());
            					}
            					set(
            						current,
            						"talkStartTime",
            						lv_talkStartTime_5_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getTalkAccess().getTalkEndTimeKeyword_6());
            		
            // InternalAgendomat.g:1250:3: ( (lv_talkEndTime_7_0= ruleEString ) )
            // InternalAgendomat.g:1251:4: (lv_talkEndTime_7_0= ruleEString )
            {
            // InternalAgendomat.g:1251:4: (lv_talkEndTime_7_0= ruleEString )
            // InternalAgendomat.g:1252:5: lv_talkEndTime_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkAccess().getTalkEndTimeEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_41);
            lv_talkEndTime_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalkRule());
            					}
            					set(
            						current,
            						"talkEndTime",
            						lv_talkEndTime_7_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,47,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getTalkAccess().getPresentersKeyword_8());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getTalkAccess().getLeftParenthesisKeyword_9());
            		
            // InternalAgendomat.g:1277:3: ( ( ruleEString ) )
            // InternalAgendomat.g:1278:4: ( ruleEString )
            {
            // InternalAgendomat.g:1278:4: ( ruleEString )
            // InternalAgendomat.g:1279:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:1293:3: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAgendomat.g:1294:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_11, grammarAccess.getTalkAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAgendomat.g:1298:4: ( ( ruleEString ) )
            	    // InternalAgendomat.g:1299:5: ( ruleEString )
            	    {
            	    // InternalAgendomat.g:1299:5: ( ruleEString )
            	    // InternalAgendomat.g:1300:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTalkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTalkAccess().getPresentersPersonCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_13=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getTalkAccess().getRightParenthesisKeyword_12());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRuleEquipment"
    // InternalAgendomat.g:1327:1: entryRuleEquipment returns [EObject current=null] : iv_ruleEquipment= ruleEquipment EOF ;
    public final EObject entryRuleEquipment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquipment = null;


        try {
            // InternalAgendomat.g:1327:50: (iv_ruleEquipment= ruleEquipment EOF )
            // InternalAgendomat.g:1328:2: iv_ruleEquipment= ruleEquipment EOF
            {
             newCompositeNode(grammarAccess.getEquipmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquipment=ruleEquipment();

            state._fsp--;

             current =iv_ruleEquipment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquipment"


    // $ANTLR start "ruleEquipment"
    // InternalAgendomat.g:1334:1: ruleEquipment returns [EObject current=null] : (otherlv_0= 'Equipment' otherlv_1= '{' otherlv_2= 'equipmentName' ( (lv_equipmentName_3_0= ruleEString ) ) (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEquipment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_equipmentName_3_0 = null;

        AntlrDatatypeRuleToken lv_equipmentType_5_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:1340:2: ( (otherlv_0= 'Equipment' otherlv_1= '{' otherlv_2= 'equipmentName' ( (lv_equipmentName_3_0= ruleEString ) ) (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalAgendomat.g:1341:2: (otherlv_0= 'Equipment' otherlv_1= '{' otherlv_2= 'equipmentName' ( (lv_equipmentName_3_0= ruleEString ) ) (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalAgendomat.g:1341:2: (otherlv_0= 'Equipment' otherlv_1= '{' otherlv_2= 'equipmentName' ( (lv_equipmentName_3_0= ruleEString ) ) (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalAgendomat.g:1342:3: otherlv_0= 'Equipment' otherlv_1= '{' otherlv_2= 'equipmentName' ( (lv_equipmentName_3_0= ruleEString ) ) (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEquipmentAccess().getEquipmentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getEquipmentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEquipmentAccess().getEquipmentNameKeyword_2());
            		
            // InternalAgendomat.g:1354:3: ( (lv_equipmentName_3_0= ruleEString ) )
            // InternalAgendomat.g:1355:4: (lv_equipmentName_3_0= ruleEString )
            {
            // InternalAgendomat.g:1355:4: (lv_equipmentName_3_0= ruleEString )
            // InternalAgendomat.g:1356:5: lv_equipmentName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEquipmentAccess().getEquipmentNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_equipmentName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquipmentRule());
            					}
            					set(
            						current,
            						"equipmentName",
            						lv_equipmentName_3_0,
            						"agendomat.dsl.Agendomat.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:1373:3: (otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAgendomat.g:1374:4: otherlv_4= 'equipmentType' ( (lv_equipmentType_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEquipmentAccess().getEquipmentTypeKeyword_4_0());
                    			
                    // InternalAgendomat.g:1378:4: ( (lv_equipmentType_5_0= ruleEString ) )
                    // InternalAgendomat.g:1379:5: (lv_equipmentType_5_0= ruleEString )
                    {
                    // InternalAgendomat.g:1379:5: (lv_equipmentType_5_0= ruleEString )
                    // InternalAgendomat.g:1380:6: lv_equipmentType_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEquipmentAccess().getEquipmentTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_equipmentType_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEquipmentRule());
                    						}
                    						set(
                    							current,
                    							"equipmentType",
                    							lv_equipmentType_5_0,
                    							"agendomat.dsl.Agendomat.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEquipmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEquipment"


    // $ANTLR start "ruleRole"
    // InternalAgendomat.g:1406:1: ruleRole returns [Enumerator current=null] : ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAgendomat.g:1412:2: ( ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) ) )
            // InternalAgendomat.g:1413:2: ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) )
            {
            // InternalAgendomat.g:1413:2: ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAgendomat.g:1414:3: (enumLiteral_0= 'Presenter' )
                    {
                    // InternalAgendomat.g:1414:3: (enumLiteral_0= 'Presenter' )
                    // InternalAgendomat.g:1415:4: enumLiteral_0= 'Presenter'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:1422:3: (enumLiteral_1= 'TechSupport' )
                    {
                    // InternalAgendomat.g:1422:3: (enumLiteral_1= 'TechSupport' )
                    // InternalAgendomat.g:1423:4: enumLiteral_1= 'TechSupport'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAgendomat.g:1430:3: (enumLiteral_2= 'Animator' )
                    {
                    // InternalAgendomat.g:1430:3: (enumLiteral_2= 'Animator' )
                    // InternalAgendomat.g:1431:4: enumLiteral_2= 'Animator'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRoleAccess().getAnimatorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoleAccess().getAnimatorEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "ruleLocationType"
    // InternalAgendomat.g:1441:1: ruleLocationType returns [Enumerator current=null] : ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) ) ;
    public final Enumerator ruleLocationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgendomat.g:1447:2: ( ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) ) )
            // InternalAgendomat.g:1448:2: ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) )
            {
            // InternalAgendomat.g:1448:2: ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            else if ( (LA24_0==55) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAgendomat.g:1449:3: (enumLiteral_0= 'Room' )
                    {
                    // InternalAgendomat.g:1449:3: (enumLiteral_0= 'Room' )
                    // InternalAgendomat.g:1450:4: enumLiteral_0= 'Room'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:1457:3: (enumLiteral_1= 'BreakArea' )
                    {
                    // InternalAgendomat.g:1457:3: (enumLiteral_1= 'BreakArea' )
                    // InternalAgendomat.g:1458:4: enumLiteral_1= 'BreakArea'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLocationTypeAccess().getBreakAreaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLocationTypeAccess().getBreakAreaEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLocationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F08000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C800008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000008000L});

}