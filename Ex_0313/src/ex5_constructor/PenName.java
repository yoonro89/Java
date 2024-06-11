package ex5_constructor;

public class PenName {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
//		p1.setColor("gold"); 추가하고 싶을때
		p1.myPen();
		
		Pen p2 = new Pen("gold", 20000);
		p2.myPen();
		
		
	}//main
}
