package Day09;

public class KumhoTire extends Tire{
			//����Ŭ���� extends ����Ŭ����
	
	//1. �ʵ�
	
	//2. ������
	public KumhoTire (String location, int maxRotaion) {
		super(location, maxRotaion);
	}
	//3. �޼ҵ�
	@Override
	public boolean roll() {
		accumulatedRotaion++; // ���� ȸ���� 1 ���� // Ÿ�̾ ȸ����
		if(accumulatedRotaion < maxRotaion) {
			// ���࿡ ����ȸ������ �ִ�ȸ�������� ������ [���� ����]
			System.out.println(location + "��ȣŸ�̾� ����: " + (maxRotaion - accumulatedRotaion) + "ȸ" );
			return true;
		}else { // �ƴϸ� [ ���� ���� ]
			System.out.println("****" + location + "��ȣŸ�̾� ��ũ ****");
			return false;
		}
	}
}
