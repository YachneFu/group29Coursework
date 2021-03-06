package uk.ac.kcl.inf.languages.g2048.library;

import java.util.HashMap;

public class TestG2048 {

	public static void main(String[] args) {
        
		int topValue=0;
		String title="";
		int mapsize=0;
		
        HashMap<Integer, String> elements = new HashMap<Integer,String>();
        elements.put(0,"");
        title="Chemistry";
        mapsize=5;
        elements.put(2,"H");topValue=2;
        
        elements.put(4,"He");topValue=4;
        
        elements.put(8,"Li");topValue=8;
        
        elements.put(16,"Be");topValue=16;
        
        elements.put(32,"B");topValue=32;
        
        new G2048Frame(title,mapsize,elements,topValue);
        
    }
}


