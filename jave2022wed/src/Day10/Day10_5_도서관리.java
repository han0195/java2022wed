package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_�������� {
	
	public static void main(String[] args) {
		
		//1. ����Ʈ[��ü] ����
		ArrayList<Book> booklise = new ArrayList<Book>();
		//����ƮŬ���� < ����Ʈ�ȿ� ������ Ŭ���� >
		// <Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ���� // ���̴� ���� [�⺻ : 10]
		
		Scanner scan = new Scanner(System.in);	 // �Է°�ü
				
		while(true) {
			System.out.println("1.��� 2.���3.����4.����");
			int ch = scan.nextInt();
			if(ch == 1) {
				// 1. ������ �Է¹ޱ�
				System.out.println("������: "); String ������ = scan.next();
				System.out.println("����: "); String ���� = scan.next();
				// 2. ��üȭ [ ������ ���� => 1�� ��ü]
				Book book = new Book(������, ����);
				// 3. �迭���� [ ������ ã�Ƽ� ] vs ����Ʈ [����ã��]
				booklise.add(book);
				// ????? : .add(��ü��)
					// ������ �ε����� �ڵ������� ��ü�� �߰�
				
			}
			else if(ch == 2) {
				// 1. �迭 [ null ���� ] vs ����Ʈ
				System.out.println("������\t����");
				for(Book book : booklise) {
					System.out.println(book.get������() + "\t" + book.get����());
				}
 			}
			else if(ch == 3) {
				// 1.�迭[ �����Ŀ� �� �ε��� ����] vs �ε���[�ڵ�]
				// 1 2 3 [2����] 1 null 3      vs 1 2 3 [2����] 1 3 4
				System.out.println("������ ������: "); String ������ = scan.next();
				//���� ã��
				for(Book temp : booklise) {
					if(temp.get������().equals(������)) {
						booklise.remove(temp);
						break;
					}
				}//for end
			}
			else if(ch == 4) {
				System.out.println("������ ������: "); String ������ = scan.next();
				for( Book book : booklise) {
					if(book.get������().equals(������)){
						System.out.println(" ������ �����̸�: "); String ���� = scan.next();
						book.set����(����);
					}
					
				}
			}else {
				System.out.println("�˼����� �ൿ");
			}//���� if end
			
		}// while end
		
		
		
		
	}// me
		
}// ce
