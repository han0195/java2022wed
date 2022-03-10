package Day07;

import java.util.Arrays;
import java.util.Scanner;

public class Day07_05Application {
	
	//Day07_05Application Ŭ���� : ����� �����ڵ�
	//Book Ŭ���� : ���� ���� �ڵ�
	//Member Ŭ���� : ȸ�� ���� �ڵ�
	
	//* ���� �뿩 console ���α׷�[ Ŭ���� ���� ]
		// 1. Ŭ���� ����
			//1. book
				//�ʵ� : ISBN(������ȣ), ������, �۰�, �����뿩����, �뿩ȸ��
				//�޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 1.������� 2.��������
	
			//2. member
				//�ʵ� : ��ȣ, ȸ�����̵�, ��й�ȣ, �̸�, ����ó
				//�޼ҵ� : 1. ȸ������ 2.�α��� 3.���̵�ã��
	
			//2. ȭ�� ����
				//1. �ʱ� �޴�[ 1. ȸ������, 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� ]
				//2. �Ϲ�ȸ���޴� [1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]
				//3. �����ڸ޴� [1. ������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�]
	
	// * main �ۿ� ������ �����ϴ� ������ : ��� ��ȣ���� ����ϱ�����
		//�������� {} �ȿ�
			//���δٸ� {} ������ ���Ұ�
		// static : ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ����� �޸� �ʱ�ȭ
			// ���α׷� ���������� ������ ���Ǵ� �޸�[����]
	
	// ��� ��ȣ���� �������� Ŭ������ �Է°�ü ����
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] book = new Book[100];
	
	// 0. �ڵ带 �о��ִ� ���� �޼ҵ� [ ������ ]
	public static void main(String[] args) {
	
		//�޼ҵ� ȣ�� 
		// 1. menu(); ����ȣ�� �Ұ���
			// static : �޸� �켱�Ҵ� �̱� ������ static �� �޼ҵ�, �ʵ� x
			// main �޼ҵ� static �޼ҵ� �̱⶧���� static �޼ҵ常 ����ȣ�� ����
		//2. �ܺ�ȣ��
			// 1. ��ü ����(�޸��Ҵ�) -> �޼ҵ� ȣ��
			Day07_05Application appli = new Day07_05Application();
			appli.menu();
	} //me
	
	//1. �ʱ� �޴� �޼ҵ� 
	void menu() {
		while (true) {
			System.out.println("-------------------- ���� �뿩 ���α׷� -------------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			Member member = new Member();
			int ch = scanner.nextInt();
			if(ch == 1) {
				boolean result = member.ȸ������();
				if( result ) {
					System.out.println("ȸ�����Լ���");
				}else {
					System.out.println("ȸ�����Խ���");
				}
			}
			else if(ch == 2) {
				//�α��� �޼ҵ� ȣ��
					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					// 2. ������ �޴� �޼ҵ� ȣ��
				String result = member.�α���();
				if(result == null) {
					System.out.println("������ ȸ�������� �����ϴ�");
				}else if(result.equals("admin")){
					//2. �����ڸ޴�
					System.out.println("�α��� ����");
					adminmenu(); // ���� �޼ҵ� ȣ��
				}else {
					//1. �Ϲ�ȸ���޴�
					System.out.println("�α��� ����");
					membermeu(result); // �ܺ� �޼ҵ� ȣ�� //**2 ���⼭ �ް�
				}
			}
			else if(ch == 3) {
				//���̵�ã�� �޼ҵ� ȣ��
				member.���̵�ã��();
			}
			else if(ch == 4) {
				//��й�ȣ �޼ҵ� ȣ��
				member.��й�ȣã��();
			}
			else {
				System.out.println("�˼����� ��ȣ");
			}
		}// while end 
	}//menu end
	
	//2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermeu(String result) { // **3 �Ϸ� ���ڸ��ְ�
		while (true) {
			System.out.println("-------------------- ȸ�� �޴� --------------------------");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
			int ch = scanner.nextInt();
			Book book = new Book();
			if(ch == 1) {// �����˻�
				book.�����˻�();
			}else if(ch == 2){//�������
				book.�������();
			}else if(ch == 3){//�����뿩4
				book.�����뿩(result); // **4 ���ڸ� �޾ƿ´�
			}else if(ch == 4){//�����ݳ�
				book.�����ݳ�(result);
			}else if(ch == 5){//�α׾ƿ�
				return;
			}else {// �׿�
				System.out.println("�˼����� �ൿ");
			}	
		}// w e	
	}
	
	//3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while (true) {
			System.out.println("-------------------- ������ �޴� --------------------------");
			System.out.println("1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�");
			int ch = scanner.nextInt();
			Book book = new Book();
			if(ch == 1) {// �������
				book.�������();
			}else if(ch == 2){//�������
				book.�������();
			}else if(ch == 3){//��������
				book.��������();
			}else if(ch == 4){//����(����)
				
			}else if(ch == 5){//�α׾ƿ�
				return;
			}else {// �׿�
				System.out.println("�˼����� �ൿ");
			}	
		}// w e	
	}
	
	
	
	
}// ce
