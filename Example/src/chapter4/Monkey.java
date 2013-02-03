package chapter4;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

public class Monkey extends JApplet{
	private static final long serialVersionUID = 1767617371449752255L;

	public void init(){
	}

	public void paint(Graphics g){
		drawMonkeyFace( g, 100, 50);
		drawMonkeyHands( g, 50, 40, 5);
		drawMonkeyHands( g, 50, 40, 70);
		g.drawString("hear no evil", 75, 150);
		
		drawMonkeyFace( g, 100, 250);
		drawMonkeyHands( g, 50, 30, 130);
		drawMonkeyHands( g, 50, 30, 145);
		g.drawString("see no evil", 275, 150);
		
		drawMonkeyFace( g, 100, 450);
		drawMonkeyHands( g, 50, 60, 230);
		drawMonkeyHands( g, 50, 60, 245);
		g.drawString("Speak no evil", 475, 150);
		
	}
	
	private void drawMonkeyFace(Graphics g, int size, int pos){
		g.drawOval(pos, 0, size, (int)(size*1.1));
		g.drawOval(pos-size/3, size/6, size/3, size/2);
		g.drawOval(pos+size, size/6, size/3, size/2);
		
		g.fillOval(pos+size/4, size/4, size/6, size/6);
		g.fillOval((int)(pos+size/1.65), size/4, size/6, size/6);
		g.drawArc( (int)(pos + size*.16), (int)(size/3), (int)(size/1.4), size/2, 0, -180);
	}
	
	private void drawMonkeyHands(Graphics g, int size, int height, int width){
		g.fillOval(width*2+size/4, height+size/4, size/2, size/4);
		g.fillOval(width*2+size/4, (int)(height-size/10), size/5, size/2);
		g.fillOval((int)(width*2+size/2.5), (int)(height-size/10), size/5, size/2);
		g.fillOval((int)(width*2+size/1.7), (int)(height-size/10), size/5, size/2);
		
	}
}
