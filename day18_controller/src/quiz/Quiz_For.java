package quiz;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Quiz_For {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1 ; i < 101 ; i++) {
			sum += i;   //sum = sum + i;
		}
		System.out.println("1~100 까지 합은 : " + sum);
		
		// 1~ 100 까지 중에서 3의 배수의 합과 개수를 구하세요.
		int hap = 0, count = 0;
		for (int i = 1 ; i < 101 ; i++) {
			if( i % 3 == 0 ) {
				hap += i;
				count++;  // count = count + 1;   count += 1; 
			}
		}
		System.out.println("1~100 까지 3의 배수의 합은 : " + hap + ",  개수 : " + count );
		
		
		//원하는 단 입력 받아서 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("dan = ");
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		System.out.println("=================================");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			} // j end
			System.out.println();
		} // i end
	}
	
}








