package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;
import dto.reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class BoardDao {
	private Connection con;	// 1. DB ����
	private PreparedStatement ps;// 2. ����� DB�� SQL ����
	private ResultSet rs;// 3. SQL ��� ��������
	private Board board = new Board();
	public static BoardDao boardoao = new BoardDao();
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// ȸ�縶�� �̸��ٸ�
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
		} catch (Exception e) { System.out.println("[DB ���� ����]" + e);}
	}
	
	// �޼ҵ�
		//1.�۾��� �޼ҵ�
	public boolean write(Board board) { 
		try {
			//1. sql �ۼ�
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
			//2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			//3. sql ����
			ps.executeUpdate();
			//4. sql ���
			return true;
		} catch (Exception e) {System.out.println("[SQL ����]" + e);}
		
		return false;
		}
		//2.��� �� ǥ��
	public ObservableList<Board> list() { 
		try {
			// * ����Ʈ ����
			ObservableList<Board> observableList = FXCollections.observableArrayList();
			// 1.sql�ۼ�
				//���� : order by �ʵ�� asc
				//	  : order by �ʵ�� desc
			String sql = "select * from board order by bdate desc";
			// 2.sql����
			ps = con.prepareStatement(sql);
			// 3.sql����
			rs = ps.executeQuery();
			// 4.sql���
				// rs : �˻� ����� ���ڵ带 �ϳ��� ��ȸ
			while (rs.next()) {
				// ��üȭ
				Board temp = new Board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6));
				// �ش� ��ü�� ����Ʈ�����
				observableList.add(temp);
			}
			return observableList;
		} catch (Exception e) {System.out.println("[SQL ����]"+e );}
			return null;
		}
	
		//3.�ۻ��� �޼ҵ�
	public boolean delete(int bnums) {
		try {
			System.out.println(bnums);
			//1.sql �ۼ�
			String sql = "delete from board where bnum = ?";
			//2.sql ����
			ps = con.prepareStatement(sql);
			ps.setInt(1, bnums);
			//3.sql ����
			ps.executeUpdate();
			//4.sql ���
			return true;
		} catch (Exception e) {System.out.println("[SQL ����]"+e );}
		return false; 
		}
		
	
	 	//4.�ۼ��� �޼ҵ�
	public boolean update(int bnum, String title, String content) {
		try {
			//1. sql ���
			String sql = "update board set btitle=?, bcontent=? where bnum = ?";
			//2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			//3. sql ����
			ps.executeUpdate();
			//4. sql ����
			return true;
		} catch (Exception e) {
			System.out.println("[SQL ����]"+e );
		}
		
		return false; 
		}

		//5. ��� �ۼ� �޼ҵ�
		public boolean rwrtite(reply reply) {
			try {
				String sql = "insert into reply(rcontent, rwrite, bnum)values(?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, reply.getRcontent());
				ps.setString(2, reply.getRwrite());
				ps.setInt(3, reply.getBnum());
				ps.executeUpdate();
				return true;
			} catch (Exception e) {
				System.out.println("[SQL ����]"+e );
			}
			return false;
		}
		//6. ��� ȣ�� �޼ҵ�
		// �ش�Խñ��� ��۸�
		public ObservableList<reply> rlist(int bnum) {
			try {
				ObservableList<reply> replylist = FXCollections.observableArrayList();
				String spl = "select * from reply where bnum=? order by rnum desc";
				ps = con.prepareStatement(spl);
				ps.setInt(1, bnum);
				rs = ps.executeQuery();
				while(rs.next()) {
					reply reply = new reply(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getInt(5)
							);
					replylist.add(reply);
				}
				return replylist;
			} catch (Exception e) {
				System.out.println("[SQL ����]"+e );
			}
			return null;		
		}
		// ��ȸ�� ���� �޼ҵ�
		ArrayList<String> log = new ArrayList<String>();
		public void view(int bnum, int mnum , String date) {
			try {
				System.out.println(bnum+" "+mnum +" "+date);
				//���Ϻҷ�����
				��ȸ�����Ϻҷ�����();
				boolean pass = true;
				for(String temp : log) {
					if(temp.equals(Integer.toString(bnum)+Integer.toString(mnum) + date)) {
						pass = false;
					}
				}
				if(pass) {
					String sql = "update board set bview=? where bnum=?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, controller.home.Board.board.getBview() + 1);
					ps.setInt(2, bnum);
					ps.executeUpdate();
				//��ȸ������ó��
				��ȸ������ó��(bnum, mnum, date);
				}
			} catch (Exception e) {
				System.out.println("[SQL ����]"+e );
			}	
		}
		public void ��ȸ������ó��(int bnum, int mnum , String date) throws IOException {
			 FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/�ڹ���/�Խñۺ���.txt", true);
			 String str = Integer.toString(bnum)+Integer.toString(mnum)+date+"\n";
			 fileOutputStream.write(str.getBytes());
		}
		public void ��ȸ�����Ϻҷ�����() throws IOException {
			FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/�ڹ���/�Խñۺ���.txt");
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String strall = new String(bytes);
			String[] str = strall.split("\n");
			for(int i = 0 ; i < str.length - 1 ;i++) {
				log.add(str[i]);
			}
		}
}
