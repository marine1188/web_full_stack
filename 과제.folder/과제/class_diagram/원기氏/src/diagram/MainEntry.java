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
			System.out.println("--- ���� ���α׷�  ---");
			System.out.print("1.���� ���,���� 2.��ǰ ���,���� 3.���� ��� ��� 4.��ǰ ��� ��� 5.������ ���� 6.â�� �߰�,���� 7.â�� ���� ��� 8.����:");
			select = s.nextInt();
			SqlM sq = new SqlM();
			Jubsu js = new Jubsu();
			Product pd = new Product();
			switch (select) {
			case 1:
				System.out.print("1.���� ��� 2.���� ���� : ");
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
				System.out.print("1.��ǰ ��� 2.��ǰ ���� : ");
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
					System.out.println("���� ��ȣ : " + rs1.getInt(1) + ", ���� ��¥ : " + rs1.getString(2) + ", �� ��ȣ : "
							+ rs1.getInt(3) + ", �� �̸� : " + rs1.getString(4) + ", �� �ּ� :" + rs1.getString(5)
							+ ", �� ��ȭ��ȣ :" + rs1.getString(6) + ", Vip ��ȣ(0�� ���¹�ȣ) : " + rs1.getInt(7) + ", ��ǰ �ڵ� : "
							+ rs1.getInt(8) + ", �ֹ� ���� :" + rs1.getInt(9));
				}
				System.out.println();
				break;
			case 4:
				ResultSet rs = sq.stmt.executeQuery("select * from producttab ");
				while (rs.next()) {
					System.out
							.println("��ǰ �ڵ� : " + rs.getInt(1) + ", ��ǰ�� :" + rs.getString(2) + ", ���� :" + rs.getInt(3));
				}
				System.out.println();
				break;
			case 5:
				Statement st = new Statement();
				st.salepercent();
				break;
			case 6:
				Warehouse wh = new Warehouse();
				System.out.print("1.â�� �߰� 2.â�� ���� : ");
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
					System.out.println("â�� ��ȣ : "+ rs2.getInt(1)+", â�� �̸� : "+ rs2.getString(2)+", â�� �ּ� : "+ rs2.getString(3)+", â�� ��ȭ��ȣ : "+rs2.getString(4));
					
				}
				break;
			default:
				System.exit(0);
				break;
			}
		}

	}

}
