package Day09;

public class Student extends People{
			//����Ŭ���� ���  ����Ŭ����
	// 1. �ʵ�
	public int studneNo;  // �л���ȣ
	// 2. ������
	public Student(String name, String ssn, int studenNO) {
		// �θ�Ŭ������ ��� �ʵ� �ʱ�ȭ[�� �ֱ�]
		// 1. �ʵ忡 ����
		//this.name = name;
		//this.ssn = ssn;
		// 2. �������� ����
		super(name, ssn);	
		this.studneNo = studenNO;
	}
	// 3. �޼ҵ�

}
