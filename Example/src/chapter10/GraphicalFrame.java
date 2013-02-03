package chapter10;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

public class GraphicalFrame extends JFrame
								implements ActionListener{

	private static final long serialVersionUID = -3699712265061835969L;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;
	
	private JTextField text;
	private JButton findDoc;
	private String textFrom, file;
	
	
	public GraphicalFrame(){
		setSize(WIDTH,HEIGHT);
		WindowDestroyer listener = new WindowDestroyer();
		this.addWindowListener(listener);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());
		
		findDoc = new JButton("Enter file");
		findDoc.addActionListener(this);
		contentPane.add(findDoc);
		
		text = new JTextField(40);
		text.addActionListener(this);
		text.setText("Enter file here.");
		contentPane.add(text);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Enter file")){
			file = text.getText();
			text.setText(readFrom(file));
		} else{
			System.out.println("Error");
			return;
		}
	}
	
	public String readFrom(String file){
		ObjectInputStream inputStream;
		textFrom = "";
		
		try{
			inputStream = new ObjectInputStream(new FileInputStream(file));
			
			try{
				while(true){
					textFrom += inputStream.readObject();
				}
			} catch(EOFException e){
				textFrom += "\nEnd of File";
			} catch(ClassNotFoundException e){
				textFrom += "\nClass not found";
			}
			
			inputStream.close();
		} catch(FileNotFoundException e){
			return "File Not Found";
		} catch(IOException e){
			return "IO exception";
		}
		
		return textFrom;
	}

}
