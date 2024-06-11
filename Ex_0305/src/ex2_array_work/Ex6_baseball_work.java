package ex2_array_work;

import java.util.Random;
import java.util.Scanner;

public class Ex6_baseball_work {
	public static void main(String[] args) {
		
		//이전에 만들었던 숫자야구 코드를 배열을 이용하여 변경해보자
		//--------------
		// 실제로 보일 필요 x //컴퓨터 : 527
		//값(예:123) - 123
		//1S, 0B
		//값(예:123) - 456
		//0S, 1B
		//값(예:123) - 527
		//정답!!
		//정답까지 3회
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		do {
			
			com[0] = new Random().nextInt(9)+1;
			com[1] = new Random().nextInt(9)+1;
			com[2] = new Random().nextInt(9)+1;
			
		}while( com[0] == com[1] || com[0] == com[2] || com[1] == com[2] );
		
		System.out.println("중복하지 않는 임의의 세 자리수" + com[0] + com[1] + com[2]);
		
		//입력값을 100으로 나누면 100의자리 수가 나옴 = user[0]
		//입력값을 100의 자리수를 제거한 십의자리수 이하로 받음 23
		//num/10을 하여 자리수를 내린다 num=10
		//user[1] = 입력값(23) / num(10) = 2
		//num/10을 하여 자리수를 내린다 num=1
		//user[2] = 입력값(3) / num(1) = 3
		//입력값은 10의 자리수를 제거한 일의자리수 이하를 받음 3
		Scanner sc = new Scanner(System.in);
		int wn = 0;
		while(true) {
			wn++;
			System.out.print("값(예:123) - ");
			int input = sc.nextInt();
			int num = 100;
			
			for(int i = 0; i < user.length; i++ ) {
				user[i] = input / num;			
				input = input - (user[i] * num);
				num /= num/10;					
			}//ex456//i=0, user[0]=4, input = 56, num=10; 
					//i=1, user[1]=5, input = 6, num=1;
					//i=2, user[2]=6, input = 0, num=1/10;
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < com.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(i == j && com[i] == user[j]) {
						strike++;
					}else if(i != j && com[i] == user[j]){
						ball++;
					}
				}//inner
				
			}//outer
			
			if( strike == 3 ) {
				System.out.println("정답!! : " + user[3]);
				System.out.println("정답까지 회"+ wn + "회");
				break;
				}else if( strike > 0 || ball > 0 ) {
				System.out.println(strike + "S, " + ball + "B");
				}else {
					System.out.println("out!!");
				}
			System.out.println("---------------");
			
		}//while
		
		
		
	}//main
}





