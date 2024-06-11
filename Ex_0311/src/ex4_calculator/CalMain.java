package ex4_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		//수1 : 5
		//수2 : 10
		//연산자 : +
		//15
		
		//수1 : 5
		//수2 : 10
		//연산자 : a
		//-1 <----잘못된 연산자를 입력했다면 -1이 출력된다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		System.out.print("연산자 : ");
		String oper = sc.next();
		
		Cal cal = new Cal();
		int res = cal.getResult(su1, su2, oper);
		System.out.println(res);
		
	}
}
