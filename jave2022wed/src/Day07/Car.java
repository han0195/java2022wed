package Day07;

public class Car {
	// Ŭ��������
	
	// 1. �ʵ�
	int gas; // ��������
	
	// 2. ������
		// ������ ������ �⺻������
	
	// 3. �޼ҵ�
		//1. gas�� �ܺηκ��� �޾Ƽ� ���ο� gas �����ϴ� �޼ҵ� ��Ȱ
	void setGas(int gas) { // �μ�o��ȯx
	// ����x �޼Ҹ�(�μ� 1) {���κ��� = �ܺκ���}
		this.gas = gas;
	// ���κ����� �ܺκ��� �̸��� �����Ҷ� �����ϴ� ���!!!!
		//this.�ʵ�� : ����(��Ŭ��������)����;
	}
		//2. ���κ��� gas�� ������ Ȯ�� [ 0 = �������� ] [ 1�̻� = �����ִ�]
	boolean isLeftGas() { // �μ�x ��ȯ0
	// ����ȯ �޼Ҹ�() {}
		if( gas == 0 ) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}else {
			System.out.println("gas�� �ֽ��ϴ�");
			return true;
		}			
	}
	void run() { // �μ�x ��ȯx [ ����: 1.break 2.return 3.����ġ����]
		while( true ) {
			if( gas > 0 ) {
			System.out.println("�޸��ϴ�. (gas: " + gas);
			gas--;
			}else {
				System.out.println("����ϴ�. (gas: " + gas);
				return;
			}
			
		}
	}
	
}
