package dbConn.util;
import java.sql.*;

/*
	DB 연결 정보 반복적으로 코딩 해결
	다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
									"sk_01", "1111");
									
	이런식으로 사용
	ConnectionHelper.getConnection("mysql") or ("oracle")
	dsn ==> data source name
*/

public class ConnectionHelper {
	//함수(접근자 : public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
			 	conn = DriverManager.getConnection(
			 									"jdbc:mysql://localhost:3306/SampleDB",     // SampleDB 예시임
			 									"kingsmile", "mysql");
			 	
			} else if( dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
			 	conn = DriverManager.getConnection(
			 									"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
			 									"kingsmile", "oracle");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
			 	conn = DriverManager.getConnection(
			 									"jdbc:mysql://localhost:3306/SampleDB",     // SampleDB 예시임
			 									userid, pwd);
			 	
			} else if( dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
			 	conn = DriverManager.getConnection(
			 									"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
			 									userid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
