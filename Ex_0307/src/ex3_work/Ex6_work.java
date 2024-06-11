package ex3_work;

import java.util.Random;

public class Ex6_work {
	public static void main(String[] args) {
		
		//0에서 9사이의 난수를 100개 만든다
		//만들어진 100개의 난수에서 0 ~ 9까지의 갯수를 판단하여 그래프로 표기하시오
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//1346153471132412456..........
		//0의 갯수 : ########## 10
		//1의 갯수 : ########	8
		//........
		//9의 갯수 : ########### 11
		
		int[] arr = new int[10];				//초기화된 1차원 배열 arr생성
		
		for(int i = 0; i < 100; i++) {			//난수 100개 생성
			int r = new Random().nextInt(10);
			System.out.print(r);
			arr[r]++;							//arr배열의 0 ~ 9번방에 난수(방번호)가 같을 경우 늘어난다.
												//난수 생성과 동시에 개수를 카운트하는 방식.
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(i + "의 개수 : ");
			
			for(int j = 0; j < arr[i]; j++){
				System.out.print("#");
			}
			System.out.println(" " + arr[i]);
		}
		
	}//main
}
