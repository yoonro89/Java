package ex7_work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {

		// 검색할 배우 : kang
		// [kang]
		// 전우치
		// 의형제
		// 반도

		// 검색할 배우 : aaa
		// 해당 배우의 정보가 없습니다.

		String[][] actor = {
				{ "[song]", "박쥐", "괴물", "관상" },
				{ "[lee]", "백두산", "광해", "지아이조" },
				{ "[kang]", "전우치", "의형제", "반도" } };

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String name = sc.next();
		int cnt = 0;

		for (int i = 0; i < actor.length; i++) {

			if (actor[i][0].equals("[" + name + "]")) {
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}

			} else {
				cnt++;
				if (cnt == actor.length) {
					System.out.println(cnt + "해당 배우의 정보가 없습니다");

				}
			}
		}

	}// main
}
