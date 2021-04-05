package quiz.inhertance.thrid;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Regular re;
		Sales sa ;
			
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.print("1. ������������, 2. ����������  3.�Ƹ�����Ʈ  �� ������¸� �Է����ּ��� ex) �ǸŻ��  : ");
	
		choice = (sc.nextInt());
		
		switch ( choice ) {
			case 1 :
				re = new Regular();
				re.input();
				re.disp();
				break;
			case 2 :
				sa = new Sales();
				sa.disp();
				break;
			case 3 :
				PartTime pt = new PartTime();
				pt.show();
				break;
		} // switch case end
	} // main m end
} // MainEntry class end
