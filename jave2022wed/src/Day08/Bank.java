package Day08;

public class Bank { // c s
	//�ʵ�
	private int bNum; // bank number
	private String name; // �̸�
	private String hNum; // human number
	private int money;
	private String bPw; // Bank password
	//������
	
		//�� ������
	public Bank() {}
	
		//[�ʵ� 2��] ������
	public Bank(String name, int money) {
		this.name = name;
		this.money = 0;
	}
	
		//[�ʵ� 4��] Ǯ ������
	public Bank(int bNum, String name, String hNum, int money, String bPw) {
		this.bNum = bNum;
		this.name = name;
		this.hNum = hNum;
		this.money = money;
		this.bPw = bPw;
	}
	//�޼ҵ�
	
		//	- 1. ���� ����
	void ���»���() { // ���»��� s
		System.out.println("-----���� ���� ������-----");
		System.out.println("�̸��� �Է����ּ��� : "); String name = Day08_05.scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ��� : "); String pw = Day08_05.scanner.next();
		for(Member temp : Day08_05.member) { // for s
			if (temp != null && temp.name.equals(name)) { // ���� Ȯ�εǸ�
				int bNum =0; // ���¹�ȣ �ο� s
				int i = 0; // �ݺ�Ƚ��
				for(Bank t : Day08_05.bank) {
					if(t == null) {
						if( i == 0) {
							bNum = 1;
							break;
						}
						bNum = Day08_05.bank[i - 1].bNum + 1;
						break;
					}
					i++;
				} // ���¹�ȣ �ο� e
				Bank bank = new Bank(bNum, name, hNum, 0, pw); // ������ 1���� �迭�� ��ġ��
				System.out.println(" ���� ������ �Ϸ�Ǿ����ϴ�. ");
				return;} // if 3 e 
		} // for e
		System.out.println(" ���� ���� ����. �ٽ� �õ����ּ���. ");
	} // ���»��� e
		//	- 2. �Ա�
	void �Ա�(String[] result) { // �Ա� s
		System.out.println(" �Ա� ������ ");
		System.out.println(" �ݾ��� �־��ּ��� "); int money = Day08_05.scanner.nextInt();
		if ( money > 0) { // �ݾ��� �����
		for ( Bank temp : Day08_05.bank) {
			if (temp != null && temp.bNum==(bNum) && money>=0) { // ���¹�ȣ ��ġ�ϸ�
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
		for ( Bank temp : Day08_05.bank) {						// ���¹�ȣ ��ġ�ϸ�
			if (temp != null && temp.bNum==(bNum) && money>=0 && (temp.money-money)>=0) { 
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
			for ( Bank temp : Day08_05.bank) { // for s	
				if(temp != null && (temp.money>=money)) { //���� ����ϸ�
					 for(Bank oppo : Day08_05.bank) { //for2 s
						
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

