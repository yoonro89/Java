package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
		//Set보다 활용도가 높음
		//Map : 키(key)와 값(value)을 묶어서 하나의 데이터로 저장
		//키를 통해 값을 얻어내는 구조이므로, 많은 양의 데이터를 검색하는데 매우 뛰어난 성능
		
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		map.put(0, 'C');	//java에서 유일하게 Map만이 put을 사용
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(0, 'D');	//map은 키(key)의 중복을 허용X
		
		//지우고싶은 키값에 해당되는 영역을 삭제
		map.remove(2);
		
		System.out.println(map.size());
		System.out.println(map);
		
		char res = map.get(0);		//0번 열쇠, 인덱스가 아님
		System.out.println(res);
		
		if(map.containsKey(0)) {//map.containsKey(0) == true
			System.out.println("0이라는 이름의 key가 있음");
		}
		
		if(map.containsValue('A')) {
			System.out.println("A가 map안에 있음");
		}
		
	}//main
}
