package Day09;

import Day07.Calculator;

public class Computer extends calculator{
					// ����Ŭ���� extends ����Ŭ����
	
	//1.�ʵ�
	//2.������
	//3.�޼ҵ�
		//* �������̵� [�޼ҵ� ������]
	@Override // ����� �θ� ������ �ִ� �޼ҵ� ȣ��
	double areaCircle(double r) {
		System.out.println("Coputer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

}
