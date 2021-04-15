package uk.ac.kcl.inf.languages.g2048.library;

import java.awt.Color;
import java.awt.Font;

public class Cell {
	public int value;
	public String name;
	

    public Cell(){
    	value = 0;
    }

	public Color getBackground() {
		if(value==0) return new Color(0xcdc1b4);
		if(value==2) return new Color(0xeee4da);
		if(value==4) return new Color(0xede0c8);
		if(value==8) return new Color(0xf2b179);
		if(value==16) return new Color(0xf59563);
		if(value==32) return new Color(0xf67c5f);
		if(value==64) return new Color(0xf65e3b);
		if(value==128) return new Color(0xedcf72);
		if(value==256) return new Color(0xedcc61);
		if(value==512) return new Color(0xedc850);
		if(value==1024) return new Color(0xedc53f);
		if(value==2048) return new Color(0xedc22e);
		return new Color(0x248c51);
	}
	public Font getCellFont() {
		return new Font("Arial", Font.BOLD, 28);
	}

	public Color getForeground() {
		if(value==0)return new Color(0x248c51);
		if(value==2||value==4)return Color.BLACK;
		return Color.WHITE;
	}

}
