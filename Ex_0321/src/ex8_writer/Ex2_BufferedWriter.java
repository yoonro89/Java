package ex8_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2_BufferedWriter {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/java_ysy/bufWriter.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			bw.write("bufWriter의 테스트 입니다");
			bw.newLine();//Enter함수
			bw.write("출력테스트 중");
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(bw != null) {
				bw.close();
			}
			if(fw != null) {
				fw.close();
			}
		}
		
	}//main
}
