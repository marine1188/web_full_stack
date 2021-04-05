//*
package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws Exception {  // ����ó�� ����
		
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
			System.out.println("finally ������ ��� �˴ϴ�.");
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
			//System.out.println("0���� ���� �� �����ϴ�.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally ������ ��� �˴ϴ�.");
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
			//System.out.println("0���� ���� �� �����ϴ�.");
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
			System.out.println("0���� ���� �� �����ϴ�.");
			System.exit(0); // ���α׷� ���� ����
		}
		
		System.out.println(x / y);   
	}
}
//*/




