package quiz.inhertance.two;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		String select = "";
		Scanner sc = new Scanner(System.in);
		Regular regular = new Regular();
		NoRegular noregular = new NoRegular();
		PartTimer parttimer = new PartTimer();

		System.out.println("������, ��������, ��ƮŸ�̸Ӹ� �����ϼ���  ");
		select = sc.next();

		if ("������".equals(select)) {
			System.out.println("======�������Դϴ�======");
			regular.input();
			regular.display();
		} else if ("��������".equals(select)) {
			System.out.println("======���������Դϴ�======");
			noregular.input();
			noregular.display();
		} else if ("��ƮŸ�̸�".equals(select)) {
			System.out.println("======��ƮŸ�̸��Դϴ�======");
			parttimer.input();
			parttimer.display();
		} else {
			System.out.println("������,��������,��ƮŸ�̸� ������!!!");
		}
	}

}
