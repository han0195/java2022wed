package 개인과제;

import java.time.LocalDate;
import java.util.ArrayList;

public class Board {
	//필드
	private String title;
	private String content;
	private String password;
	private LocalDate date;
	private int views;
	private ArrayList<Comment> Commentlist = new ArrayList<Comment>();
	//생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(String title, String content,String password, LocalDate date, int views) {
		super();
		this.title = title;
		this.content = content;
		this.password = password;
		this.date = date;
		this.views = views;
	}
	//메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public ArrayList<Comment> getCommentlist() {
		return Commentlist;
	}
	public void setCommentlist(ArrayList<Comment> commentlist) {
		Commentlist = commentlist;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
