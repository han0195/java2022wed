package practice;

import java.util.Scanner;

public class ����ǥ {
	
	
	public static void main(String[] args) {
		
		
		
		�л�[] stulist = new �л�[100];
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("--------------------------------------------------------------");
				System.out.println("\t\t\t����ǥ\t\t\t");
				System.out.println("--------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("--------------------------------------------------------------");
				//�������� ����ϱ�
				//���� ���ϱ�
				for(int i = 0; i < stulist.length ; i++) {				
					if(stulist[i] != null) {
						stulist[i].set����(1); 
						for(int j = 0 ; j < stulist.length; j++) {
							if(stulist[j] != null && stulist[i].get����() < stulist[j].get����()) {
								stulist[i].set����(stulist[i].get����() + 1);
							}
						}
					}
				}
				//���� ������� ���ο� �迭�� �����ؼ����
				�л�[] stutmep2 = new �л�[100];
				for(int i = 1 ; i < stulist.length ; i++) {// ����
					
						for(int j = 0 ; j < stulist.length ; j++) {
							if(stulist[j] != null && stulist[j].get����() == i) {
								stutmep2[i - 1] = stulist[j];
								break;
							}
						}
					
				}
				
				//������ �迭�� ���
				for(int i = 0; i < stutmep2.length ; i++) {
					if(stutmep2[i] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n", i + 1 ,stutmep2[i].get�̸�(),stutmep2[i].get����(),stutmep2[i].get����(),stutmep2[i].get����(),stutmep2[i].get����(),stutmep2[i].get���(),stutmep2[i].get����());
					}
				}
				
				System.out.println("--------------------------------------------------------------");
				System.out.print("�޴� : 1. �л����� ��� 2. �л����� ���� ����> \n"); int ch = sc.nextInt();
				
				if(ch == 1) {// �л����� ���
					System.out.println("--------------------------------------------------------------");
					System.out.println("�̸�: "); String name = sc.next();
					System.out.println("����: "); int ���� = sc.nextInt();
					System.out.println("����: "); int ���� = sc.nextInt();
					System.out.println("����: "); int ���� = sc.nextInt();
					int ���� = ���� + ���� + ����;
					double ��� = (double)���� / 3.0;
					�л� stutemp = new �л�(name, ����, ����, ����, ����, ���); 
					
					//����
					for(int i = 0; i < stulist.length ; i++) {
						if(stulist[i] == null) {
							stulist[i] = stutemp;
							break;
						}
					}
														
					
				}else if(ch == 2) {// ����
					System.out.println("������ų��ȣ: "); int index = sc.nextInt();
					stutmep2[index - 1] = null;
					
					for(int i = index - 1; i < stutmep2.length - 1; i++) {
						if(i == stutmep2.length - 1) {
							stutmep2[i] = null;
						}else {
							stutmep2[i] = stutmep2[i + 1];
						}
					}
				
					
					
				}
		
				
				
				
				
				
				
				
				
			}catch(Exception e) {
				System.out.println("����)) �˼����� �ൿ�Դϴ�" + e);
			}
			
			
			
			
		}
		
	}//ms
}// cs			
