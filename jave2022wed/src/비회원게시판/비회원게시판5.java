package ��ȸ���Խ���;

import java.util.Scanner;

public class ��ȸ���Խ���5 {
	//0. �Խù� ���� => Ŭ���� ����
			// �ʵ� : ����, ����, �ۼ���, ��й�ȣ
			// ������: ������� ����

		//1. ùȭ�� [ ��� �Խù� (��ȣ, �ۼ���, ����) ��� ]
		//2. �޴� [ 1. �۾��� 2. �ۺ��� ]
		//1. �۾��� [ ����, ����, �ۼ���, ��й�ȣ�� �Է¹޾� => 4������ -> ��üȭ ]
		//2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ, �ۼ���, ����, ����) ǥ�� ]
			// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
			// �ۺ��� �޴�
		//3. �ۺ��� �޴� [1. ��Ϻ��� 2.���� 3.���� ]
			// 1. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
			// 2. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Board[] b = new Board[100];
		
		while(true) {
			System.out.println("--------- ���� �뿩 ���α׷� -----------");
			System.out.println("��ȣ\t�ۼ���\t����");
			for(int i = 0 ; i < b.length ; i++) {
				if(b[i] != null) {
					System.out.println(i + "\t" + b[i].writer + "\t" + b[i].title);
				}
			}
			System.out.println("1. �۾��� 2. �ۺ���"); int ch = s.nextInt();
			
			
			if(ch == 1) {
				System.out.println("*** �� ���� ***");
				System.out.println("����: "); String t1 = s.next();
				System.out.println("����: ");	String c = s.next();
				System.out.println("�ۼ���: "); String w = s.next();
				System.out.println("��й�ȣ: "); String p = s.next();
				
				Board t = new Board(t1, c, w, p);	
				for(int i = 0; i < b.length ; i++) {
					if(b[i] == null) {
						b[i] = t;
						break;
					}
				}	
			}else if(ch == 2) {
				System.out.println("*** �ۺ��� ***");
				System.out.println("�ε���: "); int index = s.nextInt();
				if(b[index] != null) {
					while (true) {
						System.out.println("��ȣ\t�ۼ���\t����\t����");
						System.out.println(index + "\t" + b[index].writer + "\t" + b[index].title + "\t" + b[index].content);
						System.out.println("1. ��Ϻ��� 2.���� 3.����"); int ch2 = s.nextInt();
						if(ch2 == 1) {
							break;
						}else if(ch2 == 2) {
							System.out.println("����");
							System.out.println("��й�ȣ: "); String pw = s.next();	
							if(b[index].pw.equals(pw)) {
								b[index] = null;
								for(int i = index ; i < b.length ; i++) {
									if(i == b.length - 1) {
										b[i] = null;
									}else {
										b[i] = b[i + 1];
									}
								}
								break;
							}
							
						}else if(ch2 == 3) {
							System.out.println("����");
							System.out.println("��й�ȣ: "); String pw = s.next();		
							if(b[index].pw.equals(pw)) {
								System.out.println("����: "); String t = s.next();
								System.out.println("����: "); String c = s.next();							
								b[index].title = t;
								b[index].content = c;
							}
						}else {
							System.out.println("�˼����� �ൿ�Դϴ�");
						}
					}	
				}
							
			}			
		}
	}

}
