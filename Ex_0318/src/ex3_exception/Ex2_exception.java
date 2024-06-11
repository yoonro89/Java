package ex3_exception;

import java.util.Scanner;

public class Ex2_exception {
	public static void main(String[] args) {
		
		//정수 : 100
		//결과 : 100
		
		//정수 : abc
		//abc은(는) 정수가 아님
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		String str = "";
		
		try {
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.println("결과 : " + n);
					
		}catch(Exception e) {
			System.out.println(str + "은(는) 정수가 아님");
		}
		
		
	}//main
}
