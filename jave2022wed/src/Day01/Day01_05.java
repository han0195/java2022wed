package Day01;

import java.util.Scanner;

public class Day01_05 {

	public static void main(String[] args) {
		//�Է°�ü ����
		Scanner san = new Scanner(System.in);
		
		//�Է°�ü �������� - > String Ŭ������ ����
		System.out.println("�̸�: ");		String id = san.next();
		System.out.println("���̵�: ");		String pw = san.next();
		System.out.println("��й�ȣ: ");		String name = san.next();
		System.out.println("�̸���: ");		String m = san.next();
		
		//���
		System.out.println(">>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>");
		System.out.println("���̵�\t\t��й�ȣ\t\t����\t\t�̸���");
		System.out.println(name + "\t\t" + id + "\t\t"  + pw + "\t\t" + m);
	
		
	}

}
