package ex01.wraper;

class Point{ }

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer la = new Integer(10);
		Integer lb = new Integer("10");
		Point pt = new Point();
		
		System.out.println(pt); //해당객체의 주소 값 출력됨
		System.out.println(pt.toString());
		System.out.println(la);
		System.out.println(la.getClass().getName()+'@'+Integer.toHexString(la.hashCode()));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x+","+y);
		
		x = (int)y;
		System.out.println(x + "," + y);
		
		//Boxing vs UnBoxing
		int c = la.intValue(); // jdk 4.x 이전에 사용하던 메소드
		
		int d =lb;// jdk 5.x 이후 부터 autoboxing , unboxing 된다
		
		//System.out.println(c+num);//
		System.out.println(c+d);
		System.out.println(la.MAX_VALUE);
		System.out.println(la.MAX_VALUE);
		
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println("==================");
		c = (int)dd.doubleValue();
		System.out.println("형변환한 c의 값은 ?" + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("111111",2);
		System.out.println(e+20);
		System.out.println(f);
		
		int xx = 3;
		Integer yy = new Integer(3); //heap memory
		
		xx = yy.intValue();
		xx =yy;
		
		
		
		
		
	}

}
