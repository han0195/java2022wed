package ƽ����;

import java.util.Random;
import java.util.Scanner;

public class Tic_tac_toe03 {
	/*
	 * ������
	 * 1. 9ĭ ����
	 * 		String �迭�̿�
	 * ����ڿ��� �ε�����ȣ �Է¹ޱ�
	 * 			1.�ش� �ε����� o ǥ�� 
	 * 			2.�̹� �� �ڸ��� ���Է� �Ұ�
	 * 
	 * 3. ��ǻ�ʹ�: 0~8 ���� ���� �߻�
	 * 			1. �ش� �ε����� xǥ��
	 * 			2. �̹� �� �ڸ��� �� ���� ����
	 * 5.�¸��Ǵ�
	 * 		���� �ε������� ����� ��� �����ϸ�
	 * 		012 345 678	3������
	 * 		���� �ε������� ����� ��� �����ϸ�
	 * 		036 147 258
	 * 		�밢�� �ε������� ����� ��� �����ϸ�
	 *      048 246
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		String[] ������ = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]",};
		
		while (true) {
			
			for(int i = 0; i < ������.length; i++) {
				System.out.print(������[i]);
				if(i % 3 == 2) {
					System.out.println();
				}
			}
			
			while(true) {
				System.out.println("���ϴ� �ε����� ����ּ���");
				int ��ġ = scan.nextInt();
				if(������[��ġ].equals("[ ]")) {
					������[��ġ] = "[o]";
					break;
				}else {
					System.out.println("�ش���ġ�� �̹� ���� �ֽ��ϴ�");
				}
			}
			
			while(true) {				
				int ��ġ = random.nextInt(9);
				if(������[��ġ].equals("[ ]")) {
					������[��ġ] = "[x]";
					break;
				}
			}
			
			String �¸��� = "";
//			���� �ε������� ����� ��� �����ϸ�
//			 * 		012 345 678	3������
//			 * 		���� �ε������� ����� ��� �����ϸ�
//			 * 		036 147 258
//			 * 		�밢�� �ε������� ����� ��� �����ϸ�
//			 *      048 246
			for(int i = 0; i < 6 ; i += 3) {
				if(������[i].equals(������[i + 1]) && ������[i + 1].equals(������[i + 2])) {
					�¸��� = ������[i];
				}
			}
			
			for(int i = 0; i < 3 ; i++) {
				if(������[i].equals(������[i + 3]) && ������[i + 3].equals(������[i + 6])) {
					�¸��� = ������[i];
				}
			}
			
			if(������[0].equals(������[4]) && ������[4].equals(������[8])) {
				�¸��� = ������[0];
			}
			if(������[2].equals(������[4]) && ������[4].equals(������[6])){
				�¸��� = ������[2];
			}
			
			
			if(�¸���.equals("[o]")) {
				System.out.println("�÷��̾�¸�");
				for(int i = 0; i < ������.length; i++) {
					System.out.print(������[i]);
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				break;
			}else if(�¸���.equals("[x]")) {
				System.out.println("��ǻ�ͽ¸�");
				for(int i = 0; i < ������.length; i++) {
					System.out.print(������[i]);
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				break;
			}
			
			
			
			
		}
		

	}

}
