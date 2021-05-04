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
		System.out.println("--할인율 수정--");
		System.out.print("수정할 상품 코드를 입력해 주세요 : ");
		procode = s.nextInt();
		System.out.print("할인율을 입력해 주세요 : ");
		sale= s.nextDouble();		
		
		sq.stmt.executeUpdate("Update producttab set sale ="+sale+"where procode = "+procode);
		
				
		
	}
}
