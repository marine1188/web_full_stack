package homework;

import java.util.Scanner;

//����4] ������(+, -, *, /) �� �Է� �ް�, ���� 2�� �Է� �޾Ƽ� ��Ģ���� ���α׷� �ۼ� 
//   (if, do~ while �̿�, ����ó���Ұ� )
public class Ex04_Homework {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, result = 0;
		char op ;
		System.out.print("su1 = ");		su1 = sc.nextInt();
		
		do {
			System.out.print("##������(+, -, *, /) �� �ϳ��� �Է��ϼ���. ");
			op = sc.next().charAt(0);
		} while( ( op != '+' ) && (op != '-' ) && (op != '*' ) && (op != '/' ) );
		
		do {
			System.out.print("su2 = ");		
			su2 = sc.nextInt();
		} while( (op == '/' ) && ( su2 == 0 ) ) ;  // op == / ,  su2 == 0 
		
		
		/*if( ( op != '+' ) && (op != '-' ) && (op != '*' ) && (op != '/' ) ) {
			System.out.println("\n �߸� �Է��ϼ̽��ϴ�.");
			System.exit(0); // ���α׷� ���� ����
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







