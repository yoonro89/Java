package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		// work1.txt를 만들고 내용을 넣은 후, 키보드에서 입력받은 문장의
		// 출현빈도를 출력하시오
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// work1.txt에 담긴 값
		// abcabcabc홍길동

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 입력값 : a
		// a의 출현 횟수 : 3

		// 입력값 : 홍
		// 홍의 출현 횟수 : 1

		// 입력값 : abca
		// abca의 출현 횟수 : 2

		Scanner sc = new Scanner(System.in);
		File f = new File("C:/java_ysy/work1.txt");
		byte[] b_read = new byte[(int) f.length()];

		String content = "";// 원본을 담을 변수

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {

			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			bis.read(b_read);

			content = new String(b_read);

			System.out.print("입력 : ");
			String input = sc.next();

			int count = 0;
			int idx = content.indexOf(input);

			while (idx != -1) {
				count++;
				idx = content.indexOf(input, idx + 1);
			}
			System.out.println(input + "출현횟수 : " + count);

//			System.out.println("--------은빈님 참조 코드--------");
//			int leng = 0;
//			int count = 0;
//			while (leng + input.length() <= content.length()) {
//				if (input.equals(content.substring(leng, leng + input.length()))) {
//					count++;
//				}
//				leng++;
//			} // while
//
//			System.out.println(input + "출현횟수 : " + count);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}// main
}
