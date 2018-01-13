package org.xtext.robotFinal.ide.contentassist.antlr.internal;

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
import org.xtext.robotFinal.services.MarsRoverGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarsRoverParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stop'", "'continue'", "'red'", "'blue'", "'green'", "'orange'", "'white'", "'black'", "'off'", "'Robot'", "'slave_address'", "'drive_speed'", "'special_speed'", "'missions'", "'mission'", "'type'", "'sensors'", "'distance'", "'number_of_lakes'", "'lakes_colors'", "'after_examinating'", "'number_of_rocks'", "'indicate'", "'duration'", "'frequency'", "'with_color'", "'avoid_obstacles'", "'ultra'", "'bumpers'", "'detect_lakes'", "'detect_rocks'", "'push_obstacles'", "'with'", "'sound'", "'message'", "'color_indication'", "'avoid_lakes'"
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

    	public void setGrammarAccess(MarsRoverGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRobot"
    // InternalMarsRover.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMarsRover.g:54:1: ( ruleRobot EOF )
            // InternalMarsRover.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMarsRover.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMarsRover.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMarsRover.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalMarsRover.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMarsRover.g:69:3: ( rule__Robot__Group__0 )
            // InternalMarsRover.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRulemission"
    // InternalMarsRover.g:78:1: entryRulemission : rulemission EOF ;
    public final void entryRulemission() throws RecognitionException {
        try {
            // InternalMarsRover.g:79:1: ( rulemission EOF )
            // InternalMarsRover.g:80:1: rulemission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            rulemission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
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
    // $ANTLR end "entryRulemission"


    // $ANTLR start "rulemission"
    // InternalMarsRover.g:87:1: rulemission : ( ( rule__Mission__Group__0 ) ) ;
    public final void rulemission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:91:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMarsRover.g:92:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMarsRover.g:92:2: ( ( rule__Mission__Group__0 ) )
            // InternalMarsRover.g:93:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMarsRover.g:94:3: ( rule__Mission__Group__0 )
            // InternalMarsRover.g:94:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemission"


    // $ANTLR start "entryRuleavoid_obstacles"
    // InternalMarsRover.g:103:1: entryRuleavoid_obstacles : ruleavoid_obstacles EOF ;
    public final void entryRuleavoid_obstacles() throws RecognitionException {
        try {
            // InternalMarsRover.g:104:1: ( ruleavoid_obstacles EOF )
            // InternalMarsRover.g:105:1: ruleavoid_obstacles EOF
            {
             before(grammarAccess.getAvoid_obstaclesRule()); 
            pushFollow(FOLLOW_1);
            ruleavoid_obstacles();

            state._fsp--;

             after(grammarAccess.getAvoid_obstaclesRule()); 
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
    // $ANTLR end "entryRuleavoid_obstacles"


    // $ANTLR start "ruleavoid_obstacles"
    // InternalMarsRover.g:112:1: ruleavoid_obstacles : ( ( rule__Avoid_obstacles__Group__0 ) ) ;
    public final void ruleavoid_obstacles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:116:2: ( ( ( rule__Avoid_obstacles__Group__0 ) ) )
            // InternalMarsRover.g:117:2: ( ( rule__Avoid_obstacles__Group__0 ) )
            {
            // InternalMarsRover.g:117:2: ( ( rule__Avoid_obstacles__Group__0 ) )
            // InternalMarsRover.g:118:3: ( rule__Avoid_obstacles__Group__0 )
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getGroup()); 
            // InternalMarsRover.g:119:3: ( rule__Avoid_obstacles__Group__0 )
            // InternalMarsRover.g:119:4: rule__Avoid_obstacles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvoid_obstaclesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleavoid_obstacles"


    // $ANTLR start "entryRuleultra"
    // InternalMarsRover.g:128:1: entryRuleultra : ruleultra EOF ;
    public final void entryRuleultra() throws RecognitionException {
        try {
            // InternalMarsRover.g:129:1: ( ruleultra EOF )
            // InternalMarsRover.g:130:1: ruleultra EOF
            {
             before(grammarAccess.getUltraRule()); 
            pushFollow(FOLLOW_1);
            ruleultra();

            state._fsp--;

             after(grammarAccess.getUltraRule()); 
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
    // $ANTLR end "entryRuleultra"


    // $ANTLR start "ruleultra"
    // InternalMarsRover.g:137:1: ruleultra : ( ( rule__Ultra__Group__0 ) ) ;
    public final void ruleultra() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:141:2: ( ( ( rule__Ultra__Group__0 ) ) )
            // InternalMarsRover.g:142:2: ( ( rule__Ultra__Group__0 ) )
            {
            // InternalMarsRover.g:142:2: ( ( rule__Ultra__Group__0 ) )
            // InternalMarsRover.g:143:3: ( rule__Ultra__Group__0 )
            {
             before(grammarAccess.getUltraAccess().getGroup()); 
            // InternalMarsRover.g:144:3: ( rule__Ultra__Group__0 )
            // InternalMarsRover.g:144:4: rule__Ultra__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ultra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUltraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleultra"


    // $ANTLR start "entryRulebumpers"
    // InternalMarsRover.g:153:1: entryRulebumpers : rulebumpers EOF ;
    public final void entryRulebumpers() throws RecognitionException {
        try {
            // InternalMarsRover.g:154:1: ( rulebumpers EOF )
            // InternalMarsRover.g:155:1: rulebumpers EOF
            {
             before(grammarAccess.getBumpersRule()); 
            pushFollow(FOLLOW_1);
            rulebumpers();

            state._fsp--;

             after(grammarAccess.getBumpersRule()); 
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
    // $ANTLR end "entryRulebumpers"


    // $ANTLR start "rulebumpers"
    // InternalMarsRover.g:162:1: rulebumpers : ( ( rule__Bumpers__NameAssignment ) ) ;
    public final void rulebumpers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:166:2: ( ( ( rule__Bumpers__NameAssignment ) ) )
            // InternalMarsRover.g:167:2: ( ( rule__Bumpers__NameAssignment ) )
            {
            // InternalMarsRover.g:167:2: ( ( rule__Bumpers__NameAssignment ) )
            // InternalMarsRover.g:168:3: ( rule__Bumpers__NameAssignment )
            {
             before(grammarAccess.getBumpersAccess().getNameAssignment()); 
            // InternalMarsRover.g:169:3: ( rule__Bumpers__NameAssignment )
            // InternalMarsRover.g:169:4: rule__Bumpers__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Bumpers__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBumpersAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebumpers"


    // $ANTLR start "entryRuledetect_lakes"
    // InternalMarsRover.g:178:1: entryRuledetect_lakes : ruledetect_lakes EOF ;
    public final void entryRuledetect_lakes() throws RecognitionException {
        try {
            // InternalMarsRover.g:179:1: ( ruledetect_lakes EOF )
            // InternalMarsRover.g:180:1: ruledetect_lakes EOF
            {
             before(grammarAccess.getDetect_lakesRule()); 
            pushFollow(FOLLOW_1);
            ruledetect_lakes();

            state._fsp--;

             after(grammarAccess.getDetect_lakesRule()); 
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
    // $ANTLR end "entryRuledetect_lakes"


    // $ANTLR start "ruledetect_lakes"
    // InternalMarsRover.g:187:1: ruledetect_lakes : ( ( rule__Detect_lakes__Group__0 ) ) ;
    public final void ruledetect_lakes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:191:2: ( ( ( rule__Detect_lakes__Group__0 ) ) )
            // InternalMarsRover.g:192:2: ( ( rule__Detect_lakes__Group__0 ) )
            {
            // InternalMarsRover.g:192:2: ( ( rule__Detect_lakes__Group__0 ) )
            // InternalMarsRover.g:193:3: ( rule__Detect_lakes__Group__0 )
            {
             before(grammarAccess.getDetect_lakesAccess().getGroup()); 
            // InternalMarsRover.g:194:3: ( rule__Detect_lakes__Group__0 )
            // InternalMarsRover.g:194:4: rule__Detect_lakes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetect_lakesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledetect_lakes"


    // $ANTLR start "entryRuledetect_rocks"
    // InternalMarsRover.g:203:1: entryRuledetect_rocks : ruledetect_rocks EOF ;
    public final void entryRuledetect_rocks() throws RecognitionException {
        try {
            // InternalMarsRover.g:204:1: ( ruledetect_rocks EOF )
            // InternalMarsRover.g:205:1: ruledetect_rocks EOF
            {
             before(grammarAccess.getDetect_rocksRule()); 
            pushFollow(FOLLOW_1);
            ruledetect_rocks();

            state._fsp--;

             after(grammarAccess.getDetect_rocksRule()); 
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
    // $ANTLR end "entryRuledetect_rocks"


    // $ANTLR start "ruledetect_rocks"
    // InternalMarsRover.g:212:1: ruledetect_rocks : ( ( rule__Detect_rocks__Group__0 ) ) ;
    public final void ruledetect_rocks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:216:2: ( ( ( rule__Detect_rocks__Group__0 ) ) )
            // InternalMarsRover.g:217:2: ( ( rule__Detect_rocks__Group__0 ) )
            {
            // InternalMarsRover.g:217:2: ( ( rule__Detect_rocks__Group__0 ) )
            // InternalMarsRover.g:218:3: ( rule__Detect_rocks__Group__0 )
            {
             before(grammarAccess.getDetect_rocksAccess().getGroup()); 
            // InternalMarsRover.g:219:3: ( rule__Detect_rocks__Group__0 )
            // InternalMarsRover.g:219:4: rule__Detect_rocks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetect_rocksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledetect_rocks"


    // $ANTLR start "entryRulepush_obstacles"
    // InternalMarsRover.g:228:1: entryRulepush_obstacles : rulepush_obstacles EOF ;
    public final void entryRulepush_obstacles() throws RecognitionException {
        try {
            // InternalMarsRover.g:229:1: ( rulepush_obstacles EOF )
            // InternalMarsRover.g:230:1: rulepush_obstacles EOF
            {
             before(grammarAccess.getPush_obstaclesRule()); 
            pushFollow(FOLLOW_1);
            rulepush_obstacles();

            state._fsp--;

             after(grammarAccess.getPush_obstaclesRule()); 
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
    // $ANTLR end "entryRulepush_obstacles"


    // $ANTLR start "rulepush_obstacles"
    // InternalMarsRover.g:237:1: rulepush_obstacles : ( ( rule__Push_obstacles__NameAssignment ) ) ;
    public final void rulepush_obstacles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:241:2: ( ( ( rule__Push_obstacles__NameAssignment ) ) )
            // InternalMarsRover.g:242:2: ( ( rule__Push_obstacles__NameAssignment ) )
            {
            // InternalMarsRover.g:242:2: ( ( rule__Push_obstacles__NameAssignment ) )
            // InternalMarsRover.g:243:3: ( rule__Push_obstacles__NameAssignment )
            {
             before(grammarAccess.getPush_obstaclesAccess().getNameAssignment()); 
            // InternalMarsRover.g:244:3: ( rule__Push_obstacles__NameAssignment )
            // InternalMarsRover.g:244:4: rule__Push_obstacles__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Push_obstacles__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPush_obstaclesAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepush_obstacles"


    // $ANTLR start "entryRuleafter_action"
    // InternalMarsRover.g:253:1: entryRuleafter_action : ruleafter_action EOF ;
    public final void entryRuleafter_action() throws RecognitionException {
        try {
            // InternalMarsRover.g:254:1: ( ruleafter_action EOF )
            // InternalMarsRover.g:255:1: ruleafter_action EOF
            {
             before(grammarAccess.getAfter_actionRule()); 
            pushFollow(FOLLOW_1);
            ruleafter_action();

            state._fsp--;

             after(grammarAccess.getAfter_actionRule()); 
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
    // $ANTLR end "entryRuleafter_action"


    // $ANTLR start "ruleafter_action"
    // InternalMarsRover.g:262:1: ruleafter_action : ( ( rule__After_action__Group__0 ) ) ;
    public final void ruleafter_action() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:266:2: ( ( ( rule__After_action__Group__0 ) ) )
            // InternalMarsRover.g:267:2: ( ( rule__After_action__Group__0 ) )
            {
            // InternalMarsRover.g:267:2: ( ( rule__After_action__Group__0 ) )
            // InternalMarsRover.g:268:3: ( rule__After_action__Group__0 )
            {
             before(grammarAccess.getAfter_actionAccess().getGroup()); 
            // InternalMarsRover.g:269:3: ( rule__After_action__Group__0 )
            // InternalMarsRover.g:269:4: rule__After_action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__After_action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfter_actionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleafter_action"


    // $ANTLR start "entryRuleindication"
    // InternalMarsRover.g:278:1: entryRuleindication : ruleindication EOF ;
    public final void entryRuleindication() throws RecognitionException {
        try {
            // InternalMarsRover.g:279:1: ( ruleindication EOF )
            // InternalMarsRover.g:280:1: ruleindication EOF
            {
             before(grammarAccess.getIndicationRule()); 
            pushFollow(FOLLOW_1);
            ruleindication();

            state._fsp--;

             after(grammarAccess.getIndicationRule()); 
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
    // $ANTLR end "entryRuleindication"


    // $ANTLR start "ruleindication"
    // InternalMarsRover.g:287:1: ruleindication : ( ( rule__Indication__Group__0 ) ) ;
    public final void ruleindication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:291:2: ( ( ( rule__Indication__Group__0 ) ) )
            // InternalMarsRover.g:292:2: ( ( rule__Indication__Group__0 ) )
            {
            // InternalMarsRover.g:292:2: ( ( rule__Indication__Group__0 ) )
            // InternalMarsRover.g:293:3: ( rule__Indication__Group__0 )
            {
             before(grammarAccess.getIndicationAccess().getGroup()); 
            // InternalMarsRover.g:294:3: ( rule__Indication__Group__0 )
            // InternalMarsRover.g:294:4: rule__Indication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Indication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleindication"


    // $ANTLR start "entryRulesound"
    // InternalMarsRover.g:303:1: entryRulesound : rulesound EOF ;
    public final void entryRulesound() throws RecognitionException {
        try {
            // InternalMarsRover.g:304:1: ( rulesound EOF )
            // InternalMarsRover.g:305:1: rulesound EOF
            {
             before(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            rulesound();

            state._fsp--;

             after(grammarAccess.getSoundRule()); 
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
    // $ANTLR end "entryRulesound"


    // $ANTLR start "rulesound"
    // InternalMarsRover.g:312:1: rulesound : ( ( rule__Sound__Group__0 ) ) ;
    public final void rulesound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:316:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalMarsRover.g:317:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalMarsRover.g:317:2: ( ( rule__Sound__Group__0 ) )
            // InternalMarsRover.g:318:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalMarsRover.g:319:3: ( rule__Sound__Group__0 )
            // InternalMarsRover.g:319:4: rule__Sound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesound"


    // $ANTLR start "entryRulemessage"
    // InternalMarsRover.g:328:1: entryRulemessage : rulemessage EOF ;
    public final void entryRulemessage() throws RecognitionException {
        try {
            // InternalMarsRover.g:329:1: ( rulemessage EOF )
            // InternalMarsRover.g:330:1: rulemessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            rulemessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRulemessage"


    // $ANTLR start "rulemessage"
    // InternalMarsRover.g:337:1: rulemessage : ( ( rule__Message__Group__0 ) ) ;
    public final void rulemessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:341:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalMarsRover.g:342:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalMarsRover.g:342:2: ( ( rule__Message__Group__0 ) )
            // InternalMarsRover.g:343:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalMarsRover.g:344:3: ( rule__Message__Group__0 )
            // InternalMarsRover.g:344:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemessage"


    // $ANTLR start "entryRulecolor_indication"
    // InternalMarsRover.g:353:1: entryRulecolor_indication : rulecolor_indication EOF ;
    public final void entryRulecolor_indication() throws RecognitionException {
        try {
            // InternalMarsRover.g:354:1: ( rulecolor_indication EOF )
            // InternalMarsRover.g:355:1: rulecolor_indication EOF
            {
             before(grammarAccess.getColor_indicationRule()); 
            pushFollow(FOLLOW_1);
            rulecolor_indication();

            state._fsp--;

             after(grammarAccess.getColor_indicationRule()); 
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
    // $ANTLR end "entryRulecolor_indication"


    // $ANTLR start "rulecolor_indication"
    // InternalMarsRover.g:362:1: rulecolor_indication : ( ( rule__Color_indication__Group__0 ) ) ;
    public final void rulecolor_indication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:366:2: ( ( ( rule__Color_indication__Group__0 ) ) )
            // InternalMarsRover.g:367:2: ( ( rule__Color_indication__Group__0 ) )
            {
            // InternalMarsRover.g:367:2: ( ( rule__Color_indication__Group__0 ) )
            // InternalMarsRover.g:368:3: ( rule__Color_indication__Group__0 )
            {
             before(grammarAccess.getColor_indicationAccess().getGroup()); 
            // InternalMarsRover.g:369:3: ( rule__Color_indication__Group__0 )
            // InternalMarsRover.g:369:4: rule__Color_indication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color_indication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColor_indicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecolor_indication"


    // $ANTLR start "entryRuleavoid_lakes"
    // InternalMarsRover.g:378:1: entryRuleavoid_lakes : ruleavoid_lakes EOF ;
    public final void entryRuleavoid_lakes() throws RecognitionException {
        try {
            // InternalMarsRover.g:379:1: ( ruleavoid_lakes EOF )
            // InternalMarsRover.g:380:1: ruleavoid_lakes EOF
            {
             before(grammarAccess.getAvoid_lakesRule()); 
            pushFollow(FOLLOW_1);
            ruleavoid_lakes();

            state._fsp--;

             after(grammarAccess.getAvoid_lakesRule()); 
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
    // $ANTLR end "entryRuleavoid_lakes"


    // $ANTLR start "ruleavoid_lakes"
    // InternalMarsRover.g:387:1: ruleavoid_lakes : ( ( rule__Avoid_lakes__NameAssignment ) ) ;
    public final void ruleavoid_lakes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:391:2: ( ( ( rule__Avoid_lakes__NameAssignment ) ) )
            // InternalMarsRover.g:392:2: ( ( rule__Avoid_lakes__NameAssignment ) )
            {
            // InternalMarsRover.g:392:2: ( ( rule__Avoid_lakes__NameAssignment ) )
            // InternalMarsRover.g:393:3: ( rule__Avoid_lakes__NameAssignment )
            {
             before(grammarAccess.getAvoid_lakesAccess().getNameAssignment()); 
            // InternalMarsRover.g:394:3: ( rule__Avoid_lakes__NameAssignment )
            // InternalMarsRover.g:394:4: rule__Avoid_lakes__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Avoid_lakes__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAvoid_lakesAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleavoid_lakes"


    // $ANTLR start "ruleColor"
    // InternalMarsRover.g:403:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:407:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalMarsRover.g:408:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalMarsRover.g:408:2: ( ( rule__Color__Alternatives ) )
            // InternalMarsRover.g:409:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalMarsRover.g:410:3: ( rule__Color__Alternatives )
            // InternalMarsRover.g:410:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleLED_Color"
    // InternalMarsRover.g:419:1: ruleLED_Color : ( ( rule__LED_Color__Alternatives ) ) ;
    public final void ruleLED_Color() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:423:1: ( ( ( rule__LED_Color__Alternatives ) ) )
            // InternalMarsRover.g:424:2: ( ( rule__LED_Color__Alternatives ) )
            {
            // InternalMarsRover.g:424:2: ( ( rule__LED_Color__Alternatives ) )
            // InternalMarsRover.g:425:3: ( rule__LED_Color__Alternatives )
            {
             before(grammarAccess.getLED_ColorAccess().getAlternatives()); 
            // InternalMarsRover.g:426:3: ( rule__LED_Color__Alternatives )
            // InternalMarsRover.g:426:4: rule__LED_Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LED_Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLED_ColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLED_Color"


    // $ANTLR start "rule__Mission__TypeAlternatives_3_0"
    // InternalMarsRover.g:434:1: rule__Mission__TypeAlternatives_3_0 : ( ( ruleavoid_obstacles ) | ( ruledetect_lakes ) | ( ruleavoid_lakes ) | ( rulepush_obstacles ) | ( ruledetect_rocks ) );
    public final void rule__Mission__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:438:1: ( ( ruleavoid_obstacles ) | ( ruledetect_lakes ) | ( ruleavoid_lakes ) | ( rulepush_obstacles ) | ( ruledetect_rocks ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 42:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMarsRover.g:439:2: ( ruleavoid_obstacles )
                    {
                    // InternalMarsRover.g:439:2: ( ruleavoid_obstacles )
                    // InternalMarsRover.g:440:3: ruleavoid_obstacles
                    {
                     before(grammarAccess.getMissionAccess().getTypeAvoid_obstaclesParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleavoid_obstacles();

                    state._fsp--;

                     after(grammarAccess.getMissionAccess().getTypeAvoid_obstaclesParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:445:2: ( ruledetect_lakes )
                    {
                    // InternalMarsRover.g:445:2: ( ruledetect_lakes )
                    // InternalMarsRover.g:446:3: ruledetect_lakes
                    {
                     before(grammarAccess.getMissionAccess().getTypeDetect_lakesParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruledetect_lakes();

                    state._fsp--;

                     after(grammarAccess.getMissionAccess().getTypeDetect_lakesParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:451:2: ( ruleavoid_lakes )
                    {
                    // InternalMarsRover.g:451:2: ( ruleavoid_lakes )
                    // InternalMarsRover.g:452:3: ruleavoid_lakes
                    {
                     before(grammarAccess.getMissionAccess().getTypeAvoid_lakesParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleavoid_lakes();

                    state._fsp--;

                     after(grammarAccess.getMissionAccess().getTypeAvoid_lakesParserRuleCall_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:457:2: ( rulepush_obstacles )
                    {
                    // InternalMarsRover.g:457:2: ( rulepush_obstacles )
                    // InternalMarsRover.g:458:3: rulepush_obstacles
                    {
                     before(grammarAccess.getMissionAccess().getTypePush_obstaclesParserRuleCall_3_0_3()); 
                    pushFollow(FOLLOW_2);
                    rulepush_obstacles();

                    state._fsp--;

                     after(grammarAccess.getMissionAccess().getTypePush_obstaclesParserRuleCall_3_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMarsRover.g:463:2: ( ruledetect_rocks )
                    {
                    // InternalMarsRover.g:463:2: ( ruledetect_rocks )
                    // InternalMarsRover.g:464:3: ruledetect_rocks
                    {
                     before(grammarAccess.getMissionAccess().getTypeDetect_rocksParserRuleCall_3_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruledetect_rocks();

                    state._fsp--;

                     after(grammarAccess.getMissionAccess().getTypeDetect_rocksParserRuleCall_3_0_4()); 

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
    // $ANTLR end "rule__Mission__TypeAlternatives_3_0"


    // $ANTLR start "rule__Avoid_obstacles__SensorsAlternatives_2_0"
    // InternalMarsRover.g:473:1: rule__Avoid_obstacles__SensorsAlternatives_2_0 : ( ( ruleultra ) | ( rulebumpers ) );
    public final void rule__Avoid_obstacles__SensorsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:477:1: ( ( ruleultra ) | ( rulebumpers ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMarsRover.g:478:2: ( ruleultra )
                    {
                    // InternalMarsRover.g:478:2: ( ruleultra )
                    // InternalMarsRover.g:479:3: ruleultra
                    {
                     before(grammarAccess.getAvoid_obstaclesAccess().getSensorsUltraParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleultra();

                    state._fsp--;

                     after(grammarAccess.getAvoid_obstaclesAccess().getSensorsUltraParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:484:2: ( rulebumpers )
                    {
                    // InternalMarsRover.g:484:2: ( rulebumpers )
                    // InternalMarsRover.g:485:3: rulebumpers
                    {
                     before(grammarAccess.getAvoid_obstaclesAccess().getSensorsBumpersParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulebumpers();

                    state._fsp--;

                     after(grammarAccess.getAvoid_obstaclesAccess().getSensorsBumpersParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Avoid_obstacles__SensorsAlternatives_2_0"


    // $ANTLR start "rule__After_action__ActionAlternatives_0_0"
    // InternalMarsRover.g:494:1: rule__After_action__ActionAlternatives_0_0 : ( ( 'stop' ) | ( 'continue' ) );
    public final void rule__After_action__ActionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:498:1: ( ( 'stop' ) | ( 'continue' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMarsRover.g:499:2: ( 'stop' )
                    {
                    // InternalMarsRover.g:499:2: ( 'stop' )
                    // InternalMarsRover.g:500:3: 'stop'
                    {
                     before(grammarAccess.getAfter_actionAccess().getActionStopKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAfter_actionAccess().getActionStopKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:505:2: ( 'continue' )
                    {
                    // InternalMarsRover.g:505:2: ( 'continue' )
                    // InternalMarsRover.g:506:3: 'continue'
                    {
                     before(grammarAccess.getAfter_actionAccess().getActionContinueKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAfter_actionAccess().getActionContinueKeyword_0_0_1()); 

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
    // $ANTLR end "rule__After_action__ActionAlternatives_0_0"


    // $ANTLR start "rule__Indication__TypeAlternatives_1_0"
    // InternalMarsRover.g:515:1: rule__Indication__TypeAlternatives_1_0 : ( ( rulesound ) | ( rulemessage ) | ( rulecolor_indication ) );
    public final void rule__Indication__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:519:1: ( ( rulesound ) | ( rulemessage ) | ( rulecolor_indication ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 45:
                {
                alt4=2;
                }
                break;
            case 46:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMarsRover.g:520:2: ( rulesound )
                    {
                    // InternalMarsRover.g:520:2: ( rulesound )
                    // InternalMarsRover.g:521:3: rulesound
                    {
                     before(grammarAccess.getIndicationAccess().getTypeSoundParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulesound();

                    state._fsp--;

                     after(grammarAccess.getIndicationAccess().getTypeSoundParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:526:2: ( rulemessage )
                    {
                    // InternalMarsRover.g:526:2: ( rulemessage )
                    // InternalMarsRover.g:527:3: rulemessage
                    {
                     before(grammarAccess.getIndicationAccess().getTypeMessageParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulemessage();

                    state._fsp--;

                     after(grammarAccess.getIndicationAccess().getTypeMessageParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:532:2: ( rulecolor_indication )
                    {
                    // InternalMarsRover.g:532:2: ( rulecolor_indication )
                    // InternalMarsRover.g:533:3: rulecolor_indication
                    {
                     before(grammarAccess.getIndicationAccess().getTypeColor_indicationParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    rulecolor_indication();

                    state._fsp--;

                     after(grammarAccess.getIndicationAccess().getTypeColor_indicationParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__Indication__TypeAlternatives_1_0"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalMarsRover.g:542:1: rule__Color__Alternatives : ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'orange' ) ) | ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'off' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:546:1: ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'orange' ) ) | ( ( 'white' ) ) | ( ( 'black' ) ) | ( ( 'off' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMarsRover.g:547:2: ( ( 'red' ) )
                    {
                    // InternalMarsRover.g:547:2: ( ( 'red' ) )
                    // InternalMarsRover.g:548:3: ( 'red' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_REDEnumLiteralDeclaration_0()); 
                    // InternalMarsRover.g:549:3: ( 'red' )
                    // InternalMarsRover.g:549:4: 'red'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_REDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:553:2: ( ( 'blue' ) )
                    {
                    // InternalMarsRover.g:553:2: ( ( 'blue' ) )
                    // InternalMarsRover.g:554:3: ( 'blue' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_BLUEEnumLiteralDeclaration_1()); 
                    // InternalMarsRover.g:555:3: ( 'blue' )
                    // InternalMarsRover.g:555:4: 'blue'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_BLUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:559:2: ( ( 'green' ) )
                    {
                    // InternalMarsRover.g:559:2: ( ( 'green' ) )
                    // InternalMarsRover.g:560:3: ( 'green' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_GREENEnumLiteralDeclaration_2()); 
                    // InternalMarsRover.g:561:3: ( 'green' )
                    // InternalMarsRover.g:561:4: 'green'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_GREENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:565:2: ( ( 'orange' ) )
                    {
                    // InternalMarsRover.g:565:2: ( ( 'orange' ) )
                    // InternalMarsRover.g:566:3: ( 'orange' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_ORANGEEnumLiteralDeclaration_3()); 
                    // InternalMarsRover.g:567:3: ( 'orange' )
                    // InternalMarsRover.g:567:4: 'orange'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_ORANGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMarsRover.g:571:2: ( ( 'white' ) )
                    {
                    // InternalMarsRover.g:571:2: ( ( 'white' ) )
                    // InternalMarsRover.g:572:3: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_WHITEEnumLiteralDeclaration_4()); 
                    // InternalMarsRover.g:573:3: ( 'white' )
                    // InternalMarsRover.g:573:4: 'white'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_WHITEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMarsRover.g:577:2: ( ( 'black' ) )
                    {
                    // InternalMarsRover.g:577:2: ( ( 'black' ) )
                    // InternalMarsRover.g:578:3: ( 'black' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_BLACKEnumLiteralDeclaration_5()); 
                    // InternalMarsRover.g:579:3: ( 'black' )
                    // InternalMarsRover.g:579:4: 'black'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_BLACKEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMarsRover.g:583:2: ( ( 'off' ) )
                    {
                    // InternalMarsRover.g:583:2: ( ( 'off' ) )
                    // InternalMarsRover.g:584:3: ( 'off' )
                    {
                     before(grammarAccess.getColorAccess().getCOLOR_OFFEnumLiteralDeclaration_6()); 
                    // InternalMarsRover.g:585:3: ( 'off' )
                    // InternalMarsRover.g:585:4: 'off'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getCOLOR_OFFEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__LED_Color__Alternatives"
    // InternalMarsRover.g:593:1: rule__LED_Color__Alternatives : ( ( ( 'orange' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'off' ) ) );
    public final void rule__LED_Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:597:1: ( ( ( 'orange' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'off' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMarsRover.g:598:2: ( ( 'orange' ) )
                    {
                    // InternalMarsRover.g:598:2: ( ( 'orange' ) )
                    // InternalMarsRover.g:599:3: ( 'orange' )
                    {
                     before(grammarAccess.getLED_ColorAccess().getLED_ORANGEEnumLiteralDeclaration_0()); 
                    // InternalMarsRover.g:600:3: ( 'orange' )
                    // InternalMarsRover.g:600:4: 'orange'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLED_ColorAccess().getLED_ORANGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarsRover.g:604:2: ( ( 'red' ) )
                    {
                    // InternalMarsRover.g:604:2: ( ( 'red' ) )
                    // InternalMarsRover.g:605:3: ( 'red' )
                    {
                     before(grammarAccess.getLED_ColorAccess().getLED_REDEnumLiteralDeclaration_1()); 
                    // InternalMarsRover.g:606:3: ( 'red' )
                    // InternalMarsRover.g:606:4: 'red'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLED_ColorAccess().getLED_REDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarsRover.g:610:2: ( ( 'green' ) )
                    {
                    // InternalMarsRover.g:610:2: ( ( 'green' ) )
                    // InternalMarsRover.g:611:3: ( 'green' )
                    {
                     before(grammarAccess.getLED_ColorAccess().getLED_GREENEnumLiteralDeclaration_2()); 
                    // InternalMarsRover.g:612:3: ( 'green' )
                    // InternalMarsRover.g:612:4: 'green'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLED_ColorAccess().getLED_GREENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMarsRover.g:616:2: ( ( 'off' ) )
                    {
                    // InternalMarsRover.g:616:2: ( ( 'off' ) )
                    // InternalMarsRover.g:617:3: ( 'off' )
                    {
                     before(grammarAccess.getLED_ColorAccess().getLED_OFFEnumLiteralDeclaration_3()); 
                    // InternalMarsRover.g:618:3: ( 'off' )
                    // InternalMarsRover.g:618:4: 'off'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLED_ColorAccess().getLED_OFFEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__LED_Color__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMarsRover.g:626:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:630:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMarsRover.g:631:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMarsRover.g:638:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:642:1: ( ( 'Robot' ) )
            // InternalMarsRover.g:643:1: ( 'Robot' )
            {
            // InternalMarsRover.g:643:1: ( 'Robot' )
            // InternalMarsRover.g:644:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMarsRover.g:653:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:657:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMarsRover.g:658:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMarsRover.g:665:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:669:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMarsRover.g:670:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMarsRover.g:670:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMarsRover.g:671:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMarsRover.g:672:2: ( rule__Robot__NameAssignment_1 )
            // InternalMarsRover.g:672:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMarsRover.g:680:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:684:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMarsRover.g:685:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMarsRover.g:692:1: rule__Robot__Group__2__Impl : ( 'slave_address' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:696:1: ( ( 'slave_address' ) )
            // InternalMarsRover.g:697:1: ( 'slave_address' )
            {
            // InternalMarsRover.g:697:1: ( 'slave_address' )
            // InternalMarsRover.g:698:2: 'slave_address'
            {
             before(grammarAccess.getRobotAccess().getSlave_addressKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getSlave_addressKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalMarsRover.g:707:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:711:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMarsRover.g:712:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalMarsRover.g:719:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__Slave_addressAssignment_3 ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:723:1: ( ( ( rule__Robot__Slave_addressAssignment_3 ) ) )
            // InternalMarsRover.g:724:1: ( ( rule__Robot__Slave_addressAssignment_3 ) )
            {
            // InternalMarsRover.g:724:1: ( ( rule__Robot__Slave_addressAssignment_3 ) )
            // InternalMarsRover.g:725:2: ( rule__Robot__Slave_addressAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getSlave_addressAssignment_3()); 
            // InternalMarsRover.g:726:2: ( rule__Robot__Slave_addressAssignment_3 )
            // InternalMarsRover.g:726:3: rule__Robot__Slave_addressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Slave_addressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getSlave_addressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalMarsRover.g:734:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:738:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalMarsRover.g:739:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalMarsRover.g:746:1: rule__Robot__Group__4__Impl : ( 'drive_speed' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:750:1: ( ( 'drive_speed' ) )
            // InternalMarsRover.g:751:1: ( 'drive_speed' )
            {
            // InternalMarsRover.g:751:1: ( 'drive_speed' )
            // InternalMarsRover.g:752:2: 'drive_speed'
            {
             before(grammarAccess.getRobotAccess().getDrive_speedKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getDrive_speedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group__5"
    // InternalMarsRover.g:761:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:765:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalMarsRover.g:766:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5"


    // $ANTLR start "rule__Robot__Group__5__Impl"
    // InternalMarsRover.g:773:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__Drive_speedAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:777:1: ( ( ( rule__Robot__Drive_speedAssignment_5 ) ) )
            // InternalMarsRover.g:778:1: ( ( rule__Robot__Drive_speedAssignment_5 ) )
            {
            // InternalMarsRover.g:778:1: ( ( rule__Robot__Drive_speedAssignment_5 ) )
            // InternalMarsRover.g:779:2: ( rule__Robot__Drive_speedAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getDrive_speedAssignment_5()); 
            // InternalMarsRover.g:780:2: ( rule__Robot__Drive_speedAssignment_5 )
            // InternalMarsRover.g:780:3: rule__Robot__Drive_speedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Drive_speedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getDrive_speedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5__Impl"


    // $ANTLR start "rule__Robot__Group__6"
    // InternalMarsRover.g:788:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:792:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalMarsRover.g:793:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6"


    // $ANTLR start "rule__Robot__Group__6__Impl"
    // InternalMarsRover.g:800:1: rule__Robot__Group__6__Impl : ( 'special_speed' ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:804:1: ( ( 'special_speed' ) )
            // InternalMarsRover.g:805:1: ( 'special_speed' )
            {
            // InternalMarsRover.g:805:1: ( 'special_speed' )
            // InternalMarsRover.g:806:2: 'special_speed'
            {
             before(grammarAccess.getRobotAccess().getSpecial_speedKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getSpecial_speedKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6__Impl"


    // $ANTLR start "rule__Robot__Group__7"
    // InternalMarsRover.g:815:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:819:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalMarsRover.g:820:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Robot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7"


    // $ANTLR start "rule__Robot__Group__7__Impl"
    // InternalMarsRover.g:827:1: rule__Robot__Group__7__Impl : ( ( rule__Robot__Special_speedAssignment_7 ) ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:831:1: ( ( ( rule__Robot__Special_speedAssignment_7 ) ) )
            // InternalMarsRover.g:832:1: ( ( rule__Robot__Special_speedAssignment_7 ) )
            {
            // InternalMarsRover.g:832:1: ( ( rule__Robot__Special_speedAssignment_7 ) )
            // InternalMarsRover.g:833:2: ( rule__Robot__Special_speedAssignment_7 )
            {
             before(grammarAccess.getRobotAccess().getSpecial_speedAssignment_7()); 
            // InternalMarsRover.g:834:2: ( rule__Robot__Special_speedAssignment_7 )
            // InternalMarsRover.g:834:3: rule__Robot__Special_speedAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Special_speedAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getSpecial_speedAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7__Impl"


    // $ANTLR start "rule__Robot__Group__8"
    // InternalMarsRover.g:842:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl rule__Robot__Group__9 ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:846:1: ( rule__Robot__Group__8__Impl rule__Robot__Group__9 )
            // InternalMarsRover.g:847:2: rule__Robot__Group__8__Impl rule__Robot__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8"


    // $ANTLR start "rule__Robot__Group__8__Impl"
    // InternalMarsRover.g:854:1: rule__Robot__Group__8__Impl : ( 'missions' ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:858:1: ( ( 'missions' ) )
            // InternalMarsRover.g:859:1: ( 'missions' )
            {
            // InternalMarsRover.g:859:1: ( 'missions' )
            // InternalMarsRover.g:860:2: 'missions'
            {
             before(grammarAccess.getRobotAccess().getMissionsKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getMissionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8__Impl"


    // $ANTLR start "rule__Robot__Group__9"
    // InternalMarsRover.g:869:1: rule__Robot__Group__9 : rule__Robot__Group__9__Impl ;
    public final void rule__Robot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:873:1: ( rule__Robot__Group__9__Impl )
            // InternalMarsRover.g:874:2: rule__Robot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9"


    // $ANTLR start "rule__Robot__Group__9__Impl"
    // InternalMarsRover.g:880:1: rule__Robot__Group__9__Impl : ( ( rule__Robot__MissionsAssignment_9 )* ) ;
    public final void rule__Robot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:884:1: ( ( ( rule__Robot__MissionsAssignment_9 )* ) )
            // InternalMarsRover.g:885:1: ( ( rule__Robot__MissionsAssignment_9 )* )
            {
            // InternalMarsRover.g:885:1: ( ( rule__Robot__MissionsAssignment_9 )* )
            // InternalMarsRover.g:886:2: ( rule__Robot__MissionsAssignment_9 )*
            {
             before(grammarAccess.getRobotAccess().getMissionsAssignment_9()); 
            // InternalMarsRover.g:887:2: ( rule__Robot__MissionsAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMarsRover.g:887:3: rule__Robot__MissionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Robot__MissionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getMissionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMarsRover.g:896:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:900:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMarsRover.g:901:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalMarsRover.g:908:1: rule__Mission__Group__0__Impl : ( 'mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:912:1: ( ( 'mission' ) )
            // InternalMarsRover.g:913:1: ( 'mission' )
            {
            // InternalMarsRover.g:913:1: ( 'mission' )
            // InternalMarsRover.g:914:2: 'mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalMarsRover.g:923:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:927:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMarsRover.g:928:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalMarsRover.g:935:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:939:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalMarsRover.g:940:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalMarsRover.g:940:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalMarsRover.g:941:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalMarsRover.g:942:2: ( rule__Mission__NameAssignment_1 )
            // InternalMarsRover.g:942:3: rule__Mission__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalMarsRover.g:950:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:954:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMarsRover.g:955:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalMarsRover.g:962:1: rule__Mission__Group__2__Impl : ( 'type' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:966:1: ( ( 'type' ) )
            // InternalMarsRover.g:967:1: ( 'type' )
            {
            // InternalMarsRover.g:967:1: ( 'type' )
            // InternalMarsRover.g:968:2: 'type'
            {
             before(grammarAccess.getMissionAccess().getTypeKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalMarsRover.g:977:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:981:1: ( rule__Mission__Group__3__Impl )
            // InternalMarsRover.g:982:2: rule__Mission__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalMarsRover.g:988:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__TypeAssignment_3 ) ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:992:1: ( ( ( rule__Mission__TypeAssignment_3 ) ) )
            // InternalMarsRover.g:993:1: ( ( rule__Mission__TypeAssignment_3 ) )
            {
            // InternalMarsRover.g:993:1: ( ( rule__Mission__TypeAssignment_3 ) )
            // InternalMarsRover.g:994:2: ( rule__Mission__TypeAssignment_3 )
            {
             before(grammarAccess.getMissionAccess().getTypeAssignment_3()); 
            // InternalMarsRover.g:995:2: ( rule__Mission__TypeAssignment_3 )
            // InternalMarsRover.g:995:3: rule__Mission__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Avoid_obstacles__Group__0"
    // InternalMarsRover.g:1004:1: rule__Avoid_obstacles__Group__0 : rule__Avoid_obstacles__Group__0__Impl rule__Avoid_obstacles__Group__1 ;
    public final void rule__Avoid_obstacles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1008:1: ( rule__Avoid_obstacles__Group__0__Impl rule__Avoid_obstacles__Group__1 )
            // InternalMarsRover.g:1009:2: rule__Avoid_obstacles__Group__0__Impl rule__Avoid_obstacles__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Avoid_obstacles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__0"


    // $ANTLR start "rule__Avoid_obstacles__Group__0__Impl"
    // InternalMarsRover.g:1016:1: rule__Avoid_obstacles__Group__0__Impl : ( ( rule__Avoid_obstacles__NameAssignment_0 ) ) ;
    public final void rule__Avoid_obstacles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1020:1: ( ( ( rule__Avoid_obstacles__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1021:1: ( ( rule__Avoid_obstacles__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1021:1: ( ( rule__Avoid_obstacles__NameAssignment_0 ) )
            // InternalMarsRover.g:1022:2: ( rule__Avoid_obstacles__NameAssignment_0 )
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1023:2: ( rule__Avoid_obstacles__NameAssignment_0 )
            // InternalMarsRover.g:1023:3: rule__Avoid_obstacles__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAvoid_obstaclesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__0__Impl"


    // $ANTLR start "rule__Avoid_obstacles__Group__1"
    // InternalMarsRover.g:1031:1: rule__Avoid_obstacles__Group__1 : rule__Avoid_obstacles__Group__1__Impl rule__Avoid_obstacles__Group__2 ;
    public final void rule__Avoid_obstacles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1035:1: ( rule__Avoid_obstacles__Group__1__Impl rule__Avoid_obstacles__Group__2 )
            // InternalMarsRover.g:1036:2: rule__Avoid_obstacles__Group__1__Impl rule__Avoid_obstacles__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Avoid_obstacles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__1"


    // $ANTLR start "rule__Avoid_obstacles__Group__1__Impl"
    // InternalMarsRover.g:1043:1: rule__Avoid_obstacles__Group__1__Impl : ( 'sensors' ) ;
    public final void rule__Avoid_obstacles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1047:1: ( ( 'sensors' ) )
            // InternalMarsRover.g:1048:1: ( 'sensors' )
            {
            // InternalMarsRover.g:1048:1: ( 'sensors' )
            // InternalMarsRover.g:1049:2: 'sensors'
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getSensorsKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAvoid_obstaclesAccess().getSensorsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__1__Impl"


    // $ANTLR start "rule__Avoid_obstacles__Group__2"
    // InternalMarsRover.g:1058:1: rule__Avoid_obstacles__Group__2 : rule__Avoid_obstacles__Group__2__Impl ;
    public final void rule__Avoid_obstacles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1062:1: ( rule__Avoid_obstacles__Group__2__Impl )
            // InternalMarsRover.g:1063:2: rule__Avoid_obstacles__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__2"


    // $ANTLR start "rule__Avoid_obstacles__Group__2__Impl"
    // InternalMarsRover.g:1069:1: rule__Avoid_obstacles__Group__2__Impl : ( ( rule__Avoid_obstacles__SensorsAssignment_2 )* ) ;
    public final void rule__Avoid_obstacles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1073:1: ( ( ( rule__Avoid_obstacles__SensorsAssignment_2 )* ) )
            // InternalMarsRover.g:1074:1: ( ( rule__Avoid_obstacles__SensorsAssignment_2 )* )
            {
            // InternalMarsRover.g:1074:1: ( ( rule__Avoid_obstacles__SensorsAssignment_2 )* )
            // InternalMarsRover.g:1075:2: ( rule__Avoid_obstacles__SensorsAssignment_2 )*
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getSensorsAssignment_2()); 
            // InternalMarsRover.g:1076:2: ( rule__Avoid_obstacles__SensorsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=38 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMarsRover.g:1076:3: rule__Avoid_obstacles__SensorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Avoid_obstacles__SensorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAvoid_obstaclesAccess().getSensorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__Group__2__Impl"


    // $ANTLR start "rule__Ultra__Group__0"
    // InternalMarsRover.g:1085:1: rule__Ultra__Group__0 : rule__Ultra__Group__0__Impl rule__Ultra__Group__1 ;
    public final void rule__Ultra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1089:1: ( rule__Ultra__Group__0__Impl rule__Ultra__Group__1 )
            // InternalMarsRover.g:1090:2: rule__Ultra__Group__0__Impl rule__Ultra__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Ultra__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ultra__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__0"


    // $ANTLR start "rule__Ultra__Group__0__Impl"
    // InternalMarsRover.g:1097:1: rule__Ultra__Group__0__Impl : ( ( rule__Ultra__NameAssignment_0 ) ) ;
    public final void rule__Ultra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1101:1: ( ( ( rule__Ultra__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1102:1: ( ( rule__Ultra__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1102:1: ( ( rule__Ultra__NameAssignment_0 ) )
            // InternalMarsRover.g:1103:2: ( rule__Ultra__NameAssignment_0 )
            {
             before(grammarAccess.getUltraAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1104:2: ( rule__Ultra__NameAssignment_0 )
            // InternalMarsRover.g:1104:3: rule__Ultra__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ultra__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUltraAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__0__Impl"


    // $ANTLR start "rule__Ultra__Group__1"
    // InternalMarsRover.g:1112:1: rule__Ultra__Group__1 : rule__Ultra__Group__1__Impl rule__Ultra__Group__2 ;
    public final void rule__Ultra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1116:1: ( rule__Ultra__Group__1__Impl rule__Ultra__Group__2 )
            // InternalMarsRover.g:1117:2: rule__Ultra__Group__1__Impl rule__Ultra__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Ultra__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ultra__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__1"


    // $ANTLR start "rule__Ultra__Group__1__Impl"
    // InternalMarsRover.g:1124:1: rule__Ultra__Group__1__Impl : ( 'distance' ) ;
    public final void rule__Ultra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1128:1: ( ( 'distance' ) )
            // InternalMarsRover.g:1129:1: ( 'distance' )
            {
            // InternalMarsRover.g:1129:1: ( 'distance' )
            // InternalMarsRover.g:1130:2: 'distance'
            {
             before(grammarAccess.getUltraAccess().getDistanceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUltraAccess().getDistanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__1__Impl"


    // $ANTLR start "rule__Ultra__Group__2"
    // InternalMarsRover.g:1139:1: rule__Ultra__Group__2 : rule__Ultra__Group__2__Impl ;
    public final void rule__Ultra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1143:1: ( rule__Ultra__Group__2__Impl )
            // InternalMarsRover.g:1144:2: rule__Ultra__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ultra__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__2"


    // $ANTLR start "rule__Ultra__Group__2__Impl"
    // InternalMarsRover.g:1150:1: rule__Ultra__Group__2__Impl : ( ( rule__Ultra__DistanceAssignment_2 ) ) ;
    public final void rule__Ultra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1154:1: ( ( ( rule__Ultra__DistanceAssignment_2 ) ) )
            // InternalMarsRover.g:1155:1: ( ( rule__Ultra__DistanceAssignment_2 ) )
            {
            // InternalMarsRover.g:1155:1: ( ( rule__Ultra__DistanceAssignment_2 ) )
            // InternalMarsRover.g:1156:2: ( rule__Ultra__DistanceAssignment_2 )
            {
             before(grammarAccess.getUltraAccess().getDistanceAssignment_2()); 
            // InternalMarsRover.g:1157:2: ( rule__Ultra__DistanceAssignment_2 )
            // InternalMarsRover.g:1157:3: rule__Ultra__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ultra__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUltraAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__Group__2__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__0"
    // InternalMarsRover.g:1166:1: rule__Detect_lakes__Group__0 : rule__Detect_lakes__Group__0__Impl rule__Detect_lakes__Group__1 ;
    public final void rule__Detect_lakes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1170:1: ( rule__Detect_lakes__Group__0__Impl rule__Detect_lakes__Group__1 )
            // InternalMarsRover.g:1171:2: rule__Detect_lakes__Group__0__Impl rule__Detect_lakes__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Detect_lakes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__0"


    // $ANTLR start "rule__Detect_lakes__Group__0__Impl"
    // InternalMarsRover.g:1178:1: rule__Detect_lakes__Group__0__Impl : ( ( rule__Detect_lakes__NameAssignment_0 ) ) ;
    public final void rule__Detect_lakes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1182:1: ( ( ( rule__Detect_lakes__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1183:1: ( ( rule__Detect_lakes__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1183:1: ( ( rule__Detect_lakes__NameAssignment_0 ) )
            // InternalMarsRover.g:1184:2: ( rule__Detect_lakes__NameAssignment_0 )
            {
             before(grammarAccess.getDetect_lakesAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1185:2: ( rule__Detect_lakes__NameAssignment_0 )
            // InternalMarsRover.g:1185:3: rule__Detect_lakes__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Detect_lakes__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDetect_lakesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__0__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__1"
    // InternalMarsRover.g:1193:1: rule__Detect_lakes__Group__1 : rule__Detect_lakes__Group__1__Impl rule__Detect_lakes__Group__2 ;
    public final void rule__Detect_lakes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1197:1: ( rule__Detect_lakes__Group__1__Impl rule__Detect_lakes__Group__2 )
            // InternalMarsRover.g:1198:2: rule__Detect_lakes__Group__1__Impl rule__Detect_lakes__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Detect_lakes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__1"


    // $ANTLR start "rule__Detect_lakes__Group__1__Impl"
    // InternalMarsRover.g:1205:1: rule__Detect_lakes__Group__1__Impl : ( 'number_of_lakes' ) ;
    public final void rule__Detect_lakes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1209:1: ( ( 'number_of_lakes' ) )
            // InternalMarsRover.g:1210:1: ( 'number_of_lakes' )
            {
            // InternalMarsRover.g:1210:1: ( 'number_of_lakes' )
            // InternalMarsRover.g:1211:2: 'number_of_lakes'
            {
             before(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__1__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__2"
    // InternalMarsRover.g:1220:1: rule__Detect_lakes__Group__2 : rule__Detect_lakes__Group__2__Impl rule__Detect_lakes__Group__3 ;
    public final void rule__Detect_lakes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1224:1: ( rule__Detect_lakes__Group__2__Impl rule__Detect_lakes__Group__3 )
            // InternalMarsRover.g:1225:2: rule__Detect_lakes__Group__2__Impl rule__Detect_lakes__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Detect_lakes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__2"


    // $ANTLR start "rule__Detect_lakes__Group__2__Impl"
    // InternalMarsRover.g:1232:1: rule__Detect_lakes__Group__2__Impl : ( ( rule__Detect_lakes__Number_of_lakesAssignment_2 ) ) ;
    public final void rule__Detect_lakes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1236:1: ( ( ( rule__Detect_lakes__Number_of_lakesAssignment_2 ) ) )
            // InternalMarsRover.g:1237:1: ( ( rule__Detect_lakes__Number_of_lakesAssignment_2 ) )
            {
            // InternalMarsRover.g:1237:1: ( ( rule__Detect_lakes__Number_of_lakesAssignment_2 ) )
            // InternalMarsRover.g:1238:2: ( rule__Detect_lakes__Number_of_lakesAssignment_2 )
            {
             before(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesAssignment_2()); 
            // InternalMarsRover.g:1239:2: ( rule__Detect_lakes__Number_of_lakesAssignment_2 )
            // InternalMarsRover.g:1239:3: rule__Detect_lakes__Number_of_lakesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Number_of_lakesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__2__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__3"
    // InternalMarsRover.g:1247:1: rule__Detect_lakes__Group__3 : rule__Detect_lakes__Group__3__Impl rule__Detect_lakes__Group__4 ;
    public final void rule__Detect_lakes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1251:1: ( rule__Detect_lakes__Group__3__Impl rule__Detect_lakes__Group__4 )
            // InternalMarsRover.g:1252:2: rule__Detect_lakes__Group__3__Impl rule__Detect_lakes__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Detect_lakes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__3"


    // $ANTLR start "rule__Detect_lakes__Group__3__Impl"
    // InternalMarsRover.g:1259:1: rule__Detect_lakes__Group__3__Impl : ( 'lakes_colors' ) ;
    public final void rule__Detect_lakes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1263:1: ( ( 'lakes_colors' ) )
            // InternalMarsRover.g:1264:1: ( 'lakes_colors' )
            {
            // InternalMarsRover.g:1264:1: ( 'lakes_colors' )
            // InternalMarsRover.g:1265:2: 'lakes_colors'
            {
             before(grammarAccess.getDetect_lakesAccess().getLakes_colorsKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDetect_lakesAccess().getLakes_colorsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__3__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__4"
    // InternalMarsRover.g:1274:1: rule__Detect_lakes__Group__4 : rule__Detect_lakes__Group__4__Impl rule__Detect_lakes__Group__5 ;
    public final void rule__Detect_lakes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1278:1: ( rule__Detect_lakes__Group__4__Impl rule__Detect_lakes__Group__5 )
            // InternalMarsRover.g:1279:2: rule__Detect_lakes__Group__4__Impl rule__Detect_lakes__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Detect_lakes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__4"


    // $ANTLR start "rule__Detect_lakes__Group__4__Impl"
    // InternalMarsRover.g:1286:1: rule__Detect_lakes__Group__4__Impl : ( ( rule__Detect_lakes__Lakes_colorsAssignment_4 )* ) ;
    public final void rule__Detect_lakes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1290:1: ( ( ( rule__Detect_lakes__Lakes_colorsAssignment_4 )* ) )
            // InternalMarsRover.g:1291:1: ( ( rule__Detect_lakes__Lakes_colorsAssignment_4 )* )
            {
            // InternalMarsRover.g:1291:1: ( ( rule__Detect_lakes__Lakes_colorsAssignment_4 )* )
            // InternalMarsRover.g:1292:2: ( rule__Detect_lakes__Lakes_colorsAssignment_4 )*
            {
             before(grammarAccess.getDetect_lakesAccess().getLakes_colorsAssignment_4()); 
            // InternalMarsRover.g:1293:2: ( rule__Detect_lakes__Lakes_colorsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMarsRover.g:1293:3: rule__Detect_lakes__Lakes_colorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Detect_lakes__Lakes_colorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDetect_lakesAccess().getLakes_colorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__4__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__5"
    // InternalMarsRover.g:1301:1: rule__Detect_lakes__Group__5 : rule__Detect_lakes__Group__5__Impl rule__Detect_lakes__Group__6 ;
    public final void rule__Detect_lakes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1305:1: ( rule__Detect_lakes__Group__5__Impl rule__Detect_lakes__Group__6 )
            // InternalMarsRover.g:1306:2: rule__Detect_lakes__Group__5__Impl rule__Detect_lakes__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Detect_lakes__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__5"


    // $ANTLR start "rule__Detect_lakes__Group__5__Impl"
    // InternalMarsRover.g:1313:1: rule__Detect_lakes__Group__5__Impl : ( 'after_examinating' ) ;
    public final void rule__Detect_lakes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1317:1: ( ( 'after_examinating' ) )
            // InternalMarsRover.g:1318:1: ( 'after_examinating' )
            {
            // InternalMarsRover.g:1318:1: ( 'after_examinating' )
            // InternalMarsRover.g:1319:2: 'after_examinating'
            {
             before(grammarAccess.getDetect_lakesAccess().getAfter_examinatingKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDetect_lakesAccess().getAfter_examinatingKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__5__Impl"


    // $ANTLR start "rule__Detect_lakes__Group__6"
    // InternalMarsRover.g:1328:1: rule__Detect_lakes__Group__6 : rule__Detect_lakes__Group__6__Impl ;
    public final void rule__Detect_lakes__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1332:1: ( rule__Detect_lakes__Group__6__Impl )
            // InternalMarsRover.g:1333:2: rule__Detect_lakes__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Detect_lakes__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__6"


    // $ANTLR start "rule__Detect_lakes__Group__6__Impl"
    // InternalMarsRover.g:1339:1: rule__Detect_lakes__Group__6__Impl : ( ( rule__Detect_lakes__After_examinatingAssignment_6 ) ) ;
    public final void rule__Detect_lakes__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1343:1: ( ( ( rule__Detect_lakes__After_examinatingAssignment_6 ) ) )
            // InternalMarsRover.g:1344:1: ( ( rule__Detect_lakes__After_examinatingAssignment_6 ) )
            {
            // InternalMarsRover.g:1344:1: ( ( rule__Detect_lakes__After_examinatingAssignment_6 ) )
            // InternalMarsRover.g:1345:2: ( rule__Detect_lakes__After_examinatingAssignment_6 )
            {
             before(grammarAccess.getDetect_lakesAccess().getAfter_examinatingAssignment_6()); 
            // InternalMarsRover.g:1346:2: ( rule__Detect_lakes__After_examinatingAssignment_6 )
            // InternalMarsRover.g:1346:3: rule__Detect_lakes__After_examinatingAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Detect_lakes__After_examinatingAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDetect_lakesAccess().getAfter_examinatingAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Group__6__Impl"


    // $ANTLR start "rule__Detect_rocks__Group__0"
    // InternalMarsRover.g:1355:1: rule__Detect_rocks__Group__0 : rule__Detect_rocks__Group__0__Impl rule__Detect_rocks__Group__1 ;
    public final void rule__Detect_rocks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1359:1: ( rule__Detect_rocks__Group__0__Impl rule__Detect_rocks__Group__1 )
            // InternalMarsRover.g:1360:2: rule__Detect_rocks__Group__0__Impl rule__Detect_rocks__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Detect_rocks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__0"


    // $ANTLR start "rule__Detect_rocks__Group__0__Impl"
    // InternalMarsRover.g:1367:1: rule__Detect_rocks__Group__0__Impl : ( ( rule__Detect_rocks__NameAssignment_0 ) ) ;
    public final void rule__Detect_rocks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1371:1: ( ( ( rule__Detect_rocks__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1372:1: ( ( rule__Detect_rocks__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1372:1: ( ( rule__Detect_rocks__NameAssignment_0 ) )
            // InternalMarsRover.g:1373:2: ( rule__Detect_rocks__NameAssignment_0 )
            {
             before(grammarAccess.getDetect_rocksAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1374:2: ( rule__Detect_rocks__NameAssignment_0 )
            // InternalMarsRover.g:1374:3: rule__Detect_rocks__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Detect_rocks__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDetect_rocksAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__0__Impl"


    // $ANTLR start "rule__Detect_rocks__Group__1"
    // InternalMarsRover.g:1382:1: rule__Detect_rocks__Group__1 : rule__Detect_rocks__Group__1__Impl rule__Detect_rocks__Group__2 ;
    public final void rule__Detect_rocks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1386:1: ( rule__Detect_rocks__Group__1__Impl rule__Detect_rocks__Group__2 )
            // InternalMarsRover.g:1387:2: rule__Detect_rocks__Group__1__Impl rule__Detect_rocks__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Detect_rocks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__1"


    // $ANTLR start "rule__Detect_rocks__Group__1__Impl"
    // InternalMarsRover.g:1394:1: rule__Detect_rocks__Group__1__Impl : ( 'number_of_rocks' ) ;
    public final void rule__Detect_rocks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1398:1: ( ( 'number_of_rocks' ) )
            // InternalMarsRover.g:1399:1: ( 'number_of_rocks' )
            {
            // InternalMarsRover.g:1399:1: ( 'number_of_rocks' )
            // InternalMarsRover.g:1400:2: 'number_of_rocks'
            {
             before(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__1__Impl"


    // $ANTLR start "rule__Detect_rocks__Group__2"
    // InternalMarsRover.g:1409:1: rule__Detect_rocks__Group__2 : rule__Detect_rocks__Group__2__Impl rule__Detect_rocks__Group__3 ;
    public final void rule__Detect_rocks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1413:1: ( rule__Detect_rocks__Group__2__Impl rule__Detect_rocks__Group__3 )
            // InternalMarsRover.g:1414:2: rule__Detect_rocks__Group__2__Impl rule__Detect_rocks__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Detect_rocks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__2"


    // $ANTLR start "rule__Detect_rocks__Group__2__Impl"
    // InternalMarsRover.g:1421:1: rule__Detect_rocks__Group__2__Impl : ( ( rule__Detect_rocks__Number_of_rocksAssignment_2 ) ) ;
    public final void rule__Detect_rocks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1425:1: ( ( ( rule__Detect_rocks__Number_of_rocksAssignment_2 ) ) )
            // InternalMarsRover.g:1426:1: ( ( rule__Detect_rocks__Number_of_rocksAssignment_2 ) )
            {
            // InternalMarsRover.g:1426:1: ( ( rule__Detect_rocks__Number_of_rocksAssignment_2 ) )
            // InternalMarsRover.g:1427:2: ( rule__Detect_rocks__Number_of_rocksAssignment_2 )
            {
             before(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksAssignment_2()); 
            // InternalMarsRover.g:1428:2: ( rule__Detect_rocks__Number_of_rocksAssignment_2 )
            // InternalMarsRover.g:1428:3: rule__Detect_rocks__Number_of_rocksAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Number_of_rocksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__2__Impl"


    // $ANTLR start "rule__Detect_rocks__Group__3"
    // InternalMarsRover.g:1436:1: rule__Detect_rocks__Group__3 : rule__Detect_rocks__Group__3__Impl rule__Detect_rocks__Group__4 ;
    public final void rule__Detect_rocks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1440:1: ( rule__Detect_rocks__Group__3__Impl rule__Detect_rocks__Group__4 )
            // InternalMarsRover.g:1441:2: rule__Detect_rocks__Group__3__Impl rule__Detect_rocks__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Detect_rocks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__3"


    // $ANTLR start "rule__Detect_rocks__Group__3__Impl"
    // InternalMarsRover.g:1448:1: rule__Detect_rocks__Group__3__Impl : ( 'after_examinating' ) ;
    public final void rule__Detect_rocks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1452:1: ( ( 'after_examinating' ) )
            // InternalMarsRover.g:1453:1: ( 'after_examinating' )
            {
            // InternalMarsRover.g:1453:1: ( 'after_examinating' )
            // InternalMarsRover.g:1454:2: 'after_examinating'
            {
             before(grammarAccess.getDetect_rocksAccess().getAfter_examinatingKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDetect_rocksAccess().getAfter_examinatingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__3__Impl"


    // $ANTLR start "rule__Detect_rocks__Group__4"
    // InternalMarsRover.g:1463:1: rule__Detect_rocks__Group__4 : rule__Detect_rocks__Group__4__Impl ;
    public final void rule__Detect_rocks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1467:1: ( rule__Detect_rocks__Group__4__Impl )
            // InternalMarsRover.g:1468:2: rule__Detect_rocks__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Detect_rocks__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__4"


    // $ANTLR start "rule__Detect_rocks__Group__4__Impl"
    // InternalMarsRover.g:1474:1: rule__Detect_rocks__Group__4__Impl : ( ( rule__Detect_rocks__After_examinatingAssignment_4 ) ) ;
    public final void rule__Detect_rocks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1478:1: ( ( ( rule__Detect_rocks__After_examinatingAssignment_4 ) ) )
            // InternalMarsRover.g:1479:1: ( ( rule__Detect_rocks__After_examinatingAssignment_4 ) )
            {
            // InternalMarsRover.g:1479:1: ( ( rule__Detect_rocks__After_examinatingAssignment_4 ) )
            // InternalMarsRover.g:1480:2: ( rule__Detect_rocks__After_examinatingAssignment_4 )
            {
             before(grammarAccess.getDetect_rocksAccess().getAfter_examinatingAssignment_4()); 
            // InternalMarsRover.g:1481:2: ( rule__Detect_rocks__After_examinatingAssignment_4 )
            // InternalMarsRover.g:1481:3: rule__Detect_rocks__After_examinatingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Detect_rocks__After_examinatingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDetect_rocksAccess().getAfter_examinatingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Group__4__Impl"


    // $ANTLR start "rule__After_action__Group__0"
    // InternalMarsRover.g:1490:1: rule__After_action__Group__0 : rule__After_action__Group__0__Impl rule__After_action__Group__1 ;
    public final void rule__After_action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1494:1: ( rule__After_action__Group__0__Impl rule__After_action__Group__1 )
            // InternalMarsRover.g:1495:2: rule__After_action__Group__0__Impl rule__After_action__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__After_action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__After_action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group__0"


    // $ANTLR start "rule__After_action__Group__0__Impl"
    // InternalMarsRover.g:1502:1: rule__After_action__Group__0__Impl : ( ( rule__After_action__ActionAssignment_0 ) ) ;
    public final void rule__After_action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1506:1: ( ( ( rule__After_action__ActionAssignment_0 ) ) )
            // InternalMarsRover.g:1507:1: ( ( rule__After_action__ActionAssignment_0 ) )
            {
            // InternalMarsRover.g:1507:1: ( ( rule__After_action__ActionAssignment_0 ) )
            // InternalMarsRover.g:1508:2: ( rule__After_action__ActionAssignment_0 )
            {
             before(grammarAccess.getAfter_actionAccess().getActionAssignment_0()); 
            // InternalMarsRover.g:1509:2: ( rule__After_action__ActionAssignment_0 )
            // InternalMarsRover.g:1509:3: rule__After_action__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__After_action__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAfter_actionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group__0__Impl"


    // $ANTLR start "rule__After_action__Group__1"
    // InternalMarsRover.g:1517:1: rule__After_action__Group__1 : rule__After_action__Group__1__Impl ;
    public final void rule__After_action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1521:1: ( rule__After_action__Group__1__Impl )
            // InternalMarsRover.g:1522:2: rule__After_action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__After_action__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group__1"


    // $ANTLR start "rule__After_action__Group__1__Impl"
    // InternalMarsRover.g:1528:1: rule__After_action__Group__1__Impl : ( ( rule__After_action__Group_1__0 )? ) ;
    public final void rule__After_action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1532:1: ( ( ( rule__After_action__Group_1__0 )? ) )
            // InternalMarsRover.g:1533:1: ( ( rule__After_action__Group_1__0 )? )
            {
            // InternalMarsRover.g:1533:1: ( ( rule__After_action__Group_1__0 )? )
            // InternalMarsRover.g:1534:2: ( rule__After_action__Group_1__0 )?
            {
             before(grammarAccess.getAfter_actionAccess().getGroup_1()); 
            // InternalMarsRover.g:1535:2: ( rule__After_action__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMarsRover.g:1535:3: rule__After_action__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__After_action__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAfter_actionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group__1__Impl"


    // $ANTLR start "rule__After_action__Group_1__0"
    // InternalMarsRover.g:1544:1: rule__After_action__Group_1__0 : rule__After_action__Group_1__0__Impl rule__After_action__Group_1__1 ;
    public final void rule__After_action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1548:1: ( rule__After_action__Group_1__0__Impl rule__After_action__Group_1__1 )
            // InternalMarsRover.g:1549:2: rule__After_action__Group_1__0__Impl rule__After_action__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__After_action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__After_action__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group_1__0"


    // $ANTLR start "rule__After_action__Group_1__0__Impl"
    // InternalMarsRover.g:1556:1: rule__After_action__Group_1__0__Impl : ( 'indicate' ) ;
    public final void rule__After_action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1560:1: ( ( 'indicate' ) )
            // InternalMarsRover.g:1561:1: ( 'indicate' )
            {
            // InternalMarsRover.g:1561:1: ( 'indicate' )
            // InternalMarsRover.g:1562:2: 'indicate'
            {
             before(grammarAccess.getAfter_actionAccess().getIndicateKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAfter_actionAccess().getIndicateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group_1__0__Impl"


    // $ANTLR start "rule__After_action__Group_1__1"
    // InternalMarsRover.g:1571:1: rule__After_action__Group_1__1 : rule__After_action__Group_1__1__Impl ;
    public final void rule__After_action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1575:1: ( rule__After_action__Group_1__1__Impl )
            // InternalMarsRover.g:1576:2: rule__After_action__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__After_action__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group_1__1"


    // $ANTLR start "rule__After_action__Group_1__1__Impl"
    // InternalMarsRover.g:1582:1: rule__After_action__Group_1__1__Impl : ( ( rule__After_action__IndicateAssignment_1_1 )* ) ;
    public final void rule__After_action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1586:1: ( ( ( rule__After_action__IndicateAssignment_1_1 )* ) )
            // InternalMarsRover.g:1587:1: ( ( rule__After_action__IndicateAssignment_1_1 )* )
            {
            // InternalMarsRover.g:1587:1: ( ( rule__After_action__IndicateAssignment_1_1 )* )
            // InternalMarsRover.g:1588:2: ( rule__After_action__IndicateAssignment_1_1 )*
            {
             before(grammarAccess.getAfter_actionAccess().getIndicateAssignment_1_1()); 
            // InternalMarsRover.g:1589:2: ( rule__After_action__IndicateAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMarsRover.g:1589:3: rule__After_action__IndicateAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__After_action__IndicateAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAfter_actionAccess().getIndicateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__Group_1__1__Impl"


    // $ANTLR start "rule__Indication__Group__0"
    // InternalMarsRover.g:1598:1: rule__Indication__Group__0 : rule__Indication__Group__0__Impl rule__Indication__Group__1 ;
    public final void rule__Indication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1602:1: ( rule__Indication__Group__0__Impl rule__Indication__Group__1 )
            // InternalMarsRover.g:1603:2: rule__Indication__Group__0__Impl rule__Indication__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Indication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Indication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__Group__0"


    // $ANTLR start "rule__Indication__Group__0__Impl"
    // InternalMarsRover.g:1610:1: rule__Indication__Group__0__Impl : ( ( rule__Indication__NameAssignment_0 ) ) ;
    public final void rule__Indication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1614:1: ( ( ( rule__Indication__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1615:1: ( ( rule__Indication__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1615:1: ( ( rule__Indication__NameAssignment_0 ) )
            // InternalMarsRover.g:1616:2: ( rule__Indication__NameAssignment_0 )
            {
             before(grammarAccess.getIndicationAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1617:2: ( rule__Indication__NameAssignment_0 )
            // InternalMarsRover.g:1617:3: rule__Indication__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Indication__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIndicationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__Group__0__Impl"


    // $ANTLR start "rule__Indication__Group__1"
    // InternalMarsRover.g:1625:1: rule__Indication__Group__1 : rule__Indication__Group__1__Impl ;
    public final void rule__Indication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1629:1: ( rule__Indication__Group__1__Impl )
            // InternalMarsRover.g:1630:2: rule__Indication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Indication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__Group__1"


    // $ANTLR start "rule__Indication__Group__1__Impl"
    // InternalMarsRover.g:1636:1: rule__Indication__Group__1__Impl : ( ( rule__Indication__TypeAssignment_1 )? ) ;
    public final void rule__Indication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1640:1: ( ( ( rule__Indication__TypeAssignment_1 )? ) )
            // InternalMarsRover.g:1641:1: ( ( rule__Indication__TypeAssignment_1 )? )
            {
            // InternalMarsRover.g:1641:1: ( ( rule__Indication__TypeAssignment_1 )? )
            // InternalMarsRover.g:1642:2: ( rule__Indication__TypeAssignment_1 )?
            {
             before(grammarAccess.getIndicationAccess().getTypeAssignment_1()); 
            // InternalMarsRover.g:1643:2: ( rule__Indication__TypeAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=44 && LA12_0<=46)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMarsRover.g:1643:3: rule__Indication__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Indication__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndicationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__Group__1__Impl"


    // $ANTLR start "rule__Sound__Group__0"
    // InternalMarsRover.g:1652:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1656:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalMarsRover.g:1657:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Sound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__0"


    // $ANTLR start "rule__Sound__Group__0__Impl"
    // InternalMarsRover.g:1664:1: rule__Sound__Group__0__Impl : ( ( rule__Sound__NameAssignment_0 ) ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1668:1: ( ( ( rule__Sound__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1669:1: ( ( rule__Sound__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1669:1: ( ( rule__Sound__NameAssignment_0 ) )
            // InternalMarsRover.g:1670:2: ( rule__Sound__NameAssignment_0 )
            {
             before(grammarAccess.getSoundAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1671:2: ( rule__Sound__NameAssignment_0 )
            // InternalMarsRover.g:1671:3: rule__Sound__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sound__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__0__Impl"


    // $ANTLR start "rule__Sound__Group__1"
    // InternalMarsRover.g:1679:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1683:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalMarsRover.g:1684:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Sound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__1"


    // $ANTLR start "rule__Sound__Group__1__Impl"
    // InternalMarsRover.g:1691:1: rule__Sound__Group__1__Impl : ( 'duration' ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1695:1: ( ( 'duration' ) )
            // InternalMarsRover.g:1696:1: ( 'duration' )
            {
            // InternalMarsRover.g:1696:1: ( 'duration' )
            // InternalMarsRover.g:1697:2: 'duration'
            {
             before(grammarAccess.getSoundAccess().getDurationKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getDurationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__1__Impl"


    // $ANTLR start "rule__Sound__Group__2"
    // InternalMarsRover.g:1706:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl rule__Sound__Group__3 ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1710:1: ( rule__Sound__Group__2__Impl rule__Sound__Group__3 )
            // InternalMarsRover.g:1711:2: rule__Sound__Group__2__Impl rule__Sound__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Sound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__2"


    // $ANTLR start "rule__Sound__Group__2__Impl"
    // InternalMarsRover.g:1718:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1722:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalMarsRover.g:1723:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalMarsRover.g:1723:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalMarsRover.g:1724:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalMarsRover.g:1725:2: ( rule__Sound__DurationAssignment_2 )
            // InternalMarsRover.g:1725:3: rule__Sound__DurationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sound__DurationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__2__Impl"


    // $ANTLR start "rule__Sound__Group__3"
    // InternalMarsRover.g:1733:1: rule__Sound__Group__3 : rule__Sound__Group__3__Impl rule__Sound__Group__4 ;
    public final void rule__Sound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1737:1: ( rule__Sound__Group__3__Impl rule__Sound__Group__4 )
            // InternalMarsRover.g:1738:2: rule__Sound__Group__3__Impl rule__Sound__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Sound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__3"


    // $ANTLR start "rule__Sound__Group__3__Impl"
    // InternalMarsRover.g:1745:1: rule__Sound__Group__3__Impl : ( 'frequency' ) ;
    public final void rule__Sound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1749:1: ( ( 'frequency' ) )
            // InternalMarsRover.g:1750:1: ( 'frequency' )
            {
            // InternalMarsRover.g:1750:1: ( 'frequency' )
            // InternalMarsRover.g:1751:2: 'frequency'
            {
             before(grammarAccess.getSoundAccess().getFrequencyKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getFrequencyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__3__Impl"


    // $ANTLR start "rule__Sound__Group__4"
    // InternalMarsRover.g:1760:1: rule__Sound__Group__4 : rule__Sound__Group__4__Impl ;
    public final void rule__Sound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1764:1: ( rule__Sound__Group__4__Impl )
            // InternalMarsRover.g:1765:2: rule__Sound__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__4"


    // $ANTLR start "rule__Sound__Group__4__Impl"
    // InternalMarsRover.g:1771:1: rule__Sound__Group__4__Impl : ( ( rule__Sound__FrequencyAssignment_4 ) ) ;
    public final void rule__Sound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1775:1: ( ( ( rule__Sound__FrequencyAssignment_4 ) ) )
            // InternalMarsRover.g:1776:1: ( ( rule__Sound__FrequencyAssignment_4 ) )
            {
            // InternalMarsRover.g:1776:1: ( ( rule__Sound__FrequencyAssignment_4 ) )
            // InternalMarsRover.g:1777:2: ( rule__Sound__FrequencyAssignment_4 )
            {
             before(grammarAccess.getSoundAccess().getFrequencyAssignment_4()); 
            // InternalMarsRover.g:1778:2: ( rule__Sound__FrequencyAssignment_4 )
            // InternalMarsRover.g:1778:3: rule__Sound__FrequencyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sound__FrequencyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getFrequencyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalMarsRover.g:1787:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1791:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalMarsRover.g:1792:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalMarsRover.g:1799:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1803:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1804:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1804:1: ( ( rule__Message__NameAssignment_0 ) )
            // InternalMarsRover.g:1805:2: ( rule__Message__NameAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1806:2: ( rule__Message__NameAssignment_0 )
            // InternalMarsRover.g:1806:3: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalMarsRover.g:1814:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1818:1: ( rule__Message__Group__1__Impl )
            // InternalMarsRover.g:1819:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalMarsRover.g:1825:1: rule__Message__Group__1__Impl : ( ( rule__Message__MsgAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1829:1: ( ( ( rule__Message__MsgAssignment_1 ) ) )
            // InternalMarsRover.g:1830:1: ( ( rule__Message__MsgAssignment_1 ) )
            {
            // InternalMarsRover.g:1830:1: ( ( rule__Message__MsgAssignment_1 ) )
            // InternalMarsRover.g:1831:2: ( rule__Message__MsgAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getMsgAssignment_1()); 
            // InternalMarsRover.g:1832:2: ( rule__Message__MsgAssignment_1 )
            // InternalMarsRover.g:1832:3: rule__Message__MsgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__MsgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getMsgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Color_indication__Group__0"
    // InternalMarsRover.g:1841:1: rule__Color_indication__Group__0 : rule__Color_indication__Group__0__Impl rule__Color_indication__Group__1 ;
    public final void rule__Color_indication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1845:1: ( rule__Color_indication__Group__0__Impl rule__Color_indication__Group__1 )
            // InternalMarsRover.g:1846:2: rule__Color_indication__Group__0__Impl rule__Color_indication__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Color_indication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color_indication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__0"


    // $ANTLR start "rule__Color_indication__Group__0__Impl"
    // InternalMarsRover.g:1853:1: rule__Color_indication__Group__0__Impl : ( ( rule__Color_indication__NameAssignment_0 ) ) ;
    public final void rule__Color_indication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1857:1: ( ( ( rule__Color_indication__NameAssignment_0 ) ) )
            // InternalMarsRover.g:1858:1: ( ( rule__Color_indication__NameAssignment_0 ) )
            {
            // InternalMarsRover.g:1858:1: ( ( rule__Color_indication__NameAssignment_0 ) )
            // InternalMarsRover.g:1859:2: ( rule__Color_indication__NameAssignment_0 )
            {
             before(grammarAccess.getColor_indicationAccess().getNameAssignment_0()); 
            // InternalMarsRover.g:1860:2: ( rule__Color_indication__NameAssignment_0 )
            // InternalMarsRover.g:1860:3: rule__Color_indication__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Color_indication__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColor_indicationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__0__Impl"


    // $ANTLR start "rule__Color_indication__Group__1"
    // InternalMarsRover.g:1868:1: rule__Color_indication__Group__1 : rule__Color_indication__Group__1__Impl rule__Color_indication__Group__2 ;
    public final void rule__Color_indication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1872:1: ( rule__Color_indication__Group__1__Impl rule__Color_indication__Group__2 )
            // InternalMarsRover.g:1873:2: rule__Color_indication__Group__1__Impl rule__Color_indication__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Color_indication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color_indication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__1"


    // $ANTLR start "rule__Color_indication__Group__1__Impl"
    // InternalMarsRover.g:1880:1: rule__Color_indication__Group__1__Impl : ( 'with_color' ) ;
    public final void rule__Color_indication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1884:1: ( ( 'with_color' ) )
            // InternalMarsRover.g:1885:1: ( 'with_color' )
            {
            // InternalMarsRover.g:1885:1: ( 'with_color' )
            // InternalMarsRover.g:1886:2: 'with_color'
            {
             before(grammarAccess.getColor_indicationAccess().getWith_colorKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColor_indicationAccess().getWith_colorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__1__Impl"


    // $ANTLR start "rule__Color_indication__Group__2"
    // InternalMarsRover.g:1895:1: rule__Color_indication__Group__2 : rule__Color_indication__Group__2__Impl ;
    public final void rule__Color_indication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1899:1: ( rule__Color_indication__Group__2__Impl )
            // InternalMarsRover.g:1900:2: rule__Color_indication__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color_indication__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__2"


    // $ANTLR start "rule__Color_indication__Group__2__Impl"
    // InternalMarsRover.g:1906:1: rule__Color_indication__Group__2__Impl : ( ( rule__Color_indication__ColorAssignment_2 ) ) ;
    public final void rule__Color_indication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1910:1: ( ( ( rule__Color_indication__ColorAssignment_2 ) ) )
            // InternalMarsRover.g:1911:1: ( ( rule__Color_indication__ColorAssignment_2 ) )
            {
            // InternalMarsRover.g:1911:1: ( ( rule__Color_indication__ColorAssignment_2 ) )
            // InternalMarsRover.g:1912:2: ( rule__Color_indication__ColorAssignment_2 )
            {
             before(grammarAccess.getColor_indicationAccess().getColorAssignment_2()); 
            // InternalMarsRover.g:1913:2: ( rule__Color_indication__ColorAssignment_2 )
            // InternalMarsRover.g:1913:3: rule__Color_indication__ColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Color_indication__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColor_indicationAccess().getColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__Group__2__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalMarsRover.g:1922:1: rule__Robot__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1926:1: ( ( RULE_STRING ) )
            // InternalMarsRover.g:1927:2: ( RULE_STRING )
            {
            // InternalMarsRover.g:1927:2: ( RULE_STRING )
            // InternalMarsRover.g:1928:3: RULE_STRING
            {
             before(grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__Slave_addressAssignment_3"
    // InternalMarsRover.g:1937:1: rule__Robot__Slave_addressAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Robot__Slave_addressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1941:1: ( ( RULE_STRING ) )
            // InternalMarsRover.g:1942:2: ( RULE_STRING )
            {
            // InternalMarsRover.g:1942:2: ( RULE_STRING )
            // InternalMarsRover.g:1943:3: RULE_STRING
            {
             before(grammarAccess.getRobotAccess().getSlave_addressSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getSlave_addressSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Slave_addressAssignment_3"


    // $ANTLR start "rule__Robot__Drive_speedAssignment_5"
    // InternalMarsRover.g:1952:1: rule__Robot__Drive_speedAssignment_5 : ( RULE_INT ) ;
    public final void rule__Robot__Drive_speedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1956:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:1957:2: ( RULE_INT )
            {
            // InternalMarsRover.g:1957:2: ( RULE_INT )
            // InternalMarsRover.g:1958:3: RULE_INT
            {
             before(grammarAccess.getRobotAccess().getDrive_speedINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getDrive_speedINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Drive_speedAssignment_5"


    // $ANTLR start "rule__Robot__Special_speedAssignment_7"
    // InternalMarsRover.g:1967:1: rule__Robot__Special_speedAssignment_7 : ( RULE_INT ) ;
    public final void rule__Robot__Special_speedAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1971:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:1972:2: ( RULE_INT )
            {
            // InternalMarsRover.g:1972:2: ( RULE_INT )
            // InternalMarsRover.g:1973:3: RULE_INT
            {
             before(grammarAccess.getRobotAccess().getSpecial_speedINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getSpecial_speedINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Special_speedAssignment_7"


    // $ANTLR start "rule__Robot__MissionsAssignment_9"
    // InternalMarsRover.g:1982:1: rule__Robot__MissionsAssignment_9 : ( rulemission ) ;
    public final void rule__Robot__MissionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:1986:1: ( ( rulemission ) )
            // InternalMarsRover.g:1987:2: ( rulemission )
            {
            // InternalMarsRover.g:1987:2: ( rulemission )
            // InternalMarsRover.g:1988:3: rulemission
            {
             before(grammarAccess.getRobotAccess().getMissionsMissionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulemission();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getMissionsMissionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__MissionsAssignment_9"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalMarsRover.g:1997:1: rule__Mission__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2001:1: ( ( RULE_STRING ) )
            // InternalMarsRover.g:2002:2: ( RULE_STRING )
            {
            // InternalMarsRover.g:2002:2: ( RULE_STRING )
            // InternalMarsRover.g:2003:3: RULE_STRING
            {
             before(grammarAccess.getMissionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_1"


    // $ANTLR start "rule__Mission__TypeAssignment_3"
    // InternalMarsRover.g:2012:1: rule__Mission__TypeAssignment_3 : ( ( rule__Mission__TypeAlternatives_3_0 ) ) ;
    public final void rule__Mission__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2016:1: ( ( ( rule__Mission__TypeAlternatives_3_0 ) ) )
            // InternalMarsRover.g:2017:2: ( ( rule__Mission__TypeAlternatives_3_0 ) )
            {
            // InternalMarsRover.g:2017:2: ( ( rule__Mission__TypeAlternatives_3_0 ) )
            // InternalMarsRover.g:2018:3: ( rule__Mission__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getMissionAccess().getTypeAlternatives_3_0()); 
            // InternalMarsRover.g:2019:3: ( rule__Mission__TypeAlternatives_3_0 )
            // InternalMarsRover.g:2019:4: rule__Mission__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TypeAssignment_3"


    // $ANTLR start "rule__Avoid_obstacles__NameAssignment_0"
    // InternalMarsRover.g:2027:1: rule__Avoid_obstacles__NameAssignment_0 : ( ( 'avoid_obstacles' ) ) ;
    public final void rule__Avoid_obstacles__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2031:1: ( ( ( 'avoid_obstacles' ) ) )
            // InternalMarsRover.g:2032:2: ( ( 'avoid_obstacles' ) )
            {
            // InternalMarsRover.g:2032:2: ( ( 'avoid_obstacles' ) )
            // InternalMarsRover.g:2033:3: ( 'avoid_obstacles' )
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getNameAvoid_obstaclesKeyword_0_0()); 
            // InternalMarsRover.g:2034:3: ( 'avoid_obstacles' )
            // InternalMarsRover.g:2035:4: 'avoid_obstacles'
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getNameAvoid_obstaclesKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAvoid_obstaclesAccess().getNameAvoid_obstaclesKeyword_0_0()); 

            }

             after(grammarAccess.getAvoid_obstaclesAccess().getNameAvoid_obstaclesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__NameAssignment_0"


    // $ANTLR start "rule__Avoid_obstacles__SensorsAssignment_2"
    // InternalMarsRover.g:2046:1: rule__Avoid_obstacles__SensorsAssignment_2 : ( ( rule__Avoid_obstacles__SensorsAlternatives_2_0 ) ) ;
    public final void rule__Avoid_obstacles__SensorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2050:1: ( ( ( rule__Avoid_obstacles__SensorsAlternatives_2_0 ) ) )
            // InternalMarsRover.g:2051:2: ( ( rule__Avoid_obstacles__SensorsAlternatives_2_0 ) )
            {
            // InternalMarsRover.g:2051:2: ( ( rule__Avoid_obstacles__SensorsAlternatives_2_0 ) )
            // InternalMarsRover.g:2052:3: ( rule__Avoid_obstacles__SensorsAlternatives_2_0 )
            {
             before(grammarAccess.getAvoid_obstaclesAccess().getSensorsAlternatives_2_0()); 
            // InternalMarsRover.g:2053:3: ( rule__Avoid_obstacles__SensorsAlternatives_2_0 )
            // InternalMarsRover.g:2053:4: rule__Avoid_obstacles__SensorsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Avoid_obstacles__SensorsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAvoid_obstaclesAccess().getSensorsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_obstacles__SensorsAssignment_2"


    // $ANTLR start "rule__Ultra__NameAssignment_0"
    // InternalMarsRover.g:2061:1: rule__Ultra__NameAssignment_0 : ( ( 'ultra' ) ) ;
    public final void rule__Ultra__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2065:1: ( ( ( 'ultra' ) ) )
            // InternalMarsRover.g:2066:2: ( ( 'ultra' ) )
            {
            // InternalMarsRover.g:2066:2: ( ( 'ultra' ) )
            // InternalMarsRover.g:2067:3: ( 'ultra' )
            {
             before(grammarAccess.getUltraAccess().getNameUltraKeyword_0_0()); 
            // InternalMarsRover.g:2068:3: ( 'ultra' )
            // InternalMarsRover.g:2069:4: 'ultra'
            {
             before(grammarAccess.getUltraAccess().getNameUltraKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUltraAccess().getNameUltraKeyword_0_0()); 

            }

             after(grammarAccess.getUltraAccess().getNameUltraKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__NameAssignment_0"


    // $ANTLR start "rule__Ultra__DistanceAssignment_2"
    // InternalMarsRover.g:2080:1: rule__Ultra__DistanceAssignment_2 : ( RULE_INT ) ;
    public final void rule__Ultra__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2084:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:2085:2: ( RULE_INT )
            {
            // InternalMarsRover.g:2085:2: ( RULE_INT )
            // InternalMarsRover.g:2086:3: RULE_INT
            {
             before(grammarAccess.getUltraAccess().getDistanceINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUltraAccess().getDistanceINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ultra__DistanceAssignment_2"


    // $ANTLR start "rule__Bumpers__NameAssignment"
    // InternalMarsRover.g:2095:1: rule__Bumpers__NameAssignment : ( ( 'bumpers' ) ) ;
    public final void rule__Bumpers__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2099:1: ( ( ( 'bumpers' ) ) )
            // InternalMarsRover.g:2100:2: ( ( 'bumpers' ) )
            {
            // InternalMarsRover.g:2100:2: ( ( 'bumpers' ) )
            // InternalMarsRover.g:2101:3: ( 'bumpers' )
            {
             before(grammarAccess.getBumpersAccess().getNameBumpersKeyword_0()); 
            // InternalMarsRover.g:2102:3: ( 'bumpers' )
            // InternalMarsRover.g:2103:4: 'bumpers'
            {
             before(grammarAccess.getBumpersAccess().getNameBumpersKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBumpersAccess().getNameBumpersKeyword_0()); 

            }

             after(grammarAccess.getBumpersAccess().getNameBumpersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bumpers__NameAssignment"


    // $ANTLR start "rule__Detect_lakes__NameAssignment_0"
    // InternalMarsRover.g:2114:1: rule__Detect_lakes__NameAssignment_0 : ( ( 'detect_lakes' ) ) ;
    public final void rule__Detect_lakes__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2118:1: ( ( ( 'detect_lakes' ) ) )
            // InternalMarsRover.g:2119:2: ( ( 'detect_lakes' ) )
            {
            // InternalMarsRover.g:2119:2: ( ( 'detect_lakes' ) )
            // InternalMarsRover.g:2120:3: ( 'detect_lakes' )
            {
             before(grammarAccess.getDetect_lakesAccess().getNameDetect_lakesKeyword_0_0()); 
            // InternalMarsRover.g:2121:3: ( 'detect_lakes' )
            // InternalMarsRover.g:2122:4: 'detect_lakes'
            {
             before(grammarAccess.getDetect_lakesAccess().getNameDetect_lakesKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDetect_lakesAccess().getNameDetect_lakesKeyword_0_0()); 

            }

             after(grammarAccess.getDetect_lakesAccess().getNameDetect_lakesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__NameAssignment_0"


    // $ANTLR start "rule__Detect_lakes__Number_of_lakesAssignment_2"
    // InternalMarsRover.g:2133:1: rule__Detect_lakes__Number_of_lakesAssignment_2 : ( RULE_INT ) ;
    public final void rule__Detect_lakes__Number_of_lakesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2137:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:2138:2: ( RULE_INT )
            {
            // InternalMarsRover.g:2138:2: ( RULE_INT )
            // InternalMarsRover.g:2139:3: RULE_INT
            {
             before(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDetect_lakesAccess().getNumber_of_lakesINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Number_of_lakesAssignment_2"


    // $ANTLR start "rule__Detect_lakes__Lakes_colorsAssignment_4"
    // InternalMarsRover.g:2148:1: rule__Detect_lakes__Lakes_colorsAssignment_4 : ( ruleColor ) ;
    public final void rule__Detect_lakes__Lakes_colorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2152:1: ( ( ruleColor ) )
            // InternalMarsRover.g:2153:2: ( ruleColor )
            {
            // InternalMarsRover.g:2153:2: ( ruleColor )
            // InternalMarsRover.g:2154:3: ruleColor
            {
             before(grammarAccess.getDetect_lakesAccess().getLakes_colorsColorEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getDetect_lakesAccess().getLakes_colorsColorEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__Lakes_colorsAssignment_4"


    // $ANTLR start "rule__Detect_lakes__After_examinatingAssignment_6"
    // InternalMarsRover.g:2163:1: rule__Detect_lakes__After_examinatingAssignment_6 : ( ruleafter_action ) ;
    public final void rule__Detect_lakes__After_examinatingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2167:1: ( ( ruleafter_action ) )
            // InternalMarsRover.g:2168:2: ( ruleafter_action )
            {
            // InternalMarsRover.g:2168:2: ( ruleafter_action )
            // InternalMarsRover.g:2169:3: ruleafter_action
            {
             before(grammarAccess.getDetect_lakesAccess().getAfter_examinatingAfter_actionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleafter_action();

            state._fsp--;

             after(grammarAccess.getDetect_lakesAccess().getAfter_examinatingAfter_actionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_lakes__After_examinatingAssignment_6"


    // $ANTLR start "rule__Detect_rocks__NameAssignment_0"
    // InternalMarsRover.g:2178:1: rule__Detect_rocks__NameAssignment_0 : ( ( 'detect_rocks' ) ) ;
    public final void rule__Detect_rocks__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2182:1: ( ( ( 'detect_rocks' ) ) )
            // InternalMarsRover.g:2183:2: ( ( 'detect_rocks' ) )
            {
            // InternalMarsRover.g:2183:2: ( ( 'detect_rocks' ) )
            // InternalMarsRover.g:2184:3: ( 'detect_rocks' )
            {
             before(grammarAccess.getDetect_rocksAccess().getNameDetect_rocksKeyword_0_0()); 
            // InternalMarsRover.g:2185:3: ( 'detect_rocks' )
            // InternalMarsRover.g:2186:4: 'detect_rocks'
            {
             before(grammarAccess.getDetect_rocksAccess().getNameDetect_rocksKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDetect_rocksAccess().getNameDetect_rocksKeyword_0_0()); 

            }

             after(grammarAccess.getDetect_rocksAccess().getNameDetect_rocksKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__NameAssignment_0"


    // $ANTLR start "rule__Detect_rocks__Number_of_rocksAssignment_2"
    // InternalMarsRover.g:2197:1: rule__Detect_rocks__Number_of_rocksAssignment_2 : ( RULE_INT ) ;
    public final void rule__Detect_rocks__Number_of_rocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2201:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:2202:2: ( RULE_INT )
            {
            // InternalMarsRover.g:2202:2: ( RULE_INT )
            // InternalMarsRover.g:2203:3: RULE_INT
            {
             before(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDetect_rocksAccess().getNumber_of_rocksINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__Number_of_rocksAssignment_2"


    // $ANTLR start "rule__Detect_rocks__After_examinatingAssignment_4"
    // InternalMarsRover.g:2212:1: rule__Detect_rocks__After_examinatingAssignment_4 : ( ruleafter_action ) ;
    public final void rule__Detect_rocks__After_examinatingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2216:1: ( ( ruleafter_action ) )
            // InternalMarsRover.g:2217:2: ( ruleafter_action )
            {
            // InternalMarsRover.g:2217:2: ( ruleafter_action )
            // InternalMarsRover.g:2218:3: ruleafter_action
            {
             before(grammarAccess.getDetect_rocksAccess().getAfter_examinatingAfter_actionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleafter_action();

            state._fsp--;

             after(grammarAccess.getDetect_rocksAccess().getAfter_examinatingAfter_actionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detect_rocks__After_examinatingAssignment_4"


    // $ANTLR start "rule__Push_obstacles__NameAssignment"
    // InternalMarsRover.g:2227:1: rule__Push_obstacles__NameAssignment : ( ( 'push_obstacles' ) ) ;
    public final void rule__Push_obstacles__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2231:1: ( ( ( 'push_obstacles' ) ) )
            // InternalMarsRover.g:2232:2: ( ( 'push_obstacles' ) )
            {
            // InternalMarsRover.g:2232:2: ( ( 'push_obstacles' ) )
            // InternalMarsRover.g:2233:3: ( 'push_obstacles' )
            {
             before(grammarAccess.getPush_obstaclesAccess().getNamePush_obstaclesKeyword_0()); 
            // InternalMarsRover.g:2234:3: ( 'push_obstacles' )
            // InternalMarsRover.g:2235:4: 'push_obstacles'
            {
             before(grammarAccess.getPush_obstaclesAccess().getNamePush_obstaclesKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPush_obstaclesAccess().getNamePush_obstaclesKeyword_0()); 

            }

             after(grammarAccess.getPush_obstaclesAccess().getNamePush_obstaclesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push_obstacles__NameAssignment"


    // $ANTLR start "rule__After_action__ActionAssignment_0"
    // InternalMarsRover.g:2246:1: rule__After_action__ActionAssignment_0 : ( ( rule__After_action__ActionAlternatives_0_0 ) ) ;
    public final void rule__After_action__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2250:1: ( ( ( rule__After_action__ActionAlternatives_0_0 ) ) )
            // InternalMarsRover.g:2251:2: ( ( rule__After_action__ActionAlternatives_0_0 ) )
            {
            // InternalMarsRover.g:2251:2: ( ( rule__After_action__ActionAlternatives_0_0 ) )
            // InternalMarsRover.g:2252:3: ( rule__After_action__ActionAlternatives_0_0 )
            {
             before(grammarAccess.getAfter_actionAccess().getActionAlternatives_0_0()); 
            // InternalMarsRover.g:2253:3: ( rule__After_action__ActionAlternatives_0_0 )
            // InternalMarsRover.g:2253:4: rule__After_action__ActionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__After_action__ActionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAfter_actionAccess().getActionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__ActionAssignment_0"


    // $ANTLR start "rule__After_action__IndicateAssignment_1_1"
    // InternalMarsRover.g:2261:1: rule__After_action__IndicateAssignment_1_1 : ( ruleindication ) ;
    public final void rule__After_action__IndicateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2265:1: ( ( ruleindication ) )
            // InternalMarsRover.g:2266:2: ( ruleindication )
            {
            // InternalMarsRover.g:2266:2: ( ruleindication )
            // InternalMarsRover.g:2267:3: ruleindication
            {
             before(grammarAccess.getAfter_actionAccess().getIndicateIndicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleindication();

            state._fsp--;

             after(grammarAccess.getAfter_actionAccess().getIndicateIndicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__After_action__IndicateAssignment_1_1"


    // $ANTLR start "rule__Indication__NameAssignment_0"
    // InternalMarsRover.g:2276:1: rule__Indication__NameAssignment_0 : ( ( 'with' ) ) ;
    public final void rule__Indication__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2280:1: ( ( ( 'with' ) ) )
            // InternalMarsRover.g:2281:2: ( ( 'with' ) )
            {
            // InternalMarsRover.g:2281:2: ( ( 'with' ) )
            // InternalMarsRover.g:2282:3: ( 'with' )
            {
             before(grammarAccess.getIndicationAccess().getNameWithKeyword_0_0()); 
            // InternalMarsRover.g:2283:3: ( 'with' )
            // InternalMarsRover.g:2284:4: 'with'
            {
             before(grammarAccess.getIndicationAccess().getNameWithKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIndicationAccess().getNameWithKeyword_0_0()); 

            }

             after(grammarAccess.getIndicationAccess().getNameWithKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__NameAssignment_0"


    // $ANTLR start "rule__Indication__TypeAssignment_1"
    // InternalMarsRover.g:2295:1: rule__Indication__TypeAssignment_1 : ( ( rule__Indication__TypeAlternatives_1_0 ) ) ;
    public final void rule__Indication__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2299:1: ( ( ( rule__Indication__TypeAlternatives_1_0 ) ) )
            // InternalMarsRover.g:2300:2: ( ( rule__Indication__TypeAlternatives_1_0 ) )
            {
            // InternalMarsRover.g:2300:2: ( ( rule__Indication__TypeAlternatives_1_0 ) )
            // InternalMarsRover.g:2301:3: ( rule__Indication__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getIndicationAccess().getTypeAlternatives_1_0()); 
            // InternalMarsRover.g:2302:3: ( rule__Indication__TypeAlternatives_1_0 )
            // InternalMarsRover.g:2302:4: rule__Indication__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Indication__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIndicationAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Indication__TypeAssignment_1"


    // $ANTLR start "rule__Sound__NameAssignment_0"
    // InternalMarsRover.g:2310:1: rule__Sound__NameAssignment_0 : ( ( 'sound' ) ) ;
    public final void rule__Sound__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2314:1: ( ( ( 'sound' ) ) )
            // InternalMarsRover.g:2315:2: ( ( 'sound' ) )
            {
            // InternalMarsRover.g:2315:2: ( ( 'sound' ) )
            // InternalMarsRover.g:2316:3: ( 'sound' )
            {
             before(grammarAccess.getSoundAccess().getNameSoundKeyword_0_0()); 
            // InternalMarsRover.g:2317:3: ( 'sound' )
            // InternalMarsRover.g:2318:4: 'sound'
            {
             before(grammarAccess.getSoundAccess().getNameSoundKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getNameSoundKeyword_0_0()); 

            }

             after(grammarAccess.getSoundAccess().getNameSoundKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__NameAssignment_0"


    // $ANTLR start "rule__Sound__DurationAssignment_2"
    // InternalMarsRover.g:2329:1: rule__Sound__DurationAssignment_2 : ( RULE_INT ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2333:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:2334:2: ( RULE_INT )
            {
            // InternalMarsRover.g:2334:2: ( RULE_INT )
            // InternalMarsRover.g:2335:3: RULE_INT
            {
             before(grammarAccess.getSoundAccess().getDurationINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getDurationINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__DurationAssignment_2"


    // $ANTLR start "rule__Sound__FrequencyAssignment_4"
    // InternalMarsRover.g:2344:1: rule__Sound__FrequencyAssignment_4 : ( RULE_INT ) ;
    public final void rule__Sound__FrequencyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2348:1: ( ( RULE_INT ) )
            // InternalMarsRover.g:2349:2: ( RULE_INT )
            {
            // InternalMarsRover.g:2349:2: ( RULE_INT )
            // InternalMarsRover.g:2350:3: RULE_INT
            {
             before(grammarAccess.getSoundAccess().getFrequencyINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getFrequencyINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__FrequencyAssignment_4"


    // $ANTLR start "rule__Message__NameAssignment_0"
    // InternalMarsRover.g:2359:1: rule__Message__NameAssignment_0 : ( ( 'message' ) ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2363:1: ( ( ( 'message' ) ) )
            // InternalMarsRover.g:2364:2: ( ( 'message' ) )
            {
            // InternalMarsRover.g:2364:2: ( ( 'message' ) )
            // InternalMarsRover.g:2365:3: ( 'message' )
            {
             before(grammarAccess.getMessageAccess().getNameMessageKeyword_0_0()); 
            // InternalMarsRover.g:2366:3: ( 'message' )
            // InternalMarsRover.g:2367:4: 'message'
            {
             before(grammarAccess.getMessageAccess().getNameMessageKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameMessageKeyword_0_0()); 

            }

             after(grammarAccess.getMessageAccess().getNameMessageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_0"


    // $ANTLR start "rule__Message__MsgAssignment_1"
    // InternalMarsRover.g:2378:1: rule__Message__MsgAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Message__MsgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2382:1: ( ( RULE_STRING ) )
            // InternalMarsRover.g:2383:2: ( RULE_STRING )
            {
            // InternalMarsRover.g:2383:2: ( RULE_STRING )
            // InternalMarsRover.g:2384:3: RULE_STRING
            {
             before(grammarAccess.getMessageAccess().getMsgSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMsgSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MsgAssignment_1"


    // $ANTLR start "rule__Color_indication__NameAssignment_0"
    // InternalMarsRover.g:2393:1: rule__Color_indication__NameAssignment_0 : ( ( 'color_indication' ) ) ;
    public final void rule__Color_indication__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2397:1: ( ( ( 'color_indication' ) ) )
            // InternalMarsRover.g:2398:2: ( ( 'color_indication' ) )
            {
            // InternalMarsRover.g:2398:2: ( ( 'color_indication' ) )
            // InternalMarsRover.g:2399:3: ( 'color_indication' )
            {
             before(grammarAccess.getColor_indicationAccess().getNameColor_indicationKeyword_0_0()); 
            // InternalMarsRover.g:2400:3: ( 'color_indication' )
            // InternalMarsRover.g:2401:4: 'color_indication'
            {
             before(grammarAccess.getColor_indicationAccess().getNameColor_indicationKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColor_indicationAccess().getNameColor_indicationKeyword_0_0()); 

            }

             after(grammarAccess.getColor_indicationAccess().getNameColor_indicationKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__NameAssignment_0"


    // $ANTLR start "rule__Color_indication__ColorAssignment_2"
    // InternalMarsRover.g:2412:1: rule__Color_indication__ColorAssignment_2 : ( ruleLED_Color ) ;
    public final void rule__Color_indication__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2416:1: ( ( ruleLED_Color ) )
            // InternalMarsRover.g:2417:2: ( ruleLED_Color )
            {
            // InternalMarsRover.g:2417:2: ( ruleLED_Color )
            // InternalMarsRover.g:2418:3: ruleLED_Color
            {
             before(grammarAccess.getColor_indicationAccess().getColorLED_ColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLED_Color();

            state._fsp--;

             after(grammarAccess.getColor_indicationAccess().getColorLED_ColorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color_indication__ColorAssignment_2"


    // $ANTLR start "rule__Avoid_lakes__NameAssignment"
    // InternalMarsRover.g:2427:1: rule__Avoid_lakes__NameAssignment : ( ( 'avoid_lakes' ) ) ;
    public final void rule__Avoid_lakes__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarsRover.g:2431:1: ( ( ( 'avoid_lakes' ) ) )
            // InternalMarsRover.g:2432:2: ( ( 'avoid_lakes' ) )
            {
            // InternalMarsRover.g:2432:2: ( ( 'avoid_lakes' ) )
            // InternalMarsRover.g:2433:3: ( 'avoid_lakes' )
            {
             before(grammarAccess.getAvoid_lakesAccess().getNameAvoid_lakesKeyword_0()); 
            // InternalMarsRover.g:2434:3: ( 'avoid_lakes' )
            // InternalMarsRover.g:2435:4: 'avoid_lakes'
            {
             before(grammarAccess.getAvoid_lakesAccess().getNameAvoid_lakesKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAvoid_lakesAccess().getNameAvoid_lakesKeyword_0()); 

            }

             after(grammarAccess.getAvoid_lakesAccess().getNameAvoid_lakesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avoid_lakes__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000872000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000800FE000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000009A000L});

}