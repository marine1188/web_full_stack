package ex01.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if ( su % 2 == 0 ) System.out.println("even");
		else System.out.println("odd");
		
		// ����1] ���� �Է� �޾Ƽ� 85���̻��̸� '��', 65���̻��̸� '��', 60�����ϴ� '��'
		String msg=null;
		
		if (su >= 85) msg = "��";
		else if (su >= 65) msg = "��";
		else msg = "��";
		
		System.out.println(su + " ===> " + msg);
	}
}
