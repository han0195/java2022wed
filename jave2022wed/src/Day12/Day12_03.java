package Day12;

import java.io.IOException;

public class Day12_03 {
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
			
	public static void main(String[] args) throws IOException {
		
		String[] ������� = {"�ȴ�! ���̹� ��α�&����Ʈ", "������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C ���"};	
		
		
		while (true) {
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); 
			
			String ch = new String(bytes, 0 , count - 2); // ����Ʈ�迭 -- > ���ڿ� ��ȯ [ -2 = \n\r ����]
			
			if(ch.equals("1")) {
			System.out.println("�˻�: ");
			count = System.in.read(bytes); 
			String search = new String(bytes, 0 , count -2);
			
			for(String tmep : �������) {
				//���1
//				if(tmep.indexOf(search) != -1) {
//					//indexOf �޼ҵ� -1 ��ȯ�Ǵ°��� ������ �ܾ ������� [�˻�x]
//					System.out.println(tmep); // �ش� ���ڿ��� ã�����ڰ� �����ϸ� ���
//				}
				//���2
				if(tmep.contains(search)) { // ���ڿ�.Contains('ã������') : ���ڿ��� ã�����ڰ� true
					System.out.println(tmep);
				}
				
				
			}
					
				
			}else if(ch.equals("2")) {
				System.out.println("*** ���� ***");
				System.out.print("������ ������[�Ϻ�]");
				count = System.in.read(bytes);
				String search = new String(bytes, 0, count - 2); // 0�� �ε��� ����Ʈ���� -2 ������ �ε�������
				int i = 0;
				for(String temp : �������) {
					if(temp.contains(search)) {
						System.out.println("������ȣ" + i + "�� ����� : " + temp);
					}
					i++;
				}
				//������ȣ [ �ε��� ] �Է¹޾� �����ϱ�
				System.out.println("������ȣ ����: ");
				count = System.in.read(bytes);
				String ch2 = new String(bytes , 0 , count-2);
				int index = Integer.parseInt(ch2);
				
				// ch2 ���ڿ��� �Է¹��� ---> �ε���[����] ��ȯ
				System.out.println("���� ����");
				count = System.in.read(bytes);
				String a = new String(bytes, 0 , count - 2 );
				System.out.println("���ο� ����");
				count = System.in.read(bytes);
				String d = new String(bytes, 0 , count - 2 );
				// ����ó��
				�������[index].replace( a,d);
				// �迭�� ������ = ������ ������
				System.out.println("���� �Ǿ����ϴ�");
				
				
				
			}
		}
		
	}
}
