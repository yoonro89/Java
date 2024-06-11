package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input/Output)
		//IO는 입출력 스트림을 의미
		//스트림이란 데이터를 입출력하기 위한 통로
		//jvm에서 콘솔로 값을 내보내면 Output
		//콘솔의 값을 jvm에서 읽어오면 Input
		
		String path = "C:/java_ysy/test.txt";
		File f = new File(path);
		
		if(f.isFile()) {
			System.out.println("파일의 크기 : " + f.length() + "byte");
		}
		
	}//main
}
