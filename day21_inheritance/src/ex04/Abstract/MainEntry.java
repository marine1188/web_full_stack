package ex04.Abstract;

abstract class Shape {//추상클래스 , Super class
	double result = 0;
	public abstract double calc(); // 추상메소드
	public abstract void draw();
	
	public void show() {// 일반메소드 
		System.out.println("Super class Shape!!");
	}
}//shape end

class Cicrle extends Shape{ // 자손 클라스 //sub class
	double r = 5.0;
	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이 :"+ result + "인 원을 그렷습니다");
		
	}
	
}//Circle end

class Triangle extends Shape{
	int w = 10, h = 20;
	@Override
	public double calc() {
		result =(w*h)/2;
		return 0;
	}

	@Override
	public void draw() {
		System.out.println("삼각형의 넓이 :"+ result + "인 삼각형을 그렷습니다");
		
	}
	
}

class Square extends Shape{
	int w = 10, h = 20;
	@Override
	public double calc() {
		result = (w*h);
		return result;
	}

	@Override
	public void draw() {
		System.out.println("사각형의 넓이 :"+ result + "인 사각형을 그렷습니다");
		
	}
	
}

public class MainEntry {

	public static void main(String[] args) {
		Cicrle c = new Cicrle();
		c.calc();
		c.draw();
		Triangle t = new Triangle();
		t.calc();
		t.draw();
		Square s = new Square();
		s.calc();
		s.draw();
		//Shape sh = new Shape();// 자체적으로 객체를 생성할 수없다.
		Shape sh = new Triangle();// 상속 받은 자손 클라스로는 객체 생성 할 수 있다
	}

}
