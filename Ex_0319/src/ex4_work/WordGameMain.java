package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		WordGame wg = new WordGame(arr);
		
		wg.start();
		//단어가 추가될 시간을 벌어야하기 때문에 시작된(단어추가) 후에 스캐너 작동
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			//게임종료
			if(arr.size() == 0 ) {
				System.out.println("클리어");
				wg.setPlaying(false);
			}
			
			System.out.println(arr);
			System.out.print(">> ");
			String in = sc.next();
			
			//사용자가 입력한 단어와 일치하는 값을 arr에서 찾는다
			for(int i = 0; i < arr.size(); i++ ) {
				if(in.equals(arr.get(i))) {
					arr.remove(i);
					break;
				}
			}
			
		}
		
	}//main
}
