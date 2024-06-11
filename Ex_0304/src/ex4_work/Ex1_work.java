package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 두 개를 입력받아
		//입력받은 두 수 의 최소공배수를 출력
		//** 예를들어 2, 5를 입력받았다면 10을,
		//	 4와 6을 받았다면 12를,
		//	 3과 3을 받았다면 3을 출력해야 한다
		//----------------
		//수1 : 4
		//수2 : 6
		//최소공배수는 : 12
		
		
		/*
		 최소공배수와 최대공약수의 관계
		 두 수(숫자 A, B)와 최소공배수, 최대공약수 사이의 관계에 대해
		 		G)	A	B
		 		ㅡㅡㅡㅡㅡㅡㅡ
		 			a	b
		 위는 두 수 A, B의 최소공배수를 구할 때 쓰는 방법
		 G (Greatest common divisor) : 최대공약수
		 L (Least common multiple) : 최소 공배수
		 
		 여기서 A = G x a, B = G x b 임을 알 수 있다
		 즉, A x B = G x G x a x b 이며,
		 L = G x a x b 이므로, A x B = G x L이다
		 
		 L = G x a x b
		 A = G x a
		 B = G x b
		 
		 A x B = G x G x a x b
		 A x B = G x L
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
				
		if(n1 >= n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		for(int i = max; i >= max; i++ ) {
			
			if( i % n1 == 0 && i % n2 == 0 ) {
				min = i;
				break;
			}
			
		}//for
		System.out.println("최소공배수 : " + min);
				
		if(n1 <= n2) {
			min = n1;
		}else {
			min = n2;
		}
		for(int i = 1; i <= min; i++ ) {
			
			if(n1 % i == 0 && n2 % i == 0) {
				max = i;
			}
			
		}
		System.out.println("최대공약수 : " + max);
		
		
		
	}//main
}
