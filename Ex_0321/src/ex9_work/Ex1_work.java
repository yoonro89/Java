package ex9_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		/*
		  word : ☆☆☆☆☆ >> o 
		  o는 포함되어 있지 않습니다 
		  word : ☆☆☆☆☆ >> p 
		  word : ☆pp☆☆ >> aa 
		  한 글자의 영소문자만 입력하세요 
		  word : ☆pp☆☆ >> a 
		  word : app☆☆ >> a 는 이미 입력한 문자입니다 word : app☆☆
		  >> e word : app☆e >> l word : apple >> apple 정답! 정답회수 7회
		 */

		Scanner sc = new Scanner(System.in);

		String[] index = { "apple", "grape", "orange", "banana" };
		Random rnd = new Random();
		int count = 0; // 정답까지 걸린 회수
		String sw = index[rnd.nextInt(index.length)];

		// sw와 같은 길이의 문자 배열을 만들고 ☆을 채워줌
		char[] cWord = new char[sw.length()];
		for (int i = 0; i < cWord.length; i++) {
			cWord[i] = '☆';
		}

		// String cString = String.valueOf(cWord); ←으로도 가능
		String cString = "";
		for (char c : cWord) {
			cString += c;
		}

		while (!cString.equals(sw)) {

			count++;
			System.out.printf("word : %s >> ", cString);
			String temp = sc.next(); // 키보드값 받기

			char in = temp.charAt(0);

			if (in < 'a' || in > 'z' || temp.length() > 1) {
				System.out.println("한 글자의 영 소문자만 입력하세요");
				continue;
			}

			if (cString.indexOf(in) != -1) { // -1
				System.out.println(in + "은 이미 입력한 문자입니다");
				continue;
			}

			boolean found = false;
			cString = "";

			for (int i = 0; i < sw.length(); i++) {
				if (sw.charAt(i) == in) {
					cWord[i] = in;
					found = true;
				}
				cString += cWord[i];
			}

			if (!found) {
				System.out.println(in + "은 포함되어 있지 않음");
			}

		}
		
		System.out.println(sw + "정답!");
		System.out.println("정답회수 : " + count);

	}// main
}
