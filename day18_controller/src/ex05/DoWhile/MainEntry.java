package ex05.DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("dan = ");
		int dan = new Scanner(System.in).nextInt();
		int i = 1;  //���� �ʱ�ȭ
		
		while( i <= 9 ) {
			System.out.println(dan + "*" + i + "=" + (dan*i) );
			i++;  // ������
		}
		System.out.println("=================");
		i = 1;  // �����ʱ�ȭ
		do {
			System.out.println(dan + "*" + i + "=" + (dan*i) );
			i++;  // ������
		} while(i < 10);  //���������ȣ
		
	}
}





