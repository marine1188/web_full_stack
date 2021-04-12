package ex01.io;

import java.io.*;

public class DataOputStreameEx {
	public static void main(String[] args) 
					throws  FileNotFoundException, IOException {  // 예외처리 위임
		
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);  //  FileNotFoundException 예외 발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);  // 'A' <--- ASCII code
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.34567);
		dos.flush();    // buffer 비우기
		
		System.out.println("test.txt 파일에 " + dos.size() + "byte save");
		dos.close();
	}
}






