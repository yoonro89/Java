package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_list {
	public static void main(String[] args) {
		
		//다섯개의 문장을 직접 입력받아 ArrayList에 담는다
		//담겨진 값들 중 가장 긴 문잘열을 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//문장 : a
		//문장 : 홍길동
		//문장 : bbb
		//문장 : cccc
		//문장 : b
		//가장 긴 문자열 : cccc
		
		Scanner sc = new Scanner(System.in);
		List<String> strings = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++ ) {
			System.out.print("문장 : ");
			strings.add( sc.next() );
		}
		
		String sLonger = "";
		for(String str : strings ) {
			if( str.length() > sLonger.length() ) {
				sLonger = str;
			}
		}
		
		System.out.println("가장 긴 문장 : " + sLonger);
		
	}// main
}
