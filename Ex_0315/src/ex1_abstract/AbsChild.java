package ex1_abstract;

public class AbsChild extends AbsParent {
	
	//추상클래스를 상속받은 자식클래스는
	//부모가 가지고 있는 추상메서드를 반드시 받아두어야 한다
	//부모인 추상클래스는 자신이 미완성한 기능을 자식이 완성시키도록
	//조건부 상속하고 있다.
	@Override	//사용유무에 상관없이 갖고 있어야 함
	public void setValue(int n) {
		
		
	}

}
