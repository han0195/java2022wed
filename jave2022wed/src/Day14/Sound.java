package Day14;

public class Sound extends Thread{
	
	static boolean stop = true; // ���� ���� [true ���� false ����] 
	
	public Sound() {
		// TODO Auto-generated constructor stub
	}
	
	public void Soundsw(boolean stop) {
		this.stop = stop;
		if( stop ) {
			System.out.println("�Ҹ��������");
		}else {
			System.out.println("�Ҹ� ����");
		}
	}
	
	@Override
	public void run() {
		
		while(stop) {// stop������ true�̸� ���ѷ���
			System.out.println("�Ҹ������");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
