package ex01.constructor;

import ex02.inheritance.Point;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt = new Point(1,2);
		pt.disp();
		
		Point pt2 = new Point();
		pt2.disp();
		Point pt3 = new Point(8, 0);
		pt3.disp();
	}

}
