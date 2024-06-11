package ex2_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	ServerSocket ss;
	
	public MyServer() {
		try {
			
			ss = new ServerSocket(5050);
			System.out.println("서버 시작!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				//접속한 클라이언트의 정보를 받는다
				Socket s = ss.accept();
				//접속한 클라이언트로부터 메시지를 받는다
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream() ));
				
				String message = reader.readLine();
				
				System.out.println(message);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
