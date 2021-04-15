package uk.ac.kcl.inf.languages.g2048.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.ac.kcl.inf.languages.g2048.typing.g2048TypeSystem;
import uk.ac.kcl.inf.languages.g2048.validation.AbstractG2048Validator;

@SuppressWarnings("all")
public class g2048TypeSystemValidator extends AbstractG2048Validator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected g2048TypeSystem xsemanticsSystem;
  
  protected g2048TypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
