package Ÿ�̾��;

public class ���� extends ĳ����{
	
	public ����(int i, int j) {
		super(i, j);
	}
	
	public boolean ���() {
		HP--;
		if(HP == 0) {
			System.out.println("������ ���ӿ���");
			return false;
		}else {
			System.out.println("���� HP :" + HP + " ����");
			return true;
		}
	}
}
