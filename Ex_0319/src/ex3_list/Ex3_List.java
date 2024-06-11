package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_List {
	public static void main(String[] args) {
		
		//아이디 생성 : aaa 	← 키보드값
		//[aaa] 			← arrylist
		//아이디 생성 : bbb
		//[aaa, bbb]
		//아이디 생성 : aaa
		//[aaa, bbb, aaa]
		//아이디 생성 : exit
		//종료
		
		List<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
//		while( sc.next().equals("exit") ) {
//			System.out.print("아이디 생성 : ");
//			String id = sc.next();
//			arr.add(id);
//			System.out.println(arr);
//		}
			
		while(true) {
			System.out.println("아이디 생성 : ");
			String id = sc.next();
			
			if( id.equalsIgnoreCase("exit")) {
				System.out.println("종료");
				break;
			}
			arr.add(id);
			System.out.println(arr);
		
		
		
		}
		
	}//main
}
