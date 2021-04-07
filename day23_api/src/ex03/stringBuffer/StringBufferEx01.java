package ex03.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer  sb = new StringBuffer();
		System.out.println(sb.hashCode());  // 366712642
		System.out.println("length     /     capacity");
		int len = sb.length();		int size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		sb.append("busan");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		sb.append("happy doyeon");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		sb.append("12354689 479952336");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "     /      " + size);
		
		System.out.println(sb.hashCode()); // 366712642
		
		sb.trimToSize();   //용량 크기 조정
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "     /      " + size);
	}
}







