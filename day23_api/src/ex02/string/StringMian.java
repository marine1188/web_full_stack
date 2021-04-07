package ex02.string;

public class StringMian {
	public static void main(String[] args) {
		int x = 3 , y = 5;
		System.out.println("x =" + x +",y ="+ y);
		x = y;
		System.out.println("x =" + x +",y ="+ y);
		
		String s1 = "korea";
		String s2 = "happy";

		System.out.println("s1 =" + s1 + ",s2 ="+s2);
		System.out.println("hashcod:"+ s1.hashCode()+"\t," + s2.hashCode());/////
		
		
		s1 =s2;
		System.out.println("s1 =" + s1 + ",s2 ="+s2);
		System.out.println("hashcod:"+ s1.hashCode()+"\t," + s2.hashCode());
		s2 = "seoul";
	}
}
