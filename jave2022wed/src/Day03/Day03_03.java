package Day03;

import java.util.Scanner;

public class Day03_03 {

	public static void main(String[] args) {
//		//Scanner ����
		Scanner scan = new Scanner(System.in);
//		
//		//����6
//		// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ���
//		System.out.println("����6) ������ �Է����ּ���: ");
//		int ����6_���� = scan.nextInt();
//		
//		if (����6_���� >= 90) {System.out.println("�հ��Դϴ�");}
//		else {System.out.println("���հ��Դϴ�");}
//		
////----------------------------------------------------------------------------
//				
//		//����7
//		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
//		//				������ 80�� �̻��̸� B���
//		//				������ 70�� �̻��̸� C���
//		//				�׿� �����
//		System.out.println("����7) ������ �Է����ּ���: ");
//		int ����7_���� = scan.nextInt();
//		
//		if (����7_���� >= 90) {System.out.println("���: A");}
//		if (����7_���� >= 80) {System.out.println("���: B");}
//		if (����7_���� >= 70) {System.out.println("���: C");}
//		else {System.out.println("�����");}
//		
////-----------------------------------------------------------------------------		
//		
//		//����8 �α���������
//		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
//		// [ ���� ] : ȸ�����̵� admin �̰� 
//		//           ��й�ȣ�� 1234 �� ��쿡�� 
//		//          �α��� ���� �ƴϸ� �α��� ���� ���
//			
//		System.out.println("���̵� �Է����ּ���");	String id = scan.next();
//		// char �ڷ��� [���� 1�� ����]
//		// �ڷ������� ���ڿ��� �����Ҽ� ����.
//			// 1. String Ŭ���� ����ϸ� ���ڿ� ���尡��
//			// 2. char �迭/����Ʈ ����ϸ� ����
//		
//		System.out.println("��й�ȣ�� �Է����ּ���");	int pw = scan.nextInt();
//			//��ü�� ����Ұ�
//				// '�ڹ�' >= <= == > < != [ �Ұ��� ]
//				// �ڷ��� ����ϴ� ������ ������ ��� ����
//				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
//					// ���ڿ� �񱳽� .equals
//					// ���ڿ�1.equals( ���ڿ�2 ) 
//		
//		boolean �α��μ��� = false;
//			//boolean : 1��Ʈ true or false
//		// String ������ ���� �񱳰� �ȵǼ� equals�� ���� �񱳰���
//		if (id.equals("admin")) { // id Ŭ���� ��ü�̱� ������ == �Ұ��� -> .equals()���
//			
//			if (pw == 1234) {
//				// pw�� �ڷ��������̱� ������ == ����
//				System.out.println("�α��� ����"); // ��й�ȣ�� 1234 �� ������ ����
//				�α��μ��� = true;		
//			}else { 			
//				// ��й�ȣ�� 1234 �� �ƴϸ� ����
//				System.out.println("��й�ȣ�� Ʋ�ǽ��ϴ�");		
//			}
//		
//		}else {			
//			// id�� admin�� �ƴϸ� ����	
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
//		}
//		
//		if(�α��μ��� == false) System.out.println("�α��� ����");
//		
////---------------------------------------------------------------------------------------
		//����9
		System.out.println("��������: "); int ���� = scan.nextInt();
		System.out.println("��������: "); int ���� = scan.nextInt();
		System.out.println("��������: "); int ���� = scan.nextInt();
		int ��� = (���� + ���� + ����) / 3;
		
		if (��� >= 90) { // ����� 90�� �̻��̸�
			if(���� == 100) System.out.println("������");
			if(���� == 100) System.out.println("������");
			if(���� == 100) System.out.println("���п��");
		}//if e
		else if( ��� >= 80) { // ����� 80�� �̻��̸�
			if( ���� >= 90 ) System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");	
			
		}// elseif e
		else {System.out.println("�����");}
		
	}

}
