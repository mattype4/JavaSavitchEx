package chapter13;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowDestroyer extends WindowAdapter{
	public void WindowClosing(WindowEvent e){
		System.exit(0);
	}
}

