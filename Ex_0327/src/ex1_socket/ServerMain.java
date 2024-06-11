package ex1_socket;

public class ServerMain {
	public static void main(String[] args) {
		
		//서버 실행 및 클라이언트 접속 대기
		MyServer ms  = new MyServer();
		ms.start();
		
	}//main
}
