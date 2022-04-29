package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class Memberdao {
	
	private Connection con; // db연결
	private PreparedStatement ps; // db 조작
	private ResultSet rs;	 // db결과인터페이스
	
	public Memberdao() {
		// jdbc
			// 1. 프로젝트내 build path 에 mysqljdbc.jar 추가
			// 2. 프로젝트내 webapp -> web-inf-lib _> mysqljdbc.
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVAjsp?serverTimezone=UTC",
					"root","1234");
			System.out.println("DB연동성공");
		} catch (Exception e) {
			System.out.println("DB연동실패" + e);
		}
		// 1. 드라이브		
	}
	
	public boolean signup(Member member) {
		try {
			//1. sql 작성
			String sql = "insert into member(id, pw, name) values(?,?,?)";
								// insert into 테이블()values() //추가
			// 2. 연결된 DB에 SQL 연결
			ps = con.prepareStatement(sql);
			// 3. 각 ? 에 데이터 대입
			ps.setString(1, member.getId());
			ps.setString(2, member.getPw());
			ps.setString(3, member.getName());
			// 4. sql 실행
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}		
		return false;
	}
	
	
	public boolean loginpass(String id , String pw) {
		try {
			String sql = "select * from javajsp.member where id=? and pw=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}
		return false;
	}
}
