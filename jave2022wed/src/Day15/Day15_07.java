package Day15;

import java.awt.Toolkit;

public class Day15_07 {
	public static void main(String[] args) throws InterruptedException {
		
		//p601. ������ ����
			// 1. sleep() : �־��� �ð����� �Ͻ� ����
				// �ð� ���� : �и���(1000/1��)
				// �Ϲ� ���� �߻� : �Ͻ��������¿��� �־��� �ð��� �Ǳ����� ������
			// 2. Thread.yield() : �ٸ� �����忡�� ���� ��ȣ
		
//		//p.602. sleep ����
//		Toolkit toolkit = Toolkit.getDefaultToolkit(); // �Ҹ� ���� Ŭ����
//		for(int i = 0; i < 10; i++) {
//			toolkit.beep();
//			Thread.sleep(3000); // 3�ʰ� �Ͻ�����
//			
//		}
		
		// 1. ��ü����
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		//������ ����
		threadA.start();
		threadB.start();
		// 4. ������ 3�ʰ� �Ͻ�����
		try { Thread.sleep(3000);}catch(Exception e) {}
		// 5. ������A�� work �� ����
		threadA.work = false; // -> Thread.yield();
		
		// 4. ������ 3�ʰ� �Ͻ�����
		try { Thread.sleep(3000);}catch(Exception e) {}
		// 5. ������A�� work �� ����
		threadA.work = true; // -> Thread.yield();
		
		// 4. ������ 3�ʰ� �Ͻ�����
			try { Thread.sleep(3000);}catch(Exception e) {}
		//6. ������A, ������B ����
			threadA.stop = true;
			threadB.stop = true;
			
		//7.
		threadA.stop(); // ������������ �޼ҵ� [ �������� ������x ]
		
		
		
		
	}
}
