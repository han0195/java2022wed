package Ÿ�̾��;

public class ������ {
	ĳ���� ���� = new ����(20, 5);
	ĳ���� ������ = new ����(10, 5);
	ĳ���� ���� = new �ü�(10, 5);
	
	
	public int ��ɽ���() {
		System.out.println("��ɽ���");
		if(����.���() == false) {return 1;}
		if(������.���() == false) {return 2;}
		if(����.���() == false) {return 3;}
		if(����.���() == false && ������.���() == false && ����.���() == false) {return 3;}
		return 0;
	}
}
