package ex7_object;

public class ObjMain {
	public static void main(String[] args) {
		
		ObjTest ot1 = new ObjTest();
		int num = 100;
		ot1.setValue(num);//기본자료형 → 객체 : AutoBoxing 
		System.out.println(ot1.getValue());
		
//		int num2 = ot1.getValue(); 
//		가장 큰 그릇인 Object를 int로 넣기위해 디모션캐스팅 필요
		
		//객체 → 기본자료형 : UnBoxing
		int num2 = (int)ot1.getValue();
		System.out.println(num2);
		
		ObjTest ot2 = new ObjTest();
		ot2.setValue("String문자열");
		String str = (String)ot2.getValue();
		System.out.println(str);
		
	}//main
}
