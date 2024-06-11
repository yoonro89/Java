package loginEx_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
    private String pw;
    private String name;
    private String nickName;
    private String gender;
    
    int user_resNum;

    List<String> user_basket = new ArrayList<String>();
    List<String> user_reserv = new ArrayList<String>();
   

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
	public List<String> getUser_basket() {
		return user_basket;
	}
	public void setUser_basket(List<String> user_basket) {
		this.user_basket = user_basket;
	}
	public List<String> getUser_reserv() {
		return user_reserv;
	}
	public void setUser_reserv(List<String> user_reserv) {
		this.user_reserv = user_reserv;
	}
    
	public String toString() {
		return "\n" + "Room Type : " + user_basket.get(0) + "\n\n" + "선택 일자 : " + user_basket.get(1) + "월 " + user_basket.get(2) + "일 " + "~ " + user_basket.get(3) + "월 " + user_basket.get(4) + "일";
	}
	
	public String toString_pay() {
		return "\n" + "Room Type : " + user_reserv.get(0) + "\n\n" + "선택 일자 : " + user_reserv.get(1) + "월 " + user_reserv.get(2) + "일 " + "~ " + user_reserv.get(3) + "월 " + user_reserv.get(4) + "일";
	}
	public int getUser_resNum() {
		return user_resNum;
	}
	public void setUser_resNum(int user_resNum) {
		this.user_resNum = user_resNum;
	}
    
    
    
}