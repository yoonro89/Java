package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {
		
		//1 ~ 45사이의 난수를 발생시켜 lotto배열에 담고 결과를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//15 6 19 21 17 45
		int[] lotto = new int[6]; //lotto = {0, 0, 0, 0, 0, 0};
		//공식의 확인을 위해 난수를 6개만 생성하여 진행한다. 확인 후에 난수를 늘린다
		
		out : for(int i = 0; i < lotto.length; ) {

			lotto[i] = new Random().nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
			
				if( lotto[i] == lotto[j] ) {
					continue out;
				}
			}
			System.out.print(lotto[i] + " " );
			i++;
			
		}
		
	}//main
}
