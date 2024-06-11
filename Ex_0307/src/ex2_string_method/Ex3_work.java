package ex2_string_method;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//키보드를 통해 아무값이나 입력을 받는다
		//입력받은 무자열에 소문자 a의 갯수를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//입력 : &%34esdfdarfasf2457
		//a의 갯수 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < input.length(); i++) {
			//String타입이지만 한 글자이기 때문에 ==이 맞다
			if( input.charAt(i) == 'a') { 
				cnt++;
			}
		}
		
		System.out.println("a의 갯수 : " + cnt);
		
	}//main

}
