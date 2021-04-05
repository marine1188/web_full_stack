package quiz.inhertance.two;

import java.util.Scanner;

public class Company {
	Scanner sc = new Scanner(System.in);

	protected String name;
	protected String department;
	protected String telephone;

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void input() {
		System.out.println("�̸��� �Է��ϼ��� ");
		name = sc.next();
		System.out.println("�μ��� �Է��ϼ��� ");
		department = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� ");
		telephone = sc.next();
	}

	public Company() { }
	
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("�μ� : " + department);
		System.out.println("����ó : " + telephone);

	}

}
