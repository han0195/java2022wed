package Day09;

public class Tire { // Ŭ���� ����

	// 1.�ʵ�
	public int maxRotaion; // �ִ� ȸ����[ ȸ�����ɼ� ]
	public int accumulatedRotaion; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ
	
	// 2.������
	public Tire(String location, int maxRotaion) {
			//Ÿ�̾���ġ , �ִ�ȸ����
		this.location = location; 		// �ܺηκ��� ���޹��� �μ��� ���κ����� ����
		this.maxRotaion = maxRotaion;	// 
	}
	// 3.�޼ҵ�
	public  boolean roll() { // Ÿ�̾� ȸ���ϴ� �޼ҵ� ����
		accumulatedRotaion++; // ���� ȸ���� 1 ���� // Ÿ�̾ ȸ����
		if(accumulatedRotaion < maxRotaion) {
			// ���࿡ ����ȸ������ �ִ�ȸ�������� ������ [���� ����]
			System.out.println(location + "Tire ����: " + (maxRotaion - accumulatedRotaion) + "ȸ" );
			return true;
		}else { // �ƴϸ� [ ���� ���� ]
			System.out.println("****" + location + "Tire ��ũ ****");
			return false;
		}
		
	}
	
}// Ŭ���� end
