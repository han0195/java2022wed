package Day02;

import java.util.Scanner;

public class Day02_03 {

	public static void main(String[] args) {
		//���� 1 : �޿� ���
		
		//Scanner ����
		Scanner san = new Scanner(System.in);
		
		//Scanner �Է��� ������ ����
		System.out.print("�⺻��: ");
		int �⺻�� = san.nextInt();
		System.out.println("����: ");
		int ���� = san.nextInt();
		
		//��� 
		int �Ǽ��ɾ� = �⺻�� + ���� - (int) (�⺻�� * 0.1);
		System.out.println("�Ǽ��ɾ�: " + �Ǽ��ɾ�);
		
				
	}

}
