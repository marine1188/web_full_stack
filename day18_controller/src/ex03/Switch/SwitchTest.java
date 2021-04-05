//*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s, d, b, j) = ");
		String city = new Scanner(System.in).next();
		char ch = city.charAt(0);   // 문자열 함수 중에서 문자열에서 chatAt(index) 인덱스번호에 해당하는 문자를 가져온다.
		
//		if( city.equals("s") ) { //if( ch == 's' ) {  //if( city == "s") {
//			System.out.println("O");
//		} else {
//			System.out.println("X");
//		}
		
		switch (ch) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 's':  System.out.print("서울");	break;
			case 'd':  System.out.print("대구");	break;
			case 'b':  System.out.print("부산");	break;
			case 'j':  System.out.print("제주");	break;
			default : 
						System.out.println("잘못 선택했습니다. s, d, b, j 중에서만 선택하세요.....");
						System.exit(0);
		} // switch end
		
		System.out.println("를(을) 선택하셨습니다. ");
	}
}
//*/

/*
package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s, d, b, j) = ");
		String city = new Scanner(System.in).next();
		
		switch (city) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case "s":  System.out.print("서울");	break;
			case "d":  System.out.print("대구");	break;
			case "b":  System.out.print("부산");	break;
			case "j":  System.out.print("제주");	break;
			default : 
						System.out.println("잘못 선택했습니다. s, d, b, j 중에서만 선택하세요.....");
						System.exit(0);
		} // switch end
		
		System.out.println("를(을) 선택하셨습니다. ");
	}
}
//*/






