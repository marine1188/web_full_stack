package diagram;

import java.sql.SQLException;
import java.util.Scanner;

public class Warehouse {
	private String wareName, wareAddress,warePhone;
	private int wareNum;	
	Scanner s = new Scanner(System.in);
	SqlM sq = new SqlM();
		public void addWare() throws SQLException{
			
			System.out.println("--창고 추가--");
			System.out.print("창고 번호 입력 : ");
			wareNum = s.nextInt();
			System.out.print("창고 이름 입력 : ");
			wareName = s.next();
			System.out.print("창고 주소 입력 : ");
			wareAddress = s.next();
			System.out.print("창고 전화번호 입력 : ");
			warePhone = s.next();
			sq.stmt.executeUpdate("insert into warehouse values('" +  wareNum+ "' ,'" +wareName  + "' , '"+ wareAddress + "' , '" +warePhone + "')");
		}
		public void delWare() throws SQLException{
			System.out.println("--창고 삭제--");
			System.out.print("창고 번호 입력 : ");
			wareNum = s.nextInt();
			sq.stmt.executeUpdate("delete from warehouse where wNum = "+wareNum);
		}
}
