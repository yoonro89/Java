package ex12_work;

import java.util.Random;

public class Runners {
	public static void main(String[] args) throws InterruptedException {

		int[] playerRandom = new int[2];//플레이어숫자
		String[] playerJump = new String[playerRandom.length];
		for (int i = 0; i < playerJump.length; i++) {
			playerJump[i] = "";// String배열을 빈값으로 채워 넣음 : 이후에 공백(달리는 거리 표현)을 더해 넣기위해
		}

		boolean finish = false;
		int winnerPlayer = 0;

		Random rnd = new Random();

		while (true) {

			for (int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = rnd.nextInt(2);
			}

			// 0.1초 간격으로 휴식
			Thread.sleep(100); //throws나 try-catch 

			// 각 선수에게 달릴 거리를 적용
			for (int i = 0; i < playerJump.length; i++) {

				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += "";
					break;

				case 1:
					playerJump[i] += " ";
					break;
				}// switch

			} // for

			// 달리기
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			for (int i = 0; i < playerJump.length; i++) {
				System.out.print(playerJump[i]);
				System.out.println(i + 1 + "옷");

				if (playerJump[i].length() >= 30) {
					winnerPlayer = i + 1;
					finish = true;
				} // if

			} // for
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			if (finish) {// finish == true
				System.out.println("win - " + winnerPlayer);
				break;
			}

		} // while

	}// main
}
