package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex3_FuleInput {
	public static void main(String[] args) {
		
		//Stream의 종류
		//...Stream : byte기반의 스트림(1byte씩만 처리 가능)
		//...Reader, ...Writer : char기반의 스트림(2byte처리가 가능)
		
		String path = "C://java_ysy//test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];	//새 배열에 메모리를 효율적으로 할당하기위해 파일의 용량을 가져온다
		
		FileInputStream fis = null;
		
		if( f.exists() ) {
			try {
				fis = new FileInputStream(f);
				
				//fis가 읽어온 내용을 b_read에 담는다
				fis.read(b_read);
				
				//byte[]을 String형식으로 변환
				String res = new String(b_read);
				
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}//main
}
