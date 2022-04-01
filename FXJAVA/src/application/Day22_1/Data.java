package application.Day22_1;

public class Data {
	//필드
	private int 번호;
	private String 작성자;
	private String 내용;
	//생성자
	public Data() {
		// TODO Auto-generated constructor stub
	}

	public Data(int 번호, String 작성자, String 내용) {
		super();
		this.번호 = 번호;
		this.작성자 = 작성자;
		this.내용 = 내용;
	}
	//메소드
	public int get번호() {
		return 번호;
	}

	public void set번호(int 번호) {
		this.번호 = 번호;
	}

	public String get작성자() {
		return 작성자;
	}

	public void set작성자(String 작성자) {
		this.작성자 = 작성자;
	}

	public String get내용() {
		return 내용;
	}

	public void set내용(String 내용) {
		this.내용 = 내용;
	}
	
}
