package ex2_exception;

public class Exception1 {

	//throws를 통해 현재 메서드에서 발생한 오류를
	//다른 클래스에서 잡아줄 수 있도록 넘길 수 있다
	public void div1( int n ) throws ArithmeticException {//div1을 호출할때 ArithmeticException일 경우 (main으로)던짐 
		
		int num = 10 / n;
		System.out.println(num);
		
	}
	
}
