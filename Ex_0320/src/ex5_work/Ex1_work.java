package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//ArrayList에 담긴 값들 중 내가 입력받은 문장과 동일한 값이 몇번째 인덱스에 있는지 찾아내기
		//찾을 문자 : Blue
		//Blue의 모든 인덱스 : [1, 3, 5]
		
		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Cyan");
		
		List<Integer> index = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 문자 : ");
		String str = sc.next();
		
		for(int i = 0; i < colors.size(); i++) {
			if(colors.get(i).equals(str)) {
				index.add(i);
			}
		}
		System.out.print(str +"의 모든 인덱스 : " + index);
		
	}//main
}
