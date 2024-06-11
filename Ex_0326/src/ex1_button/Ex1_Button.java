package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		
		Frame f = new Frame("버튼 테스트");
		//f.setTitle(null); 제목을 변경하는 메서드
		
		f.setBounds(500, 200, 400, 400);
		
		//자동배치를 끄는 코드 (버튼의 디폴트 값이 프레임을 가득 메우는 형태임)
		f.setLayout(null);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		
		
		//버튼들에게 크기와 위치를 설정
		btn1.setBounds(50, 30, 140, 100);
		btn2.setBounds(200, 30, 140, 100);
		btn3.setBounds(50, 150, 140, 100);
		btn4.setBounds(200, 150, 140, 100);
		
		
		
		//만들어둔 프레임에 버튼객체를 추가
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		//각 버튼별 이벤트 감지자 등록
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1번 눌렀음");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼에 부착된 텍스트를 가져온다
				System.out.println( e.getActionCommand() );
			}
		});
		
		//모아서 처리하는 방법 - 버튼3, 4번에 대한 이벤트 감지자
		ActionListener act = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				switch( e.getActionCommand() ) {
				case "버튼3":
					System.out.println(e.getID());
					System.out.println("버튼3번 클릭됨");
					break;
				case "버튼4":
					System.out.println(e.getID());
					System.out.println("button 4 click");
					break;
				}//switch
				
			}
		};
		
		btn3.addActionListener(act);
		btn4.addActionListener(act);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0); 열려있는 모든 프레임을 종료
				f.dispose(); //현재 프레임만 단독으로 종료
			}
		});
		
		f.setVisible(true);
		
		
	}//main
}
