package chapter8;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Container;

public class ButtonDemo extends JFrame
						implements ActionListener{

	private static final long serialVersionUID = -2381064289676730853L;

	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	
	public ButtonDemo(){
		setSize(WIDTH, HEIGHT);
		JButton sunny = new JButton("Sunny");
		JButton cloudy = new JButton("Cloudy");
		Container contentPane = getContentPane();
		WindowDestroyer listener = new WindowDestroyer();
		
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());
		
		addWindowListener(listener);
		contentPane.add(sunny);
		sunny.addActionListener(this);
		contentPane.add(cloudy);
		cloudy.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		Container contentPane = getContentPane();
		if (e.getActionCommand().equals("Sunny")){
			contentPane.setBackground(Color.BLUE);
		}
		
		else if (e.getActionCommand().equals("Cloudy")){
			contentPane.setBackground(Color.GRAY);
		}
		
		else {
			System.out.println("Incorrect input.");
		}
	}
}