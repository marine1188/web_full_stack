package ex01.net.udp;
import java.io.*;
import java.net.*;
public class DatagramServer {
	public static void main(String[] args) {
		
		//일반적으로 메세지를 받기만 한다
		
		
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file = null;
		// 
		try {
			System.out.println("@@@ UDP File Server @@@");
			//소켓 생성
			ds = new DatagramSocket(port);
			
			while(true) {
				dp = new DatagramPacket(new byte[65536],65536);
				ds.receive(dp);//수신
				
				//생성자 만들기 // 객체 자체가 달라 문자열로 출력 해야해서 
				//trim 함수 뒤 공백 제거
				str = new String(dp.getData(),0,dp.getLength()).trim();
				
				//start 문자가들어오면 실행 
				if(str.equalsIgnoreCase("start")) {
					System.out.println("전송되고 있음...");
					file = new File("test.txt");
					
					dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
					
				//end 면 프로그램을 바져 나옴			
				}else if (str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				}else if(file != null) {
					System.out.println(str);
					//파일로 출력하는 코드
					dos.write(dp.getData(),0,dp.getLength());
				}//end if
				
			}// end while
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {dos.close();}catch(Exception e) {e.printStackTrace();}
		}//end try
	}
}





