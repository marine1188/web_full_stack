package ex04.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
	public static void main(String[] args) throws IOException {
		//읽어들일 사이즈
		int seekSize = 5;
		//읽기 전용으로 파일 읽음
		RandomAccessFile raf = new RandomAccessFile("example.txt", "r");
		String line= "";
		
		//전체 문자열을 출력
		while( (line = raf.readLine() ) != null ) {
			System.out.println(line);
		}
		
		//문자열 총 길이
		System.out.println("total length : " + raf.length() + "\n");
		
		byte[] data = null;
		long size = raf.length() / seekSize + (raf.length() % seekSize == 0 ? 0 : 1);
		
		for (int i = 0; i < size; i++) {
			data = new byte[seekSize];
			
			// seekSize 만큼 증가
			raf.seek(i * seekSize);
			raf.read(data);
			
			// 바이트 데이터를 문자열로 변환(trim() 을 사용해 공백을 제거)
			System.out.printf("pointer : %02d   str : %s \n", raf.getFilePointer(), new String(data).trim());
		} // for end
		
		// 파일 닫기
		raf.close();
	}
}



















