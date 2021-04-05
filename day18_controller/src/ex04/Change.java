package ex04;

public class Change {
	public static void main(String[] args) {
		int x = 3, y = 5, temp ;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + "\t y = " + y);
	}
}
