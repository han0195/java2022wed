package ���ΰ���������������Ʈ;

import java.util.ArrayList;
import java.util.Scanner;

public class ��������4 {
	//�������� ����Ʈ����
			// ��� [1.��� 2.��� 3.���� 4.����]
			// �ʵ� 1. ������ 2. ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Book> book = new ArrayList<Book>();
		
		while(true) { // 6 : 54
			System.out.println("�����������α׷�");
			System.out.println("[1.��� 2.��� 3.���� 4.����]"); int ch = s.nextInt();
			if(ch == 1) {
				System.out.println("�������");
				System.out.println("������: "); String tit = s.next();
				System.out.println("���ڸ�: "); String wri = s.next();
				book.add(new Book(tit, wri));
			}else if(ch == 2) {
				System.out.println("������\t����");
				for(int i = 0 ; i < book.size() ; i++) {
					System.out.println(book.get(i).get������() +"\t"+ book.get(i).get����());
				}
			}else if(ch == 3) {
				System.out.println("��������");
				System.out.println("�����ҵ�����: "); String tit = s.next();
				for(int i = 0 ; i < book.size() ; i ++) {
					if(book.get(i).get������().equals(tit)) {
						book.remove(i);
					}
				}
			}else if(ch == 4) {
				
			}
		}
	}
}
