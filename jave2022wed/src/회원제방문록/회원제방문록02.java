package ȸ�����湮��;

import java.util.Scanner;

public class ȸ�����湮��02 {
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ] => �湮�� ���(��ȣ	�ۼ���	����	����)
			// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] mem = new String[100][3];
		String[][] bor = new String[100][3];
		
		while(true) {
			System.out.println("---------�湮��--------");
			System.out.println("1. ȸ������ 2.�α���"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("------ȸ������------");
				System.out.println("���̵�: "); String id = scan.next();
				System.out.println("��й�ȣ: ");String pw = scan.next();
				System.out.println("�̸�: ");String name = scan.next();
				
				boolean idc = true;
				for(int i = 0 ; i < mem.length; i++) {
					if(mem[i][0] != null && mem[i][0].equals(id)) {
						System.out.println("���̵� �ߺ��˴ϴ�");
						idc = false;
						break;
					}
				}
				
				if(idc) {
					for(int i = 0; i < mem.length; i++) {
						if(mem[i][0] == null) {
							mem[i][0] = id;
							mem[i][1] = pw;
							mem[i][2] = name;
							System.out.println("�α��μ���");
							break;
						}
					}
				}
				
				
			}else if(ch == 2) {
				System.out.println("-----------�α��� ------------");
				System.out.println("���̵�: "); String id = scan.next();
				System.out.println("��й�ȣ: ");String pw = scan.next();
				
				boolean idpwch = false;
				for(int i = 0; i < mem.length; i++) {
					if(mem[i][0] != null && mem[i][0].equals(id)) {
						if(mem[i][0] != null && mem[i][1].equals(pw)) {
							idpwch = true;
						}
					}
				}
				
				
				while(idpwch) {
					System.out.println("------------ȸ���޴�-------------");
					System.out.println("��ȣ\t����\t����\t�ۼ���");
					for(int i = 0; i < bor.length; i++) {
						if(bor[i][0] != null) {
							System.out.println(i +"\t"+ bor[i][0] +"\t"+ bor[i][1] +"\t"+ bor[i][2]);
						}
					}
					System.out.println("1. �湮�Ͼ��� 2. �α׾ƿ� "); int ch2 = scan.nextInt();
					
					if(ch2 == 1) {
						System.out.println("---------�۾���-------");
						System.out.println("����: "); String tit = scan.next();
						System.out.println("����: "); String con = scan.next();
						
						for(int i = 0; i < bor.length; i++ ) {
							if(bor[i][0] == null) {
								bor[i][0] = tit;
								bor[i][1] = con;
								bor[i][2] = id;
								break;
							}
						}
						
					}else if(ch2 == 2) {
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
