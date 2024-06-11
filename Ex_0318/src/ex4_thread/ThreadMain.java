package ex4_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		
		//run()내부의 코드를 독립적으로 실행
		tt.start();
		
		System.out.println("메인스레드 종료");
		
	}//main
}
