package ����������;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors01 {
		//�غ� ��������[�÷��̾�, ��ǻ��[���� ����], ���Ӽ�, �÷��̾� �¸���]
		//���α׷� ����
			// 1.���� 2.���� 3.�� 4.����
			// ������ �¸��Ǵ�
				//�ݺ�
			// 4. ���� ������
			// ����Ƚ��, �÷��̾� ��ǻ�� �¸�����
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rando = new Random();
		int �÷��̾�;
		int ��ǻ��;
		int ���Ӽ� = 0;
		int �÷��̾�¸��� = 0;
		int ��ǻ�ͽ¸��� = 0;
		
		
		while (true) {
			System.out.println("---------------------����������--------------------");
			System.out.println("0.���� 1.���� 2.�� 3.����");
			System.out.println("����>>"); �÷��̾� = scan.nextInt();
			��ǻ�� = rando.nextInt(3);
			
			if(�÷��̾� >=0 && �÷��̾� <= 2) {
				if(�÷��̾� == 0 && ��ǻ�� == 2 || �÷��̾� == 1 && ��ǻ�� == 0 || �÷��̾� == 2 && ��ǻ�� == 1) {
					System.out.println("�¸�");
					���Ӽ�++;
					�÷��̾�¸���++;
				}else if(�÷��̾� == ��ǻ��) {
					System.out.println("���º�");
					���Ӽ�++;
				}else {
					System.out.println("�й�");
					���Ӽ�++;
					��ǻ�ͽ¸���++;
				}
			}else if(�÷��̾� == 3) {
				System.out.println("------------------��������----------------");
				System.out.println("�Ѱ��Ӽ�: "+ ���Ӽ�);
				System.out.print("�¸�����: ");
				if (�÷��̾�¸��� > ��ǻ�ͽ¸���) {
					System.out.println("�÷��̾�¸�");
					break;
				}else if(�÷��̾�¸��� == ��ǻ�ͽ¸���) {
					System.out.println("���º�");
					break;
				}else {
					System.out.println("��ǻ�ͽ¸�");
					break;
				}
			}else {
				System.out.println("�˼����� �ൿ");
			}
			
		}
		
		
		
	  }
	}

