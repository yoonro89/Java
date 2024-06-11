package ex1_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {
		
		//다중for문 : for문 안에 for문이 포함되어 있는 경우
		//			for문 안에 단일 for문이 여러개 있더라도 가장 밖에 있는 for문 기준으로 보기때문에 2중for문
		//
		//			밖에 위치하는 for문은 y(행)
		//				안에 위치하는 for문은 x(축)
		//1 2 3
		//1 2 3
		for( int i = 1; i <= 2; i++ ) { //지역변수라도 그 안에 있는 for문에 영향을 준다(like a 전역변수) 
						//두번 반복할 것이기 때문에 행이 두개 출력될 것을 알 수 있다
			for( int j = 1; j <= 3; j++ ) {
							//세번 반복하고,
				System.out.print(j + " ");
							//의도적으로 ln을 넣지 않았기 때문에 세개의 축(열)이 출력될 것을 알 수 있다
			}//inner
			
			System.out.println(); //줄바꿈 코드 (아무것도 입력하지 않았기 때문에 ln만 적용)
		}//outer
		
		System.out.println("----------------");
		
		//0 1 2 3 4
		//0 1 2 3 4
		//0 1 2 3 4
		//0 1 2 3 4
		
		for( int i = 1; i <= 4; i++) {
			for( int j = 0; j < 5; j++ ) {
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		
		System.out.println("----------------");
		
		//5 4 3
		//5 4 3
		//5 4 3
		
		for( int i = 1; i <= 3; i++ ) {
			for( int j = 5; j > 2; j-- ) {
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		
		
	}//main
}
