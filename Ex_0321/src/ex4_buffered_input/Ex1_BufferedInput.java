package ex4_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_BufferedInput {
	public static void main(String[] args) {

		// Buffered스트림을 통해 입출력의 효율성을 향상시킬 수 있다.
		// 파일을 읽거나 쓸 때 버퍼링 작업을 수행하기 때문이다
		// 버퍼링이란>? 입출력할 데이터를 버퍼라는 메모리 영역에 바이트배열로 저장하여
		// 한번에 사용하는 것.

		File f = new File("C:/java_ysy/test.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		byte[] b_read = new byte[(int) f.length()];

		try {

			fis = new FileInputStream(f); // 혼자서 일을 할 수 있지만 느림
			bis = new BufferedInputStream(fis); // 빠르지만 혼자서 일을 할 수 없음
			bis.read(b_read);

			String res = new String(b_read);
			System.out.println(res);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				if (bis != null) {
					bis.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// main
}
