package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:/java_ysy/abc";
		File f = new File(path);
		
		if(!f.exists()) {
			//f가 가진 path경로가 실제로 존재한다면 true
			f.mkdirs(); //mkdirs는 mkdir의 기능도 수행함
			
		}else {
			System.out.println("폴더가 존재함");
			
			//path경로의 폴더나 파일을 삭제
			//f.delete();
		}
		
	}//main
}
