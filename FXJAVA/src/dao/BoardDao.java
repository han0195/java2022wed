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
	private Connection con;	// 1. DB 연결
	private PreparedStatement ps;// 2. 연결된 DB내 SQL 조작
	private ResultSet rs;// 3. SQL 결과 가져오기
	private Board board = new Board();
	public static BoardDao boardoao = new BoardDao();
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 회사마다 이름다름
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
		} catch (Exception e) { System.out.println("[DB 연동 오류]" + e);}
	}
	
	// 메소드
		//1.글쓰기 메소드
	public boolean write(Board board) { 
		try {
			//1. sql 작성
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
			//2. sql 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			//3. sql 실행
			ps.executeUpdate();
			//4. sql 결과
			return true;
		} catch (Exception e) {System.out.println("[SQL 오류]" + e);}
		
		return false;
		}
		//2.모든 글 표시
	public ObservableList<Board> list() { 
		try {
			// * 리스트 선언
			ObservableList<Board> observableList = FXCollections.observableArrayList();
			// 1.sql작성
				//정렬 : order by 필드명 asc
				//	  : order by 필드명 desc
			String sql = "select * from board order by bdate desc";
			// 2.sql조작
			ps = con.prepareStatement(sql);
			// 3.sql실행
			rs = ps.executeQuery();
			// 4.sql결과
				// rs : 검색 결과의 레코드를 하나씩 순회
			while (rs.next()) {
				// 객체화
				Board temp = new Board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6));
				// 해당 객체물 리스트에담기
				observableList.add(temp);
			}
			return observableList;
		} catch (Exception e) {System.out.println("[SQL 오류]"+e );}
			return null;
		}
	
		//3.글삭제 메소드
	public boolean delete(int bnums) {
		try {
			System.out.println(bnums);
			//1.sql 작성
			String sql = "delete from board where bnum = ?";
			//2.sql 조작
			ps = con.prepareStatement(sql);
			ps.setInt(1, bnums);
			//3.sql 실행
			ps.executeUpdate();
			//4.sql 결과
			return true;
		} catch (Exception e) {System.out.println("[SQL 오류]"+e );}
		return false; 
		}
		
	
	 	//4.글수정 메소드
	public boolean update(int bnum, String title, String content) {
		try {
			//1. sql 결과
			String sql = "update board set btitle=?, bcontent=? where bnum = ?";
			//2. sql 조작
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			//3. sql 실행
			ps.executeUpdate();
			//4. sql 조작
			return true;
		} catch (Exception e) {
			System.out.println("[SQL 오류]"+e );
		}
		
		return false; 
		}

		//5. 댓글 작성 메소드
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
				System.out.println("[SQL 오류]"+e );
			}
			return false;
		}
		//6. 댓글 호출 메소드
		// 해당게시글의 댓글만
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
				System.out.println("[SQL 오류]"+e );
			}
			return null;		
		}
		// 조회수 증가 메소드
		ArrayList<String> log = new ArrayList<String>();
		public void view(int bnum, int mnum , String date) {
			try {
				System.out.println(bnum+" "+mnum +" "+date);
				//파일불러오기
				조회수파일불러오기();
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
				//조회수파일처리
				조회수파일처리(bnum, mnum, date);
				}
			} catch (Exception e) {
				System.out.println("[SQL 오류]"+e );
			}	
		}
		public void 조회수파일처리(int bnum, int mnum , String date) throws IOException {
			 FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/자바웹/게시글보기.txt", true);
			 String str = Integer.toString(bnum)+Integer.toString(mnum)+date+"\n";
			 fileOutputStream.write(str.getBytes());
		}
		public void 조회수파일불러오기() throws IOException {
			FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/자바웹/게시글보기.txt");
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String strall = new String(bytes);
			String[] str = strall.split("\n");
			for(int i = 0 ; i < str.length - 1 ;i++) {
				log.add(str[i]);
			}
		}
}
