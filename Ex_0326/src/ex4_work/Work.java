package ex4_work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work {
	static String res = "Yes";
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		
		f.setBounds(400, 500, 400, 400);
		f.setLayout(null);
		
		Button yes = new Button();
		yes.setBounds(600, 700, 30, 30);
		
		Button no = new Button();
		no.setBounds(650, 700, 30, 30);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Frame f2 = new Frame("종료하시겠습니까?");
				f2.setBounds(500, 600, 200, 200);
				f2.setVisible(true);
				f2.add(yes);
				f2.add(no);
				
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				
				no.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						f.dispose();
						
					}
				});
			}
		});
		f.setVisible(true);
	}//main
}
