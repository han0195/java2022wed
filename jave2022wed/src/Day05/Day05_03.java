package Day05;

import java.util.Scanner;

public class Day05_03 {

	public static void main(String[] args) {
		
		// p.181
		int max = 0; // �ִ밪 �����ϴ� ����
		int[] array = {1,5,3,8,2}; // ����+�ʱⰪ ����
		
		for(int i = 0; i < array.length; i++) {
			// *i�� 0 ���� �迭�� ���� ���� 1������ ���� �ݺ�ó��
			if( max < array[i]) max = array[i];
			// * ���࿡ max i���� �ε����� ���� �� ũ�� max�� i��° �� ����
			
			
			
		}
		System.out.println("max : " + max );
		
		
		// 8.
		int[][] array2 = {	{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0; // ���� ���� ����
		for(int i = 0; i < array2.length; i++) {
			// *���� 0���� �迭�� �����[3]�̸����� 1�� ����
			for(int j = 0; j < array2[i].length; j++) {
				// *���� 0���� �迭�� ����
				sum += array2[i][j];
				count += 1;	//������ ���ϱ����� �ϳ��� count
			}// for �� e
		}// for �� e
		avg = (double)sum / count; // ��հ��
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		// 9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max2 = 0;
		double avg2 = 0;
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л����� �Է����ּ���");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>\n", i);
					scores[i] = scanner.nextInt(); // �����Է¹ޱ�
				}
				
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
			}else if(selectNo == 4) {
				for(int i = 0; i < scores.length; i++) {
					if(max2 < scores[i]) {
						max2 = scores[i];
					}
					avg2 += (double)scores[i];		// ���ϱ�		
				}// for e
				avg2 = avg2 / (double) studentNum;	// ��ձ��ϱ�
				System.out.println("�ְ�����: " + max2);
				System.out.println("�������: " + avg2);
			}else if(selectNo == 5) { // ����
				run = false;
			}
		}
		
		
		System.out.println("���α׷� ����");
		
	}// m e

}
