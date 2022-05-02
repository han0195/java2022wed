package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.memberdto;

public class memberdao {
	// 필드 
		private Connection con; // 1. DB 연결 클래스
		private PreparedStatement ps; // 2. 연결된 DB내 SQL 조작 인터페이스
		private ResultSet rs; // 3. SQL 결과 레코드를 가져오는 인터페이스
		
		public static memberdao memberdao = new memberdao(); // db연동 객체
		
		//생성자
		public memberdao() { // 생성자에서 연동하는 이유 : 객체 생성시 바로 db연동하기 위해 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이브 클래스 호출
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsweb?serverTimezone=UTC",
						"root","1234");
			}catch( Exception e ) {
				System.out.println("[DB 연동 실패]" + e);
			}
		}
		
		public boolean idcheck(String mid) {
			try {
				String sql = "select mid from member where mid = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, mid);
				rs = ps.executeQuery();
				if(rs.next()) {
					return true;
				}
			} catch (Exception e) {
				System.out.println("[sql 에러]" + e);
			}
			return false;
		}
		
		public boolean singup(memberdto member) {
			String sql = "insert into member(mid, mpw, mname, mphone, memali, maddress)values(?,?,?,?,?,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, member.getMid());
				ps.setString(2, member.getMpw());
				ps.setString(3, member.getMname());
				ps.setString(4, member.getMphone());
				ps.setString(5, member.getMemali());
				ps.setString(6, member.getMaddress());
				ps.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("[sql 에러]" + e);
			}
			return false;
		}
}
