package ex2_frame;

import java.awt.Frame;

public class MyFrame extends Frame{
	public MyFrame() {
//		setSize(400, 400);
//		setLocation(500, 200);
		
		//size와 location을 한 번에
		setBounds(500, 200, 400, 400);
		
		setVisible(true);
	}
}
