package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import dto.Member;

public class MemberDao { // DB 접근객체

	private Connection con; // DB연동시 사용되는 클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물
	
	// * DB 연동할때마다 객체 선언시 불필요 코드
	public static MemberDao memberDao = new MemberDao(); // DB 연동 객체;
	
	public MemberDao() {
		// DB 연동
			try {
				// 1. DB 드라이버 가져오기
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB 주소 연결
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
				memberDao = this;
				
				
			} catch (Exception e) {
				System.out.println("[DB 연동]" + e);
			}
	}
	
	//메소드
		// * 아이디 중복체크 메소드 (인수 : 아이디를 인수로 받아 db에 존재하는지 체크)
		public boolean idcheck(String id) {
			
			try {
				// 1. SQL 작성
				// 검색 : select * from 테이블명 where 조건(필드명 = 값)
				String sql = "select * from member where mid = ?";
				// 2. SQL 조작
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				// 3. SQL 실행
				rs = ps.executeQuery(); //select 실행 -> 검색을 결과물 존재 -> resultset o
				// resultset 처음 기본 값은 : null -> next() -> 결과 레코드
				// 4. SQL 결과
				if(rs.next()) {// 만약에 다른 결과물이 존재하면 = > 해당 아이디 존재 -> 중복 o
					return true;
				}
			} catch (Exception e) {
				System.out.println("id 중복체크오류" + e);
			}
			return false;
			
		}
	
		//1. 회원가입 메소드
	public boolean signup(Member member) {
		;
		
		try {
			// 1. SQL 작성 [ 회원번호(자동번호) ]
			String sql = "insert into member(mid, mpassword, memail, maddress,mpoint, mcince)values(?,?,?,?,?,?)";
			// 2. SQL 조작
			ps = con.prepareStatement(sql);// prepareStatement 인터페이스내 연결된 db에 sql 넣기
			ps.setString(1, member.getId()); // 1번
			ps.setString(2, member.getPassword()); // 2번
			ps.setString(3, member.getMemail()); // 3번
			ps.setString(4, member.getMaddress()); // 4번
			ps.setInt(5, member.getMpoint());
			ps.setString(6, member.getMcince()); // 5번
			// 3. SQL 실행
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("에러" + e);
		} 

		return false;
	}
		//2. 로그인 메소드
	public boolean login(String id, String password) {
		
		try {
			//1. SQL 작성
			// and : 조건1 and 조건2 dlaustj
			// or : 조건1 or 조건2 이거나
			String sql = "select * from member where mid=? and mpassword=?";
			//2. SQL 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			//3. SQL 실행
			rs = ps.executeQuery(); // select 실행 -> resultset
			//4. SQL 결과
			if(rs.next()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println("SQL 실패");
		}
		
		
		return false;
	}
		//3 아이디 찾기 메소드
	public String findid(String email) {
		return null;
	}
		//4. 비밀번호찾기메소드
	public String findpassword(String id, String email) {
		return null;
	}
	
	
}
