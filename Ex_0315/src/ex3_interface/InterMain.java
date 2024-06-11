package ex3_interface;

public class InterMain {
	public static void main(String[] args) {
		
		InterChild c = new InterChild();
		System.out.println( c.getA() );
		
		
		//인터페이스 역시 미완성된 메서드가 있기 때문에
		//직접적으로 메모리를 할당받는 것은 불가능
		InterParent ip = new InterParent() {
			
			@Override
			public int getA() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}//main
}
