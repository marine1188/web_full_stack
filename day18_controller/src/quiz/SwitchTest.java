package quiz;

public class SwitchTest {
	public static void main(String[] args) {
		String ss = "abc";

		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
//		str = "kbs";
		
//		int x = 3, y = 3;
		System.out.println(ss.hashCode() + ", " + str.hashCode());
		System.out.println(ss.length() + ", " + str.length());
		
		System.out.println(str + ", " + ss);
		
		
		 if( ss == str ) {   //if( ss.equals(str) ) { 
			System.out.println("O");
		}
		else System.out.println("X");

	}
}
