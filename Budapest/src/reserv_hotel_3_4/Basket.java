package reserv_hotel_3_4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Basket {

	public Basket() {

	      Frame fr = new Frame("pay");
	      fr.setBounds(750, 300, 400, 200);
	      fr.setLayout(null);
	      
	      ImageIcon payimg = new ImageIcon("pink_1.png");
	      JLabel jlb = new JLabel(payimg);
	      jlb.setBounds(10, 10, 400, 200);

	      Font foon = new Font("", Font.ROMAN_BASELINE, 15);
	      Label labb = new Label("                           장바구니에 담겼습니다");
	      labb.setFont(foon);
	      labb.setBounds(0, 75, 400, 30);
	      labb.setBackground(Color.pink);
	      
	      Label labb2 = new Label("          HOTEL BUDAPEST를 선택해주셔서 감사합니다");
	      labb2.setFont(foon);
	      labb2.setBounds(0, 100, 400, 40);
	      labb2.setBackground(Color.PINK);
	      
	      fr.add(labb2);
	      fr.add(labb);
	      fr.add(jlb);
	      
	      fr.setVisible(true);
	      
	      fr.addWindowListener(new WindowAdapter() {

	            @Override
	            public void windowClosing(WindowEvent e) {
	               fr.dispose(); // 종료 경고 팝업 창
	            }
	         });
	}
}
