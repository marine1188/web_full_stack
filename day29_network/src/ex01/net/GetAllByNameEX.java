package ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEX {

	public static void main(String[] args)throws UnknownHostException {
		// TODO Auto-generated method stub
				InetAddress address = InetAddress.getLocalHost();//
				System.out.println("로컬 호스트 이름:"+address.getHostAddress());
				System.out.println("로컬 호스트 IP 주소 :"+ address.getHostAddress());
				
				address = InetAddress.getByName("www.naver.com");///
				System.out.println("로컬 호스트 이름 :"+address.getHostName());
				System.out.println("로컬 호스트 IP 주소 :"+ address.getHostAddress());
				
				byte[]addr = new byte[4];
				addr[0] = (byte)192;
				addr[1] = (byte)168;
				addr[2] = (byte)20;
				addr[3] = (byte)10;
				
				address = InetAddress.getByAddress(addr);///
				System.out.println("호스트 이름 :"+address.getCanonicalHostName());
				System.out.println("로컬 호스트 IP 주소 :"+ address.getHostName());
				System.out.println("로컬 호스트 IP 주소 :"+ address.getHostAddress());
				System.out.println("");
				InetAddress[]arr;
				arr = InetAddress.getAllByName("www.google.com");
				for(InetAddress item : arr) {
					System.out.println("구글 호스트 이름 :"+ item.getHostName());
					System.out.println("구글호스트 IP 주소 :"+ item.getHostAddress());
				}
	}

}
