package Ÿ�̾��;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		
		������ ������ = new ������();
		int ����� = 0; // �����
		int hp1 = 10; // ����hp
		int hp2 = 10; // ����hp
		int hp3 = 10; // �ü�hp
		int lv = 6;   // ���緹��
		int lv1 = 6;  // ��������
		int lv2 = 6;  // �ü�����
		Scanner s = new Scanner(System.in);
		System.out.println("��HP: ");
		int hp = s.nextInt();
		
		for(int i = 0; i < hp ; i++) {
			int ��� = ������.��ɽ���();
			switch (���) {
			case 1:
				System.out.println("���ο� ��������");
				������.���� = new ����(hp1, lv);
				hp1 += 3;
				lv++;
				�����++;
				break;
			case 2:
				System.out.println("���ο� ��������");
				������.������ = new ����(hp2, lv1);
				hp2 += 2;
				lv1++;
				�����++;
				break;
			case 3:
				System.out.println("���ο� �ü�����");
				������.���� = new �ü�(hp3, lv2);
				hp3 += 1;
				lv2++;
				�����++;
				break;	
			}
		}
		System.out.println("������� => �� Hp: " + hp +" | " + "����ڼ�: " + �����);
	}	
}
