package ex03.Abstaract;

public class MainEntry {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		//Point pt = new Point(); // 자체적으로 객체를 생성 불가능 
		// 자손 클래스래스로는 객체생성가능
		
		Point pt = new Circle();
		pt.disp();
		Point p = new Rectangle();
		p.disp();
		
		Circle c = new Circle();
		c.disp();
	}

}
