package ȸ���������뿩���α׷�;

import java.util.Scanner;

//Day07_05Application Ŭ���� : ����� �����ڵ�1
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
public class Application {
	static Book[] b = new Book[100];
	static Member[] mem = new Member[100];
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
					
		while(true) {
			System.out.println("***** ���� �뿩 ���α׷� *****");		
			System.out.println("1. ȸ������, 2.�α��� 3.���̵�ã�� 4.��й�ȣã��"); int ch = s.nextInt();
			
			if(ch == 1) {		
				boolean pass = Member.ȸ������();
				
				if(pass) {
					System.out.println("ȸ�����Լ���");
				}else {
					System.out.println("ȸ�����Խ���");
				}
			}else if(ch == 2) {
				String id = Member.�α���();
				if(id == null) {
					System.out.println("�α��ν���");
				}else if(id.equals("admin")){
					Application.adminmeun(id);
				}else {
					Application.meun(id);
				}
			}else if(ch == 3) {
				Member.���̵�ã��();
			}else if(ch == 4) {
				Member.��й�ȣã��();
			}else {
				System.out.println("�˼����� �ൿ");
			}
			
			
			
		}
	
			
		
	}
	
	public static void meun(String id) {
		while(true) {
			System.out.println("---------���θ޴�---------");
			System.out.println("[1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]");
			int ch = Application.s.nextInt();
			if(ch == 1) {
				
			}else if(ch == 2) {
				System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩ȸ��");
				Book.�������();
			}else if(ch == 3) {
				boolean pass = Book.�����뿩(id);
				if(pass) {
					System.out.println("�뿩����");
				}else{
					System.out.println("�뿩����");
				}
			}else if(ch == 4) {// �����ݳ�
				boolean pass = Book.�����ݳ�(id);
				if(pass) {
					System.out.println("�ݳ�����");
				}else{
					System.out.println("�ݳ�����");
				}
			}else if(ch == 5) {
				break;
			}else {
				System.out.println("�˼����� �ൿ");
			}
			
		}			
	}
	
	public static void adminmeun(String id) {
		while (true) {
			System.out.println("������ �޴�");
			System.out.println("[1. ������� 2.������� 3.�������� 4.�α׾ƿ�]");
			int ch = Application.s.nextInt();
			if(ch == 1) {
				boolean pass = Book.�������();
				if(pass) {
					System.out.println("��ϼ���");
				}else {
					System.out.println("��Ͻ���");
				}
			}else if(ch == 2) {
				System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩ȸ��");
				Book.�������();
			}else if(ch == 3) {
				Book.��������();
			}else if(ch == 4) {
				break;
			}else {
				System.out.println("�˼������ൿ");
			}
			
			
		}
	}
}
