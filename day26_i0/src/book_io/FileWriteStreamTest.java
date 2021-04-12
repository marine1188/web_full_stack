package book_io;
import java.io.*;
public class FileWriteStreamTest {
	public static void main(String[] args) throws Exception {
		String str = "String\n";
		char ch = 'A';
		char [] charArr = {'b','c'};
		
		Writer out = null;
		out = new FileWriter("test01.txt");
		
		out.write(str);
		out.write(ch);
		out.write(charArr);
		out.close();
		System.out.println("파일에 문자를 출력했습니다");
	}
}
