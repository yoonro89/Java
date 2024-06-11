package ex2_control_statement;

public class Ex1_if {
	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//1)분기문 : if, switch
		//2)반복문 : for, while
		
		//if( 조건식 ){
		//	조건식이 참일 때 수행되는 영역
		//}
		
		int n = 50;
		//쌍따옴표 안에 여러글자(문장, 문자열)를 저장할 수 있는 자료형
		String str = ""; 
//		String str = null;
		
		if( n == 50 ) {
			str = "n은 50입니다";		//→ 조건식이 참이면 조건식 안의 str값이 출력된다.
		}
//		if( n == 51 ) {
//			str = "n은 51입니다";		//→ 조건식이 거짓일 경우
//		}
//		System.out.println(str);	//→ 조건식 밖의 str값이 출력된다.
		if( n != 50 ) {
			str = "n은 50이 아닙니다";
		}
//		System.out.println(str);	// 
		
		System.out.println(str);
		}
	
	
	}//main









