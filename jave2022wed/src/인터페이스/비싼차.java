package �������̽�;

public class ����� implements �������̽�{
	//1.�ʵ�
		private int ������;
		private int ����Ÿ�;
		//2.������
		public �����(int ������, int ����Ÿ�) {
			super();
			this.������ = ������;
			this.����Ÿ� = ����Ÿ�;
		}
		//3.�޼ҵ�
		public int get������() {
			return ������;
		}
		public void set������(int ������) {
			this.������ = ������;
		}
		public int get����Ÿ�() {
			return ����Ÿ�;
		}
		public void set����Ÿ�(int ����Ÿ�) {
			this.����Ÿ� = ����Ÿ�;
		}
		@Override
		public void move() {
			if(������ == 0) {
				System.out.println("����� ����");
			}else {
				System.out.println("����� ����������: " + ������ + " |����Ÿ�: " + ����Ÿ� + "Km");
				������--;
				����Ÿ�++;
			}
		}
}
