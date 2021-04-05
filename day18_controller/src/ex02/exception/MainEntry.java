//*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws Exception {  // 예외처리 위임
		
		System.out.print("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		System.out.println(x / y);  
	}
}
//*/

/*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		try {
			System.out.print("x, y = ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			
			System.out.println(x / y);  
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException ");
		} catch(Exception e) {
			System.out.println("Exception ");
		} finally {
			System.out.println("finally 무조건 출력 됩니다.");
		}
	}
}
//*/

/*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		try {
			System.out.print("x, y = ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			
			System.out.println(x / y);   
			
		} catch(Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally 무조건 출력 됩니다.");
		}
	}
}
//*/

/*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		try {
			System.out.print("x, y = ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			
			System.out.println(x / y);   
			
		} catch(Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} // try end
	}
}
//*/


/*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.print("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0); // 프로그램 강제 종료
		}
		
		System.out.println(x / y);   
	}
}
//*/




