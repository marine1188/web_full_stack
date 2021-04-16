package ex04.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String uid ="sk_01";
		String pwd ="1111";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("connection success");
		

		//select 
			
		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = null;//////////////////////delete from gift where gno = ?; set XXX(순서,데이터);
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		System.out.println("상품번호\t 상품명\t 최저가\t 최고가");
		
		
		while(rs.next()) {
			int gno =rs.getInt(1); // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno +"\t"+gname+"\t"+g_s+"\t"+g_e);
		}
		
		//3.DML - update//////////레코드 업데이트
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 목록에서 update 할 번호 ?");
		int num = sc.nextInt();
		System.out.println("변경할 상품명 ? ");
		String name = sc.next();
		pstmt = conn.prepareStatement("update gift set gname=? where gno = ?");
		pstmt.setString(1,name); //pstmt.setString(1,"초코렛");
		pstmt.setInt(2, num);
		pstmt.executeUpdate();
		System.out.println(name +"수정 완료");
		
		//////////////////////////////////////////////
		rs = stmt.executeQuery("SELECT * FROM GIFT");
		System.out.println("상품번호\t 상품명\t 최저가\t 최고가");
		
		
		while(rs.next()) {
			int gno =rs.getInt(1); // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno +"\t"+gname+"\t"+g_s+"\t"+g_e);
		}
		
//		//g_end 가격 변동하기
//	
//		System.out.println("최저가격 최고가격을 바꾸시겠습니가 ? 얼마");
//		int g_ss = sc.nextInt();
//		int g_ee = sc.nextInt();
//		pstmt = conn.prepareStatement("update gift set g_start = ?,g_end = ?,gname = ? where gno = ?");
//		pstmt.setInt(1, g_ss);
//		pstmt.setInt(2, g_ee);
//		pstmt.setString(3,"sk_01");
//		pstmt.setInt(4,7);
//		pstmt.executeUpdate();
//		System.out.println(7 +"번 수정 완료");
		
		//////////////////////////
		rs = stmt.executeQuery("SELECT * FROM GIFT");
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


