package Day03;

import java.util.Scanner;

public class Day03_04 {

	public static void main(String[] args) {
		
		//��� : 1. if�� 2.switch��
			// if: ���˻�( true Ȥ�� false ) / ����Ǽ� ������ ���� �ʴ°��
				// >= <= > < == !=
			// switch: �����Ͱ˻�(��������)			   / ����Ǽ� ������ �ִ� ���
			// ����
				// switch( �˻��� ){
				// 		case '��': ���๮;
				// 		case '��': ���๮;
				// 		case '��': ���๮;
				// 		default : ���๮;
				//}
		
				//break : ���� ����� swtich Ȥ�� �ݺ��� Ż��
		
		// ��1)	������ 90�� �̸� A, 80�̸� B, 70 �̸� C, �׿� Ż��
		int ���� = 80;
		if( ���� == 90 ) System.out.println("A���");
		else if( ���� == 80 ) System.out.println("B���");
		else if( ���� == 70 ) System.out.println("C���");
		else System.out.println("Ż��");
		System.out.println("--------------------------------------------------------------");
		switch(����) {
			case 90 : System.out.println("A���");	break;
			case 80 : System.out.println("B���"); 	break;
			case 70 : System.out.println("C���");	break;
			default : System.out.println("Ż��");
		}
		
		//��2)
		int ��ư = 3;
		switch( ��ư ) {
			case 1 : System.out.println("1������ �̵�"); break;
			case 2 : System.out.println("2������ �̵�"); break;
			case 3 : System.out.println("3������ �̵�"); break;
			default : System.out.println("4������ �̵�");
		}
		
		// ��3)
		char ��� = 'A';
		switch( ��� ) {
			case 'A' :
			case 'B' : System.out.println(" ��� ȸ�� "); break;
			case 'C' :
			case 'D' : System.out.println(" �Ϲ� ȸ�� "); break;
			default	 : System.out.println(" �մ� ");
		}
		
		// ��)
		String ���� = "����";
		switch( ���� ) { // ���������� ������ .equals ��� x
			case "����" : System.out.println("700����"); break;
			case "����" : System.out.println("500����"); break;
			default : System.out.println("1����");
		}
		
		//����1 ) ����,����,����. ������ �Է¹޾� ����� 90�� A ��� 80�� �̻��̸� B��� ������ Ż��
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int ����_1 = scan.nextInt(); int ����_1 = scan.nextInt(); int ����_1 = scan.nextInt();
		int ��� = (����_1 + ����_1 + ����_1) / 3;
		
		switch (��� / 10) { // 1�ڸ��� ����
			case 10: System.out.println("A");	break;
			case 9: System.out.println("A");	break;
			case 8: System.out.println("B");	break;
			default : System.out.println("Ż��");
		}
	}

}
