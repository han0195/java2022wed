package Day15;

public class Day15_04 {
	public static void main(String[] args) {
		
		//12�� : ������
			// �ڵ� -> ���� -> ���μ���[���α׷�]
			// ���� : ����ó��
				// main�޼ҵ忡 mian������ ����
			// �����
				// 1. Thread Ŭ����		
				// 2. Runnable Ŭ����
		
			// run �޼ҵ� : ��Ƽ�������� �����ڵ�
		
		//��1) Thread Ŭ������ �̿��� ����ó�� �����		
		���� m1 = new ����();
		m1.start(); // run�޼ҵ� ���� -> ������ ����
		
		// ��2) Runnable �������̽��� �̿��� ����ó�� ��ü �����
		ä�� c1 = new ä��();
		//c1.start(); �������̽��� start() �޼ҵ带 ��������������
		Thread th = new Thread(c1);
		th.start();
		
		while(true) {
			System.out.println("���α׷� �۵���");
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		
		
		
	}// me
}
