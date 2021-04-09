package ex03_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  사칙연산 프로 그램 작성 
  숫자 2개 입력 받고 (io,exception)예외 처리 하기
  연산 1개 입력 받고 
  result>
  3
  5
  +
  3+5 =8
  
 */
public class Quiz_BufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 숫자 입력하세요");
		int su1 = Integer.parseInt(br.readLine());
		System.out.println("두번째 숫자 입력하세요");
		int su2 = Integer.parseInt(br.readLine());
		System.out.println("연산자 (+,-,*,/) 입력하세요");
		String op = String.format(br.readLine());
		try {
			System.out.print("IO 페키지로 사직연산 하기 : \n");
			
			if (op.equals("+")) {
				int sum = su1 +su2;
				System.out.println("더하기"+ "답은\n"+ sum);
				
				System.out.println("");
			}else if(op.equals("-")) {
				int sub = su1 - su2;
				System.out.println("빼기"+ "답은\n"+ sub);
				System.out.println("");
			}else if(op.equals("*")) {
				int mul = su1 * su2;
				System.out.println("곱하기"+ "답은\n"+ mul);
				System.out.println("");
			}else if(op.equals("/")) {
				int mul = su1 / su2;
				System.out.println("나누기"+ "답은\n"+ mul);
				System.out.println("");
			}
			
		
			
			//System.out.println((char)num);
			
			
		} catch (Exception e) {
			//단계별로 에러 찾아줘
			e.printStackTrace();
			
		}
		
	}

}
