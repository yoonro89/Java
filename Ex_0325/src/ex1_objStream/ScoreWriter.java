package ex1_objStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreWriter {

	RspInfo info;
	public ScoreWriter(RspInfo info) {
		this.info = info;
		save();
	}
	
	private void save() {
		String path = "C:/java_ysy/RspGame/"+info.getId()+"/UserInfo.sav";
		File f1 = new File("C:/java_ysy/RspGame/"+info.getId());
		
		if( !f1.exists() ) {
			f1.mkdirs();
		}
		
		//파일쓰기
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(info);
			System.out.println("기록저장");
			
		} catch (Exception e) {
			System.out.println("저장실패");
			e.printStackTrace();
			
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
