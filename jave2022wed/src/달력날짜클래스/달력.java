package �޷³�¥Ŭ����;

import java.util.Calendar;
import java.util.Scanner;

import Day09.calculator;

public class �޷� { // 26 : 52 // 5
	
	static Scanner s = new Scanner(System.in); //�Է°�ü���� [static]
	
	public static void main(String[] args) {
	
		
		System.out.println("����: ");
		int year = s.nextInt(); // �����Է¹ޱ�
		System.out.println("��: ");
		int month = s.nextInt(); // �� �Է¹ޱ�
		�޷�(year, month); // �޷� �޼ҵ� ȣ��
	}
	
	public static void �޷�(int year, int month) { // ���� �� �Է¹ޱ�
		while(true) {
			Calendar calendar = Calendar.getInstance(); // Ķ���� Ŭ������ ��¥/�ð� ȣ�� [static]
			int day = calendar.get(calendar.DAY_OF_MONTH); // Ķ���� ������ ���� day������ ����
			calendar.set(year, month - 1, 1);// �Է¹��� ���� Ķ���� ����
			
			int sweek = calendar.get(Calendar.DAY_OF_WEEK);// �Է¹��� �ϼ� ����
	
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);// ������ �ϼ�
			
			//3. ���
			System.out.println("*****" +year+"��"+month+ "�� ******");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			//* ���� �� 1���� ��ġ �տ� ���� ä���
			for(int i = 1; i < sweek; i++) {
				System.out.print("\t"); // ȭ�����̸� 0 1 ����ó��
			}
			
			for(int i = 1; i <= eday; i++) { // 1 ~ �������ϼ����� ���
				System.out.print(i + "\t");
				// ����ϸ��� �ٹٲ�ó�� [����� = 7]
				if(sweek % 7 == 0) { // 7���� �ٹٲ�
					System.out.println();
				}
				sweek++; //ù���Ϻ��� ++
			}
			
			try {
				System.out.println("\n1.���� / 2.����");
				int ch = s.nextInt(); // ���� �Է¤��ٱ�
				if(ch == 1) { //����
					if(month == 1) { // ���� ���� 1���̸�
						�޷�(year - 1, month + 11); // �⵵ - 1 , month + 11 = 12��
					}else { // �ƴϸ� 
						�޷�(year, month - 1);
					}
				}else if(ch == 2) { // ����
					if(month == 12) {// ���� ���� 12���̸�
						�޷�(year + 1, month - 11); // �⵵ + 1 , month - 11 = 1��
					}else {
						�޷�(year, month + 1);
					}
				}else {
					System.out.println("�˼����� �ൿ");
				}
				
			}catch (Exception e) {
				System.out.println("����" + e);
			}
			
		}		
	} // me 
}// ce
