package Day01;

import java.util.Scanner;

public class Day01_04 {
	public static void main(String[] args) { // m s
		
		// ����1 : �̸�, 1����, 2����, 3���� �⼮���θ� �Է¹޾� ���
						//�Է� -> ���� -> ��� 
		// 1. �Է°�ü ����
		Scanner �Է°�ü = new Scanner(System.in);		
		
		// 2. �Է¹��� ������ �ȳ�
		System.out.print("�̸� :");
		
		// 3. �Է¹��� ������ �������� -> �ٸ����� ����
		String �̸� = �Է°�ü.next();
			// = : ����( �����ʰ��� ���� ����[] )
		//  �ȳ� ���				 	//�Է¹޾� �ٸ� ��ü�� ����
		System.out.print("1���� : "); String ����1 = �Է°�ü.next();
		System.out.print("2���� : "); String ����2 = �Է°�ü.next();
		System.out.print("3���� : "); String ����3 = �Է°�ü.next();
	
		//4.
		System.out.println("\t\t[[�⼮��]]");
		System.out.println("---------------------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		//System.out.println(�̸� + "\t" + ����1 + "\t" + ����2 + "\t" + ����3);
		
		System.out.printf("%s\t%s\t%s\t%s\n", �̸�, ����1, ����2, ����3);
		System.out.println("---------------------------------------------------");
		
		
		
		
	}// m e
}// c e
