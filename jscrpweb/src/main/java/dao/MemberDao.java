package dao;

import dto.Member;

public class MemberDao extends Dao {
	// 자식클래스로 객체 생성시 ( 부모 클래스의 생성자 호출 )	
	public MemberDao() {
		super(); // 부모클래스 생성자 호출 
	}
	public static MemberDao memberDao = new MemberDao(); 		// dao 호출시 반복되는 new 연산자 제거 
	public static MemberDao getmemberDao() { return memberDao; } 
	
	// 아이디 중복체크 메소드
	public boolean idcheck( String mid ) {
		String sql = "select * from member where mid=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			rs = ps.executeQuery();	
			// 동일한 아이디가 존재하면 
			if( rs.next() ) { return true; } 
		}catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		} 
		// 동일한 아디디가 존재하지 않으면
		return false;
	}
	// 이메일 중복체크 메소드 
	public boolean emailcheck( String email ) {
		String sql = "select * from member where memali = ?";
		try {  ps = con.prepareStatement(sql); ps.setString(1, email);  rs= ps.executeQuery(); if( rs.next() ) return true;
		}catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		} return false;
	}
	
	public boolean singup(Member member) {
		String sql = "insert into member(mid, mpw, mname, mphone, memali, maddress)values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.setString(4, member.getMphone());
			ps.setString(5, member.getMemail());
			ps.setString(6, member.getMaddress());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		}
		return false;
	}
	
	public int login(String mid, String mpassword) {
		String sql = "select * from member where mid = ? and mpw = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mpassword);
			rs = ps.executeQuery();
			if(rs.next()) {
				return 1;
			}
			return 2;
		} catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		}
		return 3;
	}
}





