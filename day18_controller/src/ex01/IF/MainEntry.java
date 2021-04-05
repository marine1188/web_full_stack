package ex01.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if ( su % 2 == 0 ) System.out.println("even");
		else System.out.println("odd");
		
		// 문제1] 점수 입력 받아서 85점이상이면 '상', 65점이상이면 '중', 60점이하는 '하'
		String msg=null;
		
		if (su >= 85) msg = "상";
		else if (su >= 65) msg = "중";
		else msg = "하";
		
		System.out.println(su + " ===> " + msg);
	}
}
