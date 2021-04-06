package ex08.apiObject;

class Point{
	
}

public class ObjectClass {

	private static final Object Ox15db9742 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point pt = new Point();
		System.out.println("point pt information");
		System.out.println("class name :"+pt.getClass());
		System.out.println("hash code :" + pt.hashCode());
		System.out.println("Object String :" + pt.toString());
		System.out.println("Object String :" + pt);
		System.out.printf("10진수 %d\n",Ox15db9742);
		
		System.out.println("===========================");
		Point pt2 = new Point();
		System.out.println("point pt information");
		System.out.println("class name :"+pt2.getClass());
		System.out.println("hash code :" + pt2.hashCode());
		System.out.println("Object String :" + pt2.toString());
		System.out.println("Object String :" + pt2);
		System.out.println("#############################");

		System.out.println("p2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName() + '@'+ Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		
		if(pt.hashCode()== pt3.hashCode()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}

}

