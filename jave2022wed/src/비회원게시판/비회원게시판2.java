package ��ȸ���Խ���;
//��ȸ���� �Խ��� [ Ŭ���� ���� ]

import java.util.Scanner;

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
public class ��ȸ���Խ���2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Board[] b = new Board[100];
		
		while(true) {
			System.out.println("**** ��ȸ�� �Խ��� ***");
			System.out.println("��ȣ\t�ۼ���\t����");
			int i = 0;
			for(Board temp : b) {
				if(temp != null) {
					System.out.println(i +"\t"+ temp.writer +"\t"+ temp.title);
				}
				i++;
			}
			System.out.println("1. �۾��� 2. �ۺ���"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("*** �۾��� ***");
				System.out.println("����: "); String tit = s.next();
				System.out.println("����: ");	 String con = s.next();
				System.out.println("�ۼ���: ");	String wr = s.next();
				System.out.println("��й�ȣ: ");	String pw = s.next();
				Board t = new Board(tit, con, wr , pw);
				int s1 = 0;
				for(Board temp : b) {
					if(temp == null) {
						b[s1] = t;
						break;
					}
					s1++;
				}
				
				
			}else if(ch == 2) {
				System.out.println("*** �ۺ��� ***");
				System.out.println("��ȣ: "); int ch2 = s.nextInt();
				
				if(b[ch2] != null) {
					System.out.println("��ȣ\t�ۼ���\t����\t����");
					System.out.println(ch2 +"\t" +b[ch2].writer +"\t" + b[ch2].title +"\t" + b[ch2].content);
					
				}else {
					System.out.println("�ش�۾���");
				}
				while(true) {
				
				System.out.println("[1. ��Ϻ��� 2.���� 3.���� ]"); int ch3 = s.nextInt();
					
					if(ch3 == 1) {
					break;
					}else if(ch3 == 2) {
						System.out.println("***����***");
						System.out.println("��й�ȣ: "); String pw = s.next();
						
						if(b[ch2].pw.equals(pw)) {
							b[ch2] = null;
							for(int i1 = ch2; i1 < b.length ; i1++) {
								if(i1 == b.length - 1) {
									b[i1] = null;
								}else {
									b[i1] = b[i1 + 1];
								}
							}
						}
						
						
					}else if(ch3 == 3) {
						System.out.println("*** ���� ***");
						System.out.println("��й�ȣ: "); String pw = s.next();
											
						if(b[ch2].pw.equals(pw)) {
							System.out.println("����: "); String tit = s.next();
							System.out.println("����: "); String con = s.next();
							b[ch2].title = tit;
							b[ch2].content = con;
						}
					}else {
						System.out.println("�˼������ص�");
					}
					
				}
				
				
				
			}else {
				System.out.println("�˼������ൿ�Դϴ�");
			}
			
		}
		
		
		
		
	}
	
	
	
}
