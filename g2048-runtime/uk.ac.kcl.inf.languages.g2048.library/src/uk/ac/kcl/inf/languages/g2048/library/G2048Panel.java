package uk.ac.kcl.inf.languages.g2048.library;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.FontMetrics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class G2048Panel extends JPanel implements KeyListener{

    private static int scores = 0;
    private Cell[][] Cells; 
    private boolean isadd = true;  
    int n;

    int CHART_GAP = 10;
    int CHART_ARC = 20;
    int CHART_SIZE = 86;
    HashMap<Integer, String> elements;
    int topValue;
    
    public G2048Panel(int x, HashMap<Integer,String> elements, int topValue) {
    	n=x;
    	this.elements=elements;
    	this.topValue=topValue;
        initGame(); 
    }

	private void initGame() {
        scores = 0;
        System.out.println("initGame");
        Cells= new Cell[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
            	Cells[row][col] = new Cell(); 
            }
        }
     
        for (int i = 0; i < 2; i++){
            isadd = true;
            creatCell();  
        }	
	}

	private void creatCell() {
		List<Cell> list = getEmptyCells();  
		 
        if (!list.isEmpty() && isadd) {  
            Random random = new Random();
            int index = random.nextInt(list.size());
            Cell Cell = list.get(index);

            Cell.value = (random.nextInt(4) % 3 == 0) ? 2 : 4;
            isadd = false;
        }
		
	}

	private List<Cell> getEmptyCells() {
		 List<Cell> CellList = new ArrayList<>();
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++){
	                if (Cells[i][j].value == 0){
	                	CellList.add(Cells[i][j]);
	                }
	            }
	        }
	        return CellList;
	}
	
    
    private boolean moveUp() {
        for (int j = 0; j < n; j++) {
            for (int i = 1, index = 0; i < n; i++) {
                if (Cells[i][j].value > 0) {
                    if (Cells[i][j].value == Cells[index][j].value) {
                        scores += Cells[i][j].value + Cells[index][j].value;
                        Cells[index][j].value = Cells[i][j].value + Cells[index][j].value;
                        Cells[i][j].value = 0;
                        index += 1;
                        isadd = true;
                    }
                    else if (Cells[index][j].value == 0) {

                    	Cells[index][j].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                    else if (Cells[++index][j].value == 0) {
                    	Cells[index][j].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                }
            }
        }
        return isadd;
    }
    
    
    private boolean moveDown(){
        System.out.println("MoveDown");
        for (int j = 0; j < n; j++) {
            for (int i = n-2, index = n-1; i >= 0; i--) {
                if (Cells[i][j].value > 0) {
                    if (Cells[i][j].value == Cells[index][j].value) {
                        scores += Cells[i][j].value + Cells[index][j].value;
                        Cells[index][j].value = Cells[i][j].value + Cells[index][j].value;
                        Cells[i][j].value = 0;
                        index -= 1;
                        isadd = true;
                    }
                    else if (Cells[index][j].value == 0) {
                    	Cells[index][j].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                    else if (Cells[--index][j].value == 0) {
                    	Cells[index][j].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                }
            }
        }
        return isadd;
    }
    
    private boolean moveLeft(){
        for (int i = 0; i < n; i++) {
            for (int j = 1, index = 0; j < n; j++) {
                if (Cells[i][j].value > 0) {
                    if (Cells[i][j].value == Cells[i][index].value) {
                        scores += Cells[i][j].value + Cells[i][index].value;
                        Cells[i][index].value = Cells[i][index].value + Cells[i][j].value;
                        Cells[i][j].value = 0;
                        index += 1;
                        isadd = true;
                    }
                   
                    else if (Cells[i][index].value == 0) {

                    	Cells[i][index].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                    else if (Cells[i][++index].value == 0) {
                    	Cells[i][index].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                }
            }
        }
 
        return isadd;
    }
    
    
    private boolean moveRight(){
        for (int i = 0; i < n; i++) {
            for (int j = n-2, index = n-1; j >= 0; j--) {
                if (Cells[i][j].value > 0) {
                    if (Cells[i][j].value == Cells[i][index].value) {
                        scores += Cells[i][j].value + Cells[i][index].value;
                        Cells[i][index].value = Cells[i][j].value + Cells[i][index].value;
                        Cells[i][j].value = 0;
                        index -= 1;
                        isadd = true;
                    }
                    else if (Cells[i][index].value == 0) {
                    	Cells[i][index].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                    else if (Cells[i][--index].value == 0) {
                    	Cells[i][index].value = Cells[i][j].value;
                    	Cells[i][j].value = 0;
                        isadd = true;
                    }
                }
            }
        }
        return isadd;
    }
    
    private boolean judgeGameOver(){
        
        G2048Frame.lscore.setText(scores + "");
 
        
        if (!getEmptyCells().isEmpty()){
            return false;
        }
 
        
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (Cells[i][j].value == Cells[i][j + 1].value
                    || Cells[i][j].value == Cells[i + 1][j].value){
                    return false;
                }
            }
        }
        
        return true;
    }
 
    private boolean judgeGameSuccess() {
        
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                if (Cells[i][j].value == topValue) {
                    return true;
                }
            }
        }
        return false;
    }
    
   
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                drawChart(g, i, j);
            }
        }
 
       
        if (judgeGameOver()){
            g.setColor(new Color(64, 64, 64, 150));
            g.fillRect(0, 0, getWidth(), getHeight());  
            g.setColor(Color.WHITE);  
            g.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = getFontMetrics(new Font("Arial", Font.BOLD, 50));
            String value = "GAME OVER";  // 
            g.drawString(value,
                    (getWidth() - fm.stringWidth(value)) / 2,
                    getHeight() / 2);
        }  
 
        
        if (judgeGameSuccess()) {
            g.setColor(new Color(64, 64, 64, 150));
            g.fillRect(0, 0, getWidth(), getHeight());  
            g.setColor(Color.RED);  
            g.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = getFontMetrics(new Font("Arial", Font.BOLD, 50));
            String value = "CLEAR";  
            g.drawString(value,
                    (getWidth() - fm.stringWidth(value)) / 2,
                    getHeight() / 2);
          
        }
    }
 
    
    private void drawChart(Graphics g, int i, int j){

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
  
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_NORMALIZE);
 
        Cell Cell = Cells[i][j];
        g2d.setColor(Cell.getBackground());  

        g2d.fillRoundRect(CHART_GAP + (CHART_GAP + CHART_SIZE) * j,
                CHART_GAP + (CHART_GAP + CHART_SIZE) * i,
                CHART_SIZE, CHART_SIZE, CHART_ARC, CHART_ARC);
        g2d.setColor(Cell.getForeground());  
        g2d.setFont(Cell.getCellFont());   
 

        FontMetrics fm = getFontMetrics(Cell.getCellFont());
//        String value = String.valueOf(Cell.value);
        String value=elements.get(Cell.value);
        System.out.println(value);
        g2d.drawString(value,
                CHART_GAP + (CHART_GAP + CHART_SIZE) * j +
                        (CHART_SIZE - fm.stringWidth(value)) / 2,
                CHART_GAP + (CHART_GAP + CHART_SIZE) * i +
                        (CHART_SIZE - fm.getAscent() - fm.getDescent()) / 2
                        + fm.getAscent());
 
    }


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()){

            case KeyEvent.VK_ESCAPE:
                System.out.println("esc");
                initGame(); 
                break;

            case KeyEvent.VK_UP:
                moveUp();  
                creatCell();  
                break;

            case KeyEvent.VK_DOWN:
                moveDown();  
                creatCell();  
                break;

            case KeyEvent.VK_LEFT:
                moveLeft();  
                creatCell();  
                break;

            case KeyEvent.VK_RIGHT:
                moveRight();  
                creatCell();  
                break;

            default:
                break;
        }
        repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
