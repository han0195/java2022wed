package ���ΰ���������������Ʈ;

import java.util.ArrayList;
import java.util.Scanner;

//�������� ����Ʈ����
	// ��� [1.��� 2.��� 3.���� 4.����]
	// �ʵ� 1. ������ 2. ����
public class ��������2 { // 8 : 22
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Book> book = new ArrayList<>();
		
		while(true) {
			System.out.println("**** �������� ����Ʈ���� ****");
			System.out.println("[1.��� 2.��� 3.���� 4.����]"); int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("*** ������� ***");
				System.out.println("������: "); String tit = s.next();
				System.out.println("����: ");  String wri = s.next();
				book.add(new Book(tit, wri));
			}else if(ch == 2) {
				System.out.println("������\t����");
				for(Book temp : book) {
					System.out.println(temp.get������() +"\t"+ temp.get����());
				}
			}else if(ch == 3) {
				System.out.println("*** �������� ***");
				System.out.println("������ ������: "); String tit = s.next();
				int i = 0;
				for(Book temp : book) {
					if(temp.get������().equals(tit)) {
						book.remove(i);
						break;
					}				
				}
			}else if(ch == 4) {
				System.out.println("*** �������� *** ");
				System.out.println("������: "); String tit = s.next();
				System.out.println("�����ҵ�����: "); String wri = s.next();
				for(Book temp : book) {
					if(temp.get������().equals(tit)) {
						temp.set����(wri);
						break;
					}
				}
			}else {
				System.out.println("�˼����� ����");
			}
			
		}
		
	}
}
