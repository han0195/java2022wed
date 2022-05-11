package dao;

import java.util.ArrayList;

import controller.board.replydelete;
import dto.Chatting;

public class ChattingDao extends Dao{
	public ChattingDao() {
		super();
	}
	public static ChattingDao chattingDao = new ChattingDao();
	public static ChattingDao getChattingDao() {
		return chattingDao;
	}
	// 채팅창 불러오기
	public ArrayList<Chatting> Chatlist(){
		String sql = "SELECT * FROM chatting  ORDER BY cdate asc";
		ArrayList<Chatting> chList = new ArrayList<Chatting>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				chList.add( new Chatting(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)) );
			}
			return chList;
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}
		return null;
	}
	// 채팅DB 저장
	public boolean chatadd(String cname , String ccontent) {
		String sql = "insert into chatting(cname,ccenter)values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cname);
			ps.setString(2, ccontent);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[SQL 오류]" + e);
		}
		return false;
	}
	// 채팅DB삭제
}
