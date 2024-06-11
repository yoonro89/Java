package reserv_hotel_3_4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PayStarting_exit {

	   // 예약 종료 팝업 창
	   public PayStarting_exit() {
	         // 팝업 창 배경
	            Frame f = new Frame("Pay_Back");
	            f.setBackground(Color.pink);
	            f.setLayout(null);
	            f.setBounds( 825, 575, 300, 150);

	            Font font = new Font("", Font.HANGING_BASELINE, 15 );

	            // 팝업에 표시될 내용
	            Label jl = new Label(" 결제 중인 정보가 사라집니다.");
	            jl.setBounds(50, 50, 250, 16);
	            jl.setFont(font);
	            Label jl2 = new Label(" 정말 나가시겠습니까?");
	            jl2.setBounds(50, 70, 250, 16);
	            jl2.setFont(font);

	            Font word = new Font("", Font.HANGING_BASELINE, 15);
	            // 선택지 
	            Button btn1 = new Button("예");
	            btn1.setFont(word);
	            btn1.setBounds(40, 100, 60, 30);
	            btn1.setBackground(Color.WHITE);
	            Button btn2 = new Button("아니요");
	            btn2.setFont(word);
	            btn2.setBounds(205, 100, 60, 30);
	            btn2.setBackground(Color.WHITE);

	            f.add(btn1);
	            f.add(btn2);
	            f.add(jl);
	            f.add(jl2);
	            
	            btn1.addActionListener(new ActionListener() { // 예
	               @Override
	               public void actionPerformed(ActionEvent e) {
	                  PayStarting.fps.dispose(); // 예약 진행 창도 종료
	                  f.dispose();
	               }
	            });
	            
	            btn2.addActionListener(new ActionListener() { // 아니오
	               @Override
	               public void actionPerformed(ActionEvent e) {
	                  f.dispose();
	               }
	            });
	            
	            f.setVisible(true);
	            
	            f.addWindowListener(new WindowAdapter() {
	               @Override
	               public void windowClosing(WindowEvent e) {
	                  f.dispose();
	               }
	            });
	            
	         }// PayStarting_exit
	      }