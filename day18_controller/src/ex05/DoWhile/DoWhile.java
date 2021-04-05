package ex05.DoWhile;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int su, kor, eng;
		char grade = ' ';
		do {
			System.out.print("당신의 점수 입력 요망 : ");
			su = new Scanner(System.in).nextInt();
		} while( su < 0 || su > 100 );
//		do {
//			System.out.print("당신의 점수(su, kor, eng) 입력 요망 : ");
//			su = new Scanner(System.in).nextInt();
//			kor = new Scanner(System.in).nextInt();
//			eng = new Scanner(System.in).nextInt();
//		} while( (su < 0 || su > 101) ||  (kor < 0 || kor > 101)|| (eng < 0 || eng > 101) );
	
		
		
		switch (su / 10) {
			case 10:
			case 9 : grade = 'A'; 	break;
			case 8 : grade = 'B'; 	break;
			case 7 : grade = 'C'; 	break;
			case 6 : grade = 'D'; 	break;
			default: grade = 'F'; 	break;
		} // switch end
		
		System.out.println("\n당신의 점수 " + su + " ==> " + grade + "학점");
	}
}




