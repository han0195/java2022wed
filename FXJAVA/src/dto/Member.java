package dto;

public class Member {
	
	private int mnum; // 회원번호
	private String id; // 회원아이디
	private String password; // 회원비밀번호
	private String memail; // 이메일
	private String maddress; // 주소
	private int mpoint; // 포인트
	private String mcince; // 가입일
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int mnum, String id, String password, String memail, String maddress, int mpoint, String mcince) {
		super();
		this.mnum = mnum;
		this.id = id;
		this.password = password;
		this.memail = memail;
		this.maddress = maddress;
		this.mpoint = mpoint;
		this.mcince = mcince;
	}

	public int getMnum() {
		return mnum;
	}

	public void setMnum(int mnum) {
		this.mnum = mnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public int getMpoint() {
		return mpoint;
	}

	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}

	public String getMcince() {
		return mcince;
	}

	public void setMcince(String mcince) {
		this.mcince = mcince;
	}
	
	
}
