package ex7_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {

		// 0에서 9사이의 난수를 100개 만든다
		// 만들어진 100개의 난수에서 0 ~ 9까지의 갯수를 판단하여 그래프로 표기하시오
		// 각 난수의 숫자를 판단하는 코드는 main에서,
		// 난수를 그래프화 하는 코드는 PrintGraph클래스에서 작업
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1346153471132412456..........
		// 0의 갯수 : ########## 10
		// 1의 갯수 : ######## 8
		// ........
		// 9의 갯수 : ########### 11
		int[] arr = new int[10];

		for (int i = 0; i < 100; i++) {
			int r = new Random().nextInt(10);
			arr[r]++;

		}
		PrintGraph m1 = new PrintGraph();
		m1.printG(arr);

	}
}
