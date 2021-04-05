package ex03.Switch;

import java.util.Scanner;

public class SwtichTest4 {
	public static void main(String[] args) {
		System.out.println("input month : ");
		int month = new Scanner(System.in).nextInt();
		boolean flag = false;
		String str = "";

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "월의 마지막 날은 31일 입니다.");
				break;
	
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월의 마지막 날은 30일 입니다.");
				break;
	
			case 2:
				System.out.println("year = ? ");
				int year = new Scanner(System.in).nextInt();
				 if(  (year % 4 == 0 ) && ( year % 100 != 0 ||   year % 400 == 0 ) ) {
					 		flag = true;
				 }
				 str = (flag == true) ? year + "년도 " + month + "월의 마지막 날은 29일 입니다" 
						 						        : year + "년도 " + month + "월의 마지막 날은 28일 입니다"; 
				 
				 System.out.println(str);
				break;
	
			default:
				System.out.println("잘못 입력하셨습니다. 1~12 사이의 숫자를 입력해주세요. ");
				break;
		} // switch end

	}
}
