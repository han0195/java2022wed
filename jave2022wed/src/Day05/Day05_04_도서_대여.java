package Day05;

import java.util.Scanner;

/*
	 *  1.����� 2.����/�ڷ���/���� 3.����/�ݺ� 4.����/�ݺ� 5.�迭
	 *  
	 *  ���� �뿩 console���α׷�
	 *  1. �迭 ����
	 *  	1.ȸ�� [���̵�(�ߺ�x), ��й�ȣ]
	 *  	2.���� [������(�ߺ�x), �����뿩����, �뿩��(�α��ν� ���̵�)]
	 *  2. �ʱ�޴�
	 * 		1.ȸ������ 2.�α��� 
	 * 				1.ȸ�����Խ� ���̵� �ߺ�üũ
	 * 	3.�α��ν� �޴�
	 * 		1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
	 * 		2.������Ͻ� ��� ������ ���
	 * 		3.�����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩
	 *  	4.�����ݳ��� ������ �뿩�� ������ �ݳ� ó��
	 * 		5.�α׾ƿ�
	 *  
	 *  4.�α��ν� ���̵� admin �̸� �����ڸ޴�
	 *  	1.������� 2.������� 3.��������(����) 4.�α׾ƿ�
	 *  			1.������Ͻ� �������� �Է¹޾� ���� ���ó��
	 *  			2.������Ͻ� ��� ������ ���
	 *  			3.���������� ������ �������� �Է¹޾� ������ ������ ����[null]
	 *  			4.�α׾ƿ��� �ʱ�޴��� 				
	 */ 

public class Day05_04_����_�뿩 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] ȸ�� = new String[100][2];
		// [0] = id [1] = pw
		string[][] ���� = new String[100][3];
		
		while(true) {
			System.out.println("-------------------���� �뿩���α׷�------------------");
			System.out.println("1.ȸ������ 2.�α���");
			System.out.println("����>> "); int ���� = scanner.nextInt();
			
			if(���� == 1) {
				System.out.println("���̵� �Է����ּ��� : "); String id = scanner.next();
				System.out.println("��й�ȣ�� �Է����ּ��� : "); String pw = scanner.next();
				for(int i = 0; i<ȸ��.length; i++) { // �ݺ� ����
					if (ȸ��[i][0] != null && ȸ��[i][0].equals(id)) { //�ߺ�üũ
						System.out.println("�ߺ��Ǵ� ���̵��Դϴ�.");
					}
					ȸ��[i][0] = id; //�Ƶ��Է�
					ȸ��[i][1] = pw; //����Է�
					break; // Ż��
			}
			else if(���� == 2) { // �α���
				System.out.println("-----------------�α���-----------------------");
				System.out.println("���̵�: "); String id = null;
				System.out.println("��й�ȣ: "); String pw = null;
				
				Boolean pass = true; // �������� �Ǵ�
				
				for(int i = 0; i < ȸ��.length; i++){//�α��� ���� Ȯ��
					if(id == ȸ��[i][0]) { // ���̵� ����Ȯ��
						if(pw == ȸ��[i][1]) { // ��й�ȣ ����Ȯ��
							
						}else {
							System.out.println("����)) ��й�ȣ�� ��ġ�����ʽ��ϴ�");
						}// ��й�ȣ if e
					}else {
						System.out.println("����)) ���̵� ���������ʽ��ϴ�");
					}// id if d
				}// for e
				
			}else { 
				System.out.println("����) �˼����� �ൿ�Դϴ�");
			}
			
			
			
			
			
		}//while e
		
		
		
	}// m e
}// c e
