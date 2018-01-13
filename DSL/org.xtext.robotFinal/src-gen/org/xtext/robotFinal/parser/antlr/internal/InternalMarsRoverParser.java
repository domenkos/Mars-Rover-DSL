package org.xtext.robotFinal.parser.antlr.internal;

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
import org.xtext.robotFinal.services.MarsRoverGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarsRoverParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'slave_address'", "'drive_speed'", "'special_speed'", "'missions'", "'mission'", "'type'", "'avoid_obstacles'", "'sensors'", "'ultra'", "'distance'", "'bumpers'", "'detect_lakes'", "'number_of_lakes'", "'lakes_colors'", "'after_examinating'", "'detect_rocks'", "'number_of_rocks'", "'push_obstacles'", "'stop'", "'continue'", "'indicate'", "'with'", "'sound'", "'duration'", "'frequency'", "'message'", "'color_indication'", "'with_color'", "'avoid_lakes'", "'red'", "'blue'", "'green'", "'orange'", "'white'", "'black'", "'off'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalMarsRoverParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarsRoverParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarsRoverParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMarsRover.g"; }



     	private MarsRoverGrammarAccess grammarAccess;

        public InternalMarsRoverParser(TokenStream input, MarsRoverGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected MarsRoverGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalMarsRover.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMarsRover.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMarsRover.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMarsRover.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'slave_address' ( (lv_slave_address_3_0= RULE_STRING ) ) otherlv_4= 'drive_speed' ( (lv_drive_speed_5_0= RULE_INT ) ) otherlv_6= 'special_speed' ( (lv_special_speed_7_0= RULE_INT ) ) otherlv_8= 'missions' ( (lv_missions_9_0= rulemission ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_slave_address_3_0=null;
        Token otherlv_4=null;
        Token lv_drive_speed_5_0=null;
        Token otherlv_6=null;
        Token lv_special_speed_7_0=null;
        Token otherlv_8=null;
        EObject lv_missions_9_0 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'slave_address' ( (lv_slave_address_3_0= RULE_STRING ) ) otherlv_4= 'drive_speed' ( (lv_drive_speed_5_0= RULE_INT ) ) otherlv_6= 'special_speed' ( (lv_special_speed_7_0= RULE_INT ) ) otherlv_8= 'missions' ( (lv_missions_9_0= rulemission ) )* ) )
            // InternalMarsRover.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'slave_address' ( (lv_slave_address_3_0= RULE_STRING ) ) otherlv_4= 'drive_speed' ( (lv_drive_speed_5_0= RULE_INT ) ) otherlv_6= 'special_speed' ( (lv_special_speed_7_0= RULE_INT ) ) otherlv_8= 'missions' ( (lv_missions_9_0= rulemission ) )* )
            {
            // InternalMarsRover.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'slave_address' ( (lv_slave_address_3_0= RULE_STRING ) ) otherlv_4= 'drive_speed' ( (lv_drive_speed_5_0= RULE_INT ) ) otherlv_6= 'special_speed' ( (lv_special_speed_7_0= RULE_INT ) ) otherlv_8= 'missions' ( (lv_missions_9_0= rulemission ) )* )
            // InternalMarsRover.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'slave_address' ( (lv_slave_address_3_0= RULE_STRING ) ) otherlv_4= 'drive_speed' ( (lv_drive_speed_5_0= RULE_INT ) ) otherlv_6= 'special_speed' ( (lv_special_speed_7_0= RULE_INT ) ) otherlv_8= 'missions' ( (lv_missions_9_0= rulemission ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalMarsRover.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMarsRover.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMarsRover.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalMarsRover.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getSlave_addressKeyword_2());
            		
            // InternalMarsRover.g:106:3: ( (lv_slave_address_3_0= RULE_STRING ) )
            // InternalMarsRover.g:107:4: (lv_slave_address_3_0= RULE_STRING )
            {
            // InternalMarsRover.g:107:4: (lv_slave_address_3_0= RULE_STRING )
            // InternalMarsRover.g:108:5: lv_slave_address_3_0= RULE_STRING
            {
            lv_slave_address_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_slave_address_3_0, grammarAccess.getRobotAccess().getSlave_addressSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"slave_address",
            						lv_slave_address_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getDrive_speedKeyword_4());
            		
            // InternalMarsRover.g:128:3: ( (lv_drive_speed_5_0= RULE_INT ) )
            // InternalMarsRover.g:129:4: (lv_drive_speed_5_0= RULE_INT )
            {
            // InternalMarsRover.g:129:4: (lv_drive_speed_5_0= RULE_INT )
            // InternalMarsRover.g:130:5: lv_drive_speed_5_0= RULE_INT
            {
            lv_drive_speed_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_drive_speed_5_0, grammarAccess.getRobotAccess().getDrive_speedINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"drive_speed",
            						lv_drive_speed_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getSpecial_speedKeyword_6());
            		
            // InternalMarsRover.g:150:3: ( (lv_special_speed_7_0= RULE_INT ) )
            // InternalMarsRover.g:151:4: (lv_special_speed_7_0= RULE_INT )
            {
            // InternalMarsRover.g:151:4: (lv_special_speed_7_0= RULE_INT )
            // InternalMarsRover.g:152:5: lv_special_speed_7_0= RULE_INT
            {
            lv_special_speed_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_special_speed_7_0, grammarAccess.getRobotAccess().getSpecial_speedINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"special_speed",
            						lv_special_speed_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getMissionsKeyword_8());
            		
            // InternalMarsRover.g:172:3: ( (lv_missions_9_0= rulemission ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMarsRover.g:173:4: (lv_missions_9_0= rulemission )
            	    {
            	    // InternalMarsRover.g:173:4: (lv_missions_9_0= rulemission )
            	    // InternalMarsRover.g:174:5: lv_missions_9_0= rulemission
            	    {

            	    					newCompositeNode(grammarAccess.getRobotAccess().getMissionsMissionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_missions_9_0=rulemission();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missions",
            	    						lv_missions_9_0,
            	    						"org.xtext.robotFinal.MarsRover.mission");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRulemission"
    // InternalMarsRover.g:195:1: entryRulemission returns [EObject current=null] : iv_rulemission= rulemission EOF ;
    public final EObject entryRulemission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemission = null;


        try {
            // InternalMarsRover.g:195:48: (iv_rulemission= rulemission EOF )
            // InternalMarsRover.g:196:2: iv_rulemission= rulemission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemission=rulemission();

            state._fsp--;

             current =iv_rulemission; 
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
    // $ANTLR end "entryRulemission"


    // $ANTLR start "rulemission"
    // InternalMarsRover.g:202:1: rulemission returns [EObject current=null] : (otherlv_0= 'mission' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) ) ) ;
    public final EObject rulemission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_1 = null;

        EObject lv_type_3_2 = null;

        EObject lv_type_3_3 = null;

        EObject lv_type_3_4 = null;

        EObject lv_type_3_5 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:208:2: ( (otherlv_0= 'mission' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) ) ) )
            // InternalMarsRover.g:209:2: (otherlv_0= 'mission' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) ) )
            {
            // InternalMarsRover.g:209:2: (otherlv_0= 'mission' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) ) )
            // InternalMarsRover.g:210:3: otherlv_0= 'mission' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'type' ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalMarsRover.g:214:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMarsRover.g:215:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMarsRover.g:215:4: (lv_name_1_0= RULE_STRING )
            // InternalMarsRover.g:216:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getTypeKeyword_2());
            		
            // InternalMarsRover.g:236:3: ( ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) ) )
            // InternalMarsRover.g:237:4: ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) )
            {
            // InternalMarsRover.g:237:4: ( (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks ) )
            // InternalMarsRover.g:238:5: (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks )
            {
            // InternalMarsRover.g:238:5: (lv_type_3_1= ruleavoid_obstacles | lv_type_3_2= ruledetect_lakes | lv_type_3_3= ruleavoid_lakes | lv_type_3_4= rulepush_obstacles | lv_type_3_5= ruledetect_rocks )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMarsRover.g:239:6: lv_type_3_1= ruleavoid_obstacles
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeAvoid_obstaclesParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_1=ruleavoid_obstacles();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_1,
                    							"org.xtext.robotFinal.MarsRover.avoid_obstacles");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:255:6: lv_type_3_2= ruledetect_lakes
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeDetect_lakesParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_2=ruledetect_lakes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_2,
                    							"org.xtext.robotFinal.MarsRover.detect_lakes");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:271:6: lv_type_3_3= ruleavoid_lakes
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeAvoid_lakesParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_3=ruleavoid_lakes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_3,
                    							"org.xtext.robotFinal.MarsRover.avoid_lakes");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:287:6: lv_type_3_4= rulepush_obstacles
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypePush_obstaclesParserRuleCall_3_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_4=rulepush_obstacles();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_4,
                    							"org.xtext.robotFinal.MarsRover.push_obstacles");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 5 :
                    // InternalMarsRover.g:303:6: lv_type_3_5= ruledetect_rocks
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTypeDetect_rocksParserRuleCall_3_0_4());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_5=ruledetect_rocks();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_5,
                    							"org.xtext.robotFinal.MarsRover.detect_rocks");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "rulemission"


    // $ANTLR start "entryRuleavoid_obstacles"
    // InternalMarsRover.g:325:1: entryRuleavoid_obstacles returns [EObject current=null] : iv_ruleavoid_obstacles= ruleavoid_obstacles EOF ;
    public final EObject entryRuleavoid_obstacles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleavoid_obstacles = null;


        try {
            // InternalMarsRover.g:325:56: (iv_ruleavoid_obstacles= ruleavoid_obstacles EOF )
            // InternalMarsRover.g:326:2: iv_ruleavoid_obstacles= ruleavoid_obstacles EOF
            {
             newCompositeNode(grammarAccess.getAvoid_obstaclesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleavoid_obstacles=ruleavoid_obstacles();

            state._fsp--;

             current =iv_ruleavoid_obstacles; 
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
    // $ANTLR end "entryRuleavoid_obstacles"


    // $ANTLR start "ruleavoid_obstacles"
    // InternalMarsRover.g:332:1: ruleavoid_obstacles returns [EObject current=null] : ( ( (lv_name_0_0= 'avoid_obstacles' ) ) otherlv_1= 'sensors' ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )* ) ;
    public final EObject ruleavoid_obstacles() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_sensors_2_1 = null;

        EObject lv_sensors_2_2 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:338:2: ( ( ( (lv_name_0_0= 'avoid_obstacles' ) ) otherlv_1= 'sensors' ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )* ) )
            // InternalMarsRover.g:339:2: ( ( (lv_name_0_0= 'avoid_obstacles' ) ) otherlv_1= 'sensors' ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )* )
            {
            // InternalMarsRover.g:339:2: ( ( (lv_name_0_0= 'avoid_obstacles' ) ) otherlv_1= 'sensors' ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )* )
            // InternalMarsRover.g:340:3: ( (lv_name_0_0= 'avoid_obstacles' ) ) otherlv_1= 'sensors' ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )*
            {
            // InternalMarsRover.g:340:3: ( (lv_name_0_0= 'avoid_obstacles' ) )
            // InternalMarsRover.g:341:4: (lv_name_0_0= 'avoid_obstacles' )
            {
            // InternalMarsRover.g:341:4: (lv_name_0_0= 'avoid_obstacles' )
            // InternalMarsRover.g:342:5: lv_name_0_0= 'avoid_obstacles'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAvoid_obstaclesAccess().getNameAvoid_obstaclesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvoid_obstaclesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "avoid_obstacles");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAvoid_obstaclesAccess().getSensorsKeyword_1());
            		
            // InternalMarsRover.g:358:3: ( ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMarsRover.g:359:4: ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) )
            	    {
            	    // InternalMarsRover.g:359:4: ( (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers ) )
            	    // InternalMarsRover.g:360:5: (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers )
            	    {
            	    // InternalMarsRover.g:360:5: (lv_sensors_2_1= ruleultra | lv_sensors_2_2= rulebumpers )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==20) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==22) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMarsRover.g:361:6: lv_sensors_2_1= ruleultra
            	            {

            	            						newCompositeNode(grammarAccess.getAvoid_obstaclesAccess().getSensorsUltraParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_sensors_2_1=ruleultra();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAvoid_obstaclesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"sensors",
            	            							lv_sensors_2_1,
            	            							"org.xtext.robotFinal.MarsRover.ultra");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMarsRover.g:377:6: lv_sensors_2_2= rulebumpers
            	            {

            	            						newCompositeNode(grammarAccess.getAvoid_obstaclesAccess().getSensorsBumpersParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_sensors_2_2=rulebumpers();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getAvoid_obstaclesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"sensors",
            	            							lv_sensors_2_2,
            	            							"org.xtext.robotFinal.MarsRover.bumpers");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleavoid_obstacles"


    // $ANTLR start "entryRuleultra"
    // InternalMarsRover.g:399:1: entryRuleultra returns [EObject current=null] : iv_ruleultra= ruleultra EOF ;
    public final EObject entryRuleultra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleultra = null;


        try {
            // InternalMarsRover.g:399:46: (iv_ruleultra= ruleultra EOF )
            // InternalMarsRover.g:400:2: iv_ruleultra= ruleultra EOF
            {
             newCompositeNode(grammarAccess.getUltraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleultra=ruleultra();

            state._fsp--;

             current =iv_ruleultra; 
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
    // $ANTLR end "entryRuleultra"


    // $ANTLR start "ruleultra"
    // InternalMarsRover.g:406:1: ruleultra returns [EObject current=null] : ( ( (lv_name_0_0= 'ultra' ) ) otherlv_1= 'distance' ( (lv_distance_2_0= RULE_INT ) ) ) ;
    public final EObject ruleultra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_distance_2_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:412:2: ( ( ( (lv_name_0_0= 'ultra' ) ) otherlv_1= 'distance' ( (lv_distance_2_0= RULE_INT ) ) ) )
            // InternalMarsRover.g:413:2: ( ( (lv_name_0_0= 'ultra' ) ) otherlv_1= 'distance' ( (lv_distance_2_0= RULE_INT ) ) )
            {
            // InternalMarsRover.g:413:2: ( ( (lv_name_0_0= 'ultra' ) ) otherlv_1= 'distance' ( (lv_distance_2_0= RULE_INT ) ) )
            // InternalMarsRover.g:414:3: ( (lv_name_0_0= 'ultra' ) ) otherlv_1= 'distance' ( (lv_distance_2_0= RULE_INT ) )
            {
            // InternalMarsRover.g:414:3: ( (lv_name_0_0= 'ultra' ) )
            // InternalMarsRover.g:415:4: (lv_name_0_0= 'ultra' )
            {
            // InternalMarsRover.g:415:4: (lv_name_0_0= 'ultra' )
            // InternalMarsRover.g:416:5: lv_name_0_0= 'ultra'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUltraAccess().getNameUltraKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUltraRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ultra");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUltraAccess().getDistanceKeyword_1());
            		
            // InternalMarsRover.g:432:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalMarsRover.g:433:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalMarsRover.g:433:4: (lv_distance_2_0= RULE_INT )
            // InternalMarsRover.g:434:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_distance_2_0, grammarAccess.getUltraAccess().getDistanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUltraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleultra"


    // $ANTLR start "entryRulebumpers"
    // InternalMarsRover.g:454:1: entryRulebumpers returns [EObject current=null] : iv_rulebumpers= rulebumpers EOF ;
    public final EObject entryRulebumpers() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebumpers = null;


        try {
            // InternalMarsRover.g:454:48: (iv_rulebumpers= rulebumpers EOF )
            // InternalMarsRover.g:455:2: iv_rulebumpers= rulebumpers EOF
            {
             newCompositeNode(grammarAccess.getBumpersRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebumpers=rulebumpers();

            state._fsp--;

             current =iv_rulebumpers; 
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
    // $ANTLR end "entryRulebumpers"


    // $ANTLR start "rulebumpers"
    // InternalMarsRover.g:461:1: rulebumpers returns [EObject current=null] : ( (lv_name_0_0= 'bumpers' ) ) ;
    public final EObject rulebumpers() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:467:2: ( ( (lv_name_0_0= 'bumpers' ) ) )
            // InternalMarsRover.g:468:2: ( (lv_name_0_0= 'bumpers' ) )
            {
            // InternalMarsRover.g:468:2: ( (lv_name_0_0= 'bumpers' ) )
            // InternalMarsRover.g:469:3: (lv_name_0_0= 'bumpers' )
            {
            // InternalMarsRover.g:469:3: (lv_name_0_0= 'bumpers' )
            // InternalMarsRover.g:470:4: lv_name_0_0= 'bumpers'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBumpersAccess().getNameBumpersKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBumpersRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "bumpers");
            			

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
    // $ANTLR end "rulebumpers"


    // $ANTLR start "entryRuledetect_lakes"
    // InternalMarsRover.g:485:1: entryRuledetect_lakes returns [EObject current=null] : iv_ruledetect_lakes= ruledetect_lakes EOF ;
    public final EObject entryRuledetect_lakes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledetect_lakes = null;


        try {
            // InternalMarsRover.g:485:53: (iv_ruledetect_lakes= ruledetect_lakes EOF )
            // InternalMarsRover.g:486:2: iv_ruledetect_lakes= ruledetect_lakes EOF
            {
             newCompositeNode(grammarAccess.getDetect_lakesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledetect_lakes=ruledetect_lakes();

            state._fsp--;

             current =iv_ruledetect_lakes; 
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
    // $ANTLR end "entryRuledetect_lakes"


    // $ANTLR start "ruledetect_lakes"
    // InternalMarsRover.g:492:1: ruledetect_lakes returns [EObject current=null] : ( ( (lv_name_0_0= 'detect_lakes' ) ) otherlv_1= 'number_of_lakes' ( (lv_number_of_lakes_2_0= RULE_INT ) ) otherlv_3= 'lakes_colors' ( (lv_lakes_colors_4_0= ruleColor ) )* otherlv_5= 'after_examinating' ( (lv_after_examinating_6_0= ruleafter_action ) ) ) ;
    public final EObject ruledetect_lakes() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_number_of_lakes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_lakes_colors_4_0 = null;

        EObject lv_after_examinating_6_0 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:498:2: ( ( ( (lv_name_0_0= 'detect_lakes' ) ) otherlv_1= 'number_of_lakes' ( (lv_number_of_lakes_2_0= RULE_INT ) ) otherlv_3= 'lakes_colors' ( (lv_lakes_colors_4_0= ruleColor ) )* otherlv_5= 'after_examinating' ( (lv_after_examinating_6_0= ruleafter_action ) ) ) )
            // InternalMarsRover.g:499:2: ( ( (lv_name_0_0= 'detect_lakes' ) ) otherlv_1= 'number_of_lakes' ( (lv_number_of_lakes_2_0= RULE_INT ) ) otherlv_3= 'lakes_colors' ( (lv_lakes_colors_4_0= ruleColor ) )* otherlv_5= 'after_examinating' ( (lv_after_examinating_6_0= ruleafter_action ) ) )
            {
            // InternalMarsRover.g:499:2: ( ( (lv_name_0_0= 'detect_lakes' ) ) otherlv_1= 'number_of_lakes' ( (lv_number_of_lakes_2_0= RULE_INT ) ) otherlv_3= 'lakes_colors' ( (lv_lakes_colors_4_0= ruleColor ) )* otherlv_5= 'after_examinating' ( (lv_after_examinating_6_0= ruleafter_action ) ) )
            // InternalMarsRover.g:500:3: ( (lv_name_0_0= 'detect_lakes' ) ) otherlv_1= 'number_of_lakes' ( (lv_number_of_lakes_2_0= RULE_INT ) ) otherlv_3= 'lakes_colors' ( (lv_lakes_colors_4_0= ruleColor ) )* otherlv_5= 'after_examinating' ( (lv_after_examinating_6_0= ruleafter_action ) )
            {
            // InternalMarsRover.g:500:3: ( (lv_name_0_0= 'detect_lakes' ) )
            // InternalMarsRover.g:501:4: (lv_name_0_0= 'detect_lakes' )
            {
            // InternalMarsRover.g:501:4: (lv_name_0_0= 'detect_lakes' )
            // InternalMarsRover.g:502:5: lv_name_0_0= 'detect_lakes'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDetect_lakesAccess().getNameDetect_lakesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetect_lakesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "detect_lakes");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDetect_lakesAccess().getNumber_of_lakesKeyword_1());
            		
            // InternalMarsRover.g:518:3: ( (lv_number_of_lakes_2_0= RULE_INT ) )
            // InternalMarsRover.g:519:4: (lv_number_of_lakes_2_0= RULE_INT )
            {
            // InternalMarsRover.g:519:4: (lv_number_of_lakes_2_0= RULE_INT )
            // InternalMarsRover.g:520:5: lv_number_of_lakes_2_0= RULE_INT
            {
            lv_number_of_lakes_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_of_lakes_2_0, grammarAccess.getDetect_lakesAccess().getNumber_of_lakesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetect_lakesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number_of_lakes",
            						lv_number_of_lakes_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDetect_lakesAccess().getLakes_colorsKeyword_3());
            		
            // InternalMarsRover.g:540:3: ( (lv_lakes_colors_4_0= ruleColor ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=41 && LA5_0<=47)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMarsRover.g:541:4: (lv_lakes_colors_4_0= ruleColor )
            	    {
            	    // InternalMarsRover.g:541:4: (lv_lakes_colors_4_0= ruleColor )
            	    // InternalMarsRover.g:542:5: lv_lakes_colors_4_0= ruleColor
            	    {

            	    					newCompositeNode(grammarAccess.getDetect_lakesAccess().getLakes_colorsColorEnumRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_lakes_colors_4_0=ruleColor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDetect_lakesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lakes_colors",
            	    						lv_lakes_colors_4_0,
            	    						"org.xtext.robotFinal.MarsRover.Color");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getDetect_lakesAccess().getAfter_examinatingKeyword_5());
            		
            // InternalMarsRover.g:563:3: ( (lv_after_examinating_6_0= ruleafter_action ) )
            // InternalMarsRover.g:564:4: (lv_after_examinating_6_0= ruleafter_action )
            {
            // InternalMarsRover.g:564:4: (lv_after_examinating_6_0= ruleafter_action )
            // InternalMarsRover.g:565:5: lv_after_examinating_6_0= ruleafter_action
            {

            					newCompositeNode(grammarAccess.getDetect_lakesAccess().getAfter_examinatingAfter_actionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_after_examinating_6_0=ruleafter_action();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetect_lakesRule());
            					}
            					set(
            						current,
            						"after_examinating",
            						lv_after_examinating_6_0,
            						"org.xtext.robotFinal.MarsRover.after_action");
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
    // $ANTLR end "ruledetect_lakes"


    // $ANTLR start "entryRuledetect_rocks"
    // InternalMarsRover.g:586:1: entryRuledetect_rocks returns [EObject current=null] : iv_ruledetect_rocks= ruledetect_rocks EOF ;
    public final EObject entryRuledetect_rocks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledetect_rocks = null;


        try {
            // InternalMarsRover.g:586:53: (iv_ruledetect_rocks= ruledetect_rocks EOF )
            // InternalMarsRover.g:587:2: iv_ruledetect_rocks= ruledetect_rocks EOF
            {
             newCompositeNode(grammarAccess.getDetect_rocksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledetect_rocks=ruledetect_rocks();

            state._fsp--;

             current =iv_ruledetect_rocks; 
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
    // $ANTLR end "entryRuledetect_rocks"


    // $ANTLR start "ruledetect_rocks"
    // InternalMarsRover.g:593:1: ruledetect_rocks returns [EObject current=null] : ( ( (lv_name_0_0= 'detect_rocks' ) ) otherlv_1= 'number_of_rocks' ( (lv_number_of_rocks_2_0= RULE_INT ) ) otherlv_3= 'after_examinating' ( (lv_after_examinating_4_0= ruleafter_action ) ) ) ;
    public final EObject ruledetect_rocks() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_number_of_rocks_2_0=null;
        Token otherlv_3=null;
        EObject lv_after_examinating_4_0 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:599:2: ( ( ( (lv_name_0_0= 'detect_rocks' ) ) otherlv_1= 'number_of_rocks' ( (lv_number_of_rocks_2_0= RULE_INT ) ) otherlv_3= 'after_examinating' ( (lv_after_examinating_4_0= ruleafter_action ) ) ) )
            // InternalMarsRover.g:600:2: ( ( (lv_name_0_0= 'detect_rocks' ) ) otherlv_1= 'number_of_rocks' ( (lv_number_of_rocks_2_0= RULE_INT ) ) otherlv_3= 'after_examinating' ( (lv_after_examinating_4_0= ruleafter_action ) ) )
            {
            // InternalMarsRover.g:600:2: ( ( (lv_name_0_0= 'detect_rocks' ) ) otherlv_1= 'number_of_rocks' ( (lv_number_of_rocks_2_0= RULE_INT ) ) otherlv_3= 'after_examinating' ( (lv_after_examinating_4_0= ruleafter_action ) ) )
            // InternalMarsRover.g:601:3: ( (lv_name_0_0= 'detect_rocks' ) ) otherlv_1= 'number_of_rocks' ( (lv_number_of_rocks_2_0= RULE_INT ) ) otherlv_3= 'after_examinating' ( (lv_after_examinating_4_0= ruleafter_action ) )
            {
            // InternalMarsRover.g:601:3: ( (lv_name_0_0= 'detect_rocks' ) )
            // InternalMarsRover.g:602:4: (lv_name_0_0= 'detect_rocks' )
            {
            // InternalMarsRover.g:602:4: (lv_name_0_0= 'detect_rocks' )
            // InternalMarsRover.g:603:5: lv_name_0_0= 'detect_rocks'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDetect_rocksAccess().getNameDetect_rocksKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetect_rocksRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "detect_rocks");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDetect_rocksAccess().getNumber_of_rocksKeyword_1());
            		
            // InternalMarsRover.g:619:3: ( (lv_number_of_rocks_2_0= RULE_INT ) )
            // InternalMarsRover.g:620:4: (lv_number_of_rocks_2_0= RULE_INT )
            {
            // InternalMarsRover.g:620:4: (lv_number_of_rocks_2_0= RULE_INT )
            // InternalMarsRover.g:621:5: lv_number_of_rocks_2_0= RULE_INT
            {
            lv_number_of_rocks_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_number_of_rocks_2_0, grammarAccess.getDetect_rocksAccess().getNumber_of_rocksINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetect_rocksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number_of_rocks",
            						lv_number_of_rocks_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDetect_rocksAccess().getAfter_examinatingKeyword_3());
            		
            // InternalMarsRover.g:641:3: ( (lv_after_examinating_4_0= ruleafter_action ) )
            // InternalMarsRover.g:642:4: (lv_after_examinating_4_0= ruleafter_action )
            {
            // InternalMarsRover.g:642:4: (lv_after_examinating_4_0= ruleafter_action )
            // InternalMarsRover.g:643:5: lv_after_examinating_4_0= ruleafter_action
            {

            					newCompositeNode(grammarAccess.getDetect_rocksAccess().getAfter_examinatingAfter_actionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_after_examinating_4_0=ruleafter_action();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetect_rocksRule());
            					}
            					set(
            						current,
            						"after_examinating",
            						lv_after_examinating_4_0,
            						"org.xtext.robotFinal.MarsRover.after_action");
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
    // $ANTLR end "ruledetect_rocks"


    // $ANTLR start "entryRulepush_obstacles"
    // InternalMarsRover.g:664:1: entryRulepush_obstacles returns [EObject current=null] : iv_rulepush_obstacles= rulepush_obstacles EOF ;
    public final EObject entryRulepush_obstacles() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepush_obstacles = null;


        try {
            // InternalMarsRover.g:664:55: (iv_rulepush_obstacles= rulepush_obstacles EOF )
            // InternalMarsRover.g:665:2: iv_rulepush_obstacles= rulepush_obstacles EOF
            {
             newCompositeNode(grammarAccess.getPush_obstaclesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepush_obstacles=rulepush_obstacles();

            state._fsp--;

             current =iv_rulepush_obstacles; 
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
    // $ANTLR end "entryRulepush_obstacles"


    // $ANTLR start "rulepush_obstacles"
    // InternalMarsRover.g:671:1: rulepush_obstacles returns [EObject current=null] : ( (lv_name_0_0= 'push_obstacles' ) ) ;
    public final EObject rulepush_obstacles() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:677:2: ( ( (lv_name_0_0= 'push_obstacles' ) ) )
            // InternalMarsRover.g:678:2: ( (lv_name_0_0= 'push_obstacles' ) )
            {
            // InternalMarsRover.g:678:2: ( (lv_name_0_0= 'push_obstacles' ) )
            // InternalMarsRover.g:679:3: (lv_name_0_0= 'push_obstacles' )
            {
            // InternalMarsRover.g:679:3: (lv_name_0_0= 'push_obstacles' )
            // InternalMarsRover.g:680:4: lv_name_0_0= 'push_obstacles'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPush_obstaclesAccess().getNamePush_obstaclesKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPush_obstaclesRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "push_obstacles");
            			

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
    // $ANTLR end "rulepush_obstacles"


    // $ANTLR start "entryRuleafter_action"
    // InternalMarsRover.g:695:1: entryRuleafter_action returns [EObject current=null] : iv_ruleafter_action= ruleafter_action EOF ;
    public final EObject entryRuleafter_action() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleafter_action = null;


        try {
            // InternalMarsRover.g:695:53: (iv_ruleafter_action= ruleafter_action EOF )
            // InternalMarsRover.g:696:2: iv_ruleafter_action= ruleafter_action EOF
            {
             newCompositeNode(grammarAccess.getAfter_actionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleafter_action=ruleafter_action();

            state._fsp--;

             current =iv_ruleafter_action; 
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
    // $ANTLR end "entryRuleafter_action"


    // $ANTLR start "ruleafter_action"
    // InternalMarsRover.g:702:1: ruleafter_action returns [EObject current=null] : ( ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) ) (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )? ) ;
    public final EObject ruleafter_action() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_1=null;
        Token lv_action_0_2=null;
        Token otherlv_1=null;
        EObject lv_indicate_2_0 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:708:2: ( ( ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) ) (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )? ) )
            // InternalMarsRover.g:709:2: ( ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) ) (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )? )
            {
            // InternalMarsRover.g:709:2: ( ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) ) (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )? )
            // InternalMarsRover.g:710:3: ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) ) (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )?
            {
            // InternalMarsRover.g:710:3: ( ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) ) )
            // InternalMarsRover.g:711:4: ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) )
            {
            // InternalMarsRover.g:711:4: ( (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' ) )
            // InternalMarsRover.g:712:5: (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' )
            {
            // InternalMarsRover.g:712:5: (lv_action_0_1= 'stop' | lv_action_0_2= 'continue' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMarsRover.g:713:6: lv_action_0_1= 'stop'
                    {
                    lv_action_0_1=(Token)match(input,30,FOLLOW_21); 

                    						newLeafNode(lv_action_0_1, grammarAccess.getAfter_actionAccess().getActionStopKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAfter_actionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:724:6: lv_action_0_2= 'continue'
                    {
                    lv_action_0_2=(Token)match(input,31,FOLLOW_21); 

                    						newLeafNode(lv_action_0_2, grammarAccess.getAfter_actionAccess().getActionContinueKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAfter_actionRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMarsRover.g:737:3: (otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMarsRover.g:738:4: otherlv_1= 'indicate' ( (lv_indicate_2_0= ruleindication ) )*
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getAfter_actionAccess().getIndicateKeyword_1_0());
                    			
                    // InternalMarsRover.g:742:4: ( (lv_indicate_2_0= ruleindication ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==33) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMarsRover.g:743:5: (lv_indicate_2_0= ruleindication )
                    	    {
                    	    // InternalMarsRover.g:743:5: (lv_indicate_2_0= ruleindication )
                    	    // InternalMarsRover.g:744:6: lv_indicate_2_0= ruleindication
                    	    {

                    	    						newCompositeNode(grammarAccess.getAfter_actionAccess().getIndicateIndicationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_indicate_2_0=ruleindication();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAfter_actionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"indicate",
                    	    							lv_indicate_2_0,
                    	    							"org.xtext.robotFinal.MarsRover.indication");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleafter_action"


    // $ANTLR start "entryRuleindication"
    // InternalMarsRover.g:766:1: entryRuleindication returns [EObject current=null] : iv_ruleindication= ruleindication EOF ;
    public final EObject entryRuleindication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindication = null;


        try {
            // InternalMarsRover.g:766:51: (iv_ruleindication= ruleindication EOF )
            // InternalMarsRover.g:767:2: iv_ruleindication= ruleindication EOF
            {
             newCompositeNode(grammarAccess.getIndicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindication=ruleindication();

            state._fsp--;

             current =iv_ruleindication; 
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
    // $ANTLR end "entryRuleindication"


    // $ANTLR start "ruleindication"
    // InternalMarsRover.g:773:1: ruleindication returns [EObject current=null] : ( ( (lv_name_0_0= 'with' ) ) ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )? ) ;
    public final EObject ruleindication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:779:2: ( ( ( (lv_name_0_0= 'with' ) ) ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )? ) )
            // InternalMarsRover.g:780:2: ( ( (lv_name_0_0= 'with' ) ) ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )? )
            {
            // InternalMarsRover.g:780:2: ( ( (lv_name_0_0= 'with' ) ) ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )? )
            // InternalMarsRover.g:781:3: ( (lv_name_0_0= 'with' ) ) ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )?
            {
            // InternalMarsRover.g:781:3: ( (lv_name_0_0= 'with' ) )
            // InternalMarsRover.g:782:4: (lv_name_0_0= 'with' )
            {
            // InternalMarsRover.g:782:4: (lv_name_0_0= 'with' )
            // InternalMarsRover.g:783:5: lv_name_0_0= 'with'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIndicationAccess().getNameWithKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndicationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "with");
            				

            }


            }

            // InternalMarsRover.g:795:3: ( ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34||(LA10_0>=37 && LA10_0<=38)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMarsRover.g:796:4: ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) )
                    {
                    // InternalMarsRover.g:796:4: ( (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication ) )
                    // InternalMarsRover.g:797:5: (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication )
                    {
                    // InternalMarsRover.g:797:5: (lv_type_1_1= rulesound | lv_type_1_2= rulemessage | lv_type_1_3= rulecolor_indication )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt9=1;
                        }
                        break;
                    case 37:
                        {
                        alt9=2;
                        }
                        break;
                    case 38:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalMarsRover.g:798:6: lv_type_1_1= rulesound
                            {

                            						newCompositeNode(grammarAccess.getIndicationAccess().getTypeSoundParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_type_1_1=rulesound();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIndicationRule());
                            						}
                            						set(
                            							current,
                            							"type",
                            							lv_type_1_1,
                            							"org.xtext.robotFinal.MarsRover.sound");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMarsRover.g:814:6: lv_type_1_2= rulemessage
                            {

                            						newCompositeNode(grammarAccess.getIndicationAccess().getTypeMessageParserRuleCall_1_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_type_1_2=rulemessage();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIndicationRule());
                            						}
                            						set(
                            							current,
                            							"type",
                            							lv_type_1_2,
                            							"org.xtext.robotFinal.MarsRover.message");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 3 :
                            // InternalMarsRover.g:830:6: lv_type_1_3= rulecolor_indication
                            {

                            						newCompositeNode(grammarAccess.getIndicationAccess().getTypeColor_indicationParserRuleCall_1_0_2());
                            					
                            pushFollow(FOLLOW_2);
                            lv_type_1_3=rulecolor_indication();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIndicationRule());
                            						}
                            						set(
                            							current,
                            							"type",
                            							lv_type_1_3,
                            							"org.xtext.robotFinal.MarsRover.color_indication");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleindication"


    // $ANTLR start "entryRulesound"
    // InternalMarsRover.g:852:1: entryRulesound returns [EObject current=null] : iv_rulesound= rulesound EOF ;
    public final EObject entryRulesound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesound = null;


        try {
            // InternalMarsRover.g:852:46: (iv_rulesound= rulesound EOF )
            // InternalMarsRover.g:853:2: iv_rulesound= rulesound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesound=rulesound();

            state._fsp--;

             current =iv_rulesound; 
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
    // $ANTLR end "entryRulesound"


    // $ANTLR start "rulesound"
    // InternalMarsRover.g:859:1: rulesound returns [EObject current=null] : ( ( (lv_name_0_0= 'sound' ) ) otherlv_1= 'duration' ( (lv_duration_2_0= RULE_INT ) ) otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ;
    public final EObject rulesound() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_duration_2_0=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:865:2: ( ( ( (lv_name_0_0= 'sound' ) ) otherlv_1= 'duration' ( (lv_duration_2_0= RULE_INT ) ) otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            // InternalMarsRover.g:866:2: ( ( (lv_name_0_0= 'sound' ) ) otherlv_1= 'duration' ( (lv_duration_2_0= RULE_INT ) ) otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) )
            {
            // InternalMarsRover.g:866:2: ( ( (lv_name_0_0= 'sound' ) ) otherlv_1= 'duration' ( (lv_duration_2_0= RULE_INT ) ) otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) )
            // InternalMarsRover.g:867:3: ( (lv_name_0_0= 'sound' ) ) otherlv_1= 'duration' ( (lv_duration_2_0= RULE_INT ) ) otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) )
            {
            // InternalMarsRover.g:867:3: ( (lv_name_0_0= 'sound' ) )
            // InternalMarsRover.g:868:4: (lv_name_0_0= 'sound' )
            {
            // InternalMarsRover.g:868:4: (lv_name_0_0= 'sound' )
            // InternalMarsRover.g:869:5: lv_name_0_0= 'sound'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSoundAccess().getNameSoundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoundRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "sound");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getDurationKeyword_1());
            		
            // InternalMarsRover.g:885:3: ( (lv_duration_2_0= RULE_INT ) )
            // InternalMarsRover.g:886:4: (lv_duration_2_0= RULE_INT )
            {
            // InternalMarsRover.g:886:4: (lv_duration_2_0= RULE_INT )
            // InternalMarsRover.g:887:5: lv_duration_2_0= RULE_INT
            {
            lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_duration_2_0, grammarAccess.getSoundAccess().getDurationINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSoundAccess().getFrequencyKeyword_3());
            		
            // InternalMarsRover.g:907:3: ( (lv_frequency_4_0= RULE_INT ) )
            // InternalMarsRover.g:908:4: (lv_frequency_4_0= RULE_INT )
            {
            // InternalMarsRover.g:908:4: (lv_frequency_4_0= RULE_INT )
            // InternalMarsRover.g:909:5: lv_frequency_4_0= RULE_INT
            {
            lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_frequency_4_0, grammarAccess.getSoundAccess().getFrequencyINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"frequency",
            						lv_frequency_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulesound"


    // $ANTLR start "entryRulemessage"
    // InternalMarsRover.g:929:1: entryRulemessage returns [EObject current=null] : iv_rulemessage= rulemessage EOF ;
    public final EObject entryRulemessage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemessage = null;


        try {
            // InternalMarsRover.g:929:48: (iv_rulemessage= rulemessage EOF )
            // InternalMarsRover.g:930:2: iv_rulemessage= rulemessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemessage=rulemessage();

            state._fsp--;

             current =iv_rulemessage; 
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
    // $ANTLR end "entryRulemessage"


    // $ANTLR start "rulemessage"
    // InternalMarsRover.g:936:1: rulemessage returns [EObject current=null] : ( ( (lv_name_0_0= 'message' ) ) ( (lv_msg_1_0= RULE_STRING ) ) ) ;
    public final EObject rulemessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_msg_1_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:942:2: ( ( ( (lv_name_0_0= 'message' ) ) ( (lv_msg_1_0= RULE_STRING ) ) ) )
            // InternalMarsRover.g:943:2: ( ( (lv_name_0_0= 'message' ) ) ( (lv_msg_1_0= RULE_STRING ) ) )
            {
            // InternalMarsRover.g:943:2: ( ( (lv_name_0_0= 'message' ) ) ( (lv_msg_1_0= RULE_STRING ) ) )
            // InternalMarsRover.g:944:3: ( (lv_name_0_0= 'message' ) ) ( (lv_msg_1_0= RULE_STRING ) )
            {
            // InternalMarsRover.g:944:3: ( (lv_name_0_0= 'message' ) )
            // InternalMarsRover.g:945:4: (lv_name_0_0= 'message' )
            {
            // InternalMarsRover.g:945:4: (lv_name_0_0= 'message' )
            // InternalMarsRover.g:946:5: lv_name_0_0= 'message'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMessageAccess().getNameMessageKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "message");
            				

            }


            }

            // InternalMarsRover.g:958:3: ( (lv_msg_1_0= RULE_STRING ) )
            // InternalMarsRover.g:959:4: (lv_msg_1_0= RULE_STRING )
            {
            // InternalMarsRover.g:959:4: (lv_msg_1_0= RULE_STRING )
            // InternalMarsRover.g:960:5: lv_msg_1_0= RULE_STRING
            {
            lv_msg_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_msg_1_0, grammarAccess.getMessageAccess().getMsgSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"msg",
            						lv_msg_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "rulemessage"


    // $ANTLR start "entryRulecolor_indication"
    // InternalMarsRover.g:980:1: entryRulecolor_indication returns [EObject current=null] : iv_rulecolor_indication= rulecolor_indication EOF ;
    public final EObject entryRulecolor_indication() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolor_indication = null;


        try {
            // InternalMarsRover.g:980:57: (iv_rulecolor_indication= rulecolor_indication EOF )
            // InternalMarsRover.g:981:2: iv_rulecolor_indication= rulecolor_indication EOF
            {
             newCompositeNode(grammarAccess.getColor_indicationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolor_indication=rulecolor_indication();

            state._fsp--;

             current =iv_rulecolor_indication; 
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
    // $ANTLR end "entryRulecolor_indication"


    // $ANTLR start "rulecolor_indication"
    // InternalMarsRover.g:987:1: rulecolor_indication returns [EObject current=null] : ( ( (lv_name_0_0= 'color_indication' ) ) otherlv_1= 'with_color' ( (lv_color_2_0= ruleLED_Color ) ) ) ;
    public final EObject rulecolor_indication() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_color_2_0 = null;



        	enterRule();

        try {
            // InternalMarsRover.g:993:2: ( ( ( (lv_name_0_0= 'color_indication' ) ) otherlv_1= 'with_color' ( (lv_color_2_0= ruleLED_Color ) ) ) )
            // InternalMarsRover.g:994:2: ( ( (lv_name_0_0= 'color_indication' ) ) otherlv_1= 'with_color' ( (lv_color_2_0= ruleLED_Color ) ) )
            {
            // InternalMarsRover.g:994:2: ( ( (lv_name_0_0= 'color_indication' ) ) otherlv_1= 'with_color' ( (lv_color_2_0= ruleLED_Color ) ) )
            // InternalMarsRover.g:995:3: ( (lv_name_0_0= 'color_indication' ) ) otherlv_1= 'with_color' ( (lv_color_2_0= ruleLED_Color ) )
            {
            // InternalMarsRover.g:995:3: ( (lv_name_0_0= 'color_indication' ) )
            // InternalMarsRover.g:996:4: (lv_name_0_0= 'color_indication' )
            {
            // InternalMarsRover.g:996:4: (lv_name_0_0= 'color_indication' )
            // InternalMarsRover.g:997:5: lv_name_0_0= 'color_indication'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColor_indicationAccess().getNameColor_indicationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColor_indicationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "color_indication");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getColor_indicationAccess().getWith_colorKeyword_1());
            		
            // InternalMarsRover.g:1013:3: ( (lv_color_2_0= ruleLED_Color ) )
            // InternalMarsRover.g:1014:4: (lv_color_2_0= ruleLED_Color )
            {
            // InternalMarsRover.g:1014:4: (lv_color_2_0= ruleLED_Color )
            // InternalMarsRover.g:1015:5: lv_color_2_0= ruleLED_Color
            {

            					newCompositeNode(grammarAccess.getColor_indicationAccess().getColorLED_ColorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_2_0=ruleLED_Color();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColor_indicationRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.robotFinal.MarsRover.LED_Color");
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
    // $ANTLR end "rulecolor_indication"


    // $ANTLR start "entryRuleavoid_lakes"
    // InternalMarsRover.g:1036:1: entryRuleavoid_lakes returns [EObject current=null] : iv_ruleavoid_lakes= ruleavoid_lakes EOF ;
    public final EObject entryRuleavoid_lakes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleavoid_lakes = null;


        try {
            // InternalMarsRover.g:1036:52: (iv_ruleavoid_lakes= ruleavoid_lakes EOF )
            // InternalMarsRover.g:1037:2: iv_ruleavoid_lakes= ruleavoid_lakes EOF
            {
             newCompositeNode(grammarAccess.getAvoid_lakesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleavoid_lakes=ruleavoid_lakes();

            state._fsp--;

             current =iv_ruleavoid_lakes; 
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
    // $ANTLR end "entryRuleavoid_lakes"


    // $ANTLR start "ruleavoid_lakes"
    // InternalMarsRover.g:1043:1: ruleavoid_lakes returns [EObject current=null] : ( (lv_name_0_0= 'avoid_lakes' ) ) ;
    public final EObject ruleavoid_lakes() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMarsRover.g:1049:2: ( ( (lv_name_0_0= 'avoid_lakes' ) ) )
            // InternalMarsRover.g:1050:2: ( (lv_name_0_0= 'avoid_lakes' ) )
            {
            // InternalMarsRover.g:1050:2: ( (lv_name_0_0= 'avoid_lakes' ) )
            // InternalMarsRover.g:1051:3: (lv_name_0_0= 'avoid_lakes' )
            {
            // InternalMarsRover.g:1051:3: (lv_name_0_0= 'avoid_lakes' )
            // InternalMarsRover.g:1052:4: lv_name_0_0= 'avoid_lakes'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAvoid_lakesAccess().getNameAvoid_lakesKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAvoid_lakesRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "avoid_lakes");
            			

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
    // $ANTLR end "ruleavoid_lakes"


    // $ANTLR start "ruleColor"
    // InternalMarsRover.g:1067:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'orange' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'black' ) | (enumLiteral_6= 'off' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMarsRover.g:1073:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'orange' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'black' ) | (enumLiteral_6= 'off' ) ) )
            // InternalMarsRover.g:1074:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'orange' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'black' ) | (enumLiteral_6= 'off' ) )
            {
            // InternalMarsRover.g:1074:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'orange' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'black' ) | (enumLiteral_6= 'off' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case 43:
                {
                alt11=3;
                }
                break;
            case 44:
                {
                alt11=4;
                }
                break;
            case 45:
                {
                alt11=5;
                }
                break;
            case 46:
                {
                alt11=6;
                }
                break;
            case 47:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMarsRover.g:1075:3: (enumLiteral_0= 'red' )
                    {
                    // InternalMarsRover.g:1075:3: (enumLiteral_0= 'red' )
                    // InternalMarsRover.g:1076:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_REDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getCOLOR_REDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:1083:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalMarsRover.g:1083:3: (enumLiteral_1= 'blue' )
                    // InternalMarsRover.g:1084:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_BLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getCOLOR_BLUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:1091:3: (enumLiteral_2= 'green' )
                    {
                    // InternalMarsRover.g:1091:3: (enumLiteral_2= 'green' )
                    // InternalMarsRover.g:1092:4: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_GREENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getCOLOR_GREENEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:1099:3: (enumLiteral_3= 'orange' )
                    {
                    // InternalMarsRover.g:1099:3: (enumLiteral_3= 'orange' )
                    // InternalMarsRover.g:1100:4: enumLiteral_3= 'orange'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_ORANGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getCOLOR_ORANGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMarsRover.g:1107:3: (enumLiteral_4= 'white' )
                    {
                    // InternalMarsRover.g:1107:3: (enumLiteral_4= 'white' )
                    // InternalMarsRover.g:1108:4: enumLiteral_4= 'white'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_WHITEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCOLOR_WHITEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMarsRover.g:1115:3: (enumLiteral_5= 'black' )
                    {
                    // InternalMarsRover.g:1115:3: (enumLiteral_5= 'black' )
                    // InternalMarsRover.g:1116:4: enumLiteral_5= 'black'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_BLACKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getCOLOR_BLACKEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMarsRover.g:1123:3: (enumLiteral_6= 'off' )
                    {
                    // InternalMarsRover.g:1123:3: (enumLiteral_6= 'off' )
                    // InternalMarsRover.g:1124:4: enumLiteral_6= 'off'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getCOLOR_OFFEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getCOLOR_OFFEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleLED_Color"
    // InternalMarsRover.g:1134:1: ruleLED_Color returns [Enumerator current=null] : ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'off' ) ) ;
    public final Enumerator ruleLED_Color() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMarsRover.g:1140:2: ( ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'off' ) ) )
            // InternalMarsRover.g:1141:2: ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'off' ) )
            {
            // InternalMarsRover.g:1141:2: ( (enumLiteral_0= 'orange' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'off' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            case 47:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMarsRover.g:1142:3: (enumLiteral_0= 'orange' )
                    {
                    // InternalMarsRover.g:1142:3: (enumLiteral_0= 'orange' )
                    // InternalMarsRover.g:1143:4: enumLiteral_0= 'orange'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLED_ColorAccess().getLED_ORANGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLED_ColorAccess().getLED_ORANGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:1150:3: (enumLiteral_1= 'red' )
                    {
                    // InternalMarsRover.g:1150:3: (enumLiteral_1= 'red' )
                    // InternalMarsRover.g:1151:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLED_ColorAccess().getLED_REDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLED_ColorAccess().getLED_REDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:1158:3: (enumLiteral_2= 'green' )
                    {
                    // InternalMarsRover.g:1158:3: (enumLiteral_2= 'green' )
                    // InternalMarsRover.g:1159:4: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getLED_ColorAccess().getLED_GREENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLED_ColorAccess().getLED_GREENEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:1166:3: (enumLiteral_3= 'off' )
                    {
                    // InternalMarsRover.g:1166:3: (enumLiteral_3= 'off' )
                    // InternalMarsRover.g:1167:4: enumLiteral_3= 'off'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLED_ColorAccess().getLED_OFFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLED_ColorAccess().getLED_OFFEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleLED_Color"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010028840000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000FE0004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006400000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00009A0000000000L});

}