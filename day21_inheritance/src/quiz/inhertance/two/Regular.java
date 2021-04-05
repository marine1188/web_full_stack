package quiz.inhertance.two;

public class Regular extends Company {

	protected int num;
	protected double pay;
	protected int bonus;
	protected String position;

	public void input() {
		super.input();

		System.out.println("����� �Է��ϼ��� ");
		num = sc.nextInt();

		System.out.println("������ �Է��ϼ��� ");
		position = sc.next();

		System.out.println("�޿��� �Է��ϼ��� ");
		pay = sc.nextInt();

		System.out.println("���ʽ��� �Է��ϼ���(1~200(%)) ");
		bonus = sc.nextInt();

		pay = (pay * (bonus / 100)) * pay;
	}

	public void display() {
		super.display();

		System.out.println("��� : " + num);
		System.out.println("���� : " + position);
		System.out.printf("�޿�(���ʽ�����) : " + "%.1f", pay);

	}

}
