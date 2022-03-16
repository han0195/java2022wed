package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11_04_BoardApp {
	/*
	 * �Խ��� + ��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խ��� Ŭ����
	 * 				// ����, ����, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
	 * 		// [m]��� Ŭ����
	 * 				// ����, �н�����, �ۼ���, �ۼ���
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾���	
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ�����
	 * 		// [v]Day11_04 Ŭ����
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ]
	 * 
	 */
	/*
	 *  ��ȸ���� �Խ���/��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խù� Ŭ���� 
	 * 				// ���� , ���� , �н����� , �ۼ��� , �ۼ��� , ��ȸ�� , ��۸���Ʈ
	 * 		// [m]��� Ŭ���� 
	 * 				// ���� , �н����� , �ۼ��� , �ۼ��� 
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾���
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ����� 
	 * 		// [v]Day11_4_BoardApp Ŭ���� 
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ] 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 1.�Է°�ü
		Controller.load(); // 2. ����[ ��� �Խù�] �ҷ����� 
		while(true) {
			try { // ���ܹ߻� : ����ڰ� �����Է½� ���ܹ߻�!!! -> catch �̵�
				// ��� �Խù� ���
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n","��ȣ", "����", "�ۼ���", "�ۼ���", "��ȸ��");
				
				int i = 0;// ����Ʈ�� �ε���
				for(Board temp : Controller.boadlist) {
					System.out.printf("%2s\t%5s\t%5s\t%5s\t%2s\t \n",i, temp.getTitle(), temp.getWriter(), temp.getDate(), temp.getViewcount());
						i++;	
				}
				
				
				
				System.out.print("1.���� 2.���� ���� : ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.println(" *** �Խù� ��� ***");
						// nextLine() : �������� �Է°��� [ ����! : nextLine �տ� �ϴ� next �ϳ��� ���]
						// �ذ��� : �Ϲ�next �� nextLine ���̿� nextLine()
					scanner.nextLine();
					System.out.print(" ���� : ");	String ���� = scanner.nextLine();
					System.out.print(" ���� : ");	String ���� = scanner.nextLine();
					System.out.print(" �ۼ��� : ");	String �ۼ��� = scanner.next();
					System.out.print(" ��й�ȣ[����/������] : "); String ��й�ȣ = scanner.next();
					Controller.write( ���� , ���� , �ۼ��� , ��й�ȣ ); // �μ� ���� 
				}
				else if( ch == 2 ) {
					// �ش� �Խù� ��ȣ[�ε���] �� �Է¹޾� �Խù����� ��� ���
					System.out.println("��������ε���: "); int index = scanner.nextInt();
					
					// �ش� �ε��� ���
					Board temp = Controller.boadlist.get(index);
					System.out.println("*** �Խù� ���� ***");
					System.out.printf("����:%s \n", temp.getTitle());
					System.out.printf("����:%s \n", temp.getContent());
					System.out.printf("�ۼ���:%s \n", temp.getWriter());
					System.out.printf("��¥:%s \n", temp.getDate());
					
					// �޴�
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾��� ����: "); int ch2 = scanner.nextInt();
					
					if(ch2 == 1) {
						
					}else if(ch2 == 2) {
						System.out.println("��й�ȣ: ");         String pw = scanner.next();
						System.out.println("����: ");			   String tit = scanner.next();
						System.out.println("����: ");			   String con = scanner.next();
						boolean result = Controller.update(index,pw, tit, con); // ������ �ε��� ��ȣ,�н�����, ����������, �����ҳ��� => �μ�
						if(result) {
							System.out.println("��������");
						}else {
							System.out.println("pw X �������");
						}
					}else if(ch2 == 3) {
						System.out.println("��й�ȣ");			String pw = scanner.next();
						Controller.delete(index,pw); // ������ �ε�����ȣ, �н����� => �μ�
					}else if(ch2 == 4) {
						System.out.println("��۳���: ");			String rcon = scanner.next();
						System.out.println("����н�����: ");		String rpw = scanner.next();
						System.out.println("����ۼ���: ");			String rwr = scanner.next();
						Controller.replywrite(index, rcon, rpw, rwr);	// �ε�����ȣ, ��۳���, ����н�����, ����ۼ��� => �μ�
					}else {	}
				}
				else {}
			}catch( Exception e ) {
				System.err.println(" �޽���]] ����Ҽ� ���� �Է��Դϴ�.");
				scanner = new Scanner(System.in); // �ٽ� �޸��Ҵ�[ ���� ���빰 ����� ] 
			}
		}
		
	}// me
}//ce
