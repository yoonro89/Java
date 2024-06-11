package ex2_check;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_CheckBox {
	static String myGender = "female";	//스테틱 메서드 안에서는 스테틱 변수를 작성할 수 x, 감지자는 스테틱 변수가 아니면 접근할 수 x
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame();
		
		f.setBounds(500, 200, 500, 250);
		f.setLayout(null);//자동배치 끄기
		
		//폰트 설정			글꼴, 글자스타일, 글자크기
		Font font = new Font("", Font.BOLD, 30);
		
		Label q1 = new Label("1.취미는 무엇입니까?");
		q1.setBounds(10, 35, 300, 30);
		q1.setBackground(Color.GREEN);
		q1.setFont(font);
		
		//체크박스
		Checkbox news = new Checkbox("뉴스시청");
		news.setBounds(20, 70, 90, 30);
		
		Checkbox sports = new Checkbox("운동");
		sports.setBounds(110, 70, 50, 30);
		
		Checkbox movie = new Checkbox("영화");
		movie.setBounds(170, 70, 50, 30);
		
		Checkbox music = new Checkbox("음악감상");
		music.setBounds(230, 70, 90, 30);
		
		//체크박스에 이벤트 감지자 등록
		ItemListener checkListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				//System.out.println(e.getItem().toString());
				switch(e.getItem().toString()) {
				case "뉴스시청":
					if(e.getStateChange() == 1) { //1인경우 체크, 2인경우 체크해제
						System.out.println("select news");
					}else {
						System.out.println("unselect news");
					}
					break;
				case "운동":
					if(e.getStateChange() == 1) {
						System.out.println("select sports");
					}else {
						System.out.println("unselect sports");
					}
					break;
				case "영화":
					if(e.getStateChange() == 1) {
						System.out.println("select movie");
					}else {
						System.out.println("unselect movie");
					}
					break;
				case "음악감상":
					if(e.getStateChange() == 1) {
						System.out.println("select music");
					}else {
						System.out.println("unselect music");
					}
					break;
				}//switch
				
			}
		};
		
		news.addItemListener(checkListener);
		sports.addItemListener(checkListener);
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);
		
		Label q2 = new Label("2.성별은 무엇입니까?");
		q2.setFont(font);
		q2.setBounds(10, 110, 300, 30);
		
		//라디오버튼
		CheckboxGroup group = new CheckboxGroup();
		Checkbox female = new Checkbox("female", group, true);
		female.setBounds(20, 150, 70, 30);
		Checkbox male = new Checkbox("male", group, false);
		male.setBounds(100, 150, 50, 30);
		
		//라디오버튼에 이벤트 감지자 등록
		ItemListener genderliListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				myGender = e.getItem().toString();
				System.out.println(e.getItem().toString());
			}
		};
		
		female.addItemListener(genderliListener);
		male.addItemListener(genderliListener);
		
		//만들어진 객체들을 프레임에 추가
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		f.add(q2);
		f.add(female);
		f.add(male);
		
		f.setVisible(true);
		
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
