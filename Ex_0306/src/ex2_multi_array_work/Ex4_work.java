package ex2_multi_array_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		//찾을 값 : 8
		//8을 초과하는 첫번째 값 : 9
		//해당 행의 모든 요소
		//
		int[][] array = {	{3, 4, 6, 7},
							{5, 6, 7, 8, 9},
							{11, 15, 20, 9},
							{4, 10, 15, 16}	};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값 : ");
		int n = sc.nextInt();
		
		outer : for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
			
				if(array[i][j] > n) {
					
					System.out.println(n + "을 초과하는 첫번째 값 : " + array[i][j]);
					
					System.out.println("해당 행의 모든 요소:");
					for( int k = 0; k < array[i].length; k++) {
						System.out.print(array[i][k] + " ");
					}
					break outer;
				}
			}
		}
		
	}//main
}
