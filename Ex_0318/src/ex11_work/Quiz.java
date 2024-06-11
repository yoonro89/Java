package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class Quiz extends Thread {

	private int su1, su2;
	private int timer = 0;
	private int playCount = 0;
	private boolean isCheck = true;		//★★★★★
	private final int FINISH = 2;
	private Random rnd = new Random();
	private Scanner sc = new Scanner(System.in);
	
	public void startGame() {
		
		while(isCheck) {//isCheck == true
			
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;
			System.out.printf("%d+ %d = ", su1, su2);
			int result = sc.nextInt();
			
			if(result == su1 + su2) {
				System.out.println("정답!!");
				playCount++;
			}else {
				System.out.println("오답...");
			}
			//정답처리
			if(playCount == FINISH) {
				System.out.printf("결과 : %d초 소요\n",  timer);
				isCheck = false;
			}
			
		}//while
	}
	
	
	@Override
	public void run() {
	//시간 경과가 run안에 있으면 x
		//1초에 1씩 timer를 증가시키는 영역
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//run

}
