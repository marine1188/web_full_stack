package quiz.inhertance.two;

public class PartTimer extends Company {

	protected int time;
	protected int pay = 100000;

	public void input() {
		super.input();
		System.out.println("���ѳ�¥�� �Է��ϼ���(�ϴ� 10����) ");
		time = sc.nextInt();
		pay = time * pay;
	}

	public void display() {
		super.display();
		System.out.println("�޿� : " + pay);
		System.out.println("���� = ��ƮŸ�̸�");
	}

}
