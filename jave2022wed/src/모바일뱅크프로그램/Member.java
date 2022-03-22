package 모바일뱅크프로그램;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private int bno;
	//2.생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pw, String name, String phone, int bno) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.bno = bno;
	}
	//3.메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
}
