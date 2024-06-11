package reserv_hotel_3_4;

import java.awt.Color;


import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import loginEx_1.*;
import loginEx_2.*;

public class HotelFrame {

	static String rom = ""; // 방 별 이미지 정보
	static List<JButton> jb = new ArrayList<JButton>(); // 방별 버튼 리스트
	static List<ImageIcon> imgimg = new ArrayList<ImageIcon>(); // 방별 이미지 리스트
	static int be = 0; // 페이지 구분 용 변수
	JButton bb1; // 왼쪽 페이지 이동 버튼
	JButton bb2; // 오른쪽쪽 페이지 이동 버튼
	static Frame f;
	
	public HotelFrame(String id) {

		  // 1. 전체 프레임 창
	      f = new Frame("Reservation");
	      f.setLayout(null);
	      f.setLocationRelativeTo(null);
	      f.setBounds(750, 250, 400, 700);
	      // 전체 프레임 이미지
	      ImageIcon img = new ImageIcon("Reservation.jpg");
	      JLabel j1 = new JLabel(img);
	      j1.setBounds(0, 13, 400, 700);
	      ////////////////////////////////////////////////
	      
	      
	      // 이미지 종류를 페이지별로 구분한다.
	      String[][] total_img = {{"Type1.jpg", "Type2.jpg", "Type3.jpg", "Type4.jpg"}, // [0][ 0, 1, 2, 3]
	            {"Type5.jpg", "Type6.jpg", "Type7.jpg", "Type8.jpg"}}; // [1][ 0, 1, 2, 3]

	      // 해당 버튼들의 초기 위치
	      int img_x = 10;
	      int img_y = 230;

	      // 3. 방 버튼을 누르게 될 경우 해당 버튼에 달려있는 코멘드를 가져온다.
	      ActionListener act = new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            rom = e.getActionCommand();
	            new Reservation(rom , id); // 방 정보, 호텔 아이디
	         }
	      };

	      // 2. 방 버튼 배치
	      for(int i = 0; i < total_img[be].length; i++) {
	         System.out.println(i);
	         if(i % 2 == 0) { // 짝수일때, [0][0], [0][2]
	            img_x = 10;
	         }else {
	            img_x = 200; // 홀수일때, [0][1], [0][3]
	         }
	         if(i == 2) { // y의 위치는 i 가 2변째를 시작으로 230 + 200이 된다.
	            img_y += 200;
	         }
	         
	         imgimg.add(new ImageIcon(total_img[0][i]));
	         jb.add(new JButton(imgimg.get(i)));
	         jb.get(i).setActionCommand(total_img[0][i]); // 버튼 누르면 이미지 경로 코멘드에 추가 >> "Type1.jpg", "Type2.jpg", "Type3.jpg", "Type4.jpg" 등
	         jb.get(i).setBounds(img_x, img_y, 190, 190);
	         jb.get(i).addActionListener(act);

	         f.add(jb.get(i));
	      }
	      ////////////////////////////////////////////////////////
	      
	      
	      //옆 페이지로 이동
	      bb1 = new JButton(">");
	      bb1.setBounds(338, 630, 46, 46);
	      Font font = new Font("", Font.HANGING_BASELINE, 20);
	      bb1.setFont(font);
	      bb1.setBackground(Color.pink);

	      bb2 = new JButton("<");
	      bb2.setBounds(18, 630, 46, 46);
	      Font font1 = new Font("", Font.HANGING_BASELINE, 20);
	      bb2.setFont(font);
	      bb2.setBackground(Color.pink);
	      /////////////////////////////////////////////////////////

	      // >>버튼을 눌렀을때 
	      bb1.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            if( be == 1 ) {
	               be = 0;
	            }else {
	               be++;
	            }
	            for(int i = 0; i < total_img[be].length; i++) {
	               jb.get(i).setIcon(new ImageIcon(total_img[be][i]));
	               jb.get(i).setActionCommand(total_img[be][i]);
	            }
	         }
	      });

	      // <<버튼을 눌렀을때 
	      bb2.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            if( be == 0 ) {
	               be = 1;
	            
	            }else {
	               be--;
	            }
	            for(int i = 0; i < total_img[be].length; i++) {
	               jb.get(i).setIcon(new ImageIcon(total_img[be][i]));
	               jb.get(i).setActionCommand(total_img[be][i]);
	            }
	         }
	      });

	      f.add(bb1);
	      f.add(bb2);
	      f.add(j1);

	      f.setVisible(true);

	      f.addWindowListener(new WindowAdapter() {

	         @Override
	         public void windowClosing(WindowEvent e) {
	            f.dispose(); // 종료 경고 팝업 창
	         }

	      });


	}
}