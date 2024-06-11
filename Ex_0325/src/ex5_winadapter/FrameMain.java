package ex5_winadapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f= new Frame();
		f.setBounds(500, 200, 400, 400);
		
		f.addWindowListener( new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("x버튼 눌렀음");
				System.exit(0);
			}
			
		});
		
		f.setVisible(true);
		
	}//main
}
