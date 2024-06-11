package ex2_method;

public class MethodTest {

	public void test() {
		System.out.println("test메서드가 호출됨");
	}
	
	//같은 이름의 메서드를 중복해서 생성할 수 없다
	public int test2(int n) {
		n+=100;
		System.out.println("n : "+ n);
		
		//반환형을 int로 지정했다면 return타입도 반드시 int형태여야 한다
		//반환값은 무조건 1개이며 동시에 여러개의 return을 호출할 수 없다
		//return 10, 1;
		return n;
		
	}
	
	public String getMe(String hobby, String gender) {
		String str = "나는 취미가 " + hobby + "인 " + gender + "야";
		return str;
	}
	
	public char test3(int a) {
		if( a == 1) {
			return 'A';
		}else if(a == 2) {
			return 'B';
		}else {
			return 'F';
		}
	}
	
}
