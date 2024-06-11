package ex1_abstract;

public abstract class AbsParent { 
//	추상메서드를 한개라도 가지고 있는 클래스는
//	abstract키워드를 통해 '추상 클래스'로 만들어 줘야 한다
	
	int value = 100;
	String str = "";
	
	public int getValue() {
		return value;
	}
	
	//추상메서드는 body가 없다
	//abstract키워드를 가지고 있다
	abstract public void setValue(int n);
	
}
