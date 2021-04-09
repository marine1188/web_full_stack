package ex03_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
   사칙연산 프로그램 작성( io, exception )
   숫자 2개 입력 받고,
   연산 1개 입력 받고 
    result >
    3 
    5
    +
    3 + 5  = 8 
 */
public class OP_EX2_try {
	public static void main(String[] args) {
		// throws NumberFormatException, IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("su1 input = ");
			//형변환
			int su1 = Integer.parseInt(br.readLine());
			System.out.print("su2 input = ");
			int su2 = Integer.parseInt(br.readLine());

			System.out.print("operator(+, -, *, /) input = ");
			String op = br.readLine();
			int result = 0;

			if (op.equals("+")) {
				System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			} else if (op.equals("-")) {
				System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
			}

			switch (op) {
			case "+":
				result = su1 + su2;
				break;
			case "-":
				result = su1 - su2;
				break;
			case "*":
				result = su1 * su2;
				break;
			case "/":
				result = su1 / su2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시해~");
				System.exit(0);
			}

			System.out.println(su1 + op + su2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("정수형 데이터가 아닙니다.");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}






