package ex6_super;

public class Parent {
	
	//자식 클래스에서 super.age로 접근 가능
	int age;
	
	public Parent(int n) {
		System.out.println("부모클래스의 생성자");
	}
	
	public int result() {
		System.out.println("나는 부모야");
		return 1;
		
	}
	
	
	
}
