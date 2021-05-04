package homework_order;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Goods {
	protected String g_code;
	protected String g_name;
	protected int price;
	Container con;
	Stock st;
	HashMap goods_list;
	public Goods(HashMap goods_list){
		st = new Stock();
	}
	
	public void showGoods(){
		System.out.println("### 상품 메뉴 ###");
		System.out.println("______________________________________");
		System.out.println("[제품코드] S2015GS6");
		System.out.println("[제품명] SAMSUNG GALUXY S6");
		System.out.println("[ 가격 ] 874,000 원");
		System.out.println("[ 재고 ] "+st.samsungStock +" 개");
		System.out.println("______________________________________");
		System.out.println("[제품코드] AP2017IP8");
		System.out.println("[제품명] APPLE iPhone8 ");
		System.out.println("[ 가격 ] 1,248,000 원");
		System.out.println("[ 재고 ] "+st.appleStock+" 개");
		System.out.println("______________________________________");
		System.out.println("구매하실 제품코드를 정확하게 입력하여 주십시오.");
		System.out.println("______________________________________");
	}
}
