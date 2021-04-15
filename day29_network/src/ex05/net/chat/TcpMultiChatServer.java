package ex05.net.chat;
import java.io.*;
import java.net.*;
import java.util.*;


import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer {
	HashMap clients;   // key, value
	ServerSocket ss = null;
	Socket s = null;
	
	public TcpMultiChatServer() {
		clients = new HashMap(); 
		Collections.synchronizedMap(clients);  // 동기화
	}
	
	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("서버 시작 되었습니다.");
			
			while(true) {
				s = ss.accept();
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(s);  // user class
				thread.start();  // run() 대기 상태로 유도한다.
			}
		} catch (Exception e) {		e.printStackTrace();		}
	} // end start()
	
	class ServerReceiver extends Thread {  // inner class
		Socket s;
		DataInputStream dis;
		DataOutputStream dos;
		String name = "";
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크를 통해서 쓰기
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("서버 리시브 실패!!!!");
			} // end try
		}
		@Override
		public void run() {  // 스레드 실행부(구현부)
			try {
				name = dis.readUTF();
				sendToAll("#" + name + " 님이 입장하셨습니다. ");  // user method
				clients.put(name, dos);  // HashMap에 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다."); // 접속자 수 확인
				
				while( dis != null ) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + " 님이 나가셨습니다.");  // user method
				clients.remove(name);  // 접속자 수 제거
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 종료하셨습니다." );
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
			} // end try
		}  // end run()
		
		public void sendToAll(String msg) {
			Iterator it = clients.keySet().iterator();  // key 값 출력
			
			while( it.hasNext() ) {
				try {
					DataOutputStream dos = (DataOutputStream)clients.get(it.next());
					dos.writeUTF(msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // end while
		} // end sendToAll()
	} // end class ServerReceiver
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();;
	}
}