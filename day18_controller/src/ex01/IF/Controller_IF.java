package ex01.IF;

import java.util.Scanner;

public class Controller_IF {
	public static void main(String[] args) {
		//��ø  if
		// ����2] ���� �Է� �޾Ƽ� ¦.Ȧ�� �����ϰ� �� ���� ���.�������� ���� ���α׷�
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if ( su % 2 == 0 ) {
			System.out.println("¦��");
			if( su > 0 ) {
				System.out.println("���");
			} else if( su < 0 ) {
				System.out.println("����");
			} else {
				System.out.println("0�̱���");
			} // in if end
		}
		else {
			System.out.println("Ȧ��");
			if( su > 0 ) {
				System.out.println("���");
			} else if( su < 0 ) {
				System.out.println("����");
			} else {
				System.out.println("0�̱���");
			} // in if end
		} // if end
	}
}



