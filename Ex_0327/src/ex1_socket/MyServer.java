package ex1_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	//서버 생성을 위한 클래스
	ServerSocket ss;
	
	public MyServer() {
		try {
			//서버를 생성할 때, 클라이언트가 접속할 포트를 지정
			ss = new ServerSocket(5050);
			System.out.println("서버 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			//언제 접속할지 모르는 클라이언트들에 대응하기 위해
			//무한반복 속에서 접속자를 기다린다
			
			//클라이언트 객체
			try {
				//접속자를 받아서 Socket객체에 저장
				Socket s = ss.accept();
				
				//방금 접속한 클라이언트(s)의 ip를 가지고 와 보자
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + "님 다녀감");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}//while
	}
	
}
