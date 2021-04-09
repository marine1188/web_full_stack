package ex02.IO;

import java.io.InputStream;

public class KeyInput {
	public static void main(String[] args) {
		InputStream is =System.in; // 표준입력
		
	
		try {
			System.out.print("단일 문자 요망 :");
			//int num = is.read();//예외 발생함 , 'o'~'9' ,: 48 ~ 57 (ASCLL code)
			int num = is.read()-48;// 아스키 코드의 시작인 48을 뺌
			
			is.read(); is.read(); //문제 발생처리 - 자바에서 '문자' 2바이트 처리됨
			
			int num2 = is.read() -48;
			
			//System.out.println((char)num);
			System.out.println(num + num2);
			
		} catch (Exception e) {
			//단계별로 에러 찾아줘
			e.printStackTrace();
		}
		
		
	}
}
