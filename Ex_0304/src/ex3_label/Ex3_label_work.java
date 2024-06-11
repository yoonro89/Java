package ex3_label;

import java.util.Random;

public class Ex3_label_work {
	public static void main(String[] args) {
		
		//주사위 두 개를 던졌을 때 합이 7이 되는 첫 번째 경우의 수를 출력하시오
		//---------------
		//결과 : 1, 6
		
		res : for(int i = 1; i <= 6; i++ ) {
			
			for(int j = 1; j <= 6; j++ ) {
				
				if(i + j == 7) {
					System.out.printf("결과 : %d, %d", i, j );
					break res;
				}
				
			}
			
		}
		
	}//main
}
