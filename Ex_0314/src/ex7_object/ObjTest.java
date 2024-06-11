package ex7_object;

public class ObjTest {

	private Object value;
	
	public void setTest(int n) {				//오브젝트 메서드 보다
		System.out.println("int : " + n);		//오버로드가 효율적
	}
	
	public void setTest(String s) {
		System.out.println("String : s" + s);
	}
	
	public void setValue( Object value) { //모든 객체의 부모이므로 모든형태를 받고,
		this.value = value;				//내 보낼수 있다(캐스팅 필요)
	}									//단, 메모리 낭비가 심함(효율x)
	
	public Object getValue() {
		return value;
	}
	
	
}
