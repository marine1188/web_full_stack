package ex01.jdbc;
import java.sql.*;
public class MainEntry {

	

	static {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url,uid,pwd; url =uid=pwd=null;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			uid = "sk_01"; pwd ="1111";
					
			conn = DriverManager.getConnection(url,uid,pwd);
			stmt = conn.createStatement();
			
			String sql ="create table busanIt(name varchar2(20),age number)";
			System.out.println(sql.toString());
			
			stmt.executeQuery(sql);
			
			sql = "SELECT * FROM BUSANIT";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println("name"+ rs.getString(1));
				System.out.println("age :"+ rs.getInt(2));
				
			}
			/// 지우겠다
			sql ="Drop table BUSANIT";
			int result =stmt.executeUpdate(sql);
			System.out.println("drop table"+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	

}
