package chapter14;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Color;

public class AddApplet extends JApplet
							implements ActionListener{
	private double sum = 0;
	private JTextField text;
	
	public void init(){
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		textPanel.setBackground(Color.BLUE);
		
		text = new JTextField("Enter Number: ", 30);
		textPanel.add(text);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.GRAY);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton add = new JButton("Add");
		add.addActionListener(this);
		buttonPanel.add(add);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(this);
		buttonPanel.add(reset);
		
		content.add(textPanel, BorderLayout.CENTER);
		content.add(buttonPanel, BorderLayout.SOUTH);
		
	}
	
	public void actionPerformed(ActionEvent e){
		try {
			if (e.getActionCommand().equals("Add")){
				sum += Double.parseDouble(text.getText().trim());
				text.setText(Double.toString(sum));
			} else if (e.getActionCommand().equals("Reset")){
				sum = 0;
				text.setText("0.0");
			} else {
				text.setText("Error in implementation");
			}
		} catch(NumberFormatException e2){
			text.setText("Incorrect Input");
		}
	}
}
