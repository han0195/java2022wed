package Day06;

import java.util.Scanner;

import javax.swing.border.Border;

public class Day06_06 {
	
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
	
		//0. �Խù� ���� => Ŭ���� ����
			// �ʵ� : ����, ����, �ۼ���, ��й�ȣ
			// ������: ������� ����
	
		//1. ùȭ�� [ ��� �Խù� (��ȣ, �ۼ���, ����) ��� ]
		//2. �޴� [ 1. �۾��� 2. �ۺ��� ]
			//1. �۾��� [ ����, ����, �ۼ���, ��й�ȣ�� �Է¹޾� => 4������ -> ��üȭ ]
			//2. �ۺ��� [ �ش� �۹�ȣ�� �Է¹޾� �ش� �� ��������(��ȣ, �ۼ���, ����, ����) ǥ�� ]
				// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
				// �ۺ��� �޴�
		//3. �ۺ��� �޴� [1. ��Ϻ��� 2.���� 3.���� ]
				// 1. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����
					
	public static void main(String[] args) {
		
		// �غ� [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[3];
			// * Board ��ü�� 100���� �����Ҽ� �ִ� 1���� �迭 ����
		
		//���α׷� ����
		while(true) { // ���α׷� ���� ���ѷ���
			
			System.out.println("------------------------Ŀ�´�Ƽ ----------------------------");
			// ��� �Խù� ��ȸ
			System.out.println("��ȣ\t�ۼ���\t����");
//----------------------------------------------------------------------------------------------
			//�迭�� ��� ��ü(���̽ù� ��� �ݺ���
			int index = 0; // �ε��� ���� [�迭�� ��ü �� üũ] 
				for(Board board : boardlist) {
					if(board != null) {
						System.out.printf("%d\t%s\t%s\n", index, board.writer, board.title);
					}
					index++; // �ε��� ����
				}
//--------------------------------------------------------------------------------------------------
			System.out.println("1.�۾��� 2.�ۺ���");
			int ch = scanner.nextInt();
//-----------------------------------------------------------------------------------------------------------------------
			int ch1;
			if (ch == 1) {//1.�۾���
		  //�۾���---------------------------------------------------------------------------------------------------------------------
				System.out.println("-----------------------------�� ���� ������--------------------------------");
				System.out.println("title : ");		String title = scanner.next();
				System.out.println("content: ");	String content = scanner.next();
				System.out.println("writer: ");		String wrtier = scanner.next();
				System.out.println("password: ");	String password =scanner.next();
				// 2. 4�� ������ ��üȭ [ ��ü�� ���� 4�������� ��ü�� �ʵ忡 ���� ]
				Board border = new Board(title, content, wrtier, password);
						// 4�� �ʵ带 ���� ������ ���
				//3. �迭�� ������� ã�Ƽ� ������� ��ü ����
		  //--------------------------------------------------------------------------------------------------------------------
				int i = 0;
				for(Board temp : boardlist) {
					if(temp == null) { // ����� ã������
						boardlist[i] = border; // �ش� �ε����� ���ο� ��ü ����
						break;
					}
					i++;
				}
			}//1.�۾��� end
//--------------------------------------------------------------------------------------------------------------------
			else if(ch == 2) {//2.�ۺ���
				System.out.println(" �Խù� ��ȣ(�ε���) ����: "); int bno = scanner.nextInt();
				if(boardlist[bno] == null) {System.out.println("�ش�Խñ��̾����ϴ�");}// �ش� �ε�����������
				else {// �ش��ε�����������
					System.out.println("-----------------------------�Խù� ��������------------------------");
					System.out.printf("�ۼ���: %s ����: %s \n", boardlist[bno].writer, boardlist[bno].title);
					System.out.printf("����: %s\n", boardlist[bno].content);
					System.out.println("-----------------------------------------------------------------");
					System.out.println("1. ��Ϻ��� 2.���� 3.����"); int ch2 = scanner.nextInt();	
					if( ch2 == 1 ) {// ��Ϻ���
						
					}// 1.��Ϻ��� end
					else if(ch2 == 2) {// 2. ����
						System.out.println("--------------------------------����--------------------------");
						System.out.println("�ۼ��ڸ� �Է����ּ���: "); String id = scanner.next();
						System.out.println("��й�ȣ�� �Է����ּ���: "); String pw = scanner.next();
						if(boardlist[bno].writer.equals(id) && boardlist[bno].passwerd.equals(pw)) {// �ۼ��� ��й�ȣ�� ��ġ�ϴٸ�
							boardlist[bno] = null;
							System.out.println("������ �Ϸ�Ǿ����ϴ�");
							// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
							//��??? ���࿡ �ش� �ڵ尡 ������� �迭�� ����
							for( int i = bno; i < boardlist.length ; i++ ) {// * �˻��� �Խù��� �ε��� ���� �������ε��� ���� 1�� ����
								if( i == boardlist.length-1 ) // �����ҷ��°� �������ε����� ������ ���ܿ� �ʿ䰡 �����ϱ� �׳� nulló��
									boardlist[i] = null;
								else {					      //������ �ε��� �� �ƴ϶�� ������ �̵� ó��
									boardlist[bno] = boardlist[bno+1];// ������ �Խù� ���� �Խù�
								}
									// * 2�ε��� = 3�ε���
									// * 3�ε��� = 4�ε���
							    	// ~~~~~~~~~~~~
									// * 98�ε��� = 99�ε���
									// * 99�ε��� = null	
							}
						}
						else {
							System.out.println("������ �����߽��ϴ�");
						}
	//------------------------------------------------------------------------------
						
	//------------------------------------------------------------------------------
					}// 2.���� end
					else if(ch2 == 3) {
						System.out.println("�ۼ��ڸ� �Է����ּ���: "); String id = scanner.next();
						System.out.println("��й�ȣ�� �Է����ּ���: "); String pw = scanner.next();
						if(boardlist[bno].writer.equals(id) && boardlist[bno].passwerd.equals(pw)) {// �ۼ��� ��й�ȣ�� ��ġ�ϴٸ�
							System.out.println("-------------------------------����-----------------------------");
							System.out.println("������ ������ �Է����ּ���: ");boardlist[bno].title = scanner.next();
							System.out.println("������ ������ �Է����ּ���: ");boardlist[bno].content = scanner.next();
							System.out.println("���� �Ϸ�Ǿ����ϴ�");
						}
						else {
							System.out.println("���� �����߽��ϴ�");
						}
					}// 3.���� end
					else {System.out.println("�˼����� ��ȣ");}
					
				}
			}// �ۺ��� end
			else {
				System.out.println("�˼����� ��ȣ");
			}
		
		}// ���α׷� while
	}// me
}// cs


