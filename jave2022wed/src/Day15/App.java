package Day15;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			// 1. ��� ���� ǥ ���
				//
					//�迭�̳� ����Ʈ�� ��� ��ü ȣ�� �ݺ���
				//
			System.out.println("\t\t1.���� 2.����: "); int ch = s.nextInt();
			
			if( ch == 1 ) {
				// 1. ������ȣ�� �Է¹޴´�
					//�Է�
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				// 3. �޼ҵ� ����� ���� ���
				boolean ��� = Controller.����(null);
			}else if(ch == 2) {
				// 1. ������ȣ�� �Է¹޴´�
					//�Է�
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				// 3. �޼ҵ� ����� ���� ���
				boolean ���� = Controller.����(null);
			}			
		}
		
		
		
	}//
}//
