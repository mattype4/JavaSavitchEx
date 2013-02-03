package chapter11;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;


public class RecursiveDraw extends JFrame{
	

	private static final long serialVersionUID = 5639223281827462405L;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
	
	public RecursiveDraw(){
		this.setSize(WIDTH, HEIGHT);
		WindowDestroyer listener = new WindowDestroyer();
		this.addWindowListener(listener);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());		
	}
	
	public void paint(Graphics g){
		drawFractal(50, 800, 779, 800, 5, g);
	}
	
	public void drawFractal(int p1x,int p1y,int p2x,int p2y,int k, Graphics g){
		if (k == 0)
			g.drawLine(p1x, p1y, p2x, p2y);
		else{
			int lineSize = (p2x - p1x)/(k+2);
			g.drawLine(p1x, p1y, p1x+lineSize, p2y);
			g.drawLine(p1x+lineSize, p2y, p1x+lineSize, p2y-lineSize);
			
			drawFractal(p1x+lineSize, p2y-lineSize, p2x-lineSize, p2y-lineSize, k-1, g);
			
			g.drawLine(p2x-lineSize, p1y-lineSize, p2x-lineSize, p2y);
			g.drawLine(p2x-lineSize, p1y, p2x, p2y);
		}
	}
}
