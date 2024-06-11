package ex3_inheritance;

public class InheriMain {
	public static void main(String[] args) {
	
		Child c1 = new Child();
//		System.out.println(c1.money); 부모클래스에서 private로 지정된것은 자식클래스에서 사용x
		System.out.println(c1.str);
		
		Parent p1 = new Parent();
//		System.out.println(p1.car); 상속관계라고 할지라도 부모클래스는 자식의 속성으로 접근할 수 없다
		
		
		//왼쪽의 객체와 오른쪽의 클래스의 인스턴스(c1이 Parent의 자신인가?)가 같다면 true를 반환
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
		
		//Object는 자바의 최상위 클래스로써 모든 클래스와 인스턴스가 같다!
		if(p1 instanceof Object) {
			System.out.println("p1은 Object의 자식");
		}
		
	}
}
