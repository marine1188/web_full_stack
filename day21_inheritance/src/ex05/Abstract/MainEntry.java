package ex05.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		//3.배열 이용한 형태
		System.out.println("3.배열 이용한 형태");
		Shape [] ss = new Shape[3];// 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Circle();
		ss[2] = new Circle();
		String[]name = {"Cicle","Rect","Triangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
	
		System.out.println("============================");
		System.out.println("2. Shape 부모 추상 클래스를 이용해서 객체 생성");
		//2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원원");
		sh = new Triangel();
		sh.show("삼각형");
		sh = new Rect();
		sh.show("사각형");
		
		 System.out.println("==========================");
		 System.out.println("1. 각자의 클래스로 객체 생성 형태");
		//1. 각자의 클래스로 객체 생성 형태
		Rect r = new Rect();
		r.show("사각형");
		Triangel t = new Triangel();
		t.show("삼각형아");
		Circle c = new Circle();
		c.show("원아");
		
		Shape s = new Circle(); // new Shape(); 다형성 구현..
		s.show("원");
	}
}
