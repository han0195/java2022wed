package ����������α׷�;

import java.util.ArrayList;
import java.util.Scanner;

public class ������� {
	//����������α׷� [���]
		// ����[super] => �ʵ� [ 1.���¹�ȣ, 2.��й�ȣ, 3.������, 4.���ݾ� ]
		// ��������[sub], ��������[sub], �ϳ�����[sub]
		// �� ��� : 1. ���»��� 2.�Ա� 3. ��� 4.��ü 5.�����¸�� 6.����
	public static ArrayList<����> bank = new ArrayList<����>();// ����Ŭ���� ����Ʈ ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);// �Է°�ü ����
		
		while (true) {//���α׷�����
			System.out.println("------------ ���� ���� ���α׷� ------------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����");
			int ch = s.nextInt();// �����Է¹ޱ�
			
			if(ch == 1) {// ���¹�ȣ����
				System.out.println("1.�������� 2.�������� 3.�ϳ�����"); int ���༱�� = s.nextInt();
				System.out.println("��й�ȣ: "); String pw = s.next();// ��й�ȣ �Է¹ޱ�
				System.out.println("������: "); String name = s.next();// �̸��Է� �ޱ�
				boolean pass = ������Ʈ�ѷ�.���»���(���༱��, pw, name);
				if(pass) {//����
					System.out.println("���»��� ����");
				}else {//����
					System.out.println("���»��� ����");
				}
				
			}else if(ch == 2) {// �Ա�
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = s.next();
				System.out.println("�Աݾ�: ");	int �Աݾ� = s.nextInt();
				boolean pass = ������Ʈ�ѷ�.�Ա�(���¹�ȣ, �Աݾ�);
				if(pass) {
					System.out.println("�Ա� ����");
				}else{
					System.out.println("�Ա� ����");
				}			
			}else if(ch == 3) {// ���
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = s.next();
				System.out.println("��й�ȣ: "); String ��й�ȣ = s.next();
				System.out.println("���: ");	int ��ݾ� = s.nextInt();
				boolean pass = ������Ʈ�ѷ�.���(���¹�ȣ, ��ݾ�, ��й�ȣ);
				if(pass) {
					System.out.println("��� ����");
				}else {
					System.out.println("��� ����");
				}
			}else if(ch == 4) {// ��ü
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = s.next();
				System.out.println("��й�ȣ: "); String pw = s.next();
				System.out.println("�޴°��¹�ȣ: "); String �޴°��� = s.next();
				System.out.println("��ü��: "); int �ݾ� = s.nextInt();
				boolean pass = ������Ʈ�ѷ�.��ü(���¹�ȣ, pw, �޴°���, �ݾ�);
				if(pass) {
					System.out.println("��ü ����");
				}else {
					System.out.println();
				}
			}else if(ch == 5) {// �����¸�Ϻ���
				System.out.println("�̸�: "); String name = s.next();
				������Ʈ�ѷ�.�����¸��(name);
			}else if(ch == 6) {//����
				
			}
			else {
				System.out.println("�˼����� �ൿ");
			}
			
		}// while end
		
	}// me
}// ce
