package ex01.Interface;
// 키워드 만듬

interface A {//intrface - abstract method, final field 만 갖는다 
	int x = 90;  // final static int x = 90 ; 생략 되어있다 // 값변경이 안됨 
	
	//추상메소드. abstract 생략가능 함 - 무조건 추상메소드임
	public void show();
	public abstract void disp();
	
//	public void show() {
//		// 몸체를 가질수없다 { } 바디
//	}
	
}
interface B{
	public void view();
}//B END

interface C{
	String name = "성규";
	public void draw();
}


//iterface 간의 상속에서도 extends 키워드 사용 
interface D extends B{
	void dview();
}

//구현 예제 implements 
class Rect implements D {

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dview() {
		// TODO Auto-generated method stub
		
	}
	public int plus (int x ,int y) {
		return x+y;
		
	}
	
}

class Shape{
	
}
// 전체를 상속 받으면 어찌 되는가
class MultiClass extends Shape implements A,B,C{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}//shape end

// 클래스 없이 인터 페이스만 으로도 가능
class Point implements A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

class Circle implements C{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(name+"님이요");
	}
	
}

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();// 클래스가 아니라서 생성자 생성이 안됨
		Circle c = new Circle(); c.draw();
		C cc = new Circle(); cc.draw();
		
		A a = new Point();
		//
	}

}
