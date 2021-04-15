/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.languages.g2048.g2048.G2048Program
import uk.ac.kcl.inf.languages.g2048.g2048.LevelDefineStatement
import uk.ac.kcl.inf.languages.g2048.g2048.Statement
import uk.ac.kcl.inf.languages.g2048.g2048.SizeDefineStatement
import uk.ac.kcl.inf.languages.g2048.g2048.TitleDefineStatement
import uk.ac.kcl.inf.languages.g2048.g2048.Level

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class G2048Generator extends AbstractGenerator {


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as G2048Program
		val className = resource.deriveClassNameFor
		fsa.generateFile(className + '.java', model.doGenerateClass(className))
	}
	
	def deriveClassNameFor(Resource resource) {
		val origName = resource.URI.lastSegment
		
		origName.substring(0, origName.indexOf('.')).toFirstUpper + 'G2048'
	}
	
	def String doGenerateClass(G2048Program program, String className) '''
	import java.util.HashMap;
	import uk.ac.kcl.inf.languages.g2048.library.*;
	
	public class «className» {
	
		public static void main(String[] args) {
	        
			int topValue=0;
			String title="";
			int mapsize=0;
			
	        HashMap<Integer, String> elements = new HashMap<Integer,String>();
	        elements.put(0,"");
	        «program.statements.map[generateJavaStatement].join('\n')»
	        
	        new G2048Frame(title,mapsize,elements,topValue);
	        
	    }
	}
	
	'''
	
	
	dispatch def String generateJavaStatement(Statement stmt) ''''''
	dispatch def String generateJavaStatement(TitleDefineStatement stmt) 
	'''title="«stmt.title»";'''
	
	dispatch def String generateJavaStatement(SizeDefineStatement stmt) 
	'''mapsize=«stmt.size»;'''
	//.getName.toFirstUpper»(«stmt.steps.generateJavaExpression»)
	dispatch def String generateJavaStatement(LevelDefineStatement stmt)
	 '''elements.put(«if(stmt.level === Level.ONE)'''2,"«stmt.element»");topValue=2;'''
	 	else if(stmt.level === Level.TWO)'''4,"«stmt.element»");topValue=4;'''
	 	else if(stmt.level === Level.THREE)'''8,"«stmt.element»");topValue=8;'''
	 	else if(stmt.level === Level.FOUR)'''16,"«stmt.element»");topValue=16;'''
	 	else if(stmt.level === Level.FIVE)'''32,"«stmt.element»");topValue=32;'''
	 	else if(stmt.level === Level.SIX)'''64,"«stmt.element»");topValue=64;'''
	 	else if(stmt.level === Level.SEVEN)'''128,"«stmt.element»");topValue=128;'''
	 	else if(stmt.level === Level.EIGHT)'''256,"«stmt.element»");topValue=256;'''
	 	else if(stmt.level === Level.NINE)'''512,"«stmt.element»");topValue=512;'''
	 	else if(stmt.level === Level.TEN)'''1024,"«stmt.element»");topValue=1024;'''
	 	else if(stmt.level === Level.ELEVEN)'''2048,"«stmt.element»");topValue=2048;'''
	 	»
	'''



}
