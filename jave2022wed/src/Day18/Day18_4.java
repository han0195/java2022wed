package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {
	
	public static void main(String[] args) {
		
		// ����� ���α׷�
			// �޴� : 1.����߰� 2.������ [������] 3.���������
				// ����߰� : �ο����� �Է¹޾� ����ȣ ��ȯ
				// ������ : ����ȣ�� �Է¹޾� ��� ���
				// ��������� : ù��° ������� ����ȣ ȣ��
		int ����ȣ = 1;
		Scanner s = new Scanner(System.in);
		ArrayList<���> ����� = new ArrayList<>();
		while(true) {
			// �ݺ����� �̿��� ����Ʈ�� ��� ��ü ȣ��
			System.out.println(" ����ȣ \t �ο���");
				for( ��� temp : ����� ) {
					System.out.println(temp.����ȣ + "\t" + temp.�ο���
							+ �����.indexOf(temp) * 3 + "��");
					
				}
			System.out.println("[��]1.����߰� 2.������ [������]3.���������");
			int ch = s.nextInt();
			if( ch == 1) {
				System.out.println("��ȭ��ȣ: "); String phone = s.next();
				System.out.println("�ο���");		int �ο��� = s.nextInt();
				
				��� temp = new ���(����ȣ, phone, �ο���);
				
				�����.add(temp);
				����ȣ++; //����ȣ ����
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else {
				
			}
		}
	}
	
	
}
