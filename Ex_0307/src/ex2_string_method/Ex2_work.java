package ex2_string_method;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//사용자의 이메일을 입력받고 @앞의 문장의 길이가 5미만 9초과인 경우
		//오류메시지 출력하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//이메일 : abc@n.com
		//이메일 형식이 올바르지 않습니다
		//이메일 : aabbcc@n.com
		//aabbcc님 환영합니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		String email = sc.next();
		
		String[] sp = email.split("@"); // split으로 지정된 문자는 어디에도 포함되지 않는다
		String res = sp[0];
		
		if( res.length() < 5 || res.length() > 9) {
			System.out.println("올바르지 않은 이메일 형식");
		}else {
			System.out.println(res + "님 환영합니다");
		}
		
	}//main
}
