package ex5_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_BufferedOutput {
	public static void main(String[] args) throws IOException {
		
		//BufferedInputStream
		//일반 OutputStream을 보조하여 속도를 높여주는 스트림
		
		File f = new File("C:/java_ysy/bufOut.txt");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			String msg = "버퍼 OutputStream의 예제";
			bos.write(msg.getBytes());
			
			//쓰고자 하는 내용을 기억하고 있다가 물리적으로
			//파일에 쓰는 메서드
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if( fos != null ) {		//정순으로 fos가 bos보다 먼저 닫히면, bos가 내용을 채워 넣기전에 닫혀서 에러가 발생한다.
				fos.close();		//String의 양이 많아지면 순서가 꼬이는 상황이 발생하게 되는데, flush(); 코드를 사용하여 순서에 상관없이 닫기 전에 내용을 채워 넣는다.
			}
			
			if(bos != null) {
				bos.close();
			}
		}
		
	}//main
}
