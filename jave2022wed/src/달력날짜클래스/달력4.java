package �޷³�¥Ŭ����;

import java.util.Calendar;
import java.util.Scanner;

public class �޷�4 { // 7 : 56 : 0
	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("����: ");
		int year = s.nextInt();
		System.out.println("��: ");
		int month = s.nextInt();
		�޷�(year, month);
	}
	public static void �޷�( int year, int month ) {
		while (true) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month - 1, 1);
			int sweek = calendar.get(calendar.DAY_OF_WEEK);
			int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
			System.out.println("*****" + year +"��" + month +"�� *****");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			for(int i = 1; i < sweek ; i++) {
				System.out.print("\t");
			}
			for(int i = 1; i < eday ; i++){
				System.out.print(i + "\t");
				
				if(sweek % 7 == 0) {
					System.out.println();
				}
				sweek++;
			}
			
			try {
				System.out.println("\n1.���� / 2. ����"); int ch = s.nextInt();
				if(ch == 1) {
					if(month == 1) {
						�޷�(year -1, month + 11);
					}else {
						�޷�(year, month - 1);
					}
				}else if(ch == 2) {
					if(month == 12) {
						�޷�(year +1, month - 11);
					}else {
						�޷�(year, month + 1);
					}
				}else {
					System.out.println("�˼������ൿ");
				}
			} catch (Exception e) {
				System.out.println("���� " + e);
			}	
		}
		
	}
}
