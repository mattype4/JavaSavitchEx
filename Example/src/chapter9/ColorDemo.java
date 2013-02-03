package chapter9;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorDemo extends JFrame 
						implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8281977355611582879L;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	public static final int NUM_CHARS = 20;
	
	private JTextField colorName;
	
	public ColorDemo(){
	this.setSize(WIDTH, HEIGHT);
	WindowDestroyer listener = new WindowDestroyer();
	this.addWindowListener(listener);
	Container contentPane = getContentPane();
	contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(new FlowLayout());
	
	colorName = new JTextField(NUM_CHARS);
	JButton showColor = new JButton("Show Color");
	showColor.addActionListener(this);
	contentPane.add(showColor);
	colorName.addActionListener(this);
	contentPane.add(colorName);
		
	}
	
	public void actionPerformed(ActionEvent e){
		Container contentPane = getContentPane();
		try {
			if (e.getActionCommand().equals("Show Color")){
				contentPane.setBackground(getColor(colorName.getText()));
			} else{
				System.out.println("Incorrect input");
			}
	
		} catch (IncorrectColorException exception){
			colorName.setText("Unknown Color");
			contentPane.setBackground(Color.GRAY);
		}
	}
	
	public Color getColor(String name) throws IncorrectColorException{
		if (name.toLowerCase().equals("red"))
			return Color.red;
		else if (name.toLowerCase().equals("blue"))
			return Color.blue;
		else if (name.toLowerCase().equals("white"))
			return Color.white;
		else if (name.toLowerCase().equals("green"))
			return Color.green;
		else
			throw new IncorrectColorException();
	}
	

}
