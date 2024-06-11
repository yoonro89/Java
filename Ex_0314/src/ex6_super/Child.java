package ex6_super;

public class Child extends Parent{
	
	//super : 부모클래스
	//super() - 부모클래스 생성자
	//super.result(); - 부모의 메서드
	//super.age - 부모의 변수
	
	public Child() {
		super(10);
		System.out.println("자식클래스의 생성자");
	}
	
	@Override
	public int result() {
		int n =super.result();
		n += 10;
		return n;
		
	}
	public void setAge(int age) {
		super.age = age;
	}
}
