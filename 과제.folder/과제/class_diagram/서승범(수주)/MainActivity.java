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
		System.out.println("### KOSTA 160기 서승범 과제 ###");
		System.out.println("-------------------------------\n");
		int menu_ch;
		while (true) {
			menu_ch = 0;
			System.out.println("\n\n\n\n\n");
			goods.showGoods();
			System.out.println("◀[M E N U]▶");
			System.out.println("#1 [주문하기]");
			System.out.println("#2 [주문취소]");
			System.out.println("#3 [수주정보]");
			System.out.println("#4 [종료하기]");
			System.out.print("[선택] -> ");
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
					System.out.println("### 프로그램을 종료합니다. ###");
					System.exit(0);
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("해당 고객정보가 없습니다.");
				continue;
			}
		}
	}
}
