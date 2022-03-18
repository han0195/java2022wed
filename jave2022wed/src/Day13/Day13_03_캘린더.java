package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_03_Ķ���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 2. ���� , �� , ��
		System.out.println("����: ");
		int year = s.nextInt();
		System.out.println("��: ");
		int month = s.nextInt();

		�޷�(year, month);

	}

	public static void �޷�(int year, int month) {
		while (true) {
			// 1. Ķ���� Ŭ������ ���� ��¥/�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
			Scanner s = new Scanner(System.in);
//		int year = calendar.get( Calendar.YEAR);
//		int month = calendar.get(calendar.MARCH)+1; // +1�ϴ����� : 0:1�� ~ 11: 12��;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			// * �ش� ���� 1���� ����ã��
			// 1. ����� ���� Ķ���� ����
			calendar.set(year, month - 1, 1); // ��) 3�� 1��
			// 2. 3�� 1���� ����
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);
			//System.out.println(month + "�� " + day + "�� ����: " + sweek);
			
			// 3. 3���� ������ ��
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
			//System.out.println(month + "���� ������ ��: " + eday);

			// 3. ���
			System.out.println("****" + year + "��" + month + "�� ******");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");

			// * ���� �� 1���� ��ġ �տ� ���� ä���
			for (int i = 1; i < sweek; i++) {
				/// 3�� 1�� = ȭ = 3;
				System.out.print("\t");
			}
			// 1�Ϻ��� ��������¥ ���
			for (int i = 1; i <= eday; i++) {
				System.out.print(i + "\t");
				// ����ϸ��� �ٹٲ�ó�� [ ����� = 7 ] ������ 7�������
				if (sweek % 7 == 0) {
					System.out.println();
				}

				sweek++; // �Ϸ羿 ���� ����
			}

			
			// �޷� ��ư [1. ���� 2.����] ���			
			try {
				System.out.println("\n1.���� / 2.����");
				int ch = s.nextInt();
				if (ch == 1) {
					if (month == 1) {
						�޷�(year - 1, month + 11);
					} else {
						�޷�(year, month - 1);
					}
				} else if (ch == 2) {
					if (month == 12) {
						�޷�(year + 1, month - 11);
					} else {
						�޷�(year, month + 1);
					}
				}
			}catch(Exception e){
				System.out.println("����]] �������� �Է������ּ��� [������ȣ��] ����: " + e);
			}// try end
			
						
		}// ���α׷� ���ѹݺ� end

	}// �޷� end

}// c end
