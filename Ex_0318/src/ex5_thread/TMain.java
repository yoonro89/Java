package ex5_thread;

public class TMain {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		//인접한 위치에서 호출된 스레드들은 누가 먼저 실행될지 절대로 예측할 수 없다
		
		t1.start();
		
		try {
			Thread.sleep(500);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
		
	}//main
}
