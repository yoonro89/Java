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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import loginEx_1.User;
import loginEx_1.UserL;
import loginEx_1.UserW;

public class Reservation {

	// 캘린더 함수 선언
	static Calendar today1 = Calendar.getInstance();
	static Frame f;

	// 초기 시작 일자 선언
	static int month = 1;
	static Label mon;
	static int day_week = 1;

	static List<Integer> user_res_List = new ArrayList<Integer>(); // 예약번호
	// 통합 예약 정보를 담을 리스트 선언
	static List<String> total_reser =  new ArrayList<String>(); // 예약 정보 리스트
	// 선택된 일자 리스트 선언
	static List<String> reserv_day = new ArrayList<String>();
	List<Label> reserv_day_print =  new ArrayList<Label>();
	// 달력용 일자로 사용할 버튼을 선언 
	List<JButton> dayList = new ArrayList<JButton>(); 
	// 사용자가 장바구니에 담을 리스트를 선언
	List<String> user_basket = new ArrayList<String>();
	// 호텔 예약 정보 클래스 호출
	static Reserv_info rinfo = new Reserv_info();
	// 금액 표시용 라벨
	Label pay;
	// 예약 시작일과 종료일을 구분하기 위한 정수형 변수
	int cnt = 0;
	// 1박당 금액
	static int money = 0; 
	// 숙박횟수
	int money_cnt = 0; 
	// 총 금액 표시
	String money_day = "" + money + "￦";
	static int res_money = 0;
	// 사용자의 예약 정보를 담을 클래스 호출
	User uInfo = new User();  

