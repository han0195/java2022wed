package 인터페이스;

public class 비싼차 implements 인터페이스{
	//1.필드
		private int 내구도;
		private int 주행거리;
		//2.생성자
		public 비싼차(int 내구도, int 주행거리) {
			super();
			this.내구도 = 내구도;
			this.주행거리 = 주행거리;
		}
		//3.메소드
		public int get내구도() {
			return 내구도;
		}
		public void set내구도(int 내구도) {
			this.내구도 = 내구도;
		}
		public int get주행거리() {
			return 주행거리;
		}
		public void set주행거리(int 주행거리) {
			this.주행거리 = 주행거리;
		}
		@Override
		public void move() {
			if(내구도 == 0) {
				System.out.println("비싼차 퍼짐");
			}else {
				System.out.println("비싼차 남은내구도: " + 내구도 + " |주행거리: " + 주행거리 + "Km");
				내구도--;
				주행거리++;
			}
		}
}
