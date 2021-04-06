package ex06.staticMember;
class Atm{
	int count;
	static int total; // static member
	
	public Atm(int amount) {// 생성자 함수
		count += amount;// count = count + amount;
		total += amount;//total = total +amount
	}
	
	//static member 에서 일반 멤버변수는 사용 할수없다
	public static void view() {
		total = total +100;
		//count = count + 100
	}
	
	//static member 에서는 this 키워드 사용할 수 없다
	public static void show(int count,int total) {
//		this.count = count;
//		this.total = total;
	}
	
	public void display() {
		System.out.println("count ="+count);
		System.out.println("total ="+total);
	}

}
public class MainEntry {
	public static void main(String[] args) {
		
		// 생성자 함수로 돌아간다 
		System.out.println(Atm.total);
		Atm at = new Atm(1000);// 천원 개설 
		at.display();
		System.out.println("===========");
		Atm at2 = new Atm(1000);// 
		at.display();
		System.out.println("===========");
		Atm at3 = new Atm(1000);// 
		at.display();
		System.out.println("===========");
	}
}
