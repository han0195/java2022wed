package Day06;

import java.util.Scanner;

public class Day06_03 {

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
		
		// ���� �����ϴ� ���� : ���������Ǽ� �Ҹ� ����
		Scanner scanner = new Scanner(System.in);
		Member[] memberslist = new Member[100];
		// Member Ŭ������ ������� ��ü(id, pw, name, phone) 100�� �����Ҽ� �ִ� �迭 ����
		
		
		
		while(true) {
			System.out.println("-------------------------------- ȸ����[ Ŭ���� ���� ]----------------------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			System.out.println("����: "); int ch = scanner.nextInt();
			
			if( ch == 1) {
				// 1. id, password, name, phone �Է¹ޱ� => ����4��
				System.out.println("----------------------------ȸ������ ������-------------------------------");
				System.out.println("id�� �Է����ּ���: "); String id = scanner.next();
				System.out.println("password �Է����ּ���: "); String pw = scanner.next();
				System.out.println("�̸�: "); String name = scanner.next();
				System.out.println("����ó: "); String phone = scanner.next();
				// 2. ��ü ����
				Member member = new Member();
				
				// 3. �Է¹��� ���� 4���� ��ü�� �ʵ忡 �����ϱ�
				member.id = id;
				member.password = pw;
				member.name = name;
				member.phone = phone;
				
				// * ���̵� �ߺ�üũ
					// 1. �迭�� ��ü�� �Է��� ���̵�� ������ ���̵� ã��
				boolean idcheck = false;
				for( Member temp : memberslist) {
					// * memberlist �迭�� ��ü���� �ϳ��� temp�� ���� �ݺ�
					if( temp != null && temp.id.equals(id))	{
						// ���࿡ �ش� ��ü�� id �� �Է¹��� id�� ������
						System.out.println("�˸�)) ������� ���̵� �Դϴ�");
						idcheck = true; // �ߺ��̸� true;
						break;
					}
				}
				
				// 4. ������ ��ü�� �����ϴ� �迭�� ����
				// ���̵� �ߺ��� ������� ����
				if(idcheck == false) {
					int i = 0;
					for( Member temp : memberslist) {
						// * memberlist �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
						// 2. ���鿡 �ε����� �����ϱ�
						if( temp == null )  {// 1. �����ε��� ã��[ ������ �ƴϸ� ����ȸ���� ���� ]
							memberslist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
							System.out.println("ȸ������ ����");
							break; // for ����� [ �ȳ����� ��� ���鿡 ������ ��ü ����Ǳ� ������ ]
						}
						i++; // �ε��� ����
					} // for �� and
				}// ���̵� üũ ���� Ȯ�� if
				
				
					
				
				
			} // ȸ������ end
			else if(ch == 2) { // �α���
				
				//1. �Է¹ޱ�
				System.out.println("-----------------------------�α��� ������--------------------------------------");
				System.out.println("���̵�: ");	String loginid = scanner.next();
				System.out.println("��й�ȣ: ");	String loginpw = scanner.next();
				
				// 2. �⺻ �迭 [ȸ�� ����Ʈ ] �� �Է¹��� ���� ��
				boolean logincheck = false; // true : �α��μ���	false: �α��ν��� ���� ���� ����
				for( Member temp : memberslist) {
					// * memberslist�� 0�� �ε������� �� �ε������� �ϳ��� temp�� ����
					if( temp != null &&temp.id.equals(loginid) && temp.password.equals(loginpw)) {
						System.out.println("�α��� ����");
						logincheck = true; // �α��� �����ߴٴ� ǥ�� �����
						break;
					}
				}
				
				//�α��� ��������
				if(logincheck == false) {
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}
				
			} // �α��� end
			else if(ch == 3) {// ���̵� ã��
				// 1. �̸� �� ����ó�� �Է¹޴´�.
				System.out.println("-------------------------------���̵�ã�� ������--------------------------------------");
				System.out.println("�̸��� �Է����ּ���: ");		String name = scanner.next();
				System.out.println("����ó�� �Է����ּ���: ");		String phone = scanner.next();
				// 2. �迭�� ������ �̸��� ����ó�� �ִ��� Ȯ���Ѵ�.
				boolean findid = false; // ���̵� ã�Ҵ���
				for (Member temp : memberslist) {
					if(temp != null && temp.name.equals(name) && temp.name.equals(phone)) {
						System.out.println("�˸�)) ���̵� ã�� ����");
						// 3. ������ ��ü�� ������ �ش� ���̵� ���
						System.out.println("ȸ������ ���̵�:" + temp.id);
						findid = true;
						break;
					}
				}
				// 4. ������ ���ٰ� ���
				if(findid == false) {
					System.out.println("�˸�)) ���̵� ã�����߽��ϴ�. [ ã����� ]");
				}
				
				
			} // ���̵� ã�� end
			else if(ch == 4) {// ��й�ȣã��
				System.out.println("------------------------��й�ȣ ã�� ������-------------------------------");
				System.out.println("���̵�: "); String id = scanner.next();
				System.out.println("��ȭ��ȣ: "); String phone = scanner.next();
				boolean findpw = false;
				for(Member temp : memberslist) {
					if(temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.out.println("�˸�)) ��й�ȣ ã�� ����");
						System.out.println("ȸ������ ��й�ȣ: " + temp.password);
						findpw = true;
						break;
					}
				}
				
				if(findpw == false) {
					System.out.println("�˸�)) ��й�ȣ�� ã�����߽��ϴ�. [ ã����� ]");
				}
			} // ��й�ȣ ã�� end
			else { System.out.println("�˸�)) �˼����� ��ȣ�Դϴ�"); } // �׿� end
			
		}//  ���α׷� ���� while end
		
		
		
	}// m e
}// c e
