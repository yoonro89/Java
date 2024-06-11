package ex6_isNumber;

import java.util.Scanner;

public class NumberMain {
	public static void main(String[] args) {
		
		//문자열 : 123
		//123은(는) 숫자입니까? true
		
		//문자열 : 123a
		//123a은(는) 숫자입니까? false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String n = sc.next();
		
		NumberCheck input = new NumberCheck();
		
		boolean b = input.check(n);
		//↑를 생략하고 출력↓에서 input.check(n)을 넣을수 있다
		System.out.println(n + "은(는) 순자입니까?" + b);
		
		
		
	}
}
