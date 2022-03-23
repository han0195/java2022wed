package 모바일뱅크프로그램;

public class 대출 {
	private int 회원번호;
	private int 남은대출금;
	//2.생성자
	public 대출() {
		// TODO Auto-generated constructor stub
	}
	public 대출(int 회원번호, int 남은대출금) {
		super();
		this.회원번호 = 회원번호;
		this.남은대출금 = 남은대출금;
	}
	//3.메소드
	public int get회원번호() {
		return 회원번호;
	}
	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}
	public int get남은대출금() {
		return 남은대출금;
	}
	public void set남은대출금(int 남은대출금) {
		this.남은대출금 = 남은대출금;
	}
	
	
}
