package diagram;

import java.sql.SQLException;
import java.util.Scanner;

public class Warehouse {
	private String wareName, wareAddress,warePhone;
	private int wareNum;	
	Scanner s = new Scanner(System.in);
	SqlM sq = new SqlM();
		public void addWare() throws SQLException{
			
			System.out.println("--â�� �߰�--");
			System.out.print("â�� ��ȣ �Է� : ");
			wareNum = s.nextInt();
			System.out.print("â�� �̸� �Է� : ");
			wareName = s.next();
			System.out.print("â�� �ּ� �Է� : ");
			wareAddress = s.next();
			System.out.print("â�� ��ȭ��ȣ �Է� : ");
			warePhone = s.next();
			sq.stmt.executeUpdate("insert into warehouse values('" +  wareNum+ "' ,'" +wareName  + "' , '"+ wareAddress + "' , '" +warePhone + "')");
		}
		public void delWare() throws SQLException{
			System.out.println("--â�� ����--");
			System.out.print("â�� ��ȣ �Է� : ");
			wareNum = s.nextInt();
			sq.stmt.executeUpdate("delete from warehouse where wNum = "+wareNum);
		}
}
