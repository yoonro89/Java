package ex2_string_method;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//변수 question에 "OX"값을 집어 넣는다
		//OOXXO라면 1+2+0+0+1의 결과인 4
		//OXXOOXOOO라면 1 + 0 + 0 + 1 + 2 + 0 + 1 + 2 + 3의 결과인 10이다
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//OXXOOXOOO <----키보드에서 받은값이 이렇게 생겼다면..
		//결과 : 10
		
		Scanner sc = new Scanner(System.in);
		System.out.print("OX를 무작위로 입력 하시오 : ");
		String question = sc.next();
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < question.length(); i++) {
				
			if( question.charAt(i) == 'O') {
				cnt++;
			}else {
				cnt = 0;
			}
			
			sum += cnt;
		
		}
		System.out.println("결과 : "+ sum);
		
	}//main
}
