package ex8_throws;

public class T1 {

	public void showNum1() throws InterruptedException {
		
		for(int i = 0; i < 10; i++ ) {
			
			System.out.println("num1");
			Thread.sleep(1000);
		}
		
	}
	
}
