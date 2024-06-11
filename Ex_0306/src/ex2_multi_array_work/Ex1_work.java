package ex2_multi_array_work;

public class Ex1_work {
	public static void main(String[] args) {
		//2차원 배열 array에 담긴 값 중, 3의 배수를 제외한 값들만 출력
		int[][] array ={{1,2,3},
						{4,5,6,7,8},
						{9,10,11,12}};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] % 3 != 0) {
					System.out.print(array[i][j] + "\t");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		//다른 방법
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] % 3 == 0) {
					continue;
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}//main
}
