package Day01;

import java.util.Scanner;

public class Day01_06 {
	public static void main(String[] args) {
		//����2
		Scanner cann = new Scanner(System.in);
		
		//�Է°�ü �������� - > String Ŭ������ ����
		System.out.println("�ۼ���: ");	String Myname = cann.next();
		System.out.println("����: ");	String mamo = cann.next();
		System.out.println("��¥: ");	String date = cann.next();
				
				//���
		System.out.println("* --------------�湮��--------------");
		System.out.println("* |����| �ۼ��� |����\t|  ��¥  |");
		System.out.println("* | 1 | " + Myname +  " | " + mamo + " | " + date + " |");
		System.out.println("* ---------------------------------");
	}
}
