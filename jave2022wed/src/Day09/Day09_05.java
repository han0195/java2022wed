package Day09;

public class Day09_05 {
	public static void main(String[] args) {
		
		//1. ��ü ���� [ �ڵ��� 1�� ���� ]
		Car mycar = new Car();
			// Ŭ������ Ÿ�̾ü�� 4�� -> mycar ����
		// 2. �޼ҵ� ȣ��
		for(int i = 1; i <= 5; i++) {
			int problemLocation = mycar.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
				mycar.frontLeftTire = new HankookTire("�տ���", 15);
				// mycar.frontLeftTire = new Tire �̶� �θ� ��[Tire = HankookTire]
				// [�θ� = �ڽ�] �̶� ���� �Ѱ� /�ڽ� = �θ����� �Ұ���
				// ����Ŭ���� ��ü�� = new ����Ŭ����();
				// ����� ������ ���� !!!!!!!!
				Object object = new Tire("asd", 13);
				break;
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾� ��ü");
				mycar.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
				
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾� ��ü");
				mycar.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				
			case 4:
				System.out.println("�ڿ����� ��ȣŸ�̾� ��ü");
				mycar.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			
			}
			System.out.println("--------------------------------------------------");
		}
		
	
		
	}//me
}//ce
