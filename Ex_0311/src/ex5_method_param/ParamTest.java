package ex5_method_param;

public class ParamTest {
	public void setArr( int a ) {
		System.out.println("결과 : " + ++a);
	}
	
	public void realArr( int[] a ) {
		//파라미터로 객체타입이 넘어오면
		//복사본이 아닌 heap의 주소값을 그대로 받는다
		a[0] = 0;
		a[1] = 0;
		
		System.out.print("서브에서 출력한 a : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print( a[i] + " " );
		}
		System.out.println();
	}
	
	
	
	
}
