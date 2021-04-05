package quiz.Abstract.two;

import java.util.*;
public class MainEntry {
	public static void main(String[] args){
		
		//
		/*
		Trans[] tr = new Trans[4];
		tr[0] = new Subway();
		tr[1] = new Bus();
		tr[2] = new Bicycle();
		tr[3] = new Airplane();
		*/
		Trans[] tr = {new Subway(), new Bus(), new Bicycle(), new Airplane()};
		
		//
		Scanner sc = new Scanner(System.in);
		int inNum = 1;
		
		//
		while(true) {
			System.out.println("*-*-*-*-* ������� *-*-*-*-*");
			System.out.println("1. ����\n2. ����\n3. ������\n4. �����\n5. ����");
			System.out.print(">> ");
			inNum = sc.nextInt();
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
			
			// ���� ����
			if(inNum==5){
				System.out.println("* �����մϴ�.");
				break;
			}// if
			
			// 1~4 �޴� ����
			System.out.println("* " + tr[inNum-1].name);
			System.out.print("Start : ");
			tr[inNum-1].start();
			System.out.print("Stop  : ");
			tr[inNum-1].stop();
			System.out.println();
			System.out.println();
		}// while
		
	}// main
}// class
