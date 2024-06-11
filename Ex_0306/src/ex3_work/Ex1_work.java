package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//2차원 배열을 이용해 다음의 결과를 출력하시오
		//0 1 2 3
		//1 2 3 4 
		//2 3 4 5
		//3 4 5 6
		
		int[][] num = new int[4][4];
		
		for(int i = 0; i < num.length; i++) {
		
			for(int j = 0; j < num[i].length; j++) {
			
				num[i][j] = i+j;
				
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//main
}
