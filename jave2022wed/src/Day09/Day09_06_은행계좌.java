package Day09;

import java.util.Scanner;

//����������α׷� [���]
		// ����[super]
		// ��������[sub], ��������[sub], �ϳ�����[sub]
		// �� ��� : 1. ���»��� 2.�Ա� 3. ��� 4.��ü 5.�����¸�� 6.����
public class Day09_06_������� {
	// ** main �ۿ��� �����ϴ� ����
		//* ��� Ŭ�������� ����ϱ� ���� static �迭�� ����
		// static������ ���α׷� ���۽� �޸��Ҵ� -> ���α׷� ����� �޸𸮰� �ʱ�ȭ��
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {// ���α׷� ���ѷ��� [ �������� x ]
			
			System.out.println("------------���� �ý���-----------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���¸�� 6.���� ����");
			int ch = scan.nextInt();
			//�ٸ� Ŭ������ ��� ȣ�� �ϴ� ���
				//1. ��ü ����[new] �ؼ� �޼ҵ� ȣ��
				//2. static �޼ҵ�� ��ü ���� ȣ�� ����
			������Ʈ�ѷ� ��Ʈ�� = new ������Ʈ�ѷ�();
			
			if( ch == 1 ) {
				System.out.println("+++ ���µ�� ������ +++");
				System.out.println("��й�ȣ: "); 	String pw = scan.next();
				System.out.println("������: ");	String name = scan.next();
				System.out.println("���༱��: 1.���� 2.���� 3.�ϳ� >"); int ch2 = scan.nextInt();
				String result = ��Ʈ��.���»���(pw, name, ch2);
				// �޼ҵ� ��ȯ ���� = ���¹�ȣ Ȥ�� null
				// �޼ҵ� ������ �޼��� ���
				if(result != null) { // ���¹�ȣ�� null �ƴϸ�
					System.out.println("�˸�)) ���»����Ϸ�");
					System.out.println("���¹�ȣ: " + result);
				}else {
					System.out.println("����)) ���»��� ����");
				}
				
			}else if(ch == 2 ) {
				System.out.println("+++ �Ա� ������ +++");
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = scan.next();
				System.out.println("�Աݾ�: "); int money = scan.nextInt();
				int result = ��Ʈ��.�Ա�(���¹�ȣ, money);
				if(result != 0) {
					System.out.println("�Ա� ����");
					System.out.println("�ܾ�: " + result);
				}else {
					System.out.println("����)) �Ա� ����");
				}
				
			}else if( ch == 3 ) {
				System.out.println("+++ ��� ������ +++");
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = scan.next();
				System.out.println("��й�ȣ: "); String pw = scan.next();
				System.out.println("��ݾ�: "); int money = scan.nextInt();
				int result = ��Ʈ��.���(���¹�ȣ,pw ,money);
				if(result == 0) {
					System.out.println("����)) ��� ����");
					
				}else if(result == 1){
					System.out.println("����)) �ܾ� ����");
				}else {
					System.out.println("��� ����");
					System.out.println("�ܾ�: " + result);
				}
			}else if ( ch == 4 ) {
				System.out.println("+++ ��ü ������ +++");
				System.out.println("���¹�ȣ: "); String ���¹�ȣ = scan.next();
				System.out.println("��й�ȣ: ");	String pw = scan.next();
				System.out.println("��ü�ݾ�: "); int money = scan.nextInt();
				System.out.println("�޴°���: ");	String �޴°��� = scan.next();
				
				int result = ��Ʈ��.��ü(���¹�ȣ, pw, money, �޴°���);
				
				if(result == 4) {
					System.out.println("���������� �����ϴ�");
				}else if (result == 2) {
					System.out.println("��ü ����");
				}else if(result == 1) {
					System.out.println("�ܾ� ����");
				}
				
				
			}else if( ch == 5 ) {
				System.out.println("+++ ���¸�� ������ +++");
				System.out.println("�������̸�: "); String name = scan.next();
				Bank[] result = ��Ʈ��.���¸��(name);
				int i = 0;
				for(Bank temp : result) {
					if(temp != null) {
						System.out.println(i+ "�� " + "���¹�ȣ" + temp.get���¹�ȣ());
					}
					i++;
				}
			
				
			}else if( ch == 6 ) {
				System.out.println("+++ ���� ������ +++");
			}else {
				System.out.println("����)) �˼����� �ൿ");
			}
		}// while end
		
	}//me		
}//ce
