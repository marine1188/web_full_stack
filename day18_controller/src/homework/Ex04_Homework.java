package homework;

import java.util.Scanner;

//문제4] 연산자(+, -, *, /) 를 입력 받고, 정수 2개 입력 받아서 사칙연산 프로그램 작성 
//   (if, do~ while 이용, 예외처리할것 )
public class Ex04_Homework {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, result = 0;
		char op ;
		System.out.print("su1 = ");		su1 = sc.nextInt();
		
		do {
			System.out.print("##연산자(+, -, *, /) 중 하나를 입력하세요. ");
			op = sc.next().charAt(0);
		} while( ( op != '+' ) && (op != '-' ) && (op != '*' ) && (op != '/' ) );
		
		do {
			System.out.print("su2 = ");		
			su2 = sc.nextInt();
		} while( (op == '/' ) && ( su2 == 0 ) ) ;  // op == / ,  su2 == 0 
		
		
		/*if( ( op != '+' ) && (op != '-' ) && (op != '*' ) && (op != '/' ) ) {
			System.out.println("\n 잘못 입력하셨습니다.");
			System.exit(0); // 프로그램 강제 종료
		} // end if
		 */		
		switch( op ) {
			case '+' : result = su1 + su2 ; break;
			case '-' : result = su1 - su2 ; break;
			case '*' : result = su1 * su2 ; break;
			case '/' : result = su1 / su2 ; break;
		} // end switch
		
		System.out.println("\n\n"+ su1 + op + su2 + " = " + result);
	}
}







