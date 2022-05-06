package dto;

public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private int mno;
	private int bview;
	private String bdate;
	private String bfile;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int bno, String btitle, String bcontent, int mno, int bview, String bdate, String bfile) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.mno = mno;
		this.bview = bview;
		this.bdate = bdate;
		this.bfile = bfile;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBfile() {
		return bfile;
	}

	public void setBfile(String bfile) {
		this.bfile = bfile;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", mno=" + mno + ", bview="
				+ bview + ", bdate=" + bdate + ", bfile=" + bfile + "]";
	}
	
	
}
