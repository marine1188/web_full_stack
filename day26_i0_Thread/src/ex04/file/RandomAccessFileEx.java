package ex04.file;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("example.txt","rw");// 예외 발생
		
		for (int i = 0; i < 10; i++) {
			raf.seek(i*100);//
			raf.writeInt(i);
		}
		
		System.out.println("성공 !!");
		raf.close();
	}

}
