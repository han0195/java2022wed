package Day07;

public class Day07_01 {// cs

	public static void main(String[] args) {
		//ȣ��
			//1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			//2. ��ü��.�޼ҵ��
				// . : ���ٿ����� ( �ʵ峪 �޼ҵ� ȣ��� )
				//��) scanner.nextInt();
		//1. ��ü ����
		Calculator calculator = new Calculator();		
		//Ŭ������  ��ü��[ �̸� ] = �޸��Ҵ� ������();
		
		// 2. �޼���ȣ�� [ ��ü��.�޼ҵ��(); ]
		calculator.powerOn();
		
		// 3. �޼���ȣ�� [ �μ�2�� ]
		int result1 = calculator.plus(5, 6);
				//* �޼��忡 5 �� 6 �����Ŀ�
				//* 11�̶�� ����� �޾Ƽ�
		System.out.println("result1 :" + result1);
		
		double result2 = calculator.divide(10, 4);
		System.out.println(result2);
		
		calculator.powerOff();

	}// m e

}// ce
