package ex05.Abstract;



public class Circle extends Shape {
	int w  =10;
	@Override
	public double calc(double x) {
		result = x*w*Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(result+"크기의 "+ name +"이 그려 졌습니다.");
		
	}

}
