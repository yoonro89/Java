package ex6_review_objsteam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MoneyWriter {

	BankInfo bank;
	public MoneyWriter(BankInfo bank) {
		this.bank = bank;
		save();
	}
	
	private void save() {
		String path = "C:/java_ysy/Bank/"+bank.getId()+"/UserIdinfo.sav";
		File f = new File("C:/java_ysy/Bank/"+bank.getId());
		
		if( !f.exists() ) {
			f.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(bank);
			System.out.println("입출금기록 저장완료");
			
		} catch (Exception e) {
			System.out.println("입출금기록 저장실패");
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
		
	}//기본 생성자
}
