package diagram;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Statement {
	private double sale;
	private int procode;
	SqlM sq = new SqlM();
	Scanner s = new Scanner(System.in);
	public void salepercent() throws SQLException{
		System.out.println("--������ ����--");
		System.out.print("������ ��ǰ �ڵ带 �Է��� �ּ��� : ");
		procode = s.nextInt();
		System.out.print("�������� �Է��� �ּ��� : ");
		sale= s.nextDouble();		
		
		sq.stmt.executeUpdate("Update producttab set sale ="+sale+"where procode = "+procode);
		
				
		
	}
}
