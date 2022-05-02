package dto;

import java.time.LocalDate;

public class memberdto {
	private int mno;
	private String mid;
	private String mpw;
	private String mname;
	private String mphone;
	private String memali;
	private String maddress;
	private int mpoint;
	private LocalDate mdate;
	public memberdto() {
		// TODO Auto-generated constructor stub
	}
	public memberdto(int mno, String mid, String mpw, String mname, String mphone, String memali, String maddress,
			int mpoint, LocalDate mdate) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.mphone = mphone;
		this.memali = memali;
		this.maddress = maddress;
		this.mpoint = mpoint;
		this.mdate = mdate;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMemali() {
		return memali;
	}
	public void setMemali(String memali) {
		this.memali = memali;
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
	public LocalDate getMdate() {
		return mdate;
	}
	public void setMdate(LocalDate mdate) {
		this.mdate = mdate;
	}
	
}
