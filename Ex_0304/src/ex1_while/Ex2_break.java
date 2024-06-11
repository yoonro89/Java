package ex1_while;

public class Ex2_break {
	public static void main(String[] args) {
		
		int n = 1;
		
		while( true ) {
			
			System.out.println(n);
			n++;
			
			if(n > 5 ) {
				break; //while문을 빠져나온다
			}
			
		}//while
		
		System.out.println("프로그램 종료");
		
	}//main
}
