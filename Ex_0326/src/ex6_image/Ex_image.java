package ex6_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex_image {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 1280, 1280);
		
		ImageIcon img = new ImageIcon("lion.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 30, 1280, 1280);
		
		ImageIcon img2 = new ImageIcon("p1.jpg");
		JButton b1 = new JButton(img2);
		b1.setBounds(870, 440, 200, 200);
		
		f.add(b1);
		f.add(j1); //배경이 가장 마지막에 추가되어야 이전의 버튼이 잘 보인다
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
}
