package Ÿ�̾��;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		
		������ ������ = new ������();
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ٱ���Ƚ��: ");
		int hit = s.nextInt();
		for(int i = 0; i < hit ; i++) {
			int ��� = ������.��ɽ���();
			switch (���) {
			case 1:
				System.out.println("���ο� ��������");
				������.���� = new ����(50, 15);
				break;
			case 2:
				System.out.println("���ο� ��������");
				break;
			case 3:
				System.out.println("���ο� �ü�����");
				break;
			}
		}
		
		
	}	
}
