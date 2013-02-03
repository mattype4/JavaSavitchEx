package chapter8;
import javax.swing.JFrame;

import java.awt.Graphics;

public class HappyFace extends JFrame{

	private static final long serialVersionUID = -4958566213860585115L;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	
	public HappyFace(){
		setSize(WIDTH, HEIGHT);
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
	}
	
	public void paint(Graphics g){
		g.drawOval(100, 70, 200, 200);
		g.fillOval(155, 120, 10, 20);
		g.fillOval(230, 120, 10, 20);
		g.drawArc(150, 195, 100, 50, 180, 180);
	}
}
