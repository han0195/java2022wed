package 개인과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Controller {
	static ArrayList<Board> Boardlist = new ArrayList<Board>();
	
	public static void listview() {
		// 전부 출력
		int i = 0;
		for(Board temp : Boardlist) {
			System.out.println(i+"\t"+temp.getTitle()+"\t"+temp.getContent()+"\t\t"+temp.getDate()+"\t\t"+temp.getViews());
			i++;
		}
	}
	public static boolean view(int index) throws IOException {
		//인덱스 받아서
		if(Boardlist.get(index) != null) {
			//해당글 조회수 증가
			Boardlist.get(index).setViews(Boardlist.get(index).getViews() + 1);
			//세이브
			save();
			return true;
		}
		return false;
	}
	public static boolean write(String tit, String con, String pw) throws IOException {
		// 제목 내용 패스워드 받아서
		// Boardlist의 저장
		Boardlist.add(new Board(tit, con, pw, LocalDate.now(), 0));
		// 세이브
		save();
		return true;
	}
	public static boolean edit(int index, String pw, String tit, String con) throws IOException {
		// 인덱스 비밀번호 받아서
		// 비밀번호 일치하면 수정
			if(Controller.Boardlist.get(index).getPassword().equals(pw)) {
				Controller.Boardlist.get(index).setTitle(tit);
				Controller.Boardlist.get(index).setContent(con);
				// 세이브
				save();
				return true;
			}
		return false;
	}
	public static boolean delete(int index, String pw) {
		// 인덱스 비밀번호 받아서
		// 비밀번호 일치하면 수정
		// 세이브
		return false;
	}
	public static boolean cwrite() { // 댓글쓰기
		// 인덱스 , 댓글내용, 댓글비번, 작성자 받아서
		// Board 인덱스일치하는 게시판 댓글리스트의 추가
		// 댓글세이브
		return false;
	}
	public static void save() throws IOException { // 게시물저장
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/ds/게시물.txt");
		for(Board temp : Boardlist) {
			String str = temp.getTitle()+","+temp.getContent()+","+temp.getPassword()+","+temp.getDate()+","+temp.getViews()+"\n";
			fileOutputStream.write(str.getBytes());
		}
	}
	public static void respone() throws IOException { // 게시물 불러오기
		FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/ds/게시물.txt");
		byte[] bytes = new byte[1024];
		fileInputStream.read(bytes);
		String strall = new String(bytes);
		String[] strs = strall.split("\n");
		for(int i = 0; i < strs.length - 1 ; i++) {
			String[] str = strs[i].split(",");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date =  LocalDate.parse(str[3], formatter);
			Boardlist.add(new Board(str[0],str[1],str[2],date,Integer.parseInt(str[4])));
		}
	}
	public static void commentSave() {// 댓글저장
		
	}
	public static void commentrespone() {// 댓글 불러오기
		
	}
}
