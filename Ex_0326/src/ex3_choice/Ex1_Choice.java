package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String res = "SUN";
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setBounds(500, 250, 400, 100);
		f.setLayout(null);
		
		Font font = new Font("", Font.PLAIN, 20);
		
		Choice day = new Choice();
		day.setFont(font);
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setBounds(10, 50, 150, 0);
		
		//day의 이벤트 감지자 등록
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				res = day.getSelectedItem();
				System.out.println(res);
				
			}
		});
		
		f.add(day);
		
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
