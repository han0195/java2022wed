package Ű����ũ;

import java.util.Scanner;

public class Day04����2 {
	//���Ǳ� ���α׷�
	// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			// 1. �޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ�
			// 2. ��� �����ϸ� �˸�( ������)
	// 2. �ʱ� ��� [ ��ǰ10���� ]
	// 3. ������ �ݾ��� �Է¹޾� ������ ��ŭ ������ �ܵ� ���
			// 1. ������ �ݾ׺��� �������� �� ��ũ�� ���� ��� [ �ݾ׺��� ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� =0;
		int �ݶ� = 0; int ȯŸ = 0; int ���̴� = 0;
		
		while(true) {
			System.out.println("---------------------------���Ǳ�----------------------------");
			System.out.println("1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.����");
			System.out.println("����>> "); int ch = scan.nextInt();
			if(ch == 1) {
				if( �ݶ���� != 0 ) {
					System.out.println("�ݶ� ��ҽ��ϴ�");
					�ݶ����--;
					�ݶ�++;
				}else {
					System.out.println("�ݶ���� �����ϴ�");
				}				
			}else if(ch == 2) {
				if( ȯŸ��� != 0 ) {
					System.out.println("ȯŸ�� ��ҽ��ϴ�");
					ȯŸ���--;
					ȯŸ++;
				}else {
					System.out.println("ȯŸ��� �����ϴ�");
				}				
			}else if(ch == 3) {
				if( ���̴���� != 0 ) {
					System.out.println("���̴ٸ� ��ҽ��ϴ�");
					���̴����--;
					���̴�++;
				}else {
					System.out.println("���̴���� �����ϴ�");
				}				
			}else if(ch == 4) {
				System.out.println("-------------------------------����â------------------------");
				System.out.println("��ǰ��\t����\t����");
				if( �ݶ� != 0) {System.out.printf("%s\t%d\t%d\n", "�ݶ�", �ݶ�, �ݶ� * 300);}
				if( ȯŸ != 0) {System.out.printf("%s\t%d\t%d\n", "ȯŸ", ȯŸ, ȯŸ * 200);}
				if( ���̴� != 0) {System.out.printf("%s\t%d\t%d\n", "���̴�", ���̴�, ���̴� * 100);}
				int �� = (�ݶ� * 300) + (ȯŸ * 200) + (���̴� * 100);
				System.out.println("�Ѱ���: " + ��);
				System.out.println("1.���� 2.���"); int ch2 = scan.nextInt();
				if(ch2 == 1) {
					System.out.println("���� �Ա����ּ���"); int �� = scan.nextInt();
					while (true) {
						if(�� > ��) {
							System.out.println("������ �Ϸ�Ǿ����ϴ�");
							System.out.println("�Ž�����: " + (�� - ��));
							�ݶ� = 0; ȯŸ =0; ���̴� = 0;
							break;
						}else {
							System.out.println("���� �����մϴ� �Ա�: "); �� = scan.nextInt();
						}
					}
					
				}else if(ch2 == 2){
					System.out.println("������ ��ҵ˴ϴ� ��ٱ��� �ʱ�ȭ");
					�ݶ���� += �ݶ�; ȯŸ��� += ȯŸ; ���̴���� += ���̴�;
					�ݶ� = 0; ȯŸ = 0; ���̴� = 0;
				}else {
					System.out.println("�˼����� �ൿ�Դϴ�");
				}
				
			}else {
				System.out.println("�˼����� �ൿ�Դϴ�");
			}
		}
		
		
		
		
		
	}

}
