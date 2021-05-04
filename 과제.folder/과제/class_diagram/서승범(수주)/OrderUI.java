package homework_order;

import java.util.HashMap;
import java.util.Scanner;

public class OrderUI {
	Scanner s = new Scanner(System.in);
	String good_code;
	String good_name;
	int good_count;
	ObtainOrder oo;
	Stock st;
	public void input(HashMap order_list, Stock st){
		this.st = st;
		System.out.println("### �ֹ��� �����մϴ� ###");
		System.out.println("��[O r d e r]��");
		System.out.print("# <��ǰ�ڵ�> => ");
		good_code = s.nextLine();
		System.out.print("# <����> => ");
		good_count = Integer.parseInt(s.nextLine());
		if(good_code.equals("S2015GS6")){
			good_name = "SAMSUNG GALUXY S6";
			st.samsungStock -= good_count;
		}
		else if(good_code.equals("AP2017IP8")){
			good_name = "APPLE iPhone8";
			st.appleStock -= good_count;
		}
		System.out.println("�ֹ����� ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println("--------------------------------\n");
		oo = new ObtainOrder(good_code, good_count, good_name, order_list);
	}
	public void myOrder(HashMap order_list){
		oo.myOrder(order_list);
	}
	public void cancel(HashMap order_list, Stock st){
		oo.cancel(order_list ,st);
	}
}
