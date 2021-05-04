package diagram;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		int select;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("--- 수주 프로그램  ---");
			System.out.print("1.수주 등록,삭제 2.상품 등록,삭제 3.수주 목록 출력 4.상품 목록 출력 5.할인율 수정 6.창고 추가,삭제 7.창고 정보 출력 8.종료:");
			select = s.nextInt();
			SqlM sq = new SqlM();
			Jubsu js = new Jubsu();
			Product pd = new Product();
			switch (select) {
			case 1:
				System.out.print("1.수주 등록 2.수주 삭제 : ");
				select = s.nextInt();
				switch (select) {
				case 1:
					js.register();
					break;
				case 2:
					js = new Jubsu();
					js.delete();
					break;

				}
				break;

			case 2:
				System.out.print("1.상품 등록 2.상품 삭제 : ");
				select = s.nextInt();
				switch (select) {
				case 1:
					pd.addproduct();

					break;
				case 2:
					pd.delproduct();
					break;
				}

				break;
			case 3:

				ResultSet rs1 = sq.stmt.executeQuery("select * from sujutab ");
				while (rs1.next()) {
					System.out.println("수주 번호 : " + rs1.getInt(1) + ", 수주 날짜 : " + rs1.getString(2) + ", 고객 번호 : "
							+ rs1.getInt(3) + ", 고객 이름 : " + rs1.getString(4) + ", 고객 주소 :" + rs1.getString(5)
							+ ", 고객 전화번호 :" + rs1.getString(6) + ", Vip 번호(0은 없는번호) : " + rs1.getInt(7) + ", 상품 코드 : "
							+ rs1.getInt(8) + ", 주문 수량 :" + rs1.getInt(9));
				}
				System.out.println();
				break;
			case 4:
				ResultSet rs = sq.stmt.executeQuery("select * from producttab ");
				while (rs.next()) {
					System.out
							.println("상품 코드 : " + rs.getInt(1) + ", 상품명 :" + rs.getString(2) + ", 가격 :" + rs.getInt(3));
				}
				System.out.println();
				break;
			case 5:
				Statement st = new Statement();
				st.salepercent();
				break;
			case 6:
				Warehouse wh = new Warehouse();
				System.out.print("1.창고 추가 2.창고 삭제 : ");
				select = s.nextInt();
				switch (select) {
				case 1:
					wh.addWare();
					break;
				case 2:
					wh.delWare();
					break;
					
				}
				
				break;
			case 7:
				ResultSet rs2 = sq.stmt.executeQuery("select * from warehouse ");
				while (rs2.next()) {
					System.out.println("창고 번호 : "+ rs2.getInt(1)+", 창고 이름 : "+ rs2.getString(2)+", 창고 주소 : "+ rs2.getString(3)+", 창고 전화번호 : "+rs2.getString(4));
					
				}
				break;
			default:
				System.exit(0);
				break;
			}
		}

	}

}
