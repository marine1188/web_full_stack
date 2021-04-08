package ex08.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("보영",new Integer(90));
		map.put("준수",new Integer(1000));
		map.put("윤태",new Integer(100));
		map.put("선민",new Integer(60));
		map.put("승균",new Integer(20));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 :" + e.getKey()+",점수 : "+ e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+ set);
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("Total :" + total);
		System.out.println("Average :" + (float)total/ set.size());
		System.out.println("Max Score :" + Collections.max(values));
		System.out.println("Min Score :" + Collections.min(values));
		
	}

}
