//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("���ø� �����ϼ���(s, d, b, j) = ");
		String city = new Scanner(System.in).next();
		char ch = city.charAt(0);   // ���ڿ� �Լ� �߿��� ���ڿ����� chatAt(index) �ε�����ȣ�� �ش��ϴ� ���ڸ� �����´�.
		
//		if( city.equals("s") ) { //if( ch == 's' ) {  //if( city == "s") {
//			System.out.println("O");
//		} else {
//			System.out.println("X");
//		}
		
		switch (ch) {  // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 's':  System.out.print("����");	break;
			case 'd':  System.out.print("�뱸");	break;
			case 'b':  System.out.print("�λ�");	break;
			case 'j':  System.out.print("����");	break;
			default : 
						System.out.println("�߸� �����߽��ϴ�. s, d, b, j �߿����� �����ϼ���.....");
						System.exit(0);
		} // switch end
		
		System.out.println("��(��) �����ϼ̽��ϴ�. ");
	}
}
//*/

/*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("���ø� �����ϼ���(s, d, b, j) = ");
		String city = new Scanner(System.in).next();
		
		switch (city) {  // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case "s":  System.out.print("����");	break;
			case "d":  System.out.print("�뱸");	break;
			case "b":  System.out.print("�λ�");	break;
			case "j":  System.out.print("����");	break;
			default : 
						System.out.println("�߸� �����߽��ϴ�. s, d, b, j �߿����� �����ϼ���.....");
						System.exit(0);
		} // switch end
		
		System.out.println("��(��) �����ϼ̽��ϴ�. ");
	}
}
//*/






