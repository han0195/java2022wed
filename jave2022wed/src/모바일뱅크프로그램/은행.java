package 모바일뱅크프로그램;

public class 은행 {
	//1.필드
	private int 회원번호;
	private String 계좌번호;
	private int 잔액;
	//2.생성자
	public 은행() {
		// TODO Auto-generated constructor stub
	}
	public 은행(int 회원번호, String 계좌번호, int 잔액) {
		super();
		this.회원번호 = 회원번호;
		this.계좌번호 = 계좌번호;
		this.잔액 = 잔액;
	}
	//3.메소드
	public int get회원번호() {
		return 회원번호;
	}
	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}
	public String get계좌번호() {
		return 계좌번호;
	}
	public void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}
	public int get잔액() {
		return 잔액;
	}
	public void set잔액(int 잔액) {
		this.잔액 = 잔액;
	}
	
	
}
