package loginEx_2;

import java.awt.Button;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import loginEx_1.*;
import reserv_hotel_3_4.*;

public class AfterLogin extends Thread {

   private TextArea ta_myBasket;
   private TextArea ta_myRoom;

   static User uInfo = new User();
   Reserv_info rInfo = new Reserv_info();

   static int user_resNum;
   static List<Integer> user_res_List = new ArrayList<Integer>(); // 예약번호
   List<String> total_reser = new ArrayList<String>();
   List<String> user_basket = new ArrayList<String>();
   List<String> user_reserv = new ArrayList<String>();
   List<String> user_send = new ArrayList<String>();
   
   static String room_name = "";

   public AfterLogin(String id) {

      // id에 해당하는 MyRoom과 MyBasket 정보 로드

      uInfo.setId(id);
      UserL uload = new UserL(uInfo);

      uInfo = uload.user;

      user_basket = uInfo.getUser_basket();
      user_reserv = uInfo.getUser_reserv();

//         ReservLoad rload = new ReservLoad(userR);
//         userR = rload.userR;

      System.out.println("11a1 : " + user_basket);
      System.out.println("22s2 : " + user_reserv);

      Font font = new Font("", Font.BOLD, 14);

      // 로그인 후 배경 프레임
      Frame f = new Frame("Login ok");
      f.setBounds(750, 250, 400, 700);
      f.setResizable(false);
      f.setLayout(null);

      // 배경이미지 설정
      ImageIcon backImg = new ImageIcon("loginback.jpg");
      JLabel j1 = new JLabel(backImg);
      j1.setBounds(0, 30, 400, 200);

      // 버튼 뒷 배경 컬러 설정
      ImageIcon backImg1 = new ImageIcon("pink_1.png");
      JLabel j2 = new JLabel(backImg1);
      j2.setBounds(0, 230, 400, 500);

      // 예약취소 버튼
      Button btnCancle = new Button("예약취소");
      btnCancle.setBounds(265, 250, 85, 30);
      btnCancle.setFont(font);

      // 결제하기 버튼
      ImageIcon icon1 = new ImageIcon("pay.jpg");
      JButton btnPay = new JButton();
      btnPay.setIcon(icon1);
      btnPay.setBounds(310, 385, 40, 40);

      // 장바구기 비우기 버튼
      ImageIcon icon2 = new ImageIcon("trash.jpg");
      JButton btnClean = new JButton();
      btnClean.setIcon(icon2);
      btnClean.setBounds(180, 385, 40, 40);

      // 다른방 보기 버튼
      Button btnReserve = new Button("다른방 보러가기");
      btnReserve.setBounds(50, 560, 150, 30);
      btnReserve.setFont(font);

      // 로그아웃버튼
      Button btnLogout = new Button("로그아웃");
      btnLogout.setBounds(265, 560, 85, 30);
      btnLogout.setFont(font);

      // 호텔이름레이블
      Font f_label_hotel = new Font("", Font.BOLD, 15);
      JLabel label_hotel = new JLabel("Hotel Budapest");
      label_hotel.setForeground(Color.PINK);
      label_hotel.setFont(f_label_hotel);
      label_hotel.setBounds(270, 650, 120, 30);

      // my room 레이블, ta창 설정
      Font font_info = new Font("", Font.BOLD, 20);
      JLabel jl_myRoom = new JLabel("My Room");
      jl_myRoom.setForeground(Color.PINK);
      jl_myRoom.setFont(font_info);
      jl_myRoom.setBounds(50, 250, 100, 30);

      ta_myRoom = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
      ta_myRoom.setFont(font);

      if (user_reserv == null || user_reserv.isEmpty()) {
         ta_myRoom.setText("\n\n결제 내역이 없습니다.");
         btnCancle.setEnabled(false);
      } else {
         ta_myRoom.setText(uInfo.toString_pay());
      }

      ta_myRoom.setBounds(50, 290, 300, 80);
      ta_myRoom.setEditable(false);

      JLabel jl_myBasket = new JLabel("My Basket");
      jl_myBasket.setForeground(Color.PINK);
      jl_myBasket.setFont(font_info);
      jl_myBasket.setBounds(50, 390, 100, 30);

      ta_myBasket = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
      ta_myBasket.setFont(font);

      if (user_basket == null || user_basket.isEmpty()) {
         ta_myBasket.setText("\n\n텅...........");
      } else {
         ta_myBasket.setText(uInfo.toString());
      }

      if (ta_myBasket.getText().equals(ta_myRoom.getText())) {
         ta_myBasket.setText("\n\n텅...........");
      }

      ta_myBasket.setBounds(50, 430, 300, 80);
      ta_myBasket.setEditable(false);

      // 프레임에 추가
      f.add(btnClean);
      f.add(btnPay);
      f.add(btnCancle);
      f.add(ta_myBasket);
      f.add(jl_myBasket);
      f.add(ta_myRoom);
      f.add(jl_myRoom);
      f.add(label_hotel);
      f.add(btnLogout);
      f.add(btnReserve);
      f.add(j2);
      f.add(j1);

      f.setVisible(true);
      
      

      // 로그인 후 화면 프레임 x버튼 종료
      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            popUp();
            // System.exit(0);
         }
      });

      // 로그아웃 버튼 액션 > 누르면 기존 로그인 화면로드
      btnLogout.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            f.dispose();
            new LoginF();
         }
      });

      btnReserve.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new HotelFrame(id);
         }
      });

      // 결제 버튼 액션
      btnPay.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
        	 
            for(int i = 1; i < user_basket.size(); i++) {
            	user_send.add(user_basket.get(i));
            }
            
            
        	 new PayStarting(user_basket.get(0), id, user_send);
         }
      });

      // 비우기 버튼 액션
      btnClean.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // 장바구니 내역의 텍스트 삭제
            ta_myBasket.setText("\n\n텅...........");
            // 장바구니 내역 삭제
            user_basket.clear();
            uInfo.setUser_basket(user_basket);

            // 변경된 내용을 파일에 저장
            new UserW(uInfo);
         }
      });

      btnCancle.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            ta_myRoom.setText("\n\n결제가 취소 되었습니다.");
            // 결제 내역 삭제
            
            // 통합 예약 정보를 불러오기 위해선 해당 예약 리스트를 로드해야 한다.
            rInfo.setRoom_name(user_reserv.get(0)); // 1. 해당 방의 폴더로 경로 연결
    		ReservLoad rload = new ReservLoad(rInfo); // 2. 정보 읽어오기
    		rInfo = rload.info;
    		total_reser = rInfo.getTotal_reser(); // 호텔 통합 예약 리스트를 가져옴
    		user_res_List = rInfo.getUser_res_List(); // 호텔 토탕 예약 번호를 가져옴
            user_resNum = uInfo.getUser_resNum(); // 사용자의 예약번호를 가져옴
            
            // 유저 예약 번호와 동일한 순서로 들어간 기간들을 지운다.
            for(int i = 0; i < 4; i++) {
            	total_reser.remove(user_res_List.indexOf(user_resNum)*4);
            }
            user_res_List.remove(user_res_List.indexOf(user_resNum));
            
            user_reserv.clear();
            uInfo.setUser_reserv(user_reserv);
            rInfo.setTotal_reser(total_reser);
            // 변경된 내용을 파일에 저장
            new UserW(uInfo);
            new ReservSave(rInfo);
            // System.out.println("total리저 : " + total_reser);
         }
      });

   }// 생성자

   // x버튼 누르면 나오는 팝업
   public void popUp() {

      Frame f = new Frame("Exit");
      f.setBounds(750, 450, 400, 150);
      f.setResizable(false);
      f.setLayout(null);// 자동배치 끄기

      // popup창 배경 설정
      ImageIcon backPop = new ImageIcon("pink.png");
      JLabel jl1 = new JLabel(backPop);
      jl1.setBounds(0, 0, 400, 150);

      // popup화면 문구 label 설정
      Font font = new Font("", Font.BOLD, 14);

      JLabel jl2 = new JLabel();

      jl2.setFont(font);
      jl2.setText("정말 종료 하시겠습니까?..멋진 룸들이 기다립니다!");
      jl2.setBounds(35, 35, 335, 50);

      // popup화면 yes / no 버튼 설정
      Font font1 = new Font("", Font.BOLD, 16);

      Button btnY = new Button("YES");
      btnY.setFont(font1);
      btnY.setBounds(110, 90, 60, 40);

      Button btnN = new Button("NO");
      btnN.setFont(font1);
      btnN.setBounds(220, 90, 60, 40);

      ////////////////

      // 버튼 액션 감지자 설정
      btnY.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });

      btnN.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            f.dispose();
         }
      });
      ////////////////

      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            f.dispose();
         }
      });

      // 프레임에 추가
      f.add(btnN);
      f.add(btnY);
      f.add(jl2);
      f.add(jl1);
      f.setVisible(true);

   }// popUp()

   public void displayUserInfo(String userInfo) {
      ta_myBasket.setText(userInfo);
   }

}
