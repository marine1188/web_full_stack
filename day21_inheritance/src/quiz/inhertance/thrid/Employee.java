package quiz.inhertance.thrid;

import java.util.Scanner;

public class Employee {
	protected int empNO;
	protected String name, dept, phone;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
	/*	int num ;
		String name, dept, phone;
		System.out.print("empNO = ");			num = sc.nextInt();
		System.out.print("name = ");				name = sc.next();
		System.out.print("dept = ");				dept = sc.next();
		System.out.print("phone = ");				phone = sc.next();		
		this.empNO = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;*/
	}
	public void input(){   // �Է� �޼ҵ� 
		int num ;
		String name, dept, phone;
		System.out.print("empNO = ");		  this.empNO= sc.nextInt();	 //num = sc.nextInt();
		System.out.print("name = ");				name = sc.next();
		System.out.print("dept = ");				dept = sc.next();
		System.out.print("phone = ");				phone = sc.next();		
		//this.empNO = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}
	
	public Employee(int empNO, String name, String dept, String phone) {
		super();
		this.empNO = empNO;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}

	public Employee(int empNO) {
		this(empNO, null, null, null);
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	/*@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", name=" + name + ", dept=" + dept + ", phone=" + phone + ", sc=" + sc
				+ "]";
	}*/
	
	public void disp() {
		System.out.println("��� ��ȣ :" + empNO + "\n �̸� : " + name);
		System.out.println("�μ� :" + dept + "\n ����ó : " + phone);
	}
	
}
