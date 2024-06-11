package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//키보드에서 값을 받고, 숫자로만 이루어진 값이라면 true를,
		//그렇지 않다면 false를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//값 : 123
		//결과 : true
		
		//값 : a123
		//결과 : false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next();
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			//123
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				cnt++;
			}
			
		}
		
		if ( str.length() == cnt) {
			System.out.println("결과 : true");
		}else {
			System.out.println("결과 : false");
		}
		
	}//main
}
