package ����Ϲ�ũ���α׷�;

import java.util.Scanner;

// ����� ��ũ ���α׷� [ 2�� ���� ] 
// �䱸����
	// ȸ�� �ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	// �ֿ���: 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� 7.�α׾ƿ�
	// 5.����: 1.���Ⱑ�� 2. �����ȯ 3.��������� 4.�ڷΰ���
		// ���� : ����, ����, ȸ��
		// �ʵ�
			//����: 1.ȸ����ȣ 2.���¹�ȣ 3.�ܾ�
			//ȸ��: 1.ȸ����ȣ 2.���̵� 3.��й�ȣ 4.�̸� 5.����ó
			//����: 1.���¹�ȣ 2.������ 3.ȸ����ȣ 4.���������
		//�޼ҵ� 1. ȸ������ 2.�α��� 3. ���̵�ã�� 4.��й�ȣã��
		//		5.���»��� 6.�Ա� 7.��� 8.��ü 6.���¸��
		//    	7.���Ⱑ�� 8.�����ȯ 9.���������Ȯ��
public class ����Ϲ�ũ���α׷� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) { // ���α׷�����
			System.out.println("**** �α��� â ****");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("id: ");
				System.out.println("pw: ");
				System.out.println("name: ");
				System.out.println("phone: ");
				System.out.println("");
				boolean pass = Contorller.ȸ������();
				if(pass) {
					System.out.println("ȸ�����Լ���");
				}else {
					System.out.println("ȸ�����Խ���");
				}
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else if(ch == 4) {
				
			}else {
				System.out.println("�˼������ൿ");
			}
		}
		
		
	}
	//////////////////////////////////////////////
	public static void ���θ޴�() { // ȸ����ȣ �������� 
		
	}
	public static void ����ȭ��() {// ȸ����ȣ ��������
		
	}
}




