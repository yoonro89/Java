package reserv_hotel_3_4;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import loginEx_1.*;
import loginEx_2.*;

public class ReservLoad { // total rewserv에 정보 저장

	public Reserv_info info;

	public ReservLoad(Reserv_info info) {
		this.info = info;
		load();
	}
	
	// 통합 예약 정보 파일 로드
	private void load() {
		String path = "C:/Budapest/Hotel/" + info.getRoom_name() + "/room_reservation.sav";
		File f = new File(path);

		if (f.exists() ) {
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				info = (Reserv_info)ois.readObject();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}else {
			System.out.println("예약 정보 없음  33");
		}
		
		
	}//save

}

