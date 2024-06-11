package ex4_updown;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1 ~ 50사이의 난수를 발생 사용자는 이 난수가 무엇인지 맞혀야 한다
		 * 
		 * 예를들어 컴퓨터가 발생시킨 난수가 26이라면...
		 * 
		 * 정수 : 30 DOWN 정수 : 15 UP 정수 : 25 UP 정수 : 26 4회만에 정답!!
		 */

		Scanner sc = new Scanner(System.in);
		AnswerCheck ch = new AnswerCheck();
		
		while(true) {
			//입력받은 값을 AnswerCheck에게 전달하고
			//UP이나 DOWN이 아닌 정답일 경우
			//해당 while문을 빠져나가자
			System.out.print("정수 : ");
			int select = sc.nextInt();
			boolean b = ch.check(select);
			
			if(b) {//b == true, 만약 b == false이면 !b로 줄여 쓸 수 있다
				break;
			}
		}//while
		
	}//main
}
