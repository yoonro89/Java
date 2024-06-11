package ex7_work;

public class PrintGraph {
	public void printG(int[] n) {
		// 배열을 그래프화 시키기
		for (int i = 0; i < n.length; i++) {
			System.out.print(i + "의 개수 : ");
			for (int j = 0; j < n[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" " + n[i]);

		}

	}
}
