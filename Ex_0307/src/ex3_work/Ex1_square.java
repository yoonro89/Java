package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_square {
	public static void main(String[] args) {
		// 2차원 배열 문제
		// 키보드에서 홀수값을 입력받으면
		// 입력받은 값에 따라 규칙을 가지는 "마방진"을 생성한다
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 홀수 : 3 ← 3x3의 마방진 생성
		// 08 01 06
		// 03 05 07
		// 04 09 02

		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 : ");
		int n = sc.nextInt();

		int[][] ms = new int[n][n];

		int[] temp = new int[n * n];
		int x = 0;

		for (int i = 0; i < temp.length; i++) {
			temp[i] = new Random().nextInt(n * n) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {

				ms[i][j] = temp[x++];

				System.out.print(ms[i][j] + "\t");
			} // inner
			System.out.println();
		} // outer

		System.out.println("------------------------");

		int first = 1;
		int secon = n / 2;
		int third = 0;

		while (first <= n * n) {
			ms[secon][third] = first;

			if (first % n == 0) {
				third++;
			} else {
				secon++;
				third--;
			}

			if (third < 0) {
				third = n - 1;
			}
			if (third >= n) {
				third = 0;
						
			}
			if (secon >= n) {
				secon = 0;
			}

			first++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ms[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("------------------------");

		first = 1;
		secon = n / 2;
		third = 0;

		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				while (first<=n*n) {
					ms[secon][third] = first;
					if(first % n == 0) {
					i++;
					j--;
					}
					if(third < 0) { third = n-1;}
					
					
				}
				System.out.print(ms[i][j] + "\t");
			}
			System.out.println();
		}
	}// main
}
