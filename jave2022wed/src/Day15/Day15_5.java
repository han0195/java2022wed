package Day15;

import Day09.calculator;

public class Day15_5 {
	public static void main(String[] args) {
		//p. 591 ����ȭ
		// ��Ƽ ������ ���� ����ȭ ���� [ ���Ͻ����� ��� ]
		// * ������ ������ ������ �޼ҵ� ȣ��
		// ���ôٹ������� �ϳ��� �޼ҵ� ȣ��

		// ��1) ����ȭ ���� �޼ҵ� ����
		//1. ���� ��ü ����
		Calculator calculator = new Calculator();
		
		//2.
		Uesr1 u1 = new Uesr1();
		u1.setCalculator(calculator);
		u1.start();
		//3.
		User2 u2 = new User2();
		u2.setCalculator(calculator);
		u2.start();
	}	
}
