package Day06;

public class Day06_02 {
	
	public static void main(String[] args) {
		
		// 1. Ŭ���� ������ -> ��ü ����
		Car myCar = new Car(); // ��ü ����
			// 1. Car : ���ǵ� Ŭ������
			// 2. myCar : ��ü�̸�[ �ƹ��ų� ]
			// 3. new : �޸� �Ҵ� ������
			// 4. Car() : ������
		
		// 2. ��ü�� �ʵ� ȣ�� [ . : ���ٿ�����(��ü�� �������) ]
		System.out.println("����ȸ��: " + myCar.company);
			// myCar ��ü�� �ʵ� ����
			// ��ü�̸�.����̸�
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("�÷�: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
			// ���ȣ��
		
		// 3. ��ü�� �ʵ� �� ����
		myCar.speed = 60;
			// myCar ��ü�� speed �ʵ� ȣ���ؼ�
		System.out.println("������ ����ӵ�: " + myCar.speed);
		System.out.println(); // ����
		
		// ���ο� �ڵ��� ��ü ����
		Car yourcar = new Car();
		System.out.println("2�� �ڵ���: " + yourcar.speed);
		
	}
	
}
