package Day10;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		//�������̽� [ �߻�޼ҵ� ]
			//���� : ������ �����Ͽ� ������ ��� ����
				// ���� �ٸ� Ŭ�����鰣�� ��ü���� �����Ѹ������� ����
			// �߻� : ����[o] ����[x]
				// �������̽����� �����ϰ� �� Ŭ�������� �����Ѵ�. [ ������ ]
			// ��) �������̽� : ����Ű, A��ư, B��ư
			//		ö�ǰ��� Ŭ����
					// A��ư : ����
					// B��ư : ���
			// 		�౸���� Ŭ����
					// A��ư : ��
					// B��ư : ���
			
		// 1. �������̽� ��ü ����
		RemoteContor rc;
		// �������̽��� ��ü��
		//2. �������̽��� �ڸ����� �޸� �Ҵ�
		rc = new Television();
		rc.turnOn(); // tv ����
		rc.turnOff(); // tv ����
		rc.setVolume(10); // tv ����
		
		rc = new Audio();
		rc.turnOn(); // tv ����
		rc.turnOff(); // tv ����
		rc.setVolume(10); // tv ����
		
		//** �͸�����ü : Ŭ�������� �߻�޼ҵ� ���� ***
		RemoteContor rc2 = new RemoteContor() {
			
			@Override
			public void turnOn() {
				System.out.println("�������� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("�������� ���ϴ�");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("����ҷ�: " + volume);
				
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(10);
		
		// ����Ʈ �޼ҵ� ȣ��
		rc2.setMute(true); //�������̽����� �̹� �����Ǿ��ִ� �޼ҵ�
		
		// ���� �޼ҵ� ȣ��
		RemoteContor.changeBattery();//��ü����
		
		//�޸� �Ҵ� �޴� ���
			// �޸� �Ҵ� �ؾߵǴ� ���� : �ʵ�(������),�޼ҵ�(������) ����
				// �ܺ� Ŭ����/�������̽��� �ʵ�(������), �޼ҵ�(������) ����
			//1. new ����
			//2. static ������
		
		
	}
	
}
