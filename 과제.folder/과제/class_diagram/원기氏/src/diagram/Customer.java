package diagram;

import java.util.Scanner;

public class Customer {

	private int cNum;
	private String cName,cAddress,cPhone;
	Scanner s = new Scanner(System.in);
	public Customer() {
		
		// TODO Auto-generated constructor stub
		System.out.print("고객 번호를 입력하세요 : " );
		cNum = s.nextInt();
		System.out.print("고객 이름을 입력하세요 : " );
		cName = s.next();
		System.out.print("고객 주소를 입력하세요 : " );
		cAddress = s.next();
		System.out.print("고객 전화 번호를 입력하세요 : " );
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
