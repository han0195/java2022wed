package Day05;

import java.util.Scanner;

public class Day05_04_����_�뿩 { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����
		//���� ���� ����
		String ȸ��[][] = new String[100][2];
		String ����[][] = new String[100][3];
		// [0] id [1] pw

		
		ȸ��[99][0] = "admin";
		ȸ��[99][1] = "1234";
		//�׽�Ʈ
		ȸ��[98][0] = "1234";
		ȸ��[97][1] = "1234";
		����[99][0] = "1234";
		while(true) {//���θ޴�
			System.out.println(" ---------���� �޴� ----------");
			System.out.println(" 1. ȸ������ 2. �α��� "); int ���� = scanner.nextInt();
			if(����==1 ) { //ȸ������ ���ý�
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
			} // ȸ������ ��
			
			
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
				
				
				while(pass){
					if(pass == true && id!="admin") {
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
								}
							}
						}// ���� ã�� �ݺ��� e
						
						else if(�޴����� == 3) {// ���� �뿩
							System.out.println("�뿩�� ������ �̸��� �Է����ּ���: "); String ������ = scanner.next();
							boolean �޴�3���� = true; 
							for(int i = 0; i < ����.length; i++) {
								�޴�3���� = false;
								if(����[i][0] != null && ����[i][0].equals(������)) { // ã�������� �ִ���
									System.out.println("ã�ҽ�����");//�׽�Ʈ
								} // ã�������� �ִ���
							}
						}
						else if(�޴����� == 4) {// ���� �ݳ�
							
						}
						else if(�޴����� == 5) {
							System.out.println("�α׾ƿ�");
							break;
						}
						
					} 
				}
				//�����ڸ޴� ����
				if(id.equals("admin")) { // ���̵� �����̸�
					while(true) {
					System.out.println("----�����ڸ޴�----");
					System.out.println("1. ������� 2. ������� 3. �������� 4. �α׾ƿ�"); int �����ڼ��� = scanner.nextInt();
					if (�����ڼ��� == 1) { // ��� start
						System.out.println("����� ���� �̸� : "); String ���� = scanner.next();
						for(int j = 0; j<100; j++) {// j�� 1���� 100���� �ݺ� ���� ����
							if (����[j][0]==null) {// ���� �迭���� ������ �� ĭ�̶��
								(����[j][0]) = ����;}
								else if (����[j][0]!=(null)) {//������ �� ĭ�� �ƴϸ�
									(����[j+1][0])=����;
								}
								break;
							
							
						} // for end
						
					}// ��� end
					if (�����ڼ��� == 2) { // ��� start
						System.out.println("------------------------���� ���------------------------");
						for(int i = 0; i < ����.length; i++) {
							if(����[i][0] != null) {
								System.out.println("������\t���� �뿩 ����\t�뿩��");
								System.out.println(����[i][0] + ����[i][1] + ����[i][2]);
							
							}//if e
						}
					}// ���� ã�� �ݺ��� e
					if (�����ڼ��� == 3) { // ���� start
						System.out.println("������ ������ �Է� : "); String ���������� = scanner.next();
						for(int i = 0; i<����.length; i++) {
							if(����[i][0]!=null) {
								if (����[i][0].equals(����������)) {
									����[i][0]=null;
								}
							}
						}
					} // ���� end
					if (�����ڼ��� == 4) {
						break;
					}
				}
			}//�����ڸ޴� end
				
		}//�α��� end
			else { 
				System.out.println("����) �˼����� �ൿ�Դϴ�");
			}// �α��� �������� üũ if e
			

		}//while end
		
	} // m e
	
} // c e