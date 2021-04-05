package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case 1:  System.out.println("point 1");	break;
			case 2:  System.out.println("point 2");	break;
			case 3:  System.out.println("point 3");	break;
			default : System.out.println("1~ 3사이 값만 입력해줘~");
		} // switch end
	}
}
