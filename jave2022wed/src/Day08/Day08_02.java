package Day08;

public class Day08_02 {

	public static void main(String[] args) {
		
		//p.245 : final
			// ������ ��
			// ������ �����
			// ���Ǵ� ���: 1. �ʵ� ����� 2. �����ڿ���
		// 1.��ü ����
		Person p1 = new Person("123123 - 123123123", "���");
		
		// 2.��ü�� �ʵ� ����
		//p1.nation = "USA"; // final �ʵ尡 �ƴϸ� ��������
		//p1.ssn = "45468";// final �ʵ尡 �ƴϸ� ��������
		p1.name = "���缮"; // final�ʵ尡 �ƴѰ�� ���� ����
		

	}

}
