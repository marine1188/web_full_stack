package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {  // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 1:  System.out.println("point 1");	break;
			case 2:  System.out.println("point 2");	break;
			case 3:  System.out.println("point 3");	break;
			default : System.out.println("1~ 3���� ���� �Է�����~");
		} // switch end
	}
}
