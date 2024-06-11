package loginEx_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserL {
	public User user;
	
	boolean no = true;
	
	public UserL(User user) {
		this.user = user;
		load();
	}
	
	private void load() {
		String path = "C:/Budapest/" + user.getId() + "/UserInfo.sav";
		File f = new File(path);
		System.out.println("load파일 경로: " + path);

		if (f.exists()) {
			no = true;
			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {

				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				user = (User) ois.readObject();

				System.out.println("회원정보 불러오기 성공");

			} catch (Exception e) {
				System.out.println("회원정보를 불러오지 못했습니다");
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

		} else {
			no = false;
			System.out.println(user.getId() + "님은 존재하지 않습니다.");
		}
		
		
	}//load()

	public boolean isNo() {
		return no;
	}

	public void setNo(boolean no) {
		this.no = no;
	}
	
	
}
