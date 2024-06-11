package reserv_hotel_3_4;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import loginEx_1.User;
import loginEx_1.UserL;
import loginEx_1.UserW;

public class PayStarting {


	int[] cntt = new int[4];
	static Frame fps ;

	static boolean re_ok = true;
	static int user_resNum;

	User uInfo = new User();  

	List<String> user_reserv = new ArrayList<String>();

	static Reserv_info binfo = new Reserv_info();

	public PayStarting(String aa, String id, List<String> reserv_day) {

		// 1. 결제 진행 중 창
		fps = new Frame("Payment in progress"); 
		Font font = new Font("", Font.BOLD, 30);
		fps.setLayout(null);
		fps.setBounds(750, 300, 400, 550);
		/////////////////////////////////

		// 2. 사용할 폰트들 
		Font font2 = new Font("", Font.ROMAN_BASELINE, 20); // 타이틀 같은 곳에 사용
		Font font_sWord = new Font("", Font.HANGING_BASELINE, 13); // 세부사항에 사용
		Font word = new Font("", Font.HANGING_BASELINE, 15); // 이전, 결제
		////////////////////////////////////

		// 3. 통합 배경
		// 전체 뒷 배경
		ImageIcon imgs = new ImageIcon("결제.png");
		JLabel jl = new JLabel(imgs);
		jl.setBounds(0, 0, 400, 700);
		// "Pay..........."
		JLabel room_info = new JLabel("Pay.........................................");
		room_info.setBounds(23, 35, 400, 35); 
		room_info.setFont(font);
		// aa : HotelFrame에서 고른 호텔 이비지
		ImageIcon room_img = new ImageIcon(aa);
		JLabel ji = new JLabel(room_img);
		ji.setBounds(10, 70, 195, 195);


		////////////////////////////////////////////////////////////////////////

		// 4. 선택한 방 정보 출력
		int lo = 0; // 줄력할 행 번호 설정
		//다차원 배열 : {{room1 정보}, {room2 정보}, {room3 정보}, {room4 정보}}
		String room_name = ""; // 선택한 방에 대해 출력할 문자열
		String room_dinfo = ""; // 선택한 방에 대해 출력할 문자열

		// HotelFrame에서 받아온 이미지별 방 번호
		switch (aa) { 
		case "Type1.jpg": 
			re_ok = true;
			room_name = "Room1";
			room_dinfo = "Room1.jpg";
			break;
		case "Type2.jpg": 
			re_ok = true;
			room_name = "Room2";
			room_dinfo = "Room2.jpg";
			break;
		case "Type3.jpg": 
			re_ok = true;
			room_name = "Room3";
			room_dinfo = "Room3.jpg";
			break;
		case "Type4.jpg": 
			re_ok = true;
			room_name = "Room4";
			room_dinfo = "Room4.jpg";
			break;
		case "Type5.jpg": 
			re_ok = true;
			room_name = "Room5";
			room_dinfo = "Room5.jpg";
			break;
		case "Type6.jpg": 
			re_ok = true;
			room_name = "Room6";
			room_dinfo = "Room6.jpg";
			break;
		case "Type7.jpg": 
			re_ok = true;
			room_name = "Room7";
			room_dinfo = "Room7.jpg";
			break;
		case "Type8.jpg": 
			re_ok = true;
			room_name = "Room8";
			room_dinfo = "Room8.jpg";
			break;
		default :
			re_ok = false;
			room_name = aa;
			break;
		}

		// 방 종류 출력
		JLabel info_title = new JLabel(room_name);
		info_title.setBounds(240, 70, 120, 30);
		info_title.setFont(font);
		/////////////////////////////////////////////////////////////////////////////////

		//결제정보 입력안내//
		Font foonn = new Font("", Font.ROMAN_BASELINE, 20);
		Label jlb = new Label("          결제하실 정보를 입력해 주세요");
		jlb.setBounds(0, 284, 400, 30);
		jlb.setFont(foonn);
		jlb.setBackground(Color.pink);
		fps.add(jlb);


		// 결제 기간
		JLabel firstDay = new JLabel(reserv_day.get(0) + "월 " 
				+ reserv_day.get(1) + "일부터");
		firstDay.setFont(font2);
		firstDay.setBounds(235, 120, 190, 40);
		JLabel finalDay = new JLabel(reserv_day.get(2) + "월 " 
				+ reserv_day.get(3) + "일까지");
		finalDay.setFont(font2);
		finalDay.setBounds(235, 170, 190, 40);

		// 금액 출력
		JLabel show_money = new JLabel("금액 : " + Reservation.res_money + " ￦");
		show_money.setFont(font2);
		show_money.setBounds(210, 150, 195, 195);

		fps.add(show_money);
		//////////////////////////////////////////////////////////////////////////////



		//'카드사'와 '카드번호' 출력 label
		Font fonn = new Font("", Font.ROMAN_BASELINE, 17);

		JLabel lab = new JLabel("카드사");
		lab.setBounds(20, 320, 80, 28);
		lab.setFont(fonn);

		JLabel lab2 = new JLabel("카드번호");
		lab2.setBounds(20, 390, 80, 28);
		lab2.setFont(fonn);

		JLabel lab3 = new JLabel("CVC번호");
		lab3.setBounds(200, 390, 80, 28);
		lab3.setFont(fonn);

		fps.add(lab);
		fps.add(lab2);
		fps.add(lab3);

		//////////////////////////////////////////////////////////////////////

		//결제할 카드 정보
		Choice cho = new Choice();
		cho.setBounds(20, 355, 80, 0);
		cho.add("신한");
		cho.add("우리");
		cho.add("농협");
		cho.add("국민");
		cho.add("하나");
		cho.add("KH");

		Font fon = new Font("", Font.ROMAN_BASELINE, 15);
		cho.setFont(fon);
		fps.add(cho);
		///////////////////////////////////

		//입력받을 CVC번호

		JTextField tex = new JTextField();
		tex.setBounds(290, 390, 80, 30);
		tex.setFont(fon);
		tex.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(tex.getText().length() > 2) {
					tex.setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_BACK_SPACE) {
					tex.setEditable(true);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});

