//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
//		double point = new Scanner(System.in).nextDouble();
	
		switch (point) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 1:  System.out.print("집 ");	  //break;
			case 2:  System.out.print("피아노 ");	//break;
			case 3:  System.out.print("우산 ");	//break;
		} // switch end
		
		System.out.println("상품에 당첨 되셨습니다. 축하합니다. ^^ ");
	}
}
//*/






