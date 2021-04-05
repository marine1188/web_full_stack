package ex02.inheritance;

public class Resct extends Point {
	private int x2;
	private int y2;
	// 생성자 함수 = 2개이상 
	private Resct(int z) {
		this.y2 = 1000;
	}
	
	Resct() {
		this.x2 =30;
	}


	//getter //setter method 
	

	
	public  void disp() {
		System.out.println(x2+","+y2);
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	//output method 
	
}
