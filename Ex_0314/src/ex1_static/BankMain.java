package ex1_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("홍대", "02-111-1111");
		Bank b2 = new Bank("이대", "02-222-2222");
		Bank b3 = new Bank("서강대", "02-333-3333");
		//객체를 생성하지 않아도 클래스명. 으로 단독 호출이 가능
		Bank.interest = 0.1f;
		//'클래스이름.스태틱 = ??;'의 형태로 접근하는 것이 권장사항
		
		
		b1.getbank();
		b2.getbank();
		b3.getbank();
		
		
	}//main
}
