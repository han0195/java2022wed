package Day08;

public class Day08_04 {

	//p.267~268 : Setter , Getter �޼ҵ�
		//�ʵ�� private ���Ǵ� ��찡 ����
		//�ܺο��� �ʵ忡 �����Ҽ� ����
		//����: �ܺο��� �ʵ忡 �������� �����ϰ� �޼ҵ带 ���� �ʵ� ����
		//Setter �޼ҵ� : �ʵ� ������ ����
		//Getter �޼ҵ� : �ʵ� ������ ȣ��
	
	public static void main(String[] args) {
		
		//1. ��ü����
		Car car = new Car();
		//2. ��ü�� �޼ҵ� ȣ��
		car.setSpeed(-50);
		//3.
		System.out.println("����ӵ�: " + car.getSpeed());
		//4.
		car.setSpeed(60);
		System.out.println("����ӵ�: " + car.getSpeed());
		
		if(!car.isStop()) { // �������°� �ƴϸ�
			// ! : ����������
			car.setStop(true);
		}
		System.out.println("����ӵ�: " + car.getSpeed());
	}
	
}
