package ex03.mutilmeplements;

import ex02.Interface.IDraw;
import ex05.Abstract.Shape;

public class MultiClass extends Shape 
											implements Test, IDraw {
	
	int num = 129;

	@Override
	public void draw() {
		System.out.println("IDraw interface");
	}

	@Override
	public void tview() {
		System.out.println("Test interface");

	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape abstract class show method");
	}

}







