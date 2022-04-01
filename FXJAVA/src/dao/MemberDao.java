package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import dto.Member;

public class MemberDao { // DB ���ٰ�ü

	private Connection con; // DB������ ���Ǵ� Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL ���� �Ҷ� ���Ǵ� �������̽� : DB�����������̽�
	private ResultSet rs; // �����
	
	// * DB �����Ҷ����� ��ü ����� ���ʿ� �ڵ�
	public static MemberDao memberDao = new MemberDao(); // DB ���� ��ü;
	
	public MemberDao() {
		// DB ����
			try {
				// 1. DB ����̹� ��������
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB �ּ� ����
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
				memberDao = this;
				
				
			} catch (Exception e) {
				System.out.println("[DB ����]" + e);
			}
	}
	
	//�޼ҵ�
		// * ���̵� �ߺ�üũ �޼ҵ� (�μ� : ���̵� �μ��� �޾� db�� �����ϴ��� üũ)
		public boolean idcheck(String id) {
			
			try {
				// 1. SQL �ۼ�
				// �˻� : select * from ���̺�� where ����(�ʵ�� = ��)
				String sql = "select * from member where mid = ?";
				// 2. SQL ����
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				// 3. SQL ����
				rs = ps.executeQuery(); //select ���� -> �˻��� ����� ���� -> resultset o
				// resultset ó�� �⺻ ���� : null -> next() -> ��� ���ڵ�
				// 4. SQL ���
				if(rs.next()) {// ���࿡ �ٸ� ������� �����ϸ� = > �ش� ���̵� ���� -> �ߺ� o
					return true;
				}
			} catch (Exception e) {
				System.out.println("id �ߺ�üũ����" + e);
			}
			return false;
			
		}
	
		//1. ȸ������ �޼ҵ�
	public boolean signup(Member member) {
		;
		
		try {
			// 1. SQL �ۼ� [ ȸ����ȣ(�ڵ���ȣ) ]
			String sql = "insert into member(mid, mpassword, memail, maddress,mpoint, mcince)values(?,?,?,?,?,?)";
			// 2. SQL ����
			ps = con.prepareStatement(sql);// prepareStatement �������̽��� ����� db�� sql �ֱ�
			ps.setString(1, member.getId()); // 1��
			ps.setString(2, member.getPassword()); // 2��
			ps.setString(3, member.getMemail()); // 3��
			ps.setString(4, member.getMaddress()); // 4��
			ps.setInt(5, member.getMpoint());
			ps.setString(6, member.getMcince()); // 5��
			// 3. SQL ����
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("����" + e);
		} 

		return false;
	}
		//2. �α��� �޼ҵ�
	public boolean login(String id, String password) {
		
		try {
			//1. SQL �ۼ�
			// and : ����1 and ����2 dlaustj
			// or : ����1 or ����2 �̰ų�
			String sql = "select * from member where mid=? and mpassword=?";
			//2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			//3. SQL ����
			rs = ps.executeQuery(); // select ���� -> resultset
			//4. SQL ���
			if(rs.next()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println("SQL ����");
		}
		
		
		return false;
	}
		//3 ���̵� ã�� �޼ҵ�
	public String findid(String email) {
		return null;
	}
		//4. ��й�ȣã��޼ҵ�
	public String findpassword(String id, String email) {
		return null;
	}
	
	
}
