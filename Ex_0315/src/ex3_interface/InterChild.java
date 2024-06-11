package ex3_interface;

public class InterChild implements InterParent{

	//인터페이스는 implements키워드를 통해서 '구현'한다
	
	@Override
	public int getA() {
		return 10;
	}

}
