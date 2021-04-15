package ex01.inner;
/*
 * inner class 를 어떻게 사용 한는지와 객체 선언
 */
class OuterClass {  // 외부클래스
	static int no;
	String message = "hi~~";
	
	public void outerMethod() {
		System.out.println("outer method call~~~");
//		System.out.println(su);  // inner class 멤버 접근 불가능
	}
	
	class InnerClass { // 내부클래스
		int su = 999;
		public void show() {
			System.out.println(su); // 내부(자신의것) 사용 가능
			System.out.println(message);  // 외부클래스 멤버 접근(사용)가능
		}
		public void disp() {
			outerMethod();  // 외부클래스 메소드 호출
		}		
	} // Inner end
} // Outer end

public class MainEntry {
	public static void main(String[] args) {
		//선언 방법// 1 
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("========================");
		//선언 방법// 2
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}


