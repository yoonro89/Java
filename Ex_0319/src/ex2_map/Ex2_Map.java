package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_Map {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("k1", "안녕하세요");
		map.put("k2", "반가워요");
		map.put("k3", "또 만나요");
		
		String result = map.get("k1");
		System.out.println(result);
		
	}//main
}
