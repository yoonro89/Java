package ex4_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(400, 400, 300, 300);
		
		f.addWindowListener( new WinCloseingListener() );
		f.setVisible(true);
		
	}//main
}
