//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
//		double point = new Scanner(System.in).nextDouble();
	
		switch (point) {  // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
			case 1:  System.out.print("�� ");	  //break;
			case 2:  System.out.print("�ǾƳ� ");	//break;
			case 3:  System.out.print("��� ");	//break;
		} // switch end
		
		System.out.println("��ǰ�� ��÷ �Ǽ̽��ϴ�. �����մϴ�. ^^ ");
	}
}
//*/






