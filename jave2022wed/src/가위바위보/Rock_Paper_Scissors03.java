package ����������;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors03 {
	//�غ� ��������[�÷��̾�, ��ǻ��[���� ����], ���Ӽ�, �÷��̾� �¸���]
	//���α׷� ����
		// 0.���� 1.���� 2.�� 3.����
		// ������ �¸��Ǵ�
			//�ݺ�
		// 4. ���� ������
		// ����Ƚ��, �÷��̾� ��ǻ�� �¸�����
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int �÷��̾�;
		int ��ǻ��;
		int ���Ӽ� = 0;
		int �÷��̾�¸��� = 0; int ��ǻ�ͽ¸��� = 0;;
		
		while(true) {
			System.out.println("---------------������������-----------");
			System.out.println("0.���� 1.���� 2.�� 3.����");
			System.out.println("����>."); �÷��̾� = scan.nextInt();
			��ǻ�� = random.nextInt(3);
			
			if(�÷��̾� >=0 && �÷��̾� <= 2) {
				���Ӽ�++;
				if(�÷��̾� == 0 && ��ǻ�� == 2 || �÷��̾� == 1 && ��ǻ�� == 0 || �÷��̾� == 2 && ��ǻ�� == 1) {
					System.out.println("�¸�");
					�÷��̾�¸���++;
				}else if(�÷��̾� == ��ǻ��){
					System.out.println("�й�");
					��ǻ�ͽ¸���++;
				}else {
					System.out.println("���º�");
				}
			}else if(�÷��̾� == 3) {
				System.out.println("--------��������--------");
				System.out.println("�Ѱ��Ӽ�: " + ���Ӽ�);
				System.out.print("�¸�: ");
				if(�÷��̾�¸��� > ��ǻ�ͽ¸���) {
					System.out.println("�÷��̾�¸�");
				}else if(�÷��̾�¸��� == ��ǻ�ͽ¸���) {
					System.out.println("��ǻ�ͽ¸�");
				}else {
					System.out.println("���º�");
				}
			}else {
				System.out.println("�˼����� �ൿ");
			}
			
		}
		
	}

}
