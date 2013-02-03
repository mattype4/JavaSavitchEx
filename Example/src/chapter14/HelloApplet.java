package chapter14;
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;

public class HelloApplet extends JApplet{
	public void init(){
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		JLabel label = new JLabel("Hello, World");
		content.add(label);
	}
}
