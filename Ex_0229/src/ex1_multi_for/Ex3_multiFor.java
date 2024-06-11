package ex1_multi_for;

public class Ex3_multiFor {
	public static void main(String[] args) {
		
		//아래와 같이 홀수 라인에만 *을 출력하는 2중 for문을 완성
		//* * * * *
		//1 2 3 4 5
		//* * * * *
		//1 2 3 4 5
		//* * * * *
		
		for( int i = 1; i <= 5; i++ ) {
			
			for( int j = 1; j <= 5; j++) {

				if( i % 2 == 0) {
					System.out.print(j + " ");
				}else {
					System.out.print("* ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
		
	}//main
}
