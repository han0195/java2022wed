package Day16;

public class Day16_1 {
	
	public static void main(String[] args) {
		
		// ���ʸ�
		
		// p.656 �����׸� ��1)
		
		//1. Box ��ü ����
		Box box = new Box();
		//2. ��ü�� �޼ҵ� ȣ��
		box.set("ȫ�浿");
		//3. ��ü�� �޼ҵ� ȣ��
		String name = (String)box.get();
			//�ڽİ�ü -> �θ�ü [ �ڵ�����ȭ ]
			//�θ�ü -> �ڽİ�ü [ �ڵ�x ����o ]
		
		//4.
		box.set(new Apple()); // [�μ� : Apple]
		Apple apple = (Apple)box.get(); // 
		
	}
	
}
