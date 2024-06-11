package ex3_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(400, 200, 300, 200);
		
		//frame에게 이벤트 감지자 등록
		MyListener m1 = new MyListener();
		f.addWindowListener(m1);
		
		f.setVisible(true);
		
	}//main
}
