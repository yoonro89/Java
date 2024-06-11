package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
	public static void main(String[] args) {
		
		//List구조
		//인덱스로 특정 데이터에 접근할 수 있다.(방번호를 가진다)
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(10);		//중복값 필터 기능 X
		list.add(11);
		
		//1번index자리에 100을 추가 (추가한 값을 앞쪽 자리에 끼워 넣기가 가능하며, 뒷자리는 자동으로 index가 밀린다)
		list.add(1, 100);
		
		//0번index의 값을 20으로 수정 (인덱스로 접근이 가능하기 때문에 수정이 가능)
		list.set(0, 20);
		
		//2번 index의 값을 제거
		list.remove(2);
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));		//list는 for문을 사용한 출력이 가능하다
		}
		
	}//main
}
