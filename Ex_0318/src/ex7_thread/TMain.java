package ex7_thread;

import java.util.Scanner;
import java.util.Set;

public class TMain {
	public static void main(String[] args) {
		
		//스캐너를 통해 키보드에서 정수를 입력받는다
		//입력받은 숫자가 1초에 1씩 감소되면서 출력되다가 0이 되었을 떄
		//프로그램(스레드)을 종료하시오
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//값 : 5
		//5
		//4
		//3
		//2
		//1
		//0
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int n = sc.nextInt();
		
		TCount t = new TCount();
		t.setN(n);
		t.start();
		
	}//main
}
