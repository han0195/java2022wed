package ���ΰ���Ű����ũ����ó��;

import java.io.IOException;
import java.util.Scanner;

public class Ű����ũ {
	// ��� : ����
		// Ŭ���� : �Ե�����, ����ŷ , ��Ʈ�ѷ�
		// �������̽� : Ű����ũ
		// ����ó�� : ��ǰ��� ����
		// 1.��ǰ��� 2.��ǰ�߰� 3.���� [����ó��]
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String[] �������� = {"����ŷ", "�Ե�����"};
		���� ����ŷ = new ����ŷ();
		
		//�Ե����� �ڸ�
		while(true) {	
			s = new Scanner(System.in);
			try {		
				����ŷ.���Ϻҷ�����();
				System.out.println("----- ���� ������ �ֹ� ���α׷� -------");
				System.out.println("1.����ŷ 2.�Ե�����"); int �������� = s.nextInt();
				
				if(�������� < ��������.length && �������� < 0) {// 1 ~ 2 ������
					System.out.println("�ش缱������ ���������ʽ��ϴ�");
				}else {
					System.out.println("**** "+��������[�������� - 1]+" *****");
					System.out.println("1.��ǰ��� 2.��ٱ��� 3.���� 4.��ǰ�߰�[����������]");
					int ch = s.nextInt();
					if(ch == 1) { // ��ǰ���
						����ŷ.��ǰ���(��������[�������� - 1]);
					}else if(ch == 2){// ��ٱ���
						����ŷ.��ǰ���(��������[�������� - 1]);
						System.out.println("��ǰ��: "); String tit = s.next();
						boolean result = ����ŷ.��ٱ���(tit, ��������[�������� - 1]);
						if(result) {
							System.out.println("��⼺��");
						}else {
							System.out.println("������");
						}
					}else if(ch == 3) {// ����
						
					}else if(ch == 4) {// ��ǰ�߰�
						System.out.println("**** " + ��������[�������� - 1] + " ��ǰ�߰� ****");
						System.out.println("��ǰ��: "); String name = s.next();
						System.out.println("����: "); int price = s.nextInt();
						System.out.println("���: "); int ��� = s.nextInt();
						boolean result;	
								result = ����ŷ.��ǰ�߰�(name, ��������[�������� - 1], price, ���);
								if(result) {// ���
									System.out.println("��ǰ�߰�����");
								}else {
									System.out.println("��ǰ�߰����� [�����ڹ���]");
								}			
					
					}else {
						System.out.println("�˼����� ����");
					}
				}// �������°� end
			} catch (Exception e) {
				System.out.println("����" + e);
			}
				
		}//program end
		
		
	}// me
}// ce
