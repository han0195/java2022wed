package �������̽�;

public class ������ī implements ���{

	//1.�ʵ�
	private int ��ġ = 0;
	private int ��� = 0;
	
	
	public int get��ġ() {
		return ��ġ;
	}
	public void set��ġ(int ��ġ) {
		this.��ġ = ��ġ;
	}
	public int get���() {
		return ���;
	}
	public void set���(int ���) {
		this.��� = ���;
	}
	
	
	@Override
	public void move() {
		��ġ += 4;
		��� += 5000;
	}
	
}
