package coection.set;
import java.util.*;
class HashSetEx2 {
	//다음데이터의 위치를 기억한다
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1),"3","3","4","2","2","4","4"};
		Set set = new LinkedHashSet();	//  LinkedHashSet 순서를 유지한다 
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}