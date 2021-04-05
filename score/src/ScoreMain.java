

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		System.out.println("1.일반객체 생성, 2. 객체배열 생성");
		int no = new Scanner(System.in).nextInt();
		switch (no) {
		case 1: Score score = new Score();
					score.input();		score.output();
					break;		
		case 2:  
			      System.out.println("원하는 학생 수  ");
			      int inwon = new Scanner(System.in).nextInt();
			       Score[] s = new Score[inwon];
					for (int i = 0; i < s.length; i++) {
						s[i].input();	
					}
					for (int i = 0; i < s.length; i++) {
						s[i].output();
					}
					break;

		default: System.out.println("없는 번호 입니다");
			break;
		}
		
		
		
	}
	
	
}
