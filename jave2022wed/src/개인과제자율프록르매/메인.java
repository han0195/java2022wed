package ���ΰ����������ϸ���;

import java.io.IOException;
import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		controller remo = new controller();
		try {
			remo.���Ϻҷ�����();
			remo.�޸������Ϻҷ�����();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		while(true) {
			
			System.out.println("***** todolist *****");
			System.out.println("1.ȸ������ 2.�α���"); int ch = s.nextInt();
			if(ch == 1) {//ȸ������
				System.out.println("------ ȸ������ ------");
				System.out.println("id�Է�: "); String id = s.next();
				System.out.println("pw�Է�: "); String pw = s.next();
				System.out.println("name: "); String name = s.next();
				boolean result = remo.ȸ������(id, pw, name);
				if(result) {
					System.out.println("���Լ���");
				}else {
					System.out.println("����)) ���Խ���");
				}
			}else if(ch == 2) {//�α���
				System.out.println("------ �α��� ------");
				System.out.println("id�Է�: "); String id = s.next();
				System.out.println("pw�Է�: "); String pw = s.next();
				String result = remo.�α���(id, pw);
				if(result != null) {
					while(true) {// �α��� â			
						System.out.println("*****"+ result +"�� ToDoList *****");
						System.out.println("����\t�ϷῩ��");
						remo.������(result);
						System.out.println("1.�޸��ۼ� 2.�޸�Ϸ� 3.�޸���� 4.������"); int ch2 = s.nextInt();
						if(ch2 == 1) {//�޸��ۼ�
							System.out.println("����"); String cen = s.next();
							boolean result2 = remo.�޸��ۼ�(result, cen);
							if(result2) {
								System.out.println("�ۼ� ����");
							}else{
								System.out.println("����)) �ۼ� ����");
							}
						}else if(ch2 == 2) {// �޸�Ϸ�
							System.out.println("�˸�)) false => true / true => false");
							System.out.println("�Ϸ��ѳ���: "); String cen = s.next();
							remo.�޸�Ϸ�(cen, result);
						}else if(ch2 == 3) {//�޸����
							System.out.println("������ ����: "); String cen = s.next();
							remo.�޸����(cen, result);
						}else if(ch2 == 4) {// �α׾ƿ�
							break;
						}else {
							System.out.println("�߸����Է�");
						}
					}//�α��� â end
				}else {
					System.out.println("����)) �α��ν���");
				}
			}else {
				
			}//ù���� �޴� end
		}//���α׷� ����
		
	}	
}
