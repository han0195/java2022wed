package ��鷹����;

public class Recipe {
	//1. �ʵ�
		String name = " ";
		String ���� = " "; // ������ �����Ҽ��ִ� �ʵ� ����
		String �ð� = " ";	// �ð��� �����Ҽ��ִ� �ʵ� ����
		String �߰���� = " ";
	//2. ������
		public Recipe(String name, String ����, String �ð�, String �߰����) { // 3���� ���ڸ� �������ִ� ������ ����
			this.name = name;// ���ڿ� �ʵ带 �����ϱ����� this�� ����
			this.���� = ����;// ���ڿ� �ʵ带 �����ϱ����� this�� ����
			this.�ð� = �ð�;// ���ڿ� �ʵ带 �����ϱ����� this�� ����
			this.�߰���� = �߰����; // ���ڿ� �ʵ带 �����ϱ����� this�� ����
		}
}// ce
