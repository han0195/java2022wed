package Day15;

public class ä�� implements Runnable{

	@Override
	public void run() {
		// ����ó�� ����
			while(true) {
				System.out.println("ä����");
				try {
					Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
				} catch (Exception e) {
					// TODO: handle exception
				}				
			}
	}
	
}
