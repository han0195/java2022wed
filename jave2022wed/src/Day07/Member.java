package Day07;

import java.util.Scanner;

public class Member {

	// 1.�ʵ�
	int mno;	// ȸ����ȣ [ �ڵ���ȣ, �ߺ�x ]
	String id;	// ���̵� [ �ߺ�x ]
	String pw;	// ��й�ȣ
	String name;	// �̸�
	String phone;	// ����ó
	// 2.������ [ �����ڸ� == Ŭ������ ]
		// 1. �������[�⺻������]
	public Member( ) {}
		// 2. ��� �ʵ带 �޴� ������
	public Member(int mno, String id, String pw, String name, String phone) {
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	// 3.�޼ҵ�
	
	
	boolean ȸ������() {// 1. ȸ������ �޼ҵ� [ �μ� x ��ȯ x]  ���Լ��� true : false;
		System.out.println("------------------ ȸ������ ������ ------------------");
		//1. �Է¹ޱ�
		System.out.println("���̵� �Է�: ");  String id = Day07_05Application.scanner.next();
		// * ���̵� �ߺ�üũ
				for( Member temp : Day07_05Application.members ) {
					if(temp != null && temp.id.equals(id)) {
						// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
						System.out.println("���� ���� ������� ���̵� �Դϴ�");
						return false;
					}
				}
		System.out.println("��й�ȣ�� �Է�: "); String pw = Day07_05Application.scanner.next();
		System.out.println("�̸� �Է�: "); 	String name = Day07_05Application.scanner.next();
		System.out.println("��ȭ��ȣ �Է�: ");	String phone = Day07_05Application.scanner.next();
		
		// * ȸ����ȣ �ڵ����� [ �����ֱ��� ȸ����ȣ + 1 ]
		int bno = 0; // ȸ����ȣ �����ϴ� ����
		int j = 0;	// �ݺ�Ƚ��
		for( Member temp : Day07_05Application.members) {
			
			if (temp == null) { //null ã�� [ null ã������ null -1 �ϸ� ������ ȸ��]
				if( j == 0 ) {	//ù��° �ε���[0�� �ε���]�� null => ùȸ�� => ùȸ����ȣ = 1�ο�
					bno = 1; // ù��° �ε����� null => ùȸ����ȣ = 1 �ο�
					break;
				}
				bno = Day07_05Application.members[j - 1].mno + 1;
					  ///////////������ȸ�� ã�°�///////////�� ȸ���� mno ��ȣ�� +1 
											//null �� [ ������ȸ�� ]��ȣ�� +1 
				break;
			}
			j++;
		}
		
		
		//2. 4������ -> ��üȭ -> 4��
		Member member = new Member(bno, id, pw, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü����
		//3. �迭�� ������� ã�Ƽ� ���ο� ȸ�� ��ü �ֱ�
		int i = 0;  
		for(Member temp : Day07_05Application.members) {
			if(temp == null) {
				Day07_05Application.members[i] = member;
				System.out.println("ȸ������ ȸ����ȣ��: " + bno);
				return true; // ������ �޼ҵ� ����
			}
			i++;
		}// �ߺ�üũ for�� end
		return false; // ���н� ����
	}// ȸ������ �޼ҵ� end
		
	
	
	String �α���() {// 2. �α��� �޼ҵ� [ �μ�x ��ȯo] ������ ���̵��ȯ ���н� null
		System.out.println("------------------ �α��� ������ ------------------");
		System.out.println("���̵�: ");	String id = Day07_05Application.scanner.next();
		System.out.println("��й�ȣ: ");	String pw = Day07_05Application.scanner.next();
		for(Member temp : Day07_05Application.members) {
			if(temp !=null && temp.id.equals(id)) {// �Ϲ�ȸ�� �α���
				return temp.id; //**1. ���⼭ id �����ְ�
			}
		}// for end
		return null;
	
	}// �α��� end
		
	
	
	
	void ���̵�ã��() {// 3. ���̵� ã�� �޼ҵ�
		System.out.println("------------------ ���̵�ã�� ������ ------------------");
		System.out.println("�̸�: ");  	String name = Day07_05Application.scanner.next();
		System.out.println("��ȭ��ȣ: "); 	String phone = Day07_05Application.scanner.next();
		int i = 0; // �ݺ�Ƚ��
		for( Member temp : Day07_05Application.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {// �̸� ��ȭ��ȣ�� �����Ҷ� 
				System.out.println("����� ���̵�: " + temp.id);
				return;
			}
		}// for end
		System.out.println("ȸ���� ���������ʽ��ϴ�");
		
	}// ���̵�ã�� end
		
	
	
	
	void ��й�ȣã��() {// 4. ��й�ȣã�� �޼ҵ�
		System.out.println("------------------ ��й�ȣã�� ������ ------------------");
		System.out.println("���̵�: ");  	String id = Day07_05Application.scanner.next();
		System.out.println("��ȭ��ȣ: "); 	String phone = Day07_05Application.scanner.next();
		int i = 0; // �ݺ�Ƚ��
		for( Member temp : Day07_05Application.members) {
			if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {// �̸� ��ȭ��ȣ�� �����Ҷ� 
				System.out.println("����� ��й�ȣ: " + temp.pw);
				return;
			}
		}// for end
		System.out.println("ȸ���� ���������ʽ��ϴ�");
		
	}// ��й�ȣã�� end
		// 5. ȸ��Ż�� �޼ҵ�
		// 6. ȸ������ �޼ҵ�
}
