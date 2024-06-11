package ex3_overload;

public class Bread {
	public void makeBread() {//메서드1
		System.out.println("빵을 만들었습니다");
		System.out.println("---------------");
	}
	
	public void makeBread(int n) {//메서드2
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다\n", n);
		System.out.println("---------------");
	}
	
	public void makeBread(int n, String n1) {//메서드3
		for(int i = 0; i < n; i++) {
			System.out.println(n1 + "을 만들었습니다");
		}
		System.out.printf("요청하신 %d개의 %s을(를) 만들었습니다\n", n, n1);
		System.out.println("---------------");
	}
	
	
}
