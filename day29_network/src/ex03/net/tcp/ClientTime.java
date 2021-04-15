package ex03.net.tcp;
import java.net.*;
import java.util.Date;
import java.io.*;

public class ClientTime {
	public static void main(String[] args) {
		//String serverIP ="127.0.0.1";
		String serverIP ="192.168.20.9";
		int port = 7000;
		Date date = null;
		
		try {
			Socket client = new Socket(serverIP,port);//서버측 ip 주소와 port 번호로 소켓 생성함
			InputStream is = client.getInputStream();//net 통해서 읽음
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("서버 측 날짜/시간확인 ........여기 는 클라이언트 입니다.\n\n");
			
			date = (Date)ois.readObject();
			System.out.println("서버측 현재시간"+ date + "입니다");
			ois.close();
			client.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
