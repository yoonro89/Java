package ex5_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for문 : 특정 명령을 원하는 만큼 반복적으로 처리할 때 사용
		//for( 초기식; 조건식; 증감식 ){
		//	조건이 참일때 실행되는 영역
		//}
		
		for( int i = 0; i < 3; i++ ) {  //조건식이 거짓이 나올때까지 증감
			//원래 문법상 증감식의 위치는↑가 맞지만
			//i++   의도적으로 실행되는 영역에 넣어서 결과값을 조절할 수 있다
			System.out.println(i);
			
		}//for 1
		
		
		/*
		int i = 0;	→ main영역의 int i는 전역 변수 
		
		for( i = 0; i < 3; i++){

			지역변수인 k는 현재 for문을 벗어나면 사용할 수 없다
			int k = 100;
			System.out.println(i);
		}
		*/
		
		System.out.println("-------------");
		
		for( int j = 0; j < 3; j++) {
			System.out.println(j);
		}
		
		System.out.println("-------------");
		
		//10 ~ 1까지 감소되는 값을 순차적으로 출력하시오
		for(int j = 10; j >= 1; j-- ) {
			System.out.println(j);
			
		}
		
		
		
		
	}//main
}

