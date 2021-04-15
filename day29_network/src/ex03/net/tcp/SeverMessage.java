package ex03.net.tcp;
import java.net.*;
import java.io.*;
public class SeverMessage {
	private static final String IOException = null;

	public static void main(String[] args) {
		//서버는 소켓 두개
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("server start~~~");
		
		try {
			ss = new ServerSocket(9000);
			s = ss.accept();//client socket, 응답대기
			InputStream is = s.getInputStream();//read
			OutputStream os = s.getOutputStream(); // write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(arr);
			String msg = "무슨129";
			os.write(msg.getBytes());
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	s.close();  ss.close();	 } catch (IOException e) {	e.printStackTrace();	}
		}
	}
}
