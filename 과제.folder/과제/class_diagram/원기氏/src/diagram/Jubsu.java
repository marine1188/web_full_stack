package diagram;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jubsu {
	Suju sj = new Suju();
	Scanner s = new Scanner(System.in);
	SqlM sqlm = new SqlM();
	public Jubsu() {
		// TODO Auto-generated constructor stub

	}

	public void register() {
		
		ResultSet rs;
		String day = sj.getSujuDay();

		try {
			 rs = sqlm.stmt.executeQuery("select * from producttab ");
			while (rs.next()) {
				System.out.println(" ��ǰ �ڵ� " + rs.getInt(1) + ", ��ǰ �̸� : " + rs.getString(2) + ", ��ǰ ����: "
						+ rs.getInt(3) + ", ��� : " + rs.getInt(5));
			}
		} catch (SQLException e) {
		}
		Vip v = new Vip();
		try {	
			rs = sqlm.stmt.executeQuery("select *from producttab where procode ="+ v.getpCode());
			rs.next();
			int number = rs.getInt(5);
			if(v.getpNum()<=number){		
			sqlm.stmt.executeUpdate("insert into sujutab(sujuDate,cNum,cName,cAddress,cPhone,cVip,productcode,pNum) values('" + day
					+ "' ,'" + v.getcNum() + "' , '" + v.getcName() + "' , '" + v.getcAddress() + "' , '"
					+ v.getcPhone() + "' , '" + v.getVip() + "' , '" + v.getpCode() + "' , '" + v.getpNum() + "')");
			int result = number-v.getpNum();
			sqlm.stmt.execute("update producttab set pNum ="+result+" where procode ="+v.getpCode());
			}else{
				System.out.println("��� �����մϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete() throws SQLException {
		int sujuNum;
		System.out.println("--���� ����--");
		System.out.print("������ ���� ��ȣ�� �Է��� �ּ��� : ");
		sujuNum = s.nextInt();
		sqlm.stmt.executeUpdate("delete from sujutab where sujuNum = "+ sujuNum);
	}

}
