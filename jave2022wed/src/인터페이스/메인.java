package �������̽�;

import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		�������̽� car1 = new ������(8, 0);// ���⼺
		�������̽� car2 = new �������(10, 0);
		�������̽� car3 = new �����(12, 0);
		
		while(true) {
			System.out.println("1.move"); int ch = s.nextInt();
			
			if(ch == 1) {
				car1.move();
				car2.move();
				car3.move();
			}else {
				System.out.println("�˼������ൿ");
			}
		}
	}
	
}
