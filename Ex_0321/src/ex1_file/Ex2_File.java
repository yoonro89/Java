package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/java_ysy";
		
		File f = new File(path);
		
		if(f.isDirectory()) {//!f.isFile()
			//폴더 내부의 하위요소들의 이름을 모두 가져온다
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
	}//main
}
