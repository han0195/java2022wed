 package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_03 { // c s

	public static void main(String[] args) { // m s
		
		// �غ�
		int �÷��̾�; // ����ڰ� ������ �� ����
		int ��ǻ��;	// ��ǻ�Ͱ� ������ ������ �� ����
		int ���Ӽ� = 0;  // �� ���������� ���� Ƚ�� ����
		int �÷��̾�¸��� = 0; int ��ǻ�ͽ¸��� = 0; // �� �¸� �� ����
		Scanner scanner = new Scanner(System.in);
		
		//���α׷� ���� [ ���ѷ��� �������� : 3�� �Է½ÿ� ����(break) ]
		while(true) {
			System.out.println("----------------���������� ����--------------------");
			System.out.println("����(0) ����(1) �� (2)   ����(3): "); System.out.println("����>>>>");
			�÷��̾� = scanner.nextInt(); // �Է��� �� ����
			System.out.println("�÷��̾ ����: " + �÷��̾�);
			
			Random random = new Random(); // ���� ��ü ����
						//random.nextInt() : int�� ǥ���Ҽ� �ִ� ������ ���� �߻�
						//random.nextInt(��) : 0 ~ �� ������ ������ ���� �߻�
							//random.nextInt(10) : 0~9 �� ���� �߻�
							//random.nextint(11)+10 : 10~20�� ���� �߻�
			��ǻ�� = random.nextInt(3); // ������ ����(int��)�� ��������
			
				//��������
			if (�÷��̾� == 3) {
				System.out.println("�˸�) ��������");
				System.out.println(" �� ���� Ƚ����: " + ���Ӽ�);
				if(�÷��̾�¸��� > ��ǻ�ͽ¸���) {
					System.out.println(" �÷��̾�¸�");
				}else if(��ǻ�ͽ¸��� > �÷��̾�¸���) {
					System.out.println(" ��ǻ�ͽ¸�");
				}else {System.out.println(" ���º�");}
				break;
			}else if( �÷��̾� >= 0 || �÷��̾� <= 2) {
				// �¸��� �Ǵ�
				if(�÷��̾� == 0 && ��ǻ�� == 2 || �÷��̾� == 1 && ��ǻ�� == 0 ||	�÷��̾� == 2 && ��ǻ�� == 1) { // �÷��̾� �¸� ����Ǽ�
					�÷��̾�¸���++;
					System.out.println("�¸�");
				}else if(�÷��̾� == ��ǻ��) { // ���� ��
					System.out.println("���º�");
				}else {// �׿ܴ� ��ǻ�� �¸�
					��ǻ�ͽ¸���++;
					System.out.println("�й�");
				}
			}else {
				System.out.println("�˼����� �ൿ�Դϴ�");
			}
			
			
			���Ӽ�++; // �ݺ� �Ϸ� +1
		} //while�� ����
		
		
	} // m e

} // c e
