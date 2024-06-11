package ex4_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		//키보드에서 정수를 입력받고 그 숫자가 소수인지를 판단하시오
		//소수 : 약수가 1과 자기 자신만으로 이루어진 수(2, 3, 5, 7, 11, 13,........)
		//-------------
		//입렵 : 5
		//소수입니다
		
		//입력 : 1
		//소수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		int i = 0;
		
		for( i = 2; i <= n; i++ ) {
			
			if( n % i == 0) {
				break;
			}

		}
		if(i == n) {
			System.out.println("소수 입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
		
		
	}//main
	
}
