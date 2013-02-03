package chapter13;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

public class Adder extends JFrame
							implements ActionListener{

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 400;
	
	private JTextField text;
	private double sum = 0;
	
	public Adder(){
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Adder");
		addWindowListener(new WindowDestroyer());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		textPanel.setBackground(Color.BLUE);
		text = new JTextField("Place Numbers here: ", 30);
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
		try{
		if (e.getActionCommand().equals("Add")){
			sum += Double.parseDouble(text.getText().trim());
			text.setText(Double.toString(sum));
		} else if(e.getActionCommand().equals("Reset")){
			sum = 0;
			text.setText("0.0");
		} else{
			text.setText("Incorrect adder interface.");
		}
		} catch(NumberFormatException e2){
			text.setText("Incorrect input");
		}
	}

}
