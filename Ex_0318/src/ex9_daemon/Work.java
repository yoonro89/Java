package ex9_daemon;

public class Work extends Thread{
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(3000);
				System.out.println("자동저장 완료");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
	}

}
