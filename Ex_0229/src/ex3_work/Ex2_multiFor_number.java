package ex3_work;

public class Ex2_multiFor_number {
	public static void main(String[] args) {
		
		//2중 for문을 사용하여 아래의 결과를 완성하세요
		//------------------
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//		.....
		//10 1 2 3 4 5 6 7 8 9
		for( int i = 1; i <= 10; i++ ) {
		
			for(int j = 0; j < 10; j++ ) {
			
				int x = i + j;
				
				if(x > 10) {
				
					x -= 10;
	
				}
				System.out.print(x + " ");
				
			}//inner

			System.out.println();
		}//outer
		
	}//main
}
