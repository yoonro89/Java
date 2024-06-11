package ex5_single_for;

import java.util.Scanner;

public class Ex5_for {
	public static void main(String[] args) {

		// 키보드에 정수를 받고 입력받은 숫자에 해당되는 구구단을 출력
		// 단, 2 ~ 9사이의 값을 입력받지 않았다면
		// '2~9사이의 값만 입력해주세요'를 출력

		// 단 : 5
		// 5 x 1 = 5
		// 5 x 2 = 10
		// ....
		// 5 x 9 = 45

		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();

		if (dan <= 1 || dan >= 10) {
			System.out.println("2 ~ 9사이의 값만 입력하세요");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			} // for
		} // else

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (int i = 1; i <= 9; i++) {
			if (dan <= 1 || dan >= 10) {
				System.out.println("2 ~ 9사이의 값만 입력하세요");
				break;
			} else {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		}

	}// main
}
