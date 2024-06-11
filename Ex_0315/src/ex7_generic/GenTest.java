package ex7_generic;

public class GenTest<T> {
	//제네릭 클래스(제네릭 타입)
	//일반적인 코드를 작성하되, 이 코드를 다양한 타입의 객체에 대하여
	//재활용이 가능하도록 만들어둔 클래스
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}
