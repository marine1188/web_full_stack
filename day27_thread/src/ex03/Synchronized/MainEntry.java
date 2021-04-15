package ex03.Synchronized;
// atm 통장 클래스 만듬
class Atm {
	//입금되면 돈이 달라진다
	private int money;
	// 생성자에 돈을 입급 해야함 
	public Atm(int money) {
		this.money = money;
	}
	
	//입금함수
	public synchronized  void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " :  입금 금액 " + amount );
	}
	//출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			//인출 할 금액이 money 보다 커야한다 그러지 않으며 출금 못함
			if ( (money - amount ) > 0 ) {
				// 있을수 없는 사항 까지온다
				Thread.yield();//일부로 엉키게 하는 코드
				money -= amount;
				System.out.println(name + " :  출금 금액 " + amount );
			}else {
				System.out.println(name + " :  출금 못함(잔액 부족~~~)" );
			}
		}
	}
	// 통장 잔고 함수
	public void getMoney() {
		System.out.println("         잔액은 : " + money );
	}	
} // Atm end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;		
	}

	@Override
	public void run() {
		// 두바퀴를 돌린다.
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 한번은 입금 한번은 출금
			if( flag ) {
				//램덤한 숫자에 곱하기 10 ) +2를 한 이유 0을 피하기 위해서
				obj.deposit( (int)(Math.random() * 10 + 2 )*100,  getName() );
				obj.getMoney();
			} else {
				obj.withdraw( (int)(Math.random() * 10 + 2 )*100,  getName() );
				obj.getMoney();
			} // if end
			flag = true;
		} // for end
	}
} // UserAtm end





public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Atm at = new Atm(1000);
			/*
			 금융 거래에서는 동기화가 되어 있어야한다
			 */
			UserAtm user1 = new UserAtm(at,"빈센조");
			UserAtm user2 = new UserAtm(at,"빈센왕");
			UserAtm user3 = new UserAtm(at,"빈센박");
			
			user1.start();
			user2.start();
			user3.start();			
	}

}








