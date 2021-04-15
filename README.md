# group29Coursework
7CCSMMDD Coursework. Group 29:  Fu, Yangchen (K20026015)  Lee, Wai Kit Jay (K2037139)

Import uk.ac.kcl.inf.languages.g2048;
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

Right click on uk.ac.kcl.inf.languages.g2048，Run As... → Run configurations, set the workspace data location as the location of g2048-runtime folder.
In runtime Eclipse, there is test.g2048 of TestG2048, you can input text in our lanugage. Available statement：
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

After you save the test.g2048, TestG2048.java should be generated in src-gen. If there are errors, please copy the code in the main function and paste it into the main function of TestG2048.java in uk.ac.kcl.inf.languages.g2048.library. Then you can run it as Java application.

There are 3 automated test cases in uk.ac.kcl.inf.languages.g2048.xpect.

