package ex4_work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePupup {

	public FramePupup() {
		
		Frame f = new Frame("Do you want to exit?");
		f.setLayout(null);
		f.setBounds(600, 300, 250, 250);
		
		Button btnY = new Button("Yes");
		Button btnN = new Button("No");
		
		btnY.setBounds(10, 50, 70, 50);
		btnN.setBounds(100, 50, 70, 50);
		
		f.add(btnY);
		f.add(btnN);
		
		btnY.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Yes버튼을 누르면 열려있는 모든 프레임을 종료
				System.exit(0);
			}
		});
		
		btnN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//팝업 프레임만 종료
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
		
	}
	
}
