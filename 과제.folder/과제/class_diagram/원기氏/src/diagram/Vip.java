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
		System.out.print(" Vip �Դϱ�? (y,n)? :");
		check = s.next();

		if(check.equalsIgnoreCase("y")){
			System.out.print("vip ȸ�� ��ȣ�� �Է��ϼ��� : ");
			vip = s.nextInt();
		}
		System.out.print("��ǰ �ڵ带 �Է��� �ּ���  : ");
		pCode = s.nextInt();
		System.out.print("�ֹ� ������ �Է��� �ּ���  : ");
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
