package Day15;

public class StartPrintThread extends Thread {

	// �ʵ�
	private Thread targetThread;
	// ������
	public StartPrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	//����ó��
	@Override
	public void run() {
		while(true) {
			// ������ ���� ȣ��
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);
			// ������ ���� ����
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			// 0.5�ʰ� �Ͻ�����
			try {Thread.sleep(500);}catch(Exception e){}
		}
		
		
	}
}
