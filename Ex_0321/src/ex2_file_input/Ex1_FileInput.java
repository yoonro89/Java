package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/java_ysy/test.txt";
		File f = new File(path);
		
		FileInputStream fis = null;
		if( f.exists() ) {
			
			//파일클래스와 연결할InputStream을 생성
			try {
				fis = new FileInputStream(f);
				 
				
				int code = 0;
				
				//스트림은 더이상 읽을 것이 없다면 -1을 반환한다
				//fis.read()를 통해 1byte씩 데이터를 가져오다가
				//문서의 끝(EOF)인 -1을 만나면 종료한다
				while( (code = fis.read()) != -1 ) {
					System.out.print((char)code );
				}
				//사용을 완료한 stream은 반드시 닫아줘야 한다
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(fis!=null) {
						fis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}//main
}
