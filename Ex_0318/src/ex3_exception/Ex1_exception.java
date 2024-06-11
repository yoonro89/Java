package ex3_exception;

import java.util.Scanner;

public class Ex1_exception {
	public static void main(String[] args) {

		// Scanner를 통해 키보드에서 정수를 입력받도록 한다
		// 정수를 받았을 때는 그 값을 그대로 출력하되
		// 정수가 아닐 경우 '정수만 입력하세요'를 출력
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 정수 : 10
		// 입력받은 수 : 10

		// 정수 : a
		// 정수만 입력할 수 있습니다

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		try {
			int n = sc.nextInt();
			System.out.println("입력받은 수 : " + n);

		} catch (Exception e) {
			System.out.println("정수만 입력할 수 있습니다");
			e.printStackTrace();
		}

	}// main
}
