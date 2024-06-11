package ex1_multi_array;

public class Ex1_MultiArray {
	public static void main(String[] args) {
		
		//다차원 배열
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열
		//실무에서는 2차원을 넘어서는 잘 사용하지 x
		
		//new int[1차원 배열의 수][각 1차원 배열의 index수];
		//new int[큰방][작은방]
		int[][] test = new int[2][3];		//2차원 배열의 모든 값을 출력하려면 2중 for문이 필요하다
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;

		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		System.out.println(test[0][2]); //300
		
		System.out.println("----------------");
		
		//test배열이 가진 모든 값을 출력 해 보자!!
		for (int i = 0; i < test.length; i++) { 	//배열 이름.length를 하면 큰방의 값이 온다
			for(int j = 0; j < test[i].length; j++){//배열 [i].length는 배열 [i]에 딸린 작은방의 길이
													//배열의 형태가 불규칙할 경우를 대비하여 위와 같이 범위를 지정함
				System.out.print( test[i][j] + " " );
				
			}//inner
			System.out.println();
		}//outer
		
		
		
	}//main
}
