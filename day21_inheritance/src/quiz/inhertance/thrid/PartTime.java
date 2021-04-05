package quiz.inhertance.thrid;

import java.util.Scanner;

public class PartTime extends Employee {
	protected int hourly = 5000;
	protected int hour;
	protected int day;
	
	Scanner sc = new Scanner(System.in);
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void show() {
		System.out.print("�����̸��� �Է��ϼ��� : ");		setName(sc.next());
		System.out.print("�μ��� �Է��ϼ��� : ");		    setDept(sc.next());
		System.out.print("����ó�� �Է��ϼ��� : ");		setPhone(sc.next());
		System.out.print("�����ȣ�� �Է��ϼ��� : ");		setEmpNO(sc.nextInt());
		System.out.println("���� ���߳���?? : ");		    setDay(sc.nextInt());
		System.out.println("�Ϸ翡 ��ð� ����?? : ");	setHour(sc.nextInt());
		super.disp();
		System.out.println("�˹ٿ��� : " + (day * hour * hourly));
	} // show m end

} // PartTime class end
