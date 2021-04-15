package ex03.net.tcp;
import java.net.*;
import java.util.Date;
import java.io.*;


public class SeverTime {
	//server - socket 2ro
	
	public static void main(String[] args) {
		int port = 7000; //0~1024 예약 되어 있음
		
		try {
			System.out.println("server start");
			ServerSocket ss = new ServerSocket(port);// socket 1
			
			while(true) {
				Socket s = ss.accept();// socket 2
				//출력만 함 
				OutputStream os = s.getOutputStream(); // net 통해서 출력함
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());//서버측에 날짜를 보낼거야
				oos.flush();
				s.close();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
