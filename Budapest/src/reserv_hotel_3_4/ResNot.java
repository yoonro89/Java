package reserv_hotel_3_4;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ResNot {

	// 예약 불가 알림 창
	public ResNot() {
		
		Frame f = new Frame("Not Reservation");
		f.setBackground(Color.LIGHT_GRAY);
		f.setLayout(null);
		f.setBounds( 825, 575, 300, 150);

		Font font = new Font("", Font.HANGING_BASELINE, 15 );

		// 팝업에 표시될 내용
		Label jl = new Label(" 예약 불가능한 날짜입니다.");
		jl.setBounds(50, 60, 250, 16);
		jl.setFont(font);
		
		Button notRe = new Button("OK");
		notRe.setFont(font);
		notRe.setBounds(120, 100, 60, 30);
		
		f.add(jl);
		f.add(notRe);
		
		notRe.addActionListener(new ActionListener() { // 예
			@Override
			public void actionPerformed(ActionEvent e) {
				Reservation.total_reser.clear();
				Reservation.f.dispose(); // 예약 진행 창도 종료
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Reservation.total_reser.clear();
				Reservation.f.dispose(); // 예약 진행 창도 종료
				f.dispose();
			}
		});
		
		
	}
}
