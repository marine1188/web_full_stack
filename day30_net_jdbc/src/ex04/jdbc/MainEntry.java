package ex04.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


//gift table CRUD

public class MainEntry {

	public static void main(String[] args)throws Exception {
		
		Connection conn = db_conn() ;
	
	Scanner scan = new Scanner(System.in);
		
		int choise = 0;
	
		while(true){
		
			System.out.println("(1)gift 테이블 보기 (2)gift 테이블 데이터 추가 (3)gift 테이블 업데이트 "
					+ "(4)gift 테이블 삭제 (5)끝");
				choise = scan.nextInt();
			switch(choise){
			case 1:
				select(conn);
				
				break;
			case 2:
				insert(conn);
				break;
			case 3:
				select(conn);
				update(conn);
				break;
			case 4:
				select(conn);
				delete(conn);
				break;
			default:
				if(choise==5) {
					System.out.println("종료");
					conn.close();
					System.exit(0);
				}
			}
		}//while end
	}
	
	
	//데이터 베이스 연결 함수
	public static Connection db_conn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String uid = "sk_01";
		String pwd ="1111";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		return conn;
		
	}


	
	public static void select(Connection conn) throws SQLException {
		
		
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
		rs.close(); stmt.close();
	}
	
	// 데이터 추가하기
	public static void insert(Connection conn) throws SQLException {
			Statement stmt = conn.createStatement();
			
			String sql = "insert into gift values(14,'스팸3',2000,5000)";
			//String sql = "insert into gift values("+args[0]+",'"+args[1]+"',"+args[3]+")";
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "데이터 추가 성공함");
			
			//4. 자원 반환 (닫기)
			stmt.close(); 
	}
	//업데이트
	public static void update(Connection conn) throws SQLException {
		
		PreparedStatement pstmt = null;//////////////////////delete from gift where gno = ?; set XXX(순서,데이터);
		
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
	}
	// 테이블 삭제 // null 값도 삭제 가능하게 코드작성
	public static void delete(Connection conn) throws SQLException{
		PreparedStatement pstmt = null;//////////////////////delete from gift where gno = ?; set XXX(순서,데이터);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 목록에서 삭제 할 번호 또는 값이 null이면 null 입력 해주세요 ?");
		String null_love = sc.nextLine();
		//null
	
		if (null_love.equals("null")) {
			System.out.println("null" + null_love);
			pstmt = conn.prepareStatement("delete from gift where gno IS NULL") ;
		}else if(!null_love.equals("null")) { // not null
			System.out.println("not null" + null_love);
			pstmt = conn.prepareStatement("delete from gift where gno =?") ;
			pstmt.setString(1, null_love);
		}
		
		
		pstmt.executeUpdate();
		
		System.out.println(null_love + "데이터  삭제됨");
		
	
	}



	

}
