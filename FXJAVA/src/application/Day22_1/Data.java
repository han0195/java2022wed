package application.Day22_1;

public class Data {
	//�ʵ�
	private int ��ȣ;
	private String �ۼ���;
	private String ����;
	//������
	public Data() {
		// TODO Auto-generated constructor stub
	}

	public Data(int ��ȣ, String �ۼ���, String ����) {
		super();
		this.��ȣ = ��ȣ;
		this.�ۼ��� = �ۼ���;
		this.���� = ����;
	}
	//�޼ҵ�
	public int get��ȣ() {
		return ��ȣ;
	}

	public void set��ȣ(int ��ȣ) {
		this.��ȣ = ��ȣ;
	}

	public String get�ۼ���() {
		return �ۼ���;
	}

	public void set�ۼ���(String �ۼ���) {
		this.�ۼ��� = �ۼ���;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}
	
}
