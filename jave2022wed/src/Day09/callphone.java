package Day09;

public class callphone {
	//1.�ʵ�
	String modle;
	String color;
	//2.������
	
	//3.�޼ҵ� [ void : ��ȯŸ�Ծ��� ( return �������� ) ]
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	// ��ȯŸ�� �޼ҵ��(�μ�) { �����ڵ� } // ��ȯx �μ� x
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void send(String message) {System.out.println("�ڱ�: " + message);}
	//��ȯx �޼ҵ��(�μ�o) { } // ��ȯx �μ�o
	void receive(String message) {System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
}
