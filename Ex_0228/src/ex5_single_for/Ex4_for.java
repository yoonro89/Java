package ex5_single_for;

import java.util.Scanner;

public class Ex4_for {
	public static void main(String[] args) {
		//은행 이자가 하루에 1원씩 추가된다
		//원금과 예치일수를 키보드에서 입력 받고
		//예치일수가 끝나면 나의 원금이 얼마가 되어있는지를 출력
		//-------------------
		//원금 : 1000
		//예치일 : 5
		//5일 후의 잔액은 1005원 입니다
		
		int money = 0;	//키보드에서 값 받기
		int day = 0;	//키보드에서 값 받기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원금 : ");
		money = sc.nextInt();
		
		System.out.print("예치일 : ");
		day = sc.nextInt();
		
		for(int i = 0; i < day; i++) {
			money++;
		}
		System.out.printf("%d일 후의 잔액은 %d원 입니다", day, money);
		
		
		
		
	}//main
}
