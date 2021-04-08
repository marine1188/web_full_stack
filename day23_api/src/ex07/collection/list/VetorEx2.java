package ex07.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class VetorEx2 {
// 벡터 정리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("자바");// string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); //object 
		
		System.out.println("size:" + v.size() + ", capacity:" + v.capacity());
		
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("size:" + v.size() + ", capacity:" + v.capacity());
		//Iterator it = v.iterator();
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("---------- 객체 내용 포함 확인------------");
		if(v.contains("자바"))System.out.println("자바 문자열 포함됨");
		else System.out.println("해당요소 없어용");
		
		System.out.println("10.2요소 위치는" + v.indexOf(10.2));
		
		System.out.println("입력 시간 :" + date);
		System.out.println(v.get(v.indexOf(date)));
		System.out.println(date);
		
		//date 요소 제거 (삭제)
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("********************");
		System.out.println("size:" + v.size() + ", capacity:" + v.capacity());
		System.out.println(v);
		
		//여러개를지우고 싶어
		for (i = 0; i < v.size(); i++) {
			//v.removeElementAt(i);
			//v.remove(0); // index number
			//v.removeAllElements();
			v.remove(10.2);// 지정한 애만 지울수있다
		}
		
		System.out.println("********************");
		System.out.println("size:" + v.size() + ", capacity:" + v.capacity());
		System.out.println(v);
		
		for(i = 0; i < v.size();i++) {
			System.out.print(v.get(i)+",");
		}
		
		System.out.println("\n+++++++++++++++++++++++++++++++");
		// set 이용하면 수정가능 하다 //객체명이 먼저오고 인덱스는 뒤에
		v.setElementAt("java", 2);// 3번째 위치에 java 요소 수정됨
		System.out.println(v);
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		System.out.println("\n\n");
		v.trimToSize();
		System.out.println("size:" + v.size() + ", capacity:" + v.capacity());
		
		v.setSize(2); //크기를 강제로 2로 좆정
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("\n size:" + v.size() + ", capacity:" + v.capacity());
		System.out.println();
		v.removeAllElements();// 모든 요소 제거
		System.out.println("\n size:" + v.size() + ", capacity:" + v.capacity());
		System.out.println(v);
		
	}

}





