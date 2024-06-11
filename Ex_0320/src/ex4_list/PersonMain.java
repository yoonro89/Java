package ex4_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >> 1
		// ----회원 추가----
		// 이름 : hong
		// 나이 : 20
		// 전화 : 010
		// 정보 저장 완료
		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >> 3
		// ----전체정보----
		// hong / 20 / 010
		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >> 2
		// ----회원삭제----
		// 삭제할 이름 : hong2
		// hong2는 없습니다
		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >> 4
		// 프로그램종료

		Scanner sc = new Scanner(System.in);
		List<Person> user = new ArrayList<Person>();

		o : while (true) {
			System.out.print("1.회원추가\n2.회원삭제\n3.전체정보\netc.종 료\n>> ");
			Person p;
			int sel = sc.nextInt();
			String eq = "";
			
			switch (sel) {
			case 1: //회원추가
				System.out.println("---회원추가---");
				p = new Person();
				System.out.println("이름 : ");
				p.setName(sc.next());
				System.out.println("나이 : ");
				p.setAge(sc.nextInt());
				System.out.println("전화 : ");
				p.setTe1(sc.next());
				user.add(p);
				System.out.println("정보 저장 완료");
				break;
				
			case 2: //회원삭제
				System.out.println("---회원삭제---");
				System.out.print("삭제할 이름 : ");
				eq = sc.next();
				
				for(int i = 0; i < user.size(); i++ ) {
					if(user.get(i).getName().equals(eq)) {
						user.remove(i);
						System.out.println("삭제성공");
						break;
					}else {
						if( i + 1 == user.size() ) {
							System.out.println(eq + "은 없습니다");
						}
					}
				}
				
				break;
				
			case 3: //전체목록
				System.out.println("---전체정보---");
				System.out.println("등록 인원 " + user.size() + "명");
				
				for(int i = 0; i < user.size(); i++) {
					System.out.printf("%s / %s / %s\n", user.get(i).getName(), user.get(i).getAge(), user.get(i).getTe1());
				}
				break;
			default:
			
			}//switch
			System.out.println("-----------------");
		} // while

	}// main
}
