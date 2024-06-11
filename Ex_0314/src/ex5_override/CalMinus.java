package ex5_override;

public class CalMinus extends Calculator {

	@Override
	public void getResult(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
}
