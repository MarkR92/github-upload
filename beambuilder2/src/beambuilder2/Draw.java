package beambuilder2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw extends JPanel {
	int col, rows;
	int scl;
	static JLabel label;
	
	public void grid() {
		for (int x = 0; x<col; x++) {
			for (int y = 0; y<rows; x++) {
			
		}
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.black);
		g2.drawLine(col*scl, rows*scl, scl, scl);
		
	}
		
		//System.out.println("i am in paint component");}
	
	public void Frame() {
		
		//Create a Frame
		JFrame f = new JFrame();
		
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.white);
		//Frame Created
		
		
		//Add a Panel to the Frame
		JPanel p = new JPanel();
		f.add(p);
		//Panel Added to Frame
		
		//Add Label
		
		label = new JLabel(" ");
		label.setLocation(100, 100);
		label.setHorizontalAlignment(JLabel.RIGHT);
		f.add(label, BorderLayout.SOUTH);
		//Label Added to Frame
		
		
	}
	
	public  void main(String[] args) {
		Frame();
	}
	

}
