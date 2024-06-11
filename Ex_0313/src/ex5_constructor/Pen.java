package ex5_constructor;

public class Pen {
	
	private int length;
	private String color;
	private int price;
	
	public Pen() {
		length = 15;
		color = "black";
		price = 500;
	}
	
	public Pen(String color, int price) { //생성자의 오버로드
		length = 15;
		this.color = color;
		this.price = price;
	}
	
	public void myPen() {
		System.out.println("길이 : " + length + "cm");
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price + "원");
		System.out.println("----------------------------");
	}
}
