package ex4_thread;

public class ThreadTest extends Thread{
	//Thread는 독립적인 실행 단위
	//한번에 두 가지 이상의 프로세스를 실행 가능하게 해 준다
	
	//Thread를 상속받을때 반드시 run메서드가 호출되어야 한다
	@Override
	public void run() {
		//프로세스의 독립적인 수행을 위한 영역
		for(int i = 0; i < 10; i++ ) {
			System.out.println("스레드 실행중");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}//for
		
		
	}

}
