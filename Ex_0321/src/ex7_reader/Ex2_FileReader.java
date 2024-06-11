package ex7_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {
		
		//file.txt의 내용을 읽어서 대문자의 개수와 소문자의 개수를 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//대문자 : 3
		//소문자 : 3
		
		File f = new File("C:/java_ysy/file.txt");
		FileReader fr = null;
		
		int upper = 0;
		int lower = 0;
		
		try {
			
			fr = new FileReader(f);
			int code = -1;
			
			while((code = fr.read()) != -1) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
			}
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fr != null) {
				fr.close();
			}
		}
		
		
	}//main
}
