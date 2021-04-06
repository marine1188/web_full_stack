package ex08.apiObject;
class Rectangle{
	int x,y;
	public void disp() {//멤버 출력 함수 따로 할수있음
		System.out.println(x+","+y);
	}
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
	

	
}
public class ToStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);
		}

}
