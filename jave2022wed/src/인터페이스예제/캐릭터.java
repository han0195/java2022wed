package �������̽�����;

import java.util.Random;

public class ĳ���� {
	//1.�ʵ�
	private String name;
	private int ���ݷ�;
	private int ����;
	//2.������
	public ĳ����(String name, int ���ݷ�, int ����) {
		super();
		this.name = name;
		this.���ݷ� = ���ݷ�;
		this.���� = ����;
	}
	//3.�޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int get���ݷ�() {
		return ���ݷ�;
	}
	public void set���ݷ�(int ���ݷ�) {
		this.���ݷ� = ���ݷ�;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	public static ĳ���� ��Ī() {
		Random random = new Random();
		int ���ݷ� = random.nextInt(40) + 1;
		int ���� = random.nextInt(150) + 1;
		ĳ���� com = new ĳ����("com", ���ݷ�, ����);
		return com;	
	}
	
	
}
