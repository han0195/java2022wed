package ȸ�������α׷�;

import java.util.Scanner;

import ����.Main;

public class ȸ�������α׷� {

	// ȸ���� ���α׷� [ Ŭ���� ���� ]
	
			//0. ȸ�� ���� => ȸ�� Ŭ���� �����
				// 1. ����
					// 1. ���̵� 2. ��й�ȣ 3. �̸� 4. ��ȭ��ȣ
			// 1. �ʱ�޴� [1. ȸ������ 2. �α��� 3.���̵�ã��, 4. ��й�ȣã��]
				// 1. ȸ�����Խ� �Է¹޾� ����
				// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
				// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
				// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ �����ϸ� ��й�ȣ ���
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //�Է°�ü ����
		Member[] mem = new Member[100]; // mem �迭
		
		while (true) {
			System.out.println("***** ȸ���� ���α׷� *****");
			System.out.println("1. ȸ������ 2. �α��� 3.���̵�ã��, 4. ��й�ȣã��"); int ch = s.nextInt(); // �����Է¹ޱ�
			
			if(ch == 1) {
				System.out.println("*** ȸ������ ***"); 
				System.out.println("���̵�: "); 	String id = s.next(); //id �Է¹ޱ�
				//�ߺ�üũ
				boolean pass = true; // �������
				for(Member temp : mem) {	// mem �迭 �ݺ�
					if(temp != null && temp.id.equals(id)) { // null�� �ƴϰ� id�� �ߺ��Ǹ�
						pass = false;	//�����
						break;			// ����������
					}
				}		
				if(pass) {// ����� ����
					System.out.println("pw: ");		String pw = s.next(); /// pw �Է¹ޱ�
					System.out.println("�̸�: ");		String name = s.next();	// �̸� �Է¹ޱ�
					System.out.println("����ȣ: ");	String phone = s.next();	//��ȭ��ȣ �Է¤��ٱ�
					Member t = new Member();	// ��ü ����	
					t.id = id;	//id ����
					t.pw = pw;	// pw ����
					t.name = name;	//�̸� ����
					t.phone = phone;	// ��ȭ��ȣ ����
					for(int i = 0; i < mem.length ; i++) { // �ݺ���������
						if(mem[i] == null) {	// ���̸� ����
 							mem[i] = t;	// ��ü�迭�� ��ü ����
 							System.out.println("ȸ�����Լ���");
 							break;	//���������� ����������
						}				
					}
				}else {
					System.out.println("���̵� �ߺ�"); 
				}			
			}else if(ch == 2){//�α���
				System.out.println("**** �α��� ****");
				System.out.println("id: "); String id = s.next(); // id �Է¹ޱ�
				System.out.println("pw: ");	String pw = s.next();	// pw �Է¹ޱ�
				for(Member temp : mem) {	//for�� ���� �ϳ��� ����
					if(temp != null && temp.id.equals(id)) {	// ���̾ƴϰ� id ���̰�����
						if(temp != null && temp.pw.equals(pw)) {	// pw ������
							System.out.println("�α��μ���");			
							break;	// ����������
						}
					}
				}
				
			}else if(ch == 3){// ���̵� ã��
				System.out.println("***** ���̵� ã�� *****");
				System.out.println("�̸�: "); String name = s.next(); //�̸��Է¹ޱ�
				System.out.println("��ȭ��ȣ: ");	String pho = s.next();	// ���Է¹ޱ�
				
				for(Member temp : mem) { //mem �迭 ��������
					if(temp != null && temp.name.equals(name)) { //�̸� / ����ȣ ������ ���̵� ���
						if(temp != null && temp.phone.equals(pho)) {
							System.out.println("���̵�: " + temp.id);
							break;
						}
					}
				}
			}else if(ch == 4){// ��й�ȣ ã��
				System.out.println("***** ��й�ȣ ã�� *****"); 
				System.out.println("���̵�: "); String id = s.next();
				System.out.println("��ȭ��ȣ: ");	String pho = s.next();
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp != null && temp.phone.equals(pho)) {// ���̵� �� ������ ��й�ȣ ���
							System.out.println("��й�ȣ: " + temp.pw);
							break;
						}
					}
				}
			}else {// �׿�
				System.out.println("�˼����� �ൿ");
			}
			
		}// ���α׷����� end
		
		
		
	}// ms
	
}// cs
