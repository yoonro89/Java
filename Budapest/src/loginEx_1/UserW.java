package loginEx_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserW {
	User user;
	
	public UserW(User user) {
		this.user = user;
		System.out.println("a::" + user.user_reserv);
		save();
	}
	
	private void save() {
		String path = "C:/Budapest/" + user.getId() + "/UserInfo.sav";
		File f = new File("C:/Budapest/" + user.getId());
		System.out.println("write파일 경로: " + path);

		if (!f.exists()) {
			f.mkdirs();
		}

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(user);
			
			System.out.println("유저정보 저장완료");
			

		} catch (Exception e) {
			System.out.println("유저정보 저장실패");
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//save()
	
	
	
}
