package ex03.Switch;

import java.util.Scanner;

public class SwtichTest4 {
	public static void main(String[] args) {
		System.out.println("input month : ");
		int month = new Scanner(System.in).nextInt();
		boolean flag = false;
		String str = "";

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "���� ������ ���� 31�� �Դϴ�.");
				break;
	
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "���� ������ ���� 30�� �Դϴ�.");
				break;
	
			case 2:
				System.out.println("year = ? ");
				int year = new Scanner(System.in).nextInt();
				 if(  (year % 4 == 0 ) && ( year % 100 != 0 ||   year % 400 == 0 ) ) {
					 		flag = true;
				 }
				 str = (flag == true) ? year + "�⵵ " + month + "���� ������ ���� 29�� �Դϴ�" 
						 						        : year + "�⵵ " + month + "���� ������ ���� 28�� �Դϴ�"; 
				 
				 System.out.println(str);
				break;
	
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~12 ������ ���ڸ� �Է����ּ���. ");
				break;
		} // switch end

	}
}
