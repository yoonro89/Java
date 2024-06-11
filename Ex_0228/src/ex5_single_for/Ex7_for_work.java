package ex5_single_for;

import java.util.Scanner;

public class Ex7_for_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 n1, n2를 입력받는다
		//n1부터 n2까지의 합을 계산하여 결과를 출력
		//예를들어 2와 5를 입력받았다면 2 ~ 5사이의 숫자들의 합인 14가 출력
		//-------
		//수1 : 2
		//수2 : 5
		//결과 : 14
		
		//수1 : 5
		//수2 : 2
		//결과 : 14
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		int res = 0;
		
		//swap : 변수 두개의 가진 값을 교환하는 방법 (파이썬에선 n1, n2 == n2, n1 사용)
		if( n1 > n2) {
			int n3 = n1;	
			n1 = n2;
			n2 = n3;
		}
		
		for( int i = n1; i <= n2; i++ ) {	//n1<n2를 가정하고 작성
			res += i;
				
		}//for
		System.out.printf("결과 : %d", res);
		
	}//main
}
