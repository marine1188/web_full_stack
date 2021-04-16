package ex04.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//자바와 오라클 연동 하기 
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String uid = "sk_01";
		String pwd ="1111";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		//사용 하기 (DML -Select)
		//
		String q ="";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		System.out.println("상품번호\t 상품명\t 최저가\t 최고가");
		
		
		while(rs.next()) {
			int gno =rs.getInt(1); // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno +"\t"+gname+"\t"+g_s+"\t"+g_e);
		}
		
		//자원반한 
		rs.close(); stmt.close(); conn.close();
	}

}
