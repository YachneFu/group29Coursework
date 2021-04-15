/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.languages.g2048.parser.antlr.internal.InternalG2048Parser;
import uk.ac.kcl.inf.languages.g2048.services.G2048GrammarAccess;

public class G2048Parser extends AbstractAntlrParser {

	@Inject
	private G2048GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalG2048Parser createParser(XtextTokenStream stream) {
		return new InternalG2048Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "G2048Program";
	}

	public G2048GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(G2048GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
