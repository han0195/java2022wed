package Day12;

public class Day12_02 {
	
	public static void main(String[] args) {
		
		// String �޼ҵ�
		// p.499 charAt() : ���ڿ����� Ư������ ����
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) { // switch ��� [ switch( �˻��� ) ]
			case '1' :	// sex ������ ���� ���� 1 �̸�
			case '3' : System.out.println("����"); break;// sex ������ ���� ���� 2�̸�
			case '2' :	// sex ������ ���� ���� 3 �̸�
			case '4' : System.out.println("����"); break;// sex ������ ���� ���� 4�̸�
		}
		// p.501 equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			// String Ŭ���� ����ϴ� ��ü�� == ������ ���Ұ���
		
		// �ڹ� �޸� [JVM]
			// ���� �޸� : ���� ����
			// �� �޸�	: ��ü
			// �޼ҵ� �޸�
		
		
		// 1. ���ڿ� ����
		String strVar1 = new String("�Ź�ö");		
		String strVar2 = "�Ź�ö";			// ��ü�� new�����ڰ� �ʼ������� String Ŭ������ �ڵ�
		
		//2.���ڿ� ��
		if( strVar1 == strVar2 ) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		//3.
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		}else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
		//p. 502 ,getbytes(); "���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���";
		// ���ڿ� -> ����Ʈ�� ��ȯ
		byte[] bytes2 = str.getBytes();
		System.out.println(bytes2.length);
		// ����Ʈ�� -> ���ڿ� ��ȯ
		String str1 = new String(bytes2);
		System.out.println("����Ʈ�� -> ���ڿ�: " + str1);
		try {
			// 1. ���ڵ�Ÿ�� [���ڵ�/���ڵ�]
			byte[] bytes3 = str.getBytes("EUC-KR"); // �Ϲݿ��� �߻�
			System.out.println("EUC-KR ����: " + bytes3.length );
			String str2 = new String( bytes3, "EUC-KR");
			System.out.println("����Ʈ�� -> ���ڿ� : " + str2);
			
			
			
			
			//p.540
			String subject = "�ڹ� ���α׷���";
			
			int location = subject.indexOf("���α׷���");
			System.out.println(location); // 3�� �ε������� ���α׷��� ã�� ����
			// ���ڿ��� Ư�����ڿ� ��ġ[�ε���] ã�� / ���࿡ ������ -1 [����]
			if(subject.indexOf("�ڹ�") != -1 ) { // �ε����� 0�� ���� -1 ����
				System.out.println("�ڹٿ� ���� å");	
			}else {
				System.out.println("�ڹٿ� ���� ���� å");
			}
			
			
			
			
			// p.505 length() : ���ڿ� ����
			String ssn2 = "7306241230123";
			int length = ssn.length(); // ���ڿ��� ���� ���� [ ���� ���ϱ� ]
			if( length == 13 ) { // ���࿡ ���ڿ��� 13���� �̸�
				System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�");
			}else {
				System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�");
			}
		System.out.println("------------------------------------------");
				// p.506 replace( "�⺻����", "���ο��" ) : ���ڿ� ��ġ[����]
				String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� ApI�� �����մϴ�.";
				String newStr = oldStr.replace("�ڹ�", "JAVA");
								// ���ڿ�.replace("��������", "���ο��");
				System.out.println("�������ڿ� : " + oldStr);
				System.out.println("�������ڿ� : " + newStr);
				
				//p.507 substring() vs split() : ���ڿ� �ڸ��� => �ε��� ����
				String ssn3 = "880815-1234567";
				
				String firstNum = ssn3.substring(0,6);		
				System.out.println("Ȯ��: " + firstNum);
				
				String seconNum = ssn3.substring(7);
				System.out.println("Ȯ��: " + seconNum);
				// split => ���ڱ���
					// "880815-1234567" "-" ���� �ڸ��� 2���� -> �迭��ȯ
					// [0] : 880815 [1] : 1234567
				System.out.println("�պκ�: " + ssn3.split("-")[0]);
				
				//p.510 valueOf() : �⺻Ÿ��[int, double ��] -> ���ڿ� ��ȯ
				String str3 = String.valueOf(10);// int�� 10�� ���ڿ��� ��ȯ
				String str4 = String.valueOf(10.5);// double�� 10.5�� ���ڿ� 10.5�κ�ȯ
				String str5 = String.valueOf(true);//���ڿ��� ��ȯ
				
				System.out.println(str3 + 10);
				
			
			
			
			
		}catch(Exception e){
			
		}
		
		
	}
	
	
	
}