		fps.add(tex);

		////////// CVC번호 요까지 ////////////////////////////////////////////////////

		//입력받을 카드번호
		Font fon2 = new Font("", Font.ROMAN_BASELINE, 20);
		JTextField[] textFields = new JTextField[4];

		for (int i = 0; i < 4; i++) {
			textFields[i] = new JTextField(30);
			textFields[i].setBounds(20 + (i * 90), 430, 80, 30);
			textFields[i].setFont(font);
			//fps.add(textFields[i]);

			// 여기서 포커스 이동 기능을 추가합니다.
			final int index = i;
			textFields[i].addKeyListener( new KeyAdapter() {

				@Override
				public void keyTyped(KeyEvent e) {
					JTextField source = (JTextField) e.getSource();
					if (source.getText().length() >= 4) {
						e.consume(); // 키 입력 무시
					}
				}
				@Override
				public void keyReleased(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						JTextField source = (JTextField) e.getSource();
						if (source.getText().isEmpty()) {
							if (index > 0) {
								textFields[index - 1].requestFocusInWindow(); // 이전 텍스트 필드로 포커스 이동
							}
						}
					}else if (e.getKeyCode() != KeyEvent.VK_ENTER) {
						JTextField source = (JTextField) e.getSource();
						if (source.getText().length() >= 4 && index < textFields.length - 1) {
							textFields[index + 1].requestFocusInWindow(); // 다음 텍스트 필드로 포커스 이동
						}
					}
				}

			});
			fps.add(textFields[i]);
		}//for 
		Button btn2 = new Button("계속");
		btn2.setFont(word);
		btn2.setBackground(Color.pink);
		btn2.setBounds(315, 480, 60, 30);

		btn2.addActionListener(new ActionListener() { // 결제
			@Override
			public void actionPerformed(ActionEvent e) {

				for(String n : reserv_day) {
					user_reserv.add(n);
				}

				// 장바구니에 담은 정보 다시 결제 진행 >> 평소엔 로드를 Reservation()에서 하기 때문에 여기서 다시 해줘야 한다.
				if(!re_ok) { 
					binfo.setRoom_name(aa); // 1. 해당 방의 폴더로 경로 연결
					ReservLoad rload = new ReservLoad(binfo); // 2. 정보 읽어오기
					binfo = rload.info;
					Reservation.total_reser = binfo.getTotal_reser();
					Reservation.user_res_List = binfo.getUser_res_List();
					for(String num : reserv_day) {
						Reservation.total_reser.add(num);
					}

					if(Reservation.user_res_List.size() < 1) {
						Reservation.user_res_List.add(0);
					}else {
						// 리스트 마지막에 있는 수에서 1 더한 값
						Reservation.user_res_List.add(Reservation.user_res_List.size());
					}
					user_resNum = Reservation.user_res_List.get(Reservation.user_res_List.size()-1);
					binfo.setUser_res_List(Reservation.user_res_List);
					binfo.setTotal_reser(Reservation.total_reser);

					ReservSave r = new ReservSave(binfo);
				}
				uInfo.setUser_resNum(user_resNum);
				uInfo.setUser_reserv(user_reserv);;  
				new UserW(uInfo);
				ReservSave rs = new ReservSave(Reservation.rinfo);
				rs.check();

			}
		});

		textFields[0].addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(textFields[0].getText().length() > 3) {
					textFields[0].setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_BACK_SPACE) {
					textFields[0].setEditable(true);
					//code to execute if backspace is pressed
				}
				if( textFields[0].getText().length() > 3  && textFields[1].getText().length() > 3 
				&& textFields[2].getText().length() > 3 && textFields[3].getText().length() > 3) {
					
					btn2.setEnabled(true);
				}else {
					btn2.setEnabled(false);
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

		textFields[1].addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(textFields[1].getText().length() > 3) {
					textFields[1].setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_BACK_SPACE) {
					textFields[1].setEditable(true);
					//code to execute if backspace is pressed
				}
				if( textFields[0].getText().length() > 3 && textFields[1].getText().length() > 3 && textFields[2].getText().length() > 3 && textFields[3].getText().length() > 3) {
					btn2.setEnabled(true);
				}else {
					btn2.setEnabled(false);
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textFields[2].addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(textFields[2].getText().length() > 3) {
					textFields[2].setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_BACK_SPACE) {
					textFields[2].setEditable(true);
					//code to execute if backspace is pressed
				}
				if( textFields[0].getText().length() > 3  || textFields[1].getText().length() > 3 || textFields[2].getText().length() > 3 || textFields[3].getText().length() > 3) {
					System.out.println("dxfgdxgfvxfg");
					btn2.setEnabled(true);
				}else {
					btn2.setEnabled(false);
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textFields[3].addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(textFields[3].getText().length() > 3) {
					textFields[3].setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_BACK_SPACE) {
					textFields[3].setEditable(true);
					System.out.println(cntt[0]);
					//code to execute if backspace is pressed
				}
				if( textFields[0].getText().length() > 3  && textFields[1].getText().length() > 3 && textFields[2].getText().length() > 3 && textFields[3].getText().length() > 3) {
					System.out.println("dxfgdxgfvxfg");
					btn2.setEnabled(true);
				}else {
					btn2.setEnabled(false);
				}


			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});



		///////////////////카드번호는 여기까지 끝//////////////////////////////////////////

		// 해당 프레임 창 뒤로 가거나 다음 창으로 갈 경우
		Button btn1 = new Button("이전");
		btn1.setFont(word);
		btn1.setBackground(Color.pink);
		btn1.setBounds(25, 480, 60, 30);
		// 이전, 결제 쪽 연핑크 창
		ImageIcon under = new ImageIcon("창.png");
		JLabel underj = new JLabel(under);
		underj.setBounds(18, 642, 365, 40);
		//////////////////////////////////////////////////////////////////////////////////////

		fps.add(info_title);
		fps.add(finalDay);
		fps.add(firstDay);
		fps.add(btn1);
		fps.add(btn2);
		fps.add(underj);
		fps.add(ji);
		fps.add(room_info);
		fps.add(jl);

		uInfo.setId(id);
		UserL uload = new UserL(uInfo);

		btn2.setEnabled(false);
		uInfo = uload.user;

		while(user_reserv.remove(null)) {
			user_reserv = uInfo.getUser_reserv();
		}


		user_reserv.add(room_name);
		System.out.println(uInfo.getUser_reserv());

		btn1.addActionListener(new ActionListener() { // 이전
			@Override
			public void actionPerformed(ActionEvent e) {
				new PayStarting_exit();// 종료 경고 팝업 창
			}
		});




		fps.setVisible(true);
		fps.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				new PayStarting_exit(); // 종료 경고 팝업 창
			}
		});
	}
}