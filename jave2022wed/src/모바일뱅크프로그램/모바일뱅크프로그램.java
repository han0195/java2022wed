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
	static Scanner s = new Scanner(System.in); // �Է°�ü ����
	public static void main(String[] args) {
		while(true) { // ���α׷�����
			System.out.println("**** �α��� â ****");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			int ch = s.nextInt(); // �����Է¹ޱ�
			if(ch == 1) {//ȸ������
				System.out.println("id: "); String id = s.next();
				System.out.println("pw: ");	String pw = s.next();
				System.out.println("name: "); String name = s.next();
				System.out.println("phone: "); String phone = s.next();
				boolean pass = Contorller.ȸ������(id, pw , name, phone); // id pw name phone �ָ鼭 ȸ������ �޼ҵ����
				if(pass) {//ȸ�������� ����
					System.out.println("ȸ�����Լ���");
				}else {//����
					System.out.println("ȸ�����Խ���");
				}
			}else if(ch == 2) {//�α���
				System.out.println("id: "); String id = s.next(); 
				System.out.println("pw: "); String pw = s.next();
				int idpwpass = Contorller.�α���(id, pw); //id pw �ָ鼭 �α��θ޼ҵ� ȣ��
				if(idpwpass == -1) { // ȸ����ȣ -1�� ��ȯ�Ǹ�
					System.out.println("�α��ν���");
				}else { // ������ �����Ǹ� 
					System.out.println("�α��μ���");
					System.out.println(idpwpass);
					���θ޴�(idpwpass); // ���θ޴����� ȸ����ȣ�� �ָ鼭 ���
				}
				
			}else if(ch == 3) {
				System.out.println("name: "); String name = s.next();
				System.out.println("phone: "); String phone = s.next();
				Contorller.���̵�ã��(name, phone);
				
			}else if(ch == 4) {
				System.out.println("id: "); String id = s.next();
				System.out.println("phone: "); String phone = s.next();
				Contorller.��й�ȣã��(id, phone);
			}else {
				System.out.println("�˼������ൿ");
			}
		}
		
		
	}
	//////////////////////////////////////////////
	public static void ���θ޴�(int bno) { // ȸ����ȣ �������� 
		while (true) {
			System.out.println("--------- ���� ���� -----------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���¸�� 6.���⼭��");
			int ch = s.nextInt(); // �����Է¹ޱ�
			if(ch == 1) {
				System.out.println("����Ͻ� ���º�й�ȣ: "); String pw = s.next();
				boolean pass = Contorller.���»���(bno, pw); // ���»����޼ҵ� ȣ��
				if(pass) {
					System.out.println("���»��� ����");
				}else {
					System.out.println("���»��� ����");
				}
			}else if(ch == 2) {
				System.out.println("�Ա��Ұ���: "); String ���¹�ȣ = s.next();
				System.out.println("�Աݾ�: ");	int mon = s.nextInt();
				boolean pass = Contorller.�Ա�(���¹�ȣ, mon);
				if(pass) {
					System.out.println("�Ա� ����");
				}else {
					System.out.println("�Ա� ����");
				}
			}else if(ch == 3) {
				System.out.println("��ݰ���: "); String num = s.next();
				System.out.println("pw: "); String pw = s.next();
				System.out.println("��ݾ�: "); int mon = s.nextInt();
				boolean pass = Contorller.���(num, pw, mon);
				if(pass) {
					System.out.println("��� ����");
				}else {
					System.out.println("��� ����");
				}
			}else if(ch == 4) {//��ü
				System.out.println("��ݰ���: "); String num = s.next();
				System.out.println("�Աݰ���: ");	String num2 = s.next();
				System.out.println("��ü��");		int mon = s.nextInt();
				boolean pass = Contorller.��ü(num, num2, mon);
				if(pass) {
					System.out.println("��ü ����");
				}else {
					System.out.println("��ü ����");
				}
			}else if(ch == 5) {//���¸��
				Contorller.���¸��(bno);
			}else if(ch == 6) {//������
				����ȭ��(bno);
			}else if(ch == 7){
				break;
			}else {
			System.out.println("�˼����� �ൿ");
			}	
		}
		
	}
	public static void ����ȭ��(int bno) {// ȸ����ȣ ��������
		while(true) {
			System.out.println("**** ���⼭�� ****");
			System.out.println("1.���Ⱑ�� 2.�����ȯ 3.��������� 4.�ڷΰ���");
			int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("����ݾ�: "); int money = s.nextInt();
				System.out.println("pw: "); String pw = s.next();
				
				boolean pass = Contorller.���Ⱑ��(money, pw, bno);
				if(pass) {
					System.out.println("���Ⱑ�� ����");
				}else {
					System.out.println("���Ⱑ�� ����");
				}
			}else if(ch == 2) {
				System.out.println("��ݰ���: "); String ��ݰ��� = s.next();
				System.out.println("��й�ȣ: "); String pw = s.next();
				System.out.println("�����ݾ�: "); int money = s.nextInt();
				boolean pass = Contorller.�����ȯ(��ݰ���, pw, money, bno);
				if(pass) {
					System.out.println("�����ȯ ����");
				}else {
					System.out.println("�����ȯ ����");
				}
			}else if(ch == 3) {
				Contorller.���������Ȯ��(bno);
			}else if(ch == 4) {
				break;
			}else {
				System.out.println("�˼����� �ൿ�Դϴ�");
			}
			
		}
	}
}




