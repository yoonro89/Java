package ex6_anonymousInner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 300);
		
		Button btn = new Button("버튼입니다");
		f.add(btn);
		
		//익명 내부클래스
		//메서드의 파라미터로 이름이 없는 클래스가 생성되는 구조
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		f.setVisible(true);
		
	}//main
}
