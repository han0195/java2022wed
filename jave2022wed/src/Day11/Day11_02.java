package Day11;

public class Day11_02 {
	//p.422
		// ��ǻ���� �ϵ���� ������ ���� [ ����Ұ��� ]
		// ������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
		// ���� : 1.�Ϲݿ��� 2.���࿹��
			// �Ϲݿ��� : ������[ ���� ]���� ���� �˻� [ �����ڿ��� ���� ����ó�� : �ܺ���� ]
			// ���࿹�� : ������[ ���� ]�Ŀ� ���� �˻� 
	
	
	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());
				// ���������� ���� ����..
			// ������ �߻��ϴ� �̤� : null�� �޸𸮰� �Ҵ��� ���⶧���� ��ü������� �Ұ���
		} // try eend
		catch(NullPointerException e){
			System.out.println("���ܹ߻� : " + e);
		}
		
		//p.424
		try {
			String[] �迭 = new String[2]; // String 2���� �����Ҽ� �ִ� �迭
			�迭[0] = "a"; �迭[1] = "b"; �迭[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
				//���ܹ߻��� ����Ŭ����
			System.out.println("���ܹ߻�: " + e);
		}
		
		//p.426
		try {
			String data1 = "100"; //���ڿ�
			String data2 = "a100"; // ���ڿ�
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data1);// a���־ ������ ǥ�� �Ұ�
						//Integer.parseInt( ���ڿ� ); ���ڿ� -> ����
			// ���� �߻� ���� : ���ڿ��� ���������� ��ȯ�� ���������� ���ڿ��� �������� ��ȯ�� �Ұ���
			// ������ �߻��ϸ� catch �̵� [ ���� �߻� ���� �ڵ� ����x ]
		}catch(NumberFormatException e) {
			System.out.println("���ܹ߻�: " + e);
		}
		
		// p.428
			Dog dog = new Dog();
			String ���ڿ� = "���缮";	// �ڹ� Ŭ������ �ϳ�
			Object ���۰�ü ; 			// �ڹ� Ŭ������ �ֻ��� Ŭ����
			
			���۰�ü = ���ڿ�;			//
			���ڿ� = (String)���۰�ü;
				// ��������ȯ
				// �����߿� ����ȯ
		// ����ó�� �Ǵ�
			// �����(���������) ���õ� �ڵ� [ ������ ����ó�� ]
		
		
		// ����ó�� �Ǵ�
		
					
		
				
		
	}
}


