package ex4_work;
import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 두 수의 최대공약수를 구하시오
		//**예를들어 10과 4를 입력받았다면 2가,
		//3과 7을 입력받았다면 '최대공약수가 없습니다'
		//------
		//수1 : 10
		//수2 : 4
		//최대공약수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
//		if( n1 > n2 ) {
//			int n3 = n1;
//			n1 = n2;
//			n2 = n3;
//		}
//		
//		int i = 0;
//		for( i = n1; i > 1; i-- ) {
//			
//			if( n1 % 1 == 0 && n2 % i == 0 ) {
//				break;
//			}
//			
//		}
//		
//		if( i == 1 ) {
//			System.out.println("최대공약수가 없습니다");
//		}else {
//			System.out.println("최대공약수 : " + i);
//		}
		
		int max = 0, min = 0;
		
		if( n1 <= n2) {
			min = n1;
		}else {
			min = n2;
		}
		
		for(int i = 1; i <= min; i++ ) {
			if(n1 % i == 0 && n2 % i == 0) {
				max = i;
			}else {
//				System.out.println("최대공약수가 없습니다" + max);
			}
		}
		System.out.println("최대공약수 : " + max);
		
	}//main
}
