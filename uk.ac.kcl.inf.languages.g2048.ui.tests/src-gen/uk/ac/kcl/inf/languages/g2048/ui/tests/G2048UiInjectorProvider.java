/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.inf.languages.g2048.ui.internal.G2048Activator;

public class G2048UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return G2048Activator.getInstance().getInjector("uk.ac.kcl.inf.languages.g2048.G2048");
	}

}
