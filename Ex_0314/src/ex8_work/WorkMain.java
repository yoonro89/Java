package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// 문자열 : aababa ←키보드에서 받음
		// 압축결과 : a2b1a1b1a1

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : \n");
		String input = sc.next();

		String result = "";// 결과값을 저장할 변수
		int count = 1;

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result += input.charAt(i - 1);
				result += count;
				count = 1;
			}

		}

		result += input.charAt(input.length() - 1);
		result += count;

		System.out.println("결과 : " + result);

	}// main
}
