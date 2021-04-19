package Singelton_CRUD;
import java.sql.*;
	
//	if( rs != null ) { try { rs.close(); } catch(Exception e) { e.printStackTrace(); } }
//	if( stmt != null ) { try { stmt.close(); } catch(Exception e) { e.printStackTrace(); } }
//	if( conn != null ) { try { conn.close(); } catch(Exception e) { e.printStackTrace(); } }
						
public class ConnectionCloseHelper {
	//닫기를 하나의 함수에 넣을때 
	public static void close_all(ResultSet rs, Statement stmt, Connection conn) {
		if( rs != null ) { try { rs.close(); } catch(Exception e) { e.printStackTrace(); } }
		if( stmt != null ) { try { stmt.close(); } catch(Exception e) { e.printStackTrace(); } }
		if( conn != null ) { try { conn.close(); } catch(Exception e) { e.printStackTrace(); } }
							
	}
	
	//따로 함수 생성 
	
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
