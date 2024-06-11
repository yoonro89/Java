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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import loginEx_1.*;

public class Shopping_Basket {

	public Shopping_Basket() throws IOException {

		Frame f = new Frame("Shopping Basket");
		Font font = new Font("", Font.BOLD, 20);

		f.setBounds(750, 250, 400, 450);
		f.setLayout(null);

		ImageIcon img = new ImageIcon("장바구니배경.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 30, 400, 450);

		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta.setFont(font);
		ta.setBounds(50, 80, 300, 250);

		// file에있는 저장목록 불러와서 ta에 띄우기
		File file = new File("C:/yoonseo/test.txt");//현재는 임의 지정파일 > 로그인 후 아이디별 폴더 저장된 곳에서 가져외야할듯

		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			StringBuilder stringBuilder = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				stringBuilder.append(line).append("\n");
			}
			ta.setText(stringBuilder.toString());

		} catch (Exception e) {
		} finally {
			if (br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}

		// 장바구니 타이틀 설정
		JLabel jl_title = new JLabel("장바구니 내역");
		jl_title.setFont(font);
		jl_title.setForeground(Color.BLACK);
		jl_title.setBounds(50, 35, 130, 40);
		
		//호텔이름레이블
		Font f_label_hotel = new Font("",Font.BOLD,15);
		JLabel label_hotel = new JLabel("Hotel Budapest");
		label_hotel.setForeground(Color.PINK);
		label_hotel.setFont(f_label_hotel);
		label_hotel.setBounds(270, 405, 120, 30);

		// 뒤로가기 버튼 설정
		Button btn_back = new Button("뒤로");
		btn_back.setFont(font);	
		btn_back.setBounds(300, 370, 70, 30);

		// 뒤로버튼 액션감지자
		btn_back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new AfterLogin("");
			}
		});

		f.add(btn_back);
		f.add(label_hotel);
		f.add(jl_title);
		f.add(ta);
		f.add(jl);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}

}
