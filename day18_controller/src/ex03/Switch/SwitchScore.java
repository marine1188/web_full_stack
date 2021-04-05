//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchScore {
	public static void main(String[] args) {
		System.out.print("input jumsu = ");
		Scanner sc = new Scanner(System.in);
		
		int total = ( sc.nextInt() + sc.nextInt() + sc.nextInt() );
		char grade;
		double avg = total / 3.0 ;
		
		switch( (int)avg  / 10 ) {  // switch( total  / 30 ) {
			case 10 :  
			case  9 :  grade = 'A';	break;
			case  8 :   grade = 'B';	break;
			case  7 :   grade = 'C';	break;
			case  6 :   grade = 'D';	break;
			default :  grade = 'F';	
		} // end switch
	
		System.out.println("\n\n" + total + " ===> " + grade + "학점");
		System.out.println( avg + " ===> " + grade + "학점");
	}
}
//*/


/*package ex01.Switch;

import java.util.Scanner;

public class SwitchScore {
	public static void main(String[] args) {
		int num;    char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100점 사이값만,....) ");
		num = sc.nextInt();
		
		switch( num ) {
			case 100 :
			case 90 :  grade = 'A' ; break;
			case 80 :  grade = 'B' ; break;
			case 70 :  grade = 'C' ; break;
			case 60 :  grade = 'D' ; break;
			default : grade = 'F';
		} // switch end
		
		System.out.println("\n\n\n당신의 " + num + " 학점은 " + grade + "입니다.");
	}
}
*/




/*
package ex01.Switch;

import java.util.Scanner;

public class SwitchScore {
	public static void main(String[] args) {
		int num;    char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100점 사이값만,....) ");
		num = sc.nextInt();
		
		switch( num / 10 ) {
			case 10 :
			case 9 :  grade = 'A' ; break;
			case 8 :  grade = 'B' ; break;
			case 7 :  grade = 'C' ; break;
			case 6 :  grade = 'D' ; break;
			default : grade = 'F';
		} // switch end
		
		System.out.println("\n\n\n당신의 " + num + " 학점은 " + grade + "입니다.");
	}
}
//*/


/*package ex01.Switch;

import java.util.Scanner;

public class SwitchScore {
	public static void main(String[] args) {
		int num;    char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.(0~100점 사이값만,....) ");
		num = sc.nextInt();
		
		switch( num ) {
			case 100 :
			case 90 :  grade = 'A' ; break;
			case 80 :  grade = 'B' ; break;
			case 70 :  grade = 'C' ; break;
			case 60 :  grade = 'D' ; break;
			default : grade = 'F';
		} // switch end
		
		System.out.println("\n\n\n당신의 " + num + " 학점은 " + grade + "입니다.");
	}
}
*/


