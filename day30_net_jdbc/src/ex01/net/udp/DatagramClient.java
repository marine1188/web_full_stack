package ex01.net.udp;
import java.io.*;
import java.net.*;
public class DatagramClient {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		//읽어 드릴 것
		DataInputStream dis = null;
		//읽어 드릴 그릇
		BufferedReader br = null;
		int port = 5000;
		String str;
		byte[]b;
		
		try {
			System.out.println("@@@ UDP File Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상(server ip) =");
			String ipAddress =br.readLine();
			System.out.println("전송 파일(파일명 확장자) =");
			String fileName = br.readLine();
			
			File file = new File(fileName);
			
			if(!file.exists()) {
				System.out.println("파일이 존재 하지 않습니다");
				System.exit(0);
			}//end if
			
			
			ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName(ipAddress);
			str= "start";
			b= str.getBytes();
			
			dp = new DatagramPacket(b,b.length,ip,port);
			ds.send(dp);//송신
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			//그릇 선언
			b= new byte[65536];
			
			while(true) {
				int count = dis.read(b,0,b.length);
				if(count == -1)break;
				dp = new DatagramPacket(b,count,ip,port);
				ds.send(dp);
			}//end while
			
			str = "end";
			b= str.getBytes();
			dp = new DatagramPacket(b,b.length,ip,port);
			ds.send(dp);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {br.close();dis.close();}catch(Exception e) {e.printStackTrace();}
		}//end try
	}
}
