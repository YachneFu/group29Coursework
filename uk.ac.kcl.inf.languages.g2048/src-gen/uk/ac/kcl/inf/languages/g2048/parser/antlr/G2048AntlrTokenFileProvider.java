/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class G2048AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/languages/g2048/parser/antlr/internal/InternalG2048.tokens");
	}
}
