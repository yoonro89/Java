                package ex2_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		for( int i = 1; i < 5; i-- ) { //무한대로 반복되는 코드
			
			if( i < 0 ) {				//i
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("----------------");
		
		//예외적 상황
		for( int i = 0; i < 10; i++ ) {
			
			switch(i) {
			case 0:
				System.out.println("i am 0");
				//반복문 내의 switch문이 가지는 break는
				//원래의 문법대로 switch문만을 탈출하는 용도로 사용된다
				break;
			case 1:
				System.out.println("i am 1");
				break;
			}//switch
			
		}//for
		
		
	}//main
}
