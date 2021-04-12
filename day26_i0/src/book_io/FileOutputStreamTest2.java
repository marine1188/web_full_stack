package book_io;
import java.io.*;
public class FileOutputStreamTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("test.txt");
		
		out.write(65);// A가 나온다
		out.close();
		System.err.println("파일 데이터 쓰기 성공");
	}

}
