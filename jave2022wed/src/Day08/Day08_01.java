package Day08;

public class Day08_01 {

	public static void main(String[] args) {
		
		//p.238 : static
			// ��������
			// �������� ������ = ���α׷� ���������� ���Ǵ� �޸�[�ʵ�]
			
		//1. Ŭ������ �ʵ�, �޼ҵ� ���ٹ��
			// (static ����� �ƴҋ�) 1.��ü���� -> ��ü.���
				// ��ü�� �����ɶ� new �����ڷ� ��ü(�� �������) �޸� �Ҵ�
		Calculator cal = new Calculator();
		System.out.println("��ü�� �̿��� �������: " + cal.pi);
		// (static ����� �϶�) 1. Ŭ������.���
			// Ŭ���� �ε� �ǰ� �޼ҵ念���� static ������ �޸� �Ҵ�
		System.out.println("��ü ���� �������" +  Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
								// Ŭ���� ��
		int result2 = cal.plus(10, 5);
		int result3 = cal.minus(10, 5);
		
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		

	}

}
