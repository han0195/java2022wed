package ȸ�������α׷�;

import java.util.Scanner;

//ȸ���� ���α׷� [ Ŭ���� ���� ]

	//0. ȸ�� ���� => ȸ�� Ŭ���� �����
	// 1. ����
		// 1. ���̵� 2. ��й�ȣ 3. �̸� 4. ��ȭ��ȣ
	// 1. �ʱ�޴� [1. ȸ������ 2. �α��� 3.���̵�ã��, 4. ��й�ȣã��]
	// 1. ȸ�����Խ� �Է¹޾� ����
	// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
	// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
	// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ �����ϸ� ��й�ȣ ���
public class ȸ�������α׷�4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Member[] mem = new Member[100];
		
		
		while(true) {
			System.out.println("*** ȸ���� ���α׷� ***");
			System.out.println("[1. ȸ������ 2. �α��� 3.���̵�ã��, 4. ��й�ȣã��]"); int ch = s.nextInt();
			
			if(ch == 1) {
				System.out.println("*** ȸ������ ***");
				System.out.println("id: "); String id = s.next();
				boolean pass = true;
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						pass = false;
						System.out.println("���̵� �ߺ�");
						break;
					}
				}
				if(pass){
					System.out.println("pw: "); String pw = s.next();
					System.out.println("name: "); String name = s.next();
					System.out.println("phone: "); String phone = s.next();
					
					Member t = new Member();
					t.id = id;
					t.pw = pw;
					t.name = name;
					t.phone = phone;
					int i = 0;
					for(Member ts : mem) {
						if(ts == null) {
							mem[i] = t;
							System.out.println("ȸ������ ����");
							break;
						}
						i++;
					}
				}
				
				
				
				
			}else if(ch == 2) {
				System.out.println("*** �α��� ***");
				System.out.println("id: "); String id = s.next();
				System.out.println("pw: "); String pw = s.next();
				boolean pass = false;
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp.pw.equals(pw)) {
							pass = true;
							System.out.println("�α��� ����");
							break;
						}
					}
				}
			}else if(ch == 3) {
				System.out.println("*** ���̵�ã�� ***");
				System.out.println("name: "); String name = s.next();
				System.out.println("phone: ");  String phone = s.next();
				
				for(Member temp : mem) {
					if(temp != null && temp.name.equals(name)) {
						if(temp.phone.equals(phone)) {						
							System.out.println("���̵�: " + temp.id);
							break;
						}
					}
				}
				
			}else if(ch == 4) {
				System.out.println("*** ��� ã�� ***");
				System.out.println("id: "); String id = s.next();
				System.out.println("phone: ");  String phone = s.next();
				
				for(Member temp : mem) {
					if(temp != null && temp.id.equals(id)) {
						if(temp.phone.equals(phone)) {						
							System.out.println("��й�ȣ: " + temp.pw);
							break;
						}
					}
				}
			}else {
				System.out.println("�˼������ൿ");
			}
			
		}
		
	}
}
