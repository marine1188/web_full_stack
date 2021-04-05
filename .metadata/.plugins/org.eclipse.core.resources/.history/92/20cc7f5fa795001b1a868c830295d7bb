package score;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int kor, eng, com, tot = 0;
		double avg = 0;
		String name = "";
		char ch = ' ', grade = ' ';
		Scanner sc = new Scanner(System.in);

		while (true) { // 무한루프
			System.out.print("name = ");
			name = sc.next();

			do {
				System.out.print("kor 점수 입력 요망 : ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);
			do {
				System.out.print("eng 점수 입력 요망 : ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);
			do {
				System.out.print("com 점수 입력 요망 : ");
				com = sc.nextInt();
			} while (com < 0 || com > 100);

			tot = kor + eng + com;
			avg = tot / 3.0;
			// 평점(학점) 구하기 - if 문 이용
//			String grade = null;
//			if(avg >= 90) grade = "A";
//			else if(avg >= 80 && avg < 90) grade = "B";
//			else if(avg >= 70) grade = "C";
//			else if(avg >= 60) grade = "D";
//			else grade = "F";

			// 평점(학점) 구하기 - switch~case 문 이용
			switch ((int) avg / 10) { // switch( total / 30 ) {
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade = 'F';
			} // end switch

			System.out.println("\n\n" + name + "님의 성적표 ****************");
			System.out.println("Kor : " + kor + "\tEng : " + eng + "\tCom : " + com);
			System.out.println(
					"Total : " + tot + "\tAvg : " + String.format("%.2f", avg) + "\t\tGrade : " + grade + "학점(평점)");

			// 무한루프 탈출 구문
			System.out.println("\n계속 하시겠습니까(y/n)? ");
			ch = sc.next().charAt(0); // name = sc.next();
			if (ch == 'n' || ch == 'N') break;
//			if( name.equalsIgnoreCase("n") )   break;
//			if( name.toUpperCase().equals("N") )   break;

		} // end while

	}
}





