package ex8_work;

import java.util.Scanner;

public class WorkMain {
	private static final Object rev = null;

	public static void main(String[] args) {
		
		//키보드에서 입력받은 값이 '회문'인지 판단하시오
		//회문이란 앞으로 읽어도, 뒤에서 읽어도 똑같이 읽히는 문장
		//-------------------
		//값 : abc123
		//abc123은(는) 회문이 아닙니다
		
		//값 : 1aba1
		//1aba1은(는) 회문입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String input = sc.next();
		
		Work m1 = new Work();
		m1.paline(input);
		
		System.out.println("------↓해설↓------");
		
		String ori = sc.next();
		
		Work ws = new Work();
		ws.checkStr(ori);
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "은(는) 회문");
		}else {
			System.out.println(ori + "은(는) 회문X");
		}
		
	}//main
}
