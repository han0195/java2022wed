package ���ΰ���������������Ʈ;
	// �������� ����Ʈ����
 	// ��� [1.��� 2.��� 3.���� 4.����]
	// �ʵ� 1. ������ 2. ����

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class �������� {// 13:38; ����Ƚ�� 2
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // �Է°�ü����
		ArrayList<Book> book = new ArrayList<>(); // �� Ŭ���� ����Ʈ ����
		while(true) {
			System.out.println("***** �������� ����Ʈ���� *****");
			System.out.println("1.��� 2.��� 3.���� 4.����"); int ch = s.nextInt();
			
			if(ch == 1) {//���
				System.out.println("**** ��� ������ ****");
				System.out.println("������: "); String tit = s.next();
				System.out.println("����: ");  String wri = s.next();
				book.add(new Book(tit, wri)); // ��ü ������ book list ����
			}else if(ch == 2) {//���
				System.out.println("������\t����");
				for(Book temp : book) {
					System.out.println(temp.get������() +"\t"+ temp.get����()); // ���
				}
			}else if(ch == 3) {// ����
				System.out.println("*** �������� ***");
				System.out.println("������ ������: "); String tit = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get������().equals(tit)) {
						book.remove(i);
						break;
					}
					i++;
				}
			}else if(ch == 4) {// ����
				System.out.println("**** �������� ****");
				System.out.println("������ ������: "); String tit = s.next();
				System.out.println("������ ������: "); String wri = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get������().equals(tit)) {
						book.get(i).set����(wri);
						break;
					}
					i++;
				}
			}else {
				System.out.println("�˼������ൿ�Դϴ�");
			}
		}// while
	
	}// me
}// ce
