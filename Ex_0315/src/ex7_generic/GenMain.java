package ex7_generic;

public class GenMain {
	public static void main(String[] args) {
		//<>의 제너릭 타입으로는 반드시 클래스가 들어와야 한다
		GenTest<String> g1 = new GenTest<String>();
		g1.setValue("hi");
		String s = g1.getValue();
		System.out.println(s);
		
		GenTest<Integer> g2 = new GenTest<Integer>();
		g2.setValue(1000);
		int n = g2.getValue();
		System.out.println(n);
		
		
	}//main
}
