package reserv_hotel_3_4;

import java.awt.Window.Type;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Reserv_info implements Serializable{
	
	private List<String> total_reser =  new ArrayList<String>();
	String room_name;
	List<Integer> user_res_List = new ArrayList<Integer>(); // 예약번호
	
	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public List<String> getTotal_reser() {
		return total_reser;
	}

	public void setTotal_reser(List<String> total_reser) {
		this.total_reser = total_reser;
	}

	public List<Integer> getUser_res_List() {
		return user_res_List;
	}

	public void setUser_res_List(List<Integer> user_res_List) {
		this.user_res_List = user_res_List;
	}
	
	
	
}