	public Reservation(String aa, String id) { // 이전 클래스에서 보내준 (호텔 방 이미지, 사용자의 ID) 

		// 1. 전체 프레임 창
		f = new Frame("Reservation");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setBounds(750, 250, 400, 700);
		/////////////////////////////////


		// 2. 사용할 폰트들 
		Font font = new Font("", Font.BOLD, 25); // 타이틀 같은 곳에 사용
		Font font2 = new Font("", Font.BOLD, 20); // 타이틀 같은 곳에 사용
		Font font_sWord = new Font("", Font.HANGING_BASELINE, 13); // 세부사항에 사용
		Font word = new Font("", Font.HANGING_BASELINE, 15); // 이전, 결제
		////////////////////////////////////


		// 3. 통합 배경
		// 전체 뒷 배경
		ImageIcon img = new ImageIcon("호텔3.jpg");
		JLabel jl = new JLabel(img);
		jl.setBounds(10, 10, 380, 680);
		// 방 정보 칸
		Label room = new Label("");
		room.setBounds(18, 90, 365, 545); 
		room.setBackground(Color.white); 
		// "Detail for the reservation"
		JLabel room_info = new JLabel("Detail for the reservation");
		room_info.setBounds(20, 55, 390, 35); 
		room_info.setFont(font);
		// aa : HotelFrame에서 고른 호텔 이비지
		ImageIcon room_img = new ImageIcon(aa);
		JLabel ji = new JLabel(room_img);
		ji.setBounds(25, 98, 195, 195);
		/////////////////////////////////////


		// 4. 선택한 방 정보 출력
		int lo = 0; // 줄력할 행 번호 설정
		//다차원 배열 : {{room1 정보}, {room2 정보}, {room3 정보}, {room4 정보}}
		String room_name = ""; // 선택한 방에 대해 출력할 문자열
		String room_dinfo = ""; // 선택한 방에 대해 출력할 문자열
		// 방 별 금액 
		int[] price = {250000, 350000, 400000, 200000, 150000, 400000, 250000, 260000};

		// HotelFrame에서 받아온 이미지별 방 번호애 따라 표시할 방 이름과, 방 정보 변경
		switch (aa) { 
		case "Type1.jpg": 
			room_name = "Room1";
			room_dinfo = "Room1.jpg";
			money = price[0];
			break;
		case "Type2.jpg": 
			room_name = "Room2";
			room_dinfo = "Room2.jpg";
			money = price[1];
			break;
		case "Type3.jpg": 
			room_name = "Room3";
			room_dinfo = "Room3.jpg";
			money = price[2];
			break;
		case "Type4.jpg": 
			room_name = "Room4";
			room_dinfo = "Room4.jpg";
			money = price[3];
			break;
		case "Type5.jpg": 
			room_name = "Room5";
			room_dinfo = "Room5.jpg";
			money = price[4];
			break;
		case "Type6.jpg": 
			room_name = "Room6";
			room_dinfo = "Room6.jpg";
			money = price[5];
			break;
		case "Type7.jpg": 
			room_name = "Room7";
			room_dinfo = "Room7.jpg";
			money = price[6];
			break;
		case "Type8.jpg": 
			room_name = "Room8";
			room_dinfo = "Room8.jpg";
			money = price[7];
			break;
		}

		// 방 종류 출력
		Label info_title = new Label(room_name);
		info_title.setBounds(230, 100, 100, 30);
		info_title.setFont(font);

		// 방 정보 이미지 출력
		ImageIcon roomqq = new ImageIcon(room_dinfo);
		JLabel room2_info = new JLabel(roomqq);
		room2_info.setBounds(230, 134, 140, 158);
		room2_info.setFont(font);

		f.add(room2_info);
		/////////////////////////////////////////////////////////////////////////////


		// 5. 예약 정보+ 달력 출력
		Calendar  today = Calendar.getInstance(); // 달력 불러오기
		month = today.get(Calendar.MONTH) + 1; // 달은 0월~11월로 있기 때문에, 달이 정확하게 나오려면 +1 필요

		// 달 출력
		Label mon = new Label(""+ month + "월");
		mon.setBounds(180, 301, 50, 25); 
		mon.setFont(font);
		f.add(mon);

		// 요일 표시할 배열
		String[] week_str = {"일", "월", "화", "수", "목", "금", "토"};
		Label[] week = new Label[week_str.length]; // 각 항목들을 레이블로 담을 배열

		int wlot_X = 40; // 이동 전 초기 위치
		// 요일 출력
		for(int i = 0; i < week_str.length; i++) {
			week[i] = new Label(week_str[i]);
			week[i].setBounds(wlot_X, 325, 28, 20);
			week[i].setFont(font_sWord);
			if(i == 0) { week[i].setForeground(Color.red);} // 일요일 빨간색
			f.add(week[i]);
			wlot_X += 50; // 50 정도씩 오른쪽으로 이동
		}

		// >> 월별 일 수 출력 -----------------------------------사전 준비
		Day da = new Day(); // 출력할 달의 정보를 판별
		da.daying(); // 예약할 달의 일수와 1일의 요일을 불러옴
		// da.getWeek_cnt() : 해당 달 1일의 요일 , da.getDayday() : 해당 달의 일 수

		// *일자를 출력하기 전에, 호텔 통합 예약 리스트에서 예약이 끝난 방 정보를 불러온다*

		rinfo.setRoom_name(room_name); // 1. 해당 방의 폴더로 경로 연결
		ReservLoad rload = new ReservLoad(rinfo); // 2. 정보 읽어오기
		rinfo = rload.info;
		total_reser = rinfo.getTotal_reser();
		user_res_List = rinfo.getUser_res_List();
		ReserDayList notRes = new ReserDayList(); // 3. 지금 표시된 달에 예약 되어있는 일자를 선별
		notRes.reserDayListed(da.dayday); // 해당 달이 며칠까지 있는지 확인이 필요함

		// 본격적으로 월뱔 일 수 출력------------------------------

		// 가장 좌측 상단 첫 라벨의 위치
		int day_X = 28 ;
		int day_Y = 345;

		int day_cnt = 1; // 일자를 출력할 변수
		for(int i = 0; i < 42; i++) { // 6 X 7 칸 출력
			// 1일 ~ 해당 달의 마지막 일자가 속하지 않는 경우 
			if(i+1 < da.getWeek_cnt() || day_cnt > da.getDayday()) {
				dayList.add(new JButton("")); 
				dayList.get(i).setBackground(Color.darkGray); 
				dayList.get(i).setEnabled(false); // 버튼 비활성화

			}else { // 1일 ~ 해당 달의 마지막 일자에 속하는 경우 
				dayList.add(new JButton("" + day_cnt)); // 일자 출력 >> 1 ~ 29, 30, 31

				// 예약 정보에 
				if(notRes.total_mos.contains(day_cnt)){ // 예약할 일자가 이미 예약되어 있는 경우
					// 비활성화 >> 중복 예약 불가
					dayList.get(i).setBackground(Color.lightGray); 
					dayList.get(i).setEnabled(false); 

				}else {// 1일 ~ 마지막 일 구간에 속해있는 경우 + 예약되어 있지 않은 경우
					// 활성화 >> 예약 가능
					dayList.get(i).setEnabled(true);
					dayList.get(i).setBackground(Color.white); 
				}
				day_cnt++;
			}

			// 판정난 버튼의 위치 배치
			dayList.get(i).setBounds(day_X, day_Y, 48, 30);
			dayList.get(i).setFont(font_sWord);

			if(day_X == 28) { // 버튼의 위치가 가장 왼쪽일때,
				dayList.get(i).setForeground(Color.red); // 일요일 >> 빨간색 출력
			}
			f.add(dayList.get(i));

			if(day_X == 28 + 50*6) { // 7번째 칸의 경우 아래 행으로 내려감
				day_Y += 32;
				day_X = 28;
				continue;
			}
			day_X += 50; // 50씩 오른쪽으로 이동 

		}//for	
		////////////////////////////////////////////////////////////////

		// 6. 하단 버튼 정보
		// 해당 프레임 창 뒤로 가거나 다음 창으로 갈 경우
		Button btn1 = new Button("이전");
		btn1.setFont(word);
		btn1.setBackground(Color.pink);
		btn1.setBounds(25, 648, 60, 30);
		Button btn2 = new Button("결제");
		btn2.setFont(word);
		btn2.setBackground(Color.pink);
		btn2.setBounds(315, 648, 60, 30);
		btn2.setEnabled(false);
		// 예약한 일자를 장바구니에 담을 경우
		Button basket = new Button("장바구니에 담기");
		basket.setFont(word);
		basket.setBackground(Color.white);
		basket.setBounds(115, 648, 170, 30);
		basket.setEnabled(false);
		f.add(basket);
		/////////////////////////////////////////////////////////////

		// 7. 사용자의 아이디로 개인 정보 로드
		uInfo.setId(id);
		UserL uload = new UserL(uInfo);
		uInfo = uload.user;

		// 빈 리스트에 들어있는 null 값 모두 제거 
		while(user_basket.remove(null)) {
			user_basket = uInfo.getUser_basket(); // 해당 사용자의 장바구니 리스트를 불러옴
		}
		// 선택한 방 이름 더하기
		user_basket.add(room_name);

		// 장바구니 버튼을 눌렀을 때, 선택한 방과 기간을 개인 정보에 저장
		basket.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 선택되어 있는 기간을 개인 장바구리 리스트에 옮겨담는다.
				for(int i = 0; i < reserv_day.size(); i++) {
					user_basket.add(reserv_day.get(i));
				}
				uInfo.setUser_basket(user_basket);
				new UserW(uInfo); // 저장
				
				new Basket();
				
			}
		});
		//////////////////////////////////////////////////


		// 이전, 결제 쪽 연핑크 창
		ImageIcon under = new ImageIcon("창.png");
		JLabel underj = new JLabel(under);
		underj.setBounds(18, 642, 365, 40);
		////////////////////////////////////////////

		// 8. 달력 일자 버튼이 작동하게 될 경우 -----ex) [4, 5, 4, 10] >> 4월 5일 ~ 4월 10일 ----------------------------------------
		ActionListener daypick = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 기간 리스트에 선택한 일자의 달 정보를 추가
				reserv_day.add("" + month);

				// ------시작일-----------------------------------------------------------------------------------------
				if(reserv_day.size() <= 2) { // << 첫번째 클릭
					// 장바구니, 결제 버튼 비활성화
					basket.setEnabled(false);
					btn2.setEnabled(false);
					// 해당 달의 1일 부터 마지막일 까지 반복
					for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt; i++) {
						if(dayList.get(i).getText().equals(e.getActionCommand())) { // 클릭한 버튼을 총 일자 버튼 리스트에서 찾는다
							dayList.get(i).setBackground(Color.pink); // 클릭한 버튼은 핑크
							reserv_day.add(dayList.get(i).getText()); // 기간 리스트에 일 정보 추가
							cnt = i; // 총 일자 버튼중 클릭한 버튼의 index 정보를 저장
							break;
						}else {
							dayList.get(i).setEnabled(false); // 클릭한 버튼 이전의 버튼들은 모두 비활성화
						}
					}//for	
				}

				//-----종료일------------------------------------------------------------------------------------------------
				if(reserv_day.size() == 3) { // << 두번째 클릭

					// 같은 달에 예약 했을 경우 - - - - - - - - ex)  [4, 6, 4, 12]  >>  4/6 ~ 4/12 - - - - - - -- - - - -- - - - - - -- 
					if(reserv_day.get(0).equals(reserv_day.get(2))) { 
						reserv_day.add(e.getActionCommand()); // 클릭한 버튼에 적힌 달을 추가

						// cnt는 시작일의 일자로, 시작일부터 이번 달 끝까지 반복한다. 
						for(int i = cnt + 1; i < da.dayday + da.week_cnt -1; i++) {

							// 종료일보다 커지면 비활성화
							if(Integer.parseInt(dayList.get(i).getText()) > Integer.parseInt(e.getActionCommand())) { 
								dayList.get(i).setEnabled(false);

								// 시작일부터 종료일까지는 활성화. 단, *사이에 예약된 버튼(비활성화 된 버튼)이 있을 경우* 예약불가	
							}else if(Integer.parseInt(dayList.get(i).getText()) <= Integer.parseInt(e.getActionCommand())){

								// * 중간에 예약된 버튼이 있을 경우 *
								if(!dayList.get(i).isEnabled()) { // isEnabled() >> 버튼의 활성화 여부를 감지하며, 활성화시 true, 비활성화시 false를 반환
									// 기간 리스트를 초기화 하고 예약 불가 창을 연다
									reserv_day.clear();
									new ResNot(); // 예약 불가 창
									break;

								}else { // 중간에 예약된 버튼이 없을 경우
									dayList.get(i).setBackground(Color.pink);
									money_cnt = Integer.parseInt(reserv_day.get(3)) - Integer.parseInt(reserv_day.get(1));
								}
							}
						}//for

						// 예약일자가 달이 다를 경우  -- - - - - ex)  [3, 29, 4, 12]  >>  3/29 ~ 4/12-- - - -- - - - - -- - -- - -- - 
					}else if(!reserv_day.get(0).equals(reserv_day.get(2))) { 
						reserv_day.add(e.getActionCommand());// 클릭한 버튼에 적힌 달을 추가

						// 시작일은 이전달에 있기 때문에 결국 칠해지는건 1일부터 보여진다, for문은 1일부터 이번 달 끝까지 반복한다. 
						outer:	for(int j = da.week_cnt -1; j < da.dayday + da.week_cnt -1; j++) {
							// 일자가 종료일을 넘어서는 버튼들은 모두 비활성화
							if(Integer.parseInt(dayList.get(j).getText()) > Integer.parseInt(e.getActionCommand())) {
								dayList.get(j).setEnabled(false);

							}else { // 일자가 종료일을 넘어서지 않을 경우


								// <달별 비교> --------------------------------
								//
								// notRes는 통합 예약 리스트를 분할해 가지고 있는 클래스로, notRes 클래스의 AllDayMon은 특정 달이 모두 예약되어 비활성화 되어있는 달을 담아둔다 
								// 예약한 기간에서, 시작일의 달부터 종료일의 달까지 반복한다 
								for(int k = Integer.parseInt(reserv_day.get(0)); k <= Integer.parseInt(reserv_day.get(2)); k++) {
									// 예약한 기간 중 비활성화 되어 있는 달이 있을 경우 >> 클릭한 기간 초기화 및 예약 불가 창 열기
									if(notRes.getAllDayMon().contains("" + k)) {
										reserv_day.clear();
										new ResNot();
										break outer; // 완전 밖으로
									}

									// 시작일의 달부터 종료일의 달까지와 통합 예약된 달 정보 리스트를 비교하여 같은 달이 있는지 확인
									for(int n = 0; n < notRes.total_mon.size(); n++) {
										// 같은 달이 있는 경우 해당 시작 일자가 통합 예약 정보의 일자보다 작은지를 판단 
										if(notRes.total_mon.get(n).equals(""+k) && Integer.parseInt(notRes.total_day.get(n)) > Integer.parseInt(reserv_day.get(1)) ){
											// >> 초기화 및 예약 불가 창 열기
											reserv_day.clear();
											new ResNot();
											break outer;
										}
									}//inner
								}// outer


								// <일별 비교>------------------------------------------
								// 달력 일자 버튼이 비활성화 되어 있고, 해당 일자가 1 ~ 마지막 일에 속하는 경우
								if(!dayList.get(j).isEnabled() && !dayList.get(j).getText().equals("")) {
									// >> 초기화 및 예약 불가 창 열기
									reserv_day.clear();
									new ResNot();
									break;
								}else {
									// 아닌 경우 총 일수 카운트

									// 숙박일 = 이전 달 - 기간 리스트가 가지고 있는 시작 일자 + 기간 리스트가 가지고 있는 종료 일자 
									money_cnt = da.day1 - Integer.parseInt(reserv_day.get(1)) + Integer.parseInt(reserv_day.get(3));

									// + 4/27 ~ 5/2 같이 한달 안에 있는게 아닌  4/27 ~ 6/2일 같이 특정 한달 이상이 포함되어 있는 경우 그 달의 일수도 같이 더해준다
									for(int k = Integer.parseInt(reserv_day.get(0)) + 1; k < Integer.parseInt(reserv_day.get(2)); k++) {
										// 달별 일 수 반환
										switch (k) {
										case 2: 
											money_cnt += 29;
											break;
										case 4 : 
										case 6 :
										case 9 :
										case 11: 
											money_cnt += 30;
											break;
										case 1 :
										case 3 :
										case 5 :
										case 7 :
										case 8 :
										case 10 :
										case 12 :
											money_cnt += 31;
											break;
										}
									}//for
									dayList.get(j).setBackground(Color.pink); // 클릭한 일 수 핑크
								}
							}
						}
					}
				}

				// 버튼 리셋 -------------------------------------------------------------------------------------------------------------------------
				if(reserv_day.size() > 4) {
					// 장바구니 결제 버튼 비활성화, 기간 리스트 초기화
					basket.setEnabled(false);
					btn2.setEnabled(false);
					reserv_day.clear();

					// 해당 달의 시작 일자와 마지막 일자를 다시 출력
					for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
						// 다시 해당 일자가 예약 불가한 일자에 있는지 확인
						if(notRes.total_mos.contains(i)){
							dayList.get(i).setBackground(Color.lightGray); 
							dayList.get(i).setEnabled(false); 
						}else {// 1일 ~ 마지막 일 구간에 속해있는 경우 + 예약한 일자에 속해있지 않은 경우
							dayList.get(i).setEnabled(true);
							dayList.get(i).setBackground(Color.white); 
						}
						money_cnt = 0; // 숙박 금액 초기화
					}// for
				}

				// 기간 선택 완료 -----------------------------------------------------------------------------------------------------------------------
				if(reserv_day.size() == 4) {
					// 장바구니, 결제 버튼 활성화
					basket.setEnabled(true);
					btn2.setEnabled(true);

					// 기간 정보를 
					int res_x = 28;
					int c = 0;
					for(int i = 0; i < 2; i++)  {
						reserv_day_print.get(i).setText(reserv_day.get(c) + "월 " + reserv_day.get(c+1) + "일  ");
						//					f.add(reserv_day_print.get(i));
						System.out.println(reserv_day_print.get(i).getText());
						res_x += 100;
						c+=2;
					}
					pay.setText("￦ " + money * money_cnt );
					res_money = money * money_cnt;
				}
			}
		};
		// 각 버튼에 기능 추가
		for(int i = 0; i < dayList.size(); i++) {
			dayList.get(i).addActionListener(daypick);
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////


		// 입력한 날짜 출력
		Label label = new Label();
		label.setText("선택하신 날짜는");
		label.setBounds(28, 545, 91, 25);
		label.setBackground(Color.pink);
		f.add(label);

		//예약 불가 표시
		JButton res_no = new JButton("예약 불가");
		res_no.setEnabled(false);
		res_no.setBackground(Color.lightGray);
		res_no.setBounds(277, 545, 100, 25); 
		res_no.setFont(font_sWord);
		f.add(res_no);

		// 예약 일자 표시
		int res_x = 28;
		for(int i = 0; i < 2; i++)  {

			reserv_day_print.add(new Label(month + "월 " +  + today1.get(Calendar.DATE) +"일  "));
			reserv_day_print.get(i).setBounds(res_x, 585, 100, 40);
			reserv_day_print.get(i).setFont(font2);
			f.add(reserv_day_print.get(i));

			res_x += 100;
		}

		//금액
		pay = new Label("￦" + money);
		pay.setBounds(260, 585, 120, 40);
		pay.setFont(font2);

		f.add(pay);
		///////////////////////////////////////////////////


		// 달력 달 이동 버튼
		Button ba = new Button("<");
		ba.setFont(font);
		ba.setBackground(Color.pink);
		ba.setBounds(30, 298, 25, 25);
		f.add(ba);
		Button ne = new Button(">");
		ne.setFont(font);
		ne.setBackground(Color.pink);
		ne.setBounds(347, 298, 25, 25);
		f.add(ne);

		// 9. *버튼 이동시 달력의 변화 조정* -------------------------------------------------------------------------------
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) { // 클릭한 버튼의 문자열을 확인
				case "<": // 이전 달
					month--;
					break;
				case ">": // 다음 달
					month++;
					break;
				}

				// 출력한 달이 1월이나 12월이기 때문에 더 이상 넘어갈 수 없을 경우 >> 해당 버튼 비활성화
				if(month == 1 ){
					ba.setEnabled(false); 
				}else if(month == 12){
					ne.setEnabled(false); 
				}else {
					ba.setEnabled(true); 
					ne.setEnabled(true); 
				}

				// 바뀐 달 다시 출력
				mon.setText(""+ month + "월");

				// da.daying 다시 호출
				da.daying(); // month의 변화에 따른 Daying 메서트의 변화를 불러옴

				// 출력할 달의 예약 정보를 다시 불러온다.
				notRes.setting(); // 이전 정보 리스트 초기화 
				notRes.reserDayListed(da.dayday); // 출력할 달의 정보를 재정립

				// 월별 일 수 다시 출력-----------------------------------------------------
				int day_cnt = 1; // 출력할 달의 일수를 출력하기 위한 정수
				for(int i = 0; i < 42; i++) {
					if(i+1 < da.getWeek_cnt() || day_cnt > da.getDayday()) {
						dayList.get(i).setText(""); // 1일 ~ 마지막 일 구간에 속해있지 않은 경우
						dayList.get(i).setBackground(Color.darkGray); 
						dayList.get(i).setEnabled(false); // 1일 ~ 마지막 일 구간에 속해있지 않은 경우

					}else {
						dayList.get(i).setText("" + (day_cnt)); // // 1일 ~ 마지막 일 구간에 속한 경우

						// 예약할 일자가 이미 예약되어 있는 경우
						if(notRes.total_mos.contains(day_cnt) || notRes.getAllDayMon().contains("" + month)){
							dayList.get(i).setBackground(Color.lightGray); 
							dayList.get(i).setEnabled(false); 

						}else {// 1일 ~ 마지막 일 구간에 속해있는 경우 + 예약한 일자에 속해있지 않은 경우
							dayList.get(i).setEnabled(true);
							dayList.get(i).setBackground(Color.white); 
						}
						day_cnt++;
					}
					if(i % 7 == 0) { // 일요일
						dayList.get(i).setForeground(Color.red); // 빨간색
					}
				}//for	

				// 다른 달에 예약한 경우--------------------------------------------------------------------
				if(reserv_day.size() == 4 && !reserv_day.get(0).equals(reserv_day.get(2))) {

					// 바뀐 달에서 예약한 달이 나올 경우 >> 시작일
					if(reserv_day.get(0).equals("" + month)) {

						// 해당 달의 일수만큼 다시 반복
						for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
							// 버튼이 가지고 있는 문자열이 시작일자보다 작은 경우 비활성화
							if(Integer.parseInt(dayList.get(i).getText()) < Integer.parseInt(reserv_day.get(1))) {
								dayList.get(i).setEnabled(false);
							}else { // 아닐 경우 모두 활성화
								dayList.get(i).setBackground(Color.pink);
							}
						}//for

						// 바뀐 달에서 예약한 달이 나올 경우 >> 종료일
					}else if(reserv_day.get(2).equals("" + month)) {

						// 해당 달의 일수만큼 반복
						for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
							// 버튼이 가지고 있는 문자열이 시작일자보다 클 경우 비활성화
							if(Integer.parseInt(dayList.get(i).getText()) > Integer.parseInt(reserv_day.get(3))) {
								dayList.get(i).setEnabled(false);
							}else { // 아닐 경우 
								// 반복하는 일자 중 어떤 문자열도 들어있지 않은 버튼이 비활성화 되어있을 경우
								if(!dayList.get(i).isEnabled() && !dayList.get(i).getText().equals("")) { // 예약 불가 창
									reserv_day.clear();
									new ResNot();
									break;
								}else { // 사이에 예약할 수 없는 날짜가 없을 경우 모두 핑크
									dayList.get(i).setBackground(Color.pink);
								}
							}
						}//for

						// 바뀐 달이 선택한 기간 사이에 있는 달일 경우-------------------------------------------------------------------	------------
					}else if(Integer.parseInt(reserv_day.get(0)) <  month &&  Integer.parseInt(reserv_day.get(2)) > month){
						//모두 핑크
						for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
							dayList.get(i).setBackground(Color.pink);
						}//for
					}

				} // 동일한 달에 예약한 경우-------------------------------------------------------------------------------------------------
				else if(reserv_day.size() == 4 && reserv_day.get(0).equals(reserv_day.get(2))){

					if(reserv_day.get(0).equals("" + month)) { // 해당 달인지 판단

						for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
							// 일자가 시작일보다 작거나 종료일보다 큰 경우
							if(Integer.parseInt(dayList.get(i).getText()) > Integer.parseInt(reserv_day.get(3)) || Integer.parseInt(dayList.get(i).getText()) < Integer.parseInt(reserv_day.get(1))) {
								dayList.get(i).setEnabled(false);
							}else {// 아닐 경우 핑크
								dayList.get(i).setBackground(Color.pink);
							}
						}
					}
					// 바뀐 달이 모두 예약되어 있을 경우-----------------------------------------------------------------------------------------
				}else if(notRes.getAllDayMon().contains("" + month)) {
					for(int i = da.week_cnt-1; i < da.dayday + da.week_cnt-1; i++) {
						System.out.println("####");
						dayList.get(i).setBackground(Color.lightGray); 
						dayList.get(i).setEnabled(false); 
					}//for
				}
			}
		};

		ba.addActionListener(act); // 이전
		ne.addActionListener(act); // 다음
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		f.add(info_title);
		f.add(btn1);
		f.add(btn2);
		f.add(underj);
		f.add(ji);
		f.add(room_info);
		f.add(room);
		f.add(jl);

		btn1.addActionListener(new ActionListener() { // 이전
			@Override
			public void actionPerformed(ActionEvent e) {
				new Reservation_exit(); // 종료 경고 팝업 창
			}
		});

		btn2.addActionListener(new ActionListener() { // 결제
			@Override
			public void actionPerformed(ActionEvent e) {
				// 선택한 기간 리스트를 통합 예약 리스트에 옮겨 담는다.
				for(String num : reserv_day) {
					total_reser.add(num);
				}
				
				if(user_res_List.size() < 1) { // user_res_List유저의 예약번호
					user_res_List.add(0);
				}else {
					// 리스트 마지막에 있는 수에서 1 더한 값
				user_res_List.add(user_res_List.size());
				}
				rinfo.setTotal_reser(total_reser);
				rinfo.setUser_res_List(user_res_List);
				// 결제 창 열기 >> (room name, 사용자 id, 예약 기간) 도 같이 전송
				new PayStarting(aa, id, reserv_day);
				PayStarting.user_resNum = user_res_List.get(user_res_List.size()-1);
			
			}
		});

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				new Reservation_exit(); // 종료 경고 팝업 창
			}

		});

	}//Reservation()




}
