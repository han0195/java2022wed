package �����˻����α׷�;

import java.io.IOException;

public class �����˻� {
	// ���� �˻� ���α׷�
			// [����]
			// 1. �Է¹ޱ� [ System.in.read() ]
			// 2. String �迭�� ���� ������ ���� 
				//		String[] ������� = {	
				//			"�ȴ�! ���̹� ��α�&����Ʈ",
				//			"������ ��Ʈ ���� Ȱ�� ������",
				//			"Tucker�� Go ��� ���α׷���",
				//			"ȥ�� �����ϴ� C ���"
				//};
			// 3. �˻���� , ������� 
				// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
						// '���' �˻� ->  "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"
					// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� 
						// '����' ���� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ�
	
	public static void main(String[] args) throws IOException { // 16 : 23   // 3
		String[] ������� = {"å1","å2","å3"};
		
		while(true) { 
			
			System.out.println("***** �����˻� ���α׷� *****");
			System.out.println("1.�˻� 2.����");
			byte[] bytes = new byte[100]; //����Ʈ�迭 ���� 
			int count = System.in.read(bytes); // �Է¹ޱ�		
			String ch = new String(bytes, 0, count - 2); //???
			
			if(ch.equals("1")) {
				System.out.println("�˻�: ");
				count = System.in.read(bytes);  // �Է¹ޱ�
				String search = new String(bytes, 0 , count -2); // �Է°� ����
				
				for(String tmep : �������) { // ������� �������� 
					
					if(tmep.contains(search)) { // ������ϵ��� �ȿ� ���뿡�� �Է°��� ���� 
						System.out.println(tmep); // ���
					}
					
				}// for end
			}else if(ch.equals("2")) {
				System.out.println("*** ���� ***");
				System.out.println("������ ������[�Ϻ�]");
				count = System.in.read(bytes); // �Է°��ޱ�(�ƽ�Ű�ڵ�? ���ڷ�)
				String search = new String(bytes, 0, count - 2); // �Է°� ���� 
				int i = 0;
				for(String temp : �������) { // ������� ��������
					if(temp.contains(search)) { // �Է°� ���
						System.out.println("������ȣ" + i + "�� ����� : " + temp);
					}
					i++;
				}
				System.out.println("������ȣ ����: "); // ������ȣ [�ε���]
				count = System.in.read(bytes); // �Է�
				String ch2 = new String(bytes , 0 , count-2); // ����
				int index = Integer.parseInt(ch2);
				

				System.out.println("���� ����");
				count = System.in.read(bytes);
				String a = new String(bytes, 0 , count - 2 );
				System.out.println("���ο� ����");
				count = System.in.read(bytes);
				String d = new String(bytes, 0 , count - 2 );
				�������[index] = �������[index].replace( a,d); // ����
				System.out.println("���� �Ǿ����ϴ�");
			}
		}// ���α׷� ���� end
		
	}// me
}// ce
