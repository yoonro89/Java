package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_InputWork {
	public static void main(String[] args) {
		
		//work1.txt의 내용을 읽어서 숫자들의 합만 출력
		//결과 : 5
		
		String path = "C:/java_ysy/work1.txt";
		File f = new File(path);
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(f);
			
			int code = 0;	//한글자씩 읽어오기 위한 변수
			int sum = 0;	//더하기 위한 변수
			
			while( (code = fis.read()) != -1) {
//				String s = "" + (char)code;		//문자 형태로 s에 더해 넣는다 (아스키코드값으로 변해서 저장하는 것을 막기 위해 ""을 사용)
				String s = String.valueOf((char)code);
				try {
					sum += Integer.parseInt(s);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			System.out.println("결과 : " + sum);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//main
}
