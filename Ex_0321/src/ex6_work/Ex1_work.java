package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_work {
	public static void main(String[] args) {

		// FileInputStream을 통해서 file.txt의 내용을 읽어온다
		// 읽어온 내용이 회문인지 판단하시오
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// a121a(은)는 회문입니다

		// abc123(은)는 회문이 아닙니다

		File f = new File("C:/java_ysy/file.txt");
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		String ori = "";
		String rev = "";

		try {

			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);

			bis.read(b_read);

			// 읽어온 원본문장
			ori = new String(b_read).trim();

			// 원본을 뒤집어서 rev에 저장
			for (int i = ori.length() - 1; i >= 0; i--) {
				rev += ori.charAt(i);
			}

			if (ori.equals(rev)) {
				System.out.println(ori + "은(는) 회문입니다");
			} else {
				System.out.println(ori + "은(는)회문이 아닙니다");
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}
