package ex6_review_objsteam;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		
		BankInfo bank = new BankInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		
		bank.setId(id);
		
		MoneyLoader ml = new MoneyLoader(bank);
		bank = ml.bank;
		System.out.println(bank.getId()+"님 환영합니다");
		
		int money = 0;
		money = bank.getMoney();
		
		
		out : while(true) {
			System.out.println("1.입\t금");
			System.out.println("2.출\t금");
			System.out.println("3.잔\t액");
			System.out.println("4.종\t료");
			System.out.print(">> ");
			int sel = sc.nextInt();
			int withraw = 0;
			int deposit = 0;
			
			switch(sel) {
			case 1:
				System.out.print("입금액 : ");
				deposit = sc.nextInt();
				if(deposit < 0) {
					System.out.println("올바른 입금액이 아닙니다");
				}else if(deposit > 0) {
					money += deposit;
					bank.setMoney(money);
					System.out.println("입금 완료");
				}
				break;
			case 2:
				System.out.print("출금액 : ");
				withraw = sc.nextInt();
				if(money < withraw ) {
					System.out.println("잔액이 부족합니다. 잔액 : " + money);
				}else if( money >= withraw ) {
					money -= withraw;
					bank.setMoney(money);
					System.out.println("출금 완료");
					break;
				}
			case 3:
				System.out.println("ㅡㅡ잔액ㅡㅡ");
				System.out.println(money);
				break;
			case 4:
				System.out.println("로그아웃");
				break out;
			
			default:
				System.out.println("잘못된 입력입니다");
			}
			
		}//while
		
		new MoneyWriter(bank);
		
	}//main
}
