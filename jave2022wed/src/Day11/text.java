package Day11;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		student[] st = new student[100];
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("-----------����ǥ------------------");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			System.out.println("----------------------------------");
			for(int i = 0 ; i < st.length ; i++) {
				if(st[i] != null) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", i+1, st[i].get�̸�(), st[i].get����(), st[i].get����(), st[i].get����(),st[i].get����(),st[i].get���(), i+1);
				}
				
			}				
			System.out.println("----------------------------------");
			System.out.println("1.�л����� ��� 2.�л����� ����"); int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("----------------�л����--------------------");
				System.out.println("�̸�: "); String name = sc.next();
				System.out.println("��������: "); int ���� = sc.nextInt();
				System.out.println("��������: "); int ���� = sc.nextInt();
				System.out.println("��������: "); int ���� = sc.nextInt();
				int ���� = ���� + ���� + ����;
				double ��� = ���� / 3; 
				//��üȭ
				student st1 = new student(name, ����, ����, ����, ����, ���);
				
				//����
				for(int i = 0; i < st.length ; i++) {
					if(st[i] == null) {
						st[i] = st1;
						break;
 					}
				}
				
				//��
//				student temp = null;
//				for(int i = 0; i < st.length ; i++) {
//					if(st[i] != null) {
//						for(int j = 1; j < st.length ; j++) {
//							if(st[j] != null && st[i].get����() < st[j].get����()) {
//								temp = st[i];
//								st[i] = st[j];
//								st[j] = temp;		
//							}
//						}
//					}			
//				}
				
				
			}else if(ch == 2) {
				System.out.println("������ ��ȣ ����: "); int index = sc.nextInt();
				st[index - 1] = null;

				for(int i = index - 1; i < st.length - 1 ; i++) {
					if(i == st.length - 1) {
						st[i] = null;
					}else {
						st[i] = st[i + 1];
					}
				}
			}else {
				System.out.println("�˼����� �ൿ");
			}
			
			
			
		}
		
	}
	
	
}
