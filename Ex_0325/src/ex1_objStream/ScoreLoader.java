package ex1_objStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreLoader {

	RspInfo info;
	
	public ScoreLoader(RspInfo info) {
		this.info = info;
		load();
	}
	
	private void load() {
		
		String path = "C:/java_ysy/RspGame/"+info.getId()+"/UserInfo.sav";
		File f = new File(path);
		
		if(f.exists()) {
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				info = (RspInfo)ois.readObject();
				
				System.out.println("로드성공");
				
			} catch (Exception e) {
				System.out.println("로드실패");
				e.printStackTrace();
			}finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else {
			System.out.println("새로운 회원");
		}
		
	}//load
	
}
