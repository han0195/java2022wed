package ����Ϲ�ũ���α׷�;

import java.util.ArrayList;
import java.util.Random;

public class Contorller {
	static int ��ȣ = 1;
	static ArrayList<Member> member = new ArrayList<Member>(); // Member list ����
	static ArrayList<����> bank = new ArrayList<����>();		   // Bank list ����
	static ArrayList<����> didank = new ArrayList<����>();		// ���� list ����
	public static boolean ȸ������(String id, String pw, String name, String phone) {	
		//id pw name phone �޾ƿ���
		//id �ߺ�üũ
		for(Member temp : Contorller.member) {
			if(temp.getId().equals(id)) { // id ���� ��ġ�ϸ�
				return false;					// �޼ҵ� ���� false ��ȯ
			}
		}
		//��üȭ�� ����	
		Contorller.member.add(new Member(id, pw, name, phone, Contorller.��ȣ)); // ��üȭ�� ����
		Contorller.��ȣ++;	//����Ǿ����� ��ȣ�� �÷� ����ȸ�������ϴ»���� +1
		return true;		// Ʈ�� ��ȯ �޼ҵ�����
	}
	public static int �α���(String id, String pw) {
		//id pw �޾ƿ���
		//id pw ���ϰ� member����Ʈ�� ���� ȸ����ȣ ������
		for(Member temp : Contorller.member) {
			if(temp.getId().equals(id)) { // ���̵� ������
				if(temp.getPw().equals(pw)) {	// ��й�ȣ�� ������
					return temp.getBno();	// ȸ����ȣ ��ȯ
				}
			}
		}
		return -1; // ���н� -1 ����
	}
	public static void ���̵�ã��(String name, String phone) {
		//name phone �޾ƿ���
		//�����ں��� �´� list�ȿ� id�� ���
		for(Member temp : member) {
			if(temp.getName().equals(name)) { // �̸��� ������
				if(temp.getPhone().equals(phone)) {	// ����ȣ�� ������
					System.out.println("���̵�: " + temp.getId());	//���̵� ���
				}
			}
		}
	}
	public static void ��й�ȣã��(String id, String phone) {
		//id phone �޾ƿ���
		//�����ں��� �´� list�� pw�� ���
		for(Member temp : member) {
			if(temp.getId().equals(id)) { // ���̵� ������
				if(temp.getPhone().equals(phone)) { // ����ȣ�� ������
					System.out.println("���̵�: " + temp.getId()); // ���̵� ������
				}
			}
		}
	}
	//////////////////////// �������////////////////////////////////////////////////////////////////////
	public static boolean ���»���(int bno, String pw) {
		//ȸ����ȣ �޾ƿͼ�
		Random random = new Random();	//������ü����
		//���¹�ȣ������ �ߺ��˻� ���� �ߺ��� �ƴϸ� ����
		while(true) {
			int ��ȣ = random.nextInt(10000)+1;			
			String ��ȣstr = String.format("%04d", ��ȣ);	// %04d == 4�ڸ������ȵǸ� 0���� ä��[String.format]
			bank.add(new ����(bno, ��ȣstr, 0, pw)); // ��üȭ���ÿ� ����Ʈ�� ����
			return true;	// Ʈ�� ��ȯ
			/////////////////////////////////////////////////////////
			//for(���� temp : bank) {??????????????? for������ȵ�
			//	if(temp.get���¹�ȣ().equals(��ȣstr) == false) {					
			//		return true;
			//	}
			//}
			/////////////////////////////////////////////////////////
		}	
	}
	public static boolean �Ա�(String ���¹�ȣ, int mon) {
		//�Ա��Ұ��¸� �޾ƿͼ�
		//��
		for(���� temp : bank) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ)) { //���¹�ȣ�� ������
				temp.set�ܾ�(temp.get�ܾ�() +  mon);	// �Ա�
				return true;
			}
		}
		//������ true��ȯ
		return false; // ���� false ��ȯ
	}
	public static boolean ���(String num,String pw,int mon) {
		//���¹�ȣ ��й�ȣ�� �޾ƿͼ� ��ݾ�
		//���¸� ã�� ��й�ȣ üũ�� �ܾ� > ��ݾ� ���� Ȯ��
		for(���� temp : bank) {
			if(temp.get���¹�ȣ().equals(num) && temp.get��й�ȣ().equals(pw) && temp.get�ܾ�() > mon) {// ���¹�ȣ�� ��й�ȣ�� �ܾ��� ��ݾ׺��� ũ��
						temp.set�ܾ�(temp.get�ܾ�() - mon);	// �ܾ׿��� ����
						return true;
					}			
		}
		return false;
	}
    public static boolean ��ü(String num, String num2, int mon) {
		//��ݰ���, �Աݰ���, ��ü�� �޾ƿ���
    	//��ݰ��� ã���� �Աݰ��� ã���� ��ü�� �ܾ׿��� ��
    	for(���� temp : bank) {
    		if(temp.get���¹�ȣ().equals(num) && temp.get�ܾ�() > mon) { // ���¹�ȣ�� ���� �ܾ��� ��ݾ׺��� ������
    				for(���� temp2 : bank) {
    					if(temp2.get���¹�ȣ().equals(num2)) { // �Ա޹��� ���¹�ȣ�� ������
    						temp.set�ܾ�(temp.get�ܾ�() - mon);	// ��ݰ��� �ܾ� -
    						temp2.set�ܾ�(temp2.get�ܾ�() + mon); // �Աݹ������� �ܾ� +
    						return true;
    					}
    				}	
    		}
    	}
    	return false;
	}
    public static void ���¸��(int bno) {
		//ȸ�� ��ȣ �޾ƿͼ�
    	//����ȸ����ȣ ���µ� ���
    	System.out.println("���¹�ȣ\t�ܾ�\tȸ����ȣ");
    	for(���� temp : bank) {
    		if(temp.getȸ����ȣ() == bno) { // ȸ����ȣ�� ������
    			System.out.println(temp.get���¹�ȣ() +"\t"+ temp.get�ܾ�() +"\t"+ temp.getȸ����ȣ()); // ���
    		}
    	}
	}
    //�������//////////////////////////////////////////////////////////////////////////
    public static boolean ���Ⱑ��(int money, String pw, int bno) {
		//�� �н����� ȸ����ȣ �Է¹޾�
    	for(Member temp : member) {
    		if(temp.getBno() == bno && temp.getPw().equals(pw)) { //ȸ����ȣ�� �����鼭 ��й�ȣ�� ������
    				didank.add(new ����(bno, money)); // ��ü������ ���⸮��Ʈ�� �߰�
    				return true;
    			}
    	}
    	return false;
	}
	public static boolean �����ȯ(String ��ݰ���, String pw, int money, int bno) {
	//��ݰ��� ��ȯ�� �Է¹޾� ���� [��ݰ��º� / ��й�ȣ �� / ������ �ܾ׸����� üũ ȸ����ȣ�� ������]
		for(���� temp : bank) {
			if(temp.get���¹�ȣ().equals(��ݰ���) && temp.get��й�ȣ().equals(pw) && temp.get�ܾ�() > money) { // ��ݰ��°� �����鼭 ��й�ȣ�� �����鼭 �ܾ��� ������ ������
						temp.set�ܾ�(temp.get�ܾ�() - money); // �����ܾ��� ����
						for(���� temp2 : didank) {
							if(temp2.getȸ����ȣ() == bno) { // ���� ȸ����ȣ�� ȸ����ȣ�� ������
								temp2.set���������(temp2.get���������() - money); // �����ȯ 
								return true;
							}
						}				
			}
		}
		return false;
		
	
	}
	public static void ���������Ȯ��(int bno) {
		System.out.println("ȸ����ȣ\t���������");
		for(���� temp : didank) {
			if(temp.getȸ����ȣ() == bno) {
				System.out.println(temp.getȸ����ȣ()+"\t"+temp.get���������());
			}
		}
	}

	
	
}
