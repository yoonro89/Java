package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		// id : aaa
		// pw : 1111
		// aaa/1111
		// ----------
		// id : aaa
		// 아이디가 중복됨
		// id : bbb
		// pw : 2222
		// aaa/1111
		// bbb/2222

		Scanner sc = new Scanner(System.in);

		List<UserInfo> arr = new ArrayList<UserInfo>();

		o : while (true) {
			UserInfo ui = new UserInfo();

			System.out.print("id : ");
			ui.setId(sc.next());
			
			//id 중복 체크
			for(int i = 0; i < arr.size(); i++) {
				if( ui.getId().equals(arr.get(i).getId() ) ) {
					System.out.println("아이디 중복됨");
					continue o;
				}
			}
			
			System.out.print("pw : ");
			ui.setPw(sc.nextInt());

			arr.add(ui);
			
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId() + "/" + arr.get(i).getPw());
			}
			System.out.println("------------------");
		}

	}// main
}
