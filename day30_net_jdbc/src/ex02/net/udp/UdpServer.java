package ex02.net.udp;
import java.io.*;
import java.net.*;
public class UdpServer {
	//사이즈 못 바꾸게 PACKTSIZE
	private final static int PACKTSIZE = 100;
		

	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("using: DatagrameServer port number");
			return; //제어권 넘김
		}
		
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("The Serer is ready,,,,,,,,,,,");
			//페킷 사이즈 지정해서  출력
			for(;;) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKTSIZE], PACKTSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress()+""+dp.getPort()+":"+new String(dp.getData()));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
