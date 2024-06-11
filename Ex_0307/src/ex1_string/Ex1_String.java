package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String클래스
		//String클래스는 두 가지 특징을 가지고 있다
		//1) 객체 생성방법이 두 가지(암시적, 명시적)	★
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불면의 특징)
		
		//heap메모리에 저장되는 요소들은 변수라 부르고, stack메모리에 저장되는 요소들은 객체라고 부른다
		//ex. 'Scanner scan'의 scan는 객체
		//한편, 기본자료형으로 선언된 요소는 변수라고 부른다(객체x)
		
//		String s1 = "abc";//암시적 객체 생성
//		String s2 = "abc";
//		String s3 = new String("abc");//명시적 객체 생성
//		
//		//객체간 비교시 ==은 값이 아닌 '주소'를 비교한다
//		if(s1 == s2) {
//			System.out.println("주소가 같습니다");
//		}else {
//			System.out.println("주소가 다릅니다");
//		}
//		
//		if( s1.equals(s3) ) {
//			System.out.println("값이 같습니다");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("y or n : ");
//		String ss = sc.next();
//		
//		if( ss.equals("y") ) { //객체간 비교에는 .equals()를 사용한다
//			System.out.println("y입력 완료");
//		}else {
//		System.out.println("n입력 완료");
//		}

		String greet = "hello";
		greet += "world";
		System.out.println(greet);
		
		//암시적 객체를 생성하는 이유 : 같은 값을 공유하는 두 개의 요소중 하나의 객체가 값을 변화할 경우
		//							남은 하나의 객체의 값은 변하지 않아야하기 때문이다
		String a1 ="abc";
		String a2 ="abc";
		a2 = "ddd";
		
	}//main
	
}



