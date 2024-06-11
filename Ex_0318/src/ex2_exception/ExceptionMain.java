package ex2_exception;

public class ExceptionMain {
	public static void main(String[] args) {
		
		Exception1 e1 = new Exception1();
		Exception2 e2 = new Exception2();
		
		try {
		e1.div1(0);
		e2.div2(0);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없어요");
			
		}
		
		System.out.println("프로그램 종료");
		
	}//main
}
