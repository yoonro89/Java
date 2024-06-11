package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {

		// ArrayList를 두 개 만들고 1 ~ 5사이의 난수를 5개 추가
		// 두 리스트의 값을 비교하여 교집합을 출력
		// -----------------------------
		// list1 = [5, 3, 5, 1, 5]
		// list2 = [2, 3, 1, 1, 3]
		// 교집합 : [3, 1]

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>(); // 교집합 값을 따로 저장할 리스트
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			list1.add(rnd.nextInt(5) + 1);
			list2.add(rnd.nextInt(5) + 1);
		}
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		
		//contains를 사용하여 아래 2중for문을 대체하는 코드 만들어보기
		for(int num : list1) {
			if(list2.contains(num) && !result.contains(num)) {
				result.add(num);
			}
		}
		
//		for (int i = 0; i < list1.size(); i++) {
//			int cnt = 0;
//			for (int j = 0; j < list2.size();) {
//					
//				if ( list1.get(i) == list2.get(j) ) {
//					cnt++;
//					list2.remove(j);
//					
//					if(cnt == 1) {
//						result.add(list1.get(i));
//					}
//					continue;
//				}
//				j++;
//			}
//
//		}
//
		System.out.println("교집합 : " + result);
		
		//String클래스도 contains를 포함하고 있다
		String str = "hi hello welcom world";
		if(str.contains("i")) {
			System.out.println("i가 있음");
		}
		
		if(str.contains("m")) {
			System.out.println("m이 있음");
		}
		
		if(str.contains("wel")){
			System.out.println("wel이 있음");
		}
		
		if(str.contains("z")) {
			System.out.println("z가 있음");
		}
		
	}// main
}
