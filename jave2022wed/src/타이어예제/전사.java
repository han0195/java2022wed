package Ÿ�̾��;

public class ���� extends ĳ����{
	
	public ����(int i, int j) {
		super(i, j);
	}

	@Override
	public boolean ���() {
		HP--;
		if(HP == 0) {
			System.out.println("���� ���");
			return false;
		}else {
			System.out.println("���� HP :" + HP + " ���� lv" + lv);
			return true;
		}
	}
}
