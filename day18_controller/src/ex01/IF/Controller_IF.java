package ex01.IF;

import java.util.Scanner;

public class Controller_IF {
	public static void main(String[] args) {
		//중첩  if
		// 문제2] 정수 입력 받아서 짝.홀수 판정하고 그 수가 양수.음수인지 판정 프로그램
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if ( su % 2 == 0 ) {
			System.out.println("짝수");
			if( su > 0 ) {
				System.out.println("양수");
			} else if( su < 0 ) {
				System.out.println("음수");
			} else {
				System.out.println("0이군요");
			} // in if end
		}
		else {
			System.out.println("홀수");
			if( su > 0 ) {
				System.out.println("양수");
			} else if( su < 0 ) {
				System.out.println("음수");
			} else {
				System.out.println("0이군요");
			} // in if end
		} // if end
	}
}



