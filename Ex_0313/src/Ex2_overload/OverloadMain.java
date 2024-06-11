package Ex2_overload;

public class OverloadMain {
	public static void main(String[] args) {
		
		OverloadTest ot = new OverloadTest();
		ot.getResult();
		ot.getResult(10);
		ot.getResult('A');
		ot.getResult("hi");
		ot.getResult(10, "hi");
		ot.getResult("hi", 10);
		
		System.out.println();
		
	}//main
}
