package ex3_work;

import java.util.Scanner;

public class Ex4_singleFor_Fibonacci {
	public static void main(String[] args) {

		// 단일 for문과 swap을 이용하여 피보나치수열 출력

		// 키보드에서 정수값을 입력받고 입력받은 횟수만큼의 결과를
		// 피보나치 수열로 출력

		// ---------------------

		// 출력갯수 : n
		// 1 1 2 3 5 8 13 21 34 .... n
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("출력갯수 : ");
		int n = sc.nextInt();

		// 1번과 2번의 합이 3번
		// 2번과 3번의 합이 4번
		// .....
		// (처음수 + 다음수 = 새로운 수)
		//

		// 피보나치 수열 : 피보나치 수는 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다
		// 처음 여섯 항은 각각 1, 1, 2, 3, 5, 8이며 편의상 0번째 항을 0으로 두기도 한다
		//
		int fir = 1, sec = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			sec = sum;
			sum = fir;
			fir = sec + sum;
			System.out.print(sum + " ");
		}

	}// main
}
