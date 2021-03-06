package ex02.inheritance;

public class Point {
	
	// 클래스 상속 할때
	//매개 변수
	//private int x,y; //private 에서 안됨
	protected int x,y;
	// 보호모드 자손들에게 접근가능 
	
	
//	// 기능 상실하게 하느게 하는 코드
//	public Point(int x,int y) {// this 매개 변수를 나타냄
//		this.x = x;
//		this.y = y;
//	}
//	
//	public Point(int x) {//매개변수 1개인자 갖는 생성자
//		this.x =x;
//		y =5;
//	}
	
	
	
	
	public Point() {// 디폴트 생성자
		x = y = 99;
	}
	
	public Point(int x,int y) {
		
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x+","+y);
	}
	
	public String toString() {
		return "오버라이드 됨 Point();"+x+","+y;
		
	}
}
