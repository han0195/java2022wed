package Ÿ�̾��;

public class ĳ���� {
	int HP;
	int lv;
	
	public ĳ����() {
		// TODO Auto-generated constructor stub
	}
	public ĳ����(int hP, int lv) {
		super();
		HP = hP;
		this.lv = lv;
	}
	
	public boolean ���() {
		HP--;
		if(HP == 0) {
			System.out.println("���ӿ���");
			return false;
		}else {
			System.out.println("���� HP :" + HP + " ������");
			return true;
		}
	}
	
	
	
}
