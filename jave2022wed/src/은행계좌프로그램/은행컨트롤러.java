package ����������α׷�;

import java.awt.dnd.DropTarget;
import java.util.Random;

public class ������Ʈ�ѷ� {

	public static boolean ���»���(int ���༱��, String pw, String name) {
		Random random = new Random();
		
		String ���¹�ȣ = String.format("%04d", random.nextInt(10000) + 1);
		if(�������.bank.size() == 0) { // ù��° ���̸� �񱳰˻� x
			
		}else {
			for(���� temp : �������.bank) {// ù��° ���� �ƴ϶�� �ߺ��˻�
				if(temp.get���¹�ȣ().equals(���¹�ȣ)) {
					���¹�ȣ = String.format("%04d", random.nextInt(10000) + 1);
				}
			}
		}
	
		if(���༱�� == 1) {//�������� ����������
			System.out.println("dd");
			�������.bank.add(new ��������(���¹�ȣ, pw, name, 0));//���������ÿ� ����
			System.out.println("���¹�ȣ: " + ���¹�ȣ);
			return true;
		}else if(���༱�� == 2) {//�������� ����������
			�������.bank.add(new ��������(���¹�ȣ, pw, name, 0));//���������ÿ� ����
			System.out.println("���¹�ȣ: " + ���¹�ȣ);
			return true;
		}else if(���༱�� == 3) {//�ϳ����� ����������
			�������.bank.add(new �ϳ�����(���¹�ȣ, pw, name, 0));//���������ÿ� ����
			System.out.println("���¹�ȣ: " + ���¹�ȣ);
			return true;
		}
		return false;
	}
	public static boolean �Ա�(String ���¹�ȣ, int �Աݾ�) {
		//���¹�ȣ ������ ��ü ã��
		for(���� temp : �������.bank) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ)) {
				//�Ա�
				temp.set���ݾ�(temp.get���ݾ�() + �Աݾ�);
				return true;
			}
		}// for end
		return false;
	}
	public static boolean ���(String ���¹�ȣ, int ��ݾ�, String ��й�ȣ) {
		//���¹�ȣ ������ ��ü ã��
		for(���� temp : �������.bank) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ)) {
				if(temp.get��й�ȣ().equals(��й�ȣ)) {// �ش���� ��й�ȣ�� ������
					//�Ա�
					temp.set���ݾ�(temp.get���ݾ�() - ��ݾ�);
					return true;
				}		
			}
		}// for end
		return false;
	}
	public static boolean ��ü(String ����, String pw, String �޴°���, int �ݾ�) {//���¹�ȣ, ��й�ȣ, �޴°��¹�ȣ, ��ü��
		//����ã��
		���� �ִ°��� = null;
		���� �޴°���2 = null; boolean pass = false;
		for(���� temp : �������.bank) {
			if(temp.get���¹�ȣ().equals(����)) {
				if(temp.get��й�ȣ().equals(pw)) {//��й�ȣ üũ
					�ִ°��� = temp;	
				}
			}
		}//���� ã�� end
		for(���� temp : �������.bank) {
			if(temp.get���¹�ȣ().equals(����)) {	//�޴°��� ã��
				�޴°���2 = temp;
				pass = true;
			}
		}// �޴°��� ã�� end 
		//�Ա����
		if(pass) {
			�ִ°���.set���ݾ�(�ִ°���.get���ݾ�() - �ݾ�);// ���
			�޴°���2.set���ݾ�(�޴°���2.get���ݾ�() + �ݾ�);// �Ա�
			return true;
		}
		return false;
	}
	public static void �����¸��(String name) {
		System.out.println("���¹�ȣ\t�ܾ�\t������");
		for(���� temp : �������.bank) {
			if(temp.get������().equals(name)) {
				System.out.println(temp.get���¹�ȣ() +"\t"+ temp.get���ݾ�() +"\t"+ temp.get������());
			}
		}
	}
	public static void ����() {
		
	}
	
	
}
