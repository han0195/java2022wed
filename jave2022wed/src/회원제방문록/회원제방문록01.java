package ȸ�����湮��;

import java.util.Scanner;

public class ȸ�����湮��01 {
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ] => �湮�� ���(��ȣ	�ۼ���	����	����)
			// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] ȸ�� = new String[100][3];
		String[][] �Խ��� = new String[100][3];
		
		
		while(true){
			System.out.println("--------------------�湮��------------------");
			System.out.println("1.ȸ������ 2.�α���"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("--------------- ȸ�� ���� --------------");
				System.out.println("���̵�: "); String id = scan.next();
				System.out.println("��й�ȣ: "); String pw = scan.next();
				System.out.println("�̸�: ");   String name = scan.next();
				
				//�ߺ�
				boolean �ߺ�üũ = true;
				for(int i = 0; i < ȸ��.length; i++) {
					if(ȸ��[i][0] != null && ȸ��[i][0].equals(id)) {
						System.out.println("���̵� �ߺ�");
						�ߺ�üũ = false;
					}						
				}
				
				if(�ߺ�üũ) {
					for(int i = 0; i < ȸ��.length ; i++) {
						if(ȸ��[i][0] == null) {
							ȸ��[i][0] = id;
							ȸ��[i][1] = pw;
							ȸ��[i][2] = name;
							System.out.println("ȸ�����Լ���");
							break;
						}
					}
				}
				
				
			}else if(ch == 2){
				System.out.println("----------------- �α��� ---------------");
				System.out.println("���̵�: "); String id = scan.next();
				System.out.println("��й�ȣ: ");String pw = scan.next();
				
				boolean �α��ο��� = false;
				
				for(int i = 0; i < ȸ��.length; i++) {
					if(ȸ��[i][0] != null && ȸ��[i][0].equals(id)) {
						if(ȸ��[i][0] != null && ȸ��[i][1].equals(pw)) {
							System.out.println("�α��μ���");
							�α��ο��� = true;
							break;
						}
					}
				}
				
			
				while(�α��ο���) {
					System.out.println("---------------------ȸ�� �޴�------------------");
					System.out.println("��ȣ\t����\t����\t�ۼ���");
					for(int i = 0; i < �Խ���.length; i++) {
						if(�Խ���[i][0] != null) {
							System.out.println(i+"\t"+�Խ���[i][0]+"\t"+�Խ���[i][1]+"\t"+�Խ���[i][2]);
						}
					}
					System.out.println("1. �湮�Ͼ��� 2. �α׾ƿ�"); int ch2 = scan.nextInt();
					
					if(ch2 == 1) {
						System.out.println("------ �۾��� ------");
						System.out.println("����: "); String ���� = scan.next();
						System.out.println("����: "); String ���� = scan.next();
						
						for(int i = 0; i < �Խ���.length ; i++) {
							if(�Խ���[i][0] == null) {
								�Խ���[i][0] = ����;
								�Խ���[i][1] = ����;
								�Խ���[i][2] = id;
								break;
							}
						}
						
					}else if(ch2 == 2){
						break;
					}else {
						System.out.println("�˼����� �ൿ�Դϴ�");
					}
					
					
				}
			}else {
				System.out.println("�˼����� �ൿ");
			}
					
			
			
			
			
		}
		
		
		
		
	}

}
