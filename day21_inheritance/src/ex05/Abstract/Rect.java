package ex05.Abstract;

public class Rect extends Shape {
	int h = 10;

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = x*h;
		return 0;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result+"크기의 "+ name +"이 그려 졌습니다.");
		
	}
	
}
