package ex06.collection.set;
//코드
import java.util.HashSet;
import java.util.Iterator;

public class HashSeetEX1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		System.out.println("요소 개수 :" + hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs2  = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		hs2.add(new Integer((200)));
		
		System.out.println("-------------------------");
//		for (Object item : hs2) {//다음 요소사 있다면
//			System.out.println(it.next());//요소들을 꺼내와서 출력함
//		}
		System.out.println("------------------------");
		
		
		
		
	}
}
