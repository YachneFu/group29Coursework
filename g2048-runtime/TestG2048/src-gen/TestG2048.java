import java.util.HashMap;
import uk.ac.kcl.inf.languages.g2048.library.*;

public class TestG2048 {

	public static void main(String[] args) {
        
		int topValue=0;
		String title="";
		int mapsize=0;
		
        HashMap<Integer, String> elements = new HashMap<Integer,String>();
        elements.put(0,"");
        title="2048";
        mapsize=4;
        elements.put(2,"2");topValue=2;
        
        elements.put(4,"4");topValue=4;
        
        elements.put(8,"8");topValue=8;
        
        elements.put(16,"16");topValue=16;
        
        elements.put(32,"32");topValue=32;
        
        elements.put(64,"64");topValue=64;
        
        elements.put(128,"128");topValue=128;
        
        elements.put(256,"256");topValue=256;
        
        elements.put(512,"512");topValue=512;
        
        elements.put(1024,"1024");topValue=1024;
        
        elements.put(2048,"2048");topValue=2048;
        
        new G2048Frame(title,mapsize,elements,topValue);
        
    }
}

