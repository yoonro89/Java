package loginEx_2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CancleReservation {

	static Frame f;

	public CancleReservation() {

		// 캔슬화면 프레임
		f = new Frame("Reservation cancellation");
		f.setBounds(750, 250, 400, 600);
		f.setLayout(null);

		Font font = new Font("", Font.HANGING_BASELINE, 20);
		Font font_tf = new Font("", Font.BOLD, 15);

		ImageIcon img1 = new ImageIcon("1backcolor.png");
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 30, 400, 600);

		// 예약 캔슬 창 메인 레이블
		JLabel label_cancel = new JLabel("Reservation cancellation");
		Font font_cancel = new Font("", Font.BOLD, 28);
		label_cancel.setForeground(Color.WHITE);
		label_cancel.setFont(font_cancel);
		label_cancel.setBounds(35, 50, 350, 40);

		// 호텔이름레이블
		Font f_label_hotel = new Font("",Font.BOLD,15);
		JLabel label_hotel = new JLabel("Hotel Budapest");
		label_hotel.setForeground(Color.PINK);
		label_hotel.setFont(f_label_hotel);
		label_hotel.setBounds(270, 550, 120, 30);

		// 예약번호 레이블 설정
		JLabel label_num = new JLabel("Reservation number..");
		label_num.setForeground(Color.BLACK);
		label_num.setFont(font);
		label_num.setBounds(50, 110, 200, 25);

		// 예약 번호 입력 창 설정
		TextField tf_num = new TextField();
		tf_num.setFont(font_tf);
		tf_num.setBounds(50, 140, 100, 25);

		// 비밀번호 레이블 설정
		JLabel label_pwd = new JLabel("Password..");
		label_pwd.setForeground(Color.BLACK);
		label_pwd.setFont(font);
		label_pwd.setBounds(50, 190, 100, 25);

		// 비밀번호 입력 창 설정
		TextField tf_pwd = new TextField();
		tf_pwd.setFont(font_tf);
		tf_pwd.setBounds(50, 220, 100, 25);

		// 취소하기 버튼
		Font font_btn = new Font("", Font.BOLD, 16);

		Button btn_cancle = new Button("취소하기");
		btn_cancle.setFont(font_btn);
		btn_cancle.setBounds(80, 280, 100, 30);

		// 이전 버튼
		Button btn_return = new Button("이전");
		btn_return.setFont(font_btn);
		btn_return.setBounds(220, 280, 100, 30);

		// 취소하기 버튼 감지자 설정
		btn_cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!tf_num.getText().equals("") && !tf_pwd.getText().equals("")) {
					popUp();
				} else {
					popUp_cancle();
				}
			}
		});

		// 이전 버튼 감지자 설정
		btn_return.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new AfterLogin("");
			}
		});

		f.add(label_hotel);
		f.add(btn_return);
		f.add(btn_cancle);
		f.add(label_cancel);
		f.add(tf_pwd);
		f.add(label_pwd);
		f.add(tf_num);
		f.add(label_num);
		f.add(jl);

		f.setResizable(false);
		f.setVisible(true);

		// 캔슬화면 프레임 x버튼 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}// 생성자

	// 취소버튼 눌렀을 경우 뜨는 팝업창 메서드
	public void popUp() {

		Frame f = new Frame("Reservation cancellation");
		Font font = new Font("", Font.BOLD, 20);

		f.setBounds(750, 450, 400, 150);
		f.setResizable(false);
		f.setLayout(null);// 자동배치 끄기

		// 팝업창 배경설정
		ImageIcon backPop = new ImageIcon("pink.png");
		JLabel jl = new JLabel(backPop);
		jl.setBounds(0, 0, 400, 150);

		// 팝업창 레이블 텍스트 설정
		JLabel j2 = new JLabel("정말 취소 하시겠습니까?");
		j2.setFont(font);
		j2.setBounds(85, 15, 250, 100);

		// 팝업창 버튼 추가하기
		Font font1 = new Font("", Font.BOLD, 16);

		Button btnY = new Button("YES");
		btnY.setFont(font1);
		btnY.setBounds(100, 90, 80, 30);

		Button btnN = new Button("NO");
		btnN.setFont(font1);
		btnN.setBounds(210, 90, 80, 30);

		// 버튼 감지자 설정
		btnN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		btnY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				popUp_btnY();
			}
		});

		f.add(btnN);
		f.add(btnY);
		f.add(j2);
		f.add(jl);

		f.setVisible(true);

		// 팝업 창 x버튼 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}// popUp()

	// 취소 팝업창에서 yes 눌렀을 경우 띄워주는 팝업창 메서드
	public void popUp_btnY() {

		Frame f = new Frame("Reservation cancellation");
		Font font = new Font("", Font.BOLD, 20);

		f.setBounds(750, 450, 400, 150);
		f.setResizable(false);
		f.setLayout(null);// 자동배치 끄기

		// 팝업창 배경설정
		ImageIcon backPop = new ImageIcon("pink.png");
		JLabel jl = new JLabel(backPop);
		jl.setBounds(0, 0, 400, 150);

		// 팝업창 레이블 텍스트 설정
		JLabel jl2 = new JLabel("예약이 취소되었습니다.");
		jl2.setFont(font);
		jl2.setBounds(95, 5, 250, 100);

		JLabel jl3 = new JLabel("이용해 주셔서 감사합니다.");
		jl3.setFont(font);
		jl3.setBounds(85, 40, 250, 100);

		Button btn = new Button("OK");
		btn.setBounds(170, 105, 50, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.add(btn);
		f.add(jl3);
		f.add(jl2);
		f.add(jl);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			private void closing() {
				System.exit(0);
			}
		});

	}// popUp_btnY()

	public void popUp_cancle() {

		Frame f = new Frame("Reservation cancellation");
		Font font = new Font("", Font.BOLD, 20);

		f.setBounds(750, 450, 400, 150);
		f.setResizable(false);
		f.setLayout(null);// 자동배치 끄기

		// 팝업창 배경설정
		ImageIcon backPop = new ImageIcon("pink.png");
		JLabel jl = new JLabel(backPop);
		jl.setBounds(0, 0, 400, 150);

		// 팝업창 레이블 텍스트 설정
		JLabel jl2 = new JLabel("ID와 PWD를 입력해주세요.");
		jl2.setFont(font);
		jl2.setBounds(80, 15, 250, 100);

		Button btn = new Button("OK");
		btn.setBounds(170, 90, 50, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		f.add(btn);
		f.add(jl2);
		f.add(jl);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			private void closing() {
				System.exit(0);
			}
		});

	}// popUp_cancle()

}
