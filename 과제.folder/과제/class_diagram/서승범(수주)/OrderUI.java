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
		System.out.println("### 주문을 시작합니다 ###");
		System.out.println("◀[O r d e r]▶");
		System.out.print("# <상품코드> => ");
		good_code = s.nextLine();
		System.out.print("# <수량> => ");
		good_count = Integer.parseInt(s.nextLine());
		if(good_code.equals("S2015GS6")){
			good_name = "SAMSUNG GALUXY S6";
			st.samsungStock -= good_count;
		}
		else if(good_code.equals("AP2017IP8")){
			good_name = "APPLE iPhone8";
			st.appleStock -= good_count;
		}
		System.out.println("주문정보 등록이 완료되었습니다.");
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
