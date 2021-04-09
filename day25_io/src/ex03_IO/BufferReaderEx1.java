package ex03_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderEx1 {
	public static void main(String[] args)
										throws IOException {  // 예외처리 위임
		
		///불필요한 객체는 그냥 합치지자 
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
		
		////그냥 안에다가 집어 넣으면 된다
//		BufferedReader  br = new BufferedReader(reader);
		
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("charator input = ");
//		String str = br.readLine();  // 예외발생.  여러개의 데이터 입력 받기
//		String str2 = br.readLine();
		
		System.out.println("integer input = ");
//		String str = br.readLine();  // 예외발생.  여러개의 데이터 입력 받기
//		String str2 = br.readLine();
//		int su1 = Integer.parseInt(str);
//		int su2 = Integer.parseInt(str2);
		
		int su1 = Integer.parseInt(br.readLine());
		int su2 = Integer.parseInt(br.readLine());
		
//		System.out.println(str + str2);
		System.out.println(su1 + su2);
		
	}
}








