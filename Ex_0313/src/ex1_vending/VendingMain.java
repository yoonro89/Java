package ex1_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vending v = new Vending();
		v.init();// 음료수 정보 초기화

		System.out.print("insert coin : ");
		int money = sc.nextInt();

		v.showCans(money);
		System.out.print("음료를 골라 : ");
		String sel = sc.next();

		v.outCan(sel);

	}// main
}
