package ex6_constructor;

public class Vending {

	private Can[] can = new Can[5];
	private int money;

	// 자판기에 들어갈 음료의 종류를 결정하는 메서드
	public void init() {
		
		can[0] = new Can("coke", 1000);

		can[1] = new Can("cider", 1100);

		can[2] = new Can("hotsix", 1200);

		can[3] = new Can("coffee", 1300);

		can[4] = new Can("banana", 1400);

	}// init()

	// 사용자가 투입한 금액의 범위에 있는 음료의 목록만 보여줄 것
	public void showCans(int money) {
		this.money = money;

		for (int i = 0; i < can.length; i++) {

			if (can[i].getPrice() <= money) {
				System.out.printf("%s - %d원\n", can[i].getCanName(), can[i].getPrice());
			}

		}
	}// showCans()

	// 선택한 음료를 제공하고 잔액을 돌려주는 메서드
	public void outCan(String name) {

		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(name + "(을)를 선택하셨네요");
				System.out.println("잔액 : " + (money - can[i].getPrice()));
			}
		}

	}

}
