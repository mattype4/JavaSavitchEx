package chapter13;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public FirstWindow(){
		super(); // Does not have to be called
		JLabel label = new JLabel("Hello, World");
		
		setSize(WIDTH, HEIGHT);
		getContentPane().add(label);
		
		WindowDestroyer listener = new WindowDestroyer();
		this.addWindowListener(listener);

	}
}
