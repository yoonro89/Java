package ex3_interface;

public interface InterParent {
	//인터페이스는 서비스 요청에 따른 중개자 역할
	//인터페이스에는 추상메서드와 상수 이외의 속성이 들어갈 수 없다
	
	abstract int getA();
	final int VALUE = 10;
	
	//final : 상수를 지칭하는 키워드
	//상수 : 프로그램 종료까지 절대 바뀌지 않는 값
	//상수는 모든 글자를 대문자로 작성하는 것이 관례
}
