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
		System.out.println("### ��ǰ �޴� ###");
		System.out.println("______________________________________");
		System.out.println("[��ǰ�ڵ�] S2015GS6");
		System.out.println("[��ǰ��] SAMSUNG GALUXY S6");
		System.out.println("[ ���� ] 874,000 ��");
		System.out.println("[ ��� ] "+st.samsungStock +" ��");
		System.out.println("______________________________________");
		System.out.println("[��ǰ�ڵ�] AP2017IP8");
		System.out.println("[��ǰ��] APPLE iPhone8 ");
		System.out.println("[ ���� ] 1,248,000 ��");
		System.out.println("[ ��� ] "+st.appleStock+" ��");
		System.out.println("______________________________________");
		System.out.println("�����Ͻ� ��ǰ�ڵ带 ��Ȯ�ϰ� �Է��Ͽ� �ֽʽÿ�.");
		System.out.println("______________________________________");
	}
}
