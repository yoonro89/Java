package ex8_work;

import java.util.Scanner;

public class WorkMain2 {
	public static void main(String[] args) {
		//문장 : aababa
		//a4b2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 : ");
		String str = sc.next();
		String result = "";
		
		for( int i = 0; i < str.length(); i++) {			//입력받은 문자의 길이만큼 증가 
			
			if( result.indexOf( str.charAt(i) ) == -1 ) {	//result의 목록(입력받은 문자의 i번째가 i-1번째와 같지 않을때 실행)
				result += str.charAt(i);					//서로다른 문자만을 result에 저장
			}
		}
		
		for(int i = 0; i < result.length(); i++ ) {			//result의 길이만큼 반복
			int count = 0;									//count생성 및 초기화(안쪽 for문을 빠져나와 i가 증가되면 count는 초기화)
			
			for(int j = 0; j < str.length(); j++ ) {		//입력한 문자열의 길이만큼 증가
				if(result.charAt(i) == str.charAt(j) ) {	//result의 i와 str의 i가 같을 때 실행
					count++;								//count가 증가
				}
			}
			System.out.print("" + result.charAt(i) + count );
		}//중복이 없는 result의 문자열 뒤에 count를 붙여 넣는다.(아스키 코드값으로 연산이 되기 때문에 가장 앞에 ""를 넣는다)
		
	}//main
}
