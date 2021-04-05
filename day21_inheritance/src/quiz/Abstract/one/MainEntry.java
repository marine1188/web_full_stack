package quiz.Abstract.one;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		/* Transport []  t = new Transport[4];
		 t[0] = new Subway();
		 t[1] = new Bicycle();
		 t[2] = new Bus();
		 t[3] = new Airplane();
		 
		 String[] str = { "����ö", "������" , "����", "�����" };
		 
		 for (int i = 0; i < t.length; i++) {
			 t[i].start(str[i]);
			 t[i].stop(str[i]);
			 t[i].display(str[i]);
		}*/
		
		
		Scanner scan = new Scanner(System.in);

		int num;
		
		do {
			System.out.print("���ϴ� �������� ���ڸ� ������.(1.����ö / 2.���� / 3.������ / 4.�����) : ");
			num = scan.nextInt();
			switch (num) {
				case 1 : 
					Transport tr = new Subway(); 
					tr.start("����ö");
					tr.stop("����ö");		
					tr.display("����ö"); break;
				
				case 2 : 
					tr = new Bus();
					tr.start("����");
					tr.stop("����");		
					tr.display("����"); break;
				case 3 :
					tr = new Bicycle();
					tr.start("������");
					tr.stop("������");		
					tr.display("������");break;
				case 4 :
					tr = new Airplane();
					tr.start("�����");
					tr.stop("�����");		
					tr.display("�����");break;
				default : System.out.println("���ڸ� �ٽ� �Է��ϼ���!");	
			} //switch
		} while (num != 1 && num != 2 && num != 3 &&num != 4);
		
	} //main end
}
