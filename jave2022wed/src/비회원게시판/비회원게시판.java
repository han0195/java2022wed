package ��ȸ���Խ���;

import java.util.Scanner;

public class ��ȸ���Խ��� {
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
	
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
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); // �Է°�ü ����
		Board[] b = new Board[100];			// Ŭ�����迭 ����
		
		
		while(true) { // ���α׷�����
			System.out.println("------- ��ȸ�� �Խ��� ------");
			System.out.println("��ȣ\t�ۼ���\t����"); 
			int sw = 0;				// �ݺ�Ƚ������
			for(Board temp : b) { // �ݺ�
				if(temp != null) {	// ���̾ƴϸ� ���� ���
					System.out.println(sw +"\t"+ temp.writer + "\t" + temp.title );
				}
				sw++;	// �ݺ�Ƚ�� ++
			}
			System.out.println("------------------------------------------");
			System.out.println("1. �۾��� 2. �ۺ���");	int ch = s.nextInt(); // �����Է¤��ٱ�
			if(ch == 1) {
				System.out.println("�۾���");
				System.out.println("����: "); String tit = s.next();	// �����Է¹ޱ�
				System.out.println("����: ");	String con = s.next();	// �����Է¤��ٱ�	
				System.out.println("�ۼ���: "); String wr = s.next();	// �ۼ��� �Է¹ޱ�
				System.out.println("���: ");	String pw = s.next();	// ��й�ȣ �Է¹ޱ�
				Board tem = new Board(tit, con, wr, pw);			//��üȭ 
				int j = 0;	//�ݺ�Ƚ�� ����
				for(Board temp : b){	// �ݺ�
					if(temp == null) {	//��������� 
						b[j] = tem;	// ����
						break;
					}
					j++;
				}
				
				
			}else if(ch == 2) { // �ۺ���
				System.out.println("���ϴ� �ε���: "); int index = s.nextInt(); //��ȣ�Է¹ޱ�
				if(b[index] != null) { // �ش��ȣ ���� ������
					while(true) {	//���ѹݺ�
						System.out.println("��ȣ\t�ۼ���\t����\t����");
						System.out.println(index + "\t" + b[index].writer + "\t" + b[index].title + "\t" + b[index].content); // �ش��ȣ �ε����� �ʵ� ���
						System.out.println("---------------------------------------------");
						System.out.println("1. ��Ϻ��� 2.���� 3.���� "); int ch2 = s.nextInt();	// �����Է¹ޱ�
						
						if(ch2 == 1) {// ��Ϻ���
							break;	// �ݺ�������������
						}else if(ch2 == 2) {
							System.out.println("��***����");
							System.out.println("��й�ȣ: "); String pw = s.next(); // ��й�ȣ �Է¹ޱ�
							
							if(b[index].pw.equals(pw)) {	// �ش� pw ������
								b[index] = null;	// �ʱ�ȭ
							}
							
							for(int i = index ; i < b.length ; i++) {	// �ݺ�
								if(i == b.length - 1) {	// �������ε������ �׳� null
									b[i] = null;
								}else {	//�ƴ϶�� ��ĭ�� �����
									b[i] = b[i + 1];
								}
							}
							break;
							
						}else if(ch2 == 3 ) { // ����
							System.out.println("*** ����");
							System.out.println("��й�ȣ: "); String pw = s.next(); //��й�ȣ�Է¹ޱ�
							
							System.out.println("����: ");	String tit = s.next();	// �����Է¹ޱ�
							System.out.println("����: "); String con = s.next();	// �����Է¹ޱ�
							
							b[index].title = tit;	//�ش��ʵ��� ����
							b[index].content = con;	//�ش��ʵ��� ����
						}else{	//�׿�
							System.out.println("�˼����� �ൿ");
						}
					}
								
					
				}else {
					System.out.println("�ش��ϴ� ���̾����ϴ�");
				}
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
	}

}
