package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import dto.Member;

public class logdao {
	private Connection con; // DB������ ���Ǵ� Ŭ���� : DB����Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL ���� �Ҷ� ���Ǵ� �������̽� : DB�����������̽�
	private ResultSet rs; // ������� �����ϴ� �������̽� 
	
	public static logdao logdao = new logdao();
	
	public logdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234"); // 2. DB �ּ� ���� 
		} catch(Exception e ) { System.out.println( "[DB ���� ����]"+e  ); }
	}
	
	//�޼ҵ�
	//ȸ�����Խ� ����� �α� �Ҵ�
	public void singuplogsave(Member member) {
		try {
			// 1. sql �ۼ�
			String sql = "insert into log(logmnum,logscince)values(?,?)";
			// 2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMsince());
			// 3. sql ����
			ps.executeUpdate();
			
		} catch(Exception e ) { System.out.println( "[SQL ����]" + e  ); }
		
	}
	// �α��ν� �α� �ֽ�ȭ
	public void logupdate(String mnum) { // ���̵��� ��Ÿ
		try {
			//���糯¥
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String since = format.format(new Date());
			// 1. SQL �ۼ�
			String sql = "update log set logscince = ? where logmnum = ?";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, since);
			ps.setString(2, mnum);
			// 3. SQL ����
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("[SQL ����]" + e);
		}
	}
	//�α׺񱳸����� �������̵� logsince ��������
	public String logout(String mid) {
		try {
			//1. sql �ۼ�
			String sql = "select * from log where logmnum=?";
			//2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			//3. sql ����
			rs = ps.executeQuery();
			//4. sql ���
			if(rs.next()) {
				return rs.getString(2);
			}
		} catch (Exception e) {
			System.out.println("[SQL ����]" + e);
		}
		return null;	
	}
	

}
