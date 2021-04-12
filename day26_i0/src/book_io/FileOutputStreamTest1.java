package book_io;
import java.io.*;
public class FileOutputStreamTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("test01.txt");
		
		String s = "Hi !!!!";
		byte b[] = s.getBytes();//문자열을 Byte 타입의 배열로 변환
		out.write(b);
		System.err.println("파일 데이터 쓰기 성공");
	}

}
