package Day08;

import java.util.Arrays;
import java.util.Scanner;

//��������// 5.����: 1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���
		//1. 
public class Long {
	//�ʵ� 1.name 2.�ܾ�
		private String name = "ĳ��Ż";
		private int balance;
		private String id; // �񱳸� ����
	
	//������
		public Long() {
			
		}
		public Long(String name, int balance, String id) {
			this.name = name;
			this.balance = balance;
			this.id = id;
		}
	//�޼ҵ�
		public void Management(String[] result) {
			System.out.println("---------------------------------���Ⱑ��----------------------------------");
			System.out.println(name + "�����ѵ�");
			// pw Ȯ��
			System.out.println("��й�ȣ: "); String pw = Day08_05.scanner.next();
			//��й�ȣ Ȯ���۾�
			boolean pwch = false;
			if(result[3].equals(pw)) {
				pwch = true;
			}else {
				System.out.println("��й�ȣ�� �������� �ʽ��ϴ�.");
				return;
			}
			if(pwch == true) {// ��й�ȣȮ���� �Ϸ�Ǹ�
				System.out.println("����ݾ�: "); int br = Day08_05.scanner.nextInt();
				//4 ��ü����
				Long long2 = new Long(name, br, result[0]);
				// ����
				int i = 0;
				for(Long temp : Day08_05.longs) {// null Ȯ��
					if(temp == null) {// null�� Ȯ�εǸ�
						Day08_05.longs[i] = temp;
						System.out.println("�����ǰ ���Լ���");
						return;
					}
					i++;
				}
			}
			
			
			
		}//���Ⱑ�� end
		//�����ȯ
		public void Repayment() {
			
			
		}
		//���� �����
		public void LoanAmount() {
			
		}
	
}
