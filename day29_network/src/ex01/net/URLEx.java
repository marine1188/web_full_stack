package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class URLEx {

	public static void main(String[] args) throws MalformedInputException,IOException {//예외 처리 위임
		// TODO Auto-generated method stub
		
		//무조건 경로를 읽어 와야 생성자 생성 가능
		URL google = new URL("http://www.google.com");
		//System.in : 표준입력
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));// web 
		
		String inputLine;
		
		while((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		br.close();
	}

}
