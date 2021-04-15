package uk.ac.kcl.inf.languages.g2048.parser.antlr.internal;

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
import uk.ac.kcl.inf.languages.g2048.services.G2048GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalG2048Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'size'", "'level'", "':'", "'one'", "'two'", "'three'", "'four'", "'five'", "'six'", "'seven'", "'eight'", "'nine'", "'ten'", "'eleven'"
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

        public InternalG2048Parser(TokenStream input, G2048GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "G2048Program";
       	}

       	@Override
       	protected G2048GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleG2048Program"
    // InternalG2048.g:65:1: entryRuleG2048Program returns [EObject current=null] : iv_ruleG2048Program= ruleG2048Program EOF ;
    public final EObject entryRuleG2048Program() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG2048Program = null;


        try {
            // InternalG2048.g:65:53: (iv_ruleG2048Program= ruleG2048Program EOF )
            // InternalG2048.g:66:2: iv_ruleG2048Program= ruleG2048Program EOF
            {
             newCompositeNode(grammarAccess.getG2048ProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleG2048Program=ruleG2048Program();

            state._fsp--;

             current =iv_ruleG2048Program; 
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
    // $ANTLR end "entryRuleG2048Program"


    // $ANTLR start "ruleG2048Program"
    // InternalG2048.g:72:1: ruleG2048Program returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleG2048Program() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalG2048.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalG2048.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalG2048.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalG2048.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalG2048.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalG2048.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getG2048ProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getG2048ProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.languages.g2048.G2048.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleG2048Program"


    // $ANTLR start "entryRuleStatement"
    // InternalG2048.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalG2048.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalG2048.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalG2048.g:108:1: ruleStatement returns [EObject current=null] : (this_SizeDefineStatement_0= ruleSizeDefineStatement | this_LevelDefineStatement_1= ruleLevelDefineStatement | this_TitleDefineStatement_2= ruleTitleDefineStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SizeDefineStatement_0 = null;

        EObject this_LevelDefineStatement_1 = null;

        EObject this_TitleDefineStatement_2 = null;



        	enterRule();

        try {
            // InternalG2048.g:114:2: ( (this_SizeDefineStatement_0= ruleSizeDefineStatement | this_LevelDefineStatement_1= ruleLevelDefineStatement | this_TitleDefineStatement_2= ruleTitleDefineStatement ) )
            // InternalG2048.g:115:2: (this_SizeDefineStatement_0= ruleSizeDefineStatement | this_LevelDefineStatement_1= ruleLevelDefineStatement | this_TitleDefineStatement_2= ruleTitleDefineStatement )
            {
            // InternalG2048.g:115:2: (this_SizeDefineStatement_0= ruleSizeDefineStatement | this_LevelDefineStatement_1= ruleLevelDefineStatement | this_TitleDefineStatement_2= ruleTitleDefineStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 11:
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
                    // InternalG2048.g:116:3: this_SizeDefineStatement_0= ruleSizeDefineStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSizeDefineStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SizeDefineStatement_0=ruleSizeDefineStatement();

                    state._fsp--;


                    			current = this_SizeDefineStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalG2048.g:125:3: this_LevelDefineStatement_1= ruleLevelDefineStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLevelDefineStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LevelDefineStatement_1=ruleLevelDefineStatement();

                    state._fsp--;


                    			current = this_LevelDefineStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalG2048.g:134:3: this_TitleDefineStatement_2= ruleTitleDefineStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTitleDefineStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TitleDefineStatement_2=ruleTitleDefineStatement();

                    state._fsp--;


                    			current = this_TitleDefineStatement_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTitleDefineStatement"
    // InternalG2048.g:146:1: entryRuleTitleDefineStatement returns [EObject current=null] : iv_ruleTitleDefineStatement= ruleTitleDefineStatement EOF ;
    public final EObject entryRuleTitleDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleDefineStatement = null;


        try {
            // InternalG2048.g:146:61: (iv_ruleTitleDefineStatement= ruleTitleDefineStatement EOF )
            // InternalG2048.g:147:2: iv_ruleTitleDefineStatement= ruleTitleDefineStatement EOF
            {
             newCompositeNode(grammarAccess.getTitleDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleDefineStatement=ruleTitleDefineStatement();

            state._fsp--;

             current =iv_ruleTitleDefineStatement; 
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
    // $ANTLR end "entryRuleTitleDefineStatement"


    // $ANTLR start "ruleTitleDefineStatement"
    // InternalG2048.g:153:1: ruleTitleDefineStatement returns [EObject current=null] : (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitleDefineStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;


        	enterRule();

        try {
            // InternalG2048.g:159:2: ( (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // InternalG2048.g:160:2: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // InternalG2048.g:160:2: (otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) ) )
            // InternalG2048.g:161:3: otherlv_0= 'title' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleDefineStatementAccess().getTitleKeyword_0());
            		
            // InternalG2048.g:165:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalG2048.g:166:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalG2048.g:166:4: (lv_title_1_0= RULE_STRING )
            // InternalG2048.g:167:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_title_1_0, grammarAccess.getTitleDefineStatementAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleDefineStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
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
    // $ANTLR end "ruleTitleDefineStatement"


    // $ANTLR start "entryRuleSizeDefineStatement"
    // InternalG2048.g:187:1: entryRuleSizeDefineStatement returns [EObject current=null] : iv_ruleSizeDefineStatement= ruleSizeDefineStatement EOF ;
    public final EObject entryRuleSizeDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeDefineStatement = null;


        try {
            // InternalG2048.g:187:60: (iv_ruleSizeDefineStatement= ruleSizeDefineStatement EOF )
            // InternalG2048.g:188:2: iv_ruleSizeDefineStatement= ruleSizeDefineStatement EOF
            {
             newCompositeNode(grammarAccess.getSizeDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeDefineStatement=ruleSizeDefineStatement();

            state._fsp--;

             current =iv_ruleSizeDefineStatement; 
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
    // $ANTLR end "entryRuleSizeDefineStatement"


    // $ANTLR start "ruleSizeDefineStatement"
    // InternalG2048.g:194:1: ruleSizeDefineStatement returns [EObject current=null] : (otherlv_0= 'size' ( (lv_size_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSizeDefineStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;


        	enterRule();

        try {
            // InternalG2048.g:200:2: ( (otherlv_0= 'size' ( (lv_size_1_0= RULE_INT ) ) ) )
            // InternalG2048.g:201:2: (otherlv_0= 'size' ( (lv_size_1_0= RULE_INT ) ) )
            {
            // InternalG2048.g:201:2: (otherlv_0= 'size' ( (lv_size_1_0= RULE_INT ) ) )
            // InternalG2048.g:202:3: otherlv_0= 'size' ( (lv_size_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeDefineStatementAccess().getSizeKeyword_0());
            		
            // InternalG2048.g:206:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalG2048.g:207:4: (lv_size_1_0= RULE_INT )
            {
            // InternalG2048.g:207:4: (lv_size_1_0= RULE_INT )
            // InternalG2048.g:208:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_size_1_0, grammarAccess.getSizeDefineStatementAccess().getSizeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeDefineStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_1_0,
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
    // $ANTLR end "ruleSizeDefineStatement"


    // $ANTLR start "entryRuleLevelDefineStatement"
    // InternalG2048.g:228:1: entryRuleLevelDefineStatement returns [EObject current=null] : iv_ruleLevelDefineStatement= ruleLevelDefineStatement EOF ;
    public final EObject entryRuleLevelDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelDefineStatement = null;


        try {
            // InternalG2048.g:228:61: (iv_ruleLevelDefineStatement= ruleLevelDefineStatement EOF )
            // InternalG2048.g:229:2: iv_ruleLevelDefineStatement= ruleLevelDefineStatement EOF
            {
             newCompositeNode(grammarAccess.getLevelDefineStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevelDefineStatement=ruleLevelDefineStatement();

            state._fsp--;

             current =iv_ruleLevelDefineStatement; 
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
    // $ANTLR end "entryRuleLevelDefineStatement"


    // $ANTLR start "ruleLevelDefineStatement"
    // InternalG2048.g:235:1: ruleLevelDefineStatement returns [EObject current=null] : (otherlv_0= 'level' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= ':' ( (lv_element_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLevelDefineStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_element_3_0=null;
        Enumerator lv_level_1_0 = null;



        	enterRule();

        try {
            // InternalG2048.g:241:2: ( (otherlv_0= 'level' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= ':' ( (lv_element_3_0= RULE_STRING ) ) ) )
            // InternalG2048.g:242:2: (otherlv_0= 'level' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= ':' ( (lv_element_3_0= RULE_STRING ) ) )
            {
            // InternalG2048.g:242:2: (otherlv_0= 'level' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= ':' ( (lv_element_3_0= RULE_STRING ) ) )
            // InternalG2048.g:243:3: otherlv_0= 'level' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= ':' ( (lv_element_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelDefineStatementAccess().getLevelKeyword_0());
            		
            // InternalG2048.g:247:3: ( (lv_level_1_0= ruleLevel ) )
            // InternalG2048.g:248:4: (lv_level_1_0= ruleLevel )
            {
            // InternalG2048.g:248:4: (lv_level_1_0= ruleLevel )
            // InternalG2048.g:249:5: lv_level_1_0= ruleLevel
            {

            					newCompositeNode(grammarAccess.getLevelDefineStatementAccess().getLevelLevelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_level_1_0=ruleLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelDefineStatementRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_1_0,
            						"uk.ac.kcl.inf.languages.g2048.G2048.Level");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelDefineStatementAccess().getColonKeyword_2());
            		
            // InternalG2048.g:270:3: ( (lv_element_3_0= RULE_STRING ) )
            // InternalG2048.g:271:4: (lv_element_3_0= RULE_STRING )
            {
            // InternalG2048.g:271:4: (lv_element_3_0= RULE_STRING )
            // InternalG2048.g:272:5: lv_element_3_0= RULE_STRING
            {
            lv_element_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_element_3_0, grammarAccess.getLevelDefineStatementAccess().getElementSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDefineStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_3_0,
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
    // $ANTLR end "ruleLevelDefineStatement"


    // $ANTLR start "ruleLevel"
    // InternalG2048.g:292:1: ruleLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'two' ) | (enumLiteral_2= 'three' ) | (enumLiteral_3= 'four' ) | (enumLiteral_4= 'five' ) | (enumLiteral_5= 'six' ) | (enumLiteral_6= 'seven' ) | (enumLiteral_7= 'eight' ) | (enumLiteral_8= 'nine' ) | (enumLiteral_9= 'ten' ) | (enumLiteral_10= 'eleven' ) ) ;
    public final Enumerator ruleLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalG2048.g:298:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'two' ) | (enumLiteral_2= 'three' ) | (enumLiteral_3= 'four' ) | (enumLiteral_4= 'five' ) | (enumLiteral_5= 'six' ) | (enumLiteral_6= 'seven' ) | (enumLiteral_7= 'eight' ) | (enumLiteral_8= 'nine' ) | (enumLiteral_9= 'ten' ) | (enumLiteral_10= 'eleven' ) ) )
            // InternalG2048.g:299:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'two' ) | (enumLiteral_2= 'three' ) | (enumLiteral_3= 'four' ) | (enumLiteral_4= 'five' ) | (enumLiteral_5= 'six' ) | (enumLiteral_6= 'seven' ) | (enumLiteral_7= 'eight' ) | (enumLiteral_8= 'nine' ) | (enumLiteral_9= 'ten' ) | (enumLiteral_10= 'eleven' ) )
            {
            // InternalG2048.g:299:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'two' ) | (enumLiteral_2= 'three' ) | (enumLiteral_3= 'four' ) | (enumLiteral_4= 'five' ) | (enumLiteral_5= 'six' ) | (enumLiteral_6= 'seven' ) | (enumLiteral_7= 'eight' ) | (enumLiteral_8= 'nine' ) | (enumLiteral_9= 'ten' ) | (enumLiteral_10= 'eleven' ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            case 23:
                {
                alt3=9;
                }
                break;
            case 24:
                {
                alt3=10;
                }
                break;
            case 25:
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
                    // InternalG2048.g:300:3: (enumLiteral_0= 'one' )
                    {
                    // InternalG2048.g:300:3: (enumLiteral_0= 'one' )
                    // InternalG2048.g:301:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLevelAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalG2048.g:308:3: (enumLiteral_1= 'two' )
                    {
                    // InternalG2048.g:308:3: (enumLiteral_1= 'two' )
                    // InternalG2048.g:309:4: enumLiteral_1= 'two'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getTwoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLevelAccess().getTwoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalG2048.g:316:3: (enumLiteral_2= 'three' )
                    {
                    // InternalG2048.g:316:3: (enumLiteral_2= 'three' )
                    // InternalG2048.g:317:4: enumLiteral_2= 'three'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getThreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLevelAccess().getThreeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalG2048.g:324:3: (enumLiteral_3= 'four' )
                    {
                    // InternalG2048.g:324:3: (enumLiteral_3= 'four' )
                    // InternalG2048.g:325:4: enumLiteral_3= 'four'
                    {
                    enumLiteral_3=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getFourEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLevelAccess().getFourEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalG2048.g:332:3: (enumLiteral_4= 'five' )
                    {
                    // InternalG2048.g:332:3: (enumLiteral_4= 'five' )
                    // InternalG2048.g:333:4: enumLiteral_4= 'five'
                    {
                    enumLiteral_4=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getFiveEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLevelAccess().getFiveEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalG2048.g:340:3: (enumLiteral_5= 'six' )
                    {
                    // InternalG2048.g:340:3: (enumLiteral_5= 'six' )
                    // InternalG2048.g:341:4: enumLiteral_5= 'six'
                    {
                    enumLiteral_5=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getSixEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLevelAccess().getSixEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalG2048.g:348:3: (enumLiteral_6= 'seven' )
                    {
                    // InternalG2048.g:348:3: (enumLiteral_6= 'seven' )
                    // InternalG2048.g:349:4: enumLiteral_6= 'seven'
                    {
                    enumLiteral_6=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getSevenEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getLevelAccess().getSevenEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalG2048.g:356:3: (enumLiteral_7= 'eight' )
                    {
                    // InternalG2048.g:356:3: (enumLiteral_7= 'eight' )
                    // InternalG2048.g:357:4: enumLiteral_7= 'eight'
                    {
                    enumLiteral_7=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getEightEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getLevelAccess().getEightEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalG2048.g:364:3: (enumLiteral_8= 'nine' )
                    {
                    // InternalG2048.g:364:3: (enumLiteral_8= 'nine' )
                    // InternalG2048.g:365:4: enumLiteral_8= 'nine'
                    {
                    enumLiteral_8=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getNineEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getLevelAccess().getNineEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalG2048.g:372:3: (enumLiteral_9= 'ten' )
                    {
                    // InternalG2048.g:372:3: (enumLiteral_9= 'ten' )
                    // InternalG2048.g:373:4: enumLiteral_9= 'ten'
                    {
                    enumLiteral_9=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getTenEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getLevelAccess().getTenEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalG2048.g:380:3: (enumLiteral_10= 'eleven' )
                    {
                    // InternalG2048.g:380:3: (enumLiteral_10= 'eleven' )
                    // InternalG2048.g:381:4: enumLiteral_10= 'eleven'
                    {
                    enumLiteral_10=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getLevelAccess().getElevenEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getLevelAccess().getElevenEnumLiteralDeclaration_10());
                    			

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
    // $ANTLR end "ruleLevel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}