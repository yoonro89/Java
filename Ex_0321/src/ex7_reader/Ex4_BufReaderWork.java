package ex7_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex4_BufReaderWork {
	public static void main(String[] args) throws IOException {

		// test.txt에 여러 라인의 텍스트를 넣어놓고
		// 사용자가 입력받은 검색어를 포함하고 있는 첫번째 라인을 찾자
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		// test.txt의 내용
		// aa bbb cccc
		// 안녕하세요
		// 안녕합니다
		// abc

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 검색 : aa
		// 결과 : aa bbb cccc

		// 검색 : 안녕
		// 결과 : 안녕하세요

		// 검색 : ㅇ
		// 검색어를 찾을 수 없습니다

		Scanner sc = new Scanner(System.in);
		
		File f = new File("C:/java_ysy/Ex4_test.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.print("검색 : ");
		String input = sc.next();

		try {

			fr = new FileReader(f);
			br = new BufferedReader(fr);

			String line = "";

			while ((line = br.readLine()) != null) {

				// 현재 가져온 라인에 검색어가 포함되어 있는지 확인
				if (line.contains(input)) {
					System.out.println("결과 : " + line);
					return;
				}

			} // while
			
			System.out.println("검색어를 찾을 수 없습니다");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
		}

	}// main
}
