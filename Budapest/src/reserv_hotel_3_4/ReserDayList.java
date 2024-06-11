package reserv_hotel_3_4;

import java.util.ArrayList;
import java.util.List;

public class ReserDayList {

	List<String> allDayMon = new ArrayList<String>(); // 한달 전체 예약
	List<String> total_mon =  new ArrayList<String>(); // 예약 달
	List<String> total_day =  new ArrayList<String>(); // 예약 일자

	List<Integer> total_mos =  new ArrayList<Integer>(); // 출력할 달의 예약 여부 리스트

	// 예약 정보를 분할해 담아뒀던 리스트들 모두 초기화
	public void setting() {
		total_mon.clear();
		total_day.clear();
		total_mos.clear();
	}

	// 예약 여부 리스트 추가 작업
	public void reserDayListed(int dayday) {
		// 예약 정보가 담겨있을 경우 진행----------------------------------------------------------------
		if(Reservation.total_reser.size() >= 4){

			// 토탈 예약 일자를 달과 일로 분리
			for(int i = 0; i < Reservation.total_reser.size(); i+=2) {
				total_mon.add(Reservation.total_reser.get(i)); // 토탈 예약 일자중 달
				total_day.add(Reservation.total_reser.get(i+1)); // 토탈 예약 일자 중 일
			}//for

			// 시작일과 종료일을 비교
			for(int i = 0; i < total_mon.size(); i+=2) {
				// 예약한 달의 시작일과 종료일이 모두 같고 그게 출력할 달에 있을 경우----------------------------------------------------------------------------------
				if(total_mon.get(i).equals("" + Reservation.month) && total_mon.get(i+1).equals("" + Reservation.month)) {
					// 예약 일자 리스트에서 시작일과 종료일을 가져와, 해당 시작일과 종료일 사이의 일자들을 예약 여부 리스트에 담아둔다.
					for(int j = Integer.parseInt(total_day.get(i)); j <= Integer.parseInt(total_day.get(i+1)); j++) {
						total_mos.add(j);
					}//for

					// 예약한 달의 시작일이 이전달이면서 종료일이 출력할 달에 있을 경우--------------------------------------------------------------------------------- 	
				}else if(Integer.parseInt(total_mon.get(i)) < Reservation.month && total_mon.get(i+1).equals("" + Reservation.month)) {
					// 예약 일자 리스트에서 해당 일자 종료일을 가져와, 1일부터 종료일까지의 일자들을 예약 여부 리스트에 담아둔다.
					for(int j = 1; j <= Integer.parseInt(total_day.get(i+1)); j++) {
						total_mos.add(j);
					}//for

					// 예약한 달의 시작일이 출력할 달에 있고, 종료일이 출력할 달 다음에 있을 경우---------------------------------------------------------------------------- 	
				}else if(total_mon.get(i).equals("" + Reservation.month) && Integer.parseInt(total_mon.get(i+1)) > Reservation.month) {
					// 예약 일자 리스트에서 해당 일자 시작일을 가져와, 시작일부터 달의 마지막일까지의 일자들을 예약 여부 리스트에 담아둔다.
					for(int j = Integer.parseInt(total_day.get(i)); j <= dayday; j++) {
						total_mos.add(j);
					}

					// 예약한 일수가 한달을 넘어설 경우----------------------------------------------------------------------------------------------------
				}else if(!total_mon.get(i).equals(total_mon.get(i+1)) && Integer.parseInt(total_mon.get(i)) <  Reservation.month && Integer.parseInt(total_mon.get(i+1)) >  Reservation.month) {
					// 시작 달과 종료 달 사이에 적어도 한달의 차이가 있을 경우 그 달을 한달 전체 예약 리스트에 담는다.
					for(int j = Integer.parseInt(total_mon.get(i))+1; j < Integer.parseInt(total_mon.get(i+1)); j++) {
						allDayMon.add("" + j);
					}//for
				}
			}//for
		}//if

	} //reserDayListed()


	public List<Integer> getTotal_mos() {
		return total_mos;
	}

	public void setTotal_mos(List<Integer> total_mos) {
		this.total_mos = total_mos;
	}

	public List<String> getAllDayMon() {
		return allDayMon;
	}

	public void setAllDayMon(List<String> allDayMon) {
		this.allDayMon = allDayMon;
	}

}