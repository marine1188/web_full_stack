package ex05.Abstract;



public class Triangel extends Shape {
	int w  =10;
	@Override
	public double calc(double x) {
		result = (x*w)/2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.80);
		System.out.println(result+"크기의 "+ name +"이 그려 졌습니다.");
		
	}

}
