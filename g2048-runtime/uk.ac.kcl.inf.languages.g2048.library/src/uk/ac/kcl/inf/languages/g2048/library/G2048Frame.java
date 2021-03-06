package uk.ac.kcl.inf.languages.g2048.library;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.util.HashMap;
import javax.swing.*;

public class G2048Frame {
	public static JLabel lscore;
	public G2048Frame(String title,int n, HashMap<Integer,String> elements, int topValue) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(title);
        frame.setSize(400+100*(n-4), 530+100*(n-4)); // width * height
        frame.setResizable(false); 
        frame.setVisible(true); 
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
        frame.setLayout(null); 
 

        JLabel ltitle = new JLabel(title, JLabel.CENTER);
        frame.add(ltitle);
        ltitle.setFont(new Font("Arial", Font.BOLD, 50)); 
        ltitle.setForeground(Color.BLACK);
        ltitle.setBounds(0, 0, 250, 60);
 
   
        JLabel lscorename = new JLabel("Score", JLabel.CENTER);
        frame.add(lscorename);
        lscorename.setFont(new Font("Arial", Font.BOLD, 28)); 
        lscorename.setForeground(Color.WHITE);
        lscorename.setOpaque(true); //
        lscorename.setBackground(Color.GRAY);
        lscorename.setBounds(250, 0, 120, 30);
 
        lscore = new JLabel("0", JLabel.CENTER);
        frame.add(lscore);
        lscore.setFont(new Font("Arial", Font.BOLD, 28)); 
        lscore.setForeground(Color.WHITE);
        lscore.setOpaque(true);
        lscore.setBackground(Color.GRAY);
        lscore.setBounds(250, 30, 120, 30);
 
        JLabel ltips = new JLabel("Press ESC to restart", JLabel.CENTER);
        frame.add(ltips);
        ltips.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ltips.setForeground(Color.DARK_GRAY);
        ltips.setBounds(0, 60, 400, 40);
 
        JPanel panel = new G2048Panel(n,elements,topValue);
        frame.add(panel);
        panel.setBounds(0, 100, 400+100*(n-4), 400+100*(n-4));
        panel.setBackground(Color.GRAY);
        panel.setFocusable(true);
        panel.setLayout(new FlowLayout());
        frame.addKeyListener((KeyListener) panel);
	}

}
