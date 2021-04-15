package ex01.net;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class URLEx2 {

	public static void main(String[] args)  
			throws MalformedInputException,IOException {//예외 처리 위임
		// TODO Auto-generated method stub
		
		URL url = new  URL("https://www.google.com/search?q=jessi&sxsrf=ALeKk02AG5ER03J__LF4W4hUa87o59Fx2w%3A1618451153438&ei=0Zp3YOarGuCMr7wPsLWB-Aw&oq=Jes&gs_lcp=Cgdnd3Mtd2l6EAEYADICCAAyBQgAELEDMgUIABCxAzIFCAAQsQMyAggAMgIIADIFCAAQsQMyBQgAELEDMgUIABCxAzICCAA6BQgAELADOgcIABCwAxADOgsIABCxAxCDARCwAzoECCMQJzoECAAQQzoHCAAQsQMQQzoNCAAQhwIQsQMQgwEQFDoICAAQsQMQgwE6CggAELEDEIMBEEM6BwgjEOoCECc6BAgAEAo6BwgAELEDEApQ3I0DWKrhA2D_7gNoBXAAeACAAaUBiAG_CpIBBDIuMTCYAQCgAQGqAQdnd3Mtd2l6sAEKyAEKwAEB&sclient=gws-wiz");
		// 검색하면  search가 기본 
		
		//프로토콜 확인 
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
	}

}
