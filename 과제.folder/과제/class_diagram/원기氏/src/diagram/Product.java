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
		System.out.println("--상품 추가--");
		System.out.print("상품 코드를 입력해 주세요 : ");
		proCode = s.nextInt();
		System.out.print("상품 이름을 입력해 주세요 : ");
		proName = s.next();
		System.out.print("상품 가격을 입력해 주세요 : ");
		price = s.nextInt();
		System.out.print("창고 번호를 입력해 주세요 : ");
		wNum = s.nextInt();
		System.out.print("상품 재고를 입력해 주세요 : ");
		pNum = s.nextInt();
		System.out.print("할인율을 입력해 주세요 : ");
		sale = s.nextDouble();
		sq.stmt.executeUpdate("insert into producttab values('" +  proCode+ "' ,'" +proName  + "' , '"+ price + "' , '" +wNum +"' , '"+pNum+"' , '"+sale+ "')");
		System.out.println();
		
	}
	
	public void delproduct() throws SQLException{
		System.out.println("--상품 삭제--");
		System.out.print("상품 코드를 입력해 주세요 : ");
		proCode = s.nextInt();
		sq.stmt.executeUpdate("delete from producttab where procode = "+ proCode);
		System.out.println();
	}
}
