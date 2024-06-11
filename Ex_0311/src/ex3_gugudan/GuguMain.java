package ex3_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		//키보드에서 정수값 하나를 받아서 getResult()를 호출했을 때, 구구단을 출력
		//----------------------
		//단 : 3
		//3 x 1 = 3
		//3 x 2 = 6
		//...
		//3 x 9 = 27
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		Gugu g = new Gugu();
		g.getResult(dan);
		
		//클래스가 잘 나뉘어 있으면, 오타 및 오류를 잡는 것이 용이하다
		
	}
}
