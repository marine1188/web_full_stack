package diagram;

import java.sql.SQLException;
import java.util.Scanner;

public class Product {
	private int proCode, price, wNum, pNum;
	private String proName;
	private double sale;
	Scanner s = new Scanner(System.in);
	SqlM sq = new SqlM();
	public void addproduct() throws SQLException {
		System.out.println();
		System.out.println("--��ǰ �߰�--");
		System.out.print("��ǰ �ڵ带 �Է��� �ּ��� : ");
		proCode = s.nextInt();
		System.out.print("��ǰ �̸��� �Է��� �ּ��� : ");
		proName = s.next();
		System.out.print("��ǰ ������ �Է��� �ּ��� : ");
		price = s.nextInt();
		System.out.print("â�� ��ȣ�� �Է��� �ּ��� : ");
		wNum = s.nextInt();
		System.out.print("��ǰ ��� �Է��� �ּ��� : ");
		pNum = s.nextInt();
		System.out.print("�������� �Է��� �ּ��� : ");
		sale = s.nextDouble();
		sq.stmt.executeUpdate("insert into producttab values('" +  proCode+ "' ,'" +proName  + "' , '"+ price + "' , '" +wNum +"' , '"+pNum+"' , '"+sale+ "')");
		System.out.println();
		
	}
	
	public void delproduct() throws SQLException{
		System.out.println("--��ǰ ����--");
		System.out.print("��ǰ �ڵ带 �Է��� �ּ��� : ");
		proCode = s.nextInt();
		sq.stmt.executeUpdate("delete from producttab where procode = "+ proCode);
		System.out.println();
	}
}
