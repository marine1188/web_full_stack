package ex08.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx1 {
	 //key/value 한쌍으로 처리 ( set + list )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("busan", "th1");
		map.put("kosta","129");
		map.put("bitCamp",123456);
		map.put("busan2","th1");
		
		System.out.println("요소 개수" + map.size());
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id :");
			String id = sc.nextLine().trim();
			System.out.println("pwd :");
			String pwd = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력 요망.");
				}else {
					System.out.println(id +"와" + pwd +"가일치합니"
							+ "다.");
					break;
				}// in if end
			}//out if end
		}// end while
	}

}
