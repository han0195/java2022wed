package Day07;

public class Day07_02 {

	public static void main(String[] args) {
		// 223~224 : ���ϰ� ���� �޼ҵ�
		
		//1. ��ü���� [������� = �⺻������]
		Car mycar = new Car();
		
		//2. �޼ҵ� ȣ�� [ �μ�1�� = 5 ]
		mycar.setGas(5);
		
		//3. �޼ҵ� ȣ�� [�μ�x ��ȯ = true or false]
		if(mycar.isLeftGas()) {
			System.out.println("����մϴ�");
			//4. �޼ҵ� ȣ�� [ �μ�x ]
			mycar.run();
		}else {
			System.out.println("��������");
		}

		// 5. �޼ҵ�ȣ��
		if( mycar.isLeftGas() ) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		}else {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		}
			
	
	}

}