package ex1_static;

public class Bank {
	
	private String point;
	private String tel;
	
	//ststic변수, 메서드 : 
	//객체가 아무리 많이 생성되어도 메모리에 딱 한개만 생성되는 변수나 메서드
	static float interest;//이자율
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10f;
	}
	
	public void getbank() {
		System.out.println("지점 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("--------------------");
	}
	
}
