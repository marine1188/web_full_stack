package homework_order;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainActivity {
	public static void main(String[] args) throws InputMismatchException {
		Scanner s = new Scanner(System.in);
		OrderUI ou = new OrderUI();
		HashMap order_list = new HashMap();
		HashMap goods_list = new HashMap();
		Goods goods = new Goods(goods_list);
		System.out.println("### KOSTA 160�� ���¹� ���� ###");
		System.out.println("-------------------------------\n");
		int menu_ch;
		while (true) {
			menu_ch = 0;
			System.out.println("\n\n\n\n\n");
			goods.showGoods();
			System.out.println("��[M E N U]��");
			System.out.println("#1 [�ֹ��ϱ�]");
			System.out.println("#2 [�ֹ����]");
			System.out.println("#3 [��������]");
			System.out.println("#4 [�����ϱ�]");
			System.out.print("[����] -> ");
			menu_ch = s.nextInt();
			s.skip("\r\n" + "");
			try {
				switch (menu_ch) {
				case 1:
					ou.input(order_list, goods.st);
					break;
				case 2:
					ou.cancel(order_list, goods.st);
					break;
				case 3:
					ou.myOrder(order_list);
					break;
				case 4:
					System.out.println("### ���α׷��� �����մϴ�. ###");
					System.exit(0);
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("�ش� �������� �����ϴ�.");
				continue;
			}
		}
	}
}
