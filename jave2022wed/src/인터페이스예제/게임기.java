package �������̽�����;

import java.util.Scanner;

public class ���ӱ� {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {// ���α׷�����
			System.out.println("�ؽ�Ʈ��������");
			���̽�ƽ ���̽�ƽ = new �ؽ�Ʈ����();
			System.out.println("1.ĳ���ͻ��� 2.�غ���"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("name: "); String name = s.next();
				ĳ���� my = new ĳ����(name, 10, 10);
				while(true) {
					System.out.println("----- ���糪�� ĳ���� ------");
					System.out.println("���ݷ�: "+ my.get���ݷ�() +"\t"+"����: " + my.get����());
					System.out.println("1.����� ã�� 2.����"); int ch2 = s.nextInt();
					if(ch2 == 1) {
						System.out.println("--- ��Ī ---");
						ĳ���� com = ĳ����.��Ī();
						System.out.println("��뽺��");
						System.out.println("���ݷ�: "+ com.get���ݷ�() +"\t"+"����: " + com.get����());
						while(true) {
							System.out.println("���̽�ƽ : 1.���� 2.��Ű���� 3.����"); int ch3 = s.nextInt();
							if(ch3 == 1) {
								���̽�ƽ.A��ư(my, com);
							}else if(ch3 == 2) {
								
							}else if(ch3 == 3) {
								
							}
							else {	
								System.out.println("�˼����� ����");
							}
						}	
					}else if(ch2 == 2) {
						
					}else {
						System.out.println("�˼����� ����");
					}
				}
			}else if(ch == 2) {
				System.out.println("���ľ�����Ʈ����");
			}else {
				System.out.println("�˼����� ����");
			}
			
			
		}
		
		
	}
}
