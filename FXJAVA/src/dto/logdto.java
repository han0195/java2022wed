package dto;

public class logdto {
	private int logmnum; // ���̵�!!!
	private String logscince; // ��¥
	
	// ������ 
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
