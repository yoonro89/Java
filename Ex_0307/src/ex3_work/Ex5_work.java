package ex3_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//키보드에서 값을 입력받고, 중복값을 제거한 결과를 출력하세요
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//입렵 : aabbcca
		//결과 : abc
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		String res = "";
		//aabb
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//str(이력값)에서 찾은 문자열을 ch에 저장
			
			//현재 문자가 이전에 등장한 적이 없다면(-1) res에 추가
			if(res.indexOf(ch) == -1 ) { 
				res += ch;
			}
			res += ch;
		}
		System.out.println(res);
		
		
		
	}// main
}
