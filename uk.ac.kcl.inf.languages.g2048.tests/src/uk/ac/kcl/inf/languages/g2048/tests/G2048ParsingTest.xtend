/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import uk.ac.kcl.inf.languages.g2048.g2048.G2048Program

@ExtendWith(InjectionExtension)
@InjectWith(G2048InjectorProvider)
class G2048ParsingTest {
	@Inject
	ParseHelper<G2048Program> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
