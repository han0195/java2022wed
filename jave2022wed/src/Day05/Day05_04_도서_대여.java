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
		String[][] ���� = new String[100][3];
		����[99][0] = "admin";
		����[99][1] = "admin";
		
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
			}
			else if(���� == 2) { // �α���
				System.out.println("-----------------�α���-----------------------");
				System.out.println("���̵�: "); String id = scanner.next();
				System.out.println("��й�ȣ: "); String pw = scanner.next();
				
				Boolean pass = false; // �������� �Ǵ�
				
				for(int i = 0; i < ȸ��.length; i++){//�α��� ���� Ȯ��
					if(id != null && id.equals(ȸ��[i][0])) { // ���̵� ����Ȯ��
						if(pw != null && pw.equals(ȸ��[i][1])) { // ��й�ȣ ����Ȯ��
							pass = true;
							break;
						}
					}
				}// �α��� ���� for e
				
				while(pass) {
					System.out.println("�α��μ���");
					System.out.println("-----------------------------�޴�-----------------------");
					System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�"); int �޴����� = scanner.nextInt();
					
					if(�޴����� == 1) {
						System.out.println("�����̸��� �Է����ּ���: ");	String �����˻� = scanner.next();  
						for(int i = 0; i < ����.length; i++) {
							if(����[i][0].equals(�����˻�)) {
								System.out.println("------------------------�˻� ����------------------------");
								System.out.println("������\t���� �뿩 ����\t�뿩��");
								System.out.println(����[i][0] + ����[i][1] + ����[i][2]);
								break;
							}
						}// ���� ã�� for e
					}// �����˻� if e
					else if(�޴����� == 2) {
						System.out.println("------------------------���� ���------------------------");
						for(int i = 0; i < ����.length; i++) {
							if(����[i][0] != null) {
								System.out.println("������\t���� �뿩 ����\t�뿩��");
								System.out.println(����[i][0] + ����[i][1] + ����[i][2]);
							}else {
								System.out.println("����)) ���� �������� ������ �����ϴ�");
							}//if e
						}
					}// ���� ã�� �ݺ��� e
					else if(�޴����� == 3) {
						
					}
					else if(�޴����� == 4) {}
					else if(�޴����� == 5) {}
					else {}
				}
				// �α��μ��� if e
				if(ȸ��[99][0].equals("admin")) {
					/*
					 * ����
					 */
				}// admin �α��� if e 
				else{
					System.out.println("�α��ν���");
				}
				
			}else { 
				System.out.println("����) �˼����� �ൿ�Դϴ�");
			}// �α��� �������� üũ if e
			
			
			
			
			
			
		}//while e
		
		
		
	}// m e
}// c e
