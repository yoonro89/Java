package ex7_thread;

public class TCount extends Thread{
	
	int n;
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = n; i >= 0; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	

	
}
