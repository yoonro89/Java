package ex1_while;

import java.util.Random;

public class Ex3_do_while {
	public static void main(String[] args) {
		
		//do-while문 : 선 처리, 후 비교 (첫 1회전 시 : 조건을 보지 않고 우선 1번은 실행함)
		//				최초 실행 이후부터는 while문과 동일
		//do{
		//	조건식이 참일 때 실행되는 영역
		//}while( 조건식 );
		
		int i = 5;
		do {
			
			System.out.println(i);
			i++;
			
		}while( i <= 10);
		
		System.out.println("-------------------------");
		
//		int a = new Random().nextInt(5 - 0 + 1) + 0;
//		int a = new Random().nextInt(6);
		
		/*
		 java, jsp, html의 시험을 봤다
		 각 과목별 점수는 랜덤으로 0~130까지의 값이 대입
		 
		 각 과목의 점수를 검사하는데, 100점이 넘어가는 결과가 나오지 않을때까지
		 반복문을 수행하고,
		 
		 최종적으로 세 과목이 모두 100이하가 되었을 때 과목별 점수를 출력
		 
		 --------------------------
		 
		 java : 100
		 jsp : 82
		 html : 90
		 
		 */
		
		int java = 0, jsp = 0, html = 0; 
		
//		do {
//			
//			java = new Random().nextInt(130 - 0 + 1) + 0;
//			jsp = new Random().nextInt(130 - 0 + 1) + 0;
//			html = new Random().nextInt(130 - 0 + 1) + 0;
//			
//		}while(java > 100 || jsp > 100 || html > 100);
//		System.out.printf("java : %d\njsp : %d\nhtml : %d\n", java, jsp, html);
//		
		System.out.println("---------풀이---------");
		
		do {
			
			java = new Random().nextInt(130 - 0 + 1) + 0;
			jsp = new Random().nextInt(130 - 0 + 1) + 0;
			html = new Random().nextInt(130 - 0 + 1) + 0;
			
		}while(java > 100 || jsp > 100 || html > 100);
		System.out.printf("java : %d\njsp : %d\nhtml : %d\n", java, jsp, html);
		
		
	}//main
}
