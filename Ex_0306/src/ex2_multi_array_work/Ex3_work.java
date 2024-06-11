package ex2_multi_array_work;

public class Ex3_work {
	public static void main(String[] args) {
		//arr배열에서 5를 초과하는 첫번째 값을 찾아 출력
		//-------------
		//결과 : 9
		int[][] arr = { {3, 1, 2},
						{4, 9, 6},
						{7, 8, 9} };
		
		o : for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > 5) {
					System.out.println("결과 : "+ arr[i][j]);
					break o;
				}
			}
		}
		
	}//main
}
