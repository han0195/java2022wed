package �����뿩���α׷�;

import java.util.Scanner;

public class �����뿩���α׷� {
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
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// �Է°�ü ����
		
		String mem[][] = new String[100][3]; // ȸ�� �迭 ����
		String book[][] = new String[100][3];// å �迭 ����
		
		//������ �̸����
		mem[99][0] = "admin"; // id
		mem[99][1] = "1234";  // pw
		mem[99][2] = "���";  // name
		
		while(true) {// ���α׷� ���ѹݺ�
			try {
				System.out.println("***** ���θ޴� *****");
				System.out.println("1.ȸ������ 2.�α��� >>"); int ch = sc.nextInt();//�����Է¹ޱ�
				
				if(ch == 1) {//1.ȸ������			
						System.out.println("***** ȸ������ *****");
						System.out.println("���̵�: ");		String id = sc.next(); // id �Է¹ޱ�
						System.out.println("��й�ȣ: ");		String pw = sc.next();	// pw �Է¹ޱ�
						System.out.println("�̸�: ");			String name = sc.next(); // name �Է¹ޱ�
						boolean pass = true;
						//�ߺ�üũ
						for(int i = 0; i < mem.length ; i++) { // mem ���̸�ŭ �ݺ��ϸ鼭
							if(mem[i][0] != null && mem[i][0].equals(id)) {			// id ���ٸ�
								System.out.println("���̵� �ߺ�"); 
								pass = false;					// ���� x
								break;							// �ߺ�üũ �ݺ��� ����������
							}
						}
						// ����
						if(pass) {// ���� pass true���
							for(int i = 0; i < mem.length ; i++) { // mem ���̸�ŭ�ݺ�
								if(mem[i][0] == null) {				// mem�� null �̶��
									mem[i][0] = id;				//3���� ����
									mem[i][1] = pw;
									mem[i][2] = name;
									System.out.println("ȸ������ ����");
									break;						// �ݺ��� ����������
								}
							}
							
						}// ���� if �� end																									
				}else if(ch == 2) {//2.�α���
					System.out.println("���̵�: ");   	String id = sc.next(); // id �Է¹ޱ�
					System.out.println("��й�ȣ: ");		String pw = sc.next(); // pw �Է¹ޱ�
					boolean pass = false; // pass �� ���
					//�ߺ�üũ
					for(int i = 0; i < mem.length ; i++) { // mem �迭���̸�ŭ �ݺ�
						if(mem[i][0] != null && mem[i][0].equals(id)) {// ���̵� ������
							if(mem[i][0] != null && mem[i][1].equals(pw)) { // ��й�ȣ�� ������
								pass = true; // �α��� ��� true
							}
						}
					}
					//�α��� ������
					while (pass) {					
						if(id.equals(mem[99][0])) {// ������ �α��� 1.������� 2.������� 3.��������(����) 4.�α׾ƿ�
							System.out.println("***** ������ �޴� *****");
							System.out.println("1.������� 2.������� 3.�������� 4.�α׾ƿ�"); int ch2 = sc.nextInt(); // �����Է¹ޱ�
							
							if(ch2 == 1) { //�������
								System.out.println("***** ������� *****");
								System.out.println("������: "); String bn = sc.next(); //�����̸��ޱ�
								for(int i = 0; i < book.length ; i++) { //book �迭���� ��ŭ �ݺ�
									if(book[i][0] == null) {	// �ش��ε����� null�̶��
										book[i][0] = bn;
										book[i][1] = "��뿩";// bn���ֱ�
										System.out.println("������ϼ���");
										break;					// �ݺ��� ����������
									}
								}
							
							}else if(ch2 == 2) {//���� ���
								System.out.println("***** ������� *****");
								System.out.println("����\t\t�����뿩����\t\t�뿩��");
								for(int i = 0; i < book.length ; i++) { // ���� ��� ���� �ݺ���
									if(book[i][0] != null) {	// null �̾ƴϸ� ���� ���
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]); //���
									}
								}
							}else if(ch2 == 3) {// ���� ����
								System.out.println("***** �������� *****");
								System.out.println("������ ����: "); String bn = sc.next(); //�����̸��ޱ�
								for(int i = 0; i < book.length ; i++) {
									if(book[i][0] != null && book[i][0].equals(bn)) {
										System.out.println("��������");
										book[i][0] = null;
										book[i][1] = null;
										book[i][2] = null;
									}
								}
							}else if(ch2 == 4){//�α׾ƿ�
								break;
							}else {
								System.out.println("�˼����� �ൿ");
							}
							
							
						}else{// �Ϲ�ȸ�� �α��� 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
							System.out.println("***** ȸ�� �޴� *****");
							System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�"); int ch2 = sc.nextInt();// ���ð� �Է¹ޱ�
							
							if(ch2 == 1) { // �����˻�
								System.out.println("*****�����˻�*****");
								System.out.println("������: "); String bn = sc.next(); // �����̸� �Է¹ޱ�
								
								for(int i = 0; i < book.length ; i++) {// book�迭�ȿ� bn �̸�ã��
									if(book[i][0] != null && book[i][0].equals(bn)) { // ��������ġ ��� ���
										System.out.println("����\t\t�����뿩����\t\t�뿩��");
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]);
									}
								}
								
								
							}else if(ch2 == 2) { //�������
								System.out.println("***** ������� *****");
								System.out.println("����\t\t�����뿩����\t\t�뿩��");
								for(int i = 0; i < book.length ; i++) { // ���� ��� ���� �ݺ���
									if(book[i][0] != null) {	// null �̾ƴϸ� ���� ���
										System.out.println(book[i][0]+"\t\t"+book[i][1]+"\t\t"+book[i][2]);
									}
								}
								
							}else if(ch2 == 3) { // �����뿩
								System.out.println("***** �����뿩 *****");
								System.out.println("�뿩�� ������: "); String bn = sc.next(); //������ �Է¹ޱ�
								boolean pass2 = false; // ���� �뿩 ��������
								for(int i = 0; i < book.length ; i++) {	// �ݺ���
									if(book[i][0] != null && book[i][0].equals(bn) && book[i][2] == null) { // ���̾ƴϸ鼭 �̸��ޱ�
										System.out.println("�뿩����");
										book[i][1] = "�뿩��";
										book[i][2] = id; // �뿩���� ���̵� �� �ֱ�
										pass2 = true;	//���� true
										break;				// �ݺ��� ����������
									}
								}
								
								if(pass2 == false) {System.out.println("�뿩�Ұ�");} // pass�� �ȵǸ� ���
								
							}else if(ch2 == 4) { // �����ݳ�
								System.out.println("***** ���� �ݳ� *****");
								System.out.println("�ݳ��� ����: "); String bn = sc.next();
								boolean pass2 = false; // ���� �ݳ� ��������
								for(int i = 0; i < book.length ; i++) {
									if(book[i][0] != null && book[i][0].equals(bn) && book[i][2].equals(id)) { //�������̶� �Ƶ� ��ġ�ϸ�
										System.out.println("�ݳ�����");
										book[i][1] = "��뿩";
										book[i][2] = null; // �ݳ�
										pass2 = true; // ���� true
										break;	//�ݺ�������������
									}
								}
								
								if(pass2 == false) {System.out.println("�뿩�Ұ�");} // pass�� �ȵǸ� ���
					
							}else if(ch2 == 5) { // �α׾ƿ�
								break;
							}else { // �׿�
								System.out.println("�˼����� ��ȣ");
							}
						}// ȸ�� �޴� ���ǹ� end
					}
					
					
					
					
					
				}
			}catch (Exception e) {
				System.out.println("�����Ҽ��ִ� �Է¾ �ƴմϴ�" + e);
			}//
		}// whi e	
			
	}// me
}// ce


