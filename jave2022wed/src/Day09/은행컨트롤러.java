package Day09;

import java.util.Random;

public class ������Ʈ�ѷ� {//Ŭ����

	// �ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
	// M : ��[ ������ ]
	// V : �� [ ����� ]
	// C : ��[M]�� ��[V] ���� ��Ȱ
	
	// �信�� ��û�ϴ� ���� [���] ����
		//1. ���»��� [ C ]
	public String ���»���(String pw, String name, int �����ȣ) {
		
		// 1. �Է¹��� ���� �����´�
			//���¹�ȣ �ڵ�����
		String ���¹�ȣ = null;
		while (true) {
			Random random = new Random(); // ����
			//4�ڸ� ����
			int ���� = random.nextInt(10000); // 0~9999;
				���¹�ȣ = String.format("%04d", ����);
							//�������� ����
								//%d ����
								//%d4 ���� 4�ڸ� [ ���� �ڸ��� ������ ����ó�� ]
										// 15 -> "  "15
								//%04d ���� 4�ڸ� [���� �ڸ��� ������ 0ó��]
										// 15 -> 0015
			//�ߺ�üũ			
		
				boolean ���¹�ȣ��� = true;
				for(Bank temp : Day09_06_�������.banklist) {
					if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
						���¹�ȣ��� = false;
					}
				}
				if(���¹�ȣ���) {
					break;
				}
		}
												
		// 2. ��üȭ [�ܼ��� ������ �ϳ��� ��ü�� ����� ]
			Bank temp = null;
			if(�����ȣ == 1) {
				temp = new ��������(���¹�ȣ, pw, name, 0);
			}else if(�����ȣ == 2) {
				temp = new ��������(���¹�ȣ, pw, name, 0);
			}else if(�����ȣ == 3) {
				temp = new �ϳ�����(���¹�ȣ, pw, name, 0);
			}
		// 3. �迭�� ����
		int i = 0;
		for(Bank temp2 : Day09_06_�������.banklist) {
			if(temp2 == null) {
				Day09_06_�������.banklist[i] = temp;
				return ���¹�ȣ;
			}
			i++;
		}
		return null;
	}
		//2. �Ա� [ U ] 
	public int �Ա�(String ���¹�ȣ, int money) {
		//�ش���� ã��
		for(Bank temp : Day09_06_�������.banklist) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
				temp.set���ݾ�(temp.get���ݾ�() + money);
				return temp.get���ݾ�();
			}
		}
		return 0;
	}
		//3. ���	[ U ]
	public int ���(String ���¹�ȣ, String pw, int money) {
		//�ش���� ã��
				for(Bank temp : Day09_06_�������.banklist) {
					if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
						if(temp.get��й�ȣ().equals(pw)) {
							if(temp.get���ݾ�() > money) {
								temp.set���ݾ�(temp.get���ݾ�() - money);
								return temp.get���ݾ�();
							}else {
								return 1;
							}
						}else {
							return 0;
						}
					}
				}
				return 0;
	}
		//4. ��ü	[ U ]
	public int ��ü( String ���¹�ȣ, String pw, int money, String �޴°���) {// ���� ���� / ��й�ȣ / ��ü�ݾ�
		//1. �����Ѱ��� �� ��й�ȣ�� ã��
		//2. �޴°��� ã��
		//3. ���ΰ��¿��� ��ü�ݾ��� ���� / �޴°��¿��� ��ü�ݾ��� ���ϱ�
		//���ϰ���� ��: 1.���� 2.����[���ΰ��� ���� Ʋ��, �޴� ���� ����Ʋ��, �ܾ� ����]
		int i = 0;
		for ( Bank temp : Day09_06_�������.banklist) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ) &&
					temp.get��й�ȣ().equals(pw)) {
				int j = 0;
				for(Bank temp2 : Day09_06_�������.banklist) {
					if(temp2 != null && temp2.get���¹�ȣ().equals(�޴°���)) {
						
						if(temp.get���ݾ�() < money) {
							return 1;
					}else {
						Day09_06_�������.banklist[i].set���ݾ�(temp.get���ݾ�() - money);
						Day09_06_�������.banklist[j].set���ݾ�(temp2.get���ݾ�() + money);
						return 2;
					}
					
				}
					j++;
			}
		}
			i++;
		}
		return 4;
	}
		//5. �����¸�� [ R ]
	public Bank[] ���¸��(String name) {
		//�Է¹��� �������� ���¸�� ���� ��ȯ
								//�μ� : �ܺη� ����� ������
			//������ �������� ���¸� ã�Ƽ� �����¸���� ����
		Bank[] �����¸�� = new Bank[100];
		for(Bank temp : Day09_06_�������.banklist) {
			if(temp != null && temp.get������().equals(name)) {
				//�ش� ���³� �����ֿ� �μ��� �����ֿ� �����ϸ�
				//�����¸�� �迭�� ������� ã�Ƽ� �����¸�Ͽ� �ֱ�
				int i = 0;
				for( Bank temp2 : �����¸��) {
					if(temp2 == null) {
						�����¸��[i] = temp; break;
					}
					i++;
				}
			}
		}			
		
		return �����¸��;
	}
		//6. ���� [ U ]
	public boolean ����() {
		return false;
	}
}	
