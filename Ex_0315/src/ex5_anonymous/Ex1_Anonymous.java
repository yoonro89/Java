package ex5_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Anonymous {
	public static void main(String[] args) {
		//↓코드는 sc라는 객체 이름을 정해두고 필요할 때 마다 sc로부터 메서드를 호출할 수 있는 구조
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		int n = rnd.nextInt(2);
		int n2 = rnd.nextInt(3);
		
		//이름이 없는 Random클래스.(익명클래스)
		//익명클래스는 호출 되었을 때 딱 한번만 사용되고 메모리에서 삭제
		int n3 = new Random().nextInt(5); 
		
	}//main
}
