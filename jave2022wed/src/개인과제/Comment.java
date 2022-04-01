package 개인과제;

import java.time.LocalDate;

public class Comment {
	//필드
	private String content;
	private String Password;
	private String writer;
	private LocalDate date;
	//생성자
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(String content, String password, String writer, LocalDate date) {
		super();
		this.content = content;
		this.Password = password;
		this.writer = writer;
		this.date = date;
	}
	//메소드
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
