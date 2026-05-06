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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Event'", "'from'", "'to'", "'on'", "'{'", "'Description'", "'}'", "'Person'", "'roles'", "'['", "','", "']'", "'Location'", "'type'", "'Session'", "'Time'", "'-'", "'TechSupport'", "'('", "')'", "'Needs'", "'Break'", "'Animator'", "'Talk'", "'Presenter'", "'Room'", "'BreakArea'"
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

        public InternalAgendomatParser(TokenStream input, AgendomatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Event";
       	}

       	@Override
       	protected AgendomatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEvent"
    // InternalAgendomat.g:65:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAgendomat.g:65:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalAgendomat.g:66:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAgendomat.g:72:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_eventName_1_0= RULE_STRING ) ) ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) ) otherlv_8= '{' (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )? ( (lv_persons_11_0= rulePerson ) )* ( (lv_locations_12_0= ruleLocation ) )* ( (lv_programItems_13_0= ruleProgramItem ) )* otherlv_14= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventName_1_0=null;
        Token otherlv_2=null;
        Token lv_eventStartDate_3_0=null;
        Token otherlv_4=null;
        Token lv_eventEndDate_5_0=null;
        Token otherlv_6=null;
        Token lv_eventStartDate_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_desc_10_0=null;
        Token otherlv_14=null;
        EObject lv_persons_11_0 = null;

        EObject lv_locations_12_0 = null;

        EObject lv_programItems_13_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:78:2: ( (otherlv_0= 'Event' ( (lv_eventName_1_0= RULE_STRING ) ) ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) ) otherlv_8= '{' (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )? ( (lv_persons_11_0= rulePerson ) )* ( (lv_locations_12_0= ruleLocation ) )* ( (lv_programItems_13_0= ruleProgramItem ) )* otherlv_14= '}' ) )
            // InternalAgendomat.g:79:2: (otherlv_0= 'Event' ( (lv_eventName_1_0= RULE_STRING ) ) ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) ) otherlv_8= '{' (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )? ( (lv_persons_11_0= rulePerson ) )* ( (lv_locations_12_0= ruleLocation ) )* ( (lv_programItems_13_0= ruleProgramItem ) )* otherlv_14= '}' )
            {
            // InternalAgendomat.g:79:2: (otherlv_0= 'Event' ( (lv_eventName_1_0= RULE_STRING ) ) ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) ) otherlv_8= '{' (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )? ( (lv_persons_11_0= rulePerson ) )* ( (lv_locations_12_0= ruleLocation ) )* ( (lv_programItems_13_0= ruleProgramItem ) )* otherlv_14= '}' )
            // InternalAgendomat.g:80:3: otherlv_0= 'Event' ( (lv_eventName_1_0= RULE_STRING ) ) ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) ) otherlv_8= '{' (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )? ( (lv_persons_11_0= rulePerson ) )* ( (lv_locations_12_0= ruleLocation ) )* ( (lv_programItems_13_0= ruleProgramItem ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalAgendomat.g:84:3: ( (lv_eventName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:85:4: (lv_eventName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:85:4: (lv_eventName_1_0= RULE_STRING )
            // InternalAgendomat.g:86:5: lv_eventName_1_0= RULE_STRING
            {
            lv_eventName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_eventName_1_0, grammarAccess.getEventAccess().getEventNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventName",
            						lv_eventName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAgendomat.g:102:3: ( (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) ) | (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAgendomat.g:103:4: (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) )
                    {
                    // InternalAgendomat.g:103:4: (otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) ) )
                    // InternalAgendomat.g:104:5: otherlv_2= 'from' ( (lv_eventStartDate_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_eventEndDate_5_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getEventAccess().getFromKeyword_2_0_0());
                    				
                    // InternalAgendomat.g:108:5: ( (lv_eventStartDate_3_0= RULE_STRING ) )
                    // InternalAgendomat.g:109:6: (lv_eventStartDate_3_0= RULE_STRING )
                    {
                    // InternalAgendomat.g:109:6: (lv_eventStartDate_3_0= RULE_STRING )
                    // InternalAgendomat.g:110:7: lv_eventStartDate_3_0= RULE_STRING
                    {
                    lv_eventStartDate_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    							newLeafNode(lv_eventStartDate_3_0, grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"eventStartDate",
                    								lv_eventStartDate_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getEventAccess().getToKeyword_2_0_2());
                    				
                    // InternalAgendomat.g:130:5: ( (lv_eventEndDate_5_0= RULE_STRING ) )
                    // InternalAgendomat.g:131:6: (lv_eventEndDate_5_0= RULE_STRING )
                    {
                    // InternalAgendomat.g:131:6: (lv_eventEndDate_5_0= RULE_STRING )
                    // InternalAgendomat.g:132:7: lv_eventEndDate_5_0= RULE_STRING
                    {
                    lv_eventEndDate_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    							newLeafNode(lv_eventEndDate_5_0, grammarAccess.getEventAccess().getEventEndDateSTRINGTerminalRuleCall_2_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"eventEndDate",
                    								lv_eventEndDate_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:150:4: (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) )
                    {
                    // InternalAgendomat.g:150:4: (otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) ) )
                    // InternalAgendomat.g:151:5: otherlv_6= 'on' ( (lv_eventStartDate_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getEventAccess().getOnKeyword_2_1_0());
                    				
                    // InternalAgendomat.g:155:5: ( (lv_eventStartDate_7_0= RULE_STRING ) )
                    // InternalAgendomat.g:156:6: (lv_eventStartDate_7_0= RULE_STRING )
                    {
                    // InternalAgendomat.g:156:6: (lv_eventStartDate_7_0= RULE_STRING )
                    // InternalAgendomat.g:157:7: lv_eventStartDate_7_0= RULE_STRING
                    {
                    lv_eventStartDate_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    							newLeafNode(lv_eventStartDate_7_0, grammarAccess.getEventAccess().getEventStartDateSTRINGTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"eventStartDate",
                    								lv_eventStartDate_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAgendomat.g:179:3: (otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAgendomat.g:180:4: otherlv_9= 'Description' ( (lv_desc_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalAgendomat.g:184:4: ( (lv_desc_10_0= RULE_STRING ) )
                    // InternalAgendomat.g:185:5: (lv_desc_10_0= RULE_STRING )
                    {
                    // InternalAgendomat.g:185:5: (lv_desc_10_0= RULE_STRING )
                    // InternalAgendomat.g:186:6: lv_desc_10_0= RULE_STRING
                    {
                    lv_desc_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_desc_10_0, grammarAccess.getEventAccess().getDescSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"desc",
                    							lv_desc_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAgendomat.g:203:3: ( (lv_persons_11_0= rulePerson ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAgendomat.g:204:4: (lv_persons_11_0= rulePerson )
            	    {
            	    // InternalAgendomat.g:204:4: (lv_persons_11_0= rulePerson )
            	    // InternalAgendomat.g:205:5: lv_persons_11_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getPersonsPersonParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_persons_11_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_11_0,
            	    						"agendomat.dsl.Agendomat.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAgendomat.g:222:3: ( (lv_locations_12_0= ruleLocation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAgendomat.g:223:4: (lv_locations_12_0= ruleLocation )
            	    {
            	    // InternalAgendomat.g:223:4: (lv_locations_12_0= ruleLocation )
            	    // InternalAgendomat.g:224:5: lv_locations_12_0= ruleLocation
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getLocationsLocationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_locations_12_0=ruleLocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locations",
            	    						lv_locations_12_0,
            	    						"agendomat.dsl.Agendomat.Location");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAgendomat.g:241:3: ( (lv_programItems_13_0= ruleProgramItem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAgendomat.g:242:4: (lv_programItems_13_0= ruleProgramItem )
            	    {
            	    // InternalAgendomat.g:242:4: (lv_programItems_13_0= ruleProgramItem )
            	    // InternalAgendomat.g:243:5: lv_programItems_13_0= ruleProgramItem
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getProgramItemsProgramItemParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_programItems_13_0=ruleProgramItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"programItems",
            	    						lv_programItems_13_0,
            	    						"agendomat.dsl.Agendomat.ProgramItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleProgramItem"
    // InternalAgendomat.g:268:1: entryRuleProgramItem returns [EObject current=null] : iv_ruleProgramItem= ruleProgramItem EOF ;
    public final EObject entryRuleProgramItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramItem = null;


        try {
            // InternalAgendomat.g:268:52: (iv_ruleProgramItem= ruleProgramItem EOF )
            // InternalAgendomat.g:269:2: iv_ruleProgramItem= ruleProgramItem EOF
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
    // InternalAgendomat.g:275:1: ruleProgramItem returns [EObject current=null] : (this_Session_0= ruleSession | this_Break_1= ruleBreak ) ;
    public final EObject ruleProgramItem() throws RecognitionException {
        EObject current = null;

        EObject this_Session_0 = null;

        EObject this_Break_1 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:281:2: ( (this_Session_0= ruleSession | this_Break_1= ruleBreak ) )
            // InternalAgendomat.g:282:2: (this_Session_0= ruleSession | this_Break_1= ruleBreak )
            {
            // InternalAgendomat.g:282:2: (this_Session_0= ruleSession | this_Break_1= ruleBreak )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAgendomat.g:283:3: this_Session_0= ruleSession
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
                    // InternalAgendomat.g:292:3: this_Break_1= ruleBreak
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


    // $ANTLR start "entryRulePerson"
    // InternalAgendomat.g:304:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalAgendomat.g:304:47: (iv_rulePerson= rulePerson EOF )
            // InternalAgendomat.g:305:2: iv_rulePerson= rulePerson EOF
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
    // InternalAgendomat.g:311:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_personName_1_0= RULE_STRING ) ) otherlv_2= 'roles' otherlv_3= '[' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ']' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_personName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_roles_4_0 = null;

        Enumerator lv_roles_6_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:317:2: ( (otherlv_0= 'Person' ( (lv_personName_1_0= RULE_STRING ) ) otherlv_2= 'roles' otherlv_3= '[' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ']' ) )
            // InternalAgendomat.g:318:2: (otherlv_0= 'Person' ( (lv_personName_1_0= RULE_STRING ) ) otherlv_2= 'roles' otherlv_3= '[' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ']' )
            {
            // InternalAgendomat.g:318:2: (otherlv_0= 'Person' ( (lv_personName_1_0= RULE_STRING ) ) otherlv_2= 'roles' otherlv_3= '[' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ']' )
            // InternalAgendomat.g:319:3: otherlv_0= 'Person' ( (lv_personName_1_0= RULE_STRING ) ) otherlv_2= 'roles' otherlv_3= '[' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalAgendomat.g:323:3: ( (lv_personName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:324:4: (lv_personName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:324:4: (lv_personName_1_0= RULE_STRING )
            // InternalAgendomat.g:325:5: lv_personName_1_0= RULE_STRING
            {
            lv_personName_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_personName_1_0, grammarAccess.getPersonAccess().getPersonNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"personName",
            						lv_personName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getRolesKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalAgendomat.g:349:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalAgendomat.g:350:4: (lv_roles_4_0= ruleRole )
            {
            // InternalAgendomat.g:350:4: (lv_roles_4_0= ruleRole )
            // InternalAgendomat.g:351:5: lv_roles_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_roles_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"agendomat.dsl.Agendomat.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgendomat.g:368:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAgendomat.g:369:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_13); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAgendomat.g:373:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalAgendomat.g:374:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalAgendomat.g:374:5: (lv_roles_6_0= ruleRole )
            	    // InternalAgendomat.g:375:6: lv_roles_6_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleEnumRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalAgendomat.g:401:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalAgendomat.g:401:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalAgendomat.g:402:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalAgendomat.g:408:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' ( (lv_locationName_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_locationType_3_0= ruleLocationType ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_locationName_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_locationType_3_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:414:2: ( (otherlv_0= 'Location' ( (lv_locationName_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_locationType_3_0= ruleLocationType ) ) ) )
            // InternalAgendomat.g:415:2: (otherlv_0= 'Location' ( (lv_locationName_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_locationType_3_0= ruleLocationType ) ) )
            {
            // InternalAgendomat.g:415:2: (otherlv_0= 'Location' ( (lv_locationName_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_locationType_3_0= ruleLocationType ) ) )
            // InternalAgendomat.g:416:3: otherlv_0= 'Location' ( (lv_locationName_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_locationType_3_0= ruleLocationType ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            // InternalAgendomat.g:420:3: ( (lv_locationName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:421:4: (lv_locationName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:421:4: (lv_locationName_1_0= RULE_STRING )
            // InternalAgendomat.g:422:5: lv_locationName_1_0= RULE_STRING
            {
            lv_locationName_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_locationName_1_0, grammarAccess.getLocationAccess().getLocationNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locationName",
            						lv_locationName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getTypeKeyword_2());
            		
            // InternalAgendomat.g:442:3: ( (lv_locationType_3_0= ruleLocationType ) )
            // InternalAgendomat.g:443:4: (lv_locationType_3_0= ruleLocationType )
            {
            // InternalAgendomat.g:443:4: (lv_locationType_3_0= ruleLocationType )
            // InternalAgendomat.g:444:5: lv_locationType_3_0= ruleLocationType
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLocationTypeLocationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_locationType_3_0=ruleLocationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"locationType",
            						lv_locationType_3_0,
            						"agendomat.dsl.Agendomat.LocationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAgendomat.g:465:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalAgendomat.g:465:48: (iv_ruleSession= ruleSession EOF )
            // InternalAgendomat.g:466:2: iv_ruleSession= ruleSession EOF
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
    // InternalAgendomat.g:472:1: ruleSession returns [EObject current=null] : (otherlv_0= 'Session' ( (lv_sessionName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )? ( (lv_talks_19_0= ruleTalk ) )* otherlv_20= '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sessionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startTime_4_0=null;
        Token otherlv_5=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_equipment_16_0 = null;

        EObject lv_equipment_18_0 = null;

        EObject lv_talks_19_0 = null;



        	enterRule();

        try {
            // InternalAgendomat.g:478:2: ( (otherlv_0= 'Session' ( (lv_sessionName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )? ( (lv_talks_19_0= ruleTalk ) )* otherlv_20= '}' ) )
            // InternalAgendomat.g:479:2: (otherlv_0= 'Session' ( (lv_sessionName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )? ( (lv_talks_19_0= ruleTalk ) )* otherlv_20= '}' )
            {
            // InternalAgendomat.g:479:2: (otherlv_0= 'Session' ( (lv_sessionName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )? ( (lv_talks_19_0= ruleTalk ) )* otherlv_20= '}' )
            // InternalAgendomat.g:480:3: otherlv_0= 'Session' ( (lv_sessionName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )? ( (lv_talks_19_0= ruleTalk ) )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
            		
            // InternalAgendomat.g:484:3: ( (lv_sessionName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:485:4: (lv_sessionName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:485:4: (lv_sessionName_1_0= RULE_STRING )
            // InternalAgendomat.g:486:5: lv_sessionName_1_0= RULE_STRING
            {
            lv_sessionName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_sessionName_1_0, grammarAccess.getSessionAccess().getSessionNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sessionName",
            						lv_sessionName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSessionAccess().getTimeKeyword_3());
            		
            // InternalAgendomat.g:510:3: ( (lv_startTime_4_0= RULE_STRING ) )
            // InternalAgendomat.g:511:4: (lv_startTime_4_0= RULE_STRING )
            {
            // InternalAgendomat.g:511:4: (lv_startTime_4_0= RULE_STRING )
            // InternalAgendomat.g:512:5: lv_startTime_4_0= RULE_STRING
            {
            lv_startTime_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_startTime_4_0, grammarAccess.getSessionAccess().getStartTimeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getHyphenMinusKeyword_5());
            		
            // InternalAgendomat.g:532:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalAgendomat.g:533:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalAgendomat.g:533:4: (lv_endTime_6_0= RULE_STRING )
            // InternalAgendomat.g:534:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getSessionAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSessionAccess().getLocationKeyword_7());
            		
            // InternalAgendomat.g:554:3: ( (otherlv_8= RULE_STRING ) )
            // InternalAgendomat.g:555:4: (otherlv_8= RULE_STRING )
            {
            // InternalAgendomat.g:555:4: (otherlv_8= RULE_STRING )
            // InternalAgendomat.g:556:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLocationLocationCrossReference_8_0());
            				

            }


            }

            // InternalAgendomat.g:567:3: (otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAgendomat.g:568:4: otherlv_9= 'TechSupport' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getSessionAccess().getTechSupportKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalAgendomat.g:576:4: ( (otherlv_11= RULE_STRING ) )
                    // InternalAgendomat.g:577:5: (otherlv_11= RULE_STRING )
                    {
                    // InternalAgendomat.g:577:5: (otherlv_11= RULE_STRING )
                    // InternalAgendomat.g:578:6: otherlv_11= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(otherlv_11, grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_2_0());
                    					

                    }


                    }

                    // InternalAgendomat.g:589:4: (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAgendomat.g:590:5: otherlv_12= ',' ( (otherlv_13= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSessionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAgendomat.g:594:5: ( (otherlv_13= RULE_STRING ) )
                    	    // InternalAgendomat.g:595:6: (otherlv_13= RULE_STRING )
                    	    {
                    	    // InternalAgendomat.g:595:6: (otherlv_13= RULE_STRING )
                    	    // InternalAgendomat.g:596:7: otherlv_13= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSessionRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getSessionAccess().getTechSupportPersonCrossReference_9_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_14, grammarAccess.getSessionAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAgendomat.g:613:3: (otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAgendomat.g:614:4: otherlv_15= 'Needs' ( (lv_equipment_16_0= ruleEquipment ) ) (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )*
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSessionAccess().getNeedsKeyword_10_0());
                    			
                    // InternalAgendomat.g:618:4: ( (lv_equipment_16_0= ruleEquipment ) )
                    // InternalAgendomat.g:619:5: (lv_equipment_16_0= ruleEquipment )
                    {
                    // InternalAgendomat.g:619:5: (lv_equipment_16_0= ruleEquipment )
                    // InternalAgendomat.g:620:6: lv_equipment_16_0= ruleEquipment
                    {

                    						newCompositeNode(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_equipment_16_0=ruleEquipment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionRule());
                    						}
                    						add(
                    							current,
                    							"equipment",
                    							lv_equipment_16_0,
                    							"agendomat.dsl.Agendomat.Equipment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgendomat.g:637:4: (otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAgendomat.g:638:5: otherlv_17= ',' ( (lv_equipment_18_0= ruleEquipment ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSessionAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalAgendomat.g:642:5: ( (lv_equipment_18_0= ruleEquipment ) )
                    	    // InternalAgendomat.g:643:6: (lv_equipment_18_0= ruleEquipment )
                    	    {
                    	    // InternalAgendomat.g:643:6: (lv_equipment_18_0= ruleEquipment )
                    	    // InternalAgendomat.g:644:7: lv_equipment_18_0= ruleEquipment
                    	    {

                    	    							newCompositeNode(grammarAccess.getSessionAccess().getEquipmentEquipmentParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_equipment_18_0=ruleEquipment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSessionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"equipment",
                    	    								lv_equipment_18_0,
                    	    								"agendomat.dsl.Agendomat.Equipment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAgendomat.g:663:3: ( (lv_talks_19_0= ruleTalk ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAgendomat.g:664:4: (lv_talks_19_0= ruleTalk )
            	    {
            	    // InternalAgendomat.g:664:4: (lv_talks_19_0= ruleTalk )
            	    // InternalAgendomat.g:665:5: lv_talks_19_0= ruleTalk
            	    {

            	    					newCompositeNode(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_talks_19_0=ruleTalk();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"talks",
            	    						lv_talks_19_0,
            	    						"agendomat.dsl.Agendomat.Talk");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalAgendomat.g:690:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // InternalAgendomat.g:690:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalAgendomat.g:691:2: iv_ruleBreak= ruleBreak EOF
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
    // InternalAgendomat.g:697:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'Break' ( (lv_breakName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_breakName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startTime_4_0=null;
        Token otherlv_5=null;
        Token lv_endTime_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalAgendomat.g:703:2: ( (otherlv_0= 'Break' ( (lv_breakName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalAgendomat.g:704:2: (otherlv_0= 'Break' ( (lv_breakName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalAgendomat.g:704:2: (otherlv_0= 'Break' ( (lv_breakName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalAgendomat.g:705:3: otherlv_0= 'Break' ( (lv_breakName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_startTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_endTime_6_0= RULE_STRING ) ) otherlv_7= 'Location' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
            		
            // InternalAgendomat.g:709:3: ( (lv_breakName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:710:4: (lv_breakName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:710:4: (lv_breakName_1_0= RULE_STRING )
            // InternalAgendomat.g:711:5: lv_breakName_1_0= RULE_STRING
            {
            lv_breakName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_breakName_1_0, grammarAccess.getBreakAccess().getBreakNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"breakName",
            						lv_breakName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getBreakAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBreakAccess().getTimeKeyword_3());
            		
            // InternalAgendomat.g:735:3: ( (lv_startTime_4_0= RULE_STRING ) )
            // InternalAgendomat.g:736:4: (lv_startTime_4_0= RULE_STRING )
            {
            // InternalAgendomat.g:736:4: (lv_startTime_4_0= RULE_STRING )
            // InternalAgendomat.g:737:5: lv_startTime_4_0= RULE_STRING
            {
            lv_startTime_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_startTime_4_0, grammarAccess.getBreakAccess().getStartTimeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getBreakAccess().getHyphenMinusKeyword_5());
            		
            // InternalAgendomat.g:757:3: ( (lv_endTime_6_0= RULE_STRING ) )
            // InternalAgendomat.g:758:4: (lv_endTime_6_0= RULE_STRING )
            {
            // InternalAgendomat.g:758:4: (lv_endTime_6_0= RULE_STRING )
            // InternalAgendomat.g:759:5: lv_endTime_6_0= RULE_STRING
            {
            lv_endTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_endTime_6_0, grammarAccess.getBreakAccess().getEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getBreakAccess().getLocationKeyword_7());
            		
            // InternalAgendomat.g:779:3: ( (otherlv_8= RULE_STRING ) )
            // InternalAgendomat.g:780:4: (otherlv_8= RULE_STRING )
            {
            // InternalAgendomat.g:780:4: (otherlv_8= RULE_STRING )
            // InternalAgendomat.g:781:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBreakRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(otherlv_8, grammarAccess.getBreakAccess().getLocationLocationCrossReference_8_0());
            				

            }


            }

            // InternalAgendomat.g:792:3: (otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAgendomat.g:793:4: otherlv_9= 'Animator' otherlv_10= '(' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getBreakAccess().getAnimatorKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getBreakAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalAgendomat.g:801:4: ( (otherlv_11= RULE_STRING ) )
                    // InternalAgendomat.g:802:5: (otherlv_11= RULE_STRING )
                    {
                    // InternalAgendomat.g:802:5: (otherlv_11= RULE_STRING )
                    // InternalAgendomat.g:803:6: otherlv_11= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBreakRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(otherlv_11, grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_2_0());
                    					

                    }


                    }

                    // InternalAgendomat.g:814:4: (otherlv_12= ',' ( (otherlv_13= RULE_STRING ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAgendomat.g:815:5: otherlv_12= ',' ( (otherlv_13= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBreakAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAgendomat.g:819:5: ( (otherlv_13= RULE_STRING ) )
                    	    // InternalAgendomat.g:820:6: (otherlv_13= RULE_STRING )
                    	    {
                    	    // InternalAgendomat.g:820:6: (otherlv_13= RULE_STRING )
                    	    // InternalAgendomat.g:821:7: otherlv_13= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBreakRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getBreakAccess().getAnimatorsPersonCrossReference_9_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getBreakAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBreakAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalAgendomat.g:846:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // InternalAgendomat.g:846:45: (iv_ruleTalk= ruleTalk EOF )
            // InternalAgendomat.g:847:2: iv_ruleTalk= ruleTalk EOF
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
    // InternalAgendomat.g:853:1: ruleTalk returns [EObject current=null] : (otherlv_0= 'Talk' ( (lv_talkName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_talkStartTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_talkEndTime_6_0= RULE_STRING ) ) otherlv_7= 'Presenter' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_talkName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_talkStartTime_4_0=null;
        Token otherlv_5=null;
        Token lv_talkEndTime_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalAgendomat.g:859:2: ( (otherlv_0= 'Talk' ( (lv_talkName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_talkStartTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_talkEndTime_6_0= RULE_STRING ) ) otherlv_7= 'Presenter' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalAgendomat.g:860:2: (otherlv_0= 'Talk' ( (lv_talkName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_talkStartTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_talkEndTime_6_0= RULE_STRING ) ) otherlv_7= 'Presenter' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalAgendomat.g:860:2: (otherlv_0= 'Talk' ( (lv_talkName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_talkStartTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_talkEndTime_6_0= RULE_STRING ) ) otherlv_7= 'Presenter' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalAgendomat.g:861:3: otherlv_0= 'Talk' ( (lv_talkName_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Time' ( (lv_talkStartTime_4_0= RULE_STRING ) ) otherlv_5= '-' ( (lv_talkEndTime_6_0= RULE_STRING ) ) otherlv_7= 'Presenter' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkAccess().getTalkKeyword_0());
            		
            // InternalAgendomat.g:865:3: ( (lv_talkName_1_0= RULE_STRING ) )
            // InternalAgendomat.g:866:4: (lv_talkName_1_0= RULE_STRING )
            {
            // InternalAgendomat.g:866:4: (lv_talkName_1_0= RULE_STRING )
            // InternalAgendomat.g:867:5: lv_talkName_1_0= RULE_STRING
            {
            lv_talkName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_talkName_1_0, grammarAccess.getTalkAccess().getTalkNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"talkName",
            						lv_talkName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTalkAccess().getTimeKeyword_3());
            		
            // InternalAgendomat.g:891:3: ( (lv_talkStartTime_4_0= RULE_STRING ) )
            // InternalAgendomat.g:892:4: (lv_talkStartTime_4_0= RULE_STRING )
            {
            // InternalAgendomat.g:892:4: (lv_talkStartTime_4_0= RULE_STRING )
            // InternalAgendomat.g:893:5: lv_talkStartTime_4_0= RULE_STRING
            {
            lv_talkStartTime_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_talkStartTime_4_0, grammarAccess.getTalkAccess().getTalkStartTimeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"talkStartTime",
            						lv_talkStartTime_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTalkAccess().getHyphenMinusKeyword_5());
            		
            // InternalAgendomat.g:913:3: ( (lv_talkEndTime_6_0= RULE_STRING ) )
            // InternalAgendomat.g:914:4: (lv_talkEndTime_6_0= RULE_STRING )
            {
            // InternalAgendomat.g:914:4: (lv_talkEndTime_6_0= RULE_STRING )
            // InternalAgendomat.g:915:5: lv_talkEndTime_6_0= RULE_STRING
            {
            lv_talkEndTime_6_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_talkEndTime_6_0, grammarAccess.getTalkAccess().getTalkEndTimeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"talkEndTime",
            						lv_talkEndTime_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getTalkAccess().getPresenterKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTalkAccess().getLeftParenthesisKeyword_8());
            		
            // InternalAgendomat.g:939:3: ( (otherlv_9= RULE_STRING ) )
            // InternalAgendomat.g:940:4: (otherlv_9= RULE_STRING )
            {
            // InternalAgendomat.g:940:4: (otherlv_9= RULE_STRING )
            // InternalAgendomat.g:941:5: otherlv_9= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(otherlv_9, grammarAccess.getTalkAccess().getPresentersPersonCrossReference_9_0());
            				

            }


            }

            // InternalAgendomat.g:952:3: (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAgendomat.g:953:4: otherlv_10= ',' ( (otherlv_11= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTalkAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAgendomat.g:957:4: ( (otherlv_11= RULE_STRING ) )
            	    // InternalAgendomat.g:958:5: (otherlv_11= RULE_STRING )
            	    {
            	    // InternalAgendomat.g:958:5: (otherlv_11= RULE_STRING )
            	    // InternalAgendomat.g:959:6: otherlv_11= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTalkRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    						newLeafNode(otherlv_11, grammarAccess.getTalkAccess().getPresentersPersonCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_12=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getTalkAccess().getRightParenthesisKeyword_11());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalAgendomat.g:983:1: entryRuleEquipment returns [EObject current=null] : iv_ruleEquipment= ruleEquipment EOF ;
    public final EObject entryRuleEquipment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquipment = null;


        try {
            // InternalAgendomat.g:983:50: (iv_ruleEquipment= ruleEquipment EOF )
            // InternalAgendomat.g:984:2: iv_ruleEquipment= ruleEquipment EOF
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
    // InternalAgendomat.g:990:1: ruleEquipment returns [EObject current=null] : ( (lv_equipmentName_0_0= RULE_STRING ) ) ;
    public final EObject ruleEquipment() throws RecognitionException {
        EObject current = null;

        Token lv_equipmentName_0_0=null;


        	enterRule();

        try {
            // InternalAgendomat.g:996:2: ( ( (lv_equipmentName_0_0= RULE_STRING ) ) )
            // InternalAgendomat.g:997:2: ( (lv_equipmentName_0_0= RULE_STRING ) )
            {
            // InternalAgendomat.g:997:2: ( (lv_equipmentName_0_0= RULE_STRING ) )
            // InternalAgendomat.g:998:3: (lv_equipmentName_0_0= RULE_STRING )
            {
            // InternalAgendomat.g:998:3: (lv_equipmentName_0_0= RULE_STRING )
            // InternalAgendomat.g:999:4: lv_equipmentName_0_0= RULE_STRING
            {
            lv_equipmentName_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_equipmentName_0_0, grammarAccess.getEquipmentAccess().getEquipmentNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEquipmentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"equipmentName",
            					lv_equipmentName_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // InternalAgendomat.g:1018:1: ruleRole returns [Enumerator current=null] : ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) ) ;
    public final Enumerator ruleRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAgendomat.g:1024:2: ( ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) ) )
            // InternalAgendomat.g:1025:2: ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) )
            {
            // InternalAgendomat.g:1025:2: ( (enumLiteral_0= 'Presenter' ) | (enumLiteral_1= 'TechSupport' ) | (enumLiteral_2= 'Animator' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAgendomat.g:1026:3: (enumLiteral_0= 'Presenter' )
                    {
                    // InternalAgendomat.g:1026:3: (enumLiteral_0= 'Presenter' )
                    // InternalAgendomat.g:1027:4: enumLiteral_0= 'Presenter'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleAccess().getPresenterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:1034:3: (enumLiteral_1= 'TechSupport' )
                    {
                    // InternalAgendomat.g:1034:3: (enumLiteral_1= 'TechSupport' )
                    // InternalAgendomat.g:1035:4: enumLiteral_1= 'TechSupport'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleAccess().getTechSupportEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAgendomat.g:1042:3: (enumLiteral_2= 'Animator' )
                    {
                    // InternalAgendomat.g:1042:3: (enumLiteral_2= 'Animator' )
                    // InternalAgendomat.g:1043:4: enumLiteral_2= 'Animator'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAgendomat.g:1053:1: ruleLocationType returns [Enumerator current=null] : ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) ) ;
    public final Enumerator ruleLocationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgendomat.g:1059:2: ( ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) ) )
            // InternalAgendomat.g:1060:2: ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) )
            {
            // InternalAgendomat.g:1060:2: ( (enumLiteral_0= 'Room' ) | (enumLiteral_1= 'BreakArea' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAgendomat.g:1061:3: (enumLiteral_0= 'Room' )
                    {
                    // InternalAgendomat.g:1061:3: (enumLiteral_0= 'Room' )
                    // InternalAgendomat.g:1062:4: enumLiteral_0= 'Room'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLocationTypeAccess().getRoomEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgendomat.g:1069:3: (enumLiteral_1= 'BreakArea' )
                    {
                    // InternalAgendomat.g:1069:3: (enumLiteral_1= 'BreakArea' )
                    // InternalAgendomat.g:1070:4: enumLiteral_1= 'BreakArea'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000102870000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000102860000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000102820000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000102020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000A10000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000490020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000480020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400220000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});

}