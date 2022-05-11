package dto;

public class Chatting {
	private int cno;
	private String cname;
	private String ccontent;
	private String cdate;
	public Chatting() {
		// TODO Auto-generated constructor stub
	}
	public Chatting(int cno, String cname, String ccontent, String cdate) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.ccontent = ccontent;
		this.cdate = cdate;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
}
