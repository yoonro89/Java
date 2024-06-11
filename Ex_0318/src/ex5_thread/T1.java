package ex5_thread;

public class T1 extends Thread{

	@Override
	public void run() {
		for( int i = 0; i < 100; i++ ) {
			System.out.print("1");
		}//for
	}
	
}
