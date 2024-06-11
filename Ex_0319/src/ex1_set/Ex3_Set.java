package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex3_Set {
	public static void main(String[] args) {
		
		//HashSet을 이용하여 로또번호 생성하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//[45, 1, 17, 31, 20, 15]
		
		Set<Integer> lotto = new TreeSet<Integer>();
		Random rnd = new Random();
		while(true) {
			int n = rnd.nextInt(45)+1;
			lotto.add(n);
			
			if(lotto.size() == 6) {
				System.out.println(lotto);
				break;
			}
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Set<Integer> ts = new HashSet<Integer>();
		while(true) {
			ts.add(rnd.nextInt(45) + 1);
			
			if(ts.size() == 6) {
				System.out.println(ts);
				break;
			}
		}
	}//main
}
