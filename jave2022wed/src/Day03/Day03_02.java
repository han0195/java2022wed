package Day03;

import java.util.Scanner;

public class Day03_02 {

	public static void main(String[] args) {
		
		// �Է°�ü = { } �� 1�� ����
		Scanner scan = new Scanner(System.in);
		
//		// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū�� ���
//		System.out.println("�����Է�: ");
//		int ����1 = scan.nextInt(); // int�� ���� ���� �ϰ� �Է¹��� �������� ������ �����ͼ� ����
//			//int�� ���� ���� �ϰ� �Է¹��� ���� ������ �����ͼ� ����
//		System.out.println("����2�Է�: ");
//		int ����2 = scan.nextInt();
//		
//		// ����
//		if( ����1 > ����2 ) System.out.println("�� ū��: " + ����1);
//		// ���࿡ �Է¹��� ����1 ������ ����2 ���� ũ�� ���� �ƴϸ� ���� ����
//		else if( ����1 < ����2 ) System.out.println("�� ������: " + ����2);
//		// [��������] ����1������ ����2 ���� ������ ���� �ƴϸ� �׿�
//		else 				  System.out.println(" ���� ");
//		
//		// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū�� ���
//		System.out.println("����1�Է�: "); int ����3 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����4 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����5 = scan.nextInt();
//		int max = ����3;	//max�� ù��° �� �־�α�	
//		if ( max < ����4 ) { max = ����4;}	// ���࿡ max ���� ����4�� �� ũ�� ��ü	
//		if ( max < ����5 ) { max = ����5;}
//		System.out.println(" ���� ū��: " + max);
//		
//		
//		// ����3 : 4���� ������ �Է¹޾Ƽ� ���� ū�� ���
//		System.out.println("����1�Է�: "); int ����6 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����7 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����8 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����9 = scan.nextInt();
//		int max2 = ����6;
//		if ( max2 < ����7 ) { max2 = ����7; };
//		if ( max2 < ����7 ) { max2 = ����8; };
//		if ( max2 < ����7 ) { max2 = ����9; };
//		
//		// ����4 : 3���� ������ �Է¹޾Ƽ� ��������
//		System.out.println("����1�Է�: "); int ����10 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����11 = scan.nextInt();
//		System.out.println("����1�Է�: "); int ����12 = scan.nextInt();
//		
//		if ( ����10 > ����11) {	// > : ��������		< : ��������
//			// ��ü[ ���� = �ΰ� ������ ������ ��ȭ��� ]
//			int temp = ����10; // �ӽú��� = ����1;
//			����10 = ����11;	  // ����1 = ����2;
//			����11 = temp;	  // ����2 = �ӽú���;
//		}
//		if ( ����10 > ����12) {int temp = ����10; ����10 = ����12;	����12 = temp;}
//		if ( ����11 > ����12) {int temp = ����11; ����11 = ����12;	����12 = temp;}
//		System.out.printf("�Է��� �� ��������: %d %d %d", ����10, ����11,����12);
		
		
		// ����5 : 4���� ������ �Է¹޾Ƽ� ��������
		System.out.println("����1�Է�: "); int ����13 = scan.nextInt();
		System.out.println("����1�Է�: "); int ����14 = scan.nextInt();
		System.out.println("����1�Է�: "); int ����15 = scan.nextInt();
		System.out.println("����1�Է�: "); int ����16 = scan.nextInt();
		
		if (����13 > ����14) {int temp = ����13; ����13 = ����14; ����14 = temp;}
		if (����13 > ����15) {int temp = ����13; ����13 = ����15; ����15 = temp;}
		if (����13 > ����16) {int temp = ����13; ����13 = ����16; ����16 = temp;}
		
		if (����14 > ����15) {int temp = ����14; ����14 = ����15; ����15 = temp;}
		if (����14 > ����16) {int temp = ����14; ����14 = ����16; ����16 = temp;}
		
		if (����15 > ����16) {int temp = ����15; ����15 = ����16; ����16 = temp;}
		System.out.printf("�Է��� �� ��������: %d %d %d %d", ����13, ����14, ����15, ����16);
	} // m e

}// c e
