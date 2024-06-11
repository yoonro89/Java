package ex4_window_listener;

import java.awt.event.WindowEvent;

public class WinCloseingListener extends MyListener{

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
