package ex02.net.udp;
import java.io.*;
import java.net.*;
//사이즈 못 바꾸게 PACKTSIZE

	
public class UdpClient {
	
	private final static int PACKTSIZE = 100;
	public static void main(String[] args) {
		//  두개가 넘어가야함
		if(args.length != 2) {
			System.out.println("using: DatagrameServer host,port number");
			return; //제어권 넘김
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]); //server ip
			int port = Integer.parseInt(args[1]);// server port number
			
			ds = new DatagramSocket();
			// 문자열의 길이 만큼 보낸다
			byte[]data = "marine coding".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length,host,port);
			
			ds.send(dp);
			
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKTSIZE]);
			System.out.println(new String(dp.getData()));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ds != null)ds.close();
		}
	}
}












