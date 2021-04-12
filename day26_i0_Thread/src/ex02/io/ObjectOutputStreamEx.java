package ex02.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
	 Score vo = new Score();
	 vo.setSu(80);
	 vo.setSubject("미술");
	 
	 System.out.println(vo);
	 // 출력에 간한거를 같이 넣어 줘야 한다 
	 OutputStream os = new FileOutputStream("score.bat");
	 ObjectOutputStream oos = new ObjectOutputStream(os);
	 
	 oos.writeObject(vo);
	 oos.close();
	}
}
