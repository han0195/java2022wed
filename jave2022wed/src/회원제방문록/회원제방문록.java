package ȸ�����湮��;

import java.util.Scanner;

public class ȸ�����湮�� {
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ] => �湮�� ���(��ȣ	�ۼ���	����	����)
			// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//�Է°�ü����
		
		String[][] memberlist = new String[100][3]; // ��� 2�����迭���� [1]���̵� [2]��й�ȣ [3]�̸�
		String[][] boardlist = new String[100][3];  // �湮�� 2�����迭����[1]���� [2]���� [3]�۾���
		
		while (true) {//���α׷����� ���ѷ���
			System.out.println("-----------ȸ����-----------");
			System.out.println("1.ȸ������ 2.�α���"); int ch = scan.nextInt();
			
			if(ch == 1) {
				System.out.println("-------------------ȸ������-----------------");
				System.out.println("���̵� �Է����ּ���: "); String id = scan.next(); // id �Է¹ޱ�
				System.out.println("��й�ȣ�� �Է����ּ���: "); String pw = scan.next(); // pw �Է¹ޱ�
				System.out.println("�̸��� �Է����ּ���: ");	String name = scan.next(); // �̸� �Է¹ޱ�
				boolean idcheck = true; // ���̵� �ߺ�üũ 
				// id �ߺ�üũ
				for(int i = 0; i < boardlist.length; i++) { // boardlist ���̸�ŭ �ݺ�
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) { // id ���� �����Ѱ��� ã������
						System.out.println("���̵� �ߺ��Ǿ����ϴ�");
						idcheck = false;				// ���̵�üũ false
						break;							// �ݺ��� ����������
					}
				}//for end
				
				if(idcheck) { // id = true ���
					for(int i = 0; i < memberlist.length; i++) { // // boardlist ���̸�ŭ �ݺ�
						if(memberlist[i][0] == null) {	// null�� �ƴ϶��
							memberlist[i][0] = id; // i �ε��� 0���� ����
							memberlist[i][1] = pw; // i �ε��� 1���� ����
							memberlist[i][2] = name; // i �ε��� 2���� ����
							System.out.println("ȸ������ ����!!!!");
							break;// �����ϸ� ����������
						}
						i++;// null�� ������ �ݺ�
					}// null ã�� for end
				}// if end															
				
			}else if(ch == 2){
				System.out.println("---------------�α���----------------");
				System.out.println("���̵�: "); String id = scan.next(); // id �Է¹ޱ�
				System.out.println("��й�ȣ: "); String pw = scan.next();// pw �Է¹ޱ�
				boolean �α���üũ = false; // �α��� ��������
				for(int i = 0; i < memberlist.length; i++) {// �迭���̸�ŭ �ݺ�
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) { // ���̵� �����ϸ�
						if(memberlist[i][0] != null && memberlist[i][1].equals(pw)) {//��й�ȣ�� �����ϸ�
							�α���üũ = true; //�α��� üũ true
							System.out.println("�α��� ����");
							break; // �����̸� ����������
						}
					}
				} // for end
				
				if(�α���üũ == false) {
					System.out.println("�α��ν���");
				}
				
				while(�α���üũ){
					System.out.println("-----------------------ȸ�� �޴�------------------------");
					
					//�湮�� ���
					System.out.println("��ȣ\t����\t����\t�ۼ���");
					for(int i = 0; i < boardlist.length; i++) { // boardlist ���̸�ŭ �ݺ�
						if(boardlist[i][0] != null) {	// null �� �ƴ϶��
							System.out.println(i +"\t"+ boardlist[i][0] +"\t"+ boardlist[i][1] +"\t"+ boardlist[i][2]); // �湮�� ���
						}
					}
					System.out.println("1.�湮�Ͼ��� 2.�α׾ƿ�"); 
					int ch2 = scan.nextInt(); // ���� �Է¹ޱ�
					
					if(ch2 == 1) {
						System.out.println("----------------�۾���------------------");
						System.out.println("����: "); String ���� = scan.next(); //�����Է¹ޱ�
						System.out.println("����: "); String ���� = scan.next(); // �����Է¹ޱ�
						
						for(int i = 0; i < boardlist.length; i++) { // boar���̸�ŭ �ݺ�
							if(boardlist[i][0] == null) { //null �̶��
								boardlist[i][0] = ����; // ���񰪳ֱ�
								boardlist[i][1] = ����;	// ���밪�ֱ�
								boardlist[i][2] = id;	// id���ֱ�
								System.out.println("�ۼ��Ϸ�");
								break; // ����Ϸ�Ǹ� �ݺ��� ����������
							}
						}
						
						
					}else if(ch2 == 2) { // 2�� ����������
						break; // ȸ�� �޴� ����������
					}
					
				}
				
				
				
				
			}else {// �׿�
				System.out.println("�˼����� �ൿ");
			}
			
		}
 		
		
	}//me
}//cs
