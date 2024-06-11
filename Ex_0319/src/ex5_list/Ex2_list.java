package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_list {
	public static void main(String[] args) {
		
		//ArrayList에 정수 세 개를 입력받고, 두 배로 곱해진 결과를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//정수 : 3
		//정수 : 7
		//정수 : 1
		//결과 : [6, 14, 2]
		
		Scanner sc = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("정수 : ");
			n.add( sc.nextInt()*2 );
		}
		System.out.println("결과 : " + n);
		
	}//main
}
