package ex6_review_objsteam;

import java.io.Serializable;

public class BankInfo implements Serializable{

	private int money;
	private String id;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
