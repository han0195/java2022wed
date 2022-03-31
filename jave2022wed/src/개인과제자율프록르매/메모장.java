package 개인과제자율프록르매;

public class 메모장 extends 회원{
	//필드
	private String content;
	private boolean 완료여부;
	//생성자
	public 메모장(String content, boolean 완료여부, String id, String pw, String name) {
		super(id, pw, name);
		this.content = content;
		this.완료여부 = 완료여부;
	}
	//메소드
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean is완료여부() {
		return 완료여부;
	}
	public void set완료여부(boolean 완료여부) {
		this.완료여부 = 완료여부;
	}

	
	
}
