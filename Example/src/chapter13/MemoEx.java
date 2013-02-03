package chapter13;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Color;

public class MemoEx extends JFrame
						implements ActionListener{

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;
	public static final int LINES = 10;
	public static final int CHAR_PER_LINE = 40;
	
	private JTextArea theText;
	private String memo1;
	private String memo2;
	public MemoEx(){
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Check this!!");
		Container content = getContentPane();
		content.setBackground(Color.WHITE);
		content.setLayout(new BorderLayout());
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
		
		JPanel textPanel = new JPanel();
		textPanel.setBackground(Color.BLUE);
		theText = new JTextArea("Enter text: ", LINES, CHAR_PER_LINE);
		textPanel.add(theText);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.WHITE);
		
		JButton saveMemo1 = new JButton("Save Memo 1");
		saveMemo1.addActionListener(this);
		buttonPanel.add(saveMemo1);
		
		JButton saveMemo2 = new JButton("Save Memo 2");
		saveMemo2.addActionListener(this);
		buttonPanel.add(saveMemo2);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(this);
		buttonPanel.add(clear);
		
		JButton getMemo1 = new JButton("Get Memo 1");
		getMemo1.addActionListener(this);
		buttonPanel.add(getMemo1);
		
		JButton getMemo2 = new JButton("Get Memo 2");
		getMemo2.addActionListener(this);
		buttonPanel.add(getMemo2);
		
		content.add(textPanel, BorderLayout.CENTER);
		content.add(buttonPanel, BorderLayout.SOUTH);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Save Memo 1")){
			memo1 = theText.getText();
		} else if(e.getActionCommand().equals("Save Memo 2")){
			memo2 = theText.getText();
		} else if(e.getActionCommand().equals("Clear")){
			theText.setText("");
		} else if(e.getActionCommand().equals("Get Memo 1")){
			theText.setText(memo1);
		} else if(e.getActionCommand().equals("Get Memo 2")){
			theText.setText(memo2);
		} else{
			theText.setText("Error in the memo Interface");
		}
	}
}