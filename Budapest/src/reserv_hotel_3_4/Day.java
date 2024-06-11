package reserv_hotel_3_4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JLabel;

import reserv_hotel_3_4.Reservation;

public class Day {

	Calendar  today = Calendar.getInstance(); // 달력 불러오기

	int week_cnt = today.get(Calendar.DAY_OF_WEEK); // 요일 값
	int ye_month = 0; // 이전에 출력한 달
	int day1 = today.get(Calendar.DATE); // 이전에 출력한 일 수
	int dayday = 0; // 예약할 당의 일 수

	// 달별 일자와 해당 달의 1일자의 요일 반환
	public void daying() {

		// 달별 일 수 반환
		switch (Reservation.month) {
		case 2: 
			dayday = 29;
			break;
		case 4 : 
		case 6 :
		case 9 :
		case 11: 
			dayday = 30;
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			dayday = 31;
			break;
		}

		int day = today.get(Calendar.DATE); // 오늘 날짜 확인
		Reservation.day_week = today.get(Calendar.DAY_OF_WEEK); // 오늘 요일 확인 -> 일요일부터 토요일까지 1~7 순으로 반환

		// ----금일 요일을 바탕으로 이번달 1일의 요일을 파악------------------------------------------------------------
		//
		// 		일, 월, 화, 수, 목, 금, 토 -> 1, 2, 3, 4, 5, 6, 7 
		//
		// 1). 출력할 달이 이번 달인 경우 : 이번 달
		if( Reservation.month == today.get(Calendar.MONTH )+1 && ye_month == 0) {

				for(int i = 1; i < day; i++) { // 현재 일수만큼만 뒤로 카운트
					if(week_cnt == 1) {
						week_cnt = 7;
					}else {
						week_cnt--;
					}
			}
		}// 2). 출력할 달이 이전에 출력했던 달보다 큰 경우 : 다음
		else if(Reservation.month > ye_month){  // 
			for(int i = 1; i <= day1; i++) { // 이전에 출력했던 달의 일수만큼 앞으로 반복

				if(week_cnt == 7) {
					week_cnt = 1;
				}else {
					week_cnt++;
				}
			}
		}// 3). 출력할 달이 이전에 출력했던 달보다 작은 경우 : 이전
		else if(Reservation.month < ye_month){
			for(int i = 0; i < dayday; i++) { // 바뀐 달의 일수만큼 뒤로 반복

				if(week_cnt == 1) {
					week_cnt = 7;
				}else {
					week_cnt--;
				}
			}
		}//------------------------------------------------------------------------------------------------
		// 2)와 3)은 달력의 초기 설정이 이번달이기 때문에 ( = 이번달의 1일 요일이 초기설정 )
		// 이전과 다음으로 움직일 경우, 각 특정 달 수만큼만 이동하면 된다.
		
		this.ye_month = Reservation.month; // 출력한 달의 기록을 ye_month에 남겨둠		
		this.day1 = dayday;// 출력한 일수의 기록을 day1에 남겨둠		
	}// daying()

	
	public int getWeek_cnt() {
		return week_cnt;
	}

	public int getDayday() {
		return dayday;
	}

	public int getDay1() {
		return day1;
	}
}
