package Day09;

public class Dmbcellphone extends callphone{
	// ����Ŭ���� ����Ŭ���� ���� => extends
		// ����Ŭ������ ����Ŭ������ ��� ��밡��
	
	// 1. �ʵ�
	int channerl;
	// 2.������
	public Dmbcellphone(String modle, String color, int Channerl) {
		this.modle = modle; // this.�ʵ��
		this.color = color;	// this.�ʵ��
		// * ���� Ŭ������ ���� �ʵ� �̹Ƿ� ����Ŭ������ ��� ȣ��
		this.channerl = Channerl;
	}
	// 3.�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��: " + channerl + "�� DMB ��� ������ �����մϴ�");
	}
	void changeChannerlDMB(int channerl) {
		this.channerl = channerl;
		System.out.println("ä��: " + channerl + "������ �ٲߴϴ�");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
