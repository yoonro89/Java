package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		
		Computer com1 = new Computer();		//반드시 명식적(heap영역)으로 메모리를 할당 받아야 한다.
		com1.getInfo();
		
		Computer com2 = new Computer();
		com2.ssd = 1024;
//		com2.brand ="apple";				private변수인 brand는 어떤 객체에서도 가져다 쓸 수 없다
		com2.getInfo();
		
		Computer com3 = new Computer();
		com3.getInfo();
		
	}
}
