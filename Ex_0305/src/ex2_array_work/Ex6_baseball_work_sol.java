package ex2_array_work;

import java.util.Random;
import java.util.Scanner;

public class Ex6_baseball_work_sol {
	public static void main(String[] args) {
		
		int[] com = new int[3];
		
		do {
			
			com[0] = new Random().nextInt(9)+1;
			com[1] = new Random().nextInt(9)+1;
			com[2] = new Random().nextInt(9)+1;
			
		}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2] );

		System.out.println("중복하지 않는 임의의 세 자리수");
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0; //정답까지의 시도 횟수를 받기 위한 정수cnt초기화;
		
		while(true) {
			cnt++;
			
			System.out.print("값(예:123) - ");
			int number = sc.nextInt();
			
			int[] user = {number / 100,			//user[0]
						  number % 100 / 10,	//user[1]
						  number % 100 % 10 };	//user[2]
			int strike = 0;
			int ball = 0;
			
			for( int i = 0; i < com.length; i++ ) {
				
				for( int j = 0; j < user.length; j++ ) {
					
					if( i == j ) {
						if( com[i] == user[j] ) {
							strike++;
						}
					}else {
						if( com[i] == user[j] ) {
							ball++;
						}
					}
					
					
				}//inner
			}//outer
			
			//정답처리
			if( strike == 3 ) {
				System.out.println(cnt + "회 만에 정답!! : " + user[0] + user[1] + user[2]);
				break;
				
			}else {
				
				if( strike > 0 || ball > 0 ) {//스트라이크나 볼이 1개라도 있는 경우
					System.out.printf("%d Strike, %d Ball\n", strike, ball);
				}else {//out인 경우
					System.out.println("OUT");
				}
				
			}
			
		}//while
		
		
		
		
		
	}//main
}
