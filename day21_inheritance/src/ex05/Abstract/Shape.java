package ex05.Abstract;

public abstract class Shape {
	
	double result = 0;
	public abstract double calc (double x); //추상 메소드 
	public abstract void show(String name);
	public void view() {
		System.out.println("super class shape");
	}

}
