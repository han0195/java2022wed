package Day07;

public class Day07_04 {
	//p.229 : �ܺ�ȣ��
	public static void main(String[] args) {
		
		//1. ��ü����
		Car2 car2 = new Car2();
		//2. �ڵ��� �õ��ɱ�
		car2.keyTurnOn();
		//3. �ڵ��� ����
		car2.run();
		//4. ���� ���ǵ� Ȯ�� �޼ҵ� ȣ��0
		int speed = car2.speed;
		System.out.println("����ӵ�: " + speed + "km");
		
		
	}// me
}// ce
