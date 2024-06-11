package ex1_set;

import java.util.HashSet;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬렉션(collection Framework)프레임워크
		//컬렉션은 다수의 요소를 하나의 그룹으로 묶어서 효율적으로 관리할 수 있는
		//기능을 제공하는 클래스(인터페이스)
		//1.가변적인 크기를 갖는다
		//2.데이터의 추가, 검색, 정렬 등 편리한 기능들을 다수 보유하고 있다.
		
		//컬렉션 프레임워크의 종류
		//1.Set
		//2.Map
		//3.List
		
		//Set : 값의 중복을 허용하지 않는다
//		HashSet<Integer> hs = new HashSet<Integer>();	
		Set<Integer> hs = new HashSet<Integer>();		//실무에서 많이 사용 하는 형태(부모를 통해서 자식을 할당받는 식) 
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(100);//넣을 수 없음
		
		//100이 포함되어 있는 공간을 제거
		hs.remove(100);
		hs.add(120);
		
		System.out.println(hs.size());
		System.out.println(hs);			//내용물의 특정 하나만 꺼내올 수 없다 → 배열로 전환 → 특정 하나 출력
		
		//Set → 배열
		//배열의 크기를 0으로 지정하면 자동으로 배열의 크기가 설정
		Integer[] arr = hs.toArray(new Integer[0]);
		
		for( int n : arr ) {
			System.out.print(n + " ");
		}
		
	}//main
}
