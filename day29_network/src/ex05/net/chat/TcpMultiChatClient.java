package ex05.net.chat;
import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		if( args.length != 1 ) {
			System.out.println("USAGE : java TcpMultiChatClient 대화명 넣어주세요" );
			System.exit(0);
		} // end if
		
		try {
			String ip = "127.0.0.1";
			Socket s = new Socket(ip, 8000);
			System.out.println("서버에 연결 되었습니다.");
			Thread send = new Thread(new ClientSender(s, args[0]));  // inner class
			Thread reciever = new Thread(new ClientReciever(s));  // 
			send.start();  // run() 유도한다.
			reciever.start();
		} catch (Exception e) {		e.printStackTrace();		}
	}
	
	static class ClientReciever extends Thread {  // inner class
		Socket s ;
		DataInputStream dis ;
		
		public ClientReciever(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) { e.printStackTrace();  }				
		}
		@Override
		public void run() {
			while( dis != null ) {
				try {
					System.out.println(dis.readUTF());
				}catch (Exception e) { e.printStackTrace();  }				
			}
		}
	} // end class ClientReciever
	
	static class ClientSender extends Thread {  // inner class
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s  = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) { e.printStackTrace(); }
		}
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);  // 키보드로 입력 받기
			try {
				if( dos != null ) dos.writeUTF(name);
				while( dos != null ) dos.writeUTF("[" + name + "] " + sc.nextLine());
			} catch (Exception e) { e.printStackTrace(); }
		}
	} // end class ClientSender
}








