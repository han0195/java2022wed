package Day09;

public class Day09_04 {
	public static void main(String[] args) {
		
		// p.296 ~ 297
			// @Override : ������
			// ������� ������ �μ��� �޼ҵ�� �Ұ���
			// ���� : ������ �޼ҵ带 ������[����]
		int r = 10;
		//1.����Ŭ���� ��ü����
		calculator cal = new calculator();
		System.out.println("������: " + cal.areaCircle(r));
		System.out.println();
		
		//1. ����Ŭ������ ��ü ����
		Computer com = new Computer();
		//2. ����Ŭ������ ���� ��ü�� ȣ��
		System.out.println("������: " + com.areaCircle(r));
		
	
		
	}
}
