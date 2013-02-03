package chapter4;
import javax.swing.JApplet;


import java.awt.Color;
import java.awt.Graphics;

public class Circles extends JApplet{
	private static final long serialVersionUID = -529185400713436514L;
	private static final int RADIUS = 200;
	
	@Override
	public void paint(Graphics g){
		int size = RADIUS*2;
		for (int i=0; i<6; i++){
			if (i%2 == 0)
				drawDisk(g, size, Color.GREEN);
			else
				drawDisk(g, size, Color.BLUE);
			size -= 65;
		}
		
	}
	public void drawDisk(Graphics g, int size, Color color){
		g.setColor(color);
		g.fillOval(RADIUS-size/2, RADIUS-size/2, size, size);
	}
}

/* To use outside (like main of default package) do the following

import javax.swing.JFrame;

public class Example{

	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.add(new Circles());
		frame.setVisible(true);	
	}	
}
*/