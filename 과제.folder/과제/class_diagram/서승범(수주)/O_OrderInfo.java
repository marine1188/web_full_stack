package homework_order;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class O_OrderInfo {
	private Goods goods;
	private int good_count;
	private double disCount;
	ObtainOrder oo;
	Customer customer;
	HashMap order_list;
	public O_OrderInfo(ObtainOrder oo, Customer customer, HashMap order_list){
		this.oo = oo;
		this.customer = customer;
		this.order_list = order_list;
		this.good_count = oo.good_count;
		disCount = 0.7;
	}
}
