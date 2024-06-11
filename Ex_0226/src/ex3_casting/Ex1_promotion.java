package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
	
		//캐스팅(형 변환)
		//1. 프로모션 캐스팅
		// -> 큰 자료형에 작은 자료형이 대입되는 것
		double d = 100.5;	//8.x byte
		int n = 200;		//4byte
		
		d = n;
		
		System.out.println(d);
		
		char c = 'D';		//2byte
		int n1 = 100;		//4byte
		
		n1 = c;				//
		
		System.out.println("n1 : " + n1);
		
		
	}//main
}
