package ex2_break;

public class Ex3_break {
	public static void main(String[] args) {
		
		//1 ~ 10까지 반복하는 for문에서 5를 초과하는 첫번째 값을 출력하고
		//for문을 종료하세요
		//----------------
		//결과 : 6
		
		for(int i = 1; i <= 10; i++ ) {
			if( i >= 6 ) {
				System.out.println("결과 : " + i);	
				break;
				
			}
			
			
		}
		
	}//main
}
