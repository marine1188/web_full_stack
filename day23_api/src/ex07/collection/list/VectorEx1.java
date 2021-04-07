package ex07.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// List : 순서 있고, 중복허용한다.
public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length      /      capacity");
		System.out.println(v.size()  +   "          /        "  + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4);  // 초기용량, 증가용량
		v2.add(2);
		v2.add(new Integer(33));
		v2.add(2);
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(89);  // 7
		v2.add(333);
		v2.add(333);
		System.out.println(v2.size()  +   "          /        "  + v2.capacity());
		System.out.println("-------------- iterator() method -----------------------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------- get() method -----------------------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("-------------- elementsAt() method -----------------------");
		for (int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num);
		}
		System.out.println("-------------- sort result -----------------------");
		Collections.sort(v2);// 요소 순서 대로
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("-------------- trimToSize() method -----------------------");
		v2.trimToSize(); // capacity 조정하기
		System.out.println(v2.size()+"       /         "+v2.capacity());
	}
}










