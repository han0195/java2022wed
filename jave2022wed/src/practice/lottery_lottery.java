package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;

public class lottery_lottery {// ����Ƚ��: 1 // �ð�: x
	// 6���� ��ȣ�� �Է¹޾Ƽ� �ζ� ��÷
	// ��ȿ���˻� / �ߺ�üũ, �迭�Է�
	// 1. 6���� �Է� �ޱ�
	// 2. 6���� ���� ����
	// 3. �ǵ�
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü����
		
		int[] use = new int[6];
		int[] computer = new int[6];
		int same = 0;
		
		boolean pass = true; // �����ϰ� �����ϱ����� �˻�
		
		//6����ȣ �Է¹޾� use �����ϱ�
		for(int i = 0; i < 6; i++) { // 6���� �Է°�ü�ޱ�
			System.out.printf("%d�� ��ȣ�� �Է����ּ���", i + 1);
			int num = scanner.nextInt();
			pass = false;
			
			//��ȿ�� �˻�
			if(num > 0 && num < 46) { // 1 ~ 45 ������ �´��� �˻�
				//�ߺ��˻�
				for(int j = 0; j < use.length; j++) {
					if(num == use[j]) { // ��ȣ�� ���ٸ�
						System.out.println("����) ��ȣ�� �ߺ��Ǿ����ϴ�");
						i--;
					}else {
						pass = true;
					}
				}// f e
			}else { // �ƴϸ� i--�ؼ� �ݺ� 1ȸ �߰�
				System.out.println("����) 1~45�߿� �Է����ּ���");
				i--;
			}
					
			//�������
			if(pass == true) {
				use[i] = num; 
			}		
		}// f e
		
		
		Random random = new Random(); // ���� ��ü ����
		// ���� ��������
		for(int i =0; i < computer.length; i++) {
			
			int num = random.nextInt(45) + 1;	// ���� ����
			
			// �ߺ�üũ
			pass = true; // pass �ʱ�ȭ; true �ʱ�ȭ�� ����: ��ȣ�� ���������� �����Ű������
			for(int j = 0; j < 6; j++) {
				if(num == computer[j]) { // ��ȣ�� ���ٸ�
					i--;
					pass = false;
				}
			}// f e
			
			
			if(pass == true) {
				computer[i] = num;
			}	
		}
		
		
		//�ǵ�
		for(int temp : use) {
			for(int temp2 : computer) {
				if(temp == temp2) {
					same++;
				}
			}
		}
		System.out.println("------------------��÷-----------------");
		System.out.printf("��������: %d\n", same);
		System.out.println(Arrays.toString(use));
		System.out.println(Arrays.toString(computer));
	}// m e

}// c e
