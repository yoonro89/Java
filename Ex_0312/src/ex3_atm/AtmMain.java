package ex3_atm;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		// 1.입금
		// 2.출금
		// 3.잔액확인
		// etc.종료
		// >> 1
		// ---입금---
		// 입금액 : 1000
		// 입금성공

		// 1.입금
		// 2.출금
		// 3.잔액확인
		// etc.종료
		// >> 3
		// ---잔액---
		// 1000원

		// 1.입금
		// 2.출금
		// 3.잔액확인
		// etc.종료
		// >> 4
		// 종료

		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		
		int money = 0;
		
		outer : while(true) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.잔액확인");
			System.out.println("etc.종료");
			System.out.println(">> "); 
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				System.out.println("---입금---");
				System.out.println("입금액 : ");
				money = sc.nextInt();
				atm.deposit(money);
				break;
			
			case 2:
				System.out.println("---출금---");
				System.out.println("출금액 : ");
				money = sc.nextInt();
				atm.withdraw(money);
				
				break;
				
			case 3:
				System.out.println("--잔액확인--");
				atm.balance();
				break;
			case 4:
				System.out.println("이용해 주셔서 감사합니다");
				break outer;
			}
			System.out.println("--------------------");
		}
		
		

	}
}
