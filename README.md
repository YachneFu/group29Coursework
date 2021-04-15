# group29Coursework
7CCSMMDD Coursework. Group 29:  Fu, Yangchen (K20026015)  Lee, Wai Kit Jay (K2037139)

Model Project: 
uk.ac.kcl.inf.languages.g2048;
uk.ac.kcl.inf.languages.g2048.ide;
uk.ac.kcl.inf.languages.g2048.tests;
uk.ac.kcl.inf.languages.g2048.ui;
uk.ac.kcl.inf.languages.g2048.ui.tests;

The dependencies of uk.ac.kcl.inf.languages.g2048 should be as follows.
 org.eclipse.xtext,
 org.eclipse.xtext.xbase,
 org.eclipse.equinox.common;,
 org.eclipse.emf.ecore,
 org.eclipse.xtext.xbase.lib;,
 org.eclipse.xtext.util,
 org.eclipse.emf.common,
 org.antlr.runtime;,
 it.xsemantics.runtime;

G2048.xtext inside uk.ac.kcl.inf.languages.g2048 describes the model

G2048Validator.xtend inside uk.ac.kcl.inf.languages.g2048.validation desribes validation that extends Type Checking g2048Types.xsemantics in uk.ac.kcl.inf.languages.g2048.typing


RUN TIME SETUP:

Right click on uk.ac.kcl.inf.languages.g2048，Run As... → Run configurations, set the workspace data location as the location of g2048-runtime folder.

AFTER SETUP:

In test.g2048 of TestG2048, you can input text in our lanugage. Available statement are：

title "the name of your game"

size Integer

level one/two/three/...../eleven:"the element name of this level"

This is an example:

title "Chemistry"

size 5

level one:"H"

level two:"He"

level three:"Li"

level four:"Be"

level five:"B"

After you save the test.g2048, TestG2048.java should be generated in src-gen. If there are errors in code, please copy the entire code in the main function and paste it into the main function of TestG2048.java in uk.ac.kcl.inf.languages.g2048.library. Then you can run it as Java application.

Screenshot to explain the above instruction: ![Image text](https://gyazo.com/3bc72e0f0777ee9603d072f435b6796b)

There are 3 automated test cases in uk.ac.kcl.inf.languages.g2048.xpect. If it doesn't work try and add it.xsemantics.runtime to the dependencies.

Screenshot of XPECT tests: ![Image text](https://gyazo.com/e237b87149cd28178afebea071ee25fc)
