package ex02.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("score.txt");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Score s =(Score)ois.readObject();
		System.out.println("result output:"+s);
		
		ois.close();
		
	}

}
