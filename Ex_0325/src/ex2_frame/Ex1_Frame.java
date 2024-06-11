package ex2_frame;

import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame("나는 제목입니다");
		f.setSize(400, 400);	//만들어질 프레임의 사이즈
		f.setLocation(800, 100);//만들어질 프레임의 위치 (x,y 좌표)
		f.setVisible(true);		//출력
		
	}//main
}
