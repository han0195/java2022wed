package Day09;

public class Day09_02 {

	public static void main(String[] args) {
		
		// ��� 
			// �θ𿡰� �����޴°�
			// ���� : �θ� ----> �ڽ� // ���α׷��� : �ڽ� ---> �θ� ����
			// extends : �����ϴ�[ ����ϴ� ]
			// ���� : ���� ���� [ ���� �ִ� Ŭ������ �����ؼ� ���ο� Ŭ���� ���� ]
			// �θ�Ŭ���� 1�� ����
			// 
				
		// p.290~ 292 ����
		// 1. ����Ŭ������ ��ü ����
		Dmbcellphone dmbcellphone = new Dmbcellphone("�ڹ���", "����", 10);
		
		// 2. ����Ŭ������ ������� ��ü�� ����Ŭ������ �������
		System.out.println("��: " + dmbcellphone.modle);
		System.out.println("����: " + dmbcellphone.color);
		
		// 3. ����Ŭ������ ������� ��ü�� ���� �������
		System.out.println("ä��: " + dmbcellphone.channerl);
		
		// 4. ����Ŭ������ ������� ��ü�� ����Ŭ���� ���[�޼ҵ� ����]
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.send("��������");
		dmbcellphone.receive("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�");
		dmbcellphone.send("�� ~ �� �ݰ��ϴ�");
		dmbcellphone.hangUp();
		
		//5.����Ŭ������ ������� ��ü�� ���� �������
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannerlDMB(12);
		dmbcellphone.turnOffDmb();

	}

}
