package ex5_single_for;

public class Ex2_for {
	public static void main(String[] args) {
		
		//1 ~ 100까지 반복하는 for문에서 5의 배수만 화면에 출력
		
		for(int i = 1; i <= 100; i++) {
			
			if( i % 5 == 0 ) {
				System.out.println(i);
			}	
		}
		
		System.out.println("-----------------");
		
		for(int i =0; i <= 95; ) {
			i += 5;
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		for( int i = 5; i <= 100; i += 5) {
			System.out.println(i);
		}
		
		
	}//main
}
