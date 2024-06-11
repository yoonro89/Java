package ex5_single_for;

import java.util.Scanner;

public class Ex6_for_work {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받는다
		//1부터 입력받은 정수까지의 합을 계산하여 출력
		//예를들어 5를 입력 받았다면 1 ~ 5까지의 합인 15를 출력
		//----------
		//정수 : 5
		//결과 : 15
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int js = sc.nextInt();
		int sum = 0;//결과를 저장할 변수
		
		for( int i = 1; i <= js; i++ ) {
			sum += i;//증가하는 i를 sum에 누적 += 시킨다
		}
		System.out.printf("결과 : %d", sum);
		
		
	}//main
}
