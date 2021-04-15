package uk.ac.kcl.inf.languages.g2048.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.languages.g2048.services.G2048GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalG2048Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'one'", "'two'", "'three'", "'four'", "'five'", "'six'", "'seven'", "'eight'", "'nine'", "'ten'", "'eleven'", "'title'", "'size'", "'level'", "':'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalG2048Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalG2048Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalG2048Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalG2048.g"; }


    	private G2048GrammarAccess grammarAccess;

    	public void setGrammarAccess(G2048GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleG2048Program"
    // InternalG2048.g:53:1: entryRuleG2048Program : ruleG2048Program EOF ;
    public final void entryRuleG2048Program() throws RecognitionException {
        try {
            // InternalG2048.g:54:1: ( ruleG2048Program EOF )
            // InternalG2048.g:55:1: ruleG2048Program EOF
            {
             before(grammarAccess.getG2048ProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleG2048Program();

            state._fsp--;

             after(grammarAccess.getG2048ProgramRule()); 
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
    // $ANTLR end "entryRuleG2048Program"


    // $ANTLR start "ruleG2048Program"
    // InternalG2048.g:62:1: ruleG2048Program : ( ( rule__G2048Program__StatementsAssignment )* ) ;
    public final void ruleG2048Program() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:66:2: ( ( ( rule__G2048Program__StatementsAssignment )* ) )
            // InternalG2048.g:67:2: ( ( rule__G2048Program__StatementsAssignment )* )
            {
            // InternalG2048.g:67:2: ( ( rule__G2048Program__StatementsAssignment )* )
            // InternalG2048.g:68:3: ( rule__G2048Program__StatementsAssignment )*
            {
             before(grammarAccess.getG2048ProgramAccess().getStatementsAssignment()); 
            // InternalG2048.g:69:3: ( rule__G2048Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalG2048.g:69:4: rule__G2048Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__G2048Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getG2048ProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleG2048Program"


    // $ANTLR start "entryRuleStatement"
    // InternalG2048.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalG2048.g:79:1: ( ruleStatement EOF )
            // InternalG2048.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalG2048.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalG2048.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalG2048.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalG2048.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalG2048.g:94:3: ( rule__Statement__Alternatives )
            // InternalG2048.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTitleDefineStatement"
    // InternalG2048.g:103:1: entryRuleTitleDefineStatement : ruleTitleDefineStatement EOF ;
    public final void entryRuleTitleDefineStatement() throws RecognitionException {
        try {
            // InternalG2048.g:104:1: ( ruleTitleDefineStatement EOF )
            // InternalG2048.g:105:1: ruleTitleDefineStatement EOF
            {
             before(grammarAccess.getTitleDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTitleDefineStatement();

            state._fsp--;

             after(grammarAccess.getTitleDefineStatementRule()); 
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
    // $ANTLR end "entryRuleTitleDefineStatement"


    // $ANTLR start "ruleTitleDefineStatement"
    // InternalG2048.g:112:1: ruleTitleDefineStatement : ( ( rule__TitleDefineStatement__Group__0 ) ) ;
    public final void ruleTitleDefineStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:116:2: ( ( ( rule__TitleDefineStatement__Group__0 ) ) )
            // InternalG2048.g:117:2: ( ( rule__TitleDefineStatement__Group__0 ) )
            {
            // InternalG2048.g:117:2: ( ( rule__TitleDefineStatement__Group__0 ) )
            // InternalG2048.g:118:3: ( rule__TitleDefineStatement__Group__0 )
            {
             before(grammarAccess.getTitleDefineStatementAccess().getGroup()); 
            // InternalG2048.g:119:3: ( rule__TitleDefineStatement__Group__0 )
            // InternalG2048.g:119:4: rule__TitleDefineStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TitleDefineStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleDefineStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitleDefineStatement"


    // $ANTLR start "entryRuleSizeDefineStatement"
    // InternalG2048.g:128:1: entryRuleSizeDefineStatement : ruleSizeDefineStatement EOF ;
    public final void entryRuleSizeDefineStatement() throws RecognitionException {
        try {
            // InternalG2048.g:129:1: ( ruleSizeDefineStatement EOF )
            // InternalG2048.g:130:1: ruleSizeDefineStatement EOF
            {
             before(grammarAccess.getSizeDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSizeDefineStatement();

            state._fsp--;

             after(grammarAccess.getSizeDefineStatementRule()); 
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
    // $ANTLR end "entryRuleSizeDefineStatement"


    // $ANTLR start "ruleSizeDefineStatement"
    // InternalG2048.g:137:1: ruleSizeDefineStatement : ( ( rule__SizeDefineStatement__Group__0 ) ) ;
    public final void ruleSizeDefineStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:141:2: ( ( ( rule__SizeDefineStatement__Group__0 ) ) )
            // InternalG2048.g:142:2: ( ( rule__SizeDefineStatement__Group__0 ) )
            {
            // InternalG2048.g:142:2: ( ( rule__SizeDefineStatement__Group__0 ) )
            // InternalG2048.g:143:3: ( rule__SizeDefineStatement__Group__0 )
            {
             before(grammarAccess.getSizeDefineStatementAccess().getGroup()); 
            // InternalG2048.g:144:3: ( rule__SizeDefineStatement__Group__0 )
            // InternalG2048.g:144:4: rule__SizeDefineStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SizeDefineStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeDefineStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSizeDefineStatement"


    // $ANTLR start "entryRuleLevelDefineStatement"
    // InternalG2048.g:153:1: entryRuleLevelDefineStatement : ruleLevelDefineStatement EOF ;
    public final void entryRuleLevelDefineStatement() throws RecognitionException {
        try {
            // InternalG2048.g:154:1: ( ruleLevelDefineStatement EOF )
            // InternalG2048.g:155:1: ruleLevelDefineStatement EOF
            {
             before(grammarAccess.getLevelDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLevelDefineStatement();

            state._fsp--;

             after(grammarAccess.getLevelDefineStatementRule()); 
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
    // $ANTLR end "entryRuleLevelDefineStatement"


    // $ANTLR start "ruleLevelDefineStatement"
    // InternalG2048.g:162:1: ruleLevelDefineStatement : ( ( rule__LevelDefineStatement__Group__0 ) ) ;
    public final void ruleLevelDefineStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:166:2: ( ( ( rule__LevelDefineStatement__Group__0 ) ) )
            // InternalG2048.g:167:2: ( ( rule__LevelDefineStatement__Group__0 ) )
            {
            // InternalG2048.g:167:2: ( ( rule__LevelDefineStatement__Group__0 ) )
            // InternalG2048.g:168:3: ( rule__LevelDefineStatement__Group__0 )
            {
             before(grammarAccess.getLevelDefineStatementAccess().getGroup()); 
            // InternalG2048.g:169:3: ( rule__LevelDefineStatement__Group__0 )
            // InternalG2048.g:169:4: rule__LevelDefineStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefineStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevelDefineStatement"


    // $ANTLR start "ruleLevel"
    // InternalG2048.g:178:1: ruleLevel : ( ( rule__Level__Alternatives ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:182:1: ( ( ( rule__Level__Alternatives ) ) )
            // InternalG2048.g:183:2: ( ( rule__Level__Alternatives ) )
            {
            // InternalG2048.g:183:2: ( ( rule__Level__Alternatives ) )
            // InternalG2048.g:184:3: ( rule__Level__Alternatives )
            {
             before(grammarAccess.getLevelAccess().getAlternatives()); 
            // InternalG2048.g:185:3: ( rule__Level__Alternatives )
            // InternalG2048.g:185:4: rule__Level__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Level__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevel"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalG2048.g:193:1: rule__Statement__Alternatives : ( ( ruleSizeDefineStatement ) | ( ruleLevelDefineStatement ) | ( ruleTitleDefineStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:197:1: ( ( ruleSizeDefineStatement ) | ( ruleLevelDefineStatement ) | ( ruleTitleDefineStatement ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalG2048.g:198:2: ( ruleSizeDefineStatement )
                    {
                    // InternalG2048.g:198:2: ( ruleSizeDefineStatement )
                    // InternalG2048.g:199:3: ruleSizeDefineStatement
                    {
                     before(grammarAccess.getStatementAccess().getSizeDefineStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSizeDefineStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSizeDefineStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalG2048.g:204:2: ( ruleLevelDefineStatement )
                    {
                    // InternalG2048.g:204:2: ( ruleLevelDefineStatement )
                    // InternalG2048.g:205:3: ruleLevelDefineStatement
                    {
                     before(grammarAccess.getStatementAccess().getLevelDefineStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLevelDefineStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLevelDefineStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalG2048.g:210:2: ( ruleTitleDefineStatement )
                    {
                    // InternalG2048.g:210:2: ( ruleTitleDefineStatement )
                    // InternalG2048.g:211:3: ruleTitleDefineStatement
                    {
                     before(grammarAccess.getStatementAccess().getTitleDefineStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTitleDefineStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTitleDefineStatementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Level__Alternatives"
    // InternalG2048.g:220:1: rule__Level__Alternatives : ( ( ( 'one' ) ) | ( ( 'two' ) ) | ( ( 'three' ) ) | ( ( 'four' ) ) | ( ( 'five' ) ) | ( ( 'six' ) ) | ( ( 'seven' ) ) | ( ( 'eight' ) ) | ( ( 'nine' ) ) | ( ( 'ten' ) ) | ( ( 'eleven' ) ) );
    public final void rule__Level__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:224:1: ( ( ( 'one' ) ) | ( ( 'two' ) ) | ( ( 'three' ) ) | ( ( 'four' ) ) | ( ( 'five' ) ) | ( ( 'six' ) ) | ( ( 'seven' ) ) | ( ( 'eight' ) ) | ( ( 'nine' ) ) | ( ( 'ten' ) ) | ( ( 'eleven' ) ) )
            int alt3=11;
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
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalG2048.g:225:2: ( ( 'one' ) )
                    {
                    // InternalG2048.g:225:2: ( ( 'one' ) )
                    // InternalG2048.g:226:3: ( 'one' )
                    {
                     before(grammarAccess.getLevelAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalG2048.g:227:3: ( 'one' )
                    // InternalG2048.g:227:4: 'one'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalG2048.g:231:2: ( ( 'two' ) )
                    {
                    // InternalG2048.g:231:2: ( ( 'two' ) )
                    // InternalG2048.g:232:3: ( 'two' )
                    {
                     before(grammarAccess.getLevelAccess().getTwoEnumLiteralDeclaration_1()); 
                    // InternalG2048.g:233:3: ( 'two' )
                    // InternalG2048.g:233:4: 'two'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getTwoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalG2048.g:237:2: ( ( 'three' ) )
                    {
                    // InternalG2048.g:237:2: ( ( 'three' ) )
                    // InternalG2048.g:238:3: ( 'three' )
                    {
                     before(grammarAccess.getLevelAccess().getThreeEnumLiteralDeclaration_2()); 
                    // InternalG2048.g:239:3: ( 'three' )
                    // InternalG2048.g:239:4: 'three'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getThreeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalG2048.g:243:2: ( ( 'four' ) )
                    {
                    // InternalG2048.g:243:2: ( ( 'four' ) )
                    // InternalG2048.g:244:3: ( 'four' )
                    {
                     before(grammarAccess.getLevelAccess().getFourEnumLiteralDeclaration_3()); 
                    // InternalG2048.g:245:3: ( 'four' )
                    // InternalG2048.g:245:4: 'four'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getFourEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalG2048.g:249:2: ( ( 'five' ) )
                    {
                    // InternalG2048.g:249:2: ( ( 'five' ) )
                    // InternalG2048.g:250:3: ( 'five' )
                    {
                     before(grammarAccess.getLevelAccess().getFiveEnumLiteralDeclaration_4()); 
                    // InternalG2048.g:251:3: ( 'five' )
                    // InternalG2048.g:251:4: 'five'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getFiveEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalG2048.g:255:2: ( ( 'six' ) )
                    {
                    // InternalG2048.g:255:2: ( ( 'six' ) )
                    // InternalG2048.g:256:3: ( 'six' )
                    {
                     before(grammarAccess.getLevelAccess().getSixEnumLiteralDeclaration_5()); 
                    // InternalG2048.g:257:3: ( 'six' )
                    // InternalG2048.g:257:4: 'six'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getSixEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalG2048.g:261:2: ( ( 'seven' ) )
                    {
                    // InternalG2048.g:261:2: ( ( 'seven' ) )
                    // InternalG2048.g:262:3: ( 'seven' )
                    {
                     before(grammarAccess.getLevelAccess().getSevenEnumLiteralDeclaration_6()); 
                    // InternalG2048.g:263:3: ( 'seven' )
                    // InternalG2048.g:263:4: 'seven'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getSevenEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalG2048.g:267:2: ( ( 'eight' ) )
                    {
                    // InternalG2048.g:267:2: ( ( 'eight' ) )
                    // InternalG2048.g:268:3: ( 'eight' )
                    {
                     before(grammarAccess.getLevelAccess().getEightEnumLiteralDeclaration_7()); 
                    // InternalG2048.g:269:3: ( 'eight' )
                    // InternalG2048.g:269:4: 'eight'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getEightEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalG2048.g:273:2: ( ( 'nine' ) )
                    {
                    // InternalG2048.g:273:2: ( ( 'nine' ) )
                    // InternalG2048.g:274:3: ( 'nine' )
                    {
                     before(grammarAccess.getLevelAccess().getNineEnumLiteralDeclaration_8()); 
                    // InternalG2048.g:275:3: ( 'nine' )
                    // InternalG2048.g:275:4: 'nine'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getNineEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalG2048.g:279:2: ( ( 'ten' ) )
                    {
                    // InternalG2048.g:279:2: ( ( 'ten' ) )
                    // InternalG2048.g:280:3: ( 'ten' )
                    {
                     before(grammarAccess.getLevelAccess().getTenEnumLiteralDeclaration_9()); 
                    // InternalG2048.g:281:3: ( 'ten' )
                    // InternalG2048.g:281:4: 'ten'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getTenEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalG2048.g:285:2: ( ( 'eleven' ) )
                    {
                    // InternalG2048.g:285:2: ( ( 'eleven' ) )
                    // InternalG2048.g:286:3: ( 'eleven' )
                    {
                     before(grammarAccess.getLevelAccess().getElevenEnumLiteralDeclaration_10()); 
                    // InternalG2048.g:287:3: ( 'eleven' )
                    // InternalG2048.g:287:4: 'eleven'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLevelAccess().getElevenEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__Level__Alternatives"


    // $ANTLR start "rule__TitleDefineStatement__Group__0"
    // InternalG2048.g:295:1: rule__TitleDefineStatement__Group__0 : rule__TitleDefineStatement__Group__0__Impl rule__TitleDefineStatement__Group__1 ;
    public final void rule__TitleDefineStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:299:1: ( rule__TitleDefineStatement__Group__0__Impl rule__TitleDefineStatement__Group__1 )
            // InternalG2048.g:300:2: rule__TitleDefineStatement__Group__0__Impl rule__TitleDefineStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TitleDefineStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TitleDefineStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleDefineStatement__Group__0"


    // $ANTLR start "rule__TitleDefineStatement__Group__0__Impl"
    // InternalG2048.g:307:1: rule__TitleDefineStatement__Group__0__Impl : ( 'title' ) ;
    public final void rule__TitleDefineStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:311:1: ( ( 'title' ) )
            // InternalG2048.g:312:1: ( 'title' )
            {
            // InternalG2048.g:312:1: ( 'title' )
            // InternalG2048.g:313:2: 'title'
            {
             before(grammarAccess.getTitleDefineStatementAccess().getTitleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTitleDefineStatementAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleDefineStatement__Group__0__Impl"


    // $ANTLR start "rule__TitleDefineStatement__Group__1"
    // InternalG2048.g:322:1: rule__TitleDefineStatement__Group__1 : rule__TitleDefineStatement__Group__1__Impl ;
    public final void rule__TitleDefineStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:326:1: ( rule__TitleDefineStatement__Group__1__Impl )
            // InternalG2048.g:327:2: rule__TitleDefineStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TitleDefineStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleDefineStatement__Group__1"


    // $ANTLR start "rule__TitleDefineStatement__Group__1__Impl"
    // InternalG2048.g:333:1: rule__TitleDefineStatement__Group__1__Impl : ( ( rule__TitleDefineStatement__TitleAssignment_1 ) ) ;
    public final void rule__TitleDefineStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:337:1: ( ( ( rule__TitleDefineStatement__TitleAssignment_1 ) ) )
            // InternalG2048.g:338:1: ( ( rule__TitleDefineStatement__TitleAssignment_1 ) )
            {
            // InternalG2048.g:338:1: ( ( rule__TitleDefineStatement__TitleAssignment_1 ) )
            // InternalG2048.g:339:2: ( rule__TitleDefineStatement__TitleAssignment_1 )
            {
             before(grammarAccess.getTitleDefineStatementAccess().getTitleAssignment_1()); 
            // InternalG2048.g:340:2: ( rule__TitleDefineStatement__TitleAssignment_1 )
            // InternalG2048.g:340:3: rule__TitleDefineStatement__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TitleDefineStatement__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleDefineStatementAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleDefineStatement__Group__1__Impl"


    // $ANTLR start "rule__SizeDefineStatement__Group__0"
    // InternalG2048.g:349:1: rule__SizeDefineStatement__Group__0 : rule__SizeDefineStatement__Group__0__Impl rule__SizeDefineStatement__Group__1 ;
    public final void rule__SizeDefineStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:353:1: ( rule__SizeDefineStatement__Group__0__Impl rule__SizeDefineStatement__Group__1 )
            // InternalG2048.g:354:2: rule__SizeDefineStatement__Group__0__Impl rule__SizeDefineStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SizeDefineStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDefineStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeDefineStatement__Group__0"


    // $ANTLR start "rule__SizeDefineStatement__Group__0__Impl"
    // InternalG2048.g:361:1: rule__SizeDefineStatement__Group__0__Impl : ( 'size' ) ;
    public final void rule__SizeDefineStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:365:1: ( ( 'size' ) )
            // InternalG2048.g:366:1: ( 'size' )
            {
            // InternalG2048.g:366:1: ( 'size' )
            // InternalG2048.g:367:2: 'size'
            {
             before(grammarAccess.getSizeDefineStatementAccess().getSizeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSizeDefineStatementAccess().getSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeDefineStatement__Group__0__Impl"


    // $ANTLR start "rule__SizeDefineStatement__Group__1"
    // InternalG2048.g:376:1: rule__SizeDefineStatement__Group__1 : rule__SizeDefineStatement__Group__1__Impl ;
    public final void rule__SizeDefineStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:380:1: ( rule__SizeDefineStatement__Group__1__Impl )
            // InternalG2048.g:381:2: rule__SizeDefineStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SizeDefineStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeDefineStatement__Group__1"


    // $ANTLR start "rule__SizeDefineStatement__Group__1__Impl"
    // InternalG2048.g:387:1: rule__SizeDefineStatement__Group__1__Impl : ( ( rule__SizeDefineStatement__SizeAssignment_1 ) ) ;
    public final void rule__SizeDefineStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:391:1: ( ( ( rule__SizeDefineStatement__SizeAssignment_1 ) ) )
            // InternalG2048.g:392:1: ( ( rule__SizeDefineStatement__SizeAssignment_1 ) )
            {
            // InternalG2048.g:392:1: ( ( rule__SizeDefineStatement__SizeAssignment_1 ) )
            // InternalG2048.g:393:2: ( rule__SizeDefineStatement__SizeAssignment_1 )
            {
             before(grammarAccess.getSizeDefineStatementAccess().getSizeAssignment_1()); 
            // InternalG2048.g:394:2: ( rule__SizeDefineStatement__SizeAssignment_1 )
            // InternalG2048.g:394:3: rule__SizeDefineStatement__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SizeDefineStatement__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeDefineStatementAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeDefineStatement__Group__1__Impl"


    // $ANTLR start "rule__LevelDefineStatement__Group__0"
    // InternalG2048.g:403:1: rule__LevelDefineStatement__Group__0 : rule__LevelDefineStatement__Group__0__Impl rule__LevelDefineStatement__Group__1 ;
    public final void rule__LevelDefineStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:407:1: ( rule__LevelDefineStatement__Group__0__Impl rule__LevelDefineStatement__Group__1 )
            // InternalG2048.g:408:2: rule__LevelDefineStatement__Group__0__Impl rule__LevelDefineStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LevelDefineStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__0"


    // $ANTLR start "rule__LevelDefineStatement__Group__0__Impl"
    // InternalG2048.g:415:1: rule__LevelDefineStatement__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDefineStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:419:1: ( ( 'level' ) )
            // InternalG2048.g:420:1: ( 'level' )
            {
            // InternalG2048.g:420:1: ( 'level' )
            // InternalG2048.g:421:2: 'level'
            {
             before(grammarAccess.getLevelDefineStatementAccess().getLevelKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLevelDefineStatementAccess().getLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__0__Impl"


    // $ANTLR start "rule__LevelDefineStatement__Group__1"
    // InternalG2048.g:430:1: rule__LevelDefineStatement__Group__1 : rule__LevelDefineStatement__Group__1__Impl rule__LevelDefineStatement__Group__2 ;
    public final void rule__LevelDefineStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:434:1: ( rule__LevelDefineStatement__Group__1__Impl rule__LevelDefineStatement__Group__2 )
            // InternalG2048.g:435:2: rule__LevelDefineStatement__Group__1__Impl rule__LevelDefineStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LevelDefineStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__1"


    // $ANTLR start "rule__LevelDefineStatement__Group__1__Impl"
    // InternalG2048.g:442:1: rule__LevelDefineStatement__Group__1__Impl : ( ( rule__LevelDefineStatement__LevelAssignment_1 ) ) ;
    public final void rule__LevelDefineStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:446:1: ( ( ( rule__LevelDefineStatement__LevelAssignment_1 ) ) )
            // InternalG2048.g:447:1: ( ( rule__LevelDefineStatement__LevelAssignment_1 ) )
            {
            // InternalG2048.g:447:1: ( ( rule__LevelDefineStatement__LevelAssignment_1 ) )
            // InternalG2048.g:448:2: ( rule__LevelDefineStatement__LevelAssignment_1 )
            {
             before(grammarAccess.getLevelDefineStatementAccess().getLevelAssignment_1()); 
            // InternalG2048.g:449:2: ( rule__LevelDefineStatement__LevelAssignment_1 )
            // InternalG2048.g:449:3: rule__LevelDefineStatement__LevelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__LevelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefineStatementAccess().getLevelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__1__Impl"


    // $ANTLR start "rule__LevelDefineStatement__Group__2"
    // InternalG2048.g:457:1: rule__LevelDefineStatement__Group__2 : rule__LevelDefineStatement__Group__2__Impl rule__LevelDefineStatement__Group__3 ;
    public final void rule__LevelDefineStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:461:1: ( rule__LevelDefineStatement__Group__2__Impl rule__LevelDefineStatement__Group__3 )
            // InternalG2048.g:462:2: rule__LevelDefineStatement__Group__2__Impl rule__LevelDefineStatement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__LevelDefineStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__2"


    // $ANTLR start "rule__LevelDefineStatement__Group__2__Impl"
    // InternalG2048.g:469:1: rule__LevelDefineStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__LevelDefineStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:473:1: ( ( ':' ) )
            // InternalG2048.g:474:1: ( ':' )
            {
            // InternalG2048.g:474:1: ( ':' )
            // InternalG2048.g:475:2: ':'
            {
             before(grammarAccess.getLevelDefineStatementAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLevelDefineStatementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__2__Impl"


    // $ANTLR start "rule__LevelDefineStatement__Group__3"
    // InternalG2048.g:484:1: rule__LevelDefineStatement__Group__3 : rule__LevelDefineStatement__Group__3__Impl ;
    public final void rule__LevelDefineStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:488:1: ( rule__LevelDefineStatement__Group__3__Impl )
            // InternalG2048.g:489:2: rule__LevelDefineStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__3"


    // $ANTLR start "rule__LevelDefineStatement__Group__3__Impl"
    // InternalG2048.g:495:1: rule__LevelDefineStatement__Group__3__Impl : ( ( rule__LevelDefineStatement__ElementAssignment_3 ) ) ;
    public final void rule__LevelDefineStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:499:1: ( ( ( rule__LevelDefineStatement__ElementAssignment_3 ) ) )
            // InternalG2048.g:500:1: ( ( rule__LevelDefineStatement__ElementAssignment_3 ) )
            {
            // InternalG2048.g:500:1: ( ( rule__LevelDefineStatement__ElementAssignment_3 ) )
            // InternalG2048.g:501:2: ( rule__LevelDefineStatement__ElementAssignment_3 )
            {
             before(grammarAccess.getLevelDefineStatementAccess().getElementAssignment_3()); 
            // InternalG2048.g:502:2: ( rule__LevelDefineStatement__ElementAssignment_3 )
            // InternalG2048.g:502:3: rule__LevelDefineStatement__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefineStatement__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefineStatementAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__Group__3__Impl"


    // $ANTLR start "rule__G2048Program__StatementsAssignment"
    // InternalG2048.g:511:1: rule__G2048Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__G2048Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:515:1: ( ( ruleStatement ) )
            // InternalG2048.g:516:2: ( ruleStatement )
            {
            // InternalG2048.g:516:2: ( ruleStatement )
            // InternalG2048.g:517:3: ruleStatement
            {
             before(grammarAccess.getG2048ProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getG2048ProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G2048Program__StatementsAssignment"


    // $ANTLR start "rule__TitleDefineStatement__TitleAssignment_1"
    // InternalG2048.g:526:1: rule__TitleDefineStatement__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TitleDefineStatement__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:530:1: ( ( RULE_STRING ) )
            // InternalG2048.g:531:2: ( RULE_STRING )
            {
            // InternalG2048.g:531:2: ( RULE_STRING )
            // InternalG2048.g:532:3: RULE_STRING
            {
             before(grammarAccess.getTitleDefineStatementAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleDefineStatementAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleDefineStatement__TitleAssignment_1"


    // $ANTLR start "rule__SizeDefineStatement__SizeAssignment_1"
    // InternalG2048.g:541:1: rule__SizeDefineStatement__SizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__SizeDefineStatement__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:545:1: ( ( RULE_INT ) )
            // InternalG2048.g:546:2: ( RULE_INT )
            {
            // InternalG2048.g:546:2: ( RULE_INT )
            // InternalG2048.g:547:3: RULE_INT
            {
             before(grammarAccess.getSizeDefineStatementAccess().getSizeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeDefineStatementAccess().getSizeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeDefineStatement__SizeAssignment_1"


    // $ANTLR start "rule__LevelDefineStatement__LevelAssignment_1"
    // InternalG2048.g:556:1: rule__LevelDefineStatement__LevelAssignment_1 : ( ruleLevel ) ;
    public final void rule__LevelDefineStatement__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:560:1: ( ( ruleLevel ) )
            // InternalG2048.g:561:2: ( ruleLevel )
            {
            // InternalG2048.g:561:2: ( ruleLevel )
            // InternalG2048.g:562:3: ruleLevel
            {
             before(grammarAccess.getLevelDefineStatementAccess().getLevelLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLevelDefineStatementAccess().getLevelLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__LevelAssignment_1"


    // $ANTLR start "rule__LevelDefineStatement__ElementAssignment_3"
    // InternalG2048.g:571:1: rule__LevelDefineStatement__ElementAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LevelDefineStatement__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalG2048.g:575:1: ( ( RULE_STRING ) )
            // InternalG2048.g:576:2: ( RULE_STRING )
            {
            // InternalG2048.g:576:2: ( RULE_STRING )
            // InternalG2048.g:577:3: RULE_STRING
            {
             before(grammarAccess.getLevelDefineStatementAccess().getElementSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLevelDefineStatementAccess().getElementSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefineStatement__ElementAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});

}