package chapter11;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WindowDestroyer extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

}
