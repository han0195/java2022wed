package Day04;

import java.util.Scanner;

public class Day04_01 {

	public static void main(String[] args) {
		// ��� : if, switch
		// �ݺ��� : for, while : ���ѷ���
			// | 1. �ʱⰪ 2. ���ǽ� 3. ������ | 4. ���๮
			// while ����
			// 		�ʱⰪ;
			// 		while( ���ǽ� ) {
			//			���๮;
			//      	������;
			// 		}
		
		// for ��)
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		//while ��1)
		int i = 1; // 1. �ʱⰪ
		while( i <= 10 ) {
			System.out.println(i);	//4. ���๮
			i++;	// 3. ������
		}// while e
//------------------------------------------------------------------------------------		
		// for ��2) 1~100 �����հ�
		int sum = 0;
		for(int j = 1; j <=100; j++) {
			sum += j;
		}
		System.out.println("for 1~100���� �����հ�: " + sum);
		
		// while ��2) 1~100 �����հ�
		int j = 1;			// 1. �ʱⰪ
		int sum2 = 0;
		while (j <= 100) { 	// 2. ���ǽ�
			sum2 += j; 		// 4. ���๮
			j++;			// 3. ������
		}
		System.out.println("while 1~100���� �����հ�: " + sum2);
		
		// while ��3) ���ѷ���
		while(true) { // ���ǽ� true ���� // true ��� => ����;
			System.out.println("���ѷ���");
			Scanner scan = new Scanner(System.in);
			int exit = scan.nextInt();
			if ( exit == 3 ) {
					break; // ���� ����� �ݺ��� Ż�� [ if ���� ]
			}
		//	break;	// ���� ����� �ݺ���Ż�� [ if���� ]
		}
	}

}
