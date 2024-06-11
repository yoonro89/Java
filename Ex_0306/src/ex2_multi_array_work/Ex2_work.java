package ex2_multi_array_work;

public class Ex2_work {
	public static void main(String[] args) {
		//arr에 담긴 모든 값의 합과 평균을 출력
		//-------------------
		//총합 : 89
		//평균 : 6.4
		int[][] arr = { {4, 2, 6},
						{11, 15, 7, 1},
						{3, 17, 2, 5, 9},
						{3, 4} };
		
		int cnt = 0;
		int sum = 0;
		float avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				cnt++;
				sum += arr[i][j];
			}
		}
		avg += (float)sum/cnt;
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
	}//main
}
