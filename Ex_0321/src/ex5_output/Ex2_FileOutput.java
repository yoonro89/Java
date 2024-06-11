package ex5_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) throws IOException {
		
		String path = "C:/java_ysy/fileOutput예제.txt";
		
		File f = new File(path);
		
		FileOutputStream fos = null;
//		if( !f.exists() ) {
			
			try {
				
				//new FileOutputStream(File클래스 객체, 이어 붙일것인지에 대한 여부(T or F)  );
				fos = new FileOutputStream(f, true);
				String msg = "\n두번째 줄도 해볼까?";
				
				//msg.getBytes(); <-- String을 byte[]로 변환
				fos.write( msg.getBytes() );
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				if(fos != null) {
					fos.close();
				}
			}
			
//		}
		
	}//main
	
}
