package ex03.Abstaract;

public abstract class Point {
	protected int x,y;// 맴버 변수

	public int getX() {//맴버 함수
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void disp();
	
//	public void disp() {
//		System.out.println(x+","+ y);
//	}

}
