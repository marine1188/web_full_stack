package diagram;

import java.util.Scanner;

public class Customer {

	private int cNum;
	private String cName,cAddress,cPhone;
	Scanner s = new Scanner(System.in);
	public Customer() {
		
		// TODO Auto-generated constructor stub
		System.out.print("�� ��ȣ�� �Է��ϼ��� : " );
		cNum = s.nextInt();
		System.out.print("�� �̸��� �Է��ϼ��� : " );
		cName = s.next();
		System.out.print("�� �ּҸ� �Է��ϼ��� : " );
		cAddress = s.next();
		System.out.print("�� ��ȭ ��ȣ�� �Է��ϼ��� : " );
		cPhone = s.next();
		
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public Scanner getS() {
		return s;
	}
	public void setS(Scanner s) {
		this.s = s;
	}
	
}
