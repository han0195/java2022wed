package Day09;

public class HankookTire extends Tire{
		// ����Ŭ���� extends ����Ŭ����
	
	//1.�ʵ�
	
	//2.������
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
		//super (�μ� �μ�2) // ����Ŭ������ [�μ�2��]������ ȣ��
	}
	
	//3.�޼ҵ� �����ε��� ���� �θ��� roll()�� ������ �� ����Ŵ�
	@Override // ����Ŭ������ �޼ҵ带 ������[����]
	public boolean roll() {
		accumulatedRotaion++;
		if(accumulatedRotaion < maxRotaion) {
			System.out.println(location + "�ѱ�Ÿ�̾� ����: " + (maxRotaion - accumulatedRotaion));
			return true;
		}else {
			System.out.println("****" + location + "�ѱ�Ÿ�̾� [��ũ]****" );
			return false;
		}
	}
	//��ӹ�����
//	// 1.�ʵ�
//		public int maxRotaion; // �ִ� ȸ����[ ȸ�����ɼ� ]
//		public int accumulatedRotaion; // ���� ȸ����
//		public String location; // Ÿ�̾� ��ġ
//		
//		// 2.������
//		public Tire(String location, int maxRotaion) {
//				//Ÿ�̾���ġ , �ִ�ȸ����
//			this.location = location; 		// �ܺηκ��� ���޹��� �μ��� ���κ����� ����
//			this.maxRotaion = maxRotaion;	// 
//		}
//		// 3.�޼ҵ�
//		public  boolean roll() { // Ÿ�̾� ȸ���ϴ� �޼ҵ� ����
//			accumulatedRotaion++; // ���� ȸ���� 1 ���� // Ÿ�̾ ȸ����
//			if(accumulatedRotaion < maxRotaion) {
//				// ���࿡ ����ȸ������ �ִ�ȸ�������� ������ [���� ����]
//				System.out.println(location + "Tire ����: " + (maxRotaion - accumulatedRotaion) + "ȸ" );
//				return true;
//			}else { // �ƴϸ� [ ���� ���� ]
//				System.out.println("****" + location + "Tire ��ũ ****");
//				return false;
//			}
//			
//		}
	
	
	
}
