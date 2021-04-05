/*
  V_8 성적 처리 프로그램 
  04-05-21
 */
import java.util.Scanner;

public class Score {
	private int kor, eng, com, tot;// 맴버변수
	private double avg;
	private String name;
	private char ch, grade;
	Scanner sc = new Scanner(System.in);
	
	//getter / setter metod 
	//맴버변수에 대해서 읽기 전용과 쓰기 전용으로 변경가능 
	public int getKor() {		return kor;	 }
	public void setKor(int kor) {		this.kor = kor; 	}
	public int getEng() {		return eng; 	}
	public void setEng(int eng) {		this.eng = eng;	}
	public int getCom() {		return com;	}
	public void setCom(int com) {		this.com = com;	}
	public int getTot() {		return tot;  	}
	public void setTot(int tot) {		this.tot = tot;  	}
	public double getAvg() {		return avg; 	}
	public void setAvg(double avg) {		this.avg = avg;	}
	public String getName() {		return name;  	}
	public void setName(String name) {		this.name = name;	}
	public char getCh() {		return ch;	}
	public void setCh(char ch) {		this.ch = ch;	}
	public char getGrade() {		return grade;	}
	public void setGrade(char grade) {		this.grade = grade;	}
	
	public void input() {
		System.out.print("name = ");		name = sc.next();
		do {
			System.out.print("국어 점수를 입력해주세요 : ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);
		do {
			System.out.print("영어 점수를 입력해 주세요 : ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);
		do {
			System.out.print("전산 점수를 입력해 주세요 : ");
			com = sc.nextInt();
		} while (com < 0 || com > 100);
		
		process(kor, eng, com);  
	} // end input()
	
	public void process(int...su) {
		tot = su[0] + su[1] + su[2];
		avg = tot / 3.0;
		
		switch ((int) avg / 10) {
		case 10:
		case 9:	grade = 'A';	break;
		case 8:	grade = 'B';	break;
		case 7:	grade = 'C';	break;
		case 6:	grade = 'D';	break;
		default:	grade = 'F';
		}// end switch
	} // end process()
	
	public void output() {
		System.out.println("\n\n" + name + "님의 성적표 ****************");
		System.out.println("Kor : " + kor + "\tEng : " + eng + "\tCom : " + com);
		System.out.println(
				"Total : " + tot + "\tAvg : " + String.format("%.2f", avg) + "\t\tGrade : " + grade + "����(����)");
	} // end output()
}
