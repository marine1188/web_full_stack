package quiz.inhertance.two;

public class NoRegular extends Company {

	protected double pay;

	public void input() {
		super.input();
		System.out.println("�޿��� �Է��ϼ���(������ �޿��� 70%)  ");
		pay = sc.nextInt();
		pay = pay * 0.7;
	}

	public void display() {
		super.display();
		System.out.println("�޿� : " + pay);
		System.out.println("���� = ��������");
	}

}
