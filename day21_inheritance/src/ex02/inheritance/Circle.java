package ex02.inheritance;

public class Circle extends Point {
	private int r;
	
	public Circle() {
		r = 5;
	}
//	public Circle(int x, int y, int r) {
//		super(x,y);
//		this.r = r;
//	}
//	
//	public Circle(int x) {
//		super(x);// 부모의 생성자 함수를 지칭
//		r = 10;
//	}
	
	public void disp() {
		System.out.println(x + ","+y+","+r);
	}
}
