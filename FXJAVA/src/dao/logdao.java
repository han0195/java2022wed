package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import dto.Member;

public class logdao {
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static logdao logdao = new logdao();
	
	public logdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234"); // 2. DB 주소 연결 
		} catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
	
	//메소드
	//회원가입시 저장될 로그 할당
	public void singuplogsave(Member member) {
		try {
			// 1. sql 작성
			String sql = "insert into log(logmnum,logscince)values(?,?)";
			// 2. sql 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMsince());
			// 3. sql 실행
			ps.executeUpdate();
			
		} catch(Exception e ) { System.out.println( "[SQL 오류]" + e  ); }
		
	}
	// 로그인시 로그 최신화
	public void logupdate(String mnum) { // 아이디임 오타
		try {
			//현재날짜
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String since = format.format(new Date());
			// 1. SQL 작성
			String sql = "update log set logscince = ? where logmnum = ?";
			// 2. SQL 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, since);
			ps.setString(2, mnum);
			// 3. SQL 실행
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("[SQL 에러]" + e);
		}
	}
	//로그비교를위해 같은아이디 logsince 꺼내오기
	public String logout(String mid) {
		try {
			//1. sql 작성
			String sql = "select * from log where logmnum=?";
			//2. sql 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			//3. sql 실행
			rs = ps.executeQuery();
			//4. sql 결과
			if(rs.next()) {
				return rs.getString(2);
			}
		} catch (Exception e) {
			System.out.println("[SQL 에러]" + e);
		}
		return null;	
	}
	

}
