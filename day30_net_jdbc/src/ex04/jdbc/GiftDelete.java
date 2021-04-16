package ex04.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String uid ="sk_01";
		String pwd ="1111";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("connection success");
		
		//3.DML - Insert
		
		Statement stmt = conn.createStatement();
		
		
		String sql = "delete from gift where gno ='3'";
		
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result + "데이터 추가 삭제됨");
		
		//4. 자원 반환 (닫기)
		stmt.close(); conn.close();
//		

	}

}
