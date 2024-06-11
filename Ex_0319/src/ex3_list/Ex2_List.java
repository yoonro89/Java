package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2_List {
	public static void main(String[] args) {
		
		//arr에 1 ~ 30사이의 난수를 5개 추가
		//arr에 담겨진 값 중 가장 큰 값을 출력
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//[13, 1, 17, 26, 9]
		//가장 큰 값 : 26
		
		List<Integer> arr = new ArrayList<Integer>();
		
		Random rnd = new Random();
		for(int i = 0; i < 5; i++ ) {
			arr.add(rnd.nextInt(30)+1);
		}
		
		int max = arr.get(0);
		
		for(int num : arr) {
			if( num > max ) {
				max = num;
			}
		}

		System.out.println(arr);
		System.out.println("가장 큰 값 : " + max);
		
	}//main
}
