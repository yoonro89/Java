package ex6_review_objsteam;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MoneyLoader {
	BankInfo bank;
	
	public MoneyLoader(BankInfo bank) {
		this.bank = bank;
		load();
	}
	
	public void load() {
		String path = "C:/java_ysy/Bank/"+bank.getId()+"/UserIdinfo.sav";
		File f = new File(path);
		
		if(f.exists()) {
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				
				bank = (BankInfo)ois.readObject();
				
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
			
		}else {
			System.out.println(bank.getId()+"님이 새로운 회원이 되셨습니다");
		}
		
	}//기본 생성자
}
