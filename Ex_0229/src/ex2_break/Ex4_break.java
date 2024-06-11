package ex2_break;

import java.util.Scanner;

public class Ex4_break {
	public static void main(String[] args) {
		
		//변수n에 정수를 입력받아
		//1부터 n까지의 합을 구하되, 합이 20을 초과하면 반복을 종료하시오
		//-------------
		//정수 : 5
		//종합 : 15
		
		//정수 : 10
		//합이 : 20을 넘었으므로 반복을 종료합니다
		//총합 : 21
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		int s = 0;
		
		for( int i = 1; i <= n; i++ ) {
			s += i;
			
			if( s > 20) {
				System.out.println("합이 20을 넘었으므로 반복을 종료합니다");
				break;
			}
			
		}//for
		System.out.println("총합 : " + s);
		
		
		
		
	}//main
	
}
