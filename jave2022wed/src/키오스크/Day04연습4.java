package Ű����ũ;

import java.util.Scanner;

public class Day04����4 {
	// ���Ǳ� ���α׷�
	// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			// 1. �޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ�
			// 2. ��� �����ϸ� �˸�( ������)
	// 2. �ʱ� ��� [ ��ǰ10���� ]
	// 3. ������ �ݾ��� �Է¹޾� ������ ��ŭ ������ �ܵ� ���
			// 1. ������ �ݾ׺��� �������� �� ��ũ�� ���� ��� [ �ݾ׺��� ]
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int ���� = 10; int ȯ�� = 10; int ���� = 10;
		int �� =0; int ȯ = 0; int �� = 0;
		
		while(true) {
			System.out.println("------------------------------���Ǳ�-----------------------");
			System.out.println("1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.����");
			System.out.println("���� >>"); int ch = s.nextInt();
			
			if(ch == 1) {
				if(���� != 0) {
					System.out.println("�ݶ� ��ҽ��ϴ�");
					����--;
					��++;
				}else {
					System.out.println("�ݶ���� �����ϴ�;");
				}
			}else if(ch == 2) {
				if(ȯ�� != 0) {
					System.out.println("ȯŸ�� ��ҽ��ϴ�");
					ȯ��--;
					ȯ++;
				}else {
					System.out.println("ȯŸ��� �����ϴ�;");
				}
			}else if(ch == 3) {
				if(���� != 0) {
					System.out.println("���̴ٸ� ��ҽ��ϴ�");
					����--;
					��++;
				}else {
					System.out.println("���̴���� �����ϴ�;");
				}
			}else if(ch == 4) {
				System.out.println("-------------------����â---------------------");
				System.out.println("��ǰ��\t����\t����");
				if(�� != 0) {System.out.printf("%s\t%d\t%d\n", "�ݶ�", ��, �� * 300);}
				if(ȯ != 0) {System.out.printf("%s\t%d\t%d\n", "ȯŸ", ȯ, ȯ * 200);}
				if(�� != 0) {System.out.printf("%s\t%d\t%d\n", "���̴�", ��, �� * 100);}
				int �� = (�� * 300) + (ȯ * 200) + (�� * 100);
				System.out.println("�Ѱ���: " + ��);
				System.out.println("1.���� 2.���"); int ch2 = s.nextInt();
				if(ch2 == 1) {
					System.out.println("���� �־��ּ���: "); int �� = s.nextInt(); 
					while(true) {
						if(�� > ��) {
							System.out.println("������ �Ϸ�Ǿ����ϴ�");
							System.out.println("�Ž�����: " + (�� - ��));
							�� = 0; ȯ = 0; �� =0;
							break;
						}else {
							System.out.println("���� �����մϴ�");
							System.out.println("�ٽ� �Ա�"); �� = s.nextInt();
						}
					}
				}else if(ch2 == 2){
					System.out.println("������ ��ҵǾ����ϴ� ��ٱ��ϸ� ���ϴ�");
					���� += ��; ȯ�� += ȯ; ���� += ��;
					�� = 0; ȯ =0; �� =0;
					
				}else {
					System.out.println("�˼������ൿ�Դϴ�");
				}
				
				
			}else {
				System.out.println("�˼������ൿ�Դϴ�.");
			}
		}
	
		
		
		
	}
}
