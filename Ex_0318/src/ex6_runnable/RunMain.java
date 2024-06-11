package ex6_runnable;

public class RunMain {
	public static void main(String[] args) {
		
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		t1.start();
		
		System.out.println("메인종료");
		
	}//main
}
