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
	protected String order_num = "1000"; //���ֹ�ȣ(�ֹ���ȣ)
	protected String order_date; //���ֳ�¥ (�ֹ���¥)
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
		
		System.out.println("### �������� �Է����ּ��� ###");
		System.out.print("# <�� ��> => ");
		customer.CustomerName = s.nextLine();
		System.out.print("# <�� ��> => ");
		customer.CustomerAddress = s.nextLine();
		System.out.print("# <��ȭ��ȣ> => ");
		customer.CustomerPhone = s.nextLine();
		order_num += customer.CustomerPhone;
		System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println("--------------------------------\n");
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�. [�ֹ���ȣ] : "+order_num);
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
		System.out.println("### �ֹ� ���� ��ȸ ###");
		System.out.print("�ֹ��� �̸��� �Է��� �ּ��� : ");
		String t_name = s.nextLine();
		if(it.hasNext() == false){
			System.out.println("�ش� �������� �����ϴ�.");
		}
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			ObtainOrder temp = (ObtainOrder) e.getKey();
			Customer c_temp = (Customer)e.getValue();
			if(t_name.equals(c_temp.CustomerName)){
				System.out.println("�ֹ���ȣ : "+temp.order_num);
				System.out.println("�ֹ��� �� : "+c_temp.CustomerName);
				System.out.println("�ֹ��� �ּ� : "+c_temp.CustomerAddress);
				System.out.println("�ֹ��� ��ȭ��ȣ : "+c_temp.CustomerPhone);
				System.out.println("�ֹ� ��ǰ : "+temp.good_name);
				System.out.println("�ֹ� ���� : "+temp.good_count);
				if(temp.good_code.equals("S2015GS6")){
					System.out.println("���� �ݾ� : "+(temp.good_count * 874000) + " ��");
				}
				else if (temp.good_code.equals("AP2017IP8")){
					System.out.println("���� �ݾ� : "+(temp.good_count * 1248000) + " ��");
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
		System.out.println("### �ֹ� ��� ###");
		System.out.print("�ֹ��� �̸��� �Է��� �ּ��� : ");
		String t_name = s.nextLine();
		if(it.hasNext() == false){
			System.out.println("�ش� �������� �����ϴ�.");
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
				System.out.println("���� ��� �Ǿ����ϴ�.");
				System.out.println("_________________________________________________");
			}
		}
	
	}
}
