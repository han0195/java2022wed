package Day08;

import java.util.Random;

public class Bank { // c s
	Random random = new Random();
	//�ʵ�
	private String bNum; // bank number
	private String name; // �̸�
	private String hNum; // human number
	private String money;
	//������
	
		//�� ������
	public Bank() {}
	
		//[�ʵ� 2��] ������
	public Bank(String name, String money) {
		super();
		this.name = name;
		this.money = money;
	}
	
		//[�ʵ� 4��] Ǯ ������
	public Bank(String bNum, String name, String hNum, String money) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
	}
	//�޼ҵ�
		//	- 1. ���� ����
	void ���»���() { // ���»��� s
		System.out.println("-----���� ���� ������-----");
		System.out.println("�̸��� �Է����ּ��� : "); String name = Day08_05.scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ��� : "); String pw = Day08_05.scanner.next();
		for(Member temp : Day08_05.member) { // for s
			if (temp != null && temp.name.equals(name) && temp.pw.equals(pw)) { // ���� Ȯ�εǸ�
				
				
				
				System.out.println(" ���� ������ �Ϸ�Ǿ����ϴ�. ");
				return; 
			}
		} // for e
		System.out.println(" ���� ���� ����. �ٽ� �õ����ּ���. ");
	} // ���»��� e
		//	- 2. �Ա�
	void �Ա�() { // �Ա� s
		System.out.println(" �Ա� ������ ");
		System.out.println(" �ݾ��� �־��ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
		for ( Member temp : Day08_05.member) {
			if (temp != null && temp.bNum.equals(bNum) && money>=0) { // ���¹�ȣ ��ġ�ϸ�
				temp.money+=money; System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. �ܾ� : " + temp.money); return;
				}
			}
		} System.out.println("����. ��õ�");
	} // �Ա� e
		//	- 3. ���
	void ���() { // ��� s
		System.out.println(" ��� ������ ");
		System.out.println(" ����� �ݾ��� �Է����ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
		for ( Member temp : Day08_05.member) {						// ���¹�ȣ ��ġ�ϸ�
			if (temp != null && temp.bNum.equals(bNum) && money>=0 && (temp.money-money)>=0) { 
				temp.money-=money; System.out.println("����� �Ϸ�Ǿ����ϴ�. �ܾ� : " + temp.money); return;
				}
			}
		}
	} // ��� e
		//	- 4. ��ü
	void ��ü() { // ��ü s
		System.out.println(" ��ü ������ ");
		System.out.println(" ��ü�� �ݾ��� �Է����ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
			System.out.println(" ��ü�� ���¹�ȣ�� �Է����ּ��� "); int bNum = Day08_05.scanner.nextInt();
			for ( Member temp : Day08_05.member) { // for s	
				if(temp != null && (temp.money>=money)) { //���� ����ϸ�
					 for(Member oppo : Day08_05.member) { //for2 s
						
					} // for2 e
					System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
				}
			} // for e
		}// if end
	} // ��ü e
		//	- 5. ����
		//	- 6. ���¸��
		//	    - ���� ��ȣ�� �ܾ׸� ǥ��
			
	
	
} // c e
