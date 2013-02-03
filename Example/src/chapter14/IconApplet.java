package chapter14;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Container;

public class IconApplet extends JApplet{
	public void init(){
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		JLabel spacer = new JLabel("           ");
		content.add(spacer, BorderLayout.WEST);
		JLabel label = new JLabel("This is an arrow");
		ImageIcon icon = new ImageIcon("../icon.jpg");
		label.setIcon(icon);
		content.add(label, BorderLayout.CENTER);
	}
}
