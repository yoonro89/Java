package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//정수를 입력하세요(종료:0)
		//>> 45
		//>> 17
		//>> 20
		//>> 21
		//>> 0
		//원하는 숫자의 범위를 입력하시오
		//시작값 : 15
		//끝 값 : 20
		//범위 내의 숫자들 : 
		//17
		//20
		
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		System.out.println("정수를 입력하세요(종료:0)");
		o : while(true) {
			System.out.print(">> ");
			arr.add( sc.nextInt() );
			
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).equals(0)) {
					break o;
				}
			}
		}
		
		System.out.println("원하는 숫자의 범위를 입력하시오");
		System.out.print("시작값 : ");
		int n1 = sc.nextInt();
		System.out.print("끝　값 : ");
		int n2 = sc.nextInt();
		
		for(int i = 0; i < arr.size(); i++) {
			
			if(arr.get(i) >= n1 && arr.get(i) <= n2) {
				res.add(arr.get(i));
				continue;
			}
			
		}
		System.out.println("범위 내의 숫자들 : " + res);
		
	}
}
