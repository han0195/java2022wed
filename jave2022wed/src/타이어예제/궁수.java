package Ÿ�̾��;

public class �ü� extends ĳ����{
	
	public �ü�(int i, int j) {
		super(i, j);
	}
	
	public boolean ���() {
		HP--;
		if(HP == 0) {
			System.out.println("�ü� ���");
			return false;
		}else {
			System.out.println("���� HP :" + HP + " �ü� lv" + lv);
			return true;
		}
	}
}
