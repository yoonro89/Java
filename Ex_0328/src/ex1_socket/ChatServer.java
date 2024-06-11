package ex1_socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread{

	ServerSocket ss;
	List<CopyClient> list;
	
	
	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();
			
			ss = new ServerSocket(5050);
			System.out.println("Server Start!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				//접속자를 기다린다
				Socket s = ss.accept();
				
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}//while
	
		
	}//run
	
	//모든 클라이언트들에게 서버의 메시지를 전달
	public void sendMessage(String msg) {
		try {
			
			for(CopyClient cc : list) {
				
				//List에 담긴 모든 접속자들(client)에게 메시지 전달
				cc.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//sendMessage()
	
	public void removeClient(CopyClient cc) {
		list.remove(cc);
		sendMessage("--" + cc.ip + "님이 퇴장하였습니다--");
	}
	
}
