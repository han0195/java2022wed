package Day11;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		
		
		
		student[] st = new student[100]; // �л� Ŭ���� �迭
		
		
		while(true) { // ���ѹݺ�
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("---------------------------------");
				System.out.println("-----------����ǥ------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("----------------------------------");
				//���� ���ϱ�
				for(int i = 0; i < st.length ;i++){ // st ��ŭ �ݺ�
					if(st[i] != null) { // null �ƴϸ�
						st[i].set����(1); // ���� 1�� �ʱ�ȭ
						for(int j = 0; j < st.length ;j++) { // �ٽ� st �ϳ��� ��
							if(st[j] != null && st[i].get����() < st[j].get����()) {	// i �������� j ���� ������ ����++ 							
									st[i].set����(st[i].get����()+ 1);							
							}
						}
					}
					
				}
				student[] ar = new student[100];
				// ������ ������ �迭 ������� �ֱ�
				for(int i = 1; i < ar.length ; i++) { // ����
					for(int j = 0; j < ar.length ; j++) { //�迭 ����
						if(st[j] != null && st[j].get����() == i) {
							ar[i - 1] =  st[j];							
						}
					}
				}
							
				for(int i = 0 ; i < ar.length ; i++) {
					if(ar[i] != null) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", i+1, ar[i].get�̸�(), ar[i].get����(), ar[i].get����(), ar[i].get����(),ar[i].get����(),ar[i].get���(), ar[i].get����());	
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
			}catch(Exception e){
				System.out.println("�˼������ൿ�Դϴ� " + e);
			}
			
			
			
			
		}
		
	}
	
	
}
