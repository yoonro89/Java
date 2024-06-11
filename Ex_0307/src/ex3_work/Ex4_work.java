package ex3_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 문장에서
		//홀수번째 위치의 문자만 추출하여 출력하시오
		
		//문장 : helloWorld
		//결과 : hlool
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 : ");
		String text = sc.next();
		
		String res = "";
		for(int i = 0; i < text.length(); i++) {
			
			if(i % 2 == 0) {
				res+=text.charAt(i);
			}
		}
		System.out.println("결과 : " + res);
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡ↓ㅡ민재님ㅡ↓ㅡㅡㅡㅡㅡㅡ");
		
		
		System.out.print("결과 : ");
		for(int i = 0; i < text.length(); i+=2 ) {
			char ch = text.charAt(i);
			System.out.print(ch);
		}
		
		
		
	}//main
}
