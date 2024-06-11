package ex3_work;

public class Ex1_multiFor_gugudan {
	public static void main(String[] args) {
		
		//2중 for문을 사용하여 2 ~ 9단까지를 모두 출력
		//
		//2 x 1 = 2	3 x 1 = 3	4 x 1 = 4.........9 x 1 = 9
		//2 x 2 = 4	3 x 2 = 6	4 x 2 = 8.........9 x 2 = 18
		//2 x 3 = 6
		//...
		//2 x 9 = 18 .............................9 x 9 = 81
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
		
	}//main
}
