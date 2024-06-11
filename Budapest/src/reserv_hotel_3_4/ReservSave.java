package reserv_hotel_3_4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import loginEx_1.*;

public class ReservSave { // total rewserv에 정보 저장

	   Reserv_info info;

	   public ReservSave(Reserv_info info) {
	      this.info = info;
	      save();
	   }
	   
	   // 통합 예약 정보 파일 저장 
	   private void save() {
	      System.out.println("`````` : " +info.getTotal_reser());
	      
	      String path = "C:/Budapest/Hotel/" + info.getRoom_name() + "/room_reservation.sav";
	      File f = new File("C:/Budapest/Hotel/" + info.getRoom_name());

	      if(!f.exists()) {
	         f.mkdirs();
	      }

	      ObjectOutputStream oos = null;
	      FileOutputStream fos = null;

	      try {
	         fos = new FileOutputStream(path);
	         oos = new ObjectOutputStream(fos);

	         oos.writeObject(info);
	         
	      } catch (Exception e) {
	         // TODO: handle exception
	         e.printStackTrace();
	      }finally {
	         try {
	            oos.close();
	            fos.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }//save
	   
	   // 결제 완료 후 확인 창
	   public void check() {
	      Frame fr = new Frame("pay");
	      fr.setBounds(750, 300, 400, 200);
	      fr.setLayout(null);
	      
	      ImageIcon payimg = new ImageIcon("pink_1.png");
	      JLabel jlb = new JLabel(payimg);
	      jlb.setBounds(10, 10, 400, 200);

	      Font foon = new Font("", Font.ROMAN_BASELINE, 15);
	      Label labb = new Label("                           결제가 완료되었습니다");
	      labb.setFont(foon);
	      labb.setBounds(0, 80, 400, 30);
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
	            	System.exit(0);
	            }
	         });
	      
	   }
	   
	}