package dto;

public class logdto {
	private int logmnum; // 아이디!!!
	private String logscince; // 날짜
	
	// 생성자 
		public logdto() {}
		public logdto(int logmnum, String logscince) {
			super();
			this.logmnum = logmnum;
			this.logscince = logscince;
		}
		public int getLogmnum() {
			return logmnum;
		}
		public void setLogmnum(int logmnum) {
			this.logmnum = logmnum;
		}
		public String getLogscince() {
			return logscince;
		}
		public void setLogscince(String logscince) {
			this.logscince = logscince;
		}
	
}
