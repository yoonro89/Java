package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {

		// id : kim
		// pw : 2222
		// 비밀번호 불일치

		// id : lim
		// pw : 1234
		// 존재하지 않는 아이디

		// id : lee
		// pw : 2222
		// lee님 환영합니다

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		int pw = sc.nextInt();

		if (map.containsKey(id) && map.containsValue(pw)) {
			System.out.println(id + "님 환영합니다");
		} else if (!map.containsKey(id)) {
			System.out.println("존재하지 않는 아이디");
		} else if (map.containsKey(id) && !map.containsValue(pw)) {
			System.out.println("비밀번호 불일치");
		}

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡ풀이ㅡㅡㅡㅡㅡㅡㅡ");
		
		if( !map.containsKey(id) ) {
			System.out.println("존재하지 않는 아이디");
		}else {
			if(map.get(id) == pw) {
				System.out.println(id + "님 환영합니다");
			}else {
				System.out.println("비밀번호 불일치");
			}
			
			
		}
		
	}// main
}
