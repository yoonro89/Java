package ex3_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {	//x버튼 관련 이벤트
		System.out.println("x버튼을 눌렀어요");
		System.exit(0);//열려있는 모든 프레임을 종료하는 메서드
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {	//최소화 관련 이벤트
		System.out.println("최소화 됨");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래 크기로 돌아옴");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
