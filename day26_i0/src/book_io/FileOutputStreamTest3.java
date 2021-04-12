package book_io;
import java.io.*;
/*
  FileInputStream을 이용해서 파이의 데이터를 일어오는 예제
 */
public class FileOutputStreamTest3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("test.txt");
		int i = in.read();// read() 메소드를 이용해서 바이트 단위의 데이터를 일어옵니다.
		
		System.out.println(i);
		System.out.println((char)i);
		
		
		in.close();
		System.out.println("파일을 읽어와서 콘솔에 나옵니다");

	}

}
