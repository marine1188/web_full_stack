package book_io;
import java.io.*;
/*
  FileInputStream을 이용해서 파일의 모든 데이터를 읽어오는 예제
 */
public class FileOutputStreamTest4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("test01.txt");
		
		int i = 0;
		
		while(true) {
			 i = in.read();// read() 메소드를 이용해서 바이트 단위의 데이터를 일어옵니다.
			 if (i == -1) {
				break;
			}
			 System.out.print((char)i);
		}
		
		
		System.out.println();	
		in.close();
		System.out.println("파일 데이터를 모두 읽었습니다");

	}

}
