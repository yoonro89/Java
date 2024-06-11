package ex2_static;

public class StaticTest {

	int n;
	static int n2;
	
	public static void test2() {
		
		int n2 =10;
		
//			↓ static메서드에서 일반 변수를 가져오는것은 불가
//		n = 10;
		n2 = 10;
	}
	
	
	public void test() {
		n = 10;
		n2 = 20;
		
//			↓ 일반 메서드에서는 static변수를 정의할 수 없다
//		static int n3 = 10;
	}
	
	
}
