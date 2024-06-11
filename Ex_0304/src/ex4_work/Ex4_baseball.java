package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class Ex4_baseball {
	public static void main(String[] args) {
		//1 ~ 9사이의 중복되지 않는 난수 3개를 알아맞히는 숫자야구 게임 제작하기
		//예) 컴퓨터가 발생시킨 난수가 572일 경우
		//
		
		//---------------
		//백 : 4
		//십 : 2
		//일 : 7
		//자릿수와 숫자가 같을 때 strike, 자릿수는 다르고 숫자는 같을 때 ball
		//---------------
		//백 : 5
		//십 : 2
		//일 : 9
		//1strike, 1ball
		//---------------
		//백 : 1
		//십 : 3
		//일 : 9
		//out!!
		//---------------
		//백 : 1
		//십 : 3
		//일 : 9
		//정답!! - 572
		
		Scanner sc = new Scanner(System.in);
		
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		int u1 = 0;
		int u2 = 0;
		int u3 = 0;
		
		//세자리의 중복되지 않는 난수를 com1, com2, com3에 저장
		
		do {
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
			
		}while(com1 == com2 || com1 == com3 || com2 == com3 );
		
		System.out.println("중복되지 않는 세자리의수를 입력하시오");
		
		while(true) {
			System.out.print("백 : ");
			u1 = sc.nextInt();
			System.out.print("십 : ");
			u2 = sc.nextInt();
			System.out.print("일 : ");
			u3 = sc.nextInt();
			
			int strike = 0; //스트라이크 갯수 판별
			int ball = 0;	//볼 갯수 판별
			
			//경우의 수 판단
			//사용자의 백의자리
			if( u1 == com1 ) {
				strike++;
			}else if( u1 == com2 || u1 == com3 ) {
				ball++;
			}
			//사용자의 십의자리
			if( u2 == com2 ) {
				strike++;
			}else if( u2 == com1 || u2 == com3 ) {
				ball++;
			}
			//사용자의 일의자리
			if( u3 == com3 ) {
				strike++;
			}else if( u3 == com1 || u3 == com2 ) {
				ball++;
			}
			
			//정답&오답처리
			
			if(strike == 3 ) {
				System.out.println("정답!! : " + u1 + u2 + u3);
				break;//정답시 while종료
			}else {
				//스트라이크나 볼이 한개라도 있는 경우
				if( strike > 0 || ball > 0 ) {//스트라이크나 볼이 한개라도 있는 경우
					System.out.println(strike + "S, " + ball + "B");
				
				}else {//스트라이크와 볼이 한개도 없는 경우(out)
					System.out.println("out!!");
				}
			}
			System.out.println("------------");
			
		}//while
		
		//if문이 수행해야할 코드가 '한 줄'이라면 중괄호를 생략해도 된다
		
	}//main
}
