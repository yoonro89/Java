package ex8_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1_FileWriter {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/java_ysy/fileWriter예제.txt");
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(f);
			String str = "나는 fileWriter의 예제입니다\n두줄도 잘됨";
			
			//char기반의 스트림은 문자열을 byte[]로 쪼개지 않아도
			//파일에 쓸 수 있다.
			fw.write(str);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fw != null) {
				fw.close();
			}
		}
		
	}//main
}
