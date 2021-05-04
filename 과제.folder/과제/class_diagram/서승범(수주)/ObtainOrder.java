package homework_order;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ObtainOrder {
	protected String order_num = "1000"; //수주번호(주문번호)
	protected String order_date; //수주날짜 (주문날짜)
	Scanner s = new Scanner(System.in);
	String good_code;
	String good_name;
	int good_count;
	Customer customer;
	O_OrderInfo ooi;
	HashMap order_list;
	Stock st;
	public ObtainOrder(String good_code, int good_count, String good_name, HashMap order_list){
		this.good_code = good_code;
		this.good_name = good_name;
		this.good_count = good_count;
		this.order_list = order_list;
		orderInput();
	}
	public void orderInput(){
		customer = new Customer();
		
		System.out.println("### 고객정보를 입력해주세요 ###");
		System.out.print("# <이 름> => ");
		customer.CustomerName = s.nextLine();
		System.out.print("# <주 소> => ");
		customer.CustomerAddress = s.nextLine();
		System.out.print("# <전화번호> => ");
		customer.CustomerPhone = s.nextLine();
		order_num += customer.CustomerPhone;
		System.out.println("고객정보 등록이 완료되었습니다.");
		System.out.println("--------------------------------\n");
		System.out.println("주문이 완료되었습니다. [주문번호] : "+order_num);
		order_date = getOrder_date();
		ooi = new O_OrderInfo(this, customer, order_list);
		order_list.put(this, customer);
	}
	private String getOrder_date(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String result = df.format(date);
		return result;
	}
	
	public void myOrder(HashMap order_list){
		this.order_list = order_list;
		Set set = order_list.entrySet();
		Iterator it = set.iterator();
		System.out.println("### 주문 정보 조회 ###");
		System.out.print("주문자 이름을 입력해 주세요 : ");
		String t_name = s.nextLine();
		if(it.hasNext() == false){
			System.out.println("해당 고객정보가 없습니다.");
		}
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			ObtainOrder temp = (ObtainOrder) e.getKey();
			Customer c_temp = (Customer)e.getValue();
			if(t_name.equals(c_temp.CustomerName)){
				System.out.println("주문번호 : "+temp.order_num);
				System.out.println("주문자 명 : "+c_temp.CustomerName);
				System.out.println("주문자 주소 : "+c_temp.CustomerAddress);
				System.out.println("주문자 전화번호 : "+c_temp.CustomerPhone);
				System.out.println("주문 상품 : "+temp.good_name);
				System.out.println("주문 수량 : "+temp.good_count);
				if(temp.good_code.equals("S2015GS6")){
					System.out.println("결제 금액 : "+(temp.good_count * 874000) + " 원");
				}
				else if (temp.good_code.equals("AP2017IP8")){
					System.out.println("결제 금액 : "+(temp.good_count * 1248000) + " 원");
				}
				System.out.println("_________________________________________________");
			}
		}
	}
	
	public void cancel(HashMap order_list, Stock st){
		this.order_list = order_list;
		this.st = st;
		Set set = order_list.entrySet();
		Iterator it = set.iterator();
		System.out.println("### 주문 취소 ###");
		System.out.print("주문자 이름을 입력해 주세요 : ");
		String t_name = s.nextLine();
		if(it.hasNext() == false){
			System.out.println("해당 고객정보가 없습니다.");
		}
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			ObtainOrder temp = (ObtainOrder) e.getKey();
			Customer c_temp = (Customer)e.getValue();
			if(t_name.equals(c_temp.CustomerName)){
				if(temp.good_code.equals("S2015GS6")){
					st.samsungStock += temp.good_count;
				}
				else if (temp.good_code.equals("AP2017IP8")){
					st.appleStock += temp.good_count;
				}
				order_list.remove(temp, c_temp);
				System.out.println("정상 취소 되었습니다.");
				System.out.println("_________________________________________________");
			}
		}
	
	}
}
