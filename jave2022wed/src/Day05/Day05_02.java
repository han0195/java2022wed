package Day05;

import java.util.Scanner;

public class Day05_02 {
	
	// ȸ���� �湮�� ���α׷� [ 2�����迭 ] 
		// 1. �ʱ�޴� [ 1. ȸ������ 2.�α��� ] 
			// 1. ȸ������ [ ���̵� , ��й�ȣ , �̸� ]
			// 2. �α��� [ ���̵� , ��й�ȣ �����ϸ� �α���ó�� ]
		// 2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
			// 1. �湮�Ͼ��� [ ���� , ���� , �ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	
	///////////////////////
	
	
	public static void main(String[] args) {
		
		// �غ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü
			// ȸ�� 100��[id,password,name] �����ϴ� �迭
		String[][] memberlist = new String[100][3]; // 100�� 3��	=> ȸ���� 1��	[1��=id][2��=pw][3��=name]
			// �湮�� 100��[ title , contents , writer ] �����ϴ� �迭 
		String[][] boardlist = new String[100][3];	// �Խù��� 1��
		
		while(true) { // ���ѷ��� [ �������� : x ] 
			System.out.println("------------------------");
			System.out.println("-------ȸ���� �湮��-------");
			System.out.println("------------------------");
			System.out.print("1.ȸ������ 2.�α��� ���� : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) { 
				System.out.println("-------- ȸ������ ������ ---------");
				System.out.print(" MEMBER ID : "); 			String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : "); 	String password = scanner.next();
				System.out.print(" MEMBER NAME : "); 		String name = scanner.next();
				// String 3�� ������ �Է¹޾� memberlist 2���� �迭�� ���� 
					// 1. �� ����[ ����=0 , ��ü(���ڿ�) = null  ]�� ã�Ƽ� ���� [ ���࿡ ������� ������ ȸ�� 100�� �ʰ� ]
					// 2. ���̵� �ߺ�üũ 
				
				// ���̵� �ߺ�üũ 
				boolean idcheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						// == nell : ȸ�� x !- = ȸ�� o 
						System.out.println("���̵� �ߺ��Ǿ����ϴ�");
						idcheck = false;
						break;
					}
				}//for e
				
				boolean pwcheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][1] != null && memberlist[i][1].equals(password)) {
						// == nell : ȸ�� x !- = ȸ�� o 
						System.out.println("��й�ȣ�� �ߺ��Ǿ����ϴ�");
						pwcheck = false;
						break;
					}
				}//for e
				
				
				// ����κ�
				if(idcheck == true && pwcheck == true) {
					for( int i =0 ; i<memberlist.length ; i++ ) {
						if( memberlist[i][0] == null) { // i��° �� �� id�� ������ = �����
							memberlist[i][0] = id;	memberlist[i][1] = password; 
							memberlist[i][2] = name; // i��° �� ���� ������ ���� 
							System.err.println(" �˸�]] ȸ�������� �Ǿ����ϴ�.");
							break; // ���������� �� [ 1���� ���� ]
						}
					}// for e
				}// if e
				else {
					System.out.println("����) ȸ������ ����");
				}
				
 			} // if end 
			
			// �α���
			else if( ch == 2 ) {
				System.out.println("-------- �α��� ������ ---------");
				System.out.print(" MEMBER ID : "); 			String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : "); 	String password = scanner.next();
				
				boolean logincheck = false; // �α��� ���� �⺻��
				for( int i =0 ; i<memberlist.length ; i++ ) { // �迭�� �����Ͱ� �Է¹��� id�� password�� �����ϸ� �α���ó��
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(password) ) { // i��° �࿡ id�� password �� �Է¹��� ���� equals ������
						
							// null �� ��ü�� �ƴϱ� ������ equals �� �Ұ��� => == ����
						System.err.println(" �˸�]] �α��� ���� ");
						
						logincheck = true; // �α��� ����
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						while( true ) {
							System.out.println("---------------------------------------------");
							System.out.println("-------------------�湮��----------------------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							
									//��� �湮�� ���
									for(int j = 0; j < boardlist.length; j++) {
										if(boardlist[j][0] != null) {
											System.out.printf("%d\t%s\t%s\t%s \n0", j, boardlist[j][2], boardlist[j][0], boardlist[j][1]);
										}
									}// �湮�� ��� for�� e
									
							System.out.println("1.�湮�ϳ���� 2.�α׾ƿ� ����: "); int ch2 = scanner.nextInt();
							
							if(ch2 == 1 ) { 
								System.out.println("--------------------------�۾���------------------------");
								System.out.println(" title: "); String title = scanner.next();
								System.out.println(" content: "); String content = scanner.next();
								//�迭�� ����ã�Ƽ� ����
								for( int j = 0; j < boardlist.length; j++) {
									if(boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // �α��ν� ���� id ����.
										System.out.println(" �˸�)) �湮�� �ۼ��� �Ϸ�Ǿ����ϴ�.");
										break;
									}
								}
							}
							else if(ch2 == 2) { 
								System.out.println("�˸�)) �α׾ƿ�");
								break; // ���� ����� �ݺ��� Ż��
							}
							else { System.out.println("�˸�)) �˼� ���� ��ȣ�Դϴ�!!");}
						}	//ȸ�� �޴� while 
						
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
					} //if end == login
				} // login for end
				// �α��� ���н�
				if( logincheck == false ) System.out.println("�˸�)) ȸ�������� �ٸ��ϴ�");
				
			}// ch == 2 if e
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�.!!"); }
		} // while 1 end = �ʱ� �޴� end
		
		
		
	} // m e 
} // c e 

