package Day03;

import java.util.Scanner;

public class Day03_07 {
	public static void main(String[] args) { // m s
		
		boolean run = true; // ���࿩��
		
		int balance = 0; // ���ݾ�
		
		Scanner scanner = new Scanner(System.in); //�Է°�ü
		
		while(run) { // while( ���ǽ� ) {  } : ���ѷ���
			System.out.println("----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 5.4.����");
			System.out.println("----------------------------------");
			System.out.println("����>"); 
			int ���� = scanner.nextInt();
			
			if( ���� == 1 ) {// ���࿡ �Է°��� 1�̸�
				System.out.println("���ݾ�: "); int ���ݾ� = scanner.nextInt();
				//�Է¹��� ���ݾ��� ���忡 �߰� +
				balance += ���ݾ�;
			}
			else if( ���� == 2 ) {// ���࿡ �Է°��� 2�̸�
				System.out.println("��ݾ�: "); int ��ݾ� = scanner.nextInt();
				// ���࿡ ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺���
				if (��ݾ� > balance) { System.out.println("�˸�) �ܾ��� �����մϴ�");				}
				else {balance -= ��ݾ�;} //�Է¹��� ��ݾ��� ���忡�� ���� -
			}
			else if( ���� == 3 ) {// ���࿡ �Է°��� 3�̸�
				System.out.println("�ܰ�: " + balance); 
			}
			else if (���� == 4 ) {// ���࿡ �Է°��� 4�̸�
				break; // ���ѷ��� Ż�� 
			}else {
				System.out.println("�˼����� ��ȣ �Դϴ�");
			}
			
			
		}// w e
		
		System.out.println("���α׷� ����");
		
	} // m e
}// c e
