package ���ΰ���Ű����ũ����ó��;

public class ��ǰ {
	//�ʵ�
	private String name; // �̸�
	private String ����; // ����ó���� �����ų��
	private int price; // ����
	private int ���;
	//������
	public ��ǰ() {
		// TODO Auto-generated constructor stub
	}
	public ��ǰ(String name, String ����, int price, int ���) {
		super();
		this.name = name;
		this.���� = ����;
		this.price = price;
		this.��� = ���;
	}
	//�޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String get����() {
		return ����;
	}
	public void set����(String ����) {
		this.���� = ����;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int get���() {
		return ���;
	}
	public void set���(int ���) {
		this.��� = ���;
	}
}
