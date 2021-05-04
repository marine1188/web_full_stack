package diagram;

public class Vip extends Customer{
	private int vip,pNum,pCode ;

	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public Vip() {
		// TODO Auto-generated constructor stub
		super();
		System.out.print(" Vip 입니까? (y,n)? :");
		check = s.next();

		if(check.equalsIgnoreCase("y")){
			System.out.print("vip 회원 번호를 입력하세요 : ");
			vip = s.nextInt();
		}
		System.out.print("상품 코드를 입력해 주세요  : ");
		pCode = s.nextInt();
		System.out.print("주문 개수를 입력해 주세요  : ");
		pNum = s.nextInt();
		
		
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public String check;
	
}
