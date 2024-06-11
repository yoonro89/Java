package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		int su = 100;
		
		su = m1.test2(su);
		//보낼때 파라미터로 값을 보냄
		//받을때 반환형으로 
		
		System.out.println("su : "+ su);
		
		System.out.println("--------------------");
		
		String gender = "남자";
		String hobby = "낚시";
		String ss = m1.getMe(hobby, gender);
		System.out.println(ss);
		
		System.out.println("--------------------");
		
		int num =2;
		char res = m1.test3(num);
		System.out.println(res);
	}
}
