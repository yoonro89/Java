package ex4_updown;

import java.util.Random;

public class AnswerCheck {
	
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean result = false;
	
	//정답인지 오답읹지 체크하는 함수
	public boolean check( int n ) {
		count++;
		
		if(n < random) {
			System.out.println("UP");
		}else if(n > random) {
			System.out.println("DOWN");
		}else {
			System.out.println(count + "회만에 정답");
			result = true;
		}
		
		return result;
		
	}//check()
}
